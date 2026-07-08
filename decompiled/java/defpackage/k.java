package defpackage;

import X.AbstractC1544900qIy;
import X.C13BV;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import java.util.Collections;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public abstract class k extends AbstractC1544900qIy {
    @Override // X.AbstractC1544900qIy, X.InterfaceC1544830qIr
    public final String LJ() {
        return "return document.URL";
    }

    @Override // X.AbstractC1544900qIy
    public final String LJI() {
        return "_jsmanage_infra_document_url";
    }

    @Override // X.InterfaceC1544830qIr
    public final JSInjectConfig LIZ() {
        return new JSInjectConfig("_jsmanage_infra_document_url", "custom_manual", 3, Collections.singletonList(e3.d), C13BV.INSTANCE, "https://lf16-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/tt/webview/js_manage/tiktok_webview_js_inject_manage/assets/js/infra_document_url.js", null, null, null, true, 448, null);
    }
}
