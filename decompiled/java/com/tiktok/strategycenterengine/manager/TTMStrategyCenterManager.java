package com.tiktok.strategycenterengine.manager;

import X.AbstractC830880Wic;
import X.C04TD;
import X.C1075990e6f;
import X.C2078408Cg;
import X.C2213641BkQ;
import X.C830930Wih;
import X.InterfaceC1075980e6e;
import X.InterfaceC1294060jmO;
import X.InterfaceC805220ViK;
import X.InterfaceC829710Wgj;
import X.InterfaceC829930Wh5;
import X.InterfaceC830810WiV;
import X.InterfaceC830890Wid;
import X.InterfaceC830900Wie;
import com.tiktok.strategycenterengineimpl.manager.TTMStrategyCenterManagerDelegate;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class TTMStrategyCenterManager {
    public static final TTMStrategyCenterManager INSTANCE = new TTMStrategyCenterManager();
    public static final ITTMStrategyCenterManager delegate;

    public static final boolean isInit() {
        return true;
    }

    static {
        ITTMStrategyCenterManager iTTMStrategyCenterManager;
        Object objLIZ = C04TD.LIZ(ITTMStrategyCenterManager.class, false);
        if (objLIZ != null) {
            iTTMStrategyCenterManager = (ITTMStrategyCenterManager) objLIZ;
        } else {
            if (C04TD.h7 == null) {
                synchronized (ITTMStrategyCenterManager.class) {
                    if (C04TD.h7 == null) {
                        C04TD.h7 = new TTMStrategyCenterManagerDelegate();
                    }
                }
            }
            iTTMStrategyCenterManager = C04TD.h7;
        }
        if (!(iTTMStrategyCenterManager instanceof ITTMStrategyCenterManager)) {
            iTTMStrategyCenterManager = null;
        }
        delegate = iTTMStrategyCenterManager;
    }

    public static final void initFromCallBack() {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIIIZ();
        }
    }

    @InterfaceC1294060jmO
    public static final boolean initReady() {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            return iTTMStrategyCenterManager.LJIIIIZZ();
        }
        return false;
    }

    public final InterfaceC1075980e6e geTTMStrategyCenterKVManager$psp_engine_api_release() {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager == null) {
            return null;
        }
        iTTMStrategyCenterManager.LJIJ();
        return C2078408Cg.LIZ;
    }

    public static final C1075990e6f geTTMStrategyCenterStorageManager() {
        return C1075990e6f.LIZ;
    }

    public static final void activateWithScene(InterfaceC830890Wid interfaceC830890Wid) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIJI(interfaceC830890Wid);
        }
    }

    public static final void clearStateWithScene(InterfaceC830890Wid interfaceC830890Wid) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJI(interfaceC830890Wid);
        }
    }

    public static final void deregisterSceneWithScene(InterfaceC830890Wid interfaceC830890Wid) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIILLIIL(interfaceC830890Wid);
        }
    }

    public static final void deregisterTTMStrategyCenterStateListener(InterfaceC829930Wh5 interfaceC829930Wh5) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJ(interfaceC829930Wh5);
        }
    }

    public static final void freezeWithScene(InterfaceC830890Wid interfaceC830890Wid) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LIZ(interfaceC830890Wid);
        }
    }

    public static final List<InterfaceC830900Wie> getSceneStrategyList(InterfaceC830890Wid interfaceC830890Wid) {
        List<InterfaceC830900Wie> listLJIIL;
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager == null || (listLJIIL = iTTMStrategyCenterManager.LJIIL(interfaceC830890Wid)) == null) {
            return null;
        }
        return listLJIIL;
    }

    public static final InterfaceC830890Wid getSingletonRegisteredScene(String str) {
        InterfaceC830890Wid interfaceC830890WidLIZLLL;
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager == null || (interfaceC830890WidLIZLLL = iTTMStrategyCenterManager.LIZLLL(str)) == null) {
            return null;
        }
        return interfaceC830890WidLIZLLL;
    }

    public static final void registerTTMStrategyCenterStateListener(InterfaceC829930Wh5 interfaceC829930Wh5) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIILJJIL(interfaceC829930Wh5);
        }
    }

    public static final int savaAllTTMSceneModelToDisk(JSONObject jSONObject) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            return iTTMStrategyCenterManager.LJIJJ(jSONObject);
        }
        return -1;
    }

    public static final int savaTTMSceneModelToCache(Object obj) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            return iTTMStrategyCenterManager.LJIIJ(obj);
        }
        return -1;
    }

    public static final void activeWithStrategyKey(InterfaceC830890Wid interfaceC830890Wid, String str) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIIZILJ(interfaceC830890Wid, str);
        }
    }

    public static final boolean asyncEmitEventToGlobalStrategyEventStream(String str, ITTMParamData iTTMParamData) {
        return asyncEmitEventToGlobalStrategyEventStream(str, iTTMParamData, (ExecutorService) null);
    }

    public static final void asyncRegisterSceneWithSceneKey(String str, AbstractC830880Wic abstractC830880Wic) {
        asyncRegisterSceneWithSceneKey(str, null, null, abstractC830880Wic);
    }

    public static final void emitWithEventStream(InterfaceC830810WiV interfaceC830810WiV, InterfaceC829710Wgj interfaceC829710Wgj) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIIJJI(interfaceC830810WiV, interfaceC829710Wgj);
        }
    }

    public static final void freezeWithStrategyKey(InterfaceC830890Wid interfaceC830890Wid, String str) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIJJLI(interfaceC830890Wid, str);
        }
    }

    public static final InterfaceC830900Wie getSceneStrategyWithKey(InterfaceC830890Wid interfaceC830890Wid, String str) {
        InterfaceC830900Wie interfaceC830900WieLIZJ;
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager == null || (interfaceC830900WieLIZJ = iTTMStrategyCenterManager.LIZJ(interfaceC830890Wid, str)) == null) {
            return null;
        }
        return interfaceC830900WieLIZJ;
    }

    public static final Map<String, InterfaceC805220ViK> runScene(InterfaceC830890Wid interfaceC830890Wid, TTMParamData tTMParamData) {
        Map<String, InterfaceC805220ViK> mapLIZIZ;
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager == null || (mapLIZIZ = iTTMStrategyCenterManager.LIZIZ(interfaceC830890Wid, tTMParamData)) == null) {
            return null;
        }
        return mapLIZIZ;
    }

    public static final boolean asyncEmitEventToGlobalStrategyEventStream(String str, JSONObject jSONObject) {
        return asyncEmitEventToGlobalStrategyEventStream(str, jSONObject, (ExecutorService) null);
    }

    public static final boolean asyncEmitEventToGlobalStrategyEventStream(String str, ITTMParamData iTTMParamData, ExecutorService executorService) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            return iTTMStrategyCenterManager.LJFF(str, iTTMParamData);
        }
        return false;
    }

    public static final void asyncRegisterSceneWithSceneKey(String str, List<? extends InterfaceC830810WiV> list, AbstractC830880Wic abstractC830880Wic) {
        asyncRegisterSceneWithSceneKey(str, list, null, abstractC830880Wic);
    }

    public static final InterfaceC805220ViK runScene(InterfaceC830890Wid interfaceC830890Wid, String str, TTMParamData tTMParamData) {
        C2213641BkQ c2213641BkQLJII;
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager == null || (c2213641BkQLJII = iTTMStrategyCenterManager.LJII(interfaceC830890Wid, str, tTMParamData)) == null) {
            return null;
        }
        return c2213641BkQLJII;
    }

    public static final boolean asyncEmitEventToGlobalStrategyEventStream(String str, JSONObject jSONObject, ExecutorService executorService) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            return iTTMStrategyCenterManager.LJIILL(str, jSONObject, executorService);
        }
        return false;
    }

    public static final void asyncRegisterSceneWithSceneKey(String str, List<? extends InterfaceC830810WiV> list, C830930Wih c830930Wih, AbstractC830880Wic abstractC830880Wic) {
        ITTMStrategyCenterManager iTTMStrategyCenterManager = delegate;
        if (iTTMStrategyCenterManager != null) {
            iTTMStrategyCenterManager.LJIILIIL(str, list, c830930Wih, abstractC830880Wic);
        }
    }
}
