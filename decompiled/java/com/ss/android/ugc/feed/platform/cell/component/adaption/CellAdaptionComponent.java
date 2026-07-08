package com.ss.android.ugc.feed.platform.cell.component.adaption;

import X.AbstractC692920RFy;
import X.C01GW;
import X.C0COV;
import X.C0NC0;
import X.C0RG1;
import X.C0RG7;
import X.C1017070cZd;
import X.C1387230mCf;
import X.C13BV;
import X.C13LE;
import X.C14LC;
import X.C15438062q;
import X.C1558520qew;
import X.C15C0;
import X.C15C1;
import X.C15O7;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C20480215Bw;
import X.C20480315Bx;
import X.C20480415By;
import X.C20480515Bz;
import X.C20504015La;
import X.C20554615bs;
import X.C20554715bt;
import X.C20554915bv;
import X.C20556415cA;
import X.C20556515cB;
import X.C20556615cC;
import X.C20556915cF;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C309690CBz;
import X.C386910FEz;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690990R8n;
import X.C692910RFx;
import X.C692930RFz;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1058490deR;
import X.InterfaceC1294060jmO;
import X.InterfaceC1554640qYg;
import X.InterfaceC1564270qoD;
import X.InterfaceC20561815d2;
import X.InterfaceC494301wD;
import X.InterfaceC583650Mup;
import Y.ACallableS418S0100000_11;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.FeedSkylightDrawerLogicAbility;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.OcrLocation;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class CellAdaptionComponent extends BaseCellContentComponent<CellAdaptionComponent> implements CellAdaptionComponentAbility, InterfaceC1554640qYg {
    public static final C20554615bs LLLLII = new Object() { // from class: X.15bs
    };
    public static final int LLLLIIIILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final C01GW<Integer> LLLLIIL = C452501pT.LIZIZ(new C15C0());
    public static final C01GW<Integer> LLLLIILL = C452501pT.LIZIZ(new C20480515Bz());
    public static final C01GW<Integer> LLLLIILLL = C452501pT.LIZIZ(new C20480215Bw());
    public static final int LLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLLLILI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final C01GW<Integer> LLLLJ = C452501pT.LIZIZ(new C15C1());
    public static final C01GW<Integer> LLLLJI = C452501pT.LIZIZ(new C20480415By());
    public static final int LLLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
    public static final C01GW<Integer> LLLLLIL = C452501pT.LIZIZ(new C20480315Bx());
    public List<? extends AbstractC692920RFy> LLJJL;
    public C20556415cA LLJJLIIIJLLLLLLLZ;
    public volatile List<? extends OcrLocation> LLJLL;
    public volatile boolean LLJZIJLIL;
    public volatile boolean LLL;
    public volatile boolean LLLF;
    public FrameLayout LLLIIIIL;
    public FrameLayout LLLIIIL;
    public View LLLIIL;
    public View LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public float LLLILZJ;
    public C386910FEz LLLJIL;
    public C20504015La LLLJL;
    public boolean LLLL;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(301));
    public final C01GW LLJL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(302));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS276S0000000_31.get$arr$(244));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1216));
    public volatile Rect LLJLLIL = new Rect();
    public volatile Rect LLJLLL = new Rect();
    public volatile Rect LLJZ = new Rect();
    public final C630740Ooa LLLFF = C628500Oky.LIZ(new AwS575S0100000_31(this, 1212));
    public final C630740Ooa LLLFFI = C628500Oky.LIZ(new AwS575S0100000_31(this, 1213));
    public final C630740Ooa LLLFZ = C628500Oky.LIZ(new AwS575S0100000_31(this, 1217));
    public final C630740Ooa LLLI = C628500Oky.LIZ(new AwS575S0100000_31(this, 1211));
    public final C630740Ooa LLLII = C628500Oky.LIZ(new AwS575S0100000_31(this, 1214));
    public final C630740Ooa LLLIIII = C628500Oky.LIZ(new AwS575S0100000_31(this, 1215));
    public float LLLILZLLLI = -1.0f;
    public float LLLIZZ = -1.0f;
    public final C20554715bt LLLJ = new InterfaceC1564270qoD() { // from class: X.15bt
        @Override // X.InterfaceC1564270qoD
        public final void LIZ(float f, float f2, Float f3) {
            Integer numValueOf;
            Aweme aweme;
            if (!C1568340qum.LIZIZ) {
                return;
            }
            CellAdaptionComponent cellAdaptionComponent = this.LIZ;
            cellAdaptionComponent.LLLILZLLLI = f;
            cellAdaptionComponent.LLLIZZ = f2;
            float f4 = f / f2;
            CellAdaptionComponent cellAdaptionComponent2 = this.LIZ;
            FrameLayout frameLayout = cellAdaptionComponent2.LLLIIIL;
            if (frameLayout != null) {
                numValueOf = Integer.valueOf(frameLayout.getHeight());
            } else {
                numValueOf = null;
            }
            cellAdaptionComponent2.tp(numValueOf);
            CellAdaptionComponent cellAdaptionComponent3 = this.LIZ;
            VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(cellAdaptionComponent3);
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                cellAdaptionComponent3.zp(f4, aweme);
            }
        }
    };

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean DP1() {
        return hp(this, false, true, false, 5);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final AdaptionPaddingValues Ns0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final int Sj0() {
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean XG1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void XX0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean YP0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void aW0(InterfaceC20561815d2<VideoAdaptionResult> interfaceC20561815d2, boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final InterfaceC1058490deR dj2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean fk1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final View jj1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final AdaptionPaddingValues n81() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() throws IllegalAccessException {
        super.onAssemPostCreate();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(), new C2217381BqS() { // from class: X.15bu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJ;
            }
        }, null, AFwS319S0000000_31.get$arr$(30), 6);
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1917770024) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final C1387230mCf tK1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        View viewFindViewById;
        InterfaceC583650Mup interfaceC583650MupX3;
        View videoView;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLLL = false;
        FrameLayout frameLayout = this.LLLIIIL;
        if (frameLayout != null) {
            C786410Ut5.fd(frameLayout, 0.0f);
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLLFZ.getValue();
        if (iVideoCellAbility != null && (interfaceC583650MupX3 = iVideoCellAbility.x3()) != null && (videoView = interfaceC583650MupX3.getVideoView()) != null) {
            C786410Ut5.ed(videoView, 0.0f);
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL == null || (viewFindViewById = viewLJJIJL.findViewById(R.id.kvf)) == null) {
            return;
        }
        C786410Ut5.ed(viewFindViewById, 0.0f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final AdaptionPaddingValues vk1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final VideoAdaptionResult wB2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final VideoAdaptionResult yc2() {
        return null;
    }

    public final void yp() {
        FrameLayout frameLayout = this.LLLIIIL;
        if (frameLayout != null) {
            Context context = getContext();
            C724270Sb3 c724270Sb3 = this.LLJI;
            M72(context, frameLayout, null, null, null, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
            C724270Sb3 c724270Sb32 = this.LLJI;
            Integer numValueOf = Integer.valueOf(op(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme()).LIZIZ);
            this.LLLILZJ = frameLayout.getTranslationY();
            frameLayout.getTranslationY();
            tp(numValueOf);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLLIIII.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.qN0(this.LLLJ);
        }
    }

    public final Integer lp() {
        Integer numValueOf;
        FrameLayout frameLayout = this.LLLIIIIL;
        if (frameLayout != null && (numValueOf = Integer.valueOf(frameLayout.getHeight())) != null && numValueOf.intValue() > 0) {
            return numValueOf;
        }
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLII.getValue();
        if (iScreenComponentAbility != null) {
            return Integer.valueOf(iScreenComponentAbility.tE());
        }
        return null;
    }

    public final Integer mp() {
        Integer numValueOf;
        FrameLayout frameLayout = this.LLLIIIIL;
        if (frameLayout != null && (numValueOf = Integer.valueOf(frameLayout.getWidth())) != null && numValueOf.intValue() > 0) {
            return numValueOf;
        }
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLII.getValue();
        if (iScreenComponentAbility != null) {
            return Integer.valueOf(iScreenComponentAbility.xu1());
        }
        return null;
    }

    public static boolean sp(Rect rect) {
        if (rect.width() != 0 && rect.height() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final boolean ZY1(boolean z) {
        return hp(this, true, false, z, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<X.15cB>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public final void ep(boolean z) {
        int iIntValue;
        int iIntValue2;
        Object obj;
        AbstractC692920RFy c692930RFz;
        ?? arrayList;
        Integer numLp = lp();
        if (numLp != null) {
            iIntValue = numLp.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numMp = mp();
        if (numMp != null) {
            iIntValue2 = numMp.intValue();
        } else {
            iIntValue2 = 0;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        String strLJIIIIZZ = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        Video video = aweme.getVideo();
        if (video != null) {
            video.getWidth();
            video.getHeight();
            boolean zLLIZLLLIL = C1017070cZd.LLIZLLLIL(aweme);
            if (((C0RG7) this.LLJL.getValue()).LIZLLL()) {
                final C0RG7 c0rg7 = (C0RG7) this.LLJL.getValue();
                c692930RFz = new AbstractC692920RFy(c0rg7) { // from class: X.0RG0
                    public final C0RG7 LJ;

                    {
                        this.LJ = c0rg7;
                    }

                    @Override // X.AbstractC692920RFy
                    public final boolean LIZ(Integer num, Integer num2, int i, int i2, int i3, int i4, Aweme aweme2) {
                        C533990Kwv c533990KwvLIZIZ = this.LJ.LIZIZ(new C533990Kwv(i, i2, i3, i4));
                        this.LIZ = Integer.valueOf(c533990KwvLIZIZ.LIZLLL);
                        this.LIZIZ = Integer.valueOf(c533990KwvLIZIZ.LIZJ);
                        return true;
                    }
                };
            } else if (zLLIZLLLIL) {
                c692930RFz = new C20554915bv(0);
            } else {
                c692930RFz = new C692930RFz(0);
            }
            if (z) {
                C20556415cA c20556415cA = this.LLJJLIIIJLLLLLLLZ;
                if (c20556415cA != null) {
                    List<? extends OcrLocation> list = this.LLJLL;
                    AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 1210);
                    if (c20556415cA.LJIIIIZZ == null) {
                        c20556415cA.LJIIJJI = false;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[setLocations] loc");
                        if (list != null) {
                            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(list);
                        }
                        sbLIZ.append(strLJIIIIZZ);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (list != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator<? extends OcrLocation> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new C20556515cB(c20556415cA, it2.next()));
                            }
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        c20556415cA.LJIIIIZZ = arrayList;
                        awS575S0100000_31.invoke();
                    }
                }
                List<Rect> listIp = ip(iIntValue, iIntValue2);
                C20556415cA c20556415cA2 = this.LLJJLIIIJLLLLLLLZ;
                if (c20556415cA2 != null) {
                    AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(this, (CellAdaptionComponent) listIp, (List<Rect>) 82);
                    if (!c20556415cA2.LJFF()) {
                        c20556415cA2.LJIIJJI = false;
                        c20556415cA2.LJIIIZ = listIp;
                        awS432S0200000_31.invoke();
                    }
                }
            }
            this.LLJJL = C1697810uHb.LJIIJJI(c692930RFz, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean kp(boolean r15) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent.kp(boolean):boolean");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        FeedSkylightDrawerLogicAbility feedSkylightDrawerLogicAbility = (FeedSkylightDrawerLogicAbility) this.LLLIIII.getValue();
        if (feedSkylightDrawerLogicAbility != null) {
            feedSkylightDrawerLogicAbility.tF1(this.LLLJ);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.video_visible_area_container);
        this.LLLIIIIL = frameLayout;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.video_adapted_wrapper_container);
        this.LLLIIIL = frameLayout2;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        this.LLLIIL = view.findViewById(R.id.dlw);
        this.LLLIILIL = view.findViewById(R.id.w7w);
        View view2 = this.LLLIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(4, view2);
        }
        View view3 = this.LLLIILIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(4, view3);
        }
        IScreenComponentAbility iScreenComponentAbility = (IScreenComponentAbility) this.LLLII.getValue();
        if (iScreenComponentAbility != null) {
            this.LLLIL = iScreenComponentAbility.KA2();
            this.LLLILZ = iScreenComponentAbility.wN0();
        }
    }

    public final C690990R8n op(Aweme aweme) {
        Video video;
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            numValueOf = Integer.valueOf(video.getWidth());
            numValueOf2 = Integer.valueOf(video.getHeight());
        } else {
            numValueOf = null;
        }
        Integer numMp = mp();
        Integer numLp = lp();
        List<? extends AbstractC692920RFy> list = this.LLJJL;
        C690990R8n c690990R8n = new C690990R8n(0, 0);
        if (numValueOf != null && numValueOf.intValue() > 0 && numValueOf2 != null && numValueOf2.intValue() > 0 && numMp != null && numMp.intValue() > 0 && numLp != null && numLp.intValue() > 0) {
            C0RG1.LIZ(null, c690990R8n, numValueOf.intValue(), numValueOf2.intValue(), numMp.intValue(), numLp.intValue(), list, aweme);
        }
        return c690990R8n;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        this.LLJJLIIIJLLLLLLLZ = new C20556415cA();
        if (aweme != null && aweme.getVideo() != null) {
            if (!kp(true)) {
                C15O7.LIZJ(new ACallableS418S0100000_11(this, 2));
            }
            zp(0.0f, aweme);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(java.lang.Integer r8) {
        /*
            r7 = this;
            float r0 = r7.LLLILZLLLI
            float r2 = r7.LLLIZZ
            float r6 = r0 / r2
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lbc
            r0 = 1
        Ld:
            r5 = 0
            r4 = 0
            if (r0 != 0) goto Lb9
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto Lb9
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            float r0 = r1.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            r1.floatValue()
            android.widget.FrameLayout r0 = r7.LLLIIIIL
            if (r0 == 0) goto Lb9
            int r3 = r0.getHeight()
            if (r8 == 0) goto Lb9
            int r0 = r8.intValue()
            if (r0 <= 0) goto Lb9
            int r0 = r8.intValue()
            float r2 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            float r0 = (float) r3
            float r0 = r0 / r1
            float r2 = r2 - r0
            float r0 = r7.LLLIZZ
            float r0 = -r0
            float r1 = X.C13LZ.LIZLLL(r2, r0, r5)
            float r0 = r7.LLLILZJ
            float r1 = r1 - r0
            float r1 = r1 * r6
            float r0 = r0 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            if (r0 == 0) goto Lb9
            float r2 = r0.floatValue()
        L55:
            X.0Ooa r0 = r7.LLLFZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility r0 = (com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility) r0
            if (r0 == 0) goto L6e
            X.0Mup r0 = r0.x3()
            if (r0 == 0) goto L6e
            android.view.View r0 = r0.getVideoView()
            if (r0 == 0) goto L6e
            X.C786410Ut5.ed(r0, r2)
        L6e:
            android.view.View r1 = r7.LJJIJL()
            if (r1 == 0) goto L80
            r0 = 2131376843(0x7f0a3acb, float:1.8373873E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L80
            X.C786410Ut5.ed(r0, r2)
        L80:
            android.view.View r1 = r7.LJJIJL()
            if (r1 == 0) goto L92
            r0 = 2131368955(0x7f0a1bfb, float:1.8357875E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L92
            X.C786410Ut5.ed(r0, r5)
        L92:
            android.widget.FrameLayout r0 = r7.LLLIIIL
            if (r0 == 0) goto L99
            X.C786410Ut5.fd(r0, r2)
        L99:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[recalculateTranslate] stickerLocs "
            r1.append(r0)
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.OcrLocation> r0 = r7.LLJLL
            if (r0 == 0) goto Laa
            java.lang.String r4 = X.C1741890vQh.LJIIIIZZ(r0)
        Laa:
            r1.append(r4)
            java.lang.String r0 = ", restoreAdapt transY "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            return
        Lb9:
            float r2 = r7.LLLILZJ
            goto L55
        Lbc:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent.tp(java.lang.Integer):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        if (this.LLLL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) obj).mEventType);
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            c2344009Gk.LJIIIIZZ("group_id", ((VideoItemParams) obj2).getAweme().getGroupId());
            C20684815ws.LJIILLIIL("video_desc_change", c2344009Gk.LIZ);
        }
    }

    public final List<Rect> ip(int i, int i2) {
        IScreenComponentAbility iScreenComponentAbility;
        int iIntValue;
        int iLIZIZ;
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        List<Rect> listLJIIJJI = C1697810uHb.LJIIJJI(new Rect(), new Rect(), new Rect(), new Rect());
        if (i <= 0 || i2 <= 0 || (iScreenComponentAbility = (IScreenComponentAbility) this.LLLII.getValue()) == null) {
            return listLJIIJJI;
        }
        int iKA2 = iScreenComponentAbility.KA2();
        int i3 = C14LC.LJIILLIIL;
        if (iKA2 <= 0) {
            iIntValue = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
        } else {
            iIntValue = 0;
        }
        if (i3 <= 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)));
        } else {
            iLIZIZ = 0;
        }
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) this.LLLFFI.getValue();
        if (interactRightAreaAttachAbility == null || (rect = interactRightAreaAttachAbility.Zl()) == null) {
            rect = new Rect();
        }
        this.LLJLLIL = rect;
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility = (InteractInfoAreaAttachAbility) this.LLLFF.getValue();
        if (interactInfoAreaAttachAbility == null || (rect2 = interactInfoAreaAttachAbility.Zl()) == null) {
            rect2 = new Rect();
        }
        this.LLJLLL = rect2;
        InteractInfoAreaAttachAbility interactInfoAreaAttachAbility2 = (InteractInfoAreaAttachAbility) this.LLLFF.getValue();
        if (interactInfoAreaAttachAbility2 == null || (rect3 = interactInfoAreaAttachAbility2.PR1()) == null) {
            rect3 = new Rect();
        }
        this.LLJZ = rect3;
        this.LLJZIJLIL = true;
        Rect rect7 = new Rect(0, 0, i2, (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(58.0d))) + iIntValue) - LLLLIIIILLL);
        if (sp(this.LLJLLIL)) {
            LLLLII.getClass();
            rect4 = new Rect(i2 - LLLLJ.getValue().intValue(), i - (LLLLJI.getValue().intValue() + iLIZIZ), i2, i);
        } else {
            this.LLL = true;
            float f = this.LLJLLIL.left;
            int iWidth = this.LLJLLIL.width();
            int i4 = LLLLILI;
            LLLLII.getClass();
            rect4 = new Rect((int) (f + ((iWidth - i4) / 2.0f) + LLLLIILL.getValue().intValue()), (int) (this.LLJLLIL.top + LLLLIL + ((this.LLJLLIL.width() - i4) / 2.0f) + LLLLIIL.getValue().intValue()), i2, i);
        }
        if (!sp(this.LLJLLL) && !sp(this.LLJZ)) {
            this.LLLF = true;
            int i5 = this.LLJLLL.top;
            LLLLII.getClass();
            C01GW<Integer> c01gw = LLLLIILLL;
            rect6 = new Rect(0, i5 + c01gw.getValue().intValue(), this.LLJZ.right / 2, i);
            rect5 = new Rect(0, this.LLJZ.top + c01gw.getValue().intValue(), this.LLJZ.right - (c01gw.getValue().intValue() * 2), i);
        } else {
            int i6 = i - (iLIZIZ + LLLLL);
            LLLLII.getClass();
            rect5 = new Rect(0, i6, i2 - LLLLLIL.getValue().intValue(), i);
            rect6 = new Rect();
        }
        return C1697810uHb.LJIIJJI(rect7, rect4, rect6, rect5);
    }

    public final void up(View view, Aweme aweme) {
        Video video;
        Integer numValueOf;
        Integer numValueOf2 = null;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            numValueOf = Integer.valueOf(video.getWidth());
            numValueOf2 = Integer.valueOf(video.getHeight());
        } else {
            numValueOf = null;
        }
        Integer numMp = mp();
        Integer numLp = lp();
        List<? extends AbstractC692920RFy> list = this.LLJJL;
        if (view != null && numValueOf != null && numValueOf.intValue() > 0 && numValueOf2 != null && numValueOf2.intValue() > 0 && numMp != null && numMp.intValue() > 0 && numLp != null && numLp.intValue() > 0) {
            C0RG1.LIZ(view, null, numValueOf.intValue(), numValueOf2.intValue(), numMp.intValue(), numLp.intValue(), list, aweme);
        }
    }

    public final void zp(float f, Aweme aweme) {
        boolean z;
        if (C0COV.LIZIZ) {
            int iIntValue = 0;
            if (!AwemeExtKt.isPhotoMode(aweme) && !C0NC0.LIZ(aweme)) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            if (z) {
                iIntValue = ((Number) this.LLJLILLLLZIIL.getValue()).intValue();
            }
            int i = (int) (iIntValue * (1 - f));
            View view = this.LLLIIL;
            if (view != null) {
                C1744700vVE.LJIIIIZZ(i, view);
            }
            View view2 = this.LLLIILIL;
            if (view2 != null) {
                C1744700vVE.LJIIIIZZ(i, view2);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final void Ct2(String str, Integer num, Integer num2, View... viewArr) {
        C20556915cF.LIZ(str, num, num2, viewArr);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    public final C690990R8n FF0(Context context, Aweme aweme, OcrLocation ocrLocation, ViewGroup viewGroup) {
        boolean zBooleanValue;
        C20556415cA c20556415cA;
        Boolean boolValueOf;
        if (aweme != null && (c20556415cA = this.LLJJLIIIJLLLLLLLZ) != null && (boolValueOf = Boolean.valueOf(c20556415cA.LIZIZ(aweme))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        ep(zBooleanValue);
        if (C0COV.LIZJ) {
            return op(aweme);
        }
        return new C692910RFx(this.LLJJLIIIJLLLLLLLZ).LIZIZ(context, aweme, viewGroup);
    }

    public static boolean hp(CellAdaptionComponent cellAdaptionComponent, boolean z, boolean z2, boolean z3, int i) {
        Object obj;
        boolean z4;
        Object obj2;
        int iIntValue;
        int iIntValue2;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        C724270Sb3 c724270Sb3 = cellAdaptionComponent.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String str = "1";
        boolean zEquals = TextUtils.equals(AwemeBizExtKt.isIntextOccludeDesc(((VideoItemParams) obj).getAweme()), "1");
        if (C20556615cC.LJII && zEquals) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z3) {
            if (z4 && z2) {
                cellAdaptionComponent.LLLL = true;
            } else {
                if (z) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C724270Sb3 c724270Sb32 = cellAdaptionComponent.LLJI;
                    if (c724270Sb32 != null) {
                        obj2 = c724270Sb32.LL;
                    } else {
                        obj2 = null;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", ((VideoItemParams) obj2).mEventType);
                    C724270Sb3 c724270Sb33 = cellAdaptionComponent.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    }
                    c2344009Gk.LJIIIIZZ("group_id", ((VideoItemParams) obj3).getAweme().getGroupId());
                    if (z4) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk.LJIIIIZZ("is_show", str);
                    C20684815ws.LJIILLIIL("search_banner_show_result", c2344009Gk.LIZ);
                }
                if (z4) {
                }
            }
            Integer numLp = cellAdaptionComponent.lp();
            if (numLp != null) {
                iIntValue = numLp.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numMp = cellAdaptionComponent.mp();
            if (numMp != null) {
                iIntValue2 = numMp.intValue();
            } else {
                iIntValue2 = 0;
            }
            List<Rect> listIp = cellAdaptionComponent.ip(iIntValue, iIntValue2);
            C20556415cA c20556415cA = cellAdaptionComponent.LLJJLIIIJLLLLLLLZ;
            if (c20556415cA != null) {
                AwS432S0200000_31 awS432S0200000_31 = new AwS432S0200000_31(cellAdaptionComponent, (CellAdaptionComponent) listIp, (List<Rect>) 122);
                c20556415cA.LJIIJJI = false;
                c20556415cA.LJIIIZ = listIp;
                awS432S0200000_31.invoke();
            }
            C20556415cA c20556415cA2 = cellAdaptionComponent.LLJJLIIIJLLLLLLLZ;
            if (c20556415cA2 != null) {
                c20556415cA2.LJI();
            }
        }
        return z4;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    @InterfaceC1294060jmO
    public final void FH1(Context context, Aweme aweme, View view, OcrLocation ocrLocation, ViewGroup viewGroup) {
        boolean zBooleanValue;
        C20556415cA c20556415cA;
        Boolean boolValueOf;
        if (aweme != null && (c20556415cA = this.LLJJLIIIJLLLLLLLZ) != null && (boolValueOf = Boolean.valueOf(c20556415cA.LIZIZ(aweme))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        ep(zBooleanValue);
        if (C0COV.LIZJ) {
            up(view, aweme);
        } else {
            C692910RFx c692910RFx = new C692910RFx(this.LLJJLIIIJLLLLLLLZ);
            if (aweme != null && aweme.getVideo() != null) {
                Video video = aweme.getVideo();
                boolean z = C14LC.LJIIIZ;
                C309690CBz.LIZ.getClass();
                c692910RFx.LJIIJ(context, aweme, view, video.getWidth(), video.getHeight(), null, viewGroup);
            }
        }
        yp();
        CellStickerComponentAbility cellStickerComponentAbility = (CellStickerComponentAbility) this.LLLI.getValue();
        if (cellStickerComponentAbility != null) {
            cellStickerComponentAbility.BT();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    @InterfaceC1294060jmO
    public final void CX1(Context context, Aweme aweme, View view, View view2, OcrLocation ocrLocation, ViewGroup viewGroup) {
        boolean zBooleanValue;
        C20556415cA c20556415cA;
        Boolean boolValueOf;
        if (aweme != null && (c20556415cA = this.LLJJLIIIJLLLLLLLZ) != null && (boolValueOf = Boolean.valueOf(c20556415cA.LIZIZ(aweme))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        ep(zBooleanValue);
        if (C0COV.LIZJ) {
            up(view, aweme);
            up(view2, aweme);
        } else {
            new C692910RFx(this.LLJJLIIIJLLLLLLLZ).LIZ(context, aweme, view, view2, viewGroup);
        }
        yp();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility
    @InterfaceC1294060jmO
    public final void M72(Context context, View view, Integer num, Integer num2, ViewGroup viewGroup, Aweme aweme) {
        Integer numValueOf;
        int iIntValue;
        boolean zLIZIZ;
        ViewGroup viewGroup2 = viewGroup;
        if (aweme == null) {
            return;
        }
        Video video = aweme.getVideo();
        if (num != null || (video != null && (num = Integer.valueOf(video.getWidth())) != null)) {
            int iIntValue2 = num.intValue();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else if (video != null && (numValueOf = Integer.valueOf(video.getHeight())) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                return;
            }
            if (viewGroup2 == null && (viewGroup2 = this.LLLIIIIL) == null) {
                return;
            }
            C20556415cA c20556415cA = this.LLJJLIIIJLLLLLLLZ;
            if (c20556415cA != null) {
                zLIZIZ = c20556415cA.LIZIZ(aweme);
            } else {
                zLIZIZ = false;
            }
            ep(zLIZIZ);
            if (C0COV.LIZJ) {
                up(view, aweme);
                return;
            }
            C692910RFx c692910RFx = new C692910RFx(this.LLJJLIIIJLLLLLLLZ);
            if (context == null || view == null || iIntValue2 <= 0 || iIntValue <= 0) {
                return;
            }
            c692910RFx.LJIIJ(context, null, view, iIntValue2, iIntValue, null, viewGroup2);
        }
    }
}
