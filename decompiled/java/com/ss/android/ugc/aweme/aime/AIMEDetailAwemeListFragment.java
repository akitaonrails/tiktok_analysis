package com.ss.android.ugc.aweme.aime;

import X.C1398410mUh;
import X.C20684815ws;
import X.C2344009Gk;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoTag;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlJCHELIOSp9CQwBDAs2PCQlJQ4kLSgpBSYgPAM+KCg+LSs4";

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        String string;
        String string2;
        String string3;
        String string4;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("detail_id")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("extra_root_style_id")) == null) {
            string2 = "";
        }
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        smartRouteNR.withParam("extra_aime_sytle_id", string);
        smartRouteNR.withParam("extra_aime_root_style_id", string2);
        smartRouteNR.withParam("enter_from", "style_page_feed");
        Bundle arguments3 = getArguments();
        String string5 = null;
        if (arguments3 != null) {
            string3 = arguments3.getString("AIME_DETAIL_STYLE_IMAGE");
        } else {
            string3 = null;
        }
        smartRouteNR.withParam("AIME_DETAIL_STYLE_IMAGE", string3);
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            string4 = arguments4.getString("AIME_DETAIL_STYLE_NAME");
        } else {
            string4 = null;
        }
        smartRouteNR.withParam("AIME_DETAIL_STYLE_NAME", string4);
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            string5 = arguments5.getString("resource_id");
        }
        smartRouteNR.withParam("resource_id", string5);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "style_page");
        c2344009Gk.LJIIIIZZ("root_style_id", string2);
        c2344009Gk.LJIIIIZZ("style_id", string);
        String groupId = aweme.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LJIIIIZZ("prop_list", string);
        if (aweme.getDetailPageVideoTag() == VideoTag.OFFICIAL) {
            str = "official";
        }
        c2344009Gk.LJIIIIZZ("pin_label", str);
        C20684815ws.LJIILLIIL("feed_enter", c2344009Gk.LIZ);
        return smartRouteNR;
    }
}
