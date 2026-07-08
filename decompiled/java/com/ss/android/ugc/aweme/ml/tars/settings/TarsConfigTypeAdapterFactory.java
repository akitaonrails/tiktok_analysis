package com.ss.android.ugc.aweme.ml.tars.settings;

import X.C098200Yq;
import X.C09CU;
import X.C09DL;
import X.C189200o6;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartOffloadingConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneMonitorConfig;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TarsConfigTypeAdapterFactory implements v {
    @Override // com.google.gson.v
    public final <T> TypeAdapter<T> create(final Gson gson, TypeToken<T> typeToken) {
        if (!Intrinsics.LJFF(typeToken.getRawType(), TarsConfig.class)) {
            return null;
        }
        final TypeAdapter<T> typeAdapterLJIIJJI = gson.LJIIJJI(this, typeToken);
        return new TypeAdapter<T>() { // from class: com.ss.android.ugc.aweme.ml.tars.settings.TarsConfigTypeAdapterFactory.create.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.gson.TypeAdapter
            public final T read(C09CU c09cu) {
                Object obj;
                try {
                    T t = typeAdapterLJIIJJI.read(c09cu);
                    if (t == 0) {
                        return null;
                    }
                    if (t instanceof TarsConfig) {
                        List<TarsConfig.TaskConfig> list = ((TarsConfig) t).pipelineConfigs;
                        Gson gson2 = gson;
                        for (TarsConfig.TaskConfig taskConfig : list) {
                            TarsConfig.PreDecision preDecision = taskConfig.predecision;
                            if (preDecision != null && (obj = preDecision.pspStrategy) != null) {
                                preDecision.setPspStrategy(GsonProtectorUtils.fromJson(gson2, GsonProtectorUtils.toJsonTree(gson2, obj), SmartSceneConfig.class));
                            }
                            TarsConfig.Engine engine = taskConfig.engine;
                            if (engine != null) {
                                Object obj2 = engine.features;
                                if (obj2 != null) {
                                    engine.setFeatures(GsonProtectorUtils.fromJson(gson2, GsonProtectorUtils.toJsonTree(gson2, obj2), SmartSceneConfig.class));
                                }
                                Object obj3 = engine.track;
                                if (obj3 != null) {
                                    engine.setTrack(GsonProtectorUtils.fromJson(gson2, GsonProtectorUtils.toJsonTree(gson2, obj3), OneSmartDataTrackConfig.class));
                                }
                                Object obj4 = engine.monitorConfig;
                                if (obj4 != null) {
                                    engine.setMonitorConfig(GsonProtectorUtils.fromJson(gson2, GsonProtectorUtils.toJsonTree(gson2, obj4), SmartSceneMonitorConfig.class));
                                }
                                Object obj5 = engine.offloadingConfig;
                                if (obj5 != null) {
                                    engine.setOffloadingConfig(GsonProtectorUtils.fromJson(gson2, GsonProtectorUtils.toJsonTree(gson2, obj5), SmartOffloadingConfig.class));
                                }
                            }
                        }
                    }
                    return t;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(C09DL c09dl, T t) {
                Object c098200Yq;
                try {
                    typeAdapterLJIIJJI.write(c09dl, t);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
        };
    }
}
