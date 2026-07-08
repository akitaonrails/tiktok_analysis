package com.ss.android.ugc.aweme.shortvideo.stitch;

import X.C004I;
import X.C574740MgS;
import android.content.SharedPreferences;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class StitchIntroduceViewModel extends BaseJediViewModel<StitchState> {
    public final void lR2() {
        SharedPreferences sharedPreferences = C574740MgS.LIZ;
        if (!sharedPreferences.getBoolean("stitch_introduce_shown", false) || sharedPreferences.getBoolean("stitch_trimming_view_guide", false)) {
            return;
        }
        sharedPreferences.edit().putBoolean("stitch_trimming_view_guide", true).apply();
        setState(AFwS273S0000000_29.get$arr$(139));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new StitchState(null, null, null, null, null);
    }
}
