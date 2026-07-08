package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2223091Bzf;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionEmitEventToAppLog;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiActionEmitEventToAppLog extends Message<CaiActionEmitEventToAppLog, C2223091Bzf> {
    public static final ProtoAdapter<CaiActionEmitEventToAppLog> ADAPTER = new ProtoAdapter<CaiActionEmitEventToAppLog>() { // from class: X.1Bze
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiActionEmitEventToAppLog decode(ProtoReader protoReader) {
            C2223091Bzf c2223091Bzf = new C2223091Bzf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2223091Bzf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2223091Bzf.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223091Bzf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223091Bzf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiActionEmitEventToAppLog caiActionEmitEventToAppLog) {
            CaiActionEmitEventToAppLog caiActionEmitEventToAppLog2 = caiActionEmitEventToAppLog;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiActionEmitEventToAppLog2.event_type_name) + protoAdapter.encodedSizeWithTag(2, caiActionEmitEventToAppLog2.extra_param_json) + caiActionEmitEventToAppLog2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiActionEmitEventToAppLog caiActionEmitEventToAppLog) {
            CaiActionEmitEventToAppLog caiActionEmitEventToAppLog2 = caiActionEmitEventToAppLog;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiActionEmitEventToAppLog2.event_type_name);
            protoAdapter.encodeWithTag(protoWriter, 2, caiActionEmitEventToAppLog2.extra_param_json);
            protoWriter.writeBytes(caiActionEmitEventToAppLog2.unknownFields());
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
    public C2223091Bzf newBuilder() {
        C2223091Bzf c2223091Bzf = new C2223091Bzf();
        c2223091Bzf.LIZLLL = this.event_type_name;
        c2223091Bzf.LJ = this.extra_param_json;
        c2223091Bzf.addUnknownFields(unknownFields());
        return c2223091Bzf;
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
        sb.replace(0, 2, "CaiActionEmitEventToAppLog{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiActionEmitEventToAppLog)) {
            return false;
        }
        CaiActionEmitEventToAppLog caiActionEmitEventToAppLog = (CaiActionEmitEventToAppLog) obj;
        if (unknownFields().equals(caiActionEmitEventToAppLog.unknownFields()) && this.event_type_name.equals(caiActionEmitEventToAppLog.event_type_name) && C1516540pZE.LJ(this.extra_param_json, caiActionEmitEventToAppLog.extra_param_json)) {
            return true;
        }
        return false;
    }

    public CaiActionEmitEventToAppLog(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CaiActionEmitEventToAppLog(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_type_name = str;
        this.extra_param_json = str2;
    }
}
