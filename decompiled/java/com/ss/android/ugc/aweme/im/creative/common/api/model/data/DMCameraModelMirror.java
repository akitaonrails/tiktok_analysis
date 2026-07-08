package com.ss.android.ugc.aweme.im.creative.common.api.model.data;

import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.DMCameraModelMirror;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.GroupShotParam;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC1294060jmO
public final class DMCameraModelMirror implements Parcelable {
    public static final Parcelable.Creator<DMCameraModelMirror> CREATOR = new Parcelable.Creator<DMCameraModelMirror>() { // from class: X.0mfu
        @Override // android.os.Parcelable.Creator
        public final DMCameraModelMirror createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            Boolean boolValueOf;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            Long lValueOf;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            boolean z10;
            boolean z11;
            boolean z12;
            GroupShotParam groupShotParamCreateFromParcel;
            boolean z13;
            boolean z14;
            boolean z15;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolValueOf = Boolean.valueOf(z5);
            }
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i6 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() == 0) {
                groupShotParamCreateFromParcel = null;
            } else {
                groupShotParamCreateFromParcel = GroupShotParam.CREATOR.createFromParcel(parcel);
            }
            GroupShotParam groupShotParam = groupShotParamCreateFromParcel;
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            String string13 = parcel.readString();
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            return new DMCameraModelMirror(z, string, string2, z2, z3, z4, string3, boolValueOf, i, z6, i2, string4, i3, string5, string6, z7, z8, z9, lValueOf, linkedHashMap, linkedHashMap2, string7, string8, string9, string10, z10, z11, z12, groupShotParam, string11, string12, z13, string13, z14, z15, parcel.readString(), (QuoteMode) parcel.readParcelable(DMCameraModelMirror.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DMCameraModelMirror[] newArray(int i) {
            return new DMCameraModelMirror[i];
        }
    };
    public final int chatType;
    public final String effectIconUrl;
    public final String effectName;
    public final Long effectTriggerMsgSentServerTime;
    public final boolean enableGroupShot;
    public final boolean enablePhotoSwap;
    public final boolean enablePlayground;
    public final boolean enableTextStickerOnRecord;
    public final String enterDM;
    public final String enterDMWay;
    public final boolean enterFromDM;
    public final String enterMethod;
    public final String enterMethodDM;
    public final String enterMethodType;
    public final boolean fetchGroupEffectForAIGroupShot;
    public final GroupShotParam groupShotData;
    public final boolean hasReportedFirstCrossClick;
    public final String initialEffectId;
    public final boolean isBulletin;
    public final boolean isFromEffectButton;
    public final boolean isStoryQuickImmersiveReply;
    public final Boolean isVideo;
    public final int maxSelectableVideoDuration;
    public final Map<String, String> openCameraOrAlbumMobMap;
    public final Map<String, String> openCameraOrAlbumMobMapV2;
    public final String photoSwapPairedMsgId;
    public final String photoSwapScene;
    public final QuoteMode quoteMode;
    public final String receiverNickname;
    public final String searchSessionId;
    public final String sessionID;
    public final boolean shouldDisplayRecordGuide;
    public final boolean shouldDisplayRestrictSharingNoticeShooting;
    public final boolean shouldDisplayTnsNoticeAlbum;
    public final boolean shouldDisplayTnsNoticeShooting;
    public final int tnsNoticeRes;
    public final String toUserId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DMCameraModelMirror() {
        Object[] objArr = 0 == true ? 1 : 0;
        this(false, null, 0 == true ? 1 : 0, objArr, 0 == true ? 1 : 0, -1, 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMCameraModelMirror)) {
            return false;
        }
        DMCameraModelMirror dMCameraModelMirror = (DMCameraModelMirror) obj;
        return this.enterFromDM == dMCameraModelMirror.enterFromDM && Intrinsics.LJFF(this.enterMethodDM, dMCameraModelMirror.enterMethodDM) && Intrinsics.LJFF(this.enterDM, dMCameraModelMirror.enterDM) && this.shouldDisplayRestrictSharingNoticeShooting == dMCameraModelMirror.shouldDisplayRestrictSharingNoticeShooting && this.shouldDisplayTnsNoticeShooting == dMCameraModelMirror.shouldDisplayTnsNoticeShooting && this.shouldDisplayRecordGuide == dMCameraModelMirror.shouldDisplayRecordGuide && Intrinsics.LJFF(this.receiverNickname, dMCameraModelMirror.receiverNickname) && Intrinsics.LJFF(this.isVideo, dMCameraModelMirror.isVideo) && this.maxSelectableVideoDuration == dMCameraModelMirror.maxSelectableVideoDuration && this.shouldDisplayTnsNoticeAlbum == dMCameraModelMirror.shouldDisplayTnsNoticeAlbum && this.tnsNoticeRes == dMCameraModelMirror.tnsNoticeRes && Intrinsics.LJFF(this.sessionID, dMCameraModelMirror.sessionID) && this.chatType == dMCameraModelMirror.chatType && Intrinsics.LJFF(this.effectName, dMCameraModelMirror.effectName) && Intrinsics.LJFF(this.effectIconUrl, dMCameraModelMirror.effectIconUrl) && this.hasReportedFirstCrossClick == dMCameraModelMirror.hasReportedFirstCrossClick && this.isBulletin == dMCameraModelMirror.isBulletin && this.enableTextStickerOnRecord == dMCameraModelMirror.enableTextStickerOnRecord && Intrinsics.LJFF(this.effectTriggerMsgSentServerTime, dMCameraModelMirror.effectTriggerMsgSentServerTime) && Intrinsics.LJFF(this.openCameraOrAlbumMobMap, dMCameraModelMirror.openCameraOrAlbumMobMap) && Intrinsics.LJFF(this.openCameraOrAlbumMobMapV2, dMCameraModelMirror.openCameraOrAlbumMobMapV2) && Intrinsics.LJFF(this.photoSwapScene, dMCameraModelMirror.photoSwapScene) && Intrinsics.LJFF(this.photoSwapPairedMsgId, dMCameraModelMirror.photoSwapPairedMsgId) && Intrinsics.LJFF(this.enterMethodType, dMCameraModelMirror.enterMethodType) && Intrinsics.LJFF(this.enterMethod, dMCameraModelMirror.enterMethod) && this.enablePhotoSwap == dMCameraModelMirror.enablePhotoSwap && this.enableGroupShot == dMCameraModelMirror.enableGroupShot && this.enablePlayground == dMCameraModelMirror.enablePlayground && Intrinsics.LJFF(this.groupShotData, dMCameraModelMirror.groupShotData) && Intrinsics.LJFF(this.toUserId, dMCameraModelMirror.toUserId) && Intrinsics.LJFF(this.searchSessionId, dMCameraModelMirror.searchSessionId) && this.isFromEffectButton == dMCameraModelMirror.isFromEffectButton && Intrinsics.LJFF(this.initialEffectId, dMCameraModelMirror.initialEffectId) && this.fetchGroupEffectForAIGroupShot == dMCameraModelMirror.fetchGroupEffectForAIGroupShot && this.isStoryQuickImmersiveReply == dMCameraModelMirror.isStoryQuickImmersiveReply && Intrinsics.LJFF(this.enterDMWay, dMCameraModelMirror.enterDMWay) && Intrinsics.LJFF(this.quoteMode, dMCameraModelMirror.quoteMode);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enterFromDM) * 31;
        String str = this.enterMethodDM;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.enterDM;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.shouldDisplayRestrictSharingNoticeShooting)) * 31) + C786410Ut5.Z2(this.shouldDisplayTnsNoticeShooting)) * 31) + C786410Ut5.Z2(this.shouldDisplayRecordGuide)) * 31;
        String str3 = this.receiverNickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isVideo;
        int iHashCode4 = (((((((((((((((((((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.maxSelectableVideoDuration) * 31) + C786410Ut5.Z2(this.shouldDisplayTnsNoticeAlbum)) * 31) + this.tnsNoticeRes) * 31) + this.sessionID.hashCode()) * 31) + this.chatType) * 31) + this.effectName.hashCode()) * 31) + this.effectIconUrl.hashCode()) * 31) + C786410Ut5.Z2(this.hasReportedFirstCrossClick)) * 31) + C786410Ut5.Z2(this.isBulletin)) * 31) + C786410Ut5.Z2(this.enableTextStickerOnRecord)) * 31;
        Long l = this.effectTriggerMsgSentServerTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Map<String, String> map = this.openCameraOrAlbumMobMap;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.openCameraOrAlbumMobMapV2;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str4 = this.photoSwapScene;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photoSwapPairedMsgId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.enterMethodType;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.enterMethod;
        int iHashCode11 = (((((((iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.enablePhotoSwap)) * 31) + C786410Ut5.Z2(this.enableGroupShot)) * 31) + C786410Ut5.Z2(this.enablePlayground)) * 31;
        GroupShotParam groupShotParam = this.groupShotData;
        int iHashCode12 = (iHashCode11 + (groupShotParam == null ? 0 : groupShotParam.hashCode())) * 31;
        String str8 = this.toUserId;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.searchSessionId;
        int iHashCode14 = (((iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31) + C786410Ut5.Z2(this.isFromEffectButton)) * 31;
        String str10 = this.initialEffectId;
        int iHashCode15 = (((((((iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31) + C786410Ut5.Z2(this.fetchGroupEffectForAIGroupShot)) * 31) + C786410Ut5.Z2(this.isStoryQuickImmersiveReply)) * 31) + this.enterDMWay.hashCode()) * 31;
        QuoteMode quoteMode = this.quoteMode;
        return iHashCode15 + (quoteMode != null ? quoteMode.hashCode() : 0);
    }

    public final String toString() {
        return "DMCameraModelMirror(enterFromDM=" + this.enterFromDM + ", enterMethodDM=" + this.enterMethodDM + ", enterDM=" + this.enterDM + ", shouldDisplayRestrictSharingNoticeShooting=" + this.shouldDisplayRestrictSharingNoticeShooting + ", shouldDisplayTnsNoticeShooting=" + this.shouldDisplayTnsNoticeShooting + ", shouldDisplayRecordGuide=" + this.shouldDisplayRecordGuide + ", receiverNickname=" + this.receiverNickname + ", isVideo=" + this.isVideo + ", maxSelectableVideoDuration=" + this.maxSelectableVideoDuration + ", shouldDisplayTnsNoticeAlbum=" + this.shouldDisplayTnsNoticeAlbum + ", tnsNoticeRes=" + this.tnsNoticeRes + ", sessionID=" + this.sessionID + ", chatType=" + this.chatType + ", effectName=" + this.effectName + ", effectIconUrl=" + this.effectIconUrl + ", hasReportedFirstCrossClick=" + this.hasReportedFirstCrossClick + ", isBulletin=" + this.isBulletin + ", enableTextStickerOnRecord=" + this.enableTextStickerOnRecord + ", effectTriggerMsgSentServerTime=" + this.effectTriggerMsgSentServerTime + ", openCameraOrAlbumMobMap=" + this.openCameraOrAlbumMobMap + ", openCameraOrAlbumMobMapV2=" + this.openCameraOrAlbumMobMapV2 + ", photoSwapScene=" + this.photoSwapScene + ", photoSwapPairedMsgId=" + this.photoSwapPairedMsgId + ", enterMethodType=" + this.enterMethodType + ", enterMethod=" + this.enterMethod + ", enablePhotoSwap=" + this.enablePhotoSwap + ", enableGroupShot=" + this.enableGroupShot + ", enablePlayground=" + this.enablePlayground + ", groupShotData=" + this.groupShotData + ", toUserId=" + this.toUserId + ", searchSessionId=" + this.searchSessionId + ", isFromEffectButton=" + this.isFromEffectButton + ", initialEffectId=" + this.initialEffectId + ", fetchGroupEffectForAIGroupShot=" + this.fetchGroupEffectForAIGroupShot + ", isStoryQuickImmersiveReply=" + this.isStoryQuickImmersiveReply + ", enterDMWay=" + this.enterDMWay + ", quoteMode=" + this.quoteMode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enterFromDM ? 1 : 0);
        parcel.writeString(this.enterMethodDM);
        parcel.writeString(this.enterDM);
        parcel.writeInt(this.shouldDisplayRestrictSharingNoticeShooting ? 1 : 0);
        parcel.writeInt(this.shouldDisplayTnsNoticeShooting ? 1 : 0);
        parcel.writeInt(this.shouldDisplayRecordGuide ? 1 : 0);
        parcel.writeString(this.receiverNickname);
        Boolean bool = this.isVideo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.maxSelectableVideoDuration);
        parcel.writeInt(this.shouldDisplayTnsNoticeAlbum ? 1 : 0);
        parcel.writeInt(this.tnsNoticeRes);
        parcel.writeString(this.sessionID);
        parcel.writeInt(this.chatType);
        parcel.writeString(this.effectName);
        parcel.writeString(this.effectIconUrl);
        parcel.writeInt(this.hasReportedFirstCrossClick ? 1 : 0);
        parcel.writeInt(this.isBulletin ? 1 : 0);
        parcel.writeInt(this.enableTextStickerOnRecord ? 1 : 0);
        Long l = this.effectTriggerMsgSentServerTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Map<String, String> map = this.openCameraOrAlbumMobMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, String> map2 = this.openCameraOrAlbumMobMapV2;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeString(this.photoSwapScene);
        parcel.writeString(this.photoSwapPairedMsgId);
        parcel.writeString(this.enterMethodType);
        parcel.writeString(this.enterMethod);
        parcel.writeInt(this.enablePhotoSwap ? 1 : 0);
        parcel.writeInt(this.enableGroupShot ? 1 : 0);
        parcel.writeInt(this.enablePlayground ? 1 : 0);
        GroupShotParam groupShotParam = this.groupShotData;
        if (groupShotParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupShotParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.toUserId);
        parcel.writeString(this.searchSessionId);
        parcel.writeInt(this.isFromEffectButton ? 1 : 0);
        parcel.writeString(this.initialEffectId);
        parcel.writeInt(this.fetchGroupEffectForAIGroupShot ? 1 : 0);
        parcel.writeInt(this.isStoryQuickImmersiveReply ? 1 : 0);
        parcel.writeString(this.enterDMWay);
        parcel.writeParcelable(this.quoteMode, i);
    }

    public static DMCameraModelMirror LIZ(DMCameraModelMirror dMCameraModelMirror, String str, String str2, boolean z, boolean z2, GroupShotParam groupShotParam) {
        return new DMCameraModelMirror(dMCameraModelMirror.enterFromDM, dMCameraModelMirror.enterMethodDM, dMCameraModelMirror.enterDM, dMCameraModelMirror.shouldDisplayRestrictSharingNoticeShooting, dMCameraModelMirror.shouldDisplayTnsNoticeShooting, dMCameraModelMirror.shouldDisplayRecordGuide, dMCameraModelMirror.receiverNickname, dMCameraModelMirror.isVideo, dMCameraModelMirror.maxSelectableVideoDuration, dMCameraModelMirror.shouldDisplayTnsNoticeAlbum, dMCameraModelMirror.tnsNoticeRes, dMCameraModelMirror.sessionID, dMCameraModelMirror.chatType, dMCameraModelMirror.effectName, dMCameraModelMirror.effectIconUrl, dMCameraModelMirror.hasReportedFirstCrossClick, dMCameraModelMirror.isBulletin, dMCameraModelMirror.enableTextStickerOnRecord, dMCameraModelMirror.effectTriggerMsgSentServerTime, dMCameraModelMirror.openCameraOrAlbumMobMap, dMCameraModelMirror.openCameraOrAlbumMobMapV2, str, str2, dMCameraModelMirror.enterMethodType, dMCameraModelMirror.enterMethod, z, z2, dMCameraModelMirror.enablePlayground, groupShotParam, dMCameraModelMirror.toUserId, dMCameraModelMirror.searchSessionId, dMCameraModelMirror.isFromEffectButton, dMCameraModelMirror.initialEffectId, dMCameraModelMirror.fetchGroupEffectForAIGroupShot, dMCameraModelMirror.isStoryQuickImmersiveReply, dMCameraModelMirror.enterDMWay, dMCameraModelMirror.quoteMode);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DMCameraModelMirror(boolean z, String str, String str2, int i, QuoteMode quoteMode, int i2, int i3) {
        String str3;
        String str4;
        int i4;
        String str5;
        String str6;
        boolean z2;
        QuoteMode quoteMode2 = quoteMode;
        String str7 = str;
        int i5 = i;
        String str8 = str2;
        boolean z3 = (i2 & 1) != 0 ? false : z;
        str7 = (i2 & 2) != 0 ? null : str7;
        if ((i2 & 4) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i2 & 64) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        if ((i2 & 256) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        str8 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str8;
        i5 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i5;
        if ((i2 & 8192) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        if ((i2 & 16384) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        if ((i3 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(z3, str7, str3, false, false, false, str4, null, i4, false, 0, str8, i5, str5, str6, false, false, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, z2, false, (i3 & 8) == 0 ? null : "", (i3 & 16) != 0 ? null : quoteMode2);
    }

    public DMCameraModelMirror(boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, String str3, Boolean bool, int i, boolean z5, int i2, String str4, int i3, String str5, String str6, boolean z6, boolean z7, boolean z8, Long l, Map<String, String> map, Map<String, String> map2, String str7, String str8, String str9, String str10, boolean z9, boolean z10, boolean z11, GroupShotParam groupShotParam, String str11, String str12, boolean z12, String str13, boolean z13, boolean z14, String str14, QuoteMode quoteMode) {
        this.enterFromDM = z;
        this.enterMethodDM = str;
        this.enterDM = str2;
        this.shouldDisplayRestrictSharingNoticeShooting = z2;
        this.shouldDisplayTnsNoticeShooting = z3;
        this.shouldDisplayRecordGuide = z4;
        this.receiverNickname = str3;
        this.isVideo = bool;
        this.maxSelectableVideoDuration = i;
        this.shouldDisplayTnsNoticeAlbum = z5;
        this.tnsNoticeRes = i2;
        this.sessionID = str4;
        this.chatType = i3;
        this.effectName = str5;
        this.effectIconUrl = str6;
        this.hasReportedFirstCrossClick = z6;
        this.isBulletin = z7;
        this.enableTextStickerOnRecord = z8;
        this.effectTriggerMsgSentServerTime = l;
        this.openCameraOrAlbumMobMap = map;
        this.openCameraOrAlbumMobMapV2 = map2;
        this.photoSwapScene = str7;
        this.photoSwapPairedMsgId = str8;
        this.enterMethodType = str9;
        this.enterMethod = str10;
        this.enablePhotoSwap = z9;
        this.enableGroupShot = z10;
        this.enablePlayground = z11;
        this.groupShotData = groupShotParam;
        this.toUserId = str11;
        this.searchSessionId = str12;
        this.isFromEffectButton = z12;
        this.initialEffectId = str13;
        this.fetchGroupEffectForAIGroupShot = z13;
        this.isStoryQuickImmersiveReply = z14;
        this.enterDMWay = str14;
        this.quoteMode = quoteMode;
    }
}
