package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C2237701Ci8;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiPackageFeature;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiPackageFeature extends Message<CaiPackageFeature, C2237701Ci8> {
    public static final ProtoAdapter<CaiPackageFeature> ADAPTER = new ProtoAdapter<CaiPackageFeature>() { // from class: X.1Ci7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiPackageFeature decode(ProtoReader protoReader) {
            C2237701Ci8 c2237701Ci8 = new C2237701Ci8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 7) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2237701Ci8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c2237701Ci8.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c2237701Ci8.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c2237701Ci8.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2237701Ci8.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2237701Ci8.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2237701Ci8.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237701Ci8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiPackageFeature caiPackageFeature) {
            CaiPackageFeature caiPackageFeature2 = caiPackageFeature;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiPackageFeature2.feature_key) + protoAdapter.encodedSizeWithTag(2, caiPackageFeature2.feature_name) + protoAdapter.encodedSizeWithTag(3, caiPackageFeature2.producer_key) + protoAdapter.encodedSizeWithTag(4, caiPackageFeature2.producer_name) + ProtoAdapter.INT32.encodedSizeWithTag(5, caiPackageFeature2.source_type) + protoAdapter.encodedSizeWithTag(7, caiPackageFeature2.value_type) + caiPackageFeature2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiPackageFeature caiPackageFeature) {
            CaiPackageFeature caiPackageFeature2 = caiPackageFeature;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiPackageFeature2.feature_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiPackageFeature2.feature_name);
            protoAdapter.encodeWithTag(protoWriter, 3, caiPackageFeature2.producer_key);
            protoAdapter.encodeWithTag(protoWriter, 4, caiPackageFeature2.producer_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, caiPackageFeature2.source_type);
            protoAdapter.encodeWithTag(protoWriter, 7, caiPackageFeature2.value_type);
            protoWriter.writeBytes(caiPackageFeature2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String feature_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String feature_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String producer_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String producer_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 5)
    public Integer source_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 7)
    public String value_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.feature_key.hashCode()) * 37) + this.feature_name.hashCode()) * 37) + this.producer_key.hashCode()) * 37) + this.producer_name.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.value_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2237701Ci8 newBuilder() {
        C2237701Ci8 c2237701Ci8 = new C2237701Ci8();
        c2237701Ci8.LIZLLL = this.feature_key;
        c2237701Ci8.LJ = this.feature_name;
        c2237701Ci8.LJFF = this.producer_key;
        c2237701Ci8.LJI = this.producer_name;
        c2237701Ci8.LJII = this.source_type;
        c2237701Ci8.LJIIIIZZ = this.value_type;
        c2237701Ci8.addUnknownFields(unknownFields());
        return c2237701Ci8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", feature_key=");
        sb.append(this.feature_key);
        sb.append(", feature_name=");
        sb.append(this.feature_name);
        sb.append(", producer_key=");
        sb.append(this.producer_key);
        sb.append(", producer_name=");
        sb.append(this.producer_name);
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", value_type=");
        sb.append(this.value_type);
        sb.replace(0, 2, "CaiPackageFeature{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiPackageFeature)) {
            return false;
        }
        CaiPackageFeature caiPackageFeature = (CaiPackageFeature) obj;
        if (unknownFields().equals(caiPackageFeature.unknownFields()) && this.feature_key.equals(caiPackageFeature.feature_key) && this.feature_name.equals(caiPackageFeature.feature_name) && this.producer_key.equals(caiPackageFeature.producer_key) && this.producer_name.equals(caiPackageFeature.producer_name) && this.source_type.equals(caiPackageFeature.source_type) && this.value_type.equals(caiPackageFeature.value_type)) {
            return true;
        }
        return false;
    }

    public CaiPackageFeature(String str, String str2, String str3, String str4, Integer num, String str5) {
        this(str, str2, str3, str4, num, str5, ByteString.EMPTY);
    }

    public CaiPackageFeature(String str, String str2, String str3, String str4, Integer num, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_key = str;
        this.feature_name = str2;
        this.producer_key = str3;
        this.producer_name = str4;
        this.source_type = num;
        this.value_type = str5;
    }
}
