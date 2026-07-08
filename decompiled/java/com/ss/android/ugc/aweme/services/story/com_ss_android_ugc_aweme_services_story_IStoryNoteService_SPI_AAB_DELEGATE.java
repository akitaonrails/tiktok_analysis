package com.ss.android.ugc.aweme.services.story;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.lightening.storynote.StoryNoteService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_story_IStoryNoteService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_services_story_IStoryNoteService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_story_IStoryNoteService_SPI_AAB_DELEGATE();
    public static final C01GW StoryNoteServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(649));
    public static final int $stable = 8;

    private final StoryNoteService getStoryNoteServiceinstance() {
        return (StoryNoteService) StoryNoteServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IStoryNoteService> getServices() {
        ArrayList<IStoryNoteService> arrayList = new ArrayList<>();
        arrayList.add(getStoryNoteServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IStoryNoteService getService() {
        return getStoryNoteServiceinstance();
    }
}
