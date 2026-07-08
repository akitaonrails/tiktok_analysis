package ttpobfuscated;

import X.C1507240pKE;
import X.C1954807lC;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class yc implements o9 {
    public final ac a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ha.values().length];
            try {
                iArr[ha.BlockStart.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[ha.BlockEnd.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[ha.CallBlock.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[ha.Debugger.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[ha.HostCheck.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[ha.SchemeCheck.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[ha.HasPort.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[ha.PortCheck.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr[ha.HasUser.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                iArr[ha.UserCheck.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                iArr[ha.HasPassword.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                iArr[ha.PasswordCheck.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                iArr[ha.HasPath.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                iArr[ha.PathCheck.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                iArr[ha.HasFragment.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            try {
                iArr[ha.FragmentCheck.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
                TryCatchGuardChecker.doCheck(e16);
            }
            try {
                iArr[ha.HasQuery.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
                TryCatchGuardChecker.doCheck(e17);
            }
            try {
                iArr[ha.HasQueryParam.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
                TryCatchGuardChecker.doCheck(e18);
            }
            try {
                iArr[ha.QueryParamCount.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
                TryCatchGuardChecker.doCheck(e19);
            }
            try {
                iArr[ha.QueryParamCheck.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
                TryCatchGuardChecker.doCheck(e20);
            }
            try {
                iArr[ha.MethodCheck.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
                TryCatchGuardChecker.doCheck(e21);
            }
            try {
                iArr[ha.HasBody.ordinal()] = 22;
            } catch (NoSuchFieldError e22) {
                TryCatchGuardChecker.doCheck(e22);
            }
            try {
                iArr[ha.HasHeader.ordinal()] = 23;
            } catch (NoSuchFieldError e23) {
                TryCatchGuardChecker.doCheck(e23);
            }
            try {
                iArr[ha.HeaderCheck.ordinal()] = 24;
            } catch (NoSuchFieldError e24) {
                TryCatchGuardChecker.doCheck(e24);
            }
            try {
                iArr[ha.HasCookies.ordinal()] = 25;
            } catch (NoSuchFieldError e25) {
                TryCatchGuardChecker.doCheck(e25);
            }
            try {
                iArr[ha.HasCookieName.ordinal()] = 26;
            } catch (NoSuchFieldError e26) {
                TryCatchGuardChecker.doCheck(e26);
            }
            try {
                iArr[ha.CookieCheck.ordinal()] = 27;
            } catch (NoSuchFieldError e27) {
                TryCatchGuardChecker.doCheck(e27);
            }
            try {
                iArr[ha.HasProperty.ordinal()] = 28;
            } catch (NoSuchFieldError e28) {
                TryCatchGuardChecker.doCheck(e28);
            }
            try {
                iArr[ha.PropertyCheck.ordinal()] = 29;
            } catch (NoSuchFieldError e29) {
                TryCatchGuardChecker.doCheck(e29);
            }
            try {
                iArr[ha.HasKey.ordinal()] = 30;
            } catch (NoSuchFieldError e30) {
                TryCatchGuardChecker.doCheck(e30);
            }
            try {
                iArr[ha.KeyCheck.ordinal()] = 31;
            } catch (NoSuchFieldError e31) {
                TryCatchGuardChecker.doCheck(e31);
            }
            try {
                iArr[ha.HostCIDRCheck.ordinal()] = 32;
            } catch (NoSuchFieldError e32) {
                TryCatchGuardChecker.doCheck(e32);
            }
            try {
                iArr[ha.MatchKeySubset.ordinal()] = 33;
            } catch (NoSuchFieldError e33) {
                TryCatchGuardChecker.doCheck(e33);
            }
            try {
                iArr[ha.Sample.ordinal()] = 34;
            } catch (NoSuchFieldError e34) {
                TryCatchGuardChecker.doCheck(e34);
            }
            try {
                iArr[ha.BucketConfig.ordinal()] = 35;
            } catch (NoSuchFieldError e35) {
                TryCatchGuardChecker.doCheck(e35);
            }
            try {
                iArr[ha.Log.ordinal()] = 36;
            } catch (NoSuchFieldError e36) {
                TryCatchGuardChecker.doCheck(e36);
            }
            try {
                iArr[ha.MatchFieldKeySubset.ordinal()] = 37;
            } catch (NoSuchFieldError e37) {
                TryCatchGuardChecker.doCheck(e37);
            }
            try {
                iArr[ha.ValidatePackageManifest.ordinal()] = 38;
            } catch (NoSuchFieldError e38) {
                TryCatchGuardChecker.doCheck(e38);
            }
            try {
                iArr[ha.ValidatePackageStructure.ordinal()] = 39;
            } catch (NoSuchFieldError e39) {
                TryCatchGuardChecker.doCheck(e39);
            }
            try {
                iArr[ha.ValidatePackageFileChecksums.ordinal()] = 40;
            } catch (NoSuchFieldError e40) {
                TryCatchGuardChecker.doCheck(e40);
            }
            a = iArr;
        }
    }

    public yc(ac acVar) {
        this.a = acVar;
    }

    public final o7 a(List<C1507240pKE> list, s sVar) {
        return new q(list, sVar);
    }

    public final o7 b(List<C1507240pKE> list, s sVar) {
        return new e9(list, sVar, this.a.F(), this.a.j(), this.a.k(), this.a.l());
    }

    public final o7 a(List<C1507240pKE> list, s sVar, ad<Request> adVar) {
        return new hd(list, sVar, this.a.l(), this.a.F(), this.a.j(), this.a.k(), adVar);
    }

    public final o7 a(ha haVar, List<C1507240pKE> list, s sVar, ad<Request> adVar) {
        switch (a.a[haVar.ordinal()]) {
            case 1:
                return new o(list);
            case 2:
                return new n(list);
            case 3:
                return new a0(list);
            case 4:
                return new z9(list);
            case 5:
                return new l7(list);
            case 6:
                return new ld(list);
            case 7:
                return new s6(list);
            case 8:
                return new fb(list);
            case BdTuring.TYPE_ECAF /* 9 */:
                return new x6(list);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return new qg(list);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return new q6(list);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new db(list);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new r6(list);
            case 14:
                return new eb(list);
            case 15:
                return new n6(list);
            case 16:
                return new k5(list);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new v6(list);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new w6(list);
            case 19:
                return new ub(list);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return new tb(list);
            case 21:
                return new n9(list);
            case 22:
                return new k6(list);
            case 23:
                return new o6(list);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return new c7(list);
            case 25:
                return new m6(list);
            case 26:
                return new l6(list);
            case 27:
                return new c2(list);
            case 28:
                return new t6(list, this.a.F());
            case 29:
                return new nb(list, this.a.F());
            case 30:
                return new p6(list, ua.a.b().f().w());
            case 31:
                return new o8(list, ua.a.b().f().w());
            case 32:
                return new k7(list, ua.a.b().f().v());
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return new m9(list);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return a(list, sVar, adVar);
            case 35:
                return new q(list, sVar);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return b(list, sVar);
            case 37:
                return new l9(list);
            case 38:
                return new xg(list);
            case 39:
                return new yg(list);
            case 40:
                return new wg(list);
            default:
                throw new C1954807lC();
        }
    }
}
