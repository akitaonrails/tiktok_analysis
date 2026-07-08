package com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.trigger;

import com.ss.android.ugc.tiktok.commercialize.dispatcher.api.trigger.IResourceDispatcherService;

/* JADX INFO: loaded from: classes17.dex */
public final class ResourceDispatcherService implements IResourceDispatcherService {
    @Override // com.ss.android.ugc.tiktok.commercialize.dispatcher.api.trigger.IResourceDispatcherService
    public final RewardGeckoPrefetchBootFinishTask LIZ() {
        return new RewardGeckoPrefetchBootFinishTask();
    }

    @Override // com.ss.android.ugc.tiktok.commercialize.dispatcher.api.trigger.IResourceDispatcherService
    public final ResourceDispatcherBootFinishTask LIZIZ() {
        return new ResourceDispatcherBootFinishTask();
    }
}
