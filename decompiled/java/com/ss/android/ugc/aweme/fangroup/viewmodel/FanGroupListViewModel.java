package com.ss.android.ugc.aweme.fangroup.viewmodel;

import X.C01GW;
import X.C0YSQ;
import X.C1229980i72;
import X.C1230940i8a;
import X.C1230950i8b;
import X.C1230960i8c;
import X.C13BV;
import X.C1559260qg8;
import X.C2097608Jq;
import X.C452501pT;
import X.C461720I8s;
import X.InterfaceC0148002o;
import X.InterfaceC876950Yaj;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fangroup.model.CreatorFanGroupMeta;
import com.ss.android.ugc.aweme.fangroup.model.GroupInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupListViewModel extends AssemViewModel<C1230950i8b> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1229980i72.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(244));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1427));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(79));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(78));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1426));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1230950i8b(C13BV.INSTANCE, new CreatorFanGroupMeta(0L, "", Boolean.FALSE), false, null, null);
    }

    public final C1229980i72 wQ2() {
        return (C1229980i72) this.LL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL((C1230960i8c) this.LLILZLL.getValue());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJI((C1230960i8c) this.LLILZLL.getValue());
    }

    public final boolean xQ2() {
        return C461720I8s.LJI(wQ2().LL);
    }

    public final void yQ2(String str) {
        if (str == null) {
            return;
        }
        C1230950i8b state = getState();
        List<C1230940i8a> list = state.LL;
        ArrayList arrayList = new ArrayList();
        for (C1230940i8a c1230940i8a : list) {
            if (!Intrinsics.LJFF(c1230940i8a.LL, str)) {
                arrayList.add(c1230940i8a);
            }
        }
        if (arrayList.size() != state.LL.size()) {
            CreatorFanGroupMeta creatorFanGroupMeta = state.LLILLJJLI;
            setState(new AwS385S0200000_19((List) arrayList, (List<C1230940i8a>) new CreatorFanGroupMeta(creatorFanGroupMeta.currentGroupNum - 1, creatorFanGroupMeta.creatorName, creatorFanGroupMeta.creationEligibility), (CreatorFanGroupMeta) 28));
        }
    }

    public final C1230940i8a zQ2(GroupInfo groupInfo) {
        int i;
        long j = groupInfo.convShortId;
        String str = groupInfo.conversationId;
        String str2 = groupInfo.groupName;
        String str3 = groupInfo.avatarThumb;
        int i2 = groupInfo.groupMemberCount;
        String str4 = groupInfo.groupDesc;
        if (xQ2()) {
            i = 2;
        } else {
            i = groupInfo.groupStatus;
        }
        String str5 = groupInfo.thresholdMsg;
        int i3 = groupInfo.businessType;
        boolean z = wQ2().LLILZIL.enableClickSelectGroup;
        int i4 = wQ2().LLILZIL.pageStyle;
        Map<String, String> mapLJ = groupInfo.eventTracking;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        return new C1230940i8a(str, j, str2, str3, i2, str4, i, str5, i3, z, i4, mapLJ);
    }

    public final void AQ2(int i, String str) {
        if (str == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(getState().LL);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C1230940i8a) it2.next()).LL, str)) {
                if (i2 != -1) {
                    C1230940i8a c1230940i8a = (C1230940i8a) ListProtector.remove(arrayList, i2);
                    ListProtector.add(arrayList, i2, new C1230940i8a(c1230940i8a.LL, c1230940i8a.LLILLJJLI, c1230940i8a.LLILLL, c1230940i8a.LLILZ, c1230940i8a.LLILZIL, c1230940i8a.LLILZLL, i, c1230940i8a.LLIZLLLIL, c1230940i8a.LLJ, c1230940i8a.LLJI, c1230940i8a.LLJIJIL, c1230940i8a.LLJILJIL));
                    setState(new AwS598S0100000_19(arrayList, (List<? extends ProfileComponents>) 516));
                    return;
                }
                return;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(boolean r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel.vQ2(boolean, X.05Vn):java.lang.Object");
    }
}
