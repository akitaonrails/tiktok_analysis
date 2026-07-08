package com.ss.android.ugc.aweme.interactive.task.game;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.aweme.interactive.task.game.GameEffectResultPageConfig;
import com.ss.android.ugc.aweme.interactive.task.game.GameInfo;
import com.ss.android.ugc.aweme.interactive.task.game.GamePlayResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class GameEffectResultPageConfig implements Parcelable {
    public final String conversationId;
    public final int conversationType;
    public final GameInfo gameInfo;
    public GameMainFlowEventParameters gameMainFlowEventParameters;
    public final GamePlayResult gamePlayResult;
    public final String gameTaskID;
    public final String otherUid;
    public final GameParticipantScoreComponent othersScore;
    public final GameParticipantScoreComponent userPreviousScore;
    public static final Parcelable.Creator<GameEffectResultPageConfig> CREATOR = new Parcelable.Creator<GameEffectResultPageConfig>() { // from class: X.0ZTh
        @Override // android.os.Parcelable.Creator
        public final GameEffectResultPageConfig createFromParcel(Parcel parcel) {
            GamePlayResult gamePlayResultCreateFromParcel;
            GameInfo gameInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                gamePlayResultCreateFromParcel = null;
            } else {
                gamePlayResultCreateFromParcel = GamePlayResult.CREATOR.createFromParcel(parcel);
            }
            GamePlayResult gamePlayResult = gamePlayResultCreateFromParcel;
            GameParticipantScoreComponent gameParticipantScoreComponent = (GameParticipantScoreComponent) parcel.readParcelable(GameEffectResultPageConfig.class.getClassLoader());
            GameParticipantScoreComponent gameParticipantScoreComponent2 = (GameParticipantScoreComponent) parcel.readParcelable(GameEffectResultPageConfig.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                gameInfoCreateFromParcel = GameInfo.CREATOR.createFromParcel(parcel);
            }
            return new GameEffectResultPageConfig(gamePlayResult, gameParticipantScoreComponent, gameParticipantScoreComponent2, string, string2, string3, gameInfoCreateFromParcel, parcel.readInt(), (GameMainFlowEventParameters) parcel.readParcelable(GameEffectResultPageConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GameEffectResultPageConfig[] newArray(int i) {
            return new GameEffectResultPageConfig[i];
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
        if (!(obj instanceof GameEffectResultPageConfig)) {
            return false;
        }
        GameEffectResultPageConfig gameEffectResultPageConfig = (GameEffectResultPageConfig) obj;
        return Intrinsics.LJFF(this.gamePlayResult, gameEffectResultPageConfig.gamePlayResult) && Intrinsics.LJFF(this.userPreviousScore, gameEffectResultPageConfig.userPreviousScore) && Intrinsics.LJFF(this.othersScore, gameEffectResultPageConfig.othersScore) && Intrinsics.LJFF(this.otherUid, gameEffectResultPageConfig.otherUid) && Intrinsics.LJFF(this.conversationId, gameEffectResultPageConfig.conversationId) && Intrinsics.LJFF(this.gameTaskID, gameEffectResultPageConfig.gameTaskID) && Intrinsics.LJFF(this.gameInfo, gameEffectResultPageConfig.gameInfo) && this.conversationType == gameEffectResultPageConfig.conversationType && Intrinsics.LJFF(this.gameMainFlowEventParameters, gameEffectResultPageConfig.gameMainFlowEventParameters);
    }

    public final int hashCode() {
        GamePlayResult gamePlayResult = this.gamePlayResult;
        int iHashCode = (gamePlayResult == null ? 0 : gamePlayResult.hashCode()) * 31;
        GameParticipantScoreComponent gameParticipantScoreComponent = this.userPreviousScore;
        int iHashCode2 = (iHashCode + (gameParticipantScoreComponent == null ? 0 : gameParticipantScoreComponent.hashCode())) * 31;
        GameParticipantScoreComponent gameParticipantScoreComponent2 = this.othersScore;
        int iHashCode3 = (iHashCode2 + (gameParticipantScoreComponent2 == null ? 0 : gameParticipantScoreComponent2.hashCode())) * 31;
        String str = this.otherUid;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.conversationId.hashCode()) * 31;
        String str2 = this.gameTaskID;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GameInfo gameInfo = this.gameInfo;
        return ((((iHashCode5 + (gameInfo != null ? gameInfo.hashCode() : 0)) * 31) + this.conversationType) * 31) + this.gameMainFlowEventParameters.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameEffectResultPageConfig(gamePlayResult=");
        sbLIZ.append(this.gamePlayResult);
        sbLIZ.append(", userPreviousScore=");
        sbLIZ.append(this.userPreviousScore);
        sbLIZ.append(", othersScore=");
        sbLIZ.append(this.othersScore);
        sbLIZ.append(", otherUid=");
        sbLIZ.append(this.otherUid);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", gameTaskID=");
        sbLIZ.append(this.gameTaskID);
        sbLIZ.append(", gameInfo=");
        sbLIZ.append(this.gameInfo);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.conversationType);
        sbLIZ.append(", gameMainFlowEventParameters=");
        sbLIZ.append(this.gameMainFlowEventParameters);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GamePlayResult gamePlayResult = this.gamePlayResult;
        if (gamePlayResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gamePlayResult.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.userPreviousScore, i);
        parcel.writeParcelable(this.othersScore, i);
        parcel.writeString(this.otherUid);
        parcel.writeString(this.conversationId);
        parcel.writeString(this.gameTaskID);
        GameInfo gameInfo = this.gameInfo;
        if (gameInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gameInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.conversationType);
        parcel.writeParcelable(this.gameMainFlowEventParameters, i);
    }

    public GameEffectResultPageConfig(GamePlayResult gamePlayResult, GameParticipantScoreComponent gameParticipantScoreComponent, GameParticipantScoreComponent gameParticipantScoreComponent2, String str, String str2, String str3, GameInfo gameInfo, int i, GameMainFlowEventParameters gameMainFlowEventParameters) {
        this.gamePlayResult = gamePlayResult;
        this.userPreviousScore = gameParticipantScoreComponent;
        this.othersScore = gameParticipantScoreComponent2;
        this.otherUid = str;
        this.conversationId = str2;
        this.gameTaskID = str3;
        this.gameInfo = gameInfo;
        this.conversationType = i;
        this.gameMainFlowEventParameters = gameMainFlowEventParameters;
    }
}
