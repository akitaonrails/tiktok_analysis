package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum ChannelProfile {
    CHANNEL_PROFILE_COMMUNICATION(0),
    CHANNEL_PROFILE_LIVE_BROADCASTING(1),
    CHANNEL_PROFILE_GAME(2),
    CHANNEL_PROFILE_CLOUD_GAME(3),
    CHANNEL_PROFILE_LOW_LATENCY(4),
    CHANNEL_PROFILE_CHAT(5),
    CHANNEL_PROFILE_CHAT_ROOM(6),
    CHANNEL_PROFILE_LW_TOGETHER(7),
    CHANNEL_PROFILE_GAME_HD(8),
    CHANNEL_PROFILE_CO_HOST(9),
    CHANNEL_PROFILE_INTERACTIVE_PODCAST(10),
    CHANNEL_PROFILE_KTV(11),
    CHANNEL_PROFILE_CHORUS(12),
    CHANNEL_PROFIEL_VR_CHAT(13),
    CHANNEL_PROFILE_GAME_STREAMING(14),
    CHANNEL_PROFILE_LAN_LIVE_STREAMING(15),
    CHANNEL_PROFIEL_MEETING(16),
    CHANNEL_PROFILE_MEETING_ROOM(17),
    CHANNEL_PROFILE_CLASSROOM(18);

    public final int value;

    public int value() {
        return this.value;
    }

    public static ChannelProfile fromId(int i) {
        for (ChannelProfile channelProfile : values()) {
            if (channelProfile.value() == i) {
                return channelProfile;
            }
        }
        return CHANNEL_PROFILE_COMMUNICATION;
    }

    public static ChannelProfile valueOf(String str) {
        return (ChannelProfile) C08FF.LIZ(ChannelProfile.class, str);
    }

    ChannelProfile(int i) {
        this.value = i;
    }
}
