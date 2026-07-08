package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0LAB;
import X.C0VZ0;
import X.C0WZX;
import X.C10EU;
import X.C13LQ;
import X.C19260410Ws;
import X.C20684815ws;
import X.C2107108Nh;
import X.C2204961BRm;
import X.C2222691Bz1;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSDeviceConsentService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes35.dex */
public final class InitSysAppTask implements C0CCZ {
    public final Set<String> LL = C13LQ.LJLIIL(new String[]{"PK", "BD", "BN", "PH", "TH", "MY", "MM", "KH", "LA", "IL", "CO", "PE", "AR", "VE", "EC", "CL", "BO", "PY", "GT", "NI", "UY", "DO", "PA", "SV", "HN", "SR", "GY", "TT", "BZ", "JM", "GF", "NG"});

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitSysAppTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws Throwable {
        String storeRegionUpperCase;
        Bundle bundle;
        ContentResolver contentResolver;
        Cursor cursorLJJIL;
        long j;
        long j2;
        String string;
        if (context == null || Build.VERSION.SDK_INT < 26 || C10EU.LJIILIIL()) {
            return;
        }
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.tiktok.manager", 0);
            IPNSDeviceConsentService iPNSDeviceConsentService = (IPNSDeviceConsentService) PluggableExtentionKt.pluggableSpi$default(IPNSDeviceConsentService.class, false, false, false, 14, null);
            ?? r2 = 0;
            Throwable th = null;
            r2 = 0;
            ?? r22 = 0;
            if (iPNSDeviceConsentService != null && iPNSDeviceConsentService.LJII(null) && !C19260410Ws.LJFF()) {
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                String str = "";
                if (iAccountService == null || (storeRegionUpperCase = iAccountService.getStoreRegionUpperCase()) == null) {
                    storeRegionUpperCase = "";
                }
                if (!this.LL.contains(storeRegionUpperCase) || !C0C64.LJIILLIIL().LJIIIZ(31744, "run_sys_app", true, false)) {
                    return;
                }
                int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 3, "sys_app_keep_alive_interval", true);
                long j3 = 0;
                long j4 = Keva.getRepo("sys_app_check_repo").getLong("last_run_at", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j5 = ((long) iLJIJ) * 24 * 60 * 60 * 1000;
                if (j4 != 0 && jCurrentTimeMillis - j4 < j5) {
                    return;
                }
                try {
                    try {
                        try {
                            bundle = new Bundle();
                            C786410Ut5.LJJJI("region", storeRegionUpperCase, bundle);
                            bundle.putBoolean("is_tiktok_region", C2222691Bz1.LJIIIIZZ());
                            contentResolver = context.getContentResolver();
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    if (contentResolver != null) {
                        cursorLJJIL = C2204961BRm.LJJIL(contentResolver, Uri.parse("content://com.tiktok.manager.sys_start_provider"), null, bundle, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatZJDn0SIS/ow8O7CsWeCOwi69LnBRhcKOWA==", null));
                        if (cursorLJJIL != null) {
                            try {
                                if (cursorLJJIL.moveToFirst()) {
                                    try {
                                        AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(cursorLJJIL, 83);
                                        Object objInvoke = awS612S0100000_33.invoke("current_version_name");
                                        if (((Number) objInvoke).intValue() < 0) {
                                            objInvoke = null;
                                        }
                                        Integer num = (Integer) objInvoke;
                                        if (num != null && (string = cursorLJJIL.getString(num.intValue())) != null) {
                                            str = string;
                                        }
                                        Object objInvoke2 = awS612S0100000_33.invoke("current_version_code");
                                        if (((Number) objInvoke2).intValue() < 0) {
                                            objInvoke2 = null;
                                        }
                                        Integer num2 = (Integer) objInvoke2;
                                        if (num2 != null) {
                                            j = cursorLJJIL.getLong(num2.intValue());
                                        } else {
                                            j = 0;
                                        }
                                        Object objInvoke3 = awS612S0100000_33.invoke("update_version_code");
                                        if (((Number) objInvoke3).intValue() < 0) {
                                            objInvoke3 = null;
                                        }
                                        Integer num3 = (Integer) objInvoke3;
                                        if (num3 != null) {
                                            j3 = cursorLJJIL.getLong(num3.intValue());
                                        }
                                        Object objInvoke4 = awS612S0100000_33.invoke("update_time");
                                        if (((Number) objInvoke4).intValue() < 0) {
                                            objInvoke4 = null;
                                        }
                                        Integer num4 = (Integer) objInvoke4;
                                        if (num4 != null) {
                                            j2 = cursorLJJIL.getLong(num4.intValue());
                                        } else {
                                            j2 = 0;
                                        }
                                        C0LAB c0lab = new C0LAB();
                                        c0lab.LJ("current_version_name", str);
                                        c0lab.LIZIZ(j, "current_version_code");
                                        c0lab.LIZIZ(j3, "update_version_code");
                                        c0lab.LIZIZ(j2, "update_time");
                                        C20684815ws.LJIILLIIL("sys_app_update_record", c0lab.LIZ);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = null;
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            try {
                                                throw th;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                while (true) {
                                                    try {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C2107108Nh.LIZ(cursorLJJIL, th);
                                                        throw th;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            th = th;
                                        }
                                    }
                                }
                                C2107108Nh.LIZ(cursorLJJIL, null);
                            } catch (Throwable th8) {
                                th = th8;
                            }
                        }
                    } else {
                        cursorLJJIL = null;
                    }
                    Keva.getRepo("sys_app_check_repo").storeLong("last_run_at", System.currentTimeMillis());
                    if (cursorLJJIL != null) {
                        cursorLJJIL.close();
                    }
                } catch (Exception e2) {
                    e = e2;
                    r22 = storeRegionUpperCase;
                    TryCatchGuardChecker.doCheck(e);
                    if (r22 != 0) {
                        r22.close();
                    }
                } catch (Throwable th9) {
                    th = th9;
                    r2 = storeRegionUpperCase;
                    TryCatchGuardChecker.doCheck(th);
                    if (r2 != 0) {
                        r2.close();
                    }
                    throw th;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
