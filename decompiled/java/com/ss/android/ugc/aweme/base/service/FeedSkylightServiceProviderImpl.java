package com.ss.android.ugc.aweme.base.service;

import X.C01GW;
import X.C04TD;
import X.C0O6Y;
import X.C0O6Z;
import X.C1077904Jl;
import X.C1087504Nd;
import X.C452501pT;
import X.C613900O6a;
import X.InterfaceC1595080rbu;
import X.InterfaceC1595170rc3;
import X.InterfaceC610590NxB;
import X.InterfaceC610600NxC;
import X.InterfaceC610850Nxb;
import X.InterfaceC614780O9k;
import com.ss.android.ugc.aweme.service.IFeedSkylightCommonService;
import com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider;
import com.ss.android.ugc.aweme.service.IFeedSkylightSortService;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedSkylightServiceProviderImpl implements IFeedSkylightServiceProvider {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0O6Y());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1087504Nd());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1077904Jl());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C613900O6a());
    public final C01GW LJ = C452501pT.LIZIZ(new C0O6Z());
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(58));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(57));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(56));

    public static IFeedSkylightServiceProvider LJIIIIZZ() {
        Object objLIZ = C04TD.LIZ(IFeedSkylightServiceProvider.class, false);
        if (objLIZ != null) {
            return (IFeedSkylightServiceProvider) objLIZ;
        }
        if (C04TD.LLIIZ == null) {
            synchronized (IFeedSkylightServiceProvider.class) {
                if (C04TD.LLIIZ == null) {
                    C04TD.LLIIZ = new FeedSkylightServiceProviderImpl();
                }
            }
        }
        return C04TD.LLIIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC1595170rc3 LIZ() {
        return (InterfaceC1595170rc3) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC614780O9k LIZIZ() {
        return (InterfaceC614780O9k) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC1595080rbu LIZJ() {
        return (InterfaceC1595080rbu) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC610600NxC LIZLLL() {
        return (InterfaceC610600NxC) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final IFeedSkylightCommonService LJ() {
        return (IFeedSkylightCommonService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC610590NxB LJFF() {
        return (InterfaceC610590NxB) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final IFeedSkylightSortService LJI() {
        return (IFeedSkylightSortService) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IFeedSkylightServiceProvider
    public final InterfaceC610850Nxb LJII() {
        return (InterfaceC610850Nxb) this.LJII.getValue();
    }
}
