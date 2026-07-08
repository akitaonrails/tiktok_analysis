package kotlin.jvm.internal;

import X.AbstractRunnableC820240WFq;
import X.C09AY;
import X.C0WG5;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0X0A;
import X.C0XWA;
import X.C0XWJ;
import X.C0XZ2;
import X.C2188811AlT;
import X.C814390Vx7;
import X.C820210WFn;
import X.EnumC852910Xd3;
import X.InterfaceC822740WPg;
import android.os.Bundle;
import com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl;
import com.bytedance.helios.network.ttnet.impl.TTNetServiceImpl;
import com.bytedance.keva.Keva;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailSignUpFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public class AwS162S1100000_13 extends C09AY implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OkHttpServiceImpl.getCookies isHitCache:true size: ");
        sbLIZ.append(((Map) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(OkHttpServiceImpl.cookieLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OkHttpServiceImpl.getCookies isHitCache:false size: ");
        sbLIZ.append(((HashMap) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(OkHttpServiceImpl.cookieLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlConnectionServiceImpl.getCookies isHitCache:true size: ");
        sbLIZ.append(((Map) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(C0X0A.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$11(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UrlConnectionServiceImpl.getCookies isHitCache:false size: ");
        sbLIZ.append(((HashMap) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(C0X0A.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OkHttpServiceImpl.getQueries isHitCache:true size: ");
        sbLIZ.append(((Map) awS162S1100000_13.l1).size());
        sbLIZ.append(" url: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(OkHttpServiceImpl.queryLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OkHttpServiceImpl.getCookies isHitCache:true size: ");
        sbLIZ.append(((Map) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(OkHttpServiceImpl.cookieLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OkHttpServiceImpl.getCookies isHitCache:false size: ");
        sbLIZ.append(((HashMap) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(OkHttpServiceImpl.cookieLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTNetServiceImpl.getCookies isHitCache:true size: ");
        sbLIZ.append(((Map) awS162S1100000_13.l1).size());
        sbLIZ.append(" cookie: ");
        sbLIZ.append(awS162S1100000_13.s0.hashCode());
        sbLIZ.append(" lruCache: ");
        sbLIZ.append(TTNetServiceImpl.cookieLruCache);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS162S1100000_13 awS162S1100000_13) {
        C0XWA c0xwa = C0XWA.LIZ;
        String str = awS162S1100000_13.s0;
        synchronized (c0xwa) {
            Set<String> set = C0XWA.LIZJ;
            set.remove(str);
            ((Keva) C0XWA.LIZIZ.getValue()).storeStringSet("refresh_key", set);
        }
        C0XWJ c0xwj = C0XWJ.LIZ;
        String string = ((Bundle) awS162S1100000_13.l1).getString("login_panel_type");
        String str2 = "";
        if (string == null) {
            string = "";
        }
        String string2 = ((Bundle) awS162S1100000_13.l1).getString("channel_for_ocl");
        if (string2 != null) {
            str2 = string2;
        }
        c0xwj.getClass();
        C0XWJ.LJIILIIL(null, string, true, str2);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS162S1100000_13 awS162S1100000_13) throws Throwable {
        FirebaseAnalytics firebaseAnalytics = ((C0WG5) awS162S1100000_13.l1).LIZ;
        final String str = awS162S1100000_13.s0;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQdp1HqHmhUw2mMY/0359FB66bZtQZRElSwVrkXl8Q+gfSDKB5vNaXndutmOfs", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {str};
        C0WZW c0wzw = new C0WZW(false, "(Ljava/lang/String;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11035, "com/google/firebase/analytics/FirebaseAnalytics", "setUserId", firebaseAnalytics, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11035, "com/google/firebase/analytics/FirebaseAnalytics", "setUserId", null, objArr, firebaseAnalytics, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    firebaseAnalytics = (FirebaseAnalytics) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    str = (String) obj2;
                }
            }
            final C820210WFn c820210WFn = firebaseAnalytics.LIZ;
            c820210WFn.getClass();
            c820210WFn.LIZIZ(new AbstractRunnableC820240WFq(c820210WFn, str) { // from class: X.0WFw
                public final /* synthetic */ String LLILZIL;
                public final /* synthetic */ C820210WFn LLILZLL;

                @Override // X.AbstractRunnableC820240WFq
                public final void LIZ() {
                    InterfaceC820490WGp interfaceC820490WGp = this.LLILZLL.LJI;
                    C0W3J.LJIIIIZZ(interfaceC820490WGp);
                    interfaceC820490WGp.setUserId(this.LLILZIL, this.LL);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(c820210WFn, true);
                    this.LLILZIL = str;
                    this.LLILZLL = c820210WFn;
                }
            });
            c0wst.LIZ(11035, "com/google/firebase/analytics/FirebaseAnalytics", "setUserId", null, objArr, firebaseAnalytics, c0wzw, true);
        }
        return C814390Vx7.LIZ(Unit.LIZ);
    }

    public static final Object invoke$8(AwS162S1100000_13 awS162S1100000_13) {
        if (C0XZ2.LIZIZ(awS162S1100000_13.s0)) {
            EmailSignUpFragment emailSignUpFragment = (EmailSignUpFragment) awS162S1100000_13.l1;
            emailSignUpFragment.QS(emailSignUpFragment.getArguments(), EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP, awS162S1100000_13.s0);
        } else {
            EmailSignUpFragment emailSignUpFragment2 = (EmailSignUpFragment) awS162S1100000_13.l1;
            emailSignUpFragment2.QS(emailSignUpFragment2.getArguments(), EnumC852910Xd3.EMAIL_OTP_SIGNUP, awS162S1100000_13.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS162S1100000_13 awS162S1100000_13) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyRuleExecutor ---> pushRecordItemToRuleStack uniqueKey: ");
        sbLIZ.append(awS162S1100000_13.s0);
        sbLIZ.append(", stack: ");
        sbLIZ.append(((InterfaceC822740WPg) awS162S1100000_13.l1).LIZIZ());
        sbLIZ.append(',');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S1100000_13(C0WG5 c0wg5, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c0wg5;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S1100000_13(EmailSignUpFragment emailSignUpFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = emailSignUpFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S1100000_13(String str, InterfaceC822740WPg interfaceC822740WPg, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC822740WPg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S1100000_13(String str, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS162S1100000_13(String str, HashMap map, int i) {
        super(0);
        this.$t = i;
        this.l1 = map;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS162S1100000_13(Map map, Map<String, String> map2, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }
}
