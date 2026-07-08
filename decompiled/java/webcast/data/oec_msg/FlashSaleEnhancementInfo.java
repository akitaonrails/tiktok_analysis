package webcast.data.oec_msg;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleEnhancementInfo {

    @C09CT("buyer_infos")
    public List<UserInfo> buyerInfos = new ArrayList();

    @C09CT("enhancement_text_info")
    public EnhancementTextInfo enhancementTextInfo;

    @C09CT("stock_show_status")
    public int stockShowStatus;
}
