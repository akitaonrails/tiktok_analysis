package com.ss.android.ugc.aweme.im.viewmodel;

import X.AnonymousClass0951;
import X.C05YD;
import X.C05YW;
import X.C05YZ;
import X.C09IC;
import X.C0I0B;
import X.C1370905Yd;
import X.C1619980sG4;
import X.C1630106Zv;
import X.C1AF0;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C447810HhD;
import X.C458660Hyi;
import X.C458720Hyo;
import X.C458770Hyt;
import X.C463000IDq;
import X.C463090IDz;
import X.C894660Z7w;
import X.InterfaceC0148002o;
import X.InterfaceC1628806Zi;
import X.InterfaceC441960HUs;
import X.InterfaceC456120Huc;
import X.InterfaceC458730Hyp;
import X.InterfaceC497601wk;
import android.animation.ValueAnimator;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.assem.BasePanelAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PanelStateViewModel extends AssemViewModel<InterfaceC0148002o> implements InterfaceC441960HUs, InterfaceC1628806Zi {
    public final int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public ValueAnimator LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public final C2252321DDq LLJI;

    @Override // X.InterfaceC441960HUs
    public final void UK2() {
    }

    @Override // X.InterfaceC1628806Zi
    public final boolean Ld() {
        return this.LLIZ.getValue() instanceof C447810HhD;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(17);
    }

    public PanelStateViewModel() {
        int dimensionPixelSize;
        C0I0B.LJFF.LIZJ();
        try {
            dimensionPixelSize = C894660Z7w.LIZ().getResources().getDimensionPixelSize(R.dimen.a2f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            dimensionPixelSize = 0;
        }
        this.LL = dimensionPixelSize;
        this.LLILLJJLI = C458720Hyo.LIZ(dimensionPixelSize);
        this.LLILLL = Integer.MAX_VALUE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1630106Zv(0));
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = c2252321DDqLIZ;
        C463000IDq c463000IDq = new C463000IDq(c2252321DDqLIZ, 32);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C05YW.LIZ.getClass();
        C05YZ c05yz = C1370905Yd.LIZIZ;
        this.LLIZ = C09IC.LJJIJIL(c463000IDq, viewModelScope, c05yz, ((C1630106Zv) c2252321DDqLIZ.getValue()).LIZ);
        this.LLIZLLLIL = C09IC.LJJIJIL(new C463000IDq(c2252321DDqLIZ, 33), ViewModelKt.getViewModelScope(this), c05yz, Integer.valueOf(((C1630106Zv) c2252321DDqLIZ.getValue()).LIZIZ));
        this.LLJ = C09IC.LJJIJIL(new C463000IDq(c2252321DDqLIZ, 34), ViewModelKt.getViewModelScope(this), c05yz, Integer.valueOf(((C1630106Zv) c2252321DDqLIZ.getValue()).LIZJ));
        C09IC.LJJIJIL(new C463000IDq(c2252321DDqLIZ, 35), ViewModelKt.getViewModelScope(this), c05yz, Integer.valueOf(((C1630106Zv) c2252321DDqLIZ.getValue()).LIZLLL));
        this.LLJI = C1BNE.LIZ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C458660Hyi(this, null), 3);
    }

    @Override // X.InterfaceC441960HUs
    public final C05YD<Integer> Ke() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC441960HUs, X.InterfaceC1628806Zi
    public final C05YD<InterfaceC456120Huc> getPanelType() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC441960HUs, X.InterfaceC1628806Zi
    public final void jt(final InterfaceC456120Huc interfaceC456120Huc, final int i) {
        if (Intrinsics.LJFF(interfaceC456120Huc, ((C1630106Zv) this.LLILZIL.getValue()).LIZ) && (i < 0 || i == ((C1630106Zv) this.LLILZIL.getValue()).LIZJ)) {
            return;
        }
        if (interfaceC456120Huc instanceof InterfaceC458730Hyp) {
            i = ((InterfaceC458730Hyp) interfaceC456120Huc).LJIIJJI().LIZ(i, new C458770Hyt(this.LL, this.LLILLJJLI, this.LLILLL));
        } else if (interfaceC456120Huc instanceof C447810HhD) {
            int i2 = C458720Hyo.LIZ;
            if (i > 0 && C458720Hyo.LIZ != i) {
                C458720Hyo.LIZIZ.storeInt("last_keyboard_height", i);
                C458720Hyo.LIZ = i;
            }
            this.LLILLJJLI = i;
        } else {
            i = ((Number) this.LLJI.getValue()).intValue();
        }
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int iIntValue = ((Number) this.LLIZLLLIL.getValue()).intValue();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, i);
        BasePanelAssem.LLJJIII.getClass();
        valueAnimatorOfInt.setDuration(BasePanelAssem.LLJJIJIIJIL);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Hyj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Object value;
                float animatedFraction;
                int iIntValue2 = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                C2252321DDq c2252321DDq = this.LL.LLILZIL;
                InterfaceC456120Huc interfaceC456120Huc2 = interfaceC456120Huc;
                int i3 = i;
                int i4 = iIntValue;
                do {
                    value = c2252321DDq.getValue();
                    animatedFraction = valueAnimator2.getAnimatedFraction();
                    value.getClass();
                } while (!c2252321DDq.compareAndSet(value, new C1630106Zv(interfaceC456120Huc2, iIntValue2, i3, i4, animatedFraction)));
            }
        });
        this.LLILZ = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public final void vQ2(InterfaceC456120Huc interfaceC456120Huc, int i) {
        Object value;
        int iIntValue;
        int iIntValue2 = i;
        if (interfaceC456120Huc instanceof InterfaceC458730Hyp) {
            iIntValue2 = ((InterfaceC458730Hyp) interfaceC456120Huc).LJIIJJI().LIZ(iIntValue2, new C458770Hyt(this.LL, this.LLILLJJLI, this.LLILLL));
        } else if (interfaceC456120Huc instanceof C447810HhD) {
            int i2 = C458720Hyo.LIZ;
            if (iIntValue2 > 0 && C458720Hyo.LIZ != iIntValue2) {
                C458720Hyo.LIZIZ.storeInt("last_keyboard_height", iIntValue2);
                C458720Hyo.LIZ = iIntValue2;
            }
        } else {
            iIntValue2 = ((Number) this.LLJI.getValue()).intValue();
        }
        ValueAnimator valueAnimator = this.LLILZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C2252321DDq c2252321DDq = this.LLILZIL;
        do {
            value = c2252321DDq.getValue();
            iIntValue = ((Number) this.LLIZLLLIL.getValue()).intValue();
            value.getClass();
        } while (!c2252321DDq.compareAndSet(value, new C1630106Zv(interfaceC456120Huc, iIntValue2, iIntValue2, iIntValue, 1.0f)));
    }
}
