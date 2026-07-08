package com.ss.android.ugc.aweme.ogccampaign;

import X.AbstractC830880Wic;
import X.AnonymousClass0207;
import X.C00Z5;
import X.C01GW;
import X.C01VN;
import X.C01VO;
import X.C01VP;
import X.C01VR;
import X.C0CCZ;
import X.C0VZ0;
import X.C0XK4;
import X.C13LP;
import X.C1537900q7g;
import X.C1541950qED;
import X.C20684815ws;
import X.C830930Wih;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC20234614Fk
public final class OgcLynxPspInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "OgcLynxPspInitTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C01VN.LIZ.getClass();
        if (((Boolean) C00Z5.LIZ.getValue()).booleanValue()) {
            OgcLynxCache.LIZ.getClass();
            OgcLynxCache.LJ();
            if (!C01VO.LIZIZ) {
                C01VO.LIZIZ = true;
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                C01VO c01vo = new C01VO();
                c1537900q7g.getClass();
                C1537900q7g.LJIIIIZZ(c01vo);
            }
            C01GW c01gw = C01VR.LIZIZ;
            String str = ((OgcLynxConfig) c01gw.getValue()).sceneKey;
            if (!a0.LJJJIL(str) && !C01VN.LIZIZ) {
                int iLIZ = C0XK4.LIZ();
                List<OgcLynxActivityItem> list = ((OgcLynxConfig) c01gw.getValue()).lynxActivities;
                ArrayList arrayList = new ArrayList();
                for (OgcLynxActivityItem ogcLynxActivityItem : list) {
                    if (ogcLynxActivityItem.endTime > iLIZ && (!a0.LJJJIL(r6.activityId))) {
                        arrayList.add(ogcLynxActivityItem);
                    }
                }
                if (!arrayList.isEmpty()) {
                    final String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AnonymousClass0207.get$arr$(39), 30);
                    C01VP.LIZ.getClass();
                    C20684815ws.LJIILLIIL("music_ogc_lynx_initial_data", C01VP.LIZ("config_ready", strLJJLIIIJ).LIZ);
                    C01VN.LIZIZ = true;
                    TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(str, new ArrayList(), (C830930Wih) C01VN.LIZJ.getValue(), new AbstractC830880Wic() { // from class: X.01VS
                        @Override // X.AbstractC830880Wic
                        public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                            Object c098200Yq;
                            try {
                                C01VN.LIZ.getClass();
                                C01VN.LIZ(interfaceC805220ViK);
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }

                        @Override // X.AbstractC830880Wic
                        public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                            int i;
                            String strName;
                            List<InterfaceC830900Wie> listLIZJ;
                            if (enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess && interfaceC830890Wid != null) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            C01VP c01vp = C01VP.LIZ;
                            String str2 = strLJJLIIIJ;
                            if (i != 0) {
                                strName = "";
                            } else {
                                strName = enumC2213771Bkd.name();
                            }
                            c01vp.getClass();
                            C2344009Gk c2344009GkLIZ = C01VP.LIZ("psp_registered", str2);
                            c2344009GkLIZ.LIZJ(i, "psp_is_success");
                            c2344009GkLIZ.LJIIIIZZ("psp_error", strName);
                            C20684815ws.LJIILLIIL("music_ogc_lynx_initial_data", c2344009GkLIZ.LIZ);
                            if (i != 0) {
                                if (interfaceC830890Wid != null && (listLIZJ = interfaceC830890Wid.LIZJ()) != null) {
                                    Iterator<InterfaceC830900Wie> it2 = listLIZJ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next();
                                    }
                                    return;
                                }
                                return;
                            }
                            C01VN.LIZIZ = false;
                        }
                    });
                }
            }
        }
    }
}
