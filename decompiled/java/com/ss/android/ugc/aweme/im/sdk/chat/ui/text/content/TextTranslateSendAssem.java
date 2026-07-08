package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content;

import X.AnonymousClass0956;
import X.C09AE;
import X.C0ZS7;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXU;
import X.C0ZXX;
import X.C1308910kAL;
import X.C724270Sb3;
import X.C901200ZXa;
import X.C901380ZXs;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TextTranslateSendAssem extends TextTranslateAssem {
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem
    public final C901380ZXs Ap() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        C901200ZXa c901200ZXaLIZ = null;
        C0ZXL c0zxl = ((C0ZS7) (c724270Sb3 != null ? c724270Sb3.LL : null)).LJII().LIZJ;
        if (c0zxl instanceof C0ZXU) {
            View view = (View) this.LLJZ.getValue();
            C0ZXU c0zxu = (C0ZXU) c0zxl;
            if (Intrinsics.LJFF(view != null ? view.getTag(R.id.bot) : null, c0zxu.LIZ.resourceId)) {
                c901200ZXaLIZ = c0zxu.LIZ.LIZ();
            }
        }
        return new C901380ZXs(c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : iq(R.attr.zi), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZJ : iq(R.attr.zi), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZIZ : iq(R.attr.zi), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZ : iq(R.attr.zi), c901200ZXaLIZ != null ? c901200ZXaLIZ.LIZLLL : iq(R.attr.zi));
    }

    public final int iq(int i) {
        Integer numLIZJ;
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context)) != null) {
            return numLIZJ.intValue();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem
    public final void tp(C0ZXS c0zxs, boolean z) {
        boolean z2;
        if (z && !(c0zxs.LIZJ instanceof C0ZXU)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C09AE c09ae = this.LLLJ;
        AnonymousClass0956 anonymousClass0956LIZ = null;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
        if (iIMMessageBubbleService != null) {
            anonymousClass0956LIZ = iIMMessageBubbleService.LIZ(Ip().LL, c0zxs, z2, LifecycleOwnerKt.getLifecycleScope(this), new AwS558S0100000_14(this, 899), new AwS593S0100000_14(this, 103), C0ZXX.LIZ);
        }
        this.LLLJ = anonymousClass0956LIZ;
    }
}
