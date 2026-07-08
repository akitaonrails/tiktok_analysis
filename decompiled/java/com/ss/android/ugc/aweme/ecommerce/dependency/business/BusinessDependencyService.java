package com.ss.android.ugc.aweme.ecommerce.dependency.business;

import X.C04TD;
import X.C1051880dTm;
import X.C14EU;
import X.C1766570w4V;
import X.C1896207bk;
import X.C18JS;
import X.C596440NaM;
import X.InterfaceC1865670yeL;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spark.bullet.IBulletService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes31.dex */
public final class BusinessDependencyService implements IBusinessDependencyService {
    public final CopyOnWriteArrayList<InterfaceC1865670yeL> subscribers = new CopyOnWriteArrayList<>();

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public boolean enableBxgyPageReturn() {
        return ((Boolean) C18JS.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public Class<? extends PowerLoadingCell> getTuxLoadingFooterCell() {
        return LoadingFooterCell.class;
    }

    public static IBusinessDependencyService createIBusinessDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IBusinessDependencyService.class, z);
        if (objLIZ != null) {
            return (IBusinessDependencyService) objLIZ;
        }
        if (C04TD.b == null) {
            synchronized (IBusinessDependencyService.class) {
                if (C04TD.b == null) {
                    C04TD.b = new BusinessDependencyService();
                }
            }
        }
        return C04TD.b;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public void dialogManagerOnDialogShow(Activity activity) {
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896207bk c1896207bk = new C1896207bk(activity);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896207bk);
    }

    @C14EU
    public final void onBulletProductStayTimeEvent(C1051880dTm c1051880dTm) {
        Iterator<InterfaceC1865670yeL> it2 = this.subscribers.iterator();
        while (it2.hasNext()) {
            it2.next().onEvent(c1051880dTm.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public void setFypAdMaskShowing(boolean z) {
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) PluggableExtentionKt.pluggableSpi$default(FypAutoScrollService.class, false, false, false, 14, null);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.LJIIL(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public void subscribeBulletProductStayTime(InterfaceC1865670yeL interfaceC1865670yeL) {
        if (this.subscribers.isEmpty() && !EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        this.subscribers.add(interfaceC1865670yeL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public void unsubscribeBulletProductStayTime(InterfaceC1865670yeL interfaceC1865670yeL) {
        this.subscribers.remove(interfaceC1865670yeL);
        if (this.subscribers.isEmpty() && EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public String getReactNativeStorage(String str, String str2) {
        return C596440NaM.LIZ.LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService
    public void bulletStart(Context context, String str, String str2, Bundle bundle) {
        ((IBulletService) ServiceManager.get().getService(IBulletService.class)).LIZLLL(context, str, str2, bundle);
    }
}
