package com.ss.android.ugc.aweme.tako.camera.record;

import X.C01GW;
import X.C229900uf;
import X.C452501pT;
import X.EnumC1854210yLr;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.vesdk.VECameraCapture;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoRecordCoreViewModel extends AssemViewModel<C229900uf> {
    public VERecorder LL;
    public VECameraCapture LLILLJJLI;
    public float LLILLL;
    public int LLILZ = 1;
    public EnumC1854210yLr LLILZIL = EnumC1854210yLr.OFF;
    public boolean LLILZLL = true;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(178));
    public VESize LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C229900uf(null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    public final float vQ2(int i) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        } else {
            i2 = 2;
        }
        this.LLILZ = i2;
        float f = this.LLILLL;
        double d = 2.0d;
        double d2 = 1.0d;
        if (f > 0.0f) {
            if (i2 != 1) {
                if (i2 != 2) {
                    d2 = f;
                } else {
                    d2 = ((double) f) / 2.0d;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    d = 3.0d;
                }
            } else {
                d = 1.0d;
            }
            d2 = d;
        }
        return (float) d2;
    }
}
