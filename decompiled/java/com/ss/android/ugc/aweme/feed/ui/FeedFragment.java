package com.ss.android.ugc.aweme.feed.ui;

import X.C0C59;
import X.C0CN5;
import X.C1150504el;
import X.C1386470mBR;
import X.C1400330mXn;
import X.C1559130qfv;
import X.C1559540qga;
import X.C1582020rGq;
import X.C1589640rT8;
import X.C15WT;
import X.C18IO;
import X.C19741112Lp;
import X.C1BWL;
import X.C20684815ws;
import X.C2187451AjH;
import X.C616540OGe;
import X.C810560Vqw;
import X.InterfaceC1582030rGr;
import X.InterfaceC1587410rPX;
import Y.ARunnableS121S0100000_21;
import Y.ARunnableS15S0100100_9;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes25.dex */
public abstract class FeedFragment extends AmeBaseFragment {
    public static final /* synthetic */ int LLILZIL = 0;
    public long LL = -1;
    public String LLILLJJLI;
    public int LLILLL;
    public AbsFragment LLILZ;

    public String MR() {
        return null;
    }

    public abstract boolean Oi(boolean z);

    public String getEnterFrom() {
        return null;
    }

    public boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OR() {
        if (this instanceof InterfaceC1582030rGr) {
            Aweme awemeG3 = ((InterfaceC1582030rGr) this).G3();
            HashMap map = new HashMap();
            if (awemeG3 != null) {
                map.put("author_id", AwemeExtKt.getAuthorUid(awemeG3));
                map.put("group_id", awemeG3.getGroupId());
                C19741112Lp c19741112Lp = C19741112Lp.LIZ;
                Application applicationLIZ = C1BWL.LIZ();
                c19741112Lp.getClass();
                map.put("enable_location", C19741112Lp.LIZLLL(applicationLIZ, "android.permission.ACCESS_COARSE_LOCATION") ? "1" : CardStruct.IStatusCode.DEFAULT);
            }
            C20684815ws.LJIILLIIL("exit_homepage_nearby", map);
        }
    }

    public final void UR() {
        if (this.LL != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
            if (jCurrentTimeMillis > 0) {
                C810560Vqw.LJ(new ARunnableS15S0100100_9(jCurrentTimeMillis, this, 2));
            }
            this.LL = -1L;
        }
    }

    public void RR() {
        if (getUserVisibleHint()) {
            boolean z = C1559540qga.LIZ(getActivity()) || (this instanceof InterfaceC1587410rPX) || "homepage_nearby".equals(this.LLILLJJLI) || "homepage_explore".equals(this.LLILLJJLI) || "repost_feed".equals(this.LLILLJJLI);
            if (this.LL == -1 && z) {
                this.LL = System.currentTimeMillis();
            }
        }
    }

    public void SR() {
        if (getUserVisibleHint() && this.LL != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
            if (jCurrentTimeMillis > 0) {
                C810560Vqw.LJ(new ARunnableS15S0100100_9(jCurrentTimeMillis, this, 3));
            }
            this.LL = -1L;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        SR();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        RR();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    public final void Db(boolean z) {
        if (!getUserVisibleHint()) {
            return;
        }
        C1559130qfv.LIZ(getActivity(), false);
    }

    public void NR(boolean z) {
        SR();
    }

    public void PR(long j) {
        int iS2;
        if (TextUtils.equals(this.LLILLJJLI, "homepage_friends")) {
            iS2 = C1589640rT8.LIZIZ.S2();
        } else {
            iS2 = 0;
        }
        C1386470mBR c1386470mBR = new C1386470mBR();
        c1386470mBR.LJJLIIIJ = String.valueOf(j);
        c1386470mBR.LJJLJ = iS2;
        c1386470mBR.LJJIJL(this.LLILLJJLI);
        String str = this.LLILLJJLI;
        if (str != null) {
            C1400330mXn.LIZ.getClass();
            C1400330mXn.LIZIZ(c1386470mBR, str);
            C15WT.LIZIZ.LJIIZILJ(c1386470mBR, this.LLILLJJLI);
        }
        c1386470mBR.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1582020rGq.LJ("scene_tab_fragment_on_create");
        if ("a2270.b2001".equals(MR())) {
            if (C1150504el.LIZ().LJJIIZI == null && C1150504el.LIZ().LJII && C1150504el.LIZ().LJIIJJI == 0 && C1150504el.LIZ().LJIIJ == 1) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(C1150504el.LIZ().LJJIIZ) && C0C59.LJ().LJI("btm_delay_first_resume", 0, true) == 1) {
                    C1150504el.LIZ().LJJIIZI = bool;
                    BtmSDK.INSTANCE.registerBtmPageOnCreate(new C18IO((Fragment) this, MR(), true, true, true, (String) null, true));
                    C0CN5.LIZJ(2147483647L, new ARunnableS121S0100000_21(this, 145), false);
                    return;
                }
            }
            BtmSDK.INSTANCE.registerBtmPageOnCreate(new C18IO((Fragment) this, MR(), true, true, true, (String) null, false));
            return;
        }
        if (MR() == null || TextUtils.isEmpty(MR())) {
            return;
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(new C18IO((Fragment) this, MR(), true, true, true, (String) null, false));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1582020rGq.LJ("scene_tab_fragment_on_view_created");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLILLL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            this.LLILLJJLI = arguments.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
            arguments.getString("extra_follow_type", "extra_follow_type_follow");
        }
    }
}
