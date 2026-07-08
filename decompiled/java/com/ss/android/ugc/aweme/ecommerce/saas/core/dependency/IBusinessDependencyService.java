package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency;

import X.InterfaceC1865670yeL;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes27.dex */
public interface IBusinessDependencyService extends IECommerceHostService {
    void bulletStart(Context context, String str, String str2, Bundle bundle);

    void dialogManagerOnDialogShow(Activity activity);

    boolean enableBxgyPageReturn();

    String getReactNativeStorage(String str, String str2);

    Class<? extends PowerLoadingCell> getTuxLoadingFooterCell();

    void setFypAdMaskShowing(boolean z);

    void subscribeBulletProductStayTime(InterfaceC1865670yeL interfaceC1865670yeL);

    void unsubscribeBulletProductStayTime(InterfaceC1865670yeL interfaceC1865670yeL);
}
