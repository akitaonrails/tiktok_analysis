package webcast.api.audience;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes8.dex */
public final class WatchLaterGetActivityTooltipResp {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("room")
        public Room room;

        @C09CT("tooltip_text")
        public String tooltipText = "";
    }
}
