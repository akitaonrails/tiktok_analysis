package com.ss.android.ugc.aweme.qrcode.presenter;

import X.InterfaceC1389750mGj;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: loaded from: classes29.dex */
public interface QrCodeScanService {
    void LIZ(String str, Activity activity, InterfaceC1389750mGj interfaceC1389750mGj);

    void LIZIZ();

    void LIZJ(Context context, String str, String str2);

    void LIZLLL();

    void LJ(Context context, String str);

    void LJFF(Context context, String str, String str2);

    void LJI(Context context, String str, String str2);

    void LJII(Context context, String str);

    boolean checkIsMinAppVersionNotSatisfied(Activity activity, String str, String str2);

    void downloadStickerHelper(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener);

    String getSecurityUrl(String str);
}
