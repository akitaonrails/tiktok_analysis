package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C2227001CEg;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiBaseResp extends Message<CaiBaseResp, C2227001CEg> {
    public static final ProtoAdapter<CaiBaseResp> ADAPTER = new ProtoAdapter<CaiBaseResp>() { // from class: X.1CEf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiBaseResp decode(ProtoReader protoReader) {
            C2227001CEg c2227001CEg = new C2227001CEg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227001CEg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227001CEg.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2227001CEg.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227001CEg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiBaseResp caiBaseResp) {
            CaiBaseResp caiBaseResp2 = caiBaseResp;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, caiBaseResp2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, caiBaseResp2.status_msg) + caiBaseResp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiBaseResp caiBaseResp) {
            CaiBaseResp caiBaseResp2 = caiBaseResp;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, caiBaseResp2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, caiBaseResp2.status_msg);
            protoWriter.writeBytes(caiBaseResp2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer status_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String status_msg;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.status_code.hashCode()) * 37) + this.status_msg.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227001CEg newBuilder() {
        C2227001CEg c2227001CEg = new C2227001CEg();
        c2227001CEg.LIZLLL = this.status_code;
        c2227001CEg.LJ = this.status_msg;
        c2227001CEg.addUnknownFields(unknownFields());
        return c2227001CEg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", status_code=");
        sb.append(this.status_code);
        sb.append(", status_msg=");
        sb.append(this.status_msg);
        sb.replace(0, 2, "CaiBaseResp{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiBaseResp)) {
            return false;
        }
        CaiBaseResp caiBaseResp = (CaiBaseResp) obj;
        if (unknownFields().equals(caiBaseResp.unknownFields()) && this.status_code.equals(caiBaseResp.status_code) && this.status_msg.equals(caiBaseResp.status_msg)) {
            return true;
        }
        return false;
    }

    public CaiBaseResp(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public CaiBaseResp(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status_code = num;
        this.status_msg = str;
    }
}
