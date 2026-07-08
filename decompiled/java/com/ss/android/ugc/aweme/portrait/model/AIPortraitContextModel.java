package com.ss.android.ugc.aweme.portrait.model;

import X.AbstractC548720Lfa;
import X.C09CT;
import X.C0LQY;
import X.C1697810uHb;
import X.C2188811AlT;
import X.InterfaceC548750Lfd;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitMobParams;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitContextModel extends AbstractC548720Lfa implements Parcelable {
    public static final Parcelable.Creator<AIPortraitContextModel> CREATOR = new Parcelable.Creator<AIPortraitContextModel>() { // from class: X.0Li3
        @Override // android.os.Parcelable.Creator
        public final AIPortraitContextModel createFromParcel(Parcel parcel) {
            AIPortraitInputInfo aIPortraitInputInfoCreateFromParcel;
            AIGCEntranceInfo aIGCEntranceInfo = (AIGCEntranceInfo) parcel.readParcelable(AIPortraitContextModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                aIPortraitInputInfoCreateFromParcel = null;
            } else {
                aIPortraitInputInfoCreateFromParcel = AIPortraitInputInfo.CREATOR.createFromParcel(parcel);
            }
            return new AIPortraitContextModel(aIGCEntranceInfo, aIPortraitInputInfoCreateFromParcel, AIPortraitGeneratingModel.CREATOR.createFromParcel(parcel), AIPortraitMobParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitContextModel[] newArray(int i) {
            return new AIPortraitContextModel[i];
        }
    };

    @C09CT("aigc_entrance_info")
    public AIGCEntranceInfo aigcEntranceInfo;

    @C09CT("generating_model")
    public final AIPortraitGeneratingModel generatingModel;

    @C09CT("input_info")
    public final AIPortraitInputInfo inputInfo;

    @C09CT("ai_portrait_mob_params")
    public final AIPortraitMobParams mobParams;

    public AIPortraitContextModel() {
        this(new AIGCEntranceInfo(C0LQY.AI_PORTRAIT, null, 0, null, null, null, false, false, false, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.RefPageName.NoNeed.INSTANCE, null, null, null, null, false, false, null, null, null), null, new AIPortraitGeneratingModel(null, null, 0, GenerateStatus.NOT_START, null, 0L, false), new AIPortraitMobParams("", null, null, null, null, null, 0, "", false, null, null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitContextModel)) {
            return false;
        }
        AIPortraitContextModel aIPortraitContextModel = (AIPortraitContextModel) obj;
        return Intrinsics.LJFF(this.aigcEntranceInfo, aIPortraitContextModel.aigcEntranceInfo) && Intrinsics.LJFF(this.inputInfo, aIPortraitContextModel.inputInfo) && Intrinsics.LJFF(this.generatingModel, aIPortraitContextModel.generatingModel) && Intrinsics.LJFF(this.mobParams, aIPortraitContextModel.mobParams);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return "AIPortraitContextModelDataResource";
    }

    public final int hashCode() {
        int iHashCode = this.aigcEntranceInfo.hashCode() * 31;
        AIPortraitInputInfo aIPortraitInputInfo = this.inputInfo;
        return ((((iHashCode + (aIPortraitInputInfo == null ? 0 : aIPortraitInputInfo.hashCode())) * 31) + this.generatingModel.hashCode()) * 31) + this.mobParams.hashCode();
    }

    @Override // X.AbstractC548720Lfa
    public final List<InterfaceC548750Lfd> provideDataSources() {
        List<InterfaceC548750Lfd> listLJIILJJIL = C1697810uHb.LJIILJJIL(new InterfaceC548750Lfd() { // from class: X.0Li4
            @Override // X.InterfaceC548750Lfd
            public final String getName() {
                return "AITheaterModelDataSource";
            }

            @Override // X.InterfaceC548750Lfd
            public final <T> T getValue(InterfaceC548900Lfs<T> interfaceC548900Lfs) {
                String str;
                if (interfaceC548900Lfs instanceof C1E3I) {
                    return (T) this.LL.generatingModel.serverWorkflowId;
                }
                if (interfaceC548900Lfs instanceof C2275351E4f) {
                    AIPortraitInputInfo aIPortraitInputInfo = this.LL.inputInfo;
                    if (aIPortraitInputInfo == null || (str = aIPortraitInputInfo.prompt) == null) {
                        return null;
                    }
                    return (T) Integer.valueOf(str.length());
                }
                if (!(interfaceC548900Lfs instanceof C1E3W)) {
                    return null;
                }
                return (T) Integer.valueOf(C550460LiO.LIZ(this.LL));
            }
        });
        listLJIILJJIL.add(this.aigcEntranceInfo);
        listLJIILJJIL.add(this.mobParams);
        return listLJIILJJIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitContextModel(aigcEntranceInfo=");
        sbLIZ.append(this.aigcEntranceInfo);
        sbLIZ.append(", inputInfo=");
        sbLIZ.append(this.inputInfo);
        sbLIZ.append(", generatingModel=");
        sbLIZ.append(this.generatingModel);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.mobParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.aigcEntranceInfo, i);
        AIPortraitInputInfo aIPortraitInputInfo = this.inputInfo;
        if (aIPortraitInputInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIPortraitInputInfo.writeToParcel(parcel, i);
        }
        this.generatingModel.writeToParcel(parcel, i);
        this.mobParams.writeToParcel(parcel, i);
    }

    public AIPortraitContextModel(AIGCEntranceInfo aIGCEntranceInfo, AIPortraitInputInfo aIPortraitInputInfo, AIPortraitGeneratingModel aIPortraitGeneratingModel, AIPortraitMobParams aIPortraitMobParams) {
        this.aigcEntranceInfo = aIGCEntranceInfo;
        this.inputInfo = aIPortraitInputInfo;
        this.generatingModel = aIPortraitGeneratingModel;
        this.mobParams = aIPortraitMobParams;
    }
}
