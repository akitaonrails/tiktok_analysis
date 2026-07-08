package com.ss.android.ugc.aweme.fangroup.assem;

import X.C019F;
import X.C01GW;
import X.C0ZBX;
import X.C1229980i72;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C859060Xmy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.fangroup.view.FanGroupCell;
import com.ss.android.ugc.aweme.fangroup.view.FanGroupCreateCell;
import com.ss.android.ugc.aweme.fangroup.view.FanGroupTitleCell;
import com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS668S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes15.dex */
public final class FanGroupListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 152));
    public final C1559260qg8 LLJJIII = new C1559260qg8(new C723590SZx(this, C1229980i72.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FanGroupListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/fangroup/viewmodel/FanGroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FanGroupListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FanGroupListViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 153), AFwS248S0000000_14.get$arr$(47), null, true);
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(77));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cj5;
    }

    public final C1229980i72 hp() {
        return (C1229980i72) this.LLJJIII.getValue();
    }

    public final FanGroupListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (FanGroupListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onFanGroupCreateFinish(C0ZBX c0zbx) {
        throw null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJI.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FanGroupCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FanGroupTitleCell.class);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FanGroupCreateCell.class);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext());
        linearLayoutManager.setOrientation(1);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.0ZBW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230950i8b) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0i8f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230950i8b) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS668S0100000_19(this, 56), 8);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLJJIJIL.getValue(), null, null, new C859060Xmy(this, null), 3);
    }
}
