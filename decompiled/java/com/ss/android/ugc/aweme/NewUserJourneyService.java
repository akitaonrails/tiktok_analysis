package com.ss.android.ugc.aweme;

import X.AbstractC1387200mCc;
import X.AbstractC738140SxQ;
import X.ActivityC836150Wr7;
import X.C07MK;
import X.C0C64;
import X.C0WZX;
import X.C0XZA;
import X.C10H5;
import X.C10HC;
import X.C10MN;
import X.C10MP;
import X.C10MU;
import X.C10NH;
import X.C10PO;
import X.C10Q2;
import X.C10R5;
import X.C10RS;
import X.C10RV;
import X.C10RW;
import X.C10S0;
import X.C10SD;
import X.C10SE;
import X.C10SH;
import X.C10SI;
import X.C10SM;
import X.C10SV;
import X.C10TG;
import X.C10TO;
import X.C10UE;
import X.C1150504el;
import X.C13IQ;
import X.C13LE;
import X.C1514430pVp;
import X.C1701330uNH;
import X.C1906580ziK;
import X.C19240310Oz;
import X.C19241310Pj;
import X.C19244710Qr;
import X.C19244810Qs;
import X.C19245710Rb;
import X.C19247310Rr;
import X.C19247510Rt;
import X.C19247610Ru;
import X.C19247710Rv;
import X.C19248110Rz;
import X.C19248510Sd;
import X.C19248710Sf;
import X.C19249810Sq;
import X.C19254610Um;
import X.C19EG;
import X.C20684815ws;
import X.C2104108Md;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C836180WrA;
import X.C844470XAv;
import X.EnumC1589930rTb;
import X.InterfaceC214902198i;
import X.InterfaceC313560CQw;
import X.InterfaceC591620NIi;
import X.InterfaceC800130Va7;
import X.InterfaceC814740Vxg;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.keva.Keva;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.IAutoLoginService;
import com.ss.android.ugc.aweme.IPopupMonitorApiService;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.assem.NewUserGuideAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import com.ss.android.ugc.aweme.journey.INewUserJourneyAppDiffService;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.OnboardingRequest;
import com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme.NewUserJourneyFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushapi.model.SilentMsg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class NewUserJourneyService implements INewUserJourneyService {
    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final C13IQ<? extends AbstractC738140SxQ> LJJ() {
        return C13LE.LIZ(NewUserGuideAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJIIZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final String LJJIJIL() {
        return "reorder_new_journey_front";
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJJIZ() {
        C19245710Rb.LIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LIZLLL() {
        C10MP.LIZ.getClass();
        if (C10MP.LIZJ) {
            return false;
        }
        if (C1514430pVp.LIZLLL().booleanValue()) {
            return Keva.getRepo("new_user_journey").getBoolean("did_finish_nuj", false);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJFF() {
        ((Boolean) C19247610Ru.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJI() {
        if (NewUserJourneyActivity.LLJJIJI) {
            return false;
        }
        return ((Boolean) C19247610Ru.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJIIIIZZ() {
        IPushApi iPushApi = (IPushApi) PluggableExtentionKt.pluggableSpi$default(IPushApi.class, false, false, false, 14, null);
        if (iPushApi != null) {
            iPushApi.registerSilentMsgHandler(new InterfaceC814740Vxg() { // from class: X.0Vyq
                @Override // X.InterfaceC814740Vxg
                public final int[] LIZ() {
                    return new int[]{EnumC814940Vy0.FEED_CACHE.getSceneId()};
                }

                @Override // X.InterfaceC814740Vxg
                public final void LIZIZ(SilentMsg silentMsg) {
                    try {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onReceiveSilentMessage: ");
                        sbLIZ.append(silentMsg);
                        C2188811AlT.LIZIZ(sbLIZ);
                        Keva keva = C815480Vys.LIZ;
                        if (C1906580ziK.LJI() && C815470Vyr.LIZ().enable) {
                            Keva keva2 = C815480Vys.LIZ;
                            long j = keva2.getLong("last_refresh_time", 0L);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (jCurrentTimeMillis - j > C815470Vyr.LIZ().fetchIntervalHour * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                                C0NET.LIZ.getClass();
                                C0NET.LJIJI(true);
                                keva2.storeLong("last_refresh_time", jCurrentTimeMillis);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onReceiveSilentMessage error: ");
                        sbLIZ2.append(e.getMessage());
                        C1720106oR.LIZ("silent_push", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJIIJ() {
        C10SH.LIZ.getClass();
        IPluginService.PluginData pluginDataLIZ = C10SH.LIZ();
        if (pluginDataLIZ != null && Intrinsics.LJFF(pluginDataLIZ.showConfig.shouldShow, Boolean.TRUE)) {
            C10SH.LIZIZ();
        }
        Keva keva = C10R5.LJIIJ;
        if (!keva.contains("latest_step") || keva.contains("is_second_launch")) {
            keva.storeBoolean("is_second_launch", false);
        } else {
            keva.storeBoolean("is_second_launch", true);
            if (C10HC.LIZ()) {
                String string = keva.getString("latest_step", "");
                boolean z = Keva.getRepo("new_user_journey").getBoolean("did_finish_nuj", false);
                C10H5 c10h5 = C10H5.NUJ_SKIPPED;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(!z ? 1 : 0, "is_nuj_skipped");
                c2344009Gk.LJIIIIZZ("last_step_before_app_kill", string);
                C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
            }
        }
        C0C64.LJIILLIIL().LJIJ(31744, 0, "dry_run_last_install_time", true);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIILL() {
        C19241310Pj.LIZ.getClass();
        return C10R5.LJIIJ.getInt("smart_push_pop_time", 0) == C10MN.NO_PUSH_POP_IN_NUJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final int LJIILLIIL() {
        C10MP.LIZ.getClass();
        return C10MP.LJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIJ() {
        C19248110Rz.LIZ.getClass();
        if (!C19248110Rz.LIZIZ) {
            return false;
        }
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        return !C10RS.LIZ().LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CQw, X.10UE] */
    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final InterfaceC313560CQw LJIJJ() {
        C10UE c10ue = C10SE.LIZ;
        if (c10ue != null) {
            return c10ue;
        }
        final boolean zBooleanValue = ((Boolean) C19247510Rt.LIZ.getValue()).booleanValue();
        ?? r0 = new InterfaceC313560CQw() { // from class: X.10UE
            @Override // X.InterfaceC313560CQw
            public final void LIZ() {
                ((IPopupMonitorApiService) ServiceManager.get().getService(IPopupMonitorApiService.class)).LIZJ().LJIIZILJ();
                InterfaceC313560CQw interfaceC313560CQwLIZ = C10UF.LIZ();
                if (interfaceC313560CQwLIZ != null) {
                    ((C10UG) interfaceC313560CQwLIZ).LIZ();
                }
                C1602860roS.LIZ.getClass();
                if (C1602860roS.LJ() && C123100dR.LIZ(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) && !C1601770rmh.LIZ && C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "nuj_force_flush_applog_exp", false) == 1) {
                    C0VY3.LIZJ(C10UH.LL);
                    C1601770rmh.LIZ = true;
                }
                IAutoLoginService iAutoLoginService = (IAutoLoginService) ServiceManager.get().getService(IAutoLoginService.class);
                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                if (iNewUserJourneyAppDiffService != null) {
                    iNewUserJourneyAppDiffService.LIZ();
                }
                if (!zBooleanValue && iAutoLoginService != null) {
                    iAutoLoginService.initOCLDataBeforeAutoLogin();
                }
                C10RP.LJI("hybrid_response");
                C0CQD.LIZ.getClass();
                if (C0CQD.LIZJ && !C0CQD.LIZIZ) {
                    C0CQD.LIZ();
                }
                IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
                if (iUgCommonService != null) {
                    iUgCommonService.LJII();
                }
                C10UI.LIZ = C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "df_preload_unify_exp", true, false);
                if (C10UI.LIZ()) {
                    Keva.getRepo("df_preload_unify_repo").storeBoolean("df_preload_unify_exp", C10UI.LIZ());
                }
                if (C1514430pVp.LIZLLL().booleanValue()) {
                    com.bytedance.ies.ugc.aweme.plugin.service.IPluginService iPluginService = (com.bytedance.ies.ugc.aweme.plugin.service.IPluginService) ServiceManager.get().getService(com.bytedance.ies.ugc.aweme.plugin.service.IPluginService.class);
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    iPluginService.LJJIIZI(0);
                }
            }

            @Override // X.InterfaceC313560CQw
            public final void LIZIZ() {
                C10UF.LIZ();
                IAutoLoginService iAutoLoginService = (IAutoLoginService) PluggableExtentionKt.pluggableSpi$default(IAutoLoginService.class, false, false, false, 14, null);
                INewUserJourneyAppDiffService iNewUserJourneyAppDiffService = (INewUserJourneyAppDiffService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyAppDiffService.class, false, false, false, 14, null);
                if (iNewUserJourneyAppDiffService != null) {
                    iNewUserJourneyAppDiffService.LIZ();
                }
                if (!zBooleanValue || iAutoLoginService == null) {
                    return;
                }
                iAutoLoginService.initOCLDataBeforeAutoLogin();
            }

            @Override // X.InterfaceC313560CQw
            public final void LIZJ(int i, String str) {
                InterfaceC313560CQw interfaceC313560CQwLIZ = C10UF.LIZ();
                if (interfaceC313560CQwLIZ != null) {
                    ((C10UG) interfaceC313560CQwLIZ).LIZJ(i, str);
                }
            }
        };
        C10SE.LIZ = r0;
        return r0;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIJJLI() {
        C19244810Qs.LIZ.getClass();
        return C19244810Qs.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJI() {
        C10MP.LIZ.getClass();
        return C10MP.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJJII() {
        C10MP.LIZ.getClass();
        C10MP.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final InterfaceC214902198i LJJIII() {
        NewUserJourneyFragment newUserJourneyFragment = new NewUserJourneyFragment();
        newUserJourneyFragment.setArguments(null);
        return newUserJourneyFragment;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJIIJZLJL() {
        C844470XAv.LIZ.getClass();
        return C2104108Md.LIZLLL(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJIIZI() {
        C10MP.LIZ.getClass();
        return Intrinsics.LJFF(C10MP.LIZ(), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final InterfaceC800130Va7 LJJIJ() {
        return OnboardingRequest.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final int LJJIJIIJI() {
        C10PO.LIZ.getClass();
        return C10PO.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final C10R5 LJJJJ() {
        return new C10R5() { // from class: X.10Qt
            public final C01GW LJIIJJI = C452501pT.LIZIZ(new C10RK());

            @Override // X.C10R5
            public final int LIZJ() {
                return 1;
            }

            @Override // X.C10R5
            public final String LJ() {
                return "new";
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[ORIG_RETURN, RETURN] */
            @Override // X.C10R5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZIZ() {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService> r0 = com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService r0 = (com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService) r0
                    int r3 = r0.LJIJI()
                    r1 = 1
                    r2 = 0
                    r0 = 2
                    if (r3 != r1) goto L20
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L19:
                    if (r0 == 0) goto L27
                    int r2 = r0.intValue()
                L1f:
                    return r2
                L20:
                    if (r3 == 0) goto L27
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                    goto L19
                L27:
                    X.01GW r0 = r4.LJIIJJI
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L46
                    X.10MP r0 = X.C10MP.LIZ
                    r0.getClass()
                    java.lang.Boolean r1 = X.C10MP.LIZ()
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    if (r0 == 0) goto L1f
                L46:
                    r2 = 2
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19244910Qt.LIZIZ():int");
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
            @Override // X.C10R5
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C19245810Rc LIZLLL(android.content.Context r13, java.lang.Boolean r14, X.C10RF r15, java.lang.Boolean r16) {
                /*
                    r12 = this;
                    int[] r1 = X.C10RE.LIZ
                    r15.ordinal()
                    int r0 = r15.ordinal()
                    r1 = r1[r0]
                    r0 = 1
                    if (r1 == r0) goto L60
                    r0 = 2
                    if (r1 == r0) goto L60
                    r0 = 3
                    if (r1 != r0) goto L64
                    r3 = 2131850702(0x7f1175ce, float:1.9334974E38)
                L17:
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r14, r0)
                    if (r0 == 0) goto L5c
                    r2 = 2131836211(0x7f113d33, float:1.9305582E38)
                L22:
                    boolean r0 = com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment.LIZ()
                    if (r0 == 0) goto L58
                    com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment.LIZ()
                    X.01GW r0 = com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment.LJ
                    java.lang.Object r0 = r0.getValue()
                    com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment$ExperimentConfig r0 = (com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment.ExperimentConfig) r0
                    boolean r0 = r0.changeSkipButtonText
                    if (r0 == 0) goto L58
                    r1 = 2131822790(0x7f1108c6, float:1.9278361E38)
                L3a:
                    X.10Rc r4 = new X.10Rc
                    r0 = 2131838027(0x7f11444b, float:1.9309266E38)
                    java.lang.String r5 = r13.getString(r0)
                    java.lang.String r6 = r13.getString(r3)
                    java.lang.String r7 = r13.getString(r2)
                    java.lang.String r8 = r13.getString(r1)
                    r10 = 0
                    r11 = 80
                    r9 = r16
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                    return r4
                L58:
                    r1 = 2131838034(0x7f114452, float:1.930928E38)
                    goto L3a
                L5c:
                    r2 = 2131838032(0x7f114450, float:1.9309276E38)
                    goto L22
                L60:
                    r3 = 2131838033(0x7f114451, float:1.9309278E38)
                    goto L17
                L64:
                    X.07lC r0 = new X.07lC
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19244910Qt.LIZLLL(android.content.Context, java.lang.Boolean, X.10RF, java.lang.Boolean):X.10Rc");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final List<String> LJJJJI() {
        C10MU.LIZ.getClass();
        int iIntValue = ((Number) C10MU.LIZIZ.getValue()).intValue();
        return Collections.singletonList(iIntValue == 0 ? "74998356" : iIntValue == 1 ? "74998357" : "");
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final int LIZ() {
        if (C1514430pVp.LIZLLL().booleanValue()) {
            return Keva.getRepo("new_user_journey").getInt("mandatory_login_status", 0);
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJIILIIL() {
        if (C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        C19244810Qs.LIZ.getClass();
        C19244810Qs.LIZIZ("cold_launch", true);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> LJJJIL() {
        return C836180WrA.LIZ() ? NewUserJourneyContainerActivity.class : NewUserJourneyActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final InterfaceC591620NIi LIZJ() {
        return C19244710Qr.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final C10TO LJ() {
        return C10RW.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final C10TG LJII() {
        return C19248510Sd.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final C0XZA LJIIJJI() {
        return new C0XZA() { // from class: X.10Gx
            @Override // X.C0XZA
            public final boolean LIZ() {
                return ((Boolean) C259450AEt.LIZ.getValue()).booleanValue();
            }

            @Override // X.C0XZA
            public final void LIZIZ() {
                if (C1514430pVp.LIZLLL().booleanValue()) {
                    C19219110Gv.LIZ.getClass();
                    C19219110Gv.LIZIZ = true;
                    C19219110Gv.LIZ();
                }
            }

            @Override // X.C0XZA
            public final C10RP LIZJ() {
                return C10RP.LIZ;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final C10SM LJJIL() {
        return C10SI.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LIZIZ(C19247310Rr c19247310Rr) {
        for (C10S0 c10s0 : (ArrayList) C19245710Rb.LIZJ) {
            if (c19247310Rr.LIZ) {
                C19249810Sq c19249810Sq = c19247310Rr.LIZIZ;
                if (c19249810Sq != null) {
                    c10s0.LIZ(c19249810Sq);
                }
            } else if (c19247310Rr.LIZJ != null) {
                c10s0.LIZJ();
            }
        }
        C19245710Rb.LIZIZ = c19247310Rr;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIIIZ(String str) {
        int iLJJIJIIJI = C19254610Um.LIZIZ.LJJIJIIJI();
        String str2 = C19240310Oz.LIZLLL;
        if (iLJJIJIIJI == 2 && !Intrinsics.LJFF(str2, "deep_link")) {
            return !((List) C19247710Rv.LIZ.getValue()).contains(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> LJIIL(Intent intent) {
        intent.putExtra("redirect_from_main", true);
        return ActivityC836150Wr7.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIILJJIL(SignUpOrLoginActivity signUpOrLoginActivity) {
        INUJRevampService iNUJRevampService = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null);
        if (iNUJRevampService == null || !iNUJRevampService.LIZ(false) || C10NH.LJFF) {
            return false;
        }
        INUJRevampService iNUJRevampService2 = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null);
        if (iNUJRevampService2 != null && iNUJRevampService2.LIZIZ()) {
            return false;
        }
        return LJIJI(signUpOrLoginActivity);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJIJI(BaseActivity baseActivity) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length;
        int i = 0;
        while (true) {
            abstractC1387200mCc = null;
            if (i >= length) {
                break;
            }
            abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
            if (abstractC1387200mCc.LIZIZ() instanceof NewUserJourneyActivity) {
                break;
            }
            i++;
        }
        if (abstractC1387200mCc != null) {
            Intent intent = new Intent(baseActivity, (Class<?>) NewUserJourneyActivity.class);
            intent.setFlags(131072);
            LJJJJIZL(baseActivity, intent);
            C786410Ut5.ae(0, baseActivity, 0);
            return true;
        }
        for (AbstractC1387200mCc abstractC1387200mCc2 : C1906580ziK.LJII()) {
            if (abstractC1387200mCc2.LIZIZ() instanceof NewUserJourneyContainerActivity) {
                Intent intent2 = new Intent(baseActivity, (Class<?>) NewUserJourneyContainerActivity.class);
                intent2.setFlags(131072);
                LJJJJIZL(baseActivity, intent2);
                C786410Ut5.ae(0, baseActivity, 0);
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> LJJIFFI(Intent intent) {
        intent.putExtra("redirected_from_deeplink", true);
        if (C836180WrA.LIZ()) {
            return NewUserJourneyContainerActivity.class;
        }
        return NewUserJourneyActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final Class<? extends Activity> LJJIIJ(Intent intent) {
        intent.putExtra("redirected_from_deeplink", true);
        intent.putExtra("redirect_is_app_link", true);
        if (C836180WrA.LIZ()) {
            return NewUserJourneyContainerActivity.class;
        }
        return NewUserJourneyActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final List<String> LJJIJIIJIL(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJIJLIJ(Activity activity) {
        String str = NewUserJourneyActivity._pnsPageId;
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10RS.LIZ();
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        if ((iNewUserJourneyService == null || iNewUserJourneyService.LJJJ()) && (!false) && C1514430pVp.LIZLLL().booleanValue() && !activity.getIntent().getBooleanExtra("new_user_journey", false) && C10RS.LIZ().LIZJ() == 1 && !NewUserJourneyActivity.LLJJIJI) {
            return true;
        }
        return false;
    }

    public static void LJJJJIZL(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KMStdKrd2SCoV+CBQx2BvNn0Q5p5Og==", null));
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJJIJL(Activity activity, Intent intent) {
        C19248110Rz.LIZ.getClass();
        if (intent != null && activity != null && intent.getBooleanExtra("reorder_new_journey_front", false) && !Keva.getRepo("new_user_journey").getBoolean("disable_reorder_new_journey", false)) {
            Intent intent2 = C19248110Rz.LIZJ;
            if (intent2 != null) {
                intent2.setFlags(131072);
                Intent intent3 = C19248110Rz.LIZJ;
                if (intent3 != null) {
                    intent3.putExtra("pre_create_main", true);
                }
                Intent intent4 = C19248110Rz.LIZJ;
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent4, "Context_startActivity_1");
                C1701330uNH.LIZ(intent4, activity);
                C2204961BRm.LJIILLIIL(activity, intent4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpJn7I8nPQTjkYENtdnDM80z+LAuBPHSo=", null));
            } else {
                if (C836180WrA.LIZ()) {
                    intent.setClassName(activity, NewUserJourneyContainerActivity.class.getName());
                } else {
                    intent.setClassName(activity, NewUserJourneyActivity.class.getName());
                }
                intent.setFlags(131072);
                intent.putExtra("pre_create_main", true);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpJn7I8nPQTjkYENtdnDM80z+LAuBPHSo=", null));
            }
            C07MK.LIZ.getClass();
            if (C07MK.LIZ()) {
                C19248110Rz.LIZIZ = true;
                C786410Ut5.y3(activity.getWindow().getDecorView().getViewTreeObserver(), C10SD.LL);
            }
        }
        Keva.getRepo("new_user_journey").storeBoolean("disable_reorder_new_journey", true);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final boolean LJJJI(C19EG c19eg, String str) {
        return C10RV.LIZ(c19eg, str);
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJIL(String str, String str2, String str3, long j, String str4, boolean z) {
        long j2;
        Keva keva = C10Q2.LIZ;
        keva.storeInt("mandatory_login_status", 2);
        if (keva.contains("mandatory_login_shown_millis")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (keva.contains("mandatory_login_shown_millis")) {
                j2 = jCurrentTimeMillis - keva.getLong("mandatory_login_shown_millis", jCurrentTimeMillis);
            } else {
                j2 = -1;
            }
            keva.erase("mandatory_login_shown_millis");
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", str3);
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("enter_type", str4);
            c2344009Gk.LIZJ(z ? 1 : 0, "is_register");
            c2344009Gk.LIZJ(0, "error_code");
            c2344009Gk.LIZLLL(j, "user_id");
            c2344009Gk.LJIIIIZZ("platform", str);
            if (j2 != -1) {
                c2344009Gk.LIZLLL(j2, "duration");
            }
            C20684815ws.LJIILLIIL("onboarding_forced_login_success", c2344009Gk.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.journey.INewUserJourneyService
    public final void LJIIZILJ(Activity activity, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Intent intent) throws Throwable {
        Intent intent2;
        IMainService iMainService;
        Intent intent3 = intent;
        if (z5 && C1514430pVp.LIZLLL().booleanValue()) {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            if (C10RS.LIZ().LIZ() && (iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null)) != null && iMainService.isMoveMainTrackersEnabled() && iMainService.isNUJSingleActivityExpDeeplinkEnabled(activity)) {
                Class<? extends Activity> splashActivityClass = C19248710Sf.LIZIZ.getSplashActivityClass();
                if ((splashActivityClass instanceof Class) && splashActivityClass != null) {
                    if (!z6 || intent3 == null) {
                        intent3 = activity.getIntent();
                    }
                    Uri data = intent3.getData();
                    Intent intent4 = new Intent(activity, splashActivityClass);
                    intent4.setData(data);
                    intent4.putExtra("from_main", false);
                    intent4.putExtra("from_deeplink", true);
                    intent4.putExtra("from_short_deeplink", z3);
                    intent4.putExtra("from_deeplink_need_mall", z4);
                    intent4.putExtra("deeplink_intent_about_welcome_screen", intent3);
                    intent4.addFlags(335544320);
                    LJJJJIZL(activity, intent4);
                    C786410Ut5.ae(0, activity, 0);
                    if (!z6 && !activity.isFinishing()) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        String str = NewUserJourneyActivity._pnsPageId;
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.NEW_USER);
        C1150504el.LIZ().LJIIIIZZ = false;
        if (C836180WrA.LIZ()) {
            intent2 = new Intent(activity, (Class<?>) NewUserJourneyContainerActivity.class);
        } else {
            intent2 = new Intent(activity, (Class<?>) NewUserJourneyActivity.class);
        }
        intent2.putExtra("from_main", z);
        intent2.putExtra("from_deeplink", z2);
        intent2.putExtra("from_short_deeplink", z3);
        intent2.putExtra("from_deeplink_need_mall", z4);
        if (!z) {
            if (z6) {
                intent2.putExtra("deeplink_intent_about_welcome_screen", intent3);
            } else {
                intent2.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
            }
            if ((!z2 || activity.getIntent() != null) && !z6) {
                activity.finish();
            }
        }
        C786410Ut5.ae(0, activity, 0);
        if (z6) {
            NewUserJourneyActivity.LLJJIII = intent2;
            return;
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent2, activity);
        C2204961BRm.LJIIZILJ(18, activity, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpJn7I7W/ATh0SEvtWljgZOKCi6kr9IA==", null));
    }
}
