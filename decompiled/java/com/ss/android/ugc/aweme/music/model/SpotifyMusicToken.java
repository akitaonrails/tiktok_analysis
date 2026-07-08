package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SpotifyMusicToken implements Serializable {

    @C09CT("refresh_token")
    public final String refreshToken;

    @C09CT("access_token")
    public final String userToken;

    public SpotifyMusicToken(String str, String str2) {
        this.userToken = str;
        this.refreshToken = str2;
    }
}
