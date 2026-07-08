package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class PreCheckResult extends BaseResponse {
    public static final /* synthetic */ int LL = 0;

    @C09CT("match_details")
    public final ArrayList<MatchDetail> matchDetails;

    @C09CT("match_details_v1")
    public final ArrayList<MatchDetailsV1> matchDetailsV1;

    @C09CT("material_hash")
    public int materialHash;

    @C09CT("music_infos")
    public final ArrayList<MusicInfo> musicInfos;

    @C09CT("pre_check_id")
    public final String preCheckId;

    @C09CT("un_availed_reason_with_scene")
    public final Map<String, Integer> unavailableReasonWithScene;

    @C09CT("unavailable_reasons")
    public final ArrayList<UnavailableReason> unavailableReasons;

    @C09CT("un_availed_reason")
    public int unavailableReasonsV1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCheckResult)) {
            return false;
        }
        PreCheckResult preCheckResult = (PreCheckResult) obj;
        return Intrinsics.LJFF(this.musicInfos, preCheckResult.musicInfos) && Intrinsics.LJFF(this.matchDetails, preCheckResult.matchDetails) && Intrinsics.LJFF(this.matchDetailsV1, preCheckResult.matchDetailsV1) && Intrinsics.LJFF(this.unavailableReasons, preCheckResult.unavailableReasons) && this.unavailableReasonsV1 == preCheckResult.unavailableReasonsV1 && Intrinsics.LJFF(this.preCheckId, preCheckResult.preCheckId) && this.materialHash == preCheckResult.materialHash && Intrinsics.LJFF(this.unavailableReasonWithScene, preCheckResult.unavailableReasonWithScene);
    }

    public final int hashCode() {
        ArrayList<MusicInfo> arrayList = this.musicInfos;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        ArrayList<MatchDetail> arrayList2 = this.matchDetails;
        int iHashCode2 = (iHashCode + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<MatchDetailsV1> arrayList3 = this.matchDetailsV1;
        int iHashCode3 = (iHashCode2 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        ArrayList<UnavailableReason> arrayList4 = this.unavailableReasons;
        int iHashCode4 = (((((((iHashCode3 + (arrayList4 == null ? 0 : arrayList4.hashCode())) * 31) + this.unavailableReasonsV1) * 31) + this.preCheckId.hashCode()) * 31) + this.materialHash) * 31;
        Map<String, Integer> map = this.unavailableReasonWithScene;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("\n {music_infos: ");
        sbLIZ.append(this.musicInfos);
        sbLIZ.append("; match_details: ");
        sbLIZ.append(this.matchDetails);
        sbLIZ.append("; un_availed_reason_with_scene: ");
        sbLIZ.append(this.unavailableReasonWithScene);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreCheckResult(ArrayList<MusicInfo> arrayList, ArrayList<MatchDetail> arrayList2, ArrayList<MatchDetailsV1> arrayList3, ArrayList<UnavailableReason> arrayList4, int i, String str, int i2, Map<String, Integer> map) {
        this.musicInfos = arrayList;
        this.matchDetails = arrayList2;
        this.matchDetailsV1 = arrayList3;
        this.unavailableReasons = arrayList4;
        this.unavailableReasonsV1 = i;
        this.preCheckId = str;
        this.materialHash = i2;
        this.unavailableReasonWithScene = map;
    }
}
