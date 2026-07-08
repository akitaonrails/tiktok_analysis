package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.album.IMCameraAlbumUpdateBridge;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_im_sdk_chat_ui_base_assems_input_camera_IIMCameraAlbumUpdateBridge_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_im_sdk_chat_ui_base_assems_input_camera_IIMCameraAlbumUpdateBridge_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_im_sdk_chat_ui_base_assems_input_camera_IIMCameraAlbumUpdateBridge_SPI_AAB_DELEGATE();
    public static final C01GW IMCameraAlbumUpdateBridgeinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(492));

    private final IMCameraAlbumUpdateBridge getIMCameraAlbumUpdateBridgeinstance() {
        return (IMCameraAlbumUpdateBridge) IMCameraAlbumUpdateBridgeinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IIMCameraAlbumUpdateBridge> getServices() {
        ArrayList<IIMCameraAlbumUpdateBridge> arrayList = new ArrayList<>();
        arrayList.add(getIMCameraAlbumUpdateBridgeinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IIMCameraAlbumUpdateBridge getService() {
        return getIMCameraAlbumUpdateBridgeinstance();
    }
}
