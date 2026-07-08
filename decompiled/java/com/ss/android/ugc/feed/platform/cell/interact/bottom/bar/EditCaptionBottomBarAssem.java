package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C698140Ra0;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import Y.ACListenerS113S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class EditCaptionBottomBarAssem extends BaseCellSlotComponent<EditCaptionBottomBarAssem> {
    public ViewGroup LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b69;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gop);
        this.LLJLLIL = viewGroup;
        if (viewGroup != null) {
            setComponentClickStatusExperimental(viewGroup, EnumC700430Rdh.POSITIVE);
        }
        view.findViewById(R.id.got);
        view.findViewById(R.id.goq);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C786410Ut5.I7(new ACListenerS113S0200000_9(this, videoItemParams2, 51), getContentView().findViewById(R.id.goq));
        Bp(videoItemParams2.getAweme(), C698140Ra0.LIZ(videoItemParams2.getAweme()));
    }

    public final void Bp(Aweme aweme, boolean z) {
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            if (z) {
                C786410Ut5.LJLZ(0, viewGroup);
                ((ICaptionKevaService) ServiceManager.get().getService(ICaptionKevaService.class)).LJLJL(aweme.getAid());
            } else {
                C786410Ut5.LJLZ(8, viewGroup);
            }
        }
    }
}
