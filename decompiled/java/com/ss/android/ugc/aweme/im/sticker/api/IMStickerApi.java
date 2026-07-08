package com.ss.android.ugc.aweme.im.sticker.api;

import X.C454640HsE;
import X.InterfaceC1706706mH;
import X.InterfaceC439690HLz;
import X.InterfaceC443680HaY;
import X.InterfaceC443750Haf;
import X.InterfaceC447740Hh6;
import X.InterfaceC453640Hqc;
import X.InterfaceC453710Hqj;
import X.InterfaceC454710HsL;
import X.InterfaceC456940Hvw;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;

/* JADX INFO: loaded from: classes7.dex */
public interface IMStickerApi {
    public static final C454640HsE LIZ = C454640HsE.LIZ;

    InterfaceC443750Haf getImAiSelfStickerService();

    InterfaceC456940Hvw getImAvatarDuoService();

    InterfaceC439690HLz getImMixStudioService();

    InterfaceC1706706mH getImPreshownStickerService();

    IIMSocialAvatarService getImSocialAvatarService();

    InterfaceC453640Hqc getImStickerAnalytics();

    InterfaceC453710Hqj getImStickerInputPanelService();

    InterfaceC454710HsL getImStickerMessageService();

    InterfaceC447740Hh6 getImStickerStoreService();

    InterfaceC443680HaY getImStreakStickerService();
}
