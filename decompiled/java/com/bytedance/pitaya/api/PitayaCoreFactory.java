package com.bytedance.pitaya.api;

import com.bytedance.pitaya.api.mutilinstance.DelegateCoreProvider;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;

/* JADX INFO: loaded from: classes29.dex */
public final class PitayaCoreFactory implements ReflectionCall {
    public static final PitayaCoreFactory INSTANCE = new PitayaCoreFactory();
    public static final CoreProvider provider = DelegateCoreProvider.INSTANCE;

    public final CoreProvider getProvider() {
        return provider;
    }

    public static final IPitayaCore getCore(String str) {
        return provider.getCore(str);
    }
}
