package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PromptPageMobParam implements Parcelable {
    public static final Parcelable.Creator<PromptPageMobParam> CREATOR = new Parcelable.Creator<PromptPageMobParam>() { // from class: X.0MBs
        @Override // android.os.Parcelable.Creator
        public final PromptPageMobParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            boolean z9;
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            String string = parcel.readString();
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
                z6 = true;
            } else {
                z6 = false;
            }
            AILivePhotoRecallWay aILivePhotoRecallWayCreateFromParcel = AILivePhotoRecallWay.CREATOR.createFromParcel(parcel);
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
            Boolean boolValueOf = null;
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
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolValueOf = Boolean.valueOf(z9);
            }
            return new PromptPageMobParam(j, j2, j3, z, string, z2, z3, z4, z5, z6, aILivePhotoRecallWayCreateFromParcel, z7, z8, numValueOf, numValueOf2, i, numValueOf3, boolValueOf, (Pair) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final PromptPageMobParam[] newArray(int i) {
            return new PromptPageMobParam[i];
        }
    };

    @C09CT("ai_alive_change_photo")
    public Boolean aiAliveChangePhoto;

    @C09CT("ai_write_last_fail_reason")
    public Integer aiWriteLastFailReason;

    @C09CT("ai_livephoto_save_type")
    public Integer draftSaveType;

    @C040H
    public long generateDuration;

    @C09CT("generate_sidebar_type")
    public int generateSidebarType;

    @C040H
    public boolean hasGeneratePrompt;

    @C040H
    public boolean hasGeneratePromptReturn;

    @C040H
    public boolean hasInputPrompt;

    @C040H
    public boolean hasPresetPrompt;

    @C040H
    public boolean hasStartGenerate;

    @C09CT("is_fail_try_again")
    public boolean isFailTryAgain;

    @C040H
    public boolean isPromptPageShowing;

    @C09CT("is_edit_prompt_regenerate")
    public boolean isRegeneratePrompt;

    @C09CT("last_fail_resaon")
    public Integer lastFailReason;

    @C040H
    public long lastGenerateTime;

    @C040H
    public long lastShowTime;

    @C040H
    public String leaveActionType;

    @C040H
    public AILivePhotoRecallWay recallWay;

    @C040H
    public Pair<String, Boolean> waitingForPostProcess;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptPageMobParam)) {
            return false;
        }
        PromptPageMobParam promptPageMobParam = (PromptPageMobParam) obj;
        return this.lastShowTime == promptPageMobParam.lastShowTime && this.lastGenerateTime == promptPageMobParam.lastGenerateTime && this.generateDuration == promptPageMobParam.generateDuration && this.isPromptPageShowing == promptPageMobParam.isPromptPageShowing && Intrinsics.LJFF(this.leaveActionType, promptPageMobParam.leaveActionType) && this.hasInputPrompt == promptPageMobParam.hasInputPrompt && this.hasPresetPrompt == promptPageMobParam.hasPresetPrompt && this.hasGeneratePrompt == promptPageMobParam.hasGeneratePrompt && this.hasStartGenerate == promptPageMobParam.hasStartGenerate && this.hasGeneratePromptReturn == promptPageMobParam.hasGeneratePromptReturn && this.recallWay == promptPageMobParam.recallWay && this.isRegeneratePrompt == promptPageMobParam.isRegeneratePrompt && this.isFailTryAgain == promptPageMobParam.isFailTryAgain && Intrinsics.LJFF(this.lastFailReason, promptPageMobParam.lastFailReason) && Intrinsics.LJFF(this.draftSaveType, promptPageMobParam.draftSaveType) && this.generateSidebarType == promptPageMobParam.generateSidebarType && Intrinsics.LJFF(this.aiWriteLastFailReason, promptPageMobParam.aiWriteLastFailReason) && Intrinsics.LJFF(this.aiAliveChangePhoto, promptPageMobParam.aiAliveChangePhoto) && Intrinsics.LJFF(this.waitingForPostProcess, promptPageMobParam.waitingForPostProcess);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((((((((((((((C786410Ut5.Y2(this.lastShowTime) * 31) + C786410Ut5.Y2(this.lastGenerateTime)) * 31) + C786410Ut5.Y2(this.generateDuration)) * 31) + C786410Ut5.Z2(this.isPromptPageShowing)) * 31) + this.leaveActionType.hashCode()) * 31) + C786410Ut5.Z2(this.hasInputPrompt)) * 31) + C786410Ut5.Z2(this.hasPresetPrompt)) * 31) + C786410Ut5.Z2(this.hasGeneratePrompt)) * 31) + C786410Ut5.Z2(this.hasStartGenerate)) * 31) + C786410Ut5.Z2(this.hasGeneratePromptReturn)) * 31) + this.recallWay.hashCode()) * 31) + C786410Ut5.Z2(this.isRegeneratePrompt)) * 31) + C786410Ut5.Z2(this.isFailTryAgain)) * 31;
        Integer num = this.lastFailReason;
        int iHashCode = (iY2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.draftSaveType;
        int iHashCode2 = (((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.generateSidebarType) * 31;
        Integer num3 = this.aiWriteLastFailReason;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.aiAliveChangePhoto;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Pair<String, Boolean> pair = this.waitingForPostProcess;
        return iHashCode4 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        return "PromptPageMobParam(lastShowTime=" + this.lastShowTime + ", lastGenerateTime=" + this.lastGenerateTime + ", generateDuration=" + this.generateDuration + ", isPromptPageShowing=" + this.isPromptPageShowing + ", leaveActionType=" + this.leaveActionType + ", hasInputPrompt=" + this.hasInputPrompt + ", hasPresetPrompt=" + this.hasPresetPrompt + ", hasGeneratePrompt=" + this.hasGeneratePrompt + ", hasStartGenerate=" + this.hasStartGenerate + ", hasGeneratePromptReturn=" + this.hasGeneratePromptReturn + ", recallWay=" + this.recallWay + ", isRegeneratePrompt=" + this.isRegeneratePrompt + ", isFailTryAgain=" + this.isFailTryAgain + ", lastFailReason=" + this.lastFailReason + ", draftSaveType=" + this.draftSaveType + ", generateSidebarType=" + this.generateSidebarType + ", aiWriteLastFailReason=" + this.aiWriteLastFailReason + ", aiAliveChangePhoto=" + this.aiAliveChangePhoto + ", waitingForPostProcess=" + this.waitingForPostProcess + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.lastShowTime);
        parcel.writeLong(this.lastGenerateTime);
        parcel.writeLong(this.generateDuration);
        parcel.writeInt(this.isPromptPageShowing ? 1 : 0);
        parcel.writeString(this.leaveActionType);
        parcel.writeInt(this.hasInputPrompt ? 1 : 0);
        parcel.writeInt(this.hasPresetPrompt ? 1 : 0);
        parcel.writeInt(this.hasGeneratePrompt ? 1 : 0);
        parcel.writeInt(this.hasStartGenerate ? 1 : 0);
        parcel.writeInt(this.hasGeneratePromptReturn ? 1 : 0);
        this.recallWay.writeToParcel(parcel, i);
        parcel.writeInt(this.isRegeneratePrompt ? 1 : 0);
        parcel.writeInt(this.isFailTryAgain ? 1 : 0);
        Integer num = this.lastFailReason;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.draftSaveType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.generateSidebarType);
        Integer num3 = this.aiWriteLastFailReason;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool = this.aiAliveChangePhoto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeSerializable(this.waitingForPostProcess);
    }

    public PromptPageMobParam() {
        this(0L, -1L, -1L, false, "", false, false, false, false, false, AILivePhotoRecallWay.NONE, false, false, null, null, 0, null, null, null);
    }

    public PromptPageMobParam(long j, long j2, long j3, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AILivePhotoRecallWay aILivePhotoRecallWay, boolean z7, boolean z8, Integer num, Integer num2, int i, Integer num3, Boolean bool, Pair<String, Boolean> pair) {
        this.lastShowTime = j;
        this.lastGenerateTime = j2;
        this.generateDuration = j3;
        this.isPromptPageShowing = z;
        this.leaveActionType = str;
        this.hasInputPrompt = z2;
        this.hasPresetPrompt = z3;
        this.hasGeneratePrompt = z4;
        this.hasStartGenerate = z5;
        this.hasGeneratePromptReturn = z6;
        this.recallWay = aILivePhotoRecallWay;
        this.isRegeneratePrompt = z7;
        this.isFailTryAgain = z8;
        this.lastFailReason = num;
        this.draftSaveType = num2;
        this.generateSidebarType = i;
        this.aiWriteLastFailReason = num3;
        this.aiAliveChangePhoto = bool;
        this.waitingForPostProcess = pair;
    }
}
