package com.ss.android.ugc.aweme.story.note.panel;

import X.C1251860igK;
import X.C1388190mED;
import X.C1390920mIc;
import X.C19EG;
import X.C628500Oky;
import X.C630740Ooa;
import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt;
import com.ss.android.ugc.aweme.profile.story.ProfileStoryNote;
import com.ss.android.ugc.aweme.story.note.IStoryNotePanelServiceV2;
import com.ss.android.ugc.aweme.story.note.IStoryThoughtMyDataManager;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS34S2100000_6;

/* JADX INFO: loaded from: classes20.dex */
public final class StoryNotePanelServiceImplV2 implements IStoryNotePanelServiceV2, StoryNoteStatusChangeCallback {
    public final C630740Ooa LL = C628500Oky.LIZ(AFwS207S0000000_19.get$arr$(324));

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNoteDelete() {
    }

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNotePublishFinished(String str, StoryNoteDataCollection storyNoteDataCollection, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback
    public final void onStoryNotePublishStart(StoryNoteDataCollection storyNoteDataCollection) {
    }

    public static void LIZLLL(Context context, Function1 function1) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJLILLLLZIIL = false;
        function1.invoke(c1390920mIc);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            tuxSheet2.show(c19egLIZIZ.getSupportFragmentManager(), "StoryNotePanelImplV2");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryNotePanelServiceV2
    public final void LIZIZ(Context context, Aweme aweme) {
        StoryNoteDataCollection storyNoteDataCollection = StoryNoteDataCollectionKt.toStoryNoteDataCollection(aweme);
        if (storyNoteDataCollection != null) {
            LIZLLL(context, new AwS34S2100000_6(storyNoteDataCollection, "notification_page", "top_cell_bubble", 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryNotePanelServiceV2
    public final void LIZJ(Context context, String str, String str2) {
        StoryNoteDataCollection storyNoteDataCollectionKO = ((IStoryThoughtMyDataManager) this.LL.getValue()).KO(true);
        if (storyNoteDataCollectionKO != null) {
            LIZLLL(context, new AwS34S2100000_6(storyNoteDataCollectionKO, str, str2, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.story.note.IStoryNotePanelServiceV2
    public final void LIZ(ProfileStoryNote profileStoryNote, String str, Context context, String str2) {
        LIZLLL(context, new AwS34S2100000_6(C1251860igK.LIZ(profileStoryNote, str), str2, "avatar_bubble", 1));
    }
}
