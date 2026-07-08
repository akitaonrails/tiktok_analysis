package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C09R7;
import X.C0BAI;
import X.C0QSJ;
import X.C0RDX;
import X.C0RJE;
import X.C0RKJ;
import X.C0RKP;
import X.C0RKT;
import X.C0RKW;
import X.C0RKZ;
import X.C0RQ6;
import X.C0RY9;
import X.C0RYB;
import X.C13IQ;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1EE2;
import X.C2217381BqS;
import X.C281310B0v;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C578570Mmd;
import X.C673150Qan;
import X.C687700QyG;
import X.C693590RIn;
import X.C694040RKg;
import X.C694180RKu;
import X.C698800Rb4;
import X.C699500RcC;
import X.C700450Rdj;
import X.C708910RrN;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC697700RYi;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC691660RBc;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTrigger;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerForGenreTagContainer;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerV2;
import com.ss.android.ugc.aweme.feed.assem.story.FeedStoryTagTriggerV2ForGenreTagContainer;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoInfoGenreTagContainerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.ab.FeedComponentComplexityExpConfig;
import com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedCreativeLivePhotoForGenreTagContainer;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedCreativeLivePhotoTagTrigger;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoGenreTagProtocol;
import com.ss.android.ugc.feed.platform.container.scope.VideoTagComponentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS170S0400000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoInfoGenreTagContainerAssem extends BaseContainer<VideoGenreTagProtocol, VideoInfoGenreTagContainerAssem> implements GenrePriorityAbility, ComponentPriorityProtocol, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public String LLJLLIL;
    public PriorityProtocol LLJLLL;
    public C0RKT LLJZ;
    public C0RKW LLLFF;
    public C0RKW LLLFFI;
    public volatile FcpProtocolAbility LLLII;
    public InterfaceC665370Q7z LLLIIII;
    public C0QSJ LLLIIIIL;
    public final C01GW LLJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(102));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 282));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 281));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 279));
    public final int LLJZIJLIL = 20;
    public final C01GW LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 280));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 283));
    public final AtomicBoolean LLLFZ = new AtomicBoolean(true);
    public final List<AbsComponentTrigger> LLLI = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoInfoGenreTagContainerAssem.class, "fcpProtocolAbility", "getFcpProtocolAbility()Lcom/ss/android/ugc/feed/platform/cell/interact/FcpProtocolAbility;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void VA2(boolean z) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoTagComponentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CellInteractAreaScope.class);
        arrayList.add(VideoTagComponentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoTagComponentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void nw0(PriorityProtocol priorityProtocol, boolean z) {
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 676464558) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
        String str = (String) this.LLJLILLLLZIIL.getValue();
        C724270Sb3 c724270Sb3 = this.LLJI;
        String genreType = AwemeExtKt.getGenreType(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        FeedComponentPriorityData feedComponentPriorityDataSp = sp();
        Map<String, PriorityProtocol> mapAa = tp().Aa();
        EnumC697700RYi enumC697700RYi = EnumC697700RYi.VIDEO_GENRE_TAG;
        c698800Rb4.getClass();
        return C698800Rb4.LIZLLL(str, genreType, feedComponentPriorityDataSp, mapAa, enumC697700RYi);
    }

    public final ViewGroup op() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        C708910RrN c708910RrN = new C708910RrN(LJJIJL().getContext(), null);
        c708910RrN.setId(R.id.emo);
        C786410Ut5.i7(c708910RrN, marginLayoutParams);
        if (!((Boolean) C0BAI.LIZ.getValue()).booleanValue()) {
            C426750GoL.LJIIIZ(c708910RrN, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
        }
        return c708910RrN;
    }

    public final C0RYB tp() {
        return (C0RYB) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.GenrePriorityAbility
    public final List<String> is() {
        return tp().is();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.GenrePriorityAbility
    public final int rO1() {
        C0RKP c0rkp;
        Object obj = ((LinkedHashMap) tp().Aa()).get(H3());
        if (!(obj instanceof VideoGenreTagProtocol) || (c0rkp = (C0RKP) obj) == null) {
            return 0;
        }
        return c0rkp.ka(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: all -> 0x003c, PHI: r1
      0x0030: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:10:0x0012, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0014, B:13:0x0018, B:14:0x001e, B:18:0x0038, B:19:0x003a, B:17:0x0030), top: B:42:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData sp() {
        /*
            r5 = this;
            boolean r0 = X.C299830Bp7.LIZ()
            r4 = 0
            if (r0 == 0) goto L61
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLII
            if (r0 != 0) goto L40
            monitor-enter(r5)
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = r5.LLLII     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3f
            X.0QSJ r1 = r5.LLLIIIIL     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            X.0Q7z r3 = r5.LLLIIII     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1e
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r5)     // Catch: java.lang.Throwable -> L3c
            r5.LLLIIII = r3     // Catch: java.lang.Throwable -> L3c
        L1e:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope> r1 = com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r5.LLLIIIIL = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L30
            r0 = r4
            goto L38
        L30:
            java.lang.Class<com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility> r0 = com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.FcpProtocolAbility) r0     // Catch: java.lang.Throwable -> L3c
        L38:
            r5.LLLII = r0     // Catch: java.lang.Throwable -> L3c
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
            r5.LLLFF = r0
            if (r0 == 0) goto L53
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r0 = r0.LIZ()
            if (r0 == 0) goto L53
            return r0
        L53:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLFFI = r0
            if (r0 == 0) goto L60
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
            return r4
        L60:
            return r4
        L61:
            X.0RKW r0 = X.C697660RYe.LIZIZ(r5)
            r5.LLLFFI = r0
            if (r0 == 0) goto L6d
            com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData r4 = r0.LIZ()
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoInfoGenreTagContainerAssem.sp():com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.GenrePriorityAbility
    public final int tr2() {
        int width = LJJIJL().getWidth();
        if (LJJIJL().getVisibility() != 0) {
            return 0;
        }
        return width;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        C0RYB.LJII(tp());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        String strH3 = H3();
        if (strH3 == null || strH3.length() == 0) {
            return null;
        }
        PriorityProtocol priorityProtocol = (PriorityProtocol) ((LinkedHashMap) tp().Aa()).get(H3());
        if (priorityProtocol != null) {
            return priorityProtocol.Ke1();
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final C0RQ6 hp() {
        return C0RQ6.VIDEO_GENRE_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Pq1(PriorityProtocol priorityProtocol) {
        tp().LJIIL(priorityProtocol);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* JADX INFO: renamed from: cp */
    public final boolean ur(VideoItemParams videoItemParams) {
        if (!this.LLLFZ.get()) {
            Iterator<AbsComponentTrigger> it2 = this.LLLI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(videoItemParams);
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* JADX INFO: renamed from: ip */
    public final void tp(VideoItemParams videoItemParams) {
        String aid;
        C0RKT c0rkt;
        Aweme aweme;
        VideoItemParams videoItemParams2 = this.LLJJLIIIJLLLLLLLZ;
        if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, videoItemParams.getAweme().getAid()) && (c0rkt = this.LLJZ) != null) {
            C786410Ut5.C3(LJJIJL().getViewTreeObserver(), c0rkt);
            this.LLJZ = null;
        }
        this.LLJJLIIIJLLLLLLLZ = videoItemParams;
        this.LLJLLL = null;
        if (this.LLLFZ.compareAndSet(true, false)) {
            C694040RKg.LIZ(this, true, new AwS447S0200000_11(videoItemParams, this, 3));
        }
        for (AbsComponentTrigger absComponentTrigger : (ArrayList) this.LLLI) {
            absComponentTrigger.LJJ(absComponentTrigger.LLILLJJLI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws IllegalAccessException, InstantiationException {
        super.onViewCreated(view);
        BaseFeedPageParams baseFeedPageParams = jm().LJ;
        if (baseFeedPageParams != null) {
            this.LLJJJJLIIL = baseFeedPageParams;
        }
        tp().LIZ((ViewGroup) LJJIJL(), new C0RY9() { // from class: X.0RKU
            @Override // X.C0RY9
            public final Set<String> LIZJ() {
                VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem = this.LIZ;
                String str = (String) videoInfoGenreTagContainerAssem.LLJLILLLLZIIL.getValue();
                C724270Sb3 c724270Sb3 = videoInfoGenreTagContainerAssem.LLJI;
                return C0RZ5.LJ(str, AwemeExtKt.getGenreType(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme()), videoInfoGenreTagContainerAssem.sp(), new C018B());
            }

            @Override // X.C0RY9
            public final Set<String> LIZIZ() {
                return C08CX.INSTANCE;
            }

            @Override // X.C0RY9
            public final LifecycleOwner getLifecycleOwner() {
                return this.LIZ;
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [X.0RKT, android.view.ViewTreeObserver$OnGlobalLayoutListener] */
            @Override // X.C0RY9
            public final void LIZ(PriorityProtocol priorityProtocol) {
                Fragment fragmentLIZLLL;
                if (!Intrinsics.LJFF(priorityProtocol, this.LIZ.LLJLLL) && priorityProtocol != null) {
                    VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem = this.LIZ;
                    if (videoInfoGenreTagContainerAssem.LLJZ != null) {
                        C786410Ut5.C3(videoInfoGenreTagContainerAssem.LJJIJL().getViewTreeObserver(), this.LIZ.LLJZ);
                    }
                    if (this.LIZ.tr2() == 0) {
                        if (C1591220rVg.LIZLLL()) {
                            fragmentLIZLLL = C724240Sb0.LJI(this.LIZ);
                        } else {
                            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                            if (iDetailFeedSafService != null) {
                                fragmentLIZLLL = iDetailFeedSafService.LIZLLL(C724240Sb0.LJI(this.LIZ));
                            } else {
                                fragmentLIZLLL = null;
                            }
                        }
                        final VideoInfoGenreTagContainerAssem videoInfoGenreTagContainerAssem2 = this.LIZ;
                        ?? r1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0RKT
                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                if (videoInfoGenreTagContainerAssem2.tr2() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) {
                                    AssemViewModel assemViewModel = (AssemViewModel) videoInfoGenreTagContainerAssem2.LLJL.getValue();
                                    assemViewModel.getClass();
                                    assemViewModel.setState(new C0RKV());
                                    C786410Ut5.C3(videoInfoGenreTagContainerAssem2.LJJIJL().getViewTreeObserver(), videoInfoGenreTagContainerAssem2.LLJZ);
                                    videoInfoGenreTagContainerAssem2.LLJZ = null;
                                }
                            }
                        };
                        if (fragmentLIZLLL != null) {
                            SAFExtensionKt.LIZ(r1, videoInfoGenreTagContainerAssem2.LJJIJL().getViewTreeObserver(), fragmentLIZLLL);
                        } else {
                            C786410Ut5.x3(videoInfoGenreTagContainerAssem2.LJJIJL().getViewTreeObserver(), r1);
                        }
                        videoInfoGenreTagContainerAssem2.LLJZ = r1;
                    } else {
                        AssemViewModel assemViewModel = (AssemViewModel) this.LIZ.LLJL.getValue();
                        assemViewModel.getClass();
                        assemViewModel.setState(new C0RKV());
                    }
                    this.LIZ.LLJLLL = priorityProtocol;
                }
            }
        });
        FeedComponentComplexityExpConfig feedComponentComplexityExpConfig = C0RKZ.LIZ;
        if (!C0RKZ.LIZ((String) this.LLJLILLLLZIIL.getValue())) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            if (!C281310B0v.LIZ()) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(new FeedStoryTagTrigger()));
            } else {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(new FeedStoryTagTriggerV2()));
            }
            if (!C281310B0v.LIZ() || jm().LIZ != 1) {
                C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLJJL = C1EE2.LIZIZ.LJJL();
                if (c13iqLJJL != null) {
                    Object objNewInstance = C09R7.LIZ(c13iqLJJL).newInstance();
                    if ((objNewInstance instanceof VideoGenreTagProtocol) && objNewInstance != null) {
                        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(objNewInstance));
                    }
                }
                C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iqLIZIZ = C0RKJ.LIZIZ.LIZIZ();
                if (c13iqLIZIZ != null) {
                    Object objNewInstance2 = C09R7.LIZ(c13iqLIZIZ).newInstance();
                    if ((objNewInstance2 instanceof VideoGenreTagProtocol) && objNewInstance2 != null) {
                        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(objNewInstance2));
                    }
                }
                C578570Mmd.LIZ.getClass();
                if (C578570Mmd.LIZ()) {
                    C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(new FeedCreativeLivePhotoTagTrigger()));
                }
            }
        } else {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
            if (!C281310B0v.LIZ()) {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(new FeedStoryTagTriggerForGenreTagContainer()));
            } else {
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(new FeedStoryTagTriggerV2ForGenreTagContainer()));
            }
            if (!C281310B0v.LIZ() || jm().LIZ != 1) {
                C13IQ<?> c13iqLJJJ = C1EE2.LIZIZ.LJJJ();
                if (c13iqLJJJ != null) {
                    Object objNewInstance3 = C09R7.LIZ(c13iqLJJJ).newInstance();
                    if ((objNewInstance3 instanceof VideoGenreTagProtocol) && objNewInstance3 != null) {
                        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(objNewInstance3));
                    }
                }
                C13IQ<?> c13iqLJ = C0RKJ.LIZIZ.LJ();
                if (c13iqLJ != null) {
                    Object objNewInstance4 = C09R7.LIZ(c13iqLJ).newInstance();
                    if ((objNewInstance4 instanceof VideoGenreTagProtocol) && objNewInstance4 != null) {
                        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(objNewInstance4));
                    }
                }
                C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL2, VideoGenreTagProtocol.class, C1697810uHb.LJIILJJIL(new FeedCreativeLivePhotoForGenreTagContainer()));
            }
        }
        C693590RIn.LIZ(this, new AwS377S0200000_11(C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), VideoGenreTagProtocol.class, false), (List<? extends VideoGenreTagProtocol>) this, (VideoInfoGenreTagContainerAssem) 95));
        C0RJE.LIZLLL(this, (VideoViewModel) this.LLJL.getValue(), new AwS555S0100000_11(this, 1380));
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        ur((VideoItemParams) obj);
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
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
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        String strH3 = H3();
        if (strH3 != null && strH3.length() != 0) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLL.getValue();
            if (interactAreaCommonAbility != null) {
                interactAreaCommonAbility.zB1(this);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void MJ(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1) {
        Vx0(priorityProtocol, function1, null);
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
        C0RYB.LJII(tp());
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility
    public final void Vx0(PriorityProtocol priorityProtocol, Function1<? super View, Unit> function1, Function1<? super View, Unit> function12) {
        tp().ls(priorityProtocol, new AwS170S0400000_11((Function1) function12, (Function1<? super View, Unit>) priorityProtocol, (PriorityProtocol) this, (VideoInfoGenreTagContainerAssem) function1, (Function1<? super View, Unit>) 0), Boolean.valueOf(priorityProtocol.oh()));
    }
}
