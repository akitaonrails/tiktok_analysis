package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalLinkmicStatus;
import com.bytedance.android.livesdk.chatroom.model.interact.RivalOptPairLinkmicStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RivalsUpdateMessage extends AbstractC1136060ffY {

    @C09CT("downgrade_signal")
    public boolean downgradeSignal;

    @C09CT("refresh_session_id")
    public String refreshSessionId;

    @C09CT("update_rivals")
    public UpdatedRivals updateRivals;

    public static final class UpdatedRivals {

        @C09CT("status_text")
        public StatusText statusText;

        @C09CT("linkmic_status_map")
        public Map<Long, RivalLinkmicStatus> linkmicStatusMap = new LinkedHashMap();

        @C09CT("room_info_map")
        public Map<Long, Room> roomInfoMap = new LinkedHashMap();

        @C09CT("opt_pair_linkmic_status")
        public Map<Long, RivalOptPairLinkmicStatus> optPairLinkmicStatus = new LinkedHashMap();

        public static final class StatusText {

            @C09CT("status_text")
            public String statusText = "";

            @C09CT("status_text_type")
            public int statusTextType;
        }
    }

    public RivalsUpdateMessage() {
        this.type = C001A.RIVALS_UPDATE_MESSAGE;
        this.refreshSessionId = "";
    }
}
