package com.bytedance.android.livesdk.module;

import X.AbstractC1098830ehV;
import X.C1098800ehS;
import X.C1117070fAv;
import X.C1563370qml;
import X.C19EG;
import X.C464660IKa;
import X.C504210Jpz;
import X.C520010KaN;
import X.C784610UqB;
import X.EnumC682280QpW;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.chatroom.interaction.PopHalfWebDialogHelper;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class BrowserService implements IBrowserService {
    @Override // com.bytedance.android.live.browser.IBrowserService
    public final C784610UqB Zz1() {
        return C784610UqB.LIZ();
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final void Eu2(boolean z) {
        C1117070fAv.LLILLL = z;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final AbstractC1098830ehV vc1(final Uri uri, final String str, Context context) {
        final C19EG c19egLJIJJLI = C520010KaN.LJIJJLI(context, true);
        if (c19egLJIJJLI != null) {
            if (!C504210Jpz.LIZ && !C464660IKa.LIZ()) {
                return new C1098800ehS(c19egLJIJJLI, uri.toString(), str);
            }
            return (AbstractC1098830ehV) C1563370qml.LIZ(c19egLJIJJLI, EnumC682280QpW.MAIN, new Function0() { // from class: X.0ehZ
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Activity activity = c19egLJIJJLI;
                    Uri uri2 = uri;
                    return new C1098800ehS(activity, uri2.toString(), str);
                }
            });
        }
        return null;
    }

    @Override // com.bytedance.android.live.browser.IBrowserService
    public final void uv1(BaseFragment baseFragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        new PopHalfWebDialogHelper(baseFragment, dataChannel, z, lifecycleOwner);
    }
}
