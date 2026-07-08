package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ConversationInfo {

    @C09CT("clickUrl")
    public final String clickUrl;

    @C09CT("conId")
    public final Long conId;

    @C09CT("conShortId")
    public final Long conShortId;

    @C09CT("conversationType")
    public final Integer conversationType;

    @C09CT("createTime")
    public final Long createTime;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("ext_track_params")
    public final Map<String, String> extTrackParams;

    @C09CT("imageUrl")
    public final String imageUrl;

    @C09CT("isBlock")
    public final Boolean isBlock;

    @C09CT("messages")
    public final List<SellerMessage> messages;

    @C09CT("modifyTime")
    public final Long modifyTime;

    @C09CT("name")
    public final String name;

    @C09CT("selling")
    public final StoreSellingPoint selling;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("unReadCount")
    public final Integer unReadCount;

    public ConversationInfo() {
        this(0L, 0, 0L, 0L, 0, 0L, null, 0, Boolean.FALSE, null, null, null, null, null, null);
    }

    public ConversationInfo(Long l, Integer num, Long l2, Long l3, Integer num2, Long l4, List<SellerMessage> list, Integer num3, Boolean bool, String str, String str2, String str3, StoreSellingPoint storeSellingPoint, Map<String, String> map, Map<String, String> map2) {
        this.conShortId = l;
        this.status = num;
        this.createTime = l2;
        this.modifyTime = l3;
        this.conversationType = num2;
        this.conId = l4;
        this.messages = list;
        this.unReadCount = num3;
        this.isBlock = bool;
        this.imageUrl = str;
        this.clickUrl = str2;
        this.name = str3;
        this.selling = storeSellingPoint;
        this.ext = map;
        this.extTrackParams = map2;
    }
}
