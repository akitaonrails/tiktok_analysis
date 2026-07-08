package com.ss.android.ugc.aweme.feed.landscape.cell.assem;

import X.C418440Gaw;
import X.C426750GoL;
import X.C692450REd;
import X.C692680RFa;
import X.C692760RFi;
import X.C723830SaL;
import X.C814420VxA;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeMenuContainerAssem extends FeedBaseContentAssem<LandscapeMenuContainerAssem> {
    public final C692680RFa LLJJJJ;
    public final BaseFeedPageParams LLJJJJJIL;
    public final Function0<Long> LLJJJJLIIL;
    public boolean LLJJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        synchronized (this) {
            if (!this.LLJJL) {
                C723830SaL.LIZ(this, null, new AwS377S0200000_11(this, view, 130));
                this.LLJJL = true;
            }
        }
        if ((!C692450REd.LIZ) && C692760RFi.LIZ) {
            C426750GoL.LJIIIZ(view.findViewById(R.id.uzs), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-12))), null, false, 25);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    public LandscapeMenuContainerAssem(C692680RFa c692680RFa, BaseFeedPageParams baseFeedPageParams, Function0<Long> function0) {
        this.LLJJJJ = c692680RFa;
        this.LLJJJJJIL = baseFeedPageParams;
        this.LLJJJJLIIL = function0;
    }
}
