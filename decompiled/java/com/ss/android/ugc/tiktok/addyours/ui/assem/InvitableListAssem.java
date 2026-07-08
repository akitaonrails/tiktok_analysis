package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C317650Ccl;
import X.C339190DRl;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.tiktok.addyours.ui.table.InvitableCell;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public abstract class InvitableListAssem<T extends AssemListViewModel<?, C317650Ccl, ?>> extends UIListContentAssem<T> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InvitableListAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/tiktok/addyours/ui/vm/AddYoursInviteFriendsViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InvitableListAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursInviteFriendsViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 394), AFwS232S0000000_4.get$arr$(149), null, true);
    }

    public C1722300uv6 No() {
        return null;
    }

    public abstract String Oo();

    public abstract boolean So();

    public C1749280vcc Vo() {
        return null;
    }

    public abstract boolean Zo();

    public abstract boolean ap();

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 4;
        c20603715jn.LJIIIZ = Oo();
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final void LJ() {
        if (Go().getVisibility() == 0) {
            C1749280vcc c1749280vccVo = Vo();
            if (c1749280vccVo != null) {
                C339190DRl.LIZLLL(c1749280vccVo);
            }
            C1749280vcc c1749280vccVo2 = Vo();
            if (c1749280vccVo2 != null) {
                c1749280vccVo2.LJ();
            }
        }
    }

    public final void Lo() {
        if (ap()) {
            C1722300uv6 c1722300uv6No = No();
            if (c1722300uv6No != null && Zo()) {
                if (Go().getVisibility() == 0) {
                    C1749280vcc c1749280vccVo = Vo();
                    if (c1749280vccVo != null) {
                        C339190DRl.LIZLLL(c1749280vccVo);
                    }
                    C1749280vcc c1749280vccVo2 = Vo();
                    if (c1749280vccVo2 != null) {
                        c1749280vccVo2.setStatus(c1722300uv6No);
                    }
                }
                if (Unit.LIZ != null) {
                    return;
                }
            }
            C1749280vcc c1749280vccVo3 = Vo();
            if (c1749280vccVo3 != null) {
                C339190DRl.LIZIZ(c1749280vccVo3);
            }
        }
    }

    public final void bp(Function0<Unit> function0) {
        String string;
        Resources resources;
        String string2;
        Resources resources2;
        if (Go().getVisibility() == 0) {
            C1749280vcc c1749280vccVo = Vo();
            if (c1749280vccVo != null) {
                C339190DRl.LIZLLL(c1749280vccVo);
            }
            C1749280vcc c1749280vccVo2 = Vo();
            if (c1749280vccVo2 != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                Context context = getContext();
                String str = "";
                if (context == null || (resources2 = context.getResources()) == null || (string = resources2.getString(2131829437)) == null) {
                    string = "";
                }
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null && (string2 = resources.getString(R.string.jb4)) != null) {
                    str = string2;
                }
                AwS405S0200000_4 awS405S0200000_4 = new AwS405S0200000_4(this, function0, (Function0<Unit>) 29);
                Double dValueOf = Double.valueOf(72.0d);
                C1893080zMY.LIZJ(c1722300uv6, string, str, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), R.raw.icon_large_refresh, awS405S0200000_4);
                c1749280vccVo2.setStatus(c1722300uv6);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(InvitableCell.class);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DLA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C330070Cwn) obj).LLILLL;
            }
        }, null, new AwS618S0100000_4(this, 52), 6);
    }
}
