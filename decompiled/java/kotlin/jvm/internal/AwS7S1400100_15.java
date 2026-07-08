package kotlin.jvm.internal;

import X.C09AY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C5182020e;
import X.C520010KaN;
import X.C925080aBG;
import X.C954460awe;
import X.C973510bRN;
import X.C974060bSG;
import X.C974990bTl;
import X.EnumC919170a1j;
import X.InterfaceC923600a8s;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveMatchTakeStageOptExtraSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS7S1400100_15 extends C09AY implements Function1 {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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

    public static final Object invoke$0(AwS7S1400100_15 awS7S1400100_15, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS7S1400100_15.s0);
        sbLIZ.append(", request match prepare api failed, OptExtra=");
        LiveMatchTakeStageOptExtraSetting liveMatchTakeStageOptExtraSetting = LiveMatchTakeStageOptExtraSetting.INSTANCE;
        sbLIZ.append(liveMatchTakeStageOptExtraSetting.isEnable());
        C20441214yg.LJFF("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ), (Throwable) obj);
        if (liveMatchTakeStageOptExtraSetting.isEnable() && C973510bRN.LIZIZ()) {
            ((C974990bTl) awS7S1400100_15.l1).LJ((C974060bSG) awS7S1400100_15.l2, (List) awS7S1400100_15.l3, null, (EnumC919170a1j) awS7S1400100_15.l4, awS7S1400100_15.j5, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS7S1400100_15 awS7S1400100_15, Object obj) {
        Context context;
        int iIntValue = ((Number) obj).intValue();
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) awS7S1400100_15.l1;
        if (interfaceC923600a8s != null) {
            context = interfaceC923600a8s.getContext();
        } else {
            context = null;
        }
        Activity activityLJIJ = C520010KaN.LJIJ(context, false);
        if (activityLJIJ == null) {
            Function1 function1 = (Function1) awS7S1400100_15.l3;
            if (function1 != null) {
                function1.invoke(new Throwable("ContextUtil.contextToActivity is null"));
            }
        } else {
            boolean z = C925080aBG.LIZ;
            C925080aBG.LIZ(false, ((KaraokeGuestViewModel) awS7S1400100_15.l2).LL, 0, activityLJIJ, Long.valueOf(iIntValue), awS7S1400100_15.s0, new AwS5S0400100_15((KaraokeGuestViewModel) awS7S1400100_15.l2, (InterfaceC923600a8s) awS7S1400100_15.l1, awS7S1400100_15.j5, (Function1) awS7S1400100_15.l4, (Function1) awS7S1400100_15.l3, 2), new C5182020e((Function1) awS7S1400100_15.l3, (Function1<? super Throwable, Unit>) 639));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS7S1400100_15(InterfaceC923600a8s interfaceC923600a8s, KaraokeGuestViewModel karaokeGuestViewModel, Function1 function1, long j, Function1 function12, int i) {
        super(1);
        this.$t = i;
        this.l1 = interfaceC923600a8s;
        this.l2 = karaokeGuestViewModel;
        this.s0 = "applyViewerSing";
        this.l3 = function1;
        this.j5 = j;
        this.l4 = function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0000: IPUT (r10 I:int), (r2 I:kotlin.jvm.internal.AwS7S1400100_15) (LINE:117440512) kotlin.jvm.internal.AwS7S1400100_15.$t int, block:B:2:0x0000 */
    public AwS7S1400100_15(String str, String str2, C974990bTl c974990bTl, C974060bSG c974060bSG, List<C954460awe> list, EnumC919170a1j enumC919170a1j, long j) {
        int i;
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c974990bTl;
        this.l3 = c974060bSG;
        this.l4 = list;
        this.j5 = enumC919170a1j;
    }
}
