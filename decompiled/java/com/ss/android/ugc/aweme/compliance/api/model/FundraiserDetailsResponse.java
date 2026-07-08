package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FundraiserDetailsResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("allow_fundraiser_amplification")
    public final Boolean allowFundraiserAmplification;

    @C09CT("can_donate")
    public final boolean canDonate;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("different_fundraiser_exists_on_profile")
    public final Boolean differentFundraiserExistsOnProfile;

    @C09CT("disable_reason")
    public final int disableReason;

    @C09CT("donation_stats")
    public final DonationStats donationStats;

    @C09CT("donation_summary")
    public final String donationSummary;

    @C09CT("donor_list")
    public final List<Donor> donorList;

    @C09CT("fundraiser")
    public final FundraiserStruct fundraiser;

    @C09CT("fundraiser_creator")
    public final UserStruct fundraiserCreator;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("ngo_struct")
    public final NgoStruct ngoStruct;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public FundraiserDetailsResponse() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, false, 0, 16383, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundraiserDetailsResponse)) {
            return false;
        }
        FundraiserDetailsResponse fundraiserDetailsResponse = (FundraiserDetailsResponse) obj;
        return this.statusCode == fundraiserDetailsResponse.statusCode && Intrinsics.LJFF(this.statusMsg, fundraiserDetailsResponse.statusMsg) && Intrinsics.LJFF(this.donationSummary, fundraiserDetailsResponse.donationSummary) && Intrinsics.LJFF(this.ngoStruct, fundraiserDetailsResponse.ngoStruct) && Intrinsics.LJFF(this.donorList, fundraiserDetailsResponse.donorList) && Intrinsics.LJFF(this.cursor, fundraiserDetailsResponse.cursor) && Intrinsics.LJFF(this.hasMore, fundraiserDetailsResponse.hasMore) && Intrinsics.LJFF(this.donationStats, fundraiserDetailsResponse.donationStats) && Intrinsics.LJFF(this.fundraiserCreator, fundraiserDetailsResponse.fundraiserCreator) && Intrinsics.LJFF(this.fundraiser, fundraiserDetailsResponse.fundraiser) && Intrinsics.LJFF(this.differentFundraiserExistsOnProfile, fundraiserDetailsResponse.differentFundraiserExistsOnProfile) && Intrinsics.LJFF(this.allowFundraiserAmplification, fundraiserDetailsResponse.allowFundraiserAmplification) && this.canDonate == fundraiserDetailsResponse.canDonate && this.disableReason == fundraiserDetailsResponse.disableReason;
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.donationSummary;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NgoStruct ngoStruct = this.ngoStruct;
        int iHashCode3 = (((iHashCode2 + (ngoStruct == null ? 0 : ngoStruct.hashCode())) * 31) + this.donorList.hashCode()) * 31;
        Long l = this.cursor;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hasMore;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        DonationStats donationStats = this.donationStats;
        int iHashCode6 = (iHashCode5 + (donationStats == null ? 0 : donationStats.hashCode())) * 31;
        UserStruct userStruct = this.fundraiserCreator;
        int iHashCode7 = (iHashCode6 + (userStruct == null ? 0 : userStruct.hashCode())) * 31;
        FundraiserStruct fundraiserStruct = this.fundraiser;
        int iHashCode8 = (iHashCode7 + (fundraiserStruct == null ? 0 : fundraiserStruct.hashCode())) * 31;
        Boolean bool = this.differentFundraiserExistsOnProfile;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowFundraiserAmplification;
        return ((((iHashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.canDonate)) * 31) + this.disableReason;
    }

    public String toString() {
        return "FundraiserDetailsResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", donationSummary=" + this.donationSummary + ", ngoStruct=" + this.ngoStruct + ", donorList=" + this.donorList + ", cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", donationStats=" + this.donationStats + ", fundraiserCreator=" + this.fundraiserCreator + ", fundraiser=" + this.fundraiser + ", differentFundraiserExistsOnProfile=" + this.differentFundraiserExistsOnProfile + ", allowFundraiserAmplification=" + this.allowFundraiserAmplification + ", canDonate=" + this.canDonate + ", disableReason=" + this.disableReason + ')';
    }

    public FundraiserDetailsResponse(int i, String str, String str2, NgoStruct ngoStruct, List<Donor> list, Long l, Integer num, DonationStats donationStats, UserStruct userStruct, FundraiserStruct fundraiserStruct, Boolean bool, Boolean bool2, boolean z, int i2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.donationSummary = str2;
        this.ngoStruct = ngoStruct;
        this.donorList = list;
        this.cursor = l;
        this.hasMore = num;
        this.donationStats = donationStats;
        this.fundraiserCreator = userStruct;
        this.fundraiser = fundraiserStruct;
        this.differentFundraiserExistsOnProfile = bool;
        this.allowFundraiserAmplification = bool2;
        this.canDonate = z;
        this.disableReason = i2;
    }

    public FundraiserDetailsResponse(int i, String str, String str2, NgoStruct ngoStruct, List list, Long l, Integer num, DonationStats donationStats, UserStruct userStruct, FundraiserStruct fundraiserStruct, Boolean bool, Boolean bool2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : ngoStruct, (i3 & 16) != 0 ? C13BV.INSTANCE : list, (i3 & 32) != 0 ? null : l, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : donationStats, (i3 & 256) != 0 ? null : userStruct, (i3 & 512) != 0 ? null : fundraiserStruct, (i3 & 1024) != 0 ? null : bool, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? bool2 : null, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z, (i3 & 8192) == 0 ? i2 : 0);
    }
}
