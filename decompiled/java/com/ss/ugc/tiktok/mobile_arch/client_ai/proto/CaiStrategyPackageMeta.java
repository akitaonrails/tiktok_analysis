package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237641Ci2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiPackageFeature;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawInput;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageMeta;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyPackageMeta extends Message<CaiStrategyPackageMeta, C2237641Ci2> {
    public static final ProtoAdapter<CaiStrategyPackageMeta> ADAPTER = new ProtoAdapter<CaiStrategyPackageMeta>() { // from class: X.1Ci1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyPackageMeta decode(ProtoReader protoReader) {
            C2237641Ci2 c2237641Ci2 = new C2237641Ci2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 7) {
                                        if (iNextTag != 250) {
                                            switch (iNextTag) {
                                                case BdTuring.TYPE_ECAF /* 9 */:
                                                    c2237641Ci2.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                    c2237641Ci2.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                    c2237641Ci2.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                    c2237641Ci2.LJIIJJI.add(CaiPackageFeature.ADAPTER.decode(protoReader));
                                                    break;
                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                    c2237641Ci2.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                                                    break;
                                                case 14:
                                                    c2237641Ci2.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 15:
                                                    c2237641Ci2.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                                                    break;
                                                default:
                                                    switch (iNextTag) {
                                                        case 252:
                                                            c2237641Ci2.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                                                            break;
                                                        case 253:
                                                            c2237641Ci2.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                                                            break;
                                                        case 254:
                                                            c2237641Ci2.LJIJ.add(CaiTag.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 255:
                                                            c2237641Ci2.LJIJI = CaiManager.ADAPTER.decode(protoReader);
                                                            break;
                                                        default:
                                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                            c2237641Ci2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                            break;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            c2237641Ci2.LJIILL = CaiRawInput.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2237641Ci2.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c2237641Ci2.LJI.add(CaiAppVersion.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c2237641Ci2.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2237641Ci2.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2237641Ci2.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237641Ci2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyPackageMeta caiStrategyPackageMeta) {
            CaiStrategyPackageMeta caiStrategyPackageMeta2 = caiStrategyPackageMeta;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiStrategyPackageMeta2.key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, caiStrategyPackageMeta2.engine_type) + protoAdapter.encodedSizeWithTag(3, caiStrategyPackageMeta2.md5) + CaiAppVersion.ADAPTER.asRepeated().encodedSizeWithTag(4, caiStrategyPackageMeta2.app_version) + protoAdapter2.encodedSizeWithTag(7, caiStrategyPackageMeta2.content_type) + protoAdapter.encodedSizeWithTag(9, caiStrategyPackageMeta2.url) + protoAdapter.encodedSizeWithTag(10, caiStrategyPackageMeta2.raw_content_json) + protoAdapter.encodedSizeWithTag(11, caiStrategyPackageMeta2.code_gen_input) + CaiPackageFeature.ADAPTER.asRepeated().encodedSizeWithTag(12, caiStrategyPackageMeta2.features) + ProtoAdapter.BOOL.encodedSizeWithTag(13, caiStrategyPackageMeta2.editable) + protoAdapter.encodedSizeWithTag(14, caiStrategyPackageMeta2.cuid) + protoAdapter2.encodedSizeWithTag(15, caiStrategyPackageMeta2.unstable_type) + CaiRawInput.ADAPTER.encodedSizeWithTag(250, caiStrategyPackageMeta2.dummy);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(252, caiStrategyPackageMeta2.created_timestamp) + protoAdapter3.encodedSizeWithTag(253, caiStrategyPackageMeta2.updated_timestamp) + CaiTag.ADAPTER.asRepeated().encodedSizeWithTag(254, caiStrategyPackageMeta2.tags) + CaiManager.ADAPTER.encodedSizeWithTag(255, caiStrategyPackageMeta2.manage) + caiStrategyPackageMeta2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyPackageMeta caiStrategyPackageMeta) {
            CaiStrategyPackageMeta caiStrategyPackageMeta2 = caiStrategyPackageMeta;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategyPackageMeta2.key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, caiStrategyPackageMeta2.engine_type);
            protoAdapter.encodeWithTag(protoWriter, 3, caiStrategyPackageMeta2.md5);
            CaiAppVersion.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, caiStrategyPackageMeta2.app_version);
            protoAdapter2.encodeWithTag(protoWriter, 7, caiStrategyPackageMeta2.content_type);
            protoAdapter.encodeWithTag(protoWriter, 9, caiStrategyPackageMeta2.url);
            protoAdapter.encodeWithTag(protoWriter, 10, caiStrategyPackageMeta2.raw_content_json);
            protoAdapter.encodeWithTag(protoWriter, 11, caiStrategyPackageMeta2.code_gen_input);
            CaiPackageFeature.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, caiStrategyPackageMeta2.features);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, caiStrategyPackageMeta2.editable);
            protoAdapter.encodeWithTag(protoWriter, 14, caiStrategyPackageMeta2.cuid);
            protoAdapter2.encodeWithTag(protoWriter, 15, caiStrategyPackageMeta2.unstable_type);
            CaiRawInput.ADAPTER.encodeWithTag(protoWriter, 250, caiStrategyPackageMeta2.dummy);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 252, caiStrategyPackageMeta2.created_timestamp);
            protoAdapter3.encodeWithTag(protoWriter, 253, caiStrategyPackageMeta2.updated_timestamp);
            CaiTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 254, caiStrategyPackageMeta2.tags);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 255, caiStrategyPackageMeta2.manage);
            protoWriter.writeBytes(caiStrategyPackageMeta2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public List<CaiAppVersion> app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_EMAIL)
    public String code_gen_input;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public Integer content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 252)
    public Long created_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public String cuid;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiRawInput#ADAPTER", tag = 250)
    public CaiRawInput dummy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = BdTuring.TYPE_SMS_VOICE)
    public Boolean editable;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer engine_type;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiPackageFeature#ADAPTER", label = WireField.Label.REPEATED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public List<CaiPackageFeature> features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String key;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 255)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String md5;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public String raw_content_json;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag#ADAPTER", label = WireField.Label.REPEATED, tag = 254)
    public List<CaiTag> tags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 15)
    public Integer unstable_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 253)
    public Long updated_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public String url;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.engine_type.hashCode()) * 37;
        String str = this.md5;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.app_version.hashCode()) * 37;
        Integer num = this.content_type;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.url;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.raw_content_json;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.code_gen_input;
        int iHashCode6 = (((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.features.hashCode()) * 37;
        Boolean bool = this.editable;
        int iHashCode7 = (iHashCode6 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str5 = this.cuid;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num2 = this.unstable_type;
        int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 37;
        CaiRawInput caiRawInput = this.dummy;
        int iHashCode10 = (iHashCode9 + (caiRawInput != null ? caiRawInput.hashCode() : 0)) * 37;
        Long l = this.created_timestamp;
        int iHashCode11 = (iHashCode10 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.updated_timestamp;
        int iHashCode12 = (((iHashCode11 + (l2 != null ? l2.hashCode() : 0)) * 37) + this.tags.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode13 = iHashCode12 + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    @Override // com.squareup.wire.Message
    public C2237641Ci2 newBuilder() {
        C2237641Ci2 c2237641Ci2 = new C2237641Ci2();
        c2237641Ci2.LIZLLL = this.key;
        c2237641Ci2.LJ = this.engine_type;
        c2237641Ci2.LJFF = this.md5;
        c2237641Ci2.LJI = C1516540pZE.LIZJ("app_version", this.app_version);
        c2237641Ci2.LJII = this.content_type;
        c2237641Ci2.LJIIIIZZ = this.url;
        c2237641Ci2.LJIIIZ = this.raw_content_json;
        c2237641Ci2.LJIIJ = this.code_gen_input;
        c2237641Ci2.LJIIJJI = C1516540pZE.LIZJ("features", this.features);
        c2237641Ci2.LJIIL = this.editable;
        c2237641Ci2.LJIILIIL = this.cuid;
        c2237641Ci2.LJIILJJIL = this.unstable_type;
        c2237641Ci2.LJIILL = this.dummy;
        c2237641Ci2.LJIILLIIL = this.created_timestamp;
        c2237641Ci2.LJIIZILJ = this.updated_timestamp;
        c2237641Ci2.LJIJ = C1516540pZE.LIZJ("tags", this.tags);
        c2237641Ci2.LJIJI = this.manage;
        c2237641Ci2.addUnknownFields(unknownFields());
        return c2237641Ci2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", engine_type=");
        sb.append(this.engine_type);
        if (this.md5 != null) {
            sb.append(", md5=");
            sb.append(this.md5);
        }
        if (!this.app_version.isEmpty()) {
            sb.append(", app_version=");
            sb.append(this.app_version);
        }
        if (this.content_type != null) {
            sb.append(", content_type=");
            sb.append(this.content_type);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.raw_content_json != null) {
            sb.append(", raw_content_json=");
            sb.append(this.raw_content_json);
        }
        if (this.code_gen_input != null) {
            sb.append(", code_gen_input=");
            sb.append(this.code_gen_input);
        }
        if (!this.features.isEmpty()) {
            sb.append(", features=");
            sb.append(this.features);
        }
        if (this.editable != null) {
            sb.append(", editable=");
            sb.append(this.editable);
        }
        if (this.cuid != null) {
            sb.append(", cuid=");
            sb.append(this.cuid);
        }
        if (this.unstable_type != null) {
            sb.append(", unstable_type=");
            sb.append(this.unstable_type);
        }
        if (this.dummy != null) {
            sb.append(", dummy=");
            sb.append(this.dummy);
        }
        if (this.created_timestamp != null) {
            sb.append(", created_timestamp=");
            sb.append(this.created_timestamp);
        }
        if (this.updated_timestamp != null) {
            sb.append(", updated_timestamp=");
            sb.append(this.updated_timestamp);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.replace(0, 2, "CaiStrategyPackageMeta{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyPackageMeta)) {
            return false;
        }
        CaiStrategyPackageMeta caiStrategyPackageMeta = (CaiStrategyPackageMeta) obj;
        if (unknownFields().equals(caiStrategyPackageMeta.unknownFields()) && this.key.equals(caiStrategyPackageMeta.key) && this.engine_type.equals(caiStrategyPackageMeta.engine_type) && C1516540pZE.LJ(this.md5, caiStrategyPackageMeta.md5) && this.app_version.equals(caiStrategyPackageMeta.app_version) && C1516540pZE.LJ(this.content_type, caiStrategyPackageMeta.content_type) && C1516540pZE.LJ(this.url, caiStrategyPackageMeta.url) && C1516540pZE.LJ(this.raw_content_json, caiStrategyPackageMeta.raw_content_json) && C1516540pZE.LJ(this.code_gen_input, caiStrategyPackageMeta.code_gen_input) && this.features.equals(caiStrategyPackageMeta.features) && C1516540pZE.LJ(this.editable, caiStrategyPackageMeta.editable) && C1516540pZE.LJ(this.cuid, caiStrategyPackageMeta.cuid) && C1516540pZE.LJ(this.unstable_type, caiStrategyPackageMeta.unstable_type) && C1516540pZE.LJ(this.dummy, caiStrategyPackageMeta.dummy) && C1516540pZE.LJ(this.created_timestamp, caiStrategyPackageMeta.created_timestamp) && C1516540pZE.LJ(this.updated_timestamp, caiStrategyPackageMeta.updated_timestamp) && this.tags.equals(caiStrategyPackageMeta.tags) && C1516540pZE.LJ(this.manage, caiStrategyPackageMeta.manage)) {
            return true;
        }
        return false;
    }

    public CaiStrategyPackageMeta(String str, Integer num, String str2, List<CaiAppVersion> list, Integer num2, String str3, String str4, String str5, List<CaiPackageFeature> list2, Boolean bool, String str6, Integer num3, CaiRawInput caiRawInput, Long l, Long l2, List<CaiTag> list3, CaiManager caiManager) {
        this(str, num, str2, list, num2, str3, str4, str5, list2, bool, str6, num3, caiRawInput, l, l2, list3, caiManager, ByteString.EMPTY);
    }

    public CaiStrategyPackageMeta(String str, Integer num, String str2, List<CaiAppVersion> list, Integer num2, String str3, String str4, String str5, List<CaiPackageFeature> list2, Boolean bool, String str6, Integer num3, CaiRawInput caiRawInput, Long l, Long l2, List<CaiTag> list3, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.engine_type = num;
        this.md5 = str2;
        this.app_version = C1516540pZE.LJFF("app_version", list);
        this.content_type = num2;
        this.url = str3;
        this.raw_content_json = str4;
        this.code_gen_input = str5;
        this.features = C1516540pZE.LJFF("features", list2);
        this.editable = bool;
        this.cuid = str6;
        this.unstable_type = num3;
        this.dummy = caiRawInput;
        this.created_timestamp = l;
        this.updated_timestamp = l2;
        this.tags = C1516540pZE.LJFF("tags", list3);
        this.manage = caiManager;
    }
}
