package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.AbstractC738140SxQ;
import X.C03H5;
import X.C13IQ;
import X.C13LP;
import X.C1770290wAV;
import X.C19719912Dl;
import X.C1AF0;
import X.C723830SaL;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1770280wAU;
import X.InterfaceC1770300wAW;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EcVideoGuideSlotComponent extends BaseCellSlotComponent<EcVideoGuideSlotComponent> {
    public C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ayr;
    }

    static {
        InterfaceC1770280wAU interfaceC1770280wAU = new InterfaceC1770280wAU() { // from class: X.0wAS
            @Override // X.InterfaceC1770280wAU
            public final C19719912Dl LJIILIIL() {
                return C13LE.LIZ(EcVideoGuideAssem.class);
            }

            @Override // X.InterfaceC1770280wAU
            public final int getPriority() {
                return 100;
            }

            @Override // X.InterfaceC1770280wAU
            public final boolean LJJJLZIJ(C0OB8 c0ob8) {
                boolean zLJJJJZ;
                Aweme aweme = c0ob8.getAweme();
                IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) PluggableExtentionKt.pluggableSpi$default(IECommerceAnchorService.class, false, false, false, 14, null);
                if (iECommerceAnchorService != null) {
                    zLJJJJZ = iECommerceAnchorService.LJJJJZ(aweme);
                } else {
                    zLJJJJZ = false;
                }
                if (C0C18.LIZ()) {
                    if (aweme.isAd() || AwemeExtKt.isSelfSee(aweme) || aweme.getProductRecallType() <= 0 || zLJJJJZ) {
                        return false;
                    }
                } else {
                    if (aweme.isAd() || AwemeExtKt.isSelfSee(aweme)) {
                        return false;
                    }
                    if (aweme.getProductRecallType() <= 0 && (!zLJJJJZ || !C300590BqL.LIZ())) {
                        return false;
                    }
                }
                return true;
            }

            @Override // java.lang.Comparable
            public final int compareTo(InterfaceC1770280wAU interfaceC1770280wAU2) {
                return interfaceC1770280wAU2.getPriority() - 100;
            }
        };
        PriorityQueue<InterfaceC1770280wAU> priorityQueue = C1770290wAV.LIZ;
        priorityQueue.add(interfaceC1770280wAU);
        InterfaceC1770280wAU interfaceC1770280wAULJJJJL = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJJJL();
        if (interfaceC1770280wAULJJJJL != null) {
            priorityQueue.add(interfaceC1770280wAULJJJJL);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        try {
            C723830SaL.LIZ(this, null, new AwS605S0100000_26(this, 273));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "EcVideoGuideSlotComponent assemble error");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        C19719912Dl c19719912DlLJIILIIL;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        boolean z;
        Iterator it2 = C13LP.LLIIII(C1770290wAV.LIZ).iterator();
        while (true) {
            c19719912DlLJIILIIL = null;
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1770280wAU interfaceC1770280wAU = (InterfaceC1770280wAU) it2.next();
            if (interfaceC1770280wAU.LJJJLZIJ(videoItemParams)) {
                c19719912DlLJIILIIL = interfaceC1770280wAU.LJIILIIL();
                break;
            }
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if ((abstractC738140SxQ instanceof InterfaceC1770300wAW) && abstractC738140SxQ != null) {
                    InterfaceC1770300wAW interfaceC1770300wAW = (InterfaceC1770300wAW) abstractC738140SxQ;
                    if (c19719912DlLJIILIIL != null && c19719912DlLJIILIIL.LIZIZ(abstractC738140SxQ)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    interfaceC1770300wAW.h8(z);
                }
            }
        }
        this.LLJLLIL = c19719912DlLJIILIIL;
        return super.ur(videoItemParams);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> c13iq = this.LLJLLIL;
        if (c13iq != null) {
            C786410Ut5.LJLLLLLL(0, getContentView());
            C723830SaL.LIZJ(this, c13iq, true);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
