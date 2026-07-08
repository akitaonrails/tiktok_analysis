package com.ss.android.ugc.aweme.canvas.guide;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0CHQ;
import X.C12Y1;
import X.C1322110kVd;
import X.C19487011Lw;
import X.C2188811AlT;
import X.C452501pT;
import X.C570490MZb;
import X.EnumC20227914Cv;
import X.EnumC452301pR;
import Y.AObserverS231S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: loaded from: classes30.dex */
public final class CanvasGestureGuideWidget {
    public final AbstractC214814194y LIZ;
    public final C1322110kVd LIZIZ;
    public final View LIZJ;
    public C19487011Lw LJI;
    public final C01GW LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS566S0100000_22(this, 41));
    public final String LJ = "https://p16.tiktokcdn.com/obj/musically-maliva-obj/edit_photo_gesture_guide.webp";
    public final String LJFF = "edit_photo_gesture_guide.webp";
    public int LJII = -1;
    public final C12Y1 LJIIIIZZ = new C12Y1(this, 0);

    public final class CanvasGestureGuideObserver implements GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public final void onDestroy() {
            C19487011Lw c19487011Lw = CanvasGestureGuideWidget.this.LJI;
            if (c19487011Lw != null) {
                c19487011Lw.dispose();
            }
            CanvasGestureGuideWidget.this.LIZ.getLifecycle().removeObserver(this);
            Downloader downloaderCom_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C0CHQ.LIZ);
            CanvasGestureGuideWidget canvasGestureGuideWidget = CanvasGestureGuideWidget.this;
            downloaderCom_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance.removeMainThreadListener(canvasGestureGuideWidget.LJII, canvasGestureGuideWidget.LJIIIIZZ);
        }

        public CanvasGestureGuideObserver() {
        }
    }

    public final void LIZ() {
        ((LiveData) this.LIZLLL.getValue()).observe(this.LIZ, new AObserverS231S0100000_29(this, 38));
        View view = this.LIZJ;
        if (view != null) {
            view.setOnTouchListener(new ATListenerS461S0100000_29(this, 1));
        }
        this.LIZ.getLifecycle().addObserver(new CanvasGestureGuideObserver());
    }

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.CANVAS_GESTURE_GUIDE, "", true).getAbsolutePath()));
        sbLIZ.append(this.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CanvasGestureGuideWidget(AbstractC214814194y abstractC214814194y, C1322110kVd c1322110kVd, View view) {
        this.LIZ = abstractC214814194y;
        this.LIZIZ = c1322110kVd;
        this.LIZJ = view;
    }
}
