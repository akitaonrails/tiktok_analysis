package tikcast.linkmic.common;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class MultiGuestSpotExtra {

    @C09CT("content_position_type")
    public int contentPositionType;

    @C09CT("is_double_zoom_enabled")
    public boolean isDoubleZoomEnabled;

    @C09CT("is_enlarged")
    public boolean isEnlarged;

    @C09CT("is_single_zoom_enabled")
    public boolean isSingleZoomEnabled;

    @C09CT("is_switch_spot_enabled")
    public boolean isSwitchSpotEnabled;

    @C09CT("social_game_user")
    public SocialGameUserSpotExtra socialGameUser;

    @C09CT("spot_rank")
    public int spotRank;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiGuestSpotExtra)) {
            return false;
        }
        MultiGuestSpotExtra multiGuestSpotExtra = (MultiGuestSpotExtra) obj;
        if (this.isEnlarged == multiGuestSpotExtra.isEnlarged && this.isSingleZoomEnabled == multiGuestSpotExtra.isSingleZoomEnabled && this.isDoubleZoomEnabled == multiGuestSpotExtra.isDoubleZoomEnabled && this.isSwitchSpotEnabled == multiGuestSpotExtra.isSwitchSpotEnabled && this.spotRank == multiGuestSpotExtra.spotRank) {
            return true;
        }
        return false;
    }
}
