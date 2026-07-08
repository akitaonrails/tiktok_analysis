package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC1519240pda;
import X.C01GW;
import X.C01WI;
import X.C01WJ;
import X.C01WL;
import X.C093Y;
import X.C0BXR;
import X.C0XQ7;
import X.C100H;
import X.C11JF;
import X.C11S5;
import X.C1227904rF;
import X.C123100dR;
import X.C1518550pcT;
import X.C1518600pcY;
import X.C1518640pcc;
import X.C1518650pcd;
import X.C1518690pch;
import X.C1518700pci;
import X.C1525630pnt;
import X.C1701940uOG;
import X.C1906580ziK;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C276250AsB;
import X.C452501pT;
import X.C596970NbD;
import X.EnumC1518670pcf;
import X.EnumC1733330vCt;
import X.InterfaceC1502240pCA;
import X.InterfaceC1518720pck;
import X.InterfaceC1518910pd3;
import X.InterfaceC1524005xu;
import X.InterfaceC1686106ix;
import X.InterfaceC596980NbE;
import Y.AfS192S0100000_23;
import Y.AfS8S0100100_23;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TTKUserCommunicationServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUserCommunicationChannelModel;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import com.ss.android.ugc.tiktok.pns.product.deps.IPNSProductAppDepService;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import com.ss.android.ugc.tiktok.pns.upc.api.IPNSUpcService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class TTKUserCommunicationServiceImpl implements TTKUserCommunicationService, InterfaceC596980NbE {
    public static final HashSet<Integer> LLJIJIL = C093Y.LIZJ(Integer.valueOf(EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue()), Integer.valueOf(EnumC1518670pcf.SCENE_LOGIN.getValue()), Integer.valueOf(EnumC1518670pcf.SCENE_ACCESS_BLOCK.getValue()), Integer.valueOf(EnumC1518670pcf.SCENE_GEO_BLOCK_TNC.getValue()), Integer.valueOf(EnumC1518670pcf.SCENE_GEO_BLOCK_TLB.getValue()));
    public boolean LLILZ;
    public boolean LLILZIL;
    public C11JF LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(60));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(59));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C1518700pci(this));
    public final Map<Integer, InterfaceC1518910pd3> LLJ = new LinkedHashMap();
    public final CopyOnWriteArrayList<AbstractC1519240pda> LLJI = new CopyOnWriteArrayList<>();

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LIZIZ() {
        String str = PolicyNoticeServiceImpl.LJIILIIL;
        PolicyNoticeServiceImpl.LJIILIIL = "";
        this.LLILZIL = false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LJFF() {
        C1518640pcc c1518640pcc = C1518650pcd.LIZIZ;
        if (c1518640pcc != null) {
            c1518640pcc.LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pch] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LJIIIIZZ() {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        C1518550pcT c1518550pcT = C1518550pcT.LIZ;
        ?? r2 = new InterfaceC1518720pck() { // from class: X.0pch
            @Override // X.InterfaceC1518720pck
            public final boolean isNetworkAvailable() {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                try {
                    return C036E.LIZ.LIZIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
        };
        c1518550pcT.getClass();
        C1518550pcT.LJFF = "/tiktok";
        C1518550pcT.LJ = new AwS567S0100000_23((C1518690pch) r2, 216);
    }

    public final C1518550pcT LJIILIIL() {
        return (C1518550pcT) this.LLILLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LIZLLL() {
        IGatekeeperService iGatekeeperService;
        if (C276250AsB.LIZ() && (iGatekeeperService = (IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class)) != null) {
            iGatekeeperService.LJIIIZ(C100H.LIZ);
            iGatekeeperService.LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final C1518550pcT LJI() {
        return LJIILIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0pcg] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LJII() {
        C1518550pcT c1518550pcTLJIILIIL = LJIILIIL();
        InterfaceC1524005xu<String> interfaceC1524005xu = new InterfaceC1524005xu<String>() { // from class: X.0NRT
            @Override // X.InterfaceC1524005xu
            public final String LIZ() {
                return "PPFProcessor";
            }

            @Override // X.InterfaceC1524005xu
            public final void LIZIZ(String str, Integer num, Map map) {
                String str2 = str;
                if (str2 != null) {
                    Type type = new TypeToken<DecisionMakerNetworkApi.EligibilityModel>() { // from class: X.0NRD
                    }.getType();
                    try {
                        C1227904rF.LIZ.getClass();
                        DecisionMakerNetworkApi.EligibilityModel eligibilityModel = (DecisionMakerNetworkApi.EligibilityModel) C1227904rF.LIZJ(str2, type);
                        if (eligibilityModel != null) {
                            ((IGatekeeperService) ServiceManager.get().getService(IGatekeeperService.class)).LJIIJJI(eligibilityModel);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        };
        c1518550pcTLJIILIIL.getClass();
        C1518550pcT.LIZJ(interfaceC1524005xu);
        C1518550pcT c1518550pcTLJIILIIL2 = LJIILIIL();
        InterfaceC1524005xu<String> interfaceC1524005xu2 = new InterfaceC1524005xu<String>() { // from class: X.0pcq
            @Override // X.InterfaceC1524005xu
            public final String LIZ() {
                return "ScreenTimeProcessor";
            }

            public static Long LIZJ(Object obj) {
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof Integer) {
                    return Long.valueOf(((Number) obj).intValue());
                }
                if (obj instanceof Double) {
                    return Long.valueOf((long) ((Number) obj).doubleValue());
                }
                if (obj instanceof Float) {
                    return Long.valueOf((long) ((Number) obj).floatValue());
                }
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (obj instanceof String) {
                    return LIZJ(obj);
                }
                return null;
            }

            @Override // X.InterfaceC1524005xu
            public final void LIZIZ(String str, Integer num, Map map) {
                String str2;
                String str3;
                boolean z;
                long jLongValue;
                boolean z2;
                String str4 = str;
                PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
                Object c098200Yq = null;
                JSONObject jSONObject = null;
                if (str4 != null) {
                    try {
                        ConcurrentHashMap concurrentHashMapLIZ = C178200mK.LIZ(str4);
                        if (concurrentHashMapLIZ != null) {
                            Object obj = concurrentHashMapLIZ.get("action_id");
                            if (obj instanceof String) {
                                str2 = (String) obj;
                            } else {
                                str2 = null;
                            }
                            Object obj2 = concurrentHashMapLIZ.get("ui_config");
                            if (obj2 instanceof JSONObject) {
                                jSONObject = (JSONObject) obj2;
                            }
                            Long lLIZJ = LIZJ(concurrentHashMapLIZ.get("expiration_time"));
                            Long lLIZJ2 = LIZJ(concurrentHashMapLIZ.get("next_trigger_time"));
                            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                            if (C290530Ba7.LIZ() && pnSDigitalWellbeingSDKService != null) {
                                Pair[] pairArr = new Pair[4];
                                if (str2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = str2;
                                }
                                pairArr[0] = new Pair("action_id", str3);
                                if (lLIZJ2 != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                pairArr[1] = new Pair("has_next_trigger_time", String.valueOf(z));
                                if (lLIZJ2 != null) {
                                    jLongValue = lLIZJ2.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                                pairArr[2] = new Pair("next_trigger_time_sec", String.valueOf(jLongValue));
                                if (lLIZJ != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                pairArr[3] = new Pair("has_expiration", String.valueOf(z2));
                                pnSDigitalWellbeingSDKService.LIZ("screen_time_bytesync_received", C2097608Jq.LJIIIIZZ(pairArr));
                            }
                            if (lLIZJ != null && lLIZJ.longValue() < jCurrentTimeMillis) {
                                return;
                            }
                            SettingsManager.LIZLLL().getClass();
                            if (SettingsManager.LIZ("enable_screentime_upload_schedule_by_duration", true) && lLIZJ2 != null) {
                                long jLongValue2 = lLIZJ2.longValue();
                                if (pnSDigitalWellbeingSDKService != null) {
                                    pnSDigitalWellbeingSDKService.LIZJ(jLongValue2);
                                }
                            }
                            if (str2 != null && pnSDigitalWellbeingSDKService != null) {
                                C844470XAv.LIZ.getClass();
                                pnSDigitalWellbeingSDKService.LJ(C844470XAv.LIZ(), str2, jSONObject);
                            }
                            if (C290530Ba7.LIZ() && pnSDigitalWellbeingSDKService != null) {
                                if (str2 == null) {
                                    str2 = "";
                                }
                                pnSDigitalWellbeingSDKService.LIZ("screen_time_bytesync_processed", C2097908Jt.LIZJ(new Pair("action_id", str2)));
                            }
                        }
                        c098200Yq = Unit.LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null && C290530Ba7.LIZ() && pnSDigitalWellbeingSDKService != null) {
                    Pair[] pairArr2 = new Pair[2];
                    String message = thM5exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    pairArr2[0] = new Pair("error_message", message);
                    pairArr2[1] = new Pair("error_type", thM5exceptionOrNullimpl.getClass().getSimpleName());
                    pnSDigitalWellbeingSDKService.LIZ("screen_time_bytesync_failed", C2097608Jq.LJIIIIZZ(pairArr2));
                }
            }
        };
        c1518550pcTLJIILIIL2.getClass();
        C1518550pcT.LIZJ(interfaceC1524005xu2);
        C1518550pcT c1518550pcTLJIILIIL3 = LJIILIIL();
        InterfaceC1524005xu<String> interfaceC1524005xu3 = new InterfaceC1524005xu<String>() { // from class: X.0pcm
            @Override // X.InterfaceC1524005xu
            public final String LIZ() {
                return "LogoutProcessor";
            }

            @Override // X.InterfaceC1524005xu
            public final void LIZIZ(String str, Integer num, Map map) {
                IAccountService iAccountService;
                ILoginService iLoginServiceLIZJ;
                String str2 = str;
                if (str2 != null) {
                    try {
                        if (JSONObjectProtectorUtils.getBoolean(new JSONObject(str2), "in_app") && (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) != null && (iLoginServiceLIZJ = iAccountService.LIZJ()) != null) {
                            iLoginServiceLIZJ.logout("pns_logout_action", "user_banned");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        };
        c1518550pcTLJIILIIL3.getClass();
        C1518550pcT.LIZJ(interfaceC1524005xu3);
        C1518550pcT c1518550pcTLJIILIIL4 = LJIILIIL();
        InterfaceC1524005xu<String> interfaceC1524005xu4 = new InterfaceC1524005xu<String>() { // from class: X.0pcZ
            @Override // X.InterfaceC1524005xu
            public final String LIZ() {
                return "PopupShowProcessor";
            }

            @Override // X.InterfaceC1524005xu
            public final void LIZIZ(String str, Integer num, Map map) {
                TTKUserCommunicationService tTKUserCommunicationService;
                C1518550pcT c1518550pcTLJI;
                String str2 = str;
                if (str2 != null) {
                    try {
                        C1227904rF.LIZ.getClass();
                        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = (NetworkUniversalPopupDispatchResponse) C1227904rF.LIZIZ(str2, NetworkUniversalPopupDispatchResponse.class);
                        if (networkUniversalPopupDispatchResponse != null && (tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null)) != null && (c1518550pcTLJI = tTKUserCommunicationService.LJI()) != null) {
                            UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel("PopupShowProcessorLocal", networkUniversalPopupDispatchResponse, null);
                            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_from", "ByteSyncPopupShowAction"));
                            c1518550pcTLJI.getClass();
                            C1518550pcT.LJI(userCommunicationProcessorModel, null, mapLIZJ);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        };
        c1518550pcTLJIILIIL4.getClass();
        C1518550pcT.LIZJ(interfaceC1524005xu4);
        if (C0BXR.LIZ()) {
            IPNSUpcService iPNSUpcService = (IPNSUpcService) PluggableExtentionKt.pluggableSpi$default(IPNSUpcService.class, false, false, false, 14, null);
            C01WI c01wiLIZ = iPNSUpcService != null ? iPNSUpcService.LIZ() : null;
            if ((c01wiLIZ instanceof InterfaceC1524005xu) && c01wiLIZ != null) {
                LJIILIIL().getClass();
                C1518550pcT.LIZJ(c01wiLIZ);
            }
            C01WL c01wlLIZLLL = iPNSUpcService != null ? iPNSUpcService.LIZLLL() : null;
            if ((c01wlLIZLLL instanceof InterfaceC1524005xu) && c01wlLIZLLL != null) {
                LJIILIIL().getClass();
                C1518550pcT.LIZJ(c01wlLIZLLL);
            }
            C01WJ c01wjLJ = iPNSUpcService != null ? iPNSUpcService.LJ() : null;
            if ((c01wjLJ instanceof InterfaceC1524005xu) && c01wjLJ != null) {
                LJIILIIL().getClass();
                C1518550pcT.LIZJ(c01wjLJ);
            }
        }
        C596970NbD c596970NbD = C596970NbD.LIZIZ;
        c596970NbD.LIZ(EnumC1733330vCt.PNS_UC_CHANNEL, this);
        c596970NbD.LIZ(EnumC1733330vCt.PNS_UC_CHANNEL_DID, this);
        this.LLIZLLLIL = ((AccountUserService) C0XQ7.LJFF()).LIZ();
        IPNSProductAppDepService iPNSProductAppDepService = (IPNSProductAppDepService) PluggableExtentionKt.pluggableSpi$default(IPNSProductAppDepService.class, false, false, false, 14, null);
        if (iPNSProductAppDepService != 0) {
            iPNSProductAppDepService.LIZ(new InterfaceC1686106ix() { // from class: X.0pcg
                @Override // X.InterfaceC1686106ix
                public final void onAppBackground() {
                    TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl = this.LIZ;
                    tTKUserCommunicationServiceImpl.LLIZ = false;
                    tTKUserCommunicationServiceImpl.LLIZLLLIL = false;
                }

                @Override // X.InterfaceC1686106ix
                public final void onAppForeground() {
                    TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl = this.LIZ;
                    if (tTKUserCommunicationServiceImpl.LLIZLLLIL) {
                        tTKUserCommunicationServiceImpl.LLIZLLLIL = false;
                        return;
                    }
                    if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "hot_launch_post_app_launch_popup", true, false) && !this.LIZ.LLIZ) {
                        C1518640pcc c1518640pcc = C1518650pcd.LIZIZ;
                        if (c1518640pcc != null) {
                            synchronized (c1518640pcc) {
                                c1518640pcc.LIZJ = 0;
                                ((LinkedHashMap) c1518640pcc.LJ).clear();
                            }
                        }
                        if (PopupManager.LJI() || C19254610Um.LIZIZ.LJJIJIIJI() == 2 || C0XQ7.LIZJ().isLoginPanelDisplayed()) {
                            return;
                        }
                        TTKUserCommunicationServiceImpl tTKUserCommunicationServiceImpl2 = this.LIZ;
                        tTKUserCommunicationServiceImpl2.LLIZ = true;
                        tTKUserCommunicationServiceImpl2.LJIILL(EnumC1518670pcf.SCENE_POST_APP_LAUNCH.getValue(), null, "DynamicProcessor", false);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final List<AbstractC1519240pda> LIZ() {
        return this.LLJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final Map<Integer, InterfaceC1518910pd3> LJIIL() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LIZJ(AbstractC1519240pda abstractC1519240pda) {
        this.LLJI.addIfAbsent(abstractC1519240pda);
    }

    @Override // X.InterfaceC596980NbE
    public final void LJ(C1525630pnt c1525630pnt) {
        List<UserCommunicationProcessorModel> list;
        byte[] bArr = c1525630pnt.LIZ;
        if (bArr != null) {
            LJIILIIL().getClass();
            try {
                NetworkUserCommunicationChannelModel networkUserCommunicationChannelModel = (NetworkUserCommunicationChannelModel) new Gson().LJII(new String(bArr, Charsets.UTF_8), NetworkUserCommunicationChannelModel.class);
                if (networkUserCommunicationChannelModel != null && (list = networkUserCommunicationChannelModel.processorList) != null) {
                    C1518550pcT c1518550pcT = C1518550pcT.LIZ;
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_from", "byte_sync"));
                    c1518550pcT.getClass();
                    for (UserCommunicationProcessorModel userCommunicationProcessorModel : list) {
                        C1518550pcT.LIZ.getClass();
                        C1518550pcT.LJI(userCommunicationProcessorModel, null, mapLIZJ);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LJIIIZ(List<? extends Object> list, Map<String, ? extends Object> map) {
        ArrayList<UserCommunicationProcessorModel> arrayList = new ArrayList();
        for (Object obj : list) {
            C1227904rF.LIZ.getClass();
            try {
                arrayList.add((UserCommunicationProcessorModel) C1227904rF.LIZIZ(C1227904rF.LJI(obj), UserCommunicationProcessorModel.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        LJIILIIL().getClass();
        for (UserCommunicationProcessorModel userCommunicationProcessorModel : arrayList) {
            C1518550pcT.LIZ.getClass();
            C1518550pcT.LJI(userCommunicationProcessorModel, null, map);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LJIIJ(Map<String, String> map, Function1<? super String, Unit> function1) {
        LJIIIIZZ();
        LJIILIIL().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1502240pCA interfaceC1502240pCA = (InterfaceC1502240pCA) C1518550pcT.LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1518550pcT.LIZ.getClass();
        sbLIZ.append(C1518550pcT.LJFF);
        sbLIZ.append("/popup/callback/v1");
        interfaceC1502240pCA.LIZ(C2188811AlT.LIZIZ(sbLIZ), map).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS8S0100100_23(jCurrentTimeMillis, function1, 3), new AfS8S0100100_23(jCurrentTimeMillis, function1, 4));
    }

    public final void LJIILJJIL(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, int i) {
        String str;
        IKidsAccountService iKidsAccountService = (IKidsAccountService) PluggableExtentionKt.pluggableSpi$default(IKidsAccountService.class, false, false, false, 14, null);
        if ((iKidsAccountService != null && iKidsAccountService.LIZIZ()) || !LLJIJIL.contains(Integer.valueOf(i))) {
            str = "PopupShowProcessorLocal";
        } else {
            str = "ComplianceHandler";
        }
        C1518550pcT c1518550pcTLJIILIIL = LJIILIIL();
        UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel(str, networkUniversalPopupDispatchResponse, null);
        Integer numValueOf = Integer.valueOf(i);
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("enter_from", "get_config_with_scene"));
        c1518550pcTLJIILIIL.getClass();
        C1518550pcT.LJI(userCommunicationProcessorModel, numValueOf, mapLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService
    public final void LJIIJJI(int i, InterfaceC1518910pd3 interfaceC1518910pd3, String str) {
        LJIILL(i, interfaceC1518910pd3, str, false);
    }

    public final void LJIILL(int i, InterfaceC1518910pd3 interfaceC1518910pd3, String str, boolean z) {
        Map<String, String> mapLIZIZ;
        LJIIIIZZ();
        boolean z2 = true;
        if (i == EnumC1518670pcf.SCENE_COLD_LAUNCH.getValue()) {
            C11JF c11jf = this.LLILZLL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLILZLL = C1906580ziK.LIZJ().LJIIIIZZ().LJLLLLLL(new AfS192S0100000_23(this, 0));
            boolean z3 = this.LLILZIL;
            this.LLILZIL = true;
            if (z3) {
                return;
            }
        }
        String str2 = null;
        if (interfaceC1518910pd3 != null) {
            mapLIZIZ = interfaceC1518910pd3.LIZIZ();
            this.LLJ.put(Integer.valueOf(i), interfaceC1518910pd3);
        } else {
            mapLIZIZ = null;
        }
        IKidsAccountService iKidsAccountService = (IKidsAccountService) PluggableExtentionKt.pluggableSpi$default(IKidsAccountService.class, false, false, false, 14, null);
        if (iKidsAccountService == null || !iKidsAccountService.LIZIZ()) {
            z2 = false;
        }
        if (C123100dR.LIZ(str) && str != null) {
            str2 = str;
        } else if (i != EnumC1518670pcf.SCENE_POST_APP_LAUNCH.getValue()) {
            if (LLJIJIL.contains(Integer.valueOf(i)) && !z2) {
                str2 = "ComplianceHandler";
            } else {
                str2 = "PopupShowProcessorLocal";
            }
        }
        C1518600pcY c1518600pcY = new C1518600pcY(z, i, interfaceC1518910pd3, str2, this, str);
        C1518550pcT c1518550pcTLJIILIIL = LJIILIIL();
        c1518550pcTLJIILIIL.getClass();
        C1518550pcT.LIZLLL(c1518550pcTLJIILIIL, i, mapLIZIZ, c1518600pcY);
    }
}
