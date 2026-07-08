package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0RH1;
import X.C0RJN;
import X.C13LE;
import X.C2189821An6;
import X.C2217381BqS;
import X.C23250099c;
import X.C298520Bn0;
import X.C339190DRl;
import X.C434650H2p;
import X.C555520LqY;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryHighlightsOverlayComponent extends BaseCellSlotComponent<StoryHighlightsOverlayComponent> {
    public AnonymousClass0956 LLJLLIL;
    public final C630740Ooa LLJLLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 701));
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(383));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fcm;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    public final void Bp() {
        LifecycleOwner viewLifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        C786410Ut5.LJLLLLLL(0, getContentView());
        C786410Ut5.T4(getContentView(), 1.0f);
        AnonymousClass0956 anonymousClass0956 = this.LLJLLIL;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C434650H2p(this, null), 3);
        }
        this.LLJLLIL = anonymousClass0956LIZLLL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C2189821An6 c2189821An6;
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        if (Intrinsics.LJFF((c0rjnLIZIZ == null || (c2189821An6 = c0rjnLIZIZ.LIZJ) == null) ? null : c2189821An6.getFrom(), "STORY_ENTRANCE_INBOX_TOP_LIST")) {
            C298520Bn0.LIZ = false;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, getContentView());
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0RMM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJJ;
            }
        }, null, AFwS294S0000000_11.get$arr$(1), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C0RH1.LIZ(jm());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        String from;
        String strLIZIZ;
        StoryHighlightInfo storyHighlightInfo;
        StoryHighlightCollection storyHighlightCollection;
        C2189821An6 c2189821An6;
        TextView textView = (TextView) getContentView().findViewById(R.id.w99);
        C0RJN c0rjnLIZIZ = jm().LIZIZ();
        Aweme awemeO81 = null;
        if (c0rjnLIZIZ != null && (c2189821An6 = c0rjnLIZIZ.LIZJ) != null) {
            from = c2189821An6.getFrom();
        } else {
            from = null;
        }
        if (Intrinsics.LJFF(from, "STORY_ENTRANCE_INBOX_TOP_LIST")) {
            int screenWidth = ScreenUtils.getScreenWidth(getContentView().getContext());
            float fLIZ = C339190DRl.LIZ(200);
            float f = screenWidth;
            if (f > fLIZ) {
                float f2 = (f - fLIZ) / 2;
                if (textView != null) {
                    int i = (int) f2;
                    textView.setPadding(i, 0, i, 0);
                } else {
                    return;
                }
            } else if (textView == null) {
                return;
            }
            textView.setTextSize(30.0f);
            textView.setText(C555520LqY.LIZIZ(2131835505));
            return;
        }
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLJLLL.getValue();
        if (storyCollectionCellAbility != null) {
            awemeO81 = storyCollectionCellAbility.o81();
        }
        if (textView == null) {
            return;
        }
        textView.setPadding(0, 0, 0, 0);
        if (awemeO81 == null || (storyHighlightInfo = awemeO81.storyHighlightInfo) == null || (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) == null || (strLIZIZ = storyHighlightCollection.title) == null) {
            strLIZIZ = C555520LqY.LIZIZ(2131848988);
        }
        textView.setText(strLIZIZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
