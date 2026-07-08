package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.C04TD;
import X.C0CAU;
import X.C0XQ5;
import X.C1257230ioz;
import X.C13BV;
import X.C19EG;
import X.C20515215Pi;
import X.C7740030o;
import X.InterfaceC2385309Wh;
import Y.ARunnableS45S0300000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.account.api.UserSettingsApi;
import com.ss.android.ugc.aweme.account.api.UserSettingsResponse;
import defpackage.SyncNicknameUsernameFrequencyControlModel;
import defpackage.a9;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SyncNicknameAndUsernamePopUpHelper implements ISyncNicknameAndUsernamePopUpHelper {
    public static UserSettingsResponse.UserSettingsData LIZLLL;
    public int LIZ;
    public String LIZIZ = "";
    public final int LIZJ = 3;

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized void LIZ() {
        SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequencyLJFF = LJFF();
        ArrayList arrayList = new ArrayList(syncNicknameAndUsernameFrequencyLJFF.showTime);
        arrayList.add(Long.valueOf(System.currentTimeMillis()));
        LJII(SyncNicknameAndUsernameFrequency.LIZ(syncNicknameAndUsernameFrequencyLJFF, 0L, arrayList, false, 5));
    }

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized void LIZIZ() {
        LJII(SyncNicknameAndUsernameFrequency.LIZ(LJFF(), 0L, null, true, 3));
    }

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized boolean LIZJ() {
        SyncNicknameUsernameFrequencyControlModel syncNicknameUsernameFrequencyControlModel;
        if (!C0XQ5.LIZ().isLogin()) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LIZIZ, C0XQ5.LIZLLL())) {
            this.LIZIZ = C0XQ5.LIZLLL();
            this.LIZ = 0;
            LIZLLL = null;
        }
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            syncNicknameUsernameFrequencyControlModel = a9.LIZ;
            SyncNicknameUsernameFrequencyControlModel syncNicknameUsernameFrequencyControlModel2 = (SyncNicknameUsernameFrequencyControlModel) settingsManagerLIZLLL.LJIIIIZZ("sync_nickname_username_frequency_control", SyncNicknameUsernameFrequencyControlModel.class, syncNicknameUsernameFrequencyControlModel);
            if (syncNicknameUsernameFrequencyControlModel2 != null) {
                syncNicknameUsernameFrequencyControlModel = syncNicknameUsernameFrequencyControlModel2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            syncNicknameUsernameFrequencyControlModel = a9.LIZ;
        }
        SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequencyLJFF = LJFF();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (syncNicknameAndUsernameFrequencyLJFF.isUpdated) {
            return false;
        }
        long days = TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis - syncNicknameAndUsernameFrequencyLJFF.lastApiTime);
        if (this.LIZ == 0 && syncNicknameAndUsernameFrequencyLJFF.lastApiTime != -1 && days < syncNicknameUsernameFrequencyControlModel.apiInterval) {
            return false;
        }
        for (String str : syncNicknameUsernameFrequencyControlModel.popUpFrequency.LJJIJIL()) {
            try {
                int i = CastIntegerProtector.parseInt(str);
                int iLJIIJJI = syncNicknameUsernameFrequencyControlModel.popUpFrequency.LJJIIZ(str).LJIIJJI();
                if (syncNicknameAndUsernameFrequencyLJFF.showTime.size() >= iLJIIJJI) {
                    List<Long> list = syncNicknameAndUsernameFrequencyLJFF.showTime;
                    if (TimeUnit.MILLISECONDS.toDays(jCurrentTimeMillis - ((Number) ListProtector.get(list, list.size() - iLJIIJJI)).longValue()) < i) {
                        return false;
                    }
                } else {
                    continue;
                }
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return true;
    }

    public final synchronized SyncNicknameAndUsernameFrequency LJFF() {
        Gson gson = C7740030o.LIZ().getGson();
        Keva repo = Keva.getRepo("sync_username_nickname_keva_repo");
        String strLIZLLL = C0XQ5.LIZLLL();
        C13BV c13bv = C13BV.INSTANCE;
        String string = repo.getString(strLIZLLL, GsonProtectorUtils.toJson(gson, new SyncNicknameAndUsernameFrequency(-1L, c13bv, false)));
        if (string == null) {
            return new SyncNicknameAndUsernameFrequency(-1L, c13bv, false);
        }
        try {
            return (SyncNicknameAndUsernameFrequency) gson.LJII(string, SyncNicknameAndUsernameFrequency.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new SyncNicknameAndUsernameFrequency(-1L, C13BV.INSTANCE, false);
        }
    }

    public static ISyncNicknameAndUsernamePopUpHelper LJ() {
        Object objLIZ = C04TD.LIZ(ISyncNicknameAndUsernamePopUpHelper.class, false);
        if (objLIZ != null) {
            return (ISyncNicknameAndUsernamePopUpHelper) objLIZ;
        }
        if (C04TD.LJLJJI == null) {
            synchronized (ISyncNicknameAndUsernamePopUpHelper.class) {
                if (C04TD.LJLJJI == null) {
                    C04TD.LJLJJI = new SyncNicknameAndUsernamePopUpHelper();
                }
            }
        }
        return C04TD.LJLJJI;
    }

    public final synchronized void LJII(SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequency) {
        Keva.getRepo("sync_username_nickname_keva_repo").storeString(C0XQ5.LIZLLL(), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), syncNicknameAndUsernameFrequency));
    }

    public final synchronized void LJI(Fragment fragment, C19EG c19eg) {
        ViewGroup viewGroup;
        View view = fragment.getView();
        C20515215Pi c20515215Pi = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            c20515215Pi = new C1257230ioz(viewGroup, true).LIZ;
        }
        this.LIZ = (this.LIZ + 1) % this.LIZJ;
        C0CAU.LIZIZ(new ARunnableS45S0300000_12(c19eg, fragment, c20515215Pi, 20));
    }

    @Override // com.ss.android.ugc.aweme.ISyncNicknameAndUsernamePopUpHelper
    public final synchronized void LIZLLL(final C19EG c19eg, final Fragment fragment, final Function0<Unit> function0) {
        if (!LIZJ()) {
            return;
        }
        SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequencyLJFF = LJFF();
        long jCurrentTimeMillis = System.currentTimeMillis();
        UserSettingsResponse.UserSettingsData userSettingsData = LIZLLL;
        if (userSettingsData != null && this.LIZ != 0) {
            LJI(fragment, c19eg);
            return;
        }
        if (this.LIZ == 0 || userSettingsData == null) {
            LJII(SyncNicknameAndUsernameFrequency.LIZ(syncNicknameAndUsernameFrequencyLJFF, jCurrentTimeMillis, null, false, 6));
            ((UserSettingsApi.Api) UserSettingsApi.LIZ.getValue()).userSettings(2, null).LIZLLL(new InterfaceC2385309Wh() { // from class: X.0iS0
                /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
                @Override // X.InterfaceC2385309Wh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object then(X.C15O7 r5) {
                    /*
                        r4 = this;
                        java.lang.String r3 = "SyncNicknameAndUsernamePopUpHelper@73ad.callUserSettingBeforeShowPopUp$1"
                        X.C1C7U.LIZ(r3)
                        java.lang.Object r0 = r5.LJIIL()
                        if (r0 == 0) goto L80
                        boolean r0 = X.C09UZ.LIZLLL(r5)
                        if (r0 == 0) goto L80
                        java.lang.Object r0 = r5.LJIIL()
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse r0 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse) r0
                        java.lang.String r2 = r0.message
                        r1 = 1
                        java.lang.String r0 = "success"
                        boolean r0 = kotlin.text.u.LJIJI(r0, r2, r1)
                        if (r0 == 0) goto L7a
                        java.lang.Object r0 = r5.LJIIL()
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse r0 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse) r0
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse$UserSettingsData r0 = r0.data
                        if (r0 == 0) goto L7a
                        java.lang.Object r0 = r5.LJIIL()
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse r0 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse) r0
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse$UserSettingsData r0 = r0.data
                        r1 = 0
                        if (r0 == 0) goto L78
                        java.lang.String r0 = r0.syncUsername2Nickname
                    L39:
                        boolean r0 = X.C123100dR.LIZ(r0)
                        if (r0 != 0) goto L5c
                        java.lang.Object r0 = r5.LJIIL()
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse r0 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse) r0
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse$UserSettingsData r0 = r0.data
                        if (r0 == 0) goto L4b
                        java.lang.String r1 = r0.syncNickname2Username
                    L4b:
                        boolean r0 = X.C123100dR.LIZ(r1)
                        if (r0 != 0) goto L5c
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1
                        r0.invoke()
                    L56:
                        kotlin.Unit r0 = kotlin.Unit.LIZ
                        X.C1C7U.LIZIZ(r3)
                        return r0
                    L5c:
                        com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper r1 = r2
                        java.lang.String r0 = X.C0XQ5.LIZLLL()
                        r1.LIZIZ = r0
                        java.lang.Object r0 = r5.LJIIL()
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse r0 = (com.ss.android.ugc.aweme.account.api.UserSettingsResponse) r0
                        com.ss.android.ugc.aweme.account.api.UserSettingsResponse$UserSettingsData r0 = r0.data
                        com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper.LIZLLL = r0
                        com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper r2 = r2
                        X.19EG r1 = r3
                        androidx.fragment.app.Fragment r0 = r4
                        r2.LJI(r0, r1)
                        goto L56
                    L78:
                        r0 = r1
                        goto L39
                    L7a:
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1
                        r0.invoke()
                        goto L56
                    L80:
                        kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r1
                        r0.invoke()
                        goto L56
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1242980iS0.then(X.15O7):java.lang.Object");
                }
            });
        }
    }
}
