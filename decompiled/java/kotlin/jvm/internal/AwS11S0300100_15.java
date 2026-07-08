package kotlin.jvm.internal;

import X.AbstractC981980bf2;
import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C918350a0P;
import X.C918410a0V;
import X.C918610a0p;
import X.C918650a0t;
import X.C982390bfh;
import X.C982600bg2;
import X.EnumC918840a1C;
import X.EnumC974260bSa;
import X.EnumC982500bfs;
import X.InterfaceC983130bgt;
import com.bytedance.android.live.liveinteract.api.MultiLivePreCheckInviteFailedEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS11S0300100_15 extends C09AY implements Function1 {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S0300100_15 awS11S0300100_15, Object obj) {
        C982600bg2 c982600bg2 = (C982600bg2) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestLeaveLinkMicApi");
        sbLIZ.append(", result = ");
        sbLIZ.append(c982600bg2.LJFF);
        C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        List<C982390bfh> list = c982600bg2.LJ;
        if (list != null && !list.isEmpty()) {
            if (((AbstractC981980bf2) awS11S0300100_15.l0).LIZ.Y2() != EnumC974260bSa.FINISH && ((AbstractC981980bf2) awS11S0300100_15.l0).LIZ.Y2() != EnumC974260bSa.NONE) {
                EnumC974260bSa enumC974260bSa = (EnumC974260bSa) awS11S0300100_15.l1;
                if (enumC974260bSa != EnumC974260bSa.START && enumC974260bSa != EnumC974260bSa.SETTLE) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestLeaveLinkMicApi");
                    sbLIZ2.append(", no need Change current status");
                    C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("requestLeaveLinkMicApi");
                    sbLIZ3.append(", status = ");
                    sbLIZ3.append(((AbstractC981980bf2) awS11S0300100_15.l0).LIZIZ);
                    C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ3));
                    ((AbstractC981980bf2) awS11S0300100_15.l0).LJJIII().LJJI = true;
                    ((AbstractC981980bf2) awS11S0300100_15.l0).LJJIII().LJJIFFI = true;
                    AbstractC981980bf2 abstractC981980bf2 = (AbstractC981980bf2) awS11S0300100_15.l0;
                    EnumC982500bfs enumC982500bfs = c982600bg2.LJFF;
                    InterfaceC983130bgt interfaceC983130bgt = (InterfaceC983130bgt) abstractC981980bf2.LJJII();
                    if (interfaceC983130bgt != null) {
                        interfaceC983130bgt.LJII(enumC982500bfs.getType());
                    }
                    ((AbstractC981980bf2) awS11S0300100_15.l0).LJJJJJ(c982600bg2);
                    ((AbstractC981980bf2) awS11S0300100_15.l0).LJJIIJ(awS11S0300100_15.j3, true, c982600bg2.LJ);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("requestLeaveLinkMicApi");
                sbLIZ4.append(", success callback");
                C20441214yg.LIZIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ4));
                Function0 function0 = (Function0) awS11S0300100_15.l2;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("requestLeaveLinkMicApi");
                sbLIZ5.append(", already reset to ");
                sbLIZ5.append(((AbstractC981980bf2) awS11S0300100_15.l0).LIZ.Y2());
                C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ5));
            }
        } else {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("requestLeaveLinkMicApi");
            sbLIZ6.append(", asdasd");
            C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ6));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0300100_15 awS11S0300100_15, Object obj) {
        C918610a0p c918610a0p = (C918610a0p) obj;
        if (c918610a0p.LIZ == EnumC918840a1C.FAILED) {
            ((C918650a0t) awS11S0300100_15.l0).LIZIZ.LC0(MultiLivePreCheckInviteFailedEvent.class, Long.valueOf(awS11S0300100_15.j3));
            Function1<Boolean, Unit> function1 = ((C918410a0V) awS11S0300100_15.l1).LJIIJJI;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        Function1<C918610a0p, Unit> function12 = ((C918350a0P) awS11S0300100_15.l2).LIZJ.LIZIZ;
        if (function12 != null) {
            function12.invoke(c918610a0p);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0300100_15(C918650a0t c918650a0t, long j, C918410a0V c918410a0V, C918350a0P c918350a0P, int i) {
        super(1);
        this.$t = i;
        this.l0 = c918650a0t;
        this.j3 = j;
        this.l1 = c918410a0V;
        this.l2 = c918350a0P;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0300100_15(AbstractC981980bf2 abstractC981980bf2, EnumC974260bSa enumC974260bSa, int i, long j, long j2, Function0 function0, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = abstractC981980bf2;
        this.l1 = enumC974260bSa;
        this.j3 = j;
        this.l2 = function0;
    }
}
