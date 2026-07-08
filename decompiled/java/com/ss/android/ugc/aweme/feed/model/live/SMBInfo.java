package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class SMBInfo implements Serializable {

    @C09CT("active_sku_count")
    public long activeSkuCount;

    @C09CT("opt_in_status")
    public int optInStatus;

    @C09CT("public_room_param")
    public Map<String, String> publicRoomParam = new LinkedHashMap();

    @C09CT("smb_opt_in_source")
    public int smbOptInSource;
}
