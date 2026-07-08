package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote;

import X.C1161920gLG;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class SubWaveEmotePageTitleBarAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.vym);
        C500260Jjc.LJLJLJ(liveIconView, true);
        C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.01ng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OnBackPressedDispatcher onBackPressedDispatcher;
                C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
                if (c19egLIZ != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.LJ();
                }
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Cg2()) {
            i = 2131839351;
        } else {
            i = 2131844383;
        }
        textView.setText(C497740JfY.LJIJI(i));
    }
}
