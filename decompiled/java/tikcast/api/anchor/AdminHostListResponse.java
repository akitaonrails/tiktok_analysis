package tikcast.api.anchor;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class AdminHostListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("host_list")
        public List<HostInfo> hostList;
    }
}
