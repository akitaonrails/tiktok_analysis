package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;

/* JADX INFO: loaded from: classes.dex */
public class HighlightFragmentReadyMessage extends AbstractC1136060ffY {

    @C09CT("live_fragment")
    public GameLiveFragment gameLiveFragment;

    public HighlightFragmentReadyMessage() {
        this.type = C001A.HIGHLIGHT_FRAGMENT_READY_MESSAGE;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightFragmentReadyMessage{gameLiveFragment=");
        sbLIZ.append(this.gameLiveFragment);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
