package com.ss.android.ugc.aweme.ecommerce.base.osp.module.eu.bonus;

import X.AnonymousClass0319;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C04JO;
import X.C0H1U;
import X.C0H9H;
import X.C0P0T;
import X.C10515049h;
import X.C1391600mJi;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C19ME;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC1391650mJn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObjectS364S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BonusInfoCell extends ECPowerCell<AnonymousClass0319> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLJ;
    public C0P0T LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BonusInfoCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BonusInfoCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 931);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(52);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 942), awS577S0100000_33, AFwS224S0000000_33.get$arr$(145), new AwS577S0100000_33((C03K6) this, 917), new AwS577S0100000_33((C03K6) this, 919), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 921), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 923), null, new AwS577S0100000_33((C03K6) this, 924));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 918);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 920);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 922);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 34));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 925);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 926);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 927);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 928);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 929);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 930), awS577S0100000_33, AFwS224S0000000_33.get$arr$(143), new AwS577S0100000_33((C03K6) this, 932), new AwS577S0100000_33((C03K6) this, 933), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 934), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 935), null, new AwS577S0100000_33((C03K6) this, 936));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 937), awS577S0100000_33, AFwS224S0000000_33.get$arr$(144), new AwS577S0100000_33((C03K6) this, 938), new AwS577S0100000_33((C03K6) this, 939), new AwS577S0100000_33((C03K6) this, 940), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 941));
        }
        this.LLJ = assemVMLazy;
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        C19ME c19me5;
        C19ME c19me6;
        Integer num;
        AnonymousClass0319 anonymousClass0319 = (AnonymousClass0319) interfaceC1891350zJl;
        if (anonymousClass0319.LLILZLL.bonusInfo == null) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
            return;
        }
        C03J8.LIZ(this.itemView, true);
        C786410Ut5.LJLLLLLL(0, this.itemView);
        BonusInfo bonusInfo = anonymousClass0319.LLILZLL.bonusInfo;
        if (bonusInfo != null && (num = bonusInfo.bonusUiVersion) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View viewFindViewById = this.itemView.findViewById(R.id.ty5);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me4 = (C19ME) layoutParams) != null) {
                c19me4.topToTop = 0;
                c19me4.endToEnd = 0;
                c19me4.bottomToBottom = -1;
                c19me4.startToEnd = -1;
                c19me4.horizontalBias = 1.0f;
            } else {
                c19me4 = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
            viewFindViewById.setLayoutParams(c19me4);
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ty6);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me5 = (C19ME) layoutParams2) != null) {
                ((ViewGroup.MarginLayoutParams) c19me5).width = 0;
                c19me5.startToStart = 0;
                c19me5.topToTop = 0;
                c19me5.bottomToBottom = -1;
                c19me5.endToStart = R.id.ty5;
                c19me5.setMarginEnd(C0H9H.LIZIZ(10));
            } else {
                c19me5 = null;
            }
            C786410Ut5.R6(tuxTextView, c19me5);
            TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.ty1);
            ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me6 = (C19ME) layoutParams3) != null) {
                c19me6.endToEnd = 0;
                c19me6.endToStart = -1;
                c19me6.startToStart = 0;
                c19me6.topToBottom = R.id.ty6;
            } else {
                c19me6 = null;
            }
            C786410Ut5.R6(tuxTextView2, c19me6);
        } else {
            View viewFindViewById2 = this.itemView.findViewById(R.id.ty5);
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById2.getLayoutParams();
            if ((layoutParams4 instanceof C19ME) && (c19me = (C19ME) layoutParams4) != null) {
                c19me.topToTop = R.id.ty1;
                c19me.bottomToBottom = R.id.ty1;
                c19me.startToEnd = R.id.ty1;
                c19me.endToEnd = 0;
            } else {
                c19me = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById2);
            viewFindViewById2.setLayoutParams(c19me);
            TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.ty1);
            ViewGroup.LayoutParams layoutParams5 = tuxTextView3.getLayoutParams();
            if ((layoutParams5 instanceof C19ME) && (c19me2 = (C19ME) layoutParams5) != null) {
                c19me2.startToStart = 0;
                c19me2.topToBottom = R.id.ty6;
                c19me2.endToStart = R.id.ty5;
                c19me2.endToEnd = -1;
            } else {
                c19me2 = null;
            }
            C786410Ut5.R6(tuxTextView3, c19me2);
            TuxTextView tuxTextView4 = (TuxTextView) this.itemView.findViewById(R.id.ty6);
            ViewGroup.LayoutParams layoutParams6 = tuxTextView4.getLayoutParams();
            if ((layoutParams6 instanceof C19ME) && (c19me3 = (C19ME) layoutParams6) != null) {
                ((ViewGroup.MarginLayoutParams) c19me3).width = -2;
                c19me3.startToStart = 0;
                c19me3.topToTop = 0;
                c19me3.endToStart = -1;
                c19me3.bottomToBottom = -1;
            } else {
                c19me3 = null;
            }
            C786410Ut5.R6(tuxTextView4, c19me3);
        }
        BonusModule bonusModule = anonymousClass0319.LLILZLL;
        final BonusInfo bonusInfo2 = bonusModule.bonusInfo;
        if (bonusInfo2 != null) {
            C0H1U.LJIIL((TextView) this.itemView.findViewById(R.id.ty6), bonusModule.title, true);
            C03C8.LJ((TextView) this.itemView.findViewById(R.id.ty1), bonusInfo2.bonusTitle, "jp_s_points_bonus_title", new AObjectS364S0200000_1(this, bonusInfo2, 2));
            C03C8.LJ((TextView) this.itemView.findViewById(R.id.ty4), bonusInfo2.additionalNotice, "jp_s_points_bonus_notice", null);
            final C21411818qq c21411818qq = (C21411818qq) this.itemView.findViewById(R.id.ty5);
            Integer num2 = bonusModule.bonusInfo.bonusUiVersion;
            if (num2 != null && num2.intValue() == 1 && Intrinsics.LJFF(bonusModule.bonusInfo.redeemCanBeUsed, Boolean.FALSE)) {
                c21411818qq.setEnabled(false);
            } else {
                c21411818qq.setEnabled(true);
            }
            c21411818qq.setChecked(Intrinsics.LJFF(bonusInfo2.useBonusRedeem, Boolean.TRUE));
            L5().q = c21411818qq.isChecked();
            if (bonusInfo2.popupTip != null) {
                C450720Hlu c450720Hlu = new C450720Hlu(c21411818qq.getContext());
                String str = bonusInfo2.popupTip.content;
                if (str == null) {
                    str = "";
                }
                c450720Hlu.LLILZ = str;
                C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                c1391600mJi.LIZIZ = c21411818qq;
                c1391600mJi.LJIIL = true;
                c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
                c1391600mJi.LJIIIZ = false;
                c450720Hlu.LJIIIZ(true, null);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
                c1391600mJi2.LJIIIIZZ = iLIZIZ;
                c1391600mJi2.LJIJJ = true;
                c1391600mJi2.LJIJJLI = false;
                c450720Hlu.LIZLLL();
                c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                this.LLJI = c0p0tLIZIZ;
                c0p0tLIZIZ.LJIJ(new InterfaceC1391650mJn() { // from class: X.03lG
                    @Override // X.InterfaceC1391650mJn
                    public final void onShow() {
                        OrderSubmitAssemViewModel orderSubmitAssemViewModelL5 = this.LIZ.L5();
                        String str2 = bonusInfo2.popupTip.freqControlKey;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C948503nH.LJI(orderSubmitAssemViewModelL5, C23271099x.INSTANCE, new C857303Wp(EnumC857403Wq.RENDER_USBONUS_POPUP_TIP, str2, null));
                        C1748720vbi.LIZLLL(c21411818qq, new C10484048c(), new AwS367S0200000_1(this.LIZ, bonusInfo2, 387));
                    }
                });
                L5().a0 = this.LLJI;
            }
            C786410Ut5.C7(c21411818qq, new C04JO(this, bonusInfo2, c21411818qq, 1));
            C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS224S0000000_33.get$arr$(671), new AwS367S0200000_1(this, bonusInfo2, 389));
        }
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.19z8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 65), 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.ap3, viewGroup, false);
        viewLIZJ.setTag("s_points_item_view");
        return viewLIZJ;
    }
}
