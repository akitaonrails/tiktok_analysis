package webcast.api.sub;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class RecoverContractResult {

    @C09CT("pay_channel")
    public int payChannel;

    @C09CT("sku_id")
    public String skuId = "";

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_circle")
    public int subCircle;

    @C09CT("tpl_type")
    public int tplType;
}
