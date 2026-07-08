package com.ss.android.ugc.aweme.pipo.cashier.common.model;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIDescriptionBlock;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.WalletPaymentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PIPOPaymentOptionHybridInfo {

    @C09CT("amount")
    public final String amount;

    @C09CT("display_amount")
    public final String displayAmount;

    @C09CT("need_select_other_block")
    public final CBIDescriptionBlock needSelectOtherBlock;

    @C09CT("source")
    public final PIPOPaymentOptionSource source;

    @C09CT("type")
    public final WalletPaymentType type;

    public PIPOPaymentOptionHybridInfo() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIPOPaymentOptionHybridInfo)) {
            return false;
        }
        PIPOPaymentOptionHybridInfo pIPOPaymentOptionHybridInfo = (PIPOPaymentOptionHybridInfo) obj;
        return this.type == pIPOPaymentOptionHybridInfo.type && Intrinsics.LJFF(this.source, pIPOPaymentOptionHybridInfo.source) && Intrinsics.LJFF(this.displayAmount, pIPOPaymentOptionHybridInfo.displayAmount) && Intrinsics.LJFF(this.amount, pIPOPaymentOptionHybridInfo.amount) && Intrinsics.LJFF(this.needSelectOtherBlock, pIPOPaymentOptionHybridInfo.needSelectOtherBlock);
    }

    public final int hashCode() {
        WalletPaymentType walletPaymentType = this.type;
        int iHashCode = (walletPaymentType == null ? 0 : walletPaymentType.hashCode()) * 31;
        PIPOPaymentOptionSource pIPOPaymentOptionSource = this.source;
        int iHashCode2 = (iHashCode + (pIPOPaymentOptionSource == null ? 0 : pIPOPaymentOptionSource.hashCode())) * 31;
        String str = this.displayAmount;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amount;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CBIDescriptionBlock cBIDescriptionBlock = this.needSelectOtherBlock;
        return iHashCode4 + (cBIDescriptionBlock != null ? cBIDescriptionBlock.hashCode() : 0);
    }

    public final String toString() {
        return "HybridInfo";
    }

    public PIPOPaymentOptionHybridInfo(WalletPaymentType walletPaymentType, PIPOPaymentOptionSource pIPOPaymentOptionSource, String str, String str2, CBIDescriptionBlock cBIDescriptionBlock) {
        this.type = walletPaymentType;
        this.source = pIPOPaymentOptionSource;
        this.displayAmount = str;
        this.amount = str2;
        this.needSelectOtherBlock = cBIDescriptionBlock;
    }
}
