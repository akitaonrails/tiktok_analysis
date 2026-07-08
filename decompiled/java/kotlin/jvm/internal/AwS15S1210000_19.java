package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C19EG;
import android.app.Activity;
import com.ss.android.ugc.profile.business.ur.edit.ProfileLemon8ServiceImpl;
import com.ss.android.ugc.profile.business.ur.platform.business.RelationFollowerProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS15S1210000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

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

    public static final Object invoke$0(AwS15S1210000_19 awS15S1210000_19, Object obj) {
        int i;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        if (awS15S1210000_19.z3) {
            i = 2131822638;
        } else {
            i = 2131822641;
        }
        String str = awS15S1210000_19.s0;
        c1397620mTQ.LJFF(i, new AwS103S1200000_19((Activity) awS15S1210000_19.l2, (ProfileLemon8ServiceImpl) awS15S1210000_19.l1, str, 0));
        c1397620mTQ.LJII(R.string.f1_, null);
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS15S1210000_19 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS15S1210000_19.invoke$1(kotlin.jvm.internal.AwS15S1210000_19, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1210000_19(C19EG c19eg, RelationFollowerProtocol relationFollowerProtocol, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19eg;
        this.l2 = relationFollowerProtocol;
        this.z3 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS15S1210000_19(boolean z, String str, ProfileLemon8ServiceImpl profileLemon8ServiceImpl, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.s0 = str;
        this.l1 = profileLemon8ServiceImpl;
        this.l2 = activity;
    }
}
