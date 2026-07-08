package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class MDPRecommendTemplateInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<MDPRecommendTemplateInfo> CREATOR = new Parcelable.Creator<MDPRecommendTemplateInfo>() { // from class: X.0mVH
        @Override // android.os.Parcelable.Creator
        public final MDPRecommendTemplateInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MDPRecommendTemplateInfo(string, string2, numValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MDPRecommendTemplateInfo[] newArray(int i) {
            return new MDPRecommendTemplateInfo[i];
        }
    };

    @C09CT("music_id")
    public String musicId;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_rec_reason")
    public String templateRecommendReason;

    @C09CT("template_type")
    public String templateType;

    @C09CT("tt_template_group_id")
    public String ttTemplateGroupId;

    @C09CT("tt_template_pin_type")
    public Integer ttTemplatePinType;

    public MDPRecommendTemplateInfo() {
        this(null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.ttTemplateGroupId);
        parcel.writeString(this.templateRecommendReason);
        Integer num = this.ttTemplatePinType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.templateId);
        parcel.writeString(this.templateType);
        parcel.writeString(this.musicId);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateRecommendReason() {
        return this.templateRecommendReason;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final String getTtTemplateGroupId() {
        return this.ttTemplateGroupId;
    }

    public final Integer getTtTemplatePinType() {
        return this.ttTemplatePinType;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateRecommendReason(String str) {
        this.templateRecommendReason = str;
    }

    public final void setTemplateType(String str) {
        this.templateType = str;
    }

    public final void setTtTemplateGroupId(String str) {
        this.ttTemplateGroupId = str;
    }

    public final void setTtTemplatePinType(Integer num) {
        this.ttTemplatePinType = num;
    }

    public MDPRecommendTemplateInfo(String str, String str2, Integer num, String str3, String str4, String str5) {
        this.ttTemplateGroupId = str;
        this.templateRecommendReason = str2;
        this.ttTemplatePinType = num;
        this.templateId = str3;
        this.templateType = str4;
        this.musicId = str5;
    }
}
