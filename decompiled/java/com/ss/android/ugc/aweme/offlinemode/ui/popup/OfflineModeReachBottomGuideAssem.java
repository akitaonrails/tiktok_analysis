package com.ss.android.ugc.aweme.offlinemode.ui.popup;

import X.AbstractC1616100s9o;
import X.C01GW;
import X.C0S4J;
import X.C452501pT;
import X.C625430Og1;
import X.C625890Ogl;
import X.C625900Ogm;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1603270rp7;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS78S0200000_9;
import Y.ATListenerS443S0100000_9;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeReachBottomGuideAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class OfflineModeReachBottomGuideAssem extends BaseCellSlotComponent<OfflineModeReachBottomGuideAssem> {
    public View LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFFI;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1394));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1395));
    public final Rect LLLFF = new Rect();
    public final C625890Ogl LLLFZ = new InterfaceC1603270rp7() { // from class: X.0Ogl
        @Override // X.InterfaceC1603270rp7
        public final void onHide() {
            View view;
            if (this.LL.Bp()) {
                Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                if (aweme == null || AwemeBizExtKt.getOfflineUnwatchedCount(aweme) <= 0) {
                    OfflineModeReachBottomGuideAssem offlineModeReachBottomGuideAssem = this.LL;
                    if (offlineModeReachBottomGuideAssem.LLLFFI) {
                        C0S4J c0s4j = offlineModeReachBottomGuideAssem.LLLII;
                        boolean z = AbstractC1604130rqV.LIZLLL;
                        c0s4j.LIZ("[onHide]", null);
                        OfflineModeReachBottomGuideAssem offlineModeReachBottomGuideAssem2 = this.LL;
                        offlineModeReachBottomGuideAssem2.LLLFFI = false;
                        C724270Sb3 c724270Sb3 = offlineModeReachBottomGuideAssem2.LLJI;
                        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
                        if (C625430Og1.LIZ(videoItemParams != null ? videoItemParams.getAweme() : null)) {
                            View view2 = offlineModeReachBottomGuideAssem2.LLJZ;
                            if ((view2 != null && view2.getVisibility() == 0) || (view = offlineModeReachBottomGuideAssem2.LLJZ) == null || offlineModeReachBottomGuideAssem2.LLJZIJLIL) {
                                return;
                            }
                            offlineModeReachBottomGuideAssem2.LLJZIJLIL = true;
                            C786410Ut5.LJLLLLLL(0, offlineModeReachBottomGuideAssem2.LJJIJL());
                            C786410Ut5.LJLLLLLL(0, offlineModeReachBottomGuideAssem2.getContentView());
                            C786410Ut5.LJLLLLLL(0, view);
                            C786410Ut5.ed(view, C339190DRl.LIZ(255));
                            HandlerHook.viewPost(view, new ARunnableS78S0200000_9(view, offlineModeReachBottomGuideAssem2, 39));
                        }
                    }
                }
            }
        }

        @Override // X.InterfaceC1603270rp7
        public final void onShow() {
            if (this.LL.Bp()) {
                Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
                if (aweme == null || AwemeBizExtKt.getOfflineUnwatchedCount(aweme) <= 0) {
                    C0S4J c0s4j = this.LL.LLLII;
                    boolean z = AbstractC1604130rqV.LIZLLL;
                    c0s4j.LIZ("[onShow]", null);
                    OfflineModeReachBottomGuideAssem offlineModeReachBottomGuideAssem = this.LL;
                    offlineModeReachBottomGuideAssem.LLLFFI = true;
                    if (offlineModeReachBottomGuideAssem.LLJZIJLIL) {
                        offlineModeReachBottomGuideAssem.dismiss();
                    }
                }
            }
        }
    };
    public final C625900Ogm LLLI = new AbstractC1616100s9o() { // from class: X.0Ogm
        @Override // X.AbstractC1616100s9o, X.InterfaceC469360Ias
        public final void onPageScrolled(int i, float f, int i2) {
            if (!this.LL.Bp()) {
                return;
            }
            C0S4J c0s4j = this.LL.LLLII;
            boolean z = AbstractC1604130rqV.LIZLLL;
            c0s4j.LIZ("[dismiss][onPageChangeListener#onPageScrolled]", null);
            this.LL.dismiss();
        }
    };
    public final C0S4J LLLII = new C0S4J("offlineV2");

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dtw;
    }

    public final boolean Bp() {
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJLLL.getValue();
        Aweme awemeLLLLLJLJLL = iViewPagerComponentAbility != null ? iViewPagerComponentAbility.LLLLLJLJLL() : null;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return u.LJIJI(aweme != null ? aweme.getAid() : null, awemeLLLLLJLJLL != null ? awemeLLLLLJLJLL.getAid() : null, false);
    }

    public final void Ep() {
        if (this.LLL) {
            this.LLL = false;
            ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLJLLIL.getValue();
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.jb1(this.LLLFZ);
            }
        }
        if (this.LLLF) {
            this.LLLF = false;
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLJLLL.getValue();
            if (iViewPagerComponentAbility != null) {
                iViewPagerComponentAbility.dz2(this.LLLI);
            }
        }
    }

    public final void dismiss() {
        View view;
        if (this.LLJZIJLIL && (view = this.LLJZ) != null) {
            this.LLJZIJLIL = false;
            Ep();
            HandlerHook.viewPost(view, new ARunnableS78S0200000_9(view, this, 38));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Ep();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        super.onViewCreated(view);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        }
        if (!C625430Og1.LIZ(aweme)) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.pj6);
        this.LLJZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GQW
                @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
                public final Shader resize(int i, int i2) {
                    return new LinearGradient(0.0f, 0.0f, 0.0f, i2, new int[]{0, -1728053248, -436207616}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP);
                }
            });
            viewFindViewById.setBackground(paintDrawable);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.pj2);
        if (tuxIconView != null) {
            tuxIconView.setTintColor(-1);
        }
        TextView textView = (TextView) view.findViewById(R.id.pj7);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.pj4);
        if (textView2 != null) {
            textView2.setTextColor(-1);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.pj3);
        if (tuxTextView != null) {
            tuxTextView.setTextColor(-16777216);
            C786410Ut5.h9(tuxTextView, new ACListenerS144S0100000_9(this, 84));
        }
        view.setOnTouchListener(new ATListenerS443S0100000_9(this, 3));
        if (!this.LLL) {
            this.LLL = true;
            ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLJLLIL.getValue();
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.p41(this.LLLFZ);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        if (!this.LLL) {
            this.LLL = true;
            ILoadMoreAbility iLoadMoreAbility = (ILoadMoreAbility) this.LLJLLIL.getValue();
            if (iLoadMoreAbility != null) {
                iLoadMoreAbility.p41(this.LLLFZ);
            }
        }
    }
}
