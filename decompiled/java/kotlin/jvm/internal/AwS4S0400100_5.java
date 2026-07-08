package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0F3X;
import X.C0F3Z;
import X.C0FQS;
import X.C1458080o2w;
import X.C1458390o3R;
import X.C189200o6;
import X.C1954807lC;
import X.C201955140j;
import X.C2188811AlT;
import X.C358620E4e;
import X.C563650M8t;
import X.InterfaceC1364105Vn;
import X.InterfaceC1455230nyL;
import X.InterfaceC357510Dzx;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS4S0400100_5 extends C09AY implements Function1 {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    public static final Object invoke$0(AwS4S0400100_5 awS4S0400100_5, Object obj) {
        ((InterfaceC357510Dzx) awS4S0400100_5.l0).LIZ(true);
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Template_Consume: UpdateProgress magic total cost=");
        sbLIZ.append(System.currentTimeMillis() - awS4S0400100_5.j4);
        C201955140j.LIZLLL(c563650M8t, "TemplateMagicApplyTask", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) awS4S0400100_5.l1;
        C358620E4e c358620E4e = new C358620E4e(((C013C) awS4S0400100_5.l2).element, ((C0FQS) awS4S0400100_5.l3).LJIJI.LIZ, 0, 60);
        C189200o6.m2constructorimpl(c358620E4e);
        interfaceC1364105Vn.resumeWith(c358620E4e);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0400100_5 awS4S0400100_5, Object obj) {
        C0F3X c0f3x = (C0F3X) obj;
        String str = C1458080o2w.LJIIZILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musicActivityDetected end: ");
        sbLIZ.append(c0f3x);
        C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ));
        C1458390o3R c1458390o3R = C1458390o3R.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - awS4S0400100_5.j4;
        c1458390o3R.getClass();
        C1458390o3R.LJIIJJI = jCurrentTimeMillis;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setWaitAedDuration time:");
        sbLIZ2.append(jCurrentTimeMillis);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("wait duration:");
        sbLIZ3.append(System.currentTimeMillis() - awS4S0400100_5.j4);
        C201955140j.LJIILIIL("MusicCapsuleProcessTracker", C2188811AlT.LIZIZ(sbLIZ3));
        int i = C0F3Z.LIZ[c0f3x.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            C1458080o2w c1458080o2w = (C1458080o2w) awS4S0400100_5.l0;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS4S0400100_5.l1;
            long j = c1458080o2w.LJIIIIZZ;
            AwS371S0200000_5 awS371S0200000_5 = c1458080o2w.LJFF;
            if (awS371S0200000_5 != null) {
                awS371S0200000_5.invoke(c0f3x);
            }
            if (videoPublishEditModel != null) {
                C1458390o3R.LJIJJ(j, videoPublishEditModel, false);
            }
        } else {
            ((C1458080o2w) awS4S0400100_5.l0).LJIIIZ((VideoPublishEditModel) awS4S0400100_5.l1, (AVMusic) awS4S0400100_5.l2, (InterfaceC1455230nyL) awS4S0400100_5.l3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0400100_5(long j, C1458080o2w c1458080o2w, VideoPublishEditModel videoPublishEditModel, AVMusic aVMusic, InterfaceC1455230nyL interfaceC1455230nyL, int i) {
        super(1);
        this.$t = i;
        this.j4 = j;
        this.l0 = c1458080o2w;
        this.l1 = videoPublishEditModel;
        this.l2 = aVMusic;
        this.l3 = interfaceC1455230nyL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0007: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS4S0400100_5) (LINE:100728839) kotlin.jvm.internal.AwS4S0400100_5.l1 java.lang.Object, block:B:2:0x0000 */
    public AwS4S0400100_5(InterfaceC357510Dzx interfaceC357510Dzx, InterfaceC357510Dzx interfaceC357510Dzx2, long j, InterfaceC1364105Vn<? super C358620E4e> interfaceC1364105Vn, C013C c013c, C0FQS c0fqs) {
        Object obj;
        super(1);
        this.$t = c0fqs;
        this.l0 = interfaceC357510Dzx;
        this.j4 = interfaceC357510Dzx2;
        this.l1 = obj;
        this.l2 = interfaceC1364105Vn;
        this.l3 = c013c;
    }
}
