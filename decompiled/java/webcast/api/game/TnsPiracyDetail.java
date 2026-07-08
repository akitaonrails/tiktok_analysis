package webcast.api.game;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TnsPiracyDetail {

    @C09CT("acceleration")
    public List<Double> acceleration;

    @C09CT("angle")
    public List<Double> angle;

    @C09CT("back_screen_clicks")
    public long backScreenClicks;

    @C09CT("browser_info")
    public BrowserInfo browserInfo;

    @C09CT("browser_url")
    public List<String> browserUrl;

    @C09CT("front_screen_clicks")
    public long frontScreenClicks;

    @C09CT("game_program")
    public List<String> gameProgram;

    @C09CT("gyro_x_threshold_hits")
    public List<Boolean> gyroXThresholdHits;

    @C09CT("gyro_y_threshold_hits")
    public List<Boolean> gyroYThresholdHits;

    @C09CT("gyro_z_threshold_hits")
    public List<Boolean> gyroZThresholdHits;

    @C09CT("has_microphones")
    public boolean hasMicrophones;

    @C09CT("micro_sound")
    public long microSound;

    @C09CT("microphone_input_detected")
    public boolean microphoneInputDetected;

    @C09CT("record_time")
    public long recordTime;

    @C09CT("signal_version")
    public long signalVersion;

    @C09CT("user_mute")
    public long userMute;

    @C09CT("video_input")
    public boolean videoInput;
}
