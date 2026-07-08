package com.ss.android.ugc.feed.platform.container.core;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0RPA;
import X.C19EG;
import X.C452501pT;
import X.C694130RKp;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import X.InterfaceC694120RKo;
import android.view.View;
import androidx.lifecycle.ViewModel;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeBugFix;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ContainerTree extends ViewModel {
    public static final /* synthetic */ int LLILLL = 0;
    public final C01GW LL = C452501pT.LIZIZ(new C694130RKp());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(268));

    public final LinkedHashMap<BaseContainer<? extends VContainerProtocol, ? extends C03H5>, LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C03H5>>> wQ2() {
        return (LinkedHashMap) this.LL.getValue();
    }

    public final LinkedHashMap<BaseContainer<? extends VContainerProtocol, ? extends C03H5>, LinkedHashSet<VContainerProtocol>> xQ2() {
        return (LinkedHashMap) this.LLILLJJLI.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        wQ2().clear();
        xQ2().clear();
    }

    public final <VC extends BaseContainer<? extends VContainerProtocol, ? extends C03H5>> void vQ2(VC vc) {
        C19EG c19egLIZ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        View viewFindViewById;
        if (vc.getContext() instanceof C19EG) {
            c19egLIZ = (C19EG) vc.getContext();
        } else {
            c19egLIZ = C724240Sb0.LIZ(vc);
            if (c19egLIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        AssemSupervisor assemSupervisorCQ2 = C0RPA.LIZ(c19egLIZ).CQ2(vc);
        if (assemSupervisorCQ2 != null && (copyOnWriteArrayList = assemSupervisorCQ2.LLJILLL) != null) {
            for (InterfaceC665370Q7z interfaceC665370Q7z : copyOnWriteArrayList) {
                if (interfaceC665370Q7z instanceof BaseContainer) {
                    if (!wQ2().containsKey(vc)) {
                        wQ2().put(vc, new LinkedList<>());
                    }
                    LinkedList linkedList = wQ2().get(vc);
                    if (linkedList != null) {
                        linkedList.add(interfaceC665370Q7z);
                    }
                    BaseContainer baseContainer = (BaseContainer) interfaceC665370Q7z;
                    baseContainer.LLJJL = vc;
                    baseContainer.LLJJJJLIIL = vc.nJ2();
                    if (vc.Bo()) {
                        viewFindViewById = vc.LJJIJL().findViewById(baseContainer.LLJJIJIL);
                    } else {
                        View view = vc.getSupervisor().LLJJIII;
                        if (view == null || (viewFindViewById = view.findViewById(baseContainer.LLJJIJIL)) == null) {
                            throw new IllegalStateException("supervisor.containerView==null");
                        }
                    }
                    baseContainer.LLJJI = viewFindViewById;
                    if (interfaceC665370Q7z instanceof VContainerProtocol) {
                        vc.mp((VContainerProtocol) interfaceC665370Q7z);
                    }
                    baseContainer.J4();
                } else if (interfaceC665370Q7z instanceof VContainerProtocol) {
                    if (!xQ2().containsKey(vc)) {
                        wQ2().put(vc, new LinkedList<>());
                    }
                    LinkedHashSet<VContainerProtocol> linkedHashSet = xQ2().get(vc);
                    if (linkedHashSet != null) {
                        linkedHashSet.add(interfaceC665370Q7z);
                    }
                    vc.mp((VContainerProtocol) interfaceC665370Q7z);
                    if (LowScreenOptimizeBugFix.LIZ.baseContainerFix) {
                        if (interfaceC665370Q7z instanceof InterfaceC694120RKo) {
                            ((InterfaceC694120RKo) interfaceC665370Q7z).J4();
                        }
                    } else {
                        Boolean.valueOf(interfaceC665370Q7z instanceof InterfaceC694120RKo).booleanValue();
                        vc.J4();
                    }
                }
            }
        }
    }
}
