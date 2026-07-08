package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.DependencyInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DependencyInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DependencyInfo> CREATOR = new Parcelable.Creator<DependencyInfo>() { // from class: X.0Mi9
        @Override // android.os.Parcelable.Creator
        public final DependencyInfo createFromParcel(Parcel parcel) {
            return new DependencyInfo(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final DependencyInfo[] newArray(int i) {
            return new DependencyInfo[i];
        }
    };

    @C09CT("depend_id")
    public String dependId;

    @C09CT("dependencies")
    public List<String> dependencies;

    public DependencyInfo() {
        this(null, new ArrayList());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.dependId);
        parcel.writeStringList(this.dependencies);
    }

    public final String getDependId() {
        return this.dependId;
    }

    public final List<String> getDependencies() {
        return this.dependencies;
    }

    public final void setDependId(String str) {
        this.dependId = str;
    }

    public final void setDependencies(List<String> list) {
        this.dependencies = list;
    }

    public DependencyInfo(String str, List<String> list) {
        this.dependId = str;
        this.dependencies = list;
    }
}
