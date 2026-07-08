package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C01GW;
import X.C0Q0I;
import X.C0R45;
import X.C452501pT;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoSugCell extends AssemPowerCell<SearchTakoSugAssem, C0Q0I> {
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 408));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 409));

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SearchTakoSugAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewOnCreateItemView = super.onCreateItemView(viewGroup);
        viewOnCreateItemView.addOnAttachStateChangeListener(new C0R45(this, 8));
        return viewOnCreateItemView;
    }
}
