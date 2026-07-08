package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2223111Bzh;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToGlobalStream;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiActionEmitEventToGlobalStream extends Message<CaiActionEmitEventToGlobalStream, C2223111Bzh> {
    public static final ProtoAdapter<CaiActionEmitEventToGlobalStream> ADAPTER = new ProtoAdapter<CaiActionEmitEventToGlobalStream>() { // from class: X.1Bzg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiActionEmitEventToGlobalStream decode(ProtoReader protoReader) {
            C2223111Bzh c2223111Bzh = new C2223111Bzh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2223111Bzh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2223111Bzh.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223111Bzh.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223111Bzh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream) {
            CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream2 = caiActionEmitEventToGlobalStream;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiActionEmitEventToGlobalStream2.event_type_name) + protoAdapter.encodedSizeWithTag(2, caiActionEmitEventToGlobalStream2.extra_param_json) + caiActionEmitEventToGlobalStream2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream) {
            CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream2 = caiActionEmitEventToGlobalStream;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiActionEmitEventToGlobalStream2.event_type_name);
            protoAdapter.encodeWithTag(protoWriter, 2, caiActionEmitEventToGlobalStream2.extra_param_json);
            protoWriter.writeBytes(caiActionEmitEventToGlobalStream2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String event_type_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String extra_param_json;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.event_type_name.hashCode()) * 37;
        String str = this.extra_param_json;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2223111Bzh newBuilder() {
        C2223111Bzh c2223111Bzh = new C2223111Bzh();
        c2223111Bzh.LIZLLL = this.event_type_name;
        c2223111Bzh.LJ = this.extra_param_json;
        c2223111Bzh.addUnknownFields(unknownFields());
        return c2223111Bzh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", event_type_name=");
        sb.append(this.event_type_name);
        if (this.extra_param_json != null) {
            sb.append(", extra_param_json=");
            sb.append(this.extra_param_json);
        }
        sb.replace(0, 2, "CaiActionEmitEventToGlobalStream{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiActionEmitEventToGlobalStream)) {
            return false;
        }
        CaiActionEmitEventToGlobalStream caiActionEmitEventToGlobalStream = (CaiActionEmitEventToGlobalStream) obj;
        if (unknownFields().equals(caiActionEmitEventToGlobalStream.unknownFields()) && this.event_type_name.equals(caiActionEmitEventToGlobalStream.event_type_name) && C1516540pZE.LJ(this.extra_param_json, caiActionEmitEventToGlobalStream.extra_param_json)) {
            return true;
        }
        return false;
    }

    public CaiActionEmitEventToGlobalStream(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CaiActionEmitEventToGlobalStream(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_type_name = str;
        this.extra_param_json = str2;
    }
}
