package com.ss.android.ugc.aweme.poi.detail.worldcup.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class WorldCupMatchTeam implements Serializable {

    @C09CT("dark_region_flag")
    public final UrlModel darkRegionFlag;

    @C09CT("is_placeholder")
    public final Boolean isPlaceholder;

    @C09CT("light_region_flag")
    public final UrlModel lightRegionFlag;

    @C09CT("penalty_score")
    public final Integer penaltyScore;

    @C09CT("red_cards")
    public final Integer redCards;

    @C09CT("region_code")
    public final String regionCode;

    @C09CT("region_name")
    public final String regionName;

    @C09CT("score")
    public final Integer score;

    public WorldCupMatchTeam() {
        this(null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorldCupMatchTeam)) {
            return false;
        }
        WorldCupMatchTeam worldCupMatchTeam = (WorldCupMatchTeam) obj;
        return Intrinsics.LJFF(this.regionName, worldCupMatchTeam.regionName) && Intrinsics.LJFF(this.regionCode, worldCupMatchTeam.regionCode) && Intrinsics.LJFF(this.score, worldCupMatchTeam.score) && Intrinsics.LJFF(this.penaltyScore, worldCupMatchTeam.penaltyScore) && Intrinsics.LJFF(this.redCards, worldCupMatchTeam.redCards) && Intrinsics.LJFF(this.lightRegionFlag, worldCupMatchTeam.lightRegionFlag) && Intrinsics.LJFF(this.darkRegionFlag, worldCupMatchTeam.darkRegionFlag) && Intrinsics.LJFF(this.isPlaceholder, worldCupMatchTeam.isPlaceholder);
    }

    public int hashCode() {
        String str = this.regionName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regionCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.score;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.penaltyScore;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.redCards;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UrlModel urlModel = this.lightRegionFlag;
        int iHashCode6 = (iHashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.darkRegionFlag;
        int iHashCode7 = (iHashCode6 + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        Boolean bool = this.isPlaceholder;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorldCupMatchTeam(regionName=");
        sbLIZ.append(this.regionName);
        sbLIZ.append(", regionCode=");
        sbLIZ.append(this.regionCode);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append(", penaltyScore=");
        sbLIZ.append(this.penaltyScore);
        sbLIZ.append(", redCards=");
        sbLIZ.append(this.redCards);
        sbLIZ.append(", lightRegionFlag=");
        sbLIZ.append(this.lightRegionFlag);
        sbLIZ.append(", darkRegionFlag=");
        sbLIZ.append(this.darkRegionFlag);
        sbLIZ.append(", isPlaceholder=");
        sbLIZ.append(this.isPlaceholder);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public WorldCupMatchTeam(String str, String str2, Integer num, Integer num2, Integer num3, UrlModel urlModel, UrlModel urlModel2, Boolean bool) {
        this.regionName = str;
        this.regionCode = str2;
        this.score = num;
        this.penaltyScore = num2;
        this.redCards = num3;
        this.lightRegionFlag = urlModel;
        this.darkRegionFlag = urlModel2;
        this.isPlaceholder = bool;
    }
}
