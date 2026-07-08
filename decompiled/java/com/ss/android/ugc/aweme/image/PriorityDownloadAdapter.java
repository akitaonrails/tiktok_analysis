package com.ss.android.ugc.aweme.image;

import X.C080U;
import X.C0X9S;
import X.InterfaceC1501130pAN;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC2177008fw;
import X.InterfaceC820680WHi;
import com.bytedance.retrofit2.mime.TypedInput;
import com.facebook.net.IDownloadImage;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class PriorityDownloadAdapter {
    public final I3rdPriorityDownloadImage LIZ;
    public final IDownloadImage LIZIZ;

    public PriorityDownloadAdapter(IDownloadImage iDownloadImage) {
        this.LIZIZ = iDownloadImage;
    }

    public PriorityDownloadAdapter(I3rdPriorityDownloadImage i3rdPriorityDownloadImage) {
        this.LIZ = i3rdPriorityDownloadImage;
    }

    public C0X9S<TypedInput> downloadFileForHigh(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj) {
        IDownloadImage iDownloadImage = this.LIZIZ;
        if (iDownloadImage != null) {
            return iDownloadImage.downloadFileForHigh(z, i, str, map, list, obj);
        }
        I3rdPriorityDownloadImage i3rdPriorityDownloadImage = this.LIZ;
        if (i3rdPriorityDownloadImage != null) {
            return i3rdPriorityDownloadImage.downloadFileForHigh(z, i, str, map, list, obj);
        }
        return null;
    }

    public C0X9S<TypedInput> downloadFileForImmediate(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj) {
        IDownloadImage iDownloadImage = this.LIZIZ;
        if (iDownloadImage != null) {
            return iDownloadImage.downloadFileForImmediate(z, i, str, map, list, obj);
        }
        I3rdPriorityDownloadImage i3rdPriorityDownloadImage = this.LIZ;
        if (i3rdPriorityDownloadImage != null) {
            return i3rdPriorityDownloadImage.downloadFileForImmediate(z, i, str, map, list, obj);
        }
        return null;
    }

    public C0X9S<TypedInput> downloadFileForLow(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj) {
        IDownloadImage iDownloadImage = this.LIZIZ;
        if (iDownloadImage != null) {
            return iDownloadImage.downloadFileForLow(z, i, str, map, list, obj);
        }
        I3rdPriorityDownloadImage i3rdPriorityDownloadImage = this.LIZ;
        if (i3rdPriorityDownloadImage != null) {
            return i3rdPriorityDownloadImage.downloadFileForLow(z, i, str, map, list, obj);
        }
        return null;
    }

    public C0X9S<TypedInput> downloadFileForNormal(@InterfaceC820680WHi boolean z, @InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC2174808fa List<C080U> list, @InterfaceC2177008fw Object obj) {
        IDownloadImage iDownloadImage = this.LIZIZ;
        if (iDownloadImage != null) {
            return iDownloadImage.downloadFileForNormal(z, i, str, map, list, obj);
        }
        I3rdPriorityDownloadImage i3rdPriorityDownloadImage = this.LIZ;
        if (i3rdPriorityDownloadImage != null) {
            return i3rdPriorityDownloadImage.downloadFileForNormal(z, i, str, map, list, obj);
        }
        return null;
    }
}
