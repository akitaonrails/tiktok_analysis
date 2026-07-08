package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PreshownStickerSceneConfig {

    @C09CT("display_stickers_count")
    public final Integer displayStickersCount;

    @C09CT("sender_copy_string")
    public final String headerText;

    @C09CT("preshown_sticker_items")
    public final List<PreshownStickerItem> preshownStickerItem;

    @C09CT("scene_id")
    public final String sceneId;

    @C09CT("should_randomize_stickers")
    public final Boolean shouldRandomizeStickers;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreshownStickerSceneConfig)) {
            return false;
        }
        PreshownStickerSceneConfig preshownStickerSceneConfig = (PreshownStickerSceneConfig) obj;
        return Intrinsics.LJFF(this.sceneId, preshownStickerSceneConfig.sceneId) && Intrinsics.LJFF(this.headerText, preshownStickerSceneConfig.headerText) && Intrinsics.LJFF(this.preshownStickerItem, preshownStickerSceneConfig.preshownStickerItem) && Intrinsics.LJFF(this.shouldRandomizeStickers, preshownStickerSceneConfig.shouldRandomizeStickers) && Intrinsics.LJFF(this.displayStickersCount, preshownStickerSceneConfig.displayStickersCount);
    }

    public final int hashCode() {
        String str = this.sceneId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headerText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PreshownStickerItem> list = this.preshownStickerItem;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.shouldRandomizeStickers;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.displayStickersCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public static PreshownStickerSceneConfig LIZ(PreshownStickerSceneConfig preshownStickerSceneConfig, String str, List list, int i) {
        String str2;
        Boolean bool;
        List list2 = list;
        String str3 = str;
        Integer num = null;
        if ((i & 1) != 0) {
            str2 = preshownStickerSceneConfig.sceneId;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = preshownStickerSceneConfig.headerText;
        }
        if ((i & 4) != 0) {
            list2 = preshownStickerSceneConfig.preshownStickerItem;
        }
        if ((i & 8) != 0) {
            bool = preshownStickerSceneConfig.shouldRandomizeStickers;
        } else {
            bool = null;
        }
        if ((i & 16) != 0) {
            num = preshownStickerSceneConfig.displayStickersCount;
        }
        preshownStickerSceneConfig.getClass();
        return new PreshownStickerSceneConfig(str2, str3, list2, bool, num);
    }

    public PreshownStickerSceneConfig(String str, String str2, List<PreshownStickerItem> list, Boolean bool, Integer num) {
        this.sceneId = str;
        this.headerText = str2;
        this.preshownStickerItem = list;
        this.shouldRandomizeStickers = bool;
        this.displayStickersCount = num;
    }
}
