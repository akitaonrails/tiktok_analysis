package com.ss.android.ugc.aweme.im.sticker.basic.provider;

import X.C01GW;
import X.C452501pT;
import X.C453610HqZ;
import X.InterfaceC1706706mH;
import X.InterfaceC439690HLz;
import X.InterfaceC443680HaY;
import X.InterfaceC443750Haf;
import X.InterfaceC447740Hh6;
import X.InterfaceC453630Hqb;
import X.InterfaceC453640Hqc;
import X.InterfaceC453710Hqj;
import X.InterfaceC454710HsL;
import X.InterfaceC456940Hvw;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class BasicIMStickerImpl implements IMStickerApi {
    public final /* synthetic */ C453610HqZ $$delegate_0 = C453610HqZ.LIZIZ;
    public final C01GW imStickerStoreService$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(101));
    public final C01GW imStickerAnalytics$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(98));
    public final C01GW imStickerMessageService$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(100));
    public final C01GW imStickerInputPanelService$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(99));

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC443750Haf getImAiSelfStickerService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC456940Hvw getImAvatarDuoService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LJII;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC439690HLz getImMixStudioService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LJIIIZ;
    }

    public InterfaceC453630Hqb getImPhotoCommentStickerService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC1706706mH getImPreshownStickerService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public IIMSocialAvatarService getImSocialAvatarService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC453640Hqc getImStickerAnalytics() {
        return (InterfaceC453640Hqc) this.imStickerAnalytics$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC453710Hqj getImStickerInputPanelService() {
        return (InterfaceC453710Hqj) this.imStickerInputPanelService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC454710HsL getImStickerMessageService() {
        return (InterfaceC454710HsL) this.imStickerMessageService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC447740Hh6 getImStickerStoreService() {
        return (InterfaceC447740Hh6) this.imStickerStoreService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi
    public InterfaceC443680HaY getImStreakStickerService() {
        this.$$delegate_0.getClass();
        return C453610HqZ.LJIIJJI;
    }
}
