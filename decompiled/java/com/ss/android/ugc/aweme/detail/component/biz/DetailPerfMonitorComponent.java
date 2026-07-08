package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C1606370ru7;
import X.C19EG;
import X.C20684815ws;
import X.C2189821An6;
import X.C2344009Gk;
import X.C452501pT;
import X.C465001rU;
import X.C724240Sb0;
import X.C948503nH;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class DetailPerfMonitorComponent extends BasePanelComponent implements IDetailPerfMonitorAbility, InterfaceC1554640qYg {
    public Long LL;
    public boolean LLILLJJLI;
    public Integer LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 412));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1544183122) {
            return null;
        }
        return this;
    }

    public final Integer bo() {
        PagerAdapter pagerAdapterLJJLIIIJL;
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLILZ.getValue();
        if (iViewPagerAbility == null || (pagerAdapterLJJLIIIJL = iViewPagerAbility.LJJLIIIJL()) == null) {
            return null;
        }
        return Integer.valueOf(pagerAdapterLJJLIIIJL.getCount());
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m177do() {
        Intent intent;
        Bundle arguments;
        Fragment fragment = getPanelContext().LJ;
        if (fragment == null) {
            return 0;
        }
        Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(fragment);
        if (fragmentLIZIZ != null && (arguments = fragmentLIZIZ.getArguments()) != null) {
            return arguments.getInt("use_saf");
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (intent = c19egLIZ.getIntent()) == null) {
            return 0;
        }
        return intent.getIntExtra("use_saf", 0);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        String eventType;
        super.onCreate();
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 == null || (eventType = c2189821An6.getEventType()) == null) {
            eventType = "unknown";
        }
        Fragment fragment = getPanelContext().LJ;
        if (fragment != null) {
            C948503nH.LJIIIIZZ(fragment, new C465001rU(this, eventType, null));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        this.LL = Long.valueOf(System.currentTimeMillis());
        this.LLILLL = bo();
    }

    @Override // com.ss.android.ugc.aweme.detail.component.biz.IDetailPerfMonitorAbility
    public final void LJJIJIIJI(String str) {
        String eventType;
        C2189821An6 c2189821An6;
        DetailNavArgModel navArgModel;
        Long feedDetailInterceptTime;
        Bundle arguments;
        Long lValueOf;
        C19EG c19egLIZ;
        Intent intent;
        DetailNavArgModel navArgModel2;
        String aid;
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        C2189821An6 c2189821An62 = getPanelContext().LIZJ;
        if (c2189821An62 == null || (eventType = c2189821An62.getEventType()) == null) {
            eventType = "unknown";
        }
        C2189821An6 c2189821An63 = getPanelContext().LIZJ;
        if (c2189821An63 != null && (aid = c2189821An63.getAid()) != null && !Intrinsics.LJFF(aid, str)) {
            fo(eventType, "not_target_aid");
            return;
        }
        C2189821An6 c2189821An64 = getPanelContext().LIZJ;
        if ((c2189821An64 != null && (navArgModel2 = c2189821An64.getNavArgModel()) != null && (feedDetailInterceptTime = navArgModel2.getFeedDetailInterceptTime()) != null) || ((c2189821An6 = getPanelContext().LIZJ) != null && (navArgModel = c2189821An6.getNavArgModel()) != null && (feedDetailInterceptTime = navArgModel.getFeedDetailInterceptTime()) != null)) {
            long jLongValue = feedDetailInterceptTime.longValue();
            Fragment fragment = getPanelContext().LJ;
            if (fragment != null && (arguments = fragment.getArguments()) != null && (lValueOf = Long.valueOf(arguments.getLong("feed_detail_page_create", 0L))) != null) {
                if ((lValueOf.longValue() != 0 || ((c19egLIZ = C724240Sb0.LIZ(this)) != null && (intent = c19egLIZ.getIntent()) != null && (lValueOf = Long.valueOf(intent.getLongExtra("feed_detail_page_create", 0L))) != null && lValueOf.longValue() != 0)) && lValueOf != null) {
                    long jLongValue2 = lValueOf.longValue();
                    Long l = this.LL;
                    if (l != null) {
                        final long jLongValue3 = l.longValue() - jLongValue;
                        final long j = jLongValue2 - jLongValue;
                        final long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                        final Integer numBo = bo();
                        final String str2 = eventType;
                        C20684815ws.LJFF().submit(new Runnable() { // from class: X.0T9Z
                            public final void LIZ() {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LIZLLL(j, "start_to_page_create");
                                c2344009Gk.LIZLLL(jLongValue3, "start_to_ui_frame");
                                c2344009Gk.LIZLLL(jCurrentTimeMillis, "total");
                                c2344009Gk.LJFF("enter_from", str2);
                                c2344009Gk.LIZJ(1, "is_success");
                                c2344009Gk.LIZJ(this.m177do(), "use_saf");
                                Integer num = this.LLILLL;
                                c2344009Gk.LIZJ(num != null ? num.intValue() : 0, "enter_list_count");
                                Integer num2 = numBo;
                                if (num2 != null) {
                                    c2344009Gk.LIZJ(num2.intValue(), "current_list_count");
                                }
                                C20684815ws.LJIILLIIL("rd_feed_component_detail_perf_event", c2344009Gk.LIZ);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("DetailPerfMonitorComponent@a873.mobSuccess$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("DetailPerfMonitorComponent@a873.mobSuccess$1");
                            }
                        });
                    }
                }
            }
        }
    }

    public final void fo(String str, String str2) {
        Integer numBo = bo();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("error_msg", str2);
        int iIntValue = 0;
        c2344009Gk.LIZJ(0, "is_success");
        c2344009Gk.LIZJ(m177do(), "use_saf");
        Integer num = this.LLILLL;
        if (num != null) {
            iIntValue = num.intValue();
        }
        c2344009Gk.LIZJ(iIntValue, "enter_list_count");
        if (numBo != null) {
            c2344009Gk.LIZJ(numBo.intValue(), "current_list_count");
        }
        C20684815ws.LJIILLIIL("rd_feed_component_detail_perf_event", c2344009Gk.LIZ);
    }
}
