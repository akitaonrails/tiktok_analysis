package kotlin.jvm.internal;

import X.C06KQ;
import X.C09AY;
import X.C0PEM;
import X.C1440005kM;
import X.C15438062q;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C23250099c;
import X.C606500Nqa;
import X.C606600Nqk;
import X.C624090Odr;
import X.C624130Odv;
import X.C635140Ovg;
import X.C635150Ovh;
import X.InterfaceC635170Ovj;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS69S0301000_9 extends C09AY implements Function0 {
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

    public static final Object invoke$0(AwS69S0301000_9 awS69S0301000_9) {
        List<MissionSetting> list;
        List<MissionSetting> list2;
        ((InterfaceC635170Ovj) awS69S0301000_9.l0).LIZJ(false);
        List<MissionSetting> list3 = ((WorkBenchSettingViewModel) awS69S0301000_9.l1).LLILLL;
        int i = -1;
        if (list3 != null) {
            C635140Ovg c635140Ovg = (C635140Ovg) awS69S0301000_9.l2;
            int i2 = 0;
            for (MissionSetting missionSetting : list3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    MissionSetting missionSetting2 = missionSetting;
                    if (missionSetting2 != null && c635140Ovg.LL == missionSetting2.source && c635140Ovg.LLILLJJLI == missionSetting2.subSource) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i >= 0 && (list = ((WorkBenchSettingViewModel) awS69S0301000_9.l1).LLILLL) != null && i < list.size() && (list2 = ((WorkBenchSettingViewModel) awS69S0301000_9.l1).LLILLL) != null) {
                int i4 = awS69S0301000_9.i3;
                C635140Ovg c635140Ovg2 = (C635140Ovg) awS69S0301000_9.l2;
                ListProtector.set(list2, i, new MissionSetting(i4, c635140Ovg2.LLILZ, c635140Ovg2.LL, c635140Ovg2.LLILLJJLI, c635140Ovg2.LLILZIL));
            }
        }
        WorkBenchSettingViewModel workBenchSettingViewModel = (WorkBenchSettingViewModel) awS69S0301000_9.l1;
        C23250099c.LIZLLL(workBenchSettingViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C06KQ(workBenchSettingViewModel, null), 2);
        C635140Ovg c635140Ovg3 = (C635140Ovg) awS69S0301000_9.l2;
        C1440005kM.LIZ(new C624090Odr(new C624130Odv(c635140Ovg3.LL, c635140Ovg3.LLILLJJLI, awS69S0301000_9.i3)));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS69S0301000_9 awS69S0301000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert ");
        sbLIZ.append(((Aweme) awS69S0301000_9.l0).getAid());
        sbLIZ.append(" at ");
        sbLIZ.append(awS69S0301000_9.i3);
        sbLIZ.append(" by ");
        sbLIZ.append(((C606500Nqa) awS69S0301000_9.l1).LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(((C606600Nqk) awS69S0301000_9.l2).LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS69S0301000_9 awS69S0301000_9) {
        StringBuilder sb = new StringBuilder("insert ");
        List list = (List) awS69S0301000_9.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Aweme) it2.next()).getAid());
        }
        sb.append(arrayList);
        sb.append(" at ");
        sb.append(awS69S0301000_9.i3);
        sb.append(" by ");
        sb.append(((C606500Nqa) awS69S0301000_9.l1).LIZ);
        sb.append(", result=");
        sb.append(((C606600Nqk) awS69S0301000_9.l2).LIZ);
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S0301000_9(C635150Ovh c635150Ovh, WorkBenchSettingViewModel workBenchSettingViewModel, int i, C635140Ovg c635140Ovg, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c635150Ovh;
        this.l1 = workBenchSettingViewModel;
        this.i3 = i;
        this.l2 = c635140Ovg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S0301000_9(Aweme aweme, int i, C606500Nqa c606500Nqa, C606600Nqk c606600Nqk, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = aweme;
        this.i3 = i;
        this.l1 = c606500Nqa;
        this.l2 = c606600Nqk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS69S0301000_9(List list, List<? extends Aweme> list2, int i, C606500Nqa c606500Nqa, C606600Nqk c606600Nqk) {
        super(0);
        this.$t = c606600Nqk;
        this.l0 = list;
        this.i3 = list2;
        this.l1 = i;
        this.l2 = c606500Nqa;
    }
}
