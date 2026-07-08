package com.ss.android.ugc.aweme.publicgroup.view;

import X.C019F;
import X.C01GW;
import X.C1228470i4b;
import X.C1228780i56;
import X.C1228810i59;
import X.C1229270i5t;
import X.C1229760i6g;
import X.C1383370m6R;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import Y.ATListenerS452S0100000_19;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupAssemCell extends ReusedUISlotAssem<GroupAssemCell> implements InterfaceC712990Rxx<C1229760i6g> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C1228780i56.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public boolean LLLFF;
    public final AwS633S0100000_19 LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupAssemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/GroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupAssemCell() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupListViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1716), null, AFwS257S0000000_19.get$arr$(259));
        this.LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1709));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1711));
        this.LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1713));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1715));
        this.LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1714));
        this.LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1712));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1710));
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1707));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1708));
        this.LLLFFI = new AwS633S0100000_19(this, 72);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.civ;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1228780i56 op() {
        return (C1228780i56) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C197039127h sp() {
        return (C197039127h) this.LLJZIJLIL.getValue();
    }

    public final ConstraintLayout tp() {
        return (ConstraintLayout) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        ((IDMAvatarLoader) this.LLL.getValue()).LIZ();
    }

    public final GroupListViewModel up() {
        return (GroupListViewModel) this.LLJL.getValue(this, LLLFZ[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        C1228470i4b c1228470i4b;
        C1228810i59 c1228810i59;
        C1229270i5t c1229270i5t;
        C1228780i56 c1228780i56Op = op();
        if (c1228780i56Op != null && (c1228470i4b = c1228780i56Op.LL) != null && (c1228810i59 = c1228470i4b.LIZIZ) != null && (c1229270i5t = c1228810i59.LJIJJLI) != null) {
            i = c1229270i5t.LIZ;
        } else {
            i = 12;
        }
        tp().setPadding(16, i, 16, i);
        C1383370m6R.LJIILJJIL(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), tp());
        ((View) this.LLLF.getValue()).setOnTouchListener(new ATListenerS452S0100000_19(this.LLLFFI, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01da  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1229760i6g r26) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publicgroup.view.GroupAssemCell.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1229760i6g c1229760i6g) {
        return true;
    }

    public final void yp(TuxTextView tuxTextView) {
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.0i6m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1229630i6T) obj).LLILZIL);
            }
        }, null, new AwS633S0100000_19(tuxTextView, 73), 6);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1229760i6g c1229760i6g) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
