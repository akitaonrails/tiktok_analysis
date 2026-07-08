package kotlin.jvm.internal;

import X.AbstractC704860Rkq;
import X.C09AY;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C703900RjI;
import X.C703910RjJ;
import X.C704940Rky;
import X.C729220Sj2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes12.dex */
public class AwS33S2200000_11 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS33S2200000_11 awS33S2200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doModifyTreeStructure start: ");
        sbLIZ.append((FeedComponentPriorityData) awS33S2200000_11.l2);
        sbLIZ.append(", ");
        sbLIZ.append(awS33S2200000_11.s0);
        sbLIZ.append(", ");
        sbLIZ.append((List) awS33S2200000_11.l3);
        sbLIZ.append(", ");
        sbLIZ.append(awS33S2200000_11.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS33S2200000_11 awS33S2200000_11) {
        if (((StoryFeedViewModel) awS33S2200000_11.l2).XQ2(awS33S2200000_11.s0)) {
            C729220Sj2.LL.LJIILJJIL((UserStory) awS33S2200000_11.l3);
        }
        ((StoryFeedViewModel) awS33S2200000_11.l2).PQ2(awS33S2200000_11.s1, awS33S2200000_11.s0);
        ((StoryFeedViewModel) awS33S2200000_11.l2).zQ2((UserStory) awS33S2200000_11.l3, "LOAD_USER_STORY_SUCCESS");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS33S2200000_11 awS33S2200000_11) {
        AbstractC704860Rkq abstractC704860Rkq;
        Map<String, Object> mapLJ;
        Function0 function0 = (Function0) awS33S2200000_11.l2;
        Object obj = null;
        if (function0 != null) {
            abstractC704860Rkq = (AbstractC704860Rkq) function0.invoke();
        } else {
            abstractC704860Rkq = null;
        }
        C704940Rky c704940Rky = C704940Rky.LIZ;
        String str = awS33S2200000_11.s0;
        c704940Rky.getClass();
        boolean zLJFF = false;
        if (str != null && abstractC704860Rkq != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
            FcpUiTemplate fcpUiTemplate = abstractC704860Rkq.LIZ;
            if (fcpUiTemplate == null || (mapLJ = fcpUiTemplate.getFieldsMap()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            int size = listLJJLIIIJILLIZJL.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj2 = ListProtector.get(listLJJLIIIJILLIZJL, i);
                if (i == listLJJLIIIJILLIZJL.size() - 1) {
                    obj = mapLJ.get(obj2);
                    break;
                }
                Object obj3 = mapLJ.get(obj2);
                if (!(obj3 instanceof Map) || (mapLJ = (Map) obj3) == null) {
                    break;
                }
                i++;
            }
        }
        String str2 = awS33S2200000_11.s1;
        if (Intrinsics.LJFF(str2, "==")) {
            zLJFF = Intrinsics.LJFF(obj, awS33S2200000_11.l3);
        } else if (Intrinsics.LJFF(str2, "!=") && !Intrinsics.LJFF(obj, awS33S2200000_11.l3)) {
            zLJFF = true;
        }
        return Boolean.valueOf(zLJFF);
    }

    public static final Object invoke$3(AwS33S2200000_11 awS33S2200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueuePendingTask drop_capacity_per_slot aid=");
        sbLIZ.append(((C703900RjI) awS33S2200000_11.l2).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS33S2200000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS33S2200000_11.s1);
        sbLIZ.append(" pendingForSlot=");
        sbLIZ.append(((ArrayDeque) awS33S2200000_11.l3).size());
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS33S2200000_11.l2).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS33S2200000_11 awS33S2200000_11) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueuePendingTask add aid=");
        sbLIZ.append(((C703900RjI) awS33S2200000_11.l2).LIZIZ);
        sbLIZ.append(" slotKey=");
        sbLIZ.append(awS33S2200000_11.s0);
        sbLIZ.append(" dedupeKey=");
        sbLIZ.append(awS33S2200000_11.s1);
        sbLIZ.append(" generation=");
        sbLIZ.append(((C703900RjI) awS33S2200000_11.l2).LIZJ);
        sbLIZ.append(" pendingForSlot=");
        sbLIZ.append(((ArrayDeque) awS33S2200000_11.l3).size());
        sbLIZ.append(" pendingTotal=");
        sbLIZ.append(((C703900RjI) awS33S2200000_11.l2).LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S2200000_11(C703900RjI c703900RjI, C703900RjI c703900RjI2, String str, String str2, ArrayDeque<C703910RjJ> arrayDeque) {
        super(0);
        this.$t = arrayDeque;
        this.l2 = c703900RjI;
        this.s0 = c703900RjI2;
        this.s1 = str;
        this.l3 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS33S2200000_11(StoryFeedViewModel storyFeedViewModel, String str, UserStory userStory, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = storyFeedViewModel;
        this.s0 = str;
        this.l3 = userStory;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S2200000_11(FeedComponentPriorityData feedComponentPriorityData, FeedComponentPriorityData feedComponentPriorityData2, String str, List<String> list, String str2) {
        super(0);
        this.$t = str2;
        this.l2 = feedComponentPriorityData;
        this.s0 = feedComponentPriorityData2;
        this.l3 = str;
        this.s1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS33S2200000_11(Function0 function0, Function0<? extends AbstractC704860Rkq<?>> function02, String str, String str2, Object obj) {
        super(0);
        this.$t = obj;
        this.l2 = function0;
        this.s0 = function02;
        this.s1 = str;
        this.l3 = str2;
    }
}
