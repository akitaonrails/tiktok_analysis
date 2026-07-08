package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ReportHighlightRequest {

    @C09CT("moment_type")
    public long momentType;

    @C09CT("timestamp_unix")
    public long timestampUnix;

    @C09CT("user_id")
    public long userId;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("fusion_tag")
    public String fusionTag = "";

    @C09CT("moment_data")
    public String momentData = "";
}
