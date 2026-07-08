package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C09JN;
import X.C0IJT;
import X.C0J1N;
import X.C0OM1;
import X.C0TEL;
import X.C1143680frq;
import X.C11RD;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1388190mED;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C197039127h;
import X.C19EG;
import X.C1AKO;
import X.C20441214yg;
import X.C2188811AlT;
import X.C426750GoL;
import X.C474500IjA;
import X.C497740JfY;
import X.C743540TEq;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC197023126r;
import X.InterfaceC420801kM;
import Y.AAListenerS323S0100000_12;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.api.game.GameLivePhoneCameraLinkType;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.common.applog.AppLog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePhoneCameraWiredFragment extends BaseFragment implements C1AKO {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLB87JyspCi4+LTctHiYhLSEKOy40JSAiPQ==";
    public TuxNavBar LL;
    public ValueAnimator LLILLJJLI;
    public C197039127h LLILLL;
    public TuxTextView LLILZ;
    public ImageView LLILZIL;
    public LiveIconView LLILZLL;
    public boolean LLIZ;
    public List<? extends ImageView> LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC420801kM LLJI;
    public boolean LLJIJIL;
    public DataChannel LLJILJIL;
    public final AfS181S0100000_12 LLJILJILJ = new AfS181S0100000_12(this, 92);

    @Override // X.C1AKO
    public final void finish() {
    }

    @Override // X.C1AKO
    public final Fragment getFragment() {
        return this;
    }

    public final void NR() {
        ArrayList arrayList;
        AnimatorSet animatorSet;
        if (this.LLJ) {
            OR();
        }
        List<? extends ImageView> list = this.LLIZLLLIL;
        int i = 2;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (ImageView imageView : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                final ImageView imageView2 = imageView;
                if (imageView2 != null) {
                    long j = ((long) i2) * 400;
                    float[] fArr = new float[i];
                    // fill-array-data instruction
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.ALPHA, fArr);
                    objectAnimatorOfFloat.setStartDelay(j);
                    objectAnimatorOfFloat.setDuration(100L);
                    objectAnimatorOfFloat.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    float[] fArr2 = new float[i];
                    // fill-array-data instruction
                    fArr2[0] = 1.0f;
                    fArr2[1] = 1.48f;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_X, fArr2);
                    objectAnimatorOfFloat2.setStartDelay(j);
                    objectAnimatorOfFloat2.setDuration(400L);
                    objectAnimatorOfFloat2.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    float[] fArr3 = new float[i];
                    // fill-array-data instruction
                    fArr3[0] = 1.0f;
                    fArr3[1] = 1.48f;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_Y, fArr3);
                    objectAnimatorOfFloat3.setStartDelay(j);
                    objectAnimatorOfFloat3.setDuration(400L);
                    objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_X, 1.48f, 1.81f);
                    objectAnimatorOfFloat4.setDuration(600L);
                    objectAnimatorOfFloat4.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.SCALE_Y, 1.48f, 1.81f);
                    objectAnimatorOfFloat5.setDuration(600L);
                    objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat6.setStartDelay(100L);
                    objectAnimatorOfFloat6.setDuration(500L);
                    objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    final Class cls = Integer.TYPE;
                    ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(imageView2, (Property<ImageView, Integer>) new Property<View, Integer>(cls) { // from class: X.0Gss
                        @Override // android.util.Property
                        public final Integer get(View view) {
                            int iIntValue;
                            Integer num;
                            Object tag = imageView2.getTag(R.id.yut);
                            if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            return Integer.valueOf(iIntValue);
                        }

                        @Override // android.util.Property
                        public final void set(View view, Integer num) {
                            GradientDrawable gradientDrawable;
                            View view2 = view;
                            int iIntValue = num.intValue();
                            Drawable background = view2.getBackground();
                            if (background instanceof GradientDrawable) {
                                gradientDrawable = (GradientDrawable) background;
                            } else {
                                gradientDrawable = null;
                            }
                            int iLIZLLL = C497740JfY.LIZLLL(R.attr.ey_, view2.getContext());
                            if (gradientDrawable != null) {
                                gradientDrawable.setStroke(iIntValue, iLIZLLL);
                            }
                            view2.setTag(R.id.yut, Integer.valueOf(iIntValue));
                        }
                    }, (int) C497740JfY.LIZIZ(3.0f), (int) C497740JfY.LIZIZ(0.5f));
                    objectAnimatorOfInt.setStartDelay(j);
                    objectAnimatorOfInt.setDuration(1000L);
                    objectAnimatorOfInt.setInterpolator(new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    animatorSet4.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                    animatorSet2.playSequentially(animatorSet3, animatorSet4);
                    animatorSet = new AnimatorSet();
                    animatorSet.playTogether(animatorSet2, objectAnimatorOfInt);
                } else {
                    animatorSet = null;
                }
                arrayList.add(animatorSet);
                i2 = i3;
                i = 2;
            }
        } else {
            arrayList = null;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(arrayList);
        int[] iArr = new int[i];
        // fill-array-data instruction
        iArr[0] = 0;
        iArr[1] = 1;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.addListener(new AAListenerS323S0100000_12(animatorSet5, 5));
        this.LLILLJJLI = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
        this.LLJ = true;
    }

    public final void OR() {
        ValueAnimator valueAnimator = this.LLILLJJLI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        List<? extends ImageView> list = this.LLIZLLLIL;
        if (list != null) {
            for (ImageView imageView : list) {
                if (imageView != null) {
                    imageView.clearAnimation();
                }
            }
        }
        this.LLILLJJLI = null;
        this.LLJ = false;
    }

    public final void PR() {
        InterfaceC420801kM interfaceC420801kM = this.LLJI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C0J1N c0j1n = (C0J1N) C0TEL.LJII.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this));
        this.LLJI = c0j1n != null ? c0j1n.LIZ(this.LLJILJILJ, new C09JN() { // from class: X.0TEf
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GamePhoneCameraWiredFragment@5de1.subscribeLinkEvent$1");
                C20441214yg.LJI("GamePhoneCameraWiredFragment", (Throwable) obj);
                C1C7U.LIZIZ("GamePhoneCameraWiredFragment@5de1.subscribeLinkEvent$1");
            }
        }) : null;
    }

    @Override // X.C1AKO
    public final boolean onBackPressed() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackPressed, ");
        sbLIZ.append(this.LLIZ);
        C20441214yg.LIZIZ("GamePhoneCameraWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OR();
        DataChannel dataChannel = this.LLJILJIL;
        if (dataChannel != null) {
            dataChannel.zW(GameLivePhoneCameraLinkType.class, 0);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy, ");
        sbLIZ.append(this.LLIZ);
        C20441214yg.LIZIZ("GamePhoneCameraWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLIZ) {
            if (C0TEL.LIZLLL) {
                C0TEL.LIZJ();
            } else {
                C20441214yg.LIZIZ("GamePhoneAsCameraWiredManager", "destroyAndRelease, hasInit false,  disconnect");
            }
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OR();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyView, ");
        sbLIZ.append(this.LLIZ);
        C20441214yg.LIZIZ("GamePhoneCameraWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        TuxNavBar tuxNavBar;
        C197039127h c197039127h;
        TuxTextView tuxTextView;
        ImageView imageView;
        LiveIconView liveIconView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        TuxNavBar tuxNavBar2;
        C19EG c19egLIZIZ;
        boolean zLIZIZ;
        boolean zLIZIZ2;
        View viewFindViewById5;
        TuxTextView tuxTextView2;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            tuxNavBar = (TuxNavBar) view2.findViewById(R.id.y08);
        } else {
            tuxNavBar = null;
        }
        this.LL = tuxNavBar;
        View view3 = getView();
        if (view3 != null && (tuxTextView2 = (TuxTextView) view3.findViewById(R.id.zd_)) != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        C19EG activity = getActivity();
        if (activity != null && (viewFindViewById5 = activity.findViewById(R.id.trr)) != null) {
            viewFindViewById5.setFitsSystemWindows(false);
        }
        View view4 = getView();
        if (view4 != null) {
            c197039127h = (C197039127h) view4.findViewById(R.id.teh);
        } else {
            c197039127h = null;
        }
        this.LLILLL = c197039127h;
        View view5 = getView();
        if (view5 != null) {
            tuxTextView = (TuxTextView) view5.findViewById(R.id.epa);
        } else {
            tuxTextView = null;
        }
        this.LLILZ = tuxTextView;
        View view6 = getView();
        if (view6 != null) {
            imageView = (ImageView) view6.findViewById(R.id.hbb);
        } else {
            imageView = null;
        }
        this.LLILZIL = imageView;
        View view7 = getView();
        if (view7 != null) {
            liveIconView = (LiveIconView) view7.findViewById(R.id.w28);
        } else {
            liveIconView = null;
        }
        this.LLILZLL = liveIconView;
        C1143680frq.LIZLLL(this.LLILZLL, "tiktok_live_game_demand_1", "ttlive_ic_game_phone_camera_link.png");
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS147S0100000_12(this, 25));
        }
        ImageView[] imageViewArr = new ImageView[4];
        View view8 = getView();
        if (view8 != null) {
            viewFindViewById = view8.findViewById(R.id.dtz);
        } else {
            viewFindViewById = null;
        }
        imageViewArr[0] = viewFindViewById;
        View view9 = getView();
        if (view9 != null) {
            viewFindViewById2 = view9.findViewById(R.id.dti);
        } else {
            viewFindViewById2 = null;
        }
        imageViewArr[1] = viewFindViewById2;
        View view10 = getView();
        if (view10 != null) {
            viewFindViewById3 = view10.findViewById(R.id.f694dtj);
        } else {
            viewFindViewById3 = null;
        }
        imageViewArr[2] = viewFindViewById3;
        View view11 = getView();
        if (view11 != null) {
            viewFindViewById4 = view11.findViewById(R.id.f695dtk);
        } else {
            viewFindViewById4 = null;
        }
        imageViewArr[3] = viewFindViewById4;
        this.LLIZLLLIL = C1697810uHb.LJIIJJI(imageViewArr);
        Context context = getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            TuxNavBar tuxNavBar3 = this.LL;
            if (tuxNavBar3 != null) {
                tuxNavBar3.LJIJ(R.style.y0);
            }
        } else {
            TuxNavBar tuxNavBar4 = this.LL;
            if (tuxNavBar4 != null) {
                tuxNavBar4.LJIJ(R.style.y3);
            }
        }
        Context context2 = getContext();
        if (context2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(context2)) != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ, immersionBarLJIILJJIL);
            tuxImmersionBar.LIZJ(false, false);
            immersionBarLJIILJJIL.LJIIL();
            Context context3 = getContext();
            if (context3 != null) {
                zLIZIZ = C960203pA.LIZIZ(context3);
            } else {
                zLIZIZ = false;
            }
            immersionBarLJIILJJIL.LJIIJ(zLIZIZ);
            tuxImmersionBar.LJFF(-16777216);
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                zLIZIZ2 = C960203pA.LIZIZ(activity2);
            } else {
                zLIZIZ2 = false;
            }
            immersionBarLJIILJJIL.LJII(zLIZIZ2);
            tuxImmersionBar.LIZLLL();
        }
        Context context4 = getContext();
        if (context4 != null && C426750GoL.LIZLLL(context4) && (tuxNavBar2 = this.LL) != null) {
            tuxNavBar2.setLayoutDirection(1);
        }
        TuxNavBar tuxNavBar5 = this.LL;
        if (tuxNavBar5 != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0TF2
                @Override // X.InterfaceC197023126r
                public final void LIZ() {
                    FragmentManager supportFragmentManager;
                    C19EG activity3 = this.LIZ.getActivity();
                    if (activity3 != null && (supportFragmentManager = activity3.getSupportFragmentManager()) != null) {
                        supportFragmentManager.LJLLILLLL();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("touch left icon, ");
                    sbLIZ.append(this.LIZ.LLIZ);
                    C20441214yg.LIZIZ("GamePhoneCameraWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            c0om1.LJ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C497740JfY.LJIJI(2131853609);
            c1250250idj.LJFF = R.raw.icon_chevron_down;
            c1250250idj.LJI = null;
            c1250250idj.LIZ(new AwS556S0100000_12(this, 10));
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZJ(0);
            c0om1.LIZLLL = false;
            tuxNavBar5.setNavActions(c0om1);
        }
        NR();
        C0TEL.LJ();
        C0TEL.LIZIZ();
        PR();
        C743540TEq.LIZ = System.currentTimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_connect_page_action");
        c474500IjALIZ.LJJII("show", "action");
        c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
        c474500IjALIZ.LJJII("wired", "show_page");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            r3 = 0
            if (r0 == 0) goto L34
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L34
        Le:
            if (r0 == 0) goto L30
            r2 = 2131886953(0x7f120369, float:1.94085E38)
        L13:
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            X.19EG r0 = r4.getActivity()
            r1.<init>(r0, r2)
            android.view.LayoutInflater r1 = r5.cloneInContext(r1)
            r0 = 2131570069(0x7f0d2d95, float:1.8765782E38)
            android.view.View r3 = X.C786410Ut5.Td(r1, r0, r6, r3)
            boolean r0 = r3 instanceof android.view.View
            r2 = 0
            if (r0 != 0) goto L2d
            r3 = r2
        L2d:
            if (r3 == 0) goto L54
            goto L36
        L30:
            r2 = 2131886956(0x7f12036c, float:1.9408505E38)
            goto L13
        L34:
            r0 = 0
            goto Le
        L36:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L5a
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r3, r0)     // Catch: java.lang.Throwable -> L5a
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r3.setTag(r0, r4)     // Catch: java.lang.Throwable -> L5a
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L51
            r2 = r1
            X.19GS r2 = (X.C19GS) r2     // Catch: java.lang.Throwable -> L5a
        L51:
            X.C1685300txQ.LIZ(r2)     // Catch: java.lang.Throwable -> L5a
        L54:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5a
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5a
            return r3
        L5a:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraWiredFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
