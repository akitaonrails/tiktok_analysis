package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro;

import X.C09JN;
import X.C0UO0;
import X.C1882380z5I;
import X.C1882760z5u;
import X.C1883340z6q;
import X.C1884750z97;
import X.C1884770z99;
import X.C1884800z9C;
import X.C1884810z9D;
import X.C19263510Xx;
import X.C2095008Iq;
import X.C480460Ism;
import X.InterfaceC0148002o;
import X.InterfaceC1881340z3c;
import X.InterfaceC1881720z4E;
import X.InterfaceC1884840z9G;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model.GameInfoCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameIntroViewModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.api.GameDetailPageApi;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseViewModel;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.game_station.GameDetailTranslateResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class GameIntroViewModel extends MixCardBaseViewModel<GameInfoCardModel, C1884770z99> {
    public final Class<GameInfoCardModel> LLILZ;
    public String LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1884770z99(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseViewModel
    public final void yQ2() {
        GameStationGameInfo gameStationGameInfo;
        setState(new C1884750z97(this));
        GameInfoCardModel gameInfoCardModel = (GameInfoCardModel) this.LLILLL;
        zQ2((gameInfoCardModel == null || (gameStationGameInfo = gameInfoCardModel.gameInfo) == null) ? false : gameStationGameInfo.showTranslate);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C1882760z5u eventCenter;
        super.onPrepared();
        InterfaceC1881340z3c interfaceC1881340z3cVQ2 = vQ2();
        if (interfaceC1881340z3cVQ2 == null || (eventCenter = interfaceC1881340z3cVQ2.getEventCenter()) == null) {
            return;
        }
        eventCenter.LIZJ("game_intro_translate_done", this);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseViewModel
    public final Class<GameInfoCardModel> wQ2() {
        return this.LLILZ;
    }

    public GameIntroViewModel(InterfaceC1884840z9G interfaceC1884840z9G) {
        super(interfaceC1884840z9G);
        this.LLILZ = GameInfoCardModel.class;
        this.LLILZIL = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zQ2(boolean z) {
        C1882760z5u eventCenter;
        C1882760z5u eventCenter2;
        boolean z2;
        Object objLIZLLL;
        long jLongValue;
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ;
        C1883340z6q c1883340z6qLJIILJJIL;
        InterfaceC1881720z4E interfaceC1881720z4E;
        GameStationGameInfo gameStationGameInfo;
        String str;
        String str2 = "";
        if (z) {
            if (this.LLILZIL.length() == 0) {
                String strLJFF = C1882380z5I.LJFF(C1882380z5I.LIZJ(vQ2()), "game_id");
                if (strLJFF.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str3 = CardStruct.IStatusCode.DEFAULT;
                if (z2) {
                    strLJFF = CardStruct.IStatusCode.DEFAULT;
                }
                String strLJFF2 = C1882380z5I.LJFF(C1882380z5I.LIZJ(vQ2()), "game_tag_id");
                if (strLJFF2.length() != 0) {
                    str3 = strLJFF2;
                }
                GameInfoCardModel gameInfoCardModel = (GameInfoCardModel) this.LLILLL;
                if (gameInfoCardModel != null && (gameStationGameInfo = gameInfoCardModel.gameInfo) != null && (str = gameStationGameInfo.introduction) != null) {
                    str2 = str;
                }
                String strLIZIZ = C19263510Xx.LIZIZ();
                InterfaceC1884840z9G interfaceC1884840z9G = this.LL;
                if (interfaceC1884840z9G == null || (interfaceC1881340z3cLIZJ = interfaceC1884840z9G.LIZJ()) == null || (c1883340z6qLJIILJJIL = interfaceC1881340z3cLIZJ.LJIILJJIL()) == null || (interfaceC1881720z4E = (InterfaceC1881720z4E) c1883340z6qLJIILJJIL.LIZ(InterfaceC1881720z4E.class)) == null || (objLIZLLL = interfaceC1881720z4E.LJIIIIZZ(GameDetailPageApi.class)) == null) {
                    C480460Ism.LIZ().getClass();
                    objLIZLLL = C480460Ism.LIZLLL(GameDetailPageApi.class);
                }
                GameDetailPageApi gameDetailPageApi = (GameDetailPageApi) objLIZLLL;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF);
                long jLongValue2 = 0;
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str3);
                if (lLJIILIIL2 != null) {
                    jLongValue2 = lLJIILIIL2.longValue();
                }
                gameDetailPageApi.requestGameDetailTranslate(jLongValue, jLongValue2, str2, strLIZIZ).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.0z96
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        String str4;
                        C1882760z5u eventCenter3;
                        GameDetailTranslateResponse.ResponseData responseData;
                        C1C7U.LIZ("GameIntroViewModel@1aba.requestTranslateGameDetail$1");
                        BaseResponse baseResponse = (BaseResponse) obj;
                        GameIntroViewModel gameIntroViewModel = this.LL;
                        if (baseResponse == null || (responseData = (GameDetailTranslateResponse.ResponseData) baseResponse.data) == null || (str4 = responseData.translationText) == null) {
                            str4 = "";
                        }
                        gameIntroViewModel.LLILZIL = str4;
                        Pair pair = new Pair(Boolean.TRUE, str4);
                        InterfaceC1881340z3c interfaceC1881340z3cVQ2 = gameIntroViewModel.vQ2();
                        if (interfaceC1881340z3cVQ2 != null && (eventCenter3 = interfaceC1881340z3cVQ2.getEventCenter()) != null) {
                            eventCenter3.LIZIZ(pair, "game_intro_translate_done");
                        }
                        C1C7U.LIZIZ("GameIntroViewModel@1aba.requestTranslateGameDetail$1");
                    }
                }, new C09JN() { // from class: X.00M2
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("GameIntroViewModel@1aba.requestTranslateGameDetail$2");
                        C1C7U.LIZIZ("GameIntroViewModel@1aba.requestTranslateGameDetail$2");
                    }
                });
                return;
            }
            Pair pair = new Pair(Boolean.TRUE, this.LLILZIL);
            InterfaceC1881340z3c interfaceC1881340z3cVQ2 = vQ2();
            if (interfaceC1881340z3cVQ2 != null && (eventCenter2 = interfaceC1881340z3cVQ2.getEventCenter()) != null) {
                eventCenter2.LIZIZ(pair, "game_intro_translate_done");
                return;
            }
            return;
        }
        Pair pair2 = new Pair(Boolean.FALSE, "");
        InterfaceC1881340z3c interfaceC1881340z3cVQ22 = vQ2();
        if (interfaceC1881340z3cVQ22 != null && (eventCenter = interfaceC1881340z3cVQ22.getEventCenter()) != null) {
            eventCenter.LIZIZ(pair2, "game_intro_translate_done");
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.MixCardBaseViewModel
    public final void xQ2(Object obj, String str) {
        Pair pair;
        String str2;
        if (Intrinsics.LJFF(str, "game_intro_translate_done") && (obj instanceof Pair) && (pair = (Pair) obj) != null) {
            if (Intrinsics.LJFF(pair.getFirst(), Boolean.TRUE)) {
                Object second = pair.getSecond();
                if (!(second instanceof String) || (str2 = (String) second) == null) {
                    str2 = "";
                }
                this.LLILZIL = str2;
                setState(new C1884800z9C());
                return;
            }
            setState(new C1884810z9D());
        }
    }
}
