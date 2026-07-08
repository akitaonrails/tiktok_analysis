package com.ss.bytertc.engine;

import X.C2188811AlT;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes21.dex */
public class RTCRoomConfig {
    public boolean isAutoPublish;
    public boolean isAutoSubscribeAudio;
    public boolean isAutoSubscribeVideo;
    public ChannelProfile profile;

    /* JADX INFO: renamed from: com.ss.bytertc.engine.RTCRoomConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile;

        static {
            int[] iArr = new int[ChannelProfile.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile = iArr;
            try {
                iArr[ChannelProfile.CHANNEL_PROFILE_COMMUNICATION.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LOW_LATENCY.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT_ROOM.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LW_TOGETHER.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_HD.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CO_HOST.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_INTERACTIVE_PODCAST.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_KTV.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHORUS.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_VR_CHAT.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_STREAMING.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LAN_LIVE_STREAMING.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_MEETING.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_MEETING_ROOM.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLASSROOM.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
        }
    }

    public int getProfile() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[this.profile.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 8;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return 9;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 10;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 11;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return 16;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return 17;
            case 19:
                return 18;
            default:
                return 0;
        }
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCRoomConfig{profile=");
        sbLIZ.append(this.profile);
        sbLIZ.append(", isAutoPublish=");
        sbLIZ.append(this.isAutoPublish);
        sbLIZ.append(", isAutoSubscribeAudio=");
        sbLIZ.append(this.isAutoSubscribeAudio);
        sbLIZ.append(", isAutoSubscribeVideo=");
        sbLIZ.append(this.isAutoSubscribeVideo);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean isAutoPublish() {
        return this.isAutoPublish;
    }

    public boolean isAutoSubscribeAudio() {
        return this.isAutoSubscribeAudio;
    }

    public boolean isAutoSubscribeVideo() {
        return this.isAutoSubscribeVideo;
    }

    public RTCRoomConfig(ChannelProfile channelProfile, boolean z, boolean z2, boolean z3) {
        this.profile = channelProfile;
        this.isAutoPublish = z;
        this.isAutoSubscribeAudio = z2;
        this.isAutoSubscribeVideo = z3;
    }
}
