package webcast.data.oec_msg;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MsgMeta {

    @C09CT("reasons")
    public List<String> reasons = new ArrayList();

    @C09CT("server_send_ms")
    public long serverSendMs;

    @C09CT("source_operate_ms")
    public long sourceOperateMs;
}
