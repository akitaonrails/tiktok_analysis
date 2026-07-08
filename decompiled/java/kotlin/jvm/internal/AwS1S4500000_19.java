package kotlin.jvm.internal;

import X.C09AY;
import X.C10EK;
import X.C10EW;
import X.C1247570iZP;
import X.C1389890mGx;
import X.C1397620mTQ;
import X.C1440005kM;
import X.C786410Ut5;
import X.InterfaceC19225710Jj;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS1S4500000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS1S4500000_19 awS1S4500000_19, Object obj) {
        String string = ((Activity) awS1S4500000_19.l4).getString(2131827615);
        String str = "";
        if (string == null) {
            string = "";
        }
        String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{((User) awS1S4500000_19.l5).getUniqueId()}, 1));
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS1S4500000_19.l4);
        c1389890mGx.LJIIJ(strJ4);
        c1389890mGx.LJIIJJI();
        String uid = ((User) awS1S4500000_19.l5).getUid();
        String secUid = ((User) awS1S4500000_19.l5).getSecUid();
        if (secUid != null) {
            str = secUid;
        }
        C1440005kM.LIZ(new C1247570iZP(uid, str));
        C10EK c10ek = C10EK.LIZ;
        Activity activity = (Activity) awS1S4500000_19.l4;
        User user = (User) awS1S4500000_19.l5;
        InterfaceC19225710Jj interfaceC19225710Jj = (InterfaceC19225710Jj) awS1S4500000_19.l6;
        String str2 = awS1S4500000_19.s0;
        String str3 = awS1S4500000_19.s1;
        String str4 = awS1S4500000_19.s2;
        String str5 = awS1S4500000_19.s3;
        AwemeRawAd awemeRawAd = (AwemeRawAd) awS1S4500000_19.l7;
        C10EW c10ew = (C10EW) awS1S4500000_19.l8;
        c10ek.getClass();
        C10EK.LJIIIZ(activity, user, interfaceC19225710Jj, str2, str3, str4, str5, awemeRawAd, c10ew);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S4500000_19 awS1S4500000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131838680, new AwS1S4500000_19((Activity) awS1S4500000_19.l4, (User) awS1S4500000_19.l5, (InterfaceC19225710Jj) awS1S4500000_19.l6, awS1S4500000_19.s0, awS1S4500000_19.s1, awS1S4500000_19.s2, awS1S4500000_19.s3, (AwemeRawAd) awS1S4500000_19.l7, (C10EW) awS1S4500000_19.l8, 0));
        c1397620mTQ.LJII(R.string.f1_, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S4500000_19(Activity activity, User user, InterfaceC19225710Jj interfaceC19225710Jj, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, C10EW c10ew, int i) {
        super(1);
        this.$t = i;
        this.l4 = activity;
        this.l5 = user;
        this.l6 = interfaceC19225710Jj;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.l7 = awemeRawAd;
        this.l8 = c10ew;
    }
}
