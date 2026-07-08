package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GiftHubPageCategoryInfo {

    @C09CT("category_id")
    public int categoryId;

    @C09CT("enable")
    public boolean enable;

    @C09CT("is_disabled_gift_group")
    public boolean isDisabledGiftGroup;

    @C09CT("title")
    public String title = "";

    @C09CT("subtitle")
    public String subtitle = "";

    @C09CT("page_list")
    public List<GiftHubPageGiftInfo> pageList = new ArrayList();

    @C09CT("image_url")
    public String imageUrl = "";

    @C09CT("user_map")
    public Map<String, User> userMap = new LinkedHashMap();

    public static final class User {

        @C09CT("id_str")
        public String idStr = "";

        @C09CT("nickname")
        public String nickname = "";

        @C09CT("avatar_url")
        public String avatarUrl = "";
    }
}
