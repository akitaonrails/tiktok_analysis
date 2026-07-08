package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.InterfaceC1442520ndq;
import X.InterfaceC21142817oY;

/* JADX INFO: loaded from: classes23.dex */
public interface ResolutionByteBenchStrategy extends InterfaceC1442520ndq, InterfaceC21142817oY {
    @Override // X.InterfaceC1442520ndq
    int compileVideoSizeIndex();

    boolean enablePreviewResolutionDowngrade();

    @Override // X.InterfaceC1442520ndq
    int hdCompileVideoSizeIndex();

    @Override // X.InterfaceC1442520ndq
    String previewDowngradeSupportTab();

    int previewVideoSizeIndex();

    @Override // X.InterfaceC21142817oY
    /* synthetic */ void setByteBenchStrategy(C09GA c09ga);

    @Override // X.InterfaceC1442520ndq
    int staticVideoSizeIndex();

    /* synthetic */ void updateValue();

    @Override // X.InterfaceC1442520ndq
    int uploadVideoSizeIndex();

    @Override // X.InterfaceC1442520ndq
    String veCameraPreviewSize();

    @Override // X.InterfaceC1442520ndq
    int videoSizeIndex();
}
