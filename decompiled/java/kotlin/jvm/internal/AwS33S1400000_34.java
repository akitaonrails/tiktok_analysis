package kotlin.jvm.internal;

import X.C09AY;
import X.C20622015mk;
import X.C2246021CvY;
import X.EnumC1073720e30;
import X.EnumC1262370ixH;
import X.InterfaceC1072780e1U;
import X.InterfaceC20621715mh;
import com.ss.android.ugc.aweme.recommend.RecUserPopupInMainActivityController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS33S1400000_34 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS33S1400000_34 awS33S1400000_34, Object obj) {
        EnumC1073720e30 enumC1073720e30 = (EnumC1073720e30) obj;
        InterfaceC20621715mh interfaceC20621715mh = (InterfaceC20621715mh) awS33S1400000_34.l1;
        if (interfaceC20621715mh != null) {
            interfaceC20621715mh.M71(new C20622015mk());
        }
        ((RecUserPopupInMainActivityController) awS33S1400000_34.l2).LLILZ.vQ2((EnumC1262370ixH) awS33S1400000_34.l3, awS33S1400000_34.s0, enumC1073720e30);
        C2246021CvY.LIZ((InterfaceC1072780e1U) awS33S1400000_34.l4, ((RecUserPopupInMainActivityController) awS33S1400000_34.l2).LLILLJJLI);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS33S1400000_34 awS33S1400000_34, Object obj) {
        EnumC1073720e30 enumC1073720e30 = (EnumC1073720e30) obj;
        InterfaceC20621715mh interfaceC20621715mh = (InterfaceC20621715mh) awS33S1400000_34.l1;
        if (interfaceC20621715mh != null) {
            interfaceC20621715mh.M71(new C20622015mk());
        }
        ((RecUserPopupInMainActivityController) awS33S1400000_34.l2).LLILZ.vQ2((EnumC1262370ixH) awS33S1400000_34.l3, awS33S1400000_34.s0, enumC1073720e30);
        C2246021CvY.LIZ((InterfaceC1072780e1U) awS33S1400000_34.l4, ((RecUserPopupInMainActivityController) awS33S1400000_34.l2).LLILLJJLI);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S1400000_34(InterfaceC20621715mh interfaceC20621715mh, RecUserPopupInMainActivityController recUserPopupInMainActivityController, EnumC1262370ixH enumC1262370ixH, String str, InterfaceC1072780e1U interfaceC1072780e1U, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC20621715mh;
        this.l2 = recUserPopupInMainActivityController;
        this.l3 = enumC1262370ixH;
        this.s0 = str;
        this.l4 = interfaceC1072780e1U;
    }
}
