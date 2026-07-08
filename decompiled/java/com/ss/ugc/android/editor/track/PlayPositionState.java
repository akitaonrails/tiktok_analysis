package com.ss.ugc.android.editor.track;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes6.dex */
public final class PlayPositionState {
    public final boolean isSeek;
    public final long position;
    public final boolean seekSyncTrackScroll;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayPositionState(position=");
        sbLIZ.append(this.position);
        sbLIZ.append(", isSeek=");
        sbLIZ.append(this.isSeek);
        sbLIZ.append(", seekSyncTrackScroll=");
        sbLIZ.append(this.seekSyncTrackScroll);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSeek() {
        return this.isSeek;
    }

    public PlayPositionState(long j, boolean z, boolean z2) {
        this.position = j;
        this.isSeek = z;
        this.seekSyncTrackScroll = z2;
    }
}
