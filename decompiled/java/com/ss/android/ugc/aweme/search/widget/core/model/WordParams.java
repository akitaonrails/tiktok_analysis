package com.ss.android.ugc.aweme.search.widget.core.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.widget.core.model.ExtraInfo;
import com.ss.android.ugc.aweme.search.widget.core.model.WordParams;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class WordParams implements Parcelable, Serializable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WordParams> CREATOR = new Parcelable.Creator<WordParams>() { // from class: X.0QNp
        @Override // android.os.Parcelable.Creator
        public final WordParams createFromParcel(Parcel parcel) {
            ExtraInfo extraInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                extraInfoCreateFromParcel = null;
            } else {
                extraInfoCreateFromParcel = ExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new WordParams(extraInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WordParams[] newArray(int i) {
            return new WordParams[i];
        }
    };

    @C09CT("extra_info")
    public final ExtraInfo extraInfo;

    public WordParams() {
        this(null);
    }

    public final WordParams copy(ExtraInfo extraInfo) {
        return new WordParams(extraInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WordParams) && Intrinsics.LJFF(this.extraInfo, ((WordParams) obj).extraInfo);
    }

    public int hashCode() {
        ExtraInfo extraInfo = this.extraInfo;
        if (extraInfo == null) {
            return 0;
        }
        return extraInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WordParams(extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ExtraInfo extraInfo = this.extraInfo;
        if (extraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extraInfo.writeToParcel(parcel, i);
        }
    }

    public final ExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public WordParams(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }
}
