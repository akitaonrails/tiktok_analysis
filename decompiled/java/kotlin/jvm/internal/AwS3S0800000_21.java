package kotlin.jvm.internal;

import X.C09AY;
import X.C1392890mLn;
import X.C1393190mMH;
import X.C1397620mTQ;
import X.C1587170rP9;
import X.EnumC1392960mLu;
import X.EnumC1393020mM0;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS3S0800000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S0800000_21 awS3S0800000_21, Object obj) {
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        User user = (User) awS3S0800000_21.l0;
        Fragment fragment = (Fragment) awS3S0800000_21.l1;
        Activity activity = (Activity) awS3S0800000_21.l2;
        EnumC1393020mM0 enumC1393020mM0 = (EnumC1393020mM0) awS3S0800000_21.l3;
        EnumC1392960mLu enumC1392960mLu = (EnumC1392960mLu) awS3S0800000_21.l4;
        View view = (View) awS3S0800000_21.l5;
        Function1 function1 = (Function1) awS3S0800000_21.l6;
        c1392890mLn.getClass();
        C1392890mLn.LIZJ(user, fragment, activity, enumC1393020mM0, enumC1392960mLu, view, function1);
        C1587170rP9 c1587170rP9 = C1587170rP9.LIZ;
        C1393190mMH c1393190mMH = (C1393190mMH) awS3S0800000_21.l7;
        c1587170rP9.getClass();
        C1587170rP9.LJIIJ("confirm", c1393190mMH);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S0800000_21 awS3S0800000_21, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        User user = (User) awS3S0800000_21.l0;
        Fragment fragment = (Fragment) awS3S0800000_21.l1;
        Activity activity = (Activity) awS3S0800000_21.l2;
        EnumC1393020mM0 enumC1393020mM0 = (EnumC1393020mM0) awS3S0800000_21.l3;
        EnumC1392960mLu enumC1392960mLu = (EnumC1392960mLu) awS3S0800000_21.l4;
        c1397620mTQ.LJFF(2131837835, new AwS3S0800000_21(activity, (View) awS3S0800000_21.l5, fragment, (C1393190mMH) awS3S0800000_21.l7, enumC1393020mM0, enumC1392960mLu, user, (Function1) awS3S0800000_21.l6, 0));
        c1397620mTQ.LJII(2131837832, new AwS387S0200000_21((Function1) awS3S0800000_21.l6, (Function1<? super Boolean, Unit>) awS3S0800000_21.l7, (C1393190mMH) 63));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S0800000_21(Activity activity, View view, Fragment fragment, C1393190mMH c1393190mMH, EnumC1393020mM0 enumC1393020mM0, EnumC1392960mLu enumC1392960mLu, User user, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.l1 = fragment;
        this.l2 = activity;
        this.l3 = enumC1393020mM0;
        this.l4 = enumC1392960mLu;
        this.l5 = view;
        this.l6 = function1;
        this.l7 = c1393190mMH;
    }
}
