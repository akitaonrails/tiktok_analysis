package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03B0;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C098200Yq;
import X.C0H9H;
import X.C1308910kAL;
import X.C13LE;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A0V;
import X.C1A0Z;
import X.C21714919yd;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C7878035w;
import X.C814420VxA;
import X.C958103op;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
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
public final class OspTextSpecCell extends ECPowerCell<C1A0Z> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OspTextSpecCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.apq;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.19z7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 53), 6);
    }

    public OspTextSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 137);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(48);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 835), awS576S0100000_32, AFwS224S0000000_33.get$arr$(131), new AwS577S0100000_33((C03K6) this, 811), new AwS577S0100000_33((C03K6) this, 813), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 815), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 817), null, new AwS577S0100000_33((C03K6) this, 818));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 812);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 814);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 816);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 30));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 819);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 820);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 821);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 822);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 823);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS576S0100000_32, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 824), awS576S0100000_32, AFwS224S0000000_33.get$arr$(132), new AwS577S0100000_33((C03K6) this, 825), new AwS577S0100000_33((C03K6) this, 826), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 827), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 828), null, new AwS577S0100000_33((C03K6) this, 829));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 830), awS576S0100000_32, AFwS224S0000000_33.get$arr$(133), new AwS577S0100000_33((C03K6) this, 831), new AwS577S0100000_33((C03K6) this, 832), new AwS577S0100000_33((C03K6) this, 833), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 834));
        }
        this.LLJ = assemVMLazy;
    }

    public final void L5() {
        try {
            ((TuxTextView) this.itemView.findViewById(R.id.cid)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.cic)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.jsh)).setTextColorRes(R.attr.a1p);
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.vsz);
            frameLayout.getBackground().mutate().setAlpha(frameLayout.getBackground().getAlpha() / 3);
            C786410Ut5.I7(new AjS15S0000000_33(4), this.itemView);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        int i2;
        int i3;
        C1A0Z c1a0z = (C1A0Z) interfaceC1891350zJl;
        super.onBindItemView(c1a0z);
        C21714919yd c21714919yd = c1a0z.LLIZ;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.cid);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.cic);
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.jsh);
        View viewFindViewById = this.itemView.findViewById(R.id.vsz);
        C1A0V c1a0v = c1a0z.LLIZLLLIL;
        C786410Ut5.I7(new AjS23S0300000_33(c1a0v, this, c1a0z, 5), this.itemView);
        if (c1a0v != null) {
            c1a0v.LJJLIIIJ(getLayoutPosition(), this);
        }
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxTextView.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (c1a0z.LLILZLL != null) {
            C03B0 c03b0 = new C03B0(tuxTextView, "combined_sku_purchase_method_view");
            C03B0.LIZ(c03b0, c1a0z.LLILZLL, null, null, false, null, null, 126);
            tuxTextView.setText(c03b0.LIZJ);
        } else {
            tuxTextView.setText(c1a0z.LL);
        }
        if (c1a0z.LLILLJJLI != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView2);
            tuxTextView2.setText(c1a0z.LLILLJJLI);
            i = 71;
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
            tuxTextView.setTuxFont(71);
        } else {
            i = 71;
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            tuxTextView.setTuxFont(71);
        }
        C0H9H.LIZLLL(C0H9H.LIZIZ(12), viewFindViewById);
        if (c1a0z.LLILZ) {
            if (c1a0z.LLILLL) {
                c21714919yd.getClass();
                i2 = R.drawable.b4g;
            } else {
                c21714919yd.getClass();
                i2 = R.drawable.b4e;
            }
        } else if (c1a0z.LLILLL) {
            c21714919yd.getClass();
            i2 = R.drawable.b4f;
        } else {
            c21714919yd.getClass();
            i2 = R.drawable.b4d;
        }
        viewFindViewById.setBackgroundResource(i2);
        tuxTextView.getPaint().setFlags(0);
        if (c1a0z.LLILZ) {
            if (c1a0z.LLILLL) {
                Context context = this.itemView.getContext();
                c21714919yd.getClass();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    tuxTextView.setTextColor(iIntValue);
                    tuxTextView2.setTextColor(iIntValue);
                }
                tuxTextView2.setTuxFont(72);
            } else {
                Context context2 = this.itemView.getContext();
                c21714919yd.getClass();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, context2);
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    tuxTextView.setTextColor(iIntValue2);
                    tuxTextView2.setTextColor(iIntValue2);
                }
                tuxTextView.getPaint().setFlags(16);
                tuxTextView.getPaint().setAntiAlias(true);
                tuxTextView2.setTuxFont(i);
            }
            i3 = 16;
        } else {
            if (c1a0z.LLILLL) {
                Context context3 = this.itemView.getContext();
                c21714919yd.getClass();
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context3);
                if (numLIZJ3 != null) {
                    int iIntValue3 = numLIZJ3.intValue();
                    tuxTextView.setTextColor(iIntValue3);
                    tuxTextView2.setTextColor(iIntValue3);
                }
                i3 = 16;
            } else {
                Context context4 = this.itemView.getContext();
                c21714919yd.getClass();
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, context4);
                if (numLIZJ4 != null) {
                    int iIntValue4 = numLIZJ4.intValue();
                    tuxTextView.setTextColor(iIntValue4);
                    tuxTextView2.setTextColor(iIntValue4);
                }
                i3 = 16;
                tuxTextView.getPaint().setFlags(16);
                tuxTextView.getPaint().setAntiAlias(true);
            }
            tuxTextView2.setTuxFont(i);
        }
        int iLIZLLL = (C958103op.LIZLLL() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3))) * 2);
        if (iLIZLLL > 0) {
            tuxTextView.setMaxWidth(iLIZLLL);
        }
        C7878035w c7878035w = C7878035w.LIZ;
        Context context5 = this.itemView.getContext();
        SalePropTag salePropTag = c1a0z.LLILZIL;
        int paddingTop = viewFindViewById.getPaddingTop();
        int paddingRight = viewFindViewById.getPaddingRight();
        c21714919yd.getClass();
        int iLIZIZ = C0H9H.LIZIZ(8);
        int iLIZIZ2 = C0H9H.LIZIZ(4);
        c7878035w.getClass();
        C7878035w.LIZ(context5, tuxTextView3, salePropTag, paddingTop, paddingRight, iLIZIZ, iLIZIZ2);
        if (this.LLILLL) {
            L5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.apq, viewGroup, false);
    }
}
