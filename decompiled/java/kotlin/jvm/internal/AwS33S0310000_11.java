package kotlin.jvm.internal;

import X.C09AY;
import X.C730050SkN;
import X.C730090SkR;
import X.C730340Skq;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS33S0310000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    /* JADX WARN: Removed duplicated region for block: B:111:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS33S0310000_11 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS33S0310000_11.invoke$0(kotlin.jvm.internal.AwS33S0310000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS33S0310000_11 awS33S0310000_11, Object obj) {
        C730050SkN c730050SkN;
        C730090SkR c730090SkR = (C730090SkR) obj;
        boolean z = awS33S0310000_11.z3;
        List arrayList = (List) awS33S0310000_11.l0;
        if (arrayList == null && ((c730050SkN = ((C730090SkR) awS33S0310000_11.l1).LLJJ) == null || (arrayList = c730050SkN.LIZIZ) == null)) {
            arrayList = new ArrayList();
        }
        return C730090SkR.LIZ(c730090SkR, null, null, null, false, null, null, null, 0, 0, 0L, 0L, false, false, null, new C730050SkN(z, arrayList, (Aweme) awS33S0310000_11.l2, 8), 16383);
    }

    public static final Object invoke$2(AwS33S0310000_11 awS33S0310000_11, Object obj) {
        ((StoryViewerListViewModel) awS33S0310000_11.l0).setState(new AwS33S0310000_11(awS33S0310000_11.z3, (boolean) awS33S0310000_11.l1, (List<C730340Skq>) obj, (C730090SkR) awS33S0310000_11.l2, (Aweme) 1));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S0310000_11(StoryViewerListViewModel storyViewerListViewModel, StoryViewerListViewModel storyViewerListViewModel2, boolean z, List<C730340Skq> list, Aweme aweme) {
        super(1);
        this.$t = aweme;
        this.l0 = storyViewerListViewModel;
        this.z3 = storyViewerListViewModel2;
        this.l1 = z;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S0310000_11(boolean z, PostModeDetailFragment postModeDetailFragment, Aweme aweme, PostModeDetailParams postModeDetailParams, int i) {
        super(1);
        this.$t = i;
        this.z3 = z;
        this.l0 = postModeDetailFragment;
        this.l1 = aweme;
        this.l2 = postModeDetailParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S0310000_11(boolean z, boolean z2, List<C730340Skq> list, C730090SkR c730090SkR, Aweme aweme) {
        super(1);
        this.$t = aweme;
        this.z3 = z;
        this.l0 = z2;
        this.l1 = list;
        this.l2 = c730090SkR;
    }
}
