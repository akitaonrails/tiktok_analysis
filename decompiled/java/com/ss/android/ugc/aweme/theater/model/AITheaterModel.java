package com.ss.android.ugc.aweme.theater.model;

import X.AbstractC548720Lfa;
import X.C040H;
import X.C09CT;
import X.C0LQY;
import X.C1697810uHb;
import X.C2188811AlT;
import X.EnumC547660Lds;
import X.InterfaceC548750Lfd;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationResultInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCOriginInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterModel extends AbstractC548720Lfa implements Parcelable {
    public static final Parcelable.Creator<AITheaterModel> CREATOR = new Parcelable.Creator<AITheaterModel>() { // from class: X.0Lej
        @Override // android.os.Parcelable.Creator
        public final AITheaterModel createFromParcel(Parcel parcel) {
            AITheaterConsumptionModel aITheaterConsumptionModelCreateFromParcel;
            AITheaterCreationModel aITheaterCreationModelCreateFromParcel = AITheaterCreationModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                aITheaterConsumptionModelCreateFromParcel = null;
            } else {
                aITheaterConsumptionModelCreateFromParcel = AITheaterConsumptionModel.CREATOR.createFromParcel(parcel);
            }
            return new AITheaterModel(aITheaterCreationModelCreateFromParcel, aITheaterConsumptionModelCreateFromParcel, AITheaterExtraModel.CREATOR.createFromParcel(parcel), AITheaterContextModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AITheaterModel[] newArray(int i) {
            return new AITheaterModel[i];
        }
    };

    @C09CT("consumption_model")
    public AITheaterConsumptionModel consumptionModel;

    @C09CT("context_model")
    public final AITheaterContextModel contextModel;

    @C09CT("creation_model")
    public AITheaterCreationModel creationModel;

    @C09CT("extra_model")
    public final AITheaterExtraModel extraModel;

    @C040H
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public AITheaterModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final AITheaterModel copy(AITheaterCreationModel aITheaterCreationModel, AITheaterConsumptionModel aITheaterConsumptionModel, AITheaterExtraModel aITheaterExtraModel, AITheaterContextModel aITheaterContextModel) {
        return new AITheaterModel(aITheaterCreationModel, aITheaterConsumptionModel, aITheaterExtraModel, aITheaterContextModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterModel)) {
            return false;
        }
        AITheaterModel aITheaterModel = (AITheaterModel) obj;
        return Intrinsics.LJFF(this.creationModel, aITheaterModel.creationModel) && Intrinsics.LJFF(this.consumptionModel, aITheaterModel.consumptionModel) && Intrinsics.LJFF(this.extraModel, aITheaterModel.extraModel) && Intrinsics.LJFF(this.contextModel, aITheaterModel.contextModel);
    }

    public int hashCode() {
        int iHashCode = this.creationModel.hashCode() * 31;
        AITheaterConsumptionModel aITheaterConsumptionModel = this.consumptionModel;
        return ((((iHashCode + (aITheaterConsumptionModel == null ? 0 : aITheaterConsumptionModel.hashCode())) * 31) + this.extraModel.hashCode()) * 31) + this.contextModel.hashCode();
    }

    @Override // X.AbstractC548720Lfa
    public List<InterfaceC548750Lfd> provideDataSources() {
        List<InterfaceC548750Lfd> listLJIILJJIL = C1697810uHb.LJIILJJIL(new InterfaceC548750Lfd() { // from class: X.0LfZ
            @Override // X.InterfaceC548750Lfd
            public final String getName() {
                return "AITheaterModelDataSource";
            }

            @Override // X.InterfaceC548750Lfd
            public final <T> T getValue(InterfaceC548900Lfs<T> interfaceC548900Lfs) {
                if (interfaceC548900Lfs instanceof C1E3I) {
                    return (T) this.LL.getCreationModel().generationModel.getServerTaskId();
                }
                return null;
            }
        });
        listLJIILJJIL.addAll(this.contextModel.provideDataSources());
        return listLJIILJJIL;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterModel(creationModel=");
        sbLIZ.append(this.creationModel);
        sbLIZ.append(", consumptionModel=");
        sbLIZ.append(this.consumptionModel);
        sbLIZ.append(", extraModel=");
        sbLIZ.append(this.extraModel);
        sbLIZ.append(", contextModel=");
        sbLIZ.append(this.contextModel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.creationModel.writeToParcel(parcel, i);
        AITheaterConsumptionModel aITheaterConsumptionModel = this.consumptionModel;
        if (aITheaterConsumptionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aITheaterConsumptionModel.writeToParcel(parcel, i);
        }
        this.extraModel.writeToParcel(parcel, i);
        this.contextModel.writeToParcel(parcel, i);
    }

    public final AITheaterConsumptionModel getConsumptionModel() {
        return this.consumptionModel;
    }

    public final AITheaterContextModel getContextModel() {
        return this.contextModel;
    }

    public final AITheaterCreationModel getCreationModel() {
        return this.creationModel;
    }

    public final AITheaterExtraModel getExtraModel() {
        return this.extraModel;
    }

    @Override // X.InterfaceC548750Lfd
    public String getName() {
        return this.name;
    }

    public final void setConsumptionModel(AITheaterConsumptionModel aITheaterConsumptionModel) {
        this.consumptionModel = aITheaterConsumptionModel;
    }

    public final void setCreationModel(AITheaterCreationModel aITheaterCreationModel) {
        this.creationModel = aITheaterCreationModel;
    }

    public AITheaterModel(AITheaterCreationModel aITheaterCreationModel, AITheaterConsumptionModel aITheaterConsumptionModel, AITheaterExtraModel aITheaterExtraModel, AITheaterContextModel aITheaterContextModel) {
        this.creationModel = aITheaterCreationModel;
        this.consumptionModel = aITheaterConsumptionModel;
        this.extraModel = aITheaterExtraModel;
        this.contextModel = aITheaterContextModel;
        this.name = "AITheaterModel";
    }

    public /* synthetic */ AITheaterModel(AITheaterCreationModel aITheaterCreationModel, AITheaterConsumptionModel aITheaterConsumptionModel, AITheaterExtraModel aITheaterExtraModel, AITheaterContextModel aITheaterContextModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        AITheaterContextModel aITheaterContextModel2 = aITheaterContextModel;
        AITheaterExtraModel aITheaterExtraModel2 = aITheaterExtraModel;
        AITheaterCreationModel aITheaterCreationModel2 = aITheaterCreationModel;
        AITheaterConsumptionModel aITheaterConsumptionModel2 = null;
        if ((i & 1) != 0) {
            aITheaterConsumptionModel2 = null;
            aITheaterCreationModel2 = new AITheaterCreationModel(new AITheaterSessionModel(null, null, 0, null, 15, null), new WritableAITheaterGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null));
        }
        this(aITheaterCreationModel2, (i & 2) == 0 ? aITheaterConsumptionModel : aITheaterConsumptionModel2, (i & 4) != 0 ? new AITheaterExtraModel(null, false, false, null, null, null, false) : aITheaterExtraModel2, (i & 8) != 0 ? new AITheaterContextModel(new AIGCEntranceInfo(C0LQY.AI_THEATER, null, 0, null, null, null, false, false, false, AIGC.AICreationSceneName.PROACTIVE_CRT_POST.INSTANCE, AIGC.RefPageName.NoNeed.INSTANCE, null, null, null, null, false, false, null, null, null), new AIGCCreationInputInfo(false, null, null, 0, null, null, null, null, false, 0, null, 0, Boolean.FALSE, null, null), new AIGCCreationResultInfo(null, null, 0L, null, EnumC547660Lds.UNKNOWN.getValue()), new AIGCOriginInfo(null, null, null, null, null, null, null, null, null, null)) : aITheaterContextModel2);
    }
}
