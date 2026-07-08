package com.ss.android.ugc.aweme.feed.collection.sub.video.viewholder;

import X.C01GW;
import X.C03H5;
import X.C0RF0;
import X.C1480420ocy;
import X.C1482250ofv;
import X.C1554610qYd;
import X.C337180DJs;
import X.C452501pT;
import X.C584270Mvp;
import X.C690870R8b;
import X.C691440RAg;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.StorySubCellConfigurationProtocol;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class VideoViewHolderInCollection extends BasePostViewCell {
    public final C0RF0 LLLLII;
    public final C01GW LLLLIIIILLL;
    public final C01GW LLLLIIL;

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility
    public final int Yf2() {
        return 3;
    }

    @Override // X.C0RGJ
    public final String gq() {
        return "cell_feed";
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell
    public boolean LLLLJI() {
        return ((Boolean) this.LLLLIIL.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, X.C0SZ8
    public final C584270Mvp LLLLLJIL() {
        return new C584270Mvp(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public final void LLLL(Aweme aweme) {
        this.LLJJIJIIJIL = aweme;
        if (aweme != null && (AwemeBizExtKt.isFriendsTabV2FakeAweme(aweme) || AwemeBizExtKt.isStoryFakeAweme(aweme))) {
            C337180DJs.LIZJ((View) this.LLLLIIIILLL.getValue());
        } else {
            C337180DJs.LIZ((View) this.LLLLIIIILLL.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public List<CellConfigurationProtocol<C690870R8b, BaseCellContentComponent<? extends C03H5>>> LLLLIILLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return C1554610qYd.LIZIZ(interfaceC665370Q7z, StorySubCellConfigurationProtocol.class, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        String sourceId;
        super.onRenderFirstFrame(c1480420ocy);
        try {
            Aweme aweme = this.LLJJIJIIJIL;
            if (aweme != null) {
                IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
                VideoUrlModel playAddr = null;
                if (c1480420ocy != null) {
                    sourceId = c1480420ocy.getSourceId();
                } else {
                    sourceId = null;
                }
                Video video = aweme.getVideo();
                if (video != null) {
                    playAddr = video.getPlayAddr();
                }
                C1482250ofv.LIZ(playAddr, sourceId);
                iFeedDebugService.LJJIJIL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public VideoViewHolderInCollection(C0RF0 c0rf0, C691440RAg c691440RAg) {
        super(c0rf0, c691440RAg);
        this.LLLLII = c0rf0;
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1523));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1522));
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell, com.ss.android.ugc.aweme.feed.collection.sub.BaseSubViewHolder
    public /* bridge */ /* synthetic */ VideoItemParams LLLIILIL(Aweme aweme, boolean z) {
        return LLLIILIL(aweme, z);
    }
}
