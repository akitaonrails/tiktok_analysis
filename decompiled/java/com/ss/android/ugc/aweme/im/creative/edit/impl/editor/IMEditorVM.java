package com.ss.android.ugc.aweme.im.creative.edit.impl.editor;

import X.C003N;
import X.C01GW;
import X.InterfaceC0148002o;
import X.InterfaceC1660990tKD;
import X.InterfaceC2173461A4i;
import X.InterfaceC570310MYj;
import X.InterfaceSurfaceHolderCallbackC2173441A4g;
import X.InterfaceTextureViewSurfaceTextureListenerC2173451A4h;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMCreativeEditModel;

/* JADX INFO: loaded from: classes34.dex */
public final class IMEditorVM extends AssemViewModel<C003N> implements InterfaceC2173461A4i {
    public final IMCreativeEditModel LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C003N(0);
    }

    public final InterfaceC1660990tKD vQ2() {
        return (InterfaceC1660990tKD) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC2173461A4i
    public final void LLJLIL() {
        vQ2().surfaceDestroyed();
    }

    @Override // X.InterfaceC2173461A4i
    public final void J6(Surface surface) {
        vQ2().LIZIZ(surface);
        vQ2().LIZLLL(surface);
        if (this.LL.LIZIZ()) {
            TextureView textureViewLJIJJLI = ((InterfaceTextureViewSurfaceTextureListenerC2173451A4h) this.LLILZ.getValue()).LJIJJLI();
            if (textureViewLJIJJLI != null) {
                LLIIZ(textureViewLJIJJLI.getWidth(), textureViewLJIJJLI.getHeight(), surface);
                return;
            }
            throw new IllegalArgumentException("null surface view");
        }
        SurfaceView surfaceViewLJIJJLI = ((InterfaceSurfaceHolderCallbackC2173441A4g) this.LLILLL.getValue()).LJIJJLI();
        if (surfaceViewLJIJJLI != null) {
            LLIIZ(surfaceViewLJIJJLI.getWidth(), surfaceViewLJIJJLI.getHeight(), surface);
            return;
        }
        throw new IllegalArgumentException("null surface view");
    }

    @Override // X.InterfaceC2173461A4i
    public final void LLIIZ(int i, int i2, Surface surface) {
        vQ2().surfaceChanged(i, i2);
    }

    public IMEditorVM(IMCreativeEditModel iMCreativeEditModel, C01GW<? extends InterfaceC570310MYj> c01gw, C01GW<? extends InterfaceSurfaceHolderCallbackC2173441A4g> c01gw2, C01GW<? extends InterfaceC1660990tKD> c01gw3, C01GW<? extends InterfaceTextureViewSurfaceTextureListenerC2173451A4h> c01gw4) {
        this.LL = iMCreativeEditModel;
        this.LLILLJJLI = c01gw;
        this.LLILLL = c01gw2;
        this.LLILZ = c01gw4;
        this.LLILZIL = c01gw3;
    }
}
