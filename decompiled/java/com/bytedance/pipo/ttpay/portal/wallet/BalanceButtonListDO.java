package com.bytedance.pipo.ttpay.portal.wallet;

import X.C09CT;
import com.bytedance.pipo.stellar.base.model.LayoutParamDO;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BalanceButtonListDO {

    @C09CT("list")
    public final List<BalanceButtonDO> buttonList;

    @C09CT("layout_param")
    public final LayoutParamDO layoutParam;

    public BalanceButtonListDO() {
        this(null, null);
    }

    public final int hashCode() {
        LayoutParamDO layoutParamDO = this.layoutParam;
        int iHashCode = (layoutParamDO == null ? 0 : layoutParamDO.hashCode()) * 31;
        List<BalanceButtonDO> list = this.buttonList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public BalanceButtonListDO(LayoutParamDO layoutParamDO, List<BalanceButtonDO> list) {
        this.layoutParam = layoutParamDO;
        this.buttonList = list;
    }
}
