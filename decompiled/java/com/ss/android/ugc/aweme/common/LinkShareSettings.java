package com.ss.android.ugc.aweme.common;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.common.LinkShareSettings;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class LinkShareSettings implements Serializable, Parcelable {
    public static final Parcelable.Creator<LinkShareSettings> CREATOR = new Parcelable.Creator<LinkShareSettings>() { // from class: X.0wRZ
        @Override // android.os.Parcelable.Creator
        public final LinkShareSettings createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() == 0) {
                z2 = false;
            }
            return new LinkShareSettings(z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final LinkShareSettings[] newArray(int i) {
            return new LinkShareSettings[i];
        }
    };

    @C09CT("disableRecommendMusic")
    public boolean disableRecommendMusic;

    @C09CT("isTrackContentType")
    public boolean isTrackContentType;

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkShareSettings() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public final LinkShareSettings copy(boolean z, boolean z2) {
        return new LinkShareSettings(z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkShareSettings)) {
            return false;
        }
        LinkShareSettings linkShareSettings = (LinkShareSettings) obj;
        return this.disableRecommendMusic == linkShareSettings.disableRecommendMusic && this.isTrackContentType == linkShareSettings.isTrackContentType;
    }

    public int hashCode() {
        return (C786410Ut5.Z2(this.disableRecommendMusic) * 31) + C786410Ut5.Z2(this.isTrackContentType);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkShareSettings(disableRecommendMusic=");
        sbLIZ.append(this.disableRecommendMusic);
        sbLIZ.append(", isTrackContentType=");
        sbLIZ.append(this.isTrackContentType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.disableRecommendMusic ? 1 : 0);
        parcel.writeInt(this.isTrackContentType ? 1 : 0);
    }

    public final boolean getDisableRecommendMusic() {
        return this.disableRecommendMusic;
    }

    public final boolean isTrackContentType() {
        return this.isTrackContentType;
    }

    public final void setDisableRecommendMusic(boolean z) {
        this.disableRecommendMusic = z;
    }

    public final void setTrackContentType(boolean z) {
        this.isTrackContentType = z;
    }

    public LinkShareSettings(boolean z, boolean z2) {
        this.disableRecommendMusic = z;
        this.isTrackContentType = z2;
    }

    public /* synthetic */ LinkShareSettings(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
