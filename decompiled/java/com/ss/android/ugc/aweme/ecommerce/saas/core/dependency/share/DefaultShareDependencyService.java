package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share;

import X.AbstractC1389240mFu;
import X.C1389170mFn;
import X.InterfaceC1389210mFr;
import X.InterfaceC1389220mFs;
import X.InterfaceC1389230mFt;
import android.app.Activity;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultShareDependencyService implements IShareDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void addScreenShotListener(AbstractC1389240mFu abstractC1389240mFu) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public String getShareProductKey() {
        return "";
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void removeScreenShotListener(AbstractC1389240mFu abstractC1389240mFu) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public TuxSheet shareProduct(Activity activity, C1389170mFn c1389170mFn, InterfaceC1389210mFr interfaceC1389210mFr, InterfaceC1389220mFs interfaceC1389220mFs, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void showShareSnakeBar(View view) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void subscribeShareEvent(InterfaceC1389230mFt interfaceC1389230mFt) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void unsubscribeShareEvent(InterfaceC1389230mFt interfaceC1389230mFt) {
    }
}
