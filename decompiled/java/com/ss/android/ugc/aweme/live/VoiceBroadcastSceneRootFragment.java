package com.ss.android.ugc.aweme.live;

import X.C098200Yq;
import X.C1685300txQ;
import X.C168R;
import X.C168V;
import X.C168Y;
import X.C1844940y6u;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AKO;
import X.C1AKQ;
import X.C1AKR;
import X.C479860Iro;
import X.C500260Jjc;
import X.C504210Jpz;
import X.C786410Ut5;
import X.EnumC479890Irr;
import X.InterfaceC479850Irn;
import X.InterfaceC773130UUl;
import X.InterfaceC782610Umx;
import android.content.Context;
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
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.dataChannel.NotifyRemoveLiveBroadcastFragmentEvent;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.live.LiveEndFragmentObserver;
import com.ss.android.ugc.aweme.live.VoiceBroadcastSceneRootFragment;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS399S0200000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class VoiceBroadcastSceneRootFragment extends BaseLiveSdkSceneFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9HiHELIOSolKioROiotLSwyOzEfKio9LRcjJjsVOiQrJCo9PA==";
    public C1AKO LLJJIII;
    public C1AKR LLJJIJI;
    public C1AKQ LLJJIJIIJIL;

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLJJIJIIJIL = null;
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
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        dataChannelGlobal2.IQ2(C168V.class);
        LivePitayaEnv.LJIIJ(this);
        super.onDestroy();
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZIZ(this, EnumC479890Irr.BROADCAST);
        dataChannelGlobal2.zQ2(this);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() {
        C1AKR c1akr = this.LLJJIJI;
        if (C500260Jjc.LJJJI(c1akr != null ? Boolean.valueOf(c1akr.onBackPressed()) : null)) {
            return true;
        }
        C1AKO c1ako = this.LLJJIII;
        if (c1ako == null || !c1ako.onBackPressed()) {
            return super.onBackPressed();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1AKQ] */
    public VoiceBroadcastSceneRootFragment() {
        aS(AFwS278S0000000_32.get$arr$(63));
        this.LLJJIJIIJIL = new InterfaceC773130UUl() { // from class: X.1AKQ
            @Override // X.InterfaceC773130UUl
            public final void LIZJ() {
            }

            @Override // X.InterfaceC773130UUl
            public final void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC773130UUl
            public final void LIZ(Bundle bundle) {
                Fragment fragment;
                VoiceBroadcastSceneRootFragment voiceBroadcastSceneRootFragment;
                C1AKR c1akr;
                Fragment fragment2;
                VoiceBroadcastSceneRootFragment voiceBroadcastSceneRootFragment2;
                C1AKR c1akr2;
                boolean zShowFinishEncourage = Live.getService().showFinishEncourage();
                this.LIZ.LLJJIJI = Live.getService().createLiveBroadcastEndFragment(bundle);
                C1AKR c1akr3 = this.LIZ.LLJJIJI;
                if (c1akr3 != null) {
                    fragment = c1akr3.getFragment();
                } else {
                    fragment = null;
                }
                LiveEndFragmentObserver.LIZ(fragment);
                if (zShowFinishEncourage) {
                    FragmentManager fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(this.LIZ);
                    if (fragmentManagerLJIIJJI != null && (c1akr2 = (voiceBroadcastSceneRootFragment2 = this.LIZ).LLJJIJI) != null) {
                        C19EH c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ();
                        c19ehLJIIJ.LIZIZ(R.id.iiv, c1akr2.getFragment());
                        c19ehLJIIJ.LJIIL();
                        DataChannelGlobal.LLILZ.BQ2(c1akr2.getFragment(), c1akr2.getFragment(), NotifyRemoveLiveBroadcastFragmentEvent.class, new AwS399S0200000_33(voiceBroadcastSceneRootFragment2, fragmentManagerLJIIJJI, 12));
                        return;
                    }
                    return;
                }
                FragmentManager fragmentManagerLJIIJJI2 = SAFExtensionKt.LJIIJJI(this.LIZ);
                if (fragmentManagerLJIIJJI2 == null || (c1akr = (voiceBroadcastSceneRootFragment = this.LIZ).LLJJIJI) == null || (fragment2 = c1akr.getFragment()) == null) {
                    return;
                }
                C19EH c19ehLJIIJ2 = fragmentManagerLJIIJJI2.LJIIJ();
                c19ehLJIIJ2.LJIJ(R.id.iiv, fragment2, null);
                c19ehLJIIJ2.LJIIL();
                voiceBroadcastSceneRootFragment.LLJJIII = null;
            }

            @Override // X.InterfaceC773130UUl
            public final void LJ(C779220UhU c779220UhU) {
                Context context = this.LIZ.getContext();
                if (context != null) {
                    C786410Ut5.LJJIFFI(context, c779220UhU);
                }
            }

            @Override // X.InterfaceC773130UUl
            public final void LIZIZ(C779220UhU c779220UhU, IntentFilter intentFilter) throws Exception {
                Context context = this.LIZ.getContext();
                if (context != null) {
                    C786410Ut5.LJIJJ(context, c779220UhU, intentFilter);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        super.LLLLIILLL(bundle);
        if (bundle != null) {
            C1844940y6u.LIZIZ(getContext(), this, bundle);
            String string = bundle.getString("request_page");
            if (Intrinsics.LJFF(string, "live_end_page")) {
                Live.getService().LLJILJILJ(string);
                Live.getService().releaseVoiceChatLiveStream();
                kS(bundle);
            }
        }
    }

    public final void kS(Bundle bundle) {
        Context activity;
        FragmentManager fragmentManagerLJIIJJI;
        C19EH c19ehLJIIJ;
        C1AKO c1akoCreateVoiceChatBroadcastFragment = Live.getService().createVoiceChatBroadcastFragment(this.LLJJIJIIJIL, bundle);
        this.LLJJIII = c1akoCreateVoiceChatBroadcastFragment;
        if (c1akoCreateVoiceChatBroadcastFragment != null && (fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI(this)) != null && (c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ()) != null) {
            c19ehLJIIJ.LJIJ(R.id.iiv, c1akoCreateVoiceChatBroadcastFragment.getFragment(), null);
            c19ehLJIIJ.LJIIL();
        }
        if (C504210Jpz.LIZ) {
            activity = getContext();
        } else {
            activity = getActivity();
        }
        if (activity != null) {
            Live.getService().setBroadcastActivity(activity);
            Live.getService().preloadVoiceChatLiveStream(activity);
        }
        LivePitayaEnv.LJIIIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CopyOnWriteArrayList<InterfaceC479850Irn> copyOnWriteArrayList = C479860Iro.LIZ;
        C479860Iro.LIZ(this, EnumC479890Irr.BROADCAST);
        vQ();
        kS(bundle);
    }

    @Override // com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(128);
        }
        if (bundle != null && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null) {
            C786410Ut5.LJJIIZI(bundle2, new Bundle(), "android:support:fragments");
        }
        Function1 function1 = (Function1) DataChannelGlobal.LLILZ.gg0(C168Y.class);
        if (function1 != null) {
            function1.invoke(3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dbl, viewGroup, false);
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
