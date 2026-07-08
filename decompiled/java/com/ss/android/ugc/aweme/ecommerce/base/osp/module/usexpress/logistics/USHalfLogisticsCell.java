package com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.logistics;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03C8;
import X.C03DZ;
import X.C03IJ;
import X.C03K6;
import X.C03XA;
import X.C09R3;
import X.C09RD;
import X.C09RE;
import X.C10515049h;
import X.C12ES;
import X.C13LE;
import X.C1748720vbi;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C722902rz;
import X.C737910Sx3;
import X.C738302uT;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.aggregation.OspAggregationOrderModuleViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS15S0000000_33;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class USHalfLogisticsCell extends ECPowerCell<C738302uT> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public String LLJ;
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(USHalfLogisticsCell.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(USHalfLogisticsCell.class, "shopVM", "getShopVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/core/vm/OspShopViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(USHalfLogisticsCell.class, "aggregationVM", "getAggregationVM()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/module/us/aggregation/OspAggregationOrderModuleViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public USHalfLogisticsCell() {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        AssemVMLazy assemVMLazy3;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 1775);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(82);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1759), awS577S0100000_33, AFwS224S0000000_33.get$arr$(240), new AwS577S0100000_33((C03K6) this, 1745), new AwS577S0100000_33((C03K6) this, 1783), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1736), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1770), null, new AwS577S0100000_33((C03K6) this, 1788));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 1741);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1743);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 1747);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 65));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 1754);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 1758);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 1762);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 1765);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 1768);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1771), awS577S0100000_33, AFwS224S0000000_33.get$arr$(239), new AwS577S0100000_33((C03K6) this, 1781), new AwS577S0100000_33((C03K6) this, 1785), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1789), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 1792), null, new AwS577S0100000_33((C03K6) this, 1795));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 1797), awS577S0100000_33, AFwS224S0000000_33.get$arr$(241), new AwS577S0100000_33((C03K6) this, 1718), new AwS577S0100000_33((C03K6) this, 1719), new AwS577S0100000_33((C03K6) this, 1726), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 1730));
        }
        this.LLJI = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(OspShopViewModel.class);
        AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c19719912DlLIZ2, 1734);
        AFwS279S0000000_33 aFwS279S0000000_332 = AFwS279S0000000_33.get$arr$(83);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1739), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(235), new AwS577S0100000_33((C03K6) this, 1744), new AwS577S0100000_33((C03K6) this, 1748), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1751), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1755), null, new AwS577S0100000_33((C03K6) this, 1763));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3311 = new AwS577S0100000_33((C03K6) this, 1766);
            AwS577S0100000_33 awS577S0100000_3312 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1769);
            AwS577S0100000_33 awS577S0100000_3313 = new AwS577S0100000_33(c19719912DlLIZ2, 1772);
            C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3311, 66));
            AwS577S0100000_33 awS577S0100000_3314 = new AwS577S0100000_33(c01gwLIZIZ2, 1778);
            AwS577S0100000_33 awS577S0100000_3315 = new AwS577S0100000_33(c01gwLIZIZ2, 1782);
            AwS577S0100000_33 awS577S0100000_3316 = new AwS577S0100000_33(c01gwLIZIZ2, 1786);
            AwS577S0100000_33 awS577S0100000_3317 = new AwS577S0100000_33(c01gwLIZIZ2, 1790);
            AwS577S0100000_33 awS577S0100000_3318 = new AwS577S0100000_33(c01gwLIZIZ2, 1793);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C737910Sx3.LIZ;
            assemVMLazy2 = new AssemVMLazy(awS577S0100000_3313, awS577S0100000_3310, new C452080Ho6(), awS577S0100000_3314, awS577S0100000_3315, awS577S0100000_3312, aFwS279S0000000_332, awS577S0100000_3316, awS577S0100000_3317, awS577S0100000_3318);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1798), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(233), new AwS577S0100000_33((C03K6) this, 1720), new AwS577S0100000_33((C03K6) this, 1723), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1727), aFwS279S0000000_332, new AwS577S0100000_33((C03K6) this, 1731), null, new AwS577S0100000_33((C03K6) this, 1735));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Don't support this VMScope: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            assemVMLazy2 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ2, 1737), awS577S0100000_3310, AFwS224S0000000_33.get$arr$(234), new AwS577S0100000_33((C03K6) this, 1742), new AwS577S0100000_33((C03K6) this, 1749), new AwS577S0100000_33((C03K6) this, 1752), aFwS279S0000000_332, null, null, new AwS577S0100000_33((C03K6) this, 1756));
        }
        this.LLJIJIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(OspAggregationOrderModuleViewModel.class);
        AwS577S0100000_33 awS577S0100000_3319 = new AwS577S0100000_33(c19719912DlLIZ3, 1760);
        AFwS279S0000000_33 aFwS279S0000000_333 = AFwS279S0000000_33.get$arr$(84);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy3 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ3, 1767), awS577S0100000_3319, AFwS224S0000000_33.get$arr$(238), new AwS577S0100000_33((C03K6) this, 1773), new AwS577S0100000_33((C03K6) this, 1776), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1779), aFwS279S0000000_333, new AwS577S0100000_33((C03K6) this, 1787), null, new AwS577S0100000_33((C03K6) this, 1791));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_3320 = new AwS577S0100000_33((C03K6) this, 1794);
            AwS577S0100000_33 awS577S0100000_3321 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1796);
            AwS577S0100000_33 awS577S0100000_3322 = new AwS577S0100000_33(c19719912DlLIZ3, 1799);
            C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_3320, 64));
            AwS577S0100000_33 awS577S0100000_3323 = new AwS577S0100000_33(c01gwLIZIZ3, 1721);
            AwS577S0100000_33 awS577S0100000_3324 = new AwS577S0100000_33(c01gwLIZIZ3, 1724);
            AwS577S0100000_33 awS577S0100000_3325 = new AwS577S0100000_33(c01gwLIZIZ3, 1728);
            AwS577S0100000_33 awS577S0100000_3326 = new AwS577S0100000_33(c01gwLIZIZ3, 1732);
            AwS577S0100000_33 awS577S0100000_3327 = new AwS577S0100000_33(c01gwLIZIZ3, 1738);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = C737910Sx3.LIZ;
            assemVMLazy3 = new AssemVMLazy(awS577S0100000_3322, awS577S0100000_3319, new C452080Ho6(), awS577S0100000_3323, awS577S0100000_3324, awS577S0100000_3321, aFwS279S0000000_333, awS577S0100000_3325, awS577S0100000_3326, awS577S0100000_3327);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy3 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ3, 1740), awS577S0100000_3319, AFwS224S0000000_33.get$arr$(236), new AwS577S0100000_33((C03K6) this, 1746), new AwS577S0100000_33((C03K6) this, 1750), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 1753), aFwS279S0000000_333, new AwS577S0100000_33((C03K6) this, 1757), null, new AwS577S0100000_33((C03K6) this, 1761));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Don't support this VMScope: ");
                sbLIZ3.append(obj);
                sbLIZ3.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            assemVMLazy3 = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ3, 1764), awS577S0100000_3319, AFwS224S0000000_33.get$arr$(237), new AwS577S0100000_33((C03K6) this, 1774), new AwS577S0100000_33((C03K6) this, 1777), new AwS577S0100000_33((C03K6) this, 1780), aFwS279S0000000_333, null, null, new AwS577S0100000_33((C03K6) this, 1784));
        }
        this.LLJILJIL = assemVMLazy3;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1729));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1733));
        this.LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1725));
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 1722));
    }

    public final void L5() {
        Iterator<View> it2 = new C09RD((ViewGroup) this.LLJJ.getValue()).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                C03DZ.LIZ((View) this.LLJJI.getValue());
                C786410Ut5.I7(new AjS15S0000000_33(6), this.itemView);
                return;
            } else {
                View view = (View) c09re.next();
                if (view instanceof TuxTextView) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) view;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(appCompatTextView.getText());
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, appCompatTextView.getContext())), 0, spannableStringBuilder.length(), 17);
                    appCompatTextView.setText(spannableStringBuilder);
                }
            }
        }
    }

    public final OrderSubmitAssemViewModel N5() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r17) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.logistics.USHalfLogisticsCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.ECPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        C03XA c03xa = C03XA.LIZ;
        Context context = viewGroup.getContext();
        c03xa.getClass();
        return C03XA.LIZJ(context, R.layout.b0y, viewGroup, false);
    }

    public final void P5(C722902rz c722902rz, LogisticExpressionArea logisticExpressionArea, Map<String, String> map) {
        C12ES.LJIILL(0, (View) this.LLJJ.getValue());
        if (logisticExpressionArea != null) {
            C786410Ut5.LJJJJJL((LinearLayout) this.LLJJ.getValue());
            List<ECRichText> list = logisticExpressionArea.logisticsDescriptions;
            if (list != null) {
                for (ECRichText eCRichText : list) {
                    TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), null, 6, 0);
                    tuxTextView.setText(C03C8.LIZ(tuxTextView, eCRichText, "osp_half_delivery_content", null, null, false, 28));
                    tuxTextView.setTextAlignment(5);
                    tuxTextView.setGravity(16);
                    tuxTextView.setWidth(-1);
                    tuxTextView.setHeight(-2);
                    tuxTextView.setMaxLines(2);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    ((ViewGroup) this.LLJJ.getValue()).addView(tuxTextView);
                }
            }
        }
        C1748720vbi.LJFF(this.itemView, new C10515049h(), new AwS545S0100000_1(this, 742), new AwS210S0300000_1(this, (USHalfLogisticsCell) c722902rz, (C722902rz) map, (Map<String, String>) 19));
    }
}
