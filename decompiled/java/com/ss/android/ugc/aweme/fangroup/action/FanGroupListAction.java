package com.ss.android.ugc.aweme.fangroup.action;

import X.C1230900i8W;
import X.C1230910i8X;
import X.C1230930i8Z;
import X.C1232370iAt;
import X.C1388190mED;
import X.C1390920mIc;
import X.C19EG;
import X.EnumC1228990i5R;
import X.EnumC1230920i8Y;
import X.EnumC913760Zt0;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.fangroup.fragment.FanGroupListFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupListAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) throws Exception {
        String string;
        String string2;
        FragmentManager supportFragmentManager;
        C1230930i8Z c1230930i8Z;
        if (context == null) {
            return Boolean.FALSE;
        }
        C1230910i8X c1230910i8XLIZ = C1230900i8W.LIZ(bundle);
        if (c1230910i8XLIZ.useSelectStyle()) {
            if (c1230910i8XLIZ.isFullScreen() == 0) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    FanGroupListFragment fanGroupListFragment = new FanGroupListFragment();
                    fanGroupListFragment.setArguments(bundle);
                    boolean z = false;
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJI = fanGroupListFragment;
                    tuxSheet.LLJLILLLLZIIL = false;
                    c1390920mIc.LJIIIIZZ(0);
                    if (c1230910i8XLIZ.disableMask == 0) {
                        z = true;
                    }
                    c1390920mIc.LIZ.LLJJIJIIJIL = z;
                    if (c1230910i8XLIZ.useAnchorSelectStyle()) {
                        c1230930i8Z = C1230930i8Z.LIZLLL;
                    } else {
                        c1230930i8Z = C1230930i8Z.LIZJ;
                    }
                    Integer numValueOf = Integer.valueOf(c1230930i8Z.LIZ);
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLJI = numValueOf;
                    tuxSheet2.show(supportFragmentManager, "FanGroupListFragment");
                } else {
                    return Boolean.FALSE;
                }
            } else if (bundle != null && (string2 = bundle.getString("creator_uid")) != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/fan_group_list_inner");
                smartRouteBuildRoute.withParam("creator_uid", string2);
                smartRouteBuildRoute.withParam("build_param", c1230910i8XLIZ);
                smartRouteBuildRoute.open();
            } else {
                return Boolean.FALSE;
            }
        } else if (bundle != null && (string = bundle.getString("creator_uid")) != null) {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//im/group_chat_open_platform");
            smartRouteBuildRoute2.withParam("biz_line", c1230910i8XLIZ.enterFrom);
            smartRouteBuildRoute2.withParam("biz_scene", c1230910i8XLIZ.enterMethod);
            smartRouteBuildRoute2.withParam("open_platform_source", "schema");
            smartRouteBuildRoute2.withParam("action", "show_group_list");
            smartRouteBuildRoute2.withParam("enter_from", c1230910i8XLIZ.enterFrom);
            smartRouteBuildRoute2.withParam("enter_method", c1230910i8XLIZ.enterMethod);
            smartRouteBuildRoute2.withParam("is_full_screen", String.valueOf(c1230910i8XLIZ.isFullScreen()));
            smartRouteBuildRoute2.withParam("default_group_name", c1230910i8XLIZ.defaultGroupName);
            smartRouteBuildRoute2.withParam("group_category", EnumC1228990i5R.PUBLIC_GROUP.getValue());
            smartRouteBuildRoute2.withParam("group_type", EnumC913760Zt0.FAN_GROUP.getValue());
            smartRouteBuildRoute2.withParam("business_type", String.valueOf(c1230910i8XLIZ.businessType));
            smartRouteBuildRoute2.withParam("exclude_business_type", String.valueOf(c1230910i8XLIZ.excludeBusinessType));
            Integer num = c1230910i8XLIZ.panelHeight;
            if (num != null) {
                int iIntValue = num.intValue();
                int iLIZLLL = C1232370iAt.LIZLLL(context);
                if (iLIZLLL > 0) {
                    smartRouteBuildRoute2.withParam("panel_height_ratio", String.valueOf(iIntValue / iLIZLLL));
                }
            }
            smartRouteBuildRoute2.withParam("create_group_landing_page", String.valueOf(c1230910i8XLIZ.createChatLandingPage));
            smartRouteBuildRoute2.withParam("traffic_type", c1230910i8XLIZ.trafficType);
            smartRouteBuildRoute2.withParam("disable_background_mask", String.valueOf(c1230910i8XLIZ.disableMask));
            smartRouteBuildRoute2.withParam("hide_title_text", String.valueOf(c1230910i8XLIZ.hideGroupListTitleText ? 1 : 0));
            smartRouteBuildRoute2.withParam("creator_uid", string);
            if (c1230910i8XLIZ.scene == EnumC1230920i8Y.LIVE_ROOM.getValue()) {
                smartRouteBuildRoute2.withParam("quick_chat_view_type", "2");
                smartRouteBuildRoute2.withParam("is_group_full_style_when_can_not_create", CardStruct.IStatusCode.DEFAULT);
            }
            smartRouteBuildRoute2.open();
        } else {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
