package kotlin.jvm.internal;

import X.C09AY;
import X.C1211030hcT;
import X.C1215860hkG;
import X.C1232140iAW;
import X.C1239400iME;
import X.C1246630iXt;
import X.C127K;
import X.C1361400lX0;
import X.C1388190mED;
import X.C19530011b0;
import X.C20013213Sg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2273291DyR;
import X.C2344009Gk;
import X.C786410Ut5;
import X.ViewTreeObserverOnPreDrawListenerC1216040hkY;
import Y.ARunnableS23S1200000_19;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.profile.business.ur.edit.ProfileLemon8ServiceImpl;
import com.ss.android.ugc.profile.business.ur.editprofileassem.EditProfileBioCellAssem;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS135S1200000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS135S1200000_19 awS135S1200000_19) {
        ProfileLemon8ServiceImpl.LJIJI((ProfileLemon8ServiceImpl) awS135S1200000_19.l1, (Activity) awS135S1200000_19.l2, awS135S1200000_19.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS135S1200000_19 awS135S1200000_19) {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C1246630iXt.LIZIZ(activityLJFF, (SharePackage) awS135S1200000_19.l1, awS135S1200000_19.s0, (Aweme) awS135S1200000_19.l2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS135S1200000_19 awS135S1200000_19) {
        String str = awS135S1200000_19.s0;
        int iHashCode = str.hashCode();
        if (iHashCode != -2006095252) {
            if (iHashCode != 309697203) {
                if (iHashCode == 439542137 && str.equals("FetchTTSAudioFile")) {
                    ((C1211030hcT) awS135S1200000_19.l1).LIZ(71, 99, 8000L, new AwS598S0100000_19((C19530011b0) awS135S1200000_19.l2, 285));
                }
            } else if (str.equals("UploadVideoFrame")) {
                ((C1211030hcT) awS135S1200000_19.l1).LIZ(1, 20, Mp4ScreenVideoLoadTimeout.CONTROL, new AwS598S0100000_19((C19530011b0) awS135S1200000_19.l2, 286));
            }
        } else if (str.equals("FetchTexts")) {
            ((C1211030hcT) awS135S1200000_19.l1).LIZ(21, 70, 10000L, new AwS598S0100000_19((C19530011b0) awS135S1200000_19.l2, 284));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS135S1200000_19 awS135S1200000_19) {
        C20013213Sg c20013213Sg = (C20013213Sg) awS135S1200000_19.l1;
        String str = awS135S1200000_19.s0;
        c20013213Sg.LJFF.submit(new ARunnableS23S1200000_19(c20013213Sg, (Aweme) awS135S1200000_19.l2, str, 3));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS135S1200000_19 awS135S1200000_19) {
        EditProfileBioCellAssem editProfileBioCellAssem = (EditProfileBioCellAssem) awS135S1200000_19.l1;
        if (editProfileBioCellAssem.LLILZ) {
            editProfileBioCellAssem.Jo();
            EditProfileBioCellAssem editProfileBioCellAssem2 = (EditProfileBioCellAssem) awS135S1200000_19.l1;
            C127K c127k = (C127K) awS135S1200000_19.l2;
            editProfileBioCellAssem2.Lo();
            View rootView = c127k.getRootView();
            editProfileBioCellAssem2.LLJJI = rootView;
            editProfileBioCellAssem2.LLJJ = new ViewTreeObserverOnPreDrawListenerC1216040hkY(editProfileBioCellAssem2);
            C786410Ut5.y3(rootView.getViewTreeObserver(), editProfileBioCellAssem2.LLJJ);
            Keva keva = C1215860hkG.LIZ;
            String str = awS135S1200000_19.s0;
            Keva keva2 = C1215860hkG.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_time_tooltip_shown_");
            sbLIZ.append(str);
            keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
            String str2 = awS135S1200000_19.s0;
            keva2.storeInt(C1215860hkG.LIZ(str2), keva2.getInt(C1215860hkG.LIZ(str2), 0) + 1);
            C1232140iAW.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            C20684815ws.LJIILLIIL("show_add_mention_in_bio_prompt", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS135S1200000_19 awS135S1200000_19) {
        EditProfileBioCellAssem editProfileBioCellAssem = (EditProfileBioCellAssem) awS135S1200000_19.l1;
        if (editProfileBioCellAssem.LLILZ) {
            editProfileBioCellAssem.Jo();
            EditProfileBioCellAssem editProfileBioCellAssem2 = (EditProfileBioCellAssem) awS135S1200000_19.l1;
            View view = (View) awS135S1200000_19.l2;
            editProfileBioCellAssem2.Lo();
            View rootView = view.getRootView();
            editProfileBioCellAssem2.LLJJI = rootView;
            editProfileBioCellAssem2.LLJJ = new ViewTreeObserverOnPreDrawListenerC1216040hkY(editProfileBioCellAssem2);
            C786410Ut5.y3(rootView.getViewTreeObserver(), editProfileBioCellAssem2.LLJJ);
            Keva keva = C1215860hkG.LIZ;
            String str = awS135S1200000_19.s0;
            Keva keva2 = C1215860hkG.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_time_tooltip_shown_");
            sbLIZ.append(str);
            keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
            String str2 = awS135S1200000_19.s0;
            keva2.storeInt(C1215860hkG.LIZ(str2), keva2.getInt(C1215860hkG.LIZ(str2), 0) + 1);
            C1232140iAW.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            C20684815ws.LJIILLIIL("show_add_mention_in_bio_prompt", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS135S1200000_19 awS135S1200000_19) {
        C1239400iME c1239400iME = C1239400iME.LIZ;
        String str = awS135S1200000_19.s0;
        c1239400iME.getClass();
        C1239400iME.LIZIZ("manage_personalized_feeds", str);
        Function0 function0 = (Function0) awS135S1200000_19.l1;
        if (function0 != null) {
            function0.invoke();
        }
        ComplianceServiceProvider.LJI().LJJJJJL(C1388190mED.LIZIZ((Context) awS135S1200000_19.l2), awS135S1200000_19.s0, "halfsheet");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS135S1200000_19 awS135S1200000_19) {
        C1239400iME c1239400iME = C1239400iME.LIZ;
        String str = awS135S1200000_19.s0;
        c1239400iME.getClass();
        C1239400iME.LIZIZ("privacy", str);
        Function0 function0 = (Function0) awS135S1200000_19.l1;
        if (function0 != null) {
            function0.invoke();
        }
        SmartRouter.buildRoute((Context) awS135S1200000_19.l2, "aweme://privacy/setting").open();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS135S1200000_19 awS135S1200000_19) {
        Function0 function0 = (Function0) awS135S1200000_19.l1;
        if (function0 != null) {
            function0.invoke();
        }
        ComplianceServiceProvider.LJI().LJJJJJL(C1388190mED.LIZIZ((Context) awS135S1200000_19.l2), awS135S1200000_19.s0, "halfsheet");
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS135S1200000_19 awS135S1200000_19) {
        ((Function0) awS135S1200000_19.l1).invoke();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((Context) awS135S1200000_19.l2, "//webview/");
        String strLIZIZ = awS135S1200000_19.s0;
        if (strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://support.tiktok.com/");
            sbLIZ.append(C2273291DyR.LIZ());
            sbLIZ.append("/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        smartRouteBuildRoute.withParam("url", strLIZIZ);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS135S1200000_19(android.content.Context r3, java.lang.String r4, kotlin.jvm.functions.Function0 r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 6: goto L11;
                case 7: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r5
            r1.l2 = r3
            r1.s0 = r4
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS135S1200000_19.<init>(android.content.Context, java.lang.String, kotlin.jvm.functions.Function0, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(C1361400lX0 c1361400lX0, String str, AwS563S0100000_19 awS563S0100000_19, int i) {
        super(0);
        this.$t = i;
        this.l1 = awS563S0100000_19;
        this.l2 = c1361400lX0;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(C20013213Sg c20013213Sg, String str, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l1 = c20013213Sg;
        this.s0 = str;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(Activity activity, ProfileLemon8ServiceImpl profileLemon8ServiceImpl, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = profileLemon8ServiceImpl;
        this.l2 = activity;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(SharePackage sharePackage, String str, Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l1 = sharePackage;
        this.s0 = str;
        this.l2 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(EditProfileBioCellAssem editProfileBioCellAssem, C127K c127k, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = editProfileBioCellAssem;
        this.l2 = c127k;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(EditProfileBioCellAssem editProfileBioCellAssem, TuxTextView tuxTextView, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = editProfileBioCellAssem;
        this.l2 = tuxTextView;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S1200000_19(String str, C1211030hcT c1211030hcT, C19530011b0 c19530011b0, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1211030hcT;
        this.l2 = c19530011b0;
    }
}
