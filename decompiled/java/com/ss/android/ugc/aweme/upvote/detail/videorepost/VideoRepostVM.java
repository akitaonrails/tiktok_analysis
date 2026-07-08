package com.ss.android.ugc.aweme.upvote.detail.videorepost;

import X.C03H5;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1358880lSw;
import X.C1358950lT3;
import X.C1360460lVU;
import X.C13LE;
import X.C1720106oR;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452070Ho5;
import X.C618720OOo;
import X.C724750Sbp;
import X.C731910SnN;
import X.C732160Snm;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS8S0110100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoRepostVM extends FeedRightBtnBaseViewModel<C732160Snm> implements InterfaceC724530SbT {
    public boolean LL;
    public volatile boolean LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public final C736950SvV LLILZIL;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel, com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C736680Sv4.LJIIIIZZ(this, this.LLILZIL.getValue(), new C2217381BqS() { // from class: X.0Ssd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358700lSe) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 87), 4);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C732160Snm(null);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedRightBtnBaseViewModel
    public final void onForceHideTextFlagChange() {
        setState(new AwS590S0100000_11(this, 311));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoRepostVM() {
        this.LLILZIL = new C736950SvV(C13LE.LIZ(UpvotePublishVM.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS243S0000000_11.get$arr$(547), null, null, null);
    }

    public final void wQ2(boolean z) {
        Aweme aweme;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleRepostSuccess: selected: ");
        sbLIZ.append(z);
        C1720106oR.LIZ("VideoRepostVM", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = false;
        VideoItemParams item = getItem();
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        setState(new AwS8S0110100_11(this, xQ2(aweme, z), z, 0));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final InterfaceC0148002o paramSync2StateAccept(InterfaceC0148002o interfaceC0148002o, VideoItemParams videoItemParams) {
        long repostCount;
        boolean zBooleanValue;
        String aid;
        boolean z;
        List<UpvoteStruct> list;
        Aweme aweme;
        long repostCount2;
        UpvoteInfo upvoteInfo;
        Boolean bool;
        AwemeStatistics statistics;
        Aweme aweme2 = videoItemParams.getAweme();
        long repostCount3 = 0;
        if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
            repostCount = statistics.getRepostCount();
        } else {
            repostCount = 0;
        }
        this.LLILZ = repostCount;
        int size = 0;
        if (aweme2 != null && (upvoteInfo = aweme2.getUpvoteInfo()) != null && (bool = upvoteInfo.userReposted) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILLL = zBooleanValue;
        boolean z2 = true;
        Long lValueOf = null;
        if (aweme2 != null) {
            if (C1360460lVU.LIZIZ.LJJIIZ(aweme2.getAid())) {
                UpvoteInfo upvoteInfo2 = aweme2.getUpvoteInfo();
                if (upvoteInfo2 == null || !Intrinsics.LJFF(upvoteInfo2.userReposted, Boolean.TRUE)) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("modifyStateIfNeed: aid: ");
                    sbLIZ.append(aweme2.getAid());
                    sbLIZ.append(" upvote is reposted, but aweme is not");
                    C1720106oR.LIZ("VideoRepostVM", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILLL = true;
                    AwemeStatistics statistics2 = aweme2.getStatistics();
                    if (statistics2 != null) {
                        repostCount2 = statistics2.getRepostCount();
                    } else {
                        repostCount2 = 0;
                    }
                    C1358880lSw c1358880lSw = C1358880lSw.LIZ;
                    String aid2 = aweme2.getAid();
                    c1358880lSw.getClass();
                    UpvoteList upvoteListLJFF = C1358880lSw.LJFF(aid2);
                    if (upvoteListLJFF != null) {
                        repostCount3 = upvoteListLJFF.total;
                    }
                    this.LLILZ = Math.max(repostCount2, repostCount3);
                }
            } else {
                UpvoteInfo upvoteInfo3 = aweme2.getUpvoteInfo();
                if (upvoteInfo3 != null && Intrinsics.LJFF(upvoteInfo3.userReposted, Boolean.TRUE)) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("modifyStateIfNeed: aid: ");
                    sbLIZ2.append(aweme2.getAid());
                    sbLIZ2.append(" upvote is not reposted, but aweme is");
                    C1720106oR.LIZ("VideoRepostVM", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLILLL = true;
                    AwemeStatistics statistics3 = aweme2.getStatistics();
                    if (statistics3 != null) {
                        repostCount3 = statistics3.getRepostCount();
                    }
                    this.LLILZ = repostCount3;
                    String aid3 = aweme2.getAid();
                    if (aid3 != null) {
                        C1720106oR.LIZ("VideoRepostVM", "modifyStateIfNeed: publish fake upvote");
                        C1358950lT3.LIZ.LJI(aid3, null, null, null);
                    }
                }
            }
        }
        boolean z3 = this.LLILLL;
        long jXQ2 = xQ2(aweme2, z3);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onUpdateAweme: aid: ");
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ3.append(aid);
        sbLIZ3.append(" selected: ");
        sbLIZ3.append(z3);
        sbLIZ3.append(" displayCount: ");
        sbLIZ3.append(jXQ2);
        C2188811AlT.LIZIZ(sbLIZ3);
        C732160Snm c732160Snm = new C732160Snm(vQ2(jXQ2, aweme2, z3));
        Aweme aweme3 = videoItemParams.getAweme();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        c2344009Gk.LJ(Boolean.valueOf(c1360460lVU.LJJIIZ(aweme3.getAid())), "have_my_upvote");
        if (c1360460lVU.LJIIIIZZ(aweme3.getAid()) != null) {
            z = true;
        } else {
            z = false;
        }
        c2344009Gk.LJ(Boolean.valueOf(z), "have_request_bubble");
        if (aweme3.getUpvoteInfo() != null) {
            z2 = false;
        }
        c2344009Gk.LJ(Boolean.valueOf(z2), "upvote_info_empty");
        AwemeStatistics statistics4 = aweme3.getStatistics();
        if (statistics4 != null) {
            lValueOf = Long.valueOf(statistics4.getRepostCount());
        }
        c2344009Gk.LJ(lValueOf, "upvote_count");
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aweme3.getAid());
        if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
            size = list.size();
        }
        c2344009Gk.LIZJ(size, "bubble_count");
        C20684815ws.LJIILLIIL("upvote_element_bubble_and_upvote_info", c2344009Gk.LIZ);
        return c732160Snm;
    }

    public final long xQ2(Aweme aweme, boolean z) {
        long j;
        AwemeStatistics statistics;
        if (aweme != null) {
            this.LL = z;
            if (z) {
                if (this.LLILLL) {
                    if (this.LLILZ < 1 && !AwemeExtKt.isDelete(aweme)) {
                        this.LLILZ = 1L;
                    }
                    j = this.LLILZ;
                } else {
                    j = 1 + this.LLILZ;
                }
            } else if (this.LLILLL && !AwemeExtKt.isDelete(aweme)) {
                j = this.LLILZ - 1;
            } else {
                j = this.LLILZ;
            }
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 != null && statistics2.getRepostCount() != j && (statistics = aweme.getStatistics()) != null) {
                statistics.setRepostCount(j);
            }
            return j;
        }
        return 0L;
    }

    public final C731910SnN vQ2(long j, Aweme aweme, boolean z) {
        long j2 = 0;
        if (aweme != null) {
            if (j >= 0) {
            }
            String strLIZ = C618720OOo.LIZ(j2);
            updateOrigin(0);
            return new C731910SnN(strLIZ, z, getForceTextShow(), true);
        }
        j = 0;
        j2 = j;
        String strLIZ2 = C618720OOo.LIZ(j2);
        updateOrigin(0);
        return new C731910SnN(strLIZ2, z, getForceTextShow(), true);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
