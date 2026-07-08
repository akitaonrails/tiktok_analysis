package com.ss.android.legoimpl;

import X.C0CCZ;
import com.ss.android.legoapi.abtest.IABLegoTaskApi;
import com.ss.android.sdk.app.AbTestSdkInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ABTask;

/* JADX INFO: loaded from: classes5.dex */
public final class ABLegoTaskImpl implements IABLegoTaskApi {
    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final C0CCZ LIZ() {
        return new AbTestSdkInitTask();
    }

    @Override // com.ss.android.legoapi.abtest.IABLegoTaskApi
    public final C0CCZ LIZIZ() {
        return new ABTask();
    }
}
