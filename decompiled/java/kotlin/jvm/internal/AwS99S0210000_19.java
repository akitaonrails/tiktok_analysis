package kotlin.jvm.internal;

import X.AbstractC1223210hw7;
import X.AbstractC848400XPy;
import X.C09AY;
import X.C0I0B;
import X.C0XQ7;
import X.C1229030i5V;
import X.C1242870iRp;
import X.C1254160ik2;
import X.C19EG;
import X.C2000507sZ;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2344009Gk;
import X.C268330AfP;
import X.C786410Ut5;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardUserComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS99S0210000_19 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS99S0210000_19 awS99S0210000_19) {
        C1242870iRp c1242870iRp = (C1242870iRp) awS99S0210000_19.l0;
        C19EG c19eg = (C19EG) awS99S0210000_19.l1;
        boolean z = awS99S0210000_19.z2;
        c1242870iRp.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("show_lemon8_intro_popup", c2344009Gk.LIZ);
        C1254160ik2.LIZIZ.LIZLLL(c19eg, "personal_homepage", z);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS99S0210000_19 awS99S0210000_19) {
        Integer numLJIIJJI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C2000507sZ c2000507sZ = (C2000507sZ) awS99S0210000_19.l0;
        boolean z = awS99S0210000_19.z2;
        c2000507sZ.getClass();
        c2344009Gk.LJIIIIZZ("is_login", AbstractC1223210hw7.LIZJ(z));
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS99S0210000_19.l1, "social_share_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        } else {
            numLJIIJJI = null;
        }
        c2344009Gk.LJ(numLJIIJJI, "share_type");
        c2344009Gk.LJIIIIZZ("share_source", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS99S0210000_19.l1, "utm_source"));
        c2344009Gk.LJIIIIZZ("share_link_id", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS99S0210000_19.l1, "share_link_id"));
        c2344009Gk.LJIIIIZZ("share_uid", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS99S0210000_19.l1, "user_id"));
        C2000507sZ c2000507sZ2 = (C2000507sZ) awS99S0210000_19.l0;
        Uri uri = (Uri) awS99S0210000_19.l1;
        c2000507sZ2.getClass();
        c2344009Gk.LJIIIIZZ("is_myself", AbstractC1223210hw7.LIZJ(Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_id"), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())));
        c2344009Gk.LJIIIIZZ("checksum", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS99S0210000_19.l1, "checksum"));
        c2344009Gk.LJIIIIZZ("utm_campaign", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter((Uri) awS99S0210000_19.l1, "utm_campaign"));
        return c2344009Gk.LIZ;
    }

    public static final Object invoke$2(AwS99S0210000_19 awS99S0210000_19) {
        C1229030i5V c1229030i5V = C1229030i5V.LIZJ;
        c1229030i5V.LJ((List) awS99S0210000_19.l0, "create_group", C0I0B.LJFF.LIZIZ());
        if (awS99S0210000_19.z2) {
            Context context = (Context) awS99S0210000_19.l1;
            c1229030i5V.getClass();
            C1229030i5V.LIZJ(context);
        } else {
            Context context2 = (Context) awS99S0210000_19.l1;
            c1229030i5V.getClass();
            C1229030i5V.LIZIZ(context2);
        }
        return Boolean.TRUE;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS99S0210000_19 awS99S0210000_19) {
        if (!awS99S0210000_19.z2) {
            C786410Ut5.LJLLLLLL(8, ((HeaderRecommendUserCardUserComponent) awS99S0210000_19.l0).zp());
            if (!C268330AfP.LJIIIZ()) {
                ((HeaderRecommendUserCardUserComponent) awS99S0210000_19.l0).Ep(-2);
                ((HeaderRecommendUserCardUserComponent) awS99S0210000_19.l0).Ap(-2);
                ((HeaderRecommendUserCardUserComponent) awS99S0210000_19.l0).Bp(1.0f);
            }
        }
        Function0 function0 = (Function0) awS99S0210000_19.l1;
        if (function0 != null) {
            function0.invoke();
            return Unit.LIZ;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0210000_19(C2000507sZ c2000507sZ, boolean z, Uri uri, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2000507sZ;
        this.z2 = z;
        this.l1 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0210000_19(C1242870iRp c1242870iRp, C19EG c19eg, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1242870iRp;
        this.l1 = c19eg;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS99S0210000_19(Context context, List list, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.z2 = z;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS99S0210000_19(boolean z, boolean z2, HeaderRecommendUserCardUserComponent headerRecommendUserCardUserComponent, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = headerRecommendUserCardUserComponent;
    }
}
