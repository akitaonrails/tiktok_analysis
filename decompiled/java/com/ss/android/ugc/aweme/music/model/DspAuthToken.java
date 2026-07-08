package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class DspAuthToken implements Serializable {

    @C09CT("amazon_music_token")
    public WebAuthMusicToken amazonMusicToken;

    @C09CT("anghami_music_token")
    public WebAuthMusicToken anghamiMusicToken;

    @C09CT("apple_music_token")
    public AppleMusicToken appleMusicToken;

    @C09CT("deezer_music_token")
    public WebAuthMusicToken deezerMusicToken;

    @C09CT("melon_music_token")
    public WebAuthMusicToken melonMusicToken;

    @C09CT("soundcloud_music_token")
    public WebAuthMusicToken soundCloudMusicToken;

    @C09CT("spotify_music_token")
    public SpotifyMusicToken spotifyMusicToken;

    @C09CT("youtube_music_token")
    public WebAuthMusicToken youtubeMusicToken;

    public DspAuthToken() {
        this(null, null, null, null, null, null, null, null);
    }

    public final DspAuthToken copy(AppleMusicToken appleMusicToken, WebAuthMusicToken webAuthMusicToken, SpotifyMusicToken spotifyMusicToken, WebAuthMusicToken webAuthMusicToken2, WebAuthMusicToken webAuthMusicToken3, WebAuthMusicToken webAuthMusicToken4, WebAuthMusicToken webAuthMusicToken5, WebAuthMusicToken webAuthMusicToken6) {
        return new DspAuthToken(appleMusicToken, webAuthMusicToken, spotifyMusicToken, webAuthMusicToken2, webAuthMusicToken3, webAuthMusicToken4, webAuthMusicToken5, webAuthMusicToken6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DspAuthToken)) {
            return false;
        }
        DspAuthToken dspAuthToken = (DspAuthToken) obj;
        return Intrinsics.LJFF(this.appleMusicToken, dspAuthToken.appleMusicToken) && Intrinsics.LJFF(this.amazonMusicToken, dspAuthToken.amazonMusicToken) && Intrinsics.LJFF(this.spotifyMusicToken, dspAuthToken.spotifyMusicToken) && Intrinsics.LJFF(this.melonMusicToken, dspAuthToken.melonMusicToken) && Intrinsics.LJFF(this.deezerMusicToken, dspAuthToken.deezerMusicToken) && Intrinsics.LJFF(this.soundCloudMusicToken, dspAuthToken.soundCloudMusicToken) && Intrinsics.LJFF(this.youtubeMusicToken, dspAuthToken.youtubeMusicToken) && Intrinsics.LJFF(this.anghamiMusicToken, dspAuthToken.anghamiMusicToken);
    }

    public int hashCode() {
        AppleMusicToken appleMusicToken = this.appleMusicToken;
        int iHashCode = (appleMusicToken == null ? 0 : appleMusicToken.hashCode()) * 31;
        WebAuthMusicToken webAuthMusicToken = this.amazonMusicToken;
        int iHashCode2 = (iHashCode + (webAuthMusicToken == null ? 0 : webAuthMusicToken.hashCode())) * 31;
        SpotifyMusicToken spotifyMusicToken = this.spotifyMusicToken;
        int iHashCode3 = (iHashCode2 + (spotifyMusicToken == null ? 0 : spotifyMusicToken.hashCode())) * 31;
        WebAuthMusicToken webAuthMusicToken2 = this.melonMusicToken;
        int iHashCode4 = (iHashCode3 + (webAuthMusicToken2 == null ? 0 : webAuthMusicToken2.hashCode())) * 31;
        WebAuthMusicToken webAuthMusicToken3 = this.deezerMusicToken;
        int iHashCode5 = (iHashCode4 + (webAuthMusicToken3 == null ? 0 : webAuthMusicToken3.hashCode())) * 31;
        WebAuthMusicToken webAuthMusicToken4 = this.soundCloudMusicToken;
        int iHashCode6 = (iHashCode5 + (webAuthMusicToken4 == null ? 0 : webAuthMusicToken4.hashCode())) * 31;
        WebAuthMusicToken webAuthMusicToken5 = this.youtubeMusicToken;
        int iHashCode7 = (iHashCode6 + (webAuthMusicToken5 == null ? 0 : webAuthMusicToken5.hashCode())) * 31;
        WebAuthMusicToken webAuthMusicToken6 = this.anghamiMusicToken;
        return iHashCode7 + (webAuthMusicToken6 != null ? webAuthMusicToken6.hashCode() : 0);
    }

    public DspAuthToken(AppleMusicToken appleMusicToken, WebAuthMusicToken webAuthMusicToken, SpotifyMusicToken spotifyMusicToken, WebAuthMusicToken webAuthMusicToken2, WebAuthMusicToken webAuthMusicToken3, WebAuthMusicToken webAuthMusicToken4, WebAuthMusicToken webAuthMusicToken5, WebAuthMusicToken webAuthMusicToken6) {
        this.appleMusicToken = appleMusicToken;
        this.amazonMusicToken = webAuthMusicToken;
        this.spotifyMusicToken = spotifyMusicToken;
        this.melonMusicToken = webAuthMusicToken2;
        this.deezerMusicToken = webAuthMusicToken3;
        this.soundCloudMusicToken = webAuthMusicToken4;
        this.youtubeMusicToken = webAuthMusicToken5;
        this.anghamiMusicToken = webAuthMusicToken6;
    }
}
