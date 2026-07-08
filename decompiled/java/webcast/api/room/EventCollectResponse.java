package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class EventCollectResponse {

    @C09CT("data")
    public EventCollectData data;

    @C09CT("extra")
    public EventCollectExtra extra;

    public static final class EventCollectExtra {

        @C09CT("now")
        public long now;
    }
}
