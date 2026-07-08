package com.ss.android.ugc.aweme.creativedetail.view;

import X.C1398410mUh;
import X.C627830Ojt;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nITMpLSonKSwgZzHELIOSk6LTJiCj02KTElPyoHJyogDSonKSwgCDg2JSAAIDwnDjctLiI2JjE=";
    public C627830Ojt LLLILZLLLI;
    public long LLLIZZ;
    public String LLLJ;
    public UrlModel LLLJIL;

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute NR(C1398410mUh c1398410mUh, Aweme aweme) {
        String id;
        Integer numValueOf;
        Long lValueOf;
        String enterFrom;
        String resourceId;
        SmartRoute smartRouteNR = super.NR(c1398410mUh, aweme);
        C627830Ojt c627830Ojt = this.LLLILZLLLI;
        String extra = null;
        if (c627830Ojt != null) {
            id = c627830Ojt.getId();
        } else {
            id = null;
        }
        smartRouteNR.withParam("extra_creative_tool_id", id);
        smartRouteNR.withParam("extra_creative_tool_publish_count", this.LLLIZZ);
        C627830Ojt c627830Ojt2 = this.LLLILZLLLI;
        if (c627830Ojt2 != null) {
            numValueOf = Integer.valueOf(c627830Ojt2.getType());
        } else {
            numValueOf = null;
        }
        smartRouteNR.withParam("extra_creative_tool_type", numValueOf);
        C627830Ojt c627830Ojt3 = this.LLLILZLLLI;
        if (c627830Ojt3 != null) {
            lValueOf = Long.valueOf(c627830Ojt3.getClickStartTime());
        } else {
            lValueOf = null;
        }
        smartRouteNR.withParam("extra_creative_tool_click_time", lValueOf);
        smartRouteNR.withParam("extra_creative_tool_name", this.LLLJ);
        smartRouteNR.withParam("extra_creative_tool_cover", this.LLLJIL);
        C627830Ojt c627830Ojt4 = this.LLLILZLLLI;
        if (c627830Ojt4 != null) {
            enterFrom = c627830Ojt4.getEnterFrom();
        } else {
            enterFrom = null;
        }
        smartRouteNR.withParam("extra_creative_tool_enter_from", enterFrom);
        C627830Ojt c627830Ojt5 = this.LLLILZLLLI;
        if (c627830Ojt5 != null) {
            resourceId = c627830Ojt5.getResourceId();
        } else {
            resourceId = null;
        }
        smartRouteNR.withParam("extra_creative_tool_resource_id", resourceId);
        C627830Ojt c627830Ojt6 = this.LLLILZLLLI;
        if (c627830Ojt6 != null) {
            extra = c627830Ojt6.getExtra();
        }
        smartRouteNR.withParam("extra_creative_tool_extra", extra);
        return smartRouteNR;
    }
}
