package com.bytedance.android.livesdk.game.broadcast.mirror.widget;

import X.C0UQO;
import X.C1143680frq;
import X.C16F5;
import X.C19EH;
import X.C497740JfY;
import X.C520010KaN;
import X.C743540TEq;
import X.C744020TGm;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWirelessFragmentV2;
import com.bytedance.android.livesdk.livesetting.broadcast.GameCastRefactorEnableSetting;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCastWirelessWidget extends GameCastWidget {
    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget
    public final void z1() {
        C744020TGm.LJIIIZ(true);
        C743540TEq.LJJIII(System.currentTimeMillis() - C744020TGm.LJIIIZ, "other_casting", false);
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget
    public final void LIZIZ() {
        Bundle bundle = this.LLILLJJLI;
        C743540TEq.LJJIIZ(bundle != null ? bundle.getString("screen_cast_type_from") : null, true, false);
        super.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131841765));
        }
        C1143680frq.LIZLLL(this.LLILLL, "tiktok_live_game_demand_1", "ttlive_game_cast_wireless_ic.png");
        super.onLoad(objArr);
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget
    public final void x1(boolean z) {
        Context context;
        FragmentManager fragmentManagerLJIL;
        Fragment gameCastFragment;
        if (C0UQO.LIZ() && (context = this.context) != null && (fragmentManagerLJIL = C520010KaN.LJIL(context, false)) != null) {
            if (GameCastRefactorEnableSetting.INSTANCE.enable()) {
                Bundle bundle = this.LLILLJJLI;
                gameCastFragment = new GameCastWirelessFragmentV2();
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJIIZI(bundle2, bundle, "extra");
                gameCastFragment.setArguments(bundle2);
            } else {
                Bundle bundle3 = this.LLILLJJLI;
                gameCastFragment = new GameCastFragment();
                Bundle bundle4 = new Bundle();
                C786410Ut5.LJJIIZI(bundle4, bundle3, "extra");
                gameCastFragment.setArguments(bundle4);
            }
            Fragment fragmentLJJJJZ = fragmentManagerLJIL.LJJJJZ(this.LL);
            C19EH c19ehLJIIJ = fragmentManagerLJIL.LJIIJ();
            if (fragmentLJJJJZ != null) {
                c19ehLJIIJ.LJIILL(fragmentLJJJJZ);
            }
            c19ehLJIIJ.LIZIZ(this.LL, gameCastFragment);
            String string = null;
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
            if (z) {
                Bundle bundle5 = this.LLILLJJLI;
                if (bundle5 != null) {
                    string = bundle5.getString("screen_cast_type_from");
                }
                C743540TEq.LJJIIZ(string, true, true);
            }
        }
    }

    public GameCastWirelessWidget(int i, Bundle bundle) {
        super(i, bundle);
    }
}
