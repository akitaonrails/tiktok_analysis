package com.ss.android.ugc.aweme.tools.draft.adapter.viewholder;

import X.AbstractC562050M2p;
import X.C01GW;
import X.C0HZQ;
import X.C0M0L;
import X.C0M0P;
import X.C0M39;
import X.C0M3A;
import X.C0M3B;
import X.C0M3C;
import X.C0M3E;
import X.C0M3F;
import X.C0M3H;
import X.C0M3I;
import X.C0M3L;
import X.C0MAY;
import X.C0MZ9;
import X.C1322110kVd;
import X.C1388190mED;
import X.C1667500tUi;
import X.C19EG;
import X.C1AF0;
import X.C1EE2;
import X.C201955140j;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C280830AzZ;
import X.C286470BKr;
import X.C356901a3;
import X.C426320Gne;
import X.C452501pT;
import X.C547860LeC;
import X.C561140Lzc;
import X.C561950M2f;
import X.C580840MqI;
import X.C786410Ut5;
import X.EnumC545550LaT;
import X.ViewOnLongClickListenerC580930MqR;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import u4.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class NewDraftViewHolder extends AbstractC562050M2p<C0M0P> implements GenericLifecycleObserver {
    public final C0M3H LL;
    public final C561140Lzc LLILLJJLI;
    public final String LLILLL;
    public final Context LLILZ;
    public TuxTextView LLILZIL;
    public ViewGroup LLILZLL;
    public TuxTextView LLIZ;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public ViewGroup LLJI;
    public TuxIconView LLJIJIL;
    public C426320Gne LLJILJIL;
    public TuxTextView LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxIconView LLJJ;
    public TextView LLJJI;
    public C0HZQ LLJJIII;
    public C1322110kVd LLJJIJI;
    public C0M0P LLJJIJIIJIL;
    public C0M3E LLJJIJIL;
    public C0M3F LLJJJ;
    public long LLJJJIL;
    public Pair<C0M39, ? extends Future<?>> LLJJJJ;
    public Pair<C0M3A, ? extends Future<?>> LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C0M3L LLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void reset() {
        Future<?> second;
        C0M39 first;
        Future<?> second2;
        C0M3A first2;
        if (C280830AzZ.LIZ()) {
            Pair<C0M3A, ? extends Future<?>> pair = this.LLJJJJJIL;
            if (pair != null && (first2 = pair.getFirst()) != null) {
                first2.LLILZ = true;
            }
            Pair<C0M3A, ? extends Future<?>> pair2 = this.LLJJJJJIL;
            if (pair2 != null && (second2 = pair2.getSecond()) != null) {
                second2.cancel(false);
            }
            this.LLJJJJJIL = null;
            Pair<C0M39, ? extends Future<?>> pair3 = this.LLJJJJ;
            if (pair3 != null && (first = pair3.getFirst()) != null) {
                first.LLILZ = true;
            }
            Pair<C0M39, ? extends Future<?>> pair4 = this.LLJJJJ;
            if (pair4 != null && (second = pair4.getSecond()) != null) {
                second.cancel(false);
            }
            this.LLJJJJ = null;
        }
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            NewDraftViewHolder.this.reset();
            C356901a3.LIZIZ(this, lifecycleOwner);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(com.ss.android.ugc.aweme.draft.model.AwemeDraft r9) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder.N5(com.ss.android.ugc.aweme.draft.model.AwemeDraft):void");
    }

    public final void S5(C0M0P c0m0p) {
        if (!c0m0p.LIZIZ) {
            C0M0P c0m0p2 = this.LLJJIJIIJIL;
            if (c0m0p2 == null) {
                c0m0p2 = null;
            }
            if (c0m0p2.LJIILIIL != EnumC545550LaT.NONE) {
                ViewGroup viewGroup = this.LLJI;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(0, viewGroup);
                }
                EnumC545550LaT enumC545550LaT = c0m0p.LJIILIIL;
                if (enumC545550LaT == EnumC545550LaT.PROCESSING) {
                    TuxIconView tuxIconView = this.LLJIJIL;
                    if (tuxIconView != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    }
                    C426320Gne c426320Gne = this.LLJILJIL;
                    if (c426320Gne != null) {
                        C786410Ut5.LLLZZ(c426320Gne, 0);
                    }
                    float f = c0m0p.LJIILJJIL;
                    C426320Gne c426320Gne2 = this.LLJILJIL;
                    if (c426320Gne2 != null) {
                        c426320Gne2.LIZ(f, false);
                    }
                    TuxTextView tuxTextView = this.LLJILJILJ;
                    if (tuxTextView != null) {
                        tuxTextView.setText(C20642515q3.LJI(2131850029));
                        return;
                    }
                    return;
                }
                if (enumC545550LaT == EnumC545550LaT.COMPLETE) {
                    TuxIconView tuxIconView2 = this.LLJIJIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    }
                    TuxIconView tuxIconView3 = this.LLJIJIL;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setIconRes(R.raw.icon_color_tick_circle_green);
                    }
                    TuxIconView tuxIconView4 = this.LLJIJIL;
                    if (tuxIconView4 != null) {
                        tuxIconView4.LIZ();
                    }
                    C426320Gne c426320Gne3 = this.LLJILJIL;
                    if (c426320Gne3 != null) {
                        C786410Ut5.LLLZZ(c426320Gne3, 8);
                    }
                    TuxTextView tuxTextView2 = this.LLJILJILJ;
                    if (tuxTextView2 == null) {
                        return;
                    }
                    tuxTextView2.setText(C20642515q3.LJI(2131850028));
                    return;
                }
                if (enumC545550LaT != EnumC545550LaT.FAILED) {
                    return;
                }
                TuxIconView tuxIconView5 = this.LLJIJIL;
                if (tuxIconView5 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
                }
                TuxIconView tuxIconView6 = this.LLJIJIL;
                if (tuxIconView6 != null) {
                    tuxIconView6.setIconRes(R.raw.icon_exclamation_mark_circle);
                }
                TuxIconView tuxIconView7 = this.LLJIJIL;
                if (tuxIconView7 != null) {
                    tuxIconView7.setTintColorRes(R.attr.ee);
                }
                C426320Gne c426320Gne4 = this.LLJILJIL;
                if (c426320Gne4 != null) {
                    C786410Ut5.LLLZZ(c426320Gne4, 8);
                }
                TuxTextView tuxTextView3 = this.LLJILJILJ;
                if (tuxTextView3 == null) {
                    return;
                }
                tuxTextView3.setText(C20642515q3.LJI(2131850027));
                return;
            }
        }
        ViewGroup viewGroup2 = this.LLJI;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
    }

    public static void R5(Bitmap bitmap, ImageView imageView) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                imageView.setImageBitmap(bitmap);
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJ(e2);
                C2344809Gs.LIZ(e2);
            }
        }
    }

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) throws JSONException {
        L5((C0M0P) c561950M2f, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(X.C0M0P r12, boolean r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.adapter.viewholder.NewDraftViewHolder.L5(X.0M0P, boolean):void");
    }

    public final void P5(final C0M0P c0m0p, final C0M3I c0m3i) {
        Bitmap bitmapLIZLLL = C1667500tUi.LIZLLL(c0m0p.LJ);
        if (bitmapLIZLLL != null) {
            C1322110kVd c1322110kVd = this.LLJJIJI;
            if (c1322110kVd == null) {
                c1322110kVd = null;
            }
            c0m3i.LIZ(bitmapLIZLLL, c1322110kVd);
            return;
        }
        final AwemeDraft awemeDraftLIZ = this.LLILLJJLI.LIZ(c0m0p.LJ);
        if (awemeDraftLIZ == null) {
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(": bindDraftCover -> draft is null");
            C201955140j.LJII(c0may, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("queryNull -> ");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(" : bindDraftCover");
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int dimensionPixelOffset = this.LLILZ.getResources().getDimensionPixelOffset(R.dimen.to);
        C0MZ9.LJIIIIZZ(awemeDraftLIZ, new VideoCoverConfig(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888), new IEffectService.OnVideoCoverCallback() { // from class: X.0M38
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
                C0MAY c0may2 = C0MAY.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LIZ.LLILLL);
                sbLIZ3.append(" :onGetVideoCoverFailed: errorCode = ");
                sbLIZ3.append(i);
                C201955140j.LJII(c0may2, C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                C0MAY c0may2 = C0MAY.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LIZ.LLILLL);
                sbLIZ3.append(" : onGetVideoCoverSuccess bindDraftCover -> creationId = ");
                sbLIZ3.append(c0m0p.LJ);
                C201955140j.LJIILJJIL(c0may2, C2188811AlT.LIZIZ(sbLIZ3));
                if (bitmap.isRecycled()) {
                    return;
                }
                C1667500tUi.LIZJ(bitmap, c0m0p.LJ);
                C1322110kVd c1322110kVd2 = this.LIZ.LLJJIJI;
                C1322110kVd c1322110kVd3 = null;
                if (c1322110kVd2 == null) {
                    c1322110kVd2 = null;
                }
                if (c1322110kVd2.getTag() != null) {
                    C1322110kVd c1322110kVd4 = this.LIZ.LLJJIJI;
                    if (c1322110kVd4 == null) {
                        c1322110kVd4 = null;
                    }
                    if (Intrinsics.LJFF(c1322110kVd4.getTag(), awemeDraftLIZ.LIZJ())) {
                        C0M3I c0m3i2 = c0m3i;
                        C1322110kVd c1322110kVd5 = this.LIZ.LLJJIJI;
                        if (c1322110kVd5 != null) {
                            c1322110kVd3 = c1322110kVd5;
                        }
                        c0m3i2.LIZ(bitmap, c1322110kVd3);
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0M3L] */
    public NewDraftViewHolder(View view, C0M3H c0m3h, C561140Lzc c561140Lzc) {
        C19EG c19egLIZIZ;
        Lifecycle lifecycle;
        IExternalService iExternalService;
        IAILiveService aILiveService;
        super(view);
        this.LL = c0m3h;
        this.LLILLJJLI = c561140Lzc;
        this.LLILLL = "NewDraftViewHolder";
        this.LLILZ = view.getContext();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(view, 478));
        this.LLJJL = new Object() { // from class: X.0M3L
        };
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.eqx);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.tv_play_count);
        this.LLJJIJI = (C1322110kVd) q0.LJIILLIIL(R.id.cover, view);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.tv_top);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.video_info_container);
        this.LLJ = (ViewGroup) view.findViewById(R.id.xlh);
        this.LLJI = (ViewGroup) view.findViewById(R.id.xeq);
        this.LLJIJIL = (TuxIconView) view.findViewById(R.id.k46);
        this.LLJILJIL = (C426320Gne) view.findViewById(R.id.s9t);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.tv_status);
        this.LLJJI = (TextView) q0.LJIILLIIL(R.id.zj_, view);
        this.LLJILLL = (ViewGroup) q0.LJIILLIIL(R.id.vdm, view);
        this.LLJJIII = (C0HZQ) q0.LJIILLIIL(R.id.dqk, view);
        this.LLJJ = (TuxIconView) view.findViewById(R.id.lt0);
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        ViewGroup viewGroup = this.LLILZLL;
        C0M3E c0m3eLJIIJJI = c1ee2.LJIIJJI(viewGroup == null ? null : viewGroup);
        this.LLJJIJIL = c0m3eLJIIJJI;
        c0m3eLJIIJJI = c0m3eLJIIJJI == null ? null : c0m3eLJIIJJI;
        TuxTextView tuxTextView = this.LLILZIL;
        c0m3eLJIIJJI.LIZ(tuxTextView == null ? null : tuxTextView);
        C0M3E c0m3e = this.LLJJIJIL;
        c0m3e = c0m3e == null ? null : c0m3e;
        C0HZQ c0hzq = this.LLJJIII;
        c0m3e.LIZ(c0hzq == null ? null : c0hzq);
        C0M3E c0m3e2 = this.LLJJIJIL;
        (c0m3e2 == null ? null : c0m3e2).LIZJ(C0M3C.NOT_POST_MODE.getValue());
        ViewGroup viewGroup2 = this.LLILZLL;
        viewGroup2 = viewGroup2 == null ? null : viewGroup2;
        boolean z = true;
        if (!C0M0L.LIZ() && ((iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null)) == null || (aILiveService = iExternalService.getAILiveService()) == null || !aILiveService.isAILiveEnable())) {
            C547860LeC.LIZ.getClass();
            if (!C547860LeC.LIZ().LIZ() && !C286470BKr.LIZ()) {
                z = false;
            }
        }
        C0M3F c0m3fLJJLJLI = c1ee2.LJJLJLI(viewGroup2, z);
        this.LLJJJ = c0m3fLJJLJLI;
        if (c0m3fLJJLJLI != null) {
            TuxTextView tuxTextView2 = this.LLILZIL;
            c0m3fLJJLJLI.LIZ(tuxTextView2 == null ? null : tuxTextView2);
        }
        C0M3F c0m3f = this.LLJJJ;
        if (c0m3f != null) {
            C0HZQ c0hzq2 = this.LLJJIII;
            c0m3f.LIZ(c0hzq2 == null ? null : c0hzq2);
        }
        C0M3F c0m3f2 = this.LLJJJ;
        if (c0m3f2 != null) {
            c0m3f2.LIZJ(C0M3B.NOT_FROM_TARGET_MODE.getValue());
        }
        ViewGroup viewGroup3 = this.LLILZLL;
        C786410Ut5.K7(viewGroup3 == null ? null : viewGroup3, new C580840MqI(this, 2));
        ViewGroup viewGroup4 = this.LLILZLL;
        (viewGroup4 != null ? viewGroup4 : null).setOnLongClickListener(new ViewOnLongClickListenerC580930MqR(this, 4));
        if (C280830AzZ.LIZ() && (c19egLIZIZ = C1388190mED.LIZIZ(view.getContext())) != null && (lifecycle = c19egLIZIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1());
        }
    }
}
