package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0O4X;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC836760Ws6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class TopicRecommendSearchPage extends DetailBaseFragment implements RefreshAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwZjcpKiHELIOSA+JSAiLWEmIWsYJj86KxcpKiA+JSAiLRw2KTcvIR8yLyA=";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(330), "topic_id", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(331), "topic_type", Integer.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(329), "page_id", String.class);
    public final C736950SvV LLJI;

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue() == C0O4X.BOOK.getType() ? "book_recommendation_page" : "";
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        ((TopicRecommendListVM) this.LLJI.getValue()).LLILZIL = true;
        ((AssemSingleListViewModel) this.LLJI.getValue()).manualListRefresh();
    }

    public TopicRecommendSearchPage() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1566);
        this.LLJI = new C736950SvV(C13LE.LIZ(TopicRecommendListVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(652), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.topic.recommend.ui.TopicRecommendSearchPage for r11v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.recommend.ui.TopicRecommendSearchPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer numLIZJ;
        C19GS c19gs = null;
        ((TopicRecommendListVM) this.LLJI.getValue()).LLILZ = null;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setFitsSystemWindows(true);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        frameLayout.setId(R.id.ex3);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
