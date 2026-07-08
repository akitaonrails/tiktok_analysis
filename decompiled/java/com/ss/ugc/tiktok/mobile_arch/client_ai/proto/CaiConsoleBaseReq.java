package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1C3E;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiConsoleBaseReq;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiConsoleBaseReq extends Message<CaiConsoleBaseReq, C1C3E> {
    public static final ProtoAdapter<CaiConsoleBaseReq> ADAPTER = new ProtoAdapter<CaiConsoleBaseReq>() { // from class: X.1C3D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiConsoleBaseReq decode(ProtoReader protoReader) {
            C1C3E c1c3e = new C1C3E();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1c3e.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1c3e.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c3e.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1c3e.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3e.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiConsoleBaseReq caiConsoleBaseReq) {
            CaiConsoleBaseReq caiConsoleBaseReq2 = caiConsoleBaseReq;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, caiConsoleBaseReq2.app_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, caiConsoleBaseReq2.app_platform) + ProtoAdapter.STRING.encodedSizeWithTag(3, caiConsoleBaseReq2.operator) + caiConsoleBaseReq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiConsoleBaseReq caiConsoleBaseReq) {
            CaiConsoleBaseReq caiConsoleBaseReq2 = caiConsoleBaseReq;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, caiConsoleBaseReq2.app_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, caiConsoleBaseReq2.app_platform);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, caiConsoleBaseReq2.operator);
            protoWriter.writeBytes(caiConsoleBaseReq2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public Long app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer app_platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String operator;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.app_id.hashCode()) * 37) + this.app_platform.hashCode()) * 37) + this.operator.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C3E newBuilder() {
        C1C3E c1c3e = new C1C3E();
        c1c3e.LIZLLL = this.app_id;
        c1c3e.LJ = this.app_platform;
        c1c3e.LJFF = this.operator;
        c1c3e.addUnknownFields(unknownFields());
        return c1c3e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", app_platform=");
        sb.append(this.app_platform);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.replace(0, 2, "CaiConsoleBaseReq{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiConsoleBaseReq)) {
            return false;
        }
        CaiConsoleBaseReq caiConsoleBaseReq = (CaiConsoleBaseReq) obj;
        if (unknownFields().equals(caiConsoleBaseReq.unknownFields()) && this.app_id.equals(caiConsoleBaseReq.app_id) && this.app_platform.equals(caiConsoleBaseReq.app_platform) && this.operator.equals(caiConsoleBaseReq.operator)) {
            return true;
        }
        return false;
    }

    public CaiConsoleBaseReq(Long l, Integer num, String str) {
        this(l, num, str, ByteString.EMPTY);
    }

    public CaiConsoleBaseReq(Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = l;
        this.app_platform = num;
        this.operator = str;
    }
}
