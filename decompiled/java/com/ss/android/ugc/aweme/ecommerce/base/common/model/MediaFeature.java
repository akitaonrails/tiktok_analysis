package com.ss.android.ugc.aweme.ecommerce.base.common.model;

import X.C1763200vz4;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaFeature;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MediaFeature implements Parcelable, Serializable {
    public final boolean canShowFindSimilarBtn;
    public final boolean canShowInGallery;
    public final boolean canShowTryOnBtn;
    public final boolean needAdjustImageUrl;
    public final String scene;
    public final int type;
    public static final C1763200vz4 Companion = new Object() { // from class: X.0vz4
    };
    public static final Parcelable.Creator<MediaFeature> CREATOR = new Parcelable.Creator<MediaFeature>() { // from class: X.0vya
        @Override // android.os.Parcelable.Creator
        public final MediaFeature createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
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
            return new MediaFeature(z, z2, z3, z4, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaFeature[] newArray(int i) {
            return new MediaFeature[i];
        }
    };
    public static final int $stable = 8;

    public MediaFeature() {
        this(true, true, true, true, 0, null);
    }

    public final MediaFeature copy(boolean z, boolean z2, boolean z3, boolean z4, int i, String str) {
        return new MediaFeature(z, z2, z3, z4, i, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaFeature)) {
            return false;
        }
        MediaFeature mediaFeature = (MediaFeature) obj;
        return this.canShowFindSimilarBtn == mediaFeature.canShowFindSimilarBtn && this.canShowTryOnBtn == mediaFeature.canShowTryOnBtn && this.canShowInGallery == mediaFeature.canShowInGallery && this.needAdjustImageUrl == mediaFeature.needAdjustImageUrl && this.type == mediaFeature.type && Intrinsics.LJFF(this.scene, mediaFeature.scene);
    }

    public int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.canShowFindSimilarBtn) * 31) + C786410Ut5.Z2(this.canShowTryOnBtn)) * 31) + C786410Ut5.Z2(this.canShowInGallery)) * 31) + C786410Ut5.Z2(this.needAdjustImageUrl)) * 31) + this.type) * 31;
        String str = this.scene;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaFeature(canShowFindSimilarBtn=");
        sbLIZ.append(this.canShowFindSimilarBtn);
        sbLIZ.append(", canShowTryOnBtn=");
        sbLIZ.append(this.canShowTryOnBtn);
        sbLIZ.append(", canShowInGallery=");
        sbLIZ.append(this.canShowInGallery);
        sbLIZ.append(", needAdjustImageUrl=");
        sbLIZ.append(this.needAdjustImageUrl);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canShowFindSimilarBtn ? 1 : 0);
        parcel.writeInt(this.canShowTryOnBtn ? 1 : 0);
        parcel.writeInt(this.canShowInGallery ? 1 : 0);
        parcel.writeInt(this.needAdjustImageUrl ? 1 : 0);
        parcel.writeInt(this.type);
        parcel.writeString(this.scene);
    }

    public final boolean getCanShowFindSimilarBtn() {
        return this.canShowFindSimilarBtn;
    }

    public final boolean getCanShowInGallery() {
        return this.canShowInGallery;
    }

    public final boolean getCanShowTryOnBtn() {
        return this.canShowTryOnBtn;
    }

    public final boolean getNeedAdjustImageUrl() {
        return this.needAdjustImageUrl;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getType() {
        return this.type;
    }

    public MediaFeature(boolean z, boolean z2, boolean z3, boolean z4, int i, String str) {
        this.canShowFindSimilarBtn = z;
        this.canShowTryOnBtn = z2;
        this.canShowInGallery = z3;
        this.needAdjustImageUrl = z4;
        this.type = i;
        this.scene = str;
    }
}
