package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class VideoVerticalResponse extends BaseResponse {

    @C09CT("correct_info")
    public final EcomVideoCorrectInfo correctInfo;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("header")
    public final DynamicPatch headerData;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("e_com_mall_video_cards")
    public final List<EcomMallVideoTabCardStruct> videoCardStructs;
}
