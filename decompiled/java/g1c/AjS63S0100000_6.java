package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C0HXD;
import X.C420710Geb;
import X.C434720H2w;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.qrcode.VisualSearchQRCodeScanAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class AjS63S0100000_6 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS63S0100000_6(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS63S0100000_6 ajS63S0100000_6, View view) {
        Function0<Unit> function0;
        if (view != null && (function0 = ((C420710Geb) ajS63S0100000_6.l0).LLILZ) != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$1(AjS63S0100000_6 ajS63S0100000_6, View view) {
        if (view != null) {
            VisualSearchQRCodeScanAssem visualSearchQRCodeScanAssem = (VisualSearchQRCodeScanAssem) ajS63S0100000_6.l0;
            if (visualSearchQRCodeScanAssem.LLJ.LIZIZ && visualSearchQRCodeScanAssem.LLJLLL != C0HXD.QR_SCAN) {
                if (Intrinsics.LJFF("click", "show")) {
                    if (!visualSearchQRCodeScanAssem.LLLFF) {
                        visualSearchQRCodeScanAssem.LLLFF = true;
                        visualSearchQRCodeScanAssem.op("search_visual_qr_code_icon", "click", String.valueOf(visualSearchQRCodeScanAssem.LLLF));
                    }
                } else {
                    visualSearchQRCodeScanAssem.op("search_visual_qr_code_icon", "click", String.valueOf(visualSearchQRCodeScanAssem.LLLF));
                }
                ((VisualSearchQRCodeScanAssem) ajS63S0100000_6.l0).Bp(C0HXD.QR_SCAN);
            }
        }
    }

    public static final void LIZ$2(AjS63S0100000_6 ajS63S0100000_6, View view) {
        if (view != null) {
            ((VisualSearchQRCodeScanAssem) ajS63S0100000_6.l0).Bp(C0HXD.TAKE_PHOTO);
        }
    }

    public static final void LIZ$3(AjS63S0100000_6 ajS63S0100000_6, View view) {
        AwS401S0200000_35 awS401S0200000_35;
        if (view != null && (awS401S0200000_35 = ((C434720H2w) ajS63S0100000_6.l0).LLILLJJLI) != null) {
            awS401S0200000_35.invoke(view);
        }
    }
}
