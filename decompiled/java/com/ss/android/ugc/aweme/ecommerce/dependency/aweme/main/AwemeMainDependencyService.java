package com.ss.android.ugc.aweme.ecommerce.dependency.aweme.main;

import X.C04TD;
import X.C19EG;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: loaded from: classes3.dex */
public final class AwemeMainDependencyService implements IAwemeMainDependencyService {
    public void initService() {
    }

    public static IAwemeMainDependencyService createIAwemeMainDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAwemeMainDependencyService.class, z);
        if (objLIZ != null) {
            return (IAwemeMainDependencyService) objLIZ;
        }
        if (C04TD.LLZZZZ == null) {
            synchronized (IAwemeMainDependencyService.class) {
                if (C04TD.LLZZZZ == null) {
                    C04TD.LLZZZZ = new AwemeMainDependencyService();
                }
            }
        }
        return C04TD.LLZZZZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService
    public LifecycleOwner findSAFExpLifecycleOwner(View view, C19EG c19eg) {
        return IMainSAFLifecycleKt.findSAFExpLifecycleOwner(view, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main.IAwemeMainDependencyService
    public void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f) {
        IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
        if (iMainService != null) {
            iMainService.startVideoPlayActivity(context, str, str2, z, str3, str4, str5, str6, f);
        }
    }
}
