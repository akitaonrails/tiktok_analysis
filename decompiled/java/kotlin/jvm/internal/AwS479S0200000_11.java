package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C0RUC;
import X.C291001Au;
import X.C693070RGn;
import X.C723830SaL;
import X.C734260SrA;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC691660RBc;
import X.InterfaceC725050ScJ;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.experiment.StoryNoticeTakedownBannerFixSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AwS479S0200000_11 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS479S0200000_11(InterfaceC725050ScJ interfaceC725050ScJ, InterfaceC725050ScJ<? extends RECEIVER> interfaceC725050ScJ2, InterfaceC1631630sYr<? super RECEIVER, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        super(3);
        this.$t = interfaceC1631630sYr;
        this.l0 = interfaceC725050ScJ;
        this.l1 = interfaceC725050ScJ2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS479S0200000_11(C734260SrA c734260SrA, Aweme aweme, int i) {
        super(3);
        this.$t = i;
        this.l0 = c734260SrA;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS479S0200000_11(ReusedAssem reusedAssem, T t, Function0<Unit> function0) {
        super(3);
        this.$t = function0;
        this.l0 = reusedAssem;
        this.l1 = t;
    }

    public static final Object invoke$0(AwS479S0200000_11 awS479S0200000_11, Object obj, Object obj2, Object obj3) {
        C03H5 actualReceiver = ((InterfaceC725050ScJ) awS479S0200000_11.l0).getActualReceiver();
        if (actualReceiver != null) {
            C723830SaL.LIZIZ(actualReceiver, new AwS73S0500000_11((InterfaceC1631630sYr) awS479S0200000_11.l1, (InterfaceC1631630sYr<C03H5, Object, Object, Object, Unit>) actualReceiver, (C03H5) obj, obj2, obj3, (Object) 2));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS479S0200000_11 awS479S0200000_11, Object obj, Object obj2, Object obj3) {
        C693070RGn c693070RGn;
        C291001Au c291001Au = (C291001Au) obj3;
        if (c291001Au != null) {
            c693070RGn = (C693070RGn) c291001Au.LIZ;
        } else {
            c693070RGn = null;
        }
        boolean z = true;
        if ((c693070RGn == null || !c693070RGn.LJ) && (!StoryNoticeTakedownBannerFixSetting.isEnabled() || c693070RGn == null || !Intrinsics.LJFF(c693070RGn.LJII, Boolean.TRUE))) {
            z = false;
        }
        if (obj2 != null || z) {
            C0RUC.LJFF((InterfaceC691660RBc) ((ReusedAssem) awS479S0200000_11.l0), new AwS555S0100000_11((Function0) awS479S0200000_11.l1, (Function0<Unit>) 1531));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS479S0200000_11 awS479S0200000_11, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) obj2).booleanValue()) {
            ((C734260SrA) awS479S0200000_11.l0).LIZJ((Aweme) awS479S0200000_11.l1, zBooleanValue, false);
        }
        return Unit.LIZ;
    }
}
