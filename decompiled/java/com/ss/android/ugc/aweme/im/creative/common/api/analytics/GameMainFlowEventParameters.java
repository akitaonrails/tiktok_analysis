package com.ss.android.ugc.aweme.im.creative.common.api.analytics;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class GameMainFlowEventParameters implements Parcelable, Serializable {
    public static final Parcelable.Creator<GameMainFlowEventParameters> CREATOR = new Parcelable.Creator<GameMainFlowEventParameters>() { // from class: X.0ICB
        @Override // android.os.Parcelable.Creator
        public final GameMainFlowEventParameters createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            Double dValueOf;
            String string = parcel.readString();
            int i = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                dValueOf = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new GameMainFlowEventParameters(string, i, string2, string3, string4, string5, boolValueOf, string6, numValueOf, numValueOf2, dValueOf, string7, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final GameMainFlowEventParameters[] newArray(int i) {
            return new GameMainFlowEventParameters[i];
        }
    };

    @C09CT("chat_type")
    public final int chatType;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("effect_id")
    public final String effectId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("highscore")
    public final Double highScore;

    @C09CT("highscore_user_id")
    public final String highScoreUserId;

    @C09CT("is_game_owner")
    public final Boolean isGameOwner;

    @C09CT("rank")
    public final Integer rank;

    @C09CT("resource_id")
    public final String resId;

    @C09CT("game_task_id")
    public final String taskId;

    @C09CT("user_cnt")
    public final Integer userCnt;

    @C09CT("user_played_cnt")
    public final Integer userPlayedCnt;

    public GameMainFlowEventParameters() {
        this("", 0, "", "", "", "", null, null, null, null, null, null, null);
    }

    public final GameMainFlowEventParameters copy(String str, int i, String str2, String str3, String str4, String str5, Boolean bool, String str6, Integer num, Integer num2, Double d, String str7, Integer num3) {
        return new GameMainFlowEventParameters(str, i, str2, str3, str4, str5, bool, str6, num, num2, d, str7, num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameMainFlowEventParameters)) {
            return false;
        }
        GameMainFlowEventParameters gameMainFlowEventParameters = (GameMainFlowEventParameters) obj;
        return Intrinsics.LJFF(this.conversationId, gameMainFlowEventParameters.conversationId) && this.chatType == gameMainFlowEventParameters.chatType && Intrinsics.LJFF(this.resId, gameMainFlowEventParameters.resId) && Intrinsics.LJFF(this.effectId, gameMainFlowEventParameters.effectId) && Intrinsics.LJFF(this.enterFrom, gameMainFlowEventParameters.enterFrom) && Intrinsics.LJFF(this.enterMethod, gameMainFlowEventParameters.enterMethod) && Intrinsics.LJFF(this.isGameOwner, gameMainFlowEventParameters.isGameOwner) && Intrinsics.LJFF(this.taskId, gameMainFlowEventParameters.taskId) && Intrinsics.LJFF(this.userCnt, gameMainFlowEventParameters.userCnt) && Intrinsics.LJFF(this.userPlayedCnt, gameMainFlowEventParameters.userPlayedCnt) && Intrinsics.LJFF(this.highScore, gameMainFlowEventParameters.highScore) && Intrinsics.LJFF(this.highScoreUserId, gameMainFlowEventParameters.highScoreUserId) && Intrinsics.LJFF(this.rank, gameMainFlowEventParameters.rank);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.conversationId.hashCode() * 31) + this.chatType) * 31) + this.resId.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.enterMethod.hashCode()) * 31;
        Boolean bool = this.isGameOwner;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.taskId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.userCnt;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.userPlayedCnt;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.highScore;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.highScoreUserId;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.rank;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "GameMainFlowEventParameters(conversationId=" + this.conversationId + ", chatType=" + this.chatType + ", resId=" + this.resId + ", effectId=" + this.effectId + ", enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", isGameOwner=" + this.isGameOwner + ", taskId=" + this.taskId + ", userCnt=" + this.userCnt + ", userPlayedCnt=" + this.userPlayedCnt + ", highScore=" + this.highScore + ", highScoreUserId=" + this.highScoreUserId + ", rank=" + this.rank + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conversationId);
        parcel.writeInt(this.chatType);
        parcel.writeString(this.resId);
        parcel.writeString(this.effectId);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        Boolean bool = this.isGameOwner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.taskId);
        Integer num = this.userCnt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.userPlayedCnt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Double d = this.highScore;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.highScoreUserId);
        Integer num3 = this.rank;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Double getHighScore() {
        return this.highScore;
    }

    public final String getHighScoreUserId() {
        return this.highScoreUserId;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final String getResId() {
        return this.resId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final Integer getUserCnt() {
        return this.userCnt;
    }

    public final Integer getUserPlayedCnt() {
        return this.userPlayedCnt;
    }

    public final Boolean isGameOwner() {
        return this.isGameOwner;
    }

    public GameMainFlowEventParameters(String str, int i, String str2, String str3, String str4, String str5, Boolean bool, String str6, Integer num, Integer num2, Double d, String str7, Integer num3) {
        this.conversationId = str;
        this.chatType = i;
        this.resId = str2;
        this.effectId = str3;
        this.enterFrom = str4;
        this.enterMethod = str5;
        this.isGameOwner = bool;
        this.taskId = str6;
        this.userCnt = num;
        this.userPlayedCnt = num2;
        this.highScore = d;
        this.highScoreUserId = str7;
        this.rank = num3;
    }
}
