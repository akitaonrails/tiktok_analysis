package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.CollectionInfoParcelableForShoot;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CollectionInfoParcelableForShoot implements Serializable, Parcelable {
    public static final Parcelable.Creator<CollectionInfoParcelableForShoot> CREATOR = new Parcelable.Creator<CollectionInfoParcelableForShoot>() { // from class: X.0nfe
        @Override // android.os.Parcelable.Creator
        public final CollectionInfoParcelableForShoot createFromParcel(Parcel parcel) {
            return new CollectionInfoParcelableForShoot(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionInfoParcelableForShoot[] newArray(int i) {
            return new CollectionInfoParcelableForShoot[i];
        }
    };
    public final String collectionId;
    public final String coverUrl;
    public final String entryPoint;
    public final String name;

    public final CollectionInfoParcelableForShoot copy(String str, String str2, String str3, String str4) {
        return new CollectionInfoParcelableForShoot(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionInfoParcelableForShoot)) {
            return false;
        }
        CollectionInfoParcelableForShoot collectionInfoParcelableForShoot = (CollectionInfoParcelableForShoot) obj;
        return Intrinsics.LJFF(this.collectionId, collectionInfoParcelableForShoot.collectionId) && Intrinsics.LJFF(this.coverUrl, collectionInfoParcelableForShoot.coverUrl) && Intrinsics.LJFF(this.name, collectionInfoParcelableForShoot.name) && Intrinsics.LJFF(this.entryPoint, collectionInfoParcelableForShoot.entryPoint);
    }

    public int hashCode() {
        int iHashCode = this.collectionId.hashCode() * 31;
        String str = this.coverUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entryPoint;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectionInfoParcelableForShoot(collectionId=");
        sbLIZ.append(this.collectionId);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", entryPoint=");
        sbLIZ.append(this.entryPoint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.collectionId);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.entryPoint);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getName() {
        return this.name;
    }

    public CollectionInfoParcelableForShoot(String str, String str2, String str3, String str4) {
        this.collectionId = str;
        this.coverUrl = str2;
        this.name = str3;
        this.entryPoint = str4;
    }
}
