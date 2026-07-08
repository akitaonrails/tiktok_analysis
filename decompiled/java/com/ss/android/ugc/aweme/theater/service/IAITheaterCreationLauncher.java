package com.ss.android.ugc.aweme.theater.service;

import X.C09CT;
import X.C19A3;
import X.C2188811AlT;
import X.C548730Lfb;
import X.C548920Lfu;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public interface IAITheaterCreationLauncher {

    public static final class EnterParams implements Parcelable {

        @C09CT("consumption_model")
        public final AITheaterConsumptionModel consumptionModel;

        @C09CT("creative_info")
        public final CreativeInfo creativeInfo;

        @C09CT("creative_model")
        public final CreativeModel creativeModel;

        @C09CT("entrance_info")
        public final AIGCEntranceInfo entranceInfo;

        @C09CT("social_params")
        public final AIGCSocialModel socialParams;
        public static final C548730Lfb Companion = new Object() { // from class: X.0Lfb
        };
        public static final Parcelable.Creator<EnterParams> CREATOR = new Parcelable.Creator<EnterParams>() { // from class: X.0L6l
            @Override // android.os.Parcelable.Creator
            public final IAITheaterCreationLauncher.EnterParams createFromParcel(Parcel parcel) {
                return new IAITheaterCreationLauncher.EnterParams((CreativeInfo) parcel.readParcelable(IAITheaterCreationLauncher.EnterParams.class.getClassLoader()), (CreativeModel) parcel.readParcelable(IAITheaterCreationLauncher.EnterParams.class.getClassLoader()), (AITheaterConsumptionModel) parcel.readParcelable(IAITheaterCreationLauncher.EnterParams.class.getClassLoader()), (AIGCSocialModel) parcel.readParcelable(IAITheaterCreationLauncher.EnterParams.class.getClassLoader()), (AIGCEntranceInfo) parcel.readParcelable(IAITheaterCreationLauncher.EnterParams.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final IAITheaterCreationLauncher.EnterParams[] newArray(int i) {
                return new IAITheaterCreationLauncher.EnterParams[i];
            }
        };

        /* JADX WARN: Multi-variable type inference failed */
        public EnterParams() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParams)) {
                return false;
            }
            EnterParams enterParams = (EnterParams) obj;
            return Intrinsics.LJFF(this.creativeInfo, enterParams.creativeInfo) && Intrinsics.LJFF(this.creativeModel, enterParams.creativeModel) && Intrinsics.LJFF(this.consumptionModel, enterParams.consumptionModel) && Intrinsics.LJFF(this.socialParams, enterParams.socialParams) && Intrinsics.LJFF(this.entranceInfo, enterParams.entranceInfo);
        }

        public final int hashCode() {
            CreativeInfo creativeInfo = this.creativeInfo;
            int iHashCode = (creativeInfo == null ? 0 : creativeInfo.hashCode()) * 31;
            CreativeModel creativeModel = this.creativeModel;
            int iHashCode2 = (iHashCode + (creativeModel == null ? 0 : creativeModel.hashCode())) * 31;
            AITheaterConsumptionModel aITheaterConsumptionModel = this.consumptionModel;
            int iHashCode3 = (iHashCode2 + (aITheaterConsumptionModel == null ? 0 : aITheaterConsumptionModel.hashCode())) * 31;
            AIGCSocialModel aIGCSocialModel = this.socialParams;
            int iHashCode4 = (iHashCode3 + (aIGCSocialModel == null ? 0 : aIGCSocialModel.hashCode())) * 31;
            AIGCEntranceInfo aIGCEntranceInfo = this.entranceInfo;
            return iHashCode4 + (aIGCEntranceInfo != null ? aIGCEntranceInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EnterParams(creativeInfo=");
            sbLIZ.append(this.creativeInfo);
            sbLIZ.append(", creativeModel=");
            sbLIZ.append(this.creativeModel);
            sbLIZ.append(", consumptionModel=");
            sbLIZ.append(this.consumptionModel);
            sbLIZ.append(", socialParams=");
            sbLIZ.append(this.socialParams);
            sbLIZ.append(", entranceInfo=");
            sbLIZ.append(this.entranceInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.creativeInfo, i);
            parcel.writeParcelable(this.creativeModel, i);
            parcel.writeParcelable(this.consumptionModel, i);
            parcel.writeParcelable(this.socialParams, i);
            parcel.writeParcelable(this.entranceInfo, i);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.0Lfb] */
        static {
            C548920Lfu.LIZ(EnterParams.class, AFwS239S0000000_8.get$arr$(153));
        }

        public EnterParams(CreativeInfo creativeInfo, CreativeModel creativeModel, AITheaterConsumptionModel aITheaterConsumptionModel, AIGCSocialModel aIGCSocialModel, AIGCEntranceInfo aIGCEntranceInfo) {
            this.creativeInfo = creativeInfo;
            this.creativeModel = creativeModel;
            this.consumptionModel = aITheaterConsumptionModel;
            this.socialParams = aIGCSocialModel;
            this.entranceInfo = aIGCEntranceInfo;
        }

        public static EnterParams LIZ(EnterParams enterParams, CreativeInfo creativeInfo, CreativeModel creativeModel, AIGCEntranceInfo aIGCEntranceInfo, int i) {
            AITheaterConsumptionModel aITheaterConsumptionModel;
            AIGCEntranceInfo aIGCEntranceInfo2 = aIGCEntranceInfo;
            CreativeModel creativeModel2 = creativeModel;
            CreativeInfo creativeInfo2 = creativeInfo;
            if ((i & 1) != 0) {
                creativeInfo2 = enterParams.creativeInfo;
            }
            if ((i & 2) != 0) {
                creativeModel2 = enterParams.creativeModel;
            }
            AIGCSocialModel aIGCSocialModel = null;
            if ((i & 4) != 0) {
                aITheaterConsumptionModel = enterParams.consumptionModel;
            } else {
                aITheaterConsumptionModel = null;
            }
            if ((i & 8) != 0) {
                aIGCSocialModel = enterParams.socialParams;
            }
            if ((i & 16) != 0) {
                aIGCEntranceInfo2 = enterParams.entranceInfo;
            }
            enterParams.getClass();
            return new EnterParams(creativeInfo2, creativeModel2, aITheaterConsumptionModel, aIGCSocialModel, aIGCEntranceInfo2);
        }

        public /* synthetic */ EnterParams(CreativeInfo creativeInfo, CreativeModel creativeModel, AITheaterConsumptionModel aITheaterConsumptionModel, AIGCSocialModel aIGCSocialModel, AIGCEntranceInfo aIGCEntranceInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo, (i & 2) != 0 ? null : creativeModel, (i & 4) != 0 ? null : aITheaterConsumptionModel, (i & 8) != 0 ? null : aIGCSocialModel, (i & 16) == 0 ? aIGCEntranceInfo : null);
        }
    }

    void LIZ(EnterParams enterParams, Context context, String str, boolean z, Function0<Unit> function0);

    boolean LIZIZ(Activity activity, Bundle bundle);

    C19A3 LIZJ();

    Class<? extends C19A3> LIZLLL();

    void LJ(EnterParams enterParams, Context context);

    void LJFF(EnterParams enterParams, Context context, boolean z);

    boolean LJI();

    Class<? extends C19A3> generationRootSceneClass();

    C19A3 generationRootSceneInstance();
}
