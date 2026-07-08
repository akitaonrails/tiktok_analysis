package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SMBInfo {

    @C09CT("active_sku_count")
    public long activeSkuCount;

    @C09CT("all_sku_count")
    public long allSkuCount;

    @C09CT("creator_service_plus_switch")
    public boolean creatorServicePlusSwitch;

    @C09CT("opt_in_status")
    public int optInStatus;

    @C09CT("smb_opt_in_source")
    public int smbOptInSource;

    @C09CT("public_room_param")
    public Map<String, String> publicRoomParam = new LinkedHashMap();

    @C09CT("active_sku_type_list")
    public List<Integer> activeSkuTypeList = new ArrayList();

    @C09CT("all_sku_type_list")
    public List<Integer> allSkuTypeList = new ArrayList();

    @C09CT("creator_single_sku_schema")
    public String creatorSingleSkuSchema = "";
}
