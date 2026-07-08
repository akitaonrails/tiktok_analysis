package com.ss.android.ugc.aweme.crossplatform.business;

import X.C1041660dDI;
import X.C19EG;
import com.ss.android.ugc.aweme.crossplatform.activity.MainMixActivityContainer;

/* JADX INFO: loaded from: classes17.dex */
public class MixActivityContainerProvider implements IMixActivityContainerProvider {
    @Override // com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider
    public final MainMixActivityContainer LIZ(C19EG c19eg, C1041660dDI c1041660dDI) {
        return new MainMixActivityContainer(c19eg, c1041660dDI);
    }
}
