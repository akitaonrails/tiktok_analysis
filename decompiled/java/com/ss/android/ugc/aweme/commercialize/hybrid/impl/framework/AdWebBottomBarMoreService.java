package com.ss.android.ugc.aweme.commercialize.hybrid.impl.framework;

import X.AbstractC1968807nS;
import X.C1035880d3y;
import X.C1038780d8e;
import X.C306390Bzh;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C997860c4e;
import Y.ACListenerS57S1200000_16;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.ui.IAdWebBottomBarMoreService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebBottomBarMoreService implements IAdWebBottomBarMoreService {
    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.web.ui.IAdWebBottomBarMoreService
    public final C997860c4e LIZ(Context context, String str, SparkContext sparkContext) {
        boolean z;
        int i;
        C997860c4e c997860c4e = new C997860c4e(context);
        if (str != null && sparkContext != null) {
            C1035880d3y c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class);
            boolean z2 = false;
            IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
            if (iAdWebUIUtils != null && iAdWebUIUtils.LJIJ(c1035880d3y)) {
                z = true;
            } else {
                z = false;
            }
            boolean zLIZ = C306390Bzh.LIZ();
            IAdWebShareService iAdWebShareService = (IAdWebShareService) PluggableExtentionKt.pluggableSpi$default(IAdWebShareService.class, false, false, false, 14, null);
            if (iAdWebShareService != null) {
                iAdWebShareService.LIZ(sparkContext);
            }
            IAdWebShareService iAdWebShareService2 = (IAdWebShareService) PluggableExtentionKt.pluggableSpi$default(IAdWebShareService.class, false, false, false, 14, null);
            if (iAdWebShareService2 != null && iAdWebShareService2.LIZIZ((AbstractC1968807nS) sparkContext.LJFF(AbstractC1968807nS.class))) {
                z2 = true;
            }
            C1038780d8e.LIZ.getClass();
            if ((Intrinsics.LJFF(str, "ad_history") && !z) || (Intrinsics.LJFF(str, "browser_setting") && !zLIZ)) {
                return c997860c4e;
            }
            if (Intrinsics.LJFF(str, "ad_report") && !z2) {
                return c997860c4e;
            }
            c997860c4e.LL = (TuxIconView) c997860c4e.findViewById(R.id.jy8);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            if (Intrinsics.LJFF(str, "ad_history")) {
                i = R.raw.icon_watch_history;
            } else if (Intrinsics.LJFF(str, "ad_web_refresh")) {
                i = R.raw.icon_arrow_clockwise;
            } else if (Intrinsics.LJFF(str, "ad_share_link")) {
                i = R.raw.icon_arrow_turn_up_right;
            } else if (Intrinsics.LJFF(str, "ad_copy_link")) {
                i = R.raw.icon_link;
            } else if (Intrinsics.LJFF(str, "ad_open_in_browser")) {
                i = R.raw.icon_compass;
            } else if (Intrinsics.LJFF(str, "browser_setting")) {
                i = R.raw.icon_gear;
            } else if (Intrinsics.LJFF(str, "ad_report")) {
                i = R.raw.icon_flag;
            } else {
                i = -1;
            }
            c419910GdJ.LIZ = i;
            TuxIconView tuxIconView = c997860c4e.LL;
            if (tuxIconView != null) {
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxIconView tuxIconView2 = c997860c4e.LL;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new ACListenerS57S1200000_16(sparkContext, c997860c4e, str, 0));
                return c997860c4e;
            }
        }
        return c997860c4e;
    }
}
