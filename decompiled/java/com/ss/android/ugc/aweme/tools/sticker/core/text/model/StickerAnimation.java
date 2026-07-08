package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2270908v5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.StickerAnimation;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class StickerAnimation implements Parcelable, Serializable {

    @C09CT("InAnim")
    public final String inAnim;

    @InterfaceC2270908v5
    @C09CT("InAnimPath")
    public final String inAnimPath;

    @C09CT("InDuration")
    public final Long inDuration;

    @C09CT("loop")
    public final Boolean loop;

    @C09CT("OutAnim")
    public final String outAnim;

    @InterfaceC2270908v5
    @C09CT("OutAnimPath")
    public final String outAnimPath;

    @C09CT("OutDuration")
    public final Long outDuration;
    public static final Parcelable.Creator<StickerAnimation> CREATOR = new Parcelable.Creator<StickerAnimation>() { // from class: X.0EMk
        @Override // android.os.Parcelable.Creator
        public final StickerAnimation createFromParcel(Parcel parcel) {
            Long lValueOf;
            Long lValueOf2;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new StickerAnimation(string, string2, lValueOf, string3, string4, lValueOf2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerAnimation[] newArray(int i) {
            return new StickerAnimation[i];
        }
    };
    public static final int $stable = 8;

    public final StickerAnimation copy(String str, String str2, Long l, String str3, String str4, Long l2, Boolean bool) {
        return new StickerAnimation(str, str2, l, str3, str4, l2, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerAnimation)) {
            return false;
        }
        StickerAnimation stickerAnimation = (StickerAnimation) obj;
        return Intrinsics.LJFF(this.inAnim, stickerAnimation.inAnim) && Intrinsics.LJFF(this.inAnimPath, stickerAnimation.inAnimPath) && Intrinsics.LJFF(this.inDuration, stickerAnimation.inDuration) && Intrinsics.LJFF(this.outAnim, stickerAnimation.outAnim) && Intrinsics.LJFF(this.outAnimPath, stickerAnimation.outAnimPath) && Intrinsics.LJFF(this.outDuration, stickerAnimation.outDuration) && Intrinsics.LJFF(this.loop, stickerAnimation.loop);
    }

    public int hashCode() {
        String str = this.inAnim;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inAnimPath;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.inDuration;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.outAnim;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.outAnimPath;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.outDuration;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.loop;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerAnimation(inAnim=");
        sbLIZ.append(this.inAnim);
        sbLIZ.append(", inAnimPath=");
        sbLIZ.append(this.inAnimPath);
        sbLIZ.append(", inDuration=");
        sbLIZ.append(this.inDuration);
        sbLIZ.append(", outAnim=");
        sbLIZ.append(this.outAnim);
        sbLIZ.append(", outAnimPath=");
        sbLIZ.append(this.outAnimPath);
        sbLIZ.append(", outDuration=");
        sbLIZ.append(this.outDuration);
        sbLIZ.append(", loop=");
        sbLIZ.append(this.loop);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.inAnim);
        parcel.writeString(this.inAnimPath);
        Long l = this.inDuration;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.outAnim);
        parcel.writeString(this.outAnimPath);
        Long l2 = this.outDuration;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Boolean bool = this.loop;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public final String getInAnim() {
        return this.inAnim;
    }

    public final String getInAnimPath() {
        return this.inAnimPath;
    }

    public final Long getInDuration() {
        return this.inDuration;
    }

    public final Boolean getLoop() {
        return this.loop;
    }

    public final String getOutAnim() {
        return this.outAnim;
    }

    public final String getOutAnimPath() {
        return this.outAnimPath;
    }

    public final Long getOutDuration() {
        return this.outDuration;
    }

    public StickerAnimation(String str, String str2, Long l, String str3, String str4, Long l2, Boolean bool) {
        this.inAnim = str;
        this.inAnimPath = str2;
        this.inDuration = l;
        this.outAnim = str3;
        this.outAnimPath = str4;
        this.outDuration = l2;
        this.loop = bool;
    }
}
