package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;

/* JADX INFO: loaded from: classes.dex */
public final class UseCriticalStrikeCard {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("card_info")
    public CriticalStrikeCardInfo cardInfo;

    @C09CT("display_content")
    public Text displayContent;
}
