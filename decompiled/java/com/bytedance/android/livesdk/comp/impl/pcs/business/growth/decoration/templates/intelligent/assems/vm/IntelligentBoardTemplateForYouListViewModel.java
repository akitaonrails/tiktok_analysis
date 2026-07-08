package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C1161920gLG;
import X.C1218790hoz;
import X.C14KS;
import X.C1559260qg8;
import X.C1815230xKz;
import X.C1815280xL4;
import X.C1815390xLF;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C323380Cm0;
import X.C326170CqV;
import X.C326180CqW;
import X.C452501pT;
import X.C627660Ojc;
import X.EnumC1815220xKy;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC971680bOQ;
import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.IntelligentBoardTemplateForYouPageAbility;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public class IntelligentBoardTemplateForYouListViewModel extends AssemListViewModel<C326170CqV, InterfaceC1891350zJl, Long> {
    public final IntelligentBoardTemplateForYouPageAbility LL;
    public int LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public boolean LLJI;
    public final InterfaceC971680bOQ LLJILJILJ;
    public long LLJILLL;
    public final C01GW LLJJ;
    public final int LLJJI;
    public int LLIZ = 5;
    public boolean LLIZLLLIL = true;
    public int LLJ = -1;
    public final SparseBooleanArray LLJIJIL = new SparseBooleanArray();
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1218790hoz.class, (Class<Object>) null, (String) 13), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C326170CqV(0);
    }

    public IntelligentBoardTemplateForYouListViewModel(IntelligentBoardTemplateForYouPageAbility intelligentBoardTemplateForYouPageAbility) {
        this.LL = intelligentBoardTemplateForYouPageAbility;
        this.LLJILJILJ = C1815390xLF.LIZ() ? ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).Eu1() : null;
        this.LLJJ = C452501pT.LIZIZ(new C1815280xL4());
        this.LLJJI = C14KS.LJFF();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new C326180CqW(c627660Ojc));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return vQ2(this.LLILZLL, 5, EnumC1815220xKy.REFRESH_RESULT, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel.xQ2(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(int r20) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel.yQ2(int):void");
    }

    public final void zQ2(long j) {
        if (0 <= j && j < 5) {
            this.LLILZIL = 0L;
            this.LLIZ = (int) j;
        } else {
            this.LLILZIL = j - ((long) 5);
            this.LLIZ = 5;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadLatest(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        long jLongValue = l.longValue();
        if (!this.LLJI) {
            int i = this.LLIZ;
            if (i > 0) {
                this.LLJI = true;
                return vQ2(jLongValue, i, EnumC1815220xKy.LOAD_LATEST_RESULT, interfaceC1364105Vn);
            }
        }
        C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
        CancellationException cancellationException = new CancellationException();
        c317290CcB.getClass();
        return new C316650Cb9(cancellationException);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return vQ2(l.longValue(), 5, EnumC1815220xKy.LOAD_MORE_RESULT, interfaceC1364105Vn);
    }

    public final AbstractC316870CbV<Long> wQ2(long j, EnumC1815220xKy enumC1815220xKy, List<? extends InterfaceC1891350zJl> list) {
        Long lValueOf;
        int i = C1815230xKz.LIZ[enumC1815220xKy.ordinal()];
        Long lValueOf2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    AbstractC316870CbV.LIZ.getClass();
                    return new C316640Cb8(list);
                }
                this.LLJ += list.size();
                if (this.LLIZ > 0) {
                    zQ2(j);
                    return C317290CcB.LJ(AbstractC316870CbV.LIZ, Long.valueOf(this.LLILZIL), null, list, 2);
                }
                AbstractC316870CbV.LIZ.getClass();
                return new C316640Cb8(list);
            }
            if (this.LLIZLLLIL) {
                long j2 = j + ((long) 5);
                this.LLILZLL = j2;
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Long.valueOf(j2), list, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(list);
        }
        if (this.LLIZLLLIL) {
            long j3 = ((long) 5) + j;
            this.LLILZLL = j3;
            lValueOf = Long.valueOf(j3);
        } else {
            lValueOf = null;
        }
        if (this.LLIZ > 0) {
            zQ2(j);
            lValueOf2 = Long.valueOf(this.LLILZIL);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C323380Cm0(lValueOf2, lValueOf, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(long r21, int r23, X.EnumC1815220xKy r24, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r25) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel.vQ2(long, int, X.0xKy, X.05Vn):java.lang.Object");
    }
}
