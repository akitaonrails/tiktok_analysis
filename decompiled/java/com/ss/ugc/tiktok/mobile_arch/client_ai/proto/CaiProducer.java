package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237561Chu;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiProducer;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiProducer extends Message<CaiProducer, C2237561Chu> {
    public static final ProtoAdapter<CaiProducer> ADAPTER = new ProtoAdapter<CaiProducer>() { // from class: X.1Cht
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiProducer decode(ProtoReader protoReader) {
            C2237561Chu c2237561Chu = new C2237561Chu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 255) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237561Chu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237561Chu.LJ = CaiManager.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2237561Chu.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237561Chu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiProducer caiProducer) {
            CaiProducer caiProducer2 = caiProducer;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiProducer2.name) + CaiManager.ADAPTER.encodedSizeWithTag(255, caiProducer2.manage) + caiProducer2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiProducer caiProducer) {
            CaiProducer caiProducer2 = caiProducer;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiProducer2.name);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 255, caiProducer2.manage);
            protoWriter.writeBytes(caiProducer2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 255)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String name;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode2 = iHashCode + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237561Chu newBuilder() {
        C2237561Chu c2237561Chu = new C2237561Chu();
        c2237561Chu.LIZLLL = this.name;
        c2237561Chu.LJ = this.manage;
        c2237561Chu.addUnknownFields(unknownFields());
        return c2237561Chu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.name);
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.replace(0, 2, "CaiProducer{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiProducer)) {
            return false;
        }
        CaiProducer caiProducer = (CaiProducer) obj;
        if (unknownFields().equals(caiProducer.unknownFields()) && this.name.equals(caiProducer.name) && C1516540pZE.LJ(this.manage, caiProducer.manage)) {
            return true;
        }
        return false;
    }

    public CaiProducer(String str, CaiManager caiManager) {
        this(str, caiManager, ByteString.EMPTY);
    }

    public CaiProducer(String str, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.manage = caiManager;
    }
}
