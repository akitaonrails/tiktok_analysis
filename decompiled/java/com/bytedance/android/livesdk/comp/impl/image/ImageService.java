package com.bytedance.android.livesdk.comp.impl.image;

import X.C0HWE;
import X.C0JBN;
import X.C0PEM;
import X.C1152410g5v;
import X.C1320920kTi;
import X.C1322490kWF;
import X.C1324610kZf;
import X.C1325540kbA;
import X.C1325710kbR;
import X.C1328130kfL;
import X.C1331090kk7;
import X.C13LQ;
import X.C23250099c;
import X.C817503Hh;
import X.C822700WPc;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ImageService implements IImageService {
    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final void cv() {
        C1331090kk7.LJIJJ = 0;
        C1320920kTi.LIZ = false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final C0JBN a40() {
        return new C1324610kZf();
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final boolean Ej1(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1328130kfL.LJIILIIL().LJIIL().LJIIJJI(UriProtector.parse(str));
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final void SP0(String str, final Function1<? super Boolean, Unit> function1) {
        if (!TextUtils.isEmpty(str)) {
            C1325540kbA c1325540kbALJIIL = C1328130kfL.LJIILIIL().LJIIL();
            Uri uri = UriProtector.parse(str);
            c1325540kbALJIIL.getClass();
            c1325540kbALJIIL.LJIILIIL(C1325710kbR.LIZ(uri)).LIZJ(new C0HWE<Boolean>() { // from class: X.0eVP
                @Override // X.C0HWE
                public final void LJ(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                }

                @Override // X.C0HWE
                public final void LJFF(InterfaceC1320200kSY<Boolean> interfaceC1320200kSY) {
                    boolean zBooleanValue;
                    Boolean result;
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        if (interfaceC1320200kSY != null && (result = interfaceC1320200kSY.getResult()) != null) {
                            zBooleanValue = result.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        function12.invoke(Boolean.valueOf(zBooleanValue));
                    }
                }
            }, C822700WPc.LL);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("biz_tag");
        String strOptString2 = jSONObject.optString("uri");
        if (C13LQ.LJIILLIIL(strOptString, (Object[]) C1152410g5v.LIZ.getValue())) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1322490kWF(jSONObject, strOptString, z, strOptString2, null), 2);
        }
    }
}
