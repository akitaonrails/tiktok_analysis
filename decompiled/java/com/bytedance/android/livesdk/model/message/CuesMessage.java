package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CuesMessage {

    @C09CT("items")
    public List<CueMessageItem> items = new ArrayList();

    @C09CT("top_text")
    public Text topText;
}
