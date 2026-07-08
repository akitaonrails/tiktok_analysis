package com.ss.android.ugc.aweme.systembigemoji;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.emoji.common.systembigemoji.StickerResourceManager;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class com_ss_android_ugc_aweme_systembigemoji_IStickerResourceManager_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_systembigemoji_IStickerResourceManager_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_systembigemoji_IStickerResourceManager_SPI_AAB_DELEGATE();
    public static final C01GW StickerResourceManagerinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS209S0000000_21.get$arr$(333));

    private final StickerResourceManager getStickerResourceManagerinstance() {
        return (StickerResourceManager) StickerResourceManagerinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IStickerResourceManager> getServices() {
        ArrayList<IStickerResourceManager> arrayList = new ArrayList<>();
        arrayList.add(getStickerResourceManagerinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IStickerResourceManager getService() {
        return getStickerResourceManagerinstance();
    }
}
