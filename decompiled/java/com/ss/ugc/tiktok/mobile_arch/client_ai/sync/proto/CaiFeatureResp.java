package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1516540pZE;
import X.C1516610pZL;
import X.C1516630pZN;
import X.C1516650pZP;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureResp extends Message<CaiFeatureResp, C1516610pZL> {
    public static final ProtoAdapter<CaiFeatureResp> ADAPTER = new ProtoAdapter<CaiFeatureResp>() { // from class: X.0pZK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureResp decode(ProtoReader protoReader) {
            C1516610pZL c1516610pZL = new C1516610pZL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1516610pZL.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1516610pZL.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1516610pZL.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1516610pZL.LIZLLL.add(CaiFeatureResp.syncGroupFeatureData.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1516610pZL.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureResp caiFeatureResp) {
            CaiFeatureResp caiFeatureResp2 = caiFeatureResp;
            return CaiFeatureResp.syncGroupFeatureData.ADAPTER.asRepeated().encodedSizeWithTag(1, caiFeatureResp2.all_features) + ProtoAdapter.INT32.encodedSizeWithTag(2, caiFeatureResp2.update_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, caiFeatureResp2.last_update_time) + caiFeatureResp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureResp caiFeatureResp) {
            CaiFeatureResp caiFeatureResp2 = caiFeatureResp;
            CaiFeatureResp.syncGroupFeatureData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, caiFeatureResp2.all_features);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, caiFeatureResp2.update_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, caiFeatureResp2.last_update_time);
            protoWriter.writeBytes(caiFeatureResp2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp$syncGroupFeatureData#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<syncGroupFeatureData> all_features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String last_update_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer update_type;

    public static final class syncFeatureData extends Message<syncFeatureData, C1516650pZP> {
        public static final ProtoAdapter<syncFeatureData> ADAPTER = new ProtoAdapter<syncFeatureData>() { // from class: X.0pZO
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiFeatureResp.syncFeatureData decode(ProtoReader protoReader) {
                C1516650pZP c1516650pZP = new C1516650pZP();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                if (iNextTag != 3) {
                                    if (iNextTag != 4) {
                                        if (iNextTag != 5) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c1516650pZP.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c1516650pZP.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                                        }
                                    } else {
                                        c1516650pZP.LJI = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1516650pZP.LJFF = CaiFeatureTTMRule.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1516650pZP.LJ = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1516650pZP.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1516650pZP.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiFeatureResp.syncFeatureData syncfeaturedata) {
                CaiFeatureResp.syncFeatureData syncfeaturedata2 = syncfeaturedata;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return protoAdapter.encodedSizeWithTag(1, syncfeaturedata2.name) + ProtoAdapter.INT32.encodedSizeWithTag(2, syncfeaturedata2.ttm_type) + CaiFeatureTTMRule.ADAPTER.encodedSizeWithTag(3, syncfeaturedata2.rule) + protoAdapter.encodedSizeWithTag(4, syncfeaturedata2.schema_hash_value) + protoAdapter.asRepeated().encodedSizeWithTag(5, syncfeaturedata2.scene_keys) + syncfeaturedata2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiFeatureResp.syncFeatureData syncfeaturedata) {
                CaiFeatureResp.syncFeatureData syncfeaturedata2 = syncfeaturedata;
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(protoWriter, 1, syncfeaturedata2.name);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, syncfeaturedata2.ttm_type);
                CaiFeatureTTMRule.ADAPTER.encodeWithTag(protoWriter, 3, syncfeaturedata2.rule);
                protoAdapter.encodeWithTag(protoWriter, 4, syncfeaturedata2.schema_hash_value);
                protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, syncfeaturedata2.scene_keys);
                protoWriter.writeBytes(syncfeaturedata2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String name;

        @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule#ADAPTER", tag = 3)
        public CaiFeatureTTMRule rule;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
        public List<String> scene_keys;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
        public String schema_hash_value;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
        public Integer ttm_type;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37;
            Integer num = this.ttm_type;
            int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
            CaiFeatureTTMRule caiFeatureTTMRule = this.rule;
            int iHashCode3 = (iHashCode2 + (caiFeatureTTMRule != null ? caiFeatureTTMRule.hashCode() : 0)) * 37;
            String str = this.schema_hash_value;
            int iHashCode4 = ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.scene_keys.hashCode();
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public C1516650pZP newBuilder() {
            C1516650pZP c1516650pZP = new C1516650pZP();
            c1516650pZP.LIZLLL = this.name;
            c1516650pZP.LJ = this.ttm_type;
            c1516650pZP.LJFF = this.rule;
            c1516650pZP.LJI = this.schema_hash_value;
            c1516650pZP.LJII = C1516540pZE.LIZJ("scene_keys", this.scene_keys);
            c1516650pZP.addUnknownFields(unknownFields());
            return c1516650pZP;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", name=");
            sb.append(this.name);
            if (this.ttm_type != null) {
                sb.append(", ttm_type=");
                sb.append(this.ttm_type);
            }
            if (this.rule != null) {
                sb.append(", rule=");
                sb.append(this.rule);
            }
            if (this.schema_hash_value != null) {
                sb.append(", schema_hash_value=");
                sb.append(this.schema_hash_value);
            }
            if (!this.scene_keys.isEmpty()) {
                sb.append(", scene_keys=");
                sb.append(this.scene_keys);
            }
            sb.replace(0, 2, "syncFeatureData{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof syncFeatureData)) {
                return false;
            }
            syncFeatureData syncfeaturedata = (syncFeatureData) obj;
            if (unknownFields().equals(syncfeaturedata.unknownFields()) && this.name.equals(syncfeaturedata.name) && C1516540pZE.LJ(this.ttm_type, syncfeaturedata.ttm_type) && C1516540pZE.LJ(this.rule, syncfeaturedata.rule) && C1516540pZE.LJ(this.schema_hash_value, syncfeaturedata.schema_hash_value) && this.scene_keys.equals(syncfeaturedata.scene_keys)) {
                return true;
            }
            return false;
        }

        public syncFeatureData(String str, Integer num, CaiFeatureTTMRule caiFeatureTTMRule, String str2, List<String> list) {
            this(str, num, caiFeatureTTMRule, str2, list, ByteString.EMPTY);
        }

        public syncFeatureData(String str, Integer num, CaiFeatureTTMRule caiFeatureTTMRule, String str2, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.name = str;
            this.ttm_type = num;
            this.rule = caiFeatureTTMRule;
            this.schema_hash_value = str2;
            this.scene_keys = C1516540pZE.LJFF("scene_keys", list);
        }
    }

    public static final class syncGroupFeatureData extends Message<syncGroupFeatureData, C1516630pZN> {
        public static final ProtoAdapter<syncGroupFeatureData> ADAPTER = new ProtoAdapter<syncGroupFeatureData>() { // from class: X.0pZM
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiFeatureResp.syncGroupFeatureData decode(ProtoReader protoReader) {
                C1516630pZN c1516630pZN = new C1516630pZN();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                if (iNextTag != 3) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1516630pZN.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1516630pZN.LJFF = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1516630pZN.LJ.add(CaiFeatureResp.syncFeatureData.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1516630pZN.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1516630pZN.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiFeatureResp.syncGroupFeatureData syncgroupfeaturedata) {
                CaiFeatureResp.syncGroupFeatureData syncgroupfeaturedata2 = syncgroupfeaturedata;
                return ProtoAdapter.STRING.encodedSizeWithTag(1, syncgroupfeaturedata2.group) + CaiFeatureResp.syncFeatureData.ADAPTER.asRepeated().encodedSizeWithTag(2, syncgroupfeaturedata2.features) + ProtoAdapter.INT32.encodedSizeWithTag(3, syncgroupfeaturedata2.source_type) + syncgroupfeaturedata2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiFeatureResp.syncGroupFeatureData syncgroupfeaturedata) {
                CaiFeatureResp.syncGroupFeatureData syncgroupfeaturedata2 = syncgroupfeaturedata;
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncgroupfeaturedata2.group);
                CaiFeatureResp.syncFeatureData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, syncgroupfeaturedata2.features);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, syncgroupfeaturedata2.source_type);
                protoWriter.writeBytes(syncgroupfeaturedata2.unknownFields());
            }
        };

        @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp$syncFeatureData#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
        public List<syncFeatureData> features;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String group;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
        public Integer source_type;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.group.hashCode()) * 37) + this.features.hashCode()) * 37) + this.source_type.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C1516630pZN newBuilder() {
            C1516630pZN c1516630pZN = new C1516630pZN();
            c1516630pZN.LIZLLL = this.group;
            c1516630pZN.LJ = C1516540pZE.LIZJ("features", this.features);
            c1516630pZN.LJFF = this.source_type;
            c1516630pZN.addUnknownFields(unknownFields());
            return c1516630pZN;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", group=");
            sb.append(this.group);
            if (!this.features.isEmpty()) {
                sb.append(", features=");
                sb.append(this.features);
            }
            sb.append(", source_type=");
            sb.append(this.source_type);
            sb.replace(0, 2, "syncGroupFeatureData{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof syncGroupFeatureData)) {
                return false;
            }
            syncGroupFeatureData syncgroupfeaturedata = (syncGroupFeatureData) obj;
            if (unknownFields().equals(syncgroupfeaturedata.unknownFields()) && this.group.equals(syncgroupfeaturedata.group) && this.features.equals(syncgroupfeaturedata.features) && this.source_type.equals(syncgroupfeaturedata.source_type)) {
                return true;
            }
            return false;
        }

        public syncGroupFeatureData(String str, List<syncFeatureData> list, Integer num) {
            this(str, list, num, ByteString.EMPTY);
        }

        public syncGroupFeatureData(String str, List<syncFeatureData> list, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.group = str;
            this.features = C1516540pZE.LJFF("features", list);
            this.source_type = num;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.all_features.hashCode()) * 37;
        Integer num = this.update_type;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.last_update_time;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1516610pZL newBuilder() {
        C1516610pZL c1516610pZL = new C1516610pZL();
        c1516610pZL.LIZLLL = C1516540pZE.LIZJ("all_features", this.all_features);
        c1516610pZL.LJ = this.update_type;
        c1516610pZL.LJFF = this.last_update_time;
        c1516610pZL.addUnknownFields(unknownFields());
        return c1516610pZL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.all_features.isEmpty()) {
            sb.append(", all_features=");
            sb.append(this.all_features);
        }
        if (this.update_type != null) {
            sb.append(", update_type=");
            sb.append(this.update_type);
        }
        if (this.last_update_time != null) {
            sb.append(", last_update_time=");
            sb.append(this.last_update_time);
        }
        sb.replace(0, 2, "CaiFeatureResp{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureResp)) {
            return false;
        }
        CaiFeatureResp caiFeatureResp = (CaiFeatureResp) obj;
        if (unknownFields().equals(caiFeatureResp.unknownFields()) && this.all_features.equals(caiFeatureResp.all_features) && C1516540pZE.LJ(this.update_type, caiFeatureResp.update_type) && C1516540pZE.LJ(this.last_update_time, caiFeatureResp.last_update_time)) {
            return true;
        }
        return false;
    }

    public CaiFeatureResp(List<syncGroupFeatureData> list, Integer num, String str) {
        this(list, num, str, ByteString.EMPTY);
    }

    public CaiFeatureResp(List<syncGroupFeatureData> list, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.all_features = C1516540pZE.LJFF("all_features", list);
        this.update_type = num;
        this.last_update_time = str;
    }
}
