package com.ss.android.ugc.aweme.detail.ui.im;

import X.C01GW;
import X.C098200Yq;
import X.C0BBB;
import X.C0HU5;
import X.C0I0B;
import X.C0SR4;
import X.C0T2Y;
import X.C0W9A;
import X.C0YNY;
import X.C0Z92;
import X.C1375880luM;
import X.C1388190mED;
import X.C13LN;
import X.C140700gH;
import X.C1447800nmM;
import X.C14EU;
import X.C1602160rnK;
import X.C1606370ru7;
import X.C1606640ruY;
import X.C1607700rwG;
import X.C1607720rwI;
import X.C1607730rwJ;
import X.C1607740rwK;
import X.C1607840rwU;
import X.C1619980sG4;
import X.C1867480yhG;
import X.C189200o6;
import X.C19EG;
import X.C19ME;
import X.C2037707yZ;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23271099x;
import X.C278890AwR;
import X.C289540BWm;
import X.C452501pT;
import X.C486860J7k;
import X.C729980SkG;
import X.C740740T3w;
import X.C7826033w;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C888360Yt8;
import X.C901590ZYn;
import X.C909050ZlP;
import X.C909170Zlb;
import X.C912070ZqH;
import X.C948503nH;
import X.EnumC569750MWf;
import X.InterfaceC874680YTa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS146S0100000_11;
import Y.ACListenerS158S0100000_24;
import Y.ALAdapterS11S0300000_24;
import Y.ARunnableS124S0100000_24;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.exp.swap.PhotoSwapConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS55S0100100_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class IMDetailPageComponent extends DetailPageComponent {
    public View LLLJIL;
    public View LLLJL;
    public ViewStub LLLL;
    public ViewStub LLLLII;
    public ViewStub LLLLIIIILLL;
    public TuxIconView LLLLIIL;
    public ImageView LLLLIILL;
    public ImageView LLLLIILLL;
    public ViewStub LLLLIL;
    public ViewStub LLLLILI;
    public String LLLLJ;
    public boolean LLLLJI;
    public final C01GW LLLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(103));
    public boolean LLLLLIL;
    public C1607740rwK LLLLLILLIL;
    public IMFirstFrameViewModel LLLLLJIL;
    public final boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;

    public final void Fp() {
        if (this.LLLLIIL == null) {
            ViewStub viewStub = this.LLLLIIIILLL;
            View viewLJLLLL = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
            this.LLLLIIL = viewLJLLLL instanceof TuxIconView ? (TuxIconView) viewLJLLLL : null;
        }
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TuxIconView tuxIconView = this.LLLLIIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS158S0100000_24(this, 11));
        }
        TuxIconView tuxIconView2 = this.LLLLIIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void LJIJ() {
        int width;
        int height;
        final float height2;
        SAFTikTokFragment sAFTikTokFragment;
        String conversationId;
        if (Intrinsics.LJFF(this.LLJJL.getImAwemeOpenFrom(), C0Z92.PHOTO_SWAP_INBOX_ENTRANCE.getFrom()) && (conversationId = this.LLJJL.getConversationId()) != null) {
            C888360Yt8.LIZ(conversationId);
        }
        Bundle arguments = getFragment().getArguments();
        if (arguments != null && arguments.getBoolean("im_chat_to_detail_saf", false)) {
            C1606640ruY.LIZ.getClass();
            if (C1606640ruY.LIZ().exitAnim == 2 && !this.LLLLLLJ) {
                if (u.LJJIIJZLJL(C0W9A.LIZIZ(), "samsung", false)) {
                    Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
                    if ((fragmentLIZIZ instanceof DetailSafRootFragment) && (sAFTikTokFragment = (SAFTikTokFragment) fragmentLIZIZ) != null) {
                        View view = getFragment().getView();
                        sAFTikTokFragment.aS(new AwS55S0100100_24(this, view != null ? C1607840rwU.LJ(view) : 200L, 2));
                    }
                    super.LJIJ();
                    return;
                }
                final View view2 = getFragment().getView();
                if (view2 == null) {
                    super.LJIJ();
                    return;
                }
                Fragment fragmentLIZIZ2 = C1606370ru7.LIZIZ(getFragment());
                if (!(fragmentLIZIZ2 instanceof DetailSafRootFragment)) {
                    super.LJIJ();
                    return;
                }
                Bundle arguments2 = getFragment().getArguments();
                if (arguments2 == null || !arguments2.getBoolean("im_detail_exit_anchor_present", false)) {
                    super.LJIJ();
                    return;
                }
                C1607730rwJ c1607730rwJ = new C1607730rwJ(arguments2.getInt("im_detail_exit_anchor_start_x", 0), arguments2.getInt("im_detail_exit_anchor_start_y", 0), arguments2.getInt("im_detail_exit_anchor_width", 0), arguments2.getInt("im_detail_exit_anchor_height", 0), arguments2.getBoolean("im_detail_exit_anchor_with_alpha", false), arguments2.getBoolean("im_detail_exit_anchor_center_origin", false));
                this.LLLLLLJ = true;
                SAFFragmentRootScene sAFFragmentRootSceneIb = ((SAFTikTokFragment) fragmentLIZIZ2).ib();
                if (sAFFragmentRootSceneIb != null) {
                    EnumC569750MWf enumC569750MWf = EnumC569750MWf.TO_TRANSLUCENT;
                    NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(sAFFragmentRootSceneIb);
                    if (navigationSceneLIZ != null) {
                        navigationSceneLIZ.LLLILZ(sAFFragmentRootSceneIb, enumC569750MWf);
                    }
                }
                if (c1607730rwJ.LJFF) {
                    width = view2.getWidth() / 2;
                    height = view2.getHeight() / 2;
                    height2 = 0.0f;
                } else {
                    width = c1607730rwJ.LIZ;
                    height = c1607730rwJ.LIZIZ;
                    float width2 = view2.getWidth() != 0 ? c1607730rwJ.LIZJ / view2.getWidth() : 0.0f;
                    height2 = view2.getHeight() != 0 ? c1607730rwJ.LIZLLL / view2.getHeight() : 0.0f;
                    f = width2;
                }
                view2.setPivotX(width);
                view2.setPivotY(height);
                Interpolator interpolatorLIZJ = C1619980sG4.LIZJ();
                long jLJ = C1607840rwU.LJ(view2);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(jLJ);
                valueAnimatorOfFloat.setInterpolator(interpolatorLIZJ);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0FPk
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        C786410Ut5.Ob(view2, ((f - 1.0f) * fFloatValue) + 1.0f);
                        C786410Ut5.pc(view2, ((height2 - 1.0f) * fFloatValue) + 1.0f);
                        C786410Ut5.T4(view2, 1.0f - C13LZ.LIZLLL((fFloatValue - 0.5f) / 0.5f, 0.0f, 1.0f));
                    }
                });
                valueAnimatorOfFloat.addListener(new ALAdapterS11S0300000_24(view2, fragmentLIZIZ2, this, 1));
                valueAnimatorOfFloat.start();
                return;
            }
        }
        super.LJIJ();
    }

    public final void Qp() {
        TuxIconView tuxIconView = this.LLLLIIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        if (yp()) {
            ep();
        } else if (!((Boolean) C140700gH.LIZIZ.getValue()).booleanValue()) {
            dp();
        }
        View view2 = this.LLLJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLLJL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        Up();
        Tp();
        View view4 = this.LLJJJ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
    }

    public final void Tp() {
        ImageView imageView;
        if (((Number) C278890AwR.LIZ.getValue()).intValue() == 0 || (imageView = this.LLLLIILLL) == null) {
            return;
        }
        C786410Ut5.LJZI(8, imageView);
    }

    public final void Up() {
        ImageView imageView = this.LLLLIILL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
    }

    public final void Vp() {
        VerticalViewPager verticalViewPager;
        if (this.LLLLLL) {
            return;
        }
        this.LLLLLL = true;
        if (this.LLLLLLIL) {
            this.LLLLLLIL = false;
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            Aweme item = null;
            if (detailFragmentPanel != null && (verticalViewPager = detailFragmentPanel.LLJJIJI) != null) {
                int currentItem = verticalViewPager.getCurrentItem();
                C0SR4 c0sr4 = detailFragmentPanel.LLJL;
                if (c0sr4 != null) {
                    item = c0sr4.getItem(currentItem);
                }
            }
            Ep(item);
        }
    }

    public final void Xp() {
        C19ME c19me = null;
        if (this.LLJJJ == null) {
            ViewStub viewStub = this.LLJJJIL;
            this.LLJJJ = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
        }
        View view = this.LLJJJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 55), view);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJJ;
        ViewGroup.LayoutParams layoutParams = view3 != null ? view3.getLayoutParams() : null;
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            c19me.endToEnd = 0;
            c19me.topToTop = 0;
        }
        View view4 = this.LLJJJ;
        if (view4 != null) {
            C786410Ut5.W5(view4, c19me);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void bp() {
        View view;
        if (TextUtils.equals("from_chat", this.LLJJL.getFrom()) || (view = this.LLJJJ) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IMDetailPageComponent() {
        /*
            r1 = this;
            r1.<init>()
            r0 = 103(0x67, float:1.44E-43)
            kotlin.jvm.internal.AFwS213S0000000_24 r0 = kotlin.jvm.internal.AFwS213S0000000_24.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            r1.LLLLL = r0
            boolean r0 = X.C1606640ruY.LIZJ()
            if (r0 == 0) goto L2a
            X.0ruY r0 = X.C1606640ruY.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.common.experiment.IMChatToDetailSafConfig r0 = X.C1606640ruY.LIZ()
            boolean r0 = r0.deferBizLogic
            if (r0 == 0) goto L2a
            r0 = 1
        L23:
            r1.LLLLLJLJLL = r0
            r0 = r0 ^ 1
            r1.LLLLLL = r0
            return
        L2a:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent.<init>():void");
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void ip() {
        super.ip();
        Vp();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onDestroyView() {
        if (C289540BWm.LIZ()) {
            C1607740rwK c1607740rwK = this.LLLLLILLIL;
            if (c1607740rwK != null) {
                HandlerHook.viewRemoveCallbacks(c1607740rwK, c1607740rwK.LLILZ);
                c1607740rwK.animate().cancel();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1607740rwK);
                c1607740rwK.setAlpha(1.0f);
                int visibility = c1607740rwK.getVisibility();
                c1607740rwK.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c1607740rwK);
            }
            this.LLLLLILLIL = null;
            this.LLLLLJIL = null;
            C1607700rwG.LIZ();
        }
        super.onDestroyView();
    }

    public final void Ep(Aweme aweme) {
        String imMsgId;
        C869590Y9l c869590Y9lLJJJ = null;
        if (C0BBB.LIZ()) {
            DetailFragmentPanel detailFragmentPanel = this.LLJL;
            if (detailFragmentPanel != null) {
                C948503nH.LJ(detailFragmentPanel, C23271099x.INSTANCE, new C0HU5(this, aweme, null));
                return;
            }
            return;
        }
        Aweme awemeLIZLLL = C729980SkG.LIZLLL(aweme);
        Ip(aweme);
        C19EG activity = getActivity();
        if (activity != null) {
            C486860J7k.LIZIZ(activity).KQ2(!C1375880luM.LIZ(awemeLIZLLL));
        }
        if (C1375880luM.LIZIZ(awemeLIZLLL)) {
            Fp();
            Aweme awemeLIZLLL2 = C729980SkG.LIZLLL(So());
            if (awemeLIZLLL2 != null && (imMsgId = AwemeBizExtKt.getImMsgId(awemeLIZLLL2)) != null) {
                c869590Y9lLJJJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJJ(CastLongProtector.parseLong(imMsgId));
            }
            if (aweme != null) {
                Gp(aweme, c869590Y9lLJJJ);
            }
            Jp(c869590Y9lLJJJ, awemeLIZLLL, aweme);
            return;
        }
        Qp();
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void Ho(View view) {
        super.Ho(view);
        this.LLLLLILLIL = (C1607740rwK) view.findViewById(R.id.k7j);
        this.LLLLIIIILLL = (ViewStub) view.findViewById(R.id.o52);
        this.LLLLII = (ViewStub) view.findViewById(R.id.g1d);
        this.LLLL = (ViewStub) view.findViewById(R.id.g1e);
        this.LLLLIL = (ViewStub) view.findViewById(R.id.uzr);
        this.LLLLILI = (ViewStub) view.findViewById(R.id.acl);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r3.LLJL
            r2 = 0
            if (r0 == 0) goto L42
            android.view.View r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L42
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 != 0) goto L42
        L10:
            boolean r0 = X.C1575980r76.LJFF(r4)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r0 = r3.LLLII
            if (r0 == 0) goto L1d
            X.C339190DRl.LIZIZ(r0)
        L1d:
            if (r1 == 0) goto L2a
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r3.LLJL
            if (r0 == 0) goto L2a
            android.view.View r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L2a
            X.C339190DRl.LIZIZ(r0)
        L2a:
            return
        L2b:
            android.view.ViewGroup r0 = r3.LLLII
            if (r0 == 0) goto L32
            X.C339190DRl.LIZLLL(r0)
        L32:
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r3.LLJL
            if (r0 == 0) goto L2a
            android.view.View r0 = r0.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L2a
            if (r1 != 0) goto L3e
            r2 = 8
        L3e:
            X.C786410Ut5.LJLLLLLL(r2, r0)
            return
        L42:
            r1 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent.Ip(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void aq(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        View viewLJLLLL;
        ImageView imageView;
        C19ME c19me = null;
        if (this.LLLLIILL == null) {
            ViewStub viewStub = this.LLLLIL;
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            if (viewLJLLLL instanceof ImageView) {
                imageView = (ImageView) viewLJLLLL;
            } else {
                imageView = null;
            }
            this.LLLLIILL = imageView;
        }
        ImageView imageView2 = this.LLLLIILL;
        if (imageView2 != null) {
            C786410Ut5.Q7(imageView2, new ACListenerS146S0100000_11(this, 54));
        }
        ImageView imageView3 = this.LLLLIILL;
        if (imageView3 != null) {
            C786410Ut5.LJZI(0, imageView3);
        }
        ImageView imageView4 = this.LLLLIILL;
        if (imageView4 != null) {
            layoutParams = imageView4.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C19ME) {
            c19me = (C19ME) layoutParams;
        }
        if (z) {
            if (c19me != null) {
                c19me.endToStart = R.id.t8p;
                c19me.topToTop = R.id.t8p;
            }
        } else if (c19me != null) {
            c19me.endToEnd = 0;
            c19me.topToTop = 0;
        }
        ImageView imageView5 = this.LLLLIILL;
        if (imageView5 != null) {
            C786410Ut5.c6(imageView5, c19me);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPhotoModeFirstImage(C7826033w c7826033w) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPhotoModeFirstImage received: aid=");
        sbLIZ.append(c7826033w.LIZ);
        sbLIZ.append(", myAid=");
        sbLIZ.append(this.LLJJL.getAid());
        sbLIZ.append(", vm=");
        if (this.LLLLLJIL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        IMFirstFrameViewModel iMFirstFrameViewModel = this.LLLLLJIL;
        if (iMFirstFrameViewModel != null) {
            iMFirstFrameViewModel.LL.postValue(Boolean.TRUE);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onVideoFirstFrame(C2037707yZ c2037707yZ) {
        IMFirstFrameViewModel iMFirstFrameViewModel = this.LLLLLJIL;
        if (iMFirstFrameViewModel != null) {
            iMFirstFrameViewModel.LL.postValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Gp(com.ss.android.ugc.aweme.feed.model.Aweme r8, X.C869590Y9l r9) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent.Gp(com.ss.android.ugc.aweme.feed.model.Aweme, X.0Y9l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Wp(com.ss.android.ugc.aweme.feed.model.Aweme r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0HVH
            if (r0 == 0) goto L72
            r6 = r9
            X.0HVH r6 = (X.C0HVH) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto L78
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            X.0Y9l r1 = (X.C869590Y9l) r1
            if (r8 == 0) goto L2d
            r7.Gp(r8, r1)
        L2d:
            r7.Jp(r1, r3, r8)
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = X.C729980SkG.LIZLLL(r8)
            r7.Ip(r8)
            X.19EG r0 = r7.getActivity()
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = X.C486860J7k.LIZIZ(r0)
            boolean r0 = X.C1375880luM.LIZ(r3)
            r0 = r0 ^ 1
            r1.KQ2(r0)
        L50:
            boolean r0 = X.C1375880luM.LIZIZ(r3)
            if (r0 == 0) goto L6e
            r7.Fp()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0NbP r1 = new X.0NbP
            r0 = 0
            r1.<init>(r7, r0)
            r6.LL = r8
            r6.LLILLJJLI = r3
            r6.LLILZIL = r4
            java.lang.Object r1 = X.C23250099c.LJI(r6, r2, r1)
            if (r1 != r5) goto L26
            return r5
        L6e:
            r7.Qp()
            goto L30
        L72:
            X.0HVH r6 = new X.0HVH
            r6.<init>(r7, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent.Wp(com.ss.android.ugc.aweme.feed.model.Aweme, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onViewCreated(View view, Bundle bundle) {
        Object c098200Yq;
        String str;
        Serializable message;
        C869590Y9l c869590Y9l;
        Context context;
        Activity activityLIZ;
        String conversationId;
        Bundle arguments;
        String str2;
        super.onViewCreated(view, bundle);
        String imAwemeOpenFrom = this.LLJJL.getImAwemeOpenFrom();
        C0Z92 c0z92 = C0Z92.PHOTO_SWAP_REVEAL_BUTTON;
        boolean zLJFF = Intrinsics.LJFF(imAwemeOpenFrom, c0z92.getFrom());
        String strLJZL = null;
        if (zLJFF) {
            DetailNavArgModel navArgModel = this.LLJJL.getNavArgModel();
            if (navArgModel != null) {
                message = navArgModel.getMessage();
            } else {
                message = null;
            }
            if ((message instanceof C869590Y9l) && (c869590Y9l = (C869590Y9l) message) != null && ((C909170Zlb.LIZIZ() || !C909050ZlP.LIZIZ(c869590Y9l.getConversationId()) || !((PhotoSwapConfig) C1867480yhG.LIZIZ.getValue()).disableCameraOnControlGroup) && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (conversationId = c869590Y9l.getConversationId()) != null && (arguments = getFragment().getArguments()) != null)) {
                int i = arguments.getInt("chat_type", -1);
                C2189821An6 c2189821An6 = this.LLJJL;
                String imAwemeOpenFrom2 = c2189821An6.getImAwemeOpenFrom();
                if (Intrinsics.LJFF(imAwemeOpenFrom2, C0Z92.PHOTO_SWAP_INBOX_ENTRANCE.getFrom())) {
                    str2 = "photoswap_inbox_cell_icon";
                } else if (Intrinsics.LJFF(imAwemeOpenFrom2, c0z92.getFrom())) {
                    str2 = "photoswap_reply_message";
                } else {
                    str2 = "photoswap_reply_reveal";
                }
                C912070ZqH c912070ZqH = C912070ZqH.LIZIZ;
                c912070ZqH.LJIILIIL().LJIIIIZZ(activityLIZ, conversationId, i, c2189821An6.getChatFromUserId(), c2189821An6.getChatFromUserNickname(), "chat", null, null, "photoswap", null, new C901590ZYn("photo_swap_pong", String.valueOf(c869590Y9l.getMsgId()), str2), false, null, null, null, null, false, null, null, null, true, true, true, QuoteMode.None.INSTANCE, null, null);
                c912070ZqH.LJFF().LJIILLIIL(i, conversationId, c2189821An6.getChatFromUserId(), false, null, "photoswap", null, null, str2, C0I0B.LJFF.LIZIZ());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setupFakeCoverTransition: hasPending=");
        sbLIZ.append(C1607700rwG.LIZIZ());
        sbLIZ.append(", coverUrl=");
        String str3 = C1607700rwG.LIZ;
        if (str3 != null) {
            strLJZL = C13LN.LJZL(60, str3);
        }
        sbLIZ.append(strLJZL);
        C2188811AlT.LIZIZ(sbLIZ);
        String aid = this.LLJJL.getAid();
        C1607720rwI c1607720rwI = new C1607720rwI(this);
        if (C1607700rwG.LIZIZ()) {
            if (aid != null && (str = C1607700rwG.LJFF) != null && !Intrinsics.LJFF(aid, str)) {
                C1607700rwG.LIZ();
            } else {
                c1607720rwI.LIZ(C1607700rwG.LIZ, Float.valueOf(C1607700rwG.LIZIZ), Float.valueOf(C1607700rwG.LIZJ), C1607700rwG.LIZLLL, Boolean.valueOf(C1607700rwG.LJ), Boolean.valueOf(C1607700rwG.LJI), C1607700rwG.LJII, Float.valueOf(C1607700rwG.LJIIIIZZ), Float.valueOf(C1607700rwG.LJIIIZ), C1607700rwG.LJIIJ);
                C1607700rwG.LIZ();
            }
        }
        try {
            c098200Yq = getFragment().getViewLifecycleOwner();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Fragment fragment = getFragment();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = fragment;
        }
        C740740T3w.LIZ(getFragment(), (LifecycleOwner) c098200Yq, new C0T2Y() { // from class: X.0rwL
            @Override // X.C0T2Y
            public final void Y3(Aweme aweme) {
                IMDetailPageComponent iMDetailPageComponent = this.LL;
                if (!iMDetailPageComponent.LLLLLL) {
                    iMDetailPageComponent.LLLLLLIL = true;
                } else {
                    iMDetailPageComponent.Ep(aweme);
                }
            }
        });
        if (this.LLLLLJLJLL) {
            ARunnableS124S0100000_24 aRunnableS124S0100000_24 = new ARunnableS124S0100000_24(this, 20);
            C1606640ruY.LIZ.getClass();
            long integer = C1606640ruY.LIZ().enterAnimDuration;
            if (integer <= 0) {
                try {
                    integer = view.getContext().getResources().getInteger(R.integer.b0);
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    integer = 300;
                }
            }
            HandlerHook.viewPostDelay(view, aRunnableS124S0100000_24, integer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp(X.C869590Y9l r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.im.IMDetailPageComponent.Jp(X.0Y9l, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
