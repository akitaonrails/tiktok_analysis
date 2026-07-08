package com.ss.android.ugc.aweme.mix.mixdetail;

import X.AbstractC21688119uJ;
import X.AbstractC329610Cw3;
import X.C01D1;
import X.C1167880gUs;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20607315kN;
import X.C20642515q3;
import X.C21688219uK;
import X.C2217381BqS;
import X.C259800zU;
import X.C338890DQh;
import X.C419910GdJ;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1163850gON;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS296S0300000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MixFeedManagerAssem extends UIContentAssem implements InterfaceC1163850gON {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public C21688219uK LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public String LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixFeedManagerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mix/mixdetail/viewmodel/MixVideosManageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = 8;
    }

    public MixFeedManagerAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixVideosManageViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 572), AFwS256S0000000_18.get$arr$(169), null, true);
    }

    @Override // X.InterfaceC1163850gON, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public final MixVideosManageViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (MixVideosManageViewModel) assemVMLazy.getValue();
    }

    public final String Go() {
        return this.LLJI;
    }

    public final void Jo(String str) {
        this.LLJI = str;
    }

    public final void Lo(C1749280vcc c1749280vcc) {
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJI = C786410Ut5.j4(C20642515q3.LJFF().getString(2131833900), Arrays.copyOf(new Object[]{Ho().LLILLL}, 1));
        c1722300uv6.LJIIIIZZ = c1749280vcc.getContext().getString(2131833899);
        c1749280vcc.setStatus(c1722300uv6);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0gUs, X.19uJ] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        final C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.oi2);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gOC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS296S0300000_18(viewOnAttachStateChangeListenerC20604515jv, c1749280vcc, this, 0), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gOD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS454S0200000_18(this, c1749280vcc, 6), 4);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(MixFeedManageCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jv.setHasFixedSize(true);
        viewOnAttachStateChangeListenerC20604515jv.LJIIL((AbstractC329610Cw3) Ho().LLIZ.getValue());
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C338890DQh());
        viewOnAttachStateChangeListenerC20604515jv.LJII(new C20607315kN() { // from class: X.0gOH
            @Override // X.C20607315kN
            public final void LJ(Exception exc) {
            }

            @Override // X.C20607315kN
            public final void LJI(boolean z) {
            }

            @Override // X.C20607315kN
            public final void LJFF() {
                C724240Sb0.LIZ(this);
            }

            @Override // X.C20607315kN
            public final void LJIIIIZZ() {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
                c1749280vcc.LJ();
            }

            @Override // X.C20607315kN
            public final void LJII(Exception exc) {
                C1389890mGx c1389890mGx = new C1389890mGx(c1749280vcc);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
                C1749280vcc c1749280vcc2 = c1749280vcc;
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                c1722300uv6.LJIIIIZZ = c1749280vcc.getContext().getString(2131848597);
                c1749280vcc2.setStatus(c1722300uv6);
            }

            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                if (viewOnAttachStateChangeListenerC20604515jv.getState().LJIIIIZZ() == 0) {
                    this.Lo(c1749280vcc);
                } else {
                    C786410Ut5.LLLZLZ(c1749280vcc, 8);
                }
            }
        });
        String str = Ho().LLILLJJLI;
        this.LLJI = str;
        if (str != null) {
            MixVideosManageViewModel mixVideosManageViewModelHo = Ho();
            mixVideosManageViewModelHo.LLILLJJLI = this.LLJI;
            ((PowerPageSource) mixVideosManageViewModelHo.LLIZ.getValue()).getOperator().refresh();
        }
        C259800zU c259800zU = new C259800zU();
        ?? c1167880gUs = new C1167880gUs(viewOnAttachStateChangeListenerC20604515jv, Ho(), false);
        c259800zU.element = c1167880gUs;
        C21688219uK c21688219uK = new C21688219uK(c1167880gUs);
        this.LLIZLLLIL = c21688219uK;
        c21688219uK.LJ(viewOnAttachStateChangeListenerC20604515jv);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0gOE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1163820gOK) obj).LLILZ;
            }
        }, null, new AwS632S0100000_18(c259800zU, (C259800zU<AbstractC21688119uJ>) 49), 6);
    }

    @Override // X.InterfaceC1163850gON
    public void z1(PowerCell<?> powerCell) {
        C21688219uK c21688219uK;
        if (powerCell != null && (c21688219uK = this.LLIZLLLIL) != null) {
            c21688219uK.LJIILLIIL(powerCell);
        }
    }
}
