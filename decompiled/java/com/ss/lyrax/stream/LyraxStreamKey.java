package com.ss.lyrax.stream;

import X.C2188811AlT;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxStreamKey {
    public String roomID;
    public String streamID;
    public LyraxStreamIndex streamIndex;
    public String userID;

    public int hashCode() {
        return (this.roomID.isEmpty() && this.userID.isEmpty()) ? !this.streamID.isEmpty() ? Objects.hash(this.streamID) : super.hashCode() : Objects.hash(this.roomID, this.userID, this.streamIndex);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyraxStreamKey{streamID='");
        sbLIZ.append(this.streamID);
        sbLIZ.append('\'');
        sbLIZ.append(", roomID='");
        sbLIZ.append(this.roomID);
        sbLIZ.append('\'');
        sbLIZ.append(", userID='");
        sbLIZ.append(this.userID);
        sbLIZ.append('\'');
        sbLIZ.append(", streamIndex=");
        sbLIZ.append(this.streamIndex);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LyraxStreamKey() {
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LyraxStreamKey lyraxStreamKey = (LyraxStreamKey) obj;
        if (!this.streamID.isEmpty() && !lyraxStreamKey.streamID.isEmpty() && this.streamID.equals(lyraxStreamKey.streamID)) {
            return true;
        }
        if (!this.roomID.equals(lyraxStreamKey.roomID) || !this.userID.equals(lyraxStreamKey.userID) || this.streamIndex != lyraxStreamKey.streamIndex) {
            return false;
        }
        return true;
    }

    public LyraxStreamKey(String str, String str2, String str3, LyraxStreamIndex lyraxStreamIndex) {
        this.streamID = str;
        this.roomID = str2;
        this.userID = str3;
        this.streamIndex = lyraxStreamIndex;
    }

    public static LyraxStreamKey create(String str, String str2, String str3, LyraxStreamIndex lyraxStreamIndex) {
        LyraxStreamKey lyraxStreamKey = new LyraxStreamKey();
        lyraxStreamKey.streamID = str;
        lyraxStreamKey.roomID = str2;
        lyraxStreamKey.userID = str3;
        lyraxStreamKey.streamIndex = lyraxStreamIndex;
        return lyraxStreamKey;
    }
}
