package com.ss.android.ugc.aweme.ecommerce.mixmall.container;

import X.AbstractC1771860wD2;
import X.AbstractC1772270wDh;
import X.AbstractC1773210wFD;
import X.C01GW;
import X.C074B;
import X.C1326250kcJ;
import X.C1326580kcq;
import X.C13BV;
import X.C1508220pLo;
import X.C15438062q;
import X.C1772470wE1;
import X.C1772650wEJ;
import X.C1772670wEL;
import X.C1773120wF4;
import X.C1773140wF6;
import X.C1773230wFF;
import X.C1773380wFU;
import X.C1773520wFi;
import X.C1773630wFt;
import X.C1773680wFy;
import X.C1773790wG9;
import X.C1773830wGD;
import X.C18Z6;
import X.C2097908Jt;
import X.C21319918c1;
import X.C21673319rv;
import X.C21673919s1;
import X.C2249381D2i;
import X.C2272931Dxr;
import X.C23250099c;
import X.C356901a3;
import X.C452501pT;
import X.C599820Nfo;
import X.InterfaceC1772360wDq;
import X.InterfaceC1772680wEM;
import X.InterfaceC1773310wFN;
import X.InterfaceC1773660wFw;
import X.InterfaceC1773770wG7;
import X.InterfaceC1773890wGJ;
import X.InterfaceC1774020wGW;
import X.InterfaceC1774140wGi;
import X.InterfaceC599750Nfh;
import X.InterfaceC606320NqI;
import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.layoutmanager.ECMMKLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMMKContainerController implements InterfaceC1773310wFN, ViewModelStoreOwner {
    public final C1772650wEJ LL;
    public final Context LLILLJJLI;
    public final AbstractC1772270wDh LLILLL;
    public final LifecycleOwner LLILZ;
    public final InterfaceC606320NqI LLILZIL;
    public final InterfaceC599750Nfh LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 644));
    public final C1773680wFy LLIZLLLIL;
    public final C1508220pLo LLJ;
    public final C1773140wF6 LLJI;
    public final List<AbstractC1771860wD2> LLJIJIL;
    public final C01GW LLJILJIL;
    public final ECMMKViewModel LLJILJILJ;
    public final List<InterfaceC1774020wGW> LLJILLL;
    public final C01GW LLJJ;
    public final C1773790wG9 LLJJI;
    public InterfaceC1773770wG7 LLJJIII;
    public boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C1773380wFU<AbstractC1773210wFD> LLJJIJIL;
    public final C18Z6 LLJJJ;
    public final C1773630wFt LLJJJIL;
    public final ECMMKViewModel LLJJJJ;
    public final ECMMKViewModel LLJJJJJIL;

    @Override // X.InterfaceC1773310wFN
    public final C21319918c1 LIZIZ() {
        return (C21319918c1) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1773310wFN
    public final C1772670wEL LJII() {
        return (C1772670wEL) this.LLJJ.getValue();
    }

    public final ECHybridAdapter LJIILL() {
        return (ECHybridAdapter) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel r0 = r6.LLJJJJ
            X.0wEH r5 = r0.c82()
            if (r5 != 0) goto L9
            return
        L9:
            X.0wG7 r0 = r6.LLJJIII
            r4 = 0
            if (r0 == 0) goto L12
            java.lang.String r4 = r0.LJI()
        L12:
            r3 = 0
            r2 = 1
            if (r4 == 0) goto L31
            int r1 = r4.hashCode()
            r0 = -1306012042(0xffffffffb227d676, float:-9.769442E-9)
            if (r1 == r0) goto L7a
            r0 = 3075958(0x2eef76, float:4.310335E-39)
            if (r1 == r0) goto L71
            r0 = 102970646(0x6233516, float:3.0695894E-35)
            if (r1 != r0) goto L31
            java.lang.String r0 = "light"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4a
        L31:
            com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO r0 = r5.LIZIZ
            if (r0 == 0) goto L68
            int r0 = r0.statusBarStyle
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L68
            int r0 = r1.intValue()
            if (r0 == r2) goto L4b
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L68
        L4a:
            r2 = 0
        L4b:
            X.0wEJ r0 = r6.LL
            android.content.Context r0 = r0.LIZIZ
            X.19EG r4 = X.C1388190mED.LIZIZ(r0)
            if (r4 == 0) goto L67
            com.bytedance.immersionbar.ImmersionBar r1 = com.bytedance.immersionbar.ImmersionBar.LJIILJJIL(r4)
            com.bytedance.tux.system.TuxImmersionBar r0 = new com.bytedance.tux.system.TuxImmersionBar
            r0.<init>(r4, r1)
            r0.LIZ(r3)
            r1.LJIIJ(r2)
            r0.LIZLLL()
        L67:
            return
        L68:
            android.content.Context r0 = r6.LLILLJJLI
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 != 0) goto L4a
            goto L4b
        L71:
            java.lang.String r0 = "dark"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L31
            goto L4b
        L7a:
            java.lang.String r0 = "adaptive"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L31
            android.content.Context r0 = r6.LLILLJJLI
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 != 0) goto L4a
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController.LJIILLIIL():void");
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1773310wFN
    public final InterfaceC599750Nfh LIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1773310wFN
    public final InterfaceC1773890wGJ LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1773310wFN
    public final C1772650wEJ LIZLLL() {
        return this.LL;
    }

    @Override // X.InterfaceC1773310wFN
    public final InterfaceC1773770wG7 LJ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1773310wFN
    public final C1773140wF6 LJFF() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1773310wFN
    public final List<InterfaceC1774020wGW> LJI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1773310wFN
    public final ECMMKViewModel LJIIIIZZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1773310wFN
    public final InterfaceC1772680wEM LJIIIZ() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1773310wFN
    public final C1508220pLo LJIIJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1773310wFN
    public final C1773790wG9 LJIIL() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1773310wFN
    public final InterfaceC1772360wDq LJIILIIL() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC1773310wFN
    public final InterfaceC606320NqI getEventCenter() {
        return this.LLILZIL;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController$7, reason: invalid class name */
    public final class AnonymousClass7 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public AnonymousClass7() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZIZ(this, lifecycleOwner);
            ECMMKContainerController eCMMKContainerController = ECMMKContainerController.this;
            eCMMKContainerController.LJIILJJIL(false);
            eCMMKContainerController.getViewModelStore().clear();
            Iterator it2 = ((ArrayList) eCMMKContainerController.LLJIJIL).iterator();
            while (it2.hasNext()) {
                ((AbstractC1771860wD2) it2.next()).LJI();
            }
            C074B.LIZ.getClass();
            if (((Number) C074B.LIZIZ.getValue()).intValue() == 1) {
                ECHybridAdapter eCHybridAdapterLJIILL = eCMMKContainerController.LJIILL();
                C13BV c13bv = C13BV.INSTANCE;
                eCHybridAdapterLJIILL.LL = c13bv;
                eCMMKContainerController.LLJJJ.getRecycledViewPool().clear();
                eCMMKContainerController.LJIILL().LLIZLLLIL = null;
                eCMMKContainerController.LLJJJ.setAdapter(null);
                eCMMKContainerController.LLJJJ.setLayoutManager(null);
                C1773630wFt c1773630wFt = eCMMKContainerController.LLJJJIL;
                ECHybridAdapter eCHybridAdapter = c1773630wFt.LLILLL;
                if (eCHybridAdapter != null) {
                    eCHybridAdapter.LL = c13bv;
                }
                c1773630wFt.getRecycledViewPool().clear();
                ECHybridAdapter eCHybridAdapter2 = c1773630wFt.LLILLL;
                if (eCHybridAdapter2 != null) {
                    eCHybridAdapter2.LLIZLLLIL = null;
                }
                c1773630wFt.LLILLL = null;
                c1773630wFt.setLayoutManager(null);
            }
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ = 0L;
        }
    }

    public ECMMKContainerController(C1772650wEJ c1772650wEJ) {
        this.LL = c1772650wEJ;
        this.LLILLJJLI = c1772650wEJ.LIZIZ;
        this.LLILLL = c1772650wEJ.LJ;
        this.LLILZ = c1772650wEJ.LIZJ;
        this.LLILZIL = c1772650wEJ.LJIIJ;
        this.LLILZLL = c1772650wEJ.LJIIJJI;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(C2272931Dxr.class, new C2272931Dxr());
        this.LLIZLLLIL = new C1773680wFy(concurrentHashMap);
        this.LLJ = c1772650wEJ.LJIILIIL;
        C13BV<InterfaceC1773660wFw> c13bvLIZ = c1772650wEJ.LJII.LIZ();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c13bvLIZ, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (InterfaceC1773660wFw interfaceC1773660wFw : c13bvLIZ) {
            Pair pair = new Pair(interfaceC1773660wFw.getType(), interfaceC1773660wFw);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.LLJI = new C1773140wF6(linkedHashMap);
        this.LLJIJIL = new ArrayList();
        this.LLJILJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(171));
        ECMMKViewModel eCMMKViewModel = (ECMMKViewModel) new ViewModelProvider(this).get(ECMMKViewModel.class);
        this.LLJILJILJ = eCMMKViewModel;
        this.LLJILLL = new CopyOnWriteArrayList();
        this.LLJJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(170));
        this.LLJJI = new C1773790wG9();
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 643));
        this.LLJJIJIL = new C1773380wFU<>(0);
        C18Z6 bodyList = this.LLILLL.getBodyList();
        this.LLJJJ = bodyList;
        C1773630wFt headerView = this.LLILLL.getHeaderView();
        this.LLJJJIL = headerView;
        this.LLJJJJ = eCMMKViewModel;
        this.LLJJJJJIL = eCMMKViewModel;
        eCMMKViewModel.LM0("default_tab_id", new AwS640S0100000_26(this, 32));
        eCMMKViewModel.xQ2(new AwS640S0100000_26(this, 33));
        eCMMKViewModel.yQ2(new AwS605S0100000_26(this, 276));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C1772470wE1(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C1773120wF4(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C1773230wFF(this, null), 3);
        this.LLILZ.getLifecycle().addObserver(new AnonymousClass7());
        bodyList.setLayoutManager(new ECMMKLayoutManager(bodyList));
        bodyList.addItemDecoration(new C1773830wGD(false));
        bodyList.setAdapter(LJIILL());
        headerView.LL = this;
        ECHybridAdapter eCHybridAdapterLIZ = C1773520wFi.LIZ(this, new InterfaceC1774140wGi() { // from class: X.0wGd
            @Override // X.InterfaceC1774140wGi
            public final void LIZ(AbstractC1773460wFc abstractC1773460wFc) {
            }
        });
        headerView.LLILLL = eCHybridAdapterLIZ;
        headerView.setAdapter(eCHybridAdapterLIZ);
        headerView.setLayoutManager(new StaggeredGridLayoutManager() { // from class: com.ss.android.ugc.aweme.ecommerce.mixmall.container.header.ECMMKHeaderRecyclerView$init$2
            @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
                if (C1326580kcq.LIZ()) {
                    C1326250kcJ.LIZIZ().LIZJ("layout_children", "ECMMKHeaderRecyclerView before onLayoutChildren");
                }
                LJJIJ(c21673319rv, c21673919s1, true);
                if (C1326580kcq.LIZ()) {
                    C1326250kcJ.LIZIZ().LIZJ("layout_children", "ECMMKHeaderRecyclerView after onLayoutChildren");
                }
            }
        });
    }

    @Override // X.InterfaceC1773310wFN
    public final void LJIIJJI(C2249381D2i c2249381D2i) {
        this.LLJJIII = c2249381D2i;
    }

    public final void LJIILJJIL(boolean z) {
        this.LLJJIJI = z;
        for (AbstractC1771860wD2 abstractC1771860wD2 : this.LLJIJIL) {
            if (this.LLJJIJI) {
                abstractC1771860wD2.LJIIJJI();
            } else {
                abstractC1771860wD2.LJII();
            }
        }
    }
}
