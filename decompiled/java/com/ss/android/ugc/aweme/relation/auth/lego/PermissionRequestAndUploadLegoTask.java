package com.ss.android.ugc.aweme.relation.auth.lego;

import X.AbstractC848400XPy;
import X.C036E;
import X.C0CO3;
import X.C0XQ7;
import X.C1071540dzU;
import X.C1071650dzf;
import X.C1076010e6h;
import X.C10EU;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C800010VZv;
import X.C844470XAv;
import X.EnumC1070340dxY;
import X.EnumC799980VZs;
import X.InterfaceC304970BxP;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class PermissionRequestAndUploadLegoTask implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PermissionRequestAndUploadLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    static {
        int i = C2187451AjH.LIZ;
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0dze
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                C1076010e6h.LIZJ.LJIILJJIL();
            }
        });
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        String str;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            return;
        }
        if (z && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !C10EU.LJIIIIZZ()) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
                    boolean zLJ = c1076010e6h.LJII().LJ();
                    long jLJIIJ = c1076010e6h.LJII().LJIIJ(curUserId);
                    String str2 = "on";
                    if (c1076010e6h.LJII().LIZIZ()) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    boolean zLJ2 = c1076010e6h.LJIIJ().LJ();
                    if (!c1076010e6h.LJIIJ().LIZIZ()) {
                        str2 = "off";
                    }
                    C1071540dzU c1071540dzU = C1071540dzU.LIZIZ;
                    EnumC1070340dxY enumC1070340dxY = EnumC1070340dxY.MLBB;
                    Integer numLIZLLL = c1071540dzU.LJ(enumC1070340dxY).LIZLLL();
                    boolean zLIZIZ = c1071540dzU.LJ(enumC1070340dxY).LIZIZ();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("user_id", curUserId);
                    c2344009Gk.LIZJ(zLJ ? 1 : 0, "has_fb_token");
                    c2344009Gk.LIZLLL(jLJIIJ, "token_expire_time");
                    c2344009Gk.LJIIIIZZ("facebook_switch", str);
                    c2344009Gk.LIZJ(zLJ2 ? 1 : 0, "has_contact_permission");
                    c2344009Gk.LJIIIIZZ("contact_switch", str2);
                    c2344009Gk.LJ(c1076010e6h.LJII().LIZLLL(), "server_fb_token");
                    c2344009Gk.LJ(numLIZLLL, "has_mlbb_permission");
                    c2344009Gk.LIZJ(zLIZIZ ? 1 : 0, "mlbb_switch");
                    C20684815ws.LJIILLIIL("authorize_status_update", c2344009Gk.LIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        C1076010e6h c1076010e6h2 = C1076010e6h.LIZJ;
        boolean zLJ3 = c1076010e6h2.LJIIJ().LJ();
        boolean zLIZIZ2 = c1076010e6h2.LJIIJ().LIZIZ();
        Keva kevaLIZ = C1071650dzf.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("contact_sync_on_failure");
        sbLIZ.append(curUserId);
        boolean z2 = kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        if (zIsLogin && z && zLJ3 && !zLIZIZ2 && z2) {
            c1076010e6h2.LJJIIZI(true);
        }
        Keva kevaLIZ2 = C1071650dzf.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("contact_sync_on_failure");
        sbLIZ2.append(curUserId);
        kevaLIZ2.erase(C2188811AlT.LIZIZ(sbLIZ2));
        boolean zLJ4 = c1076010e6h2.LJII().LJ();
        boolean zLIZIZ3 = c1076010e6h2.LJII().LIZIZ();
        Keva kevaLIZ3 = C1071650dzf.LIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("facebook_sync_on_failure");
        sbLIZ3.append(curUserId);
        boolean z3 = kevaLIZ3.getBoolean(C2188811AlT.LIZIZ(sbLIZ3), false);
        if (zIsLogin && z && zLJ4 && !zLIZIZ3 && z3) {
            c1076010e6h2.LJIIIZ();
        }
        Keva kevaLIZ4 = C1071650dzf.LIZ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("facebook_sync_on_failure");
        sbLIZ4.append(curUserId);
        kevaLIZ4.erase(C2188811AlT.LIZIZ(sbLIZ4));
        boolean zLJ5 = c1076010e6h2.LJIIJ().LJ();
        boolean zLIZIZ4 = c1076010e6h2.LJIIJ().LIZIZ();
        Keva kevaLIZ5 = C1071650dzf.LIZ();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("click_contact_open_setting");
        sbLIZ5.append(curUserId);
        boolean z4 = kevaLIZ5.getBoolean(C2188811AlT.LIZIZ(sbLIZ5), false);
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && z && zLJ5 && !zLIZIZ4 && z4) {
            c1076010e6h2.LJJIIZI(false);
        }
        Keva kevaLIZ6 = C1071650dzf.LIZ();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("click_contact_open_setting");
        sbLIZ6.append(curUserId);
        kevaLIZ6.erase(C2188811AlT.LIZIZ(sbLIZ6));
    }
}
