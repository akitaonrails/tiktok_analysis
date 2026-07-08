package kotlin.jvm.internal;

import X.C09AY;
import X.C1665110tQr;
import X.C1666190tSb;
import X.C1669300tXc;
import X.C1683130ttv;
import X.C341440Da2;
import X.EnumC1685450txf;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import androidx.activity.OnBackPressedDispatcher;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AwS28S0401000_25 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
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
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS28S0401000_25 awS28S0401000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((UserMatchedAssem) awS28S0401000_25.l0).Vo((InterfaceC1685750ty9) awS28S0401000_25.l1, (User) awS28S0401000_25.l2, (EnumC1685450txf) awS28S0401000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS28S0401000_25.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S0401000_25 awS28S0401000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1669300tXc.LIZ((InterfaceC1685750ty9) awS28S0401000_25.l0, (SocialMediaPickerViewModel) awS28S0401000_25.l1, (SocMediaResource) awS28S0401000_25.l2, (Function0) awS28S0401000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS28S0401000_25.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS28S0401000_25 r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS28S0401000_25.invoke$2(kotlin.jvm.internal.AwS28S0401000_25, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS28S0401000_25 awS28S0401000_25, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666190tSb.LJII((C1665110tQr) awS28S0401000_25.l0, (InterfaceC1685750ty9) awS28S0401000_25.l1, (Function1) awS28S0401000_25.l2, (Function0) awS28S0401000_25.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS28S0401000_25.i4 | 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0401000_25(int i, int i2, SocialMediaPickerViewModel socialMediaPickerViewModel, Function1<? super String, Unit> function1, C1683130ttv c1683130ttv, OnBackPressedDispatcher onBackPressedDispatcher) {
        super(2);
        this.$t = onBackPressedDispatcher;
        this.i4 = i;
        this.l0 = i2;
        this.l1 = socialMediaPickerViewModel;
        this.l2 = function1;
        this.l3 = c1683130ttv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0401000_25(C1665110tQr c1665110tQr, C1665110tQr c1665110tQr2, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super Float, Unit> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1665110tQr;
        this.l1 = c1665110tQr2;
        this.l2 = interfaceC1685750ty9;
        this.l3 = function1;
        this.i4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS28S0401000_25(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, SocialMediaPickerViewModel socialMediaPickerViewModel, SocMediaResource socMediaResource, Function0<Unit> function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1685750ty9;
        this.l1 = interfaceC1685750ty92;
        this.l2 = socialMediaPickerViewModel;
        this.l3 = socMediaResource;
        this.i4 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S0401000_25(UserMatchedAssem userMatchedAssem, InterfaceC1685750ty9 interfaceC1685750ty9, User user, EnumC1685450txf enumC1685450txf, int i, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = userMatchedAssem;
        this.l1 = interfaceC1685750ty9;
        this.l2 = user;
        this.l3 = enumC1685450txf;
        this.i4 = i;
    }
}
