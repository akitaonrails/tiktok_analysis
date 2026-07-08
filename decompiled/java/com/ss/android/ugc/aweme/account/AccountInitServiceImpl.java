package com.ss.android.ugc.aweme.account;

import com.ss.android.ugc.aweme.IAccountMainModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountInitServiceImpl implements IAccountInitService {
    @Override // com.ss.android.ugc.aweme.account.IAccountInitService
    public final <T> ServiceProvider<T> getService(Class<T> cls) {
        if (Intrinsics.LJFF(cls, ILanguageService.class)) {
            return new ServiceProvider() { // from class: X.04fX
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return ServiceManager.get().getService(ILanguageService.class);
                }
            };
        }
        if (Intrinsics.LJFF(cls, IAccountHelperService.class)) {
            return new ServiceProvider() { // from class: X.04fW
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    if (C04TD.w4 == null) {
                        synchronized (IAccountHelperService.class) {
                            if (C04TD.w4 == null) {
                                C04TD.w4 = new AccountHelperService();
                            }
                        }
                    }
                    return C04TD.w4;
                }
            };
        }
        if (Intrinsics.LJFF(cls, IAppUpdateService.class)) {
            return new ServiceProvider() { // from class: X.04fY
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return ServiceManager.get().getService(IAppUpdateService.class);
                }
            };
        }
        if (Intrinsics.LJFF(cls, IAccountMainModuleService.class)) {
            return new ServiceProvider() { // from class: X.04fZ
                @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                public final Object get() {
                    return PluggableExtentionKt.pluggableSpi$default(IAccountMainModuleService.class, false, false, false, 14, null);
                }
            };
        }
        return null;
    }
}
