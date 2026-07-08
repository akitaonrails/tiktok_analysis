package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C909220Zlg;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarStrategyTransferConf extends IBusinessConfig {
    public static final C909220Zlg Companion = new Object() { // from class: X.0Zlg
    };

    @C09CT("base_state")
    public final List<String> baseState;

    @C09CT("transfer_list")
    public final List<ActionBarTransferConf> transferList;

    @C09CT("version")
    public final Integer version;

    public ActionBarStrategyTransferConf() {
        this(null, null, null);
    }

    public final ActionBarStrategyTransferConf copy(List<String> list, List<ActionBarTransferConf> list2, Integer num) {
        return new ActionBarStrategyTransferConf(list, list2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarStrategyTransferConf)) {
            return false;
        }
        ActionBarStrategyTransferConf actionBarStrategyTransferConf = (ActionBarStrategyTransferConf) obj;
        return Intrinsics.LJFF(this.baseState, actionBarStrategyTransferConf.baseState) && Intrinsics.LJFF(this.transferList, actionBarStrategyTransferConf.transferList) && Intrinsics.LJFF(this.version, actionBarStrategyTransferConf.version);
    }

    public int hashCode() {
        List<String> list = this.baseState;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ActionBarTransferConf> list2 = this.transferList;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.version;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionBarStrategyTransferConf(baseState=");
        sbLIZ.append(this.baseState);
        sbLIZ.append(", transferList=");
        sbLIZ.append(this.transferList);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getBaseState() {
        return this.baseState;
    }

    public final List<ActionBarTransferConf> getTransferList() {
        return this.transferList;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public ActionBarStrategyTransferConf(List<String> list, List<ActionBarTransferConf> list2, Integer num) {
        this.baseState = list;
        this.transferList = list2;
        this.version = num;
    }
}
