package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SMBInfo {

    @C09CT("active_sku_type_list")
    public List<Integer> activeSkuTypeList = new ArrayList();

    @C09CT("opt_in_status")
    public int optInStatus;

    @C09CT("opt_in_time")
    public long optInTime;
}
