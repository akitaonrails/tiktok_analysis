package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.left;

import X.C01GW;
import X.C05P0;
import X.C13BV;
import X.C1523605xq;
import X.C1612406Ta;
import X.C1674790tgT;
import X.C23250099c;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C724240Sb0;
import X.C786410Ut5;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.aweme.story.highlights.widget.StoryHighlightsCoverView;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryHighlightsCoverComponent extends BaseCellSlotComponent<StoryHighlightsCoverComponent> {
    public final C630740Ooa LLJLLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 783));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 780));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 779));
    public final C630740Ooa LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 782));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcl;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 781);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_highlights_cover", true, awS555S0100000_11);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner viewLifecycleOwner;
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner()) != null && (iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null)) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C1612406Ta(viewLifecycleOwner, iStoryHighlightsMyDataManager, this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        List<String> urlList;
        C05P0<C1674790tgT> uiState;
        Aweme awemeO81;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection;
        UrlModel urlModel;
        VideoItemParams videoItemParams2 = videoItemParams;
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLJZIJLIL.getValue();
        if (storyCollectionCellAbility == null || (awemeO81 = storyCollectionCellAbility.o81()) == null || (storyHighlightInfo = awemeO81.storyHighlightInfo) == null || (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) == null || (urlModel = storyHighlightCollection.collectionCoverUrl) == null || (urlList = urlModel.getUrlList()) == null) {
            urlList = C13BV.INSTANCE;
        }
        StoryHighlightsCoverView storyHighlightsCoverView = (StoryHighlightsCoverView) this.LLJZ.getValue();
        if (storyHighlightsCoverView != null && (uiState = storyHighlightsCoverView.getUiState()) != null) {
            uiState.setValue(new C1674790tgT(new C1523605xq(urlList), null, null, 0, 0, 0.0f, false, 0, 0.0f, 1022));
        }
        C786410Ut5.I7(new ACListenerS115S0200000_11(this, videoItemParams2, 0), LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
