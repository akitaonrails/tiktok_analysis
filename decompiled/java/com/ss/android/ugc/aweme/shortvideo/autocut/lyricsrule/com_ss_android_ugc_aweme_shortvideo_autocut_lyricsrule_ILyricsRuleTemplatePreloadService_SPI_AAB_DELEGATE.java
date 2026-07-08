package com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class com_ss_android_ugc_aweme_shortvideo_autocut_lyricsrule_ILyricsRuleTemplatePreloadService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_shortvideo_autocut_lyricsrule_ILyricsRuleTemplatePreloadService_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_shortvideo_autocut_lyricsrule_ILyricsRuleTemplatePreloadService_SPI_AAB_DELEGATE();
    public static final C01GW LyricsRuleTemplatePreloadServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS210S0000000_22.get$arr$(122));
    public static final int $stable = 8;

    private final LyricsRuleTemplatePreloadServiceImpl getLyricsRuleTemplatePreloadServiceImplinstance() {
        return (LyricsRuleTemplatePreloadServiceImpl) LyricsRuleTemplatePreloadServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<ILyricsRuleTemplatePreloadService> getServices() {
        ArrayList<ILyricsRuleTemplatePreloadService> arrayList = new ArrayList<>();
        arrayList.add(getLyricsRuleTemplatePreloadServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ILyricsRuleTemplatePreloadService getService() {
        return getLyricsRuleTemplatePreloadServiceImplinstance();
    }
}
