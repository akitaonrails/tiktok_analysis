package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class VirtualTicketEnvelopeInfo {

    @C09CT("cross_room_guide")
    public Text crossRoomGuide;

    @C09CT("display_seconds")
    public long displaySeconds;

    @C09CT("envelope_icon")
    public ImageModel envelopeIcon;

    @C09CT("envelope_id")
    public long envelopeId;

    @C09CT("name_key")
    public String nameKey = "";

    @C09CT("rush_seconds")
    public long rushSeconds;

    @C09CT("send_time_sec")
    public long sendTimeSec;

    @C09CT("ticket_count")
    public long ticketCount;

    @C09CT("to_anchor_id")
    public long toAnchorId;

    @C09CT("to_room_id")
    public long toRoomId;
}
