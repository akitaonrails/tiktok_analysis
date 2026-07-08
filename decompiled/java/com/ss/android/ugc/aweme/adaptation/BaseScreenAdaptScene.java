package com.ss.android.ugc.aweme.adaptation;

import X.C1660610tJb;
import X.C1741950vQn;
import X.InterfaceC1674890tgd;
import X.ViewOnLayoutChangeListenerC1698100uI4;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: loaded from: classes26.dex */
public abstract class BaseScreenAdaptScene extends AbsSceneAdaptationScene {
    public View LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJIJIL = true;
    public boolean LLJJJ = true;
    public boolean LLJJJIL = true;
    public ViewOnLayoutChangeListenerC1698100uI4 LLJJJJLIIL = new ViewOnLayoutChangeListenerC1698100uI4(this, 1);

    public boolean LLLLLIL() {
        return true;
    }

    public void LLLLLJLJLL(int i, int i2) {
    }

    public abstract void S3(boolean z);

    public abstract void nm();

    public abstract void p2(boolean z);

    public final void LLLLLJIL() {
        nm();
        if (!(LLLLLILLIL() instanceof C1660610tJb)) {
            if (LLLLLILLIL() instanceof c0) {
                p2(((c0) LLLLLILLIL()).LJII());
                S3(((c0) LLLLLILLIL()).LJIIIIZZ());
                return;
            }
            return;
        }
        switch (C1660610tJb.LIZ.LIZIZ()) {
            case 1:
            case 4:
                p2(true);
                S3(true);
                break;
            case 2:
            case 5:
                p2(false);
                S3(true);
                break;
            case 3:
            case 6:
                p2(true);
                S3(false);
                break;
            default:
                p2(false);
                S3(false);
                break;
        }
    }

    @Override // X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.LLJJJJ;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLJJJJLIIL);
            this.LLJJJJLIIL = null;
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
        if (this.LLJJJ) {
            this.LLJJJ = false;
            if (LLLLLILLIL() instanceof c0) {
                this.LLJJJJJIL = c0.LIZ.o2();
            } else {
                Activity activity = this.mActivity;
                if (activity == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(activity);
                this.LLJJJJJIL = iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
                if (iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight != LLLLLILLIL().o2()) {
                    LLLLLILLIL().s2(this.LLJJJJJIL);
                }
            }
            LLLLLJIL();
            if (this.LLJJJIL) {
                View view = this.LLJJJJ;
                if (view != null) {
                    view.addOnLayoutChangeListener(this.LLJJJJLIIL);
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            View view2 = this.LLJJJJ;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this.LLJJJJLIIL);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onStart() {
        View decorView;
        super.onStart();
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(1024);
            }
            Activity activity = this.mActivity;
            if (activity == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            C1741950vQn.LIZ(activity);
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setNavigationBarColor(-16777216);
            }
            Window window3 = getWindow();
            if (window3 != null && (decorView = window3.getDecorView()) != null) {
                decorView.setBackgroundColor(-16777216);
            }
            Activity activity2 = this.mActivity;
            if (activity2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            LLLLLJLJLL(ScreenUtils.getStatusBarHeight(activity2), LLLLLILLIL().p2());
            this.LLJJJJ = requireView();
        }
    }

    public InterfaceC1674890tgd LLLLLILLIL() {
        return C1660610tJb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJJJIL = true;
    }
}
