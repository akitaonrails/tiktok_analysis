package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C07E5;
import X.C1559260qg8;
import X.C657640Pqs;
import X.C723580SZw;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchCardDarkLayerAssem extends ReusedUISlotAssem<SearchCardDarkLayerAssem> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C657640Pqs.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eu1;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Function2<? super ReusedUISlotAssem<?>, ? super Integer, Unit> function2;
        C657640Pqs c657640Pqs = (C657640Pqs) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c657640Pqs != null && (function2 = c657640Pqs.LL) != null) {
            function2.invoke(this, Integer.valueOf(R.id.u9g));
        }
    }
}
