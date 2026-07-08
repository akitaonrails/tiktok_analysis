package com.ss.android.ugc.aweme.sticker;

import X.C19F0;
import X.InterfaceC1456340o08;
import X.InterfaceC1625290sOd;
import X.InterfaceC1637930sj1;
import android.app.Activity;
import android.content.Intent;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public interface IStickerViewService {
    String getEPAccessKey();

    String getEPVersion();

    String getEffectSdkVersion();

    List<String> handleGalleryResult(Intent intent);

    void hideStickerView();

    void initGalleryModule(Activity activity, InterfaceC1637930sj1 interfaceC1637930sj1);

    boolean isGalleryModuleInitialized();

    boolean isShowStickerView();

    void release();

    void releaseGalleryModule();

    void removeScanPhotoListListener(InterfaceC1637930sj1 interfaceC1637930sj1);

    void resizePhoto(String str, String str2);

    void scanPhotoList();

    void selectFromGallery();

    void selectFromGalleryByLauncher(C19F0<Intent> c19f0);

    void setPixelLoopStickerPresenterSupplier(InterfaceC1456340o08<InterfaceC1625290sOd> interfaceC1456340o08);
}
