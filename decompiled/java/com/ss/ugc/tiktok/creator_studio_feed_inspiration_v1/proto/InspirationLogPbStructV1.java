package com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto;

import X.C1516540pZE;
import X.C1CET;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.creator_studio_feed_inspiration_v1.proto.InspirationLogPbStructV1;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class InspirationLogPbStructV1 extends Message<InspirationLogPbStructV1, C1CET> {
    public static final ProtoAdapter<InspirationLogPbStructV1> ADAPTER = new ProtoAdapter<InspirationLogPbStructV1>() { // from class: X.1CES
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InspirationLogPbStructV1 decode(ProtoReader protoReader) {
            C1CET c1cet = new C1CET();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cet.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cet.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cet.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(InspirationLogPbStructV1 inspirationLogPbStructV1) {
            InspirationLogPbStructV1 inspirationLogPbStructV12 = inspirationLogPbStructV1;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, inspirationLogPbStructV12.impr_id) + inspirationLogPbStructV12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, InspirationLogPbStructV1 inspirationLogPbStructV1) {
            InspirationLogPbStructV1 inspirationLogPbStructV12 = inspirationLogPbStructV1;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, inspirationLogPbStructV12.impr_id);
            protoWriter.writeBytes(inspirationLogPbStructV12.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String impr_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.impr_id;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CET newBuilder() {
        C1CET c1cet = new C1CET();
        c1cet.LIZLLL = this.impr_id;
        c1cet.addUnknownFields(unknownFields());
        return c1cet;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        sb.replace(0, 2, "InspirationLogPbStructV1{");
        sb.append('}');
        return sb.toString();
    }

    public InspirationLogPbStructV1(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InspirationLogPbStructV1)) {
            return false;
        }
        InspirationLogPbStructV1 inspirationLogPbStructV1 = (InspirationLogPbStructV1) obj;
        if (unknownFields().equals(inspirationLogPbStructV1.unknownFields()) && C1516540pZE.LJ(this.impr_id, inspirationLogPbStructV1.impr_id)) {
            return true;
        }
        return false;
    }

    public InspirationLogPbStructV1(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
    }
}
