package com.bytedance.android.livesdk.rank.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class RankTabInfo {
    public String LIZ = "";
    public int LIZIZ;

    @C09CT("list_lynx_type")
    public long listLynxType;

    @C09CT("rank_type")
    public int rankType;

    @C09CT("title_text")
    public Text title;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rank_type=");
        sb.append(this.rankType);
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        sb.replace(0, 2, "RankTabInfo{");
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Text text;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && RankTabInfo.class == obj.getClass()) {
            RankTabInfo rankTabInfo = (RankTabInfo) obj;
            Text text2 = this.title;
            if (text2 != null && (text = rankTabInfo.title) != null && (str = text2.key) != null && str.equals(text.key) && this.rankType == rankTabInfo.rankType && this.listLynxType == rankTabInfo.listLynxType && this.LIZ.equals(rankTabInfo.LIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
