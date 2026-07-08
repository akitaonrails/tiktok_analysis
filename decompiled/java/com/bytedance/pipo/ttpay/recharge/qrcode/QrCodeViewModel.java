package com.bytedance.pipo.ttpay.recharge.qrcode;

import X.C09YA;
import X.C1716310ulR;
import X.C1717770unn;
import X.C1721880uuQ;
import X.C1721890uuR;
import X.C1721920uuU;
import X.C23250099c;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1721900uuS;
import X.InterfaceC0148002o;
import X.InterfaceC1713900uhY;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import defpackage.c5;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class QrCodeViewModel extends AssemViewModel<C1721920uuU> {
    public final C09YA LL = new C09YA(this, AFwS215S0000000_26.get$arr$(29));
    public C1721880uuQ LLILLJJLI;
    public boolean LLILLL;
    public final String LLILZ;
    public final long LLILZIL;
    public Map<String, String> LLILZLL;
    public int LLIZ;
    public long LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1721920uuU(null, null);
    }

    public QrCodeViewModel() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        InterfaceC1713900uhY interfaceC1713900uhYLIZLLL = C1717770unn.LIZLLL();
        C844470XAv.LIZ.getClass();
        jSONObject.put("locale", interfaceC1713900uhYLIZLLL.getCurrentLocaleStr(C844470XAv.LIZ()));
        C1721880uuQ c1721880uuQ = this.LLILLJJLI;
        jSONObject.put("mid", c1721880uuQ != null ? c1721880uuQ.LLILZLL : null);
        C1721880uuQ c1721880uuQ2 = this.LLILLJJLI;
        jSONObject.put("muid", c1721880uuQ2 != null ? c1721880uuQ2.LLIZ : null);
        jSONObject.put("device_platform", "android");
        jSONObject.put("product", "");
        jSONObject.put("page", "");
        this.LLILZ = C786410Ut5.J3(jSONObject);
        Integer num = c5.LIZ().pollingInterval;
        this.LLILZIL = ((long) (num != null ? num.intValue() : 5)) * 1000;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL = true;
        C1721880uuQ c1721880uuQ = this.LLILLJJLI;
        Map<String, String> map = null;
        if (u.LJIJI(c1721880uuQ != null ? c1721880uuQ.LLJIJIL : null, "static", true)) {
            return;
        }
        if (getState().LL == EnumC1721900uuS.SUCCESS && getState().LL == EnumC1721900uuS.FAILED) {
            return;
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> map2 = this.LLILZLL;
        if (map2 != null) {
            map2.put("loop_count", String.valueOf(this.LLIZ));
            map2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "cancel");
            map2.put("time_cost", String.valueOf(System.currentTimeMillis() - this.LLIZLLLIL));
            map = map2;
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_qr_code_order_update", map);
    }

    public final void vQ2(Map<String, String> map) {
        String str;
        String str2;
        C1721880uuQ c1721880uuQ;
        String str3;
        this.LLILZLL = map;
        this.LLILLL = true;
        C1721880uuQ c1721880uuQ2 = this.LLILLJJLI;
        if (c1721880uuQ2 != null) {
            str = c1721880uuQ2.LLJIJIL;
        } else {
            str = null;
        }
        if (u.LJIJI(str, "static", true)) {
            return;
        }
        C1721880uuQ c1721880uuQ3 = this.LLILLJJLI;
        if (c1721880uuQ3 != null) {
            str2 = c1721880uuQ3.LLILLL;
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0 || (c1721880uuQ = this.LLILLJJLI) == null || (str3 = c1721880uuQ.LL) == null || str3.length() == 0) {
            setState(AFwS268S0000000_26.get$arr$(96));
        }
        this.LLIZ = 0;
        this.LLIZLLLIL = System.currentTimeMillis();
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1721890uuR(this, map, null), 3);
    }
}
