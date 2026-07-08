package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DXR;
import X.C0QSJ;
import X.C1153920g8M;
import X.C1153940g8O;
import X.C1196320hEk;
import X.C1218590hof;
import X.C1222860hvY;
import X.C1223620hwm;
import X.C1224280hxq;
import X.C127G;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC452301pR;
import X.InterfaceC1146704e9;
import X.InterfaceC1224160hxe;
import X.InterfaceC1224180hxg;
import X.InterfaceC1224210hxj;
import X.InterfaceC1224750hyb;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC897330ZId;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObjectS393S0100000_19;
import Y.AsS46S0100000_19;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomCellProtocol;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.SelectorContentPageContainerScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorTabContactListVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorTabContactListAssem extends UIListContentAssem<SelectorTabContactListVM> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLIZLLLIL = C1223620hwm.LIZLLL(this);
    public final C01GW LLJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AwS563S0100000_19(new C1559260qg8(new C723580SZw(this, C1153940g8O.class, "tab_fragment_hierarchy_data"), checkSupervisorPrepared()), (C1559260qg8<C1153920g8M>) 2947));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2632));
    public final AssemVMLazy LLJIJIL;
    public final C01GW LLJILJIL;
    public volatile InterfaceC1224160hxe LLJILJILJ;
    public volatile InterfaceC1224750hyb LLJILLL;
    public C127G LLJJ;
    public InterfaceC665370Q7z LLJJI;
    public C0QSJ LLJJIII;
    public C0QSJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorTabContactListAssem.class, "contentPageContainerAbility", "getContentPageContainerAbility()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/ability/ISelectorContentPageAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorTabContactListAssem.class, "selectorContainerAbility", "getSelectorContainerAbility()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/ability/ISelectorContainerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SelectorTabContactListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorTabContactListVM;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public SelectorTabContactListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorTabContactListVM.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2633), AFwS257S0000000_19.get$arr$(524), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2631));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SelectorContentPageContainerScope.class, ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectorContentPageContainerScope.class);
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        InterfaceC1224180hxg interfaceC1224180hxgLIZIZ = ((InterfaceC1224210hxj) this.LLJI.getValue()).LIZIZ();
        C20603715jn c20603715jn = new C20603715jn();
        C1223620hwm.LIZ(interfaceC1224180hxgLIZIZ, c20603715jn);
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1224750hyb Lo() {
        /*
            r4 = this;
            X.0hyb r0 = r4.LLJILLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            X.0hyb r0 = r4.LLJILLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLJJIII     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJJI     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLJJI = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope> r1 = com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLJJIII = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<X.0hyb> r0 = X.InterfaceC1224750hyb.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            X.0hyb r0 = (X.InterfaceC1224750hyb) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLJILLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorTabContactListAssem.Lo():X.0hyb");
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorTabContactListVM.class, new AObjectS393S0100000_19(this, 9)}, defaultViewModelProviderFactory);
                    this.LLJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        InterfaceC897330ZId interfaceC897330ZIdIN2;
        super.onDestroy();
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        SelectorTabContactListVM selectorTabContactListVM = (SelectorTabContactListVM) assemVMLazy.getValue();
        selectorTabContactListVM.LLIZLLLIL = false;
        selectorTabContactListVM.setState(new AwS598S0100000_19(selectorTabContactListVM, 648));
        InterfaceC1224750hyb interfaceC1224750hybLo = Lo();
        if (interfaceC1224750hybLo == null || (interfaceC897330ZIdIN2 = interfaceC1224750hybLo.IN2()) == null) {
            return;
        }
        interfaceC897330ZIdIN2.LJII();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        InterfaceC897330ZId interfaceC897330ZIdIN2;
        super.onStart();
        InterfaceC1224750hyb interfaceC1224750hybLo = Lo();
        if (interfaceC1224750hybLo == null || (interfaceC897330ZIdIN2 = interfaceC1224750hybLo.IN2()) == null) {
            return;
        }
        interfaceC897330ZIdIN2.LJ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        InterfaceC897330ZId interfaceC897330ZIdIN2;
        super.onStop();
        InterfaceC1224750hyb interfaceC1224750hybLo = Lo();
        if (interfaceC1224750hybLo == null || (interfaceC897330ZIdIN2 = interfaceC1224750hybLo.IN2()) == null) {
            return;
        }
        interfaceC897330ZIdIN2.LJII();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void No(boolean r7) {
        /*
            r6 = this;
            X.15jv r1 = r6.Go()
            android.content.Context r0 = X.C1383370m6R.LIZ
            androidx.recyclerview.widget.RecyclerView$LayoutManager r2 = r1.getLayoutManager()
            boolean r1 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r0 = 0
            if (r1 == 0) goto L30
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            if (r2 == 0) goto L30
            int r1 = r2.findFirstCompletelyVisibleItemPosition()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L1b:
            int r1 = X.C1527905yX.LIZ(r1)
            r2 = 1
            r5 = 0
            if (r1 <= 0) goto L2e
            r4 = 1
        L24:
            if (r7 != 0) goto L28
            if (r4 != 0) goto L68
        L28:
            X.0hxe r1 = r6.LLJILJILJ
            if (r1 != 0) goto L65
            monitor-enter(r6)
            goto L32
        L2e:
            r4 = 0
            goto L24
        L30:
            r1 = r0
            goto L1b
        L32:
            X.0hxe r1 = r6.LLJILJILJ     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto L64
            X.0QSJ r1 = r6.LLJJIII     // Catch: java.lang.Throwable -> L61
            if (r1 != 0) goto L52
            X.0Q7z r3 = r6.LLJJI     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L44
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r6)     // Catch: java.lang.Throwable -> L61
            r6.LLJJI = r3     // Catch: java.lang.Throwable -> L61
        L44:
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L61
            java.lang.Class<com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope> r1 = com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope.class
            r2[r5] = r1     // Catch: java.lang.Throwable -> L61
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L61
            r6.LLJJIII = r1     // Catch: java.lang.Throwable -> L61
            if (r1 == 0) goto L5a
        L52:
            java.lang.Class<X.0hxe> r0 = X.InterfaceC1224160hxe.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L61
            X.0hxe r0 = (X.InterfaceC1224160hxe) r0     // Catch: java.lang.Throwable -> L61
        L5a:
            r6.LLJILJILJ = r0     // Catch: java.lang.Throwable -> L61
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L61
            r1 = r0
            if (r0 == 0) goto L68
            goto L65
        L61:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L64:
            monitor-exit(r6)
        L65:
            r1.j21(r4)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorTabContactListAssem.No(boolean):void");
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().addItemDecoration(new C0DXR() { // from class: X.0hw9
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildAdapterPosition(view2) == 0) {
                    rect.top = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
            }
        });
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        C1196320hEk.LIZIZ(viewOnAttachStateChangeListenerC20604515jvGo, C1558520qew.LJIIL(this));
        viewOnAttachStateChangeListenerC20604515jvGo.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.LIZJ(new C1222860hvY());
        C1218590hof c1218590hof = new C1218590hof((C1224280hxq) this.LLIZLLLIL.getValue(), ((C1153940g8O) this.LLJ.getValue()).LL);
        InterfaceC1224180hxg interfaceC1224180hxgLIZIZ = ((InterfaceC1224210hxj) this.LLJI.getValue()).LIZIZ();
        C20603715jn c20603715jn = new C20603715jn();
        C1223620hwm.LIZ(interfaceC1224180hxgLIZIZ, c20603715jn);
        viewOnAttachStateChangeListenerC20604515jvGo.setListConfig(c20603715jn);
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), ContactSelectorCustomCellProtocol.class, false);
        if (listLIZIZ != null) {
            ((ArrayList) c1218590hof.LLJIJIL).addAll(listLIZIZ);
        }
        viewOnAttachStateChangeListenerC20604515jvGo.LIZJ(c1218590hof);
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AsS46S0100000_19(this, 14));
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hv3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218610hoh) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 193), 4);
    }
}
