package com.ss.android.ugc.aweme.settingsrequest.task;

import X.AbstractC305760Byg;
import X.C0CCZ;
import X.C0CO9;
import X.C0CQY;
import X.C0VZ0;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C2162308dZ;
import X.C2344809Gs;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1478005qU;
import X.InterfaceC2194071Atx;
import X.InterfaceC304970BxP;
import X.InterfaceC626120Oh8;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SettingsReaderInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SettingsReaderInitTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.0CL3
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                SettingsManagerProxy.inst().notifySettingsChange();
            }
        });
        C2344809Gs.LJ("SettingsReaderInitTask");
        SettingsManagerProxy.inst().registerSettingsWatcher(C0CO9.LIZIZ(), false);
        SettingsManagerProxy.inst().registerSettingsWatcher(new InterfaceC2194071Atx() { // from class: X.0C7H
            @Override // X.InterfaceC2194071Atx
            public final void LIZ(IESSettingsProxy iESSettingsProxy) {
                C844470XAv.LIZ.getClass();
                boolean z = false;
                SharedPreferences.Editor editorEdit = C844470XAv.LIZ().getSharedPreferences("keva_switch_repo", 0).edit();
                if (iESSettingsProxy.getKevaSwitch().intValue() == 1) {
                    z = true;
                }
                SharedPreferences.Editor editorPutStringSet = editorEdit.putBoolean("keva_switch", z).putStringSet("keva_blacklist", new HashSet(iESSettingsProxy.getKevaBlacklist()));
                ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), (k) C0C64.LJIILLIIL().LJJII(h.class, null, "keva_migrate_list", true), ArrayList.class);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                editorPutStringSet.putStringSet("keva_migrate", new HashSet(arrayList)).apply();
            }
        }, false);
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            try {
                C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0CNr
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<Long> c09aj) {
                        C1C7U.LIZ("ApiSpringLimitHelper@8a1e.loadConfig$1");
                        if (C312690CNn.LJ) {
                            long j = C312690CNn.LIZIZ;
                            if (j != 60000) {
                                c09aj.onNext(Long.valueOf(j));
                            }
                        } else {
                            long jLIZ = C312690CNn.LIZ();
                            if (jLIZ != 60000) {
                                c09aj.onNext(Long.valueOf(jLIZ));
                            }
                        }
                        C1C7U.LIZIZ("ApiSpringLimitHelper@8a1e.loadConfig$1");
                    }
                }).LJL(C1701940uOG.LIZIZ()).LJJJLZIJ(C11S5.LIZ()).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.0CNl
                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(Long l) {
                        C312690CNn.LIZIZ = l.longValue();
                        C312690CNn.LIZLLL = true;
                        C312690CNn.LJ = true;
                        C786410Ut5.LJLIIL(C312690CNn.LIZIZ, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0CLn
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ApiSpringLimitHelper@8a1e.loadConfig$2$onNext$1");
                                try {
                                    C312690CNn.LIZJ = true;
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ApiSpringLimitHelper@8a1e.loadConfig$2$onNext$1");
                            }
                        });
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        AbstractC305760Byg abstractC305760Byg = AbstractC305760Byg.LLIZLLLIL;
        ((ArrayList) abstractC305760Byg.LLIZ).add(new C0CQY() { // from class: X.0CQV
            @Override // X.C0CG2
            public final void LIZ(C0CG3 c0cg3) {
                ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJFF(new C0CG1(c0cg3));
                try {
                    SettingsManager.LIZLLL().getClass();
                    GeckoConfig geckoConfig = (GeckoConfig) SettingsManager.LJII("aweme_gecko_conf", GeckoConfig.class);
                    if (geckoConfig != null && !C086I.LIZIZ(geckoConfig.getInitialChannel())) {
                        List<String> initialChannel = geckoConfig.getInitialChannel();
                        List<String> initialHighPriorityChannel = geckoConfig.getInitialHighPriorityChannel();
                        List<String> dynamicChannel = geckoConfig.getDynamicChannel();
                        Context context2 = C1552050qUV.LIZ;
                        if (initialChannel != null) {
                            C0CQW<String> c0cqw = C0CQX.LIZLLL.getValue().LIZ;
                            synchronized (c0cqw) {
                                c0cqw.LIZ.addAll(initialChannel);
                            }
                        }
                        if (!C086I.LIZIZ(initialHighPriorityChannel)) {
                            C0CQX.LIZLLL.getValue().LIZIZ.LIZ(initialHighPriorityChannel);
                        }
                        if (!C086I.LIZIZ(dynamicChannel)) {
                            C0CQX.LIZLLL.getValue().LIZJ.LIZ(dynamicChannel);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                ISplashAdService iSplashAdService = (ISplashAdService) C792600V7i.LIZ(ISplashAdService.class);
                if (iSplashAdService != null) {
                    SettingsManager.LIZLLL().getClass();
                    iSplashAdService.LIZLLL(SettingsManager.LIZ("awesome_splash_filter_enable", false));
                }
                ((ISettingsRequestService) ServiceManager.get().getService(ISettingsRequestService.class)).LJIIJ();
            }
        });
    }
}
