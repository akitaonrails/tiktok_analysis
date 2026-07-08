package com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.Billboard;
import com.bytedance.android.livesdk.model.message.PopUp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SeaLiveBillboardByteSyncModel {

    @C09CT("action_type")
    public int actionType;

    @C09CT("need_request_refresh")
    public boolean needRequestRefresh;

    @C09CT("pop_up")
    public PopUp popUp;

    @C09CT("trigger_source")
    public int triggerSource;

    @C09CT("born_time_ms")
    public String bornTimeMs = "";

    @C09CT("current_display_billboards")
    public List<Billboard> currentDisplayBillboards = new ArrayList();

    @C09CT("operated_billboards")
    public List<Billboard> operatedBillboards = new ArrayList();

    @C09CT("da_info")
    public Map<String, String> daInfo = new LinkedHashMap();
}
