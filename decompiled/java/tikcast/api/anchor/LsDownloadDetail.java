package tikcast.api.anchor;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public final class LsDownloadDetail {

    @C09CT("download_fail")
    public long downloadFail;

    @C09CT("download_reason_map")
    public Map<Long, Long> downloadReasonMap = new LinkedHashMap();

    @C09CT("download_success")
    public long downloadSuccess;

    @C09CT("total_download")
    public long totalDownload;
}
