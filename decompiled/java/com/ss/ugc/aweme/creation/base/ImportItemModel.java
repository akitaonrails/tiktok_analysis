package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import X.EnumC568840MSs;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import com.ss.ugc.aweme.creation.base.ImportItemModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class ImportItemModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImportItemModel> CREATOR = new Parcelable.Creator<ImportItemModel>() { // from class: X.0MT2
        @Override // android.os.Parcelable.Creator
        public final ImportItemModel createFromParcel(Parcel parcel) {
            return new ImportItemModel(parcel.readString(), (EnumC568840MSs) C08FF.LIZ(EnumC568840MSs.class, parcel.readString()), parcel.readString(), (DependencyInfo) parcel.readParcelable(ImportItemModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImportItemModel[] newArray(int i) {
            return new ImportItemModel[i];
        }
    };

    @C09CT("dependency_info")
    public DependencyInfo dependencyInfo;

    @C09CT("download_url")
    public String downloadUrl;

    @C09CT("path")
    public String path;

    @C09CT("type")
    public EnumC568840MSs type;

    public ImportItemModel() {
        this("", EnumC568840MSs.ImportItemType_UNDEFINED, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.type.name());
        parcel.writeString(this.downloadUrl);
        parcel.writeParcelable(this.dependencyInfo, i);
    }

    public final DependencyInfo getDependencyInfo() {
        return this.dependencyInfo;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getPath() {
        return this.path;
    }

    public final EnumC568840MSs getType() {
        return this.type;
    }

    public final void setDependencyInfo(DependencyInfo dependencyInfo) {
        this.dependencyInfo = dependencyInfo;
    }

    public final void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setType(EnumC568840MSs enumC568840MSs) {
        this.type = enumC568840MSs;
    }

    public ImportItemModel(String str, EnumC568840MSs enumC568840MSs, String str2, DependencyInfo dependencyInfo) {
        this.path = str;
        this.type = enumC568840MSs;
        this.downloadUrl = str2;
        this.dependencyInfo = dependencyInfo;
    }
}
