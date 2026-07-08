package com.ss.android.ugc.aweme.ecommerce;

import X.AbstractC1076004Is;
import X.AbstractC1842050y2F;
import X.C03GW;
import X.C1076204Iu;
import X.C1DUD;
import X.C1DUE;
import X.C1DUH;
import X.C1DUI;
import X.C2188811AlT;
import X.C2256561DTy;
import X.C946203mu;
import X.C947103n3;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import m2b.b;
import ola.k;
import r4b.d;

/* JADX INFO: loaded from: classes36.dex */
public class DataBinderMapperImpl extends AbstractC1842050y2F {
    public static final SparseIntArray LIZ;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        LIZ = sparseIntArray;
        sparseIntArray.put(R.layout.an9, 1);
        sparseIntArray.put(R.layout.an_, 2);
        sparseIntArray.put(R.layout.aqt, 3);
        sparseIntArray.put(R.layout.arn, 4);
        sparseIntArray.put(R.layout.aso, 5);
        sparseIntArray.put(R.layout.au1, 6);
        sparseIntArray.put(R.layout.av2, 7);
        sparseIntArray.put(R.layout.avz, 8);
        sparseIntArray.put(R.layout.awz, 9);
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
                        if ("layout/commerce_input_form_0".equals(tag)) {
                            return new C946203mu(view, c03gw);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The tag for commerce_input_form is invalid. Received: ");
                        sbLIZ.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    case 2:
                        if ("layout/commerce_input_form_wrap_0".equals(tag)) {
                            return new C947103n3(view, c03gw);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("The tag for commerce_input_form_wrap is invalid. Received: ");
                        sbLIZ2.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                    case 3:
                        if ("layout/commerce_payment_method_view_0".equals(tag)) {
                            return new C1DUH(view, c03gw) { // from class: X.1DUF
                                public static final SparseIntArray LLJLILLLLZIIL;
                                public long LLJLIL;

                                /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
                                /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
                                @Override // androidx.databinding.ViewDataBinding
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LIZLLL() {
                                    /*
                                        r13 = this;
                                        monitor-enter(r13)
                                        long r6 = r13.LLJLIL     // Catch: java.lang.Throwable -> L5f
                                        r4 = 0
                                        r13.LLJLIL = r4     // Catch: java.lang.Throwable -> L5f
                                        monitor-exit(r13)     // Catch: java.lang.Throwable -> L5f
                                        ola.k r3 = r13.LLJJLIIIJLLLLLLLZ
                                        r11 = 3
                                        long r1 = r6 & r11
                                        int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                                        r8 = 0
                                        if (r0 == 0) goto L5a
                                        if (r3 == 0) goto L53
                                        boolean r10 = r3.LJL()
                                        int r9 = r3.LLIIZ()
                                        int r2 = r3.LJJJJ()
                                        int r3 = r3.LJLLI()
                                        if (r10 == 0) goto L57
                                        r0 = 8
                                    L29:
                                        long r6 = r6 | r0
                                        if (r10 == 0) goto L50
                                        r1 = 0
                                    L2d:
                                        long r6 = r6 & r11
                                        int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                                        if (r0 == 0) goto L4f
                                        com.bytedance.tux.icon.TuxIconView r0 = r13.LLJJJJ
                                        X.C786410Ut5.LLLLLLZZ(r0, r1)
                                        com.bytedance.lighten.loader.SmartImageView r1 = r13.LLJJJJJIL
                                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                                        r2 = 0
                                        X.C1076304Iv.LIZ(r1, r0, r2, r2)
                                        com.bytedance.tux.input.TuxTextView r1 = r13.LLJJJJLIIL
                                        java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                                        X.C1076304Iv.LIZ(r1, r0, r2, r2)
                                        com.bytedance.tux.input.TuxTextView r0 = r13.LLJJJJLIIL
                                        X.C1076504Ix.LIZ(r3, r8, r0)
                                    L4f:
                                        return
                                    L50:
                                        r1 = 8
                                        goto L2d
                                    L53:
                                        r3 = 0
                                        r10 = 0
                                        r9 = 0
                                        r2 = 0
                                    L57:
                                        r0 = 4
                                        goto L29
                                    L5a:
                                        r3 = 0
                                        r1 = 0
                                        r9 = 0
                                        r2 = 0
                                        goto L2d
                                    L5f:
                                        r0 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5f
                                        monitor-exit(r13)     // Catch: java.lang.Throwable -> L5f
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1DUF.LIZLLL():void");
                                }

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
                                            this.LLJLIL = 2L;
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
                                    LLJLILLLLZIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.i1w, 4);
                                    sparseIntArray.put(R.id.wge, 5);
                                    sparseIntArray.put(R.id.q4e, 6);
                                    sparseIntArray.put(R.id.juh, 7);
                                    sparseIntArray.put(R.id.jui, 8);
                                    sparseIntArray.put(R.id.cif, 9);
                                    sparseIntArray.put(R.id.k5c, 10);
                                    sparseIntArray.put(R.id.x19, 11);
                                    sparseIntArray.put(R.id.x0u, 12);
                                    sparseIntArray.put(R.id.z4s, 13);
                                    sparseIntArray.put(R.id.uts, 14);
                                    sparseIntArray.put(R.id.z5a, 15);
                                    sparseIntArray.put(R.id.hiq, 16);
                                    sparseIntArray.put(R.id.z2l, 17);
                                    sparseIntArray.put(R.id.z5c, 18);
                                    sparseIntArray.put(R.id.m85, 19);
                                    sparseIntArray.put(R.id.z26, 20);
                                    sparseIntArray.put(R.id.z5y, 21);
                                    sparseIntArray.put(R.id.z55, 22);
                                    sparseIntArray.put(R.id.z2j, 23);
                                    sparseIntArray.put(R.id.jxt, 24);
                                    sparseIntArray.put(R.id.iconEditSEA, 25);
                                    sparseIntArray.put(R.id.rightLayout, 26);
                                    sparseIntArray.put(R.id.sp_, 27);
                                    sparseIntArray.put(R.id.l5g, 28);
                                    sparseIntArray.put(R.id.z2i, 29);
                                    sparseIntArray.put(R.id.wsx, 30);
                                    sparseIntArray.put(R.id.wsy, 31);
                                    sparseIntArray.put(R.id.z2s, 32);
                                    sparseIntArray.put(R.id.ddy, 33);
                                    sparseIntArray.put(R.id.c1g, 34);
                                    sparseIntArray.put(R.id.ntk, 35);
                                }

                                @Override // X.C1DUH
                                public final void LJIILLIIL(k kVar) {
                                    this.LLJJLIIIJLLLLLLLZ = kVar;
                                    synchronized (this) {
                                        try {
                                            this.LLJLIL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(2);
                                    LJIILIIL();
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 36, null, LLJLILLLLZIIL);
                                    super(c03gw, view, (FrameLayout) objArrLJIIIZ[4], (TuxIconView) objArrLJIIIZ[1], (SmartImageView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[3], (ConstraintLayout) objArrLJIIIZ[0]);
                                    this.LLJLIL = -1L;
                                    this.LLJJJJ.setTag(null);
                                    this.LLJJJJJIL.setTag(null);
                                    this.LLJJJJLIIL.setTag(null);
                                    this.LLJJL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("The tag for commerce_payment_method_view is invalid. Received: ");
                        sbLIZ3.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
                    case 4:
                        if ("layout/commerce_pdp_creator_container_0".equals(tag)) {
                            return new C1DUD(view, c03gw) { // from class: X.1DUB
                                public static final SparseIntArray LLJLILLLLZIIL;
                                public long LLJLIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    long j;
                                    int iLJJJJI;
                                    int iLJLJLJ;
                                    int iLJLJJLL;
                                    synchronized (this) {
                                        try {
                                            j = this.LLJLIL;
                                            this.LLJLIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    d dVar = this.LLJJLIIIJLLLLLLLZ;
                                    long j2 = j & 3;
                                    if (j2 != 0) {
                                        if (dVar != null) {
                                            iLJJJJI = dVar.LJJJJI();
                                            iLJLJLJ = dVar.LJLJLJ();
                                            iLJLJJLL = dVar.LJLJJLL();
                                        } else {
                                            iLJJJJI = 0;
                                            iLJLJLJ = 0;
                                            iLJLJJLL = 0;
                                            if (j2 == 0) {
                                                return;
                                            }
                                        }
                                        C1076304Iv.LIZIZ(this.LLJJJJLIIL, null, Integer.valueOf(iLJLJJLL));
                                        C1076304Iv.LIZ(this.LLJJL, null, Integer.valueOf(iLJLJLJ), Integer.valueOf(iLJJJJI));
                                    }
                                }

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
                                            this.LLJLIL = 2L;
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
                                    LLJLILLLLZIIL = sparseIntArray;
                                    sparseIntArray.put(R.id.o1b, 3);
                                    sparseIntArray.put(R.id.f7w, 4);
                                    sparseIntArray.put(R.id.j48, 5);
                                    sparseIntArray.put(R.id.j4a, 6);
                                    sparseIntArray.put(R.id.j49, 7);
                                    sparseIntArray.put(R.id.f86, 8);
                                    sparseIntArray.put(R.id.ajk, 9);
                                    sparseIntArray.put(R.id.ajj, 10);
                                    sparseIntArray.put(R.id.ajl, 11);
                                    sparseIntArray.put(R.id.e26, 12);
                                }

                                @Override // X.C1DUD
                                public final void LJIILLIIL(d dVar) {
                                    this.LLJJLIIIJLLLLLLLZ = dVar;
                                    synchronized (this) {
                                        try {
                                            this.LLJLIL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(2);
                                    LJIILIIL();
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 13, null, LLJLILLLLZIIL);
                                    super(c03gw, view, (FrameLayout) objArrLJIIIZ[5], (C16G0) objArrLJIIIZ[0], (View) objArrLJIIIZ[3], (TuxTextView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[1]);
                                    this.LLJLIL = -1L;
                                    this.LLJJJJ.setTag(null);
                                    this.LLJJJJLIIL.setTag(null);
                                    this.LLJJL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("The tag for commerce_pdp_creator_container is invalid. Received: ");
                        sbLIZ4.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
                    case 5:
                        if ("layout/commerce_pdp_policies_item_0".equals(tag)) {
                            return new C1076204Iu(c03gw, new View[]{view});
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("The tag for commerce_pdp_policies_item is invalid. Received: ");
                        sbLIZ5.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ5));
                    case 6:
                        if ("layout/commerce_pdp_user_right_sheet_item_0".equals(tag)) {
                            return new C2256561DTy(c03gw, new View[]{view});
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("The tag for commerce_pdp_user_right_sheet_item is invalid. Received: ");
                        sbLIZ6.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ6));
                    case 7:
                        if ("layout/commerce_review_gallery_bottom_info_0".equals(tag)) {
                            return new C1DUI(view, c03gw) { // from class: X.1DUG
                                public static final SparseIntArray LLJLIL;
                                public long LLJL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    long j;
                                    int iLJJIJ;
                                    Integer numLJJIFFI;
                                    int iLJIILJJIL;
                                    int iLJIIIIZZ;
                                    int iLLIZ;
                                    int iLJJIJIIJIL;
                                    int iLLFII;
                                    int iLJII;
                                    int iLJIJ;
                                    synchronized (this) {
                                        try {
                                            j = this.LLJL;
                                            this.LLJL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    b bVar = this.LLJJL;
                                    long j2 = j & 3;
                                    if (j2 != 0) {
                                        if (bVar != null) {
                                            iLJJIJ = bVar.LJJIJ();
                                            iLJIILJJIL = bVar.LJIILJJIL();
                                            iLLIZ = bVar.LLIZ();
                                            iLJJIJIIJIL = bVar.LJJIJIIJIL();
                                            numLJJIFFI = bVar.LJJIFFI();
                                            iLLFII = bVar.LLFII();
                                            iLJII = bVar.LJII();
                                            iLJIJ = bVar.LJIJ();
                                            iLJIIIIZZ = bVar.LJIIIIZZ();
                                        } else {
                                            iLJJIJ = 0;
                                            numLJJIFFI = null;
                                            iLJIILJJIL = 0;
                                            iLJIIIIZZ = 0;
                                            iLLIZ = 0;
                                            iLJJIJIIJIL = 0;
                                            iLLFII = 0;
                                            iLJII = 0;
                                            iLJIJ = 0;
                                            if (j2 == 0) {
                                                return;
                                            }
                                        }
                                        C1076504Ix.LIZ(iLJIILJJIL, iLLFII, this.LLJJJIL);
                                        C1076304Iv.LIZ(this.LLJJJIL, null, Integer.valueOf(iLJII), null);
                                        C1076504Ix.LIZ(iLJJIJIIJIL, iLLIZ, this.LLJJJJ);
                                        C1076304Iv.LIZ(this.LLJJJJ, null, Integer.valueOf(iLJII), null);
                                        C1076504Ix.LIZ(iLJIILJJIL, iLLFII, this.LLJJJJJIL);
                                        C1076304Iv.LIZ(this.LLJJJJJIL, null, Integer.valueOf(iLJJIJ), null);
                                        C1076504Ix.LIZ(iLJIJ, iLJIIIIZZ, this.LLJJJJLIIL);
                                        C1076304Iv.LIZ(this.LLJJJJLIIL, numLJJIFFI, null, null);
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
                                            this.LLJL = 2L;
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
                                    sparseIntArray.put(R.id.jdd, 5);
                                    sparseIntArray.put(R.id.jcb, 6);
                                    sparseIntArray.put(R.id.jbl, 7);
                                    sparseIntArray.put(R.id.bkz, 8);
                                    sparseIntArray.put(R.id.srx, 9);
                                    sparseIntArray.put(R.id.mn0, 10);
                                    sparseIntArray.put(R.id.mnh, 11);
                                    sparseIntArray.put(R.id.yj9, 12);
                                }

                                @Override // X.C1DUI
                                public final void LJIILLIIL(b bVar) {
                                    this.LLJJL = bVar;
                                    synchronized (this) {
                                        try {
                                            this.LLJL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(2);
                                    LJIILIIL();
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 13, null, LLJLIL);
                                    super(c03gw, view, (TuxTextView) objArrLJIIIZ[3], (TuxTextView) objArrLJIIIZ[4], (TuxTextView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[1]);
                                    this.LLJL = -1L;
                                    ((View) objArrLJIIIZ[0]).setTag(null);
                                    this.LLJJJIL.setTag(null);
                                    this.LLJJJJ.setTag(null);
                                    this.LLJJJJJIL.setTag(null);
                                    this.LLJJJJLIIL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("The tag for commerce_review_gallery_bottom_info is invalid. Received: ");
                        sbLIZ7.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ7));
                    case 8:
                        if ("layout/commerce_sea_pdp_creator_container_0".equals(tag)) {
                            return new C1DUE(view, c03gw) { // from class: X.1DUC
                                public static final SparseIntArray LLJLL;
                                public long LLJLILLLLZIIL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    long j;
                                    int iLJJJJI;
                                    int iLJLJLJ;
                                    int iLJLJJLL;
                                    synchronized (this) {
                                        try {
                                            j = this.LLJLILLLLZIIL;
                                            this.LLJLILLLLZIIL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    d dVar = this.LLJL;
                                    long j2 = j & 3;
                                    if (j2 != 0) {
                                        if (dVar != null) {
                                            iLJJJJI = dVar.LJJJJI();
                                            iLJLJLJ = dVar.LJLJLJ();
                                            iLJLJJLL = dVar.LJLJJLL();
                                        } else {
                                            iLJJJJI = 0;
                                            iLJLJLJ = 0;
                                            iLJLJJLL = 0;
                                            if (j2 == 0) {
                                                return;
                                            }
                                        }
                                        C1076304Iv.LIZIZ(this.LLJJL, null, Integer.valueOf(iLJLJJLL));
                                        C1076304Iv.LIZ(this.LLJJLIIIJLLLLLLLZ, null, Integer.valueOf(iLJLJLJ), Integer.valueOf(iLJJJJI));
                                    }
                                }

                                @Override // androidx.databinding.ViewDataBinding
                                public final boolean LJI() {
                                    synchronized (this) {
                                        try {
                                            return this.LLJLILLLLZIIL != 0;
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
                                            this.LLJLILLLLZIIL = 2L;
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
                                    LLJLL = sparseIntArray;
                                    sparseIntArray.put(R.id.o1b, 3);
                                    sparseIntArray.put(R.id.uxz, 4);
                                    sparseIntArray.put(R.id.f7w, 5);
                                    sparseIntArray.put(R.id.j48, 6);
                                    sparseIntArray.put(R.id.j4a, 7);
                                    sparseIntArray.put(R.id.j49, 8);
                                    sparseIntArray.put(R.id.f86, 9);
                                    sparseIntArray.put(R.id.ajk, 10);
                                    sparseIntArray.put(R.id.ajj, 11);
                                    sparseIntArray.put(R.id.ajl, 12);
                                    sparseIntArray.put(R.id.e26, 13);
                                }

                                @Override // X.C1DUE
                                public final void LJIILLIIL(d dVar) {
                                    this.LLJL = dVar;
                                    synchronized (this) {
                                        try {
                                            this.LLJLILLLLZIIL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(2);
                                    LJIILIIL();
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 14, null, LLJLL);
                                    super(c03gw, view, (FrameLayout) objArrLJIIIZ[6], (C16G0) objArrLJIIIZ[0], (View) objArrLJIIIZ[3], (View) objArrLJIIIZ[4], (TuxTextView) objArrLJIIIZ[2], (TuxTextView) objArrLJIIIZ[1]);
                                    this.LLJLILLLLZIIL = -1L;
                                    this.LLJJJJ.setTag(null);
                                    this.LLJJL.setTag(null);
                                    this.LLJJLIIIJLLLLLLLZ.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("The tag for commerce_sea_pdp_creator_container is invalid. Received: ");
                        sbLIZ8.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ8));
                    case BdTuring.TYPE_ECAF /* 9 */:
                        if ("layout/commerce_sea_pdp_review_cell_0".equals(tag)) {
                            return new AbstractC1076004Is(view, c03gw) { // from class: X.04It
                                public static final SparseIntArray LLJLIL;
                                public long LLJL;

                                @Override // androidx.databinding.ViewDataBinding
                                public final void LIZLLL() {
                                    long j;
                                    int iLIZIZ;
                                    int iLJII;
                                    synchronized (this) {
                                        try {
                                            j = this.LLJL;
                                            this.LLJL = 0L;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    InterfaceC1075904Ir interfaceC1075904Ir = this.LLJJL;
                                    long j2 = j & 3;
                                    if (j2 != 0) {
                                        if (interfaceC1075904Ir != null) {
                                            iLIZIZ = interfaceC1075904Ir.LIZIZ();
                                            iLJII = interfaceC1075904Ir.LJII();
                                        } else {
                                            iLIZIZ = 0;
                                            iLJII = 0;
                                            if (j2 == 0) {
                                                return;
                                            }
                                        }
                                        C1076304Iv.LIZ(this.LLJJJIL, null, Integer.valueOf(iLJII), null);
                                        C1076304Iv.LIZIZ(this.LLJJJJJIL, Integer.valueOf(iLIZIZ), null);
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
                                            this.LLJL = 2L;
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
                                    sparseIntArray.put(R.id.tgk, 1);
                                    sparseIntArray.put(R.id.eup, 2);
                                    sparseIntArray.put(R.id.xy_, 3);
                                    sparseIntArray.put(R.id.bt5, 4);
                                }

                                @Override // X.AbstractC1076004Is
                                public final void LJIILLIIL(C1075404Im c1075404Im) {
                                    this.LLJJL = c1075404Im;
                                    synchronized (this) {
                                        try {
                                            this.LLJL |= 1;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            throw th;
                                        }
                                    }
                                    notifyPropertyChanged(2);
                                    LJIILIIL();
                                }

                                /* JADX WARN: Illegal instructions before constructor call */
                                {
                                    Object[] objArrLJIIIZ = ViewDataBinding.LJIIIZ(c03gw, view, 5, null, LLJLIL);
                                    super(c03gw, view, (View) objArrLJIIIZ[2], (View) objArrLJIIIZ[1], (ConstraintLayout) objArrLJIIIZ[0], (View) objArrLJIIIZ[3]);
                                    this.LLJL = -1L;
                                    this.LLJJJJJIL.setTag(null);
                                    view.setTag(R.id.ffn, this);
                                    LJII();
                                }
                            };
                        }
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append("The tag for commerce_sea_pdp_review_cell is invalid. Received: ");
                        sbLIZ9.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ9));
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
                if (i2 != 5) {
                    if (i2 == 6) {
                        if ("layout/commerce_pdp_user_right_sheet_item_0".equals(tag)) {
                            return new C2256561DTy(c03gw, viewArr);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The tag for commerce_pdp_user_right_sheet_item is invalid. Received: ");
                        sbLIZ.append(tag);
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    return null;
                }
                if ("layout/commerce_pdp_policies_item_0".equals(tag)) {
                    return new C1076204Iu(c03gw, viewArr);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("The tag for commerce_pdp_policies_item is invalid. Received: ");
                sbLIZ2.append(tag);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
