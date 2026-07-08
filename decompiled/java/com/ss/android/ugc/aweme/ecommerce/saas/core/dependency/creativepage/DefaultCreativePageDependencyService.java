package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage;

import X.C14DH;
import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultCreativePageDependencyService implements ICreativePageDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public void asyncAVService(String str, C14DH c14dh) {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public void openBrandedContentPage(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public boolean studioStickerReqResultHandleOptExperiment() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public void invokeMethodsSafely(Activity activity, Function0<Unit> function0) {
        function0.invoke();
    }
}
