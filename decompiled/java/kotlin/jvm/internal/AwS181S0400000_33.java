package kotlin.jvm.internal;

import X.C09AY;
import X.C1118780fDg;
import X.C1118840fDm;
import X.C1126540fQC;
import X.C2182691Abb;
import X.C2182701Abc;
import X.C930540aK4;
import Y.ARunnableS66S0300000_33;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes34.dex */
public class AwS181S0400000_33 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS181S0400000_33 awS181S0400000_33, Object obj, Object obj2) {
        C2182701Abc c2182701Abc = (C2182701Abc) awS181S0400000_33.l0;
        FrameLayout frameLayout = (FrameLayout) awS181S0400000_33.l1;
        C1126540fQC c1126540fQC = (C1126540fQC) awS181S0400000_33.l2;
        c2182701Abc.getClass();
        if (frameLayout != null) {
            HandlerHook.viewPost(frameLayout, new ARunnableS66S0300000_33(c2182701Abc, frameLayout, c1126540fQC, 6));
        }
        C1118840fDm c1118840fDm = (C1118840fDm) awS181S0400000_33.l3;
        C1118780fDg.LIZIZ(c1118840fDm, 4, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS181S0400000_33 awS181S0400000_33, Object obj, Object obj2) {
        C2182691Abb c2182691Abb = (C2182691Abb) awS181S0400000_33.l0;
        FrameLayout frameLayout = (FrameLayout) awS181S0400000_33.l1;
        C1126540fQC c1126540fQC = (C1126540fQC) awS181S0400000_33.l2;
        c2182691Abb.getClass();
        HandlerHook.viewPost(frameLayout, new ARunnableS66S0300000_33(c2182691Abb, frameLayout, c1126540fQC, 3));
        C1118840fDm c1118840fDm = (C1118840fDm) awS181S0400000_33.l3;
        C1118780fDg.LIZIZ(c1118840fDm, 4, c1118840fDm.LIZJ, 2, C930540aK4.LJJII(UserService.getInstance().user().LJIJJLI()));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S0400000_33(C2182691Abb c2182691Abb, FrameLayout frameLayout, C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2182691Abb;
        this.l1 = frameLayout;
        this.l2 = c1126540fQC;
        this.l3 = c1118840fDm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS181S0400000_33(C2182701Abc c2182701Abc, FrameLayout frameLayout, C1126540fQC c1126540fQC, C1118840fDm c1118840fDm, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2182701Abc;
        this.l1 = frameLayout;
        this.l2 = c1126540fQC;
        this.l3 = c1118840fDm;
    }
}
