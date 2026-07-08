package com.ss.android.ugc.aweme.model;

import X.C098200Yq;
import X.C09CT;
import X.C1155320gAc;
import X.C189200o6;
import X.C2188811AlT;
import X.C7740030o;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DramaExtraTrackingParams implements Serializable {
    public static final C1155320gAc Companion = new C1155320gAc();

    @C09CT("forced_insert_scene")
    public final String forcedInsertScene;

    @C09CT("is_auto_procceed_to_innerfeed")
    public final Boolean isAutoProcceedToInnerfeed;

    @C09CT("is_from_forced_insert_info")
    public final Boolean isFromForcedInsertInfo;

    @C09CT("is_from_series_discover")
    public final Boolean isFromSeriesDiscover;

    @C09CT("is_from_series_discover_by_undertake")
    public final Boolean isFromSeriesDiscoverByUndertake;

    @C09CT("is_from_under_take_forced_insert")
    public final Boolean isFromUnderTakeForcedInsert;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DramaExtraTrackingParams)) {
            return false;
        }
        DramaExtraTrackingParams dramaExtraTrackingParams = (DramaExtraTrackingParams) obj;
        return Intrinsics.LJFF(this.isFromUnderTakeForcedInsert, dramaExtraTrackingParams.isFromUnderTakeForcedInsert) && Intrinsics.LJFF(this.isFromForcedInsertInfo, dramaExtraTrackingParams.isFromForcedInsertInfo) && Intrinsics.LJFF(this.forcedInsertScene, dramaExtraTrackingParams.forcedInsertScene) && Intrinsics.LJFF(this.isFromSeriesDiscover, dramaExtraTrackingParams.isFromSeriesDiscover) && Intrinsics.LJFF(this.isFromSeriesDiscoverByUndertake, dramaExtraTrackingParams.isFromSeriesDiscoverByUndertake) && Intrinsics.LJFF(this.isAutoProcceedToInnerfeed, dramaExtraTrackingParams.isAutoProcceedToInnerfeed);
    }

    public int hashCode() {
        Boolean bool = this.isFromUnderTakeForcedInsert;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isFromForcedInsertInfo;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.forcedInsertScene;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.isFromSeriesDiscover;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isFromSeriesDiscoverByUndertake;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isAutoProcceedToInnerfeed;
        return iHashCode5 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaExtraTrackingParams(isFromUnderTakeForcedInsert=");
        sbLIZ.append(this.isFromUnderTakeForcedInsert);
        sbLIZ.append(", isFromForcedInsertInfo=");
        sbLIZ.append(this.isFromForcedInsertInfo);
        sbLIZ.append(", forcedInsertScene=");
        sbLIZ.append(this.forcedInsertScene);
        sbLIZ.append(", isFromSeriesDiscover=");
        sbLIZ.append(this.isFromSeriesDiscover);
        sbLIZ.append(", isFromSeriesDiscoverByUndertake=");
        sbLIZ.append(this.isFromSeriesDiscoverByUndertake);
        sbLIZ.append(", isAutoProcceedToInnerfeed=");
        sbLIZ.append(this.isAutoProcceedToInnerfeed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DramaExtraTrackingParams() {
        this(Boolean.FALSE, Boolean.FALSE, "", Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public final String toJson() {
        Object c098200Yq;
        try {
            c098200Yq = C7740030o.LIZ().getGson().LJIILL(this);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        return str == null ? "" : str;
    }

    public final Boolean isAutoProcceedToInnerfeed() {
        return this.isAutoProcceedToInnerfeed;
    }

    public final Boolean isFromForcedInsertInfo() {
        return this.isFromForcedInsertInfo;
    }

    public final Boolean isFromSeriesDiscover() {
        return this.isFromSeriesDiscover;
    }

    public final Boolean isFromSeriesDiscoverByUndertake() {
        return this.isFromSeriesDiscoverByUndertake;
    }

    public final Boolean isFromUnderTakeForcedInsert() {
        return this.isFromUnderTakeForcedInsert;
    }

    public DramaExtraTrackingParams(Boolean bool, Boolean bool2, String str, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.isFromUnderTakeForcedInsert = bool;
        this.isFromForcedInsertInfo = bool2;
        this.forcedInsertScene = str;
        this.isFromSeriesDiscover = bool3;
        this.isFromSeriesDiscoverByUndertake = bool4;
        this.isAutoProcceedToInnerfeed = bool5;
    }
}
