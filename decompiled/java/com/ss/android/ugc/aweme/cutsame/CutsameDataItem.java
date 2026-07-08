package com.ss.android.ugc.aweme.cutsame;

import X.C09CT;
import X.C1412660mrg;
import X.C1417920n0A;
import X.C201955140j;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1412640mre;
import X.InterfaceC1419170n2B;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutSameCategory;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class CutsameDataItem implements Parcelable, InterfaceC1419170n2B {

    @C09CT("ai_template_func_list")
    public String aiTemplateFuncList;

    @C09CT("template_anchor_name")
    public String anchorName;

    @C09CT("asset_from")
    public final Integer assetFrom;

    @C09CT("author")
    public final AuthorInfo author;

    @C09CT("challenge")
    public final ArrayList<String> challengeIds;

    @C09CT("category")
    public CutSameCategory cutSameCategory;

    @C09CT("date")
    public Long date;

    @C09CT("description")
    public final String description;

    @C09CT("distribution_extra")
    public final String distributionExtra;

    @C09CT("extra")
    public final String extra;

    @C09CT("feature_bits")
    public final ArrayList<Long> featureBits;

    @C09CT("feature_code")
    public final ArrayList<Long> featureCode;

    @C09CT("fragment_count")
    public final int fragmentCount;

    @C09CT("icon_type")
    public final Integer iconType;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_ai_create_template")
    public final boolean isAICreteTemplate;

    @C09CT("is_commercial_music")
    public final boolean isCommerceMusic;

    @C09CT("is_music_matched")
    public final Boolean isMusicMatched;
    public int isMvAnchor;

    @C09CT("is_pin")
    public Boolean isPin;

    @C09CT("loki_extra")
    public final String loki_extra;
    public transient String lyricCoverUrl;

    @C09CT("max_media_size")
    public final int maxMediaSize;

    @C09CT("md5")
    public final String md5;

    @C09CT("music_model")
    public Music music;

    @C09CT("music")
    public ArrayList<String> musicIds;

    @C09CT("music_post_unavailable")
    public Boolean musicPostUnavailable;

    @C09CT("music_url")
    public String musicUrl;

    @C09CT("region")
    public final String region;

    @C09CT("scene_type")
    public final String sceneType;

    @C09CT("sdk_version")
    public final String sdkVersion;

    @C09CT("source_id")
    public final Integer source;

    @C09CT("subtitle")
    public String subtitle;

    @C09CT("template_complexity_score")
    public final float templateComplexityScore;

    @C09CT("template_json")
    public final String templateData;

    @C09CT("template_group_id")
    public final String templateGroupId;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_tag")
    public String templateTag;

    @C09CT("template_type")
    public final int templateType;

    @C09CT("template_url")
    public final String templateUrl;

    @C09CT("title")
    public final String title;

    @C09CT("urs")
    public final ArrayList<String> ursList;

    @C09CT("usage_amount")
    public final long usageAmount;

    @C09CT("video")
    public final CutSameVideo video;

    @C09CT("aspect_ratio")
    public final String videoRatio;
    public static final C1417920n0A Companion = new Object() { // from class: X.0n0A
    };
    public static final Parcelable.Creator<CutsameDataItem> CREATOR = new Parcelable.Creator<CutsameDataItem>() { // from class: X.0mvi
        @Override // android.os.Parcelable.Creator
        public final CutsameDataItem createFromParcel(Parcel parcel) {
            CutSameVideo cutSameVideoCreateFromParcel;
            Integer numValueOf;
            boolean z;
            AuthorInfo authorInfoCreateFromParcel;
            boolean z2;
            Boolean boolValueOf;
            CutSameCategory cutSameCategoryCreateFromParcel;
            boolean z3;
            Boolean boolValueOf2;
            Integer numValueOf2;
            boolean z4;
            Long lValueOf;
            Integer numValueOf3;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                cutSameVideoCreateFromParcel = null;
            } else {
                cutSameVideoCreateFromParcel = CutSameVideo.CREATOR.createFromParcel(parcel);
            }
            CutSameVideo cutSameVideo = cutSameVideoCreateFromParcel;
            int i2 = parcel.readInt();
            long j = parcel.readLong();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i3 = parcel.readInt();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                authorInfoCreateFromParcel = null;
            } else {
                authorInfoCreateFromParcel = AuthorInfo.CREATOR.createFromParcel(parcel);
            }
            AuthorInfo authorInfo = authorInfoCreateFromParcel;
            Music music = (Music) parcel.readSerializable();
            String string12 = parcel.readString();
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
            int i4 = parcel.readInt();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                cutSameCategoryCreateFromParcel = null;
            } else {
                cutSameCategoryCreateFromParcel = CutSameCategory.CREATOR.createFromParcel(parcel);
            }
            CutSameCategory cutSameCategory = cutSameCategoryCreateFromParcel;
            float f = parcel.readFloat();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf2 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList2 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            String string18 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                boolValueOf3 = Boolean.valueOf(z5);
            }
            return new CutsameDataItem(string, i, string2, string3, string4, string5, cutSameVideo, i2, j, string6, string7, string8, string9, numValueOf, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z, i3, string10, string11, authorInfo, music, string12, boolValueOf, i4, string13, string14, arrayListCreateStringArrayList3, cutSameCategory, f, string15, string16, boolValueOf2, numValueOf2, z4, lValueOf, string17, numValueOf3, arrayList, arrayList2, string18, boolValueOf3, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CutsameDataItem[] newArray(int i) {
            return new CutsameDataItem[i];
        }
    };
    public static final int $stable = 8;

    public CutsameDataItem() {
        this("", EnumC1412640mre.CUT_SAME.getValue(), "not_set", "not_set", "not_set", null, null, 0, 0L, "not_set", "not_set", "not_set", null, null, new ArrayList(), new ArrayList(), false, 0, "", "", null, null, null, Boolean.FALSE, 0, null, null, new ArrayList(), null, -1.0f, null, null, null, null, false, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutsameDataItem)) {
            return false;
        }
        CutsameDataItem cutsameDataItem = (CutsameDataItem) obj;
        return Intrinsics.LJFF(this.templateId, cutsameDataItem.templateId) && this.templateType == cutsameDataItem.templateType && Intrinsics.LJFF(this.title, cutsameDataItem.title) && Intrinsics.LJFF(this.description, cutsameDataItem.description) && Intrinsics.LJFF(this.templateUrl, cutsameDataItem.templateUrl) && Intrinsics.LJFF(this.templateData, cutsameDataItem.templateData) && Intrinsics.LJFF(this.video, cutsameDataItem.video) && this.fragmentCount == cutsameDataItem.fragmentCount && this.usageAmount == cutsameDataItem.usageAmount && Intrinsics.LJFF(this.extra, cutsameDataItem.extra) && Intrinsics.LJFF(this.sdkVersion, cutsameDataItem.sdkVersion) && Intrinsics.LJFF(this.md5, cutsameDataItem.md5) && Intrinsics.LJFF(this.iconUrl, cutsameDataItem.iconUrl) && Intrinsics.LJFF(this.source, cutsameDataItem.source) && Intrinsics.LJFF(this.musicIds, cutsameDataItem.musicIds) && Intrinsics.LJFF(this.challengeIds, cutsameDataItem.challengeIds) && this.isCommerceMusic == cutsameDataItem.isCommerceMusic && this.maxMediaSize == cutsameDataItem.maxMediaSize && Intrinsics.LJFF(this.region, cutsameDataItem.region) && Intrinsics.LJFF(this.videoRatio, cutsameDataItem.videoRatio) && Intrinsics.LJFF(this.author, cutsameDataItem.author) && Intrinsics.LJFF(this.music, cutsameDataItem.music) && Intrinsics.LJFF(this.musicUrl, cutsameDataItem.musicUrl) && Intrinsics.LJFF(this.musicPostUnavailable, cutsameDataItem.musicPostUnavailable) && this.isMvAnchor == cutsameDataItem.isMvAnchor && Intrinsics.LJFF(this.templateGroupId, cutsameDataItem.templateGroupId) && Intrinsics.LJFF(this.templateTag, cutsameDataItem.templateTag) && Intrinsics.LJFF(this.ursList, cutsameDataItem.ursList) && Intrinsics.LJFF(this.cutSameCategory, cutsameDataItem.cutSameCategory) && Float.compare(this.templateComplexityScore, cutsameDataItem.templateComplexityScore) == 0 && Intrinsics.LJFF(this.anchorName, cutsameDataItem.anchorName) && Intrinsics.LJFF(this.subtitle, cutsameDataItem.subtitle) && Intrinsics.LJFF(this.isPin, cutsameDataItem.isPin) && Intrinsics.LJFF(this.assetFrom, cutsameDataItem.assetFrom) && this.isAICreteTemplate == cutsameDataItem.isAICreteTemplate && Intrinsics.LJFF(this.date, cutsameDataItem.date) && Intrinsics.LJFF(this.aiTemplateFuncList, cutsameDataItem.aiTemplateFuncList) && Intrinsics.LJFF(this.iconType, cutsameDataItem.iconType) && Intrinsics.LJFF(this.featureBits, cutsameDataItem.featureBits) && Intrinsics.LJFF(this.featureCode, cutsameDataItem.featureCode) && Intrinsics.LJFF(this.distributionExtra, cutsameDataItem.distributionExtra) && Intrinsics.LJFF(this.isMusicMatched, cutsameDataItem.isMusicMatched) && Intrinsics.LJFF(this.loki_extra, cutsameDataItem.loki_extra) && Intrinsics.LJFF(this.sceneType, cutsameDataItem.sceneType);
    }

    public final String toString() {
        return "CutsameDataItem(templateId=" + this.templateId + ", templateType=" + this.templateType + ", title=" + this.title + ", description=" + this.description + ", templateUrl=" + this.templateUrl + ", templateData=" + this.templateData + ", video=" + this.video + ", fragmentCount=" + this.fragmentCount + ", usageAmount=" + this.usageAmount + ", extra=" + this.extra + ", sdkVersion=" + this.sdkVersion + ", md5=" + this.md5 + ", iconUrl=" + this.iconUrl + ", source=" + this.source + ", musicIds=" + this.musicIds + ", challengeIds=" + this.challengeIds + ", isCommerceMusic=" + this.isCommerceMusic + ", maxMediaSize=" + this.maxMediaSize + ", region=" + this.region + ", videoRatio=" + this.videoRatio + ", author=" + this.author + ", music=" + this.music + ", musicUrl=" + this.musicUrl + ", musicPostUnavailable=" + this.musicPostUnavailable + ", isMvAnchor=" + this.isMvAnchor + ", templateGroupId=" + this.templateGroupId + ", templateTag=" + this.templateTag + ", ursList=" + this.ursList + ", cutSameCategory=" + this.cutSameCategory + ", templateComplexityScore=" + this.templateComplexityScore + ", anchorName=" + this.anchorName + ", subtitle=" + this.subtitle + ", isPin=" + this.isPin + ", assetFrom=" + this.assetFrom + ", isAICreteTemplate=" + this.isAICreteTemplate + ", date=" + this.date + ", aiTemplateFuncList=" + this.aiTemplateFuncList + ", iconType=" + this.iconType + ", featureBits=" + this.featureBits + ", featureCode=" + this.featureCode + ", distributionExtra=" + this.distributionExtra + ", isMusicMatched=" + this.isMusicMatched + ", loki_extra=" + this.loki_extra + ", sceneType=" + this.sceneType + ')';
    }

    @Override // X.InterfaceC1419170n2B
    public final VideoUrlModel LIZ() {
        CutSameVideo cutSameVideo = this.video;
        if (cutSameVideo == null || cutSameVideo.videoUri == null || cutSameVideo.videoUrl == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setBytevc1(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.video.videoUrl);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.video.videoUri);
        videoUrlModel.setUri(this.video.videoUri);
        return videoUrlModel;
    }

    @Override // X.InterfaceC1419170n2B
    public final EnumC1412640mre LIZIZ() {
        EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(this.templateType);
        return enumC1412640mreLIZJ == null ? EnumC1412640mre.CUT_SAME : enumC1412640mreLIZJ;
    }

    public final float LIZJ() {
        try {
            if (a0.LJJLIIIJILLIZJL(this.videoRatio, new String[]{":"}, 0, 6).size() != 2) {
                return 0.0f;
            }
            return CastIntegerProtector.valueOf((String) r3.get(1)).intValue() / CastIntegerProtector.valueOf((String) r3.get(0)).intValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cutsame AspectRatio");
            sbLIZ.append(e.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return 0.0f;
        }
    }

    public final boolean LIZLLL() {
        return (TextUtils.isEmpty(this.templateUrl) || TextUtils.isEmpty(this.extra) || TextUtils.isEmpty(this.md5)) ? false : true;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.templateId.hashCode() * 31) + this.templateType) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.templateUrl.hashCode()) * 31;
        String str = this.templateData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CutSameVideo cutSameVideo = this.video;
        int iHashCode3 = (((((((((iHashCode2 + (cutSameVideo == null ? 0 : cutSameVideo.hashCode())) * 31) + this.fragmentCount) * 31) + C786410Ut5.Y2(this.usageAmount)) * 31) + this.extra.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31;
        String str2 = this.md5;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.source;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList<String> arrayList = this.musicIds;
        int iHashCode7 = (iHashCode6 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.challengeIds;
        int iHashCode8 = (((((((((iHashCode7 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + C786410Ut5.Z2(this.isCommerceMusic)) * 31) + this.maxMediaSize) * 31) + this.region.hashCode()) * 31) + this.videoRatio.hashCode()) * 31;
        AuthorInfo authorInfo = this.author;
        int iHashCode9 = (iHashCode8 + (authorInfo == null ? 0 : authorInfo.hashCode())) * 31;
        Music music = this.music;
        int iHashCode10 = (iHashCode9 + (music == null ? 0 : music.hashCode())) * 31;
        String str4 = this.musicUrl;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.musicPostUnavailable;
        int iHashCode12 = (((iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31) + this.isMvAnchor) * 31;
        String str5 = this.templateGroupId;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.templateTag;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ArrayList<String> arrayList3 = this.ursList;
        int iHashCode15 = (iHashCode14 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        CutSameCategory cutSameCategory = this.cutSameCategory;
        int iHashCode16 = (((iHashCode15 + (cutSameCategory == null ? 0 : cutSameCategory.hashCode())) * 31) + Float.floatToIntBits(this.templateComplexityScore)) * 31;
        String str7 = this.anchorName;
        int iHashCode17 = (iHashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subtitle;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.isPin;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.assetFrom;
        int iHashCode20 = (((iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.isAICreteTemplate)) * 31;
        Long l = this.date;
        int iHashCode21 = (iHashCode20 + (l == null ? 0 : l.hashCode())) * 31;
        String str9 = this.aiTemplateFuncList;
        int iHashCode22 = (iHashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num3 = this.iconType;
        int iHashCode23 = (iHashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ArrayList<Long> arrayList4 = this.featureBits;
        int iHashCode24 = (iHashCode23 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31;
        ArrayList<Long> arrayList5 = this.featureCode;
        int iHashCode25 = (iHashCode24 + (arrayList5 == null ? 0 : arrayList5.hashCode())) * 31;
        String str10 = this.distributionExtra;
        int iHashCode26 = (iHashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.isMusicMatched;
        int iHashCode27 = (iHashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str11 = this.loki_extra;
        int iHashCode28 = (iHashCode27 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sceneType;
        return iHashCode28 + (str12 != null ? str12.hashCode() : 0);
    }

    @Override // X.InterfaceC1419170n2B
    public final String getMvId() {
        return this.templateId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeInt(this.templateType);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.templateUrl);
        parcel.writeString(this.templateData);
        CutSameVideo cutSameVideo = this.video;
        if (cutSameVideo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cutSameVideo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.fragmentCount);
        parcel.writeLong(this.usageAmount);
        parcel.writeString(this.extra);
        parcel.writeString(this.sdkVersion);
        parcel.writeString(this.md5);
        parcel.writeString(this.iconUrl);
        Integer num = this.source;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.musicIds);
        parcel.writeStringList(this.challengeIds);
        parcel.writeInt(this.isCommerceMusic ? 1 : 0);
        parcel.writeInt(this.maxMediaSize);
        parcel.writeString(this.region);
        parcel.writeString(this.videoRatio);
        if (this.author == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
        parcel.writeSerializable(this.music);
        parcel.writeString(this.musicUrl);
        Boolean bool = this.musicPostUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isMvAnchor);
        parcel.writeString(this.templateGroupId);
        parcel.writeString(this.templateTag);
        parcel.writeStringList(this.ursList);
        CutSameCategory cutSameCategory = this.cutSameCategory;
        if (cutSameCategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cutSameCategory.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.templateComplexityScore);
        parcel.writeString(this.anchorName);
        parcel.writeString(this.subtitle);
        Boolean bool2 = this.isPin;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.assetFrom;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.isAICreteTemplate ? 1 : 0);
        Long l = this.date;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.aiTemplateFuncList);
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
            Iterator<Long> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        ArrayList<Long> arrayList2 = this.featureCode;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<Long> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                parcel.writeLong(it3.next().longValue());
            }
        }
        parcel.writeString(this.distributionExtra);
        Boolean bool3 = this.isMusicMatched;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.loki_extra);
        parcel.writeString(this.sceneType);
    }

    public CutsameDataItem(String str, int i, String str2, String str3, String str4, String str5, CutSameVideo cutSameVideo, int i2, long j, String str6, String str7, String str8, String str9, Integer num, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, int i3, String str10, String str11, AuthorInfo authorInfo, Music music, String str12, Boolean bool, int i4, String str13, String str14, ArrayList<String> arrayList3, CutSameCategory cutSameCategory, float f, String str15, String str16, Boolean bool2, Integer num2, boolean z2, Long l, String str17, Integer num3, ArrayList<Long> arrayList4, ArrayList<Long> arrayList5, String str18, Boolean bool3, String str19, String str20) {
        this.templateId = str;
        this.templateType = i;
        this.title = str2;
        this.description = str3;
        this.templateUrl = str4;
        this.templateData = str5;
        this.video = cutSameVideo;
        this.fragmentCount = i2;
        this.usageAmount = j;
        this.extra = str6;
        this.sdkVersion = str7;
        this.md5 = str8;
        this.iconUrl = str9;
        this.source = num;
        this.musicIds = arrayList;
        this.challengeIds = arrayList2;
        this.isCommerceMusic = z;
        this.maxMediaSize = i3;
        this.region = str10;
        this.videoRatio = str11;
        this.author = authorInfo;
        this.music = music;
        this.musicUrl = str12;
        this.musicPostUnavailable = bool;
        this.isMvAnchor = i4;
        this.templateGroupId = str13;
        this.templateTag = str14;
        this.ursList = arrayList3;
        this.cutSameCategory = cutSameCategory;
        this.templateComplexityScore = f;
        this.anchorName = str15;
        this.subtitle = str16;
        this.isPin = bool2;
        this.assetFrom = num2;
        this.isAICreteTemplate = z2;
        this.date = l;
        this.aiTemplateFuncList = str17;
        this.iconType = num3;
        this.featureBits = arrayList4;
        this.featureCode = arrayList5;
        this.distributionExtra = str18;
        this.isMusicMatched = bool3;
        this.loki_extra = str19;
        this.sceneType = str20;
    }
}
