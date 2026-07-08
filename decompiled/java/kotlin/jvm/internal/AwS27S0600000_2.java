package kotlin.jvm.internal;

import X.C05P0;
import X.C06I1;
import X.C06XG;
import X.C09AY;
import X.C0I0B;
import X.C118300cf;
import X.C13LP;
import X.C1411305fj;
import X.C1411405fk;
import X.C1495805tM;
import X.C1533790q13;
import X.C1677830tlN;
import X.C1690080u58;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C259800zU;
import X.C817403Hg;
import X.InterfaceC1392705cj;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS27S0600000_2 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS27S0600000_2 awS27S0600000_2, Object obj) {
        AlertToneValueItem alertToneValueItem = (AlertToneValueItem) obj;
        String str = "";
        if (Intrinsics.LJFF(alertToneValueItem.alertToneValue, ((C05P0) awS27S0600000_2.l4).getValue()) && Intrinsics.LJFF(alertToneValueItem.alertToneValue, ((C05P0) awS27S0600000_2.l0).getValue())) {
            C23250099c.LIZLLL((InterfaceC497601wk) awS27S0600000_2.l1, null, null, new C1411305fj(alertToneValueItem, (MessageNotificationToneChooseFragment) awS27S0600000_2.l2, null), 3);
            C1495805tM c1495805tM = C1495805tM.LIZ;
            String previousPage = ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).getPreviousPage();
            String strZR = ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).ZR();
            String strWR = ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).WR();
            String str2 = alertToneValueItem.alertToneValue;
            if (str2 != null) {
                str = str2;
            }
            c1495805tM.getClass();
            C1495805tM.LJ("ttsocial_alert_tones_settings_option_click", C1495805tM.LIZLLL(previousPage, strZR, strWR, str));
        } else {
            AlertToneItem alertToneItemVR = ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).VR();
            Object value = ((C05P0) awS27S0600000_2.l0).getValue();
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("message_type", alertToneItemVR.alertToneScene);
            pairArr[1] = new Pair("choose_entry", alertToneValueItem.alertToneValue);
            if (value == null) {
                value = "";
            }
            pairArr[2] = new Pair("last_choose", value);
            C20684815ws.LJIILLIIL("alert_tones_sub_settings_choose", C2097608Jq.LJIIIIZZ(pairArr));
            ((C05P0) awS27S0600000_2.l4).setValue(alertToneValueItem.alertToneValue);
            MessageNotificationToneChooseFragment messageNotificationToneChooseFragment = (MessageNotificationToneChooseFragment) awS27S0600000_2.l2;
            messageNotificationToneChooseFragment.LLJILJILJ = alertToneValueItem.alertToneValue;
            C1495805tM c1495805tM2 = C1495805tM.LIZ;
            String previousPage2 = messageNotificationToneChooseFragment.getPreviousPage();
            String strZR2 = ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).ZR();
            String strWR2 = ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).WR();
            String str3 = alertToneValueItem.alertToneValue;
            if (str3 != null) {
                str = str3;
            }
            c1495805tM2.getClass();
            C1495805tM.LJ("ttsocial_alert_tones_settings_option_click", C1495805tM.LIZLLL(previousPage2, strZR2, strWR2, str));
            if (((Boolean) ((C05P0) awS27S0600000_2.l3).getValue()).booleanValue()) {
                ((C05P0) awS27S0600000_2.l5).setValue(alertToneValueItem);
                ((MessageNotificationToneChooseFragment) awS27S0600000_2.l2).LLJILLL = alertToneValueItem;
                C23250099c.LIZLLL((InterfaceC497601wk) awS27S0600000_2.l1, null, null, new C1411405fk(alertToneValueItem, (MessageNotificationToneChooseFragment) awS27S0600000_2.l2, null), 3);
            } else {
                AwS633S0100000_19.LIZ$1((MessageNotificationToneChooseFragment) awS27S0600000_2.l2, (InterfaceC497601wk) awS27S0600000_2.l1, (C05P0) awS27S0600000_2.l3, (C05P0) awS27S0600000_2.l0, (C05P0) awS27S0600000_2.l4, (C05P0) awS27S0600000_2.l5, alertToneValueItem);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0q13] */
    public static final Object invoke$1(AwS27S0600000_2 awS27S0600000_2, Object obj) {
        T tLIZLLL;
        ?? r8 = (C1533790q13) obj;
        Object obj2 = awS27S0600000_2.l0;
        C259800zU c259800zU = (C259800zU) awS27S0600000_2.l1;
        C259800zU c259800zU2 = (C259800zU) awS27S0600000_2.l2;
        C118300cf c118300cf = (C118300cf) awS27S0600000_2.l3;
        C259800zU c259800zU3 = (C259800zU) awS27S0600000_2.l4;
        Function1 function1 = (Function1) awS27S0600000_2.l5;
        synchronized (obj2) {
            try {
                if (c259800zU.element == 0) {
                    if (r8.LIZIZ) {
                        tLIZLLL = r8.LIZLLL();
                    } else {
                        tLIZLLL = 0;
                    }
                    c259800zU2.element = tLIZLLL;
                    c259800zU.element = r8;
                    c118300cf.element++;
                    C06I1.LIZ(c118300cf, c259800zU2, c259800zU3, function1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0q13] */
    public static final Object invoke$2(AwS27S0600000_2 awS27S0600000_2, Object obj) {
        T tLIZLLL;
        ?? r8 = (C1533790q13) obj;
        Object obj2 = awS27S0600000_2.l0;
        C259800zU c259800zU = (C259800zU) awS27S0600000_2.l1;
        C259800zU c259800zU2 = (C259800zU) awS27S0600000_2.l2;
        C118300cf c118300cf = (C118300cf) awS27S0600000_2.l3;
        C259800zU c259800zU3 = (C259800zU) awS27S0600000_2.l4;
        Function1 function1 = (Function1) awS27S0600000_2.l5;
        synchronized (obj2) {
            try {
                if (c259800zU.element == 0) {
                    if (r8.LIZIZ) {
                        tLIZLLL = r8.LIZLLL();
                    } else {
                        tLIZLLL = 0;
                    }
                    c259800zU2.element = tLIZLLL;
                    c259800zU.element = r8;
                    c118300cf.element++;
                    C06I1.LIZ(c118300cf, c259800zU3, c259800zU2, function1);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS27S0600000_2 awS27S0600000_2, Object obj) {
        C1677830tlN c1677830tlN = (C1677830tlN) obj;
        float fFloatValue = ((Number) c1677830tlN.LIZIZ()).floatValue();
        C817403Hg c817403Hg = (C817403Hg) awS27S0600000_2.l0;
        float f = fFloatValue - c817403Hg.element;
        c817403Hg.element = ((Number) c1677830tlN.LIZIZ()).floatValue();
        ((C118300cf) awS27S0600000_2.l1).element++;
        float fLIZJ = ((InterfaceC1392705cj) awS27S0600000_2.l2).LIZJ(f);
        int i = ((C118300cf) awS27S0600000_2.l1).element;
        if (Math.abs(fLIZJ) < Math.abs(f) * 0.5f && Math.abs(f) > 0.5f) {
            C118300cf c118300cf = (C118300cf) awS27S0600000_2.l3;
            int i2 = c118300cf.element + 1;
            c118300cf.element = i2;
            if (i2 > 3) {
                ((C817403Hg) awS27S0600000_2.l4).element = ((Number) c1677830tlN.LIZJ()).floatValue();
                C06XG c06xg = (C06XG) C13LP.LJJLIIIJL(((C1690080u58) awS27S0600000_2.l5).LJIIIZ().LJII());
                if (c06xg != null) {
                    c06xg.getIndex();
                }
                c1677830tlN.LIZ();
            }
        } else {
            ((C118300cf) awS27S0600000_2.l3).element = 0;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0600000_2(C817403Hg c817403Hg, C118300cf c118300cf, InterfaceC1392705cj interfaceC1392705cj, C118300cf c118300cf2, C817403Hg c817403Hg2, C1690080u58 c1690080u58, int i) {
        super(1);
        this.$t = i;
        this.l0 = c817403Hg;
        this.l1 = c118300cf;
        this.l2 = interfaceC1392705cj;
        this.l3 = c118300cf2;
        this.l4 = c817403Hg2;
        this.l5 = c1690080u58;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS27S0600000_2(C05P0 c05p0, C05P0<String> c05p02, InterfaceC497601wk interfaceC497601wk, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, C05P0<Boolean> c05p03, C05P0<String> c05p04, C05P0<AlertToneValueItem> c05p05) {
        super(1);
        this.$t = c05p05;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = interfaceC497601wk;
        this.l3 = messageNotificationToneChooseFragment;
        this.l4 = c05p03;
        this.l5 = c05p04;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS27S0600000_2(Object obj, C259800zU c259800zU, C259800zU c259800zU2, C118300cf c118300cf, C259800zU c259800zU3, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.l0 = obj;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.l3 = c118300cf;
        this.l4 = c259800zU3;
        this.l5 = function1;
    }
}
