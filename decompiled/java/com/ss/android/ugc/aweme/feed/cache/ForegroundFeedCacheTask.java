package com.ss.android.ugc.aweme.feed.cache;

import X.C0AOW;
import X.C0CCZ;
import X.C0CD2;
import X.C0NEA;
import X.C0NET;
import X.C0VU1;
import X.C0VZ0;
import X.C1478160oZK;
import X.C1483340ohg;
import X.C15O7;
import X.C279830Axx;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2385309Wh;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.cache.ForegroundFeedCacheTask;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ForegroundFeedCacheTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ForegroundFeedCacheTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL;
    }

    public ForegroundFeedCacheTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean zLJIIJJI;
        boolean z = false;
        if (C279830Axx.LIZ()) {
            C0NEA.LIZ.getClass();
            LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
            if (C1478160oZK.LIZ() != null) {
                zLJIIJJI = C1478160oZK.LIZ().LJIIJJI();
            } else {
                return;
            }
        } else {
            LruCache<String, SimVideoUrlModel> lruCache2 = C1483340ohg.LIZ;
            if (C1478160oZK.LIZ() != null) {
                zLJIIJJI = C1478160oZK.LIZ().LJIIJJI();
            } else {
                return;
            }
        }
        if (zLJIIJJI) {
            EnumC799870VZh enumC799870VZh = this.LL;
            if (enumC799870VZh == EnumC799870VZh.IDLE) {
                C0NET.LIZ.getClass();
                C0NET.LJIJI(false);
            } else {
                if (enumC799870VZh != EnumC799870VZh.BOOT_FINISH) {
                    return;
                }
                if (C0CD2.LJ() != -1) {
                    z = true;
                }
                if (z) {
                    C15O7.LJIIIIZZ(C0CD2.LJ() * 1000).LJ(new InterfaceC2385309Wh() { // from class: X.0O4v
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7<Void> c15o7) {
                            C1C7U.LIZ("ForegroundFeedCacheTask@2892.run$1");
                            if (C279830Axx.LIZ()) {
                                C0NEA.LIZ.getClass();
                                if (C0NEA.LIZIZ) {
                                    C0NEA.LIZIZ = false;
                                    InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
                                    if (interfaceC1482870ogvLIZ != null) {
                                        interfaceC1482870ogvLIZ.LJJI(C0NEA.LJFF);
                                    }
                                }
                            } else {
                                InterfaceC1482870ogv interfaceC1482870ogvLIZ2 = C1478160oZK.LIZ();
                                if (interfaceC1482870ogvLIZ2 != null) {
                                    interfaceC1482870ogvLIZ2.LJJLIIJ();
                                }
                            }
                            C0NET.LIZ.getClass();
                            C0NET.LJIJI(false);
                            C1C7U.LIZIZ("ForegroundFeedCacheTask@2892.run$1");
                            return null;
                        }
                    }, C15O7.LJIIIIZZ, null);
                } else {
                    C15O7.LJIIIIZZ(((long) ((Number) C0AOW.LIZ.getValue()).intValue()) * 1000).LJ(new InterfaceC2385309Wh() { // from class: X.0O4w
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7<Void> c15o7) {
                            C1C7U.LIZ("ForegroundFeedCacheTask@2892.run$2");
                            if (C279830Axx.LIZ()) {
                                C0NEA.LIZ.getClass();
                                if (C0NEA.LIZIZ) {
                                    C0NEA.LIZIZ = false;
                                    InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
                                    if (interfaceC1482870ogvLIZ != null) {
                                        interfaceC1482870ogvLIZ.LJJI(C0NEA.LJFF);
                                    }
                                }
                            } else {
                                InterfaceC1482870ogv interfaceC1482870ogvLIZ2 = C1478160oZK.LIZ();
                                if (interfaceC1482870ogvLIZ2 != null) {
                                    interfaceC1482870ogvLIZ2.LJJLIIJ();
                                }
                            }
                            C799900VZk.LIZ.getClass();
                            C0CPH c0cph = new C0CPH();
                            c0cph.LIZ(new ForegroundFeedCacheTask(EnumC799870VZh.IDLE));
                            c0cph.LIZIZ();
                            C1C7U.LIZIZ("ForegroundFeedCacheTask@2892.run$2");
                            return null;
                        }
                    }, C15O7.LJIIIIZZ, null);
                }
            }
        }
    }
}
