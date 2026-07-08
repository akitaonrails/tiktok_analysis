package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1CDL;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawContent;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiModelRawContent extends Message<CaiModelRawContent, C1CDL> {
    public static final ProtoAdapter<CaiModelRawContent> ADAPTER = new ProtoAdapter<CaiModelRawContent>() { // from class: X.1CDK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiModelRawContent decode(ProtoReader protoReader) {
            C1CDL c1cdl = new C1CDL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cdl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cdl.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiModelRawContent caiModelRawContent) {
            CaiModelRawContent caiModelRawContent2 = caiModelRawContent;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiModelRawContent2.biz_id) + caiModelRawContent2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiModelRawContent caiModelRawContent) {
            CaiModelRawContent caiModelRawContent2 = caiModelRawContent;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiModelRawContent2.biz_id);
            protoWriter.writeBytes(caiModelRawContent2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String biz_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.biz_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CDL newBuilder() {
        C1CDL c1cdl = new C1CDL();
        c1cdl.LIZLLL = this.biz_id;
        c1cdl.addUnknownFields(unknownFields());
        return c1cdl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_id=");
        sb.append(this.biz_id);
        sb.replace(0, 2, "CaiModelRawContent{");
        sb.append('}');
        return sb.toString();
    }

    public CaiModelRawContent(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiModelRawContent)) {
            return false;
        }
        CaiModelRawContent caiModelRawContent = (CaiModelRawContent) obj;
        if (unknownFields().equals(caiModelRawContent.unknownFields()) && this.biz_id.equals(caiModelRawContent.biz_id)) {
            return true;
        }
        return false;
    }

    public CaiModelRawContent(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_id = str;
    }
}
