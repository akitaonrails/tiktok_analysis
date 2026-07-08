package webcast.api.user;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes.dex */
public final class UserExtra extends Extra {

    @C09CT("anonymous_is_silence")
    public boolean anonymousIsSilence;

    @C09CT("preload_empty_reason")
    public String preloadEmptyReason = "";

    @C09CT("preload_room")
    public Room preloadRoom;
}
