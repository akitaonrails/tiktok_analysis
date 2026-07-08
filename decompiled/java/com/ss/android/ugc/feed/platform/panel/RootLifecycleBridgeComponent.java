package com.ss.android.ugc.feed.platform.panel;

import X.AbstractC738140SxQ;
import X.C1566080qr8;
import X.C1566090qr9;
import X.C1566110qrB;
import X.C2188811AlT;
import X.C724240Sb0;
import X.InterfaceC735760Sta;
import X.InterfaceC743730TFj;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class RootLifecycleBridgeComponent extends BasePanelUIComponent implements InterfaceC735760Sta {
    public BaseListFragmentPanel LLJIJIL;

    @Override // X.InterfaceC743730TFj
    public final void Tg() {
    }

    @Override // X.InterfaceC743730TFj
    public final void L() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onDestroy();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).L();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void LLLZIL() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onStart();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).LLLZIL();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void M() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onPause();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).M();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void cq() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onResume();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).cq();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void dd() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onDestroyView();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).dd();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void fl() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onDetach();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).fl();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void w4() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onStop();
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                arrayList.add(abstractC738140SxQ);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC743730TFj) it2.next()).w4();
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void M1(Configuration configuration) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onConfigurationChanged(configuration);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC743730TFj) it2.next()).M1(configuration);
            }
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void Mf(Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onViewStateRestored(bundle);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC743730TFj) it2.next()).Mf(bundle);
            }
        }
    }

    @Override // X.InterfaceC743730TFj
    public void P9(Bundle bundle) {
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate():");
        sbLIZ.append(getPanelContext().LJ);
        C1566080qr8.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onCreate(bundle);
        }
    }

    @Override // X.InterfaceC743730TFj
    public final void Re(Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onSaveInstanceState(bundle);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC743730TFj) it2.next()).Re(bundle);
            }
        }
    }

    @Override // X.InterfaceC743730TFj
    public void Bg(Activity activity, Fragment fragment) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onAttach(activity, fragment);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC743730TFj) it2.next()).Bg(activity, fragment);
            }
        }
    }

    @Override // X.InterfaceC743730TFj
    public void LLZLLLL(View view, Bundle bundle) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        BaseListFragmentPanel baseListFragmentPanel = this.LLJIJIL;
        if (baseListFragmentPanel != null) {
            baseListFragmentPanel.onViewCreated(view, bundle);
        }
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC743730TFj) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC743730TFj) it2.next()).LLZLLLL(view, bundle);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    @Override // X.InterfaceC735760Sta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View V2(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C724240Sb0.LJ(r5)
            if (r0 == 0) goto L25
            java.util.concurrent.CopyOnWriteArrayList<X.0SxQ> r0 = r0.LLJILLL
            if (r0 == 0) goto L25
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.InterfaceC735760Sta
            if (r0 == 0) goto L13
            r3.add(r1)
            goto L13
        L25:
            r4 = 0
            goto L33
        L27:
            java.lang.Object r0 = X.C13LP.LJJJLL(r3)
            X.0Sta r0 = (X.InterfaceC735760Sta) r0
            if (r0 == 0) goto L25
            android.view.View r4 = r0.V2(r6, r7, r8)
        L33:
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C724240Sb0.LJ(r5)
            if (r0 == 0) goto L6c
            java.util.concurrent.CopyOnWriteArrayList<X.0SxQ> r0 = r0.LLJILLL
            if (r0 == 0) goto L6c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.InterfaceC743730TFj
            if (r0 == 0) goto L46
            r3.add(r1)
            goto L46
        L58:
            java.util.Iterator r1 = r3.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r1.next()
            X.0TFj r0 = (X.InterfaceC743730TFj) r0
            r0.Tg()
            goto L5c
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent.V2(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
