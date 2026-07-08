package kotlin.jvm.internal;

import X.C05AE;
import X.C09AY;
import X.C1161040gJq;
import X.C1161090gJv;
import X.C1161100gJw;
import X.C1434905jX;
import X.C1718506oB;
import X.C2188811AlT;
import X.C23250099c;
import X.InterfaceC1455405mq;
import X.InterfaceC1891350zJl;
import X.InterfaceC879010Ye3;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class AwS65S0301000_2 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS65S0301000_2 awS65S0301000_2) {
        List<C1161100gJw> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("performInsert before setup handlers responseSessionId=");
        sbLIZ.append(awS65S0301000_2.i3);
        sbLIZ.append(" bodyIds=");
        sbLIZ.append(RavenFragment.OT((RavenFragment) awS65S0301000_2.l0, (List) awS65S0301000_2.l1));
        sbLIZ.append(" mergedLayouts=");
        RavenFragment ravenFragment = (RavenFragment) awS65S0301000_2.l0;
        C1161090gJv c1161090gJv = ((C1161040gJq) awS65S0301000_2.l2).LL;
        if (c1161090gJv != null) {
            list = c1161090gJv.LIZJ;
        } else {
            list = null;
        }
        sbLIZ.append(RavenFragment.RT(ravenFragment, list));
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS65S0301000_2.l0).fT(Integer.valueOf(awS65S0301000_2.i3)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS65S0301000_2 r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS65S0301000_2.invoke$1(kotlin.jvm.internal.AwS65S0301000_2):java.lang.Object");
    }

    public static final Object invoke$2(AwS65S0301000_2 awS65S0301000_2) {
        ((FeedSkylightListViewModel) awS65S0301000_2.l0).TQ2((List) awS65S0301000_2.l1, true);
        FeedSkylightListViewModel feedSkylightListViewModel = (FeedSkylightListViewModel) awS65S0301000_2.l0;
        feedSkylightListViewModel.LLJILJIL = C23250099c.LIZLLL(feedSkylightListViewModel.getAssemVMScope(), null, null, new C05AE(feedSkylightListViewModel, (InterfaceC1455405mq) awS65S0301000_2.l2, ((List) awS65S0301000_2.l1).size(), awS65S0301000_2.i3, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS65S0301000_2(int i, C1434905jX c1434905jX, C1718506oB c1718506oB, InterfaceC879010Ye3 interfaceC879010Ye3, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l0 = c1434905jX;
        this.l1 = c1718506oB;
        this.l2 = interfaceC879010Ye3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS65S0301000_2(int i, int i2, RavenFragment<Object> ravenFragment, List<? extends BaseComponentData> list, C1161040gJq c1161040gJq) {
        super(0);
        this.$t = c1161040gJq;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = ravenFragment;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS65S0301000_2(FeedSkylightListViewModel feedSkylightListViewModel, FeedSkylightListViewModel feedSkylightListViewModel2, List<? extends InterfaceC1891350zJl> list, InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq, int i) {
        super(0);
        this.$t = i;
        this.l0 = feedSkylightListViewModel;
        this.l1 = feedSkylightListViewModel2;
        this.l2 = list;
        this.i3 = interfaceC1455405mq;
    }
}
