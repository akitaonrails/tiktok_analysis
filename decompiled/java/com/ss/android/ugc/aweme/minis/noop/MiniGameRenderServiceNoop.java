package com.ss.android.ugc.aweme.minis.noop;

import X.InterfaceC1006410cIR;
import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.amg.minigameruntime.api.ScreenShotData;
import com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService;

/* JADX INFO: loaded from: classes17.dex */
public final class MiniGameRenderServiceNoop implements IMiniGameRenderService {
    @Override // com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService
    public final void LIZ(Activity activity, String str) {
    }

    @Override // com.ss.android.ugc.aweme.minis.api.IMiniGameRenderService
    public final InterfaceC1006410cIR LIZIZ(Activity activity, String str) {
        return new InterfaceC1006410cIR() { // from class: X.0cIq
            @Override // X.InterfaceC1006410cIR
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1006410cIR
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1006410cIR
            public final void LIZLLL(C1006430cIT c1006430cIT) {
            }

            @Override // X.InterfaceC1006410cIR
            public final void LJ() {
            }

            @Override // X.InterfaceC1006410cIR
            public final ScreenShotData LJFF() {
                return null;
            }

            @Override // X.InterfaceC1006410cIR
            public final void LJI(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1006410cIR
            public final void LJII(ViewGroup viewGroup) {
            }

            @Override // X.InterfaceC1006410cIR
            public final void LJIIIIZZ(C1006430cIT c1006430cIT) {
            }

            @Override // X.InterfaceC1006410cIR
            public final void destroy() {
            }

            @Override // X.InterfaceC1006410cIR
            public final void pause() {
            }

            @Override // X.InterfaceC1006410cIR
            public final void resume() {
            }

            @Override // X.InterfaceC1006410cIR
            public final EnumC1006650cIp LIZ() {
                return EnumC1006650cIp.IN_PROGRESS;
            }
        };
    }
}
