package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0MJ9;
import X.C0MJA;
import X.C1416110mxF;
import X.C1417900n08;
import X.C786410Ut5;
import X.EnumC1412640mre;
import X.EnumC543490LTf;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoCutThemeData implements Parcelable {

    @C040H
    public int addFilterToCover;

    @C09CT("auto_cut_anchor_name")
    public String anchorName;

    @C09CT("asset_from")
    public final Integer assetFrom;

    @C09CT("autopick_nle_draft")
    public String autoPickNleDraft;

    @C09CT("auto_cut_theme_category")
    public AutoCutCategory category;

    @C09CT("auto_cut_theme_music_cover")
    public String coverUrl;

    @C040H
    public EnumC543490LTf downloadState;

    @C09CT("auto_cut_feature_bits")
    public final ArrayList<Long> featureBits;

    @C09CT("auto_cut_feature_code")
    public final ArrayList<Long> featureCode;

    @C09CT("auto_cut_icon_display_type")
    public C0MJA iconDisplayType;

    @C09CT("auto_cut_icon_type")
    public final Integer iconType;

    @C09CT("auto_cut_theme_index")
    public int indexFromSource;

    @C09CT("auto_cut_is_preset_music")
    public final boolean isPreset;

    @C09CT("auto_cut_theme_lyric_cover_overlay_url")
    public String lyricCoverOverlayUrl;

    @C09CT("auto_cut_theme_music_buz_model")
    public final MusicBuzModel musicBuzModel;

    @C09CT("auto_cut_theme_music_id")
    public final String musicId;

    @C09CT("auto_cut_theme_music_path")
    public String musicPath;

    @C09CT("auto_cut_theme_music_post_unavailable")
    public final Boolean musicPostUnavailable;

    @C09CT("auto_cut_theme_music_start_time")
    public final Integer musicStartTime;

    @C09CT("auto_cut_theme_music_url")
    public final String musicUrl;

    @C09CT("auto_cut_theme_music_volume")
    public final Float musicVolume;

    @C09CT("auto_cut_theme_music_name")
    public String name;

    @C09CT("auto_cut_theme_author_name")
    public final String nickName;

    @C040H
    public String nleLogId;

    @C09CT("auto_cut_preload_urs_set")
    public Set<String> preloadUrsSet;

    @C09CT("auto_cut_theme_reuse_music_align_branch")
    public int reuseMusicAlignBranch;

    @C09CT("auto_cut_theme_reuse_music_align_display_index")
    public int reuseMusicAlignDisplayIndex;

    @C09CT("auto_cut_theme_reuse_music_local_cover_path")
    public String reuseMusicLocalCoverPath;

    @C09CT("auto_cut_theme_reuse_music_name")
    public String reuseMusicName;

    @C09CT("auto_cut_theme_reuse_music_override_buz_model")
    public MusicBuzModel reuseMusicOverrideBuz;

    @C09CT("auto_cut_theme_scene_type")
    public String sceneType;

    @C09CT("auto_cut_theme_server_music_matched")
    public boolean serverMusicMatched;

    @C09CT("auto_cut_theme_reuse_music_on_select")
    public boolean shouldApplyReuseMusicOnSelect;

    @C09CT("auto_cut_theme_source")
    public final int source;

    @C09CT("auto_cut_subtitle")
    public String subtitle;

    @C040H
    public String templateData;

    @C09CT("auto_cut_theme_template_group_id")
    public String templateGroupId;

    @C09CT("auto_cut_theme_template_id")
    public String templateId;

    @C09CT("auto_cut_theme_template_tag")
    public String templateTag;

    @C09CT("auto_cut_theme_template_type")
    public int templateType;

    @C09CT("auto_cut_theme_template_url")
    public String templateUrl;

    @C09CT("auto_cut_template_uuid")
    public final String uuid;
    public static final C1417900n08 Companion = new C1417900n08();
    public static final Parcelable.Creator<AutoCutThemeData> CREATOR = new Parcelable.Creator<AutoCutThemeData>() { // from class: X.0L7C
        @Override // android.os.Parcelable.Creator
        public final AutoCutThemeData createFromParcel(Parcel parcel) {
            MusicBuzModel musicBuzModelCreateFromParcel;
            boolean z;
            LinkedHashSet linkedHashSet;
            AutoCutCategory autoCutCategoryCreateFromParcel;
            boolean z2;
            Boolean boolValueOf;
            Float fValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z3;
            MusicBuzModel musicBuzModelCreateFromParcel2;
            boolean z4;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                musicBuzModelCreateFromParcel = null;
            } else {
                musicBuzModelCreateFromParcel = MusicBuzModel.CREATOR.createFromParcel(parcel);
            }
            MusicBuzModel musicBuzModel = musicBuzModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i4 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashSet.add(parcel.readString());
                }
            }
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                autoCutCategoryCreateFromParcel = null;
            } else {
                autoCutCategoryCreateFromParcel = AutoCutCategory.CREATOR.createFromParcel(parcel);
            }
            AutoCutCategory autoCutCategory = autoCutCategoryCreateFromParcel;
            String string13 = parcel.readString();
            int i6 = parcel.readInt();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf = Boolean.valueOf(z2);
            }
            String string15 = parcel.readString();
            if (parcel.readInt() == 0) {
                fValueOf = null;
            } else {
                fValueOf = Float.valueOf(parcel.readFloat());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            C0MJA c0mjaValueOf = C0MJA.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i9 = parcel.readInt();
                arrayList2 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            EnumC543490LTf enumC543490LTfValueOf = EnumC543490LTf.valueOf(parcel.readString());
            String string17 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                musicBuzModelCreateFromParcel2 = null;
            } else {
                musicBuzModelCreateFromParcel2 = MusicBuzModel.CREATOR.createFromParcel(parcel);
            }
            MusicBuzModel musicBuzModel2 = musicBuzModelCreateFromParcel2;
            int i11 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            return new AutoCutThemeData(i, i2, string, i3, string2, string3, string4, string5, string6, string7, musicBuzModel, z, string8, string9, string10, string11, linkedHashSet, string12, autoCutCategory, string13, i6, string14, boolValueOf, string15, fValueOf, numValueOf, string16, numValueOf2, c0mjaValueOf, numValueOf3, arrayList, arrayList2, enumC543490LTfValueOf, string17, z3, musicBuzModel2, i11, z4, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoCutThemeData[] newArray(int i) {
            return new AutoCutThemeData[i];
        }
    };

    public AutoCutThemeData() {
        this(C0MJ9.AUTO_CUT.ordinal(), -1, "", EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue(), null, "", null, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, null, Boolean.FALSE, null, null, null, UUID.randomUUID().toString(), null, C0MJA.NONE, null, null, null, EnumC543490LTf.COMPLETED, null, false, null, 0, false, 0, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutThemeData)) {
            return false;
        }
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) obj;
        return this.source == autoCutThemeData.source && this.indexFromSource == autoCutThemeData.indexFromSource && Intrinsics.LJFF(this.templateId, autoCutThemeData.templateId) && this.templateType == autoCutThemeData.templateType && Intrinsics.LJFF(this.nickName, autoCutThemeData.nickName) && Intrinsics.LJFF(this.templateUrl, autoCutThemeData.templateUrl) && Intrinsics.LJFF(this.templateData, autoCutThemeData.templateData) && Intrinsics.LJFF(this.musicId, autoCutThemeData.musicId) && Intrinsics.LJFF(this.coverUrl, autoCutThemeData.coverUrl) && Intrinsics.LJFF(this.name, autoCutThemeData.name) && Intrinsics.LJFF(this.musicBuzModel, autoCutThemeData.musicBuzModel) && this.isPreset == autoCutThemeData.isPreset && Intrinsics.LJFF(this.templateGroupId, autoCutThemeData.templateGroupId) && Intrinsics.LJFF(this.templateTag, autoCutThemeData.templateTag) && Intrinsics.LJFF(this.sceneType, autoCutThemeData.sceneType) && Intrinsics.LJFF(this.anchorName, autoCutThemeData.anchorName) && Intrinsics.LJFF(this.preloadUrsSet, autoCutThemeData.preloadUrsSet) && Intrinsics.LJFF(this.nleLogId, autoCutThemeData.nleLogId) && Intrinsics.LJFF(this.category, autoCutThemeData.category) && Intrinsics.LJFF(this.subtitle, autoCutThemeData.subtitle) && this.addFilterToCover == autoCutThemeData.addFilterToCover && Intrinsics.LJFF(this.musicUrl, autoCutThemeData.musicUrl) && Intrinsics.LJFF(this.musicPostUnavailable, autoCutThemeData.musicPostUnavailable) && Intrinsics.LJFF(this.musicPath, autoCutThemeData.musicPath) && Intrinsics.LJFF(this.musicVolume, autoCutThemeData.musicVolume) && Intrinsics.LJFF(this.musicStartTime, autoCutThemeData.musicStartTime) && Intrinsics.LJFF(this.uuid, autoCutThemeData.uuid) && Intrinsics.LJFF(this.assetFrom, autoCutThemeData.assetFrom) && this.iconDisplayType == autoCutThemeData.iconDisplayType && Intrinsics.LJFF(this.iconType, autoCutThemeData.iconType) && Intrinsics.LJFF(this.featureBits, autoCutThemeData.featureBits) && Intrinsics.LJFF(this.featureCode, autoCutThemeData.featureCode) && this.downloadState == autoCutThemeData.downloadState && Intrinsics.LJFF(this.autoPickNleDraft, autoCutThemeData.autoPickNleDraft) && this.shouldApplyReuseMusicOnSelect == autoCutThemeData.shouldApplyReuseMusicOnSelect && Intrinsics.LJFF(this.reuseMusicOverrideBuz, autoCutThemeData.reuseMusicOverrideBuz) && this.reuseMusicAlignDisplayIndex == autoCutThemeData.reuseMusicAlignDisplayIndex && this.serverMusicMatched == autoCutThemeData.serverMusicMatched && this.reuseMusicAlignBranch == autoCutThemeData.reuseMusicAlignBranch && Intrinsics.LJFF(this.reuseMusicLocalCoverPath, autoCutThemeData.reuseMusicLocalCoverPath) && Intrinsics.LJFF(this.reuseMusicName, autoCutThemeData.reuseMusicName) && Intrinsics.LJFF(this.lyricCoverOverlayUrl, autoCutThemeData.lyricCoverOverlayUrl);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.source * 31) + this.indexFromSource) * 31) + this.templateId.hashCode()) * 31) + this.templateType) * 31;
        String str = this.nickName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.templateUrl.hashCode()) * 31;
        String str2 = this.templateData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.musicId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.coverUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MusicBuzModel musicBuzModel = this.musicBuzModel;
        int iHashCode7 = (((iHashCode6 + (musicBuzModel == null ? 0 : musicBuzModel.hashCode())) * 31) + C786410Ut5.Z2(this.isPreset)) * 31;
        String str6 = this.templateGroupId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.templateTag;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sceneType;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.anchorName;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Set<String> set = this.preloadUrsSet;
        int iHashCode12 = (iHashCode11 + (set == null ? 0 : set.hashCode())) * 31;
        String str10 = this.nleLogId;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        AutoCutCategory autoCutCategory = this.category;
        int iHashCode14 = (iHashCode13 + (autoCutCategory == null ? 0 : autoCutCategory.hashCode())) * 31;
        String str11 = this.subtitle;
        int iHashCode15 = (((iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.addFilterToCover) * 31;
        String str12 = this.musicUrl;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.musicPostUnavailable;
        int iHashCode17 = (iHashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.musicPath;
        int iHashCode18 = (iHashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Float f = this.musicVolume;
        int iHashCode19 = (iHashCode18 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.musicStartTime;
        int iHashCode20 = (((iHashCode19 + (num == null ? 0 : num.hashCode())) * 31) + this.uuid.hashCode()) * 31;
        Integer num2 = this.assetFrom;
        int iHashCode21 = (((iHashCode20 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.iconDisplayType.hashCode()) * 31;
        Integer num3 = this.iconType;
        int iHashCode22 = (iHashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ArrayList<Long> arrayList = this.featureBits;
        int iHashCode23 = (iHashCode22 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<Long> arrayList2 = this.featureCode;
        int iHashCode24 = (((iHashCode23 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + this.downloadState.hashCode()) * 31;
        String str14 = this.autoPickNleDraft;
        int iHashCode25 = (((iHashCode24 + (str14 == null ? 0 : str14.hashCode())) * 31) + C786410Ut5.Z2(this.shouldApplyReuseMusicOnSelect)) * 31;
        MusicBuzModel musicBuzModel2 = this.reuseMusicOverrideBuz;
        int iHashCode26 = (((((((iHashCode25 + (musicBuzModel2 == null ? 0 : musicBuzModel2.hashCode())) * 31) + this.reuseMusicAlignDisplayIndex) * 31) + C786410Ut5.Z2(this.serverMusicMatched)) * 31) + this.reuseMusicAlignBranch) * 31;
        String str15 = this.reuseMusicLocalCoverPath;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.reuseMusicName;
        int iHashCode28 = (iHashCode27 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.lyricCoverOverlayUrl;
        return iHashCode28 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        return "AutoCutThemeData(source=" + this.source + ", indexFromSource=" + this.indexFromSource + ", templateId=" + this.templateId + ", templateType=" + this.templateType + ", nickName=" + this.nickName + ", templateUrl=" + this.templateUrl + ", templateData=" + this.templateData + ", musicId=" + this.musicId + ", coverUrl=" + this.coverUrl + ", name=" + this.name + ", musicBuzModel=" + this.musicBuzModel + ", isPreset=" + this.isPreset + ", templateGroupId=" + this.templateGroupId + ", templateTag=" + this.templateTag + ", sceneType=" + this.sceneType + ", anchorName=" + this.anchorName + ", preloadUrsSet=" + this.preloadUrsSet + ", nleLogId=" + this.nleLogId + ", category=" + this.category + ", subtitle=" + this.subtitle + ", addFilterToCover=" + this.addFilterToCover + ", musicUrl=" + this.musicUrl + ", musicPostUnavailable=" + this.musicPostUnavailable + ", musicPath=" + this.musicPath + ", musicVolume=" + this.musicVolume + ", musicStartTime=" + this.musicStartTime + ", uuid=" + this.uuid + ", assetFrom=" + this.assetFrom + ", iconDisplayType=" + this.iconDisplayType + ", iconType=" + this.iconType + ", featureBits=" + this.featureBits + ", featureCode=" + this.featureCode + ", downloadState=" + this.downloadState + ", autoPickNleDraft=" + this.autoPickNleDraft + ", shouldApplyReuseMusicOnSelect=" + this.shouldApplyReuseMusicOnSelect + ", reuseMusicOverrideBuz=" + this.reuseMusicOverrideBuz + ", reuseMusicAlignDisplayIndex=" + this.reuseMusicAlignDisplayIndex + ", serverMusicMatched=" + this.serverMusicMatched + ", reuseMusicAlignBranch=" + this.reuseMusicAlignBranch + ", reuseMusicLocalCoverPath=" + this.reuseMusicLocalCoverPath + ", reuseMusicName=" + this.reuseMusicName + ", lyricCoverOverlayUrl=" + this.lyricCoverOverlayUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.source);
        parcel.writeInt(this.indexFromSource);
        parcel.writeString(this.templateId);
        parcel.writeInt(this.templateType);
        parcel.writeString(this.nickName);
        parcel.writeString(this.templateUrl);
        parcel.writeString(this.templateData);
        parcel.writeString(this.musicId);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.name);
        MusicBuzModel musicBuzModel = this.musicBuzModel;
        if (musicBuzModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicBuzModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isPreset ? 1 : 0);
        parcel.writeString(this.templateGroupId);
        parcel.writeString(this.templateTag);
        parcel.writeString(this.sceneType);
        parcel.writeString(this.anchorName);
        Set<String> set = this.preloadUrsSet;
        if (set == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(set.size());
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        }
        parcel.writeString(this.nleLogId);
        AutoCutCategory autoCutCategory = this.category;
        if (autoCutCategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoCutCategory.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.addFilterToCover);
        parcel.writeString(this.musicUrl);
        Boolean bool = this.musicPostUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.musicPath);
        Float f = this.musicVolume;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num = this.musicStartTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.uuid);
        Integer num2 = this.assetFrom;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.iconDisplayType.name());
        Integer num3 = this.iconType;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        ArrayList<Long> arrayList = this.featureBits;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Long> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                parcel.writeLong(it3.next().longValue());
            }
        }
        ArrayList<Long> arrayList2 = this.featureCode;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<Long> it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                parcel.writeLong(it4.next().longValue());
            }
        }
        parcel.writeString(this.downloadState.name());
        parcel.writeString(this.autoPickNleDraft);
        parcel.writeInt(this.shouldApplyReuseMusicOnSelect ? 1 : 0);
        MusicBuzModel musicBuzModel2 = this.reuseMusicOverrideBuz;
        if (musicBuzModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicBuzModel2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.reuseMusicAlignDisplayIndex);
        parcel.writeInt(this.serverMusicMatched ? 1 : 0);
        parcel.writeInt(this.reuseMusicAlignBranch);
        parcel.writeString(this.reuseMusicLocalCoverPath);
        parcel.writeString(this.reuseMusicName);
        parcel.writeString(this.lyricCoverOverlayUrl);
    }

    public final C0MJ9 LIZIZ() {
        return C1416110mxF.LJIIJJI(this.source);
    }

    public static AutoCutThemeData LIZ(AutoCutThemeData autoCutThemeData, String str, MusicBuzModel musicBuzModel, String str2, Boolean bool, C0MJA c0mja, boolean z, MusicBuzModel musicBuzModel2, int i, int i2, String str3, String str4, int i3, int i4) {
        int i5;
        int i6;
        String str5;
        int i7;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z2;
        String str11;
        String str12;
        String str13;
        String str14;
        Set<String> set;
        String str15;
        AutoCutCategory autoCutCategory;
        String str16;
        int i8;
        String str17;
        Float f;
        Integer num;
        String str18;
        Integer num2;
        Integer num3;
        ArrayList<Long> arrayList;
        ArrayList<Long> arrayList2;
        EnumC543490LTf enumC543490LTf;
        String str19;
        String str20 = str4;
        String str21 = str3;
        MusicBuzModel musicBuzModel3 = musicBuzModel;
        MusicBuzModel musicBuzModel4 = musicBuzModel2;
        boolean z3 = z;
        String str22 = str;
        C0MJA c0mja2 = c0mja;
        int i9 = i2;
        Boolean bool2 = bool;
        int i10 = i;
        String str23 = str2;
        boolean z4 = false;
        if ((i3 & 1) != 0) {
            i5 = autoCutThemeData.source;
        } else {
            i5 = 0;
        }
        if ((i3 & 2) != 0) {
            i6 = autoCutThemeData.indexFromSource;
        } else {
            i6 = 0;
        }
        String str24 = null;
        if ((i3 & 4) != 0) {
            str5 = autoCutThemeData.templateId;
        } else {
            str5 = null;
        }
        if ((i3 & 8) != 0) {
            i7 = autoCutThemeData.templateType;
        } else {
            i7 = 0;
        }
        if ((i3 & 16) != 0) {
            str6 = autoCutThemeData.nickName;
        } else {
            str6 = null;
        }
        if ((i3 & 32) != 0) {
            str7 = autoCutThemeData.templateUrl;
        } else {
            str7 = null;
        }
        if ((i3 & 64) != 0) {
            str8 = autoCutThemeData.templateData;
        } else {
            str8 = null;
        }
        if ((i3 & 128) != 0) {
            str22 = autoCutThemeData.musicId;
        }
        if ((i3 & 256) != 0) {
            str9 = autoCutThemeData.coverUrl;
        } else {
            str9 = null;
        }
        if ((i3 & 512) != 0) {
            str10 = autoCutThemeData.name;
        } else {
            str10 = null;
        }
        if ((i3 & 1024) != 0) {
            musicBuzModel3 = autoCutThemeData.musicBuzModel;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z2 = autoCutThemeData.isPreset;
        } else {
            z2 = false;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str11 = autoCutThemeData.templateGroupId;
        } else {
            str11 = null;
        }
        if ((i3 & 8192) != 0) {
            str12 = autoCutThemeData.templateTag;
        } else {
            str12 = null;
        }
        if ((i3 & 16384) != 0) {
            str13 = autoCutThemeData.sceneType;
        } else {
            str13 = null;
        }
        if ((32768 & i3) != 0) {
            str14 = autoCutThemeData.anchorName;
        } else {
            str14 = null;
        }
        if ((65536 & i3) != 0) {
            set = autoCutThemeData.preloadUrsSet;
        } else {
            set = null;
        }
        if ((131072 & i3) != 0) {
            str15 = autoCutThemeData.nleLogId;
        } else {
            str15 = null;
        }
        if ((262144 & i3) != 0) {
            autoCutCategory = autoCutThemeData.category;
        } else {
            autoCutCategory = null;
        }
        if ((524288 & i3) != 0) {
            str16 = autoCutThemeData.subtitle;
        } else {
            str16 = null;
        }
        if ((1048576 & i3) != 0) {
            i8 = autoCutThemeData.addFilterToCover;
        } else {
            i8 = 0;
        }
        if ((2097152 & i3) != 0) {
            str23 = autoCutThemeData.musicUrl;
        }
        if ((4194304 & i3) != 0) {
            bool2 = autoCutThemeData.musicPostUnavailable;
        }
        if ((8388608 & i3) != 0) {
            str17 = autoCutThemeData.musicPath;
        } else {
            str17 = null;
        }
        if ((16777216 & i3) != 0) {
            f = autoCutThemeData.musicVolume;
        } else {
            f = null;
        }
        if ((33554432 & i3) != 0) {
            num = autoCutThemeData.musicStartTime;
        } else {
            num = null;
        }
        if ((67108864 & i3) != 0) {
            str18 = autoCutThemeData.uuid;
        } else {
            str18 = null;
        }
        if ((134217728 & i3) != 0) {
            num2 = autoCutThemeData.assetFrom;
        } else {
            num2 = null;
        }
        if ((268435456 & i3) != 0) {
            c0mja2 = autoCutThemeData.iconDisplayType;
        }
        if ((536870912 & i3) != 0) {
            num3 = autoCutThemeData.iconType;
        } else {
            num3 = null;
        }
        if ((1073741824 & i3) != 0) {
            arrayList = autoCutThemeData.featureBits;
        } else {
            arrayList = null;
        }
        if ((i3 & Integer.MIN_VALUE) != 0) {
            arrayList2 = autoCutThemeData.featureCode;
        } else {
            arrayList2 = null;
        }
        if ((i4 & 1) != 0) {
            enumC543490LTf = autoCutThemeData.downloadState;
        } else {
            enumC543490LTf = null;
        }
        if ((i4 & 2) != 0) {
            str19 = autoCutThemeData.autoPickNleDraft;
        } else {
            str19 = null;
        }
        if ((i4 & 4) != 0) {
            z3 = autoCutThemeData.shouldApplyReuseMusicOnSelect;
        }
        if ((i4 & 8) != 0) {
            musicBuzModel4 = autoCutThemeData.reuseMusicOverrideBuz;
        }
        if ((i4 & 16) != 0) {
            i10 = autoCutThemeData.reuseMusicAlignDisplayIndex;
        }
        if ((i4 & 32) != 0) {
            z4 = autoCutThemeData.serverMusicMatched;
        }
        if ((i4 & 64) != 0) {
            i9 = autoCutThemeData.reuseMusicAlignBranch;
        }
        if ((i4 & 128) != 0) {
            str21 = autoCutThemeData.reuseMusicLocalCoverPath;
        }
        if ((i4 & 256) != 0) {
            str20 = autoCutThemeData.reuseMusicName;
        }
        if ((i4 & 512) != 0) {
            str24 = autoCutThemeData.lyricCoverOverlayUrl;
        }
        autoCutThemeData.getClass();
        return new AutoCutThemeData(i5, i6, str5, i7, str6, str7, str8, str22, str9, str10, musicBuzModel3, z2, str11, str12, str13, str14, set, str15, autoCutCategory, str16, i8, str23, bool2, str17, f, num, str18, num2, c0mja2, num3, arrayList, arrayList2, enumC543490LTf, str19, z3, musicBuzModel4, i10, z4, i9, str21, str20, str24);
    }

    public AutoCutThemeData(int i, int i2, String str, int i3, String str2, String str3, String str4, String str5, String str6, String str7, MusicBuzModel musicBuzModel, boolean z, String str8, String str9, String str10, String str11, Set<String> set, String str12, AutoCutCategory autoCutCategory, String str13, int i4, String str14, Boolean bool, String str15, Float f, Integer num, String str16, Integer num2, C0MJA c0mja, Integer num3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, EnumC543490LTf enumC543490LTf, String str17, boolean z2, MusicBuzModel musicBuzModel2, int i5, boolean z3, int i6, String str18, String str19, String str20) {
        this.source = i;
        this.indexFromSource = i2;
        this.templateId = str;
        this.templateType = i3;
        this.nickName = str2;
        this.templateUrl = str3;
        this.templateData = str4;
        this.musicId = str5;
        this.coverUrl = str6;
        this.name = str7;
        this.musicBuzModel = musicBuzModel;
        this.isPreset = z;
        this.templateGroupId = str8;
        this.templateTag = str9;
        this.sceneType = str10;
        this.anchorName = str11;
        this.preloadUrsSet = set;
        this.nleLogId = str12;
        this.category = autoCutCategory;
        this.subtitle = str13;
        this.addFilterToCover = i4;
        this.musicUrl = str14;
        this.musicPostUnavailable = bool;
        this.musicPath = str15;
        this.musicVolume = f;
        this.musicStartTime = num;
        this.uuid = str16;
        this.assetFrom = num2;
        this.iconDisplayType = c0mja;
        this.iconType = num3;
        this.featureBits = arrayList;
        this.featureCode = arrayList2;
        this.downloadState = enumC543490LTf;
        this.autoPickNleDraft = str17;
        this.shouldApplyReuseMusicOnSelect = z2;
        this.reuseMusicOverrideBuz = musicBuzModel2;
        this.reuseMusicAlignDisplayIndex = i5;
        this.serverMusicMatched = z3;
        this.reuseMusicAlignBranch = i6;
        this.reuseMusicLocalCoverPath = str18;
        this.reuseMusicName = str19;
        this.lyricCoverOverlayUrl = str20;
    }
}
