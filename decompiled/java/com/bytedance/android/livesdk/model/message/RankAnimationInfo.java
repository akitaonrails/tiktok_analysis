package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RankAnimationInfo {
    public int backgroundColor;
    public String backgroundColorString;
    public String content;
    public Text contentText;
    public long duration;

    @C09CT("tile_content")
    public List<Text> tileContent = new ArrayList();
    public int type;

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getContent() {
        return this.content;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setContent(String str) {
        this.content = str;
    }
}
