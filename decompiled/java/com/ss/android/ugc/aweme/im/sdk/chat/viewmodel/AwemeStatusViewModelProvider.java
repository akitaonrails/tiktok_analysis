package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.AbstractC903280Zc6;
import X.C04TD;
import X.C738350Sxl;
import X.C913950ZtJ;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModelProvider;

/* JADX INFO: loaded from: classes15.dex */
public final class AwemeStatusViewModelProvider implements IAwemeStatusViewModelProvider {
    public final C913950ZtJ LL = new C913950ZtJ(0);

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    public static IAwemeStatusViewModelProvider LIZ() {
        Object objLIZ = C04TD.LIZ(IAwemeStatusViewModelProvider.class, false);
        if (objLIZ != null) {
            return (IAwemeStatusViewModelProvider) objLIZ;
        }
        if (C04TD.c1 == null) {
            synchronized (IAwemeStatusViewModelProvider.class) {
                if (C04TD.c1 == null) {
                    C04TD.c1 = new AwemeStatusViewModelProvider();
                }
            }
        }
        return C04TD.c1;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.LL;
    }
}
