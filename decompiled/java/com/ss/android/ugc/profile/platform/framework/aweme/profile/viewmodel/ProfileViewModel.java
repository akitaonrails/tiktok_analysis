package com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel;

import X.C004I;
import X.C1252530ihP;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.AwS47S0010000_35;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileViewModel extends JediViewModel<ProfileState> {
    public static final /* synthetic */ int LLILZIL = 0;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ProfileState(null, null, null, null, C1252530ihP.LIZ, 0, 0, true, null, "", Boolean.FALSE, true, "", null, null, null, null, null, null, false, null, false, false, null, false, "", Boolean.FALSE, Boolean.FALSE, null, null, null, null, null, null, null, null, null, false, null, false, false);
    }

    public final void hR2(boolean z) {
        setState(new AwS47S0010000_35(z, 17));
    }
}
