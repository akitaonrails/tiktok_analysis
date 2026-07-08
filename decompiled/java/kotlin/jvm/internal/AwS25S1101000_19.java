package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C1219970hqt;
import X.C1228470i4b;
import X.C1228650i4t;
import X.C1228780i56;
import X.C1228810i59;
import X.C1229270i5t;
import X.C1230910i8X;
import X.C13LQ;
import X.C197039127h;
import X.C786410Ut5;
import X.EnumC1219960hqs;
import X.InterfaceC1265060j1c;
import Y.ACListenerS154S0100000_19;
import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS25S1101000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S1101000_19 awS25S1101000_19, Object obj) {
        ((InterfaceC1265060j1c) awS25S1101000_19.l1).kV1().clear();
        if (awS25S1101000_19.i2 > 1000) {
            ((InterfaceC1265060j1c) awS25S1101000_19.l1).Ss0(null);
        } else {
            ((InterfaceC1265060j1c) awS25S1101000_19.l1).Om2(awS25S1101000_19.s0);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS25S1101000_19 awS25S1101000_19, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setButtonVariant(awS25S1101000_19.i2);
        c197039127h.setButtonSize(3);
        c197039127h.setText(awS25S1101000_19.s0);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19((Function0) awS25S1101000_19.l1, 298));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS25S1101000_19 awS25S1101000_19, Object obj) {
        boolean z;
        boolean z2;
        List listLJJLL;
        C062P c062p = (C062P) obj;
        C1230910i8X c1230910i8X = (C1230910i8X) awS25S1101000_19.l1;
        String str = c1230910i8X.enterFrom;
        String str2 = c1230910i8X.enterMethod;
        if (c1230910i8X.isFullScreen() == 1) {
            z = true;
        } else {
            z = false;
        }
        C1230910i8X c1230910i8X2 = (C1230910i8X) awS25S1101000_19.l1;
        if (c1230910i8X2.disableMask == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = c1230910i8X2.trafficType;
        if (c1230910i8X2.businessType != EnumC1219960hqs.UNKNOWN.getValue()) {
            C1219970hqt c1219970hqt = EnumC1219960hqs.Companion;
            int i = ((C1230910i8X) awS25S1101000_19.l1).businessType;
            c1219970hqt.getClass();
            listLJJLL = Collections.singletonList(C1219970hqt.LIZ(i));
        } else {
            listLJJLL = C13LQ.LJJLL(EnumC1219960hqs.values());
        }
        c062p.LIZ = new C1228780i56(new C1228470i4b(new C1228650i4t(null, null, null, null, 0, null, false, null, null, false, null, false, null, null, null, null, 0, 0, false, null, null, null, -1, 1), new C1228810i59(str, str2, awS25S1101000_19.s0, z, z2, null, 0L, ((C1230910i8X) awS25S1101000_19.l1).joinGroupSource, null, null, 0, str3, null, listLJJLL, null, null, false, null, new C1229270i5t(awS25S1101000_19.i2, false, null, null, null, null, 0, null, 1022), 2015072)), "", "");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS25S1101000_19 awS25S1101000_19, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setButtonVariant(awS25S1101000_19.i2);
        c197039127h.setButtonSize(3);
        c197039127h.setText(awS25S1101000_19.s0);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19((Function0) awS25S1101000_19.l1, 311));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1101000_19(int i, FollowerListViewModel followerListViewModel, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = followerListViewModel;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1101000_19(C1230910i8X c1230910i8X, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1230910i8X;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S1101000_19(String str, int i, Function0 function0, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = function0;
    }
}
