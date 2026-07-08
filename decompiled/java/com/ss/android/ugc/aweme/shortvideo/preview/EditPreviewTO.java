package com.ss.android.ugc.aweme.shortvideo.preview;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.preview.EditPreviewTO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class EditPreviewTO implements Parcelable {
    public static final Parcelable.Creator<EditPreviewTO> CREATOR = new Parcelable.Creator<EditPreviewTO>() { // from class: X.0mg8
        @Override // android.os.Parcelable.Creator
        public final EditPreviewTO createFromParcel(Parcel parcel) {
            return new EditPreviewTO((FilterBean) parcel.readParcelable(EditPreviewTO.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditPreviewTO[] newArray(int i) {
            return new EditPreviewTO[i];
        }
    };
    public final FilterBean filterBean;
    public final String filterIntensityStoreTag;

    public final EditPreviewTO copy(FilterBean filterBean, String str) {
        return new EditPreviewTO(filterBean, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPreviewTO)) {
            return false;
        }
        EditPreviewTO editPreviewTO = (EditPreviewTO) obj;
        return Intrinsics.LJFF(this.filterBean, editPreviewTO.filterBean) && Intrinsics.LJFF(this.filterIntensityStoreTag, editPreviewTO.filterIntensityStoreTag);
    }

    public int hashCode() {
        FilterBean filterBean = this.filterBean;
        return ((filterBean == null ? 0 : filterBean.hashCode()) * 31) + this.filterIntensityStoreTag.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditPreviewTO(filterBean=");
        sbLIZ.append(this.filterBean);
        sbLIZ.append(", filterIntensityStoreTag=");
        sbLIZ.append(this.filterIntensityStoreTag);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.filterBean, i);
        parcel.writeString(this.filterIntensityStoreTag);
    }

    public final FilterBean getFilterBean() {
        return this.filterBean;
    }

    public final String getFilterIntensityStoreTag() {
        return this.filterIntensityStoreTag;
    }

    public EditPreviewTO(FilterBean filterBean, String str) {
        this.filterBean = filterBean;
        this.filterIntensityStoreTag = str;
    }
}
