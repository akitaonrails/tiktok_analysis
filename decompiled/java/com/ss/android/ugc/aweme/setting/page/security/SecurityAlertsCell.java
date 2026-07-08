package com.ss.android.ugc.aweme.setting.page.security;

import X.C0XQ7;
import X.C1537900q7g;
import X.C1541950qED;
import X.C15O7;
import X.C20684815ws;
import X.C848730XRf;
import X.C848750XRh;
import X.C854740Xg0;
import android.app.Activity;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.setting.page.base.RightIconCell;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityAlertsCell extends RightIconCell<C848750XRh> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightIconCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        SettingsManager.LIZLLL().getClass();
        String strLJI = SettingsManager.LJI("security_center", "");
        C20684815ws.onEventV3("click_security_alert");
        Activity activity = this.LL;
        if (activity != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(strLJI);
            sparkContext.LJJJZ("url", strLJI);
            sparkContext.LJJJZ("alerts_direct", "1");
            sparkContext.LJJJZ("enter_from", "settings_security");
            sparkContext.LJJJZ("append_common_params", "1");
            sparkContext.LJJJZ("use_spark", "1");
            sparkContext.LJJJZ("hide_nav_bar", "1");
            c1537900q7g.getClass();
            new C1541950qED(activity, sparkContext).LIZIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated(Object obj) {
        super.onItemViewCreated();
        setItem((C848730XRf) obj);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJFF().getSafeInfo().LJ(new C854740Xg0(this, 0), C15O7.LJIIIIZZ, null);
    }
}
