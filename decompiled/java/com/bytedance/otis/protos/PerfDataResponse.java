package com.bytedance.otis.protos;

import X.C1516540pZE;
import X.C2225651C9b;
import com.bytedance.otis.protos.PerfDataResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PerfDataResponse extends Message<PerfDataResponse, C2225651C9b> {
    public static final ProtoAdapter<PerfDataResponse> ADAPTER = new ProtoAdapter<PerfDataResponse>() { // from class: X.1C9a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PerfDataResponse decode(ProtoReader protoReader) {
            C2225651C9b c2225651C9b = new C2225651C9b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2225651C9b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2225651C9b.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2225651C9b.LIZLLL = ProtoAdapter.UINT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225651C9b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PerfDataResponse perfDataResponse) {
            PerfDataResponse perfDataResponse2 = perfDataResponse;
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, perfDataResponse2.res_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, perfDataResponse2.err_msg) + perfDataResponse2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PerfDataResponse perfDataResponse) {
            PerfDataResponse perfDataResponse2 = perfDataResponse;
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, perfDataResponse2.res_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, perfDataResponse2.err_msg);
            protoWriter.writeBytes(perfDataResponse2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String err_msg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public Integer res_code;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.res_code;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.err_msg;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2225651C9b newBuilder() {
        C2225651C9b c2225651C9b = new C2225651C9b();
        c2225651C9b.LIZLLL = this.res_code;
        c2225651C9b.LJ = this.err_msg;
        c2225651C9b.addUnknownFields(unknownFields());
        return c2225651C9b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.res_code != null) {
            sb.append(", res_code=");
            sb.append(this.res_code);
        }
        if (this.err_msg != null) {
            sb.append(", err_msg=");
            sb.append(this.err_msg);
        }
        sb.replace(0, 2, "PerfDataResponse{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerfDataResponse)) {
            return false;
        }
        PerfDataResponse perfDataResponse = (PerfDataResponse) obj;
        if (unknownFields().equals(perfDataResponse.unknownFields()) && C1516540pZE.LJ(this.res_code, perfDataResponse.res_code) && C1516540pZE.LJ(this.err_msg, perfDataResponse.err_msg)) {
            return true;
        }
        return false;
    }

    public PerfDataResponse(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public PerfDataResponse(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.res_code = num;
        this.err_msg = str;
    }
}
