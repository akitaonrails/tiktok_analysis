package com.ss.android.ugc.gamora.editor.sticker.lyric;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0FW2;
import X.C0PEM;
import X.C0R1H;
import X.C11JF;
import X.C1308910kAL;
import X.C1640790snd;
import X.C189200o6;
import X.C23250099c;
import X.C356901a3;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1644640stq;
import Y.AfS174S0100000_5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class LyricStickerPanelTagController {
    public static boolean LJIIIIZZ;
    public final FrameLayout LIZ;
    public final Function0<VideoPublishEditModel> LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C1640790snd LIZLLL;
    public final Function0<InterfaceC1644640stq> LJ;
    public C11JF LJFF;
    public AnonymousClass0956 LJI;
    public C11JF LJII;

    public final View LIZ() {
        this.LIZ.setClipChildren(false);
        this.LIZ.setClipToPadding(false);
        View viewFindViewWithTag = this.LIZ.findViewWithTag("LyricStickerNewTag");
        View view = viewFindViewWithTag;
        if (viewFindViewWithTag == null) {
            Context context = this.LIZ.getContext();
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
            tuxTextView.setBackground(gradientDrawable);
            tuxTextView.setTuxFont(92);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0p, context);
            if (numLIZJ2 != null) {
                tuxTextView.setTextColor(numLIZJ2.intValue());
            }
            tuxTextView.setText("NEW");
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            tuxTextView.setTag("LyricStickerNewTag");
            FrameLayout frameLayout = this.LIZ;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8)), 0, 0);
            frameLayout.addView(tuxTextView, layoutParams);
            view = tuxTextView;
        }
        return view;
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        try {
            View viewFindViewWithTag = this.LIZ.findViewWithTag("LyricStickerNewTag");
            if (viewFindViewWithTag != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewWithTag);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        LJIIIIZZ = false;
    }

    public final void LIZJ() {
        try {
            C11JF c11jf = this.LJFF;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJFF = null;
            C11JF c11jf2 = this.LJII;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LJII = null;
            AnonymousClass0956 anonymousClass0956 = this.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LJI = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZLLL() {
        InterfaceC1644640stq interfaceC1644640stqInvoke;
        Function0<VideoPublishEditModel> function0;
        VideoPublishEditModel videoPublishEditModelInvoke;
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Function0<InterfaceC1644640stq> function02 = this.LJ;
        if (function02 != null && (interfaceC1644640stqInvoke = function02.invoke()) != null && interfaceC1644640stqInvoke.X0() && LJIIIIZZ && ((function0 = this.LIZIZ) == null || (videoPublishEditModelInvoke = function0.invoke()) == null || (creativeModel = videoPublishEditModelInvoke.creativeModel) == null || (stickerNewEngineModel = creativeModel.stickerModel) == null || !(!stickerNewEngineModel.lyricStickerModels.isEmpty()))) {
            C786410Ut5.LJLLLLLL(0, LIZ());
        } else {
            this.LJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZJ), C0PEM.LIZJ, null, new C0FW2(this, null), 2);
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController$2, reason: invalid class name */
    public final class AnonymousClass2 implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            LyricStickerPanelTagController.LJIIIIZZ = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LyricStickerPanelTagController(FrameLayout frameLayout, Function0<? extends VideoPublishEditModel> function0, LifecycleOwner lifecycleOwner, C1640790snd c1640790snd, Function0<? extends InterfaceC1644640stq> function02) {
        this.LIZ = frameLayout;
        this.LIZIZ = function0;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = c1640790snd;
        this.LJ = function02;
        frameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0FW3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                LyricStickerPanelTagController lyricStickerPanelTagController = this.LL;
                lyricStickerPanelTagController.LIZLLL();
                lyricStickerPanelTagController.LJFF = (C11JF) lyricStickerPanelTagController.LIZLLL.LIZJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS174S0100000_5(lyricStickerPanelTagController, 6), new C09JN() { // from class: X.00QW
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("LyricStickerPanelTagController@dcae.init$2");
                        C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.init$2");
                    }
                });
                lyricStickerPanelTagController.LJII = (C11JF) lyricStickerPanelTagController.LIZLLL.LIZLLL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS174S0100000_5(lyricStickerPanelTagController, 7), new C09JN() { // from class: X.00QX
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("LyricStickerPanelTagController@dcae.init$4");
                        C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.init$4");
                    }
                });
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                this.LL.LIZJ();
            }
        });
        C0R1H.LIZIZ(lifecycleOwner, new AnonymousClass2());
    }
}
