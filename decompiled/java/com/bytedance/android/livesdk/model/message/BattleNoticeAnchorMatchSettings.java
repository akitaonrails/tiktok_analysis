package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleNoticeAnchorMatchSettings {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("updated_settings")
    public Map<Long, Long> updatedSettings = new LinkedHashMap();
}
