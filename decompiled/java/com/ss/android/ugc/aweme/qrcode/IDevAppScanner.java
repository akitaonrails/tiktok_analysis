package com.ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* JADX INFO: loaded from: classes13.dex */
public interface IDevAppScanner extends IQRCodeScanner {
    void init(Context context, SurfaceHolder surfaceHolder);
}
