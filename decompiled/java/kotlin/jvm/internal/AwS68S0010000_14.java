package kotlin.jvm.internal;

import X.C09AY;
import X.C0Z17;
import X.C0Z1M;
import X.C0Z1O;
import X.C23250099c;
import X.C890780Yx2;
import X.C890860YxA;
import X.C893030Z1p;
import X.C893050Z1r;
import X.InterfaceC893080Z1u;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public class AwS68S0010000_14 extends C09AY implements Function2 {
    public final int $t;
    public boolean z0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0010000_14(int i) {
        super(2);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS68S0010000_14(boolean z, int i) {
        super(2);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS68S0010000_14 awS68S0010000_14, Object obj, Object obj2) {
        BaseActionViewModel baseActionViewModel = (BaseActionViewModel) obj;
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) obj2;
        if (awS68S0010000_14.z0) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C0Z17(interfaceC893080Z1u, baseActionViewModel, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS68S0010000_14 awS68S0010000_14, Object obj, Object obj2) {
        BaseActionViewModel baseActionViewModel = (BaseActionViewModel) obj;
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) obj2;
        boolean z = awS68S0010000_14.z0;
        C0Z1M c0z1mLJJJJ = interfaceC893080Z1u.LJJJJ();
        if (c0z1mLJJJJ != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C0Z1O(c0z1mLJJJJ, z, interfaceC893080Z1u, baseActionViewModel, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS68S0010000_14 awS68S0010000_14, Object obj, Object obj2) {
        BaseSwitchActionViewModel baseSwitchActionViewModel = (BaseSwitchActionViewModel) obj;
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) obj2;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel), null, null, new C893050Z1r(interfaceC893080Z1u, baseSwitchActionViewModel, null), 3);
        if (awS68S0010000_14.z0) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel), null, null, new C893030Z1p(interfaceC893080Z1u, baseSwitchActionViewModel, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS68S0010000_14 awS68S0010000_14, Object obj, Object obj2) {
        BaseActionViewModel baseActionViewModel = (BaseActionViewModel) obj;
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) obj2;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C890780Yx2(interfaceC893080Z1u, baseActionViewModel, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C890860YxA(interfaceC893080Z1u, awS68S0010000_14.z0, baseActionViewModel, null), 3);
        return Unit.LIZ;
    }
}
