package com.ss.android.ugc.aweme.im.sticker.basic.provider;

import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.aweme.im.sticker.api.provider.IMStickerFallbackProvider;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class BasicIMStickerFallbackProvider implements IMStickerFallbackProvider {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(210));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(211));

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IMStickerFallbackProvider
    public final BasicStickerApiProviderService LIZ() {
        return (BasicStickerApiProviderService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.provider.IMStickerFallbackProvider
    public final BasicIMStickerImpl getStickerApi() {
        return (BasicIMStickerImpl) this.LIZ.getValue();
    }
}
