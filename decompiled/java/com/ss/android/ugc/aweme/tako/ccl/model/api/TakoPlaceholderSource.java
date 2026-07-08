package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C689590R3d;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoPlaceholderSource {
    public transient C689590R3d LIZ;

    @C09CT("any_card")
    public final TakoAnyCard anyCard;

    @C09CT("good_list")
    public final List<TakoProductItem> goodList;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("item_list")
    public final List<TakoVideoItem> itemList;

    @C09CT("pic_list")
    public final List<TakoMixPicItem> picList;

    @C09CT("source_style")
    public final Integer sourceStyle;

    @C09CT("source_type")
    public final Integer sourceType;

    @C09CT("sug_list")
    public final List<TakoSug> sugs;

    @C09CT("user_list")
    public final List<TakoUserItem> userList;

    public TakoPlaceholderSource() {
        this("", null, null, null, null, null, null, null, null, null);
    }

    public TakoPlaceholderSource(String str, Integer num, List<TakoVideoItem> list, List<TakoUserItem> list2, List<TakoProductItem> list3, List<TakoMixPicItem> list4, List<TakoSug> list5, TakoAnyCard takoAnyCard, Integer num2, C689590R3d c689590R3d) {
        this.id = str;
        this.sourceType = num;
        this.itemList = list;
        this.userList = list2;
        this.goodList = list3;
        this.picList = list4;
        this.sugs = list5;
        this.anyCard = takoAnyCard;
        this.sourceStyle = num2;
        this.LIZ = c689590R3d;
    }
}
