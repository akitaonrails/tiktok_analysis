package com.bytedance.android.livesdk.revenue.level.impl.superfan.ui;

import X.C01GW;
import X.C0KKP;
import X.C0KP3;
import X.C0KP5;
import X.C0KS8;
import X.C0KSH;
import X.C0KSK;
import X.C0KSU;
import X.C0KSW;
import X.C0KSX;
import X.C0KSY;
import X.C0KT0;
import X.C0KT2;
import X.C0KT5;
import X.C1161920gLG;
import X.C13LP;
import X.C1548820qPI;
import X.C262100zr;
import X.C452501pT;
import X.C495520Jby;
import X.C500260Jjc;
import X.C516700KOe;
import X.C517700KSa;
import X.C517840KSo;
import X.C517860KSq;
import X.C517910KSv;
import X.C766270U4b;
import X.InterfaceC1141530foN;
import X.InterfaceC420801kM;
import X.InterfaceC517900KSu;
import X.InterfaceC517920KSw;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.livesetting.level.SuperFanProDisableSetting;
import com.bytedance.android.livesdk.revenue.level.api.event.OpenFansClubPageEvent;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS156S1100000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.PolingSuperFanContractStatusResult;
import webcast.data.CurrentSuperFanContract;
import webcast.data.FansLevelInfo;
import webcast.data.RechargeCustomError;
import webcast.data.SuperFanPackage;

/* JADX INFO: loaded from: classes8.dex */
public final class SuperFanViewModel extends LiveWidgetViewModel implements InterfaceC1141530foN {
    public final IFansClubService LL;
    public C517840KSo LLILLJJLI;
    public final C01GW LLILLL;
    public C517860KSq LLILZ;
    public GetNonFansUserDataResponse.Data LLILZIL;
    public boolean LLILZLL;
    public final Set<InterfaceC517900KSu> LLIZ;
    public String LLIZLLLIL;
    public final List<InterfaceC420801kM> LLJ;

