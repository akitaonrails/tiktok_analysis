package tbk;

import X.C1619110sEf;
import X.C20663515tR;
import X.C20663815tU;
import X.InterfaceC19330810jy;
import X.InterfaceC539120LCk;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends C1619110sEf implements InterfaceC19330810jy {
    public final int[] LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function1<InnerPushMessage, Boolean> LLILLL;
    public InterfaceC539120LCk LLILZ;

    public a() {
        this(null, null, 7);
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LL;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        Function1<InnerPushMessage, Boolean> function1 = this.LLILLL;
        if (function1 != null) {
            return function1.invoke(innerPushMessage).booleanValue();
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        this.LLILZ = c20663515tR;
        return null;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        Integer numValueOf;
        if (innerPushMessage != null && (numValueOf = Integer.valueOf(innerPushMessage.getType())) != null && numValueOf.intValue() == 1015) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().setPublishStatus(11);
        }
    }

    public a(AFwS199S0000000_12 aFwS199S0000000_12, AFwS248S0000000_14 aFwS248S0000000_14, int i) {
        int[] iArr;
        if ((i & 1) != 0) {
            iArr = new int[]{1013, 1014, 1015};
        } else {
            iArr = null;
        }
        aFwS199S0000000_12 = (i & 2) != 0 ? null : aFwS199S0000000_12;
        aFwS248S0000000_14 = (i & 4) != 0 ? null : aFwS248S0000000_14;
        this.LL = iArr;
        this.LLILLJJLI = aFwS199S0000000_12;
        this.LLILLL = aFwS248S0000000_14;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLILZ = null;
    }
}
