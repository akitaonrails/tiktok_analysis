package com.ss.android.ugc.tiktok;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.portrait.service.EditorTabAIPortraitServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_tiktok_IEditorTabAIPortraitService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_tiktok_IEditorTabAIPortraitService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_tiktok_IEditorTabAIPortraitService_SPI_AAB_DELEGATE();
    public static final C01GW EditorTabAIPortraitServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(750));
    public static final int $stable = 8;

    private final EditorTabAIPortraitServiceImpl getEditorTabAIPortraitServiceImplinstance() {
        return (EditorTabAIPortraitServiceImpl) EditorTabAIPortraitServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IEditorTabAIPortraitService> getServices() {
        ArrayList<IEditorTabAIPortraitService> arrayList = new ArrayList<>();
        arrayList.add(getEditorTabAIPortraitServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IEditorTabAIPortraitService getService() {
        return getEditorTabAIPortraitServiceImplinstance();
    }
}
