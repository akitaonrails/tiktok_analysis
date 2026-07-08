package kotlin.jvm.internal;

import X.C099G;
import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1042690dEx;
import X.C1043500dGG;
import X.C1072140e0S;
import X.C1072880e1e;
import X.C1072890e1f;
import X.C1073610e2p;
import X.C1074590e4P;
import X.C2188811AlT;
import X.EnumC1042820dFA;
import X.EnumC1073720e30;
import com.bytedance.lynx.hybrid.ssp.RecordingTopDomainRequestResult;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS21S1100100_16 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l1;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS21S1100100_16 awS21S1100100_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS21S1100100_16.l1).LLILLL));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((C1040740dBo) awS21S1100100_16.l1).LLJI);
        c1023640ckE.withParam(C1043500dGG.LJJJLZIJ, "iab");
        c1023640ckE.withParam(C1043500dGG.LJJJ, Integer.valueOf(((C1040740dBo) awS21S1100100_16.l1).LLJJIJIL));
        c1023640ckE.withParam(C1043500dGG.LJJLIL, Long.valueOf(awS21S1100100_16.j2));
        c1023640ckE.withParam(C1043500dGG.LJJLJ, awS21S1100100_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS21S1100100_16 awS21S1100100_16, Object obj) {
        String str;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1042690dEx.LIZ.getClass();
        c1023640ckE.withParam(C1042690dEx.LJJJJI, "recording_fetch_top_n");
        C1002190cBd c1002190cBd = C1042690dEx.LJJL;
        RecordingTopDomainRequestResult.RequestMeta requestMeta = ((RecordingTopDomainRequestResult) awS21S1100100_16.l1).LIZJ;
        String string = null;
        if (requestMeta != null) {
            str = requestMeta.url;
        } else {
            str = null;
        }
        c1023640ckE.withParam(c1002190cBd, str);
        C1002190cBd c1002190cBd2 = C1042690dEx.LJJJJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasSendNetRequest-");
        sbLIZ.append(((RecordingTopDomainRequestResult) awS21S1100100_16.l1).LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(((RecordingTopDomainRequestResult) awS21S1100100_16.l1).LJ);
        c1023640ckE.withParam(c1002190cBd2, C2188811AlT.LIZIZ(sbLIZ));
        c1023640ckE.withParam(C1042690dEx.LJJJZ, awS21S1100100_16.s0);
        C1002190cBd c1002190cBd3 = C1042690dEx.LJJJJLI;
        EnumC1042820dFA enumC1042820dFA = ((RecordingTopDomainRequestResult) awS21S1100100_16.l1).LIZLLL;
        if (enumC1042820dFA != null) {
            string = Integer.valueOf(enumC1042820dFA.getCode()).toString();
        }
        c1023640ckE.withParam(c1002190cBd3, string);
        c1023640ckE.withParam(C1042690dEx.LJJJJJ, Long.valueOf(System.currentTimeMillis() - awS21S1100100_16.j2));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS21S1100100_16 awS21S1100100_16, Object obj) {
        EnumC1073720e30 enumC1073720e30 = (EnumC1073720e30) obj;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS21S1100100_16.j2;
        String str = awS21S1100100_16.s0;
        String str2 = C1072890e1f.LIZIZ;
        int i = 0;
        if (C1072880e1e.LIZ().LIZ.getInt("dialog_close_without_action_in_times", 0) >= 2) {
            i = 1;
        }
        new C1073610e2p(str, jCurrentTimeMillis, enumC1073720e30, null, Integer.valueOf(i), 8).LIZLLL(null);
        PopupManager.LIZJ(C1072140e0S.class);
        RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = ((C1074590e4P) awS21S1100100_16.l1).LLILLL;
        recUserAfterAuthPopupVM.getClass();
        recUserAfterAuthPopupVM.setState(new AwS595S0100000_16(recUserAfterAuthPopupVM, 296));
        C099G c099g = recUserAfterAuthPopupVM.LLIZ;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        C099G c099g2 = recUserAfterAuthPopupVM.LLILZLL;
        if (c099g2 != null) {
            c099g2.LIZIZ(null);
        }
        recUserAfterAuthPopupVM.LLILZLL = null;
        recUserAfterAuthPopupVM.LLIZ = null;
        ((C1074590e4P) awS21S1100100_16.l1).LLILLJJLI.destroy();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1100100_16(long j, String str, C1074590e4P c1074590e4P, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.s0 = str;
        this.l1 = c1074590e4P;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1100100_16(C1040740dBo c1040740dBo, long j, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1040740dBo;
        this.j2 = j;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS21S1100100_16(RecordingTopDomainRequestResult recordingTopDomainRequestResult, String str, long j, int i) {
        super(1);
        this.$t = i;
        this.l1 = recordingTopDomainRequestResult;
        this.s0 = str;
        this.j2 = j;
    }
}
