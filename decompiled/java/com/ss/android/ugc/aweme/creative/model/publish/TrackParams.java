package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.TrackParams;

/* JADX INFO: loaded from: classes23.dex */
public final class TrackParams implements Parcelable {
    public static final Parcelable.Creator<TrackParams> CREATOR = new Parcelable.Creator<TrackParams>() { // from class: X.0mdp
        @Override // android.os.Parcelable.Creator
        public final TrackParams createFromParcel(Parcel parcel) {
            return new TrackParams(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackParams[] newArray(int i) {
            return new TrackParams[i];
        }
    };

    @C040H
    public long compileBeginDuration;

    @C040H
    public int compileBeginScene;

    @C040H
    public long compileEndDuration;

    @C040H
    public int compileEndScene;

    @C040H
    public int currentScene;

    @C040H
    public long currentSceneStartTime;

    @C040H
    public long uploadBeginDuration;

    @C040H
    public int uploadBeginScene;

    @C040H
    public long uploadEndDuration;

    @C040H
    public int uploadEndScene;

    public TrackParams() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackParams)) {
            return false;
        }
        TrackParams trackParams = (TrackParams) obj;
        return this.currentScene == trackParams.currentScene && this.currentSceneStartTime == trackParams.currentSceneStartTime && this.compileBeginDuration == trackParams.compileBeginDuration && this.compileEndDuration == trackParams.compileEndDuration && this.compileBeginScene == trackParams.compileBeginScene && this.compileEndScene == trackParams.compileEndScene && this.uploadBeginDuration == trackParams.uploadBeginDuration && this.uploadEndDuration == trackParams.uploadEndDuration && this.uploadBeginScene == trackParams.uploadBeginScene && this.uploadEndScene == trackParams.uploadEndScene;
    }

    public final int hashCode() {
        return (((((((((((((((((this.currentScene * 31) + C786410Ut5.Y2(this.currentSceneStartTime)) * 31) + C786410Ut5.Y2(this.compileBeginDuration)) * 31) + C786410Ut5.Y2(this.compileEndDuration)) * 31) + this.compileBeginScene) * 31) + this.compileEndScene) * 31) + C786410Ut5.Y2(this.uploadBeginDuration)) * 31) + C786410Ut5.Y2(this.uploadEndDuration)) * 31) + this.uploadBeginScene) * 31) + this.uploadEndScene;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackParams(currentScene=");
        sbLIZ.append(this.currentScene);
        sbLIZ.append(", currentSceneStartTime=");
        sbLIZ.append(this.currentSceneStartTime);
        sbLIZ.append(", compileBeginDuration=");
        sbLIZ.append(this.compileBeginDuration);
        sbLIZ.append(", compileEndDuration=");
        sbLIZ.append(this.compileEndDuration);
        sbLIZ.append(", compileBeginScene=");
        sbLIZ.append(this.compileBeginScene);
        sbLIZ.append(", compileEndScene=");
        sbLIZ.append(this.compileEndScene);
        sbLIZ.append(", uploadBeginDuration=");
        sbLIZ.append(this.uploadBeginDuration);
        sbLIZ.append(", uploadEndDuration=");
        sbLIZ.append(this.uploadEndDuration);
        sbLIZ.append(", uploadBeginScene=");
        sbLIZ.append(this.uploadBeginScene);
        sbLIZ.append(", uploadEndScene=");
        sbLIZ.append(this.uploadEndScene);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.currentScene);
        parcel.writeLong(this.currentSceneStartTime);
        parcel.writeLong(this.compileBeginDuration);
        parcel.writeLong(this.compileEndDuration);
        parcel.writeInt(this.compileBeginScene);
        parcel.writeInt(this.compileEndScene);
        parcel.writeLong(this.uploadBeginDuration);
        parcel.writeLong(this.uploadEndDuration);
        parcel.writeInt(this.uploadBeginScene);
        parcel.writeInt(this.uploadEndScene);
    }

    public /* synthetic */ TrackParams(int i) {
        this(0, 0L, 0L, 0L, 0, 0, 0L, 0L, 0, 0);
    }

    public TrackParams(int i, long j, long j2, long j3, int i2, int i3, long j4, long j5, int i4, int i5) {
        this.currentScene = i;
        this.currentSceneStartTime = j;
        this.compileBeginDuration = j2;
        this.compileEndDuration = j3;
        this.compileBeginScene = i2;
        this.compileEndScene = i3;
        this.uploadBeginDuration = j4;
        this.uploadEndDuration = j5;
        this.uploadBeginScene = i4;
        this.uploadEndScene = i5;
    }
}
