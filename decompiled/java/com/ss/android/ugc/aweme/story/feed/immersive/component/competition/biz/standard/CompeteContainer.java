package com.ss.android.ugc.aweme.story.feed.immersive.component.competition.biz.standard;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0RGR;
import X.C0RKW;
import X.C0ROK;
import X.C0ROP;
import X.C0RXA;
import X.C0RXZ;
import X.C0S9O;
import X.C123100dR;
import X.C15438062q;
import X.C2188811AlT;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C690870R8b;
import X.C694940RNs;
import X.C697330RWx;
import X.C700170RdH;
import X.C700260RdQ;
import X.C700950ReX;
import X.C700960ReY;
import X.C700970ReZ;
import X.C701270Rf3;
import X.C701370RfD;
import X.C729510SjV;
import X.InterfaceC1445905lJ;
import X.InterfaceC1449905lx;
import X.InterfaceC695090ROh;
import X.InterfaceC697220RWm;
import X.InterfaceC697640RYc;
import X.InterfaceC699200Rbi;
import X.InterfaceC699620RcO;
import X.InterfaceC700000Rd0;
import X.InterfaceC700020Rd2;
import X.InterfaceC700270RdR;
import X.InterfaceC700280RdS;
import X.InterfaceC700750ReD;
import X.InterfaceC701260Rf2;
import X.InterfaceC702410Rgt;
import X.InterfaceC703670Riv;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CompeteContainer extends BaseCellContentComponent<CompeteContainer> implements FcpNodeProtocol, InterfaceC702410Rgt, C0RGR, InterfaceC697220RWm {
    public final InterfaceC697220RWm LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C630740Ooa LLJJLIIIJLLLLLLLZ;
    public C0RKW LLJL;
    public Aweme LLJLIL;
    public Aweme LLJLILLLLZIIL;

    public CompeteContainer() {
        this(0);
    }

    @Override // X.InterfaceC697220RWm
    public final void Ah(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJJJJLIIL.Ah(interfaceC702410Rgt);
    }

    @Override // X.InterfaceC697220RWm
    public final C700970ReZ In() {
        return this.LLJJJJLIIL.In();
    }

    @Override // X.InterfaceC697220RWm
    public final C700170RdH J9() {
        return this.LLJJJJLIIL.J9();
    }

    @Override // X.InterfaceC697220RWm
    public final void N7(Function1<? super C700170RdH, ? extends InterfaceC695090ROh> function1, String str, ForkJoinPool forkJoinPool, Function0<FeedComponentPriorityData> function0, InterfaceC700020Rd2<?> interfaceC700020Rd2, Function0<? extends List<String>> function02, Function1<? super FcpNodeProtocol, Boolean> function12, Executor executor, InterfaceC697640RYc interfaceC697640RYc, Function0<Boolean> function03, Function0<? extends InterfaceC699620RcO> function04, Function0<? extends InterfaceC699200Rbi<?>> function05, InterfaceC700280RdS interfaceC700280RdS, InterfaceC700270RdR interfaceC700270RdR, AbstractC738140SxQ abstractC738140SxQ, FcpNodeProtocol fcpNodeProtocol, Function0<? extends C0RXZ> function06) {
        this.LLJJJJLIIL.N7(function1, str, forkJoinPool, function0, interfaceC700020Rd2, function02, function12, executor, interfaceC697640RYc, function03, function04, function05, interfaceC700280RdS, interfaceC700270RdR, abstractC738140SxQ, fcpNodeProtocol, function06);
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Td() {
        return this.LLJJJJLIIL.Td();
    }

    @Override // X.InterfaceC697220RWm
    public final void U(Function1<? super InterfaceC1449905lx<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>, ? extends Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ>>>[] function1Arr, Function1<? super InterfaceC703670Riv<C701270Rf3>, ? extends Function1<? super Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>, ? extends Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD>>>... function1Arr2) {
        this.LLJJJJLIIL.U(function1Arr, function1Arr2);
    }

    @Override // X.InterfaceC697220RWm
    public final void Xg(InterfaceC702410Rgt interfaceC702410Rgt) {
        this.LLJJJJLIIL.Xg(interfaceC702410Rgt);
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> Xh() {
        return this.LLJJJJLIIL.Xh();
    }

    @Override // X.InterfaceC697220RWm
    public final C0RXZ ca() {
        return this.LLJJJJLIIL.ca();
    }

    public C700950ReX ep(C700950ReX c700950ReX) {
        return c700950ReX;
    }

    @Override // X.InterfaceC697220RWm
    public final void gg(C700260RdQ c700260RdQ) {
        this.LLJJJJLIIL.gg(c700260RdQ);
    }

    public abstract C0ROP<VideoItemParams, C690870R8b> hp();

    public abstract void ip(C694940RNs c694940RNs);

    @Override // X.InterfaceC697220RWm
    public final C0RXZ li() {
        return this.LLJJJJLIIL.li();
    }

    @Override // X.InterfaceC697220RWm
    public final void lm() {
        this.LLJJJJLIIL.lm();
    }

    public void lp(C700950ReX c700950ReX) {
    }

    @Override // X.InterfaceC697220RWm
    public final String o1() {
        return this.LLJJJJLIIL.o1();
    }

    @Override // X.InterfaceC697220RWm
    public final void ol() {
        this.LLJJJJLIIL.ol();
    }

    @Override // X.InterfaceC697220RWm
    public final Map<String, FcpNodeProtocol> q6() {
        return this.LLJJJJLIIL.q6();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // X.InterfaceC697220RWm
    public final String xg() {
        return this.LLJJJJLIIL.xg();
    }

    @Override // X.InterfaceC697220RWm
    public final void zf() {
        this.LLJJJJLIIL.zf();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return H3();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public void Vo() {
        Xg(this);
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (storyCollectionCellAbility != null) {
            storyCollectionCellAbility.Z50(this);
        }
    }

    @Override // X.InterfaceC702410Rgt
    public final void hl() {
        C0ROK.LJ(hp(), (C694940RNs) this.LLJJL.getValue());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public void unBind() {
        lm();
        ol();
    }

    public CompeteContainer(int i) {
        this.LLJJJJLIIL = new C701370RfD();
        this.LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1486));
        this.LLJJLIIIJLLLLLLLZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 1485));
        N7(new AwS590S0100000_11(this, 452), H3(), (ForkJoinPool) C0S9O.LIZIZ.getValue(), new AwS555S0100000_11(this, 1483), new C697330RWx(new AwS555S0100000_11(this, 1484), null), AFwS187S0000000_2.get$arr$(1077), null, C0RXA.LL, null, null, null, null, null, null, null, null, null);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: kp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        Boolean boolValueOf;
        String aid;
        Boolean boolValueOf2;
        String aid2;
        Story story;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 12304);
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("】, doExecuteFcpPolicy, aid = ");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        sbLIZ.append(", isPublishing = ");
        Story story2 = videoItemParams.getAweme().getStory();
        String aid3 = null;
        if (story2 != null) {
            boolValueOf = Boolean.valueOf(story2.isPublishing());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", lastBindAid = ");
        Aweme aweme = this.LLJLIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", lasBindIsPublishing = ");
        Aweme aweme2 = this.LLJLIL;
        if (aweme2 != null && (story = aweme2.getStory()) != null) {
            boolValueOf2 = Boolean.valueOf(story.isPublishing());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C729510SjV.LJJIIZ(videoItemParams.getAweme())) {
            return;
        }
        Aweme aweme3 = this.LLJLIL;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        if (Intrinsics.LJFF(aid2, videoItemParams.getAweme().getAid())) {
            Aweme aweme4 = this.LLJLIL;
            if (aweme4 != null) {
                aid3 = aweme4.getAid();
            }
            if (C123100dR.LIZ(aid3)) {
                return;
            }
        }
        this.LLJLIL = videoItemParams.getAweme();
        zf();
        gg(new C700260RdQ(null, null, true, null, 11));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (storyCollectionCellAbility != null) {
            storyCollectionCellAbility.LB0(this);
        }
        Ah(this);
        U(null, new Function1[0]);
    }

    @Override // X.C0RGR
    public final void sl(VideoItemParams videoItemParams) {
        Boolean boolValueOf;
        String aid;
        Boolean boolValueOf2;
        String aid2;
        String aid3;
        Story story;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((char) 12304);
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("】, onCompeteInit, pre aid = ");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        sbLIZ.append(", pre isPublishing = ");
        Story story2 = videoItemParams.getAweme().getStory();
        C700950ReX c700950ReXLIZIZ = null;
        if (story2 != null) {
            boolValueOf = Boolean.valueOf(story2.isPublishing());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", lastPreBindAid = ");
        Aweme aweme = this.LLJLILLLLZIIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", lastPreBindIsPublishing = ");
        Aweme aweme2 = this.LLJLILLLLZIIL;
        if (aweme2 != null && (story = aweme2.getStory()) != null) {
            boolValueOf2 = Boolean.valueOf(story.isPublishing());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (C729510SjV.LJJIIZ(videoItemParams.getAweme())) {
            return;
        }
        Aweme aweme3 = this.LLJLILLLLZIIL;
        if (aweme3 != null) {
            aid2 = aweme3.getAid();
        } else {
            aid2 = null;
        }
        if (Intrinsics.LJFF(aid2, videoItemParams.getAweme().getAid())) {
            Aweme aweme4 = this.LLJLILLLLZIIL;
            if (aweme4 != null) {
                aid3 = aweme4.getAid();
            } else {
                aid3 = null;
            }
            if (C123100dR.LIZ(aid3)) {
                return;
            }
        }
        this.LLJLILLLLZIIL = videoItemParams.getAweme();
        C0ROP<VideoItemParams, C690870R8b> c0ropHp = hp();
        C700170RdH c700170RdHJ9 = J9();
        if (c700170RdHJ9 != null) {
            c700950ReXLIZIZ = C700960ReY.LIZIZ(c700170RdHJ9);
        }
        C0ROK.LIZLLL(c0ropHp, c700950ReXLIZIZ, (C694940RNs) this.LLJJL.getValue(), videoItemParams, jm());
        lm();
        ol();
    }

    @Override // X.InterfaceC702410Rgt
    public void vg(C700950ReX c700950ReX) {
        ArrayList arrayList;
        List<C700970ReZ> list;
        lp(c700950ReX);
        C700950ReX c700950ReXEp = ep(c700950ReX);
        C0ROP<VideoItemParams, C690870R8b> c0ropHp = hp();
        if (c700950ReXEp != null && (list = c700950ReXEp.LIZIZ) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C700970ReZ> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZJ);
            }
        } else {
            arrayList = null;
        }
        C0ROK.LIZJ(c0ropHp, arrayList);
        C0ROK.LIZ(hp(), (C694940RNs) this.LLJJL.getValue());
    }
}
