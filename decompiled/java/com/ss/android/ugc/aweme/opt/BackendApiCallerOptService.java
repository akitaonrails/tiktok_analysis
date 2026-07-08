package com.ss.android.ugc.aweme.opt;

import X.AbstractC848400XPy;
import X.AnonymousClass0876;
import X.AnonymousClass0878;
import X.C09JN;
import X.C0XQ7;
import X.C10EU;
import X.C11S5;
import X.C1917707fD;
import X.InterfaceC586170Myt;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService;
import com.ss.android.ugc.aweme.opt.BackendParamsResp;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class BackendApiCallerOptService implements IBackendApiCallerOptService {
    public static final /* synthetic */ int LIZJ = 0;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public volatile Boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZJ() {
        LJ(false);
        if (!Intrinsics.LJFF(this.LIZIZ, Boolean.FALSE)) {
            return false;
        }
        AnonymousClass0876.LIZ.getClass();
        return ((String[]) AnonymousClass0876.LIZIZ.getValue()).length != 0;
    }

    public BackendApiCallerOptService() {
        if (LIZJ()) {
            C0XQ7.LJ();
            IAccountService iAccountService = C0XQ7.LIZ;
            if (iAccountService != null) {
                iAccountService.LJIILL(new InterfaceC586170Myt() { // from class: X.0872
                    @Override // X.InterfaceC586170Myt
                    public final void onAccountResult(int i, boolean z, int i2, User user) {
                        if (i != 1 && i != 2 && i != 3) {
                            return;
                        }
                        this.LL.LJ(true);
                        this.LL.LIZ.set(false);
                        C1917707fD.LIZ().erase("key_last_store_ts");
                        C1917707fD.LIZ().erase("key_backend_params_data");
                        this.LL.LIZ();
                    }
                });
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZ() {
        IAccountUserService iAccountUserServiceLJFF;
        if (!LIZJ() || this.LIZ.get()) {
            return;
        }
        long j = C1917707fD.LIZ().getLong("key_last_store_ts", 0L);
        final String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId = "";
        }
        String string = C1917707fD.LIZ().getString("key_data_identify", "");
        if (((Intrinsics.LJFF(string, "") || Intrinsics.LJFF(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId, string)) && j != 0 && System.currentTimeMillis() - j < 518400000) || (iAccountUserServiceLJFF = C0XQ7.LJFF()) == null || !((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin() || !this.LIZ.compareAndSet(false, true)) {
            return;
        }
        ((IBackendParamsFetchApi) AnonymousClass0878.LIZ.getValue()).fetchParams().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0871
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("BackendApiCallerOptService@5f63.checkAndSyncCommonParams$1");
                String str = ((BackendParamsResp) obj).data;
                if (str != null) {
                    String str2 = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId;
                    C1917707fD.LIZ().storeLong("key_last_store_ts", System.currentTimeMillis());
                    C1917707fD.LIZ().storeString("key_backend_params_data", str);
                    C1917707fD.LIZ().storeString("key_data_identify", str2);
                }
                C1C7U.LIZIZ("BackendApiCallerOptService@5f63.checkAndSyncCommonParams$1");
            }
        }, new C09JN() { // from class: X.0870
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                C1C7U.LIZ("BackendApiCallerOptService@5f63.checkAndSyncCommonParams$2");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetch: failed, err: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                if (th != null) {
                    th.printStackTrace();
                }
                C1C7U.LIZIZ("BackendApiCallerOptService@5f63.checkAndSyncCommonParams$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final void LIZIZ() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || !((AbstractC848400XPy) iAccountUserServiceLJFF).isLogin()) {
            return;
        }
        LJ(false);
        if (Intrinsics.LJFF(this.LIZIZ, Boolean.TRUE)) {
            return;
        }
        ((ILocationApi) AnonymousClass0878.LIZIZ.getValue()).activityDetect("2", u.LJJIFFI("https://location.tiktokv.com", ".com", ".v6.com", false)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.086z
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("BackendApiCallerOptService@5f63.checkAndSyncActivityDetect$1");
                C1C7U.LIZIZ("BackendApiCallerOptService@5f63.checkAndSyncActivityDetect$1");
            }
        }, new C09JN() { // from class: X.086y
            @Override // X.C09JN
            public final void accept(Object obj) {
                String message;
                C1C7U.LIZ("BackendApiCallerOptService@5f63.checkAndSyncActivityDetect$2");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("activityDetect: failed, err: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
                if (th != null) {
                    th.printStackTrace();
                }
                C1C7U.LIZIZ("BackendApiCallerOptService@5f63.checkAndSyncActivityDetect$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.network.spi.IBackendApiCallerOptService
    public final boolean LIZLLL(String str) {
        if (str == null || !LIZJ()) {
            return false;
        }
        AnonymousClass0876.LIZ.getClass();
        for (String str2 : (String[]) AnonymousClass0876.LIZIZ.getValue()) {
            if (Intrinsics.LJFF(str2, str)) {
                if (str2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void LJ(boolean z) {
        boolean z2;
        if (this.LIZIZ == null || z) {
            if (!C10EU.LJIILIIL() && !C0XQ7.LJFF().LIZ()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.LIZIZ = Boolean.valueOf(z2);
        }
    }
}
