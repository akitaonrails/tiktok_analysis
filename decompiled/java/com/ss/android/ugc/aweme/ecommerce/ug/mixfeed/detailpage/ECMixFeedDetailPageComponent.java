package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.detailpage;

import X.C01GW;
import X.C1216490hlH;
import X.C12B3;
import X.C1558520qew;
import X.C1566140qrE;
import X.C1604850rrf;
import X.C1620830sHR;
import X.C1735810vGt;
import X.C2189821An6;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1526205yG;
import X.InterfaceC1565950qqv;
import X.InterfaceC1603360rpG;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.utils.ECMixFeedExtra;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes25.dex */
public final class ECMixFeedDetailPageComponent extends DetailPageComponent {
    public C12B3 LLLJIL;
    public final C01GW LLLJL;
    public final HashMap<String, Boolean> LLLL;

    public ECMixFeedDetailPageComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 420), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 13));
        }
        this.LLLJL = c01gwLIZIZ;
        this.LLLL = new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        Long l;
        String previousPage;
        String str;
        String eventType;
        super.onViewCreated(view, bundle);
        C1604850rrf value = C1604850rrf.LJ.getValue();
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (value.LIZIZ == null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            if (c2189821An6 != null && (eventType = c2189821An6.getEventType()) != null) {
                concurrentHashMap.put("enter_from", eventType);
            }
            C1735810vGt.LIZ.getClass();
            ECMixFeedExtra eCMixFeedExtraLIZIZ = C1735810vGt.LIZIZ(c2189821An6);
            if (eCMixFeedExtraLIZIZ != null && (str = eCMixFeedExtraLIZIZ.enterMethod) != null) {
                concurrentHashMap.put("enter_method", str);
            }
            if (c2189821An6 != null && (previousPage = c2189821An6.getPreviousPage()) != null) {
                concurrentHashMap.put("previous_page", previousPage);
            }
            value.LIZIZ = concurrentHashMap;
            value.LIZ = Long.valueOf(System.currentTimeMillis());
        }
        ConcurrentHashMap<String, Object> concurrentHashMap2 = value.LIZIZ;
        if (concurrentHashMap2 != null && (l = value.LIZ) != null) {
            concurrentHashMap2.put("start_to_enter_page", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        value.LIZJ = false;
        value.LIZLLL = false;
        C12B3 c12b3 = null;
        Object viewModel = null;
        final IPageStateAbility iPageStateAbility = (IPageStateAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPageStateAbility.class, null);
        InterfaceC1603360rpG interfaceC1603360rpG = this.LLLFZ;
        if (interfaceC1603360rpG instanceof C1216490hlH) {
            if (interfaceC1603360rpG != null) {
                viewModel = interfaceC1603360rpG.getViewModel();
            }
            c12b3 = (C12B3) viewModel;
        }
        this.LLLJIL = c12b3;
        if (c12b3 != null && c12b3.isDataEmpty() && iPageStateAbility != null) {
            iPageStateAbility.t4(true);
        }
        C12B3 c12b32 = this.LLLJIL;
        if (c12b32 != null) {
            c12b32.addNotifyListener(new InterfaceC1526205yG() { // from class: X.0rre
                @Override // X.InterfaceC1526205yG
                public final void onSuccess() {
                    IPageStateAbility iPageStateAbility2 = iPageStateAbility;
                    if (iPageStateAbility2 != null) {
                        iPageStateAbility2.DC2();
                    }
                }

                @Override // X.InterfaceC1526205yG
                public final void onFailed(Exception exc) {
                    IPageStateAbility iPageStateAbility2 = iPageStateAbility;
                    if (iPageStateAbility2 != null) {
                        iPageStateAbility2.DC2();
                    }
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityMb = Mb();
        if (iViewPagerComponentAbilityMb != null) {
            iViewPagerComponentAbilityMb.Bv0(new C1620830sHR(this, 2));
        }
    }
}
