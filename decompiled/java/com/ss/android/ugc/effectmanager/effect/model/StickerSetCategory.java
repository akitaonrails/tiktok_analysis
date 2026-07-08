package com.ss.android.ugc.effectmanager.effect.model;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerSetCategory implements Serializable {
    public final String author_name;
    public final String id;
    public final String name;
    public final List<String> set_icon_url;
    public final int sticker_set_count;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerSetCategory)) {
            return false;
        }
        StickerSetCategory stickerSetCategory = (StickerSetCategory) obj;
        return Intrinsics.LJFF(this.id, stickerSetCategory.id) && Intrinsics.LJFF(this.name, stickerSetCategory.name) && this.sticker_set_count == stickerSetCategory.sticker_set_count && Intrinsics.LJFF(this.set_icon_url, stickerSetCategory.set_icon_url) && Intrinsics.LJFF(this.author_name, stickerSetCategory.author_name);
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.sticker_set_count) * 31) + this.set_icon_url.hashCode()) * 31) + this.author_name.hashCode();
    }

    public StickerSetCategory(String str, String str2, int i, List<String> list, String str3) {
        this.id = str;
        this.name = str2;
        this.sticker_set_count = i;
        this.set_icon_url = list;
        this.author_name = str3;
    }
}
