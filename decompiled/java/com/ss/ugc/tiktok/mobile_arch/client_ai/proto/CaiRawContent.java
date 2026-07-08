package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1CDN;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawContent;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawContent;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiRawContent extends Message<CaiRawContent, C1CDN> {
    public static final ProtoAdapter<CaiRawContent> ADAPTER = new ProtoAdapter<CaiRawContent>() { // from class: X.1CDM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiRawContent decode(ProtoReader protoReader) {
            C1CDN c1cdn = new C1CDN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cdn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cdn.LIZLLL = CaiModelRawContent.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiRawContent caiRawContent) {
            CaiRawContent caiRawContent2 = caiRawContent;
            return CaiModelRawContent.ADAPTER.encodedSizeWithTag(2, caiRawContent2.model) + caiRawContent2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiRawContent caiRawContent) {
            CaiRawContent caiRawContent2 = caiRawContent;
            CaiModelRawContent.ADAPTER.encodeWithTag(protoWriter, 2, caiRawContent2.model);
            protoWriter.writeBytes(caiRawContent2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawContent#ADAPTER", tag = 2)
    public CaiModelRawContent model;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CaiModelRawContent caiModelRawContent = this.model;
        int iHashCode2 = iHashCode + (caiModelRawContent != null ? caiModelRawContent.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CDN newBuilder() {
        C1CDN c1cdn = new C1CDN();
        c1cdn.LIZLLL = this.model;
        c1cdn.addUnknownFields(unknownFields());
        return c1cdn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.model != null) {
            sb.append(", model=");
            sb.append(this.model);
        }
        sb.replace(0, 2, "CaiRawContent{");
        sb.append('}');
        return sb.toString();
    }

    public CaiRawContent(CaiModelRawContent caiModelRawContent) {
        this(caiModelRawContent, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiRawContent)) {
            return false;
        }
        CaiRawContent caiRawContent = (CaiRawContent) obj;
        if (unknownFields().equals(caiRawContent.unknownFields()) && C1516540pZE.LJ(this.model, caiRawContent.model)) {
            return true;
        }
        return false;
    }

    public CaiRawContent(CaiModelRawContent caiModelRawContent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.model = caiModelRawContent;
    }
}
