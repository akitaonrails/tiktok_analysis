package com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate;

import X.AbstractC648060PbQ;
import X.C0BQ0;
import X.C0PPS;
import X.C19EG;
import X.C325901Of;
import X.C647830Pb3;
import X.C648850Pch;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS110S0100000_10;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LifecycleDelegate extends AbstractC648060PbQ implements View.OnAttachStateChangeListener, GenericLifecycleObserver {
    public boolean LLILLJJLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        View hybirdContainerView = this.LL.LIZIZ.getHybirdContainerView();
        if (hybirdContainerView instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL((SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) hybirdContainerView);
        }
        C648850Pch c648850Pch = this.LL.LJIILL;
        if (c648850Pch != null) {
            if (((Number) C0BQ0.LIZ.getValue()).intValue() == 1) {
                c648850Pch.LIZ.LLD(true);
            } else {
                c648850Pch.LIZ.LLD(true);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        LJII("viewDisappear", new JSONObject());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LL.LIZLLL != null) {
            LJII("viewAppear", new JSONObject());
        }
    }

    public LifecycleDelegate(C647830Pb3 c647830Pb3) {
        super(c647830Pb3);
        SAFHelper sAFHelper = SAFHelper.LIZ;
        Fragment fragment = c647830Pb3.LIZ;
        C19EG c19eg = c647830Pb3.LIZJ;
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19eg);
        if (lifecycleOwnerLJIJJ != null) {
            C325901Of.LIZ(lifecycleOwnerLJIJJ, this);
        }
        c647830Pb3.LIZIZ.addOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.LL.LJFF) {
            C0PPS.LIZ(view, new ARunnableS110S0100000_10(this, 40));
        }
        this.LL.LJFF = false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) throws JSONException {
        if (!this.LL.LJFF) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "hide");
            LJII("pageScroll", jSONObject);
            LynxView lynxView = this.LL.LJ;
            if (lynxView != null) {
                lynxView.onEnterBackground();
            }
            this.LLILLJJLI = true;
        }
        this.LL.LJFF = true;
    }

    public final void LJII(String str, JSONObject jSONObject) {
        this.LL.LIZ(str, jSONObject);
    }
}
