package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share;

import X.AbstractC1389240mFu;
import X.C1389170mFn;
import X.InterfaceC1389210mFr;
import X.InterfaceC1389220mFs;
import X.InterfaceC1389230mFt;
import android.app.Activity;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes27.dex */
public interface IShareDependencyService extends IECommerceHostService {
    void addScreenShotListener(AbstractC1389240mFu abstractC1389240mFu);

    String getShareProductKey();

    void removeScreenShotListener(AbstractC1389240mFu abstractC1389240mFu);

    TuxSheet shareProduct(Activity activity, C1389170mFn c1389170mFn, InterfaceC1389210mFr interfaceC1389210mFr, InterfaceC1389220mFs interfaceC1389220mFs, String str);

    void showShareSnakeBar(View view);

    void subscribeShareEvent(InterfaceC1389230mFt interfaceC1389230mFt);

    void unsubscribeShareEvent(InterfaceC1389230mFt interfaceC1389230mFt);
}
