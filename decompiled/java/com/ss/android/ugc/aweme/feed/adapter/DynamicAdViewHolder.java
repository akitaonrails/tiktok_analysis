package com.ss.android.ugc.aweme.feed.adapter;

import X.C0Q6P;
import X.C0R9L;
import X.C0RD4;
import X.C0RF0;
import X.C0RHF;
import X.C581940Ms4;
import X.C583170Mu3;
import X.C622680Oba;
import X.C786410Ut5;
import X.InterfaceC582680MtG;
import X.InterfaceC689860R4e;
import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.component.cover.VideoCoverComponentTemp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class DynamicAdViewHolder extends VideoViewCell implements InterfaceC582680MtG {
    public final C0RHF T0;

    @Override // X.C0R86
    public final void LJII() {
        this.T0.LJII();
        InterfaceC689860R4e interfaceC689860R4e = this.LLLLZ;
        if (interfaceC689860R4e != null) {
            interfaceC689860R4e.LJLLL();
        }
        C0Q6P.LIZ.LIZ();
    }

    @Override // X.InterfaceC582680MtG
    public final boolean LJLL() {
        if (this.T0.isPlaying()) {
            LLLLLLLLLL();
            return false;
        }
        LJII();
        return true;
    }

    @Override // X.C0R86
    public final void LLLLLLLLLL() {
        this.T0.LLLLLLLLLL();
        C0Q6P.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLLLLLL() {
        super.LLLLLLLLL();
        this.LLZL.yQ2("ad_on_holder_resume", this, false);
        this.LLZL.yQ2("ad_on_fragment_pager_resume", this, false);
        this.LLZL.yQ2("ad_on_holder_pause", this, false);
        this.LLZL.yQ2("ad_on_fragment_pager_pause", this, false);
    }

    public DynamicAdViewHolder(C0RF0 c0rf0) {
        super(c0rf0);
        this.T0 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIII(this.LLLLII);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        C583170Mu3 c583170Mu3Ok;
        super.LJJIJIIJIL(i);
        C581940Ms4.LIZ = new WeakReference<>(this.T0);
        C622680Oba.LIZJ(this.T0);
        C0R9L c0r9l = this.c0;
        if (c0r9l != null && (c583170Mu3Ok = c0r9l.ok()) != null) {
            this.T0.LIZIZ(c583170Mu3Ok);
        }
        this.T0.LJII();
        this.T0.show();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LLLLILI(Aweme aweme) {
        super.LLLLILI(aweme);
        this.T0.LIZ(this.LLJJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0RDR
    public final void Qi1(Video video) {
        View viewVy1 = Vy1();
        if (viewVy1 != null) {
            C786410Ut5.LJLLLLLL(8, viewVy1);
        }
        VideoCoverComponentTemp videoCoverComponentTemp = this.LLJLLIL;
        if (videoCoverComponentTemp != null) {
            videoCoverComponentTemp.LLJILJIL = false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* JADX INFO: renamed from: b0 */
    public final void onChanged(C0RD4 c0rd4) {
        super.onChanged(c0rd4);
        if (c0rd4 == null) {
        }
        String str = c0rd4.LIZ;
        switch (str.hashCode()) {
            case -2066092964:
                if (!str.equals("ad_on_holder_resume")) {
                }
                LJII();
                break;
            case -895459340:
                if (!str.equals("ad_on_fragment_pager_resume")) {
                }
                LJII();
                break;
            case 347029479:
                if (!str.equals("ad_on_holder_pause")) {
                }
                LLLLLLLLLL();
                break;
            case 1493170511:
                if (!str.equals("ad_on_fragment_pager_pause")) {
                }
                LLLLLLLLLL();
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C0SZ8
    public final void h(boolean z) {
        C583170Mu3 c583170Mu3Ok;
        super.h(z);
        C581940Ms4.LIZ = null;
        C622680Oba.LIZLLL(this.T0);
        C0R9L c0r9l = this.c0;
        if (c0r9l != null && (c583170Mu3Ok = c0r9l.ok()) != null) {
            this.T0.LIZJ(c583170Mu3Ok);
        }
        this.T0.hs();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C0RD4) obj);
    }
}
