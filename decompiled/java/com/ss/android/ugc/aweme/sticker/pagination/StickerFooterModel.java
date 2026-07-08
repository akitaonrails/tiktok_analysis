package com.ss.android.ugc.aweme.sticker.pagination;

import X.EnumC1641470soj;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerFooterModel extends Effect {
    public static final int $stable = 8;
    public EnumC1641470soj status;
    public Integer textRes;

    public StickerFooterModel() {
        this(EnumC1641470soj.LOADING, null);
    }

    public final EnumC1641470soj getStatus() {
        return this.status;
    }

    public final Integer getTextRes() {
        return this.textRes;
    }

    public final void setStatus(EnumC1641470soj enumC1641470soj) {
        this.status = enumC1641470soj;
    }

    public final void setTextRes(Integer num) {
        this.textRes = num;
    }

    public StickerFooterModel(EnumC1641470soj enumC1641470soj, Integer num) {
        super(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        this.status = enumC1641470soj;
        this.textRes = num;
    }
}
