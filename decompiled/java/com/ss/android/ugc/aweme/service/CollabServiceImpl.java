package com.ss.android.ugc.aweme.service;

import X.AbstractC848400XPy;
import X.C0185003z;
import X.C01GW;
import X.C098200Yq;
import X.C0SE8;
import X.C0TIM;
import X.C0XQ7;
import X.C1094404Pu;
import X.C11VU;
import X.C1390920mIc;
import X.C13BV;
import X.C1572630r1h;
import X.C15O7;
import X.C1607560rw2;
import X.C189200o6;
import X.C19EG;
import X.C2097608Jq;
import X.C21524119Lj;
import X.C2211631BhB;
import X.C241200wU;
import X.C2540509xT;
import X.C259800zU;
import X.C317300CcC;
import X.C339190DRl;
import X.C343240Dcw;
import X.C343250Dcx;
import X.C343260Dcy;
import X.C452501pT;
import X.C723830SaL;
import X.C786410Ut5;
import X.CallableC328110Ctd;
import X.DialogInterfaceOnDismissListenerC1402030maX;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.api.ICollabApi;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.CollabAuthCheckResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.page.CollabEditPageIntroPanel;
import com.ss.android.ugc.aweme.ui.page.CollabFeedInvitedPanel;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedStatusUpdateViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabServiceImpl implements ICollabService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(new C1094404Pu());

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LIZIZ() {
        C0TIM.LIZ.getClass();
        Keva kevaLIZ = C0TIM.LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = kevaLIZ.getLong("collab_keva_value_month_post_cnt", 0L);
        if (jCurrentTimeMillis - kevaLIZ.getLong("collab_keva_value_month_post_prev_time", jCurrentTimeMillis) <= 2592000000L) {
            kevaLIZ.storeLong("collab_keva_value_month_post_cnt", j + 1);
        } else {
            kevaLIZ.storeLong("collab_keva_value_month_post_prev_time", jCurrentTimeMillis);
            kevaLIZ.storeLong("collab_keva_value_month_post_cnt", 0L);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final long LIZLLL() {
        C0TIM.LIZ.getClass();
        return C0TIM.LIZ().getLong("collab_keva_value_month_post_limit", C2540509xT.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJ() {
        long jLJ;
        try {
            boolean zLJI = MethodIDManager.LJI(137899);
            CollabAuthCheckResponse collabAuthCheckResponse = ((ICollabApi) C317300CcC.LIZ.getValue()).checkCollabEntryAuth().execute().LIZIZ;
            if (zLJI) {
                MethodIDManager.LJ();
            }
            C0TIM c0tim = C0TIM.LIZ;
            long j = collabAuthCheckResponse.historyFollowerCount;
            long j2 = collabAuthCheckResponse.monthPostCount;
            Long l = collabAuthCheckResponse.monthPostLimit;
            long jLongValue = l != null ? l.longValue() : C2540509xT.LIZJ();
            Long l2 = collabAuthCheckResponse.followerCountThreshold;
            if (l2 != null) {
                jLJ = l2.longValue();
            } else {
                SettingsManager.LIZLLL().getClass();
                jLJ = SettingsManager.LJ("collab_history_follower_count", 1000000);
            }
            c0tim.getClass();
            C0TIM.LIZIZ(j, j2, jLongValue, jLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0TIM c0tim2 = C0TIM.LIZ;
            long j3 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().historyMaxFollowerCount;
            long jLIZJ = C2540509xT.LIZJ();
            SettingsManager.LIZLLL().getClass();
            long jLJ2 = SettingsManager.LJ("collab_history_follower_count", 1000000);
            c0tim2.getClass();
            C0TIM.LIZIZ(j3, 0L, jLIZJ, jLJ2);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final boolean LJFF() {
        String str = CollabEditPageIntroPanel._pnsPageId;
        if (!C2540509xT.LIZIZ()) {
            return false;
        }
        C0TIM.LIZ.getClass();
        C01GW c01gw = C0TIM.LIZIZ;
        if (Keva.getRepo((String) c01gw.getValue()).getBoolean("collab_keva_value_intro_shown", false)) {
            return false;
        }
        Keva.getRepo((String) c01gw.getValue()).storeBoolean("collab_keva_value_intro_shown", true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final ICollabEventTrackingService LJII() {
        return (ICollabEventTrackingService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final boolean LIZ() {
        if (!C2540509xT.LIZIZ()) {
            return false;
        }
        C0TIM.LIZ.getClass();
        return System.currentTimeMillis() - C0TIM.LIZ().getLong("collab_keva_value_prev_check_time", 0L) > 86400000;
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final long LJI() {
        if (!C2540509xT.LIZIZ()) {
            return -1L;
        }
        C0TIM.LIZ.getClass();
        Keva kevaLIZ = C0TIM.LIZ();
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        long jMax = Math.max(kevaLIZ.getLong("collab_keva_value_history_follower_cnt", curUser.getFollowerCount()), curUser.getFollowerCount());
        SettingsManager.LIZLLL().getClass();
        if (jMax < kevaLIZ.getLong("collab_keva_value_follower_count_threshold", SettingsManager.LJ("collab_history_follower_count", 1000000))) {
            return -1L;
        }
        long j = kevaLIZ.getLong("collab_keva_value_month_post_limit", C2540509xT.LIZJ());
        return (j < 0 || kevaLIZ.getLong("collab_keva_value_month_post_cnt", 0L) < j) ? 1L : 2L;
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final LiveData LJIIIZ(LifecycleRegistry lifecycleRegistry) {
        MutableLiveData<Aweme> mutableLiveData = null;
        try {
            CollabFeedStatusUpdateViewModel collabFeedStatusUpdateViewModelLIZ = C1607560rw2.LIZ(lifecycleRegistry);
            if (collabFeedStatusUpdateViewModelLIZ == null) {
                return null;
            }
            mutableLiveData = collabFeedStatusUpdateViewModelLIZ.LL;
            return mutableLiveData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return mutableLiveData;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LIZJ(C19EG c19eg, C21524119Lj c21524119Lj) {
        if (c19eg == null) {
            return;
        }
        final CollabEditPageIntroPanel collabEditPageIntroPanel = new CollabEditPageIntroPanel();
        collabEditPageIntroPanel.LLIZLLLIL = "video_post_page";
        collabEditPageIntroPanel.LLJ = c21524119Lj;
        collabEditPageIntroPanel.LLJI = new AwS568S0100000_24(collabEditPageIntroPanel, 1733);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIJI = collabEditPageIntroPanel;
        c1390920mIc.LJIIIIZZ(0);
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0rw4
            public final /* synthetic */ String LL = "video_post_page";

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C241200wU c241200wU = C241200wU.LIZ;
                String str = this.LL;
                String str2 = collabEditPageIntroPanel.LLIZ;
                c241200wU.getClass();
                C241200wU.LJ(str, "click", str2);
            }
        };
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLILLJJLI = onDismissListener;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "collab_edit_page_intro_panel");
        C241200wU.LIZ.getClass();
        C241200wU.LJ("video_post_page", "show", "");
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIIIZZ(ReusedUIAssem reusedUIAssem, int i, int i2) {
        C723830SaL.LIZ(reusedUIAssem, null, new C0SE8(reusedUIAssem, i, i2));
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIJJI(C19EG c19eg, Aweme aweme, boolean z) {
        Unit unit;
        long j;
        if (aweme == null) {
            return;
        }
        try {
            CollabFeedStatusUpdateViewModel collabFeedStatusUpdateViewModelLIZ = C1607560rw2.LIZ(c19eg.getLifecycle());
            if (collabFeedStatusUpdateViewModelLIZ != null) {
                if (z) {
                    j = 1;
                } else {
                    j = 2;
                }
                C15O7.LIZJ(new CallableC328110Ctd(aweme, j, collabFeedStatusUpdateViewModelLIZ));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIL(Context context, String str, List<? extends User> list, OnActivityResultCallback onActivityResultCallback) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//social/collab/edit");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("previous_page", "video_post_page"));
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        smartRouteBuildRoute.withParam("collab_edit_page_init_info", new C1572630r1h(mapLJIIIIZZ, list));
        smartRouteBuildRoute.open(112, onActivityResultCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.ss.android.ugc.aweme.service.ICollabService
    public final void LJIIJ(String str, C19EG c19eg, Aweme aweme, String str2, Function0<Unit> function0, String str3) {
        int i;
        float fLIZLLL = C11VU.LIZLLL(c19eg) * 0.6f;
        C343250Dcx.LIZ.getClass();
        int i2 = 75;
        for (Object obj : C343250Dcx.LIZ(aweme)) {
            if (obj instanceof C343260Dcy) {
                C343250Dcx.LIZ.getClass();
                if (C343250Dcx.LIZLLL(aweme)) {
                    i = 206;
                } else {
                    i = 72;
                }
                i2 += i;
            } else if (obj instanceof C343240Dcw) {
                i2 += 151;
            } else if (obj instanceof C0185003z) {
                i2 += 35;
            }
        }
        float fMin = Math.min(C339190DRl.LIZ(i2), fLIZLLL);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "bundle_aweme", aweme);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("user_type", str2, bundle);
        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, str3, bundle);
        CollabFeedInvitedPanel collabFeedInvitedPanel = new CollabFeedInvitedPanel();
        collabFeedInvitedPanel.setArguments(bundle);
        FypAutoScrollService fypAutoScrollService = (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
        if (fypAutoScrollService != null) {
            fypAutoScrollService.setDescDialogShowing(true);
        }
        C259800zU c259800zU = new C259800zU();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        ?? r2 = c1390920mIc.LIZ;
        r2.LLJJL = (int) fMin;
        r2.LLJLILLLLZIIL = false;
        r2.LLJJIJI = collabFeedInvitedPanel;
        r2.LLILLJJLI = new DialogInterfaceOnDismissListenerC1402030maX(c259800zU, function0, 0);
        c259800zU.element = r2;
        C2211631BhB.LJIIJ(r2);
        ((DialogFragment) c259800zU.element).show(c19eg.getSupportFragmentManager(), "CollabFeedInvitedPanel");
    }
}
