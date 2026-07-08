package com.ss.android.ugc.aweme.spark.common;

import X.AbstractC1541650qDj;
import X.AbstractC2205961BVi;
import X.C08RQ;
import X.C11WS;
import X.C1554490qYR;
import X.C19EG;
import X.C2205951BVh;
import X.C356901a3;
import X.InterfaceC2217701Bqy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.spark.business.AnchorCommonContext;
import com.ss.android.ugc.aweme.spark.business.AnchorPublishContext;
import com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext;

/* JADX INFO: loaded from: classes30.dex */
public abstract class BaseThirdPartyContext<T extends C11WS> implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final SparkContext LL;
    public final T LLILLJJLI = (T) LIZIZ();
    public C19EG LLILLL;

    /* JADX INFO: loaded from: classes24.dex */
    public final class a extends AbstractC1541650qDj<C2205951BVh> {
        public final /* synthetic */ BaseThirdPartyContext<T> LLIZ;

        @Override // X.AbstractC1541650qDj
        public final void LIZJ() {
            AbstractC2205961BVi abstractC2205961BViLIZLLL = this.LLIZ.LIZLLL(this);
            LIZLLL("onReceivedError", abstractC2205961BViLIZLLL);
            LIZLLL("onPageStarted", abstractC2205961BViLIZLLL);
            LIZLLL("onPageFinished", abstractC2205961BViLIZLLL);
            LIZLLL("onReceivedHttpError", abstractC2205961BViLIZLLL);
            LIZLLL("shouldOverrideUrlLoading", abstractC2205961BViLIZLLL);
        }

        public a(AnchorCommonContext anchorCommonContext) {
            this.LLIZ = anchorCommonContext;
        }
    }

    public abstract T LIZIZ();

    public boolean LIZJ() {
        return this instanceof AnchorPublishContext;
    }

    public AbstractC2205961BVi LIZLLL(BaseThirdPartyContext<T>.a aVar) {
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public void LIZ() {
        this.LL.LJJLIIIJJI(new InterfaceC2217701Bqy(this) { // from class: X.11WU
            public final /* synthetic */ BaseThirdPartyContext<Object> LL;

            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context) {
                return context;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            {
                this.LL = this;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
                this.LL.onStop(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                this.LL.onDestroy(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
                this.LL.onPause(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                this.LL.onStart(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                this.LL.onResume(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                this.LL.onCreate(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                this.LL.LLILLL = sparkActivity;
            }
        });
        this.LL.LJJJJZ(new C1554490qYR(1));
    }

    public BaseThirdPartyContext(SparkContext sparkContext) {
        this.LL = sparkContext;
        if (LIZJ()) {
            LIZ();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        this.LLILLJJLI.LIZ(C08RQ.LIZJ(this.LL.containerId));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLILLL = null;
    }
}
