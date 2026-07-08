package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ocrcomponent;

import X.C1738410vL5;
import X.C1910340zoO;
import X.C19GT;
import X.C20340214iO;
import X.C21663519qL;
import X.C2186421Ahc;
import X.InterfaceC1850080yFC;
import X.InterfaceC1910380zoS;
import X.InterfaceC20340314iP;
import X.InterfaceC21663619qM;
import X.InterfaceC2186401Aha;
import X.InterfaceC2186411Ahb;
import X.InterfaceC2186471Ahh;
import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pipo.ocr.view.CardOcrActivity;
import com.bytedance.pipo.ocr.view.OcrResultFragment;
import com.bytedance.pipo.ocr.view.component.IOcrComponent;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class TuxComponentProvider implements IOcrComponent {
    public static final int $stable = 0;

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC1910380zoS getButton(Context context) {
        return new C1910340zoO(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC20340314iP getDialog(Context context) {
        return new C20340214iO(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC2186471Ahh getFormItem(Context context) {
        return new C1738410vL5(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC1850080yFC getLoadingHUD(final Context context) {
        return new InterfaceC1850080yFC(context) { // from class: X.0yFB
            public final Context LIZ;

            {
                this.LIZ = context;
            }

            @Override // X.InterfaceC1850080yFC
            public final C1390130mHL LIZ(String str) {
                C1390130mHL c1390130mHL = new C1390130mHL(this.LIZ, null, 6);
                c1390130mHL.setMessage(str);
                return c1390130mHL;
            }
        };
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC2186401Aha getSheet(Context context) {
        return new InterfaceC2186401Aha() { // from class: X.1AhZ
            public TuxSheet LIZ;

            @Override // X.InterfaceC2186401Aha
            public final void LLZLI() {
                TuxSheet tuxSheet = this.LIZ;
                if (tuxSheet != null) {
                    tuxSheet.dismiss();
                }
            }

            @Override // X.InterfaceC2186401Aha
            public final void LIZ(FragmentManager fragmentManager, OcrResultFragment ocrResultFragment, AwS577S0100000_33 awS577S0100000_33, AwS577S0100000_33 awS577S0100000_332) {
                TuxSheet tuxSheet = this.LIZ;
                if (tuxSheet != null) {
                    tuxSheet.dismiss();
                }
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJIJI = ocrResultFragment;
                tuxSheet2.LLJLL = true;
                tuxSheet2.LLJLILLLLZIIL = true;
                tuxSheet2.LL = new DialogInterfaceOnCancelListenerC2189601Amk(awS577S0100000_33, 2);
                tuxSheet2.LLILLJJLI = new DialogInterfaceOnDismissListenerC2189651Amp(awS577S0100000_332, 2);
                this.LIZ = tuxSheet2;
                tuxSheet2.show(fragmentManager, "OcrResult");
            }
        };
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC21663619qM getTextView(Context context) {
        return new C21663519qL(context);
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public InterfaceC2186411Ahb getToast(Context context) {
        return new InterfaceC2186411Ahb() { // from class: X.1AhY
            @Override // X.InterfaceC2186411Ahb
            public final void LIZ(String str, CardOcrActivity cardOcrActivity) {
                C1389890mGx c1389890mGx = new C1389890mGx(cardOcrActivity);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LIZLLL(3000L);
                c1389890mGx.LJIIJJI();
            }
        };
    }

    @Override // com.bytedance.pipo.ocr.view.component.IOcrComponent
    public C2186421Ahc setThemeAndGetColors(Activity activity) {
        if (C19GT.LLILLJJLI == 2) {
            activity.setTheme(R.style.z4);
        } else {
            activity.setTheme(R.style.z5);
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.bx, typedValue, true);
        TypedValue typedValue2 = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.a1h, typedValue2, true);
        TypedValue typedValue3 = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.nd, typedValue3, true);
        return new C2186421Ahc(typedValue.data, typedValue2.data, typedValue3.data);
    }
}
