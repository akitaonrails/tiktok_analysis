package com.ss.android.ugc.aweme.interactive.task.game;

import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC19360410ok;
import X.EnumC19360610om;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.aweme.interactive.task.game.GameInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GameInfo implements Parcelable {
    public final Effect effect;
    public final boolean hasMoreParticipants;
    public final List<String> iconUrl;
    public final List<GameParticipantScoreComponent> scoreList;
    public final EnumC19360610om scoreOrder;
    public final EnumC19360410ok scoreType;
    public static final Parcelable.Creator<GameInfo> CREATOR = new Parcelable.Creator<GameInfo>() { // from class: X.0ZTk
        @Override // android.os.Parcelable.Creator
        public final GameInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Effect effect = (Effect) parcel.readParcelable(GameInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(GameInfo.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new GameInfo(arrayListCreateStringArrayList, effect, arrayList, z, EnumC19360410ok.valueOf(parcel.readString()), EnumC19360610om.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GameInfo[] newArray(int i) {
            return new GameInfo[i];
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
        if (!(obj instanceof GameInfo)) {
            return false;
        }
        GameInfo gameInfo = (GameInfo) obj;
        return Intrinsics.LJFF(this.iconUrl, gameInfo.iconUrl) && Intrinsics.LJFF(this.effect, gameInfo.effect) && Intrinsics.LJFF(this.scoreList, gameInfo.scoreList) && this.hasMoreParticipants == gameInfo.hasMoreParticipants && this.scoreType == gameInfo.scoreType && this.scoreOrder == gameInfo.scoreOrder;
    }

    public final int hashCode() {
        int iHashCode = ((this.iconUrl.hashCode() * 31) + this.effect.hashCode()) * 31;
        List<GameParticipantScoreComponent> list = this.scoreList;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.hasMoreParticipants)) * 31) + this.scoreType.hashCode()) * 31) + this.scoreOrder.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameInfo(iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", effect=");
        sbLIZ.append(this.effect);
        sbLIZ.append(", scoreList=");
        sbLIZ.append(this.scoreList);
        sbLIZ.append(", hasMoreParticipants=");
        sbLIZ.append(this.hasMoreParticipants);
        sbLIZ.append(", scoreType=");
        sbLIZ.append(this.scoreType);
        sbLIZ.append(", scoreOrder=");
        sbLIZ.append(this.scoreOrder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.iconUrl);
        parcel.writeParcelable(this.effect, i);
        List<GameParticipantScoreComponent> list = this.scoreList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<GameParticipantScoreComponent> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable(it2.next(), i);
            }
        }
        parcel.writeInt(this.hasMoreParticipants ? 1 : 0);
        parcel.writeString(this.scoreType.name());
        parcel.writeString(this.scoreOrder.name());
    }

    public GameInfo(List<String> list, Effect effect, List<GameParticipantScoreComponent> list2, boolean z, EnumC19360410ok enumC19360410ok, EnumC19360610om enumC19360610om) {
        this.iconUrl = list;
        this.effect = effect;
        this.scoreList = list2;
        this.hasMoreParticipants = z;
        this.scoreType = enumC19360410ok;
        this.scoreOrder = enumC19360610om;
    }
}
