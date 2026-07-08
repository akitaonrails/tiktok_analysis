package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1CDR;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawInput;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawContent;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawInput;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiRawInput extends Message<CaiRawInput, C1CDR> {
    public static final ProtoAdapter<CaiRawInput> ADAPTER = new ProtoAdapter<CaiRawInput>() { // from class: X.1CDQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiRawInput decode(ProtoReader protoReader) {
            C1CDR c1cdr = new C1CDR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 255) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cdr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cdr.LJFF = CaiRawContent.ADAPTER.decode(protoReader);
                                c1cdr.LIZLLL = null;
                                c1cdr.LJ = null;
                            }
                        } else {
                            c1cdr.LJ = CaiModelRawInput.ADAPTER.decode(protoReader);
                            c1cdr.LIZLLL = null;
                            c1cdr.LJFF = null;
                        }
                    } else {
                        c1cdr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        c1cdr.LJ = null;
                        c1cdr.LJFF = null;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiRawInput caiRawInput) {
            CaiRawInput caiRawInput2 = caiRawInput;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiRawInput2.ttm) + CaiModelRawInput.ADAPTER.encodedSizeWithTag(2, caiRawInput2.model) + CaiRawContent.ADAPTER.encodedSizeWithTag(255, caiRawInput2.content) + caiRawInput2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiRawInput caiRawInput) {
            CaiRawInput caiRawInput2 = caiRawInput;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiRawInput2.ttm);
            CaiModelRawInput.ADAPTER.encodeWithTag(protoWriter, 2, caiRawInput2.model);
            CaiRawContent.ADAPTER.encodeWithTag(protoWriter, 255, caiRawInput2.content);
            protoWriter.writeBytes(caiRawInput2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawContent#ADAPTER", tag = 255)
    public CaiRawContent content;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiModelRawInput#ADAPTER", tag = 2)
    public CaiModelRawInput model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String ttm;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.ttm;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        CaiModelRawInput caiModelRawInput = this.model;
        int iHashCode3 = (iHashCode2 + (caiModelRawInput != null ? caiModelRawInput.hashCode() : 0)) * 37;
        CaiRawContent caiRawContent = this.content;
        int iHashCode4 = iHashCode3 + (caiRawContent != null ? caiRawContent.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1CDR newBuilder() {
        C1CDR c1cdr = new C1CDR();
        c1cdr.LIZLLL = this.ttm;
        c1cdr.LJ = this.model;
        c1cdr.LJFF = this.content;
        c1cdr.addUnknownFields(unknownFields());
        return c1cdr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ttm != null) {
            sb.append(", ttm=");
            sb.append(this.ttm);
        }
        if (this.model != null) {
            sb.append(", model=");
            sb.append(this.model);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        sb.replace(0, 2, "CaiRawInput{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiRawInput)) {
            return false;
        }
        CaiRawInput caiRawInput = (CaiRawInput) obj;
        if (unknownFields().equals(caiRawInput.unknownFields()) && C1516540pZE.LJ(this.ttm, caiRawInput.ttm) && C1516540pZE.LJ(this.model, caiRawInput.model) && C1516540pZE.LJ(this.content, caiRawInput.content)) {
            return true;
        }
        return false;
    }

    public CaiRawInput(String str, CaiModelRawInput caiModelRawInput, CaiRawContent caiRawContent) {
        this(str, caiModelRawInput, caiRawContent, ByteString.EMPTY);
    }

    public CaiRawInput(String str, CaiModelRawInput caiModelRawInput, CaiRawContent caiRawContent, ByteString byteString) {
        int i;
        int i2;
        super(ADAPTER, byteString);
        if (str != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (caiModelRawInput != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i + i2 + (caiRawContent != null ? 1 : 0) <= 1) {
            this.ttm = str;
            this.model = caiModelRawInput;
            this.content = caiRawContent;
            return;
        }
        throw new IllegalArgumentException("at most one of ttm, model, content may be non-null");
    }
}
