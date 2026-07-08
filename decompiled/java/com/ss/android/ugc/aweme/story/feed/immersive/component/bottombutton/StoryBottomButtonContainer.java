package com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton;

import X.C01GW;
import X.C0ROP;
import X.C452501pT;
import X.C694840RNi;
import X.C694940RNs;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryBottomButtonContainer extends CompeteContainer {
    public final C01GW LLJLL;

    public StoryBottomButtonContainer() {
        super(0);
        this.LLJLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(171));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_story_button_container";
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    public final C0ROP hp() {
        return (C0ROP) this.LLJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        return !C694840RNi.LIZJ(videoItemParams, jm());
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard.CompeteContainer
    public final void ip(C694940RNs c694940RNs) {
        Map<String, ViewGroup> map = c694940RNs.LIZJ;
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof ViewGroup)) {
            viewLJJIJL = null;
        }
        map.put("bottom_story_button_container", (ViewGroup) viewLJJIJL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
