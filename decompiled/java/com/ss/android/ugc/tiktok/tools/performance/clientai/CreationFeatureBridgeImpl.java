package com.ss.android.ugc.tiktok.tools.performance.clientai;

import X.C0BXW;
import X.C1510050pOl;
import X.C2255851DRf;
import X.InterfaceC2255911DRl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge;
import com.ss.android.ugc.tiktok.tools.performance.clientai.events.CreationPerfEventHandler;
import com.ss.android.ugc.tiktok.tools.performance.services.CreationContextServiceImpl;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public final class CreationFeatureBridgeImpl extends CreationFeatureBridge {
    public final Object LIZ = new Object();
    public volatile boolean LIZIZ;

    @Override // com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge, com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public final boolean isFeatureEnabled() {
        return C0BXW.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge, com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public final void onProducerEnabled() {
        boolean z;
        if (C0BXW.LIZ()) {
            synchronized (this.LIZ) {
                try {
                    if (this.LIZIZ) {
                        z = false;
                    } else {
                        z = true;
                        this.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                try {
                    FeatureServiceManager.Companion.getClass();
                    C1510050pOl.LIZ().addAppLogListener(CreationPerfEventHandler.INSTANCE);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    C2255851DRf c2255851DRf = InterfaceC2255911DRl.LIZ;
                    CreationContextServiceImpl creationContextServiceImpl = CreationContextServiceImpl.INSTANCE;
                    c2255851DRf.getClass();
                    C2255851DRf.LIZIZ = creationContextServiceImpl;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge, com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public final Object getFeature(String str) {
        if (!C0BXW.LIZ()) {
            return null;
        }
        return CreationFeatureRouter.INSTANCE.getFeature(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge
    public final void onEditModelUpdated(Object obj) {
        if (!C0BXW.LIZ()) {
            return;
        }
        CreationContextServiceImpl.INSTANCE.updateEditModel(obj);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge, com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public final void onRecordRuntimeStateProviderUpdated(Function0<? extends Map<String, ? extends Object>> function0) {
        if (function0 != null && !C0BXW.LIZ()) {
            return;
        }
        CreationContextServiceImpl.INSTANCE.setRecordRuntimeStateProvider(function0);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.CreationFeatureBridge, com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public final void onShootContextUpdated(Object obj) {
        if (!C0BXW.LIZ()) {
            return;
        }
        CreationContextServiceImpl.INSTANCE.updateShootContext(obj);
    }
}
