package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CueMessageItem {

    @C09CT("item_text")
    public Text itemText;

    @C09CT("rich_params")
    public List<CueMessageRichParam> richParams = new ArrayList();
}
