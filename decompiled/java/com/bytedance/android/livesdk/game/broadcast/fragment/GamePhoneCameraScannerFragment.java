package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C098200Yq;
import X.C0IGR;
import X.C0IJR;
import X.C0JDJ;
import X.C0OM1;
import X.C0PEM;
import X.C0TJN;
import X.C0TJO;
import X.C1143680frq;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1388190mED;
import X.C1685300txQ;
import X.C189200o6;
import X.C19287310cx;
import X.C19EG;
import X.C19GS;
import X.C1AKO;
import X.C21648719nx;
import X.C2296808zG;
import X.C23250099c;
import X.C313900CSe;
import X.C426750GoL;
import X.C465220IMe;
import X.C497740JfY;
import X.C743540TEq;
import X.C786410Ut5;
import X.InterfaceC197023126r;
import Y.ATListenerS446S0100000_12;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.comp.api.game.GameLivePhoneCameraLinkType;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePhoneCameraScannerFragment extends BaseFragment implements C0JDJ, C0IGR, C1AKO {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLB87JyspCi4+LTctGiwyJispOwkhKSIhLCEn";
    public SurfaceView LL;
    public C0TJN LLILLJJLI;
    public ImageView LLILLL;
    public FrameLayout LLILZ;
    public TuxNavBar LLILZIL;
    public boolean LLILZLL;
    public ScaleGestureDetector LLIZ;
    public GestureDetector LLIZLLLIL;
    public float LLJ = 1.0f;
    public GestureDetector LLJI;
    public boolean LLJIJIL;
    public DataChannel LLJILJIL;

    @Override // X.C1AKO
    public final void finish() {
    }

    @Override // X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        return false;
    }

    public final void NR() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f - (this.LLILLL != null ? r0.getHeight() : 0.0f), (this.LLILZ != null ? r0.getHeight() : 0.0f) - ((int) C497740JfY.LIZIZ(20.0f)));
        translateAnimation.setDuration(2000L);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            imageView.startAnimation(translateAnimation);
        }
    }

    public final void initData() {
        Context context;
        SurfaceHolder holder;
        if (this.LLILZLL || (context = getContext()) == null) {
            return;
        }
        SurfaceView surfaceView = this.LL;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(new C0TJO(this, context, holder));
        }
        C0TJN c0tjn = this.LLILLJJLI;
        if (c0tjn != null) {
            ((C19287310cx) c0tjn).LIZ();
        }
        if (this.LLJI == null) {
            this.LLJI = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0TJQ
                public final float LL = 0.03f;
                public long LLILLJJLI;

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public final boolean onDoubleTap(MotionEvent motionEvent) {
                    IQRCodeScanner iQRCodeScanner;
                    IQRCodeScanner iQRCodeScanner2;
                    if (this.LLILLL.LLILLJJLI == null) {
                        return false;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LLILLJJLI < 500) {
                        return false;
                    }
                    this.LLILLJJLI = jCurrentTimeMillis;
                    if (this.LLILLL.LLJ <= 1.0f) {
                        while (true) {
                            GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment = this.LLILLL;
                            float f = gamePhoneCameraScannerFragment.LLJ;
                            if (f >= 3.0f) {
                                break;
                            }
                            float f2 = f + this.LL;
                            gamePhoneCameraScannerFragment.LLJ = f2;
                            C0TJN c0tjn2 = gamePhoneCameraScannerFragment.LLILLJJLI;
                            if (c0tjn2 != null && (iQRCodeScanner = ((C19287310cx) c0tjn2).LIZIZ) != null) {
                                iQRCodeScanner.zoomByRatio(f2);
                            }
                        }
                    } else {
                        while (true) {
                            GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment2 = this.LLILLL;
                            float f3 = gamePhoneCameraScannerFragment2.LLJ;
                            if (f3 <= 1.0f) {
                                break;
                            }
                            float f4 = f3 - this.LL;
                            gamePhoneCameraScannerFragment2.LLJ = f4;
                            C0TJN c0tjn3 = gamePhoneCameraScannerFragment2.LLILLJJLI;
                            if (c0tjn3 != null && (iQRCodeScanner2 = ((C19287310cx) c0tjn3).LIZIZ) != null) {
                                iQRCodeScanner2.zoomByRatio(f4);
                            }
                        }
                    }
                    return false;
                }
            });
        }
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new GestureDetector(getContext(), new C21648719nx() { // from class: X.0TJR
                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    return false;
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final void onLongPress(MotionEvent motionEvent) {
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final void onShowPress(MotionEvent motionEvent) {
                }

                @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    IQRCodeScanner iQRCodeScanner;
                    float fLJIIZILJ = C497740JfY.LJIIZILJ();
                    float fLJIILLIIL = C497740JfY.LJIILLIIL();
                    float x = motionEvent.getX() / fLJIIZILJ;
                    float y = motionEvent.getY() / fLJIILLIIL;
                    C0TJN c0tjn2 = this.LL.LLILLJJLI;
                    if (c0tjn2 != null && (iQRCodeScanner = ((C19287310cx) c0tjn2).LIZIZ) != null) {
                        iQRCodeScanner.processTouchEvent(x, y);
                        return true;
                    }
                    return true;
                }
            });
        }
        if (this.LLIZ == null) {
            Context context2 = getContext();
            this.LLIZ = context2 != null ? new ScaleGestureDetector(context2, new ScaleGestureDetector.OnScaleGestureListener() { // from class: X.0TJT
                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                    return true;
                }

                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
                @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onScale(android.view.ScaleGestureDetector r8) {
                    /*
                        r7 = this;
                        com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment r0 = r7.LL
                        X.0TJN r0 = r0.LLILLJJLI
                        r6 = 0
                        if (r0 != 0) goto L8
                        return r6
                    L8:
                        float r5 = r8.getScaleFactor()
                        r4 = 1065353216(0x3f800000, float:1.0)
                        int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                        r3 = 1028443341(0x3d4ccccd, float:0.05)
                        if (r0 < 0) goto L34
                        com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment r2 = r7.LL
                        float r1 = r2.LLJ
                        r0 = 1077936128(0x40400000, float:3.0)
                        int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                        if (r0 > 0) goto L34
                        float r1 = r1 + r3
                        r2.LLJ = r1
                    L22:
                        com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment r1 = r7.LL
                        X.0TJN r0 = r1.LLILLJJLI
                        if (r0 == 0) goto L33
                        float r1 = r1.LLJ
                        X.10cx r0 = (X.C19287310cx) r0
                        com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner r0 = r0.LIZIZ
                        if (r0 == 0) goto L33
                        r0.zoomByRatio(r1)
                    L33:
                        return r6
                    L34:
                        int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                        if (r0 >= 0) goto L22
                        com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment r2 = r7.LL
                        float r1 = r2.LLJ
                        int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                        if (r0 < 0) goto L22
                        float r1 = r1 - r3
                        r2.LLJ = r1
                        goto L22
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TJT.onScale(android.view.ScaleGestureDetector):boolean");
                }
            }) : null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0TJN c0tjn = this.LLILLJJLI;
        if (c0tjn != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C313900CSe((C19287310cx) c0tjn, null), 3);
        }
        this.LLILLJJLI = null;
        GestureDetector gestureDetector = this.LLJI;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        IQRCodeScanner iQRCodeScanner;
        super.onPause();
        C0TJN c0tjn = this.LLILLJJLI;
        if (c0tjn != null && (iQRCodeScanner = ((C19287310cx) c0tjn).LIZIZ) != null) {
            iQRCodeScanner.stopVE();
        }
        SurfaceView surfaceView = this.LL;
        if (surfaceView != null) {
            C786410Ut5.LLIIII(surfaceView, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r3 = this;
            super.onResume()
            android.content.Context r2 = r3.getContext()
            r1 = 0
            if (r2 == 0) goto L17
            X.12Lp r0 = X.C19741112Lp.LIZ
            r0.getClass()
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = X.C19741112Lp.LIZLLL(r2, r0)
            if (r0 != 0) goto L20
        L17:
            X.19EG r0 = r3.getActivity()
            if (r0 == 0) goto L20
            r0.finish()
        L20:
            android.view.SurfaceView r0 = r3.LL
            if (r0 == 0) goto L27
            X.C786410Ut5.LLIIII(r0, r1)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment.onResume():void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SurfaceView surfaceView = this.LL;
        if (surfaceView != null) {
            C786410Ut5.LLIIII(surfaceView, 8);
        }
        SurfaceView surfaceView2 = this.LL;
        if (surfaceView2 != null) {
            C786410Ut5.LLIIII(surfaceView2, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initData();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SurfaceView surfaceView;
        ImageView imageView;
        FrameLayout frameLayout;
        TuxNavBar tuxNavBar;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        TuxNavBar tuxNavBar2;
        View viewFindViewById5;
        C19EG c19egLIZIZ;
        View viewFindViewById6;
        TuxTextView tuxTextView;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLIZ = C0IJR.LIZ(new ViewModelProvider(this), this);
        this.LLJILJIL = dataChannelLIZ;
        dataChannelLIZ.zW(GameLivePhoneCameraLinkType.class, 0);
        View view2 = getView();
        View viewFindViewById7 = null;
        if (view2 != null) {
            surfaceView = (SurfaceView) view2.findViewById(R.id.wq8);
        } else {
            surfaceView = null;
        }
        this.LL = surfaceView;
        View view3 = getView();
        if (view3 != null) {
            imageView = (ImageView) view3.findViewById(R.id.u0t);
        } else {
            imageView = null;
        }
        this.LLILLL = imageView;
        View view4 = getView();
        if (view4 != null) {
            frameLayout = (FrameLayout) view4.findViewById(R.id.i9w);
        } else {
            frameLayout = null;
        }
        this.LLILZ = frameLayout;
        View view5 = getView();
        if (view5 != null) {
            tuxNavBar = (TuxNavBar) view5.findViewById(R.id.y08);
        } else {
            tuxNavBar = null;
        }
        this.LLILZIL = tuxNavBar;
        View view6 = getView();
        if (view6 != null && (tuxTextView = (TuxTextView) view6.findViewById(R.id.zd_)) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C19EG activity = getActivity();
        if (activity != null && (viewFindViewById6 = activity.findViewById(R.id.trr)) != null) {
            viewFindViewById6.setFitsSystemWindows(true);
            viewFindViewById6.setBackgroundColor(-16777216);
        }
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ, immersionBarLJIILJJIL);
            tuxImmersionBar.LIZJ(false, false);
            tuxImmersionBar.LJIIIZ(-16777216);
            tuxImmersionBar.LJFF(-16777216);
            immersionBarLJIILJJIL.LJII(false);
            tuxImmersionBar.LIZLLL();
        }
        View view7 = getView();
        if (view7 != null && (viewFindViewById5 = view7.findViewById(R.id.tsc)) != null) {
            viewFindViewById5.setOnTouchListener(new ATListenerS446S0100000_12(this, 1));
        }
        Context context2 = getContext();
        if (context2 != null && C426750GoL.LIZLLL(context2) && (tuxNavBar2 = this.LLILZIL) != null) {
            tuxNavBar2.setLayoutDirection(1);
        }
        TuxNavBar tuxNavBar3 = this.LLILZIL;
        if (tuxNavBar3 != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0TGT
                @Override // X.InterfaceC197023126r
                public final void LIZ() {
                    C19EG activity2 = this.LIZ.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
            };
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C497740JfY.LJIJI(2131853610);
            c1250250idj.LJFF = R.raw.icon_chevron_down;
            c1250250idj.LJI = null;
            c1250250idj.LIZ(new AwS556S0100000_12(this, 8));
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            c0om1.LIZLLL = false;
            tuxNavBar3.setNavActions(c0om1);
        }
        View view8 = getView();
        if (view8 != null) {
            viewFindViewById = view8.findViewById(R.id.t07);
        } else {
            viewFindViewById = null;
        }
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_game_demand_1", "game_scanner_rectangle_1.png");
        View view9 = getView();
        if (view9 != null) {
            viewFindViewById2 = view9.findViewById(R.id.t08);
        } else {
            viewFindViewById2 = null;
        }
        C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_game_demand_1", "game_scanner_rectangle_2.png");
        View view10 = getView();
        if (view10 != null) {
            viewFindViewById3 = view10.findViewById(R.id.t09);
        } else {
            viewFindViewById3 = null;
        }
        C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_game_demand_1", "game_scanner_rectangle_3.png");
        View view11 = getView();
        if (view11 != null) {
            viewFindViewById4 = view11.findViewById(R.id.t0_);
        } else {
            viewFindViewById4 = null;
        }
        C1143680frq.LIZLLL(viewFindViewById4, "tiktok_live_game_demand_1", "game_scanner_rectangle_4.png");
        View view12 = getView();
        if (view12 != null) {
            viewFindViewById7 = view12.findViewById(R.id.u0t);
        }
        C1143680frq.LIZLLL(viewFindViewById7, "tiktok_live_game_demand_1", "game_scanner_line.png");
        DataChannel dataChannel = this.LLJILJIL;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GameLivePhoneCameraLinkType.class, new AwS591S0100000_12(this, 21));
        }
        synchronized (this) {
            try {
                this.LLILZLL = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        initData();
        C743540TEq.LIZ = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hz7, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
