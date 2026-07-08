package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C09CT;
import X.C1533950q1J;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIFlow;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CommuteType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POBindInfo {
    public final CBIFlow LIZ;

    @C09CT("bind_time")
    public final String bindTime;

    @C09CT("payment_option_bind_check_box")
    public final BindCheckBox checkBox;

    @C09CT("is_need_pre_bind_verify")
    public final Boolean isNeedPreBindVerify;

    @C09CT("is_need_pre_fetch_activate_url")
    public final Boolean isNeedPreFetchActivateUrl;

    @C09CT("schema")
    public final String schema;

    @C09CT("supported_commute_types")
    public final List<CommuteType> supportedCommuteTypes;

    public POBindInfo() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POBindInfo)) {
            return false;
        }
        POBindInfo pOBindInfo = (POBindInfo) obj;
        return Intrinsics.LJFF(this.schema, pOBindInfo.schema) && Intrinsics.LJFF(this.isNeedPreFetchActivateUrl, pOBindInfo.isNeedPreFetchActivateUrl) && Intrinsics.LJFF(this.isNeedPreBindVerify, pOBindInfo.isNeedPreBindVerify) && Intrinsics.LJFF(this.supportedCommuteTypes, pOBindInfo.supportedCommuteTypes) && Intrinsics.LJFF(this.checkBox, pOBindInfo.checkBox) && Intrinsics.LJFF(this.bindTime, pOBindInfo.bindTime) && Intrinsics.LJFF(this.LIZ, pOBindInfo.LIZ);
    }

    public final int hashCode() {
        String str = this.schema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isNeedPreFetchActivateUrl;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isNeedPreBindVerify;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<CommuteType> list = this.supportedCommuteTypes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BindCheckBox bindCheckBox = this.checkBox;
        int iHashCode5 = (iHashCode4 + (bindCheckBox == null ? 0 : bindCheckBox.hashCode())) * 31;
        String str2 = this.bindTime;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CBIFlow cBIFlow = this.LIZ;
        return iHashCode6 + (cBIFlow != null ? cBIFlow.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POBindInfo(schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", isNeedPreFetchActivateUrl=");
        sbLIZ.append(this.isNeedPreFetchActivateUrl);
        sbLIZ.append(", isNeedPreBindVerify=");
        sbLIZ.append(this.isNeedPreBindVerify);
        sbLIZ.append(", supportedCommuteTypes=");
        sbLIZ.append(this.supportedCommuteTypes);
        sbLIZ.append(", checkBox=");
        sbLIZ.append(this.checkBox);
        sbLIZ.append(", bindTime=");
        sbLIZ.append(this.bindTime);
        sbLIZ.append(", legacyBindFlow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return C1533950q1J.LJ(this.schema) || Intrinsics.LJFF(this.isNeedPreFetchActivateUrl, Boolean.TRUE) || this.LIZ != null;
    }

    public static final class BindCheckBox {

        @C09CT("is_select")
        public final Boolean isSelect;

        @C09CT("select_payment_option_id")
        public final String selectPaymentOptionId;

        @C09CT("unselect_payment_option_id")
        public final String unselectPaymentOptionId;

        public BindCheckBox() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BindCheckBox)) {
                return false;
            }
            BindCheckBox bindCheckBox = (BindCheckBox) obj;
            return Intrinsics.LJFF(this.isSelect, bindCheckBox.isSelect) && Intrinsics.LJFF(this.selectPaymentOptionId, bindCheckBox.selectPaymentOptionId) && Intrinsics.LJFF(this.unselectPaymentOptionId, bindCheckBox.unselectPaymentOptionId);
        }

        public final int hashCode() {
            Boolean bool = this.isSelect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.selectPaymentOptionId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.unselectPaymentOptionId;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BindCheckBox(isSelect=");
            sbLIZ.append(this.isSelect);
            sbLIZ.append(", selectPaymentOptionId=");
            sbLIZ.append(this.selectPaymentOptionId);
            sbLIZ.append(", unselectPaymentOptionId=");
            sbLIZ.append(this.unselectPaymentOptionId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BindCheckBox(Boolean bool, String str, String str2) {
            this.isSelect = bool;
            this.selectPaymentOptionId = str;
            this.unselectPaymentOptionId = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public POBindInfo(String str, Boolean bool, Boolean bool2, List<? extends CommuteType> list, BindCheckBox bindCheckBox, String str2, CBIFlow cBIFlow) {
        this.schema = str;
        this.isNeedPreFetchActivateUrl = bool;
        this.isNeedPreBindVerify = bool2;
        this.supportedCommuteTypes = list;
        this.checkBox = bindCheckBox;
        this.bindTime = str2;
        this.LIZ = cBIFlow;
    }
}
