package com.ss.android.ugc.aweme.portrait.service;

import X.EnumC1419230n2H;
import X.EnumC550430LiL;
import X.EnumC550780Liu;
import X.EnumC570120MXq;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AIPortraitGeneration {
    public final String actionType;
    public final String creationId;
    public final EnumC550780Liu enterWay;
    public final AIGCEntranceInfo entranceInfo;
    public final String entranceTemplateId;
    public final EnumC570120MXq entranceTemplatePos;
    public final String entranceTemplateStatus;
    public final EnumC1419230n2H entranceTemplateType;
    public final String eventPage;
    public final RefImageType isRefImage;
    public final String isRegenerate;
    public final String oriTplPos;
    public final String oriTplTp;
    public final Integer promptLength;
    public final EnumC550430LiL promptSource;
    public final String serverTaskId;
    public final Integer stayTime;

    public AIPortraitGeneration() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final AIPortraitGeneration copy(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, String str3, RefImageType refImageType, EnumC550430LiL enumC550430LiL, Integer num, EnumC550780Liu enumC550780Liu, String str4, String str5, String str6, Integer num2, String str7, String str8, String str9) {
        return new AIPortraitGeneration(aIGCEntranceInfo, str, str2, enumC1419230n2H, enumC570120MXq, str3, refImageType, enumC550430LiL, num, enumC550780Liu, str4, str5, str6, num2, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitGeneration)) {
            return false;
        }
        AIPortraitGeneration aIPortraitGeneration = (AIPortraitGeneration) obj;
        return Intrinsics.LJFF(this.entranceInfo, aIPortraitGeneration.entranceInfo) && Intrinsics.LJFF(this.creationId, aIPortraitGeneration.creationId) && Intrinsics.LJFF(this.entranceTemplateId, aIPortraitGeneration.entranceTemplateId) && this.entranceTemplateType == aIPortraitGeneration.entranceTemplateType && this.entranceTemplatePos == aIPortraitGeneration.entranceTemplatePos && Intrinsics.LJFF(this.entranceTemplateStatus, aIPortraitGeneration.entranceTemplateStatus) && this.isRefImage == aIPortraitGeneration.isRefImage && this.promptSource == aIPortraitGeneration.promptSource && Intrinsics.LJFF(this.promptLength, aIPortraitGeneration.promptLength) && this.enterWay == aIPortraitGeneration.enterWay && Intrinsics.LJFF(this.isRegenerate, aIPortraitGeneration.isRegenerate) && Intrinsics.LJFF(this.actionType, aIPortraitGeneration.actionType) && Intrinsics.LJFF(this.eventPage, aIPortraitGeneration.eventPage) && Intrinsics.LJFF(this.stayTime, aIPortraitGeneration.stayTime) && Intrinsics.LJFF(this.serverTaskId, aIPortraitGeneration.serverTaskId) && Intrinsics.LJFF(this.oriTplTp, aIPortraitGeneration.oriTplTp) && Intrinsics.LJFF(this.oriTplPos, aIPortraitGeneration.oriTplPos);
    }

    public int hashCode() {
        AIGCEntranceInfo aIGCEntranceInfo = this.entranceInfo;
        int iHashCode = (aIGCEntranceInfo == null ? 0 : aIGCEntranceInfo.hashCode()) * 31;
        String str = this.creationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entranceTemplateId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC1419230n2H enumC1419230n2H = this.entranceTemplateType;
        int iHashCode4 = (iHashCode3 + (enumC1419230n2H == null ? 0 : enumC1419230n2H.hashCode())) * 31;
        EnumC570120MXq enumC570120MXq = this.entranceTemplatePos;
        int iHashCode5 = (iHashCode4 + (enumC570120MXq == null ? 0 : enumC570120MXq.hashCode())) * 31;
        String str3 = this.entranceTemplateStatus;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RefImageType refImageType = this.isRefImage;
        int iHashCode7 = (iHashCode6 + (refImageType == null ? 0 : refImageType.hashCode())) * 31;
        EnumC550430LiL enumC550430LiL = this.promptSource;
        int iHashCode8 = (iHashCode7 + (enumC550430LiL == null ? 0 : enumC550430LiL.hashCode())) * 31;
        Integer num = this.promptLength;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        EnumC550780Liu enumC550780Liu = this.enterWay;
        int iHashCode10 = (iHashCode9 + (enumC550780Liu == null ? 0 : enumC550780Liu.hashCode())) * 31;
        String str4 = this.isRegenerate;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actionType;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventPage;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.stayTime;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.serverTaskId;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.oriTplTp;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.oriTplPos;
        return iHashCode16 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "AIPortraitGeneration(entranceInfo=" + this.entranceInfo + ", creationId=" + this.creationId + ", entranceTemplateId=" + this.entranceTemplateId + ", entranceTemplateType=" + this.entranceTemplateType + ", entranceTemplatePos=" + this.entranceTemplatePos + ", entranceTemplateStatus=" + this.entranceTemplateStatus + ", isRefImage=" + this.isRefImage + ", promptSource=" + this.promptSource + ", promptLength=" + this.promptLength + ", enterWay=" + this.enterWay + ", isRegenerate=" + this.isRegenerate + ", actionType=" + this.actionType + ", eventPage=" + this.eventPage + ", stayTime=" + this.stayTime + ", serverTaskId=" + this.serverTaskId + ", oriTplTp=" + this.oriTplTp + ", oriTplPos=" + this.oriTplPos + ')';
    }

    public final RefImageType isRefImage() {
        return this.isRefImage;
    }

    public final String isRegenerate() {
        return this.isRegenerate;
    }

    public AIPortraitGeneration(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, String str3, RefImageType refImageType, EnumC550430LiL enumC550430LiL, Integer num, EnumC550780Liu enumC550780Liu, String str4, String str5, String str6, Integer num2, String str7, String str8, String str9) {
        this.entranceInfo = aIGCEntranceInfo;
        this.creationId = str;
        this.entranceTemplateId = str2;
        this.entranceTemplateType = enumC1419230n2H;
        this.entranceTemplatePos = enumC570120MXq;
        this.entranceTemplateStatus = str3;
        this.isRefImage = refImageType;
        this.promptSource = enumC550430LiL;
        this.promptLength = num;
        this.enterWay = enumC550780Liu;
        this.isRegenerate = str4;
        this.actionType = str5;
        this.eventPage = str6;
        this.stayTime = num2;
        this.serverTaskId = str7;
        this.oriTplTp = str8;
        this.oriTplPos = str9;
    }
}
