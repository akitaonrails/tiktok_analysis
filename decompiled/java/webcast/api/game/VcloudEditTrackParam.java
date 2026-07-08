package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class VcloudEditTrackParam {

    @C09CT("canvas")
    public Canvas canvas;

    @C09CT("end_timestamp")
    public long endTimestamp;

    @C09CT("render_type")
    public int renderType;

    @C09CT("start_timestamp")
    public long startTimestamp;

    @C09CT("tracks")
    public List<TrackItems> tracks = new ArrayList();
}
