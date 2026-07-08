package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass1455;
import X.C01GW;
import X.C08BQ;
import X.C0CCZ;
import X.C0VZ0;
import X.C10UI;
import X.C13DA;
import X.C145E;
import X.C1BCF;
import X.C1BLW;
import X.C202068144s;
import X.C2507009s4;
import X.C291700Bc0;
import X.C844020X9c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2203391BLl;
import X.InterfaceC842850X4p;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.tars.business.ILiveAsrGiftExp;
import com.ss.android.ugc.aweme.tars.resource.TarsResourceDownloadSpi;
import java.util.List;
import java.util.Map;
import jv6.a;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@C1BCF(distinctId = 109, taskType = "preload")
public final class PitayaInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PitayaInitTask";
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

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        boolean z;
        TarsResourceDownloadSpi tarsResourceDownloadSpi;
        Pair<String, Boolean> pairLIZ;
        if (!C10UI.LIZ()) {
            AnonymousClass1455.LIZ.LIZLLL("PitayaInitTask", null, null);
            final ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService.isInitedLiveSDK()) {
                iLiveOuterService.k4().LJJLJLI();
            } else {
                iLiveOuterService.j5(new C145E() { // from class: X.145D
                });
            }
            C13DA c13da = new C13DA();
            Object value = C2507009s4.LIZ.getValue();
            C01GW c01gw = C291700Bc0.LIZ;
            if (!Intrinsics.LJFF(c01gw.getValue(), "slm") && !Intrinsics.LJFF(c01gw.getValue(), "slm_bert")) {
                z = false;
            } else {
                z = true;
            }
            c13da.put(value, Boolean.valueOf(z));
            ILiveAsrGiftExp iLiveAsrGiftExp = (ILiveAsrGiftExp) PluggableExtentionKt.pluggableSpi$default(ILiveAsrGiftExp.class, false, false, false, 14, null);
            if (iLiveAsrGiftExp != null && (pairLIZ = iLiveAsrGiftExp.LIZ()) != null) {
                c13da.put(pairLIZ.getFirst(), pairLIZ.getSecond());
            }
            Map mapBuild = c13da.build();
            if (context != null && (tarsResourceDownloadSpi = (TarsResourceDownloadSpi) PluggableExtentionKt.pluggableSpi$default(TarsResourceDownloadSpi.class, false, false, false, 14, null)) != null) {
                tarsResourceDownloadSpi.LIZIZ(30000L, mapBuild);
            }
        } else {
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null && iPluginService.LIZLLL() != null) {
                C1BLW.LIZJ("com.ss.android.ugc.aweme.pitaya", new InterfaceC2203391BLl() { // from class: X.145B
                    @Override // X.InterfaceC2203391BLl
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC2425409eu
                    public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                        abstractC2457909k9.LJII();
                    }
                });
            }
        }
        if (Build.VERSION.SDK_INT >= 26 && context != null) {
            if (!C10UI.LIZ()) {
                if (!C08BQ.LIZ().contains("com.ss.android.ugc.aweme.gemini.nano")) {
                    C844020X9c c844020X9c = new C844020X9c();
                    c844020X9c.LIZ = "com.ss.android.ugc.aweme.gemini.nano";
                    c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.09OL
                        @Override // X.InterfaceC842850X4p
                        public final void LIZJ(String str, boolean z2) {
                            a.install(context);
                            Pair[] pairArr = new Pair[2];
                            if (str == null) {
                                str = "";
                            }
                            pairArr[0] = new Pair("packageName", str);
                            pairArr[1] = new Pair("success", "true");
                            C20684815ws.LJIILLIIL("gemini_nano_df", C2097608Jq.LJIIIIZZ(pairArr));
                        }

                        @Override // X.InterfaceC842850X4p
                        public final void LIZ(int i, String str, boolean z2) {
                            Pair[] pairArr = new Pair[3];
                            if (str == null) {
                                str = "";
                            }
                            pairArr[0] = new Pair("packageName", str);
                            pairArr[1] = new Pair("success", "false");
                            pairArr[2] = new Pair("reason", String.valueOf(i));
                            C20684815ws.LJIILLIIL("gemini_nano_df", C2097608Jq.LJIIIIZZ(pairArr));
                        }
                    };
                    c844020X9c.LIZIZ = true;
                    c844020X9c.LIZJ = false;
                    C202068144s c202068144s = new C202068144s(c844020X9c);
                    IPluginService iPluginService2 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                    if (iPluginService2 != null) {
                        iPluginService2.LJJI(c202068144s);
                        return;
                    }
                    return;
                }
                return;
            }
            IPluginService iPluginService3 = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService3 == null || iPluginService3.LIZLLL() == null) {
                return;
            }
            C1BLW.LIZJ("com.ss.android.ugc.aweme.gemini.nano", new InterfaceC2203391BLl() { // from class: X.145C
                @Override // X.InterfaceC2203391BLl
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC2425409eu
                public final void LIZ(AbstractC2457909k9 abstractC2457909k9) {
                    abstractC2457909k9.LJII();
                }
            });
        }
    }
}
