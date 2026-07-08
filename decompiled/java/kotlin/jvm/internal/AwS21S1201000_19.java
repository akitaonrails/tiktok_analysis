package kotlin.jvm.internal;

import X.C062P;
import X.C09AY;
import X.C1248940ibc;
import X.C1248950ibd;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavBarRootComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS21S1201000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S1201000_19 awS21S1201000_19, Object obj) {
        C062P c062p = (C062P) obj;
        int i = awS21S1201000_19.i3;
        ProfileComponents profileComponents = (ProfileComponents) awS21S1201000_19.l1;
        String str = ((HeaderBaseContainerComponent) awS21S1201000_19.l2).assemTagInternal;
        if (str == null) {
            str = "";
        }
        c062p.LIZ = new C1248950ibd(i, profileComponents, str);
        c062p.LIZIZ = awS21S1201000_19.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S1201000_19 awS21S1201000_19, Object obj) {
        C062P c062p = (C062P) obj;
        int i = awS21S1201000_19.i3;
        ProfileComponents profileComponents = (ProfileComponents) awS21S1201000_19.l1;
        String str = ((ProfileNavBarRootComponent) awS21S1201000_19.l2).assemTagInternal;
        if (str == null) {
            str = "";
        }
        c062p.LIZ = new C1248950ibd(i, profileComponents, str);
        c062p.LIZIZ = awS21S1201000_19.s0;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S1201000_19 awS21S1201000_19, Object obj) {
        C062P c062p = (C062P) obj;
        c062p.LIZ = new C1248940ibc(((ProfileNavBarBaseComponent) awS21S1201000_19.l1).bp(), awS21S1201000_19.i3, (ProfileComponents) awS21S1201000_19.l2);
        c062p.LIZIZ = awS21S1201000_19.s0;
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1201000_19(int i, ProfileComponents profileComponents, HeaderBaseContainerComponent headerBaseContainerComponent, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l1 = profileComponents;
        this.l2 = headerBaseContainerComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1201000_19(int i, ProfileComponents profileComponents, ProfileNavBarRootComponent profileNavBarRootComponent, String str, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.l1 = profileComponents;
        this.l2 = profileNavBarRootComponent;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1201000_19(ProfileNavBarBaseComponent profileNavBarBaseComponent, int i, ProfileComponents profileComponents, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = profileNavBarBaseComponent;
        this.i3 = i;
        this.l2 = profileComponents;
        this.s0 = str;
    }
}
