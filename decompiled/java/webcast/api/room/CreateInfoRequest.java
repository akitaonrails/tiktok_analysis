package webcast.api.room;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class CreateInfoRequest {

    @C09CT("client_banner_type")
    public int clientBannerType;

    @C09CT("deprecate1")
    public long deprecate1;

    @C09CT("first_open_go_live_page")
    public boolean firstOpenGoLivePage;

    @C09CT("has_entered_try_mode")
    public boolean hasEnteredTryMode;

    @C09CT("inviter_id")
    public long inviterId;

    @C09CT("is_teen")
    public boolean isTeen;

    @C09CT("last_time_hashtag_id")
    public long lastTimeHashtagId;

    @C09CT("live_audio")
    public long liveAudio;

    @C09CT("live_studio")
    public long liveStudio;

    @C09CT("no_frequency_control_banner_type")
    public int noFrequencyControlBannerType;

    @C09CT("screen_shot")
    public long screenShot;

    @C09CT("third_party")
    public long thirdParty;

    @C09CT("shoot_enter_from")
    public String shootEnterFrom = "";

    @C09CT("banner_show_stats")
    public Map<String, String> bannerShowStats = new LinkedHashMap();

    @C09CT("banner_click_stats")
    public Map<String, String> bannerClickStats = new LinkedHashMap();

    @C09CT("banner_close_stats")
    public Map<String, String> bannerCloseStats = new LinkedHashMap();

    @C09CT("enter_from")
    public String enterFrom = "";
}
