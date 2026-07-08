package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC848400XPy;
import X.AnonymousClass0956;
import X.C003B;
import X.C054G;
import X.C09A1;
import X.C0OPX;
import X.C0PEM;
import X.C0XQ7;
import X.C13LP;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2152808c2;
import X.C2188811AlT;
import X.C2229308oN;
import X.C2229608oQ;
import X.C2229708oR;
import X.C2229808oS;
import X.C2231808om;
import X.C2233808p6;
import X.C2233908p7;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C2502509rL;
import X.C621370OYt;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC2229408oO;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class BulletinMediaViewModel extends AssemViewModel<C003B> {
    public final C23119094b LL;
    public final C2229308oN LLILLJJLI;
    public final C621370OYt LLILLL;
    public final C2231808om LLILZ;
    public final C2229708oR LLILZIL;
    public AnonymousClass0956 LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C003B(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC2229408oO interfaceC2229408oO;
        C0OPX.LJII("BulletinMediaViewModel: onCleared releasing resources");
        AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = null;
        this.LLILLL.LJI();
        C2233808p6.LIZ.getClass();
        for (C2233908p7 c2233908p7 : C13LP.LLIIII(C2233808p6.LIZJ.values())) {
            if (c2233908p7.LJIIIZ != 0 && !c2233908p7.LJIIJJI) {
                C2233808p6.LIZIZ(c2233908p7, "page_leave");
            }
        }
        C2233808p6.LIZJ.clear();
        C2231808om c2231808om = this.LLILZ;
        c2231808om.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceDownloader: cancelAll (");
        sbLIZ.append(c2231808om.LIZJ.size());
        sbLIZ.append(" tasks)");
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(c2231808om.LIZJ);
        Iterator it2 = mapLJIIZILJ.values().iterator();
        while (it2.hasNext()) {
            ((C2229808oS) it2.next()).LIZ.LIZIZ(null);
        }
        c2231808om.LIZJ.clear();
        for (String str : mapLJIIZILJ.keySet()) {
            C2233808p6 c2233808p6 = C2233808p6.LIZ;
            int size = mapLJIIZILJ.size();
            c2233808p6.getClass();
            C2233808p6.LJFF(size, 0L, null, str, "cancelled", null);
        }
        C2229308oN c2229308oN = this.LLILLJJLI;
        WeakReference<InterfaceC2229408oO> weakReference = c2229308oN.LIZIZ;
        if (weakReference != null && (interfaceC2229408oO = weakReference.get()) != null) {
            interfaceC2229408oO.LIZIZ();
        }
        c2229308oN.LIZIZ = null;
        ((LinkedHashMap) c2229308oN.LIZ).clear();
        this.LL.LIZIZ(null);
        super.onCleared();
    }

    public final void vQ2() {
        InterfaceC2229408oO interfaceC2229408oO;
        C2229308oN c2229308oN = this.LLILLJJLI;
        WeakReference<InterfaceC2229408oO> weakReference = c2229308oN.LIZIZ;
        if (weakReference != null && (interfaceC2229408oO = weakReference.get()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBMediaCoordinator: pausing active ");
            sbLIZ.append(interfaceC2229408oO.LIZ());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            interfaceC2229408oO.LIZIZ();
        }
        c2229308oN.LIZIZ = null;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.08oR] */
    public BulletinMediaViewModel() {
        C2502509rL c2502509rL = new C2502509rL(CoroutineExceptionHandler.LJJLIL, 3);
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LL = c23119094bLIZ;
        C23119094b c23119094b = new C23119094b(c23119094bLIZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094b, C2107308Nj.LIZ.LLIILII()).plus(c2502509rL));
        C054G c054gLIZ2 = C2296808zG.LIZ(C09A1.LIZLLL(new C23119094b(c23119094bLIZ), C0PEM.LIZJ).plus(c2502509rL));
        this.LLILLJJLI = new C2229308oN();
        this.LLILLL = new C621370OYt(c054gLIZ);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        String uid = (curUser == null || (uid = curUser.getUid()) == null) ? "" : uid;
        C844470XAv.LIZ.getClass();
        this.LLILZ = new C2231808om(new C2152808c2(C844470XAv.LIZ(), uid, ""), c054gLIZ2);
        this.LLILZIL = new InterfaceC2229408oO() { // from class: X.08oR
            public final EnumC2229208oM LIZ = EnumC2229208oM.VOICE_PLAY;

            @Override // X.InterfaceC2229408oO
            public final void LIZIZ() {
                this.LIZIZ.LLILLL.LIZLLL();
            }

            @Override // X.InterfaceC2229408oO
            public final EnumC2229208oM LIZ() {
                return this.LIZ;
            }
        };
        this.LLILLJJLI.LIZ(this.LLILZIL);
        this.LLILZLL = C23250099c.LIZLLL(c054gLIZ, null, null, new C2229608oQ(this, null), 3);
        C0OPX.LJII("BulletinMediaViewModel created (fragment-scoped)");
    }
}
