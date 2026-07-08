package com.bytedance.android.livesdk.module;

import X.AbstractC1549150qPp;
import X.C0KJM;
import X.C1161920gLG;
import X.C342490Dbj;
import X.InterfaceC1121830fIb;
import com.bytedance.android.live.browser.IHostJsbRegisterService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class HostJsbRegisterService implements IHostJsbRegisterService {
    @Override // com.bytedance.android.live.browser.IHostJsbRegisterService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJFF;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideJsbForHost;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideJsbForHost2;
        ArrayList arrayList = new ArrayList();
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService != null && (listProvideJsbForHost2 = iWalletService.provideJsbForHost()) != null) {
            arrayList.addAll(listProvideJsbForHost2);
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null && (listProvideJsbForHost = iInteractService.provideJsbForHost()) != null) {
            arrayList.addAll(listProvideJsbForHost);
        }
        arrayList.add(C342490Dbj.class);
        arrayList.add(C0KJM.class);
        InterfaceC1121830fIb interfaceC1121830fIbOr0 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).or0();
        if (interfaceC1121830fIbOr0 != null && (listLJFF = interfaceC1121830fIbOr0.LJFF()) != null) {
            arrayList.addAll(listLJFF);
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.browser.IHostJsbRegisterService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodListForLynxPrefetch() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0KJM.class);
        return arrayList;
    }
}
