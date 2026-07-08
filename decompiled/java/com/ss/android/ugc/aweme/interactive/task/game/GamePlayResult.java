package com.ss.android.ugc.aweme.interactive.task.game;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.interactive.task.game.GamePlayResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GamePlayResult implements Parcelable {
    public final boolean isStartGame;
    public final Double newScore;
    public static final Parcelable.Creator<GamePlayResult> CREATOR = new Parcelable.Creator<GamePlayResult>() { // from class: X.0ZTi
        @Override // android.os.Parcelable.Creator
        public final GamePlayResult createFromParcel(Parcel parcel) {
            Double dValueOf;
            boolean z;
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new GamePlayResult(dValueOf, z);
        }

        @Override // android.os.Parcelable.Creator
        public final GamePlayResult[] newArray(int i) {
            return new GamePlayResult[i];
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
        if (!(obj instanceof GamePlayResult)) {
            return false;
        }
        GamePlayResult gamePlayResult = (GamePlayResult) obj;
        return Intrinsics.LJFF(this.newScore, gamePlayResult.newScore) && this.isStartGame == gamePlayResult.isStartGame;
    }

    public final int hashCode() {
        Double d = this.newScore;
        return ((d == null ? 0 : d.hashCode()) * 31) + C786410Ut5.Z2(this.isStartGame);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamePlayResult(newScore=");
        sbLIZ.append(this.newScore);
        sbLIZ.append(", isStartGame=");
        sbLIZ.append(this.isStartGame);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Double d = this.newScore;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeInt(this.isStartGame ? 1 : 0);
    }

    public GamePlayResult(Double d, boolean z) {
        this.newScore = d;
        this.isStartGame = z;
    }
}
