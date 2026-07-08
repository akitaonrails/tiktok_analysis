package com.bytedance.pipo.ttpay.recharge;

import X.C09YA;
import X.C1559260qg8;
import X.C1717770unn;
import X.C1721480utm;
import X.C1721520utq;
import X.C1721530utr;
import X.C1721560utu;
import X.C1721620uu0;
import X.C1721830uuL;
import X.C1722320uv8;
import X.C23250099c;
import X.C723600SZy;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1721510utp;
import X.EnumC1721630uu1;
import X.EnumC488160JCk;
import X.InterfaceC0148002o;
import X.InterfaceC1713900uhY;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.pipo.ttpay.recharge.network.PaymentMethodInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class RechargeViewmodel extends AssemViewModel<C1721620uu0> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1721560utu.class, "recharge_arg"), true);
    public final C09YA LLILLJJLI = new C09YA(this, AFwS215S0000000_26.get$arr$(26));
    public PaymentMethodInfo LLILLL;
    public Amount LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final String LLIZ;

    public final void CQ2() {
        if (vQ2(this.LLILZ) != EnumC1721630uu1.NORMAL) {
            return;
        }
        if (AQ2()) {
            setState(new AwS605S0100000_26(this, 53));
        } else {
            withState(new AwS605S0100000_26(this, 54));
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1721530utr(this, null), 3);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1721620uu0(0);
    }

    public final C1721560utu xQ2() {
        return (C1721560utu) this.LL.getValue();
    }

    public RechargeViewmodel() throws JSONException {
        C1721560utu c1721560utuXQ2 = xQ2();
        this.LLILZ = new Amount(CardStruct.IStatusCode.DEFAULT, CardStruct.IStatusCode.DEFAULT, c1721560utuXQ2 != null ? c1721560utuXQ2.LLJILLL : null);
        JSONObject jSONObject = new JSONObject();
        InterfaceC1713900uhY interfaceC1713900uhYLIZLLL = C1717770unn.LIZLLL();
        C844470XAv.LIZ.getClass();
        jSONObject.put("locale", interfaceC1713900uhYLIZLLL.getCurrentLocaleStr(C844470XAv.LIZ()));
        C1721560utu c1721560utuXQ22 = xQ2();
        jSONObject.put("mid", c1721560utuXQ22 != null ? c1721560utuXQ22.LLIZ : null);
        C1721560utu c1721560utuXQ23 = xQ2();
        jSONObject.put("muid", c1721560utuXQ23 != null ? c1721560utuXQ23.LLIZLLLIL : null);
        jSONObject.put("device_platform", "android");
        jSONObject.put("product", "");
        jSONObject.put("page", "");
        this.LLIZ = C786410Ut5.J3(jSONObject);
    }

    public final boolean AQ2() {
        C1721560utu c1721560utuXQ2 = xQ2();
        return u.LJIJI(c1721560utuXQ2 != null ? c1721560utuXQ2.LLJJJJ : null, "static", true);
    }

    public final String zQ2() throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        C1721560utu c1721560utuXQ2 = xQ2();
        String str5 = "";
        if (c1721560utuXQ2 == null || (str = c1721560utuXQ2.LLJI) == null) {
            str = "";
        }
        JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ(str, null);
        C1721560utu c1721560utuXQ22 = xQ2();
        jSONObjectLIZJ.put("from_merchant_id", c1721560utuXQ22 != null ? c1721560utuXQ22.LLIZ : null);
        C1721560utu c1721560utuXQ23 = xQ2();
        jSONObjectLIZJ.put("merchant_id", c1721560utuXQ23 != null ? c1721560utuXQ23.LLIZ : null);
        jSONObjectLIZJ.put("transfer_initiator_type", "receiver_presented_qrc");
        C1721560utu c1721560utuXQ24 = xQ2();
        if (c1721560utuXQ24 == null || (str2 = c1721560utuXQ24.LLJJJJ) == null) {
            str2 = "";
        }
        jSONObjectLIZJ.put("qr_code_type", str2);
        jSONObjectLIZJ.put("qr_amount_type", "fixed");
        C1721560utu c1721560utuXQ25 = xQ2();
        if (c1721560utuXQ25 == null || (str3 = c1721560utuXQ25.LLIZLLLIL) == null) {
            str3 = "";
        }
        jSONObjectLIZJ.put("wallet_user_id", str3);
        C1721560utu c1721560utuXQ26 = xQ2();
        if (c1721560utuXQ26 != null && (str4 = c1721560utuXQ26.LLJJ) != null) {
            str5 = str4;
        }
        jSONObjectLIZJ.put("scene_code", str5);
        return C786410Ut5.J3(jSONObjectLIZJ);
    }

    public static BigDecimal BQ2(String str) {
        boolean z;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str != null) {
                try {
                    return new BigDecimal(str);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }

    public final EnumC1721630uu1 vQ2(Amount amount) {
        BigDecimal bigDecimalLIZJ;
        BigDecimal bigDecimalLIZJ2;
        EnumC1721630uu1 enumC1721630uu1;
        String str;
        String str2;
        String str3;
        EnumC1721630uu1 enumC1721630uu12;
        this.LLILZ = amount;
        if (AQ2()) {
            BigDecimal bigDecimalLIZJ3 = C1721830uuL.LIZJ(amount.value);
            C1721560utu c1721560utuXQ2 = xQ2();
            String str4 = null;
            if (c1721560utuXQ2 != null) {
                str3 = c1721560utuXQ2.LLJJL;
            } else {
                str3 = null;
            }
            BigDecimal bigDecimalBQ2 = BQ2(str3);
            C1721560utu c1721560utuXQ22 = xQ2();
            if (c1721560utuXQ22 != null) {
                str4 = c1721560utuXQ22.LLJJLIIIJLLLLLLLZ;
            }
            BigDecimal bigDecimalBQ22 = BQ2(str4);
            if (bigDecimalBQ2 != null && bigDecimalLIZJ3.compareTo(bigDecimalBQ2) > 0) {
                enumC1721630uu12 = EnumC1721630uu1.MAX_EXCEED;
            } else if (bigDecimalBQ22 != null && bigDecimalLIZJ3.compareTo(bigDecimalBQ22) < 0) {
                enumC1721630uu12 = EnumC1721630uu1.MIN_BELOW;
            } else {
                enumC1721630uu12 = EnumC1721630uu1.NORMAL;
            }
            setState(new AwS605S0100000_26(enumC1721630uu12, 48));
            return enumC1721630uu12;
        }
        PaymentMethodInfo paymentMethodInfo = this.LLILLL;
        if (paymentMethodInfo != null && (str2 = paymentMethodInfo.maxAmount) != null) {
            bigDecimalLIZJ = C1721830uuL.LIZJ(str2);
        } else {
            bigDecimalLIZJ = BigDecimal.ZERO;
        }
        PaymentMethodInfo paymentMethodInfo2 = this.LLILLL;
        if (paymentMethodInfo2 != null && (str = paymentMethodInfo2.minAmount) != null) {
            bigDecimalLIZJ2 = C1721830uuL.LIZJ(str);
        } else {
            bigDecimalLIZJ2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalLIZJ4 = C1721830uuL.LIZJ(amount.value);
        if (bigDecimalLIZJ4.compareTo(bigDecimalLIZJ) > 0) {
            enumC1721630uu1 = EnumC1721630uu1.MAX_EXCEED;
        } else if (bigDecimalLIZJ4.compareTo(bigDecimalLIZJ2) < 0) {
            enumC1721630uu1 = EnumC1721630uu1.MIN_BELOW;
        } else {
            enumC1721630uu1 = EnumC1721630uu1.NORMAL;
        }
        setState(new AwS605S0100000_26(enumC1721630uu1, 49));
        return enumC1721630uu1;
    }

    public final void wQ2(boolean z) {
        if (AQ2() || vQ2(this.LLILZ) != EnumC1721630uu1.NORMAL) {
            return;
        }
        this.LLILZIL = z;
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        withState(new AwS605S0100000_26(this, 50));
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1721520utq(this, null), 3);
    }

    public final void yQ2(Map<String, Long> map) {
        if (AQ2()) {
            this.LLILLL = null;
            map.put("render_start_time", Long.valueOf(System.currentTimeMillis()));
            setState(new AwS605S0100000_26(this, 51));
        } else {
            setState(AFwS268S0000000_26.get$arr$(87));
            C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1721480utm(map, this, null), 3);
        }
    }

    public final void DQ2(EnumC488160JCk enumC488160JCk, EnumC1721510utp enumC1721510utp) {
        this.LLILZLL = false;
        if (this.LLILZIL) {
            wQ2(false);
        } else {
            withState(new AwS235S0300000_26(this, enumC488160JCk, enumC1721510utp, 2));
        }
    }
}
