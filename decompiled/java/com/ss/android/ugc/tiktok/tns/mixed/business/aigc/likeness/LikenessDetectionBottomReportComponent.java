package com.ss.android.ugc.tiktok.tns.mixed.business.aigc.likeness;

import X.C01GW;
import X.C098200Yq;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C189200o6;
import X.C197039127h;
import X.C20684815ws;
import X.C2097608Jq;
import X.C452501pT;
import X.C786130Usd;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import org.json.JSONObject;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LikenessDetectionBottomReportComponent extends BasePanelComponent implements IDetailBottomProtocol, InterfaceC1554640qYg {
    public C197039127h LLILLL;
    public boolean LLILZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 678));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 679));
    public final C786130Usd LLILZIL = new C786130Usd(this, 4);

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final void bi2() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IDetailBottomProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Xl0(this.LLILZIL);
        }
        this.LLILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLILZIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.component.bottom.protocol.IDetailBottomProtocol
    public final View pE2(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ftb, viewGroup, false);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.y4r);
        this.LLILLL = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS694S0100000_12(this, 25), c197039127h);
        }
        return viewTd;
    }

    public static void bo(Aweme aweme, String str) {
        Object c098200Yq;
        long playCount;
        long diggCount;
        Pair[] pairArr = new Pair[4];
        String aid = aweme.getAid();
        Object obj = "";
        if (aid == null) {
            aid = "";
        }
        pairArr[0] = new Pair("item_id", aid);
        pairArr[1] = new Pair("action", str);
        pairArr[2] = new Pair("from_source", "item_play_page");
        try {
            JSONObject jSONObject = new JSONObject();
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            jSONObject.put("item_id", aid2);
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (authorUid == null) {
                authorUid = "";
            }
            jSONObject.put("user_id", authorUid);
            AwemeStatistics statistics = aweme.getStatistics();
            long commentCount = 0;
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            jSONObject.put("vv", playCount);
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null) {
                diggCount = statistics2.getDiggCount();
            } else {
                diggCount = 0;
            }
            jSONObject.put("liked", diggCount);
            AwemeStatistics statistics3 = aweme.getStatistics();
            if (statistics3 != null) {
                commentCount = statistics3.getCommentCount();
            }
            jSONObject.put("comments", commentCount);
            c098200Yq = C786410Ut5.J3(jSONObject);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        pairArr[3] = new Pair("item_info", obj);
        C20684815ws.LJIILLIIL("likeness_detection_report_bottom_sheet_click", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
