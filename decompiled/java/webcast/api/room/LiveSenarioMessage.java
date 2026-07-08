package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveSenarioMessage {

    @C09CT("enable_live_audio")
    public boolean enableLiveAudio;

    @C09CT("enable_live_screenshot")
    public boolean enableLiveScreenshot;

    @C09CT("enable_live_studio")
    public boolean enableLiveStudio;

    @C09CT("enable_live_third_party")
    public boolean enableLiveThirdParty;

    @C09CT("enable_live_voice")
    public boolean enableLiveVoice;

    @C09CT("toast")
    public LiveToastMessage toast;

    public static final class LiveToastMessage {

        @C09CT("new_anchor")
        public boolean newAnchor;
    }
}
