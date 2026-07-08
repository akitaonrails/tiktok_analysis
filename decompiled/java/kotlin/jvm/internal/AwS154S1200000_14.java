package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z2F;
import X.C0Z6T;
import X.C0Z9N;
import X.C1383370m6R;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C461720I8s;
import X.C893930Z5b;
import X.C898300ZLw;
import X.C898320ZLy;
import X.C985403tE;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS154S1200000_14 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0Z5b] */
    public static final Object invoke$0(AwS154S1200000_14 awS154S1200000_14, Object obj, Object obj2) {
        Activity activity = (Activity) obj2;
        String str = awS154S1200000_14.s0;
        C0Z2F c0z2f = (C0Z2F) awS154S1200000_14.l1;
        C0Z6T c0z6t = (C0Z6T) awS154S1200000_14.l2;
        if (activity != null) {
            IMGroupChatDetailAnalytics.LIZ.LJFF("click_leave_group", new Pair[]{new Pair("enter_from", "group_setting")}, C0I0B.LJFF.LIZIZ());
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
            if (c0y8tLIZ != null) {
                if (c0z2f.LJFF(Long.valueOf(C461720I8s.LIZJ()), str) == C0Z9N.OWNER.getValue() && !c0z6t.LIZJ(c0y8tLIZ)) {
                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                    c1397580mTM.LJII = false;
                    c1397580mTM.LJFF(2131828487);
                    c1397580mTM.LIZ(2131828485);
                    C985403tE.LIZ(c1397580mTM, new AwS54S1300000_14(activity, activity, c0y8tLIZ, str, 5));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                } else {
                    String strLJIIJ = C1383370m6R.LJIIJ(2131835376);
                    ?? r3 = new Object(strLJIIJ) { // from class: X.0Z5b
                    };
                    C1397580mTM c1397580mTM2 = new C1397580mTM(activity);
                    c1397580mTM2.LJII = false;
                    c1397580mTM2.LJI(strLJIIJ);
                    c1397580mTM2.LIZ(2131835377);
                    C985403tE.LIZ(c1397580mTM2, new AwS54S1300000_14((C893930Z5b) r3, c0y8tLIZ, str, activity, 6));
                    new C1397510mTF(c1397580mTM2).LIZLLL();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS154S1200000_14 r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS154S1200000_14.invoke$1(kotlin.jvm.internal.AwS154S1200000_14, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1200000_14(C898320ZLy c898320ZLy, C898300ZLw c898300ZLw, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c898320ZLy;
        this.l2 = c898300ZLw;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS154S1200000_14(String str, C0Z2F c0z2f, C0Z6T c0z6t, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c0z2f;
        this.l2 = c0z6t;
    }
}
