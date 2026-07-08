package com.ss.android.ugc.airemix.model.mob.datasource;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCreationInputInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixCreationInputInfo extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIRemixCreationInputInfo> CREATOR = new Parcelable.Creator<AIRemixCreationInputInfo>() { // from class: X.0Lg1
        @Override // android.os.Parcelable.Creator
        public final AIRemixCreationInputInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            Integer numValueOf4;
            Integer numValueOf5;
            Integer numValueOf6;
            Integer numValueOf7;
            Integer numValueOf8;
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf9 = null;
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
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
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
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf4 = null;
            } else {
                numValueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf5 = null;
            } else {
                numValueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf6 = null;
            } else {
                numValueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf7 = null;
            } else {
                numValueOf7 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf8 = null;
            } else {
                numValueOf8 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf9 = Integer.valueOf(parcel.readInt());
            }
            return new AIRemixCreationInputInfo(i, string, string2, string3, boolValueOf, string4, string5, string6, string7, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixCreationInputInfo[] newArray(int i) {
            return new AIRemixCreationInputInfo[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("actors_cnt")
    public final int actorsCnt;

    @InterfaceC553020LmW
    @C09CT("actors_ship_list")
    public final String actorsShipList;

    @InterfaceC553020LmW
    @C09CT("actors_list")
    public final String actorsUidList;

    @InterfaceC553020LmW
    @C09CT("content_source")
    public final String contentSource;

    @C09CT("enter_from")
    public final String enterFrom;

    @InterfaceC553020LmW
    @C09CT("generate_round")
    public final Integer generateRound;

    @InterfaceC553020LmW
    @C09CT("generate_total")
    public final Integer generateTotal;

    @InterfaceC553020LmW
    @C09CT("is_ref_image")
    public final Boolean isRefImage;

    @InterfaceC553020LmW
    @C09CT("is_retry")
    public final int isRetry;

    @InterfaceC553020LmW
    @C09CT("message_round")
    public final Integer messageRound;

    @C040H
    public final String name;

    @C09CT("post_creation_id")
    public final String postCreationId;

    @InterfaceC553020LmW
    @C09CT("preset_gameplay_id")
    public final String presetGameplayId;

    @InterfaceC553020LmW
    @C09CT("prompt_cameoid_cnt")
    public final Integer promptCameoIdCnt;

    @InterfaceC553020LmW
    @C09CT("prompt_photo_cnt")
    public final Integer promptPhotoCnt;

    @InterfaceC553020LmW
    @C09CT("prompt_source")
    public final String promptSource;

    @InterfaceC553020LmW
    @C09CT("prompt_type")
    public final String promptType;

    @InterfaceC553020LmW
    @C09CT("prompt_voice_time")
    public final Integer promptVoiceTime;

    @InterfaceC553020LmW
    @C09CT("send_message_cnt")
    public final Integer sendMessageCnt;

    @InterfaceC553020LmW
    @C09CT("send_message_total")
    public final Integer sendMessageTotal;

    @InterfaceC553020LmW
    @C09CT("server_task_id")
    public final String serverTaskId;

    @InterfaceC553020LmW
    @C09CT("video_time")
    public final Integer videoTime;

    public AIRemixCreationInputInfo() {
        this(0, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixCreationInputInfo)) {
            return false;
        }
        AIRemixCreationInputInfo aIRemixCreationInputInfo = (AIRemixCreationInputInfo) obj;
        return this.actorsCnt == aIRemixCreationInputInfo.actorsCnt && Intrinsics.LJFF(this.actorsUidList, aIRemixCreationInputInfo.actorsUidList) && Intrinsics.LJFF(this.actorsShipList, aIRemixCreationInputInfo.actorsShipList) && Intrinsics.LJFF(this.serverTaskId, aIRemixCreationInputInfo.serverTaskId) && Intrinsics.LJFF(this.isRefImage, aIRemixCreationInputInfo.isRefImage) && Intrinsics.LJFF(this.promptSource, aIRemixCreationInputInfo.promptSource) && Intrinsics.LJFF(this.contentSource, aIRemixCreationInputInfo.contentSource) && Intrinsics.LJFF(this.promptType, aIRemixCreationInputInfo.promptType) && Intrinsics.LJFF(this.presetGameplayId, aIRemixCreationInputInfo.presetGameplayId) && Intrinsics.LJFF(this.promptPhotoCnt, aIRemixCreationInputInfo.promptPhotoCnt) && Intrinsics.LJFF(this.promptCameoIdCnt, aIRemixCreationInputInfo.promptCameoIdCnt) && Intrinsics.LJFF(this.promptVoiceTime, aIRemixCreationInputInfo.promptVoiceTime) && Intrinsics.LJFF(this.generateRound, aIRemixCreationInputInfo.generateRound) && Intrinsics.LJFF(this.messageRound, aIRemixCreationInputInfo.messageRound) && Intrinsics.LJFF(this.sendMessageTotal, aIRemixCreationInputInfo.sendMessageTotal) && Intrinsics.LJFF(this.sendMessageCnt, aIRemixCreationInputInfo.sendMessageCnt) && Intrinsics.LJFF(this.generateTotal, aIRemixCreationInputInfo.generateTotal) && Intrinsics.LJFF(this.videoTime, aIRemixCreationInputInfo.videoTime) && this.isRetry == aIRemixCreationInputInfo.isRetry && Intrinsics.LJFF(this.postCreationId, aIRemixCreationInputInfo.postCreationId) && Intrinsics.LJFF(this.enterFrom, aIRemixCreationInputInfo.enterFrom);
    }

    public final int hashCode() {
        int i = this.actorsCnt * 31;
        String str = this.actorsUidList;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actorsShipList;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serverTaskId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isRefImage;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.promptSource;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contentSource;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.promptType;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.presetGameplayId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.promptPhotoCnt;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.promptCameoIdCnt;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.promptVoiceTime;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.generateRound;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.messageRound;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.sendMessageTotal;
        int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.sendMessageCnt;
        int iHashCode15 = (iHashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.generateTotal;
        int iHashCode16 = (iHashCode15 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.videoTime;
        int iHashCode17 = (((iHashCode16 + (num9 == null ? 0 : num9.hashCode())) * 31) + this.isRetry) * 31;
        String str8 = this.postCreationId;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.enterFrom;
        return iHashCode18 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return "AIRemixCreationInputInfo(actorsCnt=" + this.actorsCnt + ", actorsUidList=" + this.actorsUidList + ", actorsShipList=" + this.actorsShipList + ", serverTaskId=" + this.serverTaskId + ", isRefImage=" + this.isRefImage + ", promptSource=" + this.promptSource + ", contentSource=" + this.contentSource + ", promptType=" + this.promptType + ", presetGameplayId=" + this.presetGameplayId + ", promptPhotoCnt=" + this.promptPhotoCnt + ", promptCameoIdCnt=" + this.promptCameoIdCnt + ", promptVoiceTime=" + this.promptVoiceTime + ", generateRound=" + this.generateRound + ", messageRound=" + this.messageRound + ", sendMessageTotal=" + this.sendMessageTotal + ", sendMessageCnt=" + this.sendMessageCnt + ", generateTotal=" + this.generateTotal + ", videoTime=" + this.videoTime + ", isRetry=" + this.isRetry + ", postCreationId=" + this.postCreationId + ", enterFrom=" + this.enterFrom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.actorsCnt);
        parcel.writeString(this.actorsUidList);
        parcel.writeString(this.actorsShipList);
        parcel.writeString(this.serverTaskId);
        Boolean bool = this.isRefImage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.promptSource);
        parcel.writeString(this.contentSource);
        parcel.writeString(this.promptType);
        parcel.writeString(this.presetGameplayId);
        Integer num = this.promptPhotoCnt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.promptCameoIdCnt;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.promptVoiceTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.generateRound;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.messageRound;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.sendMessageTotal;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.sendMessageCnt;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.generateTotal;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Integer num9 = this.videoTime;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        parcel.writeInt(this.isRetry);
        parcel.writeString(this.postCreationId);
        parcel.writeString(this.enterFrom);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public static AIRemixCreationInputInfo LIZ(AIRemixCreationInputInfo aIRemixCreationInputInfo, Integer num, String str, String str2, int i) {
        int i2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        String str6;
        String str7;
        String str8;
        String str9;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        String str10 = str;
        String str11 = str2;
        Integer num9 = num;
        int i3 = 0;
        if ((i & 1) != 0) {
            i2 = aIRemixCreationInputInfo.actorsCnt;
        } else {
            i2 = 0;
        }
        Integer num10 = null;
        if ((i & 2) != 0) {
            str3 = aIRemixCreationInputInfo.actorsUidList;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = aIRemixCreationInputInfo.actorsShipList;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            str5 = aIRemixCreationInputInfo.serverTaskId;
        } else {
            str5 = null;
        }
        if ((i & 16) != 0) {
            bool = aIRemixCreationInputInfo.isRefImage;
        } else {
            bool = null;
        }
        if ((i & 32) != 0) {
            str6 = aIRemixCreationInputInfo.promptSource;
        } else {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = aIRemixCreationInputInfo.contentSource;
        } else {
            str7 = null;
        }
        if ((i & 128) != 0) {
            str8 = aIRemixCreationInputInfo.promptType;
        } else {
            str8 = null;
        }
        if ((i & 256) != 0) {
            str9 = aIRemixCreationInputInfo.presetGameplayId;
        } else {
            str9 = null;
        }
        if ((i & 512) != 0) {
            num2 = aIRemixCreationInputInfo.promptPhotoCnt;
        } else {
            num2 = null;
        }
        if ((i & 1024) != 0) {
            num3 = aIRemixCreationInputInfo.promptCameoIdCnt;
        } else {
            num3 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num4 = aIRemixCreationInputInfo.promptVoiceTime;
        } else {
            num4 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num5 = aIRemixCreationInputInfo.generateRound;
        } else {
            num5 = null;
        }
        if ((i & 8192) != 0) {
            num6 = aIRemixCreationInputInfo.messageRound;
        } else {
            num6 = null;
        }
        if ((i & 16384) != 0) {
            num7 = aIRemixCreationInputInfo.sendMessageTotal;
        } else {
            num7 = null;
        }
        if ((32768 & i) != 0) {
            num8 = aIRemixCreationInputInfo.sendMessageCnt;
        } else {
            num8 = null;
        }
        if ((65536 & i) != 0) {
            num10 = aIRemixCreationInputInfo.generateTotal;
        }
        if ((131072 & i) != 0) {
            num9 = aIRemixCreationInputInfo.videoTime;
        }
        if ((262144 & i) != 0) {
            i3 = aIRemixCreationInputInfo.isRetry;
        }
        if ((524288 & i) != 0) {
            str10 = aIRemixCreationInputInfo.postCreationId;
        }
        if ((i & 1048576) != 0) {
            str11 = aIRemixCreationInputInfo.enterFrom;
        }
        aIRemixCreationInputInfo.getClass();
        return new AIRemixCreationInputInfo(i2, str3, str4, str5, bool, str6, str7, str8, str9, num2, num3, num4, num5, num6, num7, num8, num10, num9, i3, str10, str11);
    }

    public AIRemixCreationInputInfo(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i2, String str8, String str9) {
        this.actorsCnt = i;
        this.actorsUidList = str;
        this.actorsShipList = str2;
        this.serverTaskId = str3;
        this.isRefImage = bool;
        this.promptSource = str4;
        this.contentSource = str5;
        this.promptType = str6;
        this.presetGameplayId = str7;
        this.promptPhotoCnt = num;
        this.promptCameoIdCnt = num2;
        this.promptVoiceTime = num3;
        this.generateRound = num4;
        this.messageRound = num5;
        this.sendMessageTotal = num6;
        this.sendMessageCnt = num7;
        this.generateTotal = num8;
        this.videoTime = num9;
        this.isRetry = i2;
        this.postCreationId = str8;
        this.enterFrom = str9;
        this.name = "AIRemixCreationInputInfo";
    }
}
