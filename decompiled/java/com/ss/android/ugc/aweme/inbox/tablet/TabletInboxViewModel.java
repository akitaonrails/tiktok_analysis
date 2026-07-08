package com.ss.android.ugc.aweme.inbox.tablet;

import X.C1902240zbK;
import X.C1902250zbL;
import X.EnumC1903200zcs;
import X.InterfaceC1903240zcw;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tablet.api.ITabletService;

/* JADX INFO: loaded from: classes29.dex */
public final class TabletInboxViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final C1902250zbL LL = new Object() { // from class: X.0zbL
    };
    public final InterfaceC1903240zcw LLILLJJLI = ((ITabletService) ServiceManager.get().getService(ITabletService.class)).LIZLLL().LJIIL();
    public final MutableLiveData<C1902240zbK> LLILLL = new MutableLiveData<>(new C1902240zbK(EnumC1903200zcs.EMPTY, null));

    public final void wQ2() {
        this.LLILLL.setValue(new C1902240zbK(EnumC1903200zcs.EMPTY, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vQ2(X.InterfaceC1891350zJl r7) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.tablet.TabletInboxViewModel.vQ2(X.0zJl):boolean");
    }
}
