package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1CDP;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawInput;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiModelRawInput extends Message<CaiModelRawInput, C1CDP> {
    public static final ProtoAdapter<CaiModelRawInput> ADAPTER = new ProtoAdapter<CaiModelRawInput>() { // from class: X.1CDO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiModelRawInput decode(ProtoReader protoReader) {
            C1CDP c1cdp = new C1CDP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cdp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cdp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiModelRawInput caiModelRawInput) {
            CaiModelRawInput caiModelRawInput2 = caiModelRawInput;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiModelRawInput2.biz_id) + caiModelRawInput2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiModelRawInput caiModelRawInput) {
            CaiModelRawInput caiModelRawInput2 = caiModelRawInput;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiModelRawInput2.biz_id);
            protoWriter.writeBytes(caiModelRawInput2.unknownFields());
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
    public C1CDP newBuilder() {
        C1CDP c1cdp = new C1CDP();
        c1cdp.LIZLLL = this.biz_id;
        c1cdp.addUnknownFields(unknownFields());
        return c1cdp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", biz_id=");
        sb.append(this.biz_id);
        sb.replace(0, 2, "CaiModelRawInput{");
        sb.append('}');
        return sb.toString();
    }

    public CaiModelRawInput(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiModelRawInput)) {
            return false;
        }
        CaiModelRawInput caiModelRawInput = (CaiModelRawInput) obj;
        if (unknownFields().equals(caiModelRawInput.unknownFields()) && this.biz_id.equals(caiModelRawInput.biz_id)) {
            return true;
        }
        return false;
    }

    public CaiModelRawInput(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.biz_id = str;
    }
}
