package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveBillboardMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("born_time_ms")
    public String bornTimeMs;

    @C09CT("current_display_billboards")
    public List<Billboard> currentDisplayBillboards;

    @C09CT("da_info")
    public Map<String, String> daInfo;

    @C09CT("dispersion_info")
    public DispersionInfo dispersionInfo;

    @C09CT("need_request_refresh")
    public boolean needRequestRefresh;

    @C09CT("operated_billboards")
    public List<Billboard> operatedBillboards;

    @C09CT("pop_up")
    public PopUp popUp;

    @C09CT("trigger_source")
    public int triggerSource;

    public OecLiveBillboardMessage() {
        this.type = C001A.OEC_LIVE_BILLBOARD_MESSAGE;
        this.bornTimeMs = "";
        this.currentDisplayBillboards = new ArrayList();
        this.operatedBillboards = new ArrayList();
        this.daInfo = new LinkedHashMap();
    }
}
