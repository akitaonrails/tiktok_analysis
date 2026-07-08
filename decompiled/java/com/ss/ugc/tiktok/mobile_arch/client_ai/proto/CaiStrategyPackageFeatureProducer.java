package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1C20;
import X.C2223801C1y;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyPackageFeatureProducer extends Message<CaiStrategyPackageFeatureProducer, C2223801C1y> {
    public static final ProtoAdapter<CaiStrategyPackageFeatureProducer> ADAPTER = new ProtoAdapter<CaiStrategyPackageFeatureProducer>() { // from class: X.1C1x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyPackageFeatureProducer decode(ProtoReader protoReader) {
            C2223801C1y c2223801C1y = new C2223801C1y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2223801C1y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2223801C1y.LJFF.add(CaiStrategyPackageFeatureProducer.Feature.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2223801C1y.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223801C1y.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223801C1y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyPackageFeatureProducer caiStrategyPackageFeatureProducer) {
            CaiStrategyPackageFeatureProducer caiStrategyPackageFeatureProducer2 = caiStrategyPackageFeatureProducer;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, caiStrategyPackageFeatureProducer2.source_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, caiStrategyPackageFeatureProducer2.group_key) + CaiStrategyPackageFeatureProducer.Feature.ADAPTER.asRepeated().encodedSizeWithTag(3, caiStrategyPackageFeatureProducer2.features) + caiStrategyPackageFeatureProducer2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyPackageFeatureProducer caiStrategyPackageFeatureProducer) {
            CaiStrategyPackageFeatureProducer caiStrategyPackageFeatureProducer2 = caiStrategyPackageFeatureProducer;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, caiStrategyPackageFeatureProducer2.source_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, caiStrategyPackageFeatureProducer2.group_key);
            CaiStrategyPackageFeatureProducer.Feature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, caiStrategyPackageFeatureProducer2.features);
            protoWriter.writeBytes(caiStrategyPackageFeatureProducer2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer$Feature#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<Feature> features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String group_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer source_type;

    public static final class Feature extends Message<Feature, C1C20> {
        public static final ProtoAdapter<Feature> ADAPTER = new ProtoAdapter<Feature>() { // from class: X.1C1z
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiStrategyPackageFeatureProducer.Feature decode(ProtoReader protoReader) {
                C1C20 c1c20 = new C1C20();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c20.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1c20.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c1c20.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiStrategyPackageFeatureProducer.Feature feature) {
                CaiStrategyPackageFeatureProducer.Feature feature2 = feature;
                return ProtoAdapter.STRING.encodedSizeWithTag(1, feature2.feature_key) + feature2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiStrategyPackageFeatureProducer.Feature feature) {
                CaiStrategyPackageFeatureProducer.Feature feature2 = feature;
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, feature2.feature_key);
                protoWriter.writeBytes(feature2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String feature_key;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.feature_key.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C1C20 newBuilder() {
            C1C20 c1c20 = new C1C20();
            c1c20.LIZLLL = this.feature_key;
            c1c20.addUnknownFields(unknownFields());
            return c1c20;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", feature_key=");
            sb.append(this.feature_key);
            sb.replace(0, 2, "Feature{");
            sb.append('}');
            return sb.toString();
        }

        public Feature(String str) {
            this(str, ByteString.EMPTY);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return false;
            }
            Feature feature = (Feature) obj;
            if (unknownFields().equals(feature.unknownFields()) && this.feature_key.equals(feature.feature_key)) {
                return true;
            }
            return false;
        }

        public Feature(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.feature_key = str;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.source_type.hashCode()) * 37) + this.group_key.hashCode()) * 37) + this.features.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2223801C1y newBuilder() {
        C2223801C1y c2223801C1y = new C2223801C1y();
        c2223801C1y.LIZLLL = this.source_type;
        c2223801C1y.LJ = this.group_key;
        c2223801C1y.LJFF = C1516540pZE.LIZJ("features", this.features);
        c2223801C1y.addUnknownFields(unknownFields());
        return c2223801C1y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", group_key=");
        sb.append(this.group_key);
        if (!this.features.isEmpty()) {
            sb.append(", features=");
            sb.append(this.features);
        }
        sb.replace(0, 2, "CaiStrategyPackageFeatureProducer{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyPackageFeatureProducer)) {
            return false;
        }
        CaiStrategyPackageFeatureProducer caiStrategyPackageFeatureProducer = (CaiStrategyPackageFeatureProducer) obj;
        if (unknownFields().equals(caiStrategyPackageFeatureProducer.unknownFields()) && this.source_type.equals(caiStrategyPackageFeatureProducer.source_type) && this.group_key.equals(caiStrategyPackageFeatureProducer.group_key) && this.features.equals(caiStrategyPackageFeatureProducer.features)) {
            return true;
        }
        return false;
    }

    public CaiStrategyPackageFeatureProducer(Integer num, String str, List<Feature> list) {
        this(num, str, list, ByteString.EMPTY);
    }

    public CaiStrategyPackageFeatureProducer(Integer num, String str, List<Feature> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_type = num;
        this.group_key = str;
        this.features = C1516540pZE.LJFF("features", list);
    }
}
