package com.ss.android.ugc.aweme.offlinemode.service;

import X.AbstractC1549150qPp;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C05C5;
import X.C0C64;
import X.C0CCZ;
import X.C0NIX;
import X.C0NIZ;
import X.C0ON5;
import X.C0PEM;
import X.C0TRR;
import X.C0VSJ;
import X.C0XF5;
import X.C0XQ7;
import X.C10IH;
import X.C1322605Fo;
import X.C1349505Px;
import X.C1390005cI;
import X.C1396060mQu;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C19319410i8;
import X.C2112608Pk;
import X.C2188811AlT;
import X.C2188841AlW;
import X.C23250099c;
import X.C261700ANk;
import X.C261730ANn;
import X.C261740ANo;
import X.C279660Axg;
import X.C297220Bku;
import X.C297230Bkv;
import X.C297260Bky;
import X.C589160N8w;
import X.C589170N8x;
import X.C608010Nt1;
import X.C608070Nt7;
import X.C610460Nwy;
import X.C624940OfE;
import X.C625130OfX;
import X.C625140OfY;
import X.C625420Og0;
import X.C625430Og1;
import X.C625460Og4;
import X.C625470Og5;
import X.C625530OgB;
import X.C625780Oga;
import X.C625820Oge;
import X.C626010Ogx;
import X.C844470XAv;
import X.EnumC616320OFi;
import X.EnumC624770Oex;
import X.EnumC625440Og2;
import X.InterfaceC1364105Vn;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import com.ss.android.ugc.aweme.offlinemode.OfflineModeTask;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import com.ss.android.ugc.aweme.offlinemode.experiment.OfflineLynxCardConfig;
import com.ss.android.ugc.aweme.offlinemode.router.OfflineModeRouterInterceptor;
import com.ss.android.ugc.aweme.offlinemode.ui.banner.OfflineModeFypBottomBannerProtocol;
import com.ss.android.ugc.aweme.offlinemode.ui.pagestate.OfflineModeDetailPageStateImp;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeFypPopupComponent;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeReachBottomGuideTrigger;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetComponent;
import com.ss.android.ugc.aweme.offlinepush.api.IOfflinePushService;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeServiceImpl implements IOfflineModeService {
    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final C13IQ<? extends AbstractC738140SxQ> LJIIZILJ() {
        return C13LE.LIZ(OfflineModeFypPopupComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final C13IQ<? extends AbstractC738140SxQ> LJIJJLI() {
        return C13LE.LIZ(OfflineModeSheetComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final int LJJII() {
        return 2131838572;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final C13IQ<? extends UIContentAssem> LJJIIJ() {
        return C13LE.LIZ(OfflineModeDetailPageStateImp.class);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJIL() {
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJI() {
        C625470Og5.LL.f(false);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final C13IQ<? extends AbstractC738140SxQ> LJJJLIIL() {
        return C13LE.LIZ(OfflineModeSwitchComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final String getSceneId() {
        return "scene_home_page_offline_mode";
    }

    public static IOfflineModeService LIZJ() {
        Object objLIZ = C04TD.LIZ(IOfflineModeService.class, false);
        if (objLIZ != null) {
            return (IOfflineModeService) objLIZ;
        }
        if (C04TD.S2 == null) {
            synchronized (IOfflineModeService.class) {
                if (C04TD.S2 == null) {
                    C04TD.S2 = new OfflineModeServiceImpl();
                }
            }
        }
        return C04TD.S2;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final int LJIL() {
        return C625470Og5.LL.LLIIJI().getValue();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final long LJJI() {
        C625460Og4.LIZ.getClass();
        return C2112608Pk.LJI(new C0VSJ(C625460Og4.LJI()));
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJIII() {
        C625470Og5.LL.getClass();
        return C625420Og0.LJIIIIZZ().getBoolean("if_default", false);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJIJ() {
        C625470Og5.LL.LJLLI(1, "reach_bottom");
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final String LJJIJIIJI() {
        C625460Og4.LIZ.getClass();
        return C625460Og4.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJJIJL() {
        if (((Boolean) C279660Axg.LIZ.getValue()).booleanValue()) {
            return new C0TRR() { // from class: X.0OhE
                public static final C01GW<AbstractC1604130rqV> LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(389));

                @Override // X.C0TRR
                public final int LIZ() {
                    throw null;
                }

                @Override // X.C0TRR
                public final int LIZIZ() {
                    return 0;
                }

                @Override // X.C0TRR
                public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                    CardInsertResultInfo cardInsertResultInfo;
                    CardShowInfo cardShowInfo;
                    int iLJFF;
                    C443120HZe c443120HZe;
                    CardShowInfo next;
                    CardInsertResultInfo next2;
                    if (list != null) {
                        Iterator<CardInsertResultInfo> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (next2.cardType == 98) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        cardInsertResultInfo = next2;
                        if (cardInsertResultInfo != null && cardInsertResultInfo.cardInsertStatus == 20000) {
                            LIZJ.getValue().LJIIIZ("offline mode guide card has been inserted");
                            return null;
                        }
                    } else {
                        cardInsertResultInfo = null;
                    }
                    List<CardShowInfo> list2 = feedCardInsertData.showInfoList;
                    if (list2 != null) {
                        Iterator<CardShowInfo> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (next.cardType == 98) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        cardShowInfo = next;
                    } else {
                        cardShowInfo = null;
                    }
                    C20550115b9 c20550115b9 = C20550115b9.LIZ;
                    Integer numValueOf = Integer.valueOf(feedCardInsertData.LIZ);
                    c20550115b9.getClass();
                    EnumC20550015b8 enumC20550015b8LJIIL = C20550115b9.LJIIL(c0trr, 98, numValueOf, cardShowInfo, cardInsertResultInfo);
                    if (enumC20550015b8LJIIL != EnumC20550015b8.STATE_FREQ_SUCCESS) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("freqState ");
                        sbLIZ.append(enumC20550015b8LJIIL);
                        sbLIZ.append(", requestCount: ");
                        sbLIZ.append(Integer.valueOf(feedCardInsertData.LIZ));
                        C2188811AlT.LIZIZ(sbLIZ);
                        return null;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = C625720OgU.LIZIZ().getLong("last_trigger_push_time", 0L);
                    if ((j == 0 || jCurrentTimeMillis - j >= 86400000) && C625720OgU.LIZIZ().getLong("last_shown_feed_card_timestamp", 0L) == 0 && C1EE1.LIZIZ.LJJIJIL()) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long jLJI = C625420Og0.LJI();
                        if (jLJI != 0) {
                            long jAbs = Math.abs(jCurrentTimeMillis2 - jLJI) / ((long) 86400000);
                            C626190OhF.LIZ.getClass();
                            if (jAbs <= ((OfflineLynxCardConfig) C626190OhF.LIZJ.getValue()).clearCacheDay) {
                                return null;
                            }
                        }
                        if (((Boolean) C279660Axg.LIZ.getValue()).booleanValue() && ((Boolean) C0BMD.LIZ.getValue()).booleanValue() && C625950Ogr.LIZ != null) {
                            C626190OhF.LIZ.getClass();
                            OfflineLynxCardConfig offlineLynxCardConfig = (OfflineLynxCardConfig) C626190OhF.LIZJ.getValue();
                            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) 86400000));
                            if (iCurrentTimeMillis <= 0) {
                                iLJFF = 0;
                            } else {
                                iLJFF = C09RB.LJFF(C09RB.LJIIIZ(C09RB.LJIJI(new C1939607ik(C625950Ogr.LIZ()), AFwS229S0000000_2.get$arr$(630)), new C020C(iCurrentTimeMillis - 90, iCurrentTimeMillis, 4)));
                            }
                            if (iLJFF >= offlineLynxCardConfig.minRequestDay) {
                                if (iCurrentTimeMillis <= 0) {
                                    c443120HZe = new C443120HZe(0, 0, 0);
                                } else {
                                    Iterator it4 = C09RB.LJJII(C09RB.LJJI(new C1133920fc6(C09RB.LJIIIZ(C09RB.LJIJI(new C1939607ik(C625950Ogr.LIZ()), AFwS229S0000000_2.get$arr$(629)), new C020C(iCurrentTimeMillis - 90, iCurrentTimeMillis, 3)), C20085613iQ.LJ()), 30)).iterator();
                                    int i = 0;
                                    int i2 = 0;
                                    int i3 = 0;
                                    while (it4.hasNext()) {
                                        int iIntValue = ((Number) it4.next()).intValue();
                                        i += C625720OgU.LIZIZ().getInt(C625950Ogr.LIZIZ(iIntValue, "day_low_net_request_count_"), 0);
                                        i2 += C625720OgU.LIZIZ().getInt(C625950Ogr.LIZIZ(iIntValue, "day_low_net_low_net_request_count_"), 0);
                                        i3 += C625720OgU.LIZIZ().getInt(C625950Ogr.LIZIZ(iIntValue, "day_low_net_wifi_request_count_"), 0);
                                    }
                                    c443120HZe = new C443120HZe(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                                }
                                int iIntValue2 = ((Number) c443120HZe.getFirst()).intValue();
                                int iIntValue3 = ((Number) c443120HZe.getSecond()).intValue();
                                int iIntValue4 = ((Number) c443120HZe.getThird()).intValue();
                                if (iIntValue2 > 0) {
                                    float f = iIntValue4;
                                    float f2 = iIntValue2;
                                    float f3 = f / f2;
                                    float f4 = iIntValue3 / f2;
                                    float f5 = 1;
                                    float f6 = f5 - f3;
                                    float f7 = f5 - f4;
                                    if (f3 >= offlineLynxCardConfig.wifiRatio && f4 >= offlineLynxCardConfig.lowNetRatio && f6 >= offlineLynxCardConfig.nonWifiRatio && f7 >= offlineLynxCardConfig.nonLowNetRatio) {
                                        LIZJ.getValue().LJIIIZ("try request insert offline mode guide card");
                                        C607310Nrt.LJ = true;
                                        return Collections.singletonList(new CardTypeRequest(98, "", ""));
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJL() {
        C625470Og5.LL.getClass();
        C23250099c.LIZLLL(C625470Og5.LLIZLLLIL, null, null, new C1390005cI(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJJJJLL() {
        return new OfflineModeRouterInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJZ() {
        C608070Nt7.LIZ.getClass();
        if (C608070Nt7.LIZJ.compareAndSet(false, true)) {
            C608070Nt7.LIZIZ.LJIIJJI(AFwS195S0000000_9.get$arr$(422));
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final int getSettingsValue() {
        boolean z = C625820Oge.LIZ;
        return ((Number) C625820Oge.LIZJ.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final C0CCZ LIZIZ() {
        if (C625820Oge.LIZ()) {
            return new OfflineModeTask();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final int LJIILIIL() {
        return C625420Og0.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJIILJJIL() {
        if (!C297230Bkv.LIZ()) {
            return false;
        }
        C625470Og5.LL.getClass();
        return C625470Og5.E0();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final int LJJIIZ() {
        return C626010Ogx.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJJIIZI() {
        if (C297220Bku.LIZ()) {
            return new OfflineModeFypBottomBannerProtocol(0);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJIJIL() {
        return C625420Og0.LJFF() == EnumC624770Oex.UNINITIALIZED;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJIZ() {
        return C625820Oge.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJJ() {
        return C297220Bku.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJJI() {
        if ((C297260Bky.LIZ() & 8) != 8 || !C297260Bky.LIZIZ()) {
            return false;
        }
        C610460Nwy.LIZ.getClass();
        return C610460Nwy.LJ;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJ() {
        C625420Og0.LJIIIIZZ().LIZLLL("if_default", false);
        C625470Og5 c625470Og5 = C625470Og5.LL;
        c625470Og5.getClass();
        C625470Og5.LLILZ.LJIIIZ("deleteOfflineMode");
        C625470Og5.LLJ.LIZIZ(null);
        EnumC625440Og2 enumC625440Og2 = EnumC625440Og2.SETTING_PAGE_CLEAR;
        c625470Og5.LJLLI(2, enumC625440Og2.getValue());
        MLDataCenterService.Companion.getClass();
        IMLDataCenterService iMLDataCenterService = C1349505Px.LIZ;
        C625530OgB.LIZ.getClass();
        iMLDataCenterService.removeAwemeContentListForScore(C625530OgB.LIZ());
        C625460Og4.LIZ.getClass();
        C19319410i8 c19319410i8 = C625460Og4.LIZLLL;
        c19319410i8.LJIIIZ("In clearAllCache");
        if (C625820Oge.LIZ()) {
            c19319410i8.LJIIIZ("hit offline mode experiment");
            C625420Og0.LJIILIIL(EnumC624770Oex.UNINITIALIZED);
            C625460Og4.LJIILLIIL(false);
            C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_clear", null, null, null, null, null, null, null, null, null, null, enumC625440Og2.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(C625420Og0.LJI()), null, -2050, 98303);
            C625460Og4.LJ();
        } else {
            c19319410i8.LJIIIZ("did not hit offline mode experiment");
            C625460Og4.LJ();
        }
        if (C625820Oge.LIZ()) {
            C625530OgB.LIZLLL().LJJIIJ();
        } else {
            OfflineModeFeedPBDataBase.LL.getValue().close();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ().deleteDatabase("offline_mode_feed_pb");
        }
        C589160N8w c589160N8wLIZ = C589170N8x.LIZ("feed", "offlinemode");
        if (c589160N8wLIZ != null) {
            if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()) && C2188841AlW.LIZJ.invoke().booleanValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear domain repo in mainThread, domain: ");
                sbLIZ.append(c589160N8wLIZ.LIZ("/"));
                sbLIZ.append("。please use it in child thread");
                throw new IllegalAccessError(C2188811AlT.LIZIZ(sbLIZ));
            }
            Keva keva = C2188841AlW.LIZIZ;
            for (String str : (keva != null ? keva : null).getAll().keySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('/');
                sbLIZ2.append(c589160N8wLIZ.LIZ("/"));
                sbLIZ2.append("/kv/keva/");
                C2188841AlW.LIZJ(C2188811AlT.LIZIZ(sbLIZ2).toLowerCase(Locale.ROOT));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c589160N8wLIZ.LIZ("/"));
            sbLIZ3.append("/kv/keva/");
            C2188841AlW.LIZJ(C2188811AlT.LIZIZ(sbLIZ3).toLowerCase(Locale.ROOT));
        }
        C01GW c01gw = C625420Og0.LIZ;
        ((Keva) C625420Og0.LIZIZ.getValue()).storeLong("key_last_clear_cache_timestamp", System.currentTimeMillis());
        IOfflinePushService iOfflinePushServiceLIZ = C625780Oga.LIZ();
        if (iOfflinePushServiceLIZ != null) {
            iOfflinePushServiceLIZ.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJJJJLI() {
        if (C297220Bku.LIZ()) {
            return C13LE.LIZ(OfflineModeReachBottomGuideTrigger.class);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Class<? extends AbstractC1549150qPp<?, ?>> LJIJI() {
        return C625140OfY.class;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final int LJJIJIIJIL() {
        return C624940OfE.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJIILL(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0NIX(null));
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJIILLIIL(Activity activity) {
        if (activity == null) {
            return;
        }
        C0ON5.LIZ.getClass();
        C0ON5.LIZJ(activity, 2131838555, null);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJIJ(Aweme aweme) {
        return C625430Og1.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJIJJ(InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        C625530OgB.LIZ.getClass();
        return C625530OgB.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJ(C608010Nt1 c608010Nt1) {
        C625470Og5.LL.getClass();
        C625470Og5.LLIZ.add(c608010Nt1);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final IOfflineModeSwitchAbility LJJIFFI(InterfaceC665370Q7z interfaceC665370Q7z) {
        if (!C625820Oge.LIZ()) {
            return null;
        }
        OfflineModeSwitchComponent.LLJLILLLLZIIL.getClass();
        return (IOfflineModeSwitchAbility) C1558520qew.LIZ(interfaceC665370Q7z, IOfflineModeSwitchAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJJIL(String str) {
        if (!((Boolean) C261740ANo.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return Intrinsics.LJFF(str, "offline_mode_page");
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJJ(C608010Nt1 c608010Nt1) {
        C625470Og5.LL.getClass();
        C625470Og5.LLIZ.remove(c608010Nt1);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJJJJJL(C10IH c10ih) {
        return C23250099c.LJI(c10ih, C0PEM.LIZJ, new C05C5(null));
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJZI(Activity activity) {
        if (activity == null) {
            return;
        }
        C0ON5.LIZ.getClass();
        C0ON5.LIZJ(activity, 2131838554, null);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final Object LJJIIJZLJL(int i, C1396060mQu c1396060mQu) {
        return C23250099c.LJI(c1396060mQu, C0PEM.LIZJ, new C1322605Fo(20, i, null));
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJJIJLIJ(Aweme aweme, String str) {
        if (aweme == null || !((Boolean) C261730ANn.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "offline_mode_page") && !C0NIZ.LIZIZ(aweme)) {
            return false;
        }
        return !C0XF5.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJJJJIZL(Context context, String str, String str2, boolean z, EnumC616320OFi enumC616320OFi) {
        if (C625820Oge.LIZ() && context != null) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "offline_mode_router_interceptor", true) == 1 && !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                return;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
            smartRouteBuildRoute.withParam("force_popup_offline_mode_sheet", z);
            smartRouteBuildRoute.withParam("offline_mode_sheet_style", enumC616320OFi.name());
            smartRouteBuildRoute.withParam("event_type", str2);
            smartRouteBuildRoute.withParam("enter_method", str);
            smartRouteBuildRoute.withParam("video_type", 50);
            smartRouteBuildRoute.withParam("video_from", "from_offline_mode");
            smartRouteBuildRoute.withParam("enter_from", "offline_mode_page");
            smartRouteBuildRoute.withParam("refer", "offline_mode_page");
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
            if (((Number) C261700ANk.LIZ.getValue()).intValue() == 1) {
                smartRouteBuildRoute.withParam("use_saf", 2);
            }
            smartRouteBuildRoute.open();
        }
    }
}
