package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237681Ci6;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeature;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiFeature extends Message<CaiFeature, C2237681Ci6> {
    public static final ProtoAdapter<CaiFeature> ADAPTER = new ProtoAdapter<CaiFeature>() { // from class: X.1Ci5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeature decode(ProtoReader protoReader) {
            C2237681Ci6 c2237681Ci6 = new C2237681Ci6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237681Ci6.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2237681Ci6.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2237681Ci6.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2237681Ci6.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2237681Ci6.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2237681Ci6.LJIIIIZZ.add(CaiAppVersion.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (iNextTag) {
                                case 253:
                                    c2237681Ci6.LJIIIZ = CaiManager.ADAPTER.decode(protoReader);
                                    break;
                                case 254:
                                    c2237681Ci6.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 255:
                                    c2237681Ci6.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2237681Ci6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237681Ci6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeature caiFeature) {
            CaiFeature caiFeature2 = caiFeature;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiFeature2.feature_key) + protoAdapter.encodedSizeWithTag(2, caiFeature2.feature_name) + ProtoAdapter.INT32.encodedSizeWithTag(3, caiFeature2.type) + protoAdapter.encodedSizeWithTag(4, caiFeature2.producer_key) + protoAdapter.encodedSizeWithTag(5, caiFeature2.value_type) + CaiAppVersion.ADAPTER.asRepeated().encodedSizeWithTag(6, caiFeature2.res_app_version) + CaiManager.ADAPTER.encodedSizeWithTag(253, caiFeature2.manage);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(254, caiFeature2.created_timestamp) + protoAdapter2.encodedSizeWithTag(255, caiFeature2.updated_timestamp) + caiFeature2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeature caiFeature) {
            CaiFeature caiFeature2 = caiFeature;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeature2.feature_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiFeature2.feature_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, caiFeature2.type);
            protoAdapter.encodeWithTag(protoWriter, 4, caiFeature2.producer_key);
            protoAdapter.encodeWithTag(protoWriter, 5, caiFeature2.value_type);
            CaiAppVersion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, caiFeature2.res_app_version);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 253, caiFeature2.manage);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 254, caiFeature2.created_timestamp);
            protoAdapter2.encodeWithTag(protoWriter, 255, caiFeature2.updated_timestamp);
            protoWriter.writeBytes(caiFeature2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 254)
    public Long created_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String feature_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String feature_name;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 253)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String producer_key;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public List<CaiAppVersion> res_app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 255)
    public Long updated_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public String value_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.feature_key.hashCode()) * 37) + this.feature_name.hashCode()) * 37) + this.type.hashCode()) * 37) + this.producer_key.hashCode()) * 37) + this.value_type.hashCode()) * 37) + this.res_app_version.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode2 = ((((iHashCode + (caiManager != null ? caiManager.hashCode() : 0)) * 37) + this.created_timestamp.hashCode()) * 37) + this.updated_timestamp.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2237681Ci6 newBuilder() {
        C2237681Ci6 c2237681Ci6 = new C2237681Ci6();
        c2237681Ci6.LIZLLL = this.feature_key;
        c2237681Ci6.LJ = this.feature_name;
        c2237681Ci6.LJFF = this.type;
        c2237681Ci6.LJI = this.producer_key;
        c2237681Ci6.LJII = this.value_type;
        c2237681Ci6.LJIIIIZZ = C1516540pZE.LIZJ("res_app_version", this.res_app_version);
        c2237681Ci6.LJIIIZ = this.manage;
        c2237681Ci6.LJIIJ = this.created_timestamp;
        c2237681Ci6.LJIIJJI = this.updated_timestamp;
        c2237681Ci6.addUnknownFields(unknownFields());
        return c2237681Ci6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", feature_key=");
        sb.append(this.feature_key);
        sb.append(", feature_name=");
        sb.append(this.feature_name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", producer_key=");
        sb.append(this.producer_key);
        sb.append(", value_type=");
        sb.append(this.value_type);
        if (!this.res_app_version.isEmpty()) {
            sb.append(", res_app_version=");
            sb.append(this.res_app_version);
        }
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.append(", created_timestamp=");
        sb.append(this.created_timestamp);
        sb.append(", updated_timestamp=");
        sb.append(this.updated_timestamp);
        sb.replace(0, 2, "CaiFeature{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeature)) {
            return false;
        }
        CaiFeature caiFeature = (CaiFeature) obj;
        if (unknownFields().equals(caiFeature.unknownFields()) && this.feature_key.equals(caiFeature.feature_key) && this.feature_name.equals(caiFeature.feature_name) && this.type.equals(caiFeature.type) && this.producer_key.equals(caiFeature.producer_key) && this.value_type.equals(caiFeature.value_type) && this.res_app_version.equals(caiFeature.res_app_version) && C1516540pZE.LJ(this.manage, caiFeature.manage) && this.created_timestamp.equals(caiFeature.created_timestamp) && this.updated_timestamp.equals(caiFeature.updated_timestamp)) {
            return true;
        }
        return false;
    }

    public CaiFeature(String str, String str2, Integer num, String str3, String str4, List<CaiAppVersion> list, CaiManager caiManager, Long l, Long l2) {
        this(str, str2, num, str3, str4, list, caiManager, l, l2, ByteString.EMPTY);
    }

    public CaiFeature(String str, String str2, Integer num, String str3, String str4, List<CaiAppVersion> list, CaiManager caiManager, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_key = str;
        this.feature_name = str2;
        this.type = num;
        this.producer_key = str3;
        this.value_type = str4;
        this.res_app_version = C1516540pZE.LJFF("res_app_version", list);
        this.manage = caiManager;
        this.created_timestamp = l;
        this.updated_timestamp = l2;
    }
}
