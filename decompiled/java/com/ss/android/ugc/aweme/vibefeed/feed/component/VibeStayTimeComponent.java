package com.ss.android.ugc.aweme.vibefeed.feed.component;

import X.C01GW;
import X.C2189821An6;
import X.C452501pT;
import X.C724240Sb0;
import X.InterfaceC744170THb;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class VibeStayTimeComponent extends BasePanelComponent {
    public AnalysisStayTimeFragmentComponent LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 637));

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        final C2189821An6 c2189821An6;
        super.onParentViewCreated();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (c2189821An6 = getPanelContext().LIZJ) == null) {
            return;
        }
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(fragmentLJI);
        this.LL = analysisStayTimeFragmentComponent;
        analysisStayTimeFragmentComponent.LLILZ = new InterfaceC744170THb() { // from class: X.0r7o
            @Override // X.InterfaceC744170THb
            public final C1386470mBR LIZ(C1386470mBR c1386470mBR) {
                String strOptString;
                String strOptString2;
                String previousPage = c2189821An6.getPreviousPage();
                String str = "";
                if (previousPage == null) {
                    previousPage = "";
                }
                c1386470mBR.LJJLIIIJL = previousPage;
                String uid = c2189821An6.getUid();
                if (uid == null) {
                    uid = "";
                }
                c1386470mBR.LJJLIIIJLJLI = uid;
                String feedsAwemeId = c2189821An6.getFeedsAwemeId();
                if (feedsAwemeId == null) {
                    feedsAwemeId = "";
                }
                c1386470mBR.LJJLIIIJJIZ = feedsAwemeId;
                c1386470mBR.LJJIJL("chat");
                if (Intrinsics.LJFF(c2189821An6.getEventType(), "shared_feed")) {
                    JSONObject jSONObject = (JSONObject) this.LLILLJJLI.getValue();
                    if (jSONObject != null && (strOptString2 = jSONObject.optString("conversation_id")) != null) {
                        str = strOptString2;
                    }
                    c1386470mBR.LJJLL = C0P30.LIZ().LIZLLL(str);
                } else if (Intrinsics.LJFF(c2189821An6.getEventType(), "shared_feed_like_history")) {
                    JSONObject jSONObject2 = (JSONObject) this.LLILLJJLI.getValue();
                    if (jSONObject2 != null && (strOptString = jSONObject2.optString("feed_id")) != null) {
                        str = strOptString;
                    }
                    c1386470mBR.LJJLL = str;
                }
                C2277711EDh.LIZIZ.LJJJJJL(c1386470mBR, c2189821An6);
                return c1386470mBR;
            }
        };
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.InterfaceC1565950qqv
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.LL;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.LIZIZ(z);
        }
    }
}
