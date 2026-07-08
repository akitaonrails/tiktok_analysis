package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicTabInfo implements Serializable {

    @C09CT("claim_info")
    public MusicTabClaimInfo musicTabClaimInfo;

    @C09CT("show_artist_pick_videos")
    public boolean showArtistPickVideos;

    @C09CT("show_ghost_music_tab")
    public boolean showGhostMusicTab;

    public MusicTabInfo() {
        this(false, false, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicTabInfo(showGhostMusicTab=");
        sbLIZ.append(this.showGhostMusicTab);
        sbLIZ.append(", showArtistPickVideos=");
        sbLIZ.append(this.showArtistPickVideos);
        sbLIZ.append(", musicTabClaimInfo=");
        sbLIZ.append(this.musicTabClaimInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setMusicTabClaimInfo(MusicTabClaimInfo musicTabClaimInfo) {
        this.musicTabClaimInfo = musicTabClaimInfo;
    }

    public final void setShowArtistPickVideos(boolean z) {
        this.showArtistPickVideos = z;
    }

    public final void setShowGhostMusicTab(boolean z) {
        this.showGhostMusicTab = z;
    }

    public MusicTabInfo(boolean z, boolean z2, MusicTabClaimInfo musicTabClaimInfo) {
        this.showGhostMusicTab = z;
        this.showArtistPickVideos = z2;
        this.musicTabClaimInfo = musicTabClaimInfo;
    }
}
