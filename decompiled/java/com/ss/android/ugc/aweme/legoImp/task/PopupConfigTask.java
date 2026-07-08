package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC19515011Wq;
import X.C0CCZ;
import X.C0VZ0;
import X.C19514711Wn;
import X.C20608715kb;
import X.C20610615ku;
import X.C20625815nM;
import X.C20651715rX;
import X.C20651815rY;
import X.C20651915rZ;
import X.C20656115sF;
import X.C2187451AjH;
import X.C2213981Bky;
import X.C786410Ut5;
import X.C849850XVn;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20658015sY;
import android.app.Application;
import android.content.Context;
import com.bytedance.poplayer.core.PopupManager;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupConfigTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PopupConfigTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(final Context context) {
        C20608715kb c20608715kb = new C20608715kb();
        Context applicationContext = ((C2213981Bky) c20608715kb.LIZ()).getApplicationContext();
        C20651715rX c20651715rX = new C20651715rX();
        c20651715rX.LIZ = ((C2213981Bky) c20608715kb.LIZ()).isDebug();
        ((C2213981Bky) c20608715kb.LIZ()).isDebug();
        c20651715rX.LIZIZ = new C20610615ku(c20608715kb);
        c20651715rX.LJ = new C20625815nM(c20608715kb);
        c20651715rX.LJFF = c20608715kb.LIZIZ().LJFF();
        c20651715rX.LJII = c20608715kb.LIZIZ().LJIIIIZZ();
        c20651715rX.LJIIIIZZ = c20608715kb.LIZIZ().LJIIIZ();
        c20608715kb.LIZIZ().LJII();
        c20651715rX.LJIIIZ = c20608715kb.LIZIZ().LJIIJ();
        ExecutorService executorServiceLIZLLL = c20608715kb.LIZIZ().LIZLLL();
        if (executorServiceLIZLLL != null) {
            c20651715rX.LJIIJJI = executorServiceLIZLLL;
        }
        Function1<String, Unit> function1LIZIZ = c20608715kb.LIZIZ().LIZIZ();
        if (function1LIZIZ != null) {
            c20651715rX.LJI = function1LIZIZ;
        }
        c20651715rX.LIZLLL = c20608715kb.LIZIZ().LIZ();
        c20651715rX.LJIIJ = c20608715kb.LIZIZ().LIZJ();
        C20651815rY c20651815rY = new C20651815rY(c20651715rX);
        ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = PopupManager.LIZIZ;
        int i = C2187451AjH.LIZ;
        C20651915rZ.LIZIZ("=== popup manager init ====");
        PopupManager.LIZ = System.currentTimeMillis();
        new WeakReference(C786410Ut5.N3(applicationContext));
        PopupManager.LJI = c20651815rY;
        boolean z = applicationContext instanceof Application;
        c20608715kb.LIZIZ().LJIIJJI();
        if (C849850XVn.LIZIZ.LIZJ().LJJ("video")) {
            C19514711Wn.LJ.add(new AbstractC19515011Wq() { // from class: X.11Wu
                @Override // X.AbstractC19515011Wq
                public final void LIZ(final C19514611Wm c19514611Wm, String... strArr) {
                    Map<String, String> map;
                    if (c19514611Wm != null && (map = c19514611Wm.LJI) != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (Intrinsics.LJFF(entry.getKey(), "blacklist") && C13LQ.LJJIJIIJI(entry.getValue(), strArr) >= 0) {
                                c19514611Wm.LIZJ();
                                return;
                            }
                        }
                    }
                    if (C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) >= 0) {
                        final Context context2 = context;
                        PopupManager.LJIJ(new C10GR() { // from class: X.11Wt
                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return 210;
                            }

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19FO c19fo;
                                Context context3 = context2;
                                if (!(context3 instanceof C19EG) || (c19fo = (C19FO) context3) == null) {
                                    return null;
                                }
                                return new C688120Qyw(context3, c19fo, null);
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                InterfaceC19515111Wr interfaceC19515111Wr;
                                C19514611Wm c19514611Wm2 = c19514611Wm;
                                if (c19514611Wm2 != null) {
                                    interfaceC19515111Wr = c19514611Wm2.LJFF;
                                } else {
                                    interfaceC19515111Wr = null;
                                }
                                C19774212Yi c19774212Yi = new C19774212Yi(c20656615sK, interfaceC19515111Wr, 0);
                                if (c19514611Wm2 != null) {
                                    c19514611Wm2.LJFF = c19774212Yi;
                                    c19514611Wm2.LIZJ();
                                }
                            }
                        }, "video", new C1668306g5("creator_video_general"));
                    } else {
                        if (c19514611Wm == null) {
                            return;
                        }
                        c19514611Wm.LIZJ();
                    }
                }
            });
        }
    }
}
