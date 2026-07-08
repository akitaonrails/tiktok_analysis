package com.ss.android.ugc.aweme.story.note.panel;

import X.C0PEM;
import X.C1256560inu;
import X.C1387270mCj;
import X.C1399605dq;
import X.C1399905dt;
import X.C13LP;
import X.C1605650rsx;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C438350HGv;
import X.C628500Oky;
import X.C630740Ooa;
import X.C728090ShD;
import X.EnumC1615506Uf;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryNotePanelAuthorVM extends ViewModel implements StoryNoteStatusChangeCallback {
    public StoryNoteDataCollection LL;
    public String LLILLJJLI;
    public String LLILLL;
    public final C630740Ooa LLILZ = C628500Oky.LIZ(AFwS192S0000000_6.get$arr$(337));
    public final MutableLiveData<Integer> LLILZIL;
    public final MutableLiveData LLILZLL;
    public final MutableLiveData<Boolean> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<Unit> LLJIJIL;
    public final MutableLiveData LLJILJIL;

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNoteDelete() {
    }

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNotePublishStart(StoryNoteDataCollection storyNoteDataCollection) {
    }

    public StoryNotePanelAuthorVM() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLIZ = mutableLiveData2;
        this.LLIZLLLIL = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLJ = mutableLiveData3;
        this.LLJI = mutableLiveData3;
        MutableLiveData<Unit> mutableLiveData4 = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData4;
        this.LLJILJIL = mutableLiveData4;
    }

    public static void yQ2(Aweme aweme) {
        Story story;
        C1605650rsx.LIZIZ.LJIIJ(EnumC1615506Uf.STORY, AwemeExtKt.getAuthorUid(aweme), aweme.getAid(), AFwS236S0000000_6.get$arr$(8));
        Story story2 = aweme.getStory();
        if (story2 != null && !story2.viewed) {
            Story story3 = aweme.getStory();
            if (story3 != null && !story3.isFaked() && (story = aweme.getStory()) != null && !story.isPublishing()) {
                String aid = aweme.getAid();
                if (aid != null) {
                    Story story4 = aweme.getStory();
                    if (story4 != null) {
                        story4.setViewed(true);
                    }
                    C728090ShD.LIZ.LIZJ(AwemeExtKt.getAuthorUid(aweme), aid);
                    C1618440sDa.LIZIZ.LJJIIJ().LIZIZ(null, aid, AwemeExtKt.getAuthorUid(aweme));
                    String aid2 = aweme.getAid();
                    String str = "";
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    int awemeType = aweme.getAwemeType();
                    String requestId = aweme.getRequestId();
                    if (requestId != null) {
                        str = requestId;
                    }
                    C1387270mCj.LIZ(-1, awemeType, aweme, "", aid2, str);
                    return;
                }
                return;
            }
            Story story5 = aweme.getStory();
            if (story5 == null) {
                return;
            }
            story5.setViewed(true);
        }
    }

    public final void wQ2(Aweme aweme) {
        Integer numValueOf;
        Integer numValueOf2;
        Boolean boolValueOf;
        List<StoryNoteTextExtra> list;
        List<StoryNoteTextExtra> list2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLILLL);
        int i = 0;
        c2344009Gk.LIZJ(0, "has_gif");
        StoryNoteInfo storyNoteInfo = aweme.storyNoteInfo;
        String strLJJLIIIJ = null;
        if (storyNoteInfo != null) {
            numValueOf = Integer.valueOf(storyNoteInfo.subType);
        } else {
            numValueOf = null;
        }
        C1609930rzr.LJII(numValueOf, c2344009Gk);
        StoryNoteInfo storyNoteInfo2 = aweme.storyNoteInfo;
        if (storyNoteInfo2 != null) {
            numValueOf2 = Integer.valueOf(storyNoteInfo2.subType);
        } else {
            numValueOf2 = null;
        }
        C1609930rzr.LJIIIZ(numValueOf2, c2344009Gk);
        C1609930rzr.LJIJI(aweme, c2344009Gk);
        C1256560inu.LIZ.getClass();
        if (C1256560inu.LIZLLL(aweme)) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_avatar_thought");
        StoryNoteDataCollection storyNoteDataCollection = this.LL;
        if (storyNoteDataCollection != null && (list2 = storyNoteDataCollection.textExtras) != null) {
            boolValueOf = Boolean.valueOf(C438350HGv.LIZ(list2));
        } else {
            boolValueOf = null;
        }
        StoryNoteDataCollection storyNoteDataCollection2 = this.LL;
        if (storyNoteDataCollection2 != null && (list = storyNoteDataCollection2.textExtras) != null && !list.isEmpty()) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS236S0000000_6.get$arr$(10), 30);
        }
        C1609930rzr.LJIIL(strLJJLIIIJ, c2344009Gk, boolValueOf);
        C20684815ws.LJIILLIIL("note_creator_half_screen_show", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xQ2(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = this;
            X.09Gk r3 = new X.09Gk
            r3.<init>()
            java.lang.String r1 = "is_note"
            java.lang.String r0 = "1"
            r3.LJIIIIZZ(r1, r0)
            X.C1609930rzr.LJIIIIZZ(r5, r3)
            java.lang.String r1 = "story_type"
            java.lang.String r0 = "story"
            r3.LJIIIIZZ(r1, r0)
            java.lang.String r1 = r4.LLILLJJLI
            java.lang.String r0 = "enter_from"
            r3.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r5.storyNoteInfo
            r1 = 0
            if (r0 == 0) goto L63
            int r0 = r0.subType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L28:
            X.C1609930rzr.LJII(r0, r3)
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r5.storyNoteInfo
            if (r0 == 0) goto L35
            int r0 = r0.subType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L35:
            X.C1609930rzr.LJIIIZ(r1, r3)
            X.C1609930rzr.LJIJI(r5, r3)
            com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo r0 = r5.storyNoteInfo
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.feed.model.story.AvatarThoughtInfo r0 = r0.avatarInfo
            if (r0 == 0) goto L61
            java.lang.Integer r2 = r0.avatarType
            X.0mfW r0 = X.EnumC1405120mfW.GENERATED_AVATAR
            int r1 = r0.getValue()
            if (r2 == 0) goto L61
            int r0 = r2.intValue()
            if (r0 != r1) goto L61
            r1 = 1
        L54:
            java.lang.String r0 = "is_avatar_thought"
            r3.LIZJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "confirm_delete_video"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L61:
            r1 = 0
            goto L54
        L63:
            r0 = r1
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM.xQ2(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final Object vQ2(String str, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ != null) {
            return awemeLLILZ;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1399605dq(str, null));
    }

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNotePublishFinished(String str, StoryNoteDataCollection storyNoteDataCollection, Aweme aweme) {
        MutableLiveData<Boolean> mutableLiveData = this.LLIZ;
        Boolean bool = Boolean.TRUE;
        mutableLiveData.setValue(bool);
        this.LLJ.setValue(bool);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1399905dt(this, null), 3);
    }
}
