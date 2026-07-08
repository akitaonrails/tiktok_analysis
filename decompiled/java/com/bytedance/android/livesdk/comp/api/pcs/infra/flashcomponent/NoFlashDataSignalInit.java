package com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent;

import X.AnonymousClass0206;
import X.C13LP;
import X.C1548820qPI;
import X.C1871910yoP;
import X.C262100zr;
import X.InterfaceC1107590evd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class NoFlashDataSignalInit extends FlashDataProvider {
    public static final /* synthetic */ int LLILZIL = 0;

    @Override // com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    static {
        NoFlashDataSignalInit noFlashDataSignalInit = new NoFlashDataSignalInit();
        ((ArrayList) FlashDataProvider.LLILZ).add(noFlashDataSignalInit.LL);
        C1548820qPI.LIZLLL("fetch_flash_component_data", noFlashDataSignalInit);
    }

    public NoFlashDataSignalInit() {
        super("", AnonymousClass0206.get$arr$(67));
    }

    @Override // com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.FlashDataProvider, X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        if (Intrinsics.LJFF(c262100zr.LIZ, "fetch_flash_component_data")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String str = "";
            if (interfaceC1107590evd != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "flash_component_id", "");
            } else {
                strLJFF = null;
            }
            if (!C13LP.LJJJJ(strLJFF, FlashDataProvider.LLILZ)) {
                if (strLJFF != null) {
                    str = strLJFF;
                }
                this.LL = str;
                LIZIZ(new JSONObject(), "no_observer", 1);
            }
        }
    }
}
