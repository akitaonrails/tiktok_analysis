package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.slot;

import X.C11VU;
import X.C19712012Ak;
import X.C19712212Am;
import X.C19712412Ao;
import X.C19712912At;
import X.C534190KxF;
import X.C580700Mq4;
import X.C580710Mq5;
import X.C814420VxA;
import X.InterfaceC19711712Ah;
import X.InterfaceC19713512Az;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AObserverS231S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class SlotViewComponent implements InterfaceC19711712Ah, InterfaceC19713512Az, GenericLifecycleObserver {
    public final ViewGroup LL;
    public final C580710Mq5 LLILLJJLI;
    public BaseActivity LLILLL;
    public C534190KxF LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;

    @Override // X.InterfaceC19713512Az
    public final void LIZ() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLJ = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LLJ = true;
        this.LLJI = System.currentTimeMillis();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC19713512Az
    public final void onAppBackground() {
        MutableLiveData<Integer> mutableLiveData = this.LLILLJJLI.LJIILIIL;
        mutableLiveData.setValue(mutableLiveData.getValue());
    }

    @Override // X.InterfaceC19713512Az
    public final void onAppForeground() {
        C534190KxF c534190KxF = this.LLILZ;
        if (c534190KxF == null) {
            c534190KxF = null;
        }
        c534190KxF.notifyDataSetChanged();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        BaseActivity baseActivity = this.LLILLL;
        if (baseActivity == null) {
            baseActivity = null;
        }
        int iMax = Math.max(C814420VxA.LIZIZ(C11VU.LIZLLL(baseActivity) * 0.175f), this.LL.findViewById(R.id.vkt).getLayoutParams().height);
        this.LLILZIL = iMax;
        int paddingBottom = (iMax - this.LL.findViewById(R.id.vkt).getPaddingBottom()) - this.LL.findViewById(R.id.vkt).getPaddingTop();
        this.LLILZLL = paddingBottom;
        this.LLIZ = (int) (paddingBottom * 0.64f);
        ViewGroup.LayoutParams layoutParams = this.LL.findViewById(R.id.vkt).getLayoutParams();
        layoutParams.height = this.LLILZIL;
        View viewFindViewById = this.LL.findViewById(R.id.vkt);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewFindViewById);
        viewFindViewById.setLayoutParams(layoutParams);
        (C580700Mq4.LIZIZ() ? new C19712012Ak(this.LL, this.LLILLJJLI, new Pair(Integer.valueOf(this.LLIZ), Integer.valueOf(this.LLILZLL)), new AwS608S0100000_29(this, 311)) : new C19712212Am(this.LL)).LIZ();
        C534190KxF c534190KxF = new C534190KxF(this.LLILLJJLI, this.LLIZ + C19712412Ao.LIZ, this.LLILZLL);
        c534190KxF.LLILZ = new AwS643S0100000_29(this, 107);
        ((RecyclerView) this.LL.findViewById(R.id.vkt)).setAdapter(c534190KxF);
        c534190KxF.notifyDataSetChanged();
        this.LLILZ = c534190KxF;
        MutableLiveData<Integer> mutableLiveData = this.LLILLJJLI.LJIILIIL;
        BaseActivity baseActivity2 = this.LLILLL;
        mutableLiveData.observe(baseActivity2 != null ? baseActivity2 : null, new AObserverS231S0100000_29(this, 188));
        C19712912At.LIZ.LJ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C19712912At.LIZ.LJFF(this);
        BaseActivity baseActivity = this.LLILLL;
        if (baseActivity == null) {
            baseActivity = null;
        }
        baseActivity.getLifecycle().removeObserver(this);
    }

    @Override // X.InterfaceC19711712Ah
    public final boolean A0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC19711712Ah
    public final boolean lf0() {
        return this.LLIZLLLIL;
    }

    public SlotViewComponent(ViewGroup viewGroup, C580710Mq5 c580710Mq5) {
        this.LL = viewGroup;
        this.LLILLJJLI = c580710Mq5;
    }
}
