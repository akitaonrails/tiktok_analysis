package com.bytedance.android.livesdk.model;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.GameTagCategory;

/* JADX INFO: loaded from: classes13.dex */
public final class GameTagCategory implements Parcelable {
    public static final Parcelable.Creator<GameTagCategory> CREATOR = new Parcelable.Creator<GameTagCategory>() { // from class: X.0UT2
        @Override // android.os.Parcelable.Creator
        public final GameTagCategory createFromParcel(Parcel parcel) {
            return new GameTagCategory(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GameTagCategory[] newArray(int i) {
            return new GameTagCategory[i];
        }
    };

    @C09CT("game_type")
    public int gameType;

    @C09CT("title")
    public String title;

    public GameTagCategory() {
        this(0, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.gameType);
        parcel.writeString(this.title);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", game_type=");
        sb.append(this.gameType);
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        sb.replace(0, 2, "GameTagCategory{");
        sb.append('}');
        return sb.toString();
    }

    public GameTagCategory(int i, String str) {
        this.gameType = i;
        this.title = str;
    }
}
