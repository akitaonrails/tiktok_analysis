package com.ss.android.ugc.aweme.services.story.forward;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationCreateServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_services_story_forward_ICelebrationCreateService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_services_story_forward_ICelebrationCreateService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_services_story_forward_ICelebrationCreateService_SPI_AAB_DELEGATE();
    public static final C01GW CelebrationCreateServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(650));
    public static final int $stable = 8;

    private final CelebrationCreateServiceImpl getCelebrationCreateServiceImplinstance() {
        return (CelebrationCreateServiceImpl) CelebrationCreateServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ICelebrationCreateService> getServices() {
        ArrayList<ICelebrationCreateService> arrayList = new ArrayList<>();
        arrayList.add(getCelebrationCreateServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ICelebrationCreateService getService() {
        return getCelebrationCreateServiceImplinstance();
    }
}
