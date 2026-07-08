package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01GW;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C2296808zG;
import X.C291001Au;
import X.C452501pT;
import X.C727100Sfc;
import X.C727300Sfw;
import X.C727310Sfx;
import X.C727320Sfy;
import X.C729220Sj2;
import X.C729510SjV;
import X.EnumC696090RSd;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGalleryListViewModel extends AssemViewModel<C727300Sfw> {
    public StoryFeedViewModel LLILLL;
    public UserStory LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 836));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(186));
    public String LLILZ = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C727300Sfw(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C2296808zG.LIZJ((InterfaceC497601wk) this.LL.getValue(), null);
    }

    public static List wQ2(List list) {
        EnumC696090RSd enumC696090RSdLJFF;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (C729510SjV.LJIJ(aweme)) {
                C729220Sj2 c729220Sj2 = C729220Sj2.LL;
                String scheduleId = AwemeBizExtKt.getScheduleId(aweme);
                if (scheduleId == null) {
                    scheduleId = "";
                }
                enumC696090RSdLJFF = c729220Sj2.LJFF(scheduleId);
            } else {
                enumC696090RSdLJFF = null;
            }
            arrayList.add(new C727310Sfx(aweme, enumC696090RSdLJFF));
        }
        return arrayList;
    }

    public final void vQ2(C727300Sfw c727300Sfw) {
        String authorUid;
        List<Aweme> stories;
        Aweme aweme;
        UserStory userStory = this.LLILZIL;
        if (userStory == null || (stories = userStory.getStories()) == null || (aweme = (Aweme) C13LP.LJJJLZIJ(0, stories)) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        StoryFeedViewModel storyFeedViewModel = this.LLILLL;
        if (storyFeedViewModel != null) {
            storyFeedViewModel.dR2(c727300Sfw.LLILLJJLI, authorUid, 5, authorUid);
            C727100Sfc c727100Sfc = storyFeedViewModel.LLJJIII;
            UserStory userStory2 = this.LLILZIL;
            Integer numValueOf = Integer.valueOf(c727300Sfw.LLILLJJLI);
            Aweme aweme2 = c727300Sfw.LLILLL;
            c727100Sfc.getClass();
            C727100Sfc.LIZIZ(authorUid, authorUid, userStory2, numValueOf, aweme2, true);
        }
    }

    public static C727300Sfw yQ2(StoryGalleryListViewModel storyGalleryListViewModel, C727300Sfw c727300Sfw) {
        List<Aweme> listNQ2;
        String str;
        StoryFeedViewModel storyFeedViewModel = storyGalleryListViewModel.LLILLL;
        if (storyFeedViewModel == null || (listNQ2 = storyFeedViewModel.NQ2((str = storyGalleryListViewModel.LLILZ), str, true)) == null) {
            listNQ2 = C13BV.INSTANCE;
        }
        return storyGalleryListViewModel.xQ2(c727300Sfw, listNQ2, c727300Sfw.LLILLJJLI, c727300Sfw.LLILZ);
    }

    public final C727300Sfw xQ2(C727300Sfw c727300Sfw, List<? extends Aweme> list, int i, C291001Au<Integer> c291001Au) {
        C291001Au<C727320Sfy> c291001Au2;
        List listWQ2 = wQ2(list);
        ArrayList arrayList = (ArrayList) listWQ2;
        int iMax = Math.max(0, Math.min(i, arrayList.size() - 1));
        Aweme aweme = (Aweme) C13LP.LJJJLZIJ(iMax, list);
        if (arrayList.isEmpty()) {
            c291001Au2 = new C291001Au<>(new C727320Sfy(0));
        } else {
            c291001Au2 = c727300Sfw.LLILZIL;
        }
        c727300Sfw.getClass();
        C727300Sfw c727300Sfw2 = new C727300Sfw(listWQ2, iMax, aweme, c291001Au, c291001Au2);
        vQ2(c727300Sfw2);
        return c727300Sfw2;
    }
}
