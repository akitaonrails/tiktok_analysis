package com.ss.android.ugc.aweme.inbox.assem;

import X.C0NBD;
import X.C0RUJ;
import X.C1150504el;
import X.C15O7;
import X.C1618540sDk;
import X.C1903780zdo;
import X.C19212010Ec;
import X.C19EG;
import X.C20684815ws;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C889930Yvf;
import X.C890080Yvu;
import Y.ACallableS419S0100000_12;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import java.util.HashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxEnterMobEventByPushAssem extends BaseMainContainerAssem implements C0RUJ {
    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "inbox_enter_mob_event_by_push";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Intent intent;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"InboxEnterMobEventByPushAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (intent = c19egLIZ.getIntent()) != null) {
            bo(intent);
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    public static void bo(Intent intent) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String str;
        try {
            stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        if (!TextUtils.equals(stringExtra, "NOTIFICATION")) {
            return;
        }
        HashMap map = new HashMap();
        int iLJIIIIZZ = C1903780zdo.LJIIIIZZ();
        int iLIZ = C1903780zdo.LJII().LIZ();
        int iLJIILL = C1903780zdo.LJII().LJIILL();
        if (iLJIIIIZZ > 0) {
            map.put("notice_type", "number_dot");
        } else if (iLIZ > 0) {
            map.put("notice_type", "yellow_dot");
            iLJIIIIZZ = iLIZ;
        } else {
            map.put("notice_type", "report_null");
            iLJIIIIZZ = 0;
        }
        map.put("show_cnt", String.valueOf(iLJIIIIZZ));
        map.put("show_conv_cnt", String.valueOf(iLJIILL));
        map.put("message_cnt", String.valueOf(C1903780zdo.LJIIJ(99)));
        map.put("tab_name", "all");
        try {
            stringExtra2 = intent.getStringExtra("enter_from");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (stringExtra2 == null) {
            stringExtra2 = "push";
        }
        map.put("enter_from", stringExtra2);
        try {
            stringExtra3 = intent.getStringExtra("enter_method");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (stringExtra3 == null) {
            stringExtra3 = "deeplink";
        }
        map.put("enter_method", stringExtra3);
        try {
            String stringExtra4 = intent.getStringExtra("scenario");
            if (stringExtra4 != null) {
                map.put("scenario", stringExtra4);
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        C889930Yvf c889930Yvf = C889930Yvf.LIZ;
        c889930Yvf.getClass();
        if (C890080Yvu.LIZIZ.LIZJ(false)) {
            if (c889930Yvf.LJIIIZ()) {
                str = "on";
            } else {
                str = "off";
            }
            map.put("creator_inbox_status", str);
        }
        if (C19212010Ec.LIZJ.LJJLIIIJLJLI()) {
            map.put("activity_classification_status", "1");
        }
        C1618540sDk.LIZ();
        String str2 = C0NBD.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        map.put("inbox_session_id", str2);
        C15O7.LIZIZ(new ACallableS419S0100000_12(map, 0), C20684815ws.LJFF(), null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        bo(intent);
    }
}
