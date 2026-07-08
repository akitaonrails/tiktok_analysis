package com.ss.android.ugc.aweme.setting.page.security;

import X.C0TU2;
import X.C1537900q7g;
import X.C1541950qED;
import X.C20662915tL;
import X.C20684815ws;
import android.app.Activity;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;

/* JADX INFO: loaded from: classes13.dex */
public final class SecurityDeviceCell extends RightTextCell<C20662915tL> {
    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell, android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        C20684815ws.onEventV3("click_your_device");
        String strLIZ = C0TU2.LIZIZ.LIZ();
        if (strLIZ != null && (activity = this.LL) != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(strLIZ);
            sparkContext.LJJJZ("url", strLIZ);
            sparkContext.LJJJZ("append_common_params", "1");
            sparkContext.LJJJZ("use_spark", "1");
            sparkContext.LJJJZ("hide_nav_bar", "1");
            c1537900q7g.getClass();
            new C1541950qED(activity, sparkContext).LIZIZ();
        }
    }
}
