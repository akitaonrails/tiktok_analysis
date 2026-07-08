package com.ss.android.ugc.aweme.aigc.quality.mob.business;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CS;
import X.C09CT;
import X.C0LQY;
import X.C786410Ut5;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceHasCameo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCEntranceInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIGCEntranceInfo> CREATOR = new Parcelable.Creator<AIGCEntranceInfo>() { // from class: X.0L0D
        @Override // android.os.Parcelable.Creator
        public final AIGCEntranceInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            Integer numValueOf2;
            C0LQY c0lqyValueOf = C0LQY.valueOf(parcel.readString());
            String string = parcel.readString();
            int i = parcel.readInt();
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
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            AIGC.AICreationSceneName aICreationSceneName = (AIGC.AICreationSceneName) parcel.readParcelable(AIGCEntranceInfo.class.getClassLoader());
            AIGC.RefPageName refPageName = (AIGC.RefPageName) parcel.readParcelable(AIGCEntranceInfo.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            AIGC.RecallWay recallWay = (AIGC.RecallWay) parcel.readParcelable(AIGCEntranceInfo.class.getClassLoader());
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new AIGCEntranceInfo(c0lqyValueOf, string, i, boolValueOf, string2, numValueOf, z2, z3, z4, aICreationSceneName, refPageName, string3, string4, recallWay, string5, z5, z6, string6, string7, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final AIGCEntranceInfo[] newArray(int i) {
            return new AIGCEntranceInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("ai_biz")
    public final C0LQY aiBiz;

    @InterfaceC553020LmW
    @C09CT("enter_from")
    public final String enterFrom;

    @InterfaceC553020LmW
    @C09CT("enter_method")
    public final String enterMethod;

    @InterfaceC553020LmW
    @C09CT("faceid_created_way")
    public String faceIdCreatedWay;

    @InterfaceC553020LmW
    @C09CT("uid")
    public final String friendUid;

    @InterfaceC553020LmW
    @C09CT("is_regenerate")
    public final boolean fromGenerateFailure;

    @InterfaceC553020LmW
    @C09CT("from_group_id")
    public final String fromGroupId;

    @InterfaceC553020LmW
    @C09CT("has_cameo")
    @C09CS(AIGCEntranceHasCameo.GsonAdapter.class)
    public int hasCameo;

    @InterfaceC553020LmW
    @C09CT("has_cameo_change")
    public Boolean hasCameoChange;

    @InterfaceC553020LmW
    @C09CT("is_draft")
    public final boolean isDraft;

    @InterfaceC553020LmW
    @C09CT("is_first_ai_self_auto_cast")
    public boolean isFirstAISelfAutoCast;

    @InterfaceC553020LmW
    @C09CT("first_enter_create_video")
    public final boolean isFirstEnter;

    @InterfaceC553020LmW
    @C09CT("is_follow_change")
    public final boolean isFollowChange;

    @InterfaceC553020LmW
    @C09CT("lastpage_play_gid")
    public final String lastPagePlayGid;

    @C040H
    public final String name;

    @InterfaceC553020LmW
    @C09CT("recall_way")
    public final AIGC.RecallWay recallWay;

    @InterfaceC553020LmW
    @C09CT(alternate = {"prepage_name"}, value = "referpage_name")
    public final AIGC.RefPageName refPageName;

    @InterfaceC553020LmW
    @C09CT("aicreation_scene_name")
    public final AIGC.AICreationSceneName sceneName;

    @InterfaceC553020LmW
    @C09CT("face_sound_verify_filter")
    public Integer selfCameoFilter;

    @C09CT("shoot_mode")
    public Integer shootMode;

    @InterfaceC553020LmW
    @C09CT("shoot_way")
    public final String shootWay;

    public AIGCEntranceInfo() {
        this(C0LQY.AI_THEATER, null, 0, null, null, null, false, false, false, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.RefPageName.NoNeed.INSTANCE, null, null, null, null, false, false, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCEntranceInfo)) {
            return false;
        }
        AIGCEntranceInfo aIGCEntranceInfo = (AIGCEntranceInfo) obj;
        return this.aiBiz == aIGCEntranceInfo.aiBiz && Intrinsics.LJFF(this.shootWay, aIGCEntranceInfo.shootWay) && this.hasCameo == aIGCEntranceInfo.hasCameo && Intrinsics.LJFF(this.hasCameoChange, aIGCEntranceInfo.hasCameoChange) && Intrinsics.LJFF(this.faceIdCreatedWay, aIGCEntranceInfo.faceIdCreatedWay) && Intrinsics.LJFF(this.selfCameoFilter, aIGCEntranceInfo.selfCameoFilter) && this.isFirstAISelfAutoCast == aIGCEntranceInfo.isFirstAISelfAutoCast && this.isFirstEnter == aIGCEntranceInfo.isFirstEnter && this.isDraft == aIGCEntranceInfo.isDraft && Intrinsics.LJFF(this.sceneName, aIGCEntranceInfo.sceneName) && Intrinsics.LJFF(this.refPageName, aIGCEntranceInfo.refPageName) && Intrinsics.LJFF(this.enterFrom, aIGCEntranceInfo.enterFrom) && Intrinsics.LJFF(this.enterMethod, aIGCEntranceInfo.enterMethod) && Intrinsics.LJFF(this.recallWay, aIGCEntranceInfo.recallWay) && Intrinsics.LJFF(this.friendUid, aIGCEntranceInfo.friendUid) && this.fromGenerateFailure == aIGCEntranceInfo.fromGenerateFailure && this.isFollowChange == aIGCEntranceInfo.isFollowChange && Intrinsics.LJFF(this.fromGroupId, aIGCEntranceInfo.fromGroupId) && Intrinsics.LJFF(this.lastPagePlayGid, aIGCEntranceInfo.lastPagePlayGid) && Intrinsics.LJFF(this.shootMode, aIGCEntranceInfo.shootMode);
    }

    public final int hashCode() {
        int iHashCode = this.aiBiz.hashCode() * 31;
        String str = this.shootWay;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.hasCameo) * 31;
        Boolean bool = this.hasCameoChange;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.faceIdCreatedWay;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.selfCameoFilter;
        int iHashCode5 = (((((((((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.isFirstAISelfAutoCast)) * 31) + C786410Ut5.Z2(this.isFirstEnter)) * 31) + C786410Ut5.Z2(this.isDraft)) * 31) + this.sceneName.hashCode()) * 31) + this.refPageName.hashCode()) * 31;
        String str3 = this.enterFrom;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AIGC.RecallWay recallWay = this.recallWay;
        int iHashCode8 = (iHashCode7 + (recallWay == null ? 0 : recallWay.hashCode())) * 31;
        String str5 = this.friendUid;
        int iHashCode9 = (((((iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.fromGenerateFailure)) * 31) + C786410Ut5.Z2(this.isFollowChange)) * 31;
        String str6 = this.fromGroupId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastPagePlayGid;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.shootMode;
        return iHashCode11 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "AIGCEntranceInfo(aiBiz=" + this.aiBiz + ", shootWay=" + this.shootWay + ", hasCameo=" + this.hasCameo + ", hasCameoChange=" + this.hasCameoChange + ", faceIdCreatedWay=" + this.faceIdCreatedWay + ", selfCameoFilter=" + this.selfCameoFilter + ", isFirstAISelfAutoCast=" + this.isFirstAISelfAutoCast + ", isFirstEnter=" + this.isFirstEnter + ", isDraft=" + this.isDraft + ", sceneName=" + this.sceneName + ", refPageName=" + this.refPageName + ", enterFrom=" + this.enterFrom + ", enterMethod=" + this.enterMethod + ", recallWay=" + this.recallWay + ", friendUid=" + this.friendUid + ", fromGenerateFailure=" + this.fromGenerateFailure + ", isFollowChange=" + this.isFollowChange + ", fromGroupId=" + this.fromGroupId + ", lastPagePlayGid=" + this.lastPagePlayGid + ", shootMode=" + this.shootMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aiBiz.name());
        parcel.writeString(this.shootWay);
        parcel.writeInt(this.hasCameo);
        Boolean bool = this.hasCameoChange;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.faceIdCreatedWay);
        Integer num = this.selfCameoFilter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.isFirstAISelfAutoCast ? 1 : 0);
        parcel.writeInt(this.isFirstEnter ? 1 : 0);
        parcel.writeInt(this.isDraft ? 1 : 0);
        parcel.writeParcelable(this.sceneName, i);
        parcel.writeParcelable(this.refPageName, i);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        parcel.writeParcelable(this.recallWay, i);
        parcel.writeString(this.friendUid);
        parcel.writeInt(this.fromGenerateFailure ? 1 : 0);
        parcel.writeInt(this.isFollowChange ? 1 : 0);
        parcel.writeString(this.fromGroupId);
        parcel.writeString(this.lastPagePlayGid);
        Integer num2 = this.shootMode;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public static AIGCEntranceInfo LIZ(AIGCEntranceInfo aIGCEntranceInfo, C0LQY c0lqy, String str, int i, Boolean bool, String str2, boolean z, boolean z2, boolean z3, AIGC.AICreationSceneName aICreationSceneName, AIGC.RefPageName refPageName, String str3, String str4, AIGC.RecallWay recallWay, String str5, boolean z4, boolean z5, int i2) {
        Integer num;
        String str6;
        String str7;
        boolean z6 = z4;
        String str8 = str5;
        AIGC.RecallWay recallWay2 = recallWay;
        String str9 = str4;
        boolean z7 = z;
        String str10 = str3;
        String str11 = str2;
        AIGC.RefPageName refPageName2 = refPageName;
        Boolean bool2 = bool;
        boolean z8 = z5;
        AIGC.AICreationSceneName aICreationSceneName2 = aICreationSceneName;
        int i3 = i;
        boolean z9 = z3;
        String str12 = str;
        boolean z10 = z2;
        C0LQY c0lqy2 = c0lqy;
        if ((i2 & 1) != 0) {
            c0lqy2 = aIGCEntranceInfo.aiBiz;
        }
        if ((i2 & 2) != 0) {
            str12 = aIGCEntranceInfo.shootWay;
        }
        if ((i2 & 4) != 0) {
            i3 = aIGCEntranceInfo.hasCameo;
        }
        if ((i2 & 8) != 0) {
            bool2 = aIGCEntranceInfo.hasCameoChange;
        }
        if ((i2 & 16) != 0) {
            str11 = aIGCEntranceInfo.faceIdCreatedWay;
        }
        Integer num2 = null;
        if ((i2 & 32) != 0) {
            num = aIGCEntranceInfo.selfCameoFilter;
        } else {
            num = null;
        }
        if ((i2 & 64) != 0) {
            z7 = aIGCEntranceInfo.isFirstAISelfAutoCast;
        }
        if ((i2 & 128) != 0) {
            z10 = aIGCEntranceInfo.isFirstEnter;
        }
        if ((i2 & 256) != 0) {
            z9 = aIGCEntranceInfo.isDraft;
        }
        if ((i2 & 512) != 0) {
            aICreationSceneName2 = aIGCEntranceInfo.sceneName;
        }
        if ((i2 & 1024) != 0) {
            refPageName2 = aIGCEntranceInfo.refPageName;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str10 = aIGCEntranceInfo.enterFrom;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = aIGCEntranceInfo.enterMethod;
        }
        if ((i2 & 8192) != 0) {
            recallWay2 = aIGCEntranceInfo.recallWay;
        }
        if ((i2 & 16384) != 0) {
            str8 = aIGCEntranceInfo.friendUid;
        }
        if ((32768 & i2) != 0) {
            z6 = aIGCEntranceInfo.fromGenerateFailure;
        }
        if ((65536 & i2) != 0) {
            z8 = aIGCEntranceInfo.isFollowChange;
        }
        if ((131072 & i2) != 0) {
            str6 = aIGCEntranceInfo.fromGroupId;
        } else {
            str6 = null;
        }
        if ((262144 & i2) != 0) {
            str7 = aIGCEntranceInfo.lastPagePlayGid;
        } else {
            str7 = null;
        }
        if ((i2 & 524288) != 0) {
            num2 = aIGCEntranceInfo.shootMode;
        }
        aIGCEntranceInfo.getClass();
        return new AIGCEntranceInfo(c0lqy2, str12, i3, bool2, str11, num, z7, z10, z9, aICreationSceneName2, refPageName2, str10, str9, recallWay2, str8, z6, z8, str6, str7, num2);
    }

    public AIGCEntranceInfo(C0LQY c0lqy, String str, int i, Boolean bool, String str2, Integer num, boolean z, boolean z2, boolean z3, AIGC.AICreationSceneName aICreationSceneName, AIGC.RefPageName refPageName, String str3, String str4, AIGC.RecallWay recallWay, String str5, boolean z4, boolean z5, String str6, String str7, Integer num2) {
        this.aiBiz = c0lqy;
        this.shootWay = str;
        this.hasCameo = i;
        this.hasCameoChange = bool;
        this.faceIdCreatedWay = str2;
        this.selfCameoFilter = num;
        this.isFirstAISelfAutoCast = z;
        this.isFirstEnter = z2;
        this.isDraft = z3;
        this.sceneName = aICreationSceneName;
        this.refPageName = refPageName;
        this.enterFrom = str3;
        this.enterMethod = str4;
        this.recallWay = recallWay;
        this.friendUid = str5;
        this.fromGenerateFailure = z4;
        this.isFollowChange = z5;
        this.fromGroupId = str6;
        this.lastPagePlayGid = str7;
        this.shootMode = num2;
        this.name = "AIGCEntranceInfo";
    }
}
