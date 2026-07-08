package com.ss.android.ugc.aweme.video;

import X.C09SU;
import X.C0C64;
import X.C0CCZ;
import X.C0CPH;
import X.C0VU1;
import X.C0VZ0;
import X.C15O7;
import X.C1913880zu6;
import X.C20237514Gn;
import X.C20237614Go;
import X.C2188811AlT;
import X.C2260008tK;
import X.C2344809Gs;
import X.C302510BtR;
import X.C799900VZk;
import X.C810670Vr7;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC303670BvJ;
import X.InterfaceC312970COp;
import X.InterfaceC799590VYf;
import Y.ACallableS412S0100000_4;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.simkit.model.hwdec.PlayerTypeAbConfigV2;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoBitRateABManager implements InterfaceC303670BvJ, InterfaceC312970COp {
    public static final VideoBitRateABManager LJFF = new VideoBitRateABManager();
    public static final HashSet<String> LJI;
    public RateSettingsResponse LIZ;
    public volatile boolean LIZIZ;
    public Boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile RateSettingsResponse LJ;

    public final synchronized void LJI() {
        if (this.LJ != null) {
            return;
        }
        C844470XAv.LIZ.getClass();
        String string = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "bitrate_manager_sp_rate_setting").getString("bitrate_manager_sp_rate_setting", null);
        if (string == null) {
            String lowerCase = !LJI.contains(C1913880zu6.LIZ()) ? "us" : C1913880zu6.LIZ().toLowerCase(Locale.US);
            Context contextLIZ = C844470XAv.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rate_settings/");
            sbLIZ.append(lowerCase);
            sbLIZ.append(".json");
            string = LIZLLL(contextLIZ, C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJ = (RateSettingsResponse) GsonProtectorUtils.fromJson(new Gson(), string, new TypeToken<RateSettingsResponse<PlayerTypeAbConfigV2>>() { // from class: X.0CPG
        }.getType());
    }

    /* JADX INFO: loaded from: classes4.dex */
    public class RequestConfigTask implements C0CCZ, InterfaceC799590VYf {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "VideoBitRateABManager$RequestConfigTask";
        }

        @Override // X.InterfaceC799590VYf
        public final /* synthetic */ int level() {
            return 1;
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.InterfaceC799590VYf
        public final /* synthetic */ int priority() {
            return 1;
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

        public final void LIZ() {
            try {
                RateSettingsResponse rateSettingsResponseLIZ = C09SU.LIZ();
                synchronized (VideoBitRateABManager.this) {
                    try {
                        if (VideoBitRateABManager.this.LIZLLL) {
                            return;
                        }
                        VideoBitRateABManager.this.LJ(rateSettingsResponseLIZ);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception th) {
            }
        }

        @Override // X.InterfaceC799590VYf
        public final C0VU1 threadType() {
            return C0VU1.IO;
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.BOOT_FINISH;
        }

        public RequestConfigTask() {
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C2344809Gs.LJ("RequestConfigTask");
            if (VideoBitRateABManager.this.LIZLLL) {
                return;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_rate_lock_opt", true) == 1) {
                LIZ();
                return;
            }
            synchronized (VideoBitRateABManager.this) {
                try {
                    if (VideoBitRateABManager.this.LIZLLL) {
                        return;
                    }
                    try {
                        VideoBitRateABManager.this.LJ(C09SU.LIZ());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        LJI = hashSet;
        hashSet.add("DE");
        hashSet.add("FR");
        hashSet.add("GB");
        hashSet.add("BR");
        hashSet.add("RU");
        hashSet.add("AE");
        hashSet.add("SA");
        hashSet.add("IT");
        hashSet.add("MX");
        hashSet.add("ES");
        hashSet.add("TR");
        hashSet.add("PL");
        hashSet.add("BD");
        hashSet.add("IN");
        hashSet.add("ID");
        hashSet.add("JP");
        hashSet.add("MY");
        hashSet.add("PH");
        hashSet.add("TH");
        hashSet.add("VN");
        hashSet.add("CN");
    }

    public final void LJIIIIZZ() {
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new RequestConfigTask());
        c0cph.LIZIZ();
    }

    public VideoBitRateABManager() {
        C20237514Gn.LIZIZ.LIZ.put(2, new C20237614Go(System.currentTimeMillis(), this));
        if (C302510BtR.LIZ()) {
            C15O7.LIZJ(new ACallableS412S0100000_4(this, 7));
            ColdLaunchRequestCombinerImpl.LIZJ().LIZIZ(this);
        }
    }

    @Override // X.InterfaceC303670BvJ
    public final void LIZ() {
        boolean zLIZ = C302510BtR.LIZ();
        Boolean bool = this.LIZJ;
        if (bool == null || zLIZ != bool.booleanValue()) {
            this.LIZJ = Boolean.valueOf(zLIZ);
            if (zLIZ) {
                LJII();
                return;
            }
            return;
        }
        if (!zLIZ || this.LIZLLL) {
            return;
        }
        LJII();
    }

    public final boolean LJFF() {
        return C302510BtR.LIZ() && this.LIZIZ;
    }

    public final void LJII() {
        if (!ColdLaunchRequestCombinerImpl.LIZJ().LIZ()) {
            LJIIIIZZ();
            return;
        }
        RateSettingCombineModel rateSettingCombineModel = (RateSettingCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse();
        if (rateSettingCombineModel != null) {
            if (rateSettingCombineModel.httpCode == 200 && rateSettingCombineModel.getRateSetting().status_code == 0) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "is_async_setting", true, true)) {
                    C15O7.LIZJ(new ACallableS412S0100000_4(this, 6));
                    return;
                } else {
                    LJ(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse()).getRateSetting());
                    return;
                }
            }
            if (rateSettingCombineModel.httpCode == 509) {
                return;
            }
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC312970COp
    public final void LIZIZ() {
        LJIIIIZZ();
    }

    @Override // X.InterfaceC312970COp
    public final void LIZJ() {
        LJII();
    }

    public final void LJ(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    LJIIIZ(rateSettingsResponse);
                    this.LIZLLL = true;
                    C20237514Gn.LIZIZ.LIZ(2, true);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZ(e);
                return;
            }
        }
        C20237514Gn.LIZIZ.LIZ(2, false);
    }

    public final void LJIIIZ(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null && rateSettingsResponse.isValid()) {
            try {
                synchronized (this) {
                    try {
                        this.LIZ = rateSettingsResponse;
                        C844470XAv.LIZ.getClass();
                        C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "bitrate_manager_sp_rate_setting").edit().putString("bitrate_manager_sp_rate_setting", new Gson().LJIILL(rateSettingsResponse)).apply();
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                this.LIZIZ = true;
            } catch (Exception th) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0029: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:33554473), block:B:15:0x0029 */
    public static String LIZLLL(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                try {
                    inputStreamOpen = context.getAssets().open(str);
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    TryCatchGuardChecker.doCheck(th);
                    C2260008tK.LIZ(closeable2);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                inputStreamOpen = null;
            }
            try {
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                C2260008tK.LIZ(inputStreamOpen);
                return str2;
            } catch (IOException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C2260008tK.LIZ(inputStreamOpen);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
