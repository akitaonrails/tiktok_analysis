package webcast.api.room;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes.dex */
public final class PreloadRoomResponse {

    @C09CT("data")
    public Room data;

    @C09CT("extra")
    public PreloadRoomExtra extra;

    @C09CT("reason")
    public String reason = "";
}
