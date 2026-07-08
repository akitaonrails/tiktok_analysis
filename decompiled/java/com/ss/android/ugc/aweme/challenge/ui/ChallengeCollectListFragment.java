package com.ss.android.ugc.aweme.challenge.ui;

import X.AbstractC1542100qES;
import X.C098200Yq;
import X.C0XKC;
import X.C1206750hVZ;
import X.C14EU;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1685300txQ;
import X.C189200o6;
import X.C19371010qS;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C275690ArH;
import X.C786410Ut5;
import X.InterfaceC1206390hUz;
import X.InterfaceC1206570hVH;
import X.InterfaceC1258040iqI;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeCollectListFragment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.IHybridKitService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeCollectListFragment extends BaseFragment implements InterfaceC1206570hVH, InterfaceC1258040iqI, InterfaceC1206390hUz {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKCM/LSsrHELIOSLGEmIWsPIS4/JCAiLioQJykgLCwnBCw/PQkhKSIhLCEn";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZ;
    public InterfaceC1541990qEH LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public boolean LLJIJIL = true;
    public final IFavoriteService LLJILJIL = (IFavoriteService) ServiceManager.get().getService(IFavoriteService.class);
    public View LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ViewGroup viewGroup;
        this.LLJILJILJ = null;
        this.LLJILLL = false;
        super.onDestroyView();
        if (((Boolean) C275690ArH.LIZIZ.getValue()).booleanValue()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.endViewTransition(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                    C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup);
                }
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            this.LLIZ = null;
        } else {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
        }
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL == null || !eventBusLIZLLL.LJIIJ(this)) {
            return;
        }
        eventBusLIZLLL.LJJI(this);
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View view = this.LLJILJILJ;
        if (view != null && this.LLJILLL) {
            return view;
        }
        RecyclerView recyclerViewSR = SR(this.LLIZ);
        if (recyclerViewSR != null) {
            this.LLJILJILJ = recyclerViewSR;
            this.LLJILLL = true;
            return recyclerViewSR;
        }
        ScrollView scrollView = new ScrollView(getContext());
        this.LLJILJILJ = scrollView;
        return scrollView;
    }

    @Override // X.InterfaceC1206570hVH
    public final void onPageSelected() {
        if (this.LLJIJIL) {
            if (this.LLIZ != null) {
                VR(null);
            } else if (this.LL) {
                UR(null);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
            }
        }
    }

    public static RecyclerView SR(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView recyclerViewSR = SR(viewGroup.getChildAt(i));
                if (recyclerViewSR != null) {
                    return recyclerViewSR;
                }
            }
            return null;
        }
        return null;
    }

    public final void UR(ViewGroup viewGroup) {
        SparkContext sparkContext;
        final Context context = getContext();
        if (context != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext2 = new SparkContext();
            String strLIZIZ = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bdhm_bid=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect";
            if (!TextUtils.isEmpty(this.LLJILJIL.LJJJIL())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bdhm_bid=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect");
                sbLIZ.append("&surl=");
                sbLIZ.append(this.LLJILJIL.LJJJIL());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            sparkContext2.LJJLIIJ(strLIZIZ);
            sparkContext2.LJJLIIIJLJLI(((IHybridKitService) ServiceManager.get().getService(IHybridKitService.class)).LJIILL());
            sparkContext2.LJJJJLL(new AbstractC1542100qES() { // from class: X.120e
                @Override // X.AbstractC1537870q7d
                public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                    C19371010qS.LIZIZ(System.currentTimeMillis() - this.LL.LLJ, "discovery_collect_hashtag_lynx_load_result");
                    C19371010qS.LIZ("discovery_collect_hashtag_load_lynx");
                    ChallengeCollectListFragment challengeCollectListFragment = this.LL;
                    challengeCollectListFragment.LLIZLLLIL = interfaceC1541990qEH;
                    challengeCollectListFragment.getClass();
                    C19371010qS.LIZIZ(this.LL.LLJI, "discovery_collect_hashtag_lynx_load_result_retry");
                    interfaceC1541990qEH.updateData(C2097908Jt.LIZJ(new Pair("hideIcon", Boolean.valueOf(context instanceof InterfaceC1603190roz))));
                }

                @Override // X.AbstractC1537870q7d
                public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str) throws JSONException {
                    C19371010qS.LIZIZ(-1L, "discovery_collect_hashtag_lynx_load_result");
                    ChallengeCollectListFragment challengeCollectListFragment = this.LL;
                    int i = challengeCollectListFragment.LLJI;
                    if (i < 3) {
                        challengeCollectListFragment.LLJI = i + 1;
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = challengeCollectListFragment.LLIZ;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.refresh();
                            return;
                        }
                        return;
                    }
                    C19371010qS.LIZIZ(-1L, "discovery_collect_hashtag_lynx_load_result_retry");
                }
            });
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext2).LIZ(false);
            C786410Ut5.C6(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(-1, -1));
            if (!((Boolean) C275690ArH.LIZIZ.getValue()).booleanValue() && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext()) != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJJIJ(sparkContext);
            }
            C19371010qS.LIZLLL("discovery_collect_hashtag_load_lynx");
            this.LLJ = System.currentTimeMillis();
            this.LLIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            VR(viewGroup);
        }
    }

    public final void VR(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
        ViewParent parent = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJJI(viewGroup2);
        }
        if (viewGroup == null) {
            View view = getView();
            if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
                return;
            }
        }
        viewGroup.addView(this.LLIZ);
    }

    @C14EU
    public final void onAntiCrawlerEvent(C0XKC c0xkc) {
        String str;
        InterfaceC1541990qEH kitView;
        if (c0xkc != null && (str = c0xkc.LIZ) != null && a0.LJJIIZI(str, "/aweme/v1/challenge/listcollection/?", false)) {
            EventBus.LIZLLL().LIZIZ(c0xkc);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.X0("AntiCrawlerEvent", null);
            }
        }
    }

    @C14EU
    public final void onChallengeCollectEvent(C1206750hVZ c1206750hVZ) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        InterfaceC1541990qEH kitView;
        InterfaceC1541990qEH kitView2;
        if (!this.LL) {
            return;
        }
        Challenge challenge = c1206750hVZ.LIZ;
        if (challenge.getCollectStatus() == 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null) {
                kitView2.X0("UnChallengeCollect", Collections.singletonList(challenge.getCid()));
                return;
            }
            return;
        }
        if (challenge.getCollectStatus() != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.X0("onChallengeCollect", Collections.singletonList(challenge.getCid()));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ChallengeCollectListFragmentData challengeCollectListFragmentData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (challengeCollectListFragmentData = (ChallengeCollectListFragmentData) arguments.getParcelable("power_viewpager_default_key")) != null) {
            this.LLJIJIL = challengeCollectListFragmentData.requestLazy;
        }
        NR(AFwS273S0000000_29.get$arr$(27));
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        onPageSelected();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.onViewCreated(view, bundle);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL != null && !eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        if (!this.LLJIJIL && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            frameLayout = new FrameLayout(context);
            UR(frameLayout);
        } else {
            frameLayout = null;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout;
    }
}
