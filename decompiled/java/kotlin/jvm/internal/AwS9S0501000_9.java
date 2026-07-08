package kotlin.jvm.internal;

import X.C06KQ;
import X.C09AY;
import X.C0PEM;
import X.C118300cf;
import X.C1440005kM;
import X.C1697810uHb;
import X.C1902940zcS;
import X.C23250099c;
import X.C635160Ovi;
import X.C635250Ovr;
import X.C635280Ovu;
import X.C635290Ovv;
import X.InterfaceC635170Ovj;
import X.InterfaceC635270Ovt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.notification.vm.UnsubscribeSettingViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS9S0501000_9 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S0501000_9 awS9S0501000_9) {
        List<InboxEntranceFunction> list;
        EntranceSettings entranceSettings;
        List<InboxEntranceFunction> list2;
        EntranceSettings entranceSettings2;
        List<InboxEntranceFunction> list3;
        ((InterfaceC635270Ovt) awS9S0501000_9.l0).LIZJ(false);
        InboxEntranceFunction inboxEntranceFunction = (InboxEntranceFunction) awS9S0501000_9.l1;
        int i = 1;
        if (awS9S0501000_9.i5 == 1) {
            i = 0;
        }
        InboxEntranceFunction inboxEntranceFunctionCopy = inboxEntranceFunction.copy(inboxEntranceFunction.name, inboxEntranceFunction.functionType, i, inboxEntranceFunction.iconModel);
        EntranceSettings entranceSettings3 = ((UnsubscribeSettingViewModel) awS9S0501000_9.l2).LLILLJJLI;
        int i2 = -1;
        if (entranceSettings3 != null && (list = entranceSettings3.functionSettings) != null) {
            int i3 = 0;
            for (InboxEntranceFunction inboxEntranceFunction2 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (inboxEntranceFunction2.functionType == inboxEntranceFunctionCopy.functionType) {
                        i2 = i3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i2 >= 0 && (entranceSettings = ((UnsubscribeSettingViewModel) awS9S0501000_9.l2).LLILLJJLI) != null && (list2 = entranceSettings.functionSettings) != null && i2 < list2.size() && (entranceSettings2 = ((UnsubscribeSettingViewModel) awS9S0501000_9.l2).LLILLJJLI) != null && (list3 = entranceSettings2.functionSettings) != null) {
                ListProtector.set(list3, i2, inboxEntranceFunctionCopy);
            }
        }
        ((UnsubscribeSettingViewModel) awS9S0501000_9.l2).vQ2();
        C1440005kM.LIZ(new C1902940zcS(((C635290Ovv) awS9S0501000_9.l3).LLILZ, ((InboxEntranceFunction) awS9S0501000_9.l1).functionType, ((C118300cf) awS9S0501000_9.l4).element, null));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0501000_9 awS9S0501000_9) {
        List<InboxEntranceFunction> list;
        EntranceSettings entranceSettings;
        List<InboxEntranceFunction> list2;
        EntranceSettings entranceSettings2;
        List<InboxEntranceFunction> list3;
        ((InterfaceC635170Ovj) awS9S0501000_9.l0).LIZJ(false);
        InboxEntranceFunction inboxEntranceFunction = (InboxEntranceFunction) awS9S0501000_9.l1;
        int i = 1;
        if (awS9S0501000_9.i5 == 1) {
            i = 0;
        }
        InboxEntranceFunction inboxEntranceFunctionCopy = inboxEntranceFunction.copy(inboxEntranceFunction.name, inboxEntranceFunction.functionType, i, inboxEntranceFunction.iconModel);
        EntranceSettings entranceSettings3 = ((WorkBenchSettingViewModel) awS9S0501000_9.l2).LLILLJJLI;
        int i2 = -1;
        if (entranceSettings3 != null && (list = entranceSettings3.functionSettings) != null) {
            int i3 = 0;
            for (InboxEntranceFunction inboxEntranceFunction2 : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    if (inboxEntranceFunction2.functionType == inboxEntranceFunctionCopy.functionType) {
                        i2 = i3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i2 >= 0 && (entranceSettings = ((WorkBenchSettingViewModel) awS9S0501000_9.l2).LLILLJJLI) != null && (list2 = entranceSettings.functionSettings) != null && i2 < list2.size() && (entranceSettings2 = ((WorkBenchSettingViewModel) awS9S0501000_9.l2).LLILLJJLI) != null && (list3 = entranceSettings2.functionSettings) != null) {
                ListProtector.set(list3, i2, inboxEntranceFunctionCopy);
            }
        }
        WorkBenchSettingViewModel workBenchSettingViewModel = (WorkBenchSettingViewModel) awS9S0501000_9.l2;
        C23250099c.LIZLLL(workBenchSettingViewModel.getAssemVMScope(), C0PEM.LIZJ, null, new C06KQ(workBenchSettingViewModel, null), 2);
        C1440005kM.LIZ(new C1902940zcS(((C635250Ovr) awS9S0501000_9.l3).LLILLJJLI, ((InboxEntranceFunction) awS9S0501000_9.l1).functionType, ((C118300cf) awS9S0501000_9.l4).element, null));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0501000_9(C635160Ovi c635160Ovi, InboxEntranceFunction inboxEntranceFunction, int i, WorkBenchSettingViewModel workBenchSettingViewModel, C635250Ovr c635250Ovr, C118300cf c118300cf, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c635160Ovi;
        this.l1 = inboxEntranceFunction;
        this.i5 = i;
        this.l2 = workBenchSettingViewModel;
        this.l3 = c635250Ovr;
        this.l4 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0501000_9(C635280Ovu c635280Ovu, InboxEntranceFunction inboxEntranceFunction, int i, UnsubscribeSettingViewModel unsubscribeSettingViewModel, C635290Ovv c635290Ovv, C118300cf c118300cf, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c635280Ovu;
        this.l1 = inboxEntranceFunction;
        this.i5 = i;
        this.l2 = unsubscribeSettingViewModel;
        this.l3 = c635290Ovv;
        this.l4 = c118300cf;
    }
}
