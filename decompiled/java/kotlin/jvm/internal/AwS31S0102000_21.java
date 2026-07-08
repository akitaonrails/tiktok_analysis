package kotlin.jvm.internal;

import X.C09AY;
import X.C1358490lSJ;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS31S0102000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final Object invoke$0(AwS31S0102000_21 awS31S0102000_21, Object obj) {
        C1358490lSJ c1358490lSJ = (C1358490lSJ) obj;
        return C1358490lSJ.LIZ(c1358490lSJ, null, null, null, null, ((RepostInteractListViewModel) awS31S0102000_21.l0).GQ2(c1358490lSJ.LLILZIL, awS31S0102000_21.i1, awS31S0102000_21.i2), null, 0, 111);
    }

    public static final Object invoke$1(AwS31S0102000_21 awS31S0102000_21, Object obj) {
        C1358490lSJ c1358490lSJ = (C1358490lSJ) obj;
        return C1358490lSJ.LIZ(c1358490lSJ, null, null, null, null, ((RepostInteractListViewModel) awS31S0102000_21.l0).GQ2(c1358490lSJ.LLILZIL, awS31S0102000_21.i1, awS31S0102000_21.i2), null, 0, 111);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS31S0102000_21(RepostInteractListViewModel repostInteractListViewModel, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = repostInteractListViewModel;
        this.i1 = i;
        this.i2 = i2;
    }
}
