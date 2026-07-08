package defpackage;

import X.AbstractC1544900qIy;
import X.C13BV;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes17.dex */
public abstract class k0 extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "window.__autoFillCallback__(getClientContext())";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_ttop_autofill_callback";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_ttop_autofill_callback", "custom_manual", 4, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/ttop_autofill_callback.js", null, null, null, false, 448, null);
    }
}
