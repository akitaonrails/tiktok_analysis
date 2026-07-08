package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcSeaPdpLivePlaybackEntranceSettings {
    public static final EcSeaPdpLivePlaybackEntranceModel LIZ;

    static {
        EcSeaPdpLivePlaybackEntranceModel ecSeaPdpLivePlaybackEntranceModel = new EcSeaPdpLivePlaybackEntranceModel(0, 0, 0, 0, 1);
        EcSeaPdpLivePlaybackEntranceModel ecSeaPdpLivePlaybackEntranceModel2 = (EcSeaPdpLivePlaybackEntranceModel) SettingsManager.LIZLLL().LJIIIIZZ("ec_sea_pdp_playback_config", EcSeaPdpLivePlaybackEntranceModel.class, ecSeaPdpLivePlaybackEntranceModel);
        if (ecSeaPdpLivePlaybackEntranceModel2 != null) {
            ecSeaPdpLivePlaybackEntranceModel = ecSeaPdpLivePlaybackEntranceModel2;
        }
        LIZ = ecSeaPdpLivePlaybackEntranceModel;
    }

    public static boolean LIZ() {
        Integer num = LIZ.enable;
        return num != null && num.intValue() == 1;
    }

    public static final class EcSeaPdpLivePlaybackEntranceModel {

        @C09CT("enable")
        public final Integer enable;

        @C09CT("enable_show_live_entrance_enter_from_video")
        public final Integer enableLiveEntranceShortVideoChannel;

        @C09CT("enable_live_playback_entrance")
        public final Integer enableLivePlaybackEntrance;

        @C09CT("enable_stop_live_in_playback_page")
        public final Integer enableStopLiveWhenInPlaybackPage;

        @C09CT("live_bubble_show_style")
        public final Integer liveBubbleShowStyle;

        public EcSeaPdpLivePlaybackEntranceModel() {
            this(0, 0, 0, 0, 1);
        }

        public EcSeaPdpLivePlaybackEntranceModel(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.enable = num;
            this.enableLiveEntranceShortVideoChannel = num2;
            this.liveBubbleShowStyle = num3;
            this.enableLivePlaybackEntrance = num4;
            this.enableStopLiveWhenInPlaybackPage = num5;
        }
    }
}
