package com.ss.android.ugc.aweme.story.highlights.immersivesheet;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.C05S6;
import X.C06US;
import X.C095G;
import X.C09IC;
import X.C09IR;
import X.C0LAB;
import X.C1614506Tv;
import X.C1BNE;
import X.C1DEK;
import X.C20684815ws;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.EnumC1410705fd;
import X.EnumC2252401DDy;
import X.InterfaceC346201Wa;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightListForAwemeResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightsImmersiveSheetVM extends ViewModel {
    public final C2252321DDq LL = C1BNE.LIZ("");
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252331DDr LLILZLL;
    public final AnonymousClass0950 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public final C2252331DDr LLJI;
    public final AnonymousClass0950 LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final AnonymousClass0951 LLJILJILJ;
    public final C2252321DDq LLJILLL;
    public final AnonymousClass0951 LLJJ;
    public final C2252331DDr LLJJI;
    public final AnonymousClass0950 LLJJIII;
    public final C1DEK LLJJIJI;
    public final InterfaceC346201Wa<C1614506Tv> LLJJIJIIJIL;
    public final C2252331DDr LLJJIJIL;
    public final AnonymousClass0950 LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public Aweme LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;

    public StoryHighlightsImmersiveSheetVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new StoryHighlightListForAwemeResponse(null, null, 3, null));
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(EnumC1410705fd.NONE);
        this.LLILZ = c2252321DDqLIZ2;
        this.LLILZIL = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLILZLL = c2252331DDrLIZIZ;
        this.LLIZ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(null);
        this.LLIZLLLIL = c2252321DDqLIZ3;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ3);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJI = c2252331DDrLIZIZ2;
        this.LLJIJIL = C09IC.LIZ(c2252331DDrLIZIZ2);
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(null);
        this.LLJILJIL = c2252321DDqLIZ4;
        this.LLJILJILJ = C09IC.LIZIZ(c2252321DDqLIZ4);
        C2252321DDq c2252321DDqLIZ5 = C1BNE.LIZ(null);
        this.LLJILLL = c2252321DDqLIZ5;
        this.LLJJ = C09IC.LIZIZ(c2252321DDqLIZ5);
        C2252331DDr c2252331DDrLIZIZ3 = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJI = c2252331DDrLIZIZ3;
        this.LLJJIII = C09IC.LIZ(c2252331DDrLIZIZ3);
        C1DEK c1dekLIZ = C095G.LIZ(1, EnumC2252401DDy.DROP_OLDEST, 4);
        this.LLJJIJI = c1dekLIZ;
        this.LLJJIJIIJIL = C09IC.LJJIIJ(c1dekLIZ);
        C2252331DDr c2252331DDrLIZIZ4 = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJIJIL = c2252331DDrLIZIZ4;
        this.LLJJJ = C09IC.LIZ(c2252331DDrLIZIZ4);
        this.LLJJJJJIL = "";
        this.LLJJL = "";
    }

    public final void xQ2() {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C05S6(this, null), 3);
    }

    public final void vQ2(String str) {
        C06US c06us = C06US.LIZ;
        String str2 = this.LLJJJJJIL;
        String str3 = this.LLJJL;
        c06us.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("story_highlight_id", str3);
        c0lab.LJ("click_type", str);
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_create_popup_click", c0lab.LIZ);
    }

    public final void wQ2(String str, String str2, String str3) {
        C06US c06us = C06US.LIZ;
        String str4 = this.LLJJJJJIL;
        c06us.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str4);
        c0lab.LJ("story_highlight_id", str);
        c0lab.LJ("group_id", str2);
        c0lab.LJ("action_type", str3);
        C20684815ws.LJIILLIIL("ttsocial_story_highlight_modify_video_result", c0lab.LIZ);
    }
}
