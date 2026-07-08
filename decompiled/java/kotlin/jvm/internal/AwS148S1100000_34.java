package kotlin.jvm.internal;

import X.C08KT;
import X.C08KW;
import X.C09AY;
import X.C1023640ckE;
import X.C1043500dGG;
import X.C1232830iBd;
import X.C1232850iBf;
import X.C1255390im1;
import X.C19208410Cs;
import X.C1B3P;
import X.C1D15;
import X.C20684815ws;
import X.C211000rc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2192231Aqz;
import X.C2195221Avo;
import X.C2197431AzN;
import X.C2197481AzS;
import X.C2197681Azm;
import X.C2197731Azr;
import X.C2214011Bl1;
import X.C2246381Cw8;
import X.C2344009Gk;
import X.C688070Qyr;
import X.C688090Qyt;
import X.C786410Ut5;
import X.EnumC1236600iHi;
import X.EnumC19415410xc;
import X.EnumC21632119lH;
import X.EnumC2197791Azx;
import X.InterfaceC1914010zuJ;
import X.InterfaceC2214621Bm0;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAuthPageMethod;
import com.ss.android.ugc.aweme.cct.OpenCCTUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.payment.MinisRechargeFragment;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS148S1100000_34 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        PopupManager.LIZJ(C688070Qyr.class);
        if (zBooleanValue) {
            InterfaceC2214621Bm0 interfaceC2214621Bm0 = (InterfaceC2214621Bm0) awS148S1100000_34.l1;
            if (interfaceC2214621Bm0 != null) {
                interfaceC2214621Bm0.LIZIZ();
            }
        } else {
            InterfaceC2214621Bm0 interfaceC2214621Bm02 = (InterfaceC2214621Bm0) awS148S1100000_34.l1;
            if (interfaceC2214621Bm02 != null) {
                interfaceC2214621Bm02.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        if (zBooleanValue) {
            InterfaceC2214621Bm0 interfaceC2214621Bm0 = (InterfaceC2214621Bm0) awS148S1100000_34.l1;
            if (interfaceC2214621Bm0 != null) {
                interfaceC2214621Bm0.LIZIZ();
            }
        } else {
            InterfaceC2214621Bm0 interfaceC2214621Bm02 = (InterfaceC2214621Bm0) awS148S1100000_34.l1;
            if (interfaceC2214621Bm02 != null) {
                interfaceC2214621Bm02.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        PopupManager.LIZJ(C688090Qyt.class);
        if (zBooleanValue) {
            InterfaceC1914010zuJ interfaceC1914010zuJ = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
            }
        } else {
            InterfaceC1914010zuJ interfaceC1914010zuJ2 = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ2 != null) {
                interfaceC1914010zuJ2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        C2246381Cw8 c2246381Cw8 = (C2246381Cw8) obj;
        boolean z = true;
        if (!Intrinsics.LJFF(awS148S1100000_34.s0, c2246381Cw8.LL) && awS148S1100000_34.s0.length() <= ProfileEditBioFragment.LLJJIII) {
            ProfileEditBioViewModel profileEditBioViewModel = (ProfileEditBioViewModel) awS148S1100000_34.l1;
            String str = awS148S1100000_34.s0;
            profileEditBioViewModel.getClass();
            if (!ProfileEditBioViewModel.yQ2(str) && (awS148S1100000_34.s0.length() <= 0 || !a0.LJJJIL(awS148S1100000_34.s0))) {
                z = false;
            }
        }
        return C2246381Cw8.LIZ(c2246381Cw8, null, null, null, null, null, null, z, null, 191);
    }

    public static final Object invoke$12(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        ((ProfileEditBioViewModel) awS148S1100000_34.l1).setState(new AwS84S1000000_34(awS148S1100000_34.s0, 5));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        int size;
        List<PhotoModeImageUrlModel> imageList;
        C08KT c08kt = (C08KT) obj;
        if (c08kt == null) {
            c08kt = new C08KT();
        }
        String str = awS148S1100000_34.s0;
        Aweme aweme = (Aweme) awS148S1100000_34.l1;
        c08kt.LIZ(str, FollowStatusChangeMethod.PARAM_UID);
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c08kt.LIZ(Integer.valueOf(size), "image_count");
        if (C2214011Bl1.LJI == 0) {
            c08kt.LIZ(0L, "photo_gap_duration");
            C2214011Bl1.LJI = System.currentTimeMillis();
            return c08kt;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c08kt.LIZ(Long.valueOf(jCurrentTimeMillis - C2214011Bl1.LJI), "photo_gap_duration");
        C2214011Bl1.LJI = jCurrentTimeMillis;
        return c08kt;
    }

    public static final Object invoke$14(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJJII, awS148S1100000_34.s0);
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((OpenCCTUtils) awS148S1100000_34.l1).LJIILL);
        c1023640ckE.withParam(C1043500dGG.LJJLIIIIJ, ((OpenCCTUtils) awS148S1100000_34.l1).LJIIJ);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        String string;
        BaseI18nAuthorizedFragment baseI18nAuthorizedFragment = (BaseI18nAuthorizedFragment) awS148S1100000_34.l1;
        baseI18nAuthorizedFragment.getClass();
        IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("need_skip_restart", true);
        String str = baseI18nAuthorizedFragment.LLJ;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        C786410Ut5.LJJJI("sdk_name", str, bundle);
        String str3 = baseI18nAuthorizedFragment.LLJI;
        if (str3 == null) {
            str3 = null;
        }
        C786410Ut5.LJJJI("sdk_version", str3, bundle);
        String str4 = baseI18nAuthorizedFragment.LLJLL;
        if (str4 == null) {
            str4 = "authorize_screen";
        }
        String strUR = baseI18nAuthorizedFragment.UR();
        String str5 = baseI18nAuthorizedFragment.LLJ;
        if (str5 == null) {
            str5 = null;
        }
        String str6 = baseI18nAuthorizedFragment.LLJI;
        if (str6 != null) {
            str2 = str6;
        }
        Bundle arguments = baseI18nAuthorizedFragment.getArguments();
        String str7 = "";
        if (arguments != null && (string = arguments.getString("pattern", "")) != null) {
            str7 = string;
        }
        iProfileService.showInChooseAccountBottomSheet(baseI18nAuthorizedFragment.requireActivity().getSupportFragmentManager(), new C1255390im1(str4, "auth_error_switch_account", strUR, str5, str2, str7, 192), "", bundle, new C1D15(baseI18nAuthorizedFragment, 4), new DialogInterface.OnCancelListener() { // from class: X.1B3f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
            }
        });
        C2344009Gk c2344009GkOR = ((BaseI18nAuthorizedFragment) awS148S1100000_34.l1).OR();
        c2344009GkOR.LJIIIIZZ("pattern", awS148S1100000_34.s0);
        C20684815ws.LJIILLIIL("auth_switch_account_pressed", c2344009GkOR.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        super/*X.1Ar1*/.LIZIZ((String) obj, awS148S1100000_34.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        WebAuthV2Response webAuthV2Response = (WebAuthV2Response) obj;
        ((OpenAuthPageMethod) awS148S1100000_34.l1).endLoading();
        ((OpenAuthPageMethod) awS148S1100000_34.l1).onEvent$crossplatform_from_main_release(new C1B3P(webAuthV2Response.code, awS148S1100000_34.s0, webAuthV2Response.errorDescription, null, webAuthV2Response.errorCode, 1, 944));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        int i;
        C2197431AzN c2197431AzN = (C2197431AzN) awS148S1100000_34.l1;
        C2197481AzS c2197481AzS = c2197431AzN.LJIIJ;
        MinisRechargeFragment minisRechargeFragment = c2197431AzN.LIZLLL;
        if (minisRechargeFragment != null && minisRechargeFragment.iS()) {
            i = 1;
        } else {
            i = 0;
        }
        String string = null;
        C2197481AzS.LIZIZ(c2197481AzS, "tm_unlock_N_episodes_panel_pur_button_click", 0L, i, null, null, null, 58);
        ((C2197431AzN) awS148S1100000_34.l1).LJIIIIZZ = true;
        ((C2197431AzN) awS148S1100000_34.l1).LJIIZILJ(awS148S1100000_34.s0, false);
        C2197481AzS c2197481AzS2 = ((C2197431AzN) awS148S1100000_34.l1).LJIIJ;
        String str = c2197481AzS2.LJFF;
        String str2 = c2197481AzS2.LJ;
        String str3 = c2197481AzS2.LIZJ;
        C1232850iBf c1232850iBf = C2197731Azr.LJI;
        EnumC2197791Azx enumC2197791Azx = EnumC2197791Azx.IAP;
        String strLIZ = C2195221Avo.LIZ();
        Map mapLIZIZ = C2197681Azm.LIZIZ(enumC2197791Azx, null);
        Map mapLIZ = C2197681Azm.LIZ(str, str2, str3);
        C1232830iBd c1232830iBd = C1232830iBd.LIZ;
        String strValueOf = String.valueOf(c1232850iBf.LIZ);
        Integer num = c1232850iBf.LIZJ;
        if (num != null) {
            string = num.toString();
        }
        EnumC1236600iHi enumC1236600iHi = c1232850iBf.LJFF;
        EnumC21632119lH enumC21632119lH = c1232850iBf.LJI;
        EnumC19415410xc enumC19415410xc = c1232850iBf.LJII;
        c1232830iBd.getClass();
        C1232830iBd.LIZ(strLIZ, "minis_pay_user_click", strValueOf, string, mapLIZIZ, mapLIZ, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPayUserClick, errorCodeScene:");
        sbLIZ.append(c1232850iBf);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        WebAuthV2Response webAuthV2Response = (WebAuthV2Response) obj;
        ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS148S1100000_34.l1).endLoading();
        ((com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod) awS148S1100000_34.l1).onEvent$crossplatform_from_main_release(new C1B3P(webAuthV2Response.code, awS148S1100000_34.s0, webAuthV2Response.errorDescription, null, webAuthV2Response.errorCode, 1, 944));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        PopupManager.LIZJ(C688090Qyt.class);
        if (zBooleanValue) {
            InterfaceC1914010zuJ interfaceC1914010zuJ = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
            }
        } else {
            InterfaceC1914010zuJ interfaceC1914010zuJ2 = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ2 != null) {
                interfaceC1914010zuJ2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zBooleanValue) {
            InterfaceC1914010zuJ interfaceC1914010zuJ = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
            }
        } else {
            InterfaceC1914010zuJ interfaceC1914010zuJ2 = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ2 != null) {
                interfaceC1914010zuJ2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        PopupManager.LIZJ(C688090Qyt.class);
        if (zBooleanValue) {
            InterfaceC1914010zuJ interfaceC1914010zuJ = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
            }
        } else {
            InterfaceC1914010zuJ interfaceC1914010zuJ2 = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ2 != null) {
                interfaceC1914010zuJ2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zBooleanValue) {
            InterfaceC1914010zuJ interfaceC1914010zuJ = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
            }
        } else {
            InterfaceC1914010zuJ interfaceC1914010zuJ2 = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ2 != null) {
                interfaceC1914010zuJ2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS148S1100000_34 awS148S1100000_34, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doShowCombinedPushPermissionPopup(");
        sbLIZ.append(awS148S1100000_34.s0);
        sbLIZ.append(") callback shown: ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        PopupManager.LIZJ(C688090Qyt.class);
        if (zBooleanValue) {
            InterfaceC1914010zuJ interfaceC1914010zuJ = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ != null) {
                interfaceC1914010zuJ.LIZIZ();
            }
        } else {
            InterfaceC1914010zuJ interfaceC1914010zuJ2 = (InterfaceC1914010zuJ) awS148S1100000_34.l1;
            if (interfaceC1914010zuJ2 != null) {
                interfaceC1914010zuJ2.LIZ();
            }
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS148S1100000_34(com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 11 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS148S1100000_34.<init>(com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioViewModel, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(C2192231Aqz c2192231Aqz, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2192231Aqz;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(C2197431AzN c2197431AzN, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c2197431AzN;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(BaseI18nAuthorizedFragment baseI18nAuthorizedFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = baseI18nAuthorizedFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(OpenAuthPageMethod openAuthPageMethod, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = openAuthPageMethod;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(com.ss.android.ugc.aweme.web.jsbridge.OpenAuthPageMethod openAuthPageMethod, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = openAuthPageMethod;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(String str, InterfaceC1914010zuJ interfaceC1914010zuJ, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC1914010zuJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(String str, C19208410Cs c19208410Cs, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c19208410Cs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(String str, OpenCCTUtils openCCTUtils, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = openCCTUtils;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS148S1100000_34(String str, Aweme aweme, C08KW c08kw, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
    }
}
