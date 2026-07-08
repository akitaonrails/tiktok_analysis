package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C2223131Bzj;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionStoreValueToFeatureCenter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiActionStoreValueToFeatureCenter extends Message<CaiActionStoreValueToFeatureCenter, C2223131Bzj> {
    public static final ProtoAdapter<CaiActionStoreValueToFeatureCenter> ADAPTER = new ProtoAdapter<CaiActionStoreValueToFeatureCenter>() { // from class: X.1Bzi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiActionStoreValueToFeatureCenter decode(ProtoReader protoReader) {
            C2223131Bzj c2223131Bzj = new C2223131Bzj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2223131Bzj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2223131Bzj.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2223131Bzj.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223131Bzj.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223131Bzj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter) {
            CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter2 = caiActionStoreValueToFeatureCenter;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, caiActionStoreValueToFeatureCenter2.source_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, caiActionStoreValueToFeatureCenter2.producer_key) + protoAdapter.encodedSizeWithTag(3, caiActionStoreValueToFeatureCenter2.feature_key) + caiActionStoreValueToFeatureCenter2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter) {
            CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter2 = caiActionStoreValueToFeatureCenter;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, caiActionStoreValueToFeatureCenter2.source_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, caiActionStoreValueToFeatureCenter2.producer_key);
            protoAdapter.encodeWithTag(protoWriter, 3, caiActionStoreValueToFeatureCenter2.feature_key);
            protoWriter.writeBytes(caiActionStoreValueToFeatureCenter2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String feature_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String producer_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer source_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.source_type.hashCode()) * 37) + this.producer_key.hashCode()) * 37) + this.feature_key.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2223131Bzj newBuilder() {
        C2223131Bzj c2223131Bzj = new C2223131Bzj();
        c2223131Bzj.LIZLLL = this.source_type;
        c2223131Bzj.LJ = this.producer_key;
        c2223131Bzj.LJFF = this.feature_key;
        c2223131Bzj.addUnknownFields(unknownFields());
        return c2223131Bzj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", producer_key=");
        sb.append(this.producer_key);
        sb.append(", feature_key=");
        sb.append(this.feature_key);
        sb.replace(0, 2, "CaiActionStoreValueToFeatureCenter{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiActionStoreValueToFeatureCenter)) {
            return false;
        }
        CaiActionStoreValueToFeatureCenter caiActionStoreValueToFeatureCenter = (CaiActionStoreValueToFeatureCenter) obj;
        if (unknownFields().equals(caiActionStoreValueToFeatureCenter.unknownFields()) && this.source_type.equals(caiActionStoreValueToFeatureCenter.source_type) && this.producer_key.equals(caiActionStoreValueToFeatureCenter.producer_key) && this.feature_key.equals(caiActionStoreValueToFeatureCenter.feature_key)) {
            return true;
        }
        return false;
    }

    public CaiActionStoreValueToFeatureCenter(Integer num, String str, String str2) {
        this(num, str, str2, ByteString.EMPTY);
    }

    public CaiActionStoreValueToFeatureCenter(Integer num, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_type = num;
        this.producer_key = str;
        this.feature_key = str2;
    }
}
