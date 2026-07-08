package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C14E9;
import X.C19EG;
import X.C19F0;
import X.C580610Mpv;
import X.C781360Ukw;
import X.InterfaceC20622815ms;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.effectmanager.EffectManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface IHostCreativeTool extends C006A {
    void Aq1(Activity activity, C14E9 c14e9);

    void BJ0(C14E9 c14e9);

    void Gq2(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, String str13, C580610Mpv c580610Mpv);

    String Gr1(Long l);

    void K42();

    EffectManager LLJILJILJ();

    Object Nd1(Context context, String str);

    boolean UC0();

    boolean a72(Context context, String str);

    boolean cd(Context context);

    String getEPAccessKey();

    String getEPVersion();

    String getEffectSdkVersion();

    List<String> handleGalleryResult(Intent intent);

    void hideStickerView();

    boolean isGalleryModuleInitialized();

    boolean isShowStickerView();

    void lF(ArrayList arrayList, C781360Ukw c781360Ukw);

    InterfaceC20622815ms nc2(Activity activity);

    void needAbortCleanup();

    boolean ni();

    String q30(String str);

    void qh2(C19EG c19eg);

    void qk2(String str);

    void releaseGalleryModule();

    void resizePhoto(String str, String str2);

    void scanPhotoList();

    void selectFromGallery();

    void selectFromGalleryByLauncher(C19F0<Intent> c19f0);
}
