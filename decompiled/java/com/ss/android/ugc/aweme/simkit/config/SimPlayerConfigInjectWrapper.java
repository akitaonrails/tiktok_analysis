package com.ss.android.ugc.aweme.simkit.config;

import X.C1477750oYf;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfig;
import com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper;

/* JADX INFO: loaded from: classes24.dex */
public class SimPlayerConfigInjectWrapper implements ISimPlayerConfigInjectWrapper {
    @Override // com.ss.android.ugc.aweme.video.config.ISimPlayerConfigInjectWrapper
    public ISimPlayerConfig wrap(ISimPlayerConfig iSimPlayerConfig) {
        return new C1477750oYf(iSimPlayerConfig);
    }
}
