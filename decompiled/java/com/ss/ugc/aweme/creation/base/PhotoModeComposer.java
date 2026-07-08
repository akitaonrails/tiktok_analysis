package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import com.ss.ugc.aweme.creation.base.PhotoModeComposer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PhotoModeComposer implements Parcelable, Serializable {
    public static final Parcelable.Creator<PhotoModeComposer> CREATOR = new Parcelable.Creator<PhotoModeComposer>() { // from class: X.0MT3
        @Override // android.os.Parcelable.Creator
        public final PhotoModeComposer createFromParcel(Parcel parcel) {
            DependencyInfo dependencyInfo = (DependencyInfo) parcel.readParcelable(PhotoModeComposer.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (i != 0) {
                arrayList.add(parcel.readParcelable(PhotoModeComposer.class.getClassLoader()));
                i--;
            }
            return new PhotoModeComposer(dependencyInfo, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeComposer[] newArray(int i) {
            return new PhotoModeComposer[i];
        }
    };

    @C09CT("dependency_info")
    public DependencyInfo dependencyInfo;

    @C09CT("images")
    public List<ImportItemModel> images;

    public PhotoModeComposer() {
        this(null, new ArrayList());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.dependencyInfo, i);
        List<ImportItemModel> list = this.images;
        parcel.writeInt(list.size());
        Iterator<ImportItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable(it2.next(), i);
        }
    }

    public final DependencyInfo getDependencyInfo() {
        return this.dependencyInfo;
    }

    public final List<ImportItemModel> getImages() {
        return this.images;
    }

    public final void setDependencyInfo(DependencyInfo dependencyInfo) {
        this.dependencyInfo = dependencyInfo;
    }

    public final void setImages(List<ImportItemModel> list) {
        this.images = list;
    }

    public PhotoModeComposer(DependencyInfo dependencyInfo, List<ImportItemModel> list) {
        this.dependencyInfo = dependencyInfo;
        this.images = list;
    }
}
