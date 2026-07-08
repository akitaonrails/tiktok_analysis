package kotlin.jvm.internal;

import X.AbstractC1896090zRP;
import X.AbstractC1899090zWF;
import X.AnonymousClass0956;
import X.AnonymousClass1087;
import X.C09AY;
import X.C103L;
import X.C11NZ;
import X.C11S5;
import X.C1331660kl2;
import X.C1548820qPI;
import X.C1619720sFe;
import X.C1701940uOG;
import X.C1871910yoP;
import X.C1878830yzZ;
import X.C1893550zNJ;
import X.C1893790zNh;
import X.C1899920zXa;
import X.C1899940zXc;
import X.C1899950zXd;
import X.C1913610ztf;
import X.C1913640zti;
import X.C1913660ztk;
import X.C1913700zto;
import X.C19322810ig;
import X.C19336110kp;
import X.C19336510kt;
import X.C19EG;
import X.C2188811AlT;
import X.C2325271G0f;
import X.C262100zr;
import X.C786410Ut5;
import X.C991900bv2;
import X.C991910bv3;
import X.EnumC1899960zXe;
import X.EnumC1913590ztd;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1389750mGj;
import X.InterfaceC1896270zRh;
import X.InterfaceC1896280zRi;
import X.InterfaceC1913620ztg;
import X.InterfaceC2281081EQg;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.incentive.taskevent.watchvideo.WatchVideoServiceImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.api.model.AttributionBody;
import com.bytedance.touchpoint.api.model.AttributionResponse;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.compliance.business.universalpopup.ui.PNSKrDeviceConsentNewUI;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offlinepush.worker.BaseOfflinePushWork;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.GameLiveBottomBarAssemTriggerV2;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class AwS177S1100000_28 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS177S1100000_28 awS177S1100000_28) {
        if (!((ArrayList) ((WatchVideoServiceImpl) awS177S1100000_28.l1).LIZLLL).isEmpty()) {
            for (AbstractC1899090zWF abstractC1899090zWF : (ArrayList) ((WatchVideoServiceImpl) awS177S1100000_28.l1).LIZLLL) {
                if (Intrinsics.LJFF(abstractC1899090zWF.LL.taskEventKey, awS177S1100000_28.s0)) {
                    abstractC1899090zWF.LJ();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS177S1100000_28 awS177S1100000_28) {
        C19322810ig c19322810ig = (C19322810ig) awS177S1100000_28.l1;
        c19322810ig.LLILLJJLI = awS177S1100000_28.s0;
        c19322810ig.LL = true;
        c19322810ig.LIZIZ(c19322810ig.LLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS177S1100000_28 awS177S1100000_28) {
        String appLanguage;
        C1913640zti c1913640zti = (C1913640zti) awS177S1100000_28.l1;
        String str = awS177S1100000_28.s0;
        c1913640zti.getClass();
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LJFF(new C1913610ztf(EnumC1913590ztd.NUJ_CONSENT.getValue(), str, false, false, false, null, false, 124));
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1495818221) {
            if (iHashCode != 623683781) {
                if (iHashCode == 2064195680 && str.equals("terms-and-conditions-kr")) {
                    c1913640zti.LJ("https://www.tiktok.com/legal/terms-and-conditions-kr?lang=ko-KR");
                }
            } else if (str.equals("terms-of-service")) {
                c1913640zti.LJ("https://www.tiktok.com/legal/terms-of-service?lang=ko-KR");
            }
        } else if (str.equals("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose")) {
            ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null);
            if (iSettingService == null || (appLanguage = iSettingService.getAppLanguage()) == null || !Intrinsics.LJFF(appLanguage, "ko")) {
                appLanguage = "en";
            }
            c1913640zti.LJ(C786410Ut5.j4("https://www.tiktok.com/legal/page/global/consent-to-collection-and-use-of-your-personal-information-for-marketing-purposes/%s", Arrays.copyOf(new Object[]{appLanguage}, 1)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS177S1100000_28 awS177S1100000_28) {
        C1913700zto c1913700zto = (C1913700zto) awS177S1100000_28.l1;
        String str = awS177S1100000_28.s0;
        C1913610ztf c1913610ztf = new C1913610ztf(c1913700zto.LLILLJJLI, "", true, true, false, null, false, 32);
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZIZ(str, c1913610ztf, new InterfaceC1913620ztg() { // from class: X.0ztr
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AwS177S1100000_28 r15) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS177S1100000_28.invoke$12(kotlin.jvm.internal.AwS177S1100000_28):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS177S1100000_28 r15) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS177S1100000_28.invoke$13(kotlin.jvm.internal.AwS177S1100000_28):java.lang.Object");
    }

    public static final Object invoke$14(AwS177S1100000_28 awS177S1100000_28) {
        AnonymousClass1087 anonymousClass1087 = AnonymousClass1087.LIZ;
        Context context = (Context) awS177S1100000_28.l1;
        String str = awS177S1100000_28.s0;
        anonymousClass1087.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/pause_interactions");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AwS177S1100000_28 awS177S1100000_28) {
        String strJ3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceive → actionId=");
        sbLIZ.append(awS177S1100000_28.s0);
        sbLIZ.append(", uiConfig=");
        JSONObject jSONObject = (JSONObject) awS177S1100000_28.l1;
        if (jSONObject == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
            strJ3 = "null";
        }
        sbLIZ.append(strJ3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS177S1100000_28 awS177S1100000_28) {
        QrCodeScanService qrCodeScanService = (QrCodeScanService) PluggableExtentionKt.pluggableSpi$default(QrCodeScanService.class, false, false, false, 14, null);
        if (qrCodeScanService != null) {
            qrCodeScanService.LIZ(awS177S1100000_28.s0, (Activity) awS177S1100000_28.l1, new InterfaceC1389750mGj() { // from class: X.10aa
                @Override // X.InterfaceC1389750mGj
                public final void doAfterDownLoad(int i, Boolean bool) {
                }
            });
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$17(AwS177S1100000_28 awS177S1100000_28) {
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        String str = awS177S1100000_28.s0;
        c1893790zNh.getClass();
        AttributionBody attributionBody = new AttributionBody(C1893790zNh.LJ(str), "", "", "");
        final InterfaceC1896280zRi interfaceC1896280zRi = (InterfaceC1896280zRi) awS177S1100000_28.l1;
        C11NZ.LJIJJLI(new C19336110kp(attributionBody, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336510kt(new InterfaceC1896270zRh() { // from class: X.0zRg
            @Override // X.InterfaceC1896270zRh
            public final void onFail() {
                interfaceC1896280zRi.onFail();
            }

            @Override // X.InterfaceC1896270zRh
            public final void LIZ(AttributionResponse attributionResponse) {
                String str2;
                if (attributionResponse != null) {
                    str2 = attributionResponse.jumpLink;
                } else {
                    str2 = null;
                }
                interfaceC1896280zRi.onSuccess(str2);
            }
        }, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS177S1100000_28 awS177S1100000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update request finish , result ");
        sbLIZ.append(awS177S1100000_28.s0);
        sbLIZ.append(" , ");
        sbLIZ.append((GameLiveBottomBarAssemTriggerV2) awS177S1100000_28.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$19(AwS177S1100000_28 awS177S1100000_28) {
        int i;
        SparkFragment sparkFragment;
        C1899920zXa c1899920zXa = C1899920zXa.LIZ;
        String str = awS177S1100000_28.s0;
        EnumC1899960zXe enumC1899960zXe = (EnumC1899960zXe) awS177S1100000_28.l1;
        c1899920zXa.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endSession start popupIdentifier=");
        sbLIZ.append(str);
        sbLIZ.append(" reason=");
        sbLIZ.append(enumC1899960zXe.getValue());
        C2188811AlT.LIZIZ(sbLIZ);
        C1899950zXd c1899950zXdRemove = C1899920zXa.LIZIZ.remove(str);
        if (c1899950zXdRemove == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("endSession skip popupIdentifier=");
            sbLIZ2.append(str);
            sbLIZ2.append(" reason=");
            sbLIZ2.append(enumC1899960zXe.getValue());
            C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            if (enumC1899960zXe == EnumC1899960zXe.SUCCESS) {
                i = 1;
            } else {
                i = 0;
            }
            AnonymousClass0956 anonymousClass0956 = c1899950zXdRemove.LJIILJJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1899950zXdRemove.LJIILJJIL = null;
            InterfaceC1141530foN interfaceC1141530foN = c1899950zXdRemove.LJIIIIZZ;
            if (interfaceC1141530foN != null) {
                C1548820qPI.LJIIIIZZ("referral_popup_show", interfaceC1141530foN);
                C1548820qPI.LJIIIIZZ("referral_popup_resource_load_failed", interfaceC1141530foN);
                C1548820qPI.LJIIIIZZ("referral_popup_valid_failed", interfaceC1141530foN);
                C1548820qPI.LJIIIIZZ("referral_popup_click", interfaceC1141530foN);
                C1548820qPI.LJIIIIZZ("referral_popup_resource_load_failed", interfaceC1141530foN);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("clearEventSubscription unsubscribed popupIdentifier=");
                sbLIZ3.append(c1899950zXdRemove.LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
                c1899950zXdRemove.LJIIIIZZ = null;
            }
            c1899950zXdRemove.LJI = enumC1899960zXe;
            Function1<? super C991900bv2, Unit> function1 = c1899950zXdRemove.LJIIIZ;
            c1899950zXdRemove.LJIIIZ = null;
            if (i == 0) {
                SparkPopup sparkPopup = c1899950zXdRemove.LJII;
                if (sparkPopup != null && (sparkFragment = sparkPopup.LLJILLL) != null) {
                    sparkFragment.WR(true);
                }
                SparkPopup sparkPopup2 = c1899950zXdRemove.LJII;
                if (sparkPopup2 != null) {
                    sparkPopup2.gS(true);
                }
            }
            c1899950zXdRemove.LJIILIIL = null;
            c1899950zXdRemove.LJII = null;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("endSession finalized popupIdentifier=");
            sbLIZ4.append(str);
            C2188811AlT.LIZIZ(sbLIZ4);
            C1899940zXc.LIZ.getClass();
            C1899940zXc.LIZIZ(c1899950zXdRemove);
            C991910bv3 c991910bv3 = new C991910bv3(new C991900bv2(i, enumC1899960zXe.getValue()), function1);
            Function1<C991900bv2, Unit> function12 = c991910bv3.LIZIZ;
            if (function12 != null) {
                function12.invoke(c991910bv3.LIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS177S1100000_28 awS177S1100000_28) {
        PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI = (PNSKrDeviceConsentNewUI) awS177S1100000_28.l1;
        String str = awS177S1100000_28.s0;
        pNSKrDeviceConsentNewUI.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -1495818221) {
            if (iHashCode != 623683781) {
                if (iHashCode == 2064195680 && str.equals("terms-and-conditions-kr")) {
                    pNSKrDeviceConsentNewUI.iS("https://www.tiktok.com/legal/terms-and-conditions-kr?lang=ko-KR");
                }
            } else if (str.equals("terms-of-service")) {
                pNSKrDeviceConsentNewUI.iS("https://www.tiktok.com/legal/terms-of-service?lang=ko-KR");
            }
        } else if (str.equals("consent-to-collect-and-user-of-your-personal-information-for-marketing-purpose")) {
            String appLanguage = ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage();
            if (!Intrinsics.LJFF(appLanguage, "ko") || appLanguage == null) {
                appLanguage = "en";
            }
            pNSKrDeviceConsentNewUI.iS(C786410Ut5.j4("https://www.tiktok.com/legal/page/global/consent-to-collection-and-use-of-your-personal-information-for-marketing-purposes/%s", Arrays.copyOf(new Object[]{appLanguage}, 1)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS177S1100000_28 awS177S1100000_28) {
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd = ((C262100zr) awS177S1100000_28.l1).LIZIZ;
        if (interfaceC1107590evd == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "popup_id", "")) == null || !(!a0.LJJJIL(strLJFF))) {
            strLJFF = null;
        }
        C1899920zXa c1899920zXa = C1899920zXa.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleResourceLoadFailed popupIdentifier=");
        sbLIZ.append(awS177S1100000_28.s0);
        sbLIZ.append(", jsEvent popup_id: ");
        sbLIZ.append(strLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        c1899920zXa.getClass();
        if (Intrinsics.LJFF(strLJFF, awS177S1100000_28.s0)) {
            C1899920zXa.LIZJ(awS177S1100000_28.s0, EnumC1899960zXe.RESOURCE_LOAD_FAILED);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS177S1100000_28 awS177S1100000_28) {
        String strLJFF;
        C19EG c19eg;
        InterfaceC1107590evd interfaceC1107590evd = ((C262100zr) awS177S1100000_28.l1).LIZIZ;
        Activity activityLJIILL = null;
        if (interfaceC1107590evd == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "popup_id", "")) == null || !(!a0.LJJJIL(strLJFF))) {
            strLJFF = null;
        }
        C1899920zXa c1899920zXa = C1899920zXa.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleShowTrigger popupIdentifier=");
        sbLIZ.append(awS177S1100000_28.s0);
        sbLIZ.append(", jsEvent popup_id: ");
        sbLIZ.append(strLJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        c1899920zXa.getClass();
        if (Intrinsics.LJFF(strLJFF, awS177S1100000_28.s0)) {
            String str = awS177S1100000_28.s0;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("show start popupIdentifier=");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1899950zXd c1899950zXd = C1899920zXa.LIZIZ.get(str);
            if (c1899950zXd != null) {
                if (!C1893550zNJ.LIZ(c1899950zXd.LIZJ)) {
                    C1899920zXa.LIZJ(str, EnumC1899960zXe.PAGE_MISMATCH_BEFORE_SHOW);
                } else {
                    AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                    if (abstractC1896090zRP != null) {
                        activityLJIILL = abstractC1896090zRP.LJIILL();
                    }
                    if ((activityLJIILL instanceof C19EG) && (c19eg = (C19EG) activityLJIILL) != null) {
                        SparkPopup sparkPopup = c1899950zXd.LJII;
                        if (sparkPopup != null && !sparkPopup.isVisible()) {
                            FragmentManager fragmentManagerLIZLLL = C1899920zXa.LIZLLL(c19eg);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("SparkPopup#");
                            sbLIZ3.append(str.hashCode());
                            sparkPopup.show(fragmentManagerLIZLLL, C2188811AlT.LIZIZ(sbLIZ3));
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("show success popupIdentifier=");
                            sbLIZ4.append(str);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            C1899920zXa.LIZJ(str, EnumC1899960zXe.SUCCESS);
                        } else {
                            C1899920zXa.LIZJ(str, EnumC1899960zXe.ROUTE_OPEN_FAILED);
                        }
                    } else {
                        C1899920zXa.LIZJ(str, EnumC1899960zXe.ROUTE_NOT_MATCHED);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS177S1100000_28 awS177S1100000_28) {
        if (!((C19EG) awS177S1100000_28.l1).isFinishing() && !((C19EG) awS177S1100000_28.l1).isDestroyed()) {
            try {
                Class.forName("com.ss.android.ugc.aweme.bugreport.ui.BugReportBottomSheet").getMethod("show", C19EG.class, String.class).invoke(null, (C19EG) awS177S1100000_28.l1, awS177S1100000_28.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS177S1100000_28 awS177S1100000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Work] doWork strategy=");
        sbLIZ.append(((BaseOfflinePushWork) awS177S1100000_28.l1).LJIIJ());
        sbLIZ.append(" reason=");
        sbLIZ.append(awS177S1100000_28.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS177S1100000_28 awS177S1100000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Work] pre-check failed strategy=");
        sbLIZ.append(((BaseOfflinePushWork) awS177S1100000_28.l1).LJIIJ());
        sbLIZ.append(" reason=");
        sbLIZ.append(awS177S1100000_28.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS177S1100000_28 r3) {
        /*
            X.01GW<com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager> r0 = com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LLJJIJIIJIL
            com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager r1 = X.C1894330zOZ.LIZ()
            java.lang.String r0 = r3.s0
            r1.LLJI = r0
            X.0zP9 r0 = r1.LL
            if (r0 == 0) goto L27
            X.0zSe r0 = r1.LJIIJJI()
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L27
            X.0zSe r2 = r1.LJIIJJI()
            boolean r1 = r1.LJJIJIIJIL()
            boolean r0 = com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager.LJJIIZ()
            r2.showOrHidePendant(r1, r0)
        L27:
            X.0zQm r0 = X.C1895700zQm.LIZ
            java.lang.String r1 = r3.s0
            r0.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1965615457: goto L43;
                case -1525083535: goto L4e;
                case -1499288668: goto L59;
                case -1220576200: goto L64;
                case -1220570131: goto L6f;
                case 984907784: goto L7a;
                case 1270713017: goto L85;
                default: goto L35;
            }
        L35:
            java.lang.String r0 = "others"
        L37:
            X.C1895700zQm.LJ = r0
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.specact.SpecActServiceImpl r0 = (com.ss.android.ugc.aweme.specact.SpecActServiceImpl) r0
            r0.getClass()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            java.lang.String r0 = "Nearby"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "nearby"
            goto L37
        L4e:
            java.lang.String r0 = "Following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "follow"
            goto L37
        L59:
            java.lang.String r0 = "Playmode_Moodboost"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "mood_boost"
            goto L37
        L64:
            java.lang.String r0 = "Playmode_New"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "new"
            goto L37
        L6f:
            java.lang.String r0 = "Playmode_Top"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "top"
            goto L37
        L7a:
            java.lang.String r0 = "For You"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "fyp"
            goto L37
        L85:
            java.lang.String r0 = "Popular"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r0 = "popular"
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS177S1100000_28.invoke$6(kotlin.jvm.internal.AwS177S1100000_28):java.lang.Object");
    }

    public static final Object invoke$7(AwS177S1100000_28 awS177S1100000_28) {
        String str = awS177S1100000_28.s0;
        if (str != null) {
            C1331660kl2.LJIIIZ(str).LJJII(new C2325271G0f((InterfaceC2281081EQg) awS177S1100000_28.l1, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS177S1100000_28 awS177S1100000_28) {
        C103L c103l = (C103L) ((Function0) awS177S1100000_28.l1).invoke();
        c103l.LIZ = awS177S1100000_28.s0;
        return c103l;
    }

    public static final Object invoke$9(AwS177S1100000_28 awS177S1100000_28) {
        C1913660ztk c1913660ztk = (C1913660ztk) awS177S1100000_28.l1;
        String str = awS177S1100000_28.s0;
        C1913610ztf c1913610ztf = new C1913610ztf(c1913660ztk.LLILLJJLI, "", true, true, false, null, false, 32);
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZIZ(str, c1913610ztf, new InterfaceC1913620ztg() { // from class: X.0ztn
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(C262100zr c262100zr, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c262100zr;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(C1913640zti c1913640zti, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1913640zti;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(C1913660ztk c1913660ztk, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1913660ztk;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(C1913700zto c1913700zto, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1913700zto;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(C19322810ig c19322810ig, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19322810ig;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(C19EG c19eg, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c19eg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(Activity activity, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(WatchVideoServiceImpl watchVideoServiceImpl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = watchVideoServiceImpl;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(DynamicDialog dynamicDialog, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = dynamicDialog;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(PNSKrDeviceConsentNewUI pNSKrDeviceConsentNewUI, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = pNSKrDeviceConsentNewUI;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(BaseOfflinePushWork baseOfflinePushWork, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = baseOfflinePushWork;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(String str, C1878830yzZ c1878830yzZ, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1878830yzZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(String str, EnumC1899960zXe enumC1899960zXe, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = enumC1899960zXe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(String str, InterfaceC2281081EQg interfaceC2281081EQg, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC2281081EQg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(String str, SpecActServiceImpl specActServiceImpl, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = specActServiceImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(String str, GameLiveBottomBarAssemTriggerV2 gameLiveBottomBarAssemTriggerV2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = gameLiveBottomBarAssemTriggerV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS177S1100000_28(String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS177S1100000_28(Function0 function0, Function0<C103L> function02, String str) {
        super(0);
        this.$t = str;
        this.l1 = function0;
        this.s0 = function02;
    }
}
