package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.AbstractC1879030yzt;
import X.AbstractC20560715cr;
import X.C01GW;
import X.C1387230mCf;
import X.C13LE;
import X.C1558520qew;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C20555115bx;
import X.C20555215by;
import X.C20556915cF;
import X.C20557115cH;
import X.C20557715cN;
import X.C20557815cO;
import X.C20558115cR;
import X.C20558415cU;
import X.C20558515cV;
import X.C20559815ci;
import X.C20561315cx;
import X.C20564615dU;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690990R8n;
import X.C709080Rre;
import X.C709090Rrf;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1153720g82;
import X.InterfaceC1058490deR;
import X.InterfaceC1294060jmO;
import X.InterfaceC1554640qYg;
import X.InterfaceC20561815d2;
import X.InterfaceC20561915d3;
import X.InterfaceC494301wD;
import X.InterfaceC589490NAd;
import X.ViewOnLayoutChangeListenerC20346214jM;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class CellAdaptionComponentV2 extends BaseCellContentComponent<CellAdaptionComponentV2> implements CellAdaptionComponentAbility, InterfaceC1554640qYg {
    public FrameLayout LLJLLIL;
    public C709080Rre LLJLLL;
    public LinearLayout LLJZ;
    public FrameLayout LLJZIJLIL;
    public Integer LLLF;
    public Integer LLLFF;
    public boolean LLLI;
    public final C709090Rrf LLJJJJLIIL = new C709090Rrf("FeedCellAdaptionComponentV2");
    public final C01GW LLJJL = C452501pT.LIZIZ(new C20557715cN(this));
    public final C630740Ooa LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new C20558515cV(this));
    public final C630740Ooa LLJL = C628500Oky.LIZ(new C20555215by(this));
    public final C630740Ooa LLJLIL = C628500Oky.LIZ(new AwS575S0100000_31(this, 1219));
    public final C630740Ooa LLJLILLLLZIIL = C628500Oky.LIZ(new C20555115bx(this));
    public final C01GW LLJLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), new C20559815ci());
    public final C20558115cR LLL = new InterfaceC20561815d2<VideoAdaptionResult>() { // from class: X.15cR
        @Override // X.InterfaceC20561815d2
        public final void LIZ(C0RAA c0raa) {
            this.LIZ.zp((VideoAdaptionResult) c0raa);
        }
    };
    public final ViewOnLayoutChangeListenerC20346214jM LLLFFI = new View.OnLayoutChangeListener() { // from class: X.14jM
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            String aid;
            Integer num;
            final int i9 = i3 - i;
            final int i10 = i4 - i2;
            int i11 = i7 - i5;
            int i12 = i8 - i6;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onLayoutChange]");
            sbLIZ.append(", ");
            sbLIZ.append("aweme:");
            Aweme awemeKp = this.LL.kp();
            if (awemeKp != null) {
                aid = awemeKp.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(", ");
            sbLIZ.append("view:");
            this.LL.getClass();
            sbLIZ.append(CellAdaptionComponentV2.up(view));
            sbLIZ.append(", ");
            sbLIZ.append("w:");
            sbLIZ.append(i9);
            sbLIZ.append(", ");
            sbLIZ.append("h:");
            sbLIZ.append(i10);
            sbLIZ.append(", ");
            sbLIZ.append("oldw:");
            sbLIZ.append(i11);
            sbLIZ.append(", ");
            sbLIZ.append("oldh:");
            sbLIZ.append(i12);
            sbLIZ.append(", ");
            sbLIZ.append("left:");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append("top:");
            sbLIZ.append(i2);
            sbLIZ.append(", ");
            sbLIZ.append("transx:");
            sbLIZ.append(view.getTranslationX());
            sbLIZ.append(", ");
            sbLIZ.append("transy:");
            sbLIZ.append(view.getTranslationY());
            sbLIZ.append(", ");
            sbLIZ.append("visibility:");
            sbLIZ.append(view.getVisibility());
            sbLIZ.append(", ");
            C2188811AlT.LIZIZ(sbLIZ);
            if (view.getId() != this.LL.lp()) {
                return;
            }
            if (i9 == i11 && i10 == i12) {
                return;
            }
            Integer num2 = this.LL.LLLF;
            if (num2 == null || i9 != num2.intValue() || (num = this.LL.LLLFF) == null || i10 != num.intValue()) {
                this.LL.LLLF = Integer.valueOf(i9);
                this.LL.LLLFF = Integer.valueOf(i10);
                final CellAdaptionComponentV2 cellAdaptionComponentV2 = this.LL;
                HandlerHook.viewPost(view, new Runnable() { // from class: X.14jL
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CellAdaptionComponentV2@9ddc.viewChangeListener$1$1");
                        try {
                            cellAdaptionComponentV2.yp(EnumC1153720g82.CONTAINER_ADAPTION, Integer.valueOf(i9), Integer.valueOf(i10));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CellAdaptionComponentV2@9ddc.viewChangeListener$1$1");
                    }
                });
            }
        }
    };
    public final int LLLFZ = R.id.video_visible_area_container;

    public void Bp() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    @InterfaceC1294060jmO
    public void CX1(Context context, Aweme aweme, View view, View view2, OcrLocation ocrLocation, ViewGroup viewGroup) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean DP1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    @InterfaceC1294060jmO
    public final void FH1(Context context, Aweme aweme, View view, OcrLocation ocrLocation, ViewGroup viewGroup) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public void LJL() {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    @InterfaceC1294060jmO
    public final void M72(Context context, View view, Integer num, Integer num2, ViewGroup viewGroup, Aweme aweme) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public AdaptionPaddingValues Ns0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public int Sj0() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        for (View view : C1697810uHb.LJIIJJI(this.LLJLLIL, this.LLJZIJLIL, this.LLJLLL, this.LLJZ)) {
            if (view != null) {
                view.removeOnLayoutChangeListener(tp());
            }
        }
        op().LJ(this.LLL);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public boolean XG1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public boolean YP0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean ZY1(boolean z) {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public InterfaceC1058490deR dj2() {
        return null;
    }

    public InterfaceC589490NAd ep(Aweme aweme, int i, int i2) {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public boolean fk1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public String ip() {
        return "feed_cell";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public View jj1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public AdaptionPaddingValues n81() {
        return null;
    }

    public InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public C1387230mCf tK1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public AdaptionPaddingValues vk1() {
        return null;
    }

    public InterfaceC20561915d3 hp() {
        return new C20564615dU();
    }

    public final Aweme kp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams != null) {
            return videoItemParams.getAweme();
        }
        return null;
    }

    public final AbstractC20560715cr mp() {
        return (AbstractC20560715cr) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C20561315cx op() {
        return (C20561315cx) this.LLJJL.getValue();
    }

    public final IVideoCellAbility sp() {
        return (IVideoCellAbility) this.LLJL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final VideoAdaptionResult yc2() {
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout == null) {
            return null;
        }
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        Float fValueOf = Float.valueOf(frameLayout.getTranslationX());
        Float fValueOf2 = Float.valueOf(frameLayout.getTranslationY());
        Float.valueOf(0.0f);
        VideoAdaptionResult videoAdaptionResult = new VideoAdaptionResult(width, height, fValueOf, fValueOf2, null);
        videoAdaptionResult.isDimensionValid();
        return videoAdaptionResult;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public void unBind() {
        op().LLILZ = null;
        IVideoCellAbility iVideoCellAbilitySp = sp();
        View videoView = iVideoCellAbilitySp != null ? iVideoCellAbilitySp.getVideoView() : null;
        IVideoCellAbility iVideoCellAbilitySp2 = sp();
        View viewVy1 = iVideoCellAbilitySp2 != null ? iVideoCellAbilitySp2.Vy1() : null;
        FrameLayout frameLayout = this.LLJZIJLIL;
        if (frameLayout != null) {
            C786410Ut5.fd(frameLayout, 0.0f);
        }
        if (videoView != null) {
            C786410Ut5.ed(videoView, 0.0f);
        }
        FrameLayout frameLayout2 = this.LLJLLIL;
        if (frameLayout2 != null) {
            C786410Ut5.fd(frameLayout2, 0.0f);
        }
        if (viewVy1 != null) {
            C786410Ut5.ed(viewVy1, 0.0f);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final VideoAdaptionResult wB2() {
        return (VideoAdaptionResult) op().LLILZ;
    }

    public int lp() {
        return this.LLLFZ;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
    }

    public View.OnLayoutChangeListener tp() {
        return this.LLLFFI;
    }

    public static String up(View view) {
        int id = view.getId();
        if (id == R.id.video_container_area) {
            return "video_container_area";
        }
        if (id == R.id.video_visible_area_container) {
            return "video_visible_area_container";
        }
        if (id == R.id.cover) {
            return "cover";
        }
        if (id == R.id.kvf) {
            return "interact_stickers";
        }
        if (id == R.id.video_adapted_wrapper_container) {
            return "video_adapted_wrapper_container";
        }
        return "other_view";
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Ap, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        Integer numValueOf;
        EnumC1153720g82 enumC1153720g82 = EnumC1153720g82.VIDEO_BIND;
        C709080Rre c709080Rre = this.LLJLLL;
        Integer numValueOf2 = null;
        if (c709080Rre != null) {
            numValueOf = Integer.valueOf(c709080Rre.getWidth());
        } else {
            numValueOf = null;
        }
        C709080Rre c709080Rre2 = this.LLJLLL;
        if (c709080Rre2 != null) {
            numValueOf2 = Integer.valueOf(c709080Rre2.getHeight());
        }
        yp(enumC1153720g82, numValueOf, numValueOf2);
    }

    public void LJJIJIIJI(String str) {
        View videoView;
        VideoAdaptionResult videoAdaptionResultWB2 = wB2();
        if (videoAdaptionResultWB2 == null) {
            return;
        }
        FrameLayout frameLayout = this.LLJLLIL;
        if (frameLayout != null && (!C20557115cH.LIZ(frameLayout, videoAdaptionResultWB2))) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(303)), new Pair("aweme", new AwS575S0100000_31(this, 1220)), new Pair("width", new AwS575S0100000_31(frameLayout, 1221)), new Pair("height", new AwS575S0100000_31(frameLayout, 1222)), new Pair("transx", new AwS575S0100000_31(frameLayout, 1223)), new Pair("transy", new AwS575S0100000_31(frameLayout, 1224)), new Pair("visibility", new AwS575S0100000_31(frameLayout, 1225)), new Pair("result", new AwS575S0100000_31(videoAdaptionResultWB2, 1226)));
        }
        IVideoCellAbility iVideoCellAbilitySp = sp();
        if (iVideoCellAbilitySp != null && (videoView = iVideoCellAbilitySp.getVideoView()) != null && (!C20557115cH.LIZ(videoView, videoAdaptionResultWB2))) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(304)), new Pair("aweme", new AwS575S0100000_31(this, 1228)), new Pair("width", new AwS575S0100000_31(videoView, 1229)), new Pair("height", new AwS575S0100000_31(videoView, 1230)), new Pair("transx", new AwS575S0100000_31(videoView, 1231)), new Pair("transy", new AwS575S0100000_31(videoView, 1232)), new Pair("visibility", new AwS575S0100000_31(videoView, 1233)), new Pair("result", new AwS575S0100000_31(videoAdaptionResultWB2, 1234)));
        }
        FrameLayout frameLayout2 = this.LLJZIJLIL;
        if (frameLayout2 != null && (!C20557115cH.LIZ(frameLayout2, videoAdaptionResultWB2))) {
            AbstractC1879030yzt.LIZIZ(new Pair("msg", AFwS221S0000000_31.get$arr$(305)), new Pair("aweme", new AwS575S0100000_31(this, 1235)), new Pair("width", new AwS575S0100000_31(frameLayout2, 1236)), new Pair("height", new AwS575S0100000_31(frameLayout2, 1237)), new Pair("transx", new AwS575S0100000_31(frameLayout2, 1238)), new Pair("transy", new AwS575S0100000_31(frameLayout2, 1239)), new Pair("visibility", new AwS575S0100000_31(frameLayout2, 1240)), new Pair("result", new AwS575S0100000_31(videoAdaptionResultWB2, 1218)));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void XX0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2) {
        op().LJ(interfaceC20561815d2);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLL.getValue(), new C2217381BqS() { // from class: X.15cT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, new C20557815cO(), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLL.getValue(), new C2217381BqS() { // from class: X.15cc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJILLL;
            }
        }, null, new C20558415cU(), 6);
        op().LIZIZ(this.LLL, true, true);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.kvf);
        if (frameLayout != null) {
            this.LLJLLIL = frameLayout;
            C786410Ut5.LJZ(0, frameLayout);
            frameLayout.addOnLayoutChangeListener(tp());
        }
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.video_adapted_wrapper_container);
        if (frameLayout2 != null) {
            this.LLJZIJLIL = frameLayout2;
            C786410Ut5.LJZ(0, frameLayout2);
            frameLayout2.addOnLayoutChangeListener(tp());
        }
        C709080Rre c709080Rre = (C709080Rre) view.findViewById(R.id.video_visible_area_container);
        if (c709080Rre != null) {
            this.LLJLLL = c709080Rre;
            int visibility = c709080Rre.getVisibility();
            c709080Rre.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c709080Rre);
            c709080Rre.addOnLayoutChangeListener(tp());
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_container_area);
        if (linearLayout != null) {
            this.LLJZ = linearLayout;
            C786410Ut5.LJZL(0, linearLayout);
            linearLayout.addOnLayoutChangeListener(tp());
        }
    }

    public void zp(VideoAdaptionResult videoAdaptionResult) {
        Ep(videoAdaptionResult, "1. video adaption finish");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ep(com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2.Ep(com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void aW0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2, boolean z) {
        op().LIZIZ(interfaceC20561815d2, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp(X.EnumC1153720g82 r24, java.lang.Integer r25, java.lang.Integer r26) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2.yp(X.0g82, java.lang.Integer, java.lang.Integer):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public void Ct2(String str, Integer num, Integer num2, View... viewArr) {
        C20556915cF.LIZ(str, num, num2, viewArr);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final C690990R8n FF0(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup) {
        C690990R8n c690990R8n = new C690990R8n(0, 0);
        VideoAdaptionResult videoAdaptionResultYc2 = yc2();
        if (videoAdaptionResultYc2 != null) {
            c690990R8n.LIZ = videoAdaptionResultYc2.getWidth();
            c690990R8n.LIZIZ = videoAdaptionResultYc2.getHeight();
        }
        return c690990R8n;
    }
}
