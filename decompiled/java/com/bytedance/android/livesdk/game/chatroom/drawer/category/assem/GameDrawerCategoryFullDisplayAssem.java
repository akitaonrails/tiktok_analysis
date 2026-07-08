package com.bytedance.android.livesdk.game.chatroom.drawer.category.assem;

import X.C2217381BqS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521590Kcv;
import X.C521610Kcx;
import X.C736680Sv4;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS621S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDrawerCategoryFullDisplayAssem extends BaseGameCategoryAssem {
    public final int LLJJIJIL = (int) C497740JfY.LIZIZ(6.0f);
    public final int LLJJJ = (int) C497740JfY.LIZIZ(18.0f);
    public final int LLJJJIL = (int) C497740JfY.LIZIZ(11.0f);

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem
    public final void ip() {
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Iot
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478000Ioo) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 7), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Ios
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C478000Ioo) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 8), 6);
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem
    public final void lp() {
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new C521610Kcx(this, 0));
        }
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem
    public final RecyclerView.LayoutManager kp(Context context) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        gridLayoutManager.LLIZ = new C521590Kcv(this, 1);
        return gridLayoutManager;
    }

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.assem.BaseGameCategoryAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView != null) {
            C500260Jjc.LJLJL(this.LLJJJIL, recyclerView);
        }
    }
}
