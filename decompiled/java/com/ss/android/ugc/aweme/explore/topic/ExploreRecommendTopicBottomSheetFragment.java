package com.ss.android.ugc.aweme.explore.topic;

import X.C098200Yq;
import X.C0QSJ;
import X.C1220000hqw;
import X.C13BV;
import X.C13LE;
import X.C15438062q;
import X.C15U0;
import X.C1685300txQ;
import X.C189200o6;
import X.C1906580ziK;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1EE2;
import X.C20526015Tm;
import X.C20673215v0;
import X.C291000Bas;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C720620SOm;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import Y.AfS197S0100000_28;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootManager;
import com.ss.android.ugc.aweme.explore.scope.ExploreFeedComponentScope;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedImpressionManager;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicFeedSharedVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS205S1100000_31;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreRecommendTopicBottomSheetFragment extends BaseExploreTopicFeedFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiBiPSAjISZiDDHELIOScjJCo+LB02KyohJCo9LBEjOSYwCio4PSA+Gy0pLDsVOiQrJCo9PA==";
    public final ExploreCustomTopicStruct LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;
    public final C736950SvV LLJILJIL;
    public long LLJILJILJ;
    public long LLJILLL;
    public final C736950SvV LLJJ;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ExploreFeedComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExploreFeedComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExploreFeedComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (C1EE2.LIZIZ.LJJIJIIJI() || !C291000Bas.LIZ()) {
            ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LLJJ.getValue();
            exploreFeedImpressionManager.LLILLJJLI.LIZIZ(new AwS205S1100000_31(this, 1));
        }
        SR("exit_popup_page");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (C720620SOm.LIZ.getValue() != null) {
            SR("click_explore_card");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (ActivityLifeObserver.getInstance().isForeground()) {
            return;
        }
        SR("exit_app");
    }

    public final void SR(String str) {
        if (!C1EE2.LIZIZ.LJJIJIIJI() && C291000Bas.LIZ()) {
            return;
        }
        ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LLJJ.getValue();
        exploreFeedImpressionManager.LL.LIZIZ(new AwS205S1100000_31(this, str, 0));
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.BaseExploreTopicFeedFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ExploreCustomFeedColdBootManager.LIZ.start(this.LLIZLLLIL, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.BaseExploreTopicFeedFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AssemViewModel value = this.LLJILJIL.getValue();
        C15U0 c15u0 = ExploreCustomTopicStruct.Companion;
        ExploreCustomTopicStruct exploreCustomTopicStruct = this.LLJ;
        c15u0.getClass();
        List<Aweme> list = exploreCustomTopicStruct.topicAwemes;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Aweme aweme : list) {
            boolean z = true;
            if (aweme.getUserDigg() != 1) {
                z = false;
            }
            arrayList.add(new C20526015Tm(aweme, z, exploreCustomTopicStruct.requestId, exploreCustomTopicStruct.logPbBean, false, 0, false, 0L, null, null, null, null, null, null, 131056));
        }
        value.setState(new AwS597S0100000_18(arrayList, (List<String>) 738));
        C723850SaN.LIZ(this, false, null, new AwS372S0200000_6(this, view, 108), 3);
        this.LLJILLL = SystemClock.elapsedRealtime();
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new AfS197S0100000_28(this, 13));
    }

    public ExploreRecommendTopicBottomSheetFragment(ExploreCustomTopicStruct exploreCustomTopicStruct, boolean z, int i) {
        this.LLJ = exploreCustomTopicStruct;
        this.LLJI = z;
        this.LLJIJIL = i;
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 624);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ExploreTopicFeedSharedVM.class);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(102);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJILJIL = new C736950SvV(c19719912DlLIZ, awS575S0100000_31, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS276S0000000_31, c451460Hn6, c451620HnM, c338520DOw);
        AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31(this, 625);
        this.LLJJ = new C736950SvV(C13LE.LIZ(ExploreFeedImpressionManager.class), awS575S0100000_312, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(103), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.BaseExploreTopicFeedFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.c5j, getActivity(), viewGroup, false);
        C19GS c19gs = null;
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[PHI: r11
      0x0099: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v5 java.lang.String) binds: [B:30:0x0096, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[PHI: r11 r12 r13 r14
      0x009e: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v4 java.lang.String) binds: [B:34:0x009c, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:34:0x009c, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:34:0x009c, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r14v1 com.ss.android.ugc.aweme.feed.model.LogPbBean) = (r14v0 com.ss.android.ugc.aweme.feed.model.LogPbBean), (r14v3 com.ss.android.ugc.aweme.feed.model.LogPbBean) binds: [B:34:0x009c, B:16:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR(java.lang.Long r29, X.C20526015Tm r30, java.util.Map<java.lang.String, java.lang.String> r31, boolean r32, java.lang.String r33) {
        /*
            r28 = this;
            r0 = 0
            r2 = r31
            if (r2 == 0) goto La1
            java.lang.String r1 = "card_position"
            java.lang.Object r9 = r2.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "card_index"
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto La2
            java.lang.Integer r10 = X.C2095008Iq.LJIIJJI(r1)
        L1b:
            r4 = r30
            if (r4 == 0) goto L95
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LL
            if (r1 == 0) goto L95
            java.lang.String r11 = r1.getAid()
        L27:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LL
            if (r1 == 0) goto L99
            java.lang.String r12 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r1)
        L2f:
            java.lang.String r13 = r4.LLILLL
            com.ss.android.ugc.aweme.feed.model.LogPbBean r14 = r4.LLILZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LL
            if (r1 == 0) goto L9e
            int r16 = r1.getAwemeType()
        L3b:
            if (r2 == 0) goto L93
            java.lang.String r0 = "displayed_title"
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "modified_title"
            java.lang.Object r0 = r2.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L4d:
            if (r29 == 0) goto L90
            long r19 = java.lang.System.currentTimeMillis()
            long r2 = r29.longValue()
            long r19 = r19 - r2
        L59:
            if (r4 == 0) goto L88
            boolean r3 = r4.LLILZIL
            int r2 = r4.LLILZLL
        L5f:
            r4 = r28
            com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicStruct r4 = r4.LLJ
            java.lang.Long r5 = r4.topicId
            java.lang.String r4 = r4.topicName
            X.15Vx r6 = new X.15Vx
            java.lang.String r7 = "homepage_explore"
            r21 = 0
            java.lang.String r26 = "topic_popup_page"
            r15 = r32
            r8 = r33
            r22 = r3
            r23 = r2
            r24 = r5
            r25 = r4
            r27 = r21
            r18 = r0
            r17 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
            X.C20532515Vz.LIZ(r6)
            return
        L88:
            r3 = 0
            X.15TI r2 = X.C15TI.UNKNOWN
            int r2 = r2.getValue()
            goto L5f
        L90:
            r19 = -1
            goto L59
        L93:
            r1 = r0
            goto L4d
        L95:
            r11 = r0
            if (r4 == 0) goto L99
            goto L27
        L99:
            r12 = r0
            if (r4 != 0) goto L2f
            r13 = r0
            r14 = r0
        L9e:
            r16 = 0
            goto L3b
        La1:
            r9 = r0
        La2:
            r10 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.topic.ExploreRecommendTopicBottomSheetFragment.UR(java.lang.Long, X.15Tm, java.util.Map, boolean, java.lang.String):void");
    }
}
