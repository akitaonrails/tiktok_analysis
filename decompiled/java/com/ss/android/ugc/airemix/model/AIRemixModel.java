package com.ss.android.ugc.airemix.model;

import X.AbstractC548720Lfa;
import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC548750Lfd;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixConsumptionModel;
import com.ss.android.ugc.airemix.model.AIRemixCreationModel;
import com.ss.android.ugc.airemix.model.AIRemixExtraModel;
import com.ss.android.ugc.airemix.model.AIRemixMobContextModel;
import com.ss.android.ugc.airemix.model.AIRemixModel;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixAwemeEntranceInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixConversationPageInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCreationInputInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixOriginInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCItemCrtInfo;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixModel extends AbstractC548720Lfa implements Parcelable {
    public static final Parcelable.Creator<AIRemixModel> CREATOR = new Parcelable.Creator<AIRemixModel>() { // from class: X.0Lfl
        @Override // android.os.Parcelable.Creator
        public final AIRemixModel createFromParcel(Parcel parcel) {
            AIRemixConsumptionModel aIRemixConsumptionModelCreateFromParcel;
            AIRemixCreationModel aIRemixCreationModelCreateFromParcel = AIRemixCreationModel.CREATOR.createFromParcel(parcel);
            AIRemixExtraModel aIRemixExtraModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                aIRemixConsumptionModelCreateFromParcel = null;
            } else {
                aIRemixConsumptionModelCreateFromParcel = AIRemixConsumptionModel.CREATOR.createFromParcel(parcel);
            }
            AIRemixConsumptionModel aIRemixConsumptionModel = aIRemixConsumptionModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                aIRemixExtraModelCreateFromParcel = AIRemixExtraModel.CREATOR.createFromParcel(parcel);
            }
            return new AIRemixModel(aIRemixCreationModelCreateFromParcel, aIRemixConsumptionModel, aIRemixExtraModelCreateFromParcel, AIRemixMobContextModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixModel[] newArray(int i) {
            return new AIRemixModel[i];
        }
    };

    @C09CT("consumption_model")
    public AIRemixConsumptionModel consumptionModel;

    @C09CT("context_model")
    public final AIRemixMobContextModel contextModel;

    @C09CT("creation_model")
    public AIRemixCreationModel creationModel;

    @C09CT("extra_model")
    public AIRemixExtraModel extraModel;

    @C040H
    public final String name;

    public AIRemixModel() {
        this(new AIRemixCreationModel(new AIRemixSessionModel(UUID.randomUUID().toString(), "", 0, ""), new WritableAIRemixGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null)), null, new AIRemixExtraModel(null, false, false, null, null), new AIRemixMobContextModel(new AIRemixCommonEntranceInfo(null, null, UUID.randomUUID().toString(), null, null, null), new AIRemixAwemeEntranceInfo(null, null, null, null), new AIRemixOriginInfo(null, null, null, null, null, null, null, null, null), new AIRemixConversationPageInfo(null, null, null), new AIRemixCreationInputInfo(0, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null), new AIGCItemCrtInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, 0L, -1L));
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final AIRemixModel copy(AIRemixCreationModel aIRemixCreationModel, AIRemixConsumptionModel aIRemixConsumptionModel, AIRemixExtraModel aIRemixExtraModel, AIRemixMobContextModel aIRemixMobContextModel) {
        return new AIRemixModel(aIRemixCreationModel, aIRemixConsumptionModel, aIRemixExtraModel, aIRemixMobContextModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixModel)) {
            return false;
        }
        AIRemixModel aIRemixModel = (AIRemixModel) obj;
        return Intrinsics.LJFF(this.creationModel, aIRemixModel.creationModel) && Intrinsics.LJFF(this.consumptionModel, aIRemixModel.consumptionModel) && Intrinsics.LJFF(this.extraModel, aIRemixModel.extraModel) && Intrinsics.LJFF(this.contextModel, aIRemixModel.contextModel);
    }

    public int hashCode() {
        int iHashCode = this.creationModel.hashCode() * 31;
        AIRemixConsumptionModel aIRemixConsumptionModel = this.consumptionModel;
        int iHashCode2 = (iHashCode + (aIRemixConsumptionModel == null ? 0 : aIRemixConsumptionModel.hashCode())) * 31;
        AIRemixExtraModel aIRemixExtraModel = this.extraModel;
        return ((iHashCode2 + (aIRemixExtraModel != null ? aIRemixExtraModel.hashCode() : 0)) * 31) + this.contextModel.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixModel(creationModel=");
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
        AIRemixConsumptionModel aIRemixConsumptionModel = this.consumptionModel;
        if (aIRemixConsumptionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIRemixConsumptionModel.writeToParcel(parcel, i);
        }
        AIRemixExtraModel aIRemixExtraModel = this.extraModel;
        if (aIRemixExtraModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIRemixExtraModel.writeToParcel(parcel, i);
        }
        this.contextModel.writeToParcel(parcel, i);
    }

    @Override // X.AbstractC548720Lfa
    public List<InterfaceC548750Lfd> provideDataSources() {
        return Collections.singletonList(new InterfaceC548750Lfd() { // from class: X.0Lfm
            @Override // X.InterfaceC548750Lfd
            public final String getName() {
                return "AIRemixModelDataSource";
            }

            @Override // X.InterfaceC548750Lfd
            public final <T> T getValue(InterfaceC548900Lfs<T> interfaceC548900Lfs) {
                if (interfaceC548900Lfs instanceof C1E3I) {
                    T t = (T) this.LL.getCreationModel().generationModel.getServerTaskId();
                    if (t == null) {
                        return (T) this.LL.getContextModel().getValue(interfaceC548900Lfs);
                    }
                    return t;
                }
                return (T) this.LL.getContextModel().getValue(interfaceC548900Lfs);
            }
        });
    }

    public final AIRemixConsumptionModel getConsumptionModel() {
        return this.consumptionModel;
    }

    public final AIRemixMobContextModel getContextModel() {
        return this.contextModel;
    }

    public final AIRemixCreationModel getCreationModel() {
        return this.creationModel;
    }

    public final AIRemixExtraModel getExtraModel() {
        return this.extraModel;
    }

    @Override // X.InterfaceC548750Lfd
    public String getName() {
        return this.name;
    }

    public final void setConsumptionModel(AIRemixConsumptionModel aIRemixConsumptionModel) {
        this.consumptionModel = aIRemixConsumptionModel;
    }

    public final void setCreationModel(AIRemixCreationModel aIRemixCreationModel) {
        this.creationModel = aIRemixCreationModel;
    }

    public final void setExtraModel(AIRemixExtraModel aIRemixExtraModel) {
        this.extraModel = aIRemixExtraModel;
    }

    public AIRemixModel(AIRemixCreationModel aIRemixCreationModel, AIRemixConsumptionModel aIRemixConsumptionModel, AIRemixExtraModel aIRemixExtraModel, AIRemixMobContextModel aIRemixMobContextModel) {
        this.creationModel = aIRemixCreationModel;
        this.consumptionModel = aIRemixConsumptionModel;
        this.extraModel = aIRemixExtraModel;
        this.contextModel = aIRemixMobContextModel;
        this.name = "AIRemixModel";
    }
}
