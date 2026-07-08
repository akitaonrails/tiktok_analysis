package com.ss.android.ugc.aweme.relation.feed.performanceui;

import X.C01D1;
import X.C01GW;
import X.C10LG;
import X.C1261860iwS;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1713290ugZ;
import X.C19719612Di;
import X.C19719912Dl;
import X.C1A5L;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C888460YtI;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS65S1000000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes29.dex */
public final class PerformanceRecUsersAssem extends ReusedUIContentAssem<PerformanceRecUsersAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(338));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 512));
    public final AssemVMLazy LLJJJJLIIL;
    public final List<C10LG> LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PerformanceRecUsersAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/feed/performanceui/PerformanceUserCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PerformanceRecUsersAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PerformanceUserCardViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS572S0100000_28(c19719912DlLIZ, 513), AFwS271S0000000_28.get$arr$(199), null, true);
        this.LLJJL = new ArrayList();
        this.LLJL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(337));
        this.LLJLIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(339));
    }

    public final PerformanceUserCardViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLILLLLZIIL;
        return (PerformanceUserCardViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user = c888460YtI.LIZ;
        if (user == null) {
            return;
        }
        PerformanceUserCardViewModel performanceUserCardViewModelCp = cp();
        String uid = user.getUid();
        performanceUserCardViewModelCp.LLJJIII.add(uid);
        C1713290ugZ c1713290ugZ = (C1713290ugZ) performanceUserCardViewModelCp.getState();
        ArrayList arrayList = new ArrayList(c1713290ugZ.LLILZ);
        if (!C19719612Di.LJJIIJ(arrayList, new AwS65S1000000_14(uid, 8), true)) {
            performanceUserCardViewModelCp.getLogger().LIZ("BigCardViewModel", "blocked user not in display list, skip replace");
            return;
        }
        int i = c1713290ugZ.LLILZIL - 1;
        if (i < 0) {
            i = 0;
        }
        performanceUserCardViewModelCp.setState(new AwS132S0101000_26(arrayList, (List<C1261860iwS>) i, 6));
        performanceUserCardViewModelCp.wQ2(((Number) performanceUserCardViewModelCp.LLILZ.getValue()).intValue() - arrayList.size(), 3, arrayList);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        EventBus.LIZLLL().LJIJJ(this);
        String str = cp().LLJIJIL;
        this.LLJJLIIIJLLLLLLLZ = str;
        Intrinsics.LJFF(str, "homepage_hot");
        C2271391DvN.LIZ((View) this.LLJJJJJIL.getValue(), (C1A5L) C2271381DvM.LLILZLL.getValue());
        int iIntValue = ((Number) cp().LLILZ.getValue()).intValue();
        for (int i = 0; i < iIntValue; i++) {
            Context context = getContext();
            if (context != null) {
                C10LG c10lg = new C10LG(context);
                ((ViewGroup) this.LLJJJJJIL.getValue()).addView(c10lg);
                ((ArrayList) this.LLJJL).add(c10lg);
            }
        }
        PerformanceUserCardViewModel performanceUserCardViewModelCp = cp();
        performanceUserCardViewModelCp.getLogger().LIZ("BigCardViewModel", "get rec users for display");
        performanceUserCardViewModelCp.wQ2(((Number) performanceUserCardViewModelCp.LLILZ.getValue()).intValue(), 3, null);
        C736680Sv4.LJIIIIZZ(this, cp(), new C2217381BqS() { // from class: X.10LB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713290ugZ) obj).LLILZ;
            }
        }, null, AFwS315S0000000_28.get$arr$(27), 6);
    }
}
