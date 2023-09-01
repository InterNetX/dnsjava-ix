// SPDX-License-Identifier: BSD-3-Clause
// Copyright (c) 1999-2004 Brian Wellington (bwelling@xbill.org)

package org.xbill.DNS;

/**
 * ALIAS Record - maps an alias to its real name
 *
 * TODO: add definition of ALIAS
 *
 */
public class ALIASRecord extends SingleCompressedNameBase {
  ALIASRecord() {}

  /**
   * Creates a new AliasRecord with the given data
   *
   * @param alias The name to which the CNAME alias points
   */
  public ALIASRecord(Name name, int dclass, long ttl, Name alias) {
    super(name, Type.ALIAS, dclass, ttl, alias, "alias");
  }

  /** Gets the target of the CNAME Record */
  public Name getTarget() {
    return getSingleName();
  }

  /**
   * Gets the name of this record, aka the <i>alias</i> or <i>label</i> to the <i>canonical name</i>
   * specified in {@link #getTarget()}.
   *
   * @deprecated use {@link #getName()}
   */
  @Deprecated
  public Name getAlias() {
    return getName();
  }
}
