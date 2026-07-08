package com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell;

import X.C1474810oTv;
import X.C1999807sS;
import X.C2015107uv;
import X.C2015707v1;
import X.InterfaceC0148002o;
import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.BaseCellSettingsVM;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackVM extends BaseCellSettingsVM<C2015107uv> {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1999807sS c1999807sS = new C1999807sS(this);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24 && C1474810oTv.LJJJJZI() && C2015707v1.LIZ() == 2 && !Keva.getRepo("keva_a11y_settings_unit").getBoolean("keva_has_show_a11y_hdr_switch", false)) {
            z = true;
        }
        return new C2015107uv(2131838808, c1999807sS, new AwS617S0100000_3(this, 68), z);
    }
}
