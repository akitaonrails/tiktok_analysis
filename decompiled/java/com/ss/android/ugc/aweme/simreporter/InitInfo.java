package com.ss.android.ugc.aweme.simreporter;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class InitInfo {
    public String uid = "";
    public String playerName = "tiktok-ttplayer";
    public String playerVersion = "";

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitInfo(uid='");
        sbLIZ.append(this.uid);
        sbLIZ.append("', playerName='");
        sbLIZ.append(this.playerName);
        sbLIZ.append("', playerVersion='");
        sbLIZ.append(this.playerVersion);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getPlayerVersion() {
        return this.playerVersion;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setPlayerName(String str) {
        this.playerName = str;
    }

    public final void setPlayerVersion(String str) {
        this.playerVersion = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
