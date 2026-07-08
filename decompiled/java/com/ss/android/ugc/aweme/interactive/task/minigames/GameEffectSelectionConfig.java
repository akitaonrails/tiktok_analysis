package com.ss.android.ugc.aweme.interactive.task.minigames;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.interactive.task.minigames.GameEffectSelectionConfig;
import com.ss.android.ugc.aweme.interactive.task.minigames.GamesCenterEventParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GameEffectSelectionConfig implements Parcelable {
    public final int chatType;
    public final String conversationId;
    public final GamesCenterEventParams eventParams;
    public final String otherUserId;
    public static final Parcelable.Creator<GameEffectSelectionConfig> CREATOR = new Parcelable.Creator<GameEffectSelectionConfig>() { // from class: X.0Zls
        @Override // android.os.Parcelable.Creator
        public final GameEffectSelectionConfig createFromParcel(Parcel parcel) {
            return new GameEffectSelectionConfig(parcel.readString(), parcel.readInt(), parcel.readString(), GamesCenterEventParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GameEffectSelectionConfig[] newArray(int i) {
            return new GameEffectSelectionConfig[i];
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
        if (!(obj instanceof GameEffectSelectionConfig)) {
            return false;
        }
        GameEffectSelectionConfig gameEffectSelectionConfig = (GameEffectSelectionConfig) obj;
        return Intrinsics.LJFF(this.conversationId, gameEffectSelectionConfig.conversationId) && this.chatType == gameEffectSelectionConfig.chatType && Intrinsics.LJFF(this.otherUserId, gameEffectSelectionConfig.otherUserId) && Intrinsics.LJFF(this.eventParams, gameEffectSelectionConfig.eventParams);
    }

    public final int hashCode() {
        int iHashCode = ((this.conversationId.hashCode() * 31) + this.chatType) * 31;
        String str = this.otherUserId;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.eventParams.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameEffectSelectionConfig(conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.chatType);
        sbLIZ.append(", otherUserId=");
        sbLIZ.append(this.otherUserId);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.eventParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conversationId);
        parcel.writeInt(this.chatType);
        parcel.writeString(this.otherUserId);
        this.eventParams.writeToParcel(parcel, i);
    }

    public GameEffectSelectionConfig(String str, int i, String str2, GamesCenterEventParams gamesCenterEventParams) {
        this.conversationId = str;
        this.chatType = i;
        this.otherUserId = str2;
        this.eventParams = gamesCenterEventParams;
    }
}
