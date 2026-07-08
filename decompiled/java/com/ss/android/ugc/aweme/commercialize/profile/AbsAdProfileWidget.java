package com.ss.android.ugc.aweme.commercialize.profile;

import X.C0RD4;
import X.C1035130d2l;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AbsAdProfileWidget extends Widget implements Observer<C0RD4> {
    public Aweme LLIZLLLIL;
    public Fragment LLJ;
    public String LLJI;

    public void LJIIZILJ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.yQ2("AD_PROFILE_PARAMS", this, false);
        }
        DataCenter dataCenter2 = this.LLILZ;
        if (dataCenter2 != null) {
            dataCenter2.yQ2("AD_PROFILE_VISIBILITY_CHANGED", this, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            dataCenter.AQ2(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void LJIILIIL(View view) {
        C1035130d2l c1035130d2l;
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null && (c1035130d2l = (C1035130d2l) dataCenter.get("AD_PROFILE_PARAMS")) != null) {
            LJIILL(c1035130d2l);
        }
    }

    public void LJIILL(C1035130d2l c1035130d2l) {
        this.LLIZLLLIL = c1035130d2l.LIZ;
        this.LLJ = c1035130d2l.LIZIZ;
        this.LLJI = c1035130d2l.LIZJ;
    }

    public final <T extends View> T LJIILLIIL(int i) {
        View view = this.LLILLL;
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        C0RD4 c0rd42 = c0rd4;
        Object obj = null;
        if (c0rd42 != null && (str = c0rd42.LIZ) != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1433406312) {
                if (iHashCode == -322064775 && str.equals("AD_PROFILE_VISIBILITY_CHANGED")) {
                    Object obj2 = c0rd42.LIZIZ;
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        LJIIZILJ(bool.booleanValue());
                        return;
                    }
                    return;
                }
                return;
            }
            if (!str.equals("AD_PROFILE_PARAMS")) {
                return;
            }
            Object obj3 = c0rd42.LIZIZ;
            if (obj3 != null) {
                obj = obj3;
            }
            C1035130d2l c1035130d2l = (C1035130d2l) obj;
            if (c1035130d2l == null) {
                return;
            }
            LJIILL(c1035130d2l);
        }
    }
}
