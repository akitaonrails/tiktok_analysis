package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.AbstractC1914420zuy;
import X.C01GW;
import X.C09JN;
import X.C0CCZ;
import X.C0CQ5;
import X.C0S78;
import X.C0WZX;
import X.C10EU;
import X.C1166680gSw;
import X.C11JF;
import X.C11N2;
import X.C11S5;
import X.C1483410ohn;
import X.C14EU;
import X.C1519180pdU;
import X.C1697650uHL;
import X.C1701940uOG;
import X.C1852080yIQ;
import X.C1914170zuZ;
import X.C1914750zvV;
import X.C1915330zwR;
import X.C1915350zwT;
import X.C1915360zwU;
import X.C1915390zwX;
import X.C1915400zwY;
import X.C1915410zwZ;
import X.C1915950zxR;
import X.C19476611Hw;
import X.C20123713oZ;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C286090BJf;
import X.C446490Hf5;
import X.C452501pT;
import X.C722910SXh;
import X.C844470XAv;
import X.EnumC1518670pcf;
import X.EnumC1914300zum;
import X.InterfaceC1519200pdW;
import X.InterfaceC1914540zvA;
import Y.AfS171S0100000_2;
import Y.AfS33S0210000_13;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.ConsentAcceptanceResponse;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.business.policynotice.PNSPostAppLaunchConfigTask;
import com.ss.android.ugc.aweme.compliance.business.policynotice.api.PolicyNoticeApi;
import com.ss.android.ugc.aweme.compliance.business.policynotice.ui.TTKDSABottomUI;
import com.ss.android.ugc.aweme.compliance.business.policynotice.ui.UniversalPopupPanelUI;
import com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSHuDeviceConsentUI;
import com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSKrDeviceConsentNewUI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlockElement;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.ThreadMode;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes29.dex */
public final class PolicyNoticeServiceImpl implements IPolicyNoticeService {
    public static String LJIILIIL = "";
    public static final List<String> LJIILJJIL = Collections.singletonList("why_this_video");
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new C1915390zwX());
    public final C01GW LJFF = C452501pT.LIZIZ(new C1915410zwZ());
    public final C01GW LJI = C452501pT.LIZIZ(new C1915360zwU());
    public C1915350zwT LJII;
    public final C1519180pdU LJIIIIZZ;
    public C11JF LJIIIZ;
    public C11JF LJIIJ;
    public boolean LJIIJJI;
    public final C1915330zwR LJIIL;

    public static long LJIIIZ() {
        C844470XAv.LIZ.getClass();
        long jLJ = C844470XAv.LJ();
        try {
            for (String str : (String[]) a0.LJJLIIIJILLIZJL(C844470XAv.LIZJ(), new String[]{e3.d}, 0, 6).toArray(new String[0])) {
                jLJ = CastIntegerProtector.valueOf(str).longValue() + (((long) 100) * jLJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jLJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final C1914170zuZ LIZ() {
        if (this.LIZJ) {
            return (C1914170zuZ) this.LJ.getValue();
        }
        this.LIZJ = true;
        Object value = this.LJ.getValue();
        C1915330zwR c1915330zwR = this.LJIIL;
        C1519180pdU c1519180pdU = this.LJIIIIZZ;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enable_popup_same_task", ((Boolean) C286090BJf.LIZ.getValue()).booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("tux_dialog_style_upgrade", String.valueOf(((Number) C1697650uHL.LIZ.getValue()).intValue()));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        AbstractC1914420zuy abstractC1914420zuy = (AbstractC1914420zuy) this.LJFF.getValue();
        value.getClass();
        C1914170zuZ.LIZIZ(c1915330zwR, c1519180pdU, mapLJIIIIZZ, false, abstractC1914420zuy);
        C1914170zuZ.LIZLLL(TTKDSABottomUI.class, "dsa_bottom");
        C1914170zuZ.LIZLLL(PNSHuDeviceConsentUI.class, "consent_hu");
        C1914170zuZ.LIZLLL(UniversalPopupPanelUI.class, EnumC1914300zum.PANEL.getValue());
        C1914170zuZ.LJIIJ.put("image_on_image_lr", new InterfaceC1914540zvA() { // from class: X.0zv9
            @Override // X.InterfaceC1914540zvA
            public final AbstractC1914480zv4 LIZ(Context context, InterfaceC1914580zvE interfaceC1914580zvE, UniversalPopupBlock universalPopupBlock) {
                return new AbstractC1914480zv4(context, interfaceC1914580zvE, universalPopupBlock) { // from class: X.0zv8
                    @Override // X.AbstractC1914480zv4
                    public final FrameLayout LIZ() {
                        FrameLayout frameLayout = new FrameLayout(this.LIZ);
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.c4b, frameLayout, true);
                        UniversalPopupBlockElement universalPopupBlockElement = this.LIZJ.elements.get("left_image");
                        String str = universalPopupBlockElement != null ? universalPopupBlockElement.subtype : null;
                        UniversalPopupBlockElement universalPopupBlockElement2 = this.LIZJ.elements.get("right_image");
                        String str2 = universalPopupBlockElement2 != null ? universalPopupBlockElement2.subtype : null;
                        C19RC c19rc = (C19RC) viewTd.findViewById(R.id.mj_);
                        C19RC c19rc2 = (C19RC) viewTd.findViewById(R.id.tjz);
                        UniversalPopupBlockElement universalPopupBlockElement3 = this.LIZJ.elements.get("left_image");
                        String str3 = universalPopupBlockElement3 != null ? universalPopupBlockElement3.iconUrl : null;
                        UniversalPopupBlockElement universalPopupBlockElement4 = this.LIZJ.elements.get("right_image");
                        String str4 = universalPopupBlockElement4 != null ? universalPopupBlockElement4.iconUrl : null;
                        c19rc.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        c19rc2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        LIZLLL(c19rc, str, str3);
                        LIZLLL(c19rc2, str2, str4);
                        return frameLayout;
                    }

                    public final void LIZLLL(C19RC c19rc, String str, String str2) {
                        if (Intrinsics.LJFF(str, "icon")) {
                            if (Intrinsics.LJFF(str2, "Like_Eye")) {
                                try {
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_3pt_heart_eye_slash;
                                    c419910GdJ.LJ = Integer.valueOf(R.attr.u_);
                                    c19rc.setImageDrawable(c419910GdJ.LIZ(this.LIZ));
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return;
                                }
                            }
                            return;
                        }
                        if (Intrinsics.LJFF(str, "image") && str2 != null && str2.length() != 0) {
                            try {
                                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                                c1331670kl3LJIIIZ.LJJI(c19rc);
                                C786410Ut5.h3(c1331670kl3LJIIIZ);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Error loading image from URL: ");
                                sbLIZ.append(str2);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                    }
                };
            }
        });
        return (C1914170zuZ) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LIZIZ() {
        LJIILIIL = "";
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final Object LIZJ() {
        return this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LJ() {
        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
        if (tTKUserCommunicationService != null) {
            tTKUserCommunicationService.LJIIJJI(EnumC1518670pcf.SCENE_POST_APP_LAUNCH.getValue(), null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final C0CCZ LJI() {
        return new PNSPostAppLaunchConfigTask();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0pdU] */
    public PolicyNoticeServiceImpl() {
        C0S78.LIZJ(new C1915400zwY(this), true);
        this.LJIIIIZZ = new InterfaceC1519200pdW() { // from class: X.0pdU
            @Override // X.InterfaceC1519200pdW
            public final void LIZ() {
            }

            @Override // X.InterfaceC1519200pdW
            public final void LIZIZ(Map map, final AwS156S0400000_28 awS156S0400000_28) {
                final String strLIZIZ;
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                final String str = (String) linkedHashMap.get("content_popup_id");
                if (str == null) {
                    str = "contentPopupIDEmpty";
                }
                String str2 = (String) linkedHashMap.get("business");
                if (str2 == null) {
                    str2 = "businessEmpty";
                }
                if (((Boolean) C276240AsA.LIZ.getValue()).booleanValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pns_compliance_universal_popup_");
                    sbLIZ.append("-1");
                    sbLIZ.append('_');
                    sbLIZ.append(str2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "compliance_universal";
                }
                ((IPipFeedService) ServiceManager.get().getService(IPipFeedService.class)).LJIJI();
                AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                Activity activityLIZIZ = null;
                if (abstractC1387200mCcLIZIZ != null) {
                    activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                }
                if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                    if (C294570Bgd.LIZ()) {
                        PopupManager.LJIJ(new C1852080yIQ(new AwS567S0100000_23(awS156S0400000_28, 73), activityLIZIZ, str), strLIZIZ, new C1668306g5("pns_compliance_policy_notice_trigger"));
                        return;
                    } else {
                        PopupManager.LJIJI(new C1852080yIQ(new AwS567S0100000_23(awS156S0400000_28, 74), activityLIZIZ, str), true);
                        return;
                    }
                }
                C1906580ziK.LIZJ().LJIIJ().LJL(C11S5.LIZIZ).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0pdV
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("PolicyNoticeServiceImpl@4917.displayInterceptor$1$onReadyDisplay$2$observable$1");
                        Activity activityLIZIZ2 = ((AbstractC1387200mCc) obj).LIZIZ();
                        if ((activityLIZIZ2 instanceof Activity) && activityLIZIZ2 != null) {
                            String str3 = str;
                            String str4 = strLIZIZ;
                            Function0<Unit> function0 = awS156S0400000_28;
                            if (C294570Bgd.LIZ()) {
                                PopupManager.LJIJ(new C1852080yIQ(new AwS567S0100000_23(function0, (Function0<Unit>) 75), activityLIZIZ2, str3), str4, new C1668306g5("pns_compliance_policy_notice_trigger"));
                            } else {
                                PopupManager.LJIJI(new C1852080yIQ(new AwS567S0100000_23(function0, (Function0<Unit>) 76), activityLIZIZ2, str3), true);
                            }
                        }
                        C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.displayInterceptor$1$onReadyDisplay$2$observable$1");
                    }
                });
            }
        };
        this.LJIIL = new C1915330zwR(this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LIZLLL() {
        if (LIZ() != null) {
            C1914170zuZ.LIZLLL(PNSKrDeviceConsentNewUI.class, "consent_kr");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final String getBusiness() {
        int i = C1915950zxR.LIZ[ComplianceServiceProvider.LJIILJJIL().LJIIL().ordinal()];
        return i != 1 ? i != 2 ? "row_dnu_consent_box" : "eu_dnu_consent_box" : "kr_dnu_consent_box";
    }

    public static String LJIIIIZZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4ycgRyXuKk15PvPSN8eLzqDkyRIiKJEDEjTvEo5R0v548nHI9ELOcXam6Gc=", null));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4ycgRyXuKk15PvPSN8eLzqDkyRIiKJEDEjTvEo5R0v548nHI9ELOcXam6Gc=", null));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Oh8, X.0zwT] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LJFF(Context context) {
        String strLJIIIIZZ;
        String str;
        Long lValueOf = null;
        try {
            strLJIIIIZZ = LJIIIIZZ(context.getContentResolver());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLJIIIIZZ = null;
        }
        SharedPreferences sharedPreferencesLIZIZ = AutobackupService.LIZJ().LIZIZ();
        long j = sharedPreferencesLIZIZ.getLong("last_acceptance_time", -1L);
        String string = sharedPreferencesLIZIZ.getString("last_acceptance_country_code", null);
        int i = C1915950zxR.LIZ[ComplianceServiceProvider.LJIILJJIL().LJIIL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "row_dnu_consent_box";
                } else {
                    str = "us_dnu_consent_box";
                }
            } else {
                str = "eu_dnu_consent_box";
            }
        } else {
            str = "kr_dnu_consent_box";
        }
        if (string != null) {
            strLJIIIIZZ = null;
        }
        C1915350zwT c1915350zwT = this.LJII;
        if (c1915350zwT != null) {
            c1915350zwT.dispose();
        }
        C0CQ5 c0cq5 = PolicyNoticeApi.LIZ;
        if (j != -1) {
            lValueOf = Long.valueOf(j);
        }
        long jLJIIIZ = LJIIIZ();
        String lowerCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase().toLowerCase(Locale.ROOT);
        c0cq5.getClass();
        C19476611Hw c19476611HwLJL = C0CQ5.LIZIZ.consentAcceptance(strLJIIIIZZ, lValueOf, string, jLJIIIZ, str, lowerCase).LJL(C11S5.LIZ());
        ?? r0 = new C11N2<ConsentAcceptanceResponse>() { // from class: X.0zwT
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) {
                ConsentAcceptanceResponse consentAcceptanceResponse = (ConsentAcceptanceResponse) obj;
                Keva.getRepo("tpc_consent").storeBoolean("ug_should_show", consentAcceptanceResponse.shouldShow);
                Keva.getRepo("tpc_consent").storeBoolean("ug_record_found", consentAcceptanceResponse.recordFound);
            }
        };
        c19476611HwLJL.LIZIZ(r0);
        this.LJII = r0;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPhlActivityDestroyed(C446490Hf5 c446490Hf5) {
        if (this.LIZLLL) {
            this.LIZLLL = false;
            PopupManager.LIZJ(C1852080yIQ.class);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPlayStatusEvent(C722910SXh c722910SXh) {
        int i = c722910SXh.LIZJ;
        if (i != 1) {
            if (i == 2) {
                this.LIZ = false;
                return;
            }
            return;
        }
        this.LIZ = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWhyThisVideResumeEvent(C1166680gSw c1166680gSw) {
        this.LIZIZ = false;
        if (!this.LIZ && this.LJIIJJI && C1483410ohn.LJLJJI().isPaused()) {
            C1483410ohn.LJLJJI().LJIILLIIL();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWhyThisVideoPauseEvent(C1914750zvV c1914750zvV) {
        this.LIZIZ = true;
        if (C1483410ohn.LJLJJI().isPlaying()) {
            C1483410ohn.LJLJJI().LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void LJII(final String str, final String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, Function0<Unit> function0, final Function0<Unit> function02) {
        boolean z;
        String lowerCase;
        int iIntValue = 0;
        if (!Intrinsics.LJFF(str, "kr_dnu_consent_box") && !Intrinsics.LJFF(str, "eu_dnu_consent_box") && !Intrinsics.LJFF(str, "us_dnu_consent_box") && !Intrinsics.LJFF(str, "row_dnu_consent_box")) {
            z = false;
        } else {
            z = true;
        }
        Long lValueOf = null;
        if (z) {
            lowerCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase().toLowerCase(Locale.ROOT);
            lValueOf = Long.valueOf(LJIIIZ());
        } else {
            lowerCase = null;
        }
        C0CQ5 c0cq5 = PolicyNoticeApi.LIZ;
        if (num2 != null) {
            iIntValue = num2.intValue();
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        c0cq5.getClass();
        C0CQ5.LIZIZ.policyNoticeApprove(str, str2, str3, str4, num, numValueOf, lowerCase, lValueOf).LJL(C11S5.LIZ()).LJJIJIIJIL(new AfS33S0210000_13(bool, z, this, 2)).LJJIJIIJI(new C09JN() { // from class: X.05z7
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PolicyNoticeServiceImpl@4917.approvePoliceNotice$2");
                C1531605z8 c1531605z8 = C1531605z8.LIZ;
                String message = ((Throwable) obj).getMessage();
                String str5 = "";
                if (message == null) {
                    message = "";
                }
                String str6 = str;
                String str7 = str2;
                c1531605z8.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (str6 == null) {
                    str6 = "";
                }
                c2344009Gk.LJIIIIZZ("business", str6);
                if (str7 != null) {
                    str5 = str7;
                }
                c2344009Gk.LJIIIIZZ("version", str5);
                c2344009Gk.LJIIIIZZ("error", message);
                c2344009Gk.LIZJ(2, "type");
                C20684815ws.LJIILLIIL("tns_general_failure", c2344009Gk.LIZ);
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
                C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.approvePoliceNotice$2");
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(function0, 4), new C09JN() { // from class: X.05z9
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PolicyNoticeServiceImpl@4917.approvePoliceNotice$4");
                C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.approvePoliceNotice$4");
            }
        });
    }
}
