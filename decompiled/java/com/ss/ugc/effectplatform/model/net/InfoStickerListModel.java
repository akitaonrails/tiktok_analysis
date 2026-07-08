package com.ss.ugc.effectplatform.model.net;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class InfoStickerListModel implements Serializable {
    public Integer cursor;
    public String extra;
    public Boolean has_more;
    public List<InfoStickerEffect> sticker_list;
    public String subtitle;

    public InfoStickerListModel() {
        this(null, null, null, null, null);
    }

    public final void setCursor(Integer num) {
        this.cursor = num;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setHas_more(Boolean bool) {
        this.has_more = bool;
    }

    public final void setSticker_list(List<InfoStickerEffect> list) {
        this.sticker_list = list;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public InfoStickerListModel(String str, Integer num, Boolean bool, List<InfoStickerEffect> list, String str2) {
        this.subtitle = str;
        this.cursor = num;
        this.has_more = bool;
        this.sticker_list = list;
        this.extra = str2;
    }
}
