package com.ss.ugc.android.editor.components.base.api;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic.VideoCropService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_ugc_android_editor_components_base_api_IVideoCropService_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_ugc_android_editor_components_base_api_IVideoCropService_SPI_AAB_DELEGATE INSTANCE = new com_ss_ugc_android_editor_components_base_api_IVideoCropService_SPI_AAB_DELEGATE();
    public static final C01GW VideoCropServiceinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(758));
    public static final int $stable = 8;

    private final VideoCropService getVideoCropServiceinstance() {
        return (VideoCropService) VideoCropServiceinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IVideoCropService> getServices() {
        ArrayList<IVideoCropService> arrayList = new ArrayList<>();
        arrayList.add(getVideoCropServiceinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IVideoCropService getService() {
        return getVideoCropServiceinstance();
    }
}
