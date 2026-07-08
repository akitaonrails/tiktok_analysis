package com.lynx.animax.ui;

import X.C1285850jZ9;
import X.C1288620jdc;
import android.content.Context;
import com.lynx.animax.ability.BaseAbility;

/* JADX INFO: loaded from: classes21.dex */
public class AnimaXContext {
    public final BaseAbility LIZ;
    public final Context LIZIZ;
    public final boolean LIZJ;
    public float LIZLLL;

    public boolean disablePlaybackOnAssetLoadFailure() {
        return C1285850jZ9.LIZJ(C1285850jZ9.LIZ(this.LIZ, "ANIMAX_DISABLE_PLAYBACK_ON_ASSET_LOAD_FAILURE"));
    }

    public float getDeviceDensity() {
        if (this.LIZLLL <= 0.0f) {
            this.LIZLLL = this.LIZIZ.getResources().getDisplayMetrics().density;
        }
        return this.LIZLLL;
    }

    public BaseAbility getAbility() {
        return this.LIZ;
    }

    public boolean multiThreadAccelerate() {
        return this.LIZJ;
    }

    public AnimaXContext(C1288620jdc c1288620jdc) {
        this.LIZ = c1288620jdc.LIZ;
        this.LIZIZ = c1288620jdc.LIZIZ;
        this.LIZJ = c1288620jdc.LIZJ;
    }
}
