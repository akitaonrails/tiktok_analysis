package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC738140SxQ;
import X.C0QSJ;
import X.C0S4U;
import X.C1204000hR8;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1584420rKi;
import X.C1586430rNx;
import X.C2217381BqS;
import X.C296200BjG;
import X.C622680Oba;
import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1581600rGA;
import X.InterfaceC1581610rGB;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.ability.TabLifecycleAbility;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.IHomeTabSavedStateService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS130S0101000_24;
import kotlin.jvm.internal.AwS36S0001000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class TopTabAssem extends AbstractC738140SxQ implements InterfaceC1581610rGB, InterfaceC1581600rGA, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public volatile HomeTabAbility LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C0QSJ LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopTabAssem.class, "homeTabAbility", "getHomeTabAbility()Lcom/bytedance/tiktok/homepage/mainfragment/HomeTabAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeHide(Bundle bundle) {
    }

    @Override // X.InterfaceC1581610rGB
    public final void onNodeShow(Bundle bundle) {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility bo() {
        /*
            r4 = this;
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = r4.LL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLILLL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLILLJJLI     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility> r0 = com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r0 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LL = r0     // Catch: java.lang.Throwable -> L35
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.TopTabAssem.bo():com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility");
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        m262do(AFwS264S0000000_24.get$arr$(204));
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        m262do(AFwS264S0000000_24.get$arr$(205));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m262do(Function1<? super TopTabProtocol, Unit> function1) {
        HomeTabAbility homeTabAbilityBo;
        if (C296200BjG.LIZ()) {
            homeTabAbilityBo = bo();
            if (homeTabAbilityBo == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            homeTabAbilityBo = (HomeTabAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), HomeTabAbility.class);
        }
        Iterator<TopTabProtocol> it2 = homeTabAbilityBo.b9().iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        HomeTabAbility homeTabAbilityBo;
        Fragment fragment;
        TopTabProtocol next;
        BottomTabProtocol next2;
        String strPz;
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null && (homeTabAbilityBo = bo()) != null) {
            Iterator<TopTabProtocol> it2 = homeTabAbilityBo.b9().iterator();
            while (true) {
                fragment = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    TopTabProtocol topTabProtocol = next;
                    if (topTabProtocol.LJII() == c1584420rKi.LIZJ || Intrinsics.LJFF(topTabProtocol.getMob(), c1584420rKi.LIZIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TopTabProtocol topTabProtocol2 = next;
            if (topTabProtocol2 == null || (strPz = topTabProtocol2.getTag()) == null) {
                Iterator<BottomTabProtocol> it3 = homeTabAbilityBo.Sz().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getMob(), c1584420rKi.LIZIZ)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                BottomTabProtocol bottomTabProtocol = next2;
                if (bottomTabProtocol != null) {
                    strPz = bottomTabProtocol.getTag();
                } else {
                    IBaseListFragmentPanel iBaseListFragmentPanel = c1584420rKi.LIZLLL;
                    if (iBaseListFragmentPanel != null) {
                        fragment = iBaseListFragmentPanel.getFragment();
                    }
                    strPz = homeTabAbilityBo.pz(fragment);
                }
            }
            tabSwitchMetricServiceLIZ.LJJIJIIJI(strPz);
        }
    }

    @Override // X.InterfaceC1581610rGB
    public final void Ae(int i, Fragment fragment) {
        m262do(new AwS130S0101000_24(i, fragment, 1));
    }

    @Override // X.InterfaceC1581600rGA
    public final void LLZLLLL(View view, Bundle bundle) {
        m262do(new AwS390S0200000_24(view, bundle, this, 12));
    }

    @Override // X.InterfaceC1581610rGB
    public final void u5(int i, boolean z) {
        m262do(new AwS36S0001000_24(i, 11));
    }

    @Override // X.InterfaceC1581600rGA
    public final void xh(Fragment fragment, Bundle bundle) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        TabLifecycleAbility tabLifecycleAbility;
        String strLIZ;
        HomeTabAbility homeTabAbilityBo;
        IHomeTabSavedStateService.LIZ.getClass();
        IHomeTabSavedStateService iHomeTabSavedStateServiceLIZ = C1586430rNx.LIZ();
        if (iHomeTabSavedStateServiceLIZ != null && (strLIZ = iHomeTabSavedStateServiceLIZ.LIZ()) != null && strLIZ.length() != 0 && (homeTabAbilityBo = bo()) != null) {
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainFragment", bundle2);
            homeTabAbilityBo.fw0(bundle2, strLIZ);
        }
        MainActivityScope mainActivityScopeLIZIZ = C0S4U.LIZIZ(fragment);
        if (mainActivityScopeLIZIZ != null && (interfaceC665370Q7z = mainActivityScopeLIZIZ.LL) != null && (tabLifecycleAbility = (TabLifecycleAbility) C1558520qew.LIZ(interfaceC665370Q7z, TabLifecycleAbility.class, null)) != null) {
            tabLifecycleAbility.LO0(fragment);
        }
    }
}
