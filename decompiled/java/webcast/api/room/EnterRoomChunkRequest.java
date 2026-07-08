package webcast.api.room;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterRoomChunkRequest {

    @C09CT("extra")
    public EnterChunkExtra extra;

    @C09CT("request_info")
    public Map<String, SubPathInfo> requestInfo = new LinkedHashMap();
}
