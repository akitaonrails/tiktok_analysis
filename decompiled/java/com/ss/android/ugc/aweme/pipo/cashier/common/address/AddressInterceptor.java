package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C1388190mED;
import X.C1976907ol;
import X.C19EG;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressInterceptor implements IInterceptor {
    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C1976907ol.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String host;
        if (routeIntent != null) {
            host = routeIntent.getHost();
        } else {
            host = null;
        }
        return Intrinsics.LJFF(host, "pipo");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String path;
        String stringExtra;
        String stringExtra2;
        String stringExtra3 = null;
        if (routeIntent != null) {
            path = routeIntent.getPath();
        } else {
            path = null;
        }
        if (Intrinsics.LJFF(path, "/district/geo_select")) {
            if (context != null) {
                Intent extra = routeIntent.getExtra();
                if (extra != null) {
                    try {
                        stringExtra = extra.getStringExtra("geoname_id");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                } else {
                    stringExtra = null;
                }
                Intent extra2 = routeIntent.getExtra();
                if (extra2 != null) {
                    try {
                        stringExtra2 = extra2.getStringExtra("country_code");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        stringExtra2 = null;
                    }
                } else {
                    stringExtra2 = null;
                }
                Intent extra3 = routeIntent.getExtra();
                if (extra3 != null) {
                    try {
                        stringExtra3 = extra3.getStringExtra("without_next_level");
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                DistrictSelectFragment districtSelectFragment = new DistrictSelectFragment();
                Bundle arguments = districtSelectFragment.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                C786410Ut5.LJJJI("geoname_id", stringExtra, arguments);
                C786410Ut5.LJJJI("country_code", stringExtra2, arguments);
                arguments.putBoolean("without_next_level", Intrinsics.LJFF(stringExtra3, "1"));
                districtSelectFragment.setArguments(arguments);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    districtSelectFragment.hS(c19egLIZIZ, 0.6f);
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
