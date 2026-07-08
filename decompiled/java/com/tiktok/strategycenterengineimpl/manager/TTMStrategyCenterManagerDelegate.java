package com.tiktok.strategycenterengineimpl.manager;

import X.AbstractC2213701BkW;
import X.AbstractC830880Wic;
import X.C2078408Cg;
import X.C2213641BkQ;
import X.C2213731BkZ;
import X.C829670Wgf;
import X.C829890Wh1;
import X.C830860Wia;
import X.C830870Wib;
import X.C830930Wih;
import X.EnumC2213771Bkd;
import X.EnumC829940Wh6;
import X.InterfaceC805220ViK;
import X.InterfaceC829710Wgj;
import X.InterfaceC829930Wh5;
import X.InterfaceC830810WiV;
import X.InterfaceC830890Wid;
import X.InterfaceC830900Wie;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTMStrategyCenterManagerDelegate implements ITTMStrategyCenterManager {
    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final boolean LJIIIIZZ() {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        return TTMStrategyCenterManagerImpl.LIZLLL;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIIIZ() {
        TTMStrategyCenterManagerImpl.LIZ.LJ();
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIJ() {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        C2078408Cg c2078408Cg = C2078408Cg.LIZ;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LIZ(InterfaceC830890Wid interfaceC830890Wid) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            try {
                Iterator<AbstractC2213701BkW> it2 = ((C830870Wib) interfaceC830890Wid).LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIIZ = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final InterfaceC830890Wid LIZLLL(String str) {
        return TTMStrategyCenterManagerImpl.LJII.get(str);
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJ(InterfaceC829930Wh5 interfaceC829930Wh5) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        try {
            TTMStrategyCenterManagerImpl.LJ.remove(Integer.valueOf(interfaceC829930Wh5.hashCode()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJI(InterfaceC830890Wid interfaceC830890Wid) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            try {
                Iterator<AbstractC2213701BkW> it2 = ((C830870Wib) interfaceC830890Wid).LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final int LJIIJ(Object obj) {
        return TTMStrategyCenterManagerImpl.LIZ.LJIIIIZZ(obj);
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final List<InterfaceC830900Wie> LJIIL(InterfaceC830890Wid interfaceC830890Wid) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            return interfaceC830890Wid.LIZJ();
        }
        return null;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIILJJIL(InterfaceC829930Wh5 interfaceC829930Wh5) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        try {
            TTMStrategyCenterManagerImpl.LJ.put(Integer.valueOf(interfaceC829930Wh5.hashCode()), interfaceC829930Wh5);
            interfaceC829930Wh5.LIZ(EnumC829940Wh6.TTMStateInitFinish);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIILLIIL(InterfaceC830890Wid interfaceC830890Wid) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        TTMStrategyCenterManagerImpl.LIZIZ(interfaceC830890Wid);
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIJI(InterfaceC830890Wid interfaceC830890Wid) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            try {
                Iterator<AbstractC2213701BkW> it2 = ((C830870Wib) interfaceC830890Wid).LIZIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final int LJIJJ(JSONObject jSONObject) {
        return TTMStrategyCenterManagerImpl.LIZ.LJII(jSONObject);
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final Map<String, InterfaceC805220ViK> LIZIZ(InterfaceC830890Wid interfaceC830890Wid, TTMParamData tTMParamData) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null && tTMParamData != null) {
            try {
                HashMap map = new HashMap();
                for (AbstractC2213701BkW abstractC2213701BkW : ((C830870Wib) interfaceC830890Wid).LIZIZ) {
                    map.put(abstractC2213701BkW.LIZIZ, abstractC2213701BkW.LJIIJJI(tTMParamData, true));
                }
                return map;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final InterfaceC830900Wie LIZJ(InterfaceC830890Wid interfaceC830890Wid, String str) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            try {
                return interfaceC830890Wid.LIZIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final boolean LJFF(String str, ITTMParamData iTTMParamData) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (str != null && iTTMParamData != null) {
            try {
                C829890Wh1.LJI.LIZIZ(new TTMParamData((ITTMParamData) new C829670Wgf(str, iTTMParamData)));
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return true;
            }
        }
        return false;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIIJJI(InterfaceC830810WiV interfaceC830810WiV, InterfaceC829710Wgj interfaceC829710Wgj) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        TTMStrategyCenterManagerImpl.LIZJ(interfaceC830810WiV, interfaceC829710Wgj);
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIIZILJ(InterfaceC830890Wid interfaceC830890Wid, String str) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            try {
                for (AbstractC2213701BkW abstractC2213701BkW : ((C830870Wib) interfaceC830890Wid).LIZIZ) {
                    if (Intrinsics.LJFF(abstractC2213701BkW.LIZIZ, str)) {
                        abstractC2213701BkW.LJIIIZ = true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIJJLI(InterfaceC830890Wid interfaceC830890Wid, String str) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null) {
            try {
                for (AbstractC2213701BkW abstractC2213701BkW : ((C830870Wib) interfaceC830890Wid).LIZIZ) {
                    if (Intrinsics.LJFF(abstractC2213701BkW.LIZIZ, str)) {
                        abstractC2213701BkW.LJIIIZ = false;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final C2213641BkQ LJII(InterfaceC830890Wid interfaceC830890Wid, String str, TTMParamData tTMParamData) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        if (interfaceC830890Wid != null && tTMParamData != null) {
            try {
                for (AbstractC2213701BkW abstractC2213701BkW : ((C830870Wib) interfaceC830890Wid).LIZIZ) {
                    if (Intrinsics.LJFF(abstractC2213701BkW.LIZIZ, str)) {
                        return abstractC2213701BkW.LJIIJJI(tTMParamData, true);
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final boolean LJIILL(String str, JSONObject jSONObject, ExecutorService executorService) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        return TTMStrategyCenterManagerImpl.LIZ(str, jSONObject);
    }

    @Override // com.tiktok.strategycenterengine.manager.ITTMStrategyCenterManager
    public final void LJIILIIL(String str, List<? extends InterfaceC830810WiV> list, C830930Wih c830930Wih, AbstractC830880Wic abstractC830880Wic) {
        TTMStrategyCenterManagerImpl.LIZ.getClass();
        try {
            ExecutorService executorService = null;
            if (TTMStrategyCenterManagerImpl.LJI.contains(str)) {
                abstractC830880Wic.LIZJ(null, EnumC2213771Bkd.TTMSceneInBlackList);
                return;
            }
            if (c830930Wih != null && !c830930Wih.LJ) {
                executorService = c830930Wih.LIZLLL;
            }
            C830860Wia.LIZIZ(executorService, new C2213731BkZ(str, list, c830930Wih, abstractC830880Wic));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
