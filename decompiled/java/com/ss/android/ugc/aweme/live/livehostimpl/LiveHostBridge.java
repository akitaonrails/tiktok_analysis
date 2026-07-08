package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC1387200mCc;
import X.C07NZ;
import X.C09JN;
import X.C0BOJ;
import X.C0CHQ;
import X.C0IJT;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1201130hMV;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C19EG;
import X.C1ER1;
import X.C20596615ie;
import X.C20622515mp;
import X.C20629915o1;
import X.C290160BYw;
import X.C474500IjA;
import X.C480460Ism;
import X.C520010KaN;
import X.C783820Uou;
import X.InterfaceC1364105Vn;
import X.InterfaceC20596815ig;
import X.InterfaceC20596915ih;
import X.InterfaceC20597015ii;
import X.InterfaceC20622815ms;
import X.InterfaceC20630715o9;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import Y.AfS165S0200000_31;
import Y.AfS178S0100000_9;
import Y.AfS1S1000100_12;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostDFBlockRateSettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ab.LiveGogoPreviewConfig;
import com.ss.android.ugc.aweme.aigc.C2PAServiceImpl;
import com.ss.android.ugc.aweme.following.model.RelationSearchResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.BaseLiveSdkSceneFragment;
import com.ss.android.ugc.aweme.live.LiveEndFragmentObserver;
import com.ss.android.ugc.aweme.live.api.ILivePermissionApi;
import com.ss.android.ugc.aweme.live.smoothhost.BottomTabManager;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.ss.android.ugc.aweme.live.strategy.LegoTaskDowngradeStrategy;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class LiveHostBridge implements IHostBridge {
    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearFontEffectPlatformCache() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final int requireHostTheme() {
        return R.style.ae1;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearOpenLiveMultiTabPageParams() {
        BottomTabManager.LIZ.getClass();
        BottomTabManager.LIZLLL = null;
        BottomTabManager.LJ = null;
        BottomTabManager.LJFF = null;
        ((ArrayList) BottomTabManager.LIZIZ).clear();
        BottomTabManager.LJIIIIZZ = null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearSearchCache() {
        C1ER1.LIZIZ.LLLLIIIILLL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean enableGotoPreviewOpt() {
        return ((LiveGogoPreviewConfig) C07NZ.LIZIZ.getValue()).enable;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void forceRefreshPodcast() {
        C783820Uou.LIZ.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C480460Ism.LIZ().getClass();
        ((ILivePermissionApi) C480460Ism.LIZLLL(ILivePermissionApi.class)).getLivePodCast(0).LJJIJIIJIL(new AfS1S1000100_12(jElapsedRealtime, 2)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00PF
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePodcastDataManager@2f90.forceRefreshPodcastWithFileCache$2");
                C1C7U.LIZIZ("LivePodcastDataManager@2f90.forceRefreshPodcastWithFileCache$2");
            }
        }, new AfS1S1000100_12(jElapsedRealtime, 3));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void prepareSearchCache() {
        C1ER1.LIZIZ.LLJILLL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void saveOpenLiveMultiTabPageParamsOnce() {
        BottomTabManager.LIZ.getClass();
        BottomTabManager.LJI = true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void clearCameraFilterCache() {
        C0CHQ.LIZ().LJJIL().LIZIZ().LJIILIIL();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean currentPageIsLiveHost() {
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null) {
            return false;
        }
        Object obj = abstractC1387200mCcLJ.LIZ;
        return ((obj instanceof InterfaceC214902198i) && (obj instanceof InterfaceC20596815ig)) || (((Boolean) C0BOJ.LIZ.getValue()).booleanValue() && (obj instanceof InterfaceC20622815ms) && (C20629915o1.LIZJ((InterfaceC20622815ms) obj) instanceof InterfaceC20596815ig)) || ((obj instanceof InterfaceC214897198d) && ((InterfaceC214897198d) obj).getEnableSAF() && (C20629915o1.LIZJ((InterfaceC20622815ms) obj) instanceof InterfaceC20596815ig));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void initC2PASdk() {
        C2PAServiceImpl.LJ().LIZIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean liveInSaaStack() {
        if (C290160BYw.LIZ()) {
            return LiveEndFragmentObserver.LIZ;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean requireHostSingleActivityEnable() {
        return C290160BYw.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean isLiveRootPage(Object obj) {
        if (!(obj instanceof InterfaceC20596815ig) && !(obj instanceof InterfaceC20596915ih)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean isSAAActivity(Activity activity) {
        ICreativeSAAService iCreativeSAAService;
        if (activity == null || (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) == null || !iCreativeSAAService.isSAAActivity(activity)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final boolean requireCanDestroySAFScene(InterfaceC20630715o9 interfaceC20630715o9) {
        InterfaceC214902198i interfaceC214902198iF0 = interfaceC20630715o9.F0();
        if ((interfaceC214902198iF0 instanceof InterfaceC20596815ig) && ((InterfaceC20596815ig) interfaceC214902198iF0).JL()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void startIllegalActivityMethodCallCheck(Fragment fragment) {
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity;
        AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL = C520010KaN.LJJIIJZLJL(fragment);
        Fragment fragmentLIZLLL = null;
        if (abstractC1387200mCcLJJIIJZLJL != null) {
            fragmentLIZLLL = abstractC1387200mCcLJJIIJZLJL.LIZLLL();
        }
        if ((fragmentLIZLLL instanceof BaseLiveSdkSceneFragment) && fragmentLIZLLL != null) {
            InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(fragmentLIZLLL.getActivity());
            if (interfaceC20597015iiLIZJ != null) {
                interfaceC20597015iiLIZJ.Ye();
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    interfaceC20597015iiLIZJ.SI(C1201130hMV.LIZ);
                } else {
                    interfaceC20597015iiLIZJ.SI(C20596615ie.LIZ);
                }
            }
            C19EG activity = fragmentLIZLLL.getActivity();
            if ((activity instanceof LiveMultiTabWrapperActivity) && (liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) activity) != null) {
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    liveMultiTabWrapperActivity.LLIZ.add(C1201130hMV.LIZ);
                } else {
                    liveMultiTabWrapperActivity.LLIZ.add(C20596615ie.LIZ);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void startIndependentLivePage(Context context) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        if (context != null || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (context = abstractC1387200mCcLJ.LIZIZ()) != null)) {
            BottomTabManager.LIZ.getClass();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//live_multi_tab");
            smartRouteBuildRoute.withParam(BottomTabManager.LJFF);
            smartRouteBuildRoute.withParam("from_independent_live_page", "true");
            smartRouteBuildRoute.withParam("from_intercept_schema", true);
            smartRouteBuildRoute.open();
            BottomTabManager.LIZLLL = null;
            BottomTabManager.LJ = null;
            BottomTabManager.LJFF = null;
            ((ArrayList) BottomTabManager.LIZIZ).clear();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void stopIllegalActivityMethodCallCheck(Fragment fragment) {
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity;
        InterfaceC20597015ii interfaceC20597015iiLIZJ;
        AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL = C520010KaN.LJJIIJZLJL(fragment);
        Fragment fragmentLIZLLL = null;
        if (abstractC1387200mCcLJJIIJZLJL != null) {
            fragmentLIZLLL = abstractC1387200mCcLJJIIJZLJL.LIZLLL();
        }
        if ((fragmentLIZLLL instanceof BaseLiveSdkSceneFragment) && fragmentLIZLLL != null) {
            C19EG activity = fragmentLIZLLL.getActivity();
            if (activity != null && (interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity)) != null) {
                interfaceC20597015iiLIZJ.Vv();
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    interfaceC20597015iiLIZJ.HB(C1201130hMV.LIZ);
                } else {
                    interfaceC20597015iiLIZJ.HB(C20596615ie.LIZ);
                }
            }
            C19EG activity2 = fragmentLIZLLL.getActivity();
            if ((activity2 instanceof LiveMultiTabWrapperActivity) && (liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) activity2) != null) {
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                    liveMultiTabWrapperActivity.LLIZ.remove(C1201130hMV.LIZ);
                } else {
                    liveMultiTabWrapperActivity.LLIZ.remove(C20596615ie.LIZ);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final Object hasC2PAAIGCInfoInFile(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C2PAServiceImpl.LJ().hasC2PAAIGCInfoInFile(str, interfaceC1364105Vn);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void reportDFEvent(String str, String str2) {
        boolean z;
        if (!LiveHostDFBlockRateSettings.enable()) {
            return;
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        int i = 0;
        if (iPluginService != null && iPluginService.checkPluginInstalled("com.bytedance.tiktok.ship")) {
            z = true;
        } else {
            z = false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("df_block_rate_camera_live");
        c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII("df_ship", "plugin_name");
        if (z) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "plugin_installed");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void startDowngradeLegoStrategy(String str, LifecycleOwner lifecycleOwner) {
        new LegoTaskDowngradeStrategy(str, lifecycleOwner).LIZ();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostBridge
    public final void queryRelationSearchList(int i, String str, String str2, Function1<? super List<? extends User>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        C11NZ<RelationSearchResponse> c11nzQueryRelationSearchList = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).queryRelationSearchList(i, str, str2, null);
        if (c11nzQueryRelationSearchList != null) {
            c11nzQueryRelationSearchList.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS165S0200000_31(this, function1, 3), new AfS178S0100000_9(function12, (Function1<? super Throwable, Unit>) 19));
        }
    }
}
