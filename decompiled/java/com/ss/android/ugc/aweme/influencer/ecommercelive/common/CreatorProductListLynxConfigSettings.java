package com.ss.android.ugc.aweme.influencer.ecommercelive.common;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes33.dex */
public final class CreatorProductListLynxConfigSettings {
    public static final CreatorProductListLynxConfigModel LIZ = new CreatorProductListLynxConfigModel("aweme://lynxview_popup/?hide_nav_bar=1&room_id=_roomId_&live_status=_liveStatus_&is_living=_isLiving_&dynamic=1&popup_enter_type=bottom&height_percent=73&radius=10&channel=reactlynx_talent_live_showcase&bundle=app/template.js&close_by_mask=1&need_out_animation=bottom&close_by_gesture=0&drag_by_gesture=0&use_gecko_first=1&use_bdx=1&container_bgcolor=app_theme&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fteu%2Fclient-t%2Flynx%2Freactlynx_talent_live_showcase%2Fapp%2Ftemplate.js");

    public static String LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CreatorProductListLynxConfigModel creatorProductListLynxConfigModel = LIZ;
        CreatorProductListLynxConfigModel creatorProductListLynxConfigModel2 = (CreatorProductListLynxConfigModel) settingsManagerLIZLLL.LJIIIIZZ("creator_product_list_lynx_config", CreatorProductListLynxConfigModel.class, creatorProductListLynxConfigModel);
        if (creatorProductListLynxConfigModel2 != null) {
            creatorProductListLynxConfigModel = creatorProductListLynxConfigModel2;
        }
        return creatorProductListLynxConfigModel.lynxSchema;
    }

    public static final class CreatorProductListLynxConfigModel {

        @C09CT("lynx_schema")
        public final String lynxSchema;

        public CreatorProductListLynxConfigModel(String str) {
            this.lynxSchema = str;
        }
    }
}
