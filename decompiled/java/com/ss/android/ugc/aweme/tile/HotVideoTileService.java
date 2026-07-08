package com.ss.android.ugc.aweme.tile;

import X.C09JN;
import X.C1150504el;
import X.C15O7;
import X.C1906580ziK;
import X.C1AF0;
import X.C20684815ws;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C788530UwV;
import X.C817700W5w;
import X.C844470XAv;
import X.InterfaceC2385309Wh;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class HotVideoTileService extends TileService {
    public volatile boolean LL;

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        Class<? extends Activity> clsLJLJJI;
        super.onClick();
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        if (iDeepLinkService == null || (clsLJLJJI = iDeepLinkService.LJLJJI("HotVideoTileService#onClick")) == null) {
            return;
        }
        if (!C2214201BlK.LJIIJJI) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClass(this, clsLJLJJI);
            intent.putExtra("from_tile_service", true);
            intent.addFlags(268435456);
            startActivityAndCollapse(intent);
            return;
        }
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        if (i <= 0) {
            i = 1233;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setClass(this, clsLJLJJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        sbLIZ.append(i);
        sbLIZ.append("://feed?tab=1");
        intent2.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        try {
            intent2.addFlags(268435456);
            intent2.putExtra("from_tile_service", true);
            startActivityAndCollapse(intent2);
            this.LL = false;
            C1906580ziK.LIZJ().LJIIJ().LJJLJLI(new C09JN() { // from class: X.1Ain
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("HotVideoTileService@f319.onClick$1");
                    if (((AbstractC1387200mCc) obj).LIZ instanceof InterfaceC1711206n0) {
                        this.LL.LL = true;
                    }
                    C1C7U.LIZIZ("HotVideoTileService@f319.onClick$1");
                }
            });
            C15O7.LJIIIIZZ(2500L).LJII(new InterfaceC2385309Wh() { // from class: X.1Air
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) throws JSONException {
                    C1C7U.LIZ("HotVideoTileService@f319.onClick$2");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("start_status", this.LIZ.LL ? 1 : 0);
                    C793770VBv.LJII("tile_service_open", jSONObject, null, null);
                    C1C7U.LIZIZ("HotVideoTileService@f319.onClick$2");
                    return c15o7;
                }
            }, C15O7.LJIIIIZZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("features", "watch_video");
        C20684815ws.LJIILLIIL("click_notificationbar", c2344009Gk.LIZ);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        long jUptimeMillis = SystemClock.uptimeMillis() - C1150504el.LIZ().LJJIIJZLJL;
        if (jUptimeMillis <= 1000) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jUptimeMillis, "time");
            c2344009Gk.LJIIIIZZ("features", "watch_video");
            C20684815ws.LJIILLIIL("active_in_notificationbar", c2344009Gk.LIZ);
        }
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
            qsTile.setLabel(getString(R.string.gjf));
            qsTile.updateTile();
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onStartListening() {
        super.onStartListening();
        Tile qsTile = getQsTile();
        if (qsTile != null) {
            qsTile.setState(1);
            qsTile.setLabel(getString(R.string.gjf));
            qsTile.updateTile();
        }
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileAdded() {
        super.onTileAdded();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("features", "watch_video");
        C20684815ws.LJIILLIIL("add_to_notificationbar", c2344009Gk.LIZ);
    }

    @Override // android.service.quicksettings.TileService
    public final void onTileRemoved() {
        super.onTileRemoved();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("features", "watch_video");
        C20684815ws.LJIILLIIL("delete_from_notificationbar", c2344009Gk.LIZ);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }
}
