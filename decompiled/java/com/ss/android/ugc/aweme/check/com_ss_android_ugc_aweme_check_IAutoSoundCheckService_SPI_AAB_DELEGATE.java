package com.ss.android.ugc.aweme.check;

import X.AnonymousClass0206;
import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class com_ss_android_ugc_aweme_check_IAutoSoundCheckService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_check_IAutoSoundCheckService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_check_IAutoSoundCheckService_SPI_AAB_DELEGATE();
    public static final C01GW AutoSoundCheckServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AnonymousClass0206.get$arr$(158));
    public static final int $stable = 8;

    private final AutoSoundCheckService getAutoSoundCheckServiceinstance() {
        return (AutoSoundCheckService) AutoSoundCheckServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IAutoSoundCheckService> getServices() {
        ArrayList<IAutoSoundCheckService> arrayList = new ArrayList<>();
        arrayList.add(getAutoSoundCheckServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IAutoSoundCheckService getService() {
        return getAutoSoundCheckServiceinstance();
    }
}
