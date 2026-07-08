package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CS;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.TemplateEffectExtra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class BusinessExtra implements Serializable, Parcelable {
    public static final Parcelable.Creator<BusinessExtra> CREATOR = new Creator();

    @C09CT("ad_raw_data")
    public final String ad_raw_data;

    @C09CT("album_effect_info")
    public final AlbumEffectInfo album_effect_info;

    @C09CT("anchor_name")
    public String anchor_name;

    @C09CT("aspect_ratio")
    public final String aspect_ratio;

    @C09CT("asset_extra")
    public final String asset_extra;

    @C09CT("asset_from")
    public Integer asset_from;

    @C09CT("bind_ids")
    public final List<String> bind_ids;

    @C09CT("tags")
    public final List<String> biz_tags;

    @C09CT("celebration")
    public final CelebrationInfo celebration;

    @C09CT("children")
    public final List<String> children;

    @C09CT("clip_id_list")
    public final String clip_id_list;

    @C09CT("dep_resources_total_size")
    public final Long dep_resources_total_size;

    @C09CT("designer_encrypted_id")
    public final String designer_encrypted_id;

    @C09CT("device_platform")
    public final String device_platform;

    @C09CT("distribution_extra")
    public final String distribution_extra;

    @C09CT("effect_analyze_info")
    public final EffectAnalyzeInfo effect_analyze_info;

    @C09CT("effect_type")
    public final Integer effect_type;

    @C09CT("file_diff")
    public final DiffEffect file_diff;

    @C09CT("follow_count")
    public final Integer follow_count;

    @C09CT("fragment_count")
    public final String fragment_count;

    @C09CT("from_source")
    public final Integer from_source;

    @C09CT("generated_id")
    public final String generated_id;

    @C09CT("hashtag")
    @C09CS(StringListOrEmptyAdapter.class)
    public List<String> hashtag;

    @C09CT("hint")
    public final String hint;

    @C09CT("hint_icon")
    public final UrlModel hint_icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("is_busi")
    public final Boolean is_busi;

    @C09CT("is_favorite")
    public Boolean is_favorite;

    @C09CT("is_pgc")
    public final Boolean is_pgc;

    @C09CT("is_pin")
    public boolean is_pin;

    @C09CT("loki_extra")
    public final String loki_extra;

    @C09CT("meta_song_id")
    public final String meta_song_id;

    @C09CT("meta_song_id_list")
    public final String meta_song_id_list;

    @C09CT("model_names_sec")
    public final String model_names_sec;

    @C09CT("music")
    public final String music;

    @C09CT("music_id")
    public String music_id;

    @C09CT("music_model")
    public final String music_model;

    @C09CT("music_post_unavailable")
    public boolean music_post_unavailable;

    @C09CT("music_unavailable_in_post")
    public final Boolean music_unavailable_in_post;

    @C09CT("music_url")
    public String music_url;

    @C09CT("nle_info")
    public final NleInfo nle_info;

    @C09CT("nle_summary")
    public String nle_summary;

    @C09CT("origin_panel")
    public final String origin_panel;

    @C09CT("package_size")
    public final Long package_size;

    @C09CT("panel")
    public String panel;

    @C09CT("panel_key")
    public final String panel_key;

    @C09CT("parent")
    public final String parent;

    @C09CT("preview_video")
    public final PreviewVideoInfo preview_video;

    @C09CT("preview_video_list")
    public final List<PreviewVideoInfo> preview_video_list;

    @C09CT("prompt_info")
    public final PromptInfo prompt_info;

    @C09CT("ptime")
    public final Long ptime;

    @C09CT("publish_time")
    public final Long publish_time;

    @C09CT("requirements_sec")
    public final List<String> requirements_sec;

    @C09CT("scene_type")
    public final String scene_type;

    @C09CT("sdk_extra")
    public final String sdk_extra;

    @C09CT("sdk_version")
    public final String sdk_version;

    @C09CT("source")
    public final Integer source;

    @C09CT("sticker_source")
    public String sticker_source;

    @C09CT("tags_updated_at")
    public final String tags_updated_at;

    @C09CT("nle_extra")
    public String templateBizData;

    @C09CT("template_backup_music_url")
    public String template_backup_music_url;

    @C09CT("template_effect_extra")
    public final TemplateEffectExtra template_effect_extra;

    @C09CT("template_group_id")
    public final String template_group_id;

    @C09CT("template_music_info")
    public final TemplateMusicInfo template_music_info;

    @C09CT("template_tag")
    public String template_tag;

    @C09CT("template_type")
    public final String template_type;

    @C09CT("trans_file_url")
    public final UrlModel trans_file_url;

    @C09CT("trans_res_path")
    public String trans_res_path;

    @C09CT("types_sec")
    public final List<String> types_sec;

    @C09CT("unzip_path")
    public String unzip_path;

    @C09CT("urs")
    public final List<String> urs_list;

    @C09CT("zip_path")
    public String zip_path;

    public static final class Creator implements Parcelable.Creator<BusinessExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BusinessExtra createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            PreviewVideoInfo previewVideoInfoCreateFromParcel = parcel.readInt() == 0 ? null : PreviewVideoInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PreviewVideoInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new BusinessExtra(previewVideoInfoCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), (UrlModel) parcel.readParcelable(BusinessExtra.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (UrlModel) parcel.readParcelable(BusinessExtra.class.getClassLoader()), (DiffEffect) parcel.readParcelable(BusinessExtra.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (TemplateEffectExtra) parcel.readParcelable(BusinessExtra.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : EffectAnalyzeInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AlbumEffectInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NleInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : TemplateMusicInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : CelebrationInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PromptInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BusinessExtra[] newArray(int i) {
            return new BusinessExtra[i];
        }
    }

    public final BusinessExtra copy(PreviewVideoInfo previewVideoInfo, List<PreviewVideoInfo> list, Integer num, String str, String str2, String str3, String str4, List<String> list2, String str5, String str6, String str7, UrlModel urlModel, String str8, String str9, String str10, String str11, List<String> list3, Integer num2, Integer num3, Integer num4, String str12, List<String> list4, List<String> list5, Boolean bool, String str13, String str14, String str15, List<String> list6, Long l, Long l2, String str16, UrlModel urlModel2, DiffEffect diffEffect, Long l3, TemplateEffectExtra templateEffectExtra, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, Boolean bool2, String str26, String str27, Boolean bool3, String str28, String str29, String str30, String str31, String str32, String str33, Long l4, boolean z2, Integer num5, Boolean bool4, List<String> list7, List<String> list8, String str34, EffectAnalyzeInfo effectAnalyzeInfo, AlbumEffectInfo albumEffectInfo, NleInfo nleInfo, String str35, TemplateMusicInfo templateMusicInfo, String str36, CelebrationInfo celebrationInfo, String str37, String str38, PromptInfo promptInfo) {
        return new BusinessExtra(previewVideoInfo, list, num, str, str2, str3, str4, list2, str5, str6, str7, urlModel, str8, str9, str10, str11, list3, num2, num3, num4, str12, list4, list5, bool, str13, str14, str15, list6, l, l2, str16, urlModel2, diffEffect, l3, templateEffectExtra, str17, str18, str19, str20, str21, str22, str23, str24, str25, z, bool2, str26, str27, bool3, str28, str29, str30, str31, str32, str33, l4, z2, num5, bool4, list7, list8, str34, effectAnalyzeInfo, albumEffectInfo, nleInfo, str35, templateMusicInfo, str36, celebrationInfo, str37, str38, promptInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessExtra)) {
            return false;
        }
        BusinessExtra businessExtra = (BusinessExtra) obj;
        return Intrinsics.LJFF(this.preview_video, businessExtra.preview_video) && Intrinsics.LJFF(this.preview_video_list, businessExtra.preview_video_list) && Intrinsics.LJFF(this.follow_count, businessExtra.follow_count) && Intrinsics.LJFF(this.nle_summary, businessExtra.nle_summary) && Intrinsics.LJFF(this.fragment_count, businessExtra.fragment_count) && Intrinsics.LJFF(this.music_model, businessExtra.music_model) && Intrinsics.LJFF(this.clip_id_list, businessExtra.clip_id_list) && Intrinsics.LJFF(this.urs_list, businessExtra.urs_list) && Intrinsics.LJFF(this.aspect_ratio, businessExtra.aspect_ratio) && Intrinsics.LJFF(this.id, businessExtra.id) && Intrinsics.LJFF(this.hint, businessExtra.hint) && Intrinsics.LJFF(this.hint_icon, businessExtra.hint_icon) && Intrinsics.LJFF(this.sdk_version, businessExtra.sdk_version) && Intrinsics.LJFF(this.device_platform, businessExtra.device_platform) && Intrinsics.LJFF(this.tags_updated_at, businessExtra.tags_updated_at) && Intrinsics.LJFF(this.parent, businessExtra.parent) && Intrinsics.LJFF(this.children, businessExtra.children) && Intrinsics.LJFF(this.effect_type, businessExtra.effect_type) && Intrinsics.LJFF(this.source, businessExtra.source) && Intrinsics.LJFF(this.from_source, businessExtra.from_source) && Intrinsics.LJFF(this.music, businessExtra.music) && Intrinsics.LJFF(this.types_sec, businessExtra.types_sec) && Intrinsics.LJFF(this.requirements_sec, businessExtra.requirements_sec) && Intrinsics.LJFF(this.is_busi, businessExtra.is_busi) && Intrinsics.LJFF(this.designer_encrypted_id, businessExtra.designer_encrypted_id) && Intrinsics.LJFF(this.sdk_extra, businessExtra.sdk_extra) && Intrinsics.LJFF(this.ad_raw_data, businessExtra.ad_raw_data) && Intrinsics.LJFF(this.bind_ids, businessExtra.bind_ids) && Intrinsics.LJFF(this.ptime, businessExtra.ptime) && Intrinsics.LJFF(this.publish_time, businessExtra.publish_time) && Intrinsics.LJFF(this.model_names_sec, businessExtra.model_names_sec) && Intrinsics.LJFF(this.trans_file_url, businessExtra.trans_file_url) && Intrinsics.LJFF(this.file_diff, businessExtra.file_diff) && Intrinsics.LJFF(this.package_size, businessExtra.package_size) && Intrinsics.LJFF(this.template_effect_extra, businessExtra.template_effect_extra) && Intrinsics.LJFF(this.generated_id, businessExtra.generated_id) && Intrinsics.LJFF(this.unzip_path, businessExtra.unzip_path) && Intrinsics.LJFF(this.zip_path, businessExtra.zip_path) && Intrinsics.LJFF(this.panel, businessExtra.panel) && Intrinsics.LJFF(this.trans_res_path, businessExtra.trans_res_path) && Intrinsics.LJFF(this.origin_panel, businessExtra.origin_panel) && Intrinsics.LJFF(this.panel_key, businessExtra.panel_key) && Intrinsics.LJFF(this.music_id, businessExtra.music_id) && Intrinsics.LJFF(this.music_url, businessExtra.music_url) && this.music_post_unavailable == businessExtra.music_post_unavailable && Intrinsics.LJFF(this.music_unavailable_in_post, businessExtra.music_unavailable_in_post) && Intrinsics.LJFF(this.meta_song_id, businessExtra.meta_song_id) && Intrinsics.LJFF(this.meta_song_id_list, businessExtra.meta_song_id_list) && Intrinsics.LJFF(this.is_pgc, businessExtra.is_pgc) && Intrinsics.LJFF(this.template_group_id, businessExtra.template_group_id) && Intrinsics.LJFF(this.template_type, businessExtra.template_type) && Intrinsics.LJFF(this.loki_extra, businessExtra.loki_extra) && Intrinsics.LJFF(this.anchor_name, businessExtra.anchor_name) && Intrinsics.LJFF(this.template_tag, businessExtra.template_tag) && Intrinsics.LJFF(this.sticker_source, businessExtra.sticker_source) && Intrinsics.LJFF(this.dep_resources_total_size, businessExtra.dep_resources_total_size) && this.is_pin == businessExtra.is_pin && Intrinsics.LJFF(this.asset_from, businessExtra.asset_from) && Intrinsics.LJFF(this.is_favorite, businessExtra.is_favorite) && Intrinsics.LJFF(this.hashtag, businessExtra.hashtag) && Intrinsics.LJFF(this.biz_tags, businessExtra.biz_tags) && Intrinsics.LJFF(this.distribution_extra, businessExtra.distribution_extra) && Intrinsics.LJFF(this.effect_analyze_info, businessExtra.effect_analyze_info) && Intrinsics.LJFF(this.album_effect_info, businessExtra.album_effect_info) && Intrinsics.LJFF(this.nle_info, businessExtra.nle_info) && Intrinsics.LJFF(this.templateBizData, businessExtra.templateBizData) && Intrinsics.LJFF(this.template_music_info, businessExtra.template_music_info) && Intrinsics.LJFF(this.template_backup_music_url, businessExtra.template_backup_music_url) && Intrinsics.LJFF(this.celebration, businessExtra.celebration) && Intrinsics.LJFF(this.asset_extra, businessExtra.asset_extra) && Intrinsics.LJFF(this.scene_type, businessExtra.scene_type) && Intrinsics.LJFF(this.prompt_info, businessExtra.prompt_info);
    }

    public int hashCode() {
        PreviewVideoInfo previewVideoInfo = this.preview_video;
        int iHashCode = (previewVideoInfo == null ? 0 : previewVideoInfo.hashCode()) * 31;
        List<PreviewVideoInfo> list = this.preview_video_list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.follow_count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nle_summary;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fragment_count;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.music_model;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clip_id_list;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list2 = this.urs_list;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.aspect_ratio;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.hint;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        UrlModel urlModel = this.hint_icon;
        int iHashCode12 = (iHashCode11 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str8 = this.sdk_version;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.device_platform;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.tags_updated_at;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.parent;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list3 = this.children;
        int iHashCode17 = (iHashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num2 = this.effect_type;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.source;
        int iHashCode19 = (iHashCode18 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.from_source;
        int iHashCode20 = (iHashCode19 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str12 = this.music;
        int iHashCode21 = (iHashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list4 = this.types_sec;
        int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.requirements_sec;
        int iHashCode23 = (iHashCode22 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Boolean bool = this.is_busi;
        int iHashCode24 = (iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.designer_encrypted_id;
        int iHashCode25 = (iHashCode24 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.sdk_extra;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.ad_raw_data;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<String> list6 = this.bind_ids;
        int iHashCode28 = (iHashCode27 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Long l = this.ptime;
        int iHashCode29 = (iHashCode28 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.publish_time;
        int iHashCode30 = (iHashCode29 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str16 = this.model_names_sec;
        int iHashCode31 = (iHashCode30 + (str16 == null ? 0 : str16.hashCode())) * 31;
        UrlModel urlModel2 = this.trans_file_url;
        int iHashCode32 = (iHashCode31 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        DiffEffect diffEffect = this.file_diff;
        int iHashCode33 = (iHashCode32 + (diffEffect == null ? 0 : diffEffect.hashCode())) * 31;
        Long l3 = this.package_size;
        int iHashCode34 = (iHashCode33 + (l3 == null ? 0 : l3.hashCode())) * 31;
        TemplateEffectExtra templateEffectExtra = this.template_effect_extra;
        int iHashCode35 = (iHashCode34 + (templateEffectExtra == null ? 0 : templateEffectExtra.hashCode())) * 31;
        String str17 = this.generated_id;
        int iHashCode36 = (iHashCode35 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.unzip_path;
        int iHashCode37 = (iHashCode36 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.zip_path;
        int iHashCode38 = (iHashCode37 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.panel;
        int iHashCode39 = (iHashCode38 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.trans_res_path;
        int iHashCode40 = (iHashCode39 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.origin_panel;
        int iHashCode41 = (iHashCode40 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.panel_key;
        int iHashCode42 = (iHashCode41 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.music_id;
        int iHashCode43 = (iHashCode42 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.music_url;
        int iHashCode44 = (((iHashCode43 + (str25 == null ? 0 : str25.hashCode())) * 31) + C786410Ut5.Z2(this.music_post_unavailable)) * 31;
        Boolean bool2 = this.music_unavailable_in_post;
        int iHashCode45 = (iHashCode44 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str26 = this.meta_song_id;
        int iHashCode46 = (iHashCode45 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.meta_song_id_list;
        int iHashCode47 = (iHashCode46 + (str27 == null ? 0 : str27.hashCode())) * 31;
        Boolean bool3 = this.is_pgc;
        int iHashCode48 = (iHashCode47 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str28 = this.template_group_id;
        int iHashCode49 = (iHashCode48 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.template_type;
        int iHashCode50 = (iHashCode49 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.loki_extra;
        int iHashCode51 = (iHashCode50 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.anchor_name;
        int iHashCode52 = (iHashCode51 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.template_tag;
        int iHashCode53 = (iHashCode52 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.sticker_source;
        int iHashCode54 = (iHashCode53 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Long l4 = this.dep_resources_total_size;
        int iHashCode55 = (((iHashCode54 + (l4 == null ? 0 : l4.hashCode())) * 31) + C786410Ut5.Z2(this.is_pin)) * 31;
        Integer num5 = this.asset_from;
        int iHashCode56 = (iHashCode55 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool4 = this.is_favorite;
        int iHashCode57 = (iHashCode56 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list7 = this.hashtag;
        int iHashCode58 = (iHashCode57 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<String> list8 = this.biz_tags;
        int iHashCode59 = (iHashCode58 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str34 = this.distribution_extra;
        int iHashCode60 = (iHashCode59 + (str34 == null ? 0 : str34.hashCode())) * 31;
        EffectAnalyzeInfo effectAnalyzeInfo = this.effect_analyze_info;
        int iHashCode61 = (iHashCode60 + (effectAnalyzeInfo == null ? 0 : effectAnalyzeInfo.hashCode())) * 31;
        AlbumEffectInfo albumEffectInfo = this.album_effect_info;
        int iHashCode62 = (iHashCode61 + (albumEffectInfo == null ? 0 : albumEffectInfo.hashCode())) * 31;
        NleInfo nleInfo = this.nle_info;
        int iHashCode63 = (iHashCode62 + (nleInfo == null ? 0 : nleInfo.hashCode())) * 31;
        String str35 = this.templateBizData;
        int iHashCode64 = (iHashCode63 + (str35 == null ? 0 : str35.hashCode())) * 31;
        TemplateMusicInfo templateMusicInfo = this.template_music_info;
        int iHashCode65 = (iHashCode64 + (templateMusicInfo == null ? 0 : templateMusicInfo.hashCode())) * 31;
        String str36 = this.template_backup_music_url;
        int iHashCode66 = (iHashCode65 + (str36 == null ? 0 : str36.hashCode())) * 31;
        CelebrationInfo celebrationInfo = this.celebration;
        int iHashCode67 = (iHashCode66 + (celebrationInfo == null ? 0 : celebrationInfo.hashCode())) * 31;
        String str37 = this.asset_extra;
        int iHashCode68 = (iHashCode67 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.scene_type;
        int iHashCode69 = (iHashCode68 + (str38 == null ? 0 : str38.hashCode())) * 31;
        PromptInfo promptInfo = this.prompt_info;
        return iHashCode69 + (promptInfo != null ? promptInfo.hashCode() : 0);
    }

    public String toString() {
        return "BusinessExtra(preview_video=" + this.preview_video + ", preview_video_list=" + this.preview_video_list + ", follow_count=" + this.follow_count + ", nle_summary=" + this.nle_summary + ", fragment_count=" + this.fragment_count + ", music_model=" + this.music_model + ", clip_id_list=" + this.clip_id_list + ", urs_list=" + this.urs_list + ", aspect_ratio=" + this.aspect_ratio + ", id=" + this.id + ", hint=" + this.hint + ", hint_icon=" + this.hint_icon + ", sdk_version=" + this.sdk_version + ", device_platform=" + this.device_platform + ", tags_updated_at=" + this.tags_updated_at + ", parent=" + this.parent + ", children=" + this.children + ", effect_type=" + this.effect_type + ", source=" + this.source + ", from_source=" + this.from_source + ", music=" + this.music + ", types_sec=" + this.types_sec + ", requirements_sec=" + this.requirements_sec + ", is_busi=" + this.is_busi + ", designer_encrypted_id=" + this.designer_encrypted_id + ", sdk_extra=" + this.sdk_extra + ", ad_raw_data=" + this.ad_raw_data + ", bind_ids=" + this.bind_ids + ", ptime=" + this.ptime + ", publish_time=" + this.publish_time + ", model_names_sec=" + this.model_names_sec + ", trans_file_url=" + this.trans_file_url + ", file_diff=" + this.file_diff + ", package_size=" + this.package_size + ", template_effect_extra=" + this.template_effect_extra + ", generated_id=" + this.generated_id + ", unzip_path=" + this.unzip_path + ", zip_path=" + this.zip_path + ", panel=" + this.panel + ", trans_res_path=" + this.trans_res_path + ", origin_panel=" + this.origin_panel + ", panel_key=" + this.panel_key + ", music_id=" + this.music_id + ", music_url=" + this.music_url + ", music_post_unavailable=" + this.music_post_unavailable + ", music_unavailable_in_post=" + this.music_unavailable_in_post + ", meta_song_id=" + this.meta_song_id + ", meta_song_id_list=" + this.meta_song_id_list + ", is_pgc=" + this.is_pgc + ", template_group_id=" + this.template_group_id + ", template_type=" + this.template_type + ", loki_extra=" + this.loki_extra + ", anchor_name=" + this.anchor_name + ", template_tag=" + this.template_tag + ", sticker_source=" + this.sticker_source + ", dep_resources_total_size=" + this.dep_resources_total_size + ", is_pin=" + this.is_pin + ", asset_from=" + this.asset_from + ", is_favorite=" + this.is_favorite + ", hashtag=" + this.hashtag + ", biz_tags=" + this.biz_tags + ", distribution_extra=" + this.distribution_extra + ", effect_analyze_info=" + this.effect_analyze_info + ", album_effect_info=" + this.album_effect_info + ", nle_info=" + this.nle_info + ", templateBizData=" + this.templateBizData + ", template_music_info=" + this.template_music_info + ", template_backup_music_url=" + this.template_backup_music_url + ", celebration=" + this.celebration + ", asset_extra=" + this.asset_extra + ", scene_type=" + this.scene_type + ", prompt_info=" + this.prompt_info + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PreviewVideoInfo previewVideoInfo = this.preview_video;
        if (previewVideoInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            previewVideoInfo.writeToParcel(parcel, i);
        }
        List<PreviewVideoInfo> list = this.preview_video_list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PreviewVideoInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.follow_count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.nle_summary);
        parcel.writeString(this.fragment_count);
        parcel.writeString(this.music_model);
        parcel.writeString(this.clip_id_list);
        parcel.writeStringList(this.urs_list);
        parcel.writeString(this.aspect_ratio);
        parcel.writeString(this.id);
        parcel.writeString(this.hint);
        parcel.writeParcelable(this.hint_icon, i);
        parcel.writeString(this.sdk_version);
        parcel.writeString(this.device_platform);
        parcel.writeString(this.tags_updated_at);
        parcel.writeString(this.parent);
        parcel.writeStringList(this.children);
        Integer num2 = this.effect_type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.source;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.from_source;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.music);
        parcel.writeStringList(this.types_sec);
        parcel.writeStringList(this.requirements_sec);
        Boolean bool = this.is_busi;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.designer_encrypted_id);
        parcel.writeString(this.sdk_extra);
        parcel.writeString(this.ad_raw_data);
        parcel.writeStringList(this.bind_ids);
        Long l = this.ptime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.publish_time;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.model_names_sec);
        parcel.writeParcelable(this.trans_file_url, i);
        parcel.writeParcelable(this.file_diff, i);
        Long l3 = this.package_size;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeParcelable(this.template_effect_extra, i);
        parcel.writeString(this.generated_id);
        parcel.writeString(this.unzip_path);
        parcel.writeString(this.zip_path);
        parcel.writeString(this.panel);
        parcel.writeString(this.trans_res_path);
        parcel.writeString(this.origin_panel);
        parcel.writeString(this.panel_key);
        parcel.writeString(this.music_id);
        parcel.writeString(this.music_url);
        parcel.writeInt(this.music_post_unavailable ? 1 : 0);
        Boolean bool2 = this.music_unavailable_in_post;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.meta_song_id);
        parcel.writeString(this.meta_song_id_list);
        Boolean bool3 = this.is_pgc;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.template_group_id);
        parcel.writeString(this.template_type);
        parcel.writeString(this.loki_extra);
        parcel.writeString(this.anchor_name);
        parcel.writeString(this.template_tag);
        parcel.writeString(this.sticker_source);
        Long l4 = this.dep_resources_total_size;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeInt(this.is_pin ? 1 : 0);
        Integer num5 = this.asset_from;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool4 = this.is_favorite;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.hashtag);
        parcel.writeStringList(this.biz_tags);
        parcel.writeString(this.distribution_extra);
        EffectAnalyzeInfo effectAnalyzeInfo = this.effect_analyze_info;
        if (effectAnalyzeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectAnalyzeInfo.writeToParcel(parcel, i);
        }
        AlbumEffectInfo albumEffectInfo = this.album_effect_info;
        if (albumEffectInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            albumEffectInfo.writeToParcel(parcel, i);
        }
        NleInfo nleInfo = this.nle_info;
        if (nleInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nleInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.templateBizData);
        TemplateMusicInfo templateMusicInfo = this.template_music_info;
        if (templateMusicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateMusicInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.template_backup_music_url);
        CelebrationInfo celebrationInfo = this.celebration;
        if (celebrationInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            celebrationInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.asset_extra);
        parcel.writeString(this.scene_type);
        PromptInfo promptInfo = this.prompt_info;
        if (promptInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptInfo.writeToParcel(parcel, i);
        }
    }

    public final String getAd_raw_data() {
        return this.ad_raw_data;
    }

    public final AlbumEffectInfo getAlbum_effect_info() {
        return this.album_effect_info;
    }

    public final String getAnchor_name() {
        return this.anchor_name;
    }

    public final String getAspect_ratio() {
        return this.aspect_ratio;
    }

    public final String getAsset_extra() {
        return this.asset_extra;
    }

    public final Integer getAsset_from() {
        return this.asset_from;
    }

    public final List<String> getBind_ids() {
        return this.bind_ids;
    }

    public final List<String> getBiz_tags() {
        return this.biz_tags;
    }

    public final CelebrationInfo getCelebration() {
        return this.celebration;
    }

    public final List<String> getChildren() {
        return this.children;
    }

    public final String getClip_id_list() {
        return this.clip_id_list;
    }

    public final Long getDep_resources_total_size() {
        return this.dep_resources_total_size;
    }

    public final String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public final String getDevice_platform() {
        return this.device_platform;
    }

    public final String getDistribution_extra() {
        return this.distribution_extra;
    }

    public final EffectAnalyzeInfo getEffect_analyze_info() {
        return this.effect_analyze_info;
    }

    public final Integer getEffect_type() {
        return this.effect_type;
    }

    public final DiffEffect getFile_diff() {
        return this.file_diff;
    }

    public final Integer getFollow_count() {
        return this.follow_count;
    }

    public final String getFragment_count() {
        return this.fragment_count;
    }

    public final Integer getFrom_source() {
        return this.from_source;
    }

    public final String getGenerated_id() {
        return this.generated_id;
    }

    public final List<String> getHashtag() {
        return this.hashtag;
    }

    public final String getHint() {
        return this.hint;
    }

    public final UrlModel getHint_icon() {
        return this.hint_icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLoki_extra() {
        return this.loki_extra;
    }

    public final String getMeta_song_id() {
        return this.meta_song_id;
    }

    public final String getMeta_song_id_list() {
        return this.meta_song_id_list;
    }

    public final String getModel_names_sec() {
        return this.model_names_sec;
    }

    public final String getMusic() {
        return this.music;
    }

    public final String getMusic_id() {
        return this.music_id;
    }

    public final String getMusic_model() {
        return this.music_model;
    }

    public final boolean getMusic_post_unavailable() {
        return this.music_post_unavailable;
    }

    public final Boolean getMusic_unavailable_in_post() {
        return this.music_unavailable_in_post;
    }

    public final String getMusic_url() {
        return this.music_url;
    }

    public final NleInfo getNle_info() {
        return this.nle_info;
    }

    public final String getNle_summary() {
        return this.nle_summary;
    }

    public final String getOrigin_panel() {
        return this.origin_panel;
    }

    public final Long getPackage_size() {
        return this.package_size;
    }

    public final String getPanel() {
        return this.panel;
    }

    public final String getPanel_key() {
        return this.panel_key;
    }

    public final String getParent() {
        return this.parent;
    }

    public final PreviewVideoInfo getPreview_video() {
        return this.preview_video;
    }

    public final List<PreviewVideoInfo> getPreview_video_list() {
        return this.preview_video_list;
    }

    public final PromptInfo getPrompt_info() {
        return this.prompt_info;
    }

    public final Long getPtime() {
        return this.ptime;
    }

    public final Long getPublish_time() {
        return this.publish_time;
    }

    public final List<String> getRequirements_sec() {
        return this.requirements_sec;
    }

    public final String getScene_type() {
        return this.scene_type;
    }

    public final String getSdk_extra() {
        return this.sdk_extra;
    }

    public final String getSdk_version() {
        return this.sdk_version;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getSticker_source() {
        return this.sticker_source;
    }

    public final String getTags_updated_at() {
        return this.tags_updated_at;
    }

    public final String getTemplateBizData() {
        return this.templateBizData;
    }

    public final String getTemplate_backup_music_url() {
        return this.template_backup_music_url;
    }

    public final TemplateEffectExtra getTemplate_effect_extra() {
        return this.template_effect_extra;
    }

    public final String getTemplate_group_id() {
        return this.template_group_id;
    }

    public final TemplateMusicInfo getTemplate_music_info() {
        return this.template_music_info;
    }

    public final String getTemplate_tag() {
        return this.template_tag;
    }

    public final String getTemplate_type() {
        return this.template_type;
    }

    public final UrlModel getTrans_file_url() {
        return this.trans_file_url;
    }

    public final String getTrans_res_path() {
        return this.trans_res_path;
    }

    public final List<String> getTypes_sec() {
        return this.types_sec;
    }

    public final String getUnzip_path() {
        return this.unzip_path;
    }

    public final List<String> getUrs_list() {
        return this.urs_list;
    }

    public final String getZip_path() {
        return this.zip_path;
    }

    public final Boolean is_busi() {
        return this.is_busi;
    }

    public final Boolean is_favorite() {
        return this.is_favorite;
    }

    public final Boolean is_pgc() {
        return this.is_pgc;
    }

    public final boolean is_pin() {
        return this.is_pin;
    }

    public final void setAnchor_name(String str) {
        this.anchor_name = str;
    }

    public final void setAsset_from(Integer num) {
        this.asset_from = num;
    }

    public final void setHashtag(List<String> list) {
        this.hashtag = list;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMusic_id(String str) {
        this.music_id = str;
    }

    public final void setMusic_post_unavailable(boolean z) {
        this.music_post_unavailable = z;
    }

    public final void setMusic_url(String str) {
        this.music_url = str;
    }

    public final void setNle_summary(String str) {
        this.nle_summary = str;
    }

    public final void setPanel(String str) {
        this.panel = str;
    }

    public final void setSticker_source(String str) {
        this.sticker_source = str;
    }

    public final void setTemplateBizData(String str) {
        this.templateBizData = str;
    }

    public final void setTemplate_backup_music_url(String str) {
        this.template_backup_music_url = str;
    }

    public final void setTemplate_tag(String str) {
        this.template_tag = str;
    }

    public final void setTrans_res_path(String str) {
        this.trans_res_path = str;
    }

    public final void setUnzip_path(String str) {
        this.unzip_path = str;
    }

    public final void setZip_path(String str) {
        this.zip_path = str;
    }

    public final void set_favorite(Boolean bool) {
        this.is_favorite = bool;
    }

    public final void set_pin(boolean z) {
        this.is_pin = z;
    }

    public BusinessExtra(PreviewVideoInfo previewVideoInfo, List<PreviewVideoInfo> list, Integer num, String str, String str2, String str3, String str4, List<String> list2, String str5, String str6, String str7, UrlModel urlModel, String str8, String str9, String str10, String str11, List<String> list3, Integer num2, Integer num3, Integer num4, String str12, List<String> list4, List<String> list5, Boolean bool, String str13, String str14, String str15, List<String> list6, Long l, Long l2, String str16, UrlModel urlModel2, DiffEffect diffEffect, Long l3, TemplateEffectExtra templateEffectExtra, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, Boolean bool2, String str26, String str27, Boolean bool3, String str28, String str29, String str30, String str31, String str32, String str33, Long l4, boolean z2, Integer num5, Boolean bool4, List<String> list7, List<String> list8, String str34, EffectAnalyzeInfo effectAnalyzeInfo, AlbumEffectInfo albumEffectInfo, NleInfo nleInfo, String str35, TemplateMusicInfo templateMusicInfo, String str36, CelebrationInfo celebrationInfo, String str37, String str38, PromptInfo promptInfo) {
        this.preview_video = previewVideoInfo;
        this.preview_video_list = list;
        this.follow_count = num;
        this.nle_summary = str;
        this.fragment_count = str2;
        this.music_model = str3;
        this.clip_id_list = str4;
        this.urs_list = list2;
        this.aspect_ratio = str5;
        this.id = str6;
        this.hint = str7;
        this.hint_icon = urlModel;
        this.sdk_version = str8;
        this.device_platform = str9;
        this.tags_updated_at = str10;
        this.parent = str11;
        this.children = list3;
        this.effect_type = num2;
        this.source = num3;
        this.from_source = num4;
        this.music = str12;
        this.types_sec = list4;
        this.requirements_sec = list5;
        this.is_busi = bool;
        this.designer_encrypted_id = str13;
        this.sdk_extra = str14;
        this.ad_raw_data = str15;
        this.bind_ids = list6;
        this.ptime = l;
        this.publish_time = l2;
        this.model_names_sec = str16;
        this.trans_file_url = urlModel2;
        this.file_diff = diffEffect;
        this.package_size = l3;
        this.template_effect_extra = templateEffectExtra;
        this.generated_id = str17;
        this.unzip_path = str18;
        this.zip_path = str19;
        this.panel = str20;
        this.trans_res_path = str21;
        this.origin_panel = str22;
        this.panel_key = str23;
        this.music_id = str24;
        this.music_url = str25;
        this.music_post_unavailable = z;
        this.music_unavailable_in_post = bool2;
        this.meta_song_id = str26;
        this.meta_song_id_list = str27;
        this.is_pgc = bool3;
        this.template_group_id = str28;
        this.template_type = str29;
        this.loki_extra = str30;
        this.anchor_name = str31;
        this.template_tag = str32;
        this.sticker_source = str33;
        this.dep_resources_total_size = l4;
        this.is_pin = z2;
        this.asset_from = num5;
        this.is_favorite = bool4;
        this.hashtag = list7;
        this.biz_tags = list8;
        this.distribution_extra = str34;
        this.effect_analyze_info = effectAnalyzeInfo;
        this.album_effect_info = albumEffectInfo;
        this.nle_info = nleInfo;
        this.templateBizData = str35;
        this.template_music_info = templateMusicInfo;
        this.template_backup_music_url = str36;
        this.celebration = celebrationInfo;
        this.asset_extra = str37;
        this.scene_type = str38;
        this.prompt_info = promptInfo;
    }
}
