package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2237801CiI;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureItem;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTemplateItem;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiFeatureItem extends Message<CaiFeatureItem, C2237801CiI> {
    public static final ProtoAdapter<CaiFeatureItem> ADAPTER = new ProtoAdapter<CaiFeatureItem>() { // from class: X.1CiH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureItem decode(ProtoReader protoReader) {
            C2237801CiI c2237801CiI = new C2237801CiI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2237801CiI.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2237801CiI.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2237801CiI.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2237801CiI.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2237801CiI.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2237801CiI.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2237801CiI.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2237801CiI.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2237801CiI.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2237801CiI.LJIIL.add(CaiAppVersion.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2237801CiI.LJIILIIL.add(CaiFeatureTemplateItem.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2237801CiI.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2237801CiI.LJIILL.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            c2237801CiI.LJIILLIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                    c2237801CiI.LJIIZILJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 51:
                                    c2237801CiI.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 52:
                                    c2237801CiI.LJIJI = CaiFeatureTTMRule.ADAPTER.decode(protoReader);
                                    break;
                                case 53:
                                    c2237801CiI.LJIJJ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 54:
                                    c2237801CiI.LJIJJLI = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 55:
                                    c2237801CiI.LJIL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 56:
                                    c2237801CiI.LJJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 57:
                                    c2237801CiI.LJJI.add(CaiAppVersion.ADAPTER.decode(protoReader));
                                    break;
                                default:
                                    switch (iNextTag) {
                                        case 252:
                                            c2237801CiI.LJJIFFI = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 253:
                                            c2237801CiI.LJJII = ProtoAdapter.INT64.decode(protoReader);
                                            break;
                                        case 254:
                                            c2237801CiI.LJJIII.add(CaiTag.ADAPTER.decode(protoReader));
                                            break;
                                        case 255:
                                            c2237801CiI.LJJIIJ = CaiManager.ADAPTER.decode(protoReader);
                                            break;
                                        default:
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2237801CiI.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237801CiI.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureItem caiFeatureItem) {
            CaiFeatureItem caiFeatureItem2 = caiFeatureItem;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, caiFeatureItem2.feature_key) + protoAdapter.encodedSizeWithTag(2, caiFeatureItem2.feature_name) + protoAdapter.encodedSizeWithTag(3, caiFeatureItem2.producer_key) + protoAdapter.encodedSizeWithTag(4, caiFeatureItem2.producer_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, caiFeatureItem2.feature_type) + protoAdapter2.encodedSizeWithTag(6, caiFeatureItem2.source_type) + protoAdapter2.encodedSizeWithTag(7, caiFeatureItem2.feature_status) + protoAdapter.encodedSizeWithTag(8, caiFeatureItem2.value_type) + protoAdapter.encodedSizeWithTag(9, caiFeatureItem2.feature_description);
            ProtoAdapter<CaiAppVersion> protoAdapter3 = CaiAppVersion.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(10, caiFeatureItem2.app_versions) + CaiFeatureTemplateItem.ADAPTER.asRepeated().encodedSizeWithTag(11, caiFeatureItem2.templates) + protoAdapter2.encodedSizeWithTag(12, caiFeatureItem2.privacy_level) + protoAdapter.asRepeated().encodedSizeWithTag(13, caiFeatureItem2.privacy_ids) + protoAdapter2.encodedSizeWithTag(14, caiFeatureItem2.effective_crowd) + protoAdapter.encodedSizeWithTag(50, caiFeatureItem2.ttm_version_key) + protoAdapter2.encodedSizeWithTag(51, caiFeatureItem2.ttm_type) + CaiFeatureTTMRule.ADAPTER.encodedSizeWithTag(52, caiFeatureItem2.ttm_rule) + protoAdapter2.encodedSizeWithTag(53, caiFeatureItem2.ttm_strategy_status) + protoAdapter2.encodedSizeWithTag(54, caiFeatureItem2.gray_limit) + protoAdapter.encodedSizeWithTag(55, caiFeatureItem2.code_gen_input) + protoAdapter.encodedSizeWithTag(56, caiFeatureItem2.psp_url_path) + protoAdapter3.asRepeated().encodedSizeWithTag(57, caiFeatureItem2.ttm_app_versions);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(252, caiFeatureItem2.created_timestamp) + protoAdapter4.encodedSizeWithTag(253, caiFeatureItem2.updated_timestamp) + CaiTag.ADAPTER.asRepeated().encodedSizeWithTag(254, caiFeatureItem2.tags) + CaiManager.ADAPTER.encodedSizeWithTag(255, caiFeatureItem2.manage) + caiFeatureItem2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureItem caiFeatureItem) {
            CaiFeatureItem caiFeatureItem2 = caiFeatureItem;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureItem2.feature_key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiFeatureItem2.feature_name);
            protoAdapter.encodeWithTag(protoWriter, 3, caiFeatureItem2.producer_key);
            protoAdapter.encodeWithTag(protoWriter, 4, caiFeatureItem2.producer_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 5, caiFeatureItem2.feature_type);
            protoAdapter2.encodeWithTag(protoWriter, 6, caiFeatureItem2.source_type);
            protoAdapter2.encodeWithTag(protoWriter, 7, caiFeatureItem2.feature_status);
            protoAdapter.encodeWithTag(protoWriter, 8, caiFeatureItem2.value_type);
            protoAdapter.encodeWithTag(protoWriter, 9, caiFeatureItem2.feature_description);
            ProtoAdapter<CaiAppVersion> protoAdapter3 = CaiAppVersion.ADAPTER;
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 10, caiFeatureItem2.app_versions);
            CaiFeatureTemplateItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, caiFeatureItem2.templates);
            protoAdapter2.encodeWithTag(protoWriter, 12, caiFeatureItem2.privacy_level);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, caiFeatureItem2.privacy_ids);
            protoAdapter2.encodeWithTag(protoWriter, 14, caiFeatureItem2.effective_crowd);
            protoAdapter.encodeWithTag(protoWriter, 50, caiFeatureItem2.ttm_version_key);
            protoAdapter2.encodeWithTag(protoWriter, 51, caiFeatureItem2.ttm_type);
            CaiFeatureTTMRule.ADAPTER.encodeWithTag(protoWriter, 52, caiFeatureItem2.ttm_rule);
            protoAdapter2.encodeWithTag(protoWriter, 53, caiFeatureItem2.ttm_strategy_status);
            protoAdapter2.encodeWithTag(protoWriter, 54, caiFeatureItem2.gray_limit);
            protoAdapter.encodeWithTag(protoWriter, 55, caiFeatureItem2.code_gen_input);
            protoAdapter.encodeWithTag(protoWriter, 56, caiFeatureItem2.psp_url_path);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 57, caiFeatureItem2.ttm_app_versions);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            protoAdapter4.encodeWithTag(protoWriter, 252, caiFeatureItem2.created_timestamp);
            protoAdapter4.encodeWithTag(protoWriter, 253, caiFeatureItem2.updated_timestamp);
            CaiTag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 254, caiFeatureItem2.tags);
            CaiManager.ADAPTER.encodeWithTag(protoWriter, 255, caiFeatureItem2.manage);
            protoWriter.writeBytes(caiFeatureItem2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public List<CaiAppVersion> app_versions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 55)
    public String code_gen_input;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 252)
    public Long created_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 14)
    public Integer effective_crowd;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public String feature_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String feature_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String feature_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 7)
    public Integer feature_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 5)
    public Integer feature_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 54)
    public Integer gray_limit;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiManager#ADAPTER", tag = 255)
    public CaiManager manage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = BdTuring.TYPE_SMS_VOICE)
    public List<String> privacy_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public Integer privacy_level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String producer_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String producer_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 56)
    public String psp_url_path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 6)
    public Integer source_type;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiTag#ADAPTER", label = WireField.Label.REPEATED, tag = 254)
    public List<CaiTag> tags;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTemplateItem#ADAPTER", label = WireField.Label.REPEATED, tag = BdTuring.TYPE_EMAIL)
    public List<CaiFeatureTemplateItem> templates;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAppVersion#ADAPTER", label = WireField.Label.REPEATED, tag = 57)
    public List<CaiAppVersion> ttm_app_versions;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMRule#ADAPTER", tag = 52)
    public CaiFeatureTTMRule ttm_rule;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 53)
    public Integer ttm_strategy_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 51)
    public Integer ttm_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BaseNotice.RECOMMEND_LIVE)
    public String ttm_version_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 253)
    public Long updated_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 8)
    public String value_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.feature_key.hashCode()) * 37) + this.feature_name.hashCode()) * 37) + this.producer_key.hashCode()) * 37) + this.producer_name.hashCode()) * 37) + this.feature_type.hashCode()) * 37) + this.source_type.hashCode()) * 37) + this.feature_status.hashCode()) * 37) + this.value_type.hashCode()) * 37) + this.feature_description.hashCode()) * 37) + this.app_versions.hashCode()) * 37) + this.templates.hashCode()) * 37) + this.privacy_level.hashCode()) * 37) + this.privacy_ids.hashCode()) * 37) + this.effective_crowd.hashCode()) * 37;
        String str = this.ttm_version_key;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.ttm_type;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        CaiFeatureTTMRule caiFeatureTTMRule = this.ttm_rule;
        int iHashCode4 = (iHashCode3 + (caiFeatureTTMRule != null ? caiFeatureTTMRule.hashCode() : 0)) * 37;
        Integer num2 = this.ttm_strategy_status;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.gray_limit;
        int iHashCode6 = (iHashCode5 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str2 = this.code_gen_input;
        int iHashCode7 = (iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.psp_url_path;
        int iHashCode8 = (((((((((iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.ttm_app_versions.hashCode()) * 37) + this.created_timestamp.hashCode()) * 37) + this.updated_timestamp.hashCode()) * 37) + this.tags.hashCode()) * 37;
        CaiManager caiManager = this.manage;
        int iHashCode9 = iHashCode8 + (caiManager != null ? caiManager.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public C2237801CiI newBuilder() {
        C2237801CiI c2237801CiI = new C2237801CiI();
        c2237801CiI.LIZLLL = this.feature_key;
        c2237801CiI.LJ = this.feature_name;
        c2237801CiI.LJFF = this.producer_key;
        c2237801CiI.LJI = this.producer_name;
        c2237801CiI.LJII = this.feature_type;
        c2237801CiI.LJIIIIZZ = this.source_type;
        c2237801CiI.LJIIIZ = this.feature_status;
        c2237801CiI.LJIIJ = this.value_type;
        c2237801CiI.LJIIJJI = this.feature_description;
        c2237801CiI.LJIIL = C1516540pZE.LIZJ("app_versions", this.app_versions);
        c2237801CiI.LJIILIIL = C1516540pZE.LIZJ("templates", this.templates);
        c2237801CiI.LJIILJJIL = this.privacy_level;
        c2237801CiI.LJIILL = C1516540pZE.LIZJ("privacy_ids", this.privacy_ids);
        c2237801CiI.LJIILLIIL = this.effective_crowd;
        c2237801CiI.LJIIZILJ = this.ttm_version_key;
        c2237801CiI.LJIJ = this.ttm_type;
        c2237801CiI.LJIJI = this.ttm_rule;
        c2237801CiI.LJIJJ = this.ttm_strategy_status;
        c2237801CiI.LJIJJLI = this.gray_limit;
        c2237801CiI.LJIL = this.code_gen_input;
        c2237801CiI.LJJ = this.psp_url_path;
        c2237801CiI.LJJI = C1516540pZE.LIZJ("ttm_app_versions", this.ttm_app_versions);
        c2237801CiI.LJJIFFI = this.created_timestamp;
        c2237801CiI.LJJII = this.updated_timestamp;
        c2237801CiI.LJJIII = C1516540pZE.LIZJ("tags", this.tags);
        c2237801CiI.LJJIIJ = this.manage;
        c2237801CiI.addUnknownFields(unknownFields());
        return c2237801CiI;
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
        sb.append(", feature_type=");
        sb.append(this.feature_type);
        sb.append(", source_type=");
        sb.append(this.source_type);
        sb.append(", feature_status=");
        sb.append(this.feature_status);
        sb.append(", value_type=");
        sb.append(this.value_type);
        sb.append(", feature_description=");
        sb.append(this.feature_description);
        if (!this.app_versions.isEmpty()) {
            sb.append(", app_versions=");
            sb.append(this.app_versions);
        }
        if (!this.templates.isEmpty()) {
            sb.append(", templates=");
            sb.append(this.templates);
        }
        sb.append(", privacy_level=");
        sb.append(this.privacy_level);
        if (!this.privacy_ids.isEmpty()) {
            sb.append(", privacy_ids=");
            sb.append(this.privacy_ids);
        }
        sb.append(", effective_crowd=");
        sb.append(this.effective_crowd);
        if (this.ttm_version_key != null) {
            sb.append(", ttm_version_key=");
            sb.append(this.ttm_version_key);
        }
        if (this.ttm_type != null) {
            sb.append(", ttm_type=");
            sb.append(this.ttm_type);
        }
        if (this.ttm_rule != null) {
            sb.append(", ttm_rule=");
            sb.append(this.ttm_rule);
        }
        if (this.ttm_strategy_status != null) {
            sb.append(", ttm_strategy_status=");
            sb.append(this.ttm_strategy_status);
        }
        if (this.gray_limit != null) {
            sb.append(", gray_limit=");
            sb.append(this.gray_limit);
        }
        if (this.code_gen_input != null) {
            sb.append(", code_gen_input=");
            sb.append(this.code_gen_input);
        }
        if (this.psp_url_path != null) {
            sb.append(", psp_url_path=");
            sb.append(this.psp_url_path);
        }
        if (!this.ttm_app_versions.isEmpty()) {
            sb.append(", ttm_app_versions=");
            sb.append(this.ttm_app_versions);
        }
        sb.append(", created_timestamp=");
        sb.append(this.created_timestamp);
        sb.append(", updated_timestamp=");
        sb.append(this.updated_timestamp);
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        if (this.manage != null) {
            sb.append(", manage=");
            sb.append(this.manage);
        }
        sb.replace(0, 2, "CaiFeatureItem{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureItem)) {
            return false;
        }
        CaiFeatureItem caiFeatureItem = (CaiFeatureItem) obj;
        if (unknownFields().equals(caiFeatureItem.unknownFields()) && this.feature_key.equals(caiFeatureItem.feature_key) && this.feature_name.equals(caiFeatureItem.feature_name) && this.producer_key.equals(caiFeatureItem.producer_key) && this.producer_name.equals(caiFeatureItem.producer_name) && this.feature_type.equals(caiFeatureItem.feature_type) && this.source_type.equals(caiFeatureItem.source_type) && this.feature_status.equals(caiFeatureItem.feature_status) && this.value_type.equals(caiFeatureItem.value_type) && this.feature_description.equals(caiFeatureItem.feature_description) && this.app_versions.equals(caiFeatureItem.app_versions) && this.templates.equals(caiFeatureItem.templates) && this.privacy_level.equals(caiFeatureItem.privacy_level) && this.privacy_ids.equals(caiFeatureItem.privacy_ids) && this.effective_crowd.equals(caiFeatureItem.effective_crowd) && C1516540pZE.LJ(this.ttm_version_key, caiFeatureItem.ttm_version_key) && C1516540pZE.LJ(this.ttm_type, caiFeatureItem.ttm_type) && C1516540pZE.LJ(this.ttm_rule, caiFeatureItem.ttm_rule) && C1516540pZE.LJ(this.ttm_strategy_status, caiFeatureItem.ttm_strategy_status) && C1516540pZE.LJ(this.gray_limit, caiFeatureItem.gray_limit) && C1516540pZE.LJ(this.code_gen_input, caiFeatureItem.code_gen_input) && C1516540pZE.LJ(this.psp_url_path, caiFeatureItem.psp_url_path) && this.ttm_app_versions.equals(caiFeatureItem.ttm_app_versions) && this.created_timestamp.equals(caiFeatureItem.created_timestamp) && this.updated_timestamp.equals(caiFeatureItem.updated_timestamp) && this.tags.equals(caiFeatureItem.tags) && C1516540pZE.LJ(this.manage, caiFeatureItem.manage)) {
            return true;
        }
        return false;
    }

    public CaiFeatureItem(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, String str5, String str6, List<CaiAppVersion> list, List<CaiFeatureTemplateItem> list2, Integer num4, List<String> list3, Integer num5, String str7, Integer num6, CaiFeatureTTMRule caiFeatureTTMRule, Integer num7, Integer num8, String str8, String str9, List<CaiAppVersion> list4, Long l, Long l2, List<CaiTag> list5, CaiManager caiManager) {
        this(str, str2, str3, str4, num, num2, num3, str5, str6, list, list2, num4, list3, num5, str7, num6, caiFeatureTTMRule, num7, num8, str8, str9, list4, l, l2, list5, caiManager, ByteString.EMPTY);
    }

    public CaiFeatureItem(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, String str5, String str6, List<CaiAppVersion> list, List<CaiFeatureTemplateItem> list2, Integer num4, List<String> list3, Integer num5, String str7, Integer num6, CaiFeatureTTMRule caiFeatureTTMRule, Integer num7, Integer num8, String str8, String str9, List<CaiAppVersion> list4, Long l, Long l2, List<CaiTag> list5, CaiManager caiManager, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_key = str;
        this.feature_name = str2;
        this.producer_key = str3;
        this.producer_name = str4;
        this.feature_type = num;
        this.source_type = num2;
        this.feature_status = num3;
        this.value_type = str5;
        this.feature_description = str6;
        this.app_versions = C1516540pZE.LJFF("app_versions", list);
        this.templates = C1516540pZE.LJFF("templates", list2);
        this.privacy_level = num4;
        this.privacy_ids = C1516540pZE.LJFF("privacy_ids", list3);
        this.effective_crowd = num5;
        this.ttm_version_key = str7;
        this.ttm_type = num6;
        this.ttm_rule = caiFeatureTTMRule;
        this.ttm_strategy_status = num7;
        this.gray_limit = num8;
        this.code_gen_input = str8;
        this.psp_url_path = str9;
        this.ttm_app_versions = C1516540pZE.LJFF("ttm_app_versions", list4);
        this.created_timestamp = l;
        this.updated_timestamp = l2;
        this.tags = C1516540pZE.LJFF("tags", list5);
        this.manage = caiManager;
    }
}
