package com.ss.android.ugc.aweme.interactive.task.game;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.interactive.task.game.UserPreviousScore;

/* JADX INFO: loaded from: classes15.dex */
public final class UserPreviousScore implements Parcelable {
    public final int rank;
    public final double score;
    public static final Parcelable.Creator<UserPreviousScore> CREATOR = new Parcelable.Creator<UserPreviousScore>() { // from class: X.0Yc5
        @Override // android.os.Parcelable.Creator
        public final UserPreviousScore createFromParcel(Parcel parcel) {
            return new UserPreviousScore(parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final UserPreviousScore[] newArray(int i) {
            return new UserPreviousScore[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserPreviousScore)) {
            return false;
        }
        UserPreviousScore userPreviousScore = (UserPreviousScore) obj;
        return Double.compare(this.score, userPreviousScore.score) == 0 && this.rank == userPreviousScore.rank;
    }

    public final int hashCode() {
        return (C786410Ut5.X2(this.score) * 31) + this.rank;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPreviousScore(score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.rank);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.score);
        parcel.writeInt(this.rank);
    }

    public UserPreviousScore(double d, int i) {
        this.score = d;
        this.rank = i;
    }
}
