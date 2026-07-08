package com.ss.android.ugc.aweme.story.feed.common.sub.note;

import X.C0I08;
import X.C0LAB;
import X.C0RF0;
import X.C0RJN;
import X.C0RMW;
import X.C0S1J;
import X.C0S1K;
import X.C1389300mG0;
import X.C1578630rBN;
import X.C1609930rzr;
import X.C19EG;
import X.C20584815gk;
import X.C20684815ws;
import X.C2189821An6;
import X.C690870R8b;
import X.C713080Ry6;
import X.C713120RyA;
import X.C735840Sti;
import X.InterfaceC0148002o;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryNoteConsumptionViewModel;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryNoteConsumptionViewModel extends AssemViewModel<C713080Ry6> {
    public final C713120RyA LL = new C0I08() { // from class: X.0RyA
        @Override // X.C0I08
        public final void TG() {
            C1440005kM.LIZ(new C453940Hr6(true, false, 4));
        }

        @Override // X.C0I08
        public final void YO(C0I0E c0i0e, String str) {
            C1440005kM.LIZ(new C453940Hr6(false, false, 4));
            StoryNoteConsumptionViewModel storyNoteConsumptionViewModel = this.LL;
            if (str == null) {
                str = "";
            }
            storyNoteConsumptionViewModel.getClass();
            storyNoteConsumptionViewModel.setState(new AwS62S1000000_11(str, 4));
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C713080Ry6(0);
    }

    public static void vQ2(String str, String str2, C20584815gk c20584815gk) {
        Boolean boolValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("enter_method", "immersive_feed_bubble");
        String mentionUidsString = null;
        if (c20584815gk != null) {
            boolValueOf = Boolean.valueOf(c20584815gk.LJIJ());
            mentionUidsString = c20584815gk.getMentionUidsString();
        } else {
            boolValueOf = null;
        }
        C1609930rzr.LJIIL(mentionUidsString, c0lab, boolValueOf);
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }

    public static void wQ2(StoryNoteConsumptionViewModel storyNoteConsumptionViewModel, Aweme aweme, C690870R8b c690870R8b, String str) {
        Fragment fragment;
        Fragment fragment2;
        boolean z;
        Fragment fragment3;
        C19EG activity;
        View view;
        FragmentManager childFragmentManager;
        C2189821An6 c2189821An6;
        Fragment fragment4;
        Fragment fragment5;
        Fragment fragment6;
        C0RJN c0rjnLIZIZ;
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 != null && (fragment = c0rf0.LIZJ) != null && fragment.isAdded()) {
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            C735840Sti c735840Sti = C735840Sti.LIZ;
            User author = aweme.getAuthor();
            c735840Sti.getClass();
            String strValueOf = String.valueOf(C735840Sti.LJIIIIZZ(author));
            C0RMW c0rmw = C0RMW.LIZ;
            C0RF0 c0rf02 = c690870R8b.LIZLLL;
            String eventType = null;
            if (c0rf02 != null) {
                fragment2 = c0rf02.LIZJ;
            } else {
                fragment2 = null;
            }
            boolean zLJJIIJZLJL = c0rmw.LJJIIJZLJL(fragment2);
            C0RF0 c0rf03 = c690870R8b.LIZLLL;
            if (c0rf03 != null && (fragment6 = c0rf03.LIZJ) != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment6)) != null && C1389300mG0.LJII(c0rjnLIZIZ)) {
                z = true;
            } else {
                z = false;
            }
            QuickDMEventParam quickDMEventParam = new QuickDMEventParam(str, "feed", aid, authorUid, strValueOf, C0S1J.CLICK, "1", eventType, false, zLJJIIJZLJL, eventType, z, 6944);
            C0S1K c0s1k = C0S1K.LIZIZ;
            C0RF0 c0rf04 = c690870R8b.LIZLLL;
            if (c0rf04 != null && (fragment3 = c0rf04.LIZJ) != null && (activity = fragment3.getActivity()) != null) {
                C0RF0 c0rf05 = c690870R8b.LIZLLL;
                if (c0rf05 != null && (fragment5 = c0rf05.LIZJ) != null) {
                    view = fragment5.getView();
                } else {
                    view = null;
                }
                C0RF0 c0rf06 = c690870R8b.LIZLLL;
                if (c0rf06 != null && (fragment4 = c0rf06.LIZJ) != null) {
                    childFragmentManager = fragment4.getChildFragmentManager();
                } else {
                    childFragmentManager = null;
                }
                User author2 = aweme.getAuthor();
                BaseFeedPageParams baseFeedPageParams = c690870R8b.LJ;
                if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                    eventType = c2189821An6.getEventType();
                }
                c0s1k.LIZLLL(activity, view, childFragmentManager, quickDMEventParam, aweme, author2, eventType, str, storyNoteConsumptionViewModel.getState().LL, false, storyNoteConsumptionViewModel.LL, new AwS555S0100000_11(storyNoteConsumptionViewModel, 1356), null, null, null, null, false, false, false, null, null);
            }
        }
    }
}
