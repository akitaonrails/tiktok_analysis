package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p0;

import X.C0RQI;
import X.C10EU;
import X.C1264070j01;
import X.C1618440sDa;
import X.C2189821An6;
import X.C337180DJs;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC706770Rnv;
import Y.ACListenerS48S0400000_11;
import android.view.View;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRelationLabelInfoComponent extends BaseCellSlotComponent<StoryRelationLabelInfoComponent> {
    public RelationLabelTextView LLJLLIL;
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 760));
    public String LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdx;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 759);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_relation_label_info", true, awS555S0100000_11);
    }

    public final void Ep(boolean z) {
        Object obj;
        C2189821An6 c2189821An6;
        if (z) {
            FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) this.LLJLLL.getValue();
            if (feedCollectionViewPagerAbility != null) {
                feedCollectionViewPagerAbility.Es0(C0RQI.LOOP_CURRENT_VIDEO);
                return;
            }
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj).baseFeedPageParams;
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null) {
            return;
        }
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
        String eventType = c2189821An6.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        C0RQI c0rqiLIZLLL = interfaceC706770RnvLJJIIJ.LIZLLL(eventType, c2189821An6.getFrom());
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility2 = (FeedCollectionViewPagerAbility) this.LLJLLL.getValue();
        if (feedCollectionViewPagerAbility2 == null) {
            return;
        }
        feedCollectionViewPagerAbility2.Es0(c0rqiLIZLLL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        RelationLabelTextView relationLabelTextView;
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.i9g);
        if (viewFindViewById instanceof RelationLabelTextView) {
            relationLabelTextView = (RelationLabelTextView) viewFindViewById;
        } else {
            relationLabelTextView = null;
        }
        this.LLJLLIL = relationLabelTextView;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return this.LLJLILLLLZIIL.LL;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        if (aweme != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && !Intrinsics.LJFF(author.getUid(), this.LLJZ)) {
            if (C10EU.LJIILJJIL(author)) {
                C337180DJs.LIZJ(this.LLJLLIL);
                RelationLabelTextView relationLabelTextView = this.LLJLLIL;
                if (relationLabelTextView != null) {
                    RelationLabelTextView.LJJJJL(relationLabelTextView, matchedFriendStruct, C1264070j01.LJIILL);
                }
                this.LLJZ = author.getUid();
            } else {
                C337180DJs.LIZ(this.LLJLLIL);
                this.LLJZ = null;
            }
            RelationLabelTextView relationLabelTextView2 = this.LLJLLIL;
            if (relationLabelTextView2 != null) {
                C786410Ut5.qa(relationLabelTextView2, new ACListenerS48S0400000_11(this, aweme, videoItemParams2, author, 1));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
