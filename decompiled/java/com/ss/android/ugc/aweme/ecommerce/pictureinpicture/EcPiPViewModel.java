package com.ss.android.ugc.aweme.ecommerce.pictureinpicture;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0PEM;
import X.C1038610d8N;
import X.C1038620d8O;
import X.C1056130dad;
import X.C1056140dae;
import X.C13LP;
import X.C1508320pLy;
import X.C1508430pM9;
import X.C189200o6;
import X.C1DFH;
import X.C20738716Dh;
import X.C20739016Dk;
import X.C2107308Nj;
import X.C2126308Ur;
import X.C23250099c;
import X.EnumC1757150vpJ;
import X.InterfaceC0148002o;
import X.InterfaceC1508380pM4;
import X.InterfaceC20738816Di;
import X.InterfaceC497601wk;
import X.InterfaceC583740Muy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS126S0400000_31;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: loaded from: classes32.dex */
public final class EcPiPViewModel extends AssemViewModel<C20739016Dk> implements InterfaceC583740Muy {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public boolean LL;
    public C1038610d8N LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public final CopyOnWriteArrayList<InterfaceC20738816Di> LLILZIL = new CopyOnWriteArrayList<>();
    public AnonymousClass0956 LLILZLL;
    public AnonymousClass0956 LLIZ;

    @Override // X.InterfaceC583740Muy
    public final void AH() {
        xQ2(this, Boolean.FALSE, Boolean.TRUE, null, 4);
    }

    @Override // X.InterfaceC583740Muy
    public final void PX0() {
        C1038620d8O c1038620d8O;
        C1038610d8N c1038610d8N = this.LLILLJJLI;
        if (c1038610d8N != null && (c1038620d8O = c1038610d8N.LIZJ) != null) {
            int i = c1038620d8O.LIZ;
            if (i == -1) {
                return;
            }
            WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
            InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
            if (i > (interfaceC1508380pM4LIZ != null ? interfaceC1508380pM4LIZ.getLoopCount() : 0)) {
                return;
            }
        }
        pause(true);
        setState(AFwS276S0000000_31.get$arr$(78));
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZ = C23250099c.LIZLLL(getAssemVMScope(), C2126308Ur.LJFF, null, new C1056140dae(this, null), 2);
    }

    @Override // X.InterfaceC583740Muy
    public final void ap() {
        Boolean bool = Boolean.TRUE;
        xQ2(this, bool, bool, null, 4);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ != null) {
            return new C20739016Dk((interfaceC1508380pM4LIZ.LJ().isLoading() || interfaceC1508380pM4LIZ.LJ().isPlaying()) ? false : true, interfaceC1508380pM4LIZ.LJ().isPlaying(), interfaceC1508380pM4LIZ.LJ().LJJIJIIJIL(), interfaceC1508380pM4LIZ.LJ().isLoading(), interfaceC1508380pM4LIZ.isMute(), 929);
        }
        boolean z = false;
        return new C20739016Dk(z, z, z, z, z, 1023);
    }

    @Override // X.InterfaceC583740Muy
    public final void q3() {
        Boolean bool = Boolean.FALSE;
        xQ2(this, bool, null, bool, 2);
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        vQ2();
    }

    public final void vQ2() {
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1056130dad(this, null), 3);
    }

    @Override // X.InterfaceC583740Muy
    public final void LLLLLLJ() {
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ.LLIILII(), null, new C1508430pM9(this, null), 2);
    }

    public final void pause(boolean z) {
        this.LL = z;
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ != null) {
            interfaceC1508380pM4LIZ.LIZ();
        }
    }

    public final void wQ2(boolean z) {
        setState(AFwS276S0000000_31.get$arr$(79));
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (z) {
            vQ2();
        }
    }

    public final void VI(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        boolean z2;
        int iIntValue;
        if (getState().LL && enumC1757150vpJ != null) {
            WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
            InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
            long jLongValue = 0;
            if (interfaceC1508380pM4LIZ != null) {
                Integer numValueOf = Integer.valueOf(interfaceC1508380pM4LIZ.getLoopCount() - this.LLILLL);
                if (numValueOf.intValue() >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
                long currentPosition = interfaceC1508380pM4LIZ.getCurrentPosition() - this.LLILZ;
                this.LLILLL = 0;
                this.LLILZ = 0L;
                Long lValueOf = Long.valueOf((((long) iIntValue) * interfaceC1508380pM4LIZ.getDuration()) + currentPosition);
                if (lValueOf.longValue() >= 0) {
                    jLongValue = lValueOf.longValue();
                }
            }
            Iterator<InterfaceC20738816Di> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LIZ(enumC1757150vpJ, jLongValue);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
        setState(new AwS595S0100000_16(enumC1757150vpJ, 91));
        boolean z3 = !getState().LLILLL;
        pause(false);
        IECommerceFYPPlayerService iECommerceFYPPlayerService = (IECommerceFYPPlayerService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceFYPPlayerService.class));
        if (iECommerceFYPPlayerService != null) {
            iECommerceFYPPlayerService.LJ();
        }
        if (z || z3) {
            pause(true);
        }
    }

    public static void xQ2(EcPiPViewModel ecPiPViewModel, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        Boolean bool4 = bool3;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        if ((i & 1) != 0) {
            bool6 = null;
        }
        if ((i & 2) != 0) {
            bool5 = null;
        }
        if ((i & 4) != 0) {
            bool4 = null;
        }
        ecPiPViewModel.getClass();
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ != null) {
            ecPiPViewModel.setState(new AwS126S0400000_31(interfaceC1508380pM4LIZ, bool6, bool4, bool5, 18));
        }
    }
}
