package com.ss.android.ugc.aweme.utils;

import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.assem.PromptsHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_utils_IPromptsHelper_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_utils_IPromptsHelper_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_utils_IPromptsHelper_SPI_AAB_DELEGATE();

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IPromptsHelper getService() {
        return new PromptsHelper();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IPromptsHelper> getServices() {
        ArrayList<IPromptsHelper> arrayList = new ArrayList<>();
        arrayList.add(new PromptsHelper());
        return arrayList;
    }
}
