package com.ss.android.ugc.aweme.shortvideo.cover;

import X.InterfaceC1452170ntP;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.vesdk.VEEditor;

/* JADX INFO: loaded from: classes23.dex */
public class VEMultiEditVideoCoverGeneratorImpl extends VEVideoCoverGeneratorImpl {
    public final int LLJ;

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl
    public final int[] LIZJ(int i, int i2) {
        if (i2 == 0) {
            return new int[0];
        }
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = (i3 * i4) + this.LLJ;
        }
        return iArr;
    }

    public VEMultiEditVideoCoverGeneratorImpl(InterfaceC1452170ntP interfaceC1452170ntP, LifecycleOwner lifecycleOwner, int i, int i2, int i3, VEEditor.GET_FRAMES_FLAGS get_frames_flags) {
        super(interfaceC1452170ntP, lifecycleOwner, i, get_frames_flags, "choose_cover");
        this.LLILLJJLI = i2;
        this.LLJ = i3;
    }

    public VEMultiEditVideoCoverGeneratorImpl(InterfaceC1452170ntP interfaceC1452170ntP, LifecycleOwner lifecycleOwner, int i, int i2, int i3, VEEditor.GET_FRAMES_FLAGS get_frames_flags, int i4) {
        super(interfaceC1452170ntP, lifecycleOwner, i, get_frames_flags, "choose_cover");
        this.LLILLJJLI = i2;
        this.LLILLL = false;
        this.LLJ = i3;
    }
}
