package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class CreateTimerRequest {

    @C09CT("room_id")
    public long roomId;

    @C09CT("start_countdown_time_s")
    public long startCountdownTimeS;

    @C09CT("time_increase_cap_s")
    public long timeIncreaseCapS;

    @C09CT("time_increase_per_sub_s")
    public long timeIncreasePerSubS;

    @C09CT("timer_status")
    public int timerStatus;

    @C09CT("title")
    public String title = "";
}
