package kotlin.jvm.internal;

import X.C09AY;
import X.C1515820pY4;
import X.C1515870pY9;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.r2;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS11S0220000_4 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S0220000_4 awS11S0220000_4) {
        boolean z;
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PAGE_COLLECT_START hitPreload=");
        sbLIZ.append(awS11S0220000_4.z2);
        sbLIZ.append(" hitPreread=");
        sbLIZ.append(awS11S0220000_4.z3);
        sbLIZ.append(" streamNull=");
        if (((C1515820pY4) awS11S0220000_4.l0) == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" err=");
        Throwable th = (Throwable) awS11S0220000_4.l1;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS11S0220000_4 awS11S0220000_4) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleMessageLoaded: isRemote=");
        sbLIZ.append(awS11S0220000_4.z2);
        sbLIZ.append(", loadingMore=");
        sbLIZ.append(awS11S0220000_4.z3);
        sbLIZ.append(", count=");
        sbLIZ.append(((List) awS11S0220000_4.l0).size());
        sbLIZ.append(", invokeRemoteCb=");
        if (!awS11S0220000_4.z2 && awS11S0220000_4.z3) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(", subConversationId=");
        sbLIZ.append(((r2) awS11S0220000_4.l1).LJIILLIIL.LJIILIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S0220000_4(boolean z, boolean z2, boolean z3, C1515820pY4<C1515870pY9<ECMixMallPageDTO>> c1515820pY4, Throwable th) {
        super(0);
        this.$t = th;
        this.z2 = z;
        this.z3 = z2;
        this.l0 = z3;
        this.l1 = c1515820pY4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS11S0220000_4(boolean z, boolean z2, boolean z3, List<Message> list, r2 r2Var) {
        super(0);
        this.$t = r2Var;
        this.z2 = z;
        this.z3 = z2;
        this.l0 = z3;
        this.l1 = list;
    }
}
