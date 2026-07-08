package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C1708990uZd;
import X.C1709000uZe;
import X.C1709070uZl;
import X.C1709400uaI;
import X.C1709570uaZ;
import X.C1709620uae;
import X.C1709880ub4;
import X.C1714410uiN;
import X.C1716280ulO;
import X.C1716310ulR;
import X.C1717770unn;
import X.C2097608Jq;
import X.C2187701Ajg;
import X.C724240Sb0;
import X.EnumC1155630gB7;
import X.EnumC1709020uZg;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.pipo.stellar.base.fragment.StellarViewAssem;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.StellarTooltipDO;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPopupInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import org.json.JSONException;

/* JADX INFO: loaded from: classes27.dex */
public class AbS511S0200000_26 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS511S0200000_26 abS511S0200000_26, View view) {
        Map<String, Object> trackingParams;
        ViewTreeObserver viewTreeObserver;
        if (view != null) {
            StellarViewModel stellarViewModelJo = ((StellarViewAssem) abS511S0200000_26.l0).Jo();
            AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(679);
            stellarViewModelJo.setState(aFwS268S0000000_26);
            View view2 = ((StellarViewAssem) abS511S0200000_26.l0).LLJILJILJ;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) ((StellarViewAssem) abS511S0200000_26.l0).LLJILLL.getValue();
                viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
                C2187701Ajg.LIZIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
            }
            ((StellarViewAssem) abS511S0200000_26.l0).Jo().setState(aFwS268S0000000_26);
            SmartRouter.buildRoute(C1717770unn.LIZJ().getApplicationContext(), ((StellarTooltipDO) abS511S0200000_26.l1).getEventUrl()).open();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> trackingParams2 = ((StellarTooltipDO) abS511S0200000_26.l1).getTrackingParams();
            if (trackingParams2 != null) {
                linkedHashMap.putAll(trackingParams2);
            }
            ImageDO closeIcon = ((StellarTooltipDO) abS511S0200000_26.l1).getCloseIcon();
            if (closeIcon != null && (trackingParams = closeIcon.getTrackingParams()) != null) {
                linkedHashMap.putAll(trackingParams);
            }
            C1716280ulO c1716280ulO = ((StellarViewAssem) abS511S0200000_26.l0).Jo().LLILLJJLI;
            c1716280ulO.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("event_type", "click");
            linkedHashMap2.putAll(linkedHashMap);
            c1716280ulO.LIZJ("pipo_button_click", C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap2));
        }
    }

    public static final void LIZ$1(AbS511S0200000_26 abS511S0200000_26, View view) {
        long jLongValue;
        String string;
        if (view != null && !((RechargeAssem) abS511S0200000_26.l0).Jo().LLLII) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "a2270.b15220.c84583.d55594", PageFinder.via(C724240Sb0.LIZ((UIAssem) abS511S0200000_26.l1)), null, 4, null).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                linkedHashMap.put(key, string);
            }
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("event_type", "click");
            pairArr[1] = new Pair("button_id", "continue");
            pairArr[2] = new Pair("stay_time", String.valueOf(System.currentTimeMillis() - ((RechargeAssem) abS511S0200000_26.l0).LLIZLLLIL));
            String str = ((RechargeAssem) abS511S0200000_26.l0).Vo().LLILZ.value;
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[3] = new Pair("transaction_amount", str);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            mapLJIIJ.putAll(((RechargeAssem) abS511S0200000_26.l0).Oo());
            mapLJIIJ.putAll((Map) ((RechargeAssem) abS511S0200000_26.l0).LLJJJIL.getValue());
            C1716310ulR.LIZ.getClass();
            C1716310ulR.LIZLLL("pipo_button_click", mapLJIIJ);
            Map<String, String> mapSo = ((RechargeAssem) abS511S0200000_26.l0).So();
            mapSo.put("obj_id", "continue");
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = (Long) ((LinkedHashMap) ((RechargeAssem) abS511S0200000_26.l0).LLJJJ).get("user_resume_time");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            mapSo.put("click_cost", String.valueOf(jCurrentTimeMillis - jLongValue));
            C1716310ulR.LIZLLL("rd_pipo_object_click", mapSo);
            ((RechargeAssem) abS511S0200000_26.l0).Vo().CQ2();
        }
    }

    public static final void LIZ$2(AbS511S0200000_26 abS511S0200000_26, View view) {
        C1709620uae c1709620uae;
        C1709070uZl c1709070uZl;
        String str;
        C1708990uZd c1708990uZdLIZIZ;
        String strLIZJ;
        EnumC1709020uZg enumC1709020uZg;
        C1709570uaZ c1709570uaZ;
        if (view != null) {
            POPopupInfo pOPopupInfo = (POPopupInfo) abS511S0200000_26.l0;
            EnumC1709020uZg enumC1709020uZg2 = null;
            if (pOPopupInfo.type == POPopupInfo.Type.URL && (str = pOPopupInfo.url) != null) {
                C1714410uiN c1714410uiN = C1714410uiN.LIZ;
                Context context = ((C1709880ub4) abS511S0200000_26.l1).getContext();
                CashierEnterParams cashierEnterParams = ((C1709880ub4) abS511S0200000_26.l1).LLJJIJIL;
                if (cashierEnterParams == null || (c1709570uaZ = cashierEnterParams.paymentData) == null || (c1708990uZdLIZIZ = C1709400uaI.LIZIZ(c1709570uaZ)) == null) {
                    c1708990uZdLIZIZ = C1709000uZe.LIZ;
                }
                CashierEnterParams cashierEnterParams2 = ((C1709880ub4) abS511S0200000_26.l1).LLJJIJIL;
                if (cashierEnterParams2 != null && cashierEnterParams2.paymentData != null) {
                    String str2 = cashierEnterParams2.payRequestId;
                    C1709070uZl c1709070uZl2 = cashierEnterParams2.LIZIZ;
                    if (c1709070uZl2 != null) {
                        enumC1709020uZg = c1709070uZl2.LIZJ;
                    } else {
                        enumC1709020uZg = null;
                    }
                    strLIZJ = C1709570uaZ.LIZJ(((C1709880ub4) abS511S0200000_26.l1).LLJJIII, str2, C1709880ub4.LJI(enumC1709020uZg));
                } else {
                    strLIZJ = null;
                }
                C1714410uiN.LIZLLL(c1714410uiN, context, str, null, false, null, c1708990uZdLIZIZ, strLIZJ, null, null, 824);
            }
            C1709880ub4 c1709880ub4 = (C1709880ub4) abS511S0200000_26.l1;
            PaymentOption paymentOption = c1709880ub4.LLJJIII;
            if (paymentOption != null && (c1709620uae = c1709880ub4.LLJJLIIIJLLLLLLLZ) != null) {
                CashierEnterParams cashierEnterParams3 = c1709880ub4.LLJJIJIL;
                if (cashierEnterParams3 != null && (c1709070uZl = cashierEnterParams3.LIZIZ) != null) {
                    enumC1709020uZg2 = c1709070uZl.LIZJ;
                }
                C1709620uae.LIZLLL(c1709620uae, "info", C1709880ub4.LJI(enumC1709020uZg2), paymentOption);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$3(wh6.AbS511S0200000_26 r10, android.view.View r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS511S0200000_26.LIZ$3(wh6.AbS511S0200000_26, android.view.View):void");
    }

    public static final void LIZ$4(AbS511S0200000_26 abS511S0200000_26, View view) {
        C1709570uaZ c1709570uaZ;
        C1709620uae c1709620uae;
        EnumC1709020uZg enumC1709020uZg;
        boolean z;
        C1709570uaZ c1709570uaZ2;
        if (view != null) {
            ((C1709880ub4) abS511S0200000_26.l0).LJIIJ(EnumC1155630gB7.SUB_PM, (PaymentOption) abS511S0200000_26.l1);
            C1709880ub4 c1709880ub4 = (C1709880ub4) abS511S0200000_26.l0;
            CashierEnterParams cashierEnterParams = c1709880ub4.LLJJIJIL;
            if (cashierEnterParams != null && (c1709570uaZ = cashierEnterParams.paymentData) != null && (c1709620uae = c1709880ub4.LLJJLIIIJLLLLLLLZ) != null) {
                C1709070uZl c1709070uZl = cashierEnterParams.LIZIZ;
                if (c1709070uZl != null) {
                    enumC1709020uZg = c1709070uZl.LIZJ;
                } else {
                    enumC1709020uZg = null;
                }
                String strLJI = C1709880ub4.LJI(enumC1709020uZg);
                PaymentOption paymentOption = (PaymentOption) abS511S0200000_26.l1;
                CashierEnterParams cashierEnterParams2 = ((C1709880ub4) abS511S0200000_26.l0).LLJJIJIL;
                if (cashierEnterParams2 != null && (c1709570uaZ2 = cashierEnterParams2.paymentData) != null && c1709570uaZ2.LJJIZ(paymentOption)) {
                    z = true;
                } else {
                    z = false;
                }
                C1709620uae.LJFF(c1709620uae, c1709570uaZ, strLJI, 0, paymentOption, z);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS511S0200000_26(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
