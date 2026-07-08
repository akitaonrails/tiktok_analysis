package com.ss.android.ugc.aweme.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.ExploreCardDimensionParam;
import com.ss.android.ugc.aweme.model.ExploreToFullPageAnimationParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ExploreToFullPageAnimationParam implements Parcelable {
    public static final Parcelable.Creator<ExploreToFullPageAnimationParam> CREATOR = new Parcelable.Creator<ExploreToFullPageAnimationParam>() { // from class: X.0SQk
        @Override // android.os.Parcelable.Creator
        public final ExploreToFullPageAnimationParam createFromParcel(Parcel parcel) {
            ExploreCardDimensionParam exploreCardDimensionParamCreateFromParcel;
            boolean z;
            if (parcel.readInt() == 0) {
                exploreCardDimensionParamCreateFromParcel = null;
            } else {
                exploreCardDimensionParamCreateFromParcel = ExploreCardDimensionParam.CREATOR.createFromParcel(parcel);
            }
            ExploreCardDimensionParam exploreCardDimensionParam = exploreCardDimensionParamCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ExploreToFullPageAnimationParam(exploreCardDimensionParam, z);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreToFullPageAnimationParam[] newArray(int i) {
            return new ExploreToFullPageAnimationParam[i];
        }
    };
    public final ExploreCardDimensionParam exploreCardDimensionParam;
    public final boolean isRefreshing;

    public ExploreToFullPageAnimationParam() {
        this(null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreToFullPageAnimationParam)) {
            return false;
        }
        ExploreToFullPageAnimationParam exploreToFullPageAnimationParam = (ExploreToFullPageAnimationParam) obj;
        return Intrinsics.LJFF(this.exploreCardDimensionParam, exploreToFullPageAnimationParam.exploreCardDimensionParam) && this.isRefreshing == exploreToFullPageAnimationParam.isRefreshing;
    }

    public final int hashCode() {
        ExploreCardDimensionParam exploreCardDimensionParam = this.exploreCardDimensionParam;
        return ((exploreCardDimensionParam == null ? 0 : exploreCardDimensionParam.hashCode()) * 31) + C786410Ut5.Z2(this.isRefreshing);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreToFullPageAnimationParam(exploreCardDimensionParam=");
        sbLIZ.append(this.exploreCardDimensionParam);
        sbLIZ.append(", isRefreshing=");
        sbLIZ.append(this.isRefreshing);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ExploreCardDimensionParam exploreCardDimensionParam = this.exploreCardDimensionParam;
        if (exploreCardDimensionParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreCardDimensionParam.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isRefreshing ? 1 : 0);
    }

    public ExploreToFullPageAnimationParam(ExploreCardDimensionParam exploreCardDimensionParam, boolean z) {
        this.exploreCardDimensionParam = exploreCardDimensionParam;
        this.isRefreshing = z;
    }
}
