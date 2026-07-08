package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C0M81;
import X.C0PEM;
import X.C1662160tM6;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C272950Amr;
import X.C298030BmD;
import X.C443120HZe;
import X.C550560LiY;
import X.C551030LjJ;
import X.C551070LjN;
import X.C551100LjQ;
import X.C551120LjS;
import X.C551590LkD;
import X.C551630LkH;
import X.C552770Lm7;
import X.C557260LtM;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.recorder.exit.p;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS30S0310000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS30S0310000_8 awS30S0310000_8, Object obj) throws Throwable {
        String str;
        ((CreativeLoadingDialog) awS30S0310000_8.l0).dismiss();
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraftWithNewCreationId onSuccess: ");
        sbLIZ.append(obj);
        C201955140j.LIZLLL(c1662160tM6, "EditExitComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (C298030BmD.LIZ()) {
            if ((u4.LJJJI(((C0M81) awS30S0310000_8.l1).LIZJ) && ((str = ((C0M81) awS30S0310000_8.l1).LIZJ.creativeModel.editModel.sdkSourceApp) == null || str.length() == 0)) || !u4.LJJJI(((C0M81) awS30S0310000_8.l1).LIZJ)) {
                ((C0M81) awS30S0310000_8.l1).LJIIL();
            }
        } else {
            ((C0M81) awS30S0310000_8.l1).LJIIL();
        }
        if (!((Boolean) C272950Amr.LIZ.getValue()).booleanValue() && !awS30S0310000_8.z3) {
            ((C0M81) awS30S0310000_8.l1).LIZ();
        } else {
            ((Function0) awS30S0310000_8.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S0310000_8 awS30S0310000_8, Object obj) {
        ((CreativeLoadingDialog) awS30S0310000_8.l0).delayShow(1000L);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C557260LtM((VideoPublishEditModel) obj, (Integer) awS30S0310000_8.l1, (p) awS30S0310000_8.l2, (CreativeLoadingDialog) awS30S0310000_8.l0, awS30S0310000_8.z3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS30S0310000_8 awS30S0310000_8, Object obj) {
        C551120LjS c551120LjSLIZ;
        C552770Lm7 c552770Lm7 = (C552770Lm7) obj;
        CreativeInfo creativeInfo = (CreativeInfo) awS30S0310000_8.l0;
        boolean z = awS30S0310000_8.z3;
        C550560LiY c550560LiY = (C550560LiY) awS30S0310000_8.l1;
        C551100LjQ c551100LjQLIZIZ = C551030LjJ.LIZIZ(c552770Lm7, creativeInfo, z, false, c550560LiY, new AwS587S0100000_8(c550560LiY, 774));
        C551120LjS c551120LjSLIZ2 = null;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_offline_effect_template_opt", true, false) && ((C551070LjN) awS30S0310000_8.l2).LIZIZ.length() > 0) {
            c551120LjSLIZ = c552770Lm7.LIZ(new C551630LkH(), AFwS239S0000000_8.get$arr$(391));
        } else {
            c551120LjSLIZ = null;
        }
        if (((C551070LjN) awS30S0310000_8.l2).LIZIZ.length() > 0) {
            c551120LjSLIZ2 = c552770Lm7.LIZ(new C551590LkD(), new AwS587S0100000_8((CreativeInfo) awS30S0310000_8.l0, 772));
        }
        return new C443120HZe(c551100LjQLIZIZ, c551120LjSLIZ, c551120LjSLIZ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0310000_8(CreativeInfo creativeInfo, boolean z, C550560LiY c550560LiY, C551070LjN c551070LjN, int i) {
        super(1);
        this.$t = i;
        this.l0 = creativeInfo;
        this.z3 = z;
        this.l1 = c550560LiY;
        this.l2 = c551070LjN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0310000_8(CreativeDialogWrapper creativeDialogWrapper, C0M81 c0m81, boolean z, Function0 function0, int i) {
        super(1);
        this.$t = i;
        this.l0 = creativeDialogWrapper;
        this.l1 = c0m81;
        this.z3 = z;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S0310000_8(CreativeDialogWrapper creativeDialogWrapper, Integer num, p pVar, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = creativeDialogWrapper;
        this.l1 = num;
        this.l2 = pVar;
        this.z3 = z;
    }
}
