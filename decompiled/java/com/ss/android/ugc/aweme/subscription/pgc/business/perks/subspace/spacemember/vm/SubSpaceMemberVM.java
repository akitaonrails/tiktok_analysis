package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.spacemember.vm;

import X.C01GW;
import X.C0213005b;
import X.C0JCK;
import X.C0K30;
import X.C0K3N;
import X.C0K4J;
import X.C0K51;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1554960qZC;
import X.C1701940uOG;
import X.C452501pT;
import X.C510940K2a;
import X.C511170K2x;
import X.C516201zk;
import X.EnumC499440JiI;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import Y.AfS30S0210000_7;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS551S0100000_7;
import webcast.api.pgc_sub.PGCSpaceMembersResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceMemberVM extends AssemViewModel<C0213005b> implements C0K3N {
    public InterfaceC665370Q7z LL;
    public C0K30 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 530));
    public C510940K2a LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0213005b(0);
    }

    public final C0K30 wQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0K30.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C0K30) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    @Override // X.C0K3N
    public final boolean LJIIJJI() {
        C511170K2x c511170K2x;
        Boolean bool;
        C0K30 c0k30WQ2 = wQ2();
        return (c0k30WQ2 == null || (c511170K2x = c0k30WQ2.LL) == null || (bool = c511170K2x.LIZIZ) == null || !C0K51.LJI(bool)) ? false : true;
    }

    @Override // X.C0K3N
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        vQ2(false, function0, function1);
    }

    public final void vQ2(boolean z, Function0 function0, Function1 function1) {
        String secUid;
        long jLongValue;
        C11NZ c11nz;
        C0K30 c0k30WQ2;
        C511170K2x c511170K2x;
        Long l;
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null) {
            secUid = "";
        }
        if (!z && (c0k30WQ2 = wQ2()) != null && (c511170K2x = c0k30WQ2.LL) != null && (l = c511170K2x.LIZ) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C11NZ<DataResponse<PGCSpaceMembersResponse.ResponseData>> spaceMembers = C0K4J.LIZ().getSpaceMembers(secUid, jLongValue);
        if (spaceMembers != null && (c11nz = (C11NZ) C0JCK.LIZ(spaceMembers, EnumC499440JiI.GENERAL, "SubSpaceMemberVM", "sub/space/members", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this))) != null) {
            c11nz.LJJLL(new AfS30S0210000_7(function0, z, this, 1), new C516201zk(function1, 199));
        }
    }
}
