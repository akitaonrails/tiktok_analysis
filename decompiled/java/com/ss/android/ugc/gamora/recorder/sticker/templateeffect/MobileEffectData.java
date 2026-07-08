package com.ss.android.ugc.gamora.recorder.sticker.templateeffect;

import X.C786410Ut5;
import X.EnumC1733870vDl;
import X.EnumC429230GsL;
import X.InterfaceC111300bX;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MobileEffectData implements InterfaceC111300bX, Parcelable {
    public final String aigcVideoPath;
    public final String creationId;
    public final CKEDraftInfo draftInfo;
    public final NewFaceStickerBean effect;
    public String enterFrom;
    public final EnumC429230GsL iconViewType;
    public final boolean isAIGCEffect;
    public String isPhotoMode;
    public final EnumC1733870vDl mode;
    public final EffectPackageDataWrapper publishData;
    public final String shootPageEnterFrom;
    public final String shootWay;
    public static final Parcelable.Creator<MobileEffectData> CREATOR = new Parcelable.Creator<MobileEffectData>() { // from class: X.0vGy
        @Override // android.os.Parcelable.Creator
        public final MobileEffectData createFromParcel(Parcel parcel) {
            boolean z;
            EnumC1733870vDl enumC1733870vDlValueOf = EnumC1733870vDl.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) parcel.readSerializable();
            CKEDraftInfo cKEDraftInfo = (CKEDraftInfo) parcel.readParcelable(MobileEffectData.class.getClassLoader());
            EffectPackageDataWrapper effectPackageDataWrapper = (EffectPackageDataWrapper) parcel.readParcelable(MobileEffectData.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new MobileEffectData(enumC1733870vDlValueOf, string, string2, string3, newFaceStickerBean, cKEDraftInfo, effectPackageDataWrapper, string4, string5, z, parcel.readString(), EnumC429230GsL.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MobileEffectData[] newArray(int i) {
            return new MobileEffectData[i];
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
        if (!(obj instanceof MobileEffectData)) {
            return false;
        }
        MobileEffectData mobileEffectData = (MobileEffectData) obj;
        return this.mode == mobileEffectData.mode && Intrinsics.LJFF(this.creationId, mobileEffectData.creationId) && Intrinsics.LJFF(this.shootWay, mobileEffectData.shootWay) && Intrinsics.LJFF(this.shootPageEnterFrom, mobileEffectData.shootPageEnterFrom) && Intrinsics.LJFF(this.effect, mobileEffectData.effect) && Intrinsics.LJFF(this.draftInfo, mobileEffectData.draftInfo) && Intrinsics.LJFF(this.publishData, mobileEffectData.publishData) && Intrinsics.LJFF(this.enterFrom, mobileEffectData.enterFrom) && Intrinsics.LJFF(this.isPhotoMode, mobileEffectData.isPhotoMode) && this.isAIGCEffect == mobileEffectData.isAIGCEffect && Intrinsics.LJFF(this.aigcVideoPath, mobileEffectData.aigcVideoPath) && this.iconViewType == mobileEffectData.iconViewType;
    }

    public final int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        String str = this.creationId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.shootWay.hashCode()) * 31) + this.shootPageEnterFrom.hashCode()) * 31;
        NewFaceStickerBean newFaceStickerBean = this.effect;
        int iHashCode3 = (iHashCode2 + (newFaceStickerBean == null ? 0 : newFaceStickerBean.hashCode())) * 31;
        CKEDraftInfo cKEDraftInfo = this.draftInfo;
        int iHashCode4 = (iHashCode3 + (cKEDraftInfo == null ? 0 : cKEDraftInfo.hashCode())) * 31;
        EffectPackageDataWrapper effectPackageDataWrapper = this.publishData;
        return ((((((((((iHashCode4 + (effectPackageDataWrapper != null ? effectPackageDataWrapper.hashCode() : 0)) * 31) + this.enterFrom.hashCode()) * 31) + this.isPhotoMode.hashCode()) * 31) + C786410Ut5.Z2(this.isAIGCEffect)) * 31) + this.aigcVideoPath.hashCode()) * 31) + this.iconViewType.hashCode();
    }

    public final String toString() {
        return "MobileEffectData(mode=" + this.mode + ", creationId=" + this.creationId + ", shootWay=" + this.shootWay + ", shootPageEnterFrom=" + this.shootPageEnterFrom + ", effect=" + this.effect + ", draftInfo=" + this.draftInfo + ", publishData=" + this.publishData + ", enterFrom=" + this.enterFrom + ", isPhotoMode=" + this.isPhotoMode + ", isAIGCEffect=" + this.isAIGCEffect + ", aigcVideoPath=" + this.aigcVideoPath + ", iconViewType=" + this.iconViewType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mode.name());
        parcel.writeString(this.creationId);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.shootPageEnterFrom);
        parcel.writeSerializable(this.effect);
        parcel.writeParcelable(this.draftInfo, i);
        parcel.writeParcelable(this.publishData, i);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.isPhotoMode);
        parcel.writeInt(this.isAIGCEffect ? 1 : 0);
        parcel.writeString(this.aigcVideoPath);
        parcel.writeString(this.iconViewType.name());
    }

    public MobileEffectData(EnumC1733870vDl enumC1733870vDl, String str, String str2, String str3, NewFaceStickerBean newFaceStickerBean, CKEDraftInfo cKEDraftInfo, EffectPackageDataWrapper effectPackageDataWrapper, String str4, String str5, boolean z, String str6, EnumC429230GsL enumC429230GsL) {
        this.mode = enumC1733870vDl;
        this.creationId = str;
        this.shootWay = str2;
        this.shootPageEnterFrom = str3;
        this.effect = newFaceStickerBean;
        this.draftInfo = cKEDraftInfo;
        this.publishData = effectPackageDataWrapper;
        this.enterFrom = str4;
        this.isPhotoMode = str5;
        this.isAIGCEffect = z;
        this.aigcVideoPath = str6;
        this.iconViewType = enumC429230GsL;
    }

    public /* synthetic */ MobileEffectData(EnumC1733870vDl enumC1733870vDl, String str, String str2, String str3, NewFaceStickerBean newFaceStickerBean, CKEDraftInfo cKEDraftInfo, EffectPackageDataWrapper effectPackageDataWrapper, String str4, String str5, boolean z, String str6, EnumC429230GsL enumC429230GsL, int i) {
        this(enumC1733870vDl, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : newFaceStickerBean, (i & 32) != 0 ? null : cKEDraftInfo, (i & 64) == 0 ? effectPackageDataWrapper : null, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? CardStruct.IStatusCode.DEFAULT : str5, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? str6 : "", (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? EnumC429230GsL.DEFAULT : enumC429230GsL);
    }
}
