package com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C05S1;
import X.C06US;
import X.C0LAB;
import X.C1220000hqw;
import X.C1383370m6R;
import X.C13LE;
import X.C20684815ws;
import X.C23250099c;
import X.C444920HcY;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C706480RnS;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C735840Sti;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS106S0200000_2;
import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.highlights.feed.SkylightStoryHighlightsFeedSharedVM;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsImmersiveSheetVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryHighlightsAnchorComponent extends BaseCellSlotComponent<StoryHighlightsAnchorComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 762));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 763));
    public final C736950SvV LLJZ;
    public final C630740Ooa LLJZIJLIL;
    public TuxTextView LLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fbn;
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
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 764);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_immersive_feed_highlights_anchor", true, awS555S0100000_11);
    }

    public StoryHighlightsAnchorComponent() {
        AFwS198S0000000_11 aFwS198S0000000_11 = AFwS198S0000000_11.get$arr$(179);
        this.LLJZ = new C736950SvV(C13LE.LIZ(SkylightStoryHighlightsFeedSharedVM.class), aFwS198S0000000_11, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS243S0000000_11.get$arr$(406), new AwS555S0100000_11((AbstractC738140SxQ) this, 765), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJZIJLIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 761));
    }

    public static SpannableString Ep() {
        String strLJIIJ = C1383370m6R.LJIIJ(2131848988);
        String strJ4 = C786410Ut5.j4(C1383370m6R.LJIIJ(2131848954), Arrays.copyOf(new Object[]{strLJIIJ}, 1));
        SpannableString spannableString = new SpannableString(strJ4);
        int iLJJJ = a0.LJJJ(strJ4, strLJIIJ, 0, false, 6);
        C786410Ut5.p2(spannableString, new C444920HcY(52, false), iLJJJ, strLJIIJ.length() + iLJJJ, 33);
        return spannableString;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner viewLifecycleOwner;
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner()) != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C05S1(viewLifecycleOwner, this, null), 3);
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
        User author;
        String uid;
        VideoItemParams videoItemParams2 = videoItemParams;
        TuxTextView tuxTextView = (TuxTextView) getContentView().findViewById(R.id.zph);
        this.LLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setText(Ep());
        }
        StoryHighlightsImmersiveSheetVM storyHighlightsImmersiveSheetVM = (StoryHighlightsImmersiveSheetVM) this.LLJLLL.getValue();
        if (storyHighlightsImmersiveSheetVM != null) {
            Aweme aweme = videoItemParams2.getAweme();
            String groupId = null;
            if (aweme != null) {
                author = aweme.getAuthor();
            } else {
                author = null;
            }
            Aweme aweme2 = videoItemParams2.getAweme();
            if (aweme2 != null) {
                groupId = aweme2.getGroupId();
            }
            if (!storyHighlightsImmersiveSheetVM.LLJLIL) {
                C06US c06us = C06US.LIZ;
                String str = storyHighlightsImmersiveSheetVM.LLJJJJJIL;
                if (author == null || (uid = author.getUid()) == null) {
                    uid = "";
                }
                C735840Sti.LIZ.getClass();
                int iLJIIIIZZ = C735840Sti.LJIIIIZZ(author);
                c06us.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("enter_from", str);
                c0lab.LJ("author_id", uid);
                c0lab.LIZ(iLJIIIIZZ, "follow_status");
                c0lab.LJ("group_id", groupId);
                C20684815ws.LJIILLIIL("ttsocial_story_highlight_enter_btn_show", c0lab.LIZ);
                storyHighlightsImmersiveSheetVM.LLJLIL = true;
            }
        }
        C786410Ut5.I7(new ACListenerS106S0200000_2(this, videoItemParams2, 21), getContentView());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return this.LLJLILLLLZIIL.LL;
    }
}
