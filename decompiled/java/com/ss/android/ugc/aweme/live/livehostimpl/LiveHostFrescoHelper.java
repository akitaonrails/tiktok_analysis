package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC1327750kej;
import X.AbstractC447090Hg3;
import X.C1320160kSU;
import X.C1320250kSd;
import X.C1320750kTR;
import X.C1320930kTj;
import X.C1322200kVm;
import X.C1322480kWE;
import X.C1324840ka2;
import X.C1325200kac;
import X.C1325540kbA;
import X.C1325700kbQ;
import X.C1325710kbR;
import X.C1328130kfL;
import X.C1329310khF;
import X.C1329330khH;
import X.C1335920kru;
import X.C20441214yg;
import X.C2093608Ic;
import X.C822690WPb;
import X.EnumC1320950kTl;
import X.InterfaceC1320130kSR;
import X.InterfaceC1324680kZm;
import X.InterfaceC1325100kaS;
import X.InterfaceC177000m8;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.AnimFactoryConfig;
import com.bytedance.android.livesdk.livesetting.LiveFrescoCustomAnimFactorySetting;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class LiveHostFrescoHelper implements IHostFrescoHelper {
    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final boolean HQ1(ImageModel imageModel) {
        List urls;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            int size = urls.size();
            for (int i = 0; i < size; i++) {
                if (C1324840ka2.LJIIZILJ(UriProtector.parse((String) ListProtector.get(urls, i)))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void Xz(final String str) {
        if (!TextUtils.isEmpty(str)) {
            C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF = C1325200kac.LJI;
            if (c1329310khF != null) {
                c1329310khF.LJJIIZ(new InterfaceC1325100kaS() { // from class: X.0kWC
                    @Override // X.InterfaceC1325100kaS
                    public final boolean apply(Object obj) {
                        InterfaceC1324680kZm interfaceC1324680kZm = (InterfaceC1324680kZm) obj;
                        int iHashCode = 0;
                        if (interfaceC1324680kZm == null) {
                            return false;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("anim://");
                        String str2 = str;
                        if (str2 != null) {
                            iHashCode = str2.hashCode();
                        }
                        sbLIZ.append(iHashCode);
                        return interfaceC1324680kZm.LIZIZ(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                    }
                });
                return;
            }
            return;
        }
        C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF2 = C1325200kac.LJI;
        if (c1329310khF2 != null) {
            c1329310khF2.LJII();
        }
        C1325200kac.LJI = null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void my0(String str) {
        C1324840ka2.LJIJJ(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final String qh0(ImageModel imageModel) {
        List urls;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            int size = urls.size();
            for (int i = 0; i < size; i++) {
                if (C1324840ka2.LJIIZILJ(UriProtector.parse((String) ListProtector.get(urls, i)))) {
                    return C1324840ka2.LJIILL((String) ListProtector.get(urls, i));
                }
            }
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void xW1(ImageModel imageModel, final InterfaceC177000m8 interfaceC177000m8) {
        C1325710kbR[] c1325710kbRArr;
        AbstractC447090Hg3 abstractC447090Hg3 = new AbstractC447090Hg3() { // from class: X.0KcK
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
            }

            @Override // X.AbstractC447090Hg3
            public final void LJI(Bitmap bitmap) {
                interfaceC177000m8.LIZ(bitmap);
            }
        };
        if (imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : imageModel.getUrls()) {
                if (!C2093608Ic.LJ(str)) {
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                    try {
                        C1335920kru c1335920kru = new C1335920kru();
                        c1335920kru.LIZIZ++;
                        c1325700kbQLIZLLL.LJIIZILJ = c1335920kru;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    arrayList.add(c1325700kbQLIZLLL.LIZ());
                }
            }
            if (arrayList.size() != 0 && (c1325710kbRArr = (C1325710kbR[]) arrayList.toArray(new C1325710kbR[arrayList.size()])) != null && c1325710kbRArr.length != 0) {
                ArrayList arrayList2 = new ArrayList();
                for (C1325710kbR c1325710kbR : c1325710kbRArr) {
                    if (c1325710kbR != null) {
                        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                        EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
                        c1325540kbALIZ.getClass();
                        arrayList2.add(new C1320160kSU(c1325540kbALIZ, c1325710kbR, enumC1320950kTl));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    new C1320930kTj(new C1320750kTR(arrayList2)).LIZJ(abstractC447090Hg3, C822690WPb.LIZ());
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void V90(C1320250kSd c1320250kSd, Context context, String str, String str2) {
        AnimFactoryConfig config;
        if (c1320250kSd != null && context != null && (config = LiveFrescoCustomAnimFactorySetting.INSTANCE.getConfig(str, str2)) != null) {
            try {
                C1329330khH c1329330khH = (C1329330khH) C1328130kfL.LJIILIIL().LIZIZ(context);
                if (c1329330khH == null) {
                    return;
                }
                c1320250kSd.LJJIJIIJI = C1322480kWE.of((Object[]) new InterfaceC1320130kSR[]{new C1325200kac(context, c1329330khH, str2, config)});
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJI("LiveHostFrescoHelper", th);
            }
        }
    }
}
