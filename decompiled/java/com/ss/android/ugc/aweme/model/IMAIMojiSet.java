package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAIMojiSet {

    @C09CT("aimoji_set_meta")
    public final IMAIMojiSetMeta aiMojiSetMeta;

    @C09CT("aimoji_stickers")
    public final List<IMAIMojiSticker> aiMojiStickers;

    public IMAIMojiSet() {
        this(null, null);
    }

    public IMAIMojiSet(IMAIMojiSetMeta iMAIMojiSetMeta, List<IMAIMojiSticker> list) {
        this.aiMojiSetMeta = iMAIMojiSetMeta;
        this.aiMojiStickers = list;
    }
}
