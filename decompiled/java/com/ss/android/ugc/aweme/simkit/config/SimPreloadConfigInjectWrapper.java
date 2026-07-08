package com.ss.android.ugc.aweme.simkit.config;

import X.C1478300oZY;
import X.C1478310oZZ;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfig;
import com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper;

/* JADX INFO: loaded from: classes24.dex */
public class SimPreloadConfigInjectWrapper implements IVideoPreloadConfigInjectWrapper {
    @Override // com.ss.android.ugc.aweme.video.preload.IVideoPreloadConfigInjectWrapper
    public IVideoPreloadConfig wrap(IVideoPreloadConfig iVideoPreloadConfig) {
        return new C1478300oZY(new C1478310oZZ(iVideoPreloadConfig));
    }
}
