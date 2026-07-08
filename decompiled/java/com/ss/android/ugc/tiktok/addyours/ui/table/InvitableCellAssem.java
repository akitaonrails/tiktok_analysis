package com.ss.android.ugc.tiktok.addyours.ui.table;

import X.C019F;
import X.C03H5;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C317650Ccl;
import X.C330050Cwl;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ACListenerS139S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class InvitableCellAssem<T extends C03H5> extends ReusedUISlotAssem<T> implements InterfaceC712990Rxx<C317650Ccl> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InvitableCellAssem.class, "addYoursInviteFriendsViewModel", "getAddYoursInviteFriendsViewModel()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursInviteFriendsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InvitableCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursInviteFriendsViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 411), null, AFwS232S0000000_4.get$arr$(154));
        this.LLJL = new C1559260qg8(new C723590SZx(this, C330050Cwl.class, "InviteHierarchyData"), checkSupervisorPrepared());
    }

    public abstract void sp(boolean z);

    public abstract void tp();

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C786410Ut5.I7(new ACListenerS139S0100000_4(this, 61), view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLIL[0]), new C2217381BqS() { // from class: X.0Ddq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C330070Cwn) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 55), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: op, reason: merged with bridge method [inline-methods] */
    public void up(C317650Ccl c317650Ccl) {
        C736680Sv4.LJIJJ((AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLIL[0]), new AwS370S0200000_4((InvitableCellAssem) this, c317650Ccl, (C317650Ccl) 45));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C317650Ccl c317650Ccl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C317650Ccl c317650Ccl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    public final void up(C317650Ccl c317650Ccl, List<UserInvitee> list) {
        boolean z;
        Iterator<UserInvitee> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            UserInvitee next = it2.next();
            if (Intrinsics.LJFF(next.getUid(), c317650Ccl.LL.getUid())) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        sp(z);
    }
}
