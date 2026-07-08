package com.ss.android.ugc.tiktok.pns.ui;

import X.AbstractC848400XPy;
import X.C0XI4;
import X.C0XQ7;
import X.C19323510in;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.compliance.api.experiments.DigitalWellbeingEntranceSettings;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ShowTimeAwayReminderInAppPushAwemeRouteAction implements IRouteAction {
    public static final int $stable = 0;

    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        String strLIZ;
        int i;
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
            float fLIZIZ = C418440Gaw.LIZIZ(999);
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
            Drawable drawableLIZ = c384050F3z.LIZ(context);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = R.raw.icon_hourglass_fill;
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c419910GdJ.LIZ(context), drawableLIZ);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("screen_time_dashboard_lynx3", false)) {
                strLIZ = "aweme://roma_redirect/?spark_page=screen_time_dashboard";
            } else {
                strLIZ = DigitalWellbeingEntranceSettings.LIZ("aweme://lynxview/?channel=fe_tns_screen_time_homepage&bundle=digital-wellbeing-react/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1");
            }
            C0XI4 c0xi4 = new C0XI4(strLIZ);
            c0xi4.LJ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c0xi4.LJ("enter_from", "schedule_downtime_entrance");
            c0xi4.LJ("group", "digital_wellbeing");
            String strLJFF = c0xi4.LJFF();
            if (bundle != null) {
                i = bundle.getInt("minLeft");
            } else {
                i = 5;
            }
            new C19323510in(1016, "schedule_downtime_notice", new InnerPushConfig(0L, null, 0, Collections.singletonList(0), 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, Collections.singletonList(layerDrawableLJIILIIL), null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, context.getResources().getQuantityString(2131755030, i, String.valueOf(i)), null, 2, null, 3, context.getString(2131821617), null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, strLJFF, 12, null, null, null, null, null, 0), C2097608Jq.LJIIJ(new Pair("business_tag", "PnS_minor_safety")), null, 396).LIZIZ();
        }
        return Boolean.TRUE;
    }
}
