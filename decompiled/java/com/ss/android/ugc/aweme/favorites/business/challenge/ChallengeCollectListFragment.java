package com.ss.android.ugc.aweme.favorites.business.challenge;

import X.AbstractC1542100qES;
import X.C098200Yq;
import X.C0XKC;
import X.C1206360hUw;
import X.C1206750hVZ;
import X.C14EU;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1685300txQ;
import X.C189200o6;
import X.C19371010qS;
import X.C19EG;
import X.C19GS;
import X.C21395818oG;
import X.C2188811AlT;
import X.C786410Ut5;
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
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.experiment.DiscoverCollectTemplateConfig;
import com.ss.android.ugc.aweme.favorites.business.challenge.ChallengeCollectListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;

/* JADX INFO: loaded from: classes30.dex */
public final class ChallengeCollectListFragment extends BaseFragment implements InterfaceC1206570hVH, InterfaceC1258040iqI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogHELIOSO2svIS4/JCAiLip9Cy0tJSM2JiIpCiA/JCAvPQM6OzEKOy40JSAiPQ==";
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZ;
    public InterfaceC1541990qEH LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public final boolean LLJIJIL = true;
    public ViewGroup LLJILJIL;
    public View LLJILJILJ;

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View viewLIZ = this.LLJILJILJ;
        if (viewLIZ == null) {
            viewLIZ = C1206360hUw.LIZ(this.LLIZ);
            if (viewLIZ == null) {
                ScrollView scrollView = new ScrollView(getContext());
                this.LLJILJILJ = scrollView;
                return scrollView;
            }
            this.LLJILJILJ = viewLIZ;
        }
        return viewLIZ;
    }

    public final void UR() {
        ViewGroup viewGroup;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
        ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent() : null;
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJIIIIZZ();
        }
        ViewGroup viewGroup2 = this.LLJILJIL;
        (viewGroup2 != null ? viewGroup2 : null).addView(this.LLIZ, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // X.InterfaceC1206570hVH
    public final void onPageSelected() {
        if (this.LLJIJIL) {
            if (this.LLIZ != null) {
                UR();
            } else if (this.LL) {
                SR();
            }
        }
    }

    public final void SR() {
        final Context context = getContext();
        if (context != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            String strLIZIZ = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bdhm_bid=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect";
            if (!TextUtils.isEmpty(DiscoverCollectTemplateConfig.LIZ())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://lynxview/?hide_nav_bar=1&channel=discovery_hashtag_collect&bdhm_bid=discovery_hashtag_collect&bundle=pages%2Fchallenge_collection%2Ftemplate.js&dynamic=1&group=discovery_hashtag_collect");
                sbLIZ.append("&surl=");
                sbLIZ.append(DiscoverCollectTemplateConfig.LIZ());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            sparkContext.LJJLIIJ(strLIZIZ);
            sparkContext.LJJLIIIJLJLI(new C21395818oG());
            sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.120d
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
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getSparkContext();
            if (sparkContext2 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJJIJ(sparkContext2);
            }
            C19371010qS.LIZLLL("discovery_collect_hashtag_load_lynx");
            this.LLJ = System.currentTimeMillis();
            this.LLIZ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            UR();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL == null || !eventBusLIZLLL.LJIIJ(this)) {
            return;
        }
        eventBusLIZLLL.LJJI(this);
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
                ArrayList arrayList = new ArrayList();
                arrayList.add(challenge.getCid());
                kitView2.X0("UnChallengeCollect", arrayList);
                return;
            }
            return;
        }
        if (challenge.getCollectStatus() != 1 || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZ) == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(challenge.getCid());
        kitView.X0("onChallengeCollect", arrayList2);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS273S0000000_29.get$arr$(36));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL != null && !eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        boolean z = false;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6b, viewGroup, false);
        this.LLJILJIL = (ViewGroup) viewTd.findViewById(R.id.dn2);
        C19GS c19gs = null;
        if (!this.LLJIJIL) {
            if (this.LLIZ == null) {
                z = true;
            }
            if (z) {
                view = viewTd;
            } else {
                view = null;
            }
            if (view != null) {
                SR();
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
