package com.bytedance.android.livesdk.i18n;

import X.C1151670g4j;
import X.C1151740g4q;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C325510CpR;
import X.C470590Icr;
import X.C480460Ism;
import X.C786410Ut5;
import X.InterfaceC1124980fNg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174908fb;
import Y.ARunnableS36S0110000_17;
import Y.AfS186S0100000_17;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nCenterTaskScheduleExp;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateMaxLengthSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveI18nUpdateRetrySetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
public final class I18nUpdateManager {
    public static final long[] LJIIJ = {3000, 6000, 9000, 60000, 60000, 60000, 600000};
    public static final I18nApi LJIIJJI;
    public final int LIZ;
    public final String LIZIZ;
    public final BPEAHandler LIZJ;
    public InterfaceC1124980fNg LIZLLL;
    public boolean LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public String LJIIIIZZ;
    public C11JF LJIIIZ;

    public interface I18nApi {
        @InterfaceC1501160pAQ("/webcast/setting/i18n/package/")
        C11NZ<C470590Icr<I18nApiResult>> update(@InterfaceC1501070pAH("locale") String str, @InterfaceC1501070pAH("cur_version") long j);

        @InterfaceC1501160pAQ("/webcast/setting/i18n/package/v2/")
        C11NZ<C470590Icr<I18nApiResultV2>> updateV2(@InterfaceC2174908fb int i, @InterfaceC1501070pAH("client_lp_desc") String str, @InterfaceC1501070pAH("force_full") Boolean bool);

        @InterfaceC1501160pAQ("/webcast/setting/i18n/package/v2/")
        C11NZ<C470590Icr<I18nApiResultV2>> updateV2(@InterfaceC1501070pAH("client_lp_desc") String str, @InterfaceC1501070pAH("force_full") Boolean bool);
    }

    static {
        C480460Ism.LIZ().getClass();
        LJIIJJI = (I18nApi) C480460Ism.LIZLLL(I18nApi.class);
    }

    public final void LIZ() {
        C20441214yg.LIZIZ("i18n_translation", "I18nUpdateManager destroy");
        this.LIZJ.removeCallbacksAndMessages(null);
        C11JF c11jf = this.LJIIIZ;
        if (c11jf != null && !c11jf.isDisposed()) {
            this.LJIIIZ.dispose();
        }
        this.LIZLLL = null;
    }

    public final void LIZIZ(Throwable th) {
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update on error: ");
        sbLIZ.append(th.toString());
        C20441214yg.LJ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF++;
        LiveI18nUpdateRetrySetting liveI18nUpdateRetrySetting = LiveI18nUpdateRetrySetting.INSTANCE;
        if (liveI18nUpdateRetrySetting.enable()) {
            if (this.LJFF > liveI18nUpdateRetrySetting.getMaxRetryCount()) {
                C20441214yg.LJ("i18n_translation", "update on error: max retry times reached");
                return;
            } else {
                C786410Ut5.LJLJJI(0, liveI18nUpdateRetrySetting.getRetryIntervalMs(this.LJFF), this.LIZJ);
                return;
            }
        }
        BPEAHandler bPEAHandler = this.LIZJ;
        int i = this.LJFF;
        long[] jArr = LJIIJ;
        if (i < 7 && i >= 0) {
            j = jArr[i];
        } else {
            j = jArr[6];
        }
        C786410Ut5.LJLJJI(0, j, bPEAHandler);
    }

    public final void LIZLLL(boolean z) {
        C11NZ<C470590Icr<I18nApiResultV2>> c11nzUpdateV2;
        C20441214yg.LIZIZ("i18n_translation", "live_i18n_center_fetch_api start");
        LiveI18nUpdateMaxLengthSetting liveI18nUpdateMaxLengthSetting = LiveI18nUpdateMaxLengthSetting.INSTANCE;
        boolean zIsEnable = liveI18nUpdateMaxLengthSetting.isEnable();
        int maxLength = liveI18nUpdateMaxLengthSetting.getMaxLength();
        if (zIsEnable) {
            c11nzUpdateV2 = LJIIJJI.updateV2(maxLength, this.LJIIIIZZ, Boolean.valueOf(z));
        } else {
            c11nzUpdateV2 = LJIIJJI.updateV2(this.LJIIIIZZ, Boolean.valueOf(z));
        }
        this.LJIIIZ = (C11JF) c11nzUpdateV2.LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJZ(new AfS186S0100000_17(this, 45), new AfS186S0100000_17(this, 46), new C1151740g4q(this, 3));
    }

    public final void LIZJ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update is called, current version is ");
        sbLIZ.append(j);
        sbLIZ.append(" currentVersionCode is ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJ && !this.LIZJ.hasMessages(0)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.LJI;
            if (jElapsedRealtime > j2 && jElapsedRealtime - j2 < 60000) {
                C20441214yg.LIZIZ("i18n_translation", "in freeze time, quit update");
                return;
            }
            this.LJII = j;
            this.LJIIIIZZ = str;
            this.LJ = true;
            boolean zLIZ = true ^ C325510CpR.LIZ();
            if (C325510CpR.LIZ()) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("request updateV2: versionCode - ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" forceFull - ");
                    sbLIZ2.append(zLIZ);
                    sbLIZ2.append(" locale - ");
                    sbLIZ2.append(this.LIZIZ);
                    C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ2));
                    if (LiveI18nCenterTaskScheduleExp.INSTANCE.isEnable(this.LIZ)) {
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).commitPTFTask("live_i18n_center_fetch_api", null, new ARunnableS36S0110000_17(this, zLIZ, 3));
                        return;
                    } else {
                        LIZLLL(zLIZ);
                        return;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJI("I18nUpdateManager", th);
                    return;
                }
            }
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("request updateV1: version - ");
                sbLIZ3.append(j);
                sbLIZ3.append(" locale - ");
                sbLIZ3.append(this.LIZIZ);
                C20441214yg.LIZIZ("i18n_translation", C2188811AlT.LIZIZ(sbLIZ3));
                this.LJIIIZ = (C11JF) LJIIJJI.update(this.LIZIZ, j).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJZ(new AfS186S0100000_17(this, 43), new AfS186S0100000_17(this, 44), new C1151740g4q(this, 2));
                return;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C20441214yg.LJI("I18nUpdateManager", th2);
                return;
            }
        }
        if (this.LJ) {
            C20441214yg.LIZIZ("i18n_translation", "now is downloading, quit update");
        } else {
            C20441214yg.LIZIZ("i18n_translation", "now is waiting for retry, quit update");
        }
    }

    public I18nUpdateManager(String str, InterfaceC1124980fNg interfaceC1124980fNg, int i) {
        C1151670g4j c1151670g4j = new C1151670g4j(this, 0);
        this.LJIIIZ = null;
        this.LIZIZ = str;
        this.LIZLLL = interfaceC1124980fNg;
        this.LIZ = i;
        this.LIZJ = new BPEAHandler(Looper.getMainLooper(), c1151670g4j);
    }
}
