package com.ss.android.ugc.aweme.im.service.story;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.serviceimpl.StoryStreakDMServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_service_story_IStoryStreakDMService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_service_story_IStoryStreakDMService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_service_story_IStoryStreakDMService_SPI_AAB_DELEGATE();
    public static final C01GW StoryStreakDMServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(540));

    private final StoryStreakDMServiceImpl getStoryStreakDMServiceImplinstance() {
        return (StoryStreakDMServiceImpl) StoryStreakDMServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IStoryStreakDMService> getServices() {
        ArrayList<IStoryStreakDMService> arrayList = new ArrayList<>();
        arrayList.add(getStoryStreakDMServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IStoryStreakDMService getService() {
        return getStoryStreakDMServiceImplinstance();
    }
}
