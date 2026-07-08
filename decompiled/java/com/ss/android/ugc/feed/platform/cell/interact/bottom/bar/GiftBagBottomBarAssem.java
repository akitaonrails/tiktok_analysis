package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C0S4L;
import X.C786410Ut5;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class GiftBagBottomBarAssem extends BaseCellSlotComponent<GiftBagBottomBarAssem> {
    public ConstraintLayout LLJLLIL;
    public final IVideoGiftService LLJLLL = VideoGiftService.LJI();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b72;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (ConstraintLayout) view.findViewById(R.id.izt);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String string;
        Resources resources;
        VideoItemParams videoItemParams2 = videoItemParams;
        boolean zLIZ = C0S4L.LIZ(videoItemParams2.getAweme(), this.LLJLLL);
        ConstraintLayout constraintLayout = this.LLJLLIL;
        if (constraintLayout != null) {
            if (zLIZ) {
                C786410Ut5.LL(0, constraintLayout);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.izu);
                if (textView != null) {
                    Context context = constraintLayout.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        string = resources.getString(2131827839);
                    } else {
                        string = null;
                    }
                    textView.setText(string);
                }
                C786410Ut5.Y7(constraintLayout, new ACListenerS146S0100000_11(videoItemParams2, 86));
                return;
            }
            C786410Ut5.LL(8, constraintLayout);
        }
    }
}
