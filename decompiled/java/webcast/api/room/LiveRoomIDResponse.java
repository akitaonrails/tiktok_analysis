package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LiveRoomIDResponse {

    @C09CT("data")
    public LiveRoomIDData data;

    @C09CT("extra")
    public LiveRoomIDExtra extra;

    public static final class LiveRoomIDExtra {

        @C09CT("now")
        public long now;
    }
}
