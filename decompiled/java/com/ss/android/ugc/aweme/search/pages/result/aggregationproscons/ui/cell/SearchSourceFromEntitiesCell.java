package com.ss.android.ugc.aweme.search.pages.result.aggregationproscons.ui.cell;

import X.C07C0;
import X.C0H2U;
import X.C0H2W;
import X.C0H2Y;
import X.C427720Gpu;
import X.C427760Gpy;
import X.C434640H2o;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ARunnableS106S0100000_6;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS25S0300000_6;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchSourceFromEntitiesCell extends PowerCell<C0H2Y> {
    public C0H2W LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f39;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C0H2W) this.itemView.findViewById(R.id.vqw);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0H2Y c0h2y = (C0H2Y) interfaceC1891350zJl;
        super.onBindItemView(c0h2y);
        C0H2W c0h2w = this.LL;
        if (c0h2w != null) {
            String str = c0h2y.LLILLJJLI;
            int i = c0h2y.LLILLL;
            int i2 = c0h2y.LLILZ;
            List<C427720Gpu> list = c0h2y.LLILZIL;
            C434640H2o c434640H2o = c0h2y.LLILZLL;
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c0h2y, 1254);
            C0H2U c0h2u = C0H2W.LLILZLL;
            TuxTextView tuxTextView = c0h2w.LLILLJJLI;
            C427760Gpy c427760Gpy = c0h2w.LLILLL;
            boolean zLIZ = C07C0.LIZ();
            c0h2u.getClass();
            C0H2U.LIZIZ(tuxTextView, c427760Gpy, str, i, i2, list, zLIZ);
            C427760Gpy c427760Gpy2 = c0h2w.LLILLL;
            if (c427760Gpy2 != null) {
                int i3 = i2 + 1;
                if (i == i3) {
                    i2 = i3;
                }
                Integer num = c0h2w.LLILZIL;
                if (num != null && num.intValue() != i2) {
                    num.intValue();
                    HandlerHook.viewPost(c427760Gpy2, new ARunnableS106S0100000_6((Object) c427760Gpy2, 227));
                }
                c0h2w.LLILZIL = Integer.valueOf(i2);
            }
            if (c434640H2o != null) {
                C786410Ut5.I7(new AkS25S0300000_6(c434640H2o, awS550S0100000_6, c0h2w, 2), c0h2w);
            }
        }
    }
}
