package com.lynx.tasm.service;

import X.C1315700kLI;
import X.InterfaceC1316410kMR;
import X.InterfaceC1316540kMe;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public interface ILynxImageService extends IServiceProvider {
    boolean canParseUrl(String str);

    void decodeImage(C1315700kLI c1315700kLI, InterfaceC1316540kMe interfaceC1316540kMe);

    void fetchImage(C1315700kLI c1315700kLI, InterfaceC1316540kMe interfaceC1316540kMe, InterfaceC1316410kMR interfaceC1316410kMR, Context context);

    int getImageOrigin(Object obj);

    Object getImageSRPostProcessor();

    @Override // com.lynx.tasm.service.IServiceProvider
    Class<? extends IServiceProvider> getServiceClass();

    boolean pauseAnimation(Drawable drawable);

    void prefetchImage(String str, Object obj, Map<String, Object> map);

    void prefetchImage(String str, Object obj, Map<String, Object> map, InterfaceC1316540kMe interfaceC1316540kMe);

    void releaseAnimDrawable(Drawable drawable);

    void releaseImage(C1315700kLI c1315700kLI);

    boolean resumeAnimation(Drawable drawable);

    void setCacheKeyUri(Object obj, Uri uri);

    void setCustomImageDecoder(Object obj);

    void setImageCacheChoice(String str, Object obj);

    void setImageDecodeRegion(Object obj, Rect rect);

    void setImagePlaceHolderHash(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3, int i4, boolean z);

    void setImageSRSize(Object obj, int i, int i2);

    void setImageSRSize(Object obj, View view);

    void setSampleSize(Object obj, int i);

    boolean startAnimation(Drawable drawable);

    boolean stopAnimation(Drawable drawable);
}
