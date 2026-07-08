package com.ss.android.ugc.aweme.ecommerce.saas.core;

import X.AnonymousClass0317;
import X.InterfaceC1079104Jx;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECAnchorSaasService;
import com.ss.android.ugc.aweme.ecommerce.core.saas.ECTransactionSaaSService;
import com.ss.android.ugc.aweme.ecommerce.network.ECNetworkSaasService;
import com.ss.android.ugc.aweme.ecommerce.router.ECSchemaSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.ECHybridSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.hybrid.IECHybridSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.network.IECNetworkSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.schema.IECSchemaSaasService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.transaction.IECTransactionSaaSService;
import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.video.IECVideoAnchorSaasService;
import com.ss.android.ugc.aweme.ecommerce.showcase.saas.ECShowcaseSaaSService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EComBusinessServiceInitializer implements InterfaceC1079104Jx {
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
                                            ECAnchorSaasService eCAnchorSaasService = new ECAnchorSaasService();
                                            eCAnchorSaasService.initService();
                                            this.eCVideoAnchorSaasService = eCAnchorSaasService;
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
                                        ECTransactionSaaSService eCTransactionSaaSService = new ECTransactionSaaSService();
                                        eCTransactionSaaSService.initService();
                                        this.eCTransactionSaaSService = eCTransactionSaaSService;
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
                                    ECShowcaseSaaSService eCShowcaseSaaSService = new ECShowcaseSaaSService();
                                    eCShowcaseSaaSService.initService();
                                    this.eCShowcaseSaaSService = eCShowcaseSaaSService;
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
                                ECSchemaSaasService eCSchemaSaasService = new ECSchemaSaasService();
                                eCSchemaSaasService.initService();
                                this.eCSchemaSaasService = eCSchemaSaasService;
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
                            ECNetworkSaasService eCNetworkSaasService = new ECNetworkSaasService();
                            eCNetworkSaasService.initService();
                            this.eCNetworkSaasService = eCNetworkSaasService;
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
                        ECHybridSaaSService eCHybridSaaSService = new ECHybridSaaSService();
                        eCHybridSaaSService.initService();
                        this.eCHybridSaaSService = eCHybridSaaSService;
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
