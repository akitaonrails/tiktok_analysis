package com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game;

import X.C1CNI;
import X.C1CNK;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;

/* JADX INFO: loaded from: classes33.dex */
public final class GameParticipantScoreComponent implements BaseComponent<C1CNI> {
    public static final Parcelable.Creator<GameParticipantScoreComponent> CREATOR = new Parcelable.Creator<GameParticipantScoreComponent>() { // from class: X.18jp
        @Override // android.os.Parcelable.Creator
        public final GameParticipantScoreComponent createFromParcel(Parcel parcel) {
            return new GameParticipantScoreComponent(parcel.readDouble(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GameParticipantScoreComponent[] newArray(int i) {
            return new GameParticipantScoreComponent[i];
        }
    };
    public final int rank;
    public final double score;
    public final long userId;

    public GameParticipantScoreComponent() {
        this(0L, 0.0d, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameParticipantScoreComponent)) {
            return false;
        }
        GameParticipantScoreComponent gameParticipantScoreComponent = (GameParticipantScoreComponent) obj;
        return this.userId == gameParticipantScoreComponent.userId && Double.compare(this.score, gameParticipantScoreComponent.score) == 0 && this.rank == gameParticipantScoreComponent.rank;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.userId) * 31) + C786410Ut5.X2(this.score)) * 31) + this.rank;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameParticipantScoreComponent(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.rank);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userId);
        parcel.writeDouble(this.score);
        parcel.writeInt(this.rank);
    }

    public final C1CNI LIZ() {
        C1CNK c1cnk = new C1CNK();
        c1cnk.LIZLLL = Long.valueOf(this.userId);
        c1cnk.LJ = Double.valueOf(this.score);
        c1cnk.LJFF = Integer.valueOf(this.rank);
        return c1cnk.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GameParticipantScoreComponent(long j, double d, int i) {
        double d2 = d;
        this((i & 2) != 0 ? 0.0d : d2, 0, (i & 1) != 0 ? 0L : j);
    }

    public GameParticipantScoreComponent(double d, int i, long j) {
        this.userId = j;
        this.score = d;
        this.rank = i;
    }
}
