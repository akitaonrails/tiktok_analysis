package com.ss.android.ugc.aweme.ecommerce.dependency.creativepage;

import X.C04TD;
import X.C0BW5;
import X.C14DH;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public final class CreativePageDependencyService implements ICreativePageDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public boolean studioStickerReqResultHandleOptExperiment() {
        return C0BW5.LIZ();
    }

    public static ICreativePageDependencyService createICreativePageDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(ICreativePageDependencyService.class, z);
        if (objLIZ != null) {
            return (ICreativePageDependencyService) objLIZ;
        }
        if (C04TD.i == null) {
            synchronized (ICreativePageDependencyService.class) {
                if (C04TD.i == null) {
                    C04TD.i = new CreativePageDependencyService();
                }
            }
        }
        return C04TD.i;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public void openBrandedContentPage(Context context) {
        ((ICommerceToolsService) ServiceManager.get().getService(ICommerceToolsService.class)).openBrandedContentPage(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public void asyncAVService(String str, final C14DH c14dh) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(str, new IExternalService.ServiceLoadCallback(c14dh) { // from class: X.14DG
            public final C14DH LIZ;

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                this.LIZ.onDismiss();
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                this.LIZ.onFailed();
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            {
                this.LIZ = c14dh;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                this.LIZ.LIZ(new C0MJW(asyncAVService));
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.creativepage.ICreativePageDependencyService
    public void invokeMethodsSafely(Activity activity, Function0<Unit> function0) {
        ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(activity, function0);
    }
}
