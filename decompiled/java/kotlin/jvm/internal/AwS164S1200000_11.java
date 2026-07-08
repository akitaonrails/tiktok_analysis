package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C2344009Gk;
import X.InterfaceC1631620sYq;
import X.InterfaceC702260Rge;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.next.ability.FcpAbilityKt$createFcpComponentProtocol$1;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public class AwS164S1200000_11 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1200000_11(StoryFeedViewModel storyFeedViewModel, String str, C013C c013c, int i) {
        super(3);
        this.$t = i;
        this.l1 = storyFeedViewModel;
        this.s0 = str;
        this.l2 = c013c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r1.storyHighlightInfo != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS164S1200000_11 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS164S1200000_11.invoke$0(kotlin.jvm.internal.AwS164S1200000_11, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS164S1200000_11 awS164S1200000_11, Object obj, Object obj2, Object obj3) {
        C2344009Gk c2344009Gk = (C2344009Gk) obj2;
        Map<String, String> mapLIZ = ((FcpAbilityKt$createFcpComponentProtocol$1) awS164S1200000_11.l1).LIZ(awS164S1200000_11.s0);
        if (mapLIZ != null) {
            for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue());
            }
        }
        if (((InterfaceC702260Rge) awS164S1200000_11.l2).LIZIZ(awS164S1200000_11.s0)) {
            ((InterfaceC702260Rge) awS164S1200000_11.l2).LIZLLL();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS164S1200000_11(FcpAbilityKt$createFcpComponentProtocol$1 fcpAbilityKt$createFcpComponentProtocol$1, String str, InterfaceC702260Rge interfaceC702260Rge, int i) {
        super(3);
        this.$t = i;
        this.l1 = fcpAbilityKt$createFcpComponentProtocol$1;
        this.s0 = str;
        this.l2 = interfaceC702260Rge;
    }
}
