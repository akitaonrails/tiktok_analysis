package com.ss.android.ugc.mediabox.bgplay.notification;

import X.C1778670wO1;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.mediabox.bgplay.notification.NotificationParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class NotificationParams implements Parcelable {
    public String aid;
    public String authorName;
    public boolean canPlayFastBackWard;
    public boolean canPlayFastForward;
    public boolean canPlayNext;
    public boolean canPlayPrevious;
    public Bitmap coverBitmap;
    public String description;
    public boolean isPlaying;
    public int notificationSmallIconRes;
    public int progress;
    public static final C1778670wO1 Companion = new Object() { // from class: X.0wO1
    };
    public static final Parcelable.Creator<NotificationParams> CREATOR = new Parcelable.Creator<NotificationParams>() { // from class: X.0wO0
        @Override // android.os.Parcelable.Creator
        public final NotificationParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            String string = parcel.readString();
            Bitmap bitmap = (Bitmap) parcel.readParcelable(NotificationParams.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new NotificationParams(string, bitmap, string2, string3, z, z2, z3, z4, z5, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationParams[] newArray(int i) {
            return new NotificationParams[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationParams)) {
            return false;
        }
        NotificationParams notificationParams = (NotificationParams) obj;
        return Intrinsics.LJFF(this.aid, notificationParams.aid) && Intrinsics.LJFF(this.coverBitmap, notificationParams.coverBitmap) && Intrinsics.LJFF(this.description, notificationParams.description) && Intrinsics.LJFF(this.authorName, notificationParams.authorName) && this.canPlayFastBackWard == notificationParams.canPlayFastBackWard && this.canPlayFastForward == notificationParams.canPlayFastForward && this.canPlayPrevious == notificationParams.canPlayPrevious && this.canPlayNext == notificationParams.canPlayNext && this.isPlaying == notificationParams.isPlaying && this.progress == notificationParams.progress && this.notificationSmallIconRes == notificationParams.notificationSmallIconRes;
    }

    public final int hashCode() {
        int iHashCode = this.aid.hashCode() * 31;
        Bitmap bitmap = this.coverBitmap;
        return ((((((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.description.hashCode()) * 31) + this.authorName.hashCode()) * 31) + C786410Ut5.Z2(this.canPlayFastBackWard)) * 31) + C786410Ut5.Z2(this.canPlayFastForward)) * 31) + C786410Ut5.Z2(this.canPlayPrevious)) * 31) + C786410Ut5.Z2(this.canPlayNext)) * 31) + C786410Ut5.Z2(this.isPlaying)) * 31) + this.progress) * 31) + this.notificationSmallIconRes;
    }

    public final String toString() {
        return "NotificationParams(aid=" + this.aid + ", coverBitmap=" + this.coverBitmap + ", description=" + this.description + ", authorName=" + this.authorName + ", canPlayFastBackWard=" + this.canPlayFastBackWard + ", canPlayFastForward=" + this.canPlayFastForward + ", canPlayPrevious=" + this.canPlayPrevious + ", canPlayNext=" + this.canPlayNext + ", isPlaying=" + this.isPlaying + ", progress=" + this.progress + ", notificationSmallIconRes=" + this.notificationSmallIconRes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aid);
        parcel.writeParcelable(this.coverBitmap, i);
        parcel.writeString(this.description);
        parcel.writeString(this.authorName);
        parcel.writeInt(this.canPlayFastBackWard ? 1 : 0);
        parcel.writeInt(this.canPlayFastForward ? 1 : 0);
        parcel.writeInt(this.canPlayPrevious ? 1 : 0);
        parcel.writeInt(this.canPlayNext ? 1 : 0);
        parcel.writeInt(this.isPlaying ? 1 : 0);
        parcel.writeInt(this.progress);
        parcel.writeInt(this.notificationSmallIconRes);
    }

    public NotificationParams(String str, Bitmap bitmap, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        this.aid = str;
        this.coverBitmap = bitmap;
        this.description = str2;
        this.authorName = str3;
        this.canPlayFastBackWard = z;
        this.canPlayFastForward = z2;
        this.canPlayPrevious = z3;
        this.canPlayNext = z4;
        this.isPlaying = z5;
        this.progress = i;
        this.notificationSmallIconRes = i2;
    }
}
