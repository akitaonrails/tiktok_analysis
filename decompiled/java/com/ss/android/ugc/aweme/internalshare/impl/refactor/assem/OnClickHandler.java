package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C1361720lXW;
import X.C1362160lYE;
import X.C1362560lYs;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class OnClickHandler implements IContactActionAbility {
    public final C1361720lXW LL;
    public final C1362560lYs LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility
    public final void Oy1(InterfaceC1361730lXX interfaceC1361730lXX) {
        IContactListProtocol<? extends InterfaceC1361730lXX> iContactListProtocolLIZJ;
        C1361720lXW c1361720lXW = this.LL;
        c1361720lXW.getClass();
        IMContact iMContactLJLJJI = interfaceC1361730lXX.LJLJJI();
        if (iMContactLJLJJI != null && (iContactListProtocolLIZJ = c1361720lXW.LIZJ(iMContactLJLJJI)) != null) {
            InterfaceC1361740lXY interfaceC1361740lXY = (InterfaceC1361740lXY) ((LinkedHashMap) c1361720lXW.LIZJ).get(iContactListProtocolLIZJ.getClass());
            if (interfaceC1361740lXY != null) {
                interfaceC1361740lXY.LIZIZ(interfaceC1361730lXX);
            }
        }
    }

    public OnClickHandler(C1361720lXW c1361720lXW, C1362160lYE c1362160lYE) {
        this.LL = c1361720lXW;
        this.LLILLJJLI = new C1362560lYs(c1362160lYE);
        for (IContactListProtocol iContactListProtocol : (List) c1361720lXW.LIZIZ.getValue()) {
            InterfaceC1361740lXY<?> interfaceC1361740lXYIJ1 = iContactListProtocol.iJ1(c1362160lYE);
            if (interfaceC1361740lXYIJ1 != null) {
                c1361720lXW.LIZJ.put(iContactListProtocol.getClass(), interfaceC1361740lXYIJ1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IContactActionAbility
    public final void fK0(View view, InterfaceC1361730lXX interfaceC1361730lXX) {
        IContactListProtocol<? extends InterfaceC1361730lXX> iContactListProtocolLIZJ;
        C1361720lXW c1361720lXW = this.LL;
        c1361720lXW.getClass();
        IMContact iMContactLJLJJI = interfaceC1361730lXX.LJLJJI();
        if (iMContactLJLJJI != null && (iContactListProtocolLIZJ = c1361720lXW.LIZJ(iMContactLJLJJI)) != null) {
            InterfaceC1361740lXY interfaceC1361740lXY = (InterfaceC1361740lXY) ((LinkedHashMap) c1361720lXW.LIZJ).get(iContactListProtocolLIZJ.getClass());
            if (interfaceC1361740lXY != null) {
                interfaceC1361740lXY.LIZ(interfaceC1361730lXX);
            }
        }
    }
}
