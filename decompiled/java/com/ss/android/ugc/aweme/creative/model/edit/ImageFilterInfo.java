package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateFilterBean;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageFilterInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<ImageFilterInfo> CREATOR = new Parcelable.Creator<ImageFilterInfo>() { // from class: X.0FQZ
        @Override // android.os.Parcelable.Creator
        public final ImageFilterInfo createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            TemplateFilterBean templateFilterBeanCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                templateFilterBeanCreateFromParcel = null;
            } else {
                templateFilterBeanCreateFromParcel = TemplateFilterBean.CREATOR.createFromParcel(parcel);
            }
            return new ImageFilterInfo(string, string2, f, z, string3, z2, templateFilterBeanCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImageFilterInfo[] newArray(int i) {
            return new ImageFilterInfo[i];
        }
    };

    @C09CT("compareKey")
    public String compareKey;

    @C09CT("TemplateFilterBean")
    public TemplateFilterBean filterBean;

    @C09CT("filter_category_key")
    public String filterCategoryKey;

    @C09CT("filterId")
    public String filterId;

    @C09CT("filterIntensityRatio")
    public float filterIntensityRatio;

    @C09CT("filterLabel")
    public String filterLabel;

    @C09CT("is_composer")
    public boolean isComposer;

    @C09CT("needRender")
    public boolean needRender;

    public ImageFilterInfo() {
        this("", null, -1.0f, false, null, false, null, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filterId);
        parcel.writeString(this.filterLabel);
        parcel.writeFloat(this.filterIntensityRatio);
        parcel.writeInt(this.isComposer ? 1 : 0);
        parcel.writeString(this.compareKey);
        parcel.writeInt(this.needRender ? 1 : 0);
        TemplateFilterBean templateFilterBean = this.filterBean;
        if (templateFilterBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            templateFilterBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.filterCategoryKey);
    }

    public final String getCompareKey() {
        return this.compareKey;
    }

    public final TemplateFilterBean getFilterBean() {
        return this.filterBean;
    }

    public final String getFilterCategoryKey() {
        return this.filterCategoryKey;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final float getFilterIntensityRatio() {
        return this.filterIntensityRatio;
    }

    public final String getFilterLabel() {
        return this.filterLabel;
    }

    public final boolean getNeedRender() {
        return this.needRender;
    }

    public final boolean isComposer() {
        return this.isComposer;
    }

    public final ImageFilterInfo copy(ImageFilterInfo imageFilterInfo) {
        this.isComposer = imageFilterInfo.isComposer;
        this.filterId = imageFilterInfo.filterId;
        this.filterLabel = imageFilterInfo.filterLabel;
        this.filterIntensityRatio = imageFilterInfo.filterIntensityRatio;
        this.compareKey = imageFilterInfo.compareKey;
        this.filterBean = imageFilterInfo.filterBean;
        this.filterCategoryKey = imageFilterInfo.filterCategoryKey;
        return this;
    }

    public final boolean isSameFilter(ImageFilterInfo imageFilterInfo) {
        if (this.isComposer != imageFilterInfo.isComposer || !Intrinsics.LJFF(this.filterId, imageFilterInfo.filterId) || this.filterIntensityRatio != imageFilterInfo.filterIntensityRatio) {
            return false;
        }
        return true;
    }

    public final void setCompareKey(String str) {
        this.compareKey = str;
    }

    public final void setComposer(boolean z) {
        this.isComposer = z;
    }

    public final void setFilterBean(TemplateFilterBean templateFilterBean) {
        this.filterBean = templateFilterBean;
    }

    public final void setFilterCategoryKey(String str) {
        this.filterCategoryKey = str;
    }

    public final void setFilterId(String str) {
        this.filterId = str;
    }

    public final void setFilterIntensityRatio(float f) {
        this.filterIntensityRatio = f;
    }

    public final void setFilterLabel(String str) {
        this.filterLabel = str;
    }

    public final void setNeedRender(boolean z) {
        this.needRender = z;
    }

    public ImageFilterInfo(String str, String str2, float f, boolean z, String str3, boolean z2, TemplateFilterBean templateFilterBean, String str4) {
        this.filterId = str;
        this.filterLabel = str2;
        this.filterIntensityRatio = f;
        this.isComposer = z;
        this.compareKey = str3;
        this.needRender = z2;
        this.filterBean = templateFilterBean;
        this.filterCategoryKey = str4;
    }
}
