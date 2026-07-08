package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LottieDO extends BaseWidgetDO {

    @C09CT("auto_play")
    public final Integer autoPlay;

    @C09CT("dark")
    public final Lottie dark;

    @C09CT("height")
    public final String height;

    @C09CT("light")
    public final Lottie light;

    @C09CT("loop")
    public final Integer loop;

    @C09CT("repeat_start_progress")
    public final String repeatStartProgress;

    @C09CT("width")
    public final String width;

    public LottieDO() {
        this(null, null, null, null, null, 1, null);
    }

    public final LottieDO copy(String str, String str2, Lottie lottie, Lottie lottie2, String str3, Integer num, Integer num2) {
        return new LottieDO(str, str2, lottie, lottie2, str3, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieDO)) {
            return false;
        }
        LottieDO lottieDO = (LottieDO) obj;
        return Intrinsics.LJFF(this.width, lottieDO.width) && Intrinsics.LJFF(this.height, lottieDO.height) && Intrinsics.LJFF(this.light, lottieDO.light) && Intrinsics.LJFF(this.dark, lottieDO.dark) && Intrinsics.LJFF(this.repeatStartProgress, lottieDO.repeatStartProgress) && Intrinsics.LJFF(this.loop, lottieDO.loop) && Intrinsics.LJFF(this.autoPlay, lottieDO.autoPlay);
    }

    public int hashCode() {
        String str = this.width;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.height;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Lottie lottie = this.light;
        int iHashCode3 = (iHashCode2 + (lottie == null ? 0 : lottie.hashCode())) * 31;
        Lottie lottie2 = this.dark;
        int iHashCode4 = (iHashCode3 + (lottie2 == null ? 0 : lottie2.hashCode())) * 31;
        String str3 = this.repeatStartProgress;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.loop;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.autoPlay;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LottieDO(width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", light=");
        sbLIZ.append(this.light);
        sbLIZ.append(", dark=");
        sbLIZ.append(this.dark);
        sbLIZ.append(", repeatStartProgress=");
        sbLIZ.append(this.repeatStartProgress);
        sbLIZ.append(", loop=");
        sbLIZ.append(this.loop);
        sbLIZ.append(", autoPlay=");
        sbLIZ.append(this.autoPlay);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getAutoPlay() {
        return this.autoPlay;
    }

    public final Lottie getDark() {
        return this.dark;
    }

    public final String getHeight() {
        return this.height;
    }

    public final Lottie getLight() {
        return this.light;
    }

    public final Integer getLoop() {
        return this.loop;
    }

    public final String getRepeatStartProgress() {
        return this.repeatStartProgress;
    }

    public final String getWidth() {
        return this.width;
    }

    public LottieDO(String str, String str2, Lottie lottie, Lottie lottie2, String str3, Integer num, Integer num2) {
        super(null, null, 1, null, null);
        this.width = str;
        this.height = str2;
        this.light = lottie;
        this.dark = lottie2;
        this.repeatStartProgress = str3;
        this.loop = num;
        this.autoPlay = num2;
    }
}
