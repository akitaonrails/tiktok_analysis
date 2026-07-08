package com.ss.android.ugc.gamora.editor.audio.copyrightdetect;

import X.AnonymousClass0206;
import X.C01GW;
import X.C01X9;
import X.C01XA;
import X.C01XB;
import X.C01XE;
import X.C0C64;
import X.C0PEM;
import X.C23250099c;
import X.C452501pT;
import X.C817503Hh;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes.dex */
public final class AutoSoundCheckService implements IAutoSoundCheckService {
    public final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(216));

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final boolean LIZLLL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_long_video_audio_copyright_detection", true, true);
    }

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final void LIZ(Function1 function1) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01XE(this, "settings_page", function1, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final Object LIZIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C01XA(this, null));
    }

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final void LIZJ(AwS607S0100000_28 awS607S0100000_28) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01X9(this, awS607S0100000_28, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final void LJ(Function1 function1, boolean z) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01XB(this, z, function1, null), 2);
    }
}
