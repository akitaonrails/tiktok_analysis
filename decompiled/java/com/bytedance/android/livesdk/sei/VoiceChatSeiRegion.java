package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatSeiRegion {

    @C09CT("h")
    public final double height;

    @C09CT("audio_occupied")
    public final int isAudioOccupied;

    @C09CT("mute_a")
    public final int isMuteAudio;

    @C09CT("uid_str")
    public final String linkMicId;

    @C09CT("online_user_state")
    public final int onLineUserState;

    @C09CT("p")
    public final int position;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int spotId;

    @C09CT("stream_id")
    public final String streamId;

    @C09CT("talk_volume")
    public final int talkVolume;

    @C09CT("w")
    public final double width;

    @C09CT("x")
    public final double x;

    @C09CT("y")
    public final double y;

    @C09CT("z")
    public final int z;

    public final int hashCode() {
        String str = this.linkMicId;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + this.talkVolume) * 31) + this.isMuteAudio) * 31) + this.isAudioOccupied) * 31) + this.position) * 31) + this.onLineUserState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceChatSeiRegion)) {
            return false;
        }
        VoiceChatSeiRegion voiceChatSeiRegion = (VoiceChatSeiRegion) obj;
        if (Intrinsics.LJFF(voiceChatSeiRegion.linkMicId, this.linkMicId) && voiceChatSeiRegion.position == this.position) {
            return true;
        }
        return false;
    }

    public VoiceChatSeiRegion(String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, double d, double d2, double d3, double d4, int i7) {
        this.linkMicId = str;
        this.talkVolume = i;
        this.isMuteAudio = i2;
        this.isAudioOccupied = i3;
        this.position = i4;
        this.onLineUserState = i5;
        this.streamId = str2;
        this.spotId = i6;
        this.width = d;
        this.height = d2;
        this.x = d3;
        this.y = d4;
        this.z = i7;
    }
}
