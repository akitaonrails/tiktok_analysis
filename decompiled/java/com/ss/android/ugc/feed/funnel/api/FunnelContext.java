package com.ss.android.ugc.feed.funnel.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FunnelContext implements Serializable {
    public final IFcpDataAbility dataAbility;
    public final Info info;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunnelContext)) {
            return false;
        }
        FunnelContext funnelContext = (FunnelContext) obj;
        return Intrinsics.LJFF(this.dataAbility, funnelContext.dataAbility) && Intrinsics.LJFF(this.info, funnelContext.info);
    }

    public int hashCode() {
        IFcpDataAbility iFcpDataAbility = this.dataAbility;
        return ((iFcpDataAbility == null ? 0 : iFcpDataAbility.hashCode()) * 31) + this.info.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FunnelContext(dataAbility=");
        sbLIZ.append(this.dataAbility);
        sbLIZ.append(", info=");
        sbLIZ.append(this.info);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class Info implements Serializable {
        public final String authorId;
        public final String awemeGenres;
        public final String awemeId;
        public final Integer awemeType;
        public final String configType;
        public final String enterFrom;
        public final int globalShowLimit;

        @C09CT("highest_anchor")
        public String highestAnchor;

        @C09CT("main_anchor")
        public String mainAnchor;
        public final String musicId;
        public final String requestId;

        @C09CT("time_tips")
        public long timeTips;

        public Info() {
            this(null, null, null, null, null, null, null, 3, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.LJFF(this.awemeId, info.awemeId) && Intrinsics.LJFF(this.requestId, info.requestId) && Intrinsics.LJFF(this.enterFrom, info.enterFrom) && Intrinsics.LJFF(this.awemeType, info.awemeType) && Intrinsics.LJFF(this.awemeGenres, info.awemeGenres) && Intrinsics.LJFF(this.authorId, info.authorId) && Intrinsics.LJFF(this.musicId, info.musicId) && this.globalShowLimit == info.globalShowLimit && Intrinsics.LJFF(this.configType, info.configType);
        }

        public int hashCode() {
            String str = this.awemeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.requestId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.enterFrom;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.awemeType;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.awemeGenres;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.authorId;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.musicId;
            int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.globalShowLimit) * 31;
            String str7 = this.configType;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Info(awemeId=");
            sbLIZ.append(this.awemeId);
            sbLIZ.append(", requestId=");
            sbLIZ.append(this.requestId);
            sbLIZ.append(", enterFrom=");
            sbLIZ.append(this.enterFrom);
            sbLIZ.append(", awemeType=");
            sbLIZ.append(this.awemeType);
            sbLIZ.append(", awemeGenres=");
            sbLIZ.append(this.awemeGenres);
            sbLIZ.append(", authorId=");
            sbLIZ.append(this.authorId);
            sbLIZ.append(", musicId=");
            sbLIZ.append(this.musicId);
            sbLIZ.append(", globalShowLimit=");
            sbLIZ.append(this.globalShowLimit);
            sbLIZ.append(", configType=");
            sbLIZ.append(this.configType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String genKey() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.awemeId);
            sbLIZ.append('_');
            sbLIZ.append(this.enterFrom);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final void setHighestAnchor(String str) {
            this.highestAnchor = str;
        }

        public final void setMainAnchor(String str) {
            this.mainAnchor = str;
        }

        public final void setTimeTips(long j) {
            this.timeTips = j;
        }

        public Info(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, String str7) {
            this.awemeId = str;
            this.requestId = str2;
            this.enterFrom = str3;
            this.awemeType = num;
            this.awemeGenres = str4;
            this.authorId = str5;
            this.musicId = str6;
            this.globalShowLimit = i;
            this.configType = str7;
            this.timeTips = -1L;
        }
    }

    public final boolean mustShow(String str) {
        GlobalComponentData globalComponentDataProtocol;
        IFcpDataAbility iFcpDataAbility = this.dataAbility;
        if (iFcpDataAbility == null || (globalComponentDataProtocol = iFcpDataAbility.protocol(str)) == null || globalComponentDataProtocol.getShowStrategy() != 2) {
            return false;
        }
        return true;
    }

    public final boolean skipAvoid(String str) {
        GlobalComponentData globalComponentDataProtocol;
        IFcpDataAbility iFcpDataAbility = this.dataAbility;
        if (iFcpDataAbility == null || (globalComponentDataProtocol = iFcpDataAbility.protocol(str)) == null || globalComponentDataProtocol.getShowStrategy() != 1) {
            return false;
        }
        return true;
    }

    public FunnelContext(IFcpDataAbility iFcpDataAbility, Info info) {
        this.dataAbility = iFcpDataAbility;
        this.info = info;
    }
}
