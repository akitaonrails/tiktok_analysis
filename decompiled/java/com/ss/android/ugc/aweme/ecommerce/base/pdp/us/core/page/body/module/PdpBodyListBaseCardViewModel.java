package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module;

import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC738070SxJ;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PdpBodyListBaseCardViewModel<S extends InterfaceC0148002o, ITEM> extends AssemViewModelWithItem<S, ITEM> implements InterfaceC738070SxJ<S, ITEM> {
    @Override // X.InterfaceC738070SxJ
    @InterfaceC1294060jmO
    public final ITEM state2ItemAccept(S s, ITEM item) {
        return item;
    }

    public abstract S vQ2(S s, ITEM item);

    @Override // X.InterfaceC738070SxJ
    public final S itemSync2StateAccept(S s, ITEM item, List<? extends Object> list) {
        return (S) vQ2(s, item);
    }
}
