package com.ss.android.ugc.aweme.interactive.task.minigames;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.interactive.task.minigames.GameEffectSelectionConfig;
import com.ss.android.ugc.aweme.interactive.task.minigames.GamesCenterViewAllConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GamesCenterViewAllConfig implements Parcelable {
    public final GameEffectSelectionConfig gameEffectSelectionConfig;
    public final List<IMGame> miniGamesList;
    public final String tabName;
    public static final Parcelable.Creator<GamesCenterViewAllConfig> CREATOR = new Parcelable.Creator<GamesCenterViewAllConfig>() { // from class: X.0Zlr
        @Override // android.os.Parcelable.Creator
        public final GamesCenterViewAllConfig createFromParcel(Parcel parcel) {
            GameEffectSelectionConfig gameEffectSelectionConfigCreateFromParcel = GameEffectSelectionConfig.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readSerializable());
            }
            return new GamesCenterViewAllConfig(gameEffectSelectionConfigCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GamesCenterViewAllConfig[] newArray(int i) {
            return new GamesCenterViewAllConfig[i];
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
        if (!(obj instanceof GamesCenterViewAllConfig)) {
            return false;
        }
        GamesCenterViewAllConfig gamesCenterViewAllConfig = (GamesCenterViewAllConfig) obj;
        return Intrinsics.LJFF(this.gameEffectSelectionConfig, gamesCenterViewAllConfig.gameEffectSelectionConfig) && Intrinsics.LJFF(this.miniGamesList, gamesCenterViewAllConfig.miniGamesList) && Intrinsics.LJFF(this.tabName, gamesCenterViewAllConfig.tabName);
    }

    public final int hashCode() {
        return (((this.gameEffectSelectionConfig.hashCode() * 31) + this.miniGamesList.hashCode()) * 31) + this.tabName.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GamesCenterViewAllConfig(gameEffectSelectionConfig=");
        sbLIZ.append(this.gameEffectSelectionConfig);
        sbLIZ.append(", miniGamesList=");
        sbLIZ.append(this.miniGamesList);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.gameEffectSelectionConfig.writeToParcel(parcel, i);
        List<IMGame> list = this.miniGamesList;
        parcel.writeInt(list.size());
        Iterator<IMGame> it2 = list.iterator();
        while (it2.hasNext()) {
            parcel.writeSerializable(it2.next());
        }
        parcel.writeString(this.tabName);
    }

    public GamesCenterViewAllConfig(GameEffectSelectionConfig gameEffectSelectionConfig, List<IMGame> list, String str) {
        this.gameEffectSelectionConfig = gameEffectSelectionConfig;
        this.miniGamesList = list;
        this.tabName = str;
    }
}
