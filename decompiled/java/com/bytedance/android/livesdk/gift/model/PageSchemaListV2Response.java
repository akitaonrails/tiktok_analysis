package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PageSchemaListV2Response {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("room_info")
        public RoomInfo roomInfo;

        @C09CT("page_infos")
        public Map<String, String> pageInfos = new LinkedHashMap();

        @C09CT("categories")
        public List<GiftHubPageCategoryInfo> categories = new ArrayList();

        @C09CT("default_page_id")
        public String defaultPageId = "";
    }
}
