package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedConfig {

    @C09CT("auto_scroll")
    public final boolean autoScroll;

    @C09CT("clear_display")
    public final boolean clearDisplay;

    @C09CT("pip")
    public final boolean pip;

    @C09CT("show_captions")
    public final boolean showCaptions;

    @C09CT("speed")
    public final PlaySpeed speed;

    @C09CT("translate_posts")
    public final boolean translatePosts;

    @C09CT("volume")
    public final int volume;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedConfig)) {
            return false;
        }
        FeedConfig feedConfig = (FeedConfig) obj;
        return this.speed == feedConfig.speed && this.volume == feedConfig.volume && this.pip == feedConfig.pip && this.autoScroll == feedConfig.autoScroll && this.clearDisplay == feedConfig.clearDisplay && this.showCaptions == feedConfig.showCaptions && this.translatePosts == feedConfig.translatePosts;
    }

    public final int hashCode() {
        return (((((((((((this.speed.hashCode() * 31) + this.volume) * 31) + C786410Ut5.Z2(this.pip)) * 31) + C786410Ut5.Z2(this.autoScroll)) * 31) + C786410Ut5.Z2(this.clearDisplay)) * 31) + C786410Ut5.Z2(this.showCaptions)) * 31) + C786410Ut5.Z2(this.translatePosts);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedConfig(speed=");
        sbLIZ.append(this.speed);
        sbLIZ.append(", volume=");
        sbLIZ.append(this.volume);
        sbLIZ.append(", pip=");
        sbLIZ.append(this.pip);
        sbLIZ.append(", autoScroll=");
        sbLIZ.append(this.autoScroll);
        sbLIZ.append(", clearDisplay=");
        sbLIZ.append(this.clearDisplay);
        sbLIZ.append(", showCaptions=");
        sbLIZ.append(this.showCaptions);
        sbLIZ.append(", translatePosts=");
        sbLIZ.append(this.translatePosts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedConfig() {
        this(PlaySpeed.NORMAL, 0, false, false, false, false, false);
    }

    public FeedConfig(PlaySpeed playSpeed, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.speed = playSpeed;
        this.volume = i;
        this.pip = z;
        this.autoScroll = z2;
        this.clearDisplay = z3;
        this.showCaptions = z4;
        this.translatePosts = z5;
    }
}
