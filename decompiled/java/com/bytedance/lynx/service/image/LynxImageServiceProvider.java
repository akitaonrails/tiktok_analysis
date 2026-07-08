package com.bytedance.lynx.service.image;

import X.AbstractC1313950kIT;
import X.C1289470jez;
import X.C1315700kLI;
import X.C1316560kMg;
import X.C1316660kMq;
import X.C1316670kMr;
import X.InterfaceC1316410kMR;
import X.InterfaceC1316540kMe;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.lynx.tasm.service.ILynxImageService;
import com.lynx.tasm.service.ILynxImageServiceExtension;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class LynxImageServiceProvider implements ILynxImageService, ILynxImageServiceExtension {
    @Override // com.lynx.tasm.service.ILynxImageService, com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ Class getServiceClass() {
        return C1316670kMr.LIZ(this);
    }

    @Override // com.lynx.tasm.service.IServiceProvider
    public final /* synthetic */ void onInitialize(Context context) {
        C1289470jez.LIZ(this, context);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public Object getImageSRPostProcessor() {
        C1316560kMg.LJFF().getClass();
        return C1316660kMq.LIZ();
    }

    @Override // com.lynx.tasm.service.ILynxImageServiceExtension
    public void onLynxEnvSetup() {
        C1316560kMg.LJFF().onLynxEnvSetup();
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public boolean canParseUrl(String str) {
        return C1316560kMg.LJFF().canParseUrl(str);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public int getImageOrigin(Object obj) {
        return C1316560kMg.LJFF().getImageOrigin(obj);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public boolean pauseAnimation(Drawable drawable) {
        return C1316560kMg.LJFF().pauseAnimation(drawable);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void releaseAnimDrawable(Drawable drawable) {
        C1316560kMg.LJFF().releaseAnimDrawable(drawable);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void releaseImage(C1315700kLI c1315700kLI) {
        C1316560kMg.LJFF().releaseImage(c1315700kLI);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public boolean resumeAnimation(Drawable drawable) {
        return C1316560kMg.LJFF().resumeAnimation(drawable);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setCustomImageDecoder(Object obj) {
        C1316560kMg.LJFF().setCustomImageDecoder(obj);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public boolean startAnimation(Drawable drawable) {
        return C1316560kMg.LJFF().startAnimation(drawable);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public boolean stopAnimation(Drawable drawable) {
        return C1316560kMg.LJFF().stopAnimation(drawable);
    }

    @Override // com.lynx.tasm.service.ILynxImageServiceExtension
    public AbstractC1313950kIT createBackgroundImageDrawable(Context context, String str) {
        return C1316560kMg.LJFF().createBackgroundImageDrawable(context, str);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void decodeImage(C1315700kLI c1315700kLI, InterfaceC1316540kMe interfaceC1316540kMe) {
        C1316560kMg.LJFF().decodeImage(c1315700kLI, interfaceC1316540kMe);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setCacheKeyUri(Object obj, Uri uri) {
        C1316560kMg.LJFF().setCacheKeyUri(obj, uri);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setImageCacheChoice(String str, Object obj) {
        C1316560kMg.LJFF().setImageCacheChoice(str, obj);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setImageDecodeRegion(Object obj, Rect rect) {
        C1316560kMg.LJFF().setImageDecodeRegion(obj, rect);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setImageSRSize(Object obj, View view) {
        C1316560kMg.LJFF().setImageSRSize(obj, view);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setSampleSize(Object obj, int i) {
        C1316560kMg.LJFF().setSampleSize(obj, i);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void prefetchImage(String str, Object obj, Map<String, Object> map) {
        C1316560kMg.LJFF().prefetchImage(str, obj, map, null);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setImageSRSize(Object obj, int i, int i2) {
        C1316560kMg.LJFF().setImageSRSize(obj, i, i2);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void fetchImage(C1315700kLI c1315700kLI, InterfaceC1316540kMe interfaceC1316540kMe, InterfaceC1316410kMR interfaceC1316410kMR, Context context) {
        C1316560kMg.LJFF().fetchImage(c1315700kLI, interfaceC1316540kMe, interfaceC1316410kMR, context);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void prefetchImage(String str, Object obj, Map<String, Object> map, InterfaceC1316540kMe interfaceC1316540kMe) {
        C1316560kMg.LJFF().prefetchImage(str, obj, map, interfaceC1316540kMe);
    }

    @Override // com.lynx.tasm.service.ILynxImageService
    public void setImagePlaceHolderHash(Object obj, Object obj2, Object obj3, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        C1316560kMg.LJFF().setImagePlaceHolderHash(obj, obj2, obj3, str, str2, i, i2, i3, i4, z);
    }
}
