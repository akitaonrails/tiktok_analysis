package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.BlipData;
import com.ss.android.ugc.aweme.creative.model.ailive.PageDataCache;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PageDataCache implements Parcelable {
    public static final Parcelable.Creator<PageDataCache> CREATOR = new Parcelable.Creator<PageDataCache>() { // from class: X.0MC1
        @Override // android.os.Parcelable.Creator
        public final PageDataCache createFromParcel(Parcel parcel) {
            BlipData blipDataCreateFromParcel;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            Parcelable.Creator<PromptRequestState> creator = PromptRequestState.CREATOR;
            PromptRequestState promptRequestStateCreateFromParcel = creator.createFromParcel(parcel);
            PromptRequestState promptRequestStateCreateFromParcel2 = creator.createFromParcel(parcel);
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                blipDataCreateFromParcel = null;
            } else {
                blipDataCreateFromParcel = BlipData.CREATOR.createFromParcel(parcel);
            }
            BlipData blipData = blipDataCreateFromParcel;
            PromptModel promptModelCreateFromParcel = PromptModel.CREATOR.createFromParcel(parcel);
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
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
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                boolValueOf = Boolean.valueOf(z6);
            }
            return new PageDataCache(promptRequestStateCreateFromParcel, promptRequestStateCreateFromParcel2, blipData, promptModelCreateFromParcel, z, z2, z3, z4, z5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PageDataCache[] newArray(int i) {
            return new PageDataCache[i];
        }
    };

    @C09CT("blip")
    public BlipData blip;

    @C09CT("curPrompt")
    public PromptModel curPrompt;

    @C040H
    public Boolean fallbackToOldModel;

    @C09CT("gptPromptRequestState")
    public PromptRequestState gptPromptRequestState;

    @C09CT("hasCheckShowBanner")
    public boolean hasCheckShowBanner;

    @C09CT("hasShowBanner")
    public boolean hasShowBanner;

    @C040H
    public boolean hasShowEntrance;

    @C09CT("presetPromptRequestState")
    public PromptRequestState presetPromptRequestState;

    @C040H
    public boolean publishDialogContinueSelected;

    @C040H
    public boolean publishDialogShowing;

    public PageDataCache() {
        this(new PromptRequestState(null, null, false, null, 15, null), new PromptRequestState(null, null, false, null, 15, null), null, new PromptModel("", "", PromptType.NONE, "", "", "", false), false, false, false, false, false, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageDataCache)) {
            return false;
        }
        PageDataCache pageDataCache = (PageDataCache) obj;
        return Intrinsics.LJFF(this.presetPromptRequestState, pageDataCache.presetPromptRequestState) && Intrinsics.LJFF(this.gptPromptRequestState, pageDataCache.gptPromptRequestState) && Intrinsics.LJFF(this.blip, pageDataCache.blip) && Intrinsics.LJFF(this.curPrompt, pageDataCache.curPrompt) && this.hasShowBanner == pageDataCache.hasShowBanner && this.hasCheckShowBanner == pageDataCache.hasCheckShowBanner && this.publishDialogShowing == pageDataCache.publishDialogShowing && this.publishDialogContinueSelected == pageDataCache.publishDialogContinueSelected && this.hasShowEntrance == pageDataCache.hasShowEntrance && Intrinsics.LJFF(this.fallbackToOldModel, pageDataCache.fallbackToOldModel);
    }

    public final int hashCode() {
        int iHashCode = ((this.presetPromptRequestState.hashCode() * 31) + this.gptPromptRequestState.hashCode()) * 31;
        BlipData blipData = this.blip;
        int iHashCode2 = (((((((((((((iHashCode + (blipData == null ? 0 : blipData.hashCode())) * 31) + this.curPrompt.hashCode()) * 31) + C786410Ut5.Z2(this.hasShowBanner)) * 31) + C786410Ut5.Z2(this.hasCheckShowBanner)) * 31) + C786410Ut5.Z2(this.publishDialogShowing)) * 31) + C786410Ut5.Z2(this.publishDialogContinueSelected)) * 31) + C786410Ut5.Z2(this.hasShowEntrance)) * 31;
        Boolean bool = this.fallbackToOldModel;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageDataCache(presetPromptRequestState=");
        sbLIZ.append(this.presetPromptRequestState);
        sbLIZ.append(", gptPromptRequestState=");
        sbLIZ.append(this.gptPromptRequestState);
        sbLIZ.append(", blip=");
        sbLIZ.append(this.blip);
        sbLIZ.append(", curPrompt=");
        sbLIZ.append(this.curPrompt);
        sbLIZ.append(", hasShowBanner=");
        sbLIZ.append(this.hasShowBanner);
        sbLIZ.append(", hasCheckShowBanner=");
        sbLIZ.append(this.hasCheckShowBanner);
        sbLIZ.append(", publishDialogShowing=");
        sbLIZ.append(this.publishDialogShowing);
        sbLIZ.append(", publishDialogContinueSelected=");
        sbLIZ.append(this.publishDialogContinueSelected);
        sbLIZ.append(", hasShowEntrance=");
        sbLIZ.append(this.hasShowEntrance);
        sbLIZ.append(", fallbackToOldModel=");
        sbLIZ.append(this.fallbackToOldModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.presetPromptRequestState.writeToParcel(parcel, i);
        this.gptPromptRequestState.writeToParcel(parcel, i);
        BlipData blipData = this.blip;
        if (blipData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blipData.writeToParcel(parcel, i);
        }
        this.curPrompt.writeToParcel(parcel, i);
        parcel.writeInt(this.hasShowBanner ? 1 : 0);
        parcel.writeInt(this.hasCheckShowBanner ? 1 : 0);
        parcel.writeInt(this.publishDialogShowing ? 1 : 0);
        parcel.writeInt(this.publishDialogContinueSelected ? 1 : 0);
        parcel.writeInt(this.hasShowEntrance ? 1 : 0);
        Boolean bool = this.fallbackToOldModel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public PageDataCache(PromptRequestState promptRequestState, PromptRequestState promptRequestState2, BlipData blipData, PromptModel promptModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Boolean bool) {
        this.presetPromptRequestState = promptRequestState;
        this.gptPromptRequestState = promptRequestState2;
        this.blip = blipData;
        this.curPrompt = promptModel;
        this.hasShowBanner = z;
        this.hasCheckShowBanner = z2;
        this.publishDialogShowing = z3;
        this.publishDialogContinueSelected = z4;
        this.hasShowEntrance = z5;
        this.fallbackToOldModel = bool;
    }
}
