package com.bytedance.android.livesdk.game.broadcast.mirror.widget;

import X.C0THC;
import X.C0UQO;
import X.C1143680frq;
import X.C16F5;
import X.C19EH;
import X.C497740JfY;
import X.C520010KaN;
import X.C743540TEq;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.livesetting.broadcast.GameCastRefactorEnableSetting;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCastWiredWidget extends GameCastWidget {
    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget
    public final void LIZIZ() {
        Bundle bundle = this.LLILLJJLI;
        C743540TEq.LJJIIZ(bundle != null ? bundle.getString("screen_cast_type_from") : null, false, false);
        super.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget
    public final void z1() {
        Context context = this.context;
        if (context == null) {
            return;
        }
        GameCast gameCast = GameCast.LIZ;
        if (!GameCast.LJI || GameCast.LJFF == null) {
            return;
        }
        GameCast.LJIJI(context, false);
        C743540TEq.LJJIII(System.currentTimeMillis() - GameCast.LJIIL, "other_casting", true);
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131841764));
        }
        C1143680frq.LIZLLL(this.LLILLL, "tiktok_live_game_demand_1", "ttlive_game_cast_wired_ic.png");
        super.onLoad(objArr);
    }

    @Override // com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWidget
    public final void x1(boolean z) {
        Context context;
        FragmentManager fragmentManagerLJIL;
        Fragment gameCastWiredFragment;
        if (C0UQO.LIZ() && (context = this.context) != null && (fragmentManagerLJIL = C520010KaN.LJIL(context, false)) != null) {
            if (GameCastRefactorEnableSetting.INSTANCE.enable()) {
                gameCastWiredFragment = new GameCastWiredFragmentV2();
            } else {
                boolean zLIZ = C0THC.LIZ(GameCastWiredWidget.class);
                gameCastWiredFragment = new GameCastWiredFragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_wired_cast_is_showing", zLIZ);
                gameCastWiredFragment.setArguments(bundle);
            }
            Fragment fragmentLJJJJZ = fragmentManagerLJIL.LJJJJZ(this.LL);
            C19EH c19ehLJIIJ = fragmentManagerLJIL.LJIIJ();
            if (fragmentLJJJJZ != null) {
                c19ehLJIIJ.LJIILL(fragmentLJJJJZ);
            }
            c19ehLJIIJ.LIZIZ(this.LL, gameCastWiredFragment);
            String string = null;
            c19ehLJIIJ.LJII(null);
            c19ehLJIIJ.LJIIJ();
            if (z) {
                Bundle bundle2 = this.LLILLJJLI;
                if (bundle2 != null) {
                    string = bundle2.getString("screen_cast_type_from");
                }
                C743540TEq.LJJIIZ(string, false, true);
            }
        }
    }

    public GameCastWiredWidget(int i, Bundle bundle) {
        super(i, bundle);
    }
}
