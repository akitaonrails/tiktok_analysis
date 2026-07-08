package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import X.C0LAG;
import X.C0MY0;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;

/* JADX INFO: loaded from: classes9.dex */
public final class UgcTemplateData implements Parcelable {

    @C09CT("anchor_template_used_functions")
    public String anchorTemplateUsedFunctions;

    @C09CT("aweme_music_info")
    public MusicInfo awemeMusicInfo;

    @C09CT("enable_publish_as_template")
    public boolean enablePublishAsTemplate;

    @C09CT("is_from_ep_template_anchor")
    public boolean isFromEPTemplateAnchor;

    @C09CT("pugc_from_autocut_anchor")
    public boolean isPUGCTemplateFromAutoCutAnchor;

    @C09CT("pugc_from_mv_anchor")
    public boolean isPUGCTemplateFromMVAnchor;

    @C09CT("is_pugc_template_from_anchor")
    public boolean isPUgcTemplateFromAnchor;

    @C09CT("is_ugc_template_from_anchor")
    public boolean isUgcTemplateFromAnchor;

    @C09CT("mdp_recommend_template_info")
    public MDPRecommendTemplateInfo mdpRecommendTemplateInfo;

    @C040H
    public String musicId;

    @C09CT("original_normalized_nle_path")
    @C0MY0
    public String originalNormalizedNLEPath;

    @C040H
    public Boolean showOriginTemplateAnchor;

    @C09CT("ugc_template_complexity")
    public TemplateComplexity templateComplexity;

    @C09CT("template_music_info")
    public MusicInfo templateMusicInfo;

    @C09CT("template_tags")
    public String templateTags;

    @C09CT("ugc_template_id")
    public String ugcTemplateId;

    @C09CT("ugc_template_origin_anchor")
    public AnchorCommonStruct ugcTemplateOriginAnchor;

    @C09CT("ugc_template_tag")
    public String ugcTemplateTag;

    @C09CT("ugc_template_version")
    public Integer ugcTemplateVersion;

    @C09CT("ugc_template_zip_url")
    public String ugcTemplateZipUrl;
    public static final C0LAG Companion = new Object() { // from class: X.0LAG
    };
    public static final Parcelable.Creator<UgcTemplateData> CREATOR = new Parcelable.Creator<UgcTemplateData>() { // from class: X.0L2w
        @Override // android.os.Parcelable.Creator
        public final UgcTemplateData createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Integer numValueOf;
            boolean z3;
            Boolean boolValueOf;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            TemplateComplexity templateComplexityCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            MDPRecommendTemplateInfo mDPRecommendTemplateInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolValueOf = Boolean.valueOf(z3);
            }
            String string2 = parcel.readString();
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) parcel.readSerializable();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() == 0) {
                templateComplexityCreateFromParcel = null;
            } else {
                templateComplexityCreateFromParcel = TemplateComplexity.CREATOR.createFromParcel(parcel);
            }
            TemplateComplexity templateComplexity = templateComplexityCreateFromParcel;
            MusicInfo musicInfo = (MusicInfo) parcel.readParcelable(UgcTemplateData.class.getClassLoader());
            MusicInfo musicInfo2 = (MusicInfo) parcel.readParcelable(UgcTemplateData.class.getClassLoader());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                mDPRecommendTemplateInfoCreateFromParcel = MDPRecommendTemplateInfo.CREATOR.createFromParcel(parcel);
            }
            return new UgcTemplateData(z, z2, numValueOf, string, boolValueOf, string2, anchorCommonStruct, string3, string4, z4, z5, string5, z6, z7, templateComplexity, musicInfo, musicInfo2, string6, string7, mDPRecommendTemplateInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UgcTemplateData[] newArray(int i) {
            return new UgcTemplateData[i];
        }
    };

    public UgcTemplateData() {
        this(false, false, null, null, null, null, null, null, null, false, false, "", false, false, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isPUgcTemplateFromAnchor ? 1 : 0);
        parcel.writeInt(this.isUgcTemplateFromAnchor ? 1 : 0);
        Integer num = this.ugcTemplateVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.ugcTemplateZipUrl);
        Boolean bool = this.showOriginTemplateAnchor;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.ugcTemplateId);
        parcel.writeSerializable(this.ugcTemplateOriginAnchor);
        parcel.writeString(this.originalNormalizedNLEPath);
        parcel.writeString(this.ugcTemplateTag);
        parcel.writeInt(this.enablePublishAsTemplate ? 1 : 0);
        parcel.writeInt(this.isFromEPTemplateAnchor ? 1 : 0);
        parcel.writeString(this.anchorTemplateUsedFunctions);
        parcel.writeInt(this.isPUGCTemplateFromAutoCutAnchor ? 1 : 0);
        parcel.writeInt(this.isPUGCTemplateFromMVAnchor ? 1 : 0);
        TemplateComplexity templateComplexity = this.templateComplexity;
        if (templateComplexity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateComplexity.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.awemeMusicInfo, i);
        parcel.writeParcelable(this.templateMusicInfo, i);
        parcel.writeString(this.musicId);
        parcel.writeString(this.templateTags);
        MDPRecommendTemplateInfo mDPRecommendTemplateInfo = this.mdpRecommendTemplateInfo;
        if (mDPRecommendTemplateInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mDPRecommendTemplateInfo.writeToParcel(parcel, i);
        }
    }

    public UgcTemplateData(boolean z, boolean z2, Integer num, String str, Boolean bool, String str2, AnchorCommonStruct anchorCommonStruct, String str3, String str4, boolean z3, boolean z4, String str5, boolean z5, boolean z6, TemplateComplexity templateComplexity, MusicInfo musicInfo, MusicInfo musicInfo2, String str6, String str7, MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        this.isPUgcTemplateFromAnchor = z;
        this.isUgcTemplateFromAnchor = z2;
        this.ugcTemplateVersion = num;
        this.ugcTemplateZipUrl = str;
        this.showOriginTemplateAnchor = bool;
        this.ugcTemplateId = str2;
        this.ugcTemplateOriginAnchor = anchorCommonStruct;
        this.originalNormalizedNLEPath = str3;
        this.ugcTemplateTag = str4;
        this.enablePublishAsTemplate = z3;
        this.isFromEPTemplateAnchor = z4;
        this.anchorTemplateUsedFunctions = str5;
        this.isPUGCTemplateFromAutoCutAnchor = z5;
        this.isPUGCTemplateFromMVAnchor = z6;
        this.templateComplexity = templateComplexity;
        this.awemeMusicInfo = musicInfo;
        this.templateMusicInfo = musicInfo2;
        this.musicId = str6;
        this.templateTags = str7;
        this.mdpRecommendTemplateInfo = mDPRecommendTemplateInfo;
    }
}
