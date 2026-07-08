package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage;

import X.C14DH;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public interface ICreativePageDependencyService extends IECommerceHostService {
    void asyncAVService(String str, C14DH c14dh);

    void invokeMethodsSafely(Activity activity, Function0<Unit> function0);

    void openBrandedContentPage(Context context);

    boolean studioStickerReqResultHandleOptExperiment();
}
