package com.ss.android.ugc.aweme.socialavatar;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C054G;
import X.C0HHC;
import X.C0HHF;
import X.C0HHG;
import X.C0HK4;
import X.C0HK9;
import X.C0HKB;
import X.C0HKD;
import X.C0HKH;
import X.C0HKR;
import X.C0HL8;
import X.C0HLI;
import X.C0PEM;
import X.C1906580ziK;
import X.C1956107lP;
import X.C23250099c;
import X.C438920HJa;
import X.C438960HJe;
import X.C439090HJr;
import X.C439180HKa;
import X.C452501pT;
import X.EnumC2219708mp;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationService;
import com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService;
import com.ss.android.ugc.aweme.socialavatar.view.SocialAvatarCameraActivity;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarCreationServiceImpl implements ISocialAvatarCreationService {
    public final C0HLI LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    public final ISocialAvatarCreationStatusService LIZJ() {
        return (ISocialAvatarCreationStatusService) this.LIZIZ.getValue();
    }

    public final SocialAvatarFastFlowService LIZLLL() {
        return (SocialAvatarFastFlowService) this.LIZJ.getValue();
    }

    public SocialAvatarCreationServiceImpl() {
        new C439180HKa();
        this.LIZ = C0HLI.LIZ;
        this.LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(662));
        this.LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(663));
    }

    public static String LJ() {
        return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationService
    public final Boolean LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        return Boolean.valueOf((abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZ : null) instanceof SocialAvatarCameraActivity);
    }

    public static C0HL8 LJIIIIZZ(C0HHC c0hhc) {
        C0HKH c0hkh;
        String str = c0hhc.LIZJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c0hhc.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        int i = c0hhc.LJIIJJI;
        String str4 = c0hhc.LIZLLL;
        Long l = c0hhc.LJFF;
        boolean z = c0hhc.LJIIJ;
        Integer num = c0hhc.LJ;
        String str5 = c0hhc.LJI;
        Intent intent = c0hhc.LJIIL;
        String strValueOf = String.valueOf(c0hhc.LJIIIIZZ);
        String str6 = c0hhc.LJIIIZ;
        if (Intrinsics.LJFF(str6, "error")) {
            c0hkh = C0HKH.ERROR;
        } else if (Intrinsics.LJFF(str6, "generation")) {
            c0hkh = C0HKH.GENERATION;
        } else {
            c0hkh = C0HKH.NORMAL;
        }
        return new C0HL8(str2, str, Boolean.valueOf(z), Integer.valueOf(i), str4, num, l, strValueOf, c0hkh, str5, null, intent, c0hhc.LJIILIIL, false, 201323520);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarCreationService
    public final void LIZ(final C0HHC c0hhc) throws Throwable {
        String str;
        C0HHF c0hhf = c0hhc.LJIILL;
        if (c0hhf instanceof C0HHG) {
            C0HHG c0hhg = (C0HHG) c0hhf;
            if (c0hhg != null && (str = c0hhg.LIZ) != null) {
                try {
                    C0HLI c0hli = C0HLI.LIZ;
                    EnumC2219708mp enumC2219708mp = EnumC2219708mp.ONLY_FACE;
                    c0hli.getClass();
                    Pair pairLJIIIIZZ = C0HLI.LJIIIIZZ(str, enumC2219708mp, false);
                    C23250099c.LIZLLL(C1956107lP.LIZ, C0PEM.LIZJ, null, new C0HK9(str, ((Number) pairLJIIIIZZ.getFirst()).floatValue(), (RectF) pairLJIIIIZZ.getSecond(), this, c0hhc, null), 2);
                    return;
                } catch (C0HKR e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZLLL().LIZ(LJ(), C439090HJr.LIZ);
                    LIZJ().LIZJ(LJ(), new C438920HJa(-5, null, null, false, null, null, null, null, 254));
                    return;
                }
            }
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c0hhc.LIZ, "//aimoji/creation/camera");
        smartRouteBuildRoute.withParam("enter_method", c0hhc.LIZIZ);
        smartRouteBuildRoute.withParam("enter_from", c0hhc.LIZJ);
        smartRouteBuildRoute.withParam("exit_route", c0hhc.LJI);
        smartRouteBuildRoute.withParam("exit_intent", c0hhc.LJII);
        smartRouteBuildRoute.withParam("task_id", c0hhc.LJIIIIZZ);
        smartRouteBuildRoute.withParam("enter_to", c0hhc.LJIIIZ);
        smartRouteBuildRoute.withParam("source", c0hhc.LJIIJJI);
        smartRouteBuildRoute.withParam("exit_broadcast_intent", c0hhc.LJIIL);
        smartRouteBuildRoute.withParam("enter_from_permission", "social_avatar_creation_page");
        smartRouteBuildRoute.withParam("shoot_way", "social_avatar");
        Long l = c0hhc.LJFF;
        if (l != null) {
            smartRouteBuildRoute.withParam("story_id", l);
        } else {
            smartRouteBuildRoute.withParam("conversation_id", c0hhc.LIZLLL);
            smartRouteBuildRoute.withParam("conversation_type", c0hhc.LJ);
        }
        smartRouteBuildRoute.withParam("regenerate", c0hhc.LJIIJ);
        smartRouteBuildRoute.withParam("generation_scene", c0hhc.LJIILIIL);
        smartRouteBuildRoute.withParam("perform_generation_outside", c0hhc.LJIILJJIL);
        if (!c0hhc.LJIILJJIL) {
            smartRouteBuildRoute.open();
        } else {
            smartRouteBuildRoute.open(5001, new OnActivityResultCallback() { // from class: X.0HKE
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    SocialAvatarGenerateData socialAvatarGenerateData;
                    if (i != 5001 || i2 != -1 || intent == null) {
                        return;
                    }
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null && (socialAvatarGenerateData = (SocialAvatarGenerateData) extras.getParcelable("social_avatar_generate_data")) != null) {
                            if (Intrinsics.LJFF(c0hhc.LIZIZ, "dm_action_bar_mix_studio")) {
                                IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJJJ(false);
                                C1440005kM.LIZ(new IEvent(EnumC441640HTm.DM_ACTION_BAR) { // from class: X.07yN
                                    public final EnumC441640HTm LIZ;

                                    public final boolean equals(Object obj) {
                                        if (this == obj) {
                                            return true;
                                        }
                                        return (obj instanceof C2036507yN) && this.LIZ == ((C2036507yN) obj).LIZ;
                                    }

                                    public final int hashCode() {
                                        return this.LIZ.hashCode();
                                    }

                                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                    public final /* synthetic */ IEvent post() {
                                        C1440005kM.LIZ(this);
                                        return this;
                                    }

                                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                    public final /* synthetic */ IEvent postSticky() {
                                        C1440005kM.LIZIZ(this);
                                        return this;
                                    }

                                    public final String toString() {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("OpenMixStudioPanelEvent(enterFrom=");
                                        sbLIZ.append(this.LIZ);
                                        sbLIZ.append(')');
                                        return C2188811AlT.LIZIZ(sbLIZ);
                                    }

                                    {
                                        this.LIZ = enumC441640HTm;
                                    }
                                });
                            } else if (Intrinsics.LJFF(c0hhc.LIZJ, "chat")) {
                                C454640HsE c454640HsE = IMStickerApi.LIZ;
                                c454640HsE.LIZIZ().getImSocialAvatarService().LIZJ(6);
                                c454640HsE.LIZIZ().getImSocialAvatarService().LJJJJ(true);
                            }
                            SocialAvatarCreationServiceImpl socialAvatarCreationServiceImpl = this;
                            C0HHC c0hhc2 = c0hhc;
                            socialAvatarCreationServiceImpl.getClass();
                            socialAvatarCreationServiceImpl.LJI(socialAvatarGenerateData, SocialAvatarCreationServiceImpl.LJIIIIZZ(c0hhc2));
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
            });
        }
    }

    public final void LJI(SocialAvatarGenerateData socialAvatarGenerateData, C0HL8 c0hl8) {
        float f = socialAvatarGenerateData.boyProb;
        String str = socialAvatarGenerateData.originalImagePath;
        String str2 = socialAvatarGenerateData.normImagePath;
        RectF rectF = socialAvatarGenerateData.faceRectF;
        int i = socialAvatarGenerateData.noCenterFaceCount;
        int i2 = socialAvatarGenerateData.notNeutralExpressionCount;
        int i3 = socialAvatarGenerateData.somethingWentWrongCount;
        LIZLLL().LIZ(LJ(), new C0HK4(null));
        LIZJ().LIZJ(LJ(), new C438920HJa(-4, null, null, false, null, null, new C438960HJe(true, 4), null, 190));
        C054G c054g = C1956107lP.LIZ;
        C1956107lP.LIZIZ(LJ(), false);
        C054G c054g2 = C1956107lP.LIZ;
        C23250099c.LIZLLL(c054g2, C0PEM.LIZJ, null, new C0HKB(socialAvatarGenerateData, str, null), 2);
        C23250099c.LIZLLL(c054g2, null, null, new C0HKD(this, str, str2, rectF, socialAvatarGenerateData, c0hl8, i, i2, i3, f, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult> r13, X.EnumC439310HKn r14, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult>> r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl.LJFF(java.util.List, X.0HKn, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C0HL8 r20, java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult> r21, float r22, X.InterfaceC497601wk r23, boolean r24, int r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) {
        /*
            r19 = this;
            r5 = r26
            boolean r0 = r5 instanceof X.C0HKF
            r1 = r19
            if (r0 == 0) goto L74
            r4 = r5
            X.0HKF r4 = (X.C0HKF) r4
            int r3 = r4.LLILLL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L74
            int r3 = r3 - r2
            r4.LLILLL = r3
        L16:
            java.lang.Object r5 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L7a
            X.C155000ia.LIZIZ(r5)
            r2 = 1
        L27:
            X.054G r0 = X.C1956107lP.LIZ
            java.lang.String r0 = LJ()
            X.C1956107lP.LIZIZ(r0, r2)
            com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService r1 = r1.LIZLLL()
            java.lang.String r0 = LJ()
            r1.LIZLLL(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            X.C155000ia.LIZIZ(r5)
            X.0HLI r5 = r1.LIZ
            r0 = r22
            double r9 = (double) r0
            java.lang.String r11 = ""
            java.lang.String r12 = LJ()
            r0 = 22
            kotlin.jvm.internal.AFwS289S0000000_6 r15 = kotlin.jvm.internal.AFwS289S0000000_6.get$arr$(r0)
            r0 = 307(0x133, float:4.3E-43)
            kotlin.jvm.internal.AFwS236S0000000_6 r16 = kotlin.jvm.internal.AFwS236S0000000_6.get$arr$(r0)
            r0 = 308(0x134, float:4.32E-43)
            kotlin.jvm.internal.AFwS236S0000000_6 r17 = kotlin.jvm.internal.AFwS236S0000000_6.get$arr$(r0)
            r4.LLILLL = r2
            r2 = 1
            r14 = r25
            r13 = r24
            r7 = r23
            r8 = r21
            r6 = r20
            r18 = r4
            java.lang.Object r0 = r5.LJFF(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r3) goto L27
            return r3
        L74:
            X.0HKF r4 = new X.0HKF
            r4.<init>(r1, r5)
            goto L16
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl.LJII(X.0HL8, java.util.List, float, X.01wk, boolean, int, X.05Vn):java.lang.Object");
    }
}
