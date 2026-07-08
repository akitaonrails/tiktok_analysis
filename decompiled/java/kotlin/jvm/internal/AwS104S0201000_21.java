package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1341800l1O;
import X.C1347120l9y;
import X.C1360440lVS;
import X.C1369870lkf;
import X.C1371590lnR;
import X.C166A;
import X.C2344009Gk;
import X.C724240Sb0;
import X.C786410Ut5;
import X.DialogC1369990lkr;
import X.InterfaceC1366490lfD;
import X.InterfaceC1369790lkX;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommonCommentKeyboard;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.compliance.api.model.AmberAlertCardInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS104S0201000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AwS104S0201000_21 awS104S0201000_21, Object obj) {
        Assembler assembler = (Assembler) obj;
        Fragment fragmentLJI = C724240Sb0.LJI((UIAssem) awS104S0201000_21.l0);
        if (fragmentLJI != null) {
            assembler.DQ2(fragmentLJI, new AwS600S0100000_21((C1360440lVS) awS104S0201000_21.l1, 16));
        }
        assembler.RQ2((UIAssem) awS104S0201000_21.l0, new AwS34S0001000_21(awS104S0201000_21.i2, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS104S0201000_21 awS104S0201000_21, Object obj) {
        if (awS104S0201000_21.i2 == 4) {
            KeyboardVMV2 keyboardVMV2Ip = ((CommonCommentKeyboard) awS104S0201000_21.l0).ip();
            C1347120l9y c1347120l9y = C1347120l9y.LIZ;
            C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
            keyboardVMV2Ip.SQ2(c1347120l9y, false);
            ((C013C) awS104S0201000_21.l1).element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS104S0201000_21 awS104S0201000_21, Object obj) {
        C2344009Gk c2344009Gk = (C2344009Gk) obj;
        C166A c166a = (C166A) awS104S0201000_21.l0;
        AmberAlertCardInfo amberAlertCardInfo = (AmberAlertCardInfo) awS104S0201000_21.l1;
        c166a.getClass();
        c2344009Gk.LIZJ(C166A.e0(amberAlertCardInfo), "amber_alert_number_photos");
        c2344009Gk.LIZJ(awS104S0201000_21.i2, "amber_alert_photo_index");
        c2344009Gk.LJIIIIZZ("specific_page", "feed_card");
        return c2344009Gk;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS104S0201000_21 awS104S0201000_21, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIIIZ(false, ((DialogC1369990lkr) awS104S0201000_21.l0).LLIZLLLIL.LJIJJ, awS104S0201000_21.i2);
        DialogC1369990lkr dialogC1369990lkr = (DialogC1369990lkr) awS104S0201000_21.l0;
        C1371590lnR c1371590lnR = dialogC1369990lkr.LLIZLLLIL;
        InterfaceC1366490lfD interfaceC1366490lfD = c1371590lnR.LJJIFFI;
        if (interfaceC1366490lfD != null) {
            interfaceC1366490lfD.LIZ((InterfaceC1369790lkX) awS104S0201000_21.l1, zBooleanValue, c1371590lnR.LJIJJ, dialogC1369990lkr.LLIZ);
        }
        if (!((InterfaceC1369790lkX) awS104S0201000_21.l1).LIZJ() || ((InterfaceC1369790lkX) awS104S0201000_21.l1).LJJJLIIL()) {
            C786410Ut5.LJIILJJIL((DialogC1369990lkr) awS104S0201000_21.l0);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0201000_21(UIAssem uIAssem, C1360440lVS c1360440lVS, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = c1360440lVS;
        this.i2 = R.id.tap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0201000_21(int i, InterfaceC1369790lkX interfaceC1369790lkX, DialogC1369990lkr dialogC1369990lkr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = dialogC1369990lkr;
        this.i2 = i;
        this.l1 = interfaceC1369790lkX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0201000_21(int i, CommonCommentKeyboard commonCommentKeyboard, C013C c013c, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = commonCommentKeyboard;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0201000_21(C166A c166a, AmberAlertCardInfo amberAlertCardInfo, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c166a;
        this.l1 = amberAlertCardInfo;
        this.i2 = i;
    }
}
