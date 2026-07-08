package com.ss.android.ugc.aweme.ml.api;

import X.C740110T1l;
import X.C740120T1m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class SmartPreloadProfileV2Service implements ISmartPreloadProfileV2Service {
    public static final C740120T1m Companion = new Object() { // from class: X.0T1m
    };
    public static final boolean debug = false;

    public abstract /* synthetic */ boolean enable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public abstract /* synthetic */ boolean ensureEvaluatorAvailable();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service
    public abstract /* synthetic */ float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartPreloadProfileV2Service instance() {
        Companion.getClass();
        return C740110T1l.LIZ;
    }
}
