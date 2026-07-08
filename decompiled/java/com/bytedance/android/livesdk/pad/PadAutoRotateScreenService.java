package com.bytedance.android.livesdk.pad;

import X.C1161920gLG;
import X.C497740JfY;
import X.C500260Jjc;
import X.InterfaceC1106030et7;
import com.bytedance.android.livesdk.pad.widget.PadAutoRotateScreenGuideWidget;
import com.bytedance.android.livesdk.setting.PadAutoRotateScreenGuideSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* JADX INFO: loaded from: classes8.dex */
public class PadAutoRotateScreenService implements IPadAutoRotateScreenService {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public int LL;

    @Override // com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService
    public final void RQ0() {
        InterfaceC1106030et7.t8.LJFF(Boolean.TRUE);
    }

    @Override // com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService
    public final void Wy1() {
        this.LL++;
    }

    @Override // com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService
    public final boolean oD() {
        return !C500260Jjc.LJJII(C497740JfY.LIZ) && PadAutoRotateScreenGuideSetting.INSTANCE.getValue().getEnable() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && !InterfaceC1106030et7.t8.LIZIZ().booleanValue();
    }

    @Override // com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService
    public final PadAutoRotateScreenGuideWidget XQ0() {
        if (oD()) {
            return new PadAutoRotateScreenGuideWidget();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService
    public final Class<? extends LiveRecyclableWidget> an0() {
        if (oD()) {
            return PadAutoRotateScreenGuideWidget.class;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.pad.IPadAutoRotateScreenService
    public final int Cy0() {
        return this.LL;
    }
}
