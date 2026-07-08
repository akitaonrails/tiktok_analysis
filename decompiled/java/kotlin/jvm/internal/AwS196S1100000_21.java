package kotlin.jvm.internal;

import X.AbstractC1362700lZ6;
import X.C09AY;
import X.C1361770lXb;
import X.C1362650lZ1;
import X.C1363390laD;
import X.C1363410laF;
import X.C1374270lrl;
import X.C1374720lsU;
import X.C13LQ;
import X.C291001Au;
import X.C735200Ssg;
import X.EnumC1351150lGT;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public class AwS196S1100000_21 extends C09AY implements Function2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS196S1100000_21(String str, C1361770lXb c1361770lXb, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1361770lXb;
    }

    public static final Object invoke$0(AwS196S1100000_21 awS196S1100000_21, Object obj, Object obj2) {
        ((Function1) awS196S1100000_21.l1).invoke(new C1374270lrl(C1374720lsU.LJFF(C1374720lsU.LIZIZ(), awS196S1100000_21.s0), null, null, (String) obj2, 28));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS196S1100000_21 awS196S1100000_21, Object obj, Object obj2) {
        EnumC1351150lGT enumC1351150lGT = (EnumC1351150lGT) obj2;
        if (Intrinsics.LJFF(awS196S1100000_21.s0, obj)) {
            ((VideoQuickCommentAssem) awS196S1100000_21.l1).kq(false, enumC1351150lGT);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS196S1100000_21 awS196S1100000_21, Object obj, Object obj2) {
        C735200Ssg c735200Ssg;
        AbstractC1362700lZ6 abstractC1362700lZ6;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c735200Ssg = (C735200Ssg) c291001Au.LIZ) != null) {
            String str = awS196S1100000_21.s0;
            C1362650lZ1 c1362650lZ1 = (C1362650lZ1) awS196S1100000_21.l1;
            if (c735200Ssg.LIZLLL && C13LQ.LJJIJIIJI(Integer.valueOf(c735200Ssg.LIZ), new Integer[]{1, 2, 3, 4}) >= 0 && Intrinsics.LJFF(c735200Ssg.LIZIZ, str) && c1362650lZ1.getItemCount() > 0 && (abstractC1362700lZ6 = c1362650lZ1.LLIZLLLIL) != null) {
                abstractC1362700lZ6.notifyItemChanged(0, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS196S1100000_21 awS196S1100000_21, Object obj, Object obj2) {
        C735200Ssg c735200Ssg;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c735200Ssg = (C735200Ssg) c291001Au.LIZ) != null) {
            String str = awS196S1100000_21.s0;
            SharePanelWidget sharePanelWidget = (SharePanelWidget) awS196S1100000_21.l1;
            if (c735200Ssg.LIZLLL && C13LQ.LJJIJIIJI(Integer.valueOf(c735200Ssg.LIZ), new Integer[]{1, 2, 3, 4}) >= 0 && Intrinsics.LJFF(c735200Ssg.LIZIZ, str)) {
                C1363390laD c1363390laD = sharePanelWidget.LLIZ;
                C1363390laD c1363390laD2 = null;
                if (c1363390laD == null) {
                    c1363390laD = null;
                }
                if (c1363390laD.getItemCount() > 0) {
                    C1363390laD c1363390laD3 = sharePanelWidget.LLIZ;
                    if (c1363390laD3 != null) {
                        c1363390laD2 = c1363390laD3;
                    }
                    c1363390laD2.notifyItemChanged(0);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS196S1100000_21 awS196S1100000_21, Object obj, Object obj2) {
        C735200Ssg c735200Ssg;
        C1363410laF c1363410laF;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c735200Ssg = (C735200Ssg) c291001Au.LIZ) != null) {
            String str = awS196S1100000_21.s0;
            C1361770lXb c1361770lXb = (C1361770lXb) awS196S1100000_21.l1;
            if (c735200Ssg.LIZLLL && C13LQ.LJJIJIIJI(Integer.valueOf(c735200Ssg.LIZ), new Integer[]{1, 2, 3, 4}) >= 0 && Intrinsics.LJFF(c735200Ssg.LIZIZ, str) && c1361770lXb.LIZ() > 0 && (c1363410laF = c1361770lXb.LLILZLL) != null) {
                c1363410laF.notifyItemChanged(0, Boolean.TRUE);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS196S1100000_21(String str, C1362650lZ1 c1362650lZ1, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1362650lZ1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS196S1100000_21(String str, VideoQuickCommentAssem videoQuickCommentAssem, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = videoQuickCommentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS196S1100000_21(String str, SharePanelWidget sharePanelWidget, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
        this.l1 = sharePanelWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS196S1100000_21(String str, Function1 function1, int i) {
        super(2);
        this.$t = i;
        this.l1 = function1;
        this.s0 = str;
    }
}
