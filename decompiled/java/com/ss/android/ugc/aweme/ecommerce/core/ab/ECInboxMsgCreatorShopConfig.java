package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C0C64;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ECInboxMsgCreatorShopConfig {
    public static final MsgGroupConfig LIZ = new MsgGroupConfig(C1697810uHb.LJIIJJI(301, 800, 801), C1697810uHb.LJIIJJI(210, 214, 342), "aweme://lynxview?channel=gec_content_outreach&bundle=home%2Ftemplate%2Ftemplate.js&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Fgec_content_outreach%2Fhome%2Ftemplate%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&trans_status_bar=1&status_bar_color=00000000&use_bdx=1&use_spark=1&enter_from=notification_page&enter_method=inbox_entrance");

    public static MsgGroupConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        MsgGroupConfig msgGroupConfig = LIZ;
        MsgGroupConfig msgGroupConfig2 = (MsgGroupConfig) c0c64LJIILLIIL.LJJII(MsgGroupConfig.class, msgGroupConfig, "ecom_shop_message_creator_shop_config", true);
        return msgGroupConfig2 != null ? msgGroupConfig2 : msgGroupConfig;
    }

    public static final class MsgGroupConfig {

        @C09CT("creator_groups")
        public final List<Integer> creatorGroups;

        @C09CT("creator_schema")
        public final String creatorPageSchema;

        @C09CT("shop_groups")
        public final List<Integer> shopGroups;

        public MsgGroupConfig() {
            this(C1697810uHb.LJIIJJI(301, 800, 801), C1697810uHb.LJIIJJI(210, 214, 342), "aweme://lynxview?channel=gec_content_outreach&bundle=home%2Ftemplate%2Ftemplate.js&surl=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Fgec_content_outreach%2Fhome%2Ftemplate%2Ftemplate.js&use_gecko_first=1&dynamic=1&hide_nav_bar=1&trans_status_bar=1&status_bar_color=00000000&use_bdx=1&use_spark=1&enter_from=notification_page&enter_method=inbox_entrance");
        }

        public MsgGroupConfig(List<Integer> list, List<Integer> list2, String str) {
            this.creatorGroups = list;
            this.shopGroups = list2;
            this.creatorPageSchema = str;
        }
    }
}
