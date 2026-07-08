package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1518010pbb;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStreamOperation;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiEventStream extends Message<CaiEventStream, C1518010pbb> {
    public static final ProtoAdapter<CaiEventStream> ADAPTER = new ProtoAdapter<CaiEventStream>() { // from class: X.0pba
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiEventStream decode(ProtoReader protoReader) {
            C1518010pbb c1518010pbb = new C1518010pbb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1518010pbb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1518010pbb.LJ.add(CaiStreamOperation.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1518010pbb.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518010pbb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiEventStream caiEventStream) {
            CaiEventStream caiEventStream2 = caiEventStream;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiEventStream2.key) + CaiStreamOperation.ADAPTER.asRepeated().encodedSizeWithTag(2, caiEventStream2.ops) + caiEventStream2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiEventStream caiEventStream) {
            CaiEventStream caiEventStream2 = caiEventStream;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiEventStream2.key);
            CaiStreamOperation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, caiEventStream2.ops);
            protoWriter.writeBytes(caiEventStream2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String key;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStreamOperation#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<CaiStreamOperation> ops;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.ops.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1518010pbb newBuilder() {
        C1518010pbb c1518010pbb = new C1518010pbb();
        c1518010pbb.LIZLLL = this.key;
        c1518010pbb.LJ = C1516540pZE.LIZJ("ops", this.ops);
        c1518010pbb.addUnknownFields(unknownFields());
        return c1518010pbb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        if (!this.ops.isEmpty()) {
            sb.append(", ops=");
            sb.append(this.ops);
        }
        sb.replace(0, 2, "CaiEventStream{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiEventStream)) {
            return false;
        }
        CaiEventStream caiEventStream = (CaiEventStream) obj;
        if (unknownFields().equals(caiEventStream.unknownFields()) && this.key.equals(caiEventStream.key) && this.ops.equals(caiEventStream.ops)) {
            return true;
        }
        return false;
    }

    public CaiEventStream(String str, List<CaiStreamOperation> list) {
        this(str, list, ByteString.EMPTY);
    }

    public CaiEventStream(String str, List<CaiStreamOperation> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.ops = C1516540pZE.LJFF("ops", list);
    }
}
