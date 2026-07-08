package com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03AJ;
import X.C03DZ;
import X.C03IJ;
import X.C03J8;
import X.C03K6;
import X.C03XA;
import X.C04JF;
import X.C0H1U;
import X.C0H9H;
import X.C0P0T;
import X.C10515049h;
import X.C12ES;
import X.C1391600mJi;
import X.C13LE;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19719612Di;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C450720Hlu;
import X.C452080Ho6;
import X.C452501pT;
import X.C720002rW;
import X.C720202rY;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C7736030k;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC1391650mJn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.discount.USPlatformDiscountsCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BonusInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ColorText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DealLabel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS7S0400000_1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USPlatformDiscountsCell extends ECPowerCell<C720202rY> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLJ;
    public final LinkedList<C03AJ> LLJI;
    public C0P0T LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USPlatformDiscountsCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public USPlatformDiscountsCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c19719912DlLIZ, 590);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(107);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 600), awS545S0100000_1, AFwS207S0000000_19.get$arr$(161), new AwS545S0100000_1((C03K6) this, 582), new AwS545S0100000_1((C03K6) this, 584), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 586), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1201), null, new AwS545S0100000_1((C03K6) this, 588));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C03K6) this, 583);
            AwS545S0100000_1 awS545S0100000_13 = new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 585);
            AwS545S0100000_1 awS545S0100000_14 = new AwS545S0100000_1(c19719912DlLIZ, 587);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS545S0100000_12, 62));
            AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c01gwLIZIZ, 1202);
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19(c01gwLIZIZ, 1203);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19(c01gwLIZIZ, 1204);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c01gwLIZIZ, 1205);
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1206);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS545S0100000_14, awS545S0100000_1, new C452080Ho6(), awS563S0100000_19, awS563S0100000_192, awS545S0100000_13, aFwS228S0000000_1, awS563S0100000_193, awS563S0100000_194, awS563S0100000_195);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 589), awS545S0100000_1, AFwS207S0000000_19.get$arr$(159), new AwS545S0100000_1((C03K6) this, 591), new AwS545S0100000_1((C03K6) this, 592), new AwS545S0100000_1((HasDefaultViewModelProviderFactory) this, 593), aFwS228S0000000_1, new AwS563S0100000_19((C03K6) this, 1207), null, new AwS545S0100000_1((C03K6) this, 594));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS545S0100000_1(c19719912DlLIZ, 595), awS545S0100000_1, AFwS207S0000000_19.get$arr$(160), new AwS545S0100000_1((C03K6) this, 596), new AwS545S0100000_1((C03K6) this, 597), new AwS545S0100000_1((C03K6) this, 598), aFwS228S0000000_1, null, null, new AwS545S0100000_1((C03K6) this, 599));
        }
        this.LLJ = assemVMLazy;
        this.LLJI = new LinkedList<>();
    }

    public final OrderSubmitAssemViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final HashMap<String, Object> mapLJIIJ;
        String str;
        Integer num;
        Integer num2;
        C720002rW c720002rW;
        String str2;
        C720202rY c720202rY = (C720202rY) interfaceC1891350zJl;
        int i = 0;
        if (L5().LLZILL) {
            if (Intrinsics.LJFF(c720202rY.LLILZLL.LLJJJIL, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                return;
            }
            C786410Ut5.LJLLLLLL(0, this.itemView);
        }
        C03J8.LIZ(this.itemView, true);
        C720002rW c720002rW2 = c720202rY.LLILZLL;
        View view = this.itemView;
        C786410Ut5.I7(new AjS20S0300000_1(this, c720002rW2, view, 19), view.findViewById(R.id.us_order_submit_discount_layout));
        C0H1U.LJIIL((TextView) view.findViewById(R.id.us_platform_discount_module_name), c720002rW2.LLJILJIL, true);
        int i2 = 6;
        int i3 = 8;
        if (c720002rW2.LLJLLIL) {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.us_platform_discount_module_name);
            tuxTextView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, 0);
            tuxTextView.setTextColorRes(R.attr.a1k);
            tuxTextView.setTuxFont(71);
            this.itemView.findViewById(R.id.us_platform_discount_labels_constraint_layout).setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            this.itemView.findViewById(R.id.us_order_submit_discount_layout).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.us_platform_discount_icon);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_thin_ltr;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        if (c720202rY.LLILZLL.LLJLLIL) {
            super.onBindItemView(c720202rY);
        }
        View view2 = this.itemView;
        C720002rW c720002rW3 = c720202rY.LLILZLL;
        this.LLJI.clear();
        if (((ViewGroup) view2.findViewById(R.id.us_platform_discount_labels_layout)).getChildCount() != 0) {
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.us_platform_discount_labels_layout);
            LinkedList<C03AJ> linkedList = this.LLJI;
            while (viewGroup.getChildCount() > 0) {
                C786410Ut5.LJJLIL(0, viewGroup);
                Unit unit = Unit.LIZ;
                if (unit instanceof C03AJ) {
                    linkedList.add((C03AJ) unit);
                }
            }
        }
        List<DealLabel> list = c720002rW3.LLJJL;
        AttributeSet attributeSet = null;
        if (list != null) {
            int i4 = 0;
            for (DealLabel dealLabel : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    DealLabel dealLabel2 = dealLabel;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(C0H9H.LIZIZ(i3));
                    layoutParams.bottomMargin = C0H9H.LIZIZ(i3);
                    C03AJ c03aj = (C03AJ) C19719612Di.LJJIIZI(this.LLJI);
                    if (c03aj == null) {
                        c03aj = new C03AJ(view2.getContext(), attributeSet, i2, i);
                    }
                    new AwS580S0100000_1(dealLabel2, 460).invoke(c03aj.getUsLabelContentFromXml());
                    Integer num3 = dealLabel2.labelType;
                    if (num3 != null && num3.intValue() == 1) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.gc);
                        c03aj.setBackground(c384050F3z.LIZ(view2.getContext()));
                        C426750GoL.LJIIL(c03aj, Integer.valueOf(C0H9H.LIZIZ(4)), Integer.valueOf(C0H9H.LIZIZ(4)), Integer.valueOf(C0H9H.LIZIZ(4)), Integer.valueOf(C0H9H.LIZIZ(4)), 16);
                    } else {
                        c03aj.setPadding(0, C0H9H.LIZIZ(4), C0H9H.LIZIZ(4), C0H9H.LIZIZ(4));
                    }
                    C03DZ.LIZ(view2.findViewById(R.id.us_platform_discount_labels_text));
                    ((ViewGroup) view2.findViewById(R.id.us_platform_discount_labels_layout)).addView(c03aj, layoutParams);
                    C12ES.LJIILL(0, view2.findViewById(R.id.us_platform_discount_labels_layout));
                    i4 = i5;
                    i2 = 6;
                    i3 = 8;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            C03DZ.LIZ(view2.findViewById(R.id.us_platform_discount_labels_layout));
            C0H1U.LJIIL((TextView) view2.findViewById(R.id.us_platform_discount_labels_text), c720002rW3.LLJLILLLLZIIL, true);
        }
        final BonusInfo bonusInfo = c720202rY.LLILZLL.LLJJIJI;
        if (bonusInfo != null) {
            View view3 = this.itemView;
            C720202rY c720202rY2 = (C720202rY) getItem();
            if (c720202rY2 != null && (c720002rW = c720202rY2.LLILZLL) != null && (str2 = c720002rW.LLJJIJIIJIL) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str2);
            } else {
                mapLJIIJ = null;
            }
            C1748720vbi.LJFF(view3.findViewById(R.id.us_order_submit_redeem_bonus_layout), new C10515049h(), AFwS185S0000000_1.get$arr$(168), new AwS367S0200000_1(this, (USPlatformDiscountsCell) mapLJIIJ, (HashMap<String, Object>) 193));
            C0H1U.LJIIL((TextView) view3.findViewById(R.id.us_order_submit_redeem_bonus_title), bonusInfo.redeemTitle, true);
            C786410Ut5.I7(new AjS7S0400000_1(this, view3, bonusInfo, mapLJIIJ, 6), view3.findViewById(R.id.us_order_submit_redeem_bonus_icon));
            Boolean bool = bonusInfo.redeemCanBeUsed;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                TextView textView = (TextView) view3.findViewById(R.id.us_order_submit_redeem_bonus_explain_text_has_bonus);
                if (textView != null) {
                    C0H1U.LJIIL(textView, bonusInfo.earnBonusText, true);
                }
                TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.us_order_submit_redeem_bonus_amount);
                ColorText colorText = bonusInfo.redeemAmount;
                if (colorText != null) {
                    str = colorText.text;
                } else {
                    str = null;
                }
                tuxTextView2.setText(str);
                ColorText colorText2 = bonusInfo.redeemAmount;
                if (colorText2 != null) {
                    num = colorText2.textColor;
                } else {
                    num = null;
                }
                tuxTextView2.setTextColorRes(C7736030k.LIZ(num, null));
                ColorText colorText3 = bonusInfo.redeemAmount;
                if (colorText3 != null) {
                    num2 = colorText3.textFont;
                } else {
                    num2 = null;
                }
                tuxTextView2.setTuxFont(C7736030k.LIZJ(num2, null));
                final C21411818qq c21411818qq = (C21411818qq) view3.findViewById(R.id.us_order_submit_redeem_bonus_switch);
                c21411818qq.setChecked(Intrinsics.LJFF(bonusInfo.useBonusRedeem, bool2));
                L5().q = c21411818qq.isChecked();
                if (bonusInfo.popupTip != null) {
                    C450720Hlu c450720Hlu = new C450720Hlu(c21411818qq.getContext());
                    String str3 = bonusInfo.popupTip.content;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c450720Hlu.LLILZ = str3;
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
                    this.LLJIJIL = c0p0tLIZIZ;
                    c0p0tLIZIZ.LJIJ(new InterfaceC1391650mJn() { // from class: X.03lE
                        @Override // X.InterfaceC1391650mJn
                        public final void onShow() {
                            OrderSubmitAssemViewModel orderSubmitAssemViewModelL5 = this.L5();
                            String str4 = bonusInfo.popupTip.freqControlKey;
                            if (str4 == null) {
                                str4 = "";
                            }
                            C948503nH.LJI(orderSubmitAssemViewModelL5, C23271099x.INSTANCE, new C857303Wp(EnumC857403Wq.RENDER_USBONUS_POPUP_TIP, str4, null));
                            C1748720vbi.LIZLLL(c21411818qq, new C10484048c(), new AwS210S0300000_1(this, (USPlatformDiscountsCell) mapLJIIJ, (HashMap<String, Object>) bonusInfo, (BonusInfo) 56));
                        }
                    });
                    L5().a0 = this.LLJIJIL;
                }
                C786410Ut5.C7(c21411818qq, new C04JF(c21411818qq, this, bonusInfo, mapLJIIJ, 1));
            } else {
                TextView textView2 = (TextView) view3.findViewById(R.id.us_order_submit_redeem_bonus_explain_text_no_bonus);
                if (textView2 != null) {
                    C12ES.LJIILL(0, textView2);
                    C0H1U.LJIIL(textView2, bonusInfo.earnBonusText, true);
                }
                C03DZ.LIZ(view3.findViewById(R.id.us_order_submit_redeem_bonus_explain_text_has_bonus));
                C03DZ.LIZ(view3.findViewById(R.id.us_order_submit_redeem_bonus_amount));
                C03DZ.LIZ(view3.findViewById(R.id.us_order_submit_redeem_bonus_switch));
            }
        }
        View viewFindViewById = this.itemView.findViewById(R.id.us_order_submit_redeem_bonus_layout);
        if (c720202rY.LLILZLL.LLJJIJI == null) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        C736680Sv4.LJIIIIZZ(this, L5(), new C2217381BqS() { // from class: X.03lD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS615S0100000_1(this, 103), 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        View viewLIZJ = C03XA.LIZJ(context, R.layout.b2o, viewGroup, false);
        viewLIZJ.setTag("us_platform_discount_item_view");
        return viewLIZJ;
    }
}