    public SuperFanViewModel() {
        C517910KSv.LIZ = new WeakReference<>(this);
        this.LL = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
        this.LLILLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(89));
        this.LLIZ = new HashSet();
        this.LLIZLLLIL = "";
        this.LLJ = new ArrayList();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator<InterfaceC420801kM> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
        ((ArrayList) this.LLJ).clear();
        C1548820qPI.LJIIIIZZ("live_super_fan_treasure_receive_success", this);
    }

    public static void yQ2(Context context) {
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/?spark_page=fan-club-faq-super-fan-user&roma_group_key=spark_page_fan-club-faq-super-fan-user&roma_page_key=p");
        c495520Jby.LIZJ("source_page", "superfan_purchase_page");
        c495520Jby.LIZJ("host", "webcast_lynxview_popup");
        c495520Jby.LIZ(1, "use_live_sheet");
        c495520Jby.LIZJ("height_mode", "fixed_7");
        if (context != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        DataChannel dataChannel;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_super_fan_treasure_receive_success") && (dataChannel = getDataChannel()) != null) {
            C517700KSa.LIZJ(dataChannel, new AwS408S0200000_7(c262100zr, this, 8));
        }
    }

    public final void zQ2(final C0KT5 c0kt5, final InterfaceC517920KSw interfaceC517920KSw) {
        String idStr;
        final long id;
        Room roomLJJLIIIIJ;
        User userLJIIIIZZ;
        String secUid;
        User userLJIIIIZZ2;
        CurrentSuperFanContract currentSuperFanContract;
        String str;
        IHostAppContext iHostAppContext;
        C0KSH.LJIILIIL(getDataChannel(), "1", "purchase", c0kt5.LIZIZ);
        if (SuperFanProDisableSetting.INSTANCE.getValue() && (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null && iHostAppContext.isCoin()) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS551S0100000_7(this, 578));
            interfaceC517920KSw.onFailure();
            C0KSH.LJIIL(getDataChannel(), "1", "purchase", c0kt5.LIZIZ, 0, false, "business", null);
            return;
        }
        C517860KSq c517860KSq = this.LLILZ;
        if (c517860KSq != null && C0KSX.LIZIZ(c517860KSq.LIZ)) {
            GetNonFansUserDataResponse.Data data = c517860KSq.LIZ.LIZ;
            if (data != null && (currentSuperFanContract = data.currentContractInfo) != null && currentSuperFanContract.status == 9) {
                SuperFanPackage superFanPackage = c517860KSq.LIZIZ.LIZ;
                String str2 = null;
                if (superFanPackage != null) {
                    str = superFanPackage.iapid;
                } else {
                    str = null;
                }
                if (C500260Jjc.LJJIIZ(str)) {
                    SuperFanPackage superFanPackage2 = c517860KSq.LIZIZ.LIZ;
                    if (superFanPackage2 != null) {
                        str2 = superFanPackage2.iapid;
                    }
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS156S1100000_7(this, str2, 3));
                    interfaceC517920KSw.onFailure();
                    C0KSH.LJIIL(getDataChannel(), "1", "purchase", c0kt5.LIZIZ, 0, false, "business", null);
                    return;
                }
            }
            String str3 = "";
            this.LLIZLLLIL = "";
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C0KS8 c0ks8 = c517860KSq.LIZIZ;
            final C517840KSo c517840KSo = this.LLILLJJLI;
            if (c517840KSo == null) {
                return;
            }
            DataChannel dataChannel = getDataChannel();
            if (dataChannel == null || (userLJIIIIZZ2 = C500260Jjc.LJIIIIZZ(dataChannel)) == null || (idStr = userLJIIIIZZ2.getIdStr()) == null) {
                idStr = "";
            }
            DataChannel dataChannel2 = getDataChannel();
            if (dataChannel2 != null && (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel2)) != null && (secUid = userLJIIIIZZ.getSecUid()) != null) {
                str3 = secUid;
            }
            DataChannel dataChannel3 = getDataChannel();
            if (dataChannel3 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3)) != null) {
                id = roomLJJLIIIIJ.getId();
            } else {
                id = 0;
            }
            final String str4 = idStr;
            ((C0KKP) this.LLILLL.getValue()).LIZLLL(new C0KP3(c517840KSo.LIZ, "fans_normal_sub", null, "fan_club", c0ks8, c0kt5.LJFF, idStr, str3, c0kt5.LIZLLL, String.valueOf(id), c0kt5.LIZ.getValue(), c0kt5.LIZIZ, new C0KP5() { // from class: X.0KT1
                @Override // X.C0KP5
                public final void LJ(C0KPG c0kpg) {
                }

                @Override // X.C0KP5
                public final void LIZ(C0KPG c0kpg) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(c517840KSo, c0kpg, 9));
                    interfaceC517920KSw.onFailure();
                }

                @Override // X.C0KP5
                public final void LIZJ(PolingSuperFanContractStatusResult polingSuperFanContractStatusResult) throws JSONException {
                    FansLevelInfo fansLevelInfo;
                    long j;
                    FansLevelInfo fansLevelInfo2;
                    C0KT2 c0kt2;
                    this.LIZ.getClass();
                    if (!((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2()) {
                        this.LIZ.getClass();
                        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Iy2();
                    }
                    if (!C0KT6.LIZ || ((c0kt2 = c0kt5.LIZ) != C0KT2.INDEPENDENT_PURCHASE_PAGE && c0kt2 != C0KT2.OTHERS)) {
                        if (this.LIZ.LL.c70()) {
                            DataChannel dataChannel4 = this.LIZ.getDataChannel();
                            if (dataChannel4 != null) {
                                dataChannel4.LC0(OpenFansClubPageEvent.class, new C1094590eaf(c0kt5.LJ, false, false, null, 0, null, "1", null, null, 432));
                            }
                        } else {
                            IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                            Activity activity = c517840KSo.LIZ.get();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("aweme://roma_redirect/?spark_page=fan_club_user_join_super_fan&roma_group_key=spark_page_fan_club_user_join_super_fan&roma_page_key=p&is_super_fan=1&source_page=");
                            sbLIZ.append(c0kt5.LJ);
                            sbLIZ.append("&anchor_id=");
                            sbLIZ.append(str4);
                            sbLIZ.append("&trigger_type=join");
                            iActionHandlerService.handle(activity, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", "1");
                    C389001fE.LIZ("live_super_fan_subscribe_success", jSONObject, System.currentTimeMillis(), false);
                    String str5 = "";
                    long j2 = 0;
                    if (!this.LIZ.LL.c70()) {
                        String str6 = c0kt5.LJ;
                        DataChannel dataChannel5 = this.LIZ.getDataChannel();
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (polingSuperFanContractStatusResult != null && (fansLevelInfo2 = polingSuperFanContractStatusResult.fansLevelInfo) != null) {
                            j = fansLevelInfo2.level;
                        } else {
                            j = 0;
                        }
                        Long lValueOf = Long.valueOf(j);
                        String str7 = (String) DataChannelGlobal.LLILZ.gg0(C1148210fz9.class);
                        if (str7 == null) {
                            str7 = "";
                        }
                        C518180KTw.LJIJI(str6, dataChannel5, jCurrentTimeMillis2, -1, lValueOf, 0, str7, true, "superfan");
                    }
                    IFansClubService iFansClubService = this.LIZ.LL;
                    if (polingSuperFanContractStatusResult != null) {
                        fansLevelInfo = polingSuperFanContractStatusResult.fansLevelInfo;
                    } else {
                        fansLevelInfo = null;
                    }
                    if (polingSuperFanContractStatusResult != null) {
                        j2 = polingSuperFanContractStatusResult.fansCount;
                    }
                    iFansClubService.wo0(fansLevelInfo, j2, id, 0L, "");
                    if (c0kt5.LJFF == 1) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_fans_club_superfan_purchase_success");
                        c474500IjALIZ.LJIJJLI(this.LIZ.getDataChannel());
                        c474500IjALIZ.LJJII(c0kt5.LIZIZ, "page_enter_from");
                        C0KT2 c0kt22 = c0kt5.LIZ;
                        if (c0kt22 != C0KT2.JOIN_GUIDE_PAGE && c0kt22 != C0KT2.INDEPENDENT_PURCHASE_PAGE) {
                            if (c0kt22 == C0KT2.SUPER_FAN_GOAL) {
                                str5 = "goal";
                            }
                        } else {
                            str5 = "regular";
                        }
                        c474500IjALIZ.LJJII(str5, "purchase_page_type");
                        c474500IjALIZ.LJJII(this.LIZ.LLIZLLLIL, "order_id");
                        c474500IjALIZ.LIZ();
                    }
                    interfaceC517920KSw.onSuccess();
                }

                @Override // X.C0KP5
                public final void LIZLLL(Throwable th) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(c517840KSo, th, 10));
                    interfaceC517920KSw.onFailure();
                }

                @Override // X.C0KP5
                public final void LJFF(CreateSuperFanContractResult createSuperFanContractResult) {
                    this.LIZ.LLIZLLLIL = createSuperFanContractResult.contractId;
                }

                @Override // X.C0KP5
                public final void LIZIZ(Throwable th, RechargeCustomError rechargeCustomError) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS251S0300000_7(rechargeCustomError, c517840KSo, th, 5));
                    interfaceC517920KSw.onFailure();
                }
            }));
            return;
        }
        C766270U4b.LIZLLL(2131856666);
        interfaceC517920KSw.onFailure();
        C0KSH.LJIIL(getDataChannel(), "1", "purchase", c0kt5.LIZIZ, 0, false, "business", null);
    }

    public final void vQ2(C0KT0 c0kt0, long j, InterfaceC517900KSu interfaceC517900KSu) {
        Room roomLJJLIIIIJ;
        User owner;
        SubscribeInfo subscribeInfo;
        ISubscribeService iSubscribeService;
        String strLIZ;
        C0KT2 c0kt2 = c0kt0.LIZ;
        C0KT2 c0kt22 = C0KT2.PREFETCH;
        if (c0kt2 == c0kt22 && (!SuperFanPackagePrefetchSetting.INSTANCE.getValue() || ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2() || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(getDataChannel())) == null || (owner = roomLJJLIIIIJ.getOwner()) == null || (subscribeInfo = owner.getSubscribeInfo()) == null || !subscribeInfo.isAnchorQualified() || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (strLIZ = C516700KOe.LIZ()) == null || strLIZ.length() == 0 || j != FansClubJoinPanelUpgradeSetting.INSTANCE.getValue())) {
            interfaceC517900KSu.onFailure();
            return;
        }
        if (j != FansClubJoinPanelUpgradeSetting.INSTANCE.getValue()) {
            wQ2(c0kt0, j, interfaceC517900KSu);
            return;
        }
        int i = c0kt0.LIZJ;
        C517860KSq c517860KSq = this.LLILZ;
        if (c517860KSq != null && c517860KSq.LIZJ == i) {
            interfaceC517900KSu.LIZ(c517860KSq.LIZ, c517860KSq.LIZIZ);
            if (c0kt0.LIZ == c0kt22) {
                return;
            }
            wQ2(c0kt0, j, interfaceC517900KSu);
            return;
        }
        synchronized (this) {
            try {
                if (c0kt0.LIZ == c0kt22 && !this.LLILZLL) {
                    ((HashSet) this.LLIZ).add(interfaceC517900KSu);
                    interfaceC517900KSu = new InterfaceC517900KSu() { // from class: X.0KSr
                        @Override // X.InterfaceC517900KSu
                        public final void onFailure() {
                            SuperFanViewModel superFanViewModel = this.LIZ;
                            synchronized (superFanViewModel) {
                                try {
                                    Iterator<InterfaceC517900KSu> it2 = superFanViewModel.LLIZ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().onFailure();
                                    }
                                    ((HashSet) superFanViewModel.LLIZ).clear();
                                    superFanViewModel.LLILZLL = false;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // X.InterfaceC517900KSu
                        public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                            SuperFanViewModel superFanViewModel = this.LIZ;
                            synchronized (superFanViewModel) {
                                try {
                                    Iterator<InterfaceC517900KSu> it2 = superFanViewModel.LLIZ.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().LIZ(c0ksy, c0ks8);
                                    }
                                    ((HashSet) superFanViewModel.LLIZ).clear();
                                    superFanViewModel.LLILZLL = false;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    };
                }
                if (!this.LLILZLL) {
                    if (c0kt0.LIZ == c0kt22) {
                        this.LLILZLL = true;
                    }
                    wQ2(c0kt0, j, interfaceC517900KSu);
                } else {
                    ((HashSet) this.LLIZ).add(interfaceC517900KSu);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void wQ2(final C0KT0 c0kt0, final long j, final InterfaceC517900KSu interfaceC517900KSu) {
        long id;
        long id2;
        String secUid;
        User userLJIIIIZZ;
        Room roomLJJLIIIIJ;
        User userLJIIIIZZ2;
        this.LLILZIL = null;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        DataChannel dataChannel = getDataChannel();
        if (dataChannel != null && (userLJIIIIZZ2 = C500260Jjc.LJIIIIZZ(dataChannel)) != null) {
            id = userLJIIIIZZ2.getId();
        } else {
            id = 0;
        }
        DataChannel dataChannel2 = getDataChannel();
        if (dataChannel2 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) != null) {
            id2 = roomLJJLIIIIJ.getId();
        } else {
            id2 = 0;
        }
        DataChannel dataChannel3 = getDataChannel();
        if (dataChannel3 == null || (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel3)) == null || (secUid = userLJIIIIZZ.getSecUid()) == null) {
            secUid = "";
        }
        ((C0KKP) this.LLILLL.getValue()).LJ(new C0KSK(currentUserId, id, secUid, id2, "fan_club", j, c0kt0.LIZ.getValue(), c0kt0.LIZIZ, c0kt0.LIZJ, new C0KSU<GetNonFansUserDataResponse.Data>() { // from class: X.0KSL
            @Override // X.C0KSU
            public final void LIZ() {
            }

            @Override // X.C0KSU
            public final void LIZJ(C517630KRt c517630KRt) {
                C0KQW c0kqw;
                if (c517630KRt != null) {
                    c0kqw = c517630KRt.LIZIZ;
                } else {
                    c0kqw = null;
                }
                String strLIZ = "";
                if (c517630KRt != null && c0kqw != null) {
                    C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_superfan_precheck_fail");
                    c512280K7eLIZ.LIZIZ(Integer.valueOf(C0KSX.LIZ(this.LLILZIL) ? 1 : 0), "permission");
                    c512280K7eLIZ.LIZIZ(Integer.valueOf(c0kqw.LIZ.getValue()), "error_code");
                    c512280K7eLIZ.LIZIZ(c0kqw.LIZIZ, "error_message");
                    c512280K7eLIZ.LIZIZ(Integer.valueOf(c517630KRt.LJFF.getValue()), "contract_state");
                    List<C0KQD> list = c517630KRt.LIZJ;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C0KQD> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(it2.next().getValue()));
                    }
                    c512280K7eLIZ.LIZLLL.put("allow_path", arrayList.toString());
                    ISubscribeService iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
                    if (iSubscribeService != null && iSubscribeService.Ae() != null) {
                        strLIZ = C516700KOe.LIZ();
                    }
                    Map<String, String> map = c512280K7eLIZ.LIZLLL;
                    strLIZ.toString();
                    map.put("iap_country_code", strLIZ);
                    c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
                    return;
                }
                C512280K7e c512280K7eLIZ2 = C512290K7f.LIZ("livesdk_superfan_precheck_fail");
                c512280K7eLIZ2.LIZIZ(Integer.valueOf(C0KSX.LIZ(this.LLILZIL) ? 1 : 0), "permission");
                c512280K7eLIZ2.LIZIZ(-1, "error_code");
                Map<String, String> map2 = c512280K7eLIZ2.LIZLLL;
                "preCheckResult is null".toString();
                map2.put("error_message", "preCheckResult is null");
                ISubscribeService iSubscribeService2 = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class);
                if (iSubscribeService2 != null && iSubscribeService2.Ae() != null) {
                    strLIZ = C516700KOe.LIZ();
                }
                Map<String, String> map3 = c512280K7eLIZ2.LIZLLL;
                strLIZ.toString();
                map3.put("iap_country_code", strLIZ);
                c512280K7eLIZ2.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
            }

            @Override // X.C0KSU
            public final void LIZLLL(C0KSY<GetNonFansUserDataResponse.Data> c0ksy) {
                SuperFanViewModel.xQ2(j, this, c0kt0, interfaceC517900KSu, c0ksy, true);
            }

            @Override // X.C0KSU
            public final void LJ(C0KQW c0kqw) {
                int value;
                String str;
                EnumC1792020wjY enumC1792020wjY;
                if (c0kqw != null && (enumC1792020wjY = c0kqw.LIZ) != null) {
                    value = enumC1792020wjY.getValue();
                } else {
                    value = 0;
                }
                C0KSH.LIZ = value;
                if (c0kqw == null || (str = c0kqw.LIZIZ) == null) {
                    str = "";
                }
                C0KSH.LIZIZ = str;
                SuperFanViewModel superFanViewModel = this;
                superFanViewModel.LLILZ = null;
                GetNonFansUserDataResponse.Data data = superFanViewModel.LLILZIL;
                if (data != null) {
                    SuperFanViewModel.xQ2(j, superFanViewModel, c0kt0, interfaceC517900KSu, new C0KSY(data, null, null), false);
                } else {
                    interfaceC517900KSu.onFailure();
                }
            }

            @Override // X.C0KSU
            public final void LJFF(GetNonFansUserDataResponse.Data data) {
                this.LLILZIL = data;
            }

            @Override // X.C0KSU
            public final void LIZIZ(Integer num, String str) {
                int iIntValue;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                C0KSH.LIZ = iIntValue;
                C0KSH.LIZIZ = str;
                SuperFanViewModel superFanViewModel = this;
                superFanViewModel.LLILZ = null;
                superFanViewModel.LLILZIL = null;
                interfaceC517900KSu.onFailure();
            }
        }));
    }

    public static final void xQ2(long j, SuperFanViewModel superFanViewModel, C0KT0 c0kt0, InterfaceC517900KSu interfaceC517900KSu, C0KSY<GetNonFansUserDataResponse.Data> c0ksy, boolean z) {
        SuperFanPackage superFanPackage;
        C0KSW c0ksw;
        String str;
        List<SuperFanPackage> list;
        GetNonFansUserDataResponse.Data data = c0ksy.LIZ;
        if (data != null && (list = data.allPkgInfos) != null) {
            superFanPackage = (SuperFanPackage) C13LP.LJJJLZIJ(0, list);
        } else {
            superFanPackage = null;
        }
        Map<String, C0KSW> map = c0ksy.LIZIZ;
        if (map != null) {
            if (superFanPackage != null) {
                str = superFanPackage.iapid;
            } else {
                str = null;
            }
            c0ksw = map.get(str);
        } else {
            c0ksw = null;
        }
        C0KS8 c0ks8 = new C0KS8(superFanPackage, c0ksw, null, 2);
        if (z && j == FansClubJoinPanelUpgradeSetting.INSTANCE.getValue()) {
            superFanViewModel.LLILZ = new C517860KSq(c0ksy, c0ks8, c0kt0.LIZJ);
        }
        interfaceC517900KSu.LIZ(c0ksy, c0ks8);
    }
}
