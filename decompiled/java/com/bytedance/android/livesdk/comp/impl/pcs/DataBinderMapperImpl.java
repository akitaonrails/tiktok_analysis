package com.bytedance.android.livesdk.comp.impl.pcs;

import X.AbstractC1823860xYu;
import X.AbstractC1823870xYv;
import X.AbstractC1824130xZL;
import X.AbstractC1824180xZQ;
import X.AbstractC1824560xa2;
import X.AbstractC1824710xaH;
import X.AbstractC1824790xaP;
import X.AbstractC1824800xaQ;
import X.AbstractC1824810xaR;
import X.AbstractC1824840xaU;
import X.AbstractC1825240xb8;
import X.AbstractC1825270xbB;
import X.AbstractC1825370xbL;
import X.AbstractC1833260xo4;
import X.AbstractC1833280xo6;
import X.AbstractC1833290xo7;
import X.AbstractC1833300xo8;
import X.AbstractC1833320xoA;
import X.AbstractC1842050y2F;
import X.AbstractC2256381DTg;
import X.C03GW;
import X.C1DU6;
import X.C1DU7;
import X.C1DU8;
import X.C1DU9;
import X.C2188811AlT;
import X.C2256441DTm;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class DataBinderMapperImpl extends AbstractC1842050y2F {
    public static final SparseIntArray LIZ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(24);
        LIZ = sparseIntArray;
        sparseIntArray.put(R.layout.fyp, 1);
        sparseIntArray.put(R.layout.fyq, 2);
        sparseIntArray.put(R.layout.fyr, 3);
        sparseIntArray.put(R.layout.fys, 4);
        sparseIntArray.put(R.layout.gko, 5);
        sparseIntArray.put(R.layout.gkp, 6);
        sparseIntArray.put(R.layout.gkq, 7);
        sparseIntArray.put(R.layout.gkr, 8);
        sparseIntArray.put(R.layout.gks, 9);
        sparseIntArray.put(R.layout.gkt, 10);
        sparseIntArray.put(R.layout.gku, 11);
        sparseIntArray.put(R.layout.gtf, 12);
        sparseIntArray.put(R.layout.gtg, 13);
        sparseIntArray.put(R.layout.gti, 14);
        sparseIntArray.put(R.layout.gtj, 15);
        sparseIntArray.put(R.layout.gtk, 16);
        sparseIntArray.put(R.layout.gtl, 17);
        sparseIntArray.put(R.layout.gtm, 18);
        sparseIntArray.put(R.layout.h3a, 19);
        sparseIntArray.put(R.layout.h3b, 20);
        sparseIntArray.put(R.layout.h3c, 21);
        sparseIntArray.put(R.layout.h3d, 22);
        sparseIntArray.put(R.layout.h3e, 23);
        sparseIntArray.put(R.layout.hud, 24);
    }

    @Override // X.AbstractC1842050y2F
    public final List<AbstractC1842050y2F> LIZ() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // X.AbstractC1842050y2F
    public final ViewDataBinding LIZIZ(final C03GW c03gw, final View view, int i) {
        int i2 = LIZ.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case 1:
                        if ("layout/ttlive_assem_pcs_onboarding_front_a_0".equals(tag)) {
                            return new AbstractC1825270xbB(view, c03gw) { // from class: X.1DTq
                                public static final SparseIntArray LLJLLIL;
                                public long LLJLL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJLL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJLL = 8L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJLLIL = sparseIntArray;
                                    sparseIntArray.put(R.id.ki6, 2);
                                    sparseIntArray.put(R.id.ki5, 3);
                                    sparseIntArray.put(R.id.bnu, 4);
                                    sparseIntArray.put(R.id.y80, 5);
                                    sparseIntArray.put(R.id.tv_title, 6);
                                    sparseIntArray.put(R.id.nx8, 7);
                                    sparseIntArray.put(R.id.jxe, 8);
                                    sparseIntArray.put(R.id.title, 9);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[PHI: r9
                                  0x006c: PHI (r9v1 boolean) = (r9v0 boolean), (r9v3 boolean) binds: [B:24:0x0046, B:26:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
                                @Override // androidx.databinding.ViewDataBinding
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LIZLLL() {
                                    /*
                                        r17 = this;
                                        r6 = r17
                                        monitor-enter(r6)
                                        long r4 = r6.LLJLL     // Catch: java.lang.Throwable -> L7c
                                        r2 = 0
                                        r6.LLJLL = r2     // Catch: java.lang.Throwable -> L7c
                                        monitor-exit(r6)     // Catch: java.lang.Throwable -> L7c
                                        com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM r12 = r6.LLJLIL
                                        r15 = 15
                                        long r7 = r4 & r15
                                        int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                                        r13 = 32
                                        r10 = 0
                                        r9 = 0
                                        if (r0 == 0) goto L7a
                                        if (r12 == 0) goto L78
                                        androidx.databinding.ObservableBoolean r1 = r12.LLJI
                                    L1c:
                                        X.1DTO r0 = androidx.databinding.ViewDataBinding.LLJJIII
                                        r6.LJIILL(r9, r1, r0)
                                        if (r1 == 0) goto L73
                                        boolean r11 = r1.get()
                                        if (r11 == 0) goto L74
                                        long r4 = r4 | r13
                                    L2a:
                                        long r7 = r4 & r13
                                        int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                                        if (r0 == 0) goto L71
                                        if (r12 == 0) goto L6f
                                        androidx.databinding.ObservableBoolean r7 = r12.LLJ
                                    L34:
                                        X.1DTO r1 = androidx.databinding.ViewDataBinding.LLJJIII
                                        r0 = 1
                                        r6.LJIILL(r0, r7, r1)
                                        if (r7 == 0) goto L71
                                        boolean r1 = r7.get()
                                    L40:
                                        long r7 = r4 & r15
                                        int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                                        if (r0 == 0) goto L5d
                                        if (r11 == 0) goto L6c
                                        r9 = r1
                                        if (r1 == 0) goto L6c
                                        r0 = 128(0x80, double:6.3E-322)
                                    L4d:
                                        long r4 = r4 | r0
                                        X.16F5 r0 = r6.LLJJJJ
                                        android.content.res.Resources r1 = r0.getResources()
                                        if (r9 == 0) goto L68
                                        r0 = 2131856155(0x7f118b1b, float:1.9346034E38)
                                    L59:
                                        java.lang.String r10 = r1.getString(r0)
                                    L5d:
                                        long r4 = r4 & r15
                                        int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                                        if (r0 == 0) goto L67
                                        X.16F5 r0 = r6.LLJJJJ
                                        X.C946603my.LIZ(r0, r10)
                                    L67:
                                        return
                                    L68:
                                        r0 = 2131855958(0x7f118a56, float:1.9345634E38)
                                        goto L59
                                    L6c:
                                        r0 = 64
                                        goto L4d
                                    L6f:
                                        r7 = r10
                                        goto L34
                                    L71:
                                        r1 = 0
                                        goto L40
                                    L73:
                                        r11 = 0
                                    L74:
                                        r0 = 16
                                        long r4 = r4 | r0
                                        goto L2a
                                    L78:
                                        r1 = r10
                                        goto L1c
                                    L7a:
                                        r11 = 0
                                        goto L2a
                                    L7c:
                                        r0 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7c
                                        monitor-exit(r6)     // Catch: java.lang.Throwable -> L7c
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C2256481DTq.LIZLLL():void");
                                }

                                @Override // X.AbstractC1825270xbB
                                public final void LJIILLIIL(PcsOnboardingVM pcsOnboardingVM) {
                                    this.LLJLIL = pcsOnboardingVM;
                                    synchronized (this) {
                                        try {
                                            this.LLJLL |= 4;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(4);
                                    LJIILIIL();
                                }

                                public final boolean LJIIZILJ(int i3) {
                                    if (i3 == 0) {
                                        synchronized (this) {
                                            try {
                                                this.LLJLL |= 2;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        }
                                        return true;
                                    }
                                    return false;
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 10, null, LLJLLIL);
                                    super(c03gw, view, (C1324720kZq) objArrLJIIIZ[4], (C16F5) objArrLJIIIZ[1], (C1324720kZq) objArrLJIIIZ[8], (C1324720kZq) objArrLJIIIZ[7], (C16F5) objArrLJIIIZ[9], (C1324720kZq) objArrLJIIIZ[5], (TuxTextView) objArrLJIIIZ[6]);
                                    this.LLJLL = -1L;
                                    this.LLJJJJ.setTag(null);
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    if (i3 != 0) {
                                        if (i3 != 1) {
                                            return false;
                                        }
                                        return LJIIZILJ(i4);
                                    }
                                    if (i4 != 0) {
                                        return false;
                                    }
                                    synchronized (this) {
                                        try {
                                            this.LLJLL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                            };
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The tag for ttlive_assem_pcs_onboarding_front_a is invalid. Received: ");
                        sbLIZ.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    case 2:
                        if ("layout/ttlive_assem_pcs_onboarding_front_b_0".equals(tag)) {
                            return new AbstractC1825240xb8(view, c03gw) { // from class: X.1DTp
                                public static final SparseIntArray LLJLILLLLZIIL;
                                public long LLJLIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJLIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJLIL = 8L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJLILLLLZIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.bvg, 2);
                                    sparseIntArray.put(R.id.utt, 3);
                                    sparseIntArray.put(R.id.title, 4);
                                    sparseIntArray.put(R.id.jxf, 5);
                                    sparseIntArray.put(R.id.wlr, 6);
                                    sparseIntArray.put(R.id.fm6, 7);
                                    sparseIntArray.put(R.id.jxi, 8);
                                    sparseIntArray.put(R.id.wls, 9);
                                    sparseIntArray.put(R.id.fm7, 10);
                                    sparseIntArray.put(R.id.jxj, 11);
                                    sparseIntArray.put(R.id.wlt, 12);
                                    sparseIntArray.put(R.id.fm8, 13);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
                                /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
                                @Override // androidx.databinding.ViewDataBinding
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LIZLLL() {
                                    /*
                                        r17 = this;
                                        r10 = r17
                                        monitor-enter(r10)
                                        long r4 = r10.LLJLIL     // Catch: java.lang.Throwable -> L6b
                                        r2 = 0
                                        r10.LLJLIL = r2     // Catch: java.lang.Throwable -> L6b
                                        monitor-exit(r10)     // Catch: java.lang.Throwable -> L6b
                                        com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM r12 = r10.LLJJLIIIJLLLLLLLZ
                                        r15 = 15
                                        long r6 = r4 & r15
                                        int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                                        r13 = 128(0x80, double:6.3E-322)
                                        r8 = 0
                                        r9 = 0
                                        if (r0 == 0) goto L69
                                        if (r12 == 0) goto L67
                                        androidx.databinding.ObservableBoolean r1 = r12.LLJI
                                    L1c:
                                        X.1DTO r0 = androidx.databinding.ViewDataBinding.LLJJIII
                                        r10.LJIILL(r9, r1, r0)
                                        if (r1 == 0) goto L62
                                        boolean r11 = r1.get()
                                        if (r11 == 0) goto L63
                                        long r4 = r4 | r13
                                    L2a:
                                        long r6 = r4 & r13
                                        int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                                        if (r0 == 0) goto L60
                                        if (r12 == 0) goto L34
                                        androidx.databinding.ObservableBoolean r8 = r12.LLJ
                                    L34:
                                        X.1DTO r1 = androidx.databinding.ViewDataBinding.LLJJIII
                                        r0 = 1
                                        r10.LJIILL(r0, r8, r1)
                                        if (r8 == 0) goto L60
                                        boolean r8 = r8.get()
                                    L40:
                                        long r6 = r4 & r15
                                        int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                                        if (r0 == 0) goto L51
                                        if (r11 == 0) goto L5c
                                        if (r8 == 0) goto L5d
                                        r0 = 32
                                    L4c:
                                        long r4 = r4 | r0
                                        if (r8 != 0) goto L51
                                        r9 = 8
                                    L51:
                                        long r4 = r4 & r15
                                        int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                                        if (r0 == 0) goto L5b
                                        X.16F5 r0 = r10.LLJJL
                                        X.C786410Ut5.LLJJJJ(r0, r9)
                                    L5b:
                                        return
                                    L5c:
                                        r8 = 0
                                    L5d:
                                        r0 = 16
                                        goto L4c
                                    L60:
                                        r8 = 0
                                        goto L40
                                    L62:
                                        r11 = 0
                                    L63:
                                        r0 = 64
                                        long r4 = r4 | r0
                                        goto L2a
                                    L67:
                                        r1 = r8
                                        goto L1c
                                    L69:
                                        r11 = 0
                                        goto L2a
                                    L6b:
                                        r0 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
                                        monitor-exit(r10)     // Catch: java.lang.Throwable -> L6b
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C2256471DTp.LIZLLL():void");
                                }

                                @Override // X.AbstractC1825240xb8
                                public final void LJIILLIIL(PcsOnboardingVM pcsOnboardingVM) {
                                    this.LLJJLIIIJLLLLLLLZ = pcsOnboardingVM;
                                    synchronized (this) {
                                        try {
                                            this.LLJLIL |= 4;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(4);
                                    LJIILIIL();
                                }

                                public final boolean LJIIZILJ(int i3) {
                                    if (i3 == 0) {
                                        synchronized (this) {
                                            try {
                                                this.LLJLIL |= 2;
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            }
                                        }
                                        return true;
                                    }
                                    return false;
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 14, null, LLJLILLLLZIIL);
                                    super(c03gw, view, (C1324720kZq) objArrLJIIIZ[5], (C1324720kZq) objArrLJIIIZ[8], (C1324720kZq) objArrLJIIIZ[11], (C16F5) objArrLJIIIZ[4], (C16F5) objArrLJIIIZ[1]);
                                    this.LLJLIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    this.LLJJL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    if (i3 != 0) {
                                        if (i3 != 1) {
                                            return false;
                                        }
                                        return LJIIZILJ(i4);
                                    }
                                    if (i4 != 0) {
                                        return false;
                                    }
                                    synchronized (this) {
                                        try {
                                            this.LLJLIL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                            };
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("The tag for ttlive_assem_pcs_onboarding_front_b is invalid. Received: ");
                        sbLIZ2.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    case 3:
                        if ("layout/ttlive_assem_pcs_onboarding_multi_sku_0".equals(tag)) {
                            return new AbstractC1825370xbL(view, c03gw) { // from class: X.1DTz
                                public static final SparseIntArray LLJJJJLIIL;
                                public long LLJJJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJLIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.txh, 1);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 2, null, LLJJJJLIIL);
                                    super(c03gw, view, (RecyclerView) objArrLJIIIZ[1]);
                                    this.LLJJJJJIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("The tag for ttlive_assem_pcs_onboarding_multi_sku is invalid. Received: ");
                        sbLIZ3.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                    case 4:
                        if ("layout/ttlive_assem_pcs_onboarding_showcase_0".equals(tag)) {
                            return new AbstractC1824710xaH(view, c03gw) { // from class: X.1DTr
                                public static final SparseIntArray LLJZIJLIL;
                                public long LLJZ;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJZ = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJZ != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJZ = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJZIJLIL = sparseIntArray;
                                    sparseIntArray.put(R.id.bnu, 1);
                                    sparseIntArray.put(R.id.eog, 2);
                                    sparseIntArray.put(R.id.ozz, 3);
                                    sparseIntArray.put(R.id.cad, 4);
                                    sparseIntArray.put(R.id.title, 5);
                                    sparseIntArray.put(R.id.wlq, 6);
                                    sparseIntArray.put(R.id.amb, 7);
                                    sparseIntArray.put(R.id.ama, 8);
                                    sparseIntArray.put(R.id.m3w, 9);
                                    sparseIntArray.put(R.id.l9h, 10);
                                    sparseIntArray.put(R.id.l_f, 11);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 12, null, LLJZIJLIL);
                                    super(c03gw, view, (TuxTextView) objArrLJIIIZ[8], (C0HZQ) objArrLJIIIZ[7], (View) objArrLJIIIZ[1], (C1295960jpS) objArrLJIIIZ[2], (C1324720kZq) objArrLJIIIZ[10], (C1324720kZq) objArrLJIIIZ[11], (ConstraintLayout) objArrLJIIIZ[9], (C1835860xsG) objArrLJIIIZ[3], (ConstraintLayout) objArrLJIIIZ[0], (TuxTextView) objArrLJIIIZ[6], (TuxTextView) objArrLJIIIZ[5]);
                                    this.LLJZ = -1L;
                                    this.LLJLILLLLZIIL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("The tag for ttlive_assem_pcs_onboarding_showcase is invalid. Received: ");
                        sbLIZ4.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                    case 5:
                        if ("layout/ttlive_fragment_pcs_onboarding_front_0".equals(tag)) {
                            return new AbstractC2256381DTg(view, c03gw) { // from class: X.1DTf
                                public static final SparseIntArray LLJJJJLIIL;
                                public long LLJJJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    ViewDataBinding viewDataBinding = this.LLJJJJ.LIZ;
                                    if (viewDataBinding != null) {
                                        viewDataBinding.LJ();
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJLIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.in1, 1);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 2, null, LLJJJJLIIL);
                                    super(c03gw, view, (FrameLayout) objArrLJIIIZ[0], new C1DTY((ViewStub) objArrLJIIIZ[1]));
                                    this.LLJJJJJIL = -1L;
                                    this.LLJJJIL.setTag(null);
                                    this.LLJJJJ.LIZJ = this;
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("The tag for ttlive_fragment_pcs_onboarding_front is invalid. Received: ");
                        sbLIZ5.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
                    case 6:
                        if ("layout/ttlive_fragment_pcs_onboarding_host_0".equals(tag)) {
                            return new C1DU8(view, c03gw) { // from class: X.1DU3
                                public static final SparseIntArray LLJJJJ;
                                public long LLJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJ = sparseIntArray;
                                    sparseIntArray.put(R.id.drj, 1);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    new ViewDataBinding(c03gw, view) { // from class: X.1DU8
                                    };
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 2, null, LLJJJJ);
                                    this.LLJJJIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("The tag for ttlive_fragment_pcs_onboarding_host is invalid. Received: ");
                        sbLIZ6.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                    case 7:
                        if ("layout/ttlive_fragment_pcs_onboarding_identity_0".equals(tag)) {
                            return new AbstractC1824130xZL(view, c03gw) { // from class: X.1DTo
                                public static final SparseIntArray LLJJJJLIIL;
                                public long LLJJJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJLIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.tv_title, 1);
                                    sparseIntArray.put(R.id.tvn, 2);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 3, null, LLJJJJLIIL);
                                    super(c03gw, view, (RecyclerView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[1]);
                                    this.LLJJJJJIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("The tag for ttlive_fragment_pcs_onboarding_identity is invalid. Received: ");
                        sbLIZ7.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ7));
                    case 8:
                        if ("layout/ttlive_fragment_pcs_onboarding_intro_0".equals(tag)) {
                            return new AbstractC1824560xa2(view, c03gw) { // from class: X.1DU0
                                public static final SparseIntArray LLJJJJLIIL;
                                public long LLJJJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJLIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.ll6, 1);
                                    sparseIntArray.put(R.id.tv_title, 2);
                                    sparseIntArray.put(R.id.tv_placeholder, 3);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 4, null, LLJJJJLIIL);
                                    super(c03gw, view, (C1324720kZq) objArrLJIIIZ[1], (C0I7D) objArrLJIIIZ[3]);
                                    this.LLJJJJJIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("The tag for ttlive_fragment_pcs_onboarding_intro is invalid. Received: ");
                        sbLIZ8.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ8));
                    case BdTuring.TYPE_ECAF /* 9 */:
                        if ("layout/ttlive_fragment_pcs_onboarding_kyb_0".equals(tag)) {
                            return new C1DU9(view, c03gw) { // from class: X.1DU4
                                public long LLJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    new ViewDataBinding(view, c03gw) { // from class: X.1DU9
                                    };
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 1, null, null);
                                    this.LLJJJIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("The tag for ttlive_fragment_pcs_onboarding_kyb is invalid. Received: ");
                        sbLIZ9.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ9));
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        if ("layout/ttlive_fragment_pcs_onboarding_result_0".equals(tag)) {
                            return new AbstractC1823870xYv(view, c03gw) { // from class: X.1DTw
                                public static final SparseIntArray LLJJL;
                                public long LLJJJJLIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJLIIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJL = sparseIntArray;
                                    sparseIntArray.put(R.id.ozz, 1);
                                    sparseIntArray.put(R.id.tv_showcase_title, 2);
                                    sparseIntArray.put(R.id.tv_showcase_subtitle, 3);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 4, null, LLJJL);
                                    super(c03gw, view, (C1835860xsG) objArrLJIIIZ[1], (TuxTextView) objArrLJIIIZ[3], (TuxTextView) objArrLJIIIZ[2]);
                                    this.LLJJJJLIIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("The tag for ttlive_fragment_pcs_onboarding_result is invalid. Received: ");
                        sbLIZ10.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ10));
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        if ("layout/ttlive_fragment_pcs_onboarding_showcase_container_0".equals(tag)) {
                            return new C1DU6(view, c03gw) { // from class: X.1DTx
                                public static final SparseIntArray LLJJL;
                                public long LLJJJJLIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJLIIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJL = sparseIntArray;
                                    sparseIntArray.put(R.id.eul, 1);
                                    sparseIntArray.put(R.id.nlc, 2);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 3, null, LLJJL);
                                    super(c03gw, view, (FrameLayout) objArrLJIIIZ[1], (FrameLayout) objArrLJIIIZ[2], (ConstraintLayout) objArrLJIIIZ[0]);
                                    this.LLJJJJLIIL = -1L;
                                    this.LLJJJJJIL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("The tag for ttlive_fragment_pcs_onboarding_showcase_container is invalid. Received: ");
                        sbLIZ11.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ11));
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        if ("layout/ttlive_item_pcs_form_field_0".equals(tag)) {
                            return new C1DU7(view, c03gw) { // from class: X.1DU2
                                public static final SparseIntArray LLJJJJJIL;
                                public long LLJJJJ;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJ = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJ != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJ = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJJIL = sparseIntArray;
                                    sparseIntArray.put(R.id.zlv, 1);
                                    sparseIntArray.put(R.id.view_input_field, 2);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 3, null, LLJJJJJIL);
                                    final View view2 = (View) objArrLJIIIZ[2];
                                    new ViewDataBinding(c03gw, view, view2) { // from class: X.1DU7
                                        public final View LLJJJIL;

                                        {
                                            this.LLJJJIL = view2;
                                        }
                                    };
                                    this.LLJJJJ = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("The tag for ttlive_item_pcs_form_field is invalid. Received: ");
                        sbLIZ12.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ12));
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        if ("layout/ttlive_item_pcs_identity_option_0".equals(tag)) {
                            return new AbstractC1824180xZQ(view, c03gw) { // from class: X.1DTn
                                public static final SparseIntArray LLJJL;
                                public long LLJJJJLIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJLIIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJL = sparseIntArray;
                                    sparseIntArray.put(R.id.ll6, 1);
                                    sparseIntArray.put(R.id.zq9, 2);
                                    sparseIntArray.put(R.id.z8m, 3);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 4, null, LLJJL);
                                    super(c03gw, view, (C1324720kZq) objArrLJIIIZ[1], (TuxTextView) objArrLJIIIZ[3], (TuxTextView) objArrLJIIIZ[2]);
                                    this.LLJJJJLIIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append("The tag for ttlive_item_pcs_identity_option is invalid. Received: ");
                        sbLIZ13.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ13));
                    case 14:
                        if ("layout/ttlive_item_pcs_onboarding_booking_0".equals(tag)) {
                            return new AbstractC1833260xo4(view, c03gw) { // from class: X.1DTs
                                public static final SparseIntArray LLJJLIIIJLLLLLLLZ;
                                public long LLJJL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJLIIIJLLLLLLLZ = sparseIntArray;
                                    sparseIntArray.put(R.id.es3, 1);
                                    sparseIntArray.put(R.id.ly6, 2);
                                    sparseIntArray.put(R.id.tv_tool_title, 3);
                                    sparseIntArray.put(R.id.djy, 4);
                                    sparseIntArray.put(R.id.tv_tool_description, 5);
                                    sparseIntArray.put(R.id.lam, 6);
                                    sparseIntArray.put(R.id.zxw, 7);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 8, null, LLJJLIIIJLLLLLLLZ);
                                    super(c03gw, view, (C0HZQ) objArrLJIIIZ[4], (ConstraintLayout) objArrLJIIIZ[0], (C1324720kZq) objArrLJIIIZ[6], (C1324720kZq) objArrLJIIIZ[2]);
                                    this.LLJJL = -1L;
                                    this.LLJJJJ.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                        sbLIZ14.append("The tag for ttlive_item_pcs_onboarding_booking is invalid. Received: ");
                        sbLIZ14.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ14));
                    case 15:
                        if ("layout/ttlive_item_pcs_onboarding_course_0".equals(tag)) {
                            return new AbstractC1833300xo8(view, c03gw) { // from class: X.1DTt
                                public static final SparseIntArray LLJJJJLIIL;
                                public long LLJJJJJIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJJIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJJIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJJJLIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.es3, 1);
                                    sparseIntArray.put(R.id.ly6, 2);
                                    sparseIntArray.put(R.id.tv_tool_title, 3);
                                    sparseIntArray.put(R.id.djy, 4);
                                    sparseIntArray.put(R.id.tv_tool_description, 5);
                                    sparseIntArray.put(R.id.lkw, 6);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 7, null, LLJJJJLIIL);
                                    super(c03gw, view, (C0HZQ) objArrLJIIIZ[4], (C1324720kZq) objArrLJIIIZ[6]);
                                    this.LLJJJJJIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                        sbLIZ15.append("The tag for ttlive_item_pcs_onboarding_course is invalid. Received: ");
                        sbLIZ15.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ15));
                    case 16:
                        if ("layout/ttlive_item_pcs_onboarding_dm_0".equals(tag)) {
                            return new AbstractC1833280xo6(view, c03gw) { // from class: X.1DTu
                                public static final SparseIntArray LLJJL;
                                public long LLJJJJLIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJLIIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJL = sparseIntArray;
                                    sparseIntArray.put(R.id.es3, 1);
                                    sparseIntArray.put(R.id.ly6, 2);
                                    sparseIntArray.put(R.id.tv_tool_title, 3);
                                    sparseIntArray.put(R.id.djy, 4);
                                    sparseIntArray.put(R.id.tv_tool_description, 5);
                                    sparseIntArray.put(R.id.zxf, 6);
                                    sparseIntArray.put(R.id.zxh, 7);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 8, null, LLJJL);
                                    super(c03gw, view, (C0HZQ) objArrLJIIIZ[4], (FrameLayout) objArrLJIIIZ[6], (FrameLayout) objArrLJIIIZ[7]);
                                    this.LLJJJJLIIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                        sbLIZ16.append("The tag for ttlive_item_pcs_onboarding_dm is invalid. Received: ");
                        sbLIZ16.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ16));
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        if ("layout/ttlive_item_pcs_onboarding_form_0".equals(tag)) {
                            return new AbstractC1833290xo7(view, c03gw) { // from class: X.1DTv
                                public static final SparseIntArray LLJJL;
                                public long LLJJJJLIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJLIIL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJL = sparseIntArray;
                                    sparseIntArray.put(R.id.es3, 1);
                                    sparseIntArray.put(R.id.ly6, 2);
                                    sparseIntArray.put(R.id.tv_tool_title, 3);
                                    sparseIntArray.put(R.id.djy, 4);
                                    sparseIntArray.put(R.id.tv_tool_description, 5);
                                    sparseIntArray.put(R.id.lkw, 6);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 7, null, LLJJL);
                                    super(c03gw, view, (C0HZQ) objArrLJIIIZ[4], (C1324720kZq) objArrLJIIIZ[6], (C1324720kZq) objArrLJIIIZ[2]);
                                    this.LLJJJJLIIL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                        sbLIZ17.append("The tag for ttlive_item_pcs_onboarding_form is invalid. Received: ");
                        sbLIZ17.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ17));
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        if ("layout/ttlive_item_pcs_onboarding_header_0".equals(tag)) {
                            return new AbstractC1833320xoA(view, c03gw) { // from class: X.1DTh
                                public long LLJJJJ;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJ = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJJJJ != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJ = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                {
                                    super(c03gw, view, (TuxTextView) ViewDataBinding.LJIIIZ(c03gw, view, 1, null, null)[0]);
                                    this.LLJJJJ = -1L;
                                    this.LLJJJIL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                        sbLIZ18.append("The tag for ttlive_item_pcs_onboarding_header is invalid. Received: ");
                        sbLIZ18.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ18));
                    case 19:
                        if ("layout/ttlive_layout_pcs_onboarding_form_0".equals(tag)) {
                            return new AbstractC1824840xaU(view, c03gw) { // from class: X.1DTi
                                public static final C1DTZ LLJJL;
                                public static final SparseIntArray LLJJLIIIJLLLLLLLZ;
                                public long LLJJJJLIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJ();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            if (this.LLJJJJLIIL != 0) {
                                                return true;
                                            }
                                            return this.LLJJJIL.LJI();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL = 2L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJII();
                                    LJIILIIL();
                                }

                                static {
                                    C1DTZ c1dtz = new C1DTZ(4);
                                    LLJJL = c1dtz;
                                    c1dtz.LIZ(new int[]{1}, new int[]{R.layout.h3b}, new String[]{"ttlive_layout_pcs_onboarding_header"});
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJJLIIIJLLLLLLLZ = sparseIntArray;
                                    sparseIntArray.put(R.id.title, 2);
                                    sparseIntArray.put(R.id.tvg, 3);
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
                                    super.LJIILJJIL(lifecycleOwner);
                                    this.LLJJJIL.LJIILJJIL(lifecycleOwner);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 4, LLJJL, LLJJLIIIJLLLLLLLZ);
                                    super(c03gw, view, (AbstractC1824980xai) objArrLJIIIZ[1], (RecyclerView) objArrLJIIIZ[3], (TuxTextView) objArrLJIIIZ[2]);
                                    this.LLJJJJLIIL = -1L;
                                    AbstractC1824980xai abstractC1824980xai = this.LLJJJIL;
                                    if (abstractC1824980xai != null) {
                                        abstractC1824980xai.LLJIJIL = this;
                                    }
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    if (i3 != 0 || i4 != 0) {
                                        return false;
                                    }
                                    synchronized (this) {
                                        try {
                                            this.LLJJJJLIIL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                            };
                        }
                        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                        sbLIZ19.append("The tag for ttlive_layout_pcs_onboarding_form is invalid. Received: ");
                        sbLIZ19.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ19));
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        if ("layout/ttlive_layout_pcs_onboarding_header_0".equals(tag)) {
                            return new C2256441DTm(c03gw, new View[]{view});
                        }
                        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
                        sbLIZ20.append("The tag for ttlive_layout_pcs_onboarding_header is invalid. Received: ");
                        sbLIZ20.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ20));
                    case 21:
                        if ("layout/ttlive_layout_pcs_onboarding_profile_0".equals(tag)) {
                            return new AbstractC1824800xaQ(view, c03gw) { // from class: X.1DTk
                                public static final C1DTZ LLJJLIIIJLLLLLLLZ;
                                public static final SparseIntArray LLJL;
                                public long LLJJL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJ();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            if (this.LLJJL != 0) {
                                                return true;
                                            }
                                            return this.LLJJJIL.LJI();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJL = 2L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJII();
                                    LJIILIIL();
                                }

                                static {
                                    C1DTZ c1dtz = new C1DTZ(5);
                                    LLJJLIIIJLLLLLLLZ = c1dtz;
                                    c1dtz.LIZ(new int[]{1}, new int[]{R.layout.h3b}, new String[]{"ttlive_layout_pcs_onboarding_header"});
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJL = sparseIntArray;
                                    sparseIntArray.put(R.id.s08, 2);
                                    sparseIntArray.put(R.id.title, 3);
                                    sparseIntArray.put(R.id.wlq, 4);
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
                                    super.LJIILJJIL(lifecycleOwner);
                                    this.LLJJJIL.LJIILJJIL(lifecycleOwner);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 5, LLJJLIIIJLLLLLLLZ, LLJL);
                                    super(c03gw, view, (AbstractC1824980xai) objArrLJIIIZ[1], (C1324720kZq) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[4], (TuxTextView) objArrLJIIIZ[3]);
                                    this.LLJJL = -1L;
                                    AbstractC1824980xai abstractC1824980xai = this.LLJJJIL;
                                    if (abstractC1824980xai != null) {
                                        abstractC1824980xai.LLJIJIL = this;
                                    }
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    if (i3 != 0 || i4 != 0) {
                                        return false;
                                    }
                                    synchronized (this) {
                                        try {
                                            this.LLJJL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                            };
                        }
                        StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                        sbLIZ21.append("The tag for ttlive_layout_pcs_onboarding_profile is invalid. Received: ");
                        sbLIZ21.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ21));
                    case 22:
                        if ("layout/ttlive_layout_pcs_onboarding_suggested_questions_0".equals(tag)) {
                            return new AbstractC1824810xaR(view, c03gw) { // from class: X.1DTj
                                public static final C1DTZ LLJJLIIIJLLLLLLLZ;
                                public static final SparseIntArray LLJL;
                                public long LLJJL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJ();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            if (this.LLJJL != 0) {
                                                return true;
                                            }
                                            return this.LLJJJIL.LJI();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJL = 2L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJII();
                                    LJIILIIL();
                                }

                                static {
                                    C1DTZ c1dtz = new C1DTZ(5);
                                    LLJJLIIIJLLLLLLLZ = c1dtz;
                                    c1dtz.LIZ(new int[]{1}, new int[]{R.layout.h3b}, new String[]{"ttlive_layout_pcs_onboarding_header"});
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJL = sparseIntArray;
                                    sparseIntArray.put(R.id.title, 2);
                                    sparseIntArray.put(R.id.wlq, 3);
                                    sparseIntArray.put(R.id.tx_, 4);
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
                                    super.LJIILJJIL(lifecycleOwner);
                                    this.LLJJJIL.LJIILJJIL(lifecycleOwner);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 5, LLJJLIIIJLLLLLLLZ, LLJL);
                                    super(c03gw, view, (AbstractC1824980xai) objArrLJIIIZ[1], (RecyclerView) objArrLJIIIZ[4], (TuxTextView) objArrLJIIIZ[3], (TuxTextView) objArrLJIIIZ[2]);
                                    this.LLJJL = -1L;
                                    AbstractC1824980xai abstractC1824980xai = this.LLJJJIL;
                                    if (abstractC1824980xai != null) {
                                        abstractC1824980xai.LLJIJIL = this;
                                    }
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    if (i3 != 0 || i4 != 0) {
                                        return false;
                                    }
                                    synchronized (this) {
                                        try {
                                            this.LLJJL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                            };
                        }
                        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                        sbLIZ22.append("The tag for ttlive_layout_pcs_onboarding_suggested_questions is invalid. Received: ");
                        sbLIZ22.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ22));
                    case 23:
                        if ("layout/ttlive_layout_pcs_onboarding_welcome_message_0".equals(tag)) {
                            return new AbstractC1824790xaP(view, c03gw) { // from class: X.1DTl
                                public static final C1DTZ LLJL;
                                public static final SparseIntArray LLJLIL;
                                public long LLJJLIIIJLLLLLLLZ;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJLIIIJLLLLLLLZ = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJ();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            if (this.LLJJLIIIJLLLLLLLZ != 0) {
                                                return true;
                                            }
                                            return this.LLJJJIL.LJI();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJJLIIIJLLLLLLLZ = 2L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    this.LLJJJIL.LJII();
                                    LJIILIIL();
                                }

                                static {
                                    C1DTZ c1dtz = new C1DTZ(7);
                                    LLJL = c1dtz;
                                    c1dtz.LIZ(new int[]{1}, new int[]{R.layout.h3b}, new String[]{"ttlive_layout_pcs_onboarding_header"});
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJLIL = sparseIntArray;
                                    sparseIntArray.put(R.id.title, 2);
                                    sparseIntArray.put(R.id.dp3, 3);
                                    sparseIntArray.put(R.id.s08, 4);
                                    sparseIntArray.put(R.id.zxb, 5);
                                    sparseIntArray.put(R.id.lah, 6);
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJIILJJIL(LifecycleOwner lifecycleOwner) {
                                    super.LJIILJJIL(lifecycleOwner);
                                    this.LLJJJIL.LJIILJJIL(lifecycleOwner);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 7, LLJL, LLJLIL);
                                    super(c03gw, view, (AbstractC1824980xai) objArrLJIIIZ[1], (C1324720kZq) objArrLJIIIZ[6], (C1324720kZq) objArrLJIIIZ[4], (TuxTextView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[5]);
                                    this.LLJJLIIIJLLLLLLLZ = -1L;
                                    AbstractC1824980xai abstractC1824980xai = this.LLJJJIL;
                                    if (abstractC1824980xai != null) {
                                        abstractC1824980xai.LLJIJIL = this;
                                    }
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    if (i3 != 0 || i4 != 0) {
                                        return false;
                                    }
                                    synchronized (this) {
                                        try {
                                            this.LLJJLIIIJLLLLLLLZ |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    return true;
                                }
                            };
                        }
                        StringBuilder sbLIZ23 = C2188811AlT.LIZ();
                        sbLIZ23.append("The tag for ttlive_layout_pcs_onboarding_welcome_message is invalid. Received: ");
                        sbLIZ23.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ23));
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        if ("layout/ttlive_view_pcs_service_card_0".equals(tag)) {
                            return new AbstractC1823860xYu(view, c03gw) { // from class: X.1DU1
                                public static final SparseIntArray LLJLIL;
                                public long LLJL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    synchronized (this) {
                                        try {
                                            this.LLJL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJL != 0;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LJII() {
                                    synchronized (this) {
                                        try {
                                            this.LLJL = 1L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    LJIILIIL();
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJIIJJI(int i3, int i4, Object obj) {
                                    return false;
                                }

                                static {
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    LLJLIL = sparseIntArray;
                                    sparseIntArray.put(R.id.lar, 1);
                                    sparseIntArray.put(R.id.ru6, 2);
                                    sparseIntArray.put(R.id.ui9, 3);
                                    sparseIntArray.put(R.id.u0p, 4);
                                    sparseIntArray.put(R.id.iiv, 5);
                                    sparseIntArray.put(R.id.j4d, 6);
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 7, null, LLJLIL);
                                    super(c03gw, view, (C20247014Ke) objArrLJIIIZ[5], (View) objArrLJIIIZ[6], (C1322110kVd) objArrLJIIIZ[1], (FrameLayout) objArrLJIIIZ[2], (C389590FPh) objArrLJIIIZ[4], (FrameLayout) objArrLJIIIZ[3]);
                                    this.LLJL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ24 = C2188811AlT.LIZ();
                        sbLIZ24.append("The tag for ttlive_view_pcs_service_card is invalid. Received: ");
                        sbLIZ24.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ24));
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // X.AbstractC1842050y2F
    public final ViewDataBinding LIZJ(C03GW c03gw, View[] viewArr, int i) {
        int i2;
        if (viewArr.length != 0 && (i2 = LIZ.get(i)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag != null) {
                if (i2 == 20) {
                    if ("layout/ttlive_layout_pcs_onboarding_header_0".equals(tag)) {
                        return new C2256441DTm(c03gw, viewArr);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("The tag for ttlive_layout_pcs_onboarding_header is invalid. Received: ");
                    sbLIZ.append(tag);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return null;
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
