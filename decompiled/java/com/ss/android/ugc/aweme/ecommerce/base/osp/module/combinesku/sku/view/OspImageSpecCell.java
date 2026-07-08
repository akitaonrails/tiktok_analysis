package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C098200Yq;
import X.C0GRZ;
import X.C0H9H;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LE;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A0V;
import X.C1A0Y;
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
import X.EnumC1338240kve;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
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
public final class OspImageSpecCell extends ECPowerCell<C1A0Y> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OspImageSpecCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.apr;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.19z5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 50), 6);
    }

    public OspImageSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 135);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(45);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 759), awS576S0100000_32, AFwS224S0000000_33.get$arr$(122), new AwS577S0100000_33((C03K6) this, 735), new AwS577S0100000_33((C03K6) this, 737), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 739), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 741), null, new AwS577S0100000_33((C03K6) this, 742));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 736);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 738);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 740);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 27));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 743);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 744);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 745);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 746);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 747);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS576S0100000_32, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 748), awS576S0100000_32, AFwS224S0000000_33.get$arr$(123), new AwS577S0100000_33((C03K6) this, 749), new AwS577S0100000_33((C03K6) this, 750), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 751), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 752), null, new AwS577S0100000_33((C03K6) this, 753));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 754), awS576S0100000_32, AFwS224S0000000_33.get$arr$(124), new AwS577S0100000_33((C03K6) this, 755), new AwS577S0100000_33((C03K6) this, 756), new AwS577S0100000_33((C03K6) this, 757), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 758));
        }
        this.LLJ = assemVMLazy;
    }

    public final void L5() {
        Drawable drawableMutate;
        try {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, this.itemView.getContext());
            if (numLIZJ != null) {
                numLIZJ.intValue();
            }
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.q7t);
            ((TuxTextView) this.itemView.findViewById(R.id.q83)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.jsh)).setTextColorRes(R.attr.a1p);
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.q7e);
            int alpha = frameLayout.getBackground().getAlpha();
            frameLayout.getBackground().mutate().setAlpha(alpha / 3);
            Drawable drawable = smartImageView.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setAlpha(alpha / 3);
            }
            C786410Ut5.I7(new AjS15S0000000_33(2), this.itemView);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1A0Y c1a0y = (C1A0Y) interfaceC1891350zJl;
        super.onBindItemView(c1a0y);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.q7e);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.q7t);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.q83);
        C0GRZ c0grz = (C0GRZ) this.itemView.findViewById(R.id.q7l);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.jsh);
        C1A0V c1a0v = c1a0y.LLIZ;
        C786410Ut5.I7(new AjS23S0300000_33(c1a0v, this, c1a0y, 3), this.itemView);
        if (c1a0v != null) {
            c1a0v.LJJLIIIJ(getLayoutPosition(), this);
        }
        C21714919yd c21714919yd = c1a0y.LLILZLL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        c21714919yd.getClass();
        layoutParams.setMarginEnd(C0H9H.LIZIZ(12));
        C786410Ut5.a6(frameLayout, layoutParams);
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = c1a0y.LL;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
        c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = c21714919yd.LIZ;
        c1331670kl3LJ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
        c1331670kl3LJ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJ);
        if (c1a0y.LLILLJJLI != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            tuxTextView.setText(c1a0y.LLILLJJLI);
            C426750GoL.LJIIL(frameLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        } else {
            C786410Ut5.LJLLLLLL(8, tuxTextView);
            C426750GoL.LJIIL(frameLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
        }
        if (c1a0y.LLILZ) {
            if (c1a0y.LLILLL) {
                i = R.drawable.b4g;
            } else {
                i = R.drawable.b4e;
            }
        } else if (c1a0y.LLILLL) {
            i = R.drawable.b4f;
        } else {
            i = R.drawable.b4d;
        }
        frameLayout.setBackgroundResource(i);
        if (c1a0y.LLILZ) {
            if (c1a0y.LLILLL) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
                if (numLIZJ != null) {
                    tuxTextView.setTextColor(numLIZJ.intValue());
                }
                tuxTextView.setTuxFont(72);
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, this.itemView.getContext());
                if (numLIZJ2 != null) {
                    tuxTextView.setTextColor(numLIZJ2.intValue());
                }
                tuxTextView.setTuxFont(71);
            }
        } else {
            if (c1a0y.LLILLL) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
                if (numLIZJ3 != null) {
                    tuxTextView.setTextColor(numLIZJ3.intValue());
                }
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
                if (numLIZJ4 != null) {
                    tuxTextView.setTextColor(numLIZJ4.intValue());
                }
            }
            tuxTextView.setTuxFont(71);
        }
        if (c1a0y.LLILLL) {
            C786410Ut5.u5(smartImageView, 1.0f);
            C786410Ut5.LJLLLLLL(8, c0grz);
        } else {
            C786410Ut5.u5(smartImageView, 0.5f);
            C786410Ut5.LJLLLLLL(0, c0grz);
            c0grz.setLineOffset(C418440Gaw.LIZIZ(3));
        }
        C7878035w c7878035w = C7878035w.LIZ;
        Context context = this.itemView.getContext();
        SalePropTag salePropTag = c1a0y.LLILZIL;
        int paddingTop = frameLayout.getPaddingTop();
        int paddingRight = frameLayout.getPaddingRight();
        int iLIZIZ = C0H9H.LIZIZ(8);
        int iLIZIZ2 = C0H9H.LIZIZ(4);
        c7878035w.getClass();
        C7878035w.LIZ(context, tuxTextView2, salePropTag, paddingTop, paddingRight, iLIZIZ, iLIZIZ2);
        if (this.LLILLL) {
            L5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.apr, viewGroup, false);
    }
}
