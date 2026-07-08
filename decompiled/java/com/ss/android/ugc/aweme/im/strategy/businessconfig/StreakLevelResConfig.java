package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakLevelResConfig {

    @C09CT("is_animation_unlock_keep_last_frame")
    public final boolean isAnimationUnlockKeepLastFrame;

    @C09CT("streak_animation_unlock")
    public final StreakResData streakAnimationUnlock;

    @C09CT("streak_fire_lottie_continue")
    public final StreakResData streakFireLottieContinue;

    @C09CT("streak_fire_lottie_unlock")
    public final StreakResData streakFireLottieUnlock;

    @C09CT("streak_font_color_active")
    public final String streakFontColorActive;

    @C09CT("streak_font_color_grey")
    public final String streakFontColorGrey;

    @C09CT("streak_icon_active")
    public final StreakResData streakIconActive;

    @C09CT("streak_icon_grey")
    public final StreakResData streakIconGrey;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakLevelResConfig)) {
            return false;
        }
        StreakLevelResConfig streakLevelResConfig = (StreakLevelResConfig) obj;
        return Intrinsics.LJFF(this.streakIconGrey, streakLevelResConfig.streakIconGrey) && Intrinsics.LJFF(this.streakIconActive, streakLevelResConfig.streakIconActive) && Intrinsics.LJFF(this.streakFireLottieUnlock, streakLevelResConfig.streakFireLottieUnlock) && Intrinsics.LJFF(this.streakFireLottieContinue, streakLevelResConfig.streakFireLottieContinue) && Intrinsics.LJFF(this.streakAnimationUnlock, streakLevelResConfig.streakAnimationUnlock) && Intrinsics.LJFF(this.streakFontColorActive, streakLevelResConfig.streakFontColorActive) && Intrinsics.LJFF(this.streakFontColorGrey, streakLevelResConfig.streakFontColorGrey) && this.isAnimationUnlockKeepLastFrame == streakLevelResConfig.isAnimationUnlockKeepLastFrame;
    }

    public final int hashCode() {
        StreakResData streakResData = this.streakIconGrey;
        int iHashCode = (streakResData == null ? 0 : streakResData.hashCode()) * 31;
        StreakResData streakResData2 = this.streakIconActive;
        int iHashCode2 = (iHashCode + (streakResData2 == null ? 0 : streakResData2.hashCode())) * 31;
        StreakResData streakResData3 = this.streakFireLottieUnlock;
        int iHashCode3 = (iHashCode2 + (streakResData3 == null ? 0 : streakResData3.hashCode())) * 31;
        StreakResData streakResData4 = this.streakFireLottieContinue;
        int iHashCode4 = (iHashCode3 + (streakResData4 == null ? 0 : streakResData4.hashCode())) * 31;
        StreakResData streakResData5 = this.streakAnimationUnlock;
        int iHashCode5 = (iHashCode4 + (streakResData5 == null ? 0 : streakResData5.hashCode())) * 31;
        String str = this.streakFontColorActive;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.streakFontColorGrey;
        return ((iHashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isAnimationUnlockKeepLastFrame);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakLevelResConfig(streakIconGrey=");
        sbLIZ.append(this.streakIconGrey);
        sbLIZ.append(", streakIconActive=");
        sbLIZ.append(this.streakIconActive);
        sbLIZ.append(", streakFireLottieUnlock=");
        sbLIZ.append(this.streakFireLottieUnlock);
        sbLIZ.append(", streakFireLottieContinue=");
        sbLIZ.append(this.streakFireLottieContinue);
        sbLIZ.append(", streakAnimationUnlock=");
        sbLIZ.append(this.streakAnimationUnlock);
        sbLIZ.append(", streakFontColorActive=");
        sbLIZ.append(this.streakFontColorActive);
        sbLIZ.append(", streakFontColorGrey=");
        sbLIZ.append(this.streakFontColorGrey);
        sbLIZ.append(", isAnimationUnlockKeepLastFrame=");
        sbLIZ.append(this.isAnimationUnlockKeepLastFrame);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        StreakResData streakResData;
        StreakResData streakResData2;
        StreakResData streakResData3;
        StreakResData streakResData4;
        StreakResData streakResData5 = this.streakIconGrey;
        return (streakResData5 == null || !streakResData5.LIZ() || (streakResData = this.streakIconActive) == null || !streakResData.LIZ() || (streakResData2 = this.streakFireLottieUnlock) == null || !streakResData2.LIZ() || (streakResData3 = this.streakFireLottieContinue) == null || !streakResData3.LIZ() || (streakResData4 = this.streakAnimationUnlock) == null || !streakResData4.LIZ() || this.streakFontColorActive == null || this.streakFontColorGrey == null) ? false : true;
    }

    public StreakLevelResConfig(StreakResData streakResData, StreakResData streakResData2, StreakResData streakResData3, StreakResData streakResData4, StreakResData streakResData5, String str, String str2, boolean z) {
        this.streakIconGrey = streakResData;
        this.streakIconActive = streakResData2;
        this.streakFireLottieUnlock = streakResData3;
        this.streakFireLottieContinue = streakResData4;
        this.streakAnimationUnlock = streakResData5;
        this.streakFontColorActive = str;
        this.streakFontColorGrey = str2;
        this.isAnimationUnlockKeepLastFrame = z;
    }
}
