package kotlin.jvm.internal;

import X.C09AY;
import X.C0VSJ;
import X.C201955140j;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.draft.model.DraftRestoreResult;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ISparrowService;
import com.ss.android.ugc.aweme.services.sparrow.DraftMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public class AwS152S1200000_8 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS152S1200000_8 awS152S1200000_8, Object obj, Object obj2) {
        ISparrowService iSparrowService;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Neo] reportDraftRestoreFailureToNeo success: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C201955140j.LIZIZ("DraftMonitorService", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue && (iSparrowService = (ISparrowService) PluggableExtentionKt.pluggableSpi$default(ISparrowService.class, false, false, false, 14, null)) != null && iSparrowService.getDraftMonitorService() != null) {
            new AwS409S0200000_8((DraftMonitorServiceImpl) awS152S1200000_8.l2, (DraftRestoreResult) awS152S1200000_8.l1, 19);
        }
        new C0VSJ(awS152S1200000_8.s0).delete();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS152S1200000_8 awS152S1200000_8, Object obj, Object obj2) {
        ISparrowService iSparrowService;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Neo] reportDraftSaveFailureToNeo success: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", message: ");
        sbLIZ.append((String) obj2);
        C201955140j.LIZIZ("DraftMonitorService", C2188811AlT.LIZIZ(sbLIZ));
        if (!zBooleanValue && (iSparrowService = (ISparrowService) PluggableExtentionKt.pluggableSpi$default(ISparrowService.class, false, false, false, 14, null)) != null && iSparrowService.getDraftMonitorService() != null) {
            new AwS409S0200000_8((DraftMonitorServiceImpl) awS152S1200000_8.l2, (DraftSaveResult) awS152S1200000_8.l1, 22);
        }
        new C0VSJ(awS152S1200000_8.s0).delete();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1200000_8(String str, DraftMonitorServiceImpl draftMonitorServiceImpl, DraftRestoreResult draftRestoreResult, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l2 = draftMonitorServiceImpl;
        this.l1 = draftRestoreResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS152S1200000_8(String str, DraftMonitorServiceImpl draftMonitorServiceImpl, DraftSaveResult draftSaveResult, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l2 = draftMonitorServiceImpl;
        this.l1 = draftSaveResult;
    }
}
