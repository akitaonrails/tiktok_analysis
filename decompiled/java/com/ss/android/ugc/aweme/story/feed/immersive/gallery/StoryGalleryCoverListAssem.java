package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C0S12;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C21648719nx;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.C727310Sfx;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC21682219tM;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AObserverS215S0100000_11;
import Y.ATListenerS445S0100000_11;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.story.feed.common.collection.viewmodel.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.immersive.ability.StoryViewerListHostAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryCoverListAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.aweme.story.feed.ui.gallery.StoryGalleryLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS109S0400000_11;
import kotlin.jvm.internal.AwS119S0101000_11;
import kotlin.jvm.internal.AwS242S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGalleryCoverListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(185));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 833));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 832));
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C630740Ooa LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryGalleryCoverListAssem.class, "galleryListVM", "getGalleryListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryGalleryListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(StoryGalleryCoverListAssem.class, "viewerListVM", "getViewerListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public StoryGalleryCoverListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryGalleryListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 830), AFwS243S0000000_11.get$arr$(449), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 831), AFwS243S0000000_11.get$arr$(450), null, true);
        this.LLJILLL = C628500Oky.LIZ(new AwS555S0100000_11(this, 834));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final StoryGalleryListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (StoryGalleryListViewModel) assemVMLazy.getValue();
    }

    public final StoryViewerListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Go().LLILLL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme awemeGv2;
        Aweme awemeFQ0;
        boolean zK22;
        String authorUid;
        String authorUid2;
        List listWQ2;
        super.onViewCreated(view);
        this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.ipj);
        StoryViewerListHostAbility storyViewerListHostAbility = (StoryViewerListHostAbility) this.LLJILLL.getValue();
        if (storyViewerListHostAbility != null) {
            awemeGv2 = storyViewerListHostAbility.gv2();
            awemeFQ0 = storyViewerListHostAbility.FQ0();
        } else {
            awemeGv2 = null;
            awemeFQ0 = null;
        }
        if (storyViewerListHostAbility != null) {
            zK22 = storyViewerListHostAbility.K22();
        } else {
            zK22 = false;
        }
        String str = "";
        if (zK22) {
            StoryGalleryListViewModel storyGalleryListViewModelGo = Go();
            if (awemeGv2 == null || (authorUid2 = AwemeExtKt.getAuthorUid(awemeGv2)) == null) {
                authorUid2 = "";
            }
            storyGalleryListViewModelGo.LLILZ = authorUid2;
            if (awemeGv2 == null) {
                listWQ2 = StoryGalleryListViewModel.wQ2(Collections.singletonList(C0S12.LIZ("")));
            } else {
                listWQ2 = StoryGalleryListViewModel.wQ2(C1697810uHb.LJIIJJI(awemeGv2, C0S12.LIZ("")));
            }
            storyGalleryListViewModelGo.setState(new AwS377S0200000_11(listWQ2, (List<C727310Sfx>) awemeGv2, (Aweme) 106));
        } else {
            StoryFeedViewModel storyFeedViewModel = (StoryFeedViewModel) this.LLJIJIL.getValue();
            if (storyFeedViewModel != null) {
                StoryGalleryListViewModel storyGalleryListViewModelGo2 = Go();
                if (awemeGv2 != null && (authorUid = AwemeExtKt.getAuthorUid(awemeGv2)) != null) {
                    str = authorUid;
                }
                storyGalleryListViewModelGo2.LLILZ = str;
                storyGalleryListViewModelGo2.LLILLL = storyFeedViewModel;
                storyFeedViewModel.yQ2("LOAD_USER_STORY_SUCCESS", new AObserverS215S0100000_11(storyGalleryListViewModelGo2, 28), false);
                storyFeedViewModel.yQ2("UPLOADING_USER_STORY_SUCCESS", new AObserverS215S0100000_11(storyGalleryListViewModelGo2, 29), false);
                storyFeedViewModel.yQ2("UPLOADING_USER_STORY_FAIL", new AObserverS215S0100000_11(storyGalleryListViewModelGo2, 30), false);
                storyGalleryListViewModelGo2.setState(new AwS109S0400000_11(awemeFQ0, storyFeedViewModel, storyGalleryListViewModelGo2, awemeGv2, 8));
            }
        }
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLIZLLLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(StoryGalleryCoverCell.class);
            ((List) ((StoryGalleryLayoutManager) this.LLJ.getValue()).LLILZ.getValue()).add(new InterfaceC21682219tM() { // from class: X.0Sg2
                @Override // X.InterfaceC21682219tM
                public final void LIZ(int i) {
                    if (i == 0) {
                        StoryGalleryCoverListAssem storyGalleryCoverListAssem = this.LIZ;
                        storyGalleryCoverListAssem.withStateSafe(storyGalleryCoverListAssem.Go(), new AwS590S0100000_11(this.LIZ, 424));
                    }
                }

                @Override // X.InterfaceC21682219tM
                public final void LJLJJI(int i) {
                    StoryGalleryListViewModel storyGalleryListViewModelGo3 = this.LIZ.Go();
                    storyGalleryListViewModelGo3.setState(new AwS119S0101000_11(storyGalleryListViewModelGo3, i, 6));
                }
            });
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            viewOnAttachStateChangeListenerC20604515jv.setOnTouchListener(new ATListenerS445S0100000_11(new GestureDetector(viewOnAttachStateChangeListenerC20604515jv.getContext(), new C21648719nx() { // from class: X.0Sg0
                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    if (viewOnAttachStateChangeListenerC20604515jv.findChildViewUnder(motionEvent.getX(), motionEvent.getY()) == null) {
                        this.Go().setState(new AwS242S0000000_11("click_empty", 3));
                        return true;
                    }
                    return super.onSingleTapUp(motionEvent);
                }
            }), 6));
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Sg6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C727300Sfw) obj).LL;
            }
        }, null, new AwS625S0100000_11(this, 61), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Sg4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C727300Sfw) obj).LLILLL;
            }
        }, null, new AwS447S0200000_11(this, storyViewerListHostAbility, 5), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Sg3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C727300Sfw) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 62), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0Sg5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C727300Sfw) obj).LLILZ;
            }
        }, null, new AwS625S0100000_11(this, 63), 6);
    }
}
