package kotlin.jvm.internal;

import X.C09AY;
import X.C1630350sWn;
import X.C1644450stX;
import X.C1662500tMe;
import X.C1662520tMg;
import X.C375830EoP;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS7S0020000_25 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;
    public boolean z1;

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

    public static final Object invoke$0(AwS7S0020000_25 awS7S0020000_25, Object obj) {
        boolean z;
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        if (!awS7S0020000_25.z0 && !awS7S0020000_25.z1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !awS7S0020000_25.z1;
        return C1662500tMe.LIZ(c1662500tMe, null, null, null, false, false, new C375830EoP(Boolean.valueOf(z2)), z, z2, false, !awS7S0020000_25.z1, null, null, false, null, 31279);
    }

    public static final Object invoke$1(AwS7S0020000_25 awS7S0020000_25, Object obj) {
        C1662500tMe c1662500tMe = (C1662500tMe) obj;
        if (awS7S0020000_25.z0) {
            Boolean bool = Boolean.TRUE;
            return C1662500tMe.LIZ(c1662500tMe, null, null, null, false, false, null, false, false, false, false, null, new C1662520tMg(bool, bool, Boolean.valueOf(awS7S0020000_25.z1), bool), false, null, 28671);
        }
        Boolean bool2 = Boolean.TRUE;
        return C1662500tMe.LIZ(c1662500tMe, null, null, null, false, false, null, false, false, false, false, null, new C1662520tMg(bool2, Boolean.valueOf(awS7S0020000_25.z1), bool2, 2), false, null, 28671);
    }

    public static final Object invoke$2(AwS7S0020000_25 awS7S0020000_25, Object obj) {
        EditFilterState editFilterState = (EditFilterState) obj;
        return editFilterState.copy(new C1644450stX<>(new Pair(Boolean.valueOf(awS7S0020000_25.z0), Boolean.valueOf(awS7S0020000_25.z1))), editFilterState.photoEditorHidePanel, editFilterState.curFilter, editFilterState.cancelStatus, editFilterState.switchFilter, editFilterState.data, editFilterState.gestureService, editFilterState.unRegisterGestureService, editFilterState.ui);
    }

    public static final Object invoke$3(AwS7S0020000_25 awS7S0020000_25, Object obj) {
        return C1630350sWn.LIZ((C1630350sWn) obj, null, new C375830EoP(new Pair(Boolean.valueOf(awS7S0020000_25.z0), Boolean.valueOf(awS7S0020000_25.z1))), false, false, false, null, null, null, 1019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S0020000_25(boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
        this.z1 = z2;
    }
}
