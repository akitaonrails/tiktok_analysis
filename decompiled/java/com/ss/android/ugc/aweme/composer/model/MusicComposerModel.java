package com.ss.android.ugc.aweme.composer.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.composer.model.MusicComposerModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class MusicComposerModel implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicComposerModel> CREATOR = new Parcelable.Creator<MusicComposerModel>() { // from class: X.0MOU
        @Override // android.os.Parcelable.Creator
        public final MusicComposerModel createFromParcel(Parcel parcel) {
            return new MusicComposerModel(parcel.readString(), parcel.readInt(), parcel.readInt(), (MusicModel) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicComposerModel[] newArray(int i) {
            return new MusicComposerModel[i];
        }
    };

    @C09CT("end_time")
    public final int endTime;

    @C09CT("music_model")
    public final MusicModel musicModel;

    @C09CT("music_path")
    public final String musicPath;

    @C09CT("start_time")
    public final int startTime;

    public final MusicComposerModel copy(String str, int i, int i2, MusicModel musicModel) {
        return new MusicComposerModel(str, i, i2, musicModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicComposerModel)) {
            return false;
        }
        MusicComposerModel musicComposerModel = (MusicComposerModel) obj;
        return Intrinsics.LJFF(this.musicPath, musicComposerModel.musicPath) && this.startTime == musicComposerModel.startTime && this.endTime == musicComposerModel.endTime && Intrinsics.LJFF(this.musicModel, musicComposerModel.musicModel);
    }

    public int hashCode() {
        return (((((this.musicPath.hashCode() * 31) + this.startTime) * 31) + this.endTime) * 31) + this.musicModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicComposerModel(musicPath=");
        sbLIZ.append(this.musicPath);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", musicModel=");
        sbLIZ.append(this.musicModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.musicPath);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeSerializable(this.musicModel);
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public MusicComposerModel(String str, int i, int i2, MusicModel musicModel) {
        this.musicPath = str;
        this.startTime = i;
        this.endTime = i2;
        this.musicModel = musicModel;
    }
}
