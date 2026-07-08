package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0UD4;
import X.C0UG4;
import X.C0UG5;
import X.C0UG8;
import X.C0VSJ;
import X.C20441214yg;
import X.C942440adG;
import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS97S1200000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final Object invoke$0(AwS97S1200000_12 awS97S1200000_12, Object obj) {
        ArrayList arrayList;
        List<String> list;
        List list2 = (List) obj;
        if (LiveBeautyReverseExperiment.INSTANCE.isInExperiment() && Intrinsics.LJFF(awS97S1200000_12.s0, "broadcast")) {
            C0UG4 c0ug4 = (C0UG4) awS97S1200000_12.l1;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                LiveComposerNode liveComposerNode = (LiveComposerNode) obj2;
                C0UG8 c0ug8 = c0ug4.LIZJ;
                if (c0ug8 != null && (list = c0ug8.LIZIZ) != null && list.contains(liveComposerNode.panel) && !Intrinsics.LJFF(liveComposerNode.panel, C0UD4.LJFF)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            Set set = (Set) awS97S1200000_12.l2;
            arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (set.contains(((LiveComposerNode) obj3).panel)) {
                    arrayList.add(obj3);
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) ((C0UG4) awS97S1200000_12.l1).LJFF;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS97S1200000_12 awS97S1200000_12, Object obj) {
        boolean z;
        LiveComposerNode liveComposerNode = (LiveComposerNode) obj;
        if (Intrinsics.LJFF(liveComposerNode.panel, awS97S1200000_12.s0) && !((Set) awS97S1200000_12.l1).contains(liveComposerNode.path)) {
            z = true;
            ((C013C) awS97S1200000_12.l2).element = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS97S1200000_12 awS97S1200000_12, Object obj) {
        ArrayList<LiveComposerNode> arrayList;
        List<String> list;
        List list2 = (List) obj;
        if (LiveBeautyReverseExperiment.INSTANCE.isInExperiment() && Intrinsics.LJFF(awS97S1200000_12.s0, "broadcast")) {
            C0UG5 c0ug5 = (C0UG5) awS97S1200000_12.l1;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                LiveComposerNode liveComposerNode = (LiveComposerNode) obj2;
                C0UG8 c0ug8 = c0ug5.LIZJ;
                if (c0ug8 != null && (list = c0ug8.LIZIZ) != null && list.contains(liveComposerNode.panel) && !Intrinsics.LJFF(liveComposerNode.panel, C0UD4.LJFF)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            Set set = (Set) awS97S1200000_12.l2;
            arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (set.contains(((LiveComposerNode) obj3).panel)) {
                    arrayList.add(obj3);
                }
            }
        }
        C0UG5 c0ug52 = (C0UG5) awS97S1200000_12.l1;
        for (LiveComposerNode liveComposerNode2 : arrayList) {
            if (liveComposerNode2.modified == 1) {
                c0ug52.LJI.add(liveComposerNode2.resourceId);
            }
            C20441214yg.LIZIZ("EffectMonitor#autoRestore", String.valueOf(liveComposerNode2));
        }
        ArrayList arrayList2 = (ArrayList) ((C0UG5) awS97S1200000_12.l1).LJFF;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS97S1200000_12 awS97S1200000_12, Object obj) {
        ((Function1) awS97S1200000_12.l2).invoke(new C0VSJ(((C942440adG) awS97S1200000_12.l1).LIZIZ.getFullPath(), awS97S1200000_12.s0));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S1200000_12(C942440adG c942440adG, AwS378S0200000_12 awS378S0200000_12, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c942440adG;
        this.l2 = awS378S0200000_12;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS97S1200000_12(String str, String str2, C0UG4 c0ug4, Set<String> set) {
        super(1);
        this.$t = set;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c0ug4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS97S1200000_12(String str, String str2, C0UG5 c0ug5, Set<String> set) {
        super(1);
        this.$t = set;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c0ug5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS97S1200000_12(String str, String str2, Set<String> set, C013C c013c) {
        super(1);
        this.$t = c013c;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = set;
    }
}
