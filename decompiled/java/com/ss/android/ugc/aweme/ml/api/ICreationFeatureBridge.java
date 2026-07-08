package com.ss.android.ugc.aweme.ml.api;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes24.dex */
public interface ICreationFeatureBridge {
    Object getFeature(String str);

    boolean isFeatureEnabled();

    void onProducerEnabled();

    void onRecordRuntimeStateProviderUpdated(Function0<? extends Map<String, ? extends Object>> function0);

    void onShootContextUpdated(Object obj);
}
