/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.swift.codec;

import com.facebook.swift.ThriftCodec;
import com.facebook.swift.internal.TProtocolReader;
import com.facebook.swift.internal.TProtocolWriter;
import com.facebook.swift.metadata.ThriftType;
import com.google.common.base.Preconditions;

public class ByteThriftCodec implements ThriftCodec<Byte> {
  @Override
  public ThriftType getType() {
    return ThriftType.BYTE;
  }

  @Override
  public Byte read(TProtocolReader protocol) throws Exception {
    Preconditions.checkNotNull(protocol, "protocol is null");
    return protocol.readByte();
  }

  @Override
  public void write(Byte value, TProtocolWriter protocol) throws Exception {
    Preconditions.checkNotNull(value, "value is null");
    Preconditions.checkNotNull(protocol, "protocol is null");
    protocol.writeByte(value);
  }
}