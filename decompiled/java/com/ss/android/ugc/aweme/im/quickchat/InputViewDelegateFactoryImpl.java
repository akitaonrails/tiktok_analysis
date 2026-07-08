package com.ss.android.ugc.aweme.im.quickchat;

import X.C01GW;
import X.C0I0H;
import X.C0I2B;
import X.C0ZGL;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class InputViewDelegateFactoryImpl implements InputViewDelegateFactory {
    @Override // com.ss.android.ugc.aweme.im.quickchat.InputViewDelegateFactory
    public final C0ZGL LIZ(final C01GW c01gw, C0I0H c0i0h, C0I2B c0i2b) {
        if (c0i2b == null) {
            c0i2b = new C0I2B(c01gw) { // from class: X.0ZGT
                public final C01GW LIZIZ;

                {
                    this.LIZIZ = c01gw;
                }

                @Override // X.C0I2B
                public final void LIZ(C0ZGS c0zgs, String str) {
                    IIMContactUtilService iIMContactUtilService;
                    IMContact iMContactLJI;
                    C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((C0ZGJ) this.LIZIZ.getValue()).LIZIZ);
                    if (c0y8tLIZ != null && (iIMContactUtilService = (IIMContactUtilService) PluggableExtentionKt.pluggableSpi$default(IIMContactUtilService.class, false, false, false, 14, null)) != null && (iMContactLJI = iIMContactUtilService.LJI(c0y8tLIZ)) != null) {
                        List listSingletonList = Collections.singletonList(iMContactLJI);
                        IShareMessageToastHelper.LIZ.getClass();
                        IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
                        if (iShareMessageToastHelperLIZ != null) {
                            iShareMessageToastHelperLIZ.zs(new C1365810le7(listSingletonList, str, ((C0ZGJ) this.LIZIZ.getValue()).LJFF, ((C0ZGJ) this.LIZIZ.getValue()).LJI.LIZ(c0zgs), null, false, false, 0, C1766306vt.LIZ(listSingletonList), null, null, null, false, ((C0ZGJ) this.LIZIZ.getValue()).LJIIJ, 7680));
                        }
                    }
                }
            };
        }
        return new C0ZGL(c01gw, c0i0h, c0i2b);
    }
}
