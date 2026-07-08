package com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.sku.view;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C098200Yq;
import X.C0H9H;
import X.C1308910kAL;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C189200o6;
import X.C19719912Dl;
import X.C1A0V;
import X.C1A0X;
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
public final class OspImageWithTextSpecCell extends ECPowerCell<C1A0X> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(OspImageWithTextSpecCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.apn;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.19z6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 51), 6);
    }

    public OspImageWithTextSpecCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 136);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(46);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 784), awS576S0100000_32, AFwS224S0000000_33.get$arr$(125), new AwS577S0100000_33((C03K6) this, 760), new AwS577S0100000_33((C03K6) this, 762), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 764), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 766), null, new AwS577S0100000_33((C03K6) this, 767));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33((C03K6) this, 761);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 763);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c19719912DlLIZ, 765);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_33, 28));
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 768);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 769);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 770);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 771);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 772);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_333, awS576S0100000_32, new C452080Ho6(), awS577S0100000_334, awS577S0100000_335, awS577S0100000_332, aFwS279S0000000_33, awS577S0100000_336, awS577S0100000_337, awS577S0100000_338);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 773), awS576S0100000_32, AFwS224S0000000_33.get$arr$(126), new AwS577S0100000_33((C03K6) this, 774), new AwS577S0100000_33((C03K6) this, 775), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 776), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 777), null, new AwS577S0100000_33((C03K6) this, 778));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 779), awS576S0100000_32, AFwS224S0000000_33.get$arr$(127), new AwS577S0100000_33((C03K6) this, 780), new AwS577S0100000_33((C03K6) this, 781), new AwS577S0100000_33((C03K6) this, 782), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 783));
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
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.cib);
            ((TuxTextView) this.itemView.findViewById(R.id.cid)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.cic)).setTextColorRes(R.attr.a1p);
            ((TuxTextView) this.itemView.findViewById(R.id.jsh)).setTextColorRes(R.attr.a1p);
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.vsz);
            int alpha = frameLayout.getBackground().getAlpha();
            frameLayout.getBackground().mutate().setAlpha(alpha / 3);
            Drawable drawable = smartImageView.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setAlpha(alpha / 3);
            }
            C786410Ut5.I7(new AjS15S0000000_33(3), this.itemView);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C1A0X c1a0x = (C1A0X) interfaceC1891350zJl;
        super.onBindItemView(c1a0x);
        View viewFindViewById = this.itemView.findViewById(R.id.vsz);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.cib);
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.cid);
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.cic);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.ci_);
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.jsh);
        C1A0V c1a0v = c1a0x.LLIZLLLIL;
        C786410Ut5.I7(new AjS23S0300000_33(c1a0v, this, c1a0x, 4), this.itemView);
        if (c1a0v != null) {
            c1a0v.LJJLIIIJ(getLayoutPosition(), this);
        }
        c1a0x.LLIZ.getClass();
        C426750GoL.LJIIIZ(viewFindViewById, 0, 0, Integer.valueOf(C0H9H.LIZIZ(12)), 0, false, 16);
        int iLIZ = C21714919yd.LIZ();
        int radio = (int) (iLIZ * c1a0x.LL.getRadio());
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        layoutParams.width = radio;
        layoutParams.height = iLIZ;
        C786410Ut5.G6(smartImageView, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        layoutParams2.width = C21714919yd.LIZ();
        layoutParams2.height = C21714919yd.LIZ();
        C786410Ut5.a6(frameLayout, layoutParams2);
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        Image image = c1a0x.LL;
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(image);
        c1331670kl3LJ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJ.LJJI = C1326790kdB.LIZJ;
        c1331670kl3LJ.LJJIIZI(C1308910kAL.LJ(R.attr.bv, this.itemView.getContext()));
        c1331670kl3LJ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJ);
        tuxTextView.setText(c1a0x.LLILLJJLI);
        if (c1a0x.LLILLL != null) {
            C786410Ut5.LJLLLLLL(0, tuxTextView2);
            tuxTextView2.setText(c1a0x.LLILLL);
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
            tuxTextView.setTuxFont(91);
        } else {
            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
            tuxTextView.setTuxFont(91);
        }
        if (c1a0x.LLILZIL) {
            if (c1a0x.LLILZ) {
                i = R.drawable.b4g;
            } else {
                i = R.drawable.b4e;
            }
        } else if (c1a0x.LLILZ) {
            i = R.drawable.b4f;
        } else {
            i = R.drawable.b4d;
        }
        viewFindViewById.setBackgroundResource(i);
        tuxTextView.getPaint().setFlags(0);
        if (c1a0x.LLILZIL) {
            if (c1a0x.LLILZ) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    tuxTextView.setTextColor(iIntValue);
                    tuxTextView2.setTextColor(iIntValue);
                }
                tuxTextView2.setTuxFont(72);
                C786410Ut5.u5(smartImageView, 1.0f);
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1i, this.itemView.getContext());
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    tuxTextView.setTextColor(iIntValue2);
                    tuxTextView2.setTextColor(iIntValue2);
                }
                tuxTextView2.setTuxFont(71);
                C786410Ut5.u5(smartImageView, 0.5f);
                tuxTextView.getPaint().setFlags(16);
                tuxTextView.getPaint().setAntiAlias(true);
            }
        } else {
            if (c1a0x.LLILZ) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
                if (numLIZJ3 != null) {
                    int iIntValue3 = numLIZJ3.intValue();
                    tuxTextView.setTextColor(iIntValue3);
                    tuxTextView2.setTextColor(iIntValue3);
                }
                C786410Ut5.u5(smartImageView, 1.0f);
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
                if (numLIZJ4 != null) {
                    int iIntValue4 = numLIZJ4.intValue();
                    tuxTextView.setTextColor(iIntValue4);
                    tuxTextView2.setTextColor(iIntValue4);
                }
                C786410Ut5.u5(smartImageView, 0.5f);
                tuxTextView.getPaint().setFlags(16);
                tuxTextView.getPaint().setAntiAlias(true);
            }
            tuxTextView2.setTuxFont(71);
        }
        C7878035w c7878035w = C7878035w.LIZ;
        Context context = this.itemView.getContext();
        SalePropTag salePropTag = c1a0x.LLILZLL;
        int paddingTop = viewFindViewById.getPaddingTop();
        int paddingRight = viewFindViewById.getPaddingRight();
        int iLIZIZ = C0H9H.LIZIZ(8);
        int iLIZIZ2 = C0H9H.LIZIZ(4);
        c7878035w.getClass();
        C7878035w.LIZ(context, tuxTextView3, salePropTag, paddingTop, paddingRight, iLIZIZ, iLIZIZ2);
        if (this.LLILLL) {
            L5();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.apn, viewGroup, false);
    }
}
