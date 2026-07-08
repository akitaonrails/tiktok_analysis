package com.ss.android.ugc.aweme.homepage.ui.view.tab.top.protocol;

import X.C01GW;
import X.C0CXN;
import X.C1388190mED;
import X.C1585700rMm;
import X.C19EG;
import X.C2097608Jq;
import X.C452501pT;
import X.C486860J7k;
import X.C786410Ut5;
import X.C799570VYd;
import X.C823050WQl;
import X.C960203pA;
import X.EnumC1571190qzN;
import X.EnumC1583970rJz;
import X.EnumC1584360rKc;
import X.EnumC452301pR;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.experiment.TabItemViewConfig;
import com.ss.android.ugc.aweme.experiment.TabStyleConfig;
import com.ss.android.ugc.aweme.experiment.TabTrackerInfo;
import com.ss.android.ugc.aweme.experiment.TopActivityTabConfig;
import com.ss.android.ugc.aweme.experiment.TopTabAppearance;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.lynx.ActivityTabContainerFragment;
import com.ss.android.ugc.aweme.spi.IActivityTabService;
import com.ss.android.ugc.aweme.spi.IHomeSidebarService;
import java.util.Map;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ActivityTabProtocol extends TopTabProtocol {
    public final EnumC1584360rKc LLILZIL;
    public Context LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new C1585700rMm(this));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(192));
    public final String LLJ = "Activity";
    public final String LLJI;
    public final int LLJIJIL;
    public final Map<String, String> LLJILJIL;
    public final Class<? extends Fragment> LLJILJILJ;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIIZZ() {
        TopActivityTabConfig topActivityTabConfig;
        C0CXN c0cxn = C0CXN.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.ACTIVITY;
        c0cxn.getClass();
        TopTabItem topTabItemLIZLLL = C0CXN.LIZLLL(enumC1584360rKc);
        if (topTabItemLIZLLL == null || (topActivityTabConfig = topTabItemLIZLLL.activityConfig) == null || !topActivityTabConfig.geckoPreloadEnable) {
            return;
        }
        if (((IActivityTabService) this.LLIZLLLIL.getValue()).LJII(C0CXN.LIZLLL(enumC1584360rKc))) {
            return;
        }
        if (((IActivityTabService) this.LLIZLLLIL.getValue()).LJ(C0CXN.LIZLLL(enumC1584360rKc))) {
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0Mzx
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ActivityTabProtocol@78f.onFilterResult$2");
                    try {
                        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0rNK
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ2;
                                String str;
                                TopActivityTabConfig topActivityTabConfig2;
                                C1C7U.LIZ("ActivityTabProtocol@78f.onFilterResult$2$1");
                                try {
                                    C20548215aq c20548215aq = C20548215aq.LIZ;
                                    C0CXN c0cxn2 = C0CXN.LIZ;
                                    EnumC1584360rKc enumC1584360rKc2 = EnumC1584360rKc.ACTIVITY;
                                    c0cxn2.getClass();
                                    TopTabItem topTabItemLIZLLL2 = C0CXN.LIZLLL(enumC1584360rKc2);
                                    if (topTabItemLIZLLL2 == null || (topActivityTabConfig2 = topTabItemLIZLLL2.activityConfig) == null || (str = topActivityTabConfig2.geckoChannel) == null) {
                                        str = "";
                                    }
                                    c20548215aq.getClass();
                                    C20548215aq.LIZ(str);
                                } finally {
                                    if (!zLIZ2) {
                                    }
                                }
                                C1C7U.LIZIZ("ActivityTabProtocol@78f.onFilterResult$2$1");
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ActivityTabProtocol@78f.onFilterResult$2");
                }
            });
        } else {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0rNJ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    String str;
                    TopActivityTabConfig topActivityTabConfig2;
                    C1C7U.LIZ("ActivityTabProtocol@78f.onFilterResult$1");
                    try {
                        C20548215aq c20548215aq = C20548215aq.LIZ;
                        C0CXN c0cxn2 = C0CXN.LIZ;
                        EnumC1584360rKc enumC1584360rKc2 = EnumC1584360rKc.ACTIVITY;
                        c0cxn2.getClass();
                        TopTabItem topTabItemLIZLLL2 = C0CXN.LIZLLL(enumC1584360rKc2);
                        if (topTabItemLIZLLL2 == null || (topActivityTabConfig2 = topTabItemLIZLLL2.activityConfig) == null || (str = topActivityTabConfig2.geckoChannel) == null) {
                            str = "";
                        }
                        c20548215aq.getClass();
                        C20548215aq.LIZ(str);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ActivityTabProtocol@78f.onFilterResult$1");
                }
            });
        }
    }

    public final TopTabItem LJIILLIIL() {
        return (TopTabItem) this.LLIZ.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIJJI() {
        TopTabAppearance topTabAppearance;
        TabStyleConfig tabStyleConfig;
        Integer num;
        TopTabItem topTabItemLJIILLIIL = LJIILLIIL();
        return (topTabItemLJIILLIIL == null || (topTabAppearance = topTabItemLJIILLIIL.appearance) == null || (tabStyleConfig = topTabAppearance.style) == null || (num = tabStyleConfig.bottomTabTheme) == null || num.intValue() != 1) ? EnumC1571190qzN.DARK : EnumC1571190qzN.LIGHT;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC1571190qzN LJIIL() {
        TopTabAppearance topTabAppearance;
        TabStyleConfig tabStyleConfig;
        Integer num;
        TopTabItem topTabItemLJIILLIIL = LJIILLIIL();
        if (topTabItemLJIILLIIL == null || (topTabAppearance = topTabItemLJIILLIIL.appearance) == null || (tabStyleConfig = topTabAppearance.style) == null || (num = tabStyleConfig.topTabTheme) == null || num.intValue() != 1) {
            return EnumC1571190qzN.DARK;
        }
        Context context = this.LLILZLL;
        return (context == null || !C960203pA.LIZIZ(context)) ? EnumC1571190qzN.LIGHT : EnumC1571190qzN.DARK;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Map<String, String> LIZLLL() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJII() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLJILJILJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getMob() {
        return this.LLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LLJ;
    }

    public ActivityTabProtocol(EnumC1584360rKc enumC1584360rKc) {
        TabTrackerInfo tabTrackerInfo;
        Map<String, String> map;
        TabTrackerInfo tabTrackerInfo2;
        String str;
        this.LLILZIL = enumC1584360rKc;
        TopTabItem topTabItemLJIILLIIL = LJIILLIIL();
        this.LLJI = (topTabItemLJIILLIIL == null || (tabTrackerInfo2 = topTabItemLJIILLIIL.trackerInfo) == null || (str = tabTrackerInfo2.enterFrom) == null) ? "be_null" : str;
        this.LLJIJIL = 43;
        TopTabItem topTabItemLJIILLIIL2 = LJIILLIIL();
        this.LLJILJIL = (topTabItemLJIILLIIL2 == null || (tabTrackerInfo = topTabItemLJIILLIIL2.trackerInfo) == null || (map = tabTrackerInfo.extraInfo) == null) ? C2097608Jq.LJ() : map;
        this.LLJILJILJ = ActivityTabContainerFragment.class;
        EnumC1583970rJz enumC1583970rJz = EnumC1583970rJz.X_TAB;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle V9(Context context) {
        String str;
        long j;
        String str2;
        boolean z;
        TopActivityTabConfig topActivityTabConfig;
        TopActivityTabConfig topActivityTabConfig2;
        TopActivityTabConfig topActivityTabConfig3;
        TopActivityTabConfig topActivityTabConfig4;
        TopActivityTabConfig topActivityTabConfig5;
        TopActivityTabConfig topActivityTabConfig6;
        TopActivityTabConfig topActivityTabConfig7;
        Bundle bundleV9 = super.V9(context);
        bundleV9.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LLJIJIL);
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", this.LLJI, bundleV9);
        C786410Ut5.LJJJI("top_tab_key", this.LLILZIL.getKey(), bundleV9);
        TopTabItem topTabItemLJIILLIIL = LJIILLIIL();
        String str3 = null;
        if (topTabItemLJIILLIIL != null && (topActivityTabConfig7 = topTabItemLJIILLIIL.activityConfig) != null) {
            str = topActivityTabConfig7.activityId;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("activity_id", str, bundleV9);
        TopTabItem topTabItemLJIILLIIL2 = LJIILLIIL();
        long j2 = 0;
        if (topTabItemLJIILLIIL2 != null && (topActivityTabConfig6 = topTabItemLJIILLIIL2.activityConfig) != null) {
            j = topActivityTabConfig6.startTime;
        } else {
            j = 0;
        }
        bundleV9.putLong("start_time", j);
        TopTabItem topTabItemLJIILLIIL3 = LJIILLIIL();
        if (topTabItemLJIILLIIL3 != null && (topActivityTabConfig5 = topTabItemLJIILLIIL3.activityConfig) != null) {
            j2 = topActivityTabConfig5.endTime;
        }
        bundleV9.putLong("end_time", j2);
        TopTabItem topTabItemLJIILLIIL4 = LJIILLIIL();
        if (topTabItemLJIILLIIL4 != null && (topActivityTabConfig4 = topTabItemLJIILLIIL4.activityConfig) != null) {
            str2 = topActivityTabConfig4.activityScheme;
        } else {
            str2 = null;
        }
        C786410Ut5.LJJJI("activity_scheme", str2, bundleV9);
        TopTabItem topTabItemLJIILLIIL5 = LJIILLIIL();
        if (topTabItemLJIILLIIL5 != null && (topActivityTabConfig3 = topTabItemLJIILLIIL5.activityConfig) != null) {
            str3 = topActivityTabConfig3.geckoChannel;
        }
        C786410Ut5.LJJJI("gecko_channal", str3, bundleV9);
        TopTabItem topTabItemLJIILLIIL6 = LJIILLIIL();
        boolean z2 = true;
        if (topTabItemLJIILLIIL6 != null && (topActivityTabConfig2 = topTabItemLJIILLIIL6.activityConfig) != null) {
            z = topActivityTabConfig2.geckoForceCheck;
        } else {
            z = true;
        }
        bundleV9.putBoolean("gecko_force_check", z);
        TopTabItem topTabItemLJIILLIIL7 = LJIILLIIL();
        if (topTabItemLJIILLIIL7 != null && (topActivityTabConfig = topTabItemLJIILLIIL7.activityConfig) != null) {
            z2 = topActivityTabConfig.geckoPreloadEnable;
        }
        bundleV9.putBoolean("gecko_preload_enable", z2);
        return bundleV9;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        this.LLILZLL = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String mc(Context context) {
        TopTabAppearance topTabAppearance;
        TabItemViewConfig tabItemViewConfig;
        String str;
        TopTabItem topTabItemLJIILLIIL = LJIILLIIL();
        if (topTabItemLJIILLIIL == null || (topTabAppearance = topTabItemLJIILLIIL.appearance) == null || (tabItemViewConfig = topTabAppearance.item) == null || (str = tabItemViewConfig.title) == null) {
            return "Activity";
        }
        return str;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJIIIZ(String str, String str2) {
        C19EG c19egLIZIZ;
        Context context = this.LLILZLL;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            IHomeSidebarService iHomeSidebarService = (IHomeSidebarService) PluggableExtentionKt.pluggableSpi$default(IHomeSidebarService.class, false, false, false, 14, null);
            if (iHomeSidebarService != null && iHomeSidebarService.LJ(c19egLIZIZ)) {
                C486860J7k.LIZIZ(c19egLIZIZ).KQ2(true);
            } else {
                C486860J7k.LIZIZ(c19egLIZIZ).KQ2(false);
            }
        }
    }
}
