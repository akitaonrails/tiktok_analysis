package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C0X4T;
import X.C2214201BlK;
import X.C2407009bw;
import X.C308260C6m;
import X.C787960Uva;
import X.C823050WQl;
import X.C854790Xg5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ACallableS410S0100000_2;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TrafficPerfMonitorTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TrafficPerfMonitorTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return ColdBootTasksDegradeExperiment.LIZ().trafficPerfMonitorTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2407009bw.LIZ();
        if (!C0X4T.LIZ) {
            C0X4T.LIZ = true;
            C2214201BlK.LIZLLL().LIZIZ(new C854790Xg5(0));
            if (C308260C6m.LIZ()) {
                C787960Uva.LIZ.LJIIIZ(C0X4T.LJJJJI);
            }
            C823050WQl.LJ().scheduleWithFixedDelay(new Runnable() { // from class: X.0X4U
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TrafficPerfMonitor@6bb0.start$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TrafficPerfMonitor@6bb0.start$1");
                }

                public static void LIZ() throws JSONException {
                    Pair<Long, Long> pairLIZJ = C0X4T.LIZJ();
                    long jLongValue = pairLIZJ.getFirst().longValue();
                    long jLongValue2 = pairLIZJ.getSecond().longValue();
                    long j = jLongValue + jLongValue2;
                    if (C0X4T.LJJIL) {
                        C0X4T.LIZIZ = pairLIZJ;
                    } else {
                        long j2 = j - C0X4T.LJFF;
                        if (C0X4T.LJJJ) {
                            C0X4T.LJI += j2;
                        } else {
                            C0X4T.LJIIIIZZ += j2;
                        }
                    }
                    long j3 = C0X4T.LJI;
                    long j4 = C0X4T.LJIIIIZZ;
                    long j5 = C0X4T.LJIIJ;
                    long j6 = C0X4T.LJIIL;
                    long j7 = C0X4T.LJIILJJIL;
                    long j8 = C0X4T.LJIILLIIL;
                    long j9 = C0X4T.LJIJ;
                    long j10 = C0X4T.LJIJJ;
                    long j11 = C0X4T.LJIL;
                    long j12 = C0X4T.LJJI;
                    long j13 = C0X4T.LJJII;
                    long j14 = C0X4T.LJJIIJ;
                    long j15 = C0X4T.LJJIIZ;
                    long j16 = C0X4T.LJJIJ;
                    long j17 = C0X4T.LJJIJIIJIL;
                    boolean z = C0X4T.LJJJ && !C0X4T.LJJJIL;
                    boolean z2 = (C0X4T.LJJJ || C0X4T.LJJJIL) ? false : true;
                    C0X4T.LJJJIL = false;
                    long j18 = j - C0X4T.LIZJ;
                    if (j18 < 1024 || j18 > 109951162777600L) {
                        return;
                    }
                    long j19 = jLongValue - C0X4T.LIZLLL;
                    long j20 = jLongValue2 - C0X4T.LJ;
                    long j21 = j3 - C0X4T.LJII;
                    long j22 = j4 - C0X4T.LJIIIZ;
                    long j23 = j5 - C0X4T.LJIIJJI;
                    long j24 = j6 - C0X4T.LJIILIIL;
                    long j25 = j7 - C0X4T.LJIILL;
                    long j26 = j8 - C0X4T.LJIIZILJ;
                    long j28 = j9 - C0X4T.LJIJI;
                    long j29 = j10 - C0X4T.LJIJJLI;
                    long j30 = j11 - C0X4T.LJJ;
                    long j31 = j12 - C0X4T.LJJIFFI;
                    long j32 = j13 - C0X4T.LJJIII;
                    long j33 = j14 - C0X4T.LJJIIJZLJL;
                    long j34 = j15 - C0X4T.LJJIIZI;
                    long j35 = j16 - C0X4T.LJJIJIIJI;
                    long j36 = j17 - C0X4T.LJJIJIL;
                    C0X4T.LIZJ = j;
                    C0X4T.LIZLLL = jLongValue;
                    C0X4T.LJ = jLongValue2;
                    C0X4T.LJII = j3;
                    C0X4T.LJIIIZ = j4;
                    C0X4T.LJFF = j;
                    C0X4T.LJIIJJI = j5;
                    C0X4T.LJIILIIL = j6;
                    C0X4T.LJIILL = j7;
                    C0X4T.LJIIZILJ = j8;
                    C0X4T.LJIJI = j9;
                    C0X4T.LJIJJLI = j10;
                    C0X4T.LJJ = j11;
                    C0X4T.LJJIFFI = j12;
                    C0X4T.LJJIII = j13;
                    C0X4T.LJJIIJZLJL = j14;
                    C0X4T.LJJIIZI = j15;
                    C0X4T.LJJIJIIJI = j16;
                    C0X4T.LJJIJIL = j17;
                    if (C0X4T.LJJIL) {
                        C0X4T.LJJIL = false;
                        return;
                    }
                    boolean zIsNewUser = C104100aN.LIZ().isNewUser();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("total_bytes", String.valueOf(j18));
                    jSONObject.put("wifi_bytes", String.valueOf(j19));
                    jSONObject.put("mobile_bytes", String.valueOf(j20));
                    jSONObject.put("foreground_bytes", String.valueOf(j21));
                    jSONObject.put("background_bytes", String.valueOf(j22));
                    jSONObject.put("rx_bytes", String.valueOf(j23));
                    jSONObject.put("tx_bytes", String.valueOf(j24));
                    jSONObject.put("all_foreground", z);
                    jSONObject.put("all_background", z2);
                    jSONObject.put("history_total_bytes", String.valueOf(j));
                    jSONObject.put("history_wifi_bytes", String.valueOf(jLongValue));
                    jSONObject.put("history_mobile_bytes", String.valueOf(jLongValue2));
                    jSONObject.put("ttnet_bytes", String.valueOf(j25));
                    jSONObject.put("okhttp_bytes", String.valueOf(j26));
                    jSONObject.put("url_connection_bytes", String.valueOf(j28));
                    jSONObject.put("other_http_bytes", String.valueOf(j29));
                    jSONObject.put("ttnet_image_bytes", String.valueOf(j30));
                    jSONObject.put("ttnet_stream_bytes", String.valueOf(j31));
                    jSONObject.put("web_socket_bytes", String.valueOf(j32));
                    jSONObject.put("video_play_bytes", String.valueOf(j33));
                    jSONObject.put("video_preload_bytes", String.valueOf(j34));
                    jSONObject.put("live_bytes", String.valueOf(j35));
                    jSONObject.put("gecko_bytes", String.valueOf(j36));
                    jSONObject.put("is_first_install", zIsNewUser);
                    jSONObject.put("is_first_ten_minutes", C0X4T.LJJIZ);
                    C01GW c01gw = C0X4T.LJJJJ;
                    long j37 = ((Keva) c01gw.getValue()).getLong("traffic_last_total_bytes", 0L);
                    ((Keva) c01gw.getValue()).storeLong("traffic_last_total_bytes", j);
                    long j38 = j - j37;
                    if (1024 <= j38 && j38 < 109951162777601L) {
                        jSONObject.put("last_period_total_bytes", j38);
                    }
                    C15O7.LIZJ(new ACallableS410S0100000_2(jSONObject, 14));
                    if (C0X4T.LJJIZ) {
                        C0X4T.LJJIZ = false;
                        jSONObject.put("is_first_install", zIsNewUser);
                        C15O7.LIZJ(new ACallableS410S0100000_2(jSONObject, 15));
                    }
                }
            }, 0L, 600000L, TimeUnit.MILLISECONDS);
        }
    }
}
