package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.TemplateDynamicSlotModel;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateDynamicSlotModel implements Parcelable {
    public static final Parcelable.Creator<TemplateDynamicSlotModel> CREATOR = new Parcelable.Creator<TemplateDynamicSlotModel>() { // from class: X.0mrf
        @Override // android.os.Parcelable.Creator
        public final TemplateDynamicSlotModel createFromParcel(Parcel parcel) {
            return new TemplateDynamicSlotModel(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateDynamicSlotModel[] newArray(int i) {
            return new TemplateDynamicSlotModel[i];
        }
    };

    @C09CT("tt_template_content_cnt")
    public int contentCount;

    @C09CT("tt_template_content_duration")
    public String contentDuration;

    @C09CT("is_use_same_content")
    public int isUseSameContent;

    @C09CT("tt_template_non_replaceable_content_loc")
    public String nonReplaceableContentLoc;

    @C09CT("tt_template_reuse_content_cnt")
    public int reuseContentCount;

    @C09CT("tt_template_id")
    public String templateId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeInt(this.contentCount);
        parcel.writeInt(this.reuseContentCount);
        parcel.writeString(this.nonReplaceableContentLoc);
        parcel.writeString(this.contentDuration);
        parcel.writeInt(this.isUseSameContent);
    }

    public TemplateDynamicSlotModel() {
        this("", 0, 0, "", "", 0);
    }

    public TemplateDynamicSlotModel(String str, int i, int i2, String str2, String str3, int i3) {
        this.templateId = str;
        this.contentCount = i;
        this.reuseContentCount = i2;
        this.nonReplaceableContentLoc = str2;
        this.contentDuration = str3;
        this.isUseSameContent = i3;
    }
}
