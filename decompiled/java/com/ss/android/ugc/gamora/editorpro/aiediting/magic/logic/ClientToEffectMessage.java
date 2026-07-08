package com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic;

import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ClientToEffectMessage {
    public static final int $stable = 8;
    public List<BeatInfo> beatsInfo;
    public long duration;
    public long musicEndTime;
    public long musicStartTime;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientToEffectMessage)) {
            return false;
        }
        ClientToEffectMessage clientToEffectMessage = (ClientToEffectMessage) obj;
        return this.musicStartTime == clientToEffectMessage.musicStartTime && this.musicEndTime == clientToEffectMessage.musicEndTime && this.duration == clientToEffectMessage.duration && Intrinsics.LJFF(this.beatsInfo, clientToEffectMessage.beatsInfo);
    }

    public int hashCode() {
        return (((((C786410Ut5.Y2(this.musicStartTime) * 31) + C786410Ut5.Y2(this.musicEndTime)) * 31) + C786410Ut5.Y2(this.duration)) * 31) + this.beatsInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClientToEffectMessage(musicStartTime=");
        sbLIZ.append(this.musicStartTime);
        sbLIZ.append(", musicEndTime=");
        sbLIZ.append(this.musicEndTime);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", beatsInfo=");
        sbLIZ.append(this.beatsInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setBeatsInfo(List<BeatInfo> list) {
        this.beatsInfo = list;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setMusicEndTime(long j) {
        this.musicEndTime = j;
    }

    public final void setMusicStartTime(long j) {
        this.musicStartTime = j;
    }

    public ClientToEffectMessage(long j, long j2, long j3, List<BeatInfo> list) {
        this.musicStartTime = j;
        this.musicEndTime = j2;
        this.duration = j3;
        this.beatsInfo = list;
    }
}
