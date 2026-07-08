package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public class GameDuetResource implements Parcelable {
    public static final Parcelable.Creator<GameDuetResource> CREATOR = new Parcelable.Creator<GameDuetResource>() { // from class: com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GameDuetResource createFromParcel(Parcel parcel) {
            return new GameDuetResource(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GameDuetResource[] newArray(int i) {
            return new GameDuetResource[i];
        }
    };
    public int gameScore;
    public Effect gameSticker;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getGameScore() {
        return this.gameScore;
    }

    public Effect getGameSticker() {
        return this.gameSticker;
    }

    public GameDuetResource(Parcel parcel) {
        this.gameScore = parcel.readInt();
        this.gameSticker = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setGameSticker(Effect effect) {
        this.gameSticker = effect;
    }

    public GameDuetResource(int i, Effect effect) {
        this.gameScore = i;
        this.gameSticker = effect;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gameScore);
        parcel.writeParcelable(this.gameSticker, i);
    }
}
