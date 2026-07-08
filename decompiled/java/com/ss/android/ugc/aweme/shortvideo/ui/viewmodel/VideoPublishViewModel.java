package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import X.C004I;
import X.C13BV;
import X.C19223110Ij;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.BaseJediViewModel;
import java.util.List;
import kotlin.jvm.internal.AwS0S0040000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class VideoPublishViewModel extends BaseJediViewModel<VideoPublishState> {
    public List<? extends C19223110Ij> LLILZIL = C13BV.INSTANCE;
    public h0<Boolean> LLILZLL = new h0<>(Boolean.FALSE);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new VideoPublishState(null, null);
    }

    public final void lR2(boolean z, boolean z2, boolean z3, boolean z4) {
        setStateImmediate(new AwS0S0040000_14(z, z2, z3, z4, 1));
    }
}
