package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackItem {

    @C09CT("extra")
    public List<ItemFilter> extra = new ArrayList();

    @C09CT("source")
    public String source = "";

    @C09CT("target_time")
    public List<Long> targetTime = new ArrayList();

    @C09CT("text_track")
    public TextTrack textTrack;

    @C09CT("track_type")
    public int trackType;
}
