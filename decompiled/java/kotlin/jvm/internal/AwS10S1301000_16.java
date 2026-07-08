package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1002190cBd;
import X.C1013560cTy;
import X.C1013570cTz;
import X.C1016040cXy;
import X.C1016050cXz;
import X.C1023640ckE;
import X.C1032360cyI;
import X.C1034410d1b;
import X.C988300bpE;
import X.InterfaceC1016100cY4;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS10S1301000_16 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S1301000_16 awS10S1301000_16, Object obj) {
        Video video = ((RewardAdModel) obj).video;
        if (video != null) {
            int duration = video.getDuration();
            C1016050cXz c1016050cXz = (C1016050cXz) awS10S1301000_16.l1;
            String str = awS10S1301000_16.s0;
            int i = awS10S1301000_16.i4;
            Runnable runnable = (Runnable) awS10S1301000_16.l2;
            C013C c013c = (C013C) awS10S1301000_16.l3;
            IVideoPlayTaskManager iVideoPlayTaskManager = c1016050cXz.LJ;
            C988300bpE c988300bpE = new C988300bpE(str);
            c988300bpE.LIZIZ(duration);
            c988300bpE.LIZJ = i;
            c988300bpE.LIZLLL = runnable;
            c988300bpE.LJ = true;
            iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
            c013c.element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S1301000_16 awS10S1301000_16, Object obj) {
        com.bytedance.ies.ugc.aweme.rich.model.feed.model.Video video = ((GmtRewardAdModel) obj).video;
        if (video != null) {
            int duration = video.getDuration();
            C1016040cXy c1016040cXy = (C1016040cXy) awS10S1301000_16.l1;
            String str = awS10S1301000_16.s0;
            int i = awS10S1301000_16.i4;
            Runnable runnable = (Runnable) awS10S1301000_16.l2;
            C013C c013c = (C013C) awS10S1301000_16.l3;
            InterfaceC1016100cY4 interfaceC1016100cY4 = c1016040cXy.LJ;
            C1032360cyI c1032360cyI = new C1032360cyI(str);
            long j = duration;
            if (j <= 0) {
                j = 1;
            }
            c1032360cyI.LIZ = j;
            c1032360cyI.LIZIZ = i;
            c1032360cyI.LIZJ = runnable;
            c1032360cyI.LIZLLL = true;
            interfaceC1016100cY4.LIZ(new C1034410d1b(c1032360cyI.LIZ, c1032360cyI.LIZIZ, c1032360cyI.LIZJ, c1032360cyI.LIZLLL, c1032360cyI.LJ, str));
            c013c.element = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S1301000_16 awS10S1301000_16, Object obj) {
        Long lValueOf;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1013570cTz.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013570cTz.LIZJ;
        Long lValueOf2 = null;
        if (((Integer) awS10S1301000_16.l1) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd, lValueOf);
        C1002190cBd c1002190cBd2 = C1013570cTz.LIZLLL;
        if (((Integer) awS10S1301000_16.l2) != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        }
        c1023640ckE.withParam(c1002190cBd2, lValueOf2);
        C1002190cBd c1002190cBd3 = C1013570cTz.LJ;
        C1013560cTy c1013560cTy = (C1013560cTy) awS10S1301000_16.l3;
        int i = awS10S1301000_16.i4;
        c1013560cTy.getClass();
        c1023640ckE.withParam(c1002190cBd3, C1013560cTy.LJJIIZ(i));
        c1023640ckE.withParam(C1013570cTz.LJFF, awS10S1301000_16.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS10S1301000_16 awS10S1301000_16, Object obj) {
        Long lValueOf;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1013570cTz.LIZ.getClass();
        C1002190cBd c1002190cBd = C1013570cTz.LIZJ;
        Long lValueOf2 = null;
        if (((Integer) awS10S1301000_16.l1) != null) {
            lValueOf = Long.valueOf(r0.intValue());
        } else {
            lValueOf = null;
        }
        c1023640ckE.withParam(c1002190cBd, lValueOf);
        C1002190cBd c1002190cBd2 = C1013570cTz.LIZLLL;
        if (((Integer) awS10S1301000_16.l2) != null) {
            lValueOf2 = Long.valueOf(r0.intValue());
        }
        c1023640ckE.withParam(c1002190cBd2, lValueOf2);
        C1002190cBd c1002190cBd3 = C1013570cTz.LJ;
        C1013560cTy c1013560cTy = (C1013560cTy) awS10S1301000_16.l3;
        int i = awS10S1301000_16.i4;
        c1013560cTy.getClass();
        c1023640ckE.withParam(c1002190cBd3, C1013560cTy.LJJIIZ(i));
        c1023640ckE.withParam(C1013570cTz.LJFF, awS10S1301000_16.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1301000_16(C1016040cXy c1016040cXy, String str, int i, Runnable runnable, C013C c013c, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1016040cXy;
        this.s0 = str;
        this.i4 = i;
        this.l2 = runnable;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1301000_16(C1016050cXz c1016050cXz, String str, int i, Runnable runnable, C013C c013c, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c1016050cXz;
        this.s0 = str;
        this.i4 = i;
        this.l2 = runnable;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S1301000_16(Integer num, Integer num2, C1013560cTy c1013560cTy, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = num;
        this.l2 = num2;
        this.l3 = c1013560cTy;
        this.i4 = i;
        this.s0 = str;
    }
}
