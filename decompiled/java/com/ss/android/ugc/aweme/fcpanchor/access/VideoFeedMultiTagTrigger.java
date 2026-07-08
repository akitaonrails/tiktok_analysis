package com.ss.android.ugc.aweme.fcpanchor.access;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C0RKW;
import X.C0ROI;
import X.C0RQN;
import X.C0S4A;
import X.C0S4B;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1618440sDa;
import X.C204660156k;
import X.C204662156m;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2765015f;
import X.C285760BHy;
import X.C452501pT;
import X.C694180RKu;
import X.C697790RYr;
import X.C698800Rb4;
import X.C698840Rb8;
import X.C699500RcC;
import X.C700040Rd4;
import X.C700100RdA;
import X.C700450Rdj;
import X.C704160Rji;
import X.C705590Rm1;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C729510SjV;
import X.C786410Ut5;
import X.C807350Vll;
import X.EnumC204669156t;
import X.EnumC695830RRd;
import X.EnumC697290RWt;
import X.EnumC697820RYu;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import X.RunnableC20328114gR;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.anchor.expriment.AnchorMonitorSettings;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.CustomBizInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.aweme.poi.anchor.IPoiAnchorService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS335S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoFeedMultiTagTrigger extends BaseCellTriggerComponent<VideoFeedMultiTagTrigger> implements ComponentPriorityProtocol, C0S4B {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C0RKW LLJZ;
    public C0RKW LLJZIJLIL;
    public volatile FcpProtocolAbility LLLFFI;
    public InterfaceC665370Q7z LLLFZ;
    public C0QSJ LLLI;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 183));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 184));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 182));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 187));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 181));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(74));
    public final Set<String> LLL = C13LQ.LJLIIL(new String[]{"poi_cta_btn_container", "poi_cta_text_container"});
    public final C700450Rdj LLLF = new C700450Rdj(new AwS625S0100000_11(this, 6), new AwS625S0100000_11(this, 7), new AwS555S0100000_11(this, 178));
    public final C700450Rdj LLLFF = new C700450Rdj(new AwS625S0100000_11(this, 8), new AwS625S0100000_11(this, 9), new AwS555S0100000_11(this, 179));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoFeedMultiTagTrigger.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(VideoFeedMultiTagAssem.class);
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public final FeedMultiAnchorAbility Ap() {
        return (FeedMultiAnchorAbility) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        FeedComponentPriorityData feedComponentPriorityDataZp = zp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        return C698800Rb4.LIZIZ(c698800Rb4, feedComponentPriorityDataZp, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAnchors());
    }

    @Override // X.C0S4B
    public final C705590Rm1 j8() {
        return new C705590Rm1("", null);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // X.C0S4B
    public final View U7() {
        FeedMultiAnchorAbility feedMultiAnchorAbilityAp = Ap();
        if (feedMultiAnchorAbilityAp == null || !feedMultiAnchorAbilityAp.M51()) {
            return null;
        }
        return LJJIJL().findViewById(R.id.hu8);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        IPoiAnchorService iPoiAnchorService;
        FeedMultiAnchorAbility feedMultiAnchorAbilityAp = Ap();
        if (feedMultiAnchorAbilityAp != null && feedMultiAnchorAbilityAp.M51()) {
            return new C700040Rd4(AFwS294S0000000_11.get$arr$(36), AFwS335S0000000_11.get$arr$(1), new AwS555S0100000_11(this, 180));
        }
        if (Intrinsics.LJFF(H3(), "anchor_poi")) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null && anchors.size() == 1 && (iPoiAnchorService = (IPoiAnchorService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null)) != null && iPoiAnchorService.getPoiAnchorCta(aweme) != null) {
                return this.LLLFF;
            }
        }
        return this.LLLF;
    }

    @Override // X.C0S4B
    public final C0S4A x1() {
        FeedMultiAnchorAbility feedMultiAnchorAbilityAp = Ap();
        return (feedMultiAnchorAbilityAp == null || !feedMultiAnchorAbilityAp.M51()) ? C0S4A.VALID : C0S4A.INVALID;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void xo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start bind aid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        C2765015f.LIZIZ("VideoFeedMultiTagTrigger", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void yo() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end bind aid=");
        C724270Sb3 c724270Sb3 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid());
        C2765015f.LIZIZ("VideoFeedMultiTagTrigger", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x003c, PHI: r1
      0x0030: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0012, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0014, B:13:0x0018, B:14:0x001e, B:18:0x0038, B:19:0x003a, B:17:0x0030), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData zp() {
        /*
            r5 = this;
            boolean r0 = X.C299830Bp7.LIZ()
            r4 = 0
            if (r0 == 0) goto L61
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLFFI
            if (r0 != 0) goto L40
            monitor-enter(r5)
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLFFI     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r5.LLLI     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLLFZ     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L3c
            r5.LLLFZ = r3     // Catch: java.lang.Throwable -> L3c
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r1 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r5.LLLI = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            r0 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility) r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r5.LLLFFI = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            goto L45
        L3c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L3f:
            monitor-exit(r5)
        L40:
            X.0RKW r0 = r0.qR1()
            goto L48
        L45:
            if (r0 != 0) goto L40
            r0 = r4
        L48:
            r5.LLJZ = r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZ()
            if (r0 == 0) goto L53
            return r0
        L53:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLJZIJLIL = r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
            return r4
        L60:
            return r4
        L61:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLJZIJLIL = r0
            if (r0 == 0) goto L6d
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagTrigger.zp():com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData");
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        CustomBizInfo customBizInfo;
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        C697790RYr c697790RYr = C697790RYr.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        String aid = ((VideoItemParams) obj).getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_ANCHOR_DECISION;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.APPEND;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        this.LLJJLIIIJLLLLLLLZ = true;
        C2765015f.LIZJ("VideoFeedMultiTagTrigger.notifyDecisionDone", new AwS555S0100000_11(this, 185));
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str2 = ((VideoItemParams) obj2).mEventType;
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        Aweme aweme = ((VideoItemParams) obj3).getAweme();
        String aid2 = aweme.getAid();
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel == null || (customBizInfo = contentModel.customBizInfo) == null || (str = customBizInfo.awemeTrace) == null) {
            str = "";
        }
        if (z) {
            C204660156k c204660156k = C204662156m.LIZ;
            C204662156m.LIZ(str2, aid2, C704160Rji.LIZJ(C13BV.INSTANCE, str, EnumC204669156t.FCP_AVOID));
        } else {
            FeedMultiAnchorAbility feedMultiAnchorAbilityAp = Ap();
            if (feedMultiAnchorAbilityAp != null) {
                feedMultiAnchorAbilityAp.KI0();
            }
        }
        FeedMultiAnchorAbility feedMultiAnchorAbilityAp2 = Ap();
        if (feedMultiAnchorAbilityAp2 != null) {
            feedMultiAnchorAbilityAp2.zs1(z);
        }
        C204660156k c204660156k2 = C204662156m.LIZ;
        String strLIZIZ = C807350Vll.LIZIZ.LIZIZ(null);
        if (AnchorMonitorSettings.LIZ()) {
            ((ExecutorService) C204662156m.LIZLLL.getValue()).execute(new RunnableC20328114gR(strLIZIZ, str2, aid2));
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        }
        C0RQN.LIZJ(((VideoItemParams) obj4).getAweme().getAid(), EnumC695830RRd.ANCHOR_KEY, enumC697290RWt, H3());
        C2765015f.LIZ("VideoFeedMultiTagTrigger.notifyDecisionDone", new AwS555S0100000_11(this, 186));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaAttachAbility interactAreaAttachAbility;
        C285760BHy.LIZ.getClass();
        if (C285760BHy.LIZIZ && C729510SjV.LJJIJIL(videoItemParams.getAweme())) {
            LJJIJL().setTag(C700100RdA.LJI, "");
        }
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String aid = videoItemParams.getAweme().getAid();
        EnumC697290RWt enumC697290RWt = EnumC697290RWt.P_ANCHOR_CREATE;
        String start = enumC697290RWt.getStart();
        EnumC697820RYu enumC697820RYu = EnumC697820RYu.PUTIFABSENT;
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid, start, null, enumC697820RYu, null, null);
        C2765015f.LIZJ("VideoFeedMultiTagAssem.onBind", new AwS412S0200000_11(this, videoItemParams, 12));
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (up(videoItemParams) && (interactAreaAttachAbility = (InteractAreaAttachAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Fn1(this, new AwS435S0200000_34(this, videoItemParams, 5));
        }
        C2765015f.LIZ("VideoFeedMultiTagAssem.onBind", new AwS412S0200000_11(this, videoItemParams, 13));
        String aid2 = videoItemParams.getAweme().getAid();
        String end = enumC697290RWt.getEnd();
        c697790RYr.getClass();
        C697790RYr.LIZJ(aid2, end, null, null, null, null);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        List<AnchorCommonStruct> anchors;
        String from;
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams != null) {
            Aweme aweme = videoItemParams.getAweme();
            if (aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty()) {
                C2189821An6 c2189821An6 = baseFeedPageParams.param;
                if (c2189821An6 != null) {
                    from = c2189821An6.getFrom();
                } else {
                    from = null;
                }
                if (!Intrinsics.LJFF("from_publish_add_video", from)) {
                    int i = BubbleListAssem.LLLI;
                    Aweme aweme2 = videoItemParams.getAweme();
                    boolean zLIZIZ = C0ROI.LIZIZ(baseFeedPageParams, aweme2, null);
                    C698840Rb8.LIZ.getClass();
                    if ((!C698840Rb8.LIZ(aweme2, zLIZIZ) && !(!C0ROI.LIZIZ(baseFeedPageParams, aweme2, null))) || C1618440sDa.LIZIZ.LJJIIJ().LJI(baseFeedPageParams.param, jm().LIZLLL)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int yp(String str) {
        Object obj;
        IPoiAnchorService iPoiAnchorService;
        PoiAnchorButtonInfo poiAnchorCta;
        Integer num;
        if (Intrinsics.LJFF(str, "anchor_poi")) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme = ((VideoItemParams) obj).getAweme();
            List<AnchorCommonStruct> anchors = aweme.getAnchors();
            if (anchors != null && anchors.size() == 1 && (iPoiAnchorService = (IPoiAnchorService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null)) != null && (poiAnchorCta = iPoiAnchorService.getPoiAnchorCta(aweme)) != null && (num = poiAnchorCta.style) != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC691660RBc) it2.next()).T6(i, aweme);
            }
        }
        C204662156m.LJ.set(true);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        if (!Intrinsics.LJFF("from_publish_add_video", baseFeedPageParams.param.getFrom()) && !baseFeedPageParams.param.getHidePoiAnchor() && !baseFeedPageParams.param.isFromDuetModeDetail() && !baseFeedPageParams.param.isFromEffectDiscover() && !Intrinsics.LJFF(baseFeedPageParams.param.getFrom(), "STORY_ENTRANCE_ARCHIVE")) {
            return true;
        }
        return false;
    }

    public static int Bp(int i, ViewGroup viewGroup, String str) {
        Integer num;
        if (!Intrinsics.LJFF(str, "anchor_poi") || i <= 0) {
            return 0;
        }
        if (i != 1) {
            return 1;
        }
        Object tag = null;
        if (viewGroup != null) {
            tag = viewGroup.getTag(C700100RdA.LJIIJJI);
        }
        if (!(tag instanceof Integer) || (num = (Integer) tag) == null || num.intValue() != 1) {
            return 0;
        }
        return 1;
    }
}
