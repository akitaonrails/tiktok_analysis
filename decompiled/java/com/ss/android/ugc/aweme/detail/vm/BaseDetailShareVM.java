package com.ss.android.ugc.aweme.detail.vm;

import X.C098200Yq;
import X.C0AAG;
import X.C0PDP;
import X.C13BV;
import X.C189200o6;
import X.C2189821An6;
import X.C2217381BqS;
import X.C626160OhC;
import X.C736820SvI;
import X.C736940SvU;
import X.InterfaceC1209780haS;
import X.InterfaceC1216440hlC;
import X.InterfaceC1603360rpG;
import X.InterfaceC1891350zJl;
import X.InterfaceC636270OxV;
import X.InterfaceC636340Oxc;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseDetailShareVM<S extends InterfaceC636340Oxc<S, ITEM>, ITEM extends InterfaceC1891350zJl, Cursor> extends AssemListViewModel<S, ITEM, Cursor> implements InterfaceC1603360rpG, C0PDP, InterfaceC1216440hlC {
    public boolean LL;
    public InterfaceC1209780haS LLILLJJLI;
    public Fragment LLILLL;
    public DetailLoadStateManager LLILZ;

    @Override // X.InterfaceC1216440hlC
    public boolean aH0() {
        return this instanceof TakoAIVideoFeedViewModel;
    }

    public /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this;
    }

    @Override // X.InterfaceC1603360rpG
    public void unInit() {
        this.LLILLJJLI = null;
        this.LL = false;
        this.LLILLL = null;
    }

    public abstract int vQ2(String str);

    public boolean wQ2() {
        return false;
    }

    public abstract Aweme xQ2(ITEM item);

    public abstract Cursor yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z);

    public boolean LJIIJJI() {
        InterfaceC636270OxV interfaceC636270OxV = (InterfaceC636270OxV) this.vmDispatcher.getState();
        C626160OhC c626160OhCLIZ = interfaceC636270OxV.getLoadMoreState().LIZ();
        if (c626160OhCLIZ != null) {
            return c626160OhCLIZ.LIZIZ;
        }
        C626160OhC c626160OhCLIZ2 = interfaceC636270OxV.getRefreshState().LIZ();
        if (c626160OhCLIZ2 != null) {
            return c626160OhCLIZ2.LIZIZ;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    @Override // X.C0PDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() {
        /*
            r4 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0SvJ<S extends X.002o> r0 = r4.vmDispatcher
            X.002o r0 = r0.getState()
            X.0OxV r0 = (X.InterfaceC636270OxV) r0
            java.util.List r0 = r0.getListItemState()
            if (r0 == 0) goto L32
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r1.next()
            X.0zJl r0 = (X.InterfaceC1891350zJl) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.xQ2(r0)
            if (r0 == 0) goto L1c
            r2.add(r0)
            goto L1c
        L32:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L3b
        L35:
            java.util.List r0 = X.C13LP.LLIIII(r2)
            if (r0 == 0) goto L32
        L3b:
            r3.addAll(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM.getAwemeList():java.util.List");
    }

    @Override // X.InterfaceC1603360rpG
    public boolean isDataEmpty() {
        List listItemState = ((InterfaceC636270OxV) this.vmDispatcher.getState()).getListItemState();
        return listItemState == null || listItemState.isEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public boolean isLoading() {
        return this.LL;
    }

    public final void AQ2(LifecycleOwner lifecycleOwner) {
        if (!this._initialized) {
            C736940SvU.LIZ(this, new AwS563S0100000_19(lifecycleOwner, 984), null, null, null, AFwS207S0000000_19.get$arr$(95), AFwS257S0000000_19.get$arr$(135));
        }
    }

    @Override // X.InterfaceC1603360rpG
    public void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        Object c098200Yq;
        this.LLILLJJLI = interfaceC1209780haS;
        try {
            c098200Yq = this.LLILLL;
            if (c098200Yq == null) {
                c098200Yq = interfaceC1209780haS.getFragment();
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment fragment = (Fragment) c098200Yq;
        AwS385S0200000_19 awS385S0200000_19 = new AwS385S0200000_19((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 22);
        AwS420S0200000_19 awS420S0200000_19 = new AwS420S0200000_19((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 41);
        AwS375S0200000_9 awS375S0200000_9 = new AwS375S0200000_9((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 27);
        if (fragment != null && C0AAG.LIZ()) {
            asyncSubscribe(new C2217381BqS() { // from class: X.0Sip
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getRefreshState();
                }
            }, fragment, C736820SvI.LIZLLL(), awS385S0200000_19, awS420S0200000_19, awS375S0200000_9);
        } else {
            asyncSubscribe(new C2217381BqS() { // from class: X.0Siq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getRefreshState();
                }
            }, C736820SvI.LIZLLL(), awS385S0200000_19, awS420S0200000_19, awS375S0200000_9);
        }
        AwS385S0200000_19 awS385S0200000_192 = new AwS385S0200000_19((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 20);
        AwS420S0200000_19 awS420S0200000_192 = new AwS420S0200000_19((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 39);
        AwS375S0200000_9 awS375S0200000_92 = new AwS375S0200000_9((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 25);
        if (fragment != null && C0AAG.LIZ()) {
            asyncSubscribe(new C2217381BqS() { // from class: X.0P3h
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getLoadLatestState();
                }
            }, fragment, C736820SvI.LIZLLL(), awS385S0200000_192, awS420S0200000_192, awS375S0200000_92);
        } else {
            asyncSubscribe(new C2217381BqS() { // from class: X.0P3i
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getLoadLatestState();
                }
            }, C736820SvI.LIZLLL(), awS385S0200000_192, awS420S0200000_192, awS375S0200000_92);
        }
        AwS385S0200000_19 awS385S0200000_193 = new AwS385S0200000_19((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 21);
        AwS420S0200000_19 awS420S0200000_193 = new AwS420S0200000_19((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 40);
        AwS375S0200000_9 awS375S0200000_93 = new AwS375S0200000_9((BaseDetailShareVM) this, interfaceC1209780haS, (InterfaceC1209780haS) 26);
        if (fragment != null && C0AAG.LIZ()) {
            asyncSubscribe(new C2217381BqS() { // from class: X.0Sin
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getLoadMoreState();
                }
            }, fragment, C736820SvI.LIZLLL(), awS385S0200000_193, awS420S0200000_193, awS375S0200000_93);
        } else {
            asyncSubscribe(new C2217381BqS() { // from class: X.0Sio
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((InterfaceC636270OxV) obj).getLoadMoreState();
                }
            }, C736820SvI.LIZLLL(), awS385S0200000_193, awS420S0200000_193, awS375S0200000_93);
        }
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        int iVQ2 = vQ2(str);
        if (iVQ2 >= 0) {
            InterfaceC1209780haS interfaceC1209780haS = this.LLILLJJLI;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.Y1(iVQ2);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public boolean init(Fragment fragment) {
        if (C0AAG.LIZ()) {
            this.LLILLL = fragment;
            return true;
        }
        return true;
    }

    public List<ITEM> zQ2(S s) {
        List<ITEM> listItemState = s.getListItemState();
        if (listItemState == null) {
            return C13BV.INSTANCE;
        }
        return listItemState;
    }

    @Override // X.InterfaceC1603360rpG
    public void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        Cursor cursorYQ2 = yQ2(i, c2189821An6, i2, z);
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    manualListLoadMore(cursorYQ2);
                    return;
                }
                return;
            }
            manualListLoadLatest(cursorYQ2);
            return;
        }
        manualListRefresh();
    }
}
