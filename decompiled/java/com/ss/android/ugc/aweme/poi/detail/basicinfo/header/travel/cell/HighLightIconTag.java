package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell;

import X.C09CT;
import com.ss.android.ugc.aweme.poi.detail.container.model.DynamicIcon;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class HighLightIconTag implements Serializable {

    @C09CT("icon")
    public final DynamicIcon icon;

    @C09CT("tag_content")
    public final CharSequence tagContent;

    @C09CT("tag_id")
    public final String tagId;

    public int hashCode() {
        CharSequence charSequence = this.tagContent;
        if (charSequence != null) {
            return charSequence.hashCode();
        }
        return 0;
    }

    public HighLightIconTag(CharSequence charSequence, DynamicIcon dynamicIcon, String str) {
        this.tagContent = charSequence;
        this.icon = dynamicIcon;
        this.tagId = str;
    }
}
