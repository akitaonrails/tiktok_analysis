package com.bytedance.android.livesdk.game.chatroom.drawer.category.assem;

import X.C011Z;
import X.C01D1;
import X.C11NJ;
import X.C11RK;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20441214yg;
import X.C2217381BqS;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryViewModel;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixedDisplayAbility;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategoryMixedAssem extends UISlotAssem implements IMixCategoryAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public final List<View.OnClickListener> LLJJIII;
    public final C11NJ LLJJIJI;
    public final ACListenerS142S0100000_7 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameDrawerCategoryMixedAssem.class, "categoryViewModel", "getCategoryViewModel()Lcom/bytedance/android/livesdk/game/chatroom/drawer/category/GameDrawerCategoryViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GameDrawerCategoryMixedAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameDrawerCategoryViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 48), AFwS237S0000000_7.get$arr$(29), null, true);
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = new C11NJ();
        this.LLJJIJIIJIL = new ACListenerS142S0100000_7(this, 70);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gmg;
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility
    public final void k92() {
        try {
            ViewGroup viewGroup = (ViewGroup) LJJIJL().findViewById(R.id.iq4);
            if (viewGroup != null && viewGroup.getChildCount() >= 1) {
                C786410Ut5.LJJLIL(0, viewGroup);
            }
            C723850SaN.LIZLLL(this, new AwS586S0100000_7(this, 417));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GameDrawerCategoryMixedAssem", e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJIJI.LJ();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IMixCategoryAbility.class, null);
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility
    public final void x2() {
        IMixedDisplayAbility iMixedDisplayAbility = (IMixedDisplayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMixedDisplayAbility.class, null);
        if (iMixedDisplayAbility != null) {
            iMixedDisplayAbility.x2();
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        return new ContextThemeWrapper(context, C011Z.LIZ.LJ());
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility
    public final void Qz1(C11RK c11rk) {
        this.LLJJIJI.LIZ(c11rk.LJJLJLI(new AfS176S0100000_7(this, 209)));
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility
    public final void Vz0(View view) {
        Iterator<View.OnClickListener> it2 = this.LLJJIII.iterator();
        while (it2.hasNext()) {
            it2.next().onClick(view);
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility
    public final void mu0(ACListenerS142S0100000_7 aCListenerS142S0100000_7) {
        ((ArrayList) this.LLJJIII).add(aCListenerS142S0100000_7);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IMixCategoryAbility.class, null, null);
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 63));
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        ((GameDrawerCategoryViewModel) assemVMLazy.getValue()).vQ2(1);
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0Iol
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478000Ioo) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 9), 6);
        IDrawerCategoryFragmentAbility iDrawerCategoryFragmentAbility = (IDrawerCategoryFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IDrawerCategoryFragmentAbility.class, null);
        if (iDrawerCategoryFragmentAbility != null) {
            iDrawerCategoryFragmentAbility.Wq2();
        }
    }
}
