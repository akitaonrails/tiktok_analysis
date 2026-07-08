package com.ss.android.ugc.aweme.minis.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRevisitMissionSettings {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RawFloatingBallConfig {

        @C09CT("exit_days_sequence")
        public final List<Object> exitDaysSequence;

        public RawFloatingBallConfig() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RawFloatingBallConfig) && Intrinsics.LJFF(this.exitDaysSequence, ((RawFloatingBallConfig) obj).exitDaysSequence);
        }

        public final int hashCode() {
            List<Object> list = this.exitDaysSequence;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RawFloatingBallConfig(exitDaysSequence=");
            sbLIZ.append(this.exitDaysSequence);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RawFloatingBallConfig(List<? extends Object> list) {
            this.exitDaysSequence = list;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class RawEntryTypeConfig {

        @C09CT("floating_ball")
        public final RawFloatingBallConfig floatingBall;

        @C09CT("show_delay_seconds")
        public final Object showDelaySeconds;

        public RawEntryTypeConfig() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawEntryTypeConfig)) {
                return false;
            }
            RawEntryTypeConfig rawEntryTypeConfig = (RawEntryTypeConfig) obj;
            return Intrinsics.LJFF(this.showDelaySeconds, rawEntryTypeConfig.showDelaySeconds) && Intrinsics.LJFF(this.floatingBall, rawEntryTypeConfig.floatingBall);
        }

        public final int hashCode() {
            Object obj = this.showDelaySeconds;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            RawFloatingBallConfig rawFloatingBallConfig = this.floatingBall;
            return iHashCode + (rawFloatingBallConfig != null ? rawFloatingBallConfig.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RawEntryTypeConfig(showDelaySeconds=");
            sbLIZ.append(this.showDelaySeconds);
            sbLIZ.append(", floatingBall=");
            sbLIZ.append(this.floatingBall);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RawEntryTypeConfig(Object obj, RawFloatingBallConfig rawFloatingBallConfig) {
            this.showDelaySeconds = obj;
            this.floatingBall = rawFloatingBallConfig;
        }
    }

    public static final class RawMissionConfig {

        @C09CT("allowed_regions")
        public final List<String> allowedRegions;

        @C09CT("blocked_regions")
        public final List<String> blockedRegions;

        @C09CT("cool_down_days")
        public final Integer coolDownDays;

        @C09CT("enable")
        public final boolean enable;

        public RawMissionConfig() {
            this(false, null, null, null, 15, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawMissionConfig)) {
                return false;
            }
            RawMissionConfig rawMissionConfig = (RawMissionConfig) obj;
            return this.enable == rawMissionConfig.enable && Intrinsics.LJFF(this.allowedRegions, rawMissionConfig.allowedRegions) && Intrinsics.LJFF(this.blockedRegions, rawMissionConfig.blockedRegions) && Intrinsics.LJFF(this.coolDownDays, rawMissionConfig.coolDownDays);
        }

        public final int hashCode() {
            int iZ2 = ((((C786410Ut5.Z2(this.enable) * 31) + this.allowedRegions.hashCode()) * 31) + this.blockedRegions.hashCode()) * 31;
            Integer num = this.coolDownDays;
            return iZ2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RawMissionConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", allowedRegions=");
            sbLIZ.append(this.allowedRegions);
            sbLIZ.append(", blockedRegions=");
            sbLIZ.append(this.blockedRegions);
            sbLIZ.append(", coolDownDays=");
            sbLIZ.append(this.coolDownDays);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RawMissionConfig(boolean z, List<String> list, List<String> list2, Integer num) {
            this.enable = z;
            this.allowedRegions = list;
            this.blockedRegions = list2;
            this.coolDownDays = num;
        }

        public RawMissionConfig(boolean z, List list, List list2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? null : num);
        }
    }

    public static final class RawAddToHomeMissionConfig {

        @C09CT("allowed_regions")
        public final List<String> allowedRegions;

        @C09CT("banner_show_count")
        public final Integer bannerShowCount;

        @C09CT("blocked_regions")
        public final List<String> blockedRegions;

        @C09CT("cool_down_days")
        public final Integer coolDownDays;

        @C09CT("enable")
        public final boolean enable;

        public RawAddToHomeMissionConfig() {
            this(false, null, null, null, null, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawAddToHomeMissionConfig)) {
                return false;
            }
            RawAddToHomeMissionConfig rawAddToHomeMissionConfig = (RawAddToHomeMissionConfig) obj;
            return this.enable == rawAddToHomeMissionConfig.enable && Intrinsics.LJFF(this.allowedRegions, rawAddToHomeMissionConfig.allowedRegions) && Intrinsics.LJFF(this.blockedRegions, rawAddToHomeMissionConfig.blockedRegions) && Intrinsics.LJFF(this.coolDownDays, rawAddToHomeMissionConfig.coolDownDays) && Intrinsics.LJFF(this.bannerShowCount, rawAddToHomeMissionConfig.bannerShowCount);
        }

        public final int hashCode() {
            int iZ2 = ((((C786410Ut5.Z2(this.enable) * 31) + this.allowedRegions.hashCode()) * 31) + this.blockedRegions.hashCode()) * 31;
            Integer num = this.coolDownDays;
            int iHashCode = (iZ2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.bannerShowCount;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RawAddToHomeMissionConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", allowedRegions=");
            sbLIZ.append(this.allowedRegions);
            sbLIZ.append(", blockedRegions=");
            sbLIZ.append(this.blockedRegions);
            sbLIZ.append(", coolDownDays=");
            sbLIZ.append(this.coolDownDays);
            sbLIZ.append(", bannerShowCount=");
            sbLIZ.append(this.bannerShowCount);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RawAddToHomeMissionConfig(boolean z, List<String> list, List<String> list2, Integer num, Integer num2) {
            this.enable = z;
            this.allowedRegions = list;
            this.blockedRegions = list2;
            this.coolDownDays = num;
            this.bannerShowCount = num2;
        }

        public RawAddToHomeMissionConfig(boolean z, List list, List list2, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? C13BV.INSTANCE : list2, (i & 8) != 0 ? null : num, (i & 16) == 0 ? num2 : null);
        }
    }

    public static final class RawRevisitMissionConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("entry_type")
        public final RawEntryTypeConfig entryType;

        @C09CT("mission_add_to_home_screen")
        public final RawAddToHomeMissionConfig missionAddToHomeScreen;

        @C09CT("mission_feed_sidebar")
        public final RawMissionConfig missionFeedSidebar;

        @C09CT("mission_profile_sidebar")
        public final RawMissionConfig missionProfileSidebar;

        public RawRevisitMissionConfig() {
            this(false, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawRevisitMissionConfig)) {
                return false;
            }
            RawRevisitMissionConfig rawRevisitMissionConfig = (RawRevisitMissionConfig) obj;
            return this.enable == rawRevisitMissionConfig.enable && Intrinsics.LJFF(this.missionProfileSidebar, rawRevisitMissionConfig.missionProfileSidebar) && Intrinsics.LJFF(this.missionFeedSidebar, rawRevisitMissionConfig.missionFeedSidebar) && Intrinsics.LJFF(this.missionAddToHomeScreen, rawRevisitMissionConfig.missionAddToHomeScreen) && Intrinsics.LJFF(this.entryType, rawRevisitMissionConfig.entryType);
        }

        public final int hashCode() {
            int iZ2 = C786410Ut5.Z2(this.enable) * 31;
            RawMissionConfig rawMissionConfig = this.missionProfileSidebar;
            int iHashCode = (iZ2 + (rawMissionConfig == null ? 0 : rawMissionConfig.hashCode())) * 31;
            RawMissionConfig rawMissionConfig2 = this.missionFeedSidebar;
            int iHashCode2 = (iHashCode + (rawMissionConfig2 == null ? 0 : rawMissionConfig2.hashCode())) * 31;
            RawAddToHomeMissionConfig rawAddToHomeMissionConfig = this.missionAddToHomeScreen;
            int iHashCode3 = (iHashCode2 + (rawAddToHomeMissionConfig == null ? 0 : rawAddToHomeMissionConfig.hashCode())) * 31;
            RawEntryTypeConfig rawEntryTypeConfig = this.entryType;
            return iHashCode3 + (rawEntryTypeConfig != null ? rawEntryTypeConfig.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RawRevisitMissionConfig(enable=");
            sbLIZ.append(this.enable);
            sbLIZ.append(", missionProfileSidebar=");
            sbLIZ.append(this.missionProfileSidebar);
            sbLIZ.append(", missionFeedSidebar=");
            sbLIZ.append(this.missionFeedSidebar);
            sbLIZ.append(", missionAddToHomeScreen=");
            sbLIZ.append(this.missionAddToHomeScreen);
            sbLIZ.append(", entryType=");
            sbLIZ.append(this.entryType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public RawRevisitMissionConfig(boolean z, RawMissionConfig rawMissionConfig, RawMissionConfig rawMissionConfig2, RawAddToHomeMissionConfig rawAddToHomeMissionConfig, RawEntryTypeConfig rawEntryTypeConfig) {
            this.enable = z;
            this.missionProfileSidebar = rawMissionConfig;
            this.missionFeedSidebar = rawMissionConfig2;
            this.missionAddToHomeScreen = rawAddToHomeMissionConfig;
            this.entryType = rawEntryTypeConfig;
        }
    }
}
