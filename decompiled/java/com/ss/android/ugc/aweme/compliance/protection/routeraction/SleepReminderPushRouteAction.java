package com.ss.android.ugc.aweme.compliance.protection.routeraction;

import X.C0JBW;
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
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepReminderPushRouteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zz);
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
            c419910GdJ.LJ = Integer.valueOf(R.attr.zw);
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c419910GdJ.LIZ(context), drawableLIZ);
            new C19323510in(1016, "sleep_hour_reminder", null, new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, Collections.singletonList(layerDrawableLJIILIIL), null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 1, Boolean.FALSE, 0, 0, 0, 0, 0, C0JBW.LIZJ(2131837335, new Object[0]), null, C0JBW.LIZJ(2131830462, new Object[0]), null, 2, null, 3, context.getString(2131845151), null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, "aweme://roma_redirect/?spark_page=daily_screen_time_setting", 12, null, null, null, null, null, 0), C2097608Jq.LJIIJ(new Pair("business_tag", "PnS")), null, 412).LIZIZ();
        }
        return Unit.LIZ;
    }
}
