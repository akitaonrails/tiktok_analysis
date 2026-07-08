package com.ss.android.ugc.aweme.effectcreator.models;

import X.C1737240vJC;
import X.C786410Ut5;
import X.EnumC1157660gEO;
import X.EnumC1736080vHK;
import X.EnumC2011607uM;
import X.InterfaceC1294060jmO;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.ss.android.ugc.aweme.effectcreator.models.AIGCInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoDeserializer;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CKEDraftInfo implements Parcelable {
    public AIGCInfo aigcInfo;
    public final String app;
    public final String author;
    public String createTime;
    public String defaultIconPath;
    public String defaultName;
    public String draftId;
    public String draftPath;
    public EffectHint effectHint;
    public String effectId;
    public String effectPath;
    public final String iconAssetId;
    public int iconEdit;
    public CKEDraftIconInfo iconInfo;
    public String iconPath;
    public final Integer iconSelectTypeValue;
    public final String isAutoGenIcon;
    public final String isIconEffectApplied;
    public String modelId;
    public String name;
    public String originIconPath;
    public final String platform;
    public String templateHash;
    public String updateTime;
    public long versionCode;
    public static final C1737240vJC Companion = new Object() { // from class: X.0vJC
        public static CKEDraftInfo LIZ(String str) {
            Object c098200Yq;
            try {
                e eVar = new e();
                eVar.LIZJ(new CKEDraftInfoDeserializer(), CKEDraftInfo.class);
                c098200Yq = (CKEDraftInfo) eVar.LIZ().LJII(str, CKEDraftInfo.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            return (CKEDraftInfo) c098200Yq;
        }
    };
    public static final Parcelable.Creator<CKEDraftInfo> CREATOR = new Parcelable.Creator<CKEDraftInfo>() { // from class: X.0vJ6
        @Override // android.os.Parcelable.Creator
        public final CKEDraftInfo createFromParcel(Parcel parcel) {
            EffectHint effectHintCreateFromParcel;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            long j = parcel.readLong();
            String string13 = parcel.readString();
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                effectHintCreateFromParcel = null;
            } else {
                effectHintCreateFromParcel = EffectHint.CREATOR.createFromParcel(parcel);
            }
            EffectHint effectHint = effectHintCreateFromParcel;
            String string14 = parcel.readString();
            int i = parcel.readInt();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new CKEDraftInfo(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, j, string13, effectHint, string14, i, string15, string16, string17, string18, numValueOf, parcel.readString(), CKEDraftIconInfo.CREATOR.createFromParcel(parcel), AIGCInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CKEDraftInfo[] newArray(int i) {
            return new CKEDraftInfo[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public CKEDraftInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 33554431, 0 == true ? 1 : 0);
    }

    private final String component14() {
        return this.platform;
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getIconAssetId$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getIconEdit$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getIconPath$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getIconSelectTypeValue$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getOriginIconPath$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void isAutoGenIcon$annotations() {
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void isIconEffectApplied$annotations() {
    }

    public final CKEDraftInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, String str13, EffectHint effectHint, String str14, int i, String str15, String str16, String str17, String str18, Integer num, String str19, CKEDraftIconInfo cKEDraftIconInfo, AIGCInfo aIGCInfo) {
        return new CKEDraftInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, j, str13, effectHint, str14, i, str15, str16, str17, str18, num, str19, cKEDraftIconInfo, aIGCInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CKEDraftInfo)) {
            return false;
        }
        CKEDraftInfo cKEDraftInfo = (CKEDraftInfo) obj;
        return Intrinsics.LJFF(this.draftId, cKEDraftInfo.draftId) && Intrinsics.LJFF(this.draftPath, cKEDraftInfo.draftPath) && Intrinsics.LJFF(this.effectPath, cKEDraftInfo.effectPath) && Intrinsics.LJFF(this.effectId, cKEDraftInfo.effectId) && Intrinsics.LJFF(this.defaultIconPath, cKEDraftInfo.defaultIconPath) && Intrinsics.LJFF(this.defaultName, cKEDraftInfo.defaultName) && Intrinsics.LJFF(this.iconPath, cKEDraftInfo.iconPath) && Intrinsics.LJFF(this.name, cKEDraftInfo.name) && Intrinsics.LJFF(this.createTime, cKEDraftInfo.createTime) && Intrinsics.LJFF(this.updateTime, cKEDraftInfo.updateTime) && Intrinsics.LJFF(this.modelId, cKEDraftInfo.modelId) && Intrinsics.LJFF(this.author, cKEDraftInfo.author) && this.versionCode == cKEDraftInfo.versionCode && Intrinsics.LJFF(this.platform, cKEDraftInfo.platform) && Intrinsics.LJFF(this.effectHint, cKEDraftInfo.effectHint) && Intrinsics.LJFF(this.templateHash, cKEDraftInfo.templateHash) && this.iconEdit == cKEDraftInfo.iconEdit && Intrinsics.LJFF(this.app, cKEDraftInfo.app) && Intrinsics.LJFF(this.isAutoGenIcon, cKEDraftInfo.isAutoGenIcon) && Intrinsics.LJFF(this.iconAssetId, cKEDraftInfo.iconAssetId) && Intrinsics.LJFF(this.isIconEffectApplied, cKEDraftInfo.isIconEffectApplied) && Intrinsics.LJFF(this.iconSelectTypeValue, cKEDraftInfo.iconSelectTypeValue) && Intrinsics.LJFF(this.originIconPath, cKEDraftInfo.originIconPath) && Intrinsics.LJFF(this.iconInfo, cKEDraftInfo.iconInfo) && Intrinsics.LJFF(this.aigcInfo, cKEDraftInfo.aigcInfo);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.draftId.hashCode() * 31) + this.draftPath.hashCode()) * 31) + this.effectPath.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.defaultIconPath.hashCode()) * 31) + this.defaultName.hashCode()) * 31) + this.iconPath.hashCode()) * 31) + this.name.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.modelId.hashCode()) * 31) + this.author.hashCode()) * 31) + C786410Ut5.Y2(this.versionCode)) * 31) + this.platform.hashCode()) * 31;
        EffectHint effectHint = this.effectHint;
        int iHashCode2 = (iHashCode + (effectHint == null ? 0 : effectHint.hashCode())) * 31;
        String str = this.templateHash;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.iconEdit) * 31) + this.app.hashCode()) * 31) + this.isAutoGenIcon.hashCode()) * 31;
        String str2 = this.iconAssetId;
        int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.isIconEffectApplied.hashCode()) * 31;
        Integer num = this.iconSelectTypeValue;
        return ((((((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31) + this.originIconPath.hashCode()) * 31) + this.iconInfo.hashCode()) * 31) + this.aigcInfo.hashCode();
    }

    public String toString() {
        return "CKEDraftInfo(draftId=" + this.draftId + ", draftPath=" + this.draftPath + ", effectPath=" + this.effectPath + ", effectId=" + this.effectId + ", defaultIconPath=" + this.defaultIconPath + ", defaultName=" + this.defaultName + ", iconPath=" + this.iconPath + ", name=" + this.name + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", modelId=" + this.modelId + ", author=" + this.author + ", versionCode=" + this.versionCode + ", platform=" + this.platform + ", effectHint=" + this.effectHint + ", templateHash=" + this.templateHash + ", iconEdit=" + this.iconEdit + ", app=" + this.app + ", isAutoGenIcon=" + this.isAutoGenIcon + ", iconAssetId=" + this.iconAssetId + ", isIconEffectApplied=" + this.isIconEffectApplied + ", iconSelectTypeValue=" + this.iconSelectTypeValue + ", originIconPath=" + this.originIconPath + ", iconInfo=" + this.iconInfo + ", aigcInfo=" + this.aigcInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.draftId);
        parcel.writeString(this.draftPath);
        parcel.writeString(this.effectPath);
        parcel.writeString(this.effectId);
        parcel.writeString(this.defaultIconPath);
        parcel.writeString(this.defaultName);
        parcel.writeString(this.iconPath);
        parcel.writeString(this.name);
        parcel.writeString(this.createTime);
        parcel.writeString(this.updateTime);
        parcel.writeString(this.modelId);
        parcel.writeString(this.author);
        parcel.writeLong(this.versionCode);
        parcel.writeString(this.platform);
        EffectHint effectHint = this.effectHint;
        if (effectHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            effectHint.writeToParcel(parcel, i);
        }
        parcel.writeString(this.templateHash);
        parcel.writeInt(this.iconEdit);
        parcel.writeString(this.app);
        parcel.writeString(this.isAutoGenIcon);
        parcel.writeString(this.iconAssetId);
        parcel.writeString(this.isIconEffectApplied);
        Integer num = this.iconSelectTypeValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.originIconPath);
        this.iconInfo.writeToParcel(parcel, i);
        this.aigcInfo.writeToParcel(parcel, i);
    }

    public final boolean isAigcFl2VEffect() {
        return this.aigcInfo.getAigcType() == 3;
    }

    public final boolean isAigcI2IEffect() {
        return this.aigcInfo.getAigcType() == 1;
    }

    public final boolean isAigcI2VEffect() {
        return this.aigcInfo.getAigcType() == 2;
    }

    public final boolean isAigcV2VEffect() {
        return this.aigcInfo.getAigcType() == 4;
    }

    public final boolean isAigcEffect() {
        return isAigcI2IEffect() || isAigcI2VEffect() || isAigcFl2VEffect() || isAigcV2VEffect();
    }

    public final boolean isAigcI2VOrFl2VEffect() {
        return isAigcI2VEffect() || isAigcFl2VEffect();
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final String getApp() {
        return this.app;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getDefaultIconPath() {
        return this.defaultIconPath;
    }

    public final String getDefaultName() {
        return this.defaultName;
    }

    public final String getDraftId() {
        return this.draftId;
    }

    public final String getDraftPath() {
        return this.draftPath;
    }

    public final EffectHint getEffectHint() {
        return this.effectHint;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectPath() {
        return this.effectPath;
    }

    public final String getIconAssetId() {
        return this.iconAssetId;
    }

    public final int getIconEdit() {
        return this.iconEdit;
    }

    public final CKEDraftIconInfo getIconInfo() {
        return this.iconInfo;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final Integer getIconSelectTypeValue() {
        return this.iconSelectTypeValue;
    }

    public final String getModelId() {
        return this.modelId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginIconPath() {
        return this.originIconPath;
    }

    public final String getTemplateHash() {
        return this.templateHash;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String isAutoGenIcon() {
        return this.isAutoGenIcon;
    }

    public final String isIconEffectApplied() {
        return this.isIconEffectApplied;
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }

    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    public final void setDefaultIconPath(String str) {
        this.defaultIconPath = str;
    }

    public final void setDefaultName(String str) {
        this.defaultName = str;
    }

    public final void setDraftId(String str) {
        this.draftId = str;
    }

    public final void setDraftPath(String str) {
        this.draftPath = str;
    }

    public final void setEffectHint(EffectHint effectHint) {
        this.effectHint = effectHint;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setEffectPath(String str) {
        this.effectPath = str;
    }

    public final void setIconEdit(int i) {
        this.iconEdit = i;
    }

    public final void setIconInfo(CKEDraftIconInfo cKEDraftIconInfo) {
        this.iconInfo = cKEDraftIconInfo;
    }

    public final void setIconPath(String str) {
        this.iconPath = str;
    }

    public final void setModelId(String str) {
        this.modelId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOriginIconPath(String str) {
        this.originIconPath = str;
    }

    public final void setTemplateHash(String str) {
        this.templateHash = str;
    }

    public final void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public final void setVersionCode(long j) {
        this.versionCode = j;
    }

    public CKEDraftInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, String str13, EffectHint effectHint, String str14, int i, String str15, String str16, String str17, String str18, Integer num, String str19, CKEDraftIconInfo cKEDraftIconInfo, AIGCInfo aIGCInfo) {
        this.draftId = str;
        this.draftPath = str2;
        this.effectPath = str3;
        this.effectId = str4;
        this.defaultIconPath = str5;
        this.defaultName = str6;
        this.iconPath = str7;
        this.name = str8;
        this.createTime = str9;
        this.updateTime = str10;
        this.modelId = str11;
        this.author = str12;
        this.versionCode = j;
        this.platform = str13;
        this.effectHint = effectHint;
        this.templateHash = str14;
        this.iconEdit = i;
        this.app = str15;
        this.isAutoGenIcon = str16;
        this.iconAssetId = str17;
        this.isIconEffectApplied = str18;
        this.iconSelectTypeValue = num;
        this.originIconPath = str19;
        this.iconInfo = cKEDraftIconInfo;
        this.aigcInfo = aIGCInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CKEDraftInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, long j, String str13, EffectHint effectHint, String str14, int i, String str15, String str16, String str17, String str18, Integer num, String str19, CKEDraftIconInfo cKEDraftIconInfo, AIGCInfo aIGCInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "effect" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? "" : str11, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str12, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0L : j, (i2 & 8192) != 0 ? "Android" : str13, (i2 & 16384) != 0 ? null : effectHint, (32768 & i2) != 0 ? null : str14, (65536 & i2) != 0 ? EnumC1736080vHK.NO_EDIT.getValue() : i, (131072 & i2) != 0 ? "TT" : str15, (262144 & i2) != 0 ? EnumC2011607uM.GEN_ICON_AUTO.getDraftFiled() : str16, (524288 & i2) != 0 ? null : str17, (1048576 & i2) != 0 ? EnumC1157660gEO.NOT_APPLIED_EFFECT.getState() : str18, (2097152 & i2) == 0 ? num : null, (4194304 & i2) == 0 ? str19 : "", (8388608 & i2) != 0 ? new CKEDraftIconInfo(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0) : cKEDraftIconInfo, (i2 & 16777216) != 0 ? new AIGCInfo(0, "", "online") : aIGCInfo);
    }
}
