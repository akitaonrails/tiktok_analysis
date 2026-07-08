package com.ss.android.ugc.aweme.creative.model.template;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.creative.model.template.TemplateTabSearchModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;

/* JADX INFO: loaded from: classes23.dex */
public final class MvModel implements Parcelable {
    public static final Parcelable.Creator<MvModel> CREATOR = new Parcelable.Creator<MvModel>() { // from class: X.0mcg
        @Override // android.os.Parcelable.Creator
        public final MvModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            TemplateTabSearchModel templateTabSearchModelCreateFromParcel;
            boolean z3;
            boolean z4;
            boolean z5;
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            String string5 = parcel.readString();
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                templateTabSearchModelCreateFromParcel = null;
            } else {
                templateTabSearchModelCreateFromParcel = TemplateTabSearchModel.CREATOR.createFromParcel(parcel);
            }
            TemplateTabSearchModel templateTabSearchModel = templateTabSearchModelCreateFromParcel;
            MvCreateVideoData mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
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
            return new MvModel(string, i, string2, string3, string4, i2, string5, i3, z, string6, z2, templateTabSearchModel, mvCreateVideoData, z3, z4, z5);
        }

        @Override // android.os.Parcelable.Creator
        public final MvModel[] newArray(int i) {
            return new MvModel[i];
        }
    };

    @C09CT("anchor_name")
    public String anchorName;

    @C09CT("is_from_template_tab_use_now")
    public boolean isFromTemplateTabUseNow;

    @C040H
    public boolean isPhotoMvMode;

    @C040H
    public boolean isPhotoMvMode1080p;

    @C040H
    public boolean isPhotoMvMusic;

    @C040H
    public MvCreateVideoData mvCreateVideoData;

    @C09CT("template_category_key")
    public String templateCategoryKey;

    @C09CT("template_category_name")
    public String templateCategoryName;

    @C09CT("template_from_cache")
    public boolean templateFromCache;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_name")
    public String templateName;

    @C09CT("template_position")
    public int templatePosition;

    @C09CT("template_tab_index")
    public int templateTabIndex;

    @C09CT("template_tab_search_model")
    public TemplateTabSearchModel templateTabSearchModel;

    @C09CT("template_tags")
    public String templateTags;

    @C09CT("template_type")
    public int templateType;

    public MvModel() {
        this(null, -1, null, null, null, -1, null, -1, false, null, false, null, null, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        parcel.writeInt(this.templateType);
        parcel.writeString(this.templateName);
        parcel.writeString(this.anchorName);
        parcel.writeString(this.templateTags);
        parcel.writeInt(this.templateTabIndex);
        parcel.writeString(this.templateCategoryName);
        parcel.writeInt(this.templatePosition);
        parcel.writeInt(this.templateFromCache ? 1 : 0);
        parcel.writeString(this.templateCategoryKey);
        parcel.writeInt(this.isFromTemplateTabUseNow ? 1 : 0);
        TemplateTabSearchModel templateTabSearchModel = this.templateTabSearchModel;
        if (templateTabSearchModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateTabSearchModel.writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeInt(this.isPhotoMvMode ? 1 : 0);
        parcel.writeInt(this.isPhotoMvMode1080p ? 1 : 0);
        parcel.writeInt(this.isPhotoMvMusic ? 1 : 0);
    }

    public MvModel(String str, int i, String str2, String str3, String str4, int i2, String str5, int i3, boolean z, String str6, boolean z2, TemplateTabSearchModel templateTabSearchModel, MvCreateVideoData mvCreateVideoData, boolean z3, boolean z4, boolean z5) {
        this.templateId = str;
        this.templateType = i;
        this.templateName = str2;
        this.anchorName = str3;
        this.templateTags = str4;
        this.templateTabIndex = i2;
        this.templateCategoryName = str5;
        this.templatePosition = i3;
        this.templateFromCache = z;
        this.templateCategoryKey = str6;
        this.isFromTemplateTabUseNow = z2;
        this.templateTabSearchModel = templateTabSearchModel;
        this.mvCreateVideoData = mvCreateVideoData;
        this.isPhotoMvMode = z3;
        this.isPhotoMvMode1080p = z4;
        this.isPhotoMvMusic = z5;
    }
}
