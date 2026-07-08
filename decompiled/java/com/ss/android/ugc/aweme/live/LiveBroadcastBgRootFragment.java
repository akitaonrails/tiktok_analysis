package com.ss.android.ugc.aweme.live;

import X.AnonymousClass1995;
import X.C098200Yq;
import X.C0IJT;
import X.C0WZX;
import X.C1685300txQ;
import X.C168R;
import X.C168Y;
import X.C1844940y6u;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AKO;
import X.C1AKP;
import X.C1AKR;
import X.C2204961BRm;
import X.C474500IjA;
import X.C474750IjZ;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C786410Ut5;
import X.InterfaceC773130UUl;
import X.InterfaceC782610Umx;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.NotifyRemoveLiveBroadcastFragmentEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.live.LiveBroadcastBgRootFragment;
import com.ss.android.ugc.aweme.live.LiveEndFragmentObserver;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveBroadcastBgRootFragment extends BaseLiveSdkSceneFragment implements AnonymousClass1995 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyHELIOSp9BCw6LA0hJyQoKi4gPAcrGyA8PAM+KCg+LSs4";
    public C1AKO LLJJIII;
    public C1AKR LLJJIJI;
    public C1AKP LLJJIJIIJIL;

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void onWindowFocusChanged(boolean z) {
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void finish() {
        C1AKO c1ako = this.LLJJIII;
        if (c1ako != null) {
            c1ako.finish();
        }
        super.finish();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        C1AKR c1akr = this.LLJJIJI;
        if (C500260Jjc.LJJJI(c1akr != null ? Boolean.valueOf(c1akr.onBackPressed()) : null)) {
            return true;
        }
        C1AKO c1ako = this.LLJJIII;
        if (C500260Jjc.LJJJI(c1ako != null ? Boolean.valueOf(c1ako.onBackPressed()) : null)) {
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1AKP] */
    public LiveBroadcastBgRootFragment() {
        aS(AFwS278S0000000_32.get$arr$(60));
        this.LLJJIJIIJIL = new InterfaceC773130UUl() { // from class: X.1AKP
            @Override // X.InterfaceC773130UUl
            public final void LIZIZ(C779220UhU c779220UhU, IntentFilter intentFilter) {
            }

            @Override // X.InterfaceC773130UUl
            public final void LIZJ() {
            }

            @Override // X.InterfaceC773130UUl
            public final void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC773130UUl
            public final void LJ(C779220UhU c779220UhU) {
            }

            @Override // X.InterfaceC773130UUl
            public final void LIZ(Bundle bundle) {
                Fragment fragment;
                Fragment fragment2;
                C19EH c19ehLJIIJ;
                Fragment fragment3;
                C19EH c19ehLJIIJ2;
                this.LIZ.LLJJIJI = Live.getService().createLiveBroadcastEndFragment(bundle);
                boolean zShowFinishEncourage = Live.getService().showFinishEncourage();
                C1AKR c1akr = this.LIZ.LLJJIJI;
                if (c1akr != null) {
                    fragment = c1akr.getFragment();
                } else {
                    fragment = null;
                }
                LiveEndFragmentObserver.LIZ(fragment);
                if (zShowFinishEncourage) {
                    FragmentManager fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(this.LIZ);
                    C1AKR c1akr2 = this.LIZ.LLJJIJI;
                    if (c1akr2 != null && (fragment3 = c1akr2.getFragment()) != null) {
                        LiveBroadcastBgRootFragment liveBroadcastBgRootFragment = this.LIZ;
                        if (fragmentManagerLJIIJJI != null && (c19ehLJIIJ2 = fragmentManagerLJIIJJI.LJIIJ()) != null) {
                            c19ehLJIIJ2.LIZIZ(R.id.iiv, fragment3);
                            c19ehLJIIJ2.LJIIL();
                        }
                        DataChannelGlobal.LLILZ.BQ2(fragment3, fragment3, NotifyRemoveLiveBroadcastFragmentEvent.class, new AwS612S0100000_33(liveBroadcastBgRootFragment, 84));
                        return;
                    }
                    return;
                }
                FragmentManager fragmentManagerLJIIJJI2 = SAFExtensionKt.LJIIJJI(this.LIZ);
                C1AKR c1akr3 = this.LIZ.LLJJIJI;
                if (c1akr3 != null && (fragment2 = c1akr3.getFragment()) != null && fragmentManagerLJIIJJI2 != null && (c19ehLJIIJ = fragmentManagerLJIIJJI2.LJIIJ()) != null) {
                    c19ehLJIIJ.LJIJ(R.id.iiv, fragment2, null);
                    c19ehLJIIJ.LJIIL();
                }
                this.LIZ.LLJJIII = null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Live.getService().setBroadcastActivity(null);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Function1 function1 = (Function1) dataChannelGlobal.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(0);
        }
        List list = (List) dataChannelGlobal.gg0(C168R.class);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC782610Umx) it2.next()).LIZ(0);
            }
        }
        this.LLJJIJIIJIL = null;
        C474750IjZ.LIZ();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        String strLJJIJIL;
        boolean z;
        Context activity;
        Fragment fragment;
        C19EH c19ehLJIIJ;
        Intent intent;
        ComponentName component;
        super.LLLLIILLL(bundle);
        if (bundle != null) {
            C1844940y6u.LIZIZ(getContext(), this, bundle);
            C19EG activity2 = getActivity();
            if (activity2 == null || (intent = activity2.getIntent()) == null || (component = intent.getComponent()) == null || (strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA8DvnvqwrRO6ZqM5OHEQR+KRBkLC7Iru504ve", null))) == null) {
                strLJJIJIL = "";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_broadcast_activity_from");
            c474500IjALIZ.LJJII(strLJJIJIL, "from");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            if (this.LLJJIII == null) {
                z = true;
            } else {
                z = false;
            }
            c474500IjALIZ.LJJII(Boolean.valueOf(z), "fragment_is_null");
            c474500IjALIZ.LIZ();
            String string = bundle.getString("request_page");
            if (Intrinsics.LJFF("live_end_page", string)) {
                FragmentManager fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(this);
                Live.getService().LLJILJILJ(string);
                vQ();
                int i = bundle.getInt("broadcast_type", 0);
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LLJJIII = Live.getService().LJLZ(this.LLJJIJIIJIL, bundle);
                        }
                    } else {
                        this.LLJJIII = Live.getService().pk(this.LLJJIJIIJIL, bundle);
                    }
                } else {
                    this.LLJJIII = Live.getService().createObsBroadcastFragment(this.LLJJIJIIJIL, bundle);
                }
                C1AKO c1ako = this.LLJJIII;
                if (c1ako != null && (fragment = c1ako.getFragment()) != null && fragmentManagerLJIIJJI != null && (c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ()) != null) {
                    c19ehLJIIJ.LJIJ(R.id.iiv, fragment, null);
                    c19ehLJIIJ.LJIIIZ();
                }
                if (C504210Jpz.LIZ) {
                    activity = getContext();
                } else {
                    activity = getActivity();
                }
                if (activity != null) {
                    Live.getService().setBroadcastActivity(activity);
                    Live.getService().preloadLiveStream(activity, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.LiveBroadcastBgRootFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.daw, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
