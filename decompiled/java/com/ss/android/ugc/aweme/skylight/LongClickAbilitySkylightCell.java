package com.ss.android.ugc.aweme.skylight;

import X.C04TH;
import X.EnumC1605560rso;
import X.InterfaceC1891350zJl;
import X.ViewOnLongClickListenerC1620730sHH;
import Y.ARunnableS93S0200000_24;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public abstract class LongClickAbilitySkylightCell<T extends InterfaceC1891350zJl> extends PowerCell<T> implements ISkylightCellLongClickAbility {
    public final /* synthetic */ ISkylightCellLongClickAbility LL = C04TH.LIZ;

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final void D4(View view, User user, EnumC1605560rso enumC1605560rso, Map<String, String> map) {
        this.LL.D4(view, user, enumC1605560rso, map);
    }

    public abstract EnumC1605560rso I5();

    public abstract View L5();

    public abstract User N5();

    public abstract Map<String, String> P5();

    public abstract View R5();

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final void V4(View view, Map<String, String> map) {
        this.LL.V4(view, map);
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final boolean Y() {
        return this.LL.Y();
    }

    @Override // com.ss.android.ugc.aweme.skylight.ISkylightCellLongClickAbility
    public final void a2(View view) {
        this.LL.a2(view);
    }

    public final void S5() {
        if (Y()) {
            View viewR5 = R5();
            if (viewR5 != null) {
                a2(viewR5);
            }
            View viewL5 = L5();
            if (viewL5 != null) {
                HandlerHook.viewPostDelay(viewL5, new ARunnableS93S0200000_24(this, viewL5, 28), 100L);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
        if (Y()) {
            this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC1620730sHH(this, 1));
        }
    }
}
