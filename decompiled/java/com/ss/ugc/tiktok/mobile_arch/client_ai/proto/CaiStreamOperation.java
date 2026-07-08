package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1518040pbe;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStreamOperation;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiStreamOperation extends Message<CaiStreamOperation, C1518040pbe> {
    public static final ProtoAdapter<CaiStreamOperation> ADAPTER = new ProtoAdapter<CaiStreamOperation>() { // from class: X.0pbd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStreamOperation decode(ProtoReader protoReader) {
            C1518040pbe c1518040pbe = new C1518040pbe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1518040pbe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1518040pbe.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1518040pbe.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518040pbe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStreamOperation caiStreamOperation) {
            CaiStreamOperation caiStreamOperation2 = caiStreamOperation;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, caiStreamOperation2.op) + ProtoAdapter.STRING.encodedSizeWithTag(2, caiStreamOperation2.param) + caiStreamOperation2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStreamOperation caiStreamOperation) {
            CaiStreamOperation caiStreamOperation2 = caiStreamOperation;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, caiStreamOperation2.op);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, caiStreamOperation2.param);
            protoWriter.writeBytes(caiStreamOperation2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer op;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String param;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.op.hashCode()) * 37) + this.param.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1518040pbe newBuilder() {
        C1518040pbe c1518040pbe = new C1518040pbe();
        c1518040pbe.LIZLLL = this.op;
        c1518040pbe.LJ = this.param;
        c1518040pbe.addUnknownFields(unknownFields());
        return c1518040pbe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", op=");
        sb.append(this.op);
        sb.append(", param=");
        sb.append(this.param);
        sb.replace(0, 2, "CaiStreamOperation{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStreamOperation)) {
            return false;
        }
        CaiStreamOperation caiStreamOperation = (CaiStreamOperation) obj;
        if (unknownFields().equals(caiStreamOperation.unknownFields()) && this.op.equals(caiStreamOperation.op) && this.param.equals(caiStreamOperation.param)) {
            return true;
        }
        return false;
    }

    public CaiStreamOperation(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public CaiStreamOperation(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.op = num;
        this.param = str;
    }
}
