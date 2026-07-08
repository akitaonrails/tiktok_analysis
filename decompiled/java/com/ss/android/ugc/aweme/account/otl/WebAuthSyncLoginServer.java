package com.ss.android.ugc.aweme.account.otl;

import X.C01GW;
import X.C0PEM;
import X.C0WW0;
import X.C0WW2;
import X.C0WW5;
import X.C0XGR;
import X.C1BWL;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C818770W9z;
import X.C824450WVv;
import X.C824490WVz;
import X.EnumC604020Nma;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import com.ss.android.IWebAuthSyncLoginServer;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class WebAuthSyncLoginServer implements IWebAuthSyncLoginServer {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(91));

    @Override // com.ss.android.IWebAuthSyncLoginServer
    public final boolean LIZ() {
        if (!((C0WW5) this.LIZ.getValue()).LJI()) {
            return false;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C818770W9z(this, null), 3);
        return true;
    }

    public static void LIZLLL(String str, String str2, String str3, InterfaceC1631620sYq interfaceC1631620sYq) {
        if (LoginSyncService.LLILLJJLI) {
            C824450WVv.LIZ(C1BWL.LIZ());
            interfaceC1631620sYq.invoke(Boolean.TRUE, null, EnumC604020Nma.BROWSER);
        } else {
            String string = UUID.randomUUID().toString();
            LIZJ(str, str2, "48f247a7-1a36-4e87-8532-c7e6972562c2", string, str3, new C824490WVz(interfaceC1631620sYq, str, str2, string, null));
        }
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5, Function2 function2) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("start_url", str);
        c0xgr.LIZLLL("target_url", str2);
        C20684815ws.LJIILLIIL("web_otl_token_request", c0xgr.LIZ);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0WW2(str4, str5, str3, str, str2, function2, null), 3);
    }

    @Override // com.ss.android.IWebAuthSyncLoginServer
    public final void LIZIZ(String str, String str2, String str3, Activity activity, boolean z, InterfaceC1631620sYq<? super Boolean, ? super String, ? super EnumC604020Nma, Unit> interfaceC1631620sYq) {
        if (z) {
            if (!((C0WW5) this.LIZ.getValue()).LJI()) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("error_msg", "browser not supported");
                C20684815ws.LJIILLIIL("web_otl_custom_tab_check_failed", c0xgr.LIZ);
            } else if (activity == null) {
                C0XGR c0xgr2 = new C0XGR();
                c0xgr2.LIZLLL("error_msg", "activity is required but null");
                C20684815ws.LJIILLIIL("web_otl_custom_tab_check_failed", c0xgr2.LIZ);
            } else {
                String string = UUID.randomUUID().toString();
                LIZJ(str, str2, "844ecf00-f83f-472c-9900-c42cb51601e0", string, str3, new C0WW0(interfaceC1631620sYq, this, activity, str, str2, string, str3, null));
                return;
            }
        }
        LIZLLL(str, str2, str3, interfaceC1631620sYq);
    }
}
