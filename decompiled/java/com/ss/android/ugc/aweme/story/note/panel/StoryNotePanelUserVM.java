package com.ss.android.ugc.aweme.story.note.panel;

import X.C01GW;
import X.C0LAB;
import X.C0PEM;
import X.C1256560inu;
import X.C1399705dr;
import X.C13LP;
import X.C1609930rzr;
import X.C1618440sDa;
import X.C1E99;
import X.C20684815ws;
import X.C228000uM;
import X.C23250099c;
import X.C298610Bn9;
import X.C438350HGv;
import X.C452501pT;
import X.C735840Sti;
import X.InterfaceC1364105Vn;
import X.InterfaceC438300HGq;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryNotePanelUserVM extends ViewModel {
    public StoryNoteDataCollection LL;
    public String LLILLJJLI;
    public String LLILLL;
    public final List<String> LLILZ = new ArrayList();
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(338));
    public final InterfaceC438300HGq LLILZLL = C1618440sDa.LIZIZ.LJIILL();
    public final MutableLiveData<User> LLIZ;
    public final MutableLiveData LLIZLLLIL;
    public final MutableLiveData<Long> LLJ;
    public final MutableLiveData LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;
    public final MutableLiveData LLJILJIL;
    public final MutableLiveData<String> LLJILJILJ;
    public final MutableLiveData<Boolean> LLJILLL;
    public final MutableLiveData LLJJ;
    public final MediatorLiveData LLJJI;
    public final MediatorLiveData LLJJIII;
    public final MutableLiveData<List<String>> LLJJIJI;
    public final MutableLiveData LLJJIJIIJIL;
    public final MutableLiveData<Boolean> LLJJIJIL;
    public final MutableLiveData LLJJJ;
    public final MutableLiveData<String> LLJJJIL;
    public final MutableLiveData LLJJJJ;
    public final MutableLiveData<Unit> LLJJJJJIL;
    public final MutableLiveData LLJJJJLIIL;
    public final MutableLiveData<Unit> LLJJL;
    public final MutableLiveData LLJJLIIIJLLLLLLLZ;
    public final MutableLiveData<Boolean> LLJL;
    public final MutableLiveData LLJLIL;
    public final boolean LLJLILLLLZIIL;

    public final void vQ2() {
        MutableLiveData<Boolean> mutableLiveData = this.LLJIJIL;
        mutableLiveData.setValue(mutableLiveData.getValue() != null ? Boolean.valueOf(!r0.booleanValue()) : Boolean.TRUE);
    }

    public StoryNotePanelUserVM() {
        MutableLiveData<User> mutableLiveData = new MutableLiveData<>();
        this.LLIZ = mutableLiveData;
        this.LLIZLLLIL = mutableLiveData;
        MutableLiveData<Long> mutableLiveData2 = new MutableLiveData<>();
        this.LLJ = mutableLiveData2;
        this.LLJI = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.LLJIJIL = mutableLiveData3;
        this.LLJILJIL = mutableLiveData3;
        this.LLJILJILJ = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>(bool);
        this.LLJILLL = mutableLiveData4;
        this.LLJJ = mutableLiveData4;
        this.LLJJI = C228000uM.LIZLLL(mutableLiveData4, AFwS236S0000000_6.get$arr$(355));
        this.LLJJIII = C228000uM.LIZLLL(mutableLiveData4, AFwS236S0000000_6.get$arr$(356));
        MutableLiveData<List<String>> mutableLiveData5 = new MutableLiveData<>();
        this.LLJJIJI = mutableLiveData5;
        this.LLJJIJIIJIL = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>();
        this.LLJJIJIL = mutableLiveData6;
        this.LLJJJ = mutableLiveData6;
        MutableLiveData<String> mutableLiveData7 = new MutableLiveData<>();
        this.LLJJJIL = mutableLiveData7;
        this.LLJJJJ = mutableLiveData7;
        MutableLiveData<Unit> mutableLiveData8 = new MutableLiveData<>();
        this.LLJJJJJIL = mutableLiveData8;
        this.LLJJJJLIIL = mutableLiveData8;
        MutableLiveData<Unit> mutableLiveData9 = new MutableLiveData<>();
        this.LLJJL = mutableLiveData9;
        this.LLJJLIIIJLLLLLLLZ = mutableLiveData9;
        MutableLiveData<Boolean> mutableLiveData10 = new MutableLiveData<>(bool);
        this.LLJL = mutableLiveData10;
        this.LLJLIL = mutableLiveData10;
        this.LLJLILLLLZIIL = C298610Bn9.LIZ() && C1E99.LIZJ() && !((Boolean) C1E99.LJFF.getValue()).booleanValue();
    }

    public final void yQ2(Aweme aweme) {
        Integer numValueOf;
        Integer numValueOf2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("is_note", "1");
        c0lab.LJ("has_gif", CardStruct.IStatusCode.DEFAULT);
        c0lab.LIZ(this.LLJLILLLLZIIL ? 1 : 0, "if_show_quick_emojis");
        c0lab.LJ("enter_from", this.LLILLJJLI);
        c0lab.LJ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c0lab.LJ("from_group_id", aweme.getAid());
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme.getAuthor();
        c735840Sti.getClass();
        c0lab.LIZ(C735840Sti.LJIIIIZZ(author), "follow_status");
        c0lab.LJ("request_id", aweme.getRequestId());
        c0lab.LJ("story_type", "story");
        c0lab.LJ("enter_position", this.LLILLL);
        StoryNoteInfo storyNoteInfo = aweme.storyNoteInfo;
        Object objValueOf = null;
        if (storyNoteInfo != null) {
            numValueOf = Integer.valueOf(storyNoteInfo.subType);
        } else {
            numValueOf = null;
        }
        C1609930rzr.LJII(numValueOf, c0lab);
        StoryNoteInfo storyNoteInfo2 = aweme.storyNoteInfo;
        if (storyNoteInfo2 != null) {
            numValueOf2 = Integer.valueOf(storyNoteInfo2.subType);
        } else {
            numValueOf2 = null;
        }
        C1609930rzr.LJIIIZ(numValueOf2, c0lab);
        C1609930rzr.LJIJI(aweme, c0lab);
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            objValueOf = Integer.valueOf(author2.getFollowStatusRelation());
        }
        c0lab.LIZLLL(objValueOf, "follow_status_relation");
        C1256560inu.LIZ.getClass();
        c0lab.LIZ(C1256560inu.LIZLLL(aweme) ? 1 : 0, "is_avatar_thought");
        C20684815ws.LJIILLIIL("like", c0lab.LIZ);
    }

    public final Object wQ2(String str, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ != null) {
            return awemeLLILZ;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1399705dr(str, null));
    }

    public final void xQ2(Aweme aweme, List<String> list) {
        User author;
        Integer numValueOf;
        Integer numValueOf2;
        Boolean boolValueOf;
        List<StoryNoteTextExtra> list2;
        List<StoryNoteTextExtra> list3;
        StoryNoteInfo storyNoteInfo;
        StoryNoteInfo storyNoteInfo2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", this.LLILLJJLI);
        c0lab.LJ("enter_method", this.LLILLL);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String strLJJLIIIJ = null;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c0lab.LIZ(C735840Sti.LJIIIIZZ(author), "follow_status");
        int i = 0;
        c0lab.LIZ(0, "has_gif");
        c0lab.LIZ(this.LLJLILLLLZIIL ? 1 : 0, "if_show_quick_emojis");
        if (aweme != null && (storyNoteInfo2 = aweme.storyNoteInfo) != null) {
            numValueOf = Integer.valueOf(storyNoteInfo2.subType);
        } else {
            numValueOf = null;
        }
        C1609930rzr.LJII(numValueOf, c0lab);
        if (aweme != null && (storyNoteInfo = aweme.storyNoteInfo) != null) {
            numValueOf2 = Integer.valueOf(storyNoteInfo.subType);
        } else {
            numValueOf2 = null;
        }
        C1609930rzr.LJIIIZ(numValueOf2, c0lab);
        C1609930rzr.LJIJI(aweme, c0lab);
        C1609930rzr.LJIILIIL(c0lab, aweme, list);
        if (aweme != null) {
            C1256560inu.LIZ.getClass();
            if (C1256560inu.LIZLLL(aweme)) {
                i = 1;
            }
        }
        c0lab.LIZ(i, "is_avatar_thought");
        StoryNoteDataCollection storyNoteDataCollection = this.LL;
        if (storyNoteDataCollection != null && (list3 = storyNoteDataCollection.textExtras) != null) {
            boolValueOf = Boolean.valueOf(C438350HGv.LIZ(list3));
        } else {
            boolValueOf = null;
        }
        StoryNoteDataCollection storyNoteDataCollection2 = this.LL;
        if (storyNoteDataCollection2 != null && (list2 = storyNoteDataCollection2.textExtras) != null && !list2.isEmpty()) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS236S0000000_6.get$arr$(10), 30);
        }
        C1609930rzr.LJIIL(strLJJLIIIJ, c0lab, boolValueOf);
        C20684815ws.LJIILLIIL("note_half_screen_show", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8, int r9, kotlin.jvm.internal.AwS585S0100000_6 r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r11 instanceof X.C437140HCe
            if (r0 == 0) goto L2a
            r5 = r11
            X.0HCe r5 = (X.C437140HCe) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r2 = r5.LLILZIL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLIZ
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L30
            int r9 = r5.LLILZ
            kotlin.jvm.functions.Function1 r10 = r5.LLILLL
            java.lang.Object r8 = r5.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r5.LL
            goto L54
        L2a:
            X.0HCe r5 = new X.0HCe
            r5.<init>(r6, r11)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r2)
            X.1DFB r2 = X.C0PEM.LIZJ     // Catch: java.lang.Exception -> L93
            X.01Vv r1 = new X.01Vv     // Catch: java.lang.Exception -> L93
            r0 = 0
            r1.<init>(r9, r8, r0)     // Catch: java.lang.Exception -> L93
            r5.LL = r7     // Catch: java.lang.Exception -> L93
            r5.LLILLJJLI = r8     // Catch: java.lang.Exception -> L93
            r5.LLILLL = r10     // Catch: java.lang.Exception -> L93
            r5.LLILZ = r9     // Catch: java.lang.Exception -> L93
            r5.LLIZ = r3     // Catch: java.lang.Exception -> L93
            java.lang.Object r2 = X.C23250099c.LJI(r5, r2, r1)     // Catch: java.lang.Exception -> L93
            if (r2 != r4) goto L57
            return r4
        L54:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L93
        L57:
            X.0X52 r2 = (X.C0X52) r2     // Catch: java.lang.Exception -> L93
            boolean r0 = r2.LIZJ()     // Catch: java.lang.Exception -> L93
            if (r0 == 0) goto L74
            if (r7 == 0) goto L64
            r7.setUserDigg(r9)     // Catch: java.lang.Exception -> L93
        L64:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L93
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)     // Catch: java.lang.Exception -> L93
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0     // Catch: java.lang.Exception -> L93
            r0.yr(r9, r8)     // Catch: java.lang.Exception -> L93
            goto Lb5
        L74:
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r1 = r6.LLJJJJJIL     // Catch: java.lang.Exception -> L93
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L93
            r1.setValue(r0)     // Catch: java.lang.Exception -> L93
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = "Story Note digg fail "
            r1.append(r0)     // Catch: java.lang.Exception -> L93
            X.08fh r0 = r2.LIZ     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = r0.LJI     // Catch: java.lang.Exception -> L93
            r1.append(r0)     // Catch: java.lang.Exception -> L93
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L93
            r10.invoke(r0)     // Catch: java.lang.Exception -> L93
            goto Lb5
        L93:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r1 = r6.LLJJJJJIL
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.setValue(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Story Note digg fail: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r10.invoke(r0)
        Lb5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserVM.zQ2(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int, kotlin.jvm.internal.AwS585S0100000_6, X.05Vn):java.lang.Object");
    }
}
