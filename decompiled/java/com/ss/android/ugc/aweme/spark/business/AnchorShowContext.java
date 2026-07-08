package com.ss.android.ugc.aweme.spark.business;

import X.C09JN;
import X.C11NJ;
import X.C11NZ;
import X.C11WM;
import X.C11WR;
import X.C11WS;
import X.C1701940uOG;
import X.C356901a3;
import Y.AfS198S0100000_29;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorShowContext extends AnchorCommonContext<C11WR> {
    public final C11NJ LLJ;

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext
    public final boolean LIZJ() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.spark.business.AnchorCommonContext, com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext, com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext
    public final C11WS LIZIZ() {
        return new C11WM() { // from class: X.11WR
            @Override // X.C11WM, X.C11WS
            public final void LIZ(Map<String, String> map) {
                super.LIZ(map);
            }
        };
    }

    public AnchorShowContext(SparkContext sparkContext) {
        super(sparkContext);
        this.LLJ = new C11NJ();
    }

    @Override // com.ss.android.ugc.aweme.spark.business.AnchorCommonContext, com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext
    public final void LJ(View view) {
        String str = ((C11WM) this.LLILLJJLI).LIZIZ;
        if (str != null && str.length() != 0) {
            super.LJ(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
        this.LLJ.dispose();
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLJ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLJ.LIZ(C11NZ.LJJJJLI(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C1701940uOG.LIZIZ()).LJJLL(new AfS198S0100000_29(this, 11), new C09JN() { // from class: X.0btZ
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("AnchorShowContext@6575.onResume$subscribe$2");
                C1C7U.LIZIZ("AnchorShowContext@6575.onResume$subscribe$2");
            }
        }));
    }
}
