package com.ss.android.ugc.aweme.shortvideo.model;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LivePhotoModel implements Parcelable, Serializable {
    public static final long serialVersionUID = 1;
    public Effect effect;
    public boolean isOpen;
    public int photoHeight;
    public String photoPath;
    public int photoWidth;
    public int videoHeight;
    public String videoPath;
    public int videoWidth;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LivePhotoModel> CREATOR = new Creator();

    public static final class Companion {
    }

    public static final class Creator implements Parcelable.Creator<LivePhotoModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePhotoModel createFromParcel(Parcel parcel) {
            return new LivePhotoModel(parcel.readInt() != 0, (Effect) parcel.readParcelable(LivePhotoModel.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LivePhotoModel[] newArray(int i) {
            return new LivePhotoModel[i];
        }
    }

    public LivePhotoModel() {
        this(false, null, "", 0, 0, "", 0, 0);
    }

    public final LivePhotoModel copy(boolean z, Effect effect, String str, int i, int i2, String str2, int i3, int i4) {
        return new LivePhotoModel(z, effect, str, i, i2, str2, i3, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivePhotoModel)) {
            return false;
        }
        LivePhotoModel livePhotoModel = (LivePhotoModel) obj;
        return this.isOpen == livePhotoModel.isOpen && Intrinsics.LJFF(this.effect, livePhotoModel.effect) && Intrinsics.LJFF(this.videoPath, livePhotoModel.videoPath) && this.videoWidth == livePhotoModel.videoWidth && this.videoHeight == livePhotoModel.videoHeight && Intrinsics.LJFF(this.photoPath, livePhotoModel.photoPath) && this.photoWidth == livePhotoModel.photoWidth && this.photoHeight == livePhotoModel.photoHeight;
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.isOpen) * 31;
        Effect effect = this.effect;
        return ((((((((((((iZ2 + (effect == null ? 0 : effect.hashCode())) * 31) + this.videoPath.hashCode()) * 31) + this.videoWidth) * 31) + this.videoHeight) * 31) + this.photoPath.hashCode()) * 31) + this.photoWidth) * 31) + this.photoHeight;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePhotoModel(isOpen=");
        sbLIZ.append(this.isOpen);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", videoPath=");
        sbLIZ.append(this.videoPath);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.videoWidth);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.videoHeight);
        sbLIZ.append(", photoPath=");
        sbLIZ.append(this.photoPath);
        sbLIZ.append(", photoWidth=");
        sbLIZ.append(this.photoWidth);
        sbLIZ.append(", photoHeight=");
        sbLIZ.append(this.photoHeight);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isOpen ? 1 : 0);
        parcel.writeParcelable(this.effect, i);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeString(this.photoPath);
        parcel.writeInt(this.photoWidth);
        parcel.writeInt(this.photoHeight);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final int getPhotoHeight() {
        return this.photoHeight;
    }

    public final String getPhotoPath() {
        return this.photoPath;
    }

    public final int getPhotoWidth() {
        return this.photoWidth;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public final void setEffect(Effect effect) {
        this.effect = effect;
    }

    public final void setOpen(boolean z) {
        this.isOpen = z;
    }

    public final void setPhotoHeight(int i) {
        this.photoHeight = i;
    }

    public final void setPhotoPath(String str) {
        this.photoPath = str;
    }

    public final void setPhotoWidth(int i) {
        this.photoWidth = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public LivePhotoModel(boolean z, Effect effect, String str, int i, int i2, String str2, int i3, int i4) {
        this.isOpen = z;
        this.effect = effect;
        this.videoPath = str;
        this.videoWidth = i;
        this.videoHeight = i2;
        this.photoPath = str2;
        this.photoWidth = i3;
        this.photoHeight = i4;
    }
}
