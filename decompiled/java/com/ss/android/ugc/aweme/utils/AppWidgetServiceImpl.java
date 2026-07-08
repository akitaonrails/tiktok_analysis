package com.ss.android.ugc.aweme.utils;

import X.C070L;
import X.C0CCZ;
import X.C0PEM;
import X.C1697810uHb;
import X.C1849710yEb;
import X.C20684815ws;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C2363509Nx;
import X.C2363609Ny;
import X.C823050WQl;
import Y.ARunnableS30S1200000_27;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.referral.ReferralWidgetLegoTask;
import com.ss.android.ugc.aweme.search.SearchWidgetTask;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.SocialWidgetLegoTask;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import com.ss.android.ugc.aweme.tablet.api.IDeviceCapability;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AppWidgetServiceImpl implements IAppWidgetService {
    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final List<C0CCZ> LIZ() {
        return C1697810uHb.LJIIJJI(new SocialWidgetLegoTask(), new ReferralWidgetLegoTask(), new SearchWidgetTask());
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final SocialWidgetLegoTask LIZLLL() {
        return new SocialWidgetLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final SearchWidgetTask LJFF() {
        return new SearchWidgetTask();
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJII() {
        return ((Boolean) C070L.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LIZIZ(Context context) {
        IStoryWidgetService iStoryWidgetService = (IStoryWidgetService) PluggableExtentionKt.pluggableSpi$default(IStoryWidgetService.class, false, false, false, 14, null);
        if (iStoryWidgetService != null) {
            return iStoryWidgetService.LJ(context);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LIZJ(String str, String str2) {
        C2363609Ny.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2363509Nx(str, str2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LJI(String str, String str2) {
        C2363609Ny.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("request_type", str);
        c2344009Gk.LJIIIIZZ("widget_type", str2);
        C20684815ws.LJIILLIIL("widget_request", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final Intent LJIIIZ(Context context, String str) {
        String str2 = AppWidgetLinkProxyActivity._pnsPageId;
        Intent intent = new Intent(context, (Class<?>) AppWidgetLinkProxyActivity.class);
        intent.putExtra("extra_widget_type", str);
        return intent;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LJIIJJI(Context context, List list) {
        C2363609Ny.LIZ.getClass();
        if (((Boolean) C070L.LIZ.getValue()).booleanValue() && !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            Intent intent = new Intent("com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((AppWidgetProvider) it2.next()).onReceive(context, intent);
            }
            return;
        }
        C823050WQl.LIZIZ().execute(new ARunnableS30S1200000_27(context, list, 1));
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final PendingIntent LJ(Context context, int i, Intent intent) {
        IDeviceCapability iDeviceCapability;
        C1849710yEb.LIZ.getClass();
        int iIntValue = ((Number) C1849710yEb.LIZIZ.getValue()).intValue();
        if (Build.VERSION.SDK_INT >= 26 && (iDeviceCapability = (IDeviceCapability) PluggableExtentionKt.pluggableSpi$default(IDeviceCapability.class, false, false, false, 14, null)) != null && iDeviceCapability.l()) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setLaunchDisplayId(0);
            return PendingIntent.getActivity(context, i, intent, iIntValue, activityOptionsMakeBasic.toBundle());
        }
        return PendingIntent.getActivity(context, i, intent, iIntValue);
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LJIIJ(int i, int i2, String str, String str2, String str3) {
        C2363609Ny.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("request_type", str);
        c2344009Gk.LJIIIIZZ("widget_type", str2);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        if (i == 0) {
            c2344009Gk.LIZJ(i2, "error_code");
            c2344009Gk.LJFF("error_msg", str3);
        }
        C20684815ws.LJIILLIIL("widget_response", c2344009Gk.LIZ);
    }
}
