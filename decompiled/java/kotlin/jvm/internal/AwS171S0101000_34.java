package kotlin.jvm.internal;

import X.C09AY;
import X.C0LAB;
import X.C1390380mHk;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2190961Aow;
import X.C2190971Aox;
import X.C2247771CyN;
import X.C2247791CyP;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes35.dex */
public class AwS171S0101000_34 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS171S0101000_34 awS171S0101000_34) {
        int i;
        int i2 = awS171S0101000_34.i1;
        if (i2 != 1) {
            if (i2 != 2) {
                i = 2131836896;
            } else {
                i = 2131836898;
            }
        } else {
            i = 2131836897;
        }
        C19EG c19eg = ((C2247771CyN) awS171S0101000_34.l0).LLILLJJLI;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.isCenterToast(((C2247771CyN) awS171S0101000_34.l0).LLJJ);
        creativeToastBuilder.messageRes(i);
        C1390380mHk.LIZ(c19eg, 3091, creativeToastBuilder);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LIZ(awS171S0101000_34.i1, "hint_text_type");
        c0lab.LJFF("is_center_toast", ((C2247771CyN) awS171S0101000_34.l0).LLJJ);
        c0lab.LJFF("is_one_shot", C2247791CyP.LIZIZ().isOneShot);
        c0lab.LIZJ(Float.valueOf(((C2247771CyN) awS171S0101000_34.l0).LLJJI), "als_reading");
        c0lab.LIZ(((C2247771CyN) awS171S0101000_34.l0).LLJJIII, "iso_reading");
        c0lab.LIZJ(Float.valueOf(((C2247771CyN) awS171S0101000_34.l0).LLJJIJI), "expo_time_reading");
        c0lab.LIZ(((C2247771CyN) awS171S0101000_34.l0).LLJJIJIIJIL, "flash_mode");
        c0lab.LJ("ab_version", C2247791CyP.LIZIZ().version);
        C20684815ws.LJIILLIIL("record_low_light_hint_toast_show", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS171S0101000_34 awS171S0101000_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OBSERVER_ATTACH replay=");
        sbLIZ.append(awS171S0101000_34.i1);
        sbLIZ.append(" terminated=");
        sbLIZ.append(((C2190971Aox) awS171S0101000_34.l0).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS171S0101000_34 awS171S0101000_34) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OBSERVER_ATTACH replay=");
        sbLIZ.append(awS171S0101000_34.i1);
        sbLIZ.append(" terminated=");
        sbLIZ.append(((C2190961Aow) awS171S0101000_34.l0).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS171S0101000_34(int i, int i2, C2190961Aow<T> c2190961Aow) {
        super(0);
        this.$t = c2190961Aow;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS171S0101000_34(int i, int i2, C2190971Aox<Object> c2190971Aox) {
        super(0);
        this.$t = c2190971Aox;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS171S0101000_34(int i, C2247771CyN c2247771CyN, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c2247771CyN;
    }
}
