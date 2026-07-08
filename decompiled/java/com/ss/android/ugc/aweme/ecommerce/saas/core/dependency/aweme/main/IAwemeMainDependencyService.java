package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.aweme.main;

import X.C19EG;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;

/* JADX INFO: loaded from: classes3.dex */
public interface IAwemeMainDependencyService extends IECommerceHostService {
    LifecycleOwner findSAFExpLifecycleOwner(View view, C19EG c19eg);

    void startVideoPlayActivity(Context context, String str, String str2, boolean z, String str3, String str4, String str5, String str6, float f);
}
