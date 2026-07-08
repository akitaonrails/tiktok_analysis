package kotlin.jvm.internal;

import X.C09AY;
import X.C0GZ0;
import X.C0HNT;
import X.C0NPA;
import X.C1397620mTQ;
import X.C1721980uua;
import X.C19423210ys;
import X.C19514711Wn;
import X.C197039127h;
import X.C20684815ws;
import X.C2344009Gk;
import X.C291001Au;
import X.C418440Gaw;
import X.C440120HNq;
import X.C440130HNr;
import X.C462980IDo;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS73S0300000_6;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS91S1200000_6 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS91S1200000_6 awS91S1200000_6, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setBackgroundResource(R.drawable.ap0);
        c197039127h.setTuxFont(22);
        c197039127h.setTextColorRes(R.attr.a1h);
        c197039127h.setText(awS91S1200000_6.s0);
        c197039127h.setBackgroundRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.U8(c197039127h, new ACListenerS73S0300000_6((C1721980uua) awS91S1200000_6.l1, (EditText) awS91S1200000_6.l2, c197039127h, 2));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS91S1200000_6 awS91S1200000_6, Object obj) {
        C0HNT c0hnt = (C0HNT) obj;
        C291001Au c291001Au = new C291001Au(new C440120HNq((C0NPA) awS91S1200000_6.l1, (List) awS91S1200000_6.l2, awS91S1200000_6.s0));
        C291001Au<C440130HNr> c291001Au2 = c0hnt.LLILLJJLI;
        c0hnt.getClass();
        return new C0HNT(c291001Au, c291001Au2);
    }

    public static final Object invoke$2(AwS91S1200000_6 awS91S1200000_6, Object obj) {
        C0HNT c0hnt = (C0HNT) obj;
        C291001Au c291001Au = new C291001Au(new C440130HNr((List) awS91S1200000_6.l1, (List) awS91S1200000_6.l2, awS91S1200000_6.s0));
        C291001Au<C440120HNq> c291001Au2 = c0hnt.LL;
        c0hnt.getClass();
        return new C0HNT(c291001Au2, c291001Au);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS91S1200000_6 awS91S1200000_6, Object obj) {
        Context context = (Context) obj;
        int i = (int) (context.getResources().getDisplayMetrics().density * 37.5f);
        final ImageView imageView = new ImageView(context);
        final String str = awS91S1200000_6.s0;
        final Function1 function1 = (Function1) awS91S1200000_6.l1;
        final Function2 function2 = (Function2) awS91S1200000_6.l2;
        imageView.setContentDescription(str);
        imageView.setImageBitmap(C0GZ0.LIZ(i, str));
        C786410Ut5.Q7(imageView, new View.OnClickListener() { // from class: X.0GeB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function1.invoke(str);
                function2.invoke(imageView, str);
            }
        });
        return imageView;
    }

    public static final Object invoke$4(AwS91S1200000_6 awS91S1200000_6, Object obj) {
        C19423210ys c19423210ys = C19423210ys.LIZ;
        String str = awS91S1200000_6.s0;
        c19423210ys.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("allow_avatar_camera", c2344009Gk.LIZ);
        ProfileNaviActivity profileNaviActivity = (ProfileNaviActivity) awS91S1200000_6.l1;
        Function1 function1 = (Function1) awS91S1200000_6.l2;
        profileNaviActivity.getClass();
        C19514711Wn.LIZIZ.LIZIZ(profileNaviActivity, TokenCert.Companion.with("bpea-tools_request_camera_permission_profile_navi")).LIZIZ("android.permission.CAMERA").LIZJ(new C462980IDo(function1, 6));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS91S1200000_6 awS91S1200000_6, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131827146, new AwS91S1200000_6(awS91S1200000_6.s0, (String) awS91S1200000_6.l1, (ProfileNaviActivity) awS91S1200000_6.l2, (Function1<? super Boolean, Unit>) 4));
        c1397620mTQ.LJII(2131827147, new AwS117S1100000_3(awS91S1200000_6.s0, (String) awS91S1200000_6.l2, (Function1<? super Boolean, Unit>) 7));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S1200000_6(C0NPA c0npa, C0NPA c0npa2, List<String> list, String str) {
        super(1);
        this.$t = str;
        this.l1 = c0npa;
        this.l2 = c0npa2;
        this.s0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S1200000_6(String str, C1721980uua c1721980uua, EditText editText, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1721980uua;
        this.l2 = editText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S1200000_6(String str, String str2, ProfileNaviActivity profileNaviActivity, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = profileNaviActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS91S1200000_6(String str, ProfileNaviActivity profileNaviActivity, AwS60S0210000_6 awS60S0210000_6, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = profileNaviActivity;
        this.l2 = awS60S0210000_6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S1200000_6(String str, String str2, Function1<? super String, Unit> function1, Function2<? super ImageView, ? super String, Unit> function2) {
        super(1);
        this.$t = function2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS91S1200000_6(List list, List<C0NPA> list2, List<String> list3, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.l2 = list2;
        this.s0 = list3;
    }
}
