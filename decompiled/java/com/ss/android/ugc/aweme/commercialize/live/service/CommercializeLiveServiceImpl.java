package com.ss.android.ugc.aweme.commercialize.live.service;

import X.AbstractC464380IIy;
import X.AbstractC692590REr;
import X.C0IXW;
import X.C0N09;
import X.C0PEM;
import X.C0X9S;
import X.C1001600cAg;
import X.C1017070cZd;
import X.C1019100ccu;
import X.C1020710cfV;
import X.C1022290ci3;
import X.C1022820ciu;
import X.C13SS;
import X.C1440005kM;
import X.C1AF0;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2184171Adz;
import X.C2296808zG;
import X.C23250099c;
import X.C756350Tlh;
import X.C756590Tm5;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC464390IIz;
import X.EnumC757380TnM;
import X.InterfaceC1016620cYu;
import X.InterfaceC20673515v3;
import X.InterfaceC990070bs5;
import X.InterfaceC999040c6Y;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.live.api.LiveAdCardApi;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.aweme.commercialize.live.feedLive.FeedLiveAdLynxCard;
import com.ss.android.ugc.aweme.commercialize.live.leadgen.BALeadsGenEvent;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.model.AdReportInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CommercializeLiveServiceImpl implements ICommercializeLiveService {
    public static int LJIJJ(int i) {
        if (i == 1) {
            return 5;
        }
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i == 3) {
                return 7;
            }
            if (i == 8) {
                return 6;
            }
            if (i == 14) {
                return 9;
            }
            if (i == 92) {
                return 13;
            }
            if (i == 11) {
                return 8;
            }
            if (i == 12) {
                return 10;
            }
            if (i == 42) {
                return 11;
            }
            if (i == 43) {
                return 1;
            }
            switch (i) {
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    break;
                case 51:
                    return 4;
                case 52:
                    return 1;
                default:
                    return 0;
            }
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LIZIZ() {
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("enable_report_dislike_live", false);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return zLIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC1016620cYu LJI() {
        return new InterfaceC1016620cYu() { // from class: X.0cMs
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(14));
            public Context LIZIZ;
            public Aweme LIZJ;
            public String LIZLLL;
            public C1009150cMr LJ;

            public final InterfaceC1008930cMV LIZ() {
                String str;
                IFeedService iFeedService;
                InterfaceC1008930cMV interfaceC1008930cMVLIZJ;
                Aweme aweme = this.LIZJ;
                if (aweme == null || (str = this.LIZLLL) == null || !AwemeExtKt.isAdTraffic(aweme)) {
                    return null;
                }
                if ((!C0PPH.LIZ(aweme, C0RQ7.ANOLE_LIVE_PREVIEW_ABOVE_SPONSOR.getSlotName()) && !C0PPH.LIZ(aweme, C0RQ7.ANOLE_LIVE_PREVIEW_ABOVE_INTERACTIVE.getSlotName())) || (iFeedService = (IFeedService) this.LIZ.getValue()) == null || (interfaceC1008930cMVLIZJ = iFeedService.LIZJ(this.LIZIZ, aweme, str, true)) == null) {
                    return null;
                }
                interfaceC1008930cMVLIZJ.LJIIL(this.LJ);
                return interfaceC1008930cMVLIZJ;
            }

            @Override // X.InterfaceC1016620cYu
            public final void LJJIII() {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ != null) {
                    interfaceC1008930cMVLIZ.LJJIII();
                }
            }

            @Override // X.InterfaceC1016620cYu
            public final void LJJIIJ() {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ != null) {
                    interfaceC1008930cMVLIZ.LJJIIJ();
                }
                InterfaceC1008930cMV interfaceC1008930cMVLIZ2 = LIZ();
                if (interfaceC1008930cMVLIZ2 != null) {
                    interfaceC1008930cMVLIZ2.LJIIL(null);
                }
                this.LIZIZ = null;
                this.LIZLLL = null;
                this.LIZJ = null;
            }

            @Override // X.InterfaceC1016620cYu
            public final void LJJIIJZLJL() {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ != null) {
                    interfaceC1008930cMVLIZ.LJIILL(new C692050RCp(false));
                }
            }

            @Override // X.InterfaceC1016620cYu
            public final void LJJIIZ() {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ != null) {
                    interfaceC1008930cMVLIZ.LJIILL(new C692050RCp(true));
                }
            }

            @Override // X.InterfaceC1016620cYu
            public final void lt() {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ != null) {
                    interfaceC1008930cMVLIZ.LJJII(C995850c1P.LIZ);
                }
            }

            @Override // X.InterfaceC1016620cYu
            public final void onUnbind() {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ == null) {
                    this.LIZIZ = null;
                    this.LIZLLL = null;
                    this.LIZJ = null;
                } else {
                    interfaceC1008930cMVLIZ.LIZ();
                    interfaceC1008930cMVLIZ.LJIIL(null);
                    this.LIZIZ = null;
                    this.LIZLLL = null;
                    this.LIZJ = null;
                }
            }

            @Override // X.InterfaceC1016620cYu
            public final void LJJIJIIJIL(int i) {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ == null) {
                    return;
                }
                IFeedService iFeedService = (IFeedService) this.LIZ.getValue();
                if (iFeedService != null) {
                    iFeedService.LJIIIIZZ(this.LIZIZ, this.LIZJ, this.LIZLLL);
                }
                interfaceC1008930cMVLIZ.LJJIJIIJIL(i);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0cMr] */
            @Override // X.InterfaceC1016620cYu
            public final void mt(InterfaceC1009200cMw interfaceC1009200cMw) {
                this.LJ = new InterfaceC1009570cNX(interfaceC1009200cMw) { // from class: X.0cMr
                    public final InterfaceC1009200cMw LIZ;

                    @Override // X.InterfaceC1009570cNX
                    public final boolean LJJJIL() {
                        return this.LIZ.LJJJIL();
                    }

                    {
                        this.LIZ = interfaceC1009200cMw;
                    }

                    @Override // X.InterfaceC1009570cNX
                    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
                        View contentView;
                        if (abstractC991850bux instanceof C989600brK) {
                            String interactName = EnumC1009140cMq.ANOLE_LIVE_PREVIEW_INTERACTIVES.getInteractName();
                            C989600brK c989600brK = (C989600brK) abstractC991850bux;
                            for (AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel : c989600brK.LIZ.LIZ) {
                                List<String> list = anoleComponentBusinessAppearModel.businessComponents;
                                if (list != null && list.contains(interactName)) {
                                    AnoleComponentAnimationModel anoleComponentAnimationModel = anoleComponentBusinessAppearModel.animationModels;
                                    if (anoleComponentAnimationModel == null) {
                                        return;
                                    }
                                    this.LIZ.LLLLLL(anoleComponentAnimationModel, C1016660cYy.LIZ(anoleComponentAnimationModel.curve));
                                }
                            }
                            for (AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel2 : c989600brK.LIZ.LIZIZ) {
                                List<String> list2 = anoleComponentBusinessAppearModel2.businessComponents;
                                if (list2 != null && list2.contains(interactName)) {
                                    AnoleComponentAnimationModel anoleComponentAnimationModel2 = anoleComponentBusinessAppearModel2.animationModels;
                                    if (anoleComponentAnimationModel2 == null) {
                                        return;
                                    }
                                    Interpolator interpolatorLIZ = C1016660cYy.LIZ(anoleComponentAnimationModel2.curve);
                                    InterfaceC1009200cMw interfaceC1009200cMw2 = this.LIZ;
                                    if (interfaceC1007930cKt != null) {
                                        contentView = interfaceC1007930cKt.getContentView();
                                    } else {
                                        contentView = null;
                                    }
                                    interfaceC1009200cMw2.F(anoleComponentAnimationModel2, interpolatorLIZ, contentView);
                                }
                            }
                            return;
                        }
                        if (abstractC991850bux instanceof C1005320cGg) {
                            C1005320cGg c1005320cGg = (C1005320cGg) abstractC991850bux;
                            if (c1005320cGg.LIZ == 1) {
                                C1022030chd.LIZLLL = c1005320cGg.LJFF;
                                C1022030chd.LIZJ = c1005320cGg.LJ;
                                C1022030chd.LJ = c1005320cGg.LJII;
                                this.LIZ.H(Integer.valueOf(c1005320cGg.LIZLLL));
                            }
                        }
                    }
                };
            }

            @Override // X.InterfaceC1016620cYu
            public final void nt(View view) {
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = LIZ();
                if (interfaceC1008930cMVLIZ == null) {
                    this.LIZIZ = null;
                    this.LIZLLL = null;
                    this.LIZJ = null;
                } else if (view != null) {
                    interfaceC1008930cMVLIZ.LJ(view);
                }
            }

            @Override // X.InterfaceC1016620cYu
            public final void LJJIJIL(Context context, Aweme aweme, String str) {
                this.LIZIZ = context;
                this.LIZJ = aweme;
                this.LIZLLL = str;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIJ() {
        LJJ(10000L, "live_duration_10s");
        LJJ(30000L, "live_duration_30s");
        LJJ(60000L, "live_duration_60s");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC999040c6Y LJIIL() {
        return new AbstractC692590REr() { // from class: X.0RQF
            @Override // X.AbstractC692590REr
            public final String LIZJ() {
                return C0RQ7.ANOLE_LIVE_PREVIEW_ABOVE_SPONSOR.getSlotName();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC999040c6Y LJIILL() {
        return new AbstractC692590REr() { // from class: X.0RQE
            @Override // X.AbstractC692590REr
            public final String LIZJ() {
                return C0RQ7.ANOLE_LIVE_PREVIEW_ABOVE_INTERACTIVE.getSlotName();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZ(JSONObject jSONObject) {
        try {
            C1440005kM.LIZ(new BALeadsGenEvent(JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject, "data"), "action_type")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if ((awemeRawAd2 != null && awemeRawAd2.getComponentType() == 3) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getComponentType() == 4)) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1001600cAg(aweme, this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final InterfaceC990070bs5 LIZLLL(FrameLayout frameLayout) {
        return new FeedLiveAdLynxCard(frameLayout);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final boolean LJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            int componentType = awemeRawAd.getComponentType();
            if (componentType == 1 || componentType == 2 || componentType == 6) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILIIL(JSONObject jSONObject) {
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "eventName");
            if (Intrinsics.LJFF(string, EnumC757380TnM.LIVE_LINK_PIN.getValue())) {
                C1440005kM.LIZ(new C756350Tlh((BusinessLinksLiveLinkPin) new Gson().LJII(C786410Ut5.J3(jSONObject2), BusinessLinksLiveLinkPin.class), null));
            } else if (Intrinsics.LJFF(string, EnumC757380TnM.LIVE_LINK_CARD.getValue())) {
                C1440005kM.LIZ(new C756350Tlh(null, (BusinessLinksLiveLinkCard) new Gson().LJII(C786410Ut5.J3(jSONObject2), BusinessLinksLiveLinkCard.class)));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("Broadcast JSB", "Gson parse error", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIILLIIL(JSONObject jSONObject) {
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
        try {
            C1440005kM.LIZ(new C0N09(jSONObject2.optInt("action"), jSONObject2.optInt("pinPeriod"), jSONObject2.optString("liveCardTitle"), jSONObject2.optString("liveCardIntro")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJIIZILJ(Aweme aweme) {
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return null;
        }
        return LJIL(aweme, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String Rj(String str) {
        return C756590Tm5.LIZ(str);
    }

    public static String LJIL(Aweme aweme, boolean z) {
        if (AwemeSaaSExtKt.isLive(aweme)) {
            return "full_screen_feed_live";
        }
        if (C1017070cZd.LLJI(aweme)) {
            return "top_live";
        }
        if ((aweme.getAuthor() == null || !aweme.getAuthor().isLive()) && !z) {
            return null;
        }
        return "feed_live";
    }

    public static void LJJ(final long j, final String str) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJIJIL(EnumC464390IIz.AUDIENCE_LIVE_PLAY_DURATION, new AbstractC464380IIy(j) { // from class: X.0J7h
            @Override // X.AbstractC464380IIy
            public final void LIZ(Map<String, Object> map) {
                EnterRoomConfig enterRoomConfig;
                EnterRoomConfig.RoomsData roomsData;
                AdLiveEnterRoomConfig adLiveEnterRoomConfig;
                Object obj = null;
                if (map != null) {
                    obj = map.get("audience_live_play_enter_room_config");
                }
                if ((obj instanceof EnterRoomConfig) && (enterRoomConfig = (EnterRoomConfig) obj) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (adLiveEnterRoomConfig = roomsData.adLiveEnterRoomConfig) != null) {
                    if (roomsData.enterFromAd || Intrinsics.LJFF(adLiveEnterRoomConfig.isPseudoAd, "1")) {
                        String str2 = str;
                        String str3 = adLiveEnterRoomConfig.creativeId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("live_ad", str2, str3, adLiveEnterRoomConfig.logExtra, adLiveEnterRoomConfig.groupId);
                        c1022820ciuLJ.LIZIZ(map.get("audience_live_play_room_id"), "room_id");
                        c1022820ciuLJ.LIZ(adLiveEnterRoomConfig.LIZ());
                        c1022820ciuLJ.LJII();
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final String LJII(Aweme aweme, boolean z) {
        if (aweme == null) {
            return null;
        }
        if (!AwemeExtKt.isAdTraffic(aweme) && !AwemeExtKt.isPseudoAd(aweme)) {
            return null;
        }
        return LJIL(aweme, z);
    }

    public final void LJIJJLI(int i, Aweme aweme) {
        if (Intrinsics.LJFF(LJII(aweme, false), "full_screen_feed_live") && i == 3) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("homepage_ad", "click", aweme.getAwemeRawAd());
            C1022820ciu c1022820ciuLJJIJIL = C1017070cZd.LJJIJIL(aweme, "homepage_ad", "click");
            if (c1022820ciuLJJIJIL != null) {
                c1022820ciuLIZLLL = c1022820ciuLJJIJIL;
            }
            c1022820ciuLIZLLL.LIZJ("photo", "refer");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LIZLLL(aweme), "anchor_id");
            c1022820ciuLIZLLL.LIZIZ(C1019100ccu.LJ(aweme), "room_id");
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIJ(String str, String str2, Map map) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && interfaceC20673515v3K4.LJLIL() != null) {
            C0IXW.LIZ(str, str2, map, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIJI(Context context, Aweme aweme, User user) {
        String strLJII = LJII(aweme, false);
        if (strLJII == null) {
            return;
        }
        if (Intrinsics.LJFF(strLJII, "full_screen_feed_live")) {
            LJIJJLI(LJIJJ(2), aweme);
            return;
        }
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService == null || iAdSceneService.LIZIZ() == null) {
            return;
        }
        C1022290ci3.LJ(context, aweme, 2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final AdLiveEnterRoomConfig LJFF(Aweme aweme, AwemeRawAd awemeRawAd, int i, String str) {
        String string;
        String string2;
        AdDislikeInfo dislikeInfo;
        String strValueOf = String.valueOf(awemeRawAd.getLiveAdType());
        String creativeIdStr = awemeRawAd.getCreativeIdStr();
        String creativeIdStr2 = awemeRawAd.getCreativeIdStr();
        String logExtra = awemeRawAd.getLogExtra();
        Long groupId = awemeRawAd.getGroupId();
        AdReportInfo reportInfo = null;
        if (groupId != null) {
            string = groupId.toString();
        } else {
            string = null;
        }
        String aid = aweme.getAid();
        Long adId = awemeRawAd.getAdId();
        if (adId != null) {
            string2 = adId.toString();
        } else {
            string2 = null;
        }
        String advId = awemeRawAd.getAdvId();
        String strLJ = C1019100ccu.LJ(aweme);
        String strLIZLLL = C1019100ccu.LIZLLL(aweme);
        Gson gson = C7740030o.LIZ().getGson();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            dislikeInfo = awemeRawAd2.getDislikeInfo();
        } else {
            dislikeInfo = null;
        }
        String json = GsonProtectorUtils.toJson(gson, dislikeInfo);
        String onsiteClickId = awemeRawAd.getOnsiteClickId();
        Gson gson2 = C7740030o.LIZ().getGson();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            reportInfo = awemeRawAd3.getReportInfo();
        }
        return new AdLiveEnterRoomConfig(strValueOf, creativeIdStr, creativeIdStr2, logExtra, string, i, aid, string2, advId, strLJ, strLIZLLL, json, CardStruct.IStatusCode.DEFAULT, str, onsiteClickId, GsonProtectorUtils.toJson(gson2, reportInfo), Boolean.valueOf(C1017070cZd.LLIFFJFJJ(aweme)));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final void LJIIIIZZ(Integer num, Long l, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("timing", str);
        jSONObject.putOpt("live_type", str2);
        if (num != null) {
            num.intValue();
            jSONObject.putOpt("click_from", num);
        }
        if (l != null) {
            l.longValue();
            jSONObject.putOpt("creative_id", l);
        }
        C20684815ws.LJIJ("ad_live_timing", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme r30, com.bytedance.android.livesdkapi.session.EnterRoomConfig r31, int r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl.LJIILJJIL(com.ss.android.ugc.aweme.feed.model.Aweme, com.bytedance.android.livesdkapi.session.EnterRoomConfig, int, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0110  */
    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(android.content.Context r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, int r14, com.ss.android.ugc.aweme.profile.model.User r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl.LJIIIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, int, com.ss.android.ugc.aweme.profile.model.User, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService
    public final C0X9S LJIIJJI(int i, String str, String str2, long j, String str3, String str4) {
        LiveAdCardApi.LIZ.getClass();
        return ((LiveAdCardApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1020710cfV.LIZIZ).build().retrofit.LIZ(LiveAdCardApi.class)).getLiveAdCardInfo(str, str2, str3, i, j, str4);
    }
}
