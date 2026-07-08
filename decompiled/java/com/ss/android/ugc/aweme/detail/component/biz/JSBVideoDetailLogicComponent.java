package com.ss.android.ugc.aweme.detail.component.biz;

import X.C01GW;
import X.C0T1Y;
import X.C1323820kYO;
import X.C1548820qPI;
import X.C2189821An6;
import X.C397901gf;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import kotlin.jvm.internal.AwS563S0100000_19;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class JSBVideoDetailLogicComponent extends BasePanelComponent {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 978));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 977));

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() throws JSONException {
        DetailNavArgModel navArgModel;
        String jsbVideoDetailKey;
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LL.getValue();
        int iLJIL = iViewPagerAbility != null ? iViewPagerAbility.LJIL() : 0;
        C0T1Y c0t1y = (C0T1Y) this.LLILLJJLI.getValue();
        long currentPosition = c0t1y != null ? c0t1y.getCurrentPosition() : 0L;
        C2189821An6 c2189821An6 = getPanelContext().LIZJ;
        if (c2189821An6 != null && (navArgModel = c2189821An6.getNavArgModel()) != null && (jsbVideoDetailKey = navArgModel.getJsbVideoDetailKey()) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uniqueKey", jsbVideoDetailKey);
            jSONObject.put("index", iLJIL);
            jSONObject.put("playPos", currentPosition);
            C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "onJSBVideoDetailReturnBack"));
        }
        super.onDestroy();
    }
}
