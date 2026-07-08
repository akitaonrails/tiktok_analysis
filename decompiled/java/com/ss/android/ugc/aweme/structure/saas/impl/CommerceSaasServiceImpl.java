package com.ss.android.ugc.aweme.structure.saas.impl;

import X.C1031810cxP;
import X.C1898190zUn;
import X.InterfaceC1031500cwu;
import X.InterfaceC1031510cwv;
import X.InterfaceC1031520cww;
import X.InterfaceC1032100cxs;
import X.InterfaceC1032940czE;
import X.InterfaceC1033100czU;
import X.InterfaceC1033840d0g;
import com.ss.android.ugc.aweme.IRewardAdAdapterFactory;
import com.ss.android.ugc.aweme.IRewardAdPreRequestAdapterFactory;
import com.ss.android.ugc.aweme.IRewardAdPreloadAdapterFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceSaasServiceImpl implements ICommerceSaasService {
    public InterfaceC1031500cwu LIZ;
    public InterfaceC1031520cww LIZIZ;
    public InterfaceC1031510cwv LIZJ;
    public final HashMap<String, InterfaceC1031500cwu> LIZLLL = new HashMap<>();

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final void LJII() {
        this.LIZ = null;
        this.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final InterfaceC1032100cxs LJ() {
        InterfaceC1031500cwu interfaceC1031500cwu = this.LIZ;
        if (interfaceC1031500cwu != null) {
            return interfaceC1031500cwu.LIZJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final InterfaceC1033100czU LJFF() {
        if (this.LIZJ == null) {
            IRewardAdPreRequestAdapterFactory iRewardAdPreRequestAdapterFactory = (IRewardAdPreRequestAdapterFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdPreRequestAdapterFactory.class, false, false, false, 14, null);
            this.LIZJ = iRewardAdPreRequestAdapterFactory != null ? iRewardAdPreRequestAdapterFactory.LIZ() : null;
        }
        InterfaceC1031510cwv interfaceC1031510cwv = this.LIZJ;
        if (interfaceC1031510cwv != null) {
            return interfaceC1031510cwv.getPreRequestManager();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final InterfaceC1033840d0g LJI() {
        if (this.LIZIZ == null) {
            IRewardAdPreloadAdapterFactory iRewardAdPreloadAdapterFactory = (IRewardAdPreloadAdapterFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdPreloadAdapterFactory.class, false, false, false, 14, null);
            this.LIZIZ = iRewardAdPreloadAdapterFactory != null ? iRewardAdPreloadAdapterFactory.LIZ() : null;
        }
        InterfaceC1031520cww interfaceC1031520cww = this.LIZIZ;
        if (interfaceC1031520cww != null) {
            return interfaceC1031520cww.LIZ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final void LIZ(List<String> list) {
        if (list == null || list.isEmpty() || this.LIZLLL.isEmpty()) {
            return;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LIZLLL.remove(it2.next());
        }
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final InterfaceC1032100cxs LIZIZ(String str) {
        InterfaceC1031500cwu interfaceC1031500cwu = this.LIZLLL.get(str);
        if (interfaceC1031500cwu != null) {
            return interfaceC1031500cwu.LIZJ();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final void LIZLLL(C1031810cxP c1031810cxP, C1898190zUn c1898190zUn) {
        IRewardAdAdapterFactory iRewardAdAdapterFactory = (IRewardAdAdapterFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdAdapterFactory.class, false, false, false, 14, null);
        InterfaceC1031500cwu interfaceC1031500cwuLIZ = null;
        if (iRewardAdAdapterFactory != null) {
            interfaceC1031500cwuLIZ = iRewardAdAdapterFactory.LIZ(c1031810cxP, c1898190zUn, null, null);
        }
        this.LIZ = interfaceC1031500cwuLIZ;
    }

    @Override // com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService
    public final void LIZJ(C1031810cxP c1031810cxP, InterfaceC1032940czE interfaceC1032940czE, String str) {
        InterfaceC1031500cwu interfaceC1031500cwuLIZ;
        IRewardAdAdapterFactory iRewardAdAdapterFactory = (IRewardAdAdapterFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdAdapterFactory.class, false, false, false, 14, null);
        if (iRewardAdAdapterFactory != null && (interfaceC1031500cwuLIZ = iRewardAdAdapterFactory.LIZ(c1031810cxP, interfaceC1032940czE, str, null)) != null) {
            this.LIZLLL.put(str, interfaceC1031500cwuLIZ);
        }
    }
}
