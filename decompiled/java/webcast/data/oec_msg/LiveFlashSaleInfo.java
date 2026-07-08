package webcast.data.oec_msg;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class LiveFlashSaleInfo {

    @C09CT("activity_id")
    public long activityId;

    @C09CT("available_stock")
    public int availableStock;

    @C09CT("enhancement_info")
    public FlashSaleEnhancementInfo enhancementInfo;

    @C09CT("pdp_viewer_count")
    public int pdpViewerCount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("stock_status")
    public int stockStatus;

    @C09CT("total_stock")
    public int totalStock;

    @C09CT("type")
    public int type;
}
