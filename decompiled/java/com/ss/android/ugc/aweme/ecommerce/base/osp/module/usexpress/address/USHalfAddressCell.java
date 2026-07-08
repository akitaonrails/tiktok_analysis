package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.address;

import X.AnonymousClass0376;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03C9;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C049X;
import X.C09R3;
import X.C0H1U;
import X.C10515049h;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C1546210qL5;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C770702zh;
import X.C786410Ut5;
import X.C814420VxA;
import X.C928203k0;
import X.C960203pA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressRichInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.zhiliaoapp.musically.R;
import g1c.AjS15S0000000_33;
import g1c.AjS40S0200000_1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS647S0100000_33;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USHalfAddressCell extends ECPowerCell<AnonymousClass0376> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfAddressCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USHalfAddressCell.class, "addressViewModel", "getAddressViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/address/OspAddressViewModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b0v;
    }

    public USHalfAddressCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1645);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(79);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1632), awS577S0100000_33, AFwS224S0000000_33.get$arr$(224), new AwS577S0100000_33((C03K6) this, 1622), new AwS577S0100000_33((C03K6) this, 1633), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1636), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1639), null, new AwS577S0100000_33((C03K6) this, 1642));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1618);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1620);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1623);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 60));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1628);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1631);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1634);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1637);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1640);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1643), awS577S0100000_33, AFwS224S0000000_33.get$arr$(223), new AwS577S0100000_33((C03K6) this, 1647), new AwS577S0100000_33((C03K6) this, 1649), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1651), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1653), null, new AwS577S0100000_33((C03K6) this, 1655));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1656), awS577S0100000_33, AFwS224S0000000_33.get$arr$(225), new AwS577S0100000_33((C03K6) this, 1658), new AwS577S0100000_33((C03K6) this, 1660), new AwS577S0100000_33((C03K6) this, 1663), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1665));
        }
        this.LLJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspAddressViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 1614);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(78);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1617), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(222), new AwS577S0100000_33((C03K6) this, 1621), new AwS577S0100000_33((C03K6) this, 1624), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1626), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1629), null, new AwS577S0100000_33((C03K6) this, 1635));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 1638);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1641);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 1644);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 61));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 1646);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 1648);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 1650);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 1652);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 1654);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1657), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(226), new AwS577S0100000_33((C03K6) this, 1659), new AwS577S0100000_33((C03K6) this, 1661), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1662), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1664), null, new AwS577S0100000_33((C03K6) this, 1615));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1616), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(221), new AwS577S0100000_33((C03K6) this, 1619), new AwS577S0100000_33((C03K6) this, 1625), new AwS577S0100000_33((C03K6) this, 1627), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 1630));
        }
        this.LLJI = assemVMLazy2;
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell
    public final void I5() {
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager != null) {
            moduleManager.LIZ("shipping_address", this.itemView);
        }
        ModuleManager moduleManager2 = N5().LLZIL;
        if (moduleManager2 != null) {
            moduleManager2.LJIIJJI(this.LLIZ - this.LLILZLL, "shipping_address");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onCreate() {
        super.onCreate();
    }

    public final void L5(boolean z) {
        C786410Ut5.I7(new AjS15S0000000_33(5), this.itemView);
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.us_half_order_submit_address_module_content);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(appCompatTextView.getText());
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, appCompatTextView.getContext())), 0, spannableStringBuilder.length(), 17);
        appCompatTextView.setText(spannableStringBuilder);
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, this.itemView.getContext());
            if (numLIZJ != null) {
                ((TuxIconView) this.itemView.findViewById(R.id.us_half_order_submit_address_forward)).setTintColor(numLIZJ.intValue());
            }
            ((TuxTextView) this.itemView.findViewById(R.id.us_half_order_submit_address_module_name)).setTextColorRes(R.attr.a1p);
            return;
        }
        C03DZ.LIZ(this.itemView.findViewById(R.id.us_half_order_submit_address_forward_layout));
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
        if (numLIZJ2 == null) {
            return;
        }
        ((TuxIconView) this.itemView.findViewById(R.id.us_half_order_submit_address_forward)).setTintColor(numLIZJ2.intValue());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        String str;
        String str2;
        Collection<ECRichTextAttribute> collectionValues;
        String str3;
        ECRichTextExtraInfo eCRichTextExtraInfo;
        ShippingAddressRichInfo next;
        ECRichText eCRichText;
        String str4;
        AnonymousClass0376 anonymousClass0376 = (AnonymousClass0376) interfaceC1891350zJl;
        this.LLIZLLLIL = System.currentTimeMillis();
        super.onBindItemView(anonymousClass0376);
        if (N5().LLZILL) {
            if (Intrinsics.LJFF(anonymousClass0376.LLJJJJLIIL, Boolean.TRUE)) {
                C786410Ut5.LJLLLLLL(4, this.itemView);
                return;
            }
            C786410Ut5.LJLLLLLL(0, this.itemView);
        }
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str5 = N5().n;
        c928203k0.getClass();
        if (C928203k0.LJIILL(str5)) {
            View view = this.itemView;
            C1546210qL5.LIZ.getClass();
            C0H1U.LJIIIIZZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(12)), view);
            C0H1U.LJIIIZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(12)), this.itemView);
        }
        C736680Sv4.LJIIIIZZ(this, N5(), new C2217381BqS() { // from class: X.19yy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLIL;
            }
        }, null, new AwS647S0100000_33(this, 45), 6);
        if (!anonymousClass0376.LLJJIJIIJIL && !Intrinsics.LJFF(anonymousClass0376.LLJJIII, Boolean.FALSE)) {
            z = false;
        } else {
            z = true;
        }
        C0H1U.LJIIJJI((TextView) this.itemView.findViewById(R.id.us_half_order_submit_address_module_name), anonymousClass0376.LLJJIJIL, "ship to");
        String str6 = null;
        if (anonymousClass0376.LLJILJIL) {
            if (z) {
                if (!this.LLJILJIL) {
                    this.LLJILJIL = true;
                    C12ES.LJIILL(0, this.itemView.findViewById(R.id.us_cta_badge));
                }
            } else {
                C03DZ.LIZ(this.itemView.findViewById(R.id.us_cta_badge));
            }
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.us_half_order_submit_address_module_content));
            C03DZ.LIZ(this.itemView.findViewById(R.id.us_half_order_submit_no_address_content));
            TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.us_half_order_submit_address_module_content);
            if (Intrinsics.LJFF(anonymousClass0376.LLJJIII, Boolean.FALSE)) {
                if (C770702zh.LIZIZ(anonymousClass0376.LLJILLL)) {
                    str4 = anonymousClass0376.LLJILLL;
                } else {
                    BillStarlingText billStarlingText = anonymousClass0376.LLLFFI;
                    if (billStarlingText != null) {
                        str4 = billStarlingText.text;
                    } else {
                        str4 = null;
                    }
                }
                C0H1U.LJIIL(tuxTextView, str4, true);
                tuxTextView.setTextColorRes(R.attr.a1m);
            } else {
                List<ShippingAddressRichInfo> list = anonymousClass0376.LLJJL;
                if (list != null) {
                    Iterator<ShippingAddressRichInfo> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            Integer num = next.showType;
                            if (num != null && num.intValue() == 0) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ShippingAddressRichInfo shippingAddressRichInfo = next;
                    if (shippingAddressRichInfo != null && (eCRichText = shippingAddressRichInfo.title) != null) {
                        C0H1U.LJIIL(tuxTextView, C03C9.LIZ(tuxTextView, C03C8.LIZ(tuxTextView, eCRichText, "osp_half_delivery_content", null, null, false, 28), !z, R.attr.a1p), true);
                    }
                }
            }
        } else {
            C03DZ.LIZ(this.itemView.findViewById(R.id.us_half_order_submit_address_module_content));
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.us_half_order_submit_no_address_content));
            if (!this.LLJIJIL) {
                this.LLJIJIL = true;
                C12ES.LJIILL(0, this.itemView.findViewById(R.id.us_cta_badge));
            }
            BillStarlingText billStarlingText2 = anonymousClass0376.LLLFFI;
            TextView textView = (TextView) this.itemView.findViewById(R.id.us_half_order_submit_no_address_content);
            if (billStarlingText2 != null) {
                str = billStarlingText2.text;
            } else {
                str = null;
            }
            C0H1U.LJIIJJI(textView, str, "");
        }
        C786410Ut5.I7(new AjS40S0200000_1(anonymousClass0376, this, 81), this.itemView);
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            C1748720vbi.LIZLLL(this.itemView, new C10515049h(), new AwS580S0100000_1(anonymousClass0376, 819));
        }
        if (!this.LLJILJILJ && anonymousClass0376.LLLIIII != null) {
            this.LLJILJILJ = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ECRichTextExtraInfo eCRichTextExtraInfo2 = anonymousClass0376.LLLIIII.extraInfo;
            if (eCRichTextExtraInfo2 != null) {
                str2 = eCRichTextExtraInfo2.daInfo;
            } else {
                str2 = null;
            }
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
            if (mapLJIIJ != null && !mapLJIIJ.isEmpty()) {
                linkedHashMap.putAll(mapLJIIJ);
            }
            Map<String, ECRichTextAttribute> map = anonymousClass0376.LLLIIII.arguments;
            if (map != null && (collectionValues = map.values()) != null) {
                for (ECRichTextAttribute eCRichTextAttribute : collectionValues) {
                    if (eCRichTextAttribute != null && (eCRichTextExtraInfo = eCRichTextAttribute.extraInfo) != null) {
                        str3 = eCRichTextExtraInfo.daInfo;
                    } else {
                        str3 = null;
                    }
                    HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(str3);
                    if (mapLJIIJ2 != null && !mapLJIIJ2.isEmpty()) {
                        linkedHashMap.putAll(mapLJIIJ2);
                    }
                }
            }
            linkedHashMap.put("is_clickable", 1);
            Object obj = linkedHashMap.get("button_name");
            if (obj instanceof String) {
                str6 = (String) obj;
            }
            if (C770702zh.LIZIZ(str6)) {
                C1748720vbi.LIZLLL(this.itemView, new C049X(), new AwS580S0100000_1(linkedHashMap, (Map<Integer, String>) 820));
            }
        }
        if (Intrinsics.LJFF(anonymousClass0376.LLJJJJJIL, Boolean.TRUE)) {
            L5(true);
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, this.itemView.getContext());
            if (numLIZJ != null) {
                ((TuxIconView) this.itemView.findViewById(R.id.us_half_order_submit_address_forward)).setTintColor(numLIZJ.intValue());
            }
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.us_half_order_submit_invalid_hint);
        ECRichText eCRichText2 = anonymousClass0376.LLLIIII;
        if (eCRichText2 == null) {
            C03DZ.LIZ(textView2);
        } else {
            C12ES.LJIILL(0, textView2);
            C03C8.LIZJ(textView2, eCRichText2, "osp_half_invalid_hint", new AwS650S0100000_1(this, 24));
        }
        ModuleManager moduleManager = N5().LLZIL;
        if (moduleManager == null) {
            return;
        }
        moduleManager.LJIIJ(System.currentTimeMillis() - this.LLIZLLLIL, "shipping_address");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b0v, viewGroup, false);
    }
}
