// SPDX-License-Identifier: BSD-3-Clause
// Copyright (c) 1999-2004 Brian Wellington (bwelling@xbill.org)

package org.xbill.DNS;

/**
 * ALIAS Record - maps an alias to its real name. It isn't part of the official list of dns records!
 * <br>
 * Hint: The difference between a CNAME record and an ALIAS record can be best explained by looking
 * at the response of a nslookup call. If CNAME is used the response is the defined IP of the
 * record. If ALIAS is used the response is the IP of the defined host.
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
