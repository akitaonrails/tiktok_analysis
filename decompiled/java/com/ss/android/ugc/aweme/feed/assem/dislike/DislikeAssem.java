package com.ss.android.ugc.aweme.feed.assem.dislike;

import X.C01GW;
import X.C0CNO;
import X.C0HHT;
import X.C0PEM;
import X.C0SXF;
import X.C1295950jpR;
import X.C13LE;
import X.C1491980ovc;
import X.C1491990ovd;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20684915wt;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C2548209yi;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C487560JAc;
import X.C584850Mwl;
import X.C694180RKu;
import X.C695390RPl;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724750Sbp;
import X.C730480Sl4;
import X.C731100Sm4;
import X.C731190SmD;
import X.C731200SmE;
import X.C731220SmG;
import X.C731230SmH;
import X.C731240SmI;
import X.C735370Ssx;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C739020Syq;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817503Hh;
import X.EnumC1492100ovo;
import X.EnumC700430Rdh;
import X.InterfaceC1554640qYg;
import X.InterfaceC1565640qqQ;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ACListenerS115S0200000_11;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes12.dex */
public final class DislikeAssem extends BaseCellSlotComponent<DislikeAssem> implements ComponentPriorityProtocol, InterfaceC1565640qqQ, IDislikeAbility, InterfaceC1554640qYg {
    public static final C731240SmI LLLIIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIIL;
    public static final Keva LLLIIIL;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(68));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS243S0000000_11.get$arr$(69));
    public TextView LLJZ;
    public C731200SmE LLJZIJLIL;
    public Drawable LLL;
    public Aweme LLLF;
    public VideoItemParams LLLFF;
    public C731190SmD LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public IViewPagerComponentAbility LLLI;
    public final C01GW LLLII;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0SmI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DislikeAssem.class, "rightAreaVM", "getRightAreaVM()Lcom/ss/android/ugc/aweme/feed/assem/container/RightAreaContainerVM;", 0);
        C13LE.LIZ.getClass();
        LLLIIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIII = new Object() { // from class: X.0SmI
        };
        LLLIIIL = Keva.getRepo("dislike_to_main");
    }

    public DislikeAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RightAreaContainerVM.class);
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 227), null, AFwS243S0000000_11.get$arr$(67));
        this.LLLII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 226));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_dislike";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9v;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1491980ovc.LIZ.LIZ(new C1491990ovd("VideoDislikeAssem_SubscribeAsync", true, EnumC1492100ovo.ASYNC_PRIORITY, -20), null, new C731100Sm4(new AwS555S0100000_11(this, 1617)));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFeedPanelPlatformAbility.class, null);
        this.LLLI = iFeedPanelPlatformAbility != null ? iFeedPanelPlatformAbility.Mb() : null;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0SmF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(48), 6);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -828499948) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final void Gp() {
        C731200SmE c731200SmE;
        if (C2548209yi.LIZ) {
            Context context = getContext();
            if (context == null || (c731200SmE = this.LLJZIJLIL) == null) {
                return;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = C695390RPl.LJ ? R.raw.icon_color_thumbs_down_fill : R.raw.icon_heart_broken_fill;
            c731200SmE.setImageDrawable(c419910GdJ.LIZ(context));
            return;
        }
        C731200SmE c731200SmE2 = this.LLJZIJLIL;
        if (c731200SmE2 != null) {
            Drawable drawable = c731200SmE2.getDrawable();
            if (drawable != null && !(drawable instanceof C1295950jpR) && drawable.getIntrinsicWidth() > 0) {
                drawable.getIntrinsicWidth();
            }
            c731200SmE2.setAnimation(c731200SmE2.LLILLJJLI);
            if (c731200SmE2.LLILZ == null) {
                c731200SmE2.LLILZ = new C731230SmH();
            }
            c731200SmE2.removeAnimatorListener(c731200SmE2.LLILZ);
            c731200SmE2.addAnimatorListener(c731200SmE2.LLILZ);
            c731200SmE2.playAnimation();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final void Bp(boolean z) {
        Aweme aweme;
        String str;
        String str2;
        String str3;
        if (z && (aweme = this.LLLF) != null && AwemeBizExtKt.isUserDislike(aweme)) {
            C0CNO.LIZLLL(0L, new AwS555S0100000_11(this, 225));
            VideoItemParams videoItemParams = this.LLLFF;
            String str4 = "";
            if (videoItemParams == null || (str = videoItemParams.mEventType) == null) {
                str = "";
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ.plus(new C739020Syq(CoroutineExceptionHandler.LJJLIL, 2)), null, new C730480Sl4(this, str, null), 2);
            VideoItemParams videoItemParams2 = this.LLLFF;
            if (videoItemParams2 == null || (str2 = videoItemParams2.mEventType) == null) {
                str2 = "";
            }
            VideoItemParams videoItemParams3 = this.LLLFF;
            if (videoItemParams3 != null && (str3 = videoItemParams3.mEventType) != null) {
                str4 = str3;
            }
            Ep(str2, str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(com.ss.android.ugc.aweme.feed.model.VideoItemParams r24) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.dislike.DislikeAssem.Fp(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        StateListDrawable stateListDrawable;
        int i;
        super.onViewCreated(view);
        this.LLJZIJLIL = (C731200SmE) getContentView().findViewById(R.id.fxq);
        this.LLJZ = (TextView) getContentView().findViewById(R.id.fxl);
        Context context = view.getContext();
        boolean z = true;
        if (context != null && context.getResources() != null) {
            stateListDrawable = new StateListDrawable();
            boolean z2 = C695390RPl.LJ;
            int i2 = R.raw.icon_heart_broken_fill;
            if (z2) {
                i = R.raw.icon_color_thumbs_down_fill;
            } else {
                i = R.raw.icon_heart_broken_fill;
            }
            TuxIconDrawable tuxIconDrawableLIZIZ = C487560JAc.LIZIZ(i, R.attr.ef, context);
            if (z2) {
                i2 = R.raw.icon_color_red_thumbs_down_fill;
            }
            TuxIconDrawable tuxIconDrawableLIZIZ2 = C487560JAc.LIZIZ(i2, R.attr.a04, context);
            stateListDrawable.addState(new int[]{-16842913}, tuxIconDrawableLIZIZ);
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, tuxIconDrawableLIZIZ2);
        } else {
            stateListDrawable = null;
        }
        this.LLL = stateListDrawable;
        if (this.LLLFFI == null) {
            C731190SmD c731190SmD = new C731190SmD();
            this.LLLFFI = c731190SmD;
            Context context2 = getContext();
            if (context2 == null || C0SXF.LJIL(context2)) {
                z = false;
            }
            c731190SmD.LIZ = z;
        }
        C731190SmD c731190SmD2 = this.LLLFFI;
        if (c731190SmD2 != null) {
            c731190SmD2.LIZJ = LJJIJL();
            c731190SmD2.LIZLLL = getContentView();
            c731190SmD2.LJ = getContentView().findViewById(R.id.fxk);
            c731190SmD2.LJI = (TuxTextView) view.findViewById(R.id.fxl);
            c731190SmD2.LJFF = getContentView().findViewById(R.id.fxq);
        }
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLLFZ;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLIIIIL;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0RQr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C695520RPy) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(278), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFZ.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0RPz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C695520RPy) obj).LLILLL);
            }
        }, null, AFwS294S0000000_11.get$arr$(279), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme;
        if (Collections.singletonList("homepage_hot").contains(videoItemParams.mEventType) || C1697810uHb.LJIIJJI("homepage_playmode_top", "homepage_playmode_new", "homepage_playmode_moodboost").contains(videoItemParams.mEventType)) {
            return true;
        }
        if (C1697810uHb.LJIIJJI("homepage_follow", "others_homepage").contains(videoItemParams.mEventType) && (aweme = videoItemParams.getAweme()) != null && AwemeExtKt.isAdTraffic(aweme)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        CharSequence text;
        float fMeasureText;
        int i;
        CharSequence text2;
        TextView textView;
        TextPaint paint;
        VideoItemParams videoItemParams2 = videoItemParams;
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLLII.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
        C786410Ut5.LJLLLLLL(0, getContentView());
        C731200SmE c731200SmE = this.LLJZIJLIL;
        if (c731200SmE != null) {
            int visibility = c731200SmE.getVisibility();
            c731200SmE.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c731200SmE);
        }
        Context context = getContext();
        CharSequence text3 = null;
        if (context != null) {
            text = context.getText(2131828428);
        } else {
            text = null;
        }
        TextView textView2 = this.LLJZ;
        if (textView2 != null) {
            Context context2 = getContext();
            if (context2 != null) {
                text3 = context2.getText(2131828428);
            }
            textView2.setText(text3);
        }
        TextView textView3 = this.LLJZ;
        if (textView3 != null && (paint = textView3.getPaint()) != null) {
            fMeasureText = paint.measureText(String.valueOf(text));
        } else {
            fMeasureText = 0.0f;
        }
        if (fMeasureText > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C731220SmG.LIZLLL))) && (textView = this.LLJZ) != null) {
            textView.setText("");
        }
        TextView textView4 = this.LLJZ;
        if (textView4 != null && (text2 = textView4.getText()) != null && text2.length() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        FeedRightBtnBaseViewModel feedRightBtnBaseViewModel = (FeedRightBtnBaseViewModel) this.LLLFZ.getValue(this, LLLIIIIL[0]);
        feedRightBtnBaseViewModel.updateOrigin(i);
        int forceTextVisible = feedRightBtnBaseViewModel.getForceTextVisible();
        TextView textView5 = this.LLJZ;
        if (textView5 != null) {
            C786410Ut5.LLIL(textView5, forceTextVisible);
        }
        this.LLLF = videoItemParams2.getAweme();
        this.LLLFF = videoItemParams2;
        if (videoItemParams2.getAweme() != null) {
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme != null && aweme.isLike()) {
                AwemeBizExtKt.setUserDislike(videoItemParams2.getAweme(), 0);
            }
            C731200SmE c731200SmE2 = this.LLJZIJLIL;
            if (c731200SmE2 != null) {
                c731200SmE2.setImageDrawable(this.LLL);
            }
            C731200SmE c731200SmE3 = this.LLJZIJLIL;
            if (c731200SmE3 != null) {
                c731200SmE3.setSelected(AwemeBizExtKt.isUserDislike(videoItemParams2.getAweme()));
            }
            setComponentClickStatusExperimental(getContentView(), EnumC700430Rdh.POSITIVE);
            C786410Ut5.I7(new ACListenerS115S0200000_11(this, videoItemParams2, 45), getContentView());
            C786410Ut5.I7(new ACListenerS115S0200000_11(this, videoItemParams2, 46), LJJIJL());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    public final void Ep(String str, String str2) {
        Aweme aweme = this.LLLF;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
        c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        C20684915wt.LJFF("dislike_cancel", c2344009Gk.LIZ);
    }
}
