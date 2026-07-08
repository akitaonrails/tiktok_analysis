package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger;

import X.C1275304yt;
import X.C13LP;
import X.InterfaceC1165550gR7;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PdpTriggerService implements IPdpTriggerService, GenericLifecycleObserver {
    public final C1275304yt LL;
    public final List<InterfaceC1165550gR7> LLILLJJLI = new ArrayList();
    public final Set<String> LLILLL = new LinkedHashSet();
    public boolean LLILZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService
    public final void qQ0() {
        this.LLILZ = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ((ArrayList) this.LLILLJJLI).clear();
        this.LLILLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService
    public final void sN() {
        this.LLILLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService
    public final void GA0(int i) {
        LIZLLL(i);
    }

    public final boolean LIZ(InterfaceC1165550gR7 interfaceC1165550gR7) {
        Boolean boolValueOf;
        boolean z;
        List<PdpTriggerModel> listLIZJ = interfaceC1165550gR7.LIZJ();
        if (listLIZJ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<PdpTriggerModel> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                String str = it2.next().onceKey;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!this.LLILLL.contains(it3.next())) {
                        z = false;
                        break;
                    }
                }
                z = true;
                boolValueOf = Boolean.valueOf(z);
            } else {
                z = true;
                boolValueOf = Boolean.valueOf(z);
            }
        } else {
            boolValueOf = null;
        }
        return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
    }

    public final void LIZLLL(int i) {
        if ((this.LL.LIZ && !this.LLILZ) || i == -1) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1165550gR7 interfaceC1165550gR7 : (ArrayList) this.LLILLJJLI) {
            List<PdpTriggerModel> listLIZJ = interfaceC1165550gR7.LIZJ();
            if (listLIZJ != null && !listLIZJ.isEmpty()) {
                int index = interfaceC1165550gR7.getIndex();
                if (index == -1) {
                    arrayList.add(interfaceC1165550gR7);
                } else {
                    for (PdpTriggerModel pdpTriggerModel : listLIZJ) {
                        Integer num = pdpTriggerModel.distanceItemCount;
                        String str = pdpTriggerModel.onceKey;
                        if (num != null && num.intValue() > 0 && str != null && str.length() != 0 && !this.LLILLL.contains(str) && Math.abs(index - i) <= num.intValue()) {
                            LIZIZ(interfaceC1165550gR7, pdpTriggerModel);
                        }
                    }
                    if (LIZ(interfaceC1165550gR7)) {
                        arrayList.add(interfaceC1165550gR7);
                    }
                }
            } else {
                arrayList.add(interfaceC1165550gR7);
            }
        }
        ((ArrayList) this.LLILLJJLI).removeAll(C13LP.LLIIJI(arrayList));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService
    public final void nD2(InterfaceC1165550gR7 interfaceC1165550gR7) {
        String str;
        List<PdpTriggerModel> listLIZJ = interfaceC1165550gR7.LIZJ();
        if (listLIZJ != null && !listLIZJ.isEmpty()) {
            boolean z = false;
            for (PdpTriggerModel pdpTriggerModel : listLIZJ) {
                Integer num = pdpTriggerModel.bindData;
                if (num != null && num.intValue() == 1 && (str = pdpTriggerModel.onceKey) != null && !this.LLILLL.contains(str)) {
                    LIZIZ(interfaceC1165550gR7, pdpTriggerModel);
                    z = true;
                }
            }
            if (z && LIZ(interfaceC1165550gR7)) {
                ((ArrayList) this.LLILLJJLI).remove(interfaceC1165550gR7);
            }
        }
        LIZLLL(interfaceC1165550gR7.getIndex());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.trigger.IPdpTriggerService
    public final void rr2(List<? extends InterfaceC1165550gR7> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        for (InterfaceC1165550gR7 interfaceC1165550gR7 : list) {
            List<PdpTriggerModel> listLIZJ = interfaceC1165550gR7.LIZJ();
            if (listLIZJ != null && !listLIZJ.isEmpty() && !listLIZJ.isEmpty()) {
                Iterator<PdpTriggerModel> it2 = listLIZJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str = it2.next().onceKey;
                    if (str != null && str.length() != 0 && !this.LLILLL.contains(str)) {
                        this.LLILLJJLI.add(interfaceC1165550gR7);
                        break;
                    }
                }
            }
        }
    }

    public PdpTriggerService(C1275304yt c1275304yt, Lifecycle lifecycle) {
        this.LL = c1275304yt;
        lifecycle.addObserver(this);
    }

    public final void LIZIZ(InterfaceC1165550gR7 interfaceC1165550gR7, PdpTriggerModel pdpTriggerModel) {
        String str;
        String str2 = pdpTriggerModel.onceKey;
        if (str2 != null && (str = pdpTriggerModel.actionName) != null && !this.LLILLL.contains(str2)) {
            interfaceC1165550gR7.LIZ(str, pdpTriggerModel.actionParams);
            this.LLILLL.add(str2);
        }
    }
}
