package com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel;

import X.C01GW;
import X.C05P0;
import X.C0Q7K;
import X.C20028913Yh;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS25S0001000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoCardUIVM extends AssemViewModel<C0Q7K> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(284));
    public final C05P0<Boolean> LLILLJJLI;
    public final C05P0<Boolean> LLILLL;
    public final Map<String, String> LLILZ;

    static {
        new Object() { // from class: X.0Q7I
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

            static {
                C2217401BqU c2217401BqU = new C2217401BqU(C0Q7I.class, "vm", "<v#0>", 0);
                C13LE.LIZ.getClass();
                LIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
            }
        };
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0Q7K(0);
    }

    public SearchTakoCardUIVM() {
        Boolean bool = Boolean.FALSE;
        this.LLILLJJLI = C20028913Yh.LJI(bool);
        this.LLILLL = C20028913Yh.LJI(bool);
        this.LLILZ = new LinkedHashMap();
    }

    public final void vQ2(int i) {
        setState(new AwS25S0001000_10(i, 1));
    }
}
