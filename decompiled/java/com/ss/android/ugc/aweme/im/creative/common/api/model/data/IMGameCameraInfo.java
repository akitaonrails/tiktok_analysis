package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C786410Ut5;
import X.EnumC19360410ok;
import X.EnumC19360610om;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.game.GameParticipantScoreComponent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class IMGameCameraInfo implements Parcelable {
    public static final Parcelable.Creator<IMGameCameraInfo> CREATOR = new Parcelable.Creator<IMGameCameraInfo>() { // from class: X.0ZTj
        @Override // android.os.Parcelable.Creator
        public final IMGameCameraInfo createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            boolean z2;
            EnumC19360610om enumC19360610omValueOf;
            boolean z3;
            String string = parcel.readString();
            Effect effect = (Effect) parcel.readParcelable(IMGameCameraInfo.class.getClassLoader());
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            GameParticipantScoreComponent gameParticipantScoreComponent = (GameParticipantScoreComponent) parcel.readParcelable(IMGameCameraInfo.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            GameParticipantScoreComponent gameParticipantScoreComponent2 = (GameParticipantScoreComponent) parcel.readParcelable(IMGameCameraInfo.class.getClassLoader());
            String string3 = parcel.readString();
            EnumC19360410ok enumC19360410okValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(IMGameCameraInfo.class.getClassLoader()));
                }
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                enumC19360610omValueOf = null;
            } else {
                enumC19360610omValueOf = EnumC19360610om.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                enumC19360410okValueOf = EnumC19360410ok.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return new IMGameCameraInfo(string, effect, arrayListCreateStringArrayList, gameParticipantScoreComponent, string2, z, gameParticipantScoreComponent2, string3, arrayList, z2, enumC19360610omValueOf, enumC19360410okValueOf, z3, GameMainFlowEventParameters.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final IMGameCameraInfo[] newArray(int i) {
            return new IMGameCameraInfo[i];
        }
    };
    public final String conversationId;
    public final Effect effect;
    public final List<String> effectThumbnail;
    public final GameMainFlowEventParameters gameMainFlowEventParameters;
    public final boolean hasMoreParticipants;
    public final boolean isStartGame;
    public final String otherUid;
    public final GameParticipantScoreComponent othersPlayInfo;
    public final boolean requiredMic;
    public final List<GameParticipantScoreComponent> scoreList;
    public final EnumC19360410ok scoreType;
    public final GameParticipantScoreComponent selfPlayPreviousInfo;
    public final EnumC19360610om sortOrder;
    public final String taskID;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMGameCameraInfo)) {
            return false;
        }
        IMGameCameraInfo iMGameCameraInfo = (IMGameCameraInfo) obj;
        return Intrinsics.LJFF(this.conversationId, iMGameCameraInfo.conversationId) && Intrinsics.LJFF(this.effect, iMGameCameraInfo.effect) && Intrinsics.LJFF(this.effectThumbnail, iMGameCameraInfo.effectThumbnail) && Intrinsics.LJFF(this.othersPlayInfo, iMGameCameraInfo.othersPlayInfo) && Intrinsics.LJFF(this.otherUid, iMGameCameraInfo.otherUid) && this.isStartGame == iMGameCameraInfo.isStartGame && Intrinsics.LJFF(this.selfPlayPreviousInfo, iMGameCameraInfo.selfPlayPreviousInfo) && Intrinsics.LJFF(this.taskID, iMGameCameraInfo.taskID) && Intrinsics.LJFF(this.scoreList, iMGameCameraInfo.scoreList) && this.hasMoreParticipants == iMGameCameraInfo.hasMoreParticipants && this.sortOrder == iMGameCameraInfo.sortOrder && this.scoreType == iMGameCameraInfo.scoreType && this.requiredMic == iMGameCameraInfo.requiredMic && Intrinsics.LJFF(this.gameMainFlowEventParameters, iMGameCameraInfo.gameMainFlowEventParameters);
    }

    public final int hashCode() {
        int iHashCode = ((((this.conversationId.hashCode() * 31) + this.effect.hashCode()) * 31) + this.effectThumbnail.hashCode()) * 31;
        GameParticipantScoreComponent gameParticipantScoreComponent = this.othersPlayInfo;
        int iHashCode2 = (iHashCode + (gameParticipantScoreComponent == null ? 0 : gameParticipantScoreComponent.hashCode())) * 31;
        String str = this.otherUid;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isStartGame)) * 31;
        GameParticipantScoreComponent gameParticipantScoreComponent2 = this.selfPlayPreviousInfo;
        int iHashCode4 = (iHashCode3 + (gameParticipantScoreComponent2 == null ? 0 : gameParticipantScoreComponent2.hashCode())) * 31;
        String str2 = this.taskID;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GameParticipantScoreComponent> list = this.scoreList;
        int iHashCode6 = (((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.hasMoreParticipants)) * 31;
        EnumC19360610om enumC19360610om = this.sortOrder;
        int iHashCode7 = (iHashCode6 + (enumC19360610om == null ? 0 : enumC19360610om.hashCode())) * 31;
        EnumC19360410ok enumC19360410ok = this.scoreType;
        return ((((iHashCode7 + (enumC19360410ok != null ? enumC19360410ok.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.requiredMic)) * 31) + this.gameMainFlowEventParameters.hashCode();
    }

    public final String toString() {
        return "IMGameCameraInfo(conversationId=" + this.conversationId + ", effect=" + this.effect + ", effectThumbnail=" + this.effectThumbnail + ", othersPlayInfo=" + this.othersPlayInfo + ", otherUid=" + this.otherUid + ", isStartGame=" + this.isStartGame + ", selfPlayPreviousInfo=" + this.selfPlayPreviousInfo + ", taskID=" + this.taskID + ", scoreList=" + this.scoreList + ", hasMoreParticipants=" + this.hasMoreParticipants + ", sortOrder=" + this.sortOrder + ", scoreType=" + this.scoreType + ", requiredMic=" + this.requiredMic + ", gameMainFlowEventParameters=" + this.gameMainFlowEventParameters + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.conversationId);
        parcel.writeParcelable(this.effect, i);
        parcel.writeStringList(this.effectThumbnail);
        parcel.writeParcelable(this.othersPlayInfo, i);
        parcel.writeString(this.otherUid);
        parcel.writeInt(this.isStartGame ? 1 : 0);
        parcel.writeParcelable(this.selfPlayPreviousInfo, i);
        parcel.writeString(this.taskID);
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
        EnumC19360610om enumC19360610om = this.sortOrder;
        if (enumC19360610om == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC19360610om.name());
        }
        EnumC19360410ok enumC19360410ok = this.scoreType;
        if (enumC19360410ok == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC19360410ok.name());
        }
        parcel.writeInt(this.requiredMic ? 1 : 0);
        this.gameMainFlowEventParameters.writeToParcel(parcel, i);
    }

    public IMGameCameraInfo(String str, Effect effect, List<String> list, GameParticipantScoreComponent gameParticipantScoreComponent, String str2, boolean z, GameParticipantScoreComponent gameParticipantScoreComponent2, String str3, List<GameParticipantScoreComponent> list2, boolean z2, EnumC19360610om enumC19360610om, EnumC19360410ok enumC19360410ok, boolean z3, GameMainFlowEventParameters gameMainFlowEventParameters) {
        this.conversationId = str;
        this.effect = effect;
        this.effectThumbnail = list;
        this.othersPlayInfo = gameParticipantScoreComponent;
        this.otherUid = str2;
        this.isStartGame = z;
        this.selfPlayPreviousInfo = gameParticipantScoreComponent2;
        this.taskID = str3;
        this.scoreList = list2;
        this.hasMoreParticipants = z2;
        this.sortOrder = enumC19360610om;
        this.scoreType = enumC19360410ok;
        this.requiredMic = z3;
        this.gameMainFlowEventParameters = gameMainFlowEventParameters;
    }
}
