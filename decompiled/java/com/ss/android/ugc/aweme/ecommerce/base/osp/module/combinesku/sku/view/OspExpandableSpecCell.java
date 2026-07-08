package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C042W;
import X.C098200Yq;
import X.C0H1U;
import X.C1308910kAL;
import X.C13LE;
import X.C189200o6;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1A0U;
import X.C1A0V;
import X.C21714919yd;
import X.C21715219yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS15S0000000_33;
import g1c.AjS23S0300000_33;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class OspExpandableSpecCell extends ECPowerCell<C1A0U> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OspExpandableSpecCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.apu;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.19z4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 49), 6);
    }

    public OspExpandableSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 134);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(44);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 710), awS576S0100000_32, AFwS224S0000000_33.get$arr$(119), new AwS577S0100000_33((C03K6) this, 711), new AwS577S0100000_33((C03K6) this, 713), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 715), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 717), null, new AwS577S0100000_33((C03K6) this, 718));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 712);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 714);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 716);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 26));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 719);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 720);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 721);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 722);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 723);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS576S0100000_32, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 724), awS576S0100000_32, AFwS224S0000000_33.get$arr$(120), new AwS577S0100000_33((C03K6) this, 725), new AwS577S0100000_33((C03K6) this, 726), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 727), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 728), null, new AwS577S0100000_33((C03K6) this, 729));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 730), awS576S0100000_32, AFwS224S0000000_33.get$arr$(121), new AwS577S0100000_33((C03K6) this, 731), new AwS577S0100000_33((C03K6) this, 732), new AwS577S0100000_33((C03K6) this, 733), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 734));
        }
        this.LLJ = assemVMLazy;
    }

    public final void L5() {
        try {
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.m5z);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, this.itemView.getContext());
            tuxIconView.setColorFilter(numLIZJ != null ? numLIZJ.intValue() : 0, PorterDuff.Mode.SRC_IN);
            ((TuxTextView) this.itemView.findViewById(R.id.m62)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.m61)).setTextColorRes(R.attr.a1p);
            TuxIconView tuxIconView2 = (TuxIconView) this.itemView.findViewById(R.id.c3b);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, this.itemView.getContext());
            tuxIconView2.setColorFilter(numLIZJ2 != null ? numLIZJ2.intValue() : 0, PorterDuff.Mode.SRC_IN);
            ((TuxTextView) this.itemView.findViewById(R.id.c3c)).setTextColorRes(R.attr.a1p);
            TuxIconView tuxIconView3 = (TuxIconView) this.itemView.findViewById(R.id.vlt);
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1p, this.itemView.getContext());
            tuxIconView3.setColorFilter(numLIZJ3 != null ? numLIZJ3.intValue() : 0, PorterDuff.Mode.SRC_IN);
            ((TuxTextView) this.itemView.findViewById(R.id.vlv)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.vlu)).setTextColorRes(R.attr.a1p);
            LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.m5y);
            linearLayout.getBackground().mutate().setAlpha(linearLayout.getBackground().getAlpha() / 3);
            C786410Ut5.I7(new AjS15S0000000_33(1), this.itemView);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        Context context;
        int i2;
        View viewFindViewById;
        TextView textView;
        TuxIconView tuxIconView;
        float fFloatValue;
        C1A0U c1a0u = (C1A0U) interfaceC1891350zJl;
        super.onBindItemView(c1a0u);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.m60);
        if (c1a0u.LLILLJJLI != C042W.NOT_EXPANDABLE) {
            C1A0V c1a0v = c1a0u.LLIZ;
            C786410Ut5.I7(new AjS23S0300000_33(c1a0v, this, c1a0u, 2), this.itemView);
            if (c1a0v != null) {
                c1a0v.LJJLIIIJ(getLayoutPosition(), this);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            C042W c042w = c1a0u.LLILLJJLI;
            C042W c042w2 = C042W.MORE;
            if (c042w == c042w2) {
                i = R.raw.icon_chevron_down_thin;
            } else {
                i = R.raw.icon_chevron_up_thin;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            if (c1a0u.LLILLJJLI == c042w2) {
                context = this.itemView.getContext();
                i2 = 2131833094;
            } else {
                context = this.itemView.getContext();
                i2 = 2131833095;
            }
            String string = context.getString(i2);
            int i3 = C21715219yg.LIZ[c1a0u.LLILLL.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        viewFindViewById = this.itemView.findViewById(R.id.vls);
                        textView = (TextView) this.itemView.findViewById(R.id.vlv);
                        tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.vlt);
                        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.vlu);
                        C03DZ.LIZ(this.itemView.findViewById(R.id.m5y));
                        C03DZ.LIZ(this.itemView.findViewById(R.id.c3a));
                        C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                        if (c1a0u.LLILZIL) {
                            C786410Ut5.LLLLZLL(tuxTextView, 4);
                            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    viewFindViewById = this.itemView.findViewById(R.id.c3a);
                    tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.c3b);
                    TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.c3c);
                    C03DZ.LIZ(this.itemView.findViewById(R.id.m5y));
                    C03DZ.LIZ(this.itemView.findViewById(R.id.vls));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                    if (c1a0u.LLILZIL) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 4);
                    }
                    textView = null;
                }
            } else {
                viewFindViewById = this.itemView.findViewById(R.id.m5y);
                textView = (TextView) this.itemView.findViewById(R.id.m62);
                tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.m5z);
                TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.m61);
                C03DZ.LIZ(this.itemView.findViewById(R.id.vls));
                C03DZ.LIZ(this.itemView.findViewById(R.id.c3a));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                if (c1a0u.LLILZIL) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 4);
                    C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewFindViewById);
                }
                c1a0u.LLILZLL.getClass();
                int iLIZ = C21714919yd.LIZ();
                c1a0u.LLILZLL.getClass();
                float f = iLIZ;
                Float f2 = c1a0u.LLILZ;
                if (f2 != null) {
                    fFloatValue = f2.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                int i4 = (int) (f * fFloatValue);
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                layoutParams.width = i4;
                layoutParams.height = iLIZ;
                C786410Ut5.M6(tuxIconView, layoutParams);
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                c1a0u.LLILZLL.getClass();
                layoutParams2.width = C21714919yd.LIZ();
                c1a0u.LLILZLL.getClass();
                layoutParams2.height = C21714919yd.LIZ();
                C786410Ut5.a6(frameLayout, layoutParams2);
            }
            c1a0u.LLILZLL.getClass();
            viewFindViewById.setBackgroundResource(R.drawable.b4f);
            if (textView != null) {
                textView.setText(string);
            }
            tuxIconView.setTuxIcon(c419910GdJ);
            C03DZ.LIZJ(viewFindViewById);
            if (this.LLILLL) {
                L5();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.apu, viewGroup, false);
    }
}
