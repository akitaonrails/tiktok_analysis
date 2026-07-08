package com.ss.android.ugc.aweme.creative.model.edit.mixediting;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateMobParams implements Parcelable {
    public static final Parcelable.Creator<TemplateMobParams> CREATOR = new Parcelable.Creator<TemplateMobParams>() { // from class: X.0mcK
        @Override // android.os.Parcelable.Creator
        public final TemplateMobParams createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new TemplateMobParams(string, string2, string3, string4, i, string5, string6, string7, boolValueOf, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateMobParams[] newArray(int i) {
            return new TemplateMobParams[i];
        }
    };

    @C09CT("anchor_name")
    public final String anchorName;

    @C09CT("asset_from")
    public final Integer assetFrom;

    @C09CT("autocut_click_from")
    public final String autocutClickFrom;

    @C09CT("autocut_template_group_id")
    public final String autocutTemplateGroupId;

    @C09CT("autocut_template_id")
    public final String autocutTemplateId;

    @C09CT("autocut_template_type")
    public final int autocutTemplateType;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_post_unavailable")
    public final Boolean musicPostUnavailable;

    @C09CT("scene_type")
    public final String sceneType;

    @C09CT("template_resource_id")
    public final String templateResourceId;

    @C09CT("template_tag")
    public final String templateTag;

    public TemplateMobParams() {
        this("", "", "", "", 0, "", null, "", null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateMobParams)) {
            return false;
        }
        TemplateMobParams templateMobParams = (TemplateMobParams) obj;
        return Intrinsics.LJFF(this.templateResourceId, templateMobParams.templateResourceId) && Intrinsics.LJFF(this.autocutClickFrom, templateMobParams.autocutClickFrom) && Intrinsics.LJFF(this.autocutTemplateGroupId, templateMobParams.autocutTemplateGroupId) && Intrinsics.LJFF(this.autocutTemplateId, templateMobParams.autocutTemplateId) && this.autocutTemplateType == templateMobParams.autocutTemplateType && Intrinsics.LJFF(this.templateTag, templateMobParams.templateTag) && Intrinsics.LJFF(this.anchorName, templateMobParams.anchorName) && Intrinsics.LJFF(this.musicId, templateMobParams.musicId) && Intrinsics.LJFF(this.musicPostUnavailable, templateMobParams.musicPostUnavailable) && Intrinsics.LJFF(this.assetFrom, templateMobParams.assetFrom) && Intrinsics.LJFF(this.sceneType, templateMobParams.sceneType);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.templateResourceId.hashCode() * 31) + this.autocutClickFrom.hashCode()) * 31) + this.autocutTemplateGroupId.hashCode()) * 31) + this.autocutTemplateId.hashCode()) * 31) + this.autocutTemplateType) * 31) + this.templateTag.hashCode()) * 31;
        String str = this.anchorName;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.musicId.hashCode()) * 31;
        Boolean bool = this.musicPostUnavailable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.assetFrom;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.sceneType;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TemplateMobParams(templateResourceId=" + this.templateResourceId + ", autocutClickFrom=" + this.autocutClickFrom + ", autocutTemplateGroupId=" + this.autocutTemplateGroupId + ", autocutTemplateId=" + this.autocutTemplateId + ", autocutTemplateType=" + this.autocutTemplateType + ", templateTag=" + this.templateTag + ", anchorName=" + this.anchorName + ", musicId=" + this.musicId + ", musicPostUnavailable=" + this.musicPostUnavailable + ", assetFrom=" + this.assetFrom + ", sceneType=" + this.sceneType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateResourceId);
        parcel.writeString(this.autocutClickFrom);
        parcel.writeString(this.autocutTemplateGroupId);
        parcel.writeString(this.autocutTemplateId);
        parcel.writeInt(this.autocutTemplateType);
        parcel.writeString(this.templateTag);
        parcel.writeString(this.anchorName);
        parcel.writeString(this.musicId);
        Boolean bool = this.musicPostUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.assetFrom;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.sceneType);
    }

    public TemplateMobParams(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, Boolean bool, Integer num, String str8) {
        this.templateResourceId = str;
        this.autocutClickFrom = str2;
        this.autocutTemplateGroupId = str3;
        this.autocutTemplateId = str4;
        this.autocutTemplateType = i;
        this.templateTag = str5;
        this.anchorName = str6;
        this.musicId = str7;
        this.musicPostUnavailable = bool;
        this.assetFrom = num;
        this.sceneType = str8;
    }
}
