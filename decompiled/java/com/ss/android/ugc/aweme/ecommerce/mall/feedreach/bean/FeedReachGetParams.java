package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean;

import X.C09CT;
import com.bytedance.scene.Scene;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedReachGetParams {

    @C09CT("author_uid")
    public final String authorUid;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("ecom_user_actions")
    public final String ecomUserActions;

    @C09CT("extra_pdp_user_actions")
    public final String extraPdpUserActions;

    @C09CT("history_search_word_list")
    public final List<String> historySearchWordList;

    @C09CT("pid_list")
    public final List<String> pidList;

    @C09CT("play_duration")
    public final Integer playDuration;

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("shop_tab_position")
    public final int shopTabPosition;

    @C09CT("related_user_info")
    public final n userInfo;

    public FeedReachGetParams(List<String> list, String str, String str2, int i, int i2, n nVar, Integer num, String str3, List<String> list2, String str4) {
        this.pidList = list;
        this.awemeId = str;
        this.authorUid = str2;
        this.shopTabPosition = i;
        this.scene = i2;
        this.userInfo = nVar;
        this.playDuration = num;
        this.ecomUserActions = str3;
        this.historySearchWordList = list2;
        this.extraPdpUserActions = str4;
    }
}
