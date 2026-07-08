package com.ss.android.ugc.aweme.ml.api;

import X.C01GW;
import X.C1448200nn0;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public abstract class CreationFeatureBridge implements ICreationFeatureBridge {
    public static final C1448200nn0 Companion = new C1448200nn0();
    public static final C01GW<CreationFeatureBridgeDefault> FALLBACK$delegate = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(97));

    public static final ICreationFeatureBridge instance() {
        Companion.getClass();
        return C1448200nn0.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public abstract /* synthetic */ Object getFeature(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public abstract /* synthetic */ boolean isFeatureEnabled();

    public abstract /* synthetic */ void onEditModelUpdated(Object obj);

    @Override // com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public abstract /* synthetic */ void onProducerEnabled();

    @Override // com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public abstract /* synthetic */ void onRecordRuntimeStateProviderUpdated(Function0<? extends Map<String, ? extends Object>> function0);

    @Override // com.ss.android.ugc.aweme.ml.api.ICreationFeatureBridge
    public abstract /* synthetic */ void onShootContextUpdated(Object obj);
}
