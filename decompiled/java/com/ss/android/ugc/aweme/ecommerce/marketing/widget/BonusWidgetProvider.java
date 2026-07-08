package com.ss.android.ugc.aweme.ecommerce.marketing.widget;

import X.C0VI0;
import X.C0VI1;
import X.C0VIN;
import X.C1507790pL7;
import X.C1840650xzz;
import X.C1840660y00;
import X.C1840680y02;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C823050WQl;
import Y.ARunnableS60S0300000_27;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class BonusWidgetProvider extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        C0VI1 c0vi1LJII = C0VI1.LJII(context);
        c0vi1LJII.LJ("bonus_widget_refresh_immediate");
        c0vi1LJII.LJ("bonus_widget_refresh_periodic");
        Map<String, Bitmap> map = C1840650xzz.LIZ;
        C1840650xzz.LIZLLL(C2097608Jq.LJ());
        C1840660y00.LIZ();
        Keva repo = Keva.getRepo("keva_repo_bonus_widget");
        repo.storeString("last_install_track_info", "");
        repo.storeString("pending_install_type", "");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) throws JSONException {
        String curUserId;
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        AccountUserService accountUserServiceLJIIJ;
        super.onEnabled(context);
        C1840680y02.LIZ.getClass();
        Keva repo = Keva.getRepo("keva_repo_bonus_widget");
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        } else {
            curUserId = null;
        }
        String str2 = "";
        if (curUserId == null) {
            curUserId = "";
        }
        if (curUserId.length() == 0) {
            curUserId = "anonymous";
        }
        String strConcat = "has_installed_before_".concat(curUserId);
        if (repo.getBoolean(strConcat, false)) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
            repo.storeBoolean(strConcat, true);
        }
        try {
            String string = repo.getString("last_install_track_info", "");
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = new JSONObject(string);
            }
            jSONObject2.put("is_first_install_history", str);
            repo.storeString("last_install_track_info", C786410Ut5.J3(jSONObject2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1840680y02.LIZ.getClass();
        Keva repo2 = Keva.getRepo("keva_repo_bonus_widget");
        String string2 = repo2.getString("pending_install_type", "");
        if (string2 == null) {
            string2 = "";
        }
        repo2.storeString("pending_install_type", "");
        try {
            String string3 = repo2.getString("last_install_track_info", "");
            if (string3 != null) {
                str2 = string3;
            }
            if (str2.length() == 0) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str2);
            }
            if (string2.length() == 0) {
                string2 = "manual";
            }
            jSONObject.put("install_type", string2);
            repo2.storeString("last_install_track_info", C786410Ut5.J3(jSONObject));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject3 = new JSONObject();
        C1840680y02.LIZ.getClass();
        C1840680y02.LIZ(jSONObject3);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("tiktokec_widget_install", jSONObject3);
        C0VIN.LIZ(context, "bonus_widget_refresh_immediate", 0L, C0VI0.KEEP);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) throws JSONException {
        super.onDeleted(context, iArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDeleted appWidgetIds=");
        sbLIZ.append(Arrays.toString(iArr));
        C2188811AlT.LIZIZ(sbLIZ);
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        C1840680y02.LIZ.getClass();
        C1840680y02.LIZ(jSONObject);
        jSONObject.remove("reward_amount");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("tiktokec_widget_uninstall", jSONObject);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdate appWidgetIds=");
        sbLIZ.append(Arrays.toString(iArr));
        C2188811AlT.LIZIZ(sbLIZ);
        C823050WQl.LIZLLL().execute(new ARunnableS60S0300000_27(this, context, goAsync(), 1));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(final Context context, final AppWidgetManager appWidgetManager, final int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        int i2 = bundle.getInt("appWidgetMinWidth", 0);
        int i3 = bundle.getInt("appWidgetMinHeight", 0);
        int i4 = bundle.getInt("appWidgetMaxWidth", 0);
        int i5 = bundle.getInt("appWidgetMaxHeight", 0);
        final int iMax = Math.max(i2, i4);
        final int iMax2 = Math.max(i3, i5);
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0y01
            public final void LIZ() {
                int i6;
                try {
                    int i7 = iMax;
                    int iMin = (i7 <= 0 || (i6 = iMax2) <= 0) ? 0 : Math.min(i7, i6);
                    Map<String, Bitmap> map = C1840650xzz.LIZ;
                    appWidgetManager.updateAppWidget(i, C1840650xzz.LIZJ(iMin, context));
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                pendingResultGoAsync.finish();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BonusWidgetProvider@bbff.onAppWidgetOptionsChanged$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BonusWidgetProvider@bbff.onAppWidgetOptionsChanged$1");
            }
        });
    }
}
