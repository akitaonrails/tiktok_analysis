package com.ss.android.ugc.aweme.property.bytebench;

import X.C09GA;
import X.InterfaceC1442420ndg;
import X.InterfaceC21142817oY;

/* JADX INFO: loaded from: classes23.dex */
public interface NowVQByteBenchStrategy extends InterfaceC1442420ndg, InterfaceC21142817oY {
    String compileExternalSetting();

    int compileVideoSizeIndex();

    boolean enableSplitConfig();

    String getNowTakePictureSize();

    int recordVideoEncodeSizeIndex();

    @Override // X.InterfaceC21142817oY
    /* synthetic */ void setByteBenchStrategy(C09GA c09ga);

    int shotScreenEncodeSizeIndex();

    float sourceBitrateFactor();

    String sourcePreviewSize();

    int sourceVideoSizeIndex();

    /* synthetic */ void updateValue();
}
