package kotlin.jvm.internal;

import X.C09AY;
import X.C0RF0;
import X.C0RQ5;
import X.C0RQN;
import X.C0RUD;
import X.C0S9P;
import X.C719880SLq;
import X.EnumC697300RWu;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSlideViewPagerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizTopAreaComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS48S0100100_11 extends C09AY implements Function1 {
    public final int $t;
    public long j1;
    public Object l0;

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

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS48S0100100_11 r11, java.lang.Object r12) {
        /*
            r6 = r12
            X.0Sl5 r6 = (X.C730490Sl5) r6
            java.lang.Object r5 = r11.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM r5 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM) r5
            long r2 = r11.j1
            java.lang.Object r0 = r5.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r0.getAweme()
        L15:
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM r0 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM) r0
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L3d
            int r1 = r0.getUserDigg()
            r0 = 1
            if (r1 != r0) goto L3d
        L2e:
            X.0SnN r7 = r5.AQ2(r2, r4, r0)
            r8 = 0
            r12 = 61
            r9 = r8
            r10 = r8
            r11 = r8
            X.0Sl5 r0 = X.C730490Sl5.LIZ(r6, r7, r8, r9, r10, r11, r12)
            return r0
        L3d:
            r0 = 0
            goto L2e
        L3f:
            r4 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS48S0100100_11.invoke$0(kotlin.jvm.internal.AwS48S0100100_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS48S0100100_11 awS48S0100100_11, Object obj) {
        C0S9P c0s9p = (C0S9P) obj;
        C719880SLq c719880SLq = ((PhotoSlideViewPagerComponent) awS48S0100100_11.l0).LLLFFI;
        if (c719880SLq != null) {
            c719880SLq.LJJJJLI(awS48S0100100_11.j1, c0s9p.LLJJJJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS48S0100100_11 awS48S0100100_11, Object obj) {
        String str;
        Integer num;
        C0RUD c0rud = (C0RUD) obj;
        C0RF0 c0rf0 = ((InteractAreaComponent) awS48S0100100_11.l0).jm().LIZLLL;
        Integer numValueOf = null;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        c0rud.LLJILLL = str;
        C0RF0 c0rf02 = ((InteractAreaComponent) awS48S0100100_11.l0).jm().LIZLLL;
        if (c0rf02 != null) {
            num = c0rf02.LJIIZILJ;
        } else {
            num = null;
        }
        c0rud.LLJJ = num;
        C0RF0 c0rf03 = ((InteractAreaComponent) awS48S0100100_11.l0).jm().LIZLLL;
        if (c0rf03 != null) {
            numValueOf = Integer.valueOf(c0rf03.LJIILJJIL);
        }
        c0rud.LLJJI = numValueOf;
        c0rud.LLJ = new BizTopAreaComponent();
        c0rud.LLJI = R.id.c26;
        C0RQN.LJ(((InteractAreaComponent) awS48S0100100_11.l0).Ig(), C0RQ5.C_INTERACT_BIZ_TOP, EnumC697300RWu.M_CREATE, awS48S0100100_11.j1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0100100_11(VideoDiggVM videoDiggVM, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoDiggVM;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0100100_11(PhotoSlideViewPagerComponent photoSlideViewPagerComponent, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = photoSlideViewPagerComponent;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS48S0100100_11(InteractAreaComponent interactAreaComponent, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = interactAreaComponent;
        this.j1 = j;
    }
}
