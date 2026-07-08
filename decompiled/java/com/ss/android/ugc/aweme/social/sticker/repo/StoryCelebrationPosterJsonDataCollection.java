package com.ss.android.ugc.aweme.social.sticker.repo;

import X.C09CT;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class StoryCelebrationPosterJsonDataCollection implements Serializable {
    public static final int $stable = 8;

    @C09CT("json_for_1_cele")
    public final Map<String, StorySocialEventStickerData> jsons;

    public StoryCelebrationPosterJsonDataCollection() {
        this(null);
    }

    public final Map<String, StorySocialEventStickerData> getJsons() {
        return this.jsons;
    }

    public StoryCelebrationPosterJsonDataCollection(Map<String, StorySocialEventStickerData> map) {
        this.jsons = map;
    }
}
