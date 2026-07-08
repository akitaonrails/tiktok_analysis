package com.ss.android.ugc.aweme.internalshare.impl.refactor.protocol;

import X.C1362030lY1;
import X.C1362160lYE;
import X.C1362170lYF;
import X.C1363140lZo;
import X.InterfaceC1361730lXX;
import X.InterfaceC1361740lXY;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.SharePanelAggregationPowerCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.AwS230S0300000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class AggregationContactProtocol implements IContactListProtocol<C1362030lY1> {
    public final Class<? extends PowerCell<C1362030lY1>> LL = SharePanelAggregationPowerCell.class;

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final int priority() {
        return 90;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final Class<? extends PowerCell<C1362030lY1>> getWithCell() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final boolean Hl1(IMContact iMContact) {
        return iMContact instanceof C1363140lZo;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361740lXY<C1362030lY1> iJ1(final C1362160lYE c1362160lYE) {
        return new InterfaceC1361740lXY<C1362030lY1>(c1362160lYE) { // from class: X.0lY2
            public final C1362160lYE LIZ;

            {
                this.LIZ = c1362160lYE;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [T, X.13BV] */
            @Override // X.InterfaceC1361740lXY
            public final void LIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
                List<IMContact> contacts;
                C1362030lY1 c1362030lY1 = (C1362030lY1) interfaceC1361730lXX;
                ShareContactListViewModel shareContactListViewModel = this.LIZ.LJFF;
                C1363140lZo c1363140lZo = c1362030lY1.LL;
                shareContactListViewModel.getClass();
                if (c1363140lZo != null && (contacts = c1363140lZo.getContacts()) != null && !contacts.isEmpty()) {
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = C13BV.INSTANCE;
                    shareContactListViewModel.withState(new AwS230S0300000_21((List) contacts, (List<? extends IMContact>) c259800zU, (C259800zU<List<IMContact>>) shareContactListViewModel, (ShareContactListViewModel) 8));
                }
                C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                int size = c1362030lY1.LL.getContacts().size();
                SharePackage sharePackage = this.LIZ.LIZIZ;
                c1364620lcC.getClass();
                C1364620lcC.LJ(size, sharePackage, "click");
                SharePackage sharePackage2 = this.LIZ.LIZIZ;
                if (sharePackage2 != null) {
                    for (IMContact iMContact : c1362030lY1.LL.getContacts()) {
                        C1364620lcC c1364620lcC2 = C1364620lcC.LIZ;
                        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                        c1364620lcC2.getClass();
                        C1364620lcC.LJIILLIIL(sharePackage2, iMContact, interfaceC1493505szLIZIZ);
                    }
                }
            }

            @Override // X.InterfaceC1361740lXY
            public final /* bridge */ /* synthetic */ void LIZIZ(InterfaceC1361730lXX interfaceC1361730lXX) {
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX xS(int i, IMContact iMContact) {
        return new C1362030lY1((C1363140lZo) iMContact, i);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.IContactListProtocol
    public final InterfaceC1361730lXX ag0(InterfaceC1361730lXX interfaceC1361730lXX, C1362170lYF c1362170lYF) {
        return interfaceC1361730lXX;
    }
}
