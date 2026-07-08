package com.ss.android.ugc.aweme.search.detail.keyframe.ui;

import X.C01GW;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC436120H8g;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDetailKeyframeAnchorTrigger extends BaseCellTriggerComponent<SearchDetailKeyframeAnchorTrigger> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(181));
    public List<SearchKeyFramePoint> LLJL;
    public EnumC436120H8g LLJLIL;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(SearchDetailKeyframeAnchorAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams)) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0233 A[PHI: r0
      0x0233: PHI (r0v71 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v70 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v92 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:112:0x020a, B:119:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:158:0x0044->B:21:0x0044 BREAK  A[LOOP:0: B:71:0x0129->B:163:0x0129]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df A[PHI: r0
      0x00df: PHI (r0v19 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v18 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v115 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:47:0x00b6, B:54:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b A[PHI: r0
      0x018b: PHI (r0v34 com.ss.android.ugc.aweme.feed.model.Aweme) = (r0v33 com.ss.android.ugc.aweme.feed.model.Aweme), (r0v55 com.ss.android.ugc.aweme.feed.model.Aweme) binds: [B:79:0x0162, B:86:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r10) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyframeAnchorTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }
}
