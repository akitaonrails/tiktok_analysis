package com.ss.android.ugc.aweme.poi.detail.worldcup.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WorldCupMatch implements Serializable {

    @C09CT("away_team")
    public final WorldCupMatchTeam awayTeam;

    @C09CT("display_info")
    public final String displayInfo;

    @C09CT("has_penalty_shootout")
    public final Boolean hasPenaltyShootout;

    @C09CT("home_team")
    public final WorldCupMatchTeam homeTeam;

    @C09CT("match_id")
    public final Long matchId;

    @C09CT("search_schema")
    public final String searchSchema;

    @C09CT("stage")
    public final String stage;

    @C09CT("start_time")
    public final String startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final WorldCupMatchStatus status;

    public WorldCupMatch() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorldCupMatch)) {
            return false;
        }
        WorldCupMatch worldCupMatch = (WorldCupMatch) obj;
        return Intrinsics.LJFF(this.matchId, worldCupMatch.matchId) && Intrinsics.LJFF(this.startTime, worldCupMatch.startTime) && this.status == worldCupMatch.status && Intrinsics.LJFF(this.stage, worldCupMatch.stage) && Intrinsics.LJFF(this.homeTeam, worldCupMatch.homeTeam) && Intrinsics.LJFF(this.awayTeam, worldCupMatch.awayTeam) && Intrinsics.LJFF(this.searchSchema, worldCupMatch.searchSchema) && Intrinsics.LJFF(this.hasPenaltyShootout, worldCupMatch.hasPenaltyShootout) && Intrinsics.LJFF(this.displayInfo, worldCupMatch.displayInfo);
    }

    public int hashCode() {
        Long l = this.matchId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.startTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        WorldCupMatchStatus worldCupMatchStatus = this.status;
        int iHashCode3 = (iHashCode2 + (worldCupMatchStatus == null ? 0 : worldCupMatchStatus.hashCode())) * 31;
        String str2 = this.stage;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WorldCupMatchTeam worldCupMatchTeam = this.homeTeam;
        int iHashCode5 = (iHashCode4 + (worldCupMatchTeam == null ? 0 : worldCupMatchTeam.hashCode())) * 31;
        WorldCupMatchTeam worldCupMatchTeam2 = this.awayTeam;
        int iHashCode6 = (iHashCode5 + (worldCupMatchTeam2 == null ? 0 : worldCupMatchTeam2.hashCode())) * 31;
        String str3 = this.searchSchema;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hasPenaltyShootout;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.displayInfo;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorldCupMatch(matchId=");
        sbLIZ.append(this.matchId);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.startTime);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.stage);
        sbLIZ.append(", homeTeam=");
        sbLIZ.append(this.homeTeam);
        sbLIZ.append(", awayTeam=");
        sbLIZ.append(this.awayTeam);
        sbLIZ.append(", searchSchema=");
        sbLIZ.append(this.searchSchema);
        sbLIZ.append(", hasPenaltyShootout=");
        sbLIZ.append(this.hasPenaltyShootout);
        sbLIZ.append(", displayInfo=");
        sbLIZ.append(this.displayInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public WorldCupMatch(Long l, String str, WorldCupMatchStatus worldCupMatchStatus, String str2, WorldCupMatchTeam worldCupMatchTeam, WorldCupMatchTeam worldCupMatchTeam2, String str3, Boolean bool, String str4) {
        this.matchId = l;
        this.startTime = str;
        this.status = worldCupMatchStatus;
        this.stage = str2;
        this.homeTeam = worldCupMatchTeam;
        this.awayTeam = worldCupMatchTeam2;
        this.searchSchema = str3;
        this.hasPenaltyShootout = bool;
        this.displayInfo = str4;
    }
}
