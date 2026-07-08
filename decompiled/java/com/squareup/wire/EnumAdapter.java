package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX INFO: loaded from: classes24.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    public abstract E LIZ(int i);

    public EnumAdapter(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final E decode(ProtoReader protoReader) {
        int varint32 = protoReader.readVarint32();
        E e = (E) LIZ(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, this.javaType);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(E e) {
        return ProtoWriter.LIZ(e.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, E e) {
        protoWriter.writeVarint32(e.getValue());
    }
}
