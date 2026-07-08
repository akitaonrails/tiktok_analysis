package com.bytedance.android.livesdk.game.chatroom.drawer.category.assem;

import X.C1558360qeg;
import X.C1558520qew;
import X.C2217381BqS;
import X.C497740JfY;
import X.C521610Kcx;
import X.C724240Sb0;
import X.C736680Sv4;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryViewModel;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixedDisplayAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategoryMixedDisplayAssem extends BaseGameCategoryAssem implements IMixedDisplayAbility {
    public final int LLJJIJIL = (int) C497740JfY.LIZIZ(10.0f);

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem, com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gmh;
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem
    public final void ip() {
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Iom
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478000Ioo) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 10), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Ion
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478000Ioo) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 11), 6);
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem
    public final void lp() {
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C521610Kcx(this, 1));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IMixedDisplayAbility.class, null, null);
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IMixedDisplayAbility.class, null);
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixedDisplayAbility
    public final void x2() {
        RecyclerView.LayoutManager layoutManager;
        GameDrawerCategoryViewModel gameDrawerCategoryViewModelHp = hp();
        RecyclerView recyclerView = this.LLJJIII;
        gameDrawerCategoryViewModelHp.LL = (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) ? null : layoutManager.onSaveInstanceState();
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem
    public final RecyclerView.LayoutManager kp(Context context) {
        return new LinearLayoutManager(context, 0, false);
    }
}
