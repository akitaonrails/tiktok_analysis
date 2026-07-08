package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C020R;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0HBF;
import X.C0HDX;
import X.C0HDY;
import X.C0HEN;
import X.C0HEQ;
import X.C0HFJ;
import X.C0HFK;
import X.C0HFS;
import X.C0HFT;
import X.C0HFV;
import X.C0HHA;
import X.C0HHB;
import X.C0HHC;
import X.C0HHD;
import X.C0HHK;
import X.C0HHS;
import X.C0HMR;
import X.C0HWW;
import X.C0HXZ;
import X.C0HYP;
import X.C0PEM;
import X.C0T1N;
import X.C0XQ7;
import X.C13LQ;
import X.C1644806cI;
import X.C1910890zpH;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C19EG;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C23260099m;
import X.C2344009Gk;
import X.C263870AVt;
import X.C363901bB;
import X.C364601bI;
import X.C364901bL;
import X.C427870Gq9;
import X.C437370HDb;
import X.C437430HDh;
import X.C437440HDi;
import X.C437560HDu;
import X.C452501pT;
import X.C5183020f;
import X.EnumC437540HDs;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC19515111Wr;
import X.InterfaceC427850Gq7;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;
import com.ss.android.ugc.profile.business.ur.socialavatar.datacenter.SocialAvatarFetchGeckoResourceLegoTask;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAISelfCompatibilityConfig;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarImageAssetCDNConfigSettings;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS331S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarServiceImpl implements ISocialAvatarService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(368));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(367));

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJIIIIZZ() {
        C0HHS c0hhs;
        C0HHB c0hhb = C0HHB.LIZ;
        C0HFK c0hfk = C0HFK.SOCIAL_AVATAR;
        synchronized (c0hhb) {
            c0hhs = C0HHB.LIZIZ.get(c0hfk);
        }
        if (c0hhs == null) {
            c0hhb.LIZ(c0hfk, new C0HHK());
        }
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final SocialAvatarFetchGeckoResourceLegoTask LJIIJ() {
        return new SocialAvatarFetchGeckoResourceLegoTask();
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJIIJJI() {
        C364601bI.LIZJ(C364601bI.LIZ);
    }

    public final C1910890zpH LJIJJ() {
        return (C1910890zpH) this.LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:29:0x00bc, B:30:0x00bf, B:32:0x00cf, B:33:0x00d2, B:34:0x00db, B:20:0x0067, B:21:0x006a, B:23:0x0070, B:25:0x0076, B:28:0x0097, B:17:0x0040), top: B:39:0x001e }] */
    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0HH7
            if (r0 == 0) goto L43
            r5 = r7
            X.0HH7 r5 = (X.C0HH7) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L49
            X.C155000ia.LIZIZ(r4)
        L23:
            com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarTaskStatusResponse r4 = (com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarTaskStatusResponse) r4
            if (r4 == 0) goto L2d
            int r0 = r4.status
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
        L2d:
            return r2
        L2e:
            X.C155000ia.LIZIZ(r4)
            X.0HMR r0 = X.C0HMR.LIZ
            r0.getClass()
            X.0HEN r0 = X.C0HMR.LIZ()
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LJ(r2, r5)
            if (r4 != r3) goto L23
            return r3
        L43:
            X.0HH7 r5 = new X.0HH7
            r5.<init>(r6, r7)
            goto L12
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl.LJ(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final Object LJI(InterfaceC1364105Vn<? super SocialAvatarQueueStatusResult> interfaceC1364105Vn) {
        C0HMR.LIZ.getClass();
        C0HEN c0henLIZ = C0HMR.LIZ();
        if (!C1644806cI.LIZJ()) {
            return null;
        }
        return C0HEN.LIZIZ.LIZ(new C0HEQ(c0henLIZ, null), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final AFwS331S0000000_6 LJIIL(C0HFK c0hfk) {
        if (C0HFJ.LIZIZ[c0hfk.ordinal()] == 1) {
            return AFwS331S0000000_6.get$arr$(3);
        }
        return null;
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final File LJIILIIL(String str) {
        C364601bI.LIZ.getClass();
        if (C364601bI.LIZIZ()) {
            return C364601bI.LIZ(str);
        }
        return null;
    }

    public static void LJIJI(C0HHC c0hhc, Function0 function0) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ISocialAvatarService enterSocialAvatarFlow, the entranceData has enterMethod as ");
        sbLIZ.append(c0hhc.LIZIZ);
        sbLIZ.append(", enterFrom as ");
        sbLIZ.append(c0hhc.LIZJ);
        sbLIZ.append(", exitRoute as ");
        sbLIZ.append(c0hhc.LJI);
        sbLIZ.append(", exitIntent as ");
        sbLIZ.append(c0hhc.LJII);
        sbLIZ.append(", enterTo as ");
        sbLIZ.append(c0hhc.LJIIIZ);
        sbLIZ.append(", isChangePhoto as ");
        sbLIZ.append(c0hhc.LJIIJ);
        sbLIZ.append(", source is ");
        sbLIZ.append(c0hhc.LJIIJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        if (function0 != null) {
            function0.invoke();
        }
        C0HHB c0hhb = C0HHB.LIZ;
        C0HFK c0hfk = C0HFK.SOCIAL_AVATAR;
        c0hhb.LIZ(c0hfk, new C0HHK());
        AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6(c0hhc, 167);
        synchronized (c0hhb) {
            Map<C0HFK, Function2<C19EG, Function0<Unit>, Unit>> map = C0HHB.LIZJ;
            if (map.get(c0hfk) == null) {
                map.put(c0hfk, awS620S0100000_6);
            }
        }
        C0HHD.LIZIZ.LIZ(c0hhc);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0HH8
            if (r0 == 0) goto L45
            r4 = r7
            X.0HH8 r4 = (X.C0HH8) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L4b
            X.C155000ia.LIZIZ(r3)
        L22:
            X.01bL r3 = (X.C364901bL) r3
            java.io.File r0 = r3.LIZ
            if (r0 == 0) goto L31
            java.net.URI r0 = r0.toURI()
            java.lang.String r0 = r0.toString()
        L30:
            return r0
        L31:
            java.lang.String r0 = r3.LIZIZ
            if (r0 != 0) goto L30
            java.lang.String r0 = ""
            return r0
        L38:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0
            r0 = 0
            java.lang.Object r3 = r5.LIZ(r6, r0, r4)
            if (r3 != r2) goto L22
            return r2
        L45:
            X.0HH8 r4 = new X.0HH8
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final Object LJIIIZ(C0HFV c0hfv, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return LIZJ(c0hfv.LIZJ, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJIILJJIL(String str, InterfaceC1631620sYq<? super Boolean, ? super C364901bL, ? super String, Unit> interfaceC1631620sYq) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ISocialAvatarService fetchGeckoImageResource with fileName as ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService != null) {
            iSocialAvatarDebugService.LJ();
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C363901bB(str, null, interfaceC1631620sYq), 3);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJIILL(final C19EG c19eg, SocialAvatarDownloadArg socialAvatarDownloadArg) {
        String[] strArr;
        String str;
        final String enterFrom = socialAvatarDownloadArg.getEnterFrom();
        final AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(c19eg, socialAvatarDownloadArg, 47);
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
            str = "bpea-social_avatar_download_storage";
        } else if (i < 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            str = "bpea-social_avatar_download_storage_target_33";
        } else {
            strArr = new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
            str = "bpea-social_avatar_download_storage_target_34";
        }
        final String str2 = (String) C13LQ.LJJIIZ(0, strArr);
        if (str2 != null) {
            C19741112Lp.LIZ.getClass();
            if (C19741112Lp.LIZLLL(c19eg, str2)) {
                awS407S0200000_6.invoke();
                return;
            }
            TokenCert tokenCertWith = TokenCert.Companion.with(str);
            final boolean zLJI = C19741112Lp.LJI(c19eg, str2, false);
            if (!zLJI) {
                C0HWW.LIZ.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
                c2344009Gk.LJIIIIZZ("shoot_way", "social_avatar");
                C20684815ws.LJIILLIIL("access_photos_show", c2344009Gk.LIZ);
            }
            C19514711Wn.LIZIZ.LIZIZ(c19eg, tokenCertWith).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0HUZ
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    int i2;
                    for (int i3 = 0; i3 < c0hwoArr.length; i3++) {
                    }
                    String str3 = str2;
                    for (C0HWO c0hwo : c0hwoArr) {
                        if (Intrinsics.LJFF(c0hwo.LIZ, str3)) {
                            EnumC442280HVy enumC442280HVy = c0hwo.LIZIZ;
                            if (enumC442280HVy != null && (i2 = C442270HVx.LIZ[enumC442280HVy.ordinal()]) != -1) {
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 == 3) {
                                            if (!zLJI) {
                                                C0HWW c0hww = C0HWW.LIZ;
                                                String str4 = enterFrom;
                                                c0hww.getClass();
                                                C0HWW.LIZ(0, str4);
                                            }
                                            C0HWW c0hww2 = C0HWW.LIZ;
                                            String str5 = enterFrom;
                                            c0hww2.getClass();
                                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                                            c2344009Gk2.LJIIIIZZ("enter_from", str5);
                                            c2344009Gk2.LJIIIIZZ("shoot_way", "social_avatar");
                                            C20684815ws.LJIILLIIL("go_to_setting_show", c2344009Gk2.LIZ);
                                            SocialAvatarServiceImpl socialAvatarServiceImpl = this;
                                            final C19EG c19eg2 = c19eg;
                                            final String str6 = enterFrom;
                                            socialAvatarServiceImpl.getClass();
                                            C21566919al c21566919al = new C21566919al(c19eg2);
                                            c21566919al.LJFF(2131829837);
                                            c21566919al.LIZ(2131828999);
                                            c21566919al.LJII(R.string.f1_, new DialogInterface.OnClickListener() { // from class: X.09fx
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i4) {
                                                    C0HWW c0hww3 = C0HWW.LIZ;
                                                    String str7 = str6;
                                                    c0hww3.getClass();
                                                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                                                    c2344009Gk3.LJIIIIZZ("enter_from", str7);
                                                    c2344009Gk3.LJIIIIZZ("shoot_way", "social_avatar");
                                                    C20684815ws.LJIILLIIL("go_to_setting_action", c2344009Gk3.LIZ);
                                                }
                                            }, false);
                                            c21566919al.LJIIJ(2131835118, new DialogInterface.OnClickListener() { // from class: X.09fw
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i4) throws Throwable {
                                                    try {
                                                        C0HWW c0hww3 = C0HWW.LIZ;
                                                        String str7 = str6;
                                                        c0hww3.getClass();
                                                        C2344009Gk c2344009Gk3 = new C2344009Gk();
                                                        c2344009Gk3.LJIIIIZZ("enter_from", str7);
                                                        c2344009Gk3.LJIIIIZZ("shoot_way", "social_avatar");
                                                        C20684815ws.LJIILLIIL("go_to_setting_action", c2344009Gk3.LIZ);
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("package:");
                                                        sbLIZ.append(c19eg2.getPackageName());
                                                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                                                        intent.addFlags(268435456);
                                                        C19EG c19eg3 = c19eg2;
                                                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg3, intent, "Context_startActivity_1");
                                                        C1701330uNH.LIZ(intent, c19eg3);
                                                        C2204961BRm.LLJJJJ(c19eg3, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDjeIgyOYPRq+Bn4TuWF+TKSJEJww0X3nPT9xc8d3eWtPJ/8Wi", null));
                                                    } catch (Exception e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                    }
                                                }
                                            }, false);
                                            new C21566519ah(c21566919al).LIZLLL();
                                            return;
                                        }
                                        throw new C1954807lC();
                                    }
                                    C0HWW c0hww3 = C0HWW.LIZ;
                                    String str7 = enterFrom;
                                    c0hww3.getClass();
                                    C0HWW.LIZ(0, str7);
                                    return;
                                }
                                Function0<Unit> function0 = awS407S0200000_6;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                C0HWW c0hww4 = C0HWW.LIZ;
                                String str8 = enterFrom;
                                c0hww4.getClass();
                                C0HWW.LIZ(2, str8);
                                return;
                            }
                            return;
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final Object LIZ(String str, String str2, InterfaceC1364105Vn<? super C364901bL> interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (str2 == null) {
            str2 = SocialAvatarImageAssetCDNConfigSettings.LIZ(str);
        }
        boolean z = false;
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService != null) {
            iSocialAvatarDebugService.LJ();
        }
        C364601bI c364601bI = C364601bI.LIZ;
        C020R c020r = new C020R(str2, c23260099m, 6);
        c364601bI.getClass();
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            c020r.invoke(null);
        } else {
            File fileLIZ = C364601bI.LIZ(str);
            if (fileLIZ != null) {
                c020r.invoke(fileLIZ);
            } else {
                Forest forestLIZ = C0T1N.LIZ();
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.channel = "tiktok_social_user_relation_res";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("social_avatar/");
                sbLIZ.append(str);
                requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ);
                requestParams.waitGeckoUpdate = true;
                forestLIZ.fetchResourceAsync("", requestParams, new C5183020f(c020r, 338));
            }
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LIZLLL(C0HFS c0hfs, C427870Gq9 c427870Gq9, InterfaceC427850Gq7 interfaceC427850Gq7) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HBF(this, c0hfs, c427870Gq9, interfaceC427850Gq7, null), 3);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJFF(int i, C427870Gq9 c427870Gq9, InterfaceC427850Gq7 interfaceC427850Gq7) {
        C0HFS c0hfsLIZ = C0HFT.LIZ(i);
        if (c0hfsLIZ == null) {
            if (interfaceC427850Gq7 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("No style index [");
                sbLIZ.append(i);
                sbLIZ.append("] found");
                interfaceC427850Gq7.cm(null, c427870Gq9, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                return;
            }
            return;
        }
        LIZLLL(c0hfsLIZ, c427870Gq9, interfaceC427850Gq7);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJIILLIIL(C0HHA c0hha, EnumC437540HDs enumC437540HDs, Function0<Unit> function0) {
        IUserService iUserService;
        User currentUser;
        String uid;
        C437560HDu c437560HDu;
        IPSPCenter iPSPCenter;
        EnumC437540HDs enumC437540HDs2 = enumC437540HDs;
        if (((Number) C263870AVt.LIZ.getValue()).intValue() == 1 && (iPSPCenter = (IPSPCenter) PluggableExtentionKt.pluggableSpi$default(IPSPCenter.class, false, false, false, 14, null)) != null) {
            iPSPCenter.LIZ();
        }
        Context topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            topActivity = c0hha.LIZ;
        }
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LIZJ(topActivity, "social_avatar", true)) {
            if (enumC437540HDs2 == null && ((iUserService = (IUserService) ServiceManager.get().getService(IUserService.class)) == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null || (c437560HDu = (C437560HDu) ((ISocialAvatarCreationStatusService) this.LIZ.getValue()).LIZ(uid).getValue()) == null || (enumC437540HDs2 = c437560HDu.LIZ) == null)) {
                enumC437540HDs2 = EnumC437540HDs.UNKNOWN;
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ISocialAvatarService enterSocialAvatarFlow, socialAvatarStatus is ");
            sbLIZ.append(enumC437540HDs2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (C0HFJ.LIZ[enumC437540HDs2.ordinal()] == 1) {
                if (function0 != null) {
                    function0.invoke();
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(topActivity, "//socialavatar");
                smartRouteBuildRoute.withParam("enter_from", c0hha.LIZJ);
                smartRouteBuildRoute.withParam("enter_method", c0hha.LIZIZ);
                smartRouteBuildRoute.withParam("source", c0hha.LJI);
                smartRouteBuildRoute.open();
                return;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C437370HDb(topActivity, c0hha, this, enumC437540HDs2, function0, null), 3);
        }
    }

    public static C0HHC LJIJ(C0HHA c0hha, Context context, EnumC437540HDs enumC437540HDs, boolean z) {
        boolean z2;
        String str;
        int i = C0HFJ.LIZ[enumC437540HDs.ordinal()];
        boolean z3 = false;
        if (i != 2 && i != 3 && i != 4 && i != 5) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (enumC437540HDs == EnumC437540HDs.FAILED && c0hha.LJII) {
            z3 = true;
        }
        if (z2) {
            str = "generation";
        } else if (z3) {
            str = "error";
        } else {
            str = "normal";
        }
        return new C0HHC(context, c0hha.LIZIZ, c0hha.LIZJ, c0hha.LIZLLL, c0hha.LJ, str, z, c0hha.LJI, c0hha.LJFF, c0hha.LJIIIZ, c0hha.LJIIJ, c0hha.LJIIJJI);
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final void LJIIZILJ(C19EG c19eg, String str, String str2, C0HXZ c0hxz) {
        if (!SocialAvatarAISelfCompatibilityConfig.LIZ()) {
            return;
        }
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService != null) {
            iSocialAvatarDebugService.LIZIZ();
        }
        C0HYP.LIZ.getClass();
        if (C0HYP.LJFF()) {
            LJIJJ().LIZ("SocialAvatarService", "sa_dm_stickers_sheet has already shown");
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C437440HDi(this, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), false, c19eg, str, str2, c0hxz, null), 3);
        }
    }

    @Override // com.ss.android.ugc.ur.socialavatar.ISocialAvatarService
    public final Object LJII(Context context, C0HDY c0hdy, boolean z, boolean z2, C437430HDh c437430HDh, boolean z3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJ = C2296808zG.LJ(new C0HDX(z3, c0hdy, c437430HDh, this, context, z, z2, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(android.content.Context r24, X.C0HDY r25, boolean r26, boolean r27, java.util.Map<java.lang.String, java.lang.String> r28, X.C437430HDh r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl.LJIJJLI(android.content.Context, X.0HDY, boolean, boolean, java.util.Map, X.0HDh, X.05Vn):java.lang.Object");
    }
}
