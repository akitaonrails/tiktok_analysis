package kotlin.jvm.internal;

import X.C09AY;
import X.C0L76;
import X.C201955140j;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS8S0201100_8 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS8S0201100_8 awS8S0201100_8) {
        CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) awS8S0201100_8.l0;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        Function1 function1 = (Function1) awS8S0201100_8.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraft fail，from=");
        sbLIZ.append(awS8S0201100_8.i2);
        sbLIZ.append(", duration=");
        sbLIZ.append(System.currentTimeMillis() - awS8S0201100_8.j3);
        C201955140j.LJIIIIZZ(c0l76, "AILiveDraftHelper", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS8S0201100_8 awS8S0201100_8) {
        CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) awS8S0201100_8.l0;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        Function1 function1 = (Function1) awS8S0201100_8.l1;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraftWithNewCreationId fail，from=");
        sbLIZ.append(awS8S0201100_8.i2);
        sbLIZ.append(", duration=");
        sbLIZ.append(System.currentTimeMillis() - awS8S0201100_8.j3);
        C201955140j.LJIIIIZZ(c0l76, "AILiveDraftHelper", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0201100_8(CreativeDialogWrapper creativeDialogWrapper, Function1 function1, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = creativeDialogWrapper;
        this.l1 = function1;
        this.i2 = i;
        this.j3 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0201100_8(CreativeDialogWrapper creativeDialogWrapper, AwS587S0100000_8 awS587S0100000_8, int i, long j, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = creativeDialogWrapper;
        this.l1 = awS587S0100000_8;
        this.i2 = i;
        this.j3 = j;
    }
}
