package webcast.data.oec_msg;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OecLiveShoppingMessageV2 {

    @C09CT("actions")
    public Map<Long, EcomLiveElementActions> actions = new LinkedHashMap();

    @C09CT("commerce_info")
    public CommerceInfo commerceInfo;

    @C09CT("msg_meta")
    public MsgMeta msgMeta;
}
