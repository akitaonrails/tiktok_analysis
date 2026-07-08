package kotlin.jvm.internal;

import X.C09AY;
import X.C1347410lAR;
import X.C1352050lHv;
import X.C1361920lXq;
import X.C1366320lew;
import X.C1366450lf9;
import X.C1366570lfL;
import X.C1373350lqH;
import X.C1373370lqJ;
import X.C1391410mJP;
import X.C1395390mPp;
import X.C13BV;
import X.C1954807lC;
import X.EnumC1366460lfA;
import X.InterfaceC1346750l9N;
import com.ss.android.ugc.aweme.friendstab.ui.input.model.TextPublishModel;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS71S1000000_21 extends C09AY implements Function1 {
    public final int $t;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S1000000_21(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        return C1347410lAR.LIZIZ((C1347410lAR) obj, awS71S1000000_21.s0, null, null, 6);
    }

    public static final Object invoke$1(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        C1373350lqH c1373350lqH = (C1373350lqH) obj;
        C13BV c13bv = C13BV.INSTANCE;
        c1373350lqH.getClass();
        c1373350lqH.LIZ = new C1373370lqJ("AIGC_directMessage_share_description", c13bv);
        c1373350lqH.LIZJ("self_sent_profile", Collections.singletonList(awS71S1000000_21.s0));
        c1373350lqH.LIZIZ("cell_sent_profile", Collections.singletonList(awS71S1000000_21.s0));
        c1373350lqH.LIZ("im_quote_profile", c13bv);
        c1373350lqH.LJI = new C1373370lqJ("cell_sent_profile", Collections.singletonList(awS71S1000000_21.s0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((InterfaceC1346750l9N) obj).getId(), awS71S1000000_21.s0));
    }

    public static final Object invoke$3(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        C1361920lXq c1361920lXq = (C1361920lXq) obj;
        String str = awS71S1000000_21.s0;
        String str2 = "click_anchor";
        if (!Intrinsics.LJFF(str, "click_anchor")) {
            str2 = "click_list";
        }
        c1361920lXq.LIZJ = str2;
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        int i = C1366450lf9.LIZ[((EnumC1366460lfA) obj).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1366570lfL.LL.LIZLLL();
                    C1366320lew.LIZ(C1366320lew.LIZ, awS71S1000000_21.s0, "share");
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1366570lfL.LL.LIZJ();
                C1366320lew.LIZ(C1366320lew.LIZ, awS71S1000000_21.s0, "dismiss");
            }
        } else {
            C1366570lfL.LL.LIZJ();
            C1366320lew.LIZ(C1366320lew.LIZ, awS71S1000000_21.s0, "auto_dismiss");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        C1391410mJP c1391410mJP = (C1391410mJP) obj;
        if (awS71S1000000_21.s0.length() > 0) {
            c1391410mJP.LIZLLL = awS71S1000000_21.s0;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        TextPublishModel textPublishModel = (TextPublishModel) obj;
        if (textPublishModel != null) {
            String str = awS71S1000000_21.s0;
            if (str == null) {
                str = "";
            }
            textPublishModel.textContent = str;
        }
        return textPublishModel;
    }

    public static final Object invoke$7(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        C1395390mPp c1395390mPp = (C1395390mPp) obj;
        String str = awS71S1000000_21.s0;
        if (str == null) {
            str = "";
        }
        return C1395390mPp.LIZ(c1395390mPp, str, 0, true, false, null, null, 122);
    }

    public static final Object invoke$8(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        C1395390mPp c1395390mPp = (C1395390mPp) obj;
        String str = awS71S1000000_21.s0;
        if (str == null) {
            str = "";
        }
        return C1395390mPp.LIZ(c1395390mPp, str, 0, false, false, null, null, 122);
    }

    public static final Object invoke$9(AwS71S1000000_21 awS71S1000000_21, Object obj) {
        return C1352050lHv.LIZ((C1352050lHv) obj, null, null, null, false, 0, null, null, null, null, false, null, null, awS71S1000000_21.s0, false, false, false, 983039);
    }
}
