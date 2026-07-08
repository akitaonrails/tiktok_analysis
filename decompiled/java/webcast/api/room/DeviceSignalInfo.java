package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class DeviceSignalInfo {

    @C09CT("gyroscope")
    public List<Gyroscope> gyroscope = new ArrayList();

    @C09CT("microphone_volume")
    public List<MicrophoneVolume> microphoneVolume = new ArrayList();

    @C09CT("captcha_result")
    public List<CaptchaResult> captchaResult = new ArrayList();

    @C09CT("screen_click")
    public List<ScreenClick> screenClick = new ArrayList();

    public static final class CaptchaResult {

        @C09CT("is_captcha_failed")
        public int isCaptchaFailed;

        @C09CT("record_time")
        public long recordTime;
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class Gyroscope {

        @C09CT("record_time")
        public long recordTime;

        @C09CT("angle")
        public List<Double> angle = new ArrayList();

        @C09CT("acceleration")
        public List<Double> acceleration = new ArrayList();
    }

    public static final class MicrophoneVolume {

        @C09CT("effective_sound_duration")
        public long effectiveSoundDuration;

        @C09CT("first_record_time")
        public long firstRecordTime;

        @C09CT("last_record_time")
        public long lastRecordTime;

        @C09CT("max_micro_sound")
        public long maxMicroSound;

        @C09CT("unmute_duration")
        public long unmuteDuration;
    }

    public static final class ScreenClick {

        @C09CT("front_screen_clicks")
        public long frontScreenClicks;
    }
}
