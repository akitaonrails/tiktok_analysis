package kotlin.jvm.internal;

import X.AbstractC1261840iwQ;
import X.C09AY;
import X.C0LAB;
import X.C1233110iC5;
import X.C1261270ivV;
import X.C1261650iw7;
import X.C1261760iwI;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C19536611c4;
import X.C20684815ws;
import X.C2188811AlT;
import X.C419910GdJ;
import X.C730340Skq;
import X.InterfaceC1219340hps;
import X.InterfaceC1262230ix3;
import X.InterfaceC1891350zJl;
import X.InterfaceC730270Skj;
import android.net.Uri;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class AwS143S0201000_19 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS143S0201000_19 awS143S0201000_19) {
        ((InterfaceC1219340hps) awS143S0201000_19.l0).LIZLLL(awS143S0201000_19.i2, (C19536611c4) awS143S0201000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS143S0201000_19 awS143S0201000_19) {
        ((InterfaceC1219340hps) awS143S0201000_19.l0).LIZJ(awS143S0201000_19.i2, (List) awS143S0201000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS143S0201000_19 awS143S0201000_19) {
        ((C1233110iC5) awS143S0201000_19.l0).LLLFZ(awS143S0201000_19.i2);
        ((InterfaceC730270Skj) ((C1233110iC5) awS143S0201000_19.l0).LLILZIL.getValue()).LIZJ(((C730340Skq) awS143S0201000_19.l1).LLILLJJLI);
        C1233110iC5 c1233110iC5 = (C1233110iC5) awS143S0201000_19.l0;
        if (c1233110iC5.LLILZ != null) {
            C1389910mGz c1389910mGz = new C1389910mGz(c1233110iC5.LLILZ);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJIIIZ(2131847210);
            c1389910mGz.LIZ.LIZIZ = 4;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_circle_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZLLL = Integer.valueOf(R.attr.ee);
            c1389910mGz.LJIIL(c419910GdJ);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZLLL = 3;
            c1360890lWB.LJ = null;
            c1389910mGz.LJIIJJI();
        }
        ((C1233110iC5) awS143S0201000_19.l0).getClass();
        C20684815ws.LJIILLIIL("remove_secret_reply_respond", new C0LAB().LIZ);
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AwS143S0201000_19 awS143S0201000_19) {
        ((C1233110iC5) awS143S0201000_19.l0).LLLFZ(awS143S0201000_19.i2);
        ((InterfaceC730270Skj) ((C1233110iC5) awS143S0201000_19.l0).LLILZIL.getValue()).LIZJ(((C730340Skq) awS143S0201000_19.l1).LLILLJJLI);
        ComplianceServiceProvider.LJJ().report(((C1233110iC5) awS143S0201000_19.l0).LLILZ, new Uri.Builder().appendQueryParameter("object_id", ((C730340Skq) awS143S0201000_19.l1).LLILLJJLI).appendQueryParameter("report_type", "reply").appendQueryParameter("locale", ((ISettingService) ServiceManager.get().getService(ISettingService.class)).getAppLanguage()), null);
        ((C1233110iC5) awS143S0201000_19.l0).getClass();
        C20684815ws.LJIILLIIL("report_secret_reply_respond", new C0LAB().LIZ);
        return Boolean.TRUE;
    }

    public static final Object invoke$4(AwS143S0201000_19 awS143S0201000_19) {
        ((AuthCardCellTrackAbility) awS143S0201000_19.l0).LIZ(awS143S0201000_19.i2, (C1261760iwI) awS143S0201000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS143S0201000_19 awS143S0201000_19) {
        ((AuthCardCellTrackAbility) awS143S0201000_19.l0).LIZ(awS143S0201000_19.i2, (C1261760iwI) awS143S0201000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS143S0201000_19 awS143S0201000_19) {
        ((RecUserCellTrackAbility) awS143S0201000_19.l0).LJII(awS143S0201000_19.i2, (C1261650iw7) awS143S0201000_19.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS143S0201000_19 awS143S0201000_19) {
        ((RecUserCellTrackAbility) awS143S0201000_19.l0).LJII(awS143S0201000_19.i2, (C1261650iw7) awS143S0201000_19.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS143S0201000_19 awS143S0201000_19) {
        String elementId;
        AbstractC1261840iwQ abstractC1261840iwQ;
        InterfaceC1262230ix3 interfaceC1262230ix3LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ITEM item = ((BasePowerCell) awS143S0201000_19.l0).getItem();
        String str = null;
        if ((item instanceof AbstractC1261840iwQ) && (abstractC1261840iwQ = (AbstractC1261840iwQ) item) != null && (interfaceC1262230ix3LIZIZ = abstractC1261840iwQ.LIZIZ()) != null) {
            elementId = interfaceC1262230ix3LIZIZ.getElementId();
        } else {
            elementId = null;
        }
        sbLIZ.append(elementId);
        C1261270ivV c1261270ivV = (C1261270ivV) awS143S0201000_19.l1;
        if (c1261270ivV != null) {
            str = c1261270ivV.LIZ;
        }
        sbLIZ.append(str);
        sbLIZ.append(awS143S0201000_19.i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0201000_19(C1233110iC5 c1233110iC5, int i, C730340Skq c730340Skq, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1233110iC5;
        this.i2 = i;
        this.l1 = c730340Skq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0201000_19(AuthCardCellTrackAbility authCardCellTrackAbility, int i, C1261760iwI c1261760iwI, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = authCardCellTrackAbility;
        this.i2 = i;
        this.l1 = c1261760iwI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0201000_19(RecUserCellTrackAbility recUserCellTrackAbility, C1261650iw7 c1261650iw7, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = recUserCellTrackAbility;
        this.l1 = c1261650iw7;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS143S0201000_19(BasePowerCell basePowerCell, BasePowerCell<InterfaceC1891350zJl> basePowerCell2, C1261270ivV c1261270ivV, int i) {
        super(0);
        this.$t = i;
        this.l0 = basePowerCell;
        this.l1 = basePowerCell2;
        this.i2 = c1261270ivV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0201000_19(int i, InterfaceC1219340hps interfaceC1219340hps, String str, List list, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC1219340hps;
        this.i2 = i;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS143S0201000_19(InterfaceC1219340hps interfaceC1219340hps, String str, int i, C19536611c4 c19536611c4, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = interfaceC1219340hps;
        this.i2 = i;
        this.l1 = c19536611c4;
    }
}
