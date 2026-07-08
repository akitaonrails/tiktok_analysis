package com.ss.android.ugc.aweme.shortvideo.album.api.config;

import X.C2188811AlT;
import X.C525770Kjf;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode;

/* JADX INFO: loaded from: classes9.dex */
public interface AlbumSelectionMode extends Parcelable {

    public static final class Single implements AlbumSelectionMode {
        public static final Single INSTANCE = new Single();
        public static final Parcelable.Creator<Single> CREATOR = new Parcelable.Creator<Single>() { // from class: X.0Kh2
            @Override // android.os.Parcelable.Creator
            public final AlbumSelectionMode.Single createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AlbumSelectionMode.Single.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final AlbumSelectionMode.Single[] newArray(int i) {
                return new AlbumSelectionMode.Single[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Single);
        }

        public final int hashCode() {
            return 1671537576;
        }

        public final String toString() {
            return "Single";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public static final class Multiple implements AlbumSelectionMode {
        public final int maxCount;
        public final int maxPhotoCount;
        public final int maxVideoCount;
        public final int minCount;
        public final int minPhotoCount;
        public final int minVideoCount;
        public static final C525770Kjf Companion = new Object() { // from class: X.0Kjf
        };
        public static final Parcelable.Creator<Multiple> CREATOR = new Parcelable.Creator<Multiple>() { // from class: X.0Kje
            @Override // android.os.Parcelable.Creator
            public final AlbumSelectionMode.Multiple createFromParcel(Parcel parcel) {
                return new AlbumSelectionMode.Multiple(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final AlbumSelectionMode.Multiple[] newArray(int i) {
                return new AlbumSelectionMode.Multiple[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Multiple)) {
                return false;
            }
            Multiple multiple = (Multiple) obj;
            return this.minPhotoCount == multiple.minPhotoCount && this.maxPhotoCount == multiple.maxPhotoCount && this.minVideoCount == multiple.minVideoCount && this.maxVideoCount == multiple.maxVideoCount && this.minCount == multiple.minCount && this.maxCount == multiple.maxCount;
        }

        public final int hashCode() {
            return (((((((((this.minPhotoCount * 31) + this.maxPhotoCount) * 31) + this.minVideoCount) * 31) + this.maxVideoCount) * 31) + this.minCount) * 31) + this.maxCount;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Multiple(minPhotoCount=");
            sbLIZ.append(this.minPhotoCount);
            sbLIZ.append(", maxPhotoCount=");
            sbLIZ.append(this.maxPhotoCount);
            sbLIZ.append(", minVideoCount=");
            sbLIZ.append(this.minVideoCount);
            sbLIZ.append(", maxVideoCount=");
            sbLIZ.append(this.maxVideoCount);
            sbLIZ.append(", minCount=");
            sbLIZ.append(this.minCount);
            sbLIZ.append(", maxCount=");
            sbLIZ.append(this.maxCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.minPhotoCount);
            parcel.writeInt(this.maxPhotoCount);
            parcel.writeInt(this.minVideoCount);
            parcel.writeInt(this.maxVideoCount);
            parcel.writeInt(this.minCount);
            parcel.writeInt(this.maxCount);
        }

        public Multiple(int i, int i2, int i3, int i4, int i5, int i6) {
            this.minPhotoCount = i;
            this.maxPhotoCount = i2;
            this.minVideoCount = i3;
            this.maxVideoCount = i4;
            this.minCount = i5;
            this.maxCount = i6;
        }
    }
}
