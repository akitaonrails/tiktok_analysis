package com.ss.android.ugc.aweme.explore.vm;

import X.C0151002r;
import X.C15TA;
import X.EnumC1845820y8K;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreTabStateVM extends AssemViewModel<C0151002r> {
    public float LL;
    public long LLILLJJLI;
    public boolean LLILZ;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public AwS606S0100000_27 LLJ;
    public String LLJI;
    public String LLILLL = EnumC1845820y8K.OTHER.getValue();
    public Long LLILZIL = 0L;
    public String LLILZLL = "all";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0151002r(0);
    }

    public final void vQ2(long j) {
        EnumC1845820y8K enumC1845820y8K = EnumC1845820y8K.UNPIN;
        String value = enumC1845820y8K.getValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        Long l = this.LLILZIL;
        if (l != null && j == l.longValue()) {
            C15TA c15ta = C15TA.LIZ;
            Long l2 = this.LLILZIL;
            String str = this.LLILZLL;
            int i = this.LLIZ;
            String str2 = this.LLILLL;
            String value2 = enumC1845820y8K.getValue();
            c15ta.getClass();
            C15TA.LJII(i, jCurrentTimeMillis, l2, str, str2, value2);
            AwS606S0100000_27 awS606S0100000_27 = this.LLJ;
            if (awS606S0100000_27 != null) {
                awS606S0100000_27.invoke(this.LLILZIL);
            }
            C15TA.LJI(0, 0L, "all", value, false);
            this.LLILLL = value;
            this.LLILLJJLI = System.currentTimeMillis();
            this.LLILZIL = 0L;
            this.LLILZLL = "all";
            this.LLIZ = 0;
            this.LLIZLLLIL = false;
        }
    }
}
