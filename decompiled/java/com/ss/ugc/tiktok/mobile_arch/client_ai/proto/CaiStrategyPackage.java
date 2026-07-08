package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2223781C1w;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackage;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyPackage extends Message<CaiStrategyPackage, C2223781C1w> {
    public static final ProtoAdapter<CaiStrategyPackage> ADAPTER = new ProtoAdapter<CaiStrategyPackage>() { // from class: X.1C1v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyPackage decode(ProtoReader protoReader) {
            C2223781C1w c2223781C1w = new C2223781C1w();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2223781C1w.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2223781C1w.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2223781C1w.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2223781C1w.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                        case 6:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2223781C1w.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 7:
                            c2223781C1w.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2223781C1w.LJIIIIZZ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2223781C1w.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2223781C1w.LJIIJ.add(CaiStrategyPackageFeatureProducer.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2223781C1w.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223781C1w.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyPackage caiStrategyPackage) {
            CaiStrategyPackage caiStrategyPackage2 = caiStrategyPackage;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiStrategyPackage2.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, caiStrategyPackage2.engine_type) + protoAdapter2.encodedSizeWithTag(3, caiStrategyPackage2.size) + protoAdapter.encodedSizeWithTag(4, caiStrategyPackage2.md5) + protoAdapter2.encodedSizeWithTag(7, caiStrategyPackage2.content_type) + ProtoAdapter.BYTES.encodedSizeWithTag(8, caiStrategyPackage2.content) + protoAdapter.encodedSizeWithTag(9, caiStrategyPackage2.url) + CaiStrategyPackageFeatureProducer.ADAPTER.asRepeated().encodedSizeWithTag(10, caiStrategyPackage2.features) + protoAdapter2.encodedSizeWithTag(11, caiStrategyPackage2.runtime_type) + caiStrategyPackage2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyPackage caiStrategyPackage) {
            CaiStrategyPackage caiStrategyPackage2 = caiStrategyPackage;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategyPackage2.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, caiStrategyPackage2.engine_type);
            protoAdapter2.encodeWithTag(protoWriter, 3, caiStrategyPackage2.size);
            protoAdapter.encodeWithTag(protoWriter, 4, caiStrategyPackage2.md5);
            protoAdapter2.encodeWithTag(protoWriter, 7, caiStrategyPackage2.content_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 8, caiStrategyPackage2.content);
            protoAdapter.encodeWithTag(protoWriter, 9, caiStrategyPackage2.url);
            CaiStrategyPackageFeatureProducer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, caiStrategyPackage2.features);
            protoAdapter2.encodeWithTag(protoWriter, 11, caiStrategyPackage2.runtime_type);
            protoWriter.writeBytes(caiStrategyPackage2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 8)
    public ByteString content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer engine_type;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageFeatureProducer#ADAPTER", label = WireField.Label.REPEATED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public List<CaiStrategyPackageFeatureProducer> features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String md5;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = BdTuring.TYPE_EMAIL)
    public Integer runtime_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public String url;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.engine_type.hashCode()) * 37;
        Integer num = this.size;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.md5;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num2 = this.content_type;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        ByteString byteString = this.content;
        int iHashCode5 = (iHashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str2 = this.url;
        int iHashCode6 = (((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.features.hashCode()) * 37;
        Integer num3 = this.runtime_type;
        int iHashCode7 = iHashCode6 + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2223781C1w newBuilder() {
        C2223781C1w c2223781C1w = new C2223781C1w();
        c2223781C1w.LIZLLL = this.id;
        c2223781C1w.LJ = this.engine_type;
        c2223781C1w.LJFF = this.size;
        c2223781C1w.LJI = this.md5;
        c2223781C1w.LJII = this.content_type;
        c2223781C1w.LJIIIIZZ = this.content;
        c2223781C1w.LJIIIZ = this.url;
        c2223781C1w.LJIIJ = C1516540pZE.LIZJ("features", this.features);
        c2223781C1w.LJIIJJI = this.runtime_type;
        c2223781C1w.addUnknownFields(unknownFields());
        return c2223781C1w;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", engine_type=");
        sb.append(this.engine_type);
        if (this.size != null) {
            sb.append(", size=");
            sb.append(this.size);
        }
        if (this.md5 != null) {
            sb.append(", md5=");
            sb.append(this.md5);
        }
        if (this.content_type != null) {
            sb.append(", content_type=");
            sb.append(this.content_type);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (!this.features.isEmpty()) {
            sb.append(", features=");
            sb.append(this.features);
        }
        if (this.runtime_type != null) {
            sb.append(", runtime_type=");
            sb.append(this.runtime_type);
        }
        sb.replace(0, 2, "CaiStrategyPackage{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyPackage)) {
            return false;
        }
        CaiStrategyPackage caiStrategyPackage = (CaiStrategyPackage) obj;
        if (unknownFields().equals(caiStrategyPackage.unknownFields()) && this.id.equals(caiStrategyPackage.id) && this.engine_type.equals(caiStrategyPackage.engine_type) && C1516540pZE.LJ(this.size, caiStrategyPackage.size) && C1516540pZE.LJ(this.md5, caiStrategyPackage.md5) && C1516540pZE.LJ(this.content_type, caiStrategyPackage.content_type) && C1516540pZE.LJ(this.content, caiStrategyPackage.content) && C1516540pZE.LJ(this.url, caiStrategyPackage.url) && this.features.equals(caiStrategyPackage.features) && C1516540pZE.LJ(this.runtime_type, caiStrategyPackage.runtime_type)) {
            return true;
        }
        return false;
    }

    public CaiStrategyPackage(String str, Integer num, Integer num2, String str2, Integer num3, ByteString byteString, String str3, List<CaiStrategyPackageFeatureProducer> list, Integer num4) {
        this(str, num, num2, str2, num3, byteString, str3, list, num4, ByteString.EMPTY);
    }

    public CaiStrategyPackage(String str, Integer num, Integer num2, String str2, Integer num3, ByteString byteString, String str3, List<CaiStrategyPackageFeatureProducer> list, Integer num4, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.id = str;
        this.engine_type = num;
        this.size = num2;
        this.md5 = str2;
        this.content_type = num3;
        this.content = byteString;
        this.url = str3;
        this.features = C1516540pZE.LJFF("features", list);
        this.runtime_type = num4;
    }
}
