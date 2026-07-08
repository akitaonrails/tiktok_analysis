package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1C6M;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiHippoFeature;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiHippoFeature extends Message<CaiHippoFeature, C1C6M> {
    public static final ProtoAdapter<CaiHippoFeature> ADAPTER = new ProtoAdapter<CaiHippoFeature>() { // from class: X.1C6L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiHippoFeature decode(ProtoReader protoReader) {
            C1C6M c1c6m = new C1C6M();
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
                                        c1c6m.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1c6m.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c1c6m.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c6m.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1c6m.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c6m.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6m.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiHippoFeature caiHippoFeature) {
            CaiHippoFeature caiHippoFeature2 = caiHippoFeature;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiHippoFeature2.feature_key) + protoAdapter.encodedSizeWithTag(2, caiHippoFeature2.group_key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, caiHippoFeature2.platform) + protoAdapter.encodedSizeWithTag(4, caiHippoFeature2.ty) + protoAdapter2.encodedSizeWithTag(5, caiHippoFeature2.group_id) + caiHippoFeature2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiHippoFeature caiHippoFeature) {
            CaiHippoFeature caiHippoFeature2 = caiHippoFeature;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiHippoFeature2.feature_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiHippoFeature2.group_key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, caiHippoFeature2.platform);
            protoAdapter.encodeWithTag(protoWriter, 4, caiHippoFeature2.ty);
            protoAdapter2.encodeWithTag(protoWriter, 5, caiHippoFeature2.group_id);
            protoWriter.writeBytes(caiHippoFeature2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String feature_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 5)
    public Integer group_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String group_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String ty;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.feature_key.hashCode()) * 37) + this.group_key.hashCode()) * 37) + this.platform.hashCode()) * 37;
        String str = this.ty;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.group_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1C6M newBuilder() {
        C1C6M c1c6m = new C1C6M();
        c1c6m.LIZLLL = this.feature_key;
        c1c6m.LJ = this.group_key;
        c1c6m.LJFF = this.platform;
        c1c6m.LJI = this.ty;
        c1c6m.LJII = this.group_id;
        c1c6m.addUnknownFields(unknownFields());
        return c1c6m;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", feature_key=");
        sb.append(this.feature_key);
        sb.append(", group_key=");
        sb.append(this.group_key);
        sb.append(", platform=");
        sb.append(this.platform);
        if (this.ty != null) {
            sb.append(", ty=");
            sb.append(this.ty);
        }
        sb.append(", group_id=");
        sb.append(this.group_id);
        sb.replace(0, 2, "CaiHippoFeature{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiHippoFeature)) {
            return false;
        }
        CaiHippoFeature caiHippoFeature = (CaiHippoFeature) obj;
        if (unknownFields().equals(caiHippoFeature.unknownFields()) && this.feature_key.equals(caiHippoFeature.feature_key) && this.group_key.equals(caiHippoFeature.group_key) && this.platform.equals(caiHippoFeature.platform) && C1516540pZE.LJ(this.ty, caiHippoFeature.ty) && this.group_id.equals(caiHippoFeature.group_id)) {
            return true;
        }
        return false;
    }

    public CaiHippoFeature(String str, String str2, Integer num, String str3, Integer num2) {
        this(str, str2, num, str3, num2, ByteString.EMPTY);
    }

    public CaiHippoFeature(String str, String str2, Integer num, String str3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_key = str;
        this.group_key = str2;
        this.platform = num;
        this.ty = str3;
        this.group_id = num2;
    }
}
