package com.ss.android.ugc.aweme.fangroup.action;

import X.C1230900i8W;
import X.C1230910i8X;
import X.C1232370iAt;
import X.C13LP;
import X.C461720I8s;
import X.EnumC1228990i5R;
import X.EnumC1230920i8Y;
import X.EnumC913760Zt0;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupCreationAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) throws Exception {
        int iLIZLLL;
        String string;
        if (context == null) {
            return Boolean.FALSE;
        }
        C1230910i8X c1230910i8XLIZ = C1230900i8W.LIZ(bundle);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/group_chat_open_platform");
        smartRouteBuildRoute.withParam("action", "create_public_group");
        smartRouteBuildRoute.withParam("biz_line", c1230910i8XLIZ.enterFrom);
        smartRouteBuildRoute.withParam("biz_scene", c1230910i8XLIZ.enterMethod);
        smartRouteBuildRoute.withParam("open_platform_source", "schema");
        smartRouteBuildRoute.withParam("enter_from", c1230910i8XLIZ.enterFrom);
        smartRouteBuildRoute.withParam("enter_method", c1230910i8XLIZ.enterMethod);
        smartRouteBuildRoute.withParam("is_full_screen", String.valueOf(c1230910i8XLIZ.isFullScreen()));
        smartRouteBuildRoute.withParam("default_group_name", c1230910i8XLIZ.defaultGroupName);
        smartRouteBuildRoute.withParam("group_category", EnumC1228990i5R.PUBLIC_GROUP.getValue());
        smartRouteBuildRoute.withParam("group_type", EnumC913760Zt0.FAN_GROUP.getValue());
        smartRouteBuildRoute.withParam("business_type", String.valueOf(c1230910i8XLIZ.businessType));
        Integer num = c1230910i8XLIZ.panelHeight;
        int[] iArrLLII = null;
        if (num != null && num.intValue() > 0) {
            iLIZLLL = num.intValue();
        } else {
            iLIZLLL = (int) (C1232370iAt.LIZLLL(context) * 0.73f);
        }
        int iLIZLLL2 = C1232370iAt.LIZLLL(context);
        if (iLIZLLL2 > 0) {
            smartRouteBuildRoute.withParam("panel_height_ratio", String.valueOf(iLIZLLL / iLIZLLL2));
        }
        smartRouteBuildRoute.withParam("create_group_landing_page", String.valueOf(c1230910i8XLIZ.createChatLandingPage));
        smartRouteBuildRoute.withParam("traffic_type", c1230910i8XLIZ.trafficType);
        smartRouteBuildRoute.withParam("disable_background_mask", String.valueOf(c1230910i8XLIZ.disableMask));
        smartRouteBuildRoute.withParam("hide_title_text", String.valueOf(c1230910i8XLIZ.hideGroupListTitleText ? 1 : 0));
        smartRouteBuildRoute.withParam("creator_uid", C461720I8s.LIZIZ());
        if (c1230910i8XLIZ.scene == EnumC1230920i8Y.LIVE_ROOM.getValue()) {
            smartRouteBuildRoute.withParam("quick_chat_view_type", "2");
            smartRouteBuildRoute.withParam("is_group_full_style_when_can_not_create", CardStruct.IStatusCode.DEFAULT);
        }
        List<Integer> list = c1230910i8XLIZ.inviteTypeList;
        if (list != null) {
            iArrLLII = C13LP.LLII(list);
        }
        smartRouteBuildRoute.withParam("invite_list_type", iArrLLII);
        smartRouteBuildRoute.withParam("time_range", c1230910i8XLIZ.timeRange);
        if (bundle != null && (string = bundle.getString("access_criteria_collection_ids")) != null && (!a0.LJJJIL(string))) {
            smartRouteBuildRoute.withParam("access_criteria_collection_ids", string);
        }
        smartRouteBuildRoute.open();
        return Boolean.TRUE;
    }
}
