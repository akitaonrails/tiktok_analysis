package com.ss.android.ugc.aweme.creative.model.edit;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateFilterBean;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateFilterBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<TemplateFilterBean> CREATOR = new Parcelable.Creator<TemplateFilterBean>() { // from class: X.0FQY
        @Override // android.os.Parcelable.Creator
        public final TemplateFilterBean createFromParcel(Parcel parcel) {
            return new TemplateFilterBean(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateFilterBean[] newArray(int i) {
            return new TemplateFilterBean[i];
        }
    };

    @C09CT("effectId")
    public long effectId;

    @C09CT("extra")
    public String extra;

    @C09CT("filter_folder")
    public String filterFolder;

    @C09CT("name")
    public String name;

    @C09CT("resource_id")
    public String resId;

    public TemplateFilterBean() {
        this(0L, "", "", "", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.effectId);
        parcel.writeString(this.name);
        parcel.writeString(this.filterFolder);
        parcel.writeString(this.resId);
        parcel.writeString(this.extra);
    }

    public final FilterBean convertToFilterBean() {
        FilterBean filterBean = new FilterBean();
        filterBean.setId(String.valueOf(this.effectId));
        filterBean.setName(this.name);
        filterBean.setEnName(this.name);
        filterBean.setFilterFolder(this.filterFolder);
        filterBean.setFilterFilePath(this.filterFolder);
        filterBean.setResId(this.resId);
        filterBean.setExtra(this.extra);
        return filterBean;
    }

    public final long getEffectId() {
        return this.effectId;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getFilterFolder() {
        return this.filterFolder;
    }

    public final String getName() {
        return this.name;
    }

    public final String getResId() {
        return this.resId;
    }

    public final void setEffectId(long j) {
        this.effectId = j;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFilterFolder(String str) {
        this.filterFolder = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public TemplateFilterBean(long j, String str, String str2, String str3, String str4) {
        this.effectId = j;
        this.name = str;
        this.filterFolder = str2;
        this.resId = str3;
        this.extra = str4;
    }
}
