package com.ss.android.ugc.aweme.topic.book.info;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12Z0;
import X.C1308910kAL;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1541990qEH;
import X.InterfaceC836760Ws6;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.topic.common.experiment.TopicInfoPageSettings;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC836760Ws6
public final class BookInfoPage extends DetailBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjHELIOSOSYwZicjJiR9ISsqJmERJyonACE1JxUtLio=";
    public TuxNavBar LLIZ;
    public FrameLayout LLIZLLLIL;
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS218S0000000_29.get$arr$(240), "book_id", String.class);
    public InterfaceC1541990qEH LLJI;

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "book_info_page";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1541990qEH interfaceC1541990qEH = this.LLJI;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(true);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        NR(AFwS273S0000000_29.get$arr$(194));
        View viewFindViewById = this.LLIZ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        tuxNavBar.LJIIZILJ(false);
        tuxNavBar.setNavBackground(C1308910kAL.LIZJ(R.attr.zp, tuxNavBar.getContext()).intValue());
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 528));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131827850);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        SparkContext sparkContext = new SparkContext();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TopicInfoPageSettings.DiscoveryTopicCdnSettingModel discoveryTopicCdnSettingModel = TopicInfoPageSettings.LIZ;
        TopicInfoPageSettings.DiscoveryTopicCdnSettingModel discoveryTopicCdnSettingModel2 = (TopicInfoPageSettings.DiscoveryTopicCdnSettingModel) settingsManagerLIZLLL.LJIIIIZZ("discovery_topic_cdn_setting", TopicInfoPageSettings.DiscoveryTopicCdnSettingModel.class, discoveryTopicCdnSettingModel);
        if (discoveryTopicCdnSettingModel2 != null) {
            discoveryTopicCdnSettingModel = discoveryTopicCdnSettingModel2;
        }
        String str = discoveryTopicCdnSettingModel.bookCdnUrl;
        if (str == null) {
            str = "aweme://lynxview/?hide_nav_bar=1&channel=discovery_topic_book_info&bundle=pages%2Fbook_info%2Ftemplate.js&dynamic=1&group=discovery_topic_book_info";
        }
        sparkContext.LJJLIIJ(str);
        sparkContext.LJJLIIIJ(this.LLJ.getValue(), "bookId");
        sparkContext.LJJJJZI(new C12Z0(this, 0));
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.spark_container);
            }
            this.LLIZLLLIL = (FrameLayout) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context contextRequireContext = requireContext();
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(contextRequireContext, sparkContext).LIZ(false);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJJIJ(sparkContext);
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        ((ViewGroup) view3).addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fw4, viewGroup, false);
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
