// SPDX-License-Identifier: BSD-3-Clause
// Copyright (c) 1999-2004 Brian Wellington (bwelling@xbill.org)

package org.xbill.DNS;

/**
 * ALIAS Record - maps an alias to its real name. It isn't part of the official list of dns records!
 * <br>
 * Background A CNAME record redirects DNS queries for a record name regardless of the record type
 * specified in the DNS query, such as A or AAAA. In the response to a dig or nslookup query, an
 * ALIAS record is listed as the record type that you specified when you created the record, such as
 * A or AAAA.
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
