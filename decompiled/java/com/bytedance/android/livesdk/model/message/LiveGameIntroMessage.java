package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class LiveGameIntroMessage extends AbstractC1136060ffY {
    public CharSequence LL;
    public String LLILLJJLI;
    public String LLILLL;

    @C09CT("content")
    public Text content;

    @C09CT("has_rank_info")
    public boolean hasRankInfo;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LiveGameIntroMessage() {
        this.type = C001A.LIVE_GAME_INTRO_MESSAGE;
    }
}
