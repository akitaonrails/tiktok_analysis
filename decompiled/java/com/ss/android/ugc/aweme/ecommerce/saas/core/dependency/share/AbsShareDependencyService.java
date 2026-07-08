package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share;

import X.AbstractC1389240mFu;
import X.InterfaceC1389230mFt;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbsShareDependencyService implements IShareDependencyService {
    public final CopyOnWriteArrayList<InterfaceC1389230mFt> subscribers = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void addScreenShotListener(AbstractC1389240mFu abstractC1389240mFu) {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public void removeScreenShotListener(AbstractC1389240mFu abstractC1389240mFu) {
    }

    public abstract void subscribeEvent(InterfaceC1389230mFt interfaceC1389230mFt);

    public abstract void unsubscribeEvent(InterfaceC1389230mFt interfaceC1389230mFt);

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public final void subscribeShareEvent(InterfaceC1389230mFt interfaceC1389230mFt) {
        subscribeEvent(interfaceC1389230mFt);
        this.subscribers.add(interfaceC1389230mFt);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService
    public final void unsubscribeShareEvent(InterfaceC1389230mFt interfaceC1389230mFt) {
        this.subscribers.remove(interfaceC1389230mFt);
        unsubscribeEvent(interfaceC1389230mFt);
    }
}
