package com.ss.android.ugc.aweme.ecommerce.saas.core;

import X.AnonymousClass0317;
import X.InterfaceC1079104Jx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.hybrid.DefaultECHybridSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.hybrid.IECHybridSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.DefaultECNetworkSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.schema.DefaultECSchemaSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.schema.IECSchemaSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.DefaultECShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.transaction.DefaultECTransactionSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.transaction.IECTransactionSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.video.DefaultECVideoAnchorSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.video.IECVideoAnchorSaasService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class EComBusinessServiceDefault implements InterfaceC1079104Jx {
    public IECHybridSaaSService eCHybridSaaSService;
    public IECNetworkSaasService eCNetworkSaasService;
    public IECSchemaSaasService eCSchemaSaasService;
    public IECShowcaseSaaSService eCShowcaseSaaSService;
    public IECTransactionSaaSService eCTransactionSaaSService;
    public IECVideoAnchorSaasService eCVideoAnchorSaasService;
    public final Class<?>[] serviceTypes = {IECHybridSaaSService.class, IECNetworkSaasService.class, IECSchemaSaasService.class, IECShowcaseSaaSService.class, IECTransactionSaaSService.class, IECVideoAnchorSaasService.class};

    private final int getServiceType(Class<?> cls) {
        int length = this.serviceTypes.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.LJFF(cls, this.serviceTypes[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC1079104Jx
    public <T extends AnonymousClass0317> T getService(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        int serviceType = getServiceType(cls);
        if (serviceType != 0) {
            if (serviceType != 1) {
                if (serviceType != 2) {
                    if (serviceType != 3) {
                        if (serviceType != 4) {
                            if (serviceType != 5) {
                                return null;
                            }
                            if (this.eCVideoAnchorSaasService == null) {
                                synchronized (cls) {
                                    try {
                                        if (this.eCVideoAnchorSaasService == null) {
                                            DefaultECVideoAnchorSaasService defaultECVideoAnchorSaasService = new DefaultECVideoAnchorSaasService();
                                            defaultECVideoAnchorSaasService.initService();
                                            this.eCVideoAnchorSaasService = defaultECVideoAnchorSaasService;
                                        }
                                    } finally {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                            IECVideoAnchorSaasService iECVideoAnchorSaasService = this.eCVideoAnchorSaasService;
                            if (!(iECVideoAnchorSaasService instanceof AnonymousClass0317)) {
                                return null;
                            }
                            return iECVideoAnchorSaasService;
                        }
                        if (this.eCTransactionSaaSService == null) {
                            synchronized (cls) {
                                try {
                                    if (this.eCTransactionSaaSService == null) {
                                        DefaultECTransactionSaaSService defaultECTransactionSaaSService = new DefaultECTransactionSaaSService();
                                        defaultECTransactionSaaSService.initService();
                                        this.eCTransactionSaaSService = defaultECTransactionSaaSService;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        IECTransactionSaaSService iECTransactionSaaSService = this.eCTransactionSaaSService;
                        if (!(iECTransactionSaaSService instanceof AnonymousClass0317)) {
                            return null;
                        }
                        return iECTransactionSaaSService;
                    }
                    if (this.eCShowcaseSaaSService == null) {
                        synchronized (cls) {
                            try {
                                if (this.eCShowcaseSaaSService == null) {
                                    DefaultECShowcaseSaaSService defaultECShowcaseSaaSService = new DefaultECShowcaseSaaSService();
                                    defaultECShowcaseSaaSService.initService();
                                    this.eCShowcaseSaaSService = defaultECShowcaseSaaSService;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    IECShowcaseSaaSService iECShowcaseSaaSService = this.eCShowcaseSaaSService;
                    if (!(iECShowcaseSaaSService instanceof AnonymousClass0317)) {
                        return null;
                    }
                    return iECShowcaseSaaSService;
                }
                if (this.eCSchemaSaasService == null) {
                    synchronized (cls) {
                        try {
                            if (this.eCSchemaSaasService == null) {
                                DefaultECSchemaSaasService defaultECSchemaSaasService = new DefaultECSchemaSaasService();
                                defaultECSchemaSaasService.initService();
                                this.eCSchemaSaasService = defaultECSchemaSaasService;
                            }
                        } catch (Throwable th22) {
                            throw th22;
                        }
                    }
                }
                IECSchemaSaasService iECSchemaSaasService = this.eCSchemaSaasService;
                if (!(iECSchemaSaasService instanceof AnonymousClass0317)) {
                    return null;
                }
                return iECSchemaSaasService;
            }
            if (this.eCNetworkSaasService == null) {
                synchronized (cls) {
                    try {
                        if (this.eCNetworkSaasService == null) {
                            DefaultECNetworkSaasService defaultECNetworkSaasService = new DefaultECNetworkSaasService();
                            defaultECNetworkSaasService.initService();
                            this.eCNetworkSaasService = defaultECNetworkSaasService;
                        }
                    } catch (Throwable th222) {
                        throw th222;
                    }
                }
            }
            IECNetworkSaasService iECNetworkSaasService = this.eCNetworkSaasService;
            if (!(iECNetworkSaasService instanceof AnonymousClass0317)) {
                return null;
            }
            return iECNetworkSaasService;
        }
        if (this.eCHybridSaaSService == null) {
            synchronized (cls) {
                try {
                    if (this.eCHybridSaaSService == null) {
                        DefaultECHybridSaaSService defaultECHybridSaaSService = new DefaultECHybridSaaSService();
                        defaultECHybridSaaSService.initService();
                        this.eCHybridSaaSService = defaultECHybridSaaSService;
                    }
                } catch (Throwable th2222) {
                    throw th2222;
                }
            }
        }
        IECHybridSaaSService iECHybridSaaSService = this.eCHybridSaaSService;
        if (!(iECHybridSaaSService instanceof AnonymousClass0317)) {
            return null;
        }
        return iECHybridSaaSService;
    }
}
