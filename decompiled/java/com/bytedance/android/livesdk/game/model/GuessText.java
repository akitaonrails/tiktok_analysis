package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GuessText {

    @C09CT("display_text")
    public Text displayText;

    @C09CT("type")
    public long type;

    @C09CT("key")
    public String key = "";

    @C09CT("desc")
    public String desc = "";

    @C09CT("starling_params")
    public Map<String, String> starlingParams = new LinkedHashMap();
}
