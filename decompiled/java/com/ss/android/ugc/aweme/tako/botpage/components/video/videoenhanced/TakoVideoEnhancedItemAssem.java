package com.ss.android.ugc.aweme.tako.botpage.components.video.videoenhanced;

import X.C1558520qew;
import X.C329510Cvt;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoVideoEnhancedItemAssem extends TakoVideoCommonItemAssem<TakoVideoEnhancedItemAssem> {
    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final String sp() {
        return "base";
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final void yp(String str) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final void up() {
        Function1<View, Unit> function1;
        C329510Cvt c329510Cvt = this.LLLF;
        if (c329510Cvt == null || (function1 = c329510Cvt.LLILZ) == null) {
            return;
        }
        function1.invoke(getContentView());
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final InterfaceC665370Q7z zp() {
        return C1558520qew.LJIIL(this);
    }
}
