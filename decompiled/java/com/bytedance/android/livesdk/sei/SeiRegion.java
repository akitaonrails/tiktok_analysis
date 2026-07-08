package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class SeiRegion implements Comparable<SeiRegion> {

    @C09CT("audio_occupied")
    public int audioOccupied;

    @C09CT("cid")
    public String cid;

    @C09CT("content_type")
    public String contentType;

    @C09CT("extra")
    public SeiExtraInfo extraInfo;

    @C09CT("h")
    public double height;

    @C09CT("mute_a")
    public boolean muteAudioBool;

    @C09CT("mute_v")
    public boolean muteVideoBool;

    @C09CT("online_user_state")
    public int onlineUserState;

    @C09CT("p")
    public int position;

    @C09CT("r")
    public double radius;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public int spotId;

    @C09CT("stream_id")
    public String streamId;

    @C09CT("talk_volume")
    public int talk;

    @C09CT("uid_str")
    public String uidStr = "";

    @C09CT("u_type")
    public int userType;

    @C09CT("w")
    public double width;

    @C09CT("x")
    public double x;

    @C09CT("y")
    public double y;

    @C09CT("z")
    public int z;

    public final long LIZJ() {
        SeiAvatarInfo seiAvatarInfo;
        SeiExtraInfo seiExtraInfo = this.extraInfo;
        long j = 0;
        if (seiExtraInfo != null && (seiAvatarInfo = seiExtraInfo.avatarInfo) != null) {
            try {
                j = CastLongProtector.parseLong(seiAvatarInfo.avatarId);
                return j;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return j;
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.x), Double.valueOf(this.y), this.uidStr, Integer.valueOf(this.talk), Integer.valueOf(this.position), Boolean.valueOf(this.muteAudioBool), Boolean.valueOf(this.muteVideoBool), this.extraInfo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiRegion{width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(", uidStr='");
        sbLIZ.append(this.uidStr);
        sbLIZ.append('\'');
        sbLIZ.append(", streamId='");
        sbLIZ.append(this.streamId);
        sbLIZ.append('\'');
        sbLIZ.append(", talk=");
        sbLIZ.append(this.talk);
        sbLIZ.append(", position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", content_type=");
        sbLIZ.append(this.contentType);
        sbLIZ.append(", onlineUserState=");
        sbLIZ.append(this.onlineUserState);
        sbLIZ.append(", audioOccupied=");
        sbLIZ.append(this.audioOccupied);
        sbLIZ.append(", muteAudioBool=");
        sbLIZ.append(this.muteAudioBool);
        sbLIZ.append(", muteVideoBool=");
        sbLIZ.append(this.muteVideoBool);
        sbLIZ.append(", extraInfo=");
        sbLIZ.append(this.extraInfo);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SeiRegion seiRegion) {
        return this.position - seiRegion.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiRegion)) {
            return false;
        }
        SeiRegion seiRegion = (SeiRegion) obj;
        if (Double.compare(seiRegion.width, this.width) == 0 && Double.compare(seiRegion.height, this.height) == 0 && Double.compare(seiRegion.x, this.x) == 0 && Double.compare(seiRegion.y, this.y) == 0 && this.position == seiRegion.position && Objects.equals(this.uidStr, seiRegion.uidStr) && Objects.equals(this.extraInfo, seiRegion.extraInfo)) {
            return true;
        }
        return false;
    }
}
