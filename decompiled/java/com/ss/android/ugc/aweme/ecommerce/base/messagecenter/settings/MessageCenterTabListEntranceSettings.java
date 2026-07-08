package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class MessageCenterTabListEntranceSettings {
    public static final TabListEntranceConfigModel LIZ;

    static {
        C13BV c13bv = C13BV.INSTANCE;
        LIZ = new TabListEntranceConfigModel(c13bv, c13bv);
    }

    public static final class TabListEntranceConfigModel {

        @C09CT("function_entrance_items")
        public final List<TabEntranceItem> functionEntranceItems;

        @C09CT("function_entrance_items_dark")
        public final List<TabEntranceItem> functionEntranceItemsDark;

        public TabListEntranceConfigModel(List<TabEntranceItem> list, List<TabEntranceItem> list2) {
            this.functionEntranceItems = list;
            this.functionEntranceItemsDark = list2;
        }
    }

    public static final class TabEntranceItem {

        @C09CT("dark_icon_url")
        public final String darkIconUrl;

        @C09CT("icon_url")
        public final String iconUrl;

        @C09CT("schema")
        public final String schema;

        @C09CT("title")
        public final String title;

        @C09CT("type")
        public final Integer type;

        public TabEntranceItem() {
            this(null, null, null, null, null);
        }

        public TabEntranceItem(String str, String str2, String str3, String str4, Integer num) {
            this.darkIconUrl = str;
            this.iconUrl = str2;
            this.schema = str3;
            this.title = str4;
            this.type = num;
        }
    }
}
