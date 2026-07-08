package com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice;

import X.C09CT;
import X.C11NZ;
import X.C13BV;
import X.C2188811AlT;
import X.C593620NQa;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface DecisionMakerNetworkApi {
    public static final C593620NQa LIZ = C593620NQa.LIZ;

    @InterfaceC1501240pAY("/tiktok/ppf/api/eligibility/v2")
    Object LIZ(InterfaceC1364105Vn<? super DecisionMakerResponseModel> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/ppf/api/eligibility/v2")
    C11NZ<DecisionMakerResponseModel> getData();

    public static final class DecisionMakerResponseModel extends BaseResponse implements Serializable {

        @C09CT("eligibility_list")
        public List<EligibilityModel> eligibilityData;

        @C09CT("tool_list")
        public List<? extends Map<String, ? extends Object>> toolsList;

        public DecisionMakerResponseModel() {
            this(null, null, 3, null);
        }

        public final DecisionMakerResponseModel copy(List<EligibilityModel> list, List<? extends Map<String, ? extends Object>> list2) {
            return new DecisionMakerResponseModel(list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DecisionMakerResponseModel)) {
                return false;
            }
            DecisionMakerResponseModel decisionMakerResponseModel = (DecisionMakerResponseModel) obj;
            return Intrinsics.LJFF(this.eligibilityData, decisionMakerResponseModel.eligibilityData) && Intrinsics.LJFF(this.toolsList, decisionMakerResponseModel.toolsList);
        }

        public int hashCode() {
            int iHashCode = this.eligibilityData.hashCode() * 31;
            List<? extends Map<String, ? extends Object>> list = this.toolsList;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DecisionMakerResponseModel(eligibilityData=");
            sbLIZ.append(this.eligibilityData);
            sbLIZ.append(", toolsList=");
            sbLIZ.append(this.toolsList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<EligibilityModel> getEligibilityData() {
            return this.eligibilityData;
        }

        public final List<Map<String, Object>> getToolsList() {
            return this.toolsList;
        }

        public final void setEligibilityData(List<EligibilityModel> list) {
            this.eligibilityData = list;
        }

        public final void setToolsList(List<? extends Map<String, ? extends Object>> list) {
            this.toolsList = list;
        }

        public DecisionMakerResponseModel(List<EligibilityModel> list, List<? extends Map<String, ? extends Object>> list2) {
            this.eligibilityData = list;
            this.toolsList = list2;
        }

        public DecisionMakerResponseModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    /* JADX INFO: loaded from: classes29.dex */
    public static final class EligibilityModel implements Serializable {

        @C09CT("action_list")
        public List<PPFActionModel> actionList;

        @C09CT("decision_code")
        public String decisionCode;

        @C09CT("id_value")
        public String idValue;

        @C09CT("is_eligible")
        public boolean isEligible;

        public EligibilityModel() {
            this(false, null, null, null, 15, null);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EligibilityModel(isEligible=");
            sbLIZ.append(this.isEligible);
            sbLIZ.append(", actionList=");
            sbLIZ.append(this.actionList);
            sbLIZ.append(", idValue=");
            sbLIZ.append(this.idValue);
            sbLIZ.append(", decisionCode=");
            sbLIZ.append(this.decisionCode);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean isEligible() {
            return this.isEligible;
        }

        public final void setActionList(List<PPFActionModel> list) {
            this.actionList = list;
        }

        public final void setDecisionCode(String str) {
            this.decisionCode = str;
        }

        public final void setEligible(boolean z) {
            this.isEligible = z;
        }

        public final void setIdValue(String str) {
            this.idValue = str;
        }

        public EligibilityModel(boolean z, List<PPFActionModel> list, String str, String str2) {
            this.isEligible = z;
            this.actionList = list;
            this.idValue = str;
            this.decisionCode = str2;
        }

        public EligibilityModel(boolean z, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: loaded from: classes29.dex */
    public static final class PPFActionModel {

        @C09CT("processor")
        public final String actionId;

        @C09CT("params")
        public final String actionParams;

        @C09CT("necessary")
        public final Boolean necessary;

        public PPFActionModel() {
            this("", "", null);
        }

        public PPFActionModel(String str, String str2, Boolean bool) {
            this.actionId = str;
            this.actionParams = str2;
            this.necessary = bool;
        }
    }
}
