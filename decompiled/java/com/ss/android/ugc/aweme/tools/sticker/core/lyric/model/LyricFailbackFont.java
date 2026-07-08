package com.ss.android.ugc.aweme.tools.sticker.core.lyric.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricFailbackFont;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class LyricFailbackFont implements Parcelable {

    @InterfaceC2270908v5
    @C09CT("path")
    public String path;

    @C09CT("urs")
    public final String urs;
    public static final Parcelable.Creator<LyricFailbackFont> CREATOR = new Parcelable.Creator<LyricFailbackFont>() { // from class: X.0EKS
        @Override // android.os.Parcelable.Creator
        public final LyricFailbackFont createFromParcel(Parcel parcel) {
            return new LyricFailbackFont(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LyricFailbackFont[] newArray(int i) {
            return new LyricFailbackFont[i];
        }
    };
    public static final int $stable = 8;

    public LyricFailbackFont() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricFailbackFont)) {
            return false;
        }
        LyricFailbackFont lyricFailbackFont = (LyricFailbackFont) obj;
        return Intrinsics.LJFF(this.urs, lyricFailbackFont.urs) && Intrinsics.LJFF(this.path, lyricFailbackFont.path);
    }

    public final int hashCode() {
        String str = this.urs;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricFailbackFont(urs=");
        sbLIZ.append(this.urs);
        sbLIZ.append(", path=");
        sbLIZ.append(this.path);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.urs);
        parcel.writeString(this.path);
    }

    public LyricFailbackFont(String str, String str2) {
        this.urs = str;
        this.path = str2;
    }
}
