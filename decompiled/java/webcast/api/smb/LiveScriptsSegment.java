package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveScriptsSegment {

    @C09CT("segment_id")
    public int segmentId;

    @C09CT("segment_title")
    public String segmentTitle = "";

    @C09CT("rows")
    public List<LiveScriptsRow> rows = new ArrayList();
}
