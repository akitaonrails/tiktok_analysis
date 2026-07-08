package com.ss.android.ugc.aweme.lemon.comment.powercell;

import X.C03H5;
import X.C0S1B;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1340920kzy;
import X.C1340950l01;
import X.C1340980l04;
import X.C1341040l0A;
import X.C1341050l0B;
import X.C1341780l1M;
import X.C1356140lOW;
import X.C1356610lPH;
import X.C1372580lp2;
import X.C1388190mED;
import X.C13LP;
import X.C1401850maF;
import X.C1402430mbB;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1608750rxx;
import X.C1770850wBP;
import X.C1843500y4a;
import X.C19474211Gy;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2344809Gs;
import X.C427660Gpo;
import X.C431400Gvq;
import X.C439870HMr;
import X.C666010QAl;
import X.C703302op;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1341630l17;
import X.EnumC1341650l19;
import X.EnumC1356100lOS;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import u4.q0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class Lemon8BaseCommentCell<T extends C1340920kzy> extends PowerCell<T> implements InterfaceC724530SbT {
    public C1341050l0B LL;
    public TuxTextView LLILLJJLI;
    public AvatarComponentView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;

    public abstract View S5(ViewGroup viewGroup);

    public final void U5() {
        User user;
        AvatarComponentView avatarComponentView;
        Comment commentL5 = L5();
        if (commentL5 == null || (user = commentL5.getUser()) == null || user.getUid() == null) {
            return;
        }
        AvatarComponentView avatarComponentView2 = this.LLILLL;
        if ((avatarComponentView2 == null || !avatarComponentView2.LJII()) && (avatarComponentView = this.LLILLL) != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            config.LIZ(AFwS259S0000000_21.get$arr$(406));
            new AwS600S0100000_21(this, (Lemon8BaseCommentCell<C1340920kzy>) 351).invoke(config.LIZJ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        AvatarComponentView avatarComponentView3 = this.LLILLL;
        if (avatarComponentView3 != null) {
            C0S1B.LIZ(avatarComponentView3, user.getUid(), user, this, false, new AwS387S0200000_21((Lemon8BaseCommentCell) this, user, (User) 30), 16);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(user.getNickname());
        }
    }

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

    public final C1341050l0B I5() {
        if (this.LL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(this.itemView, null), "source_default_key", C1341050l0B.class, null);
            this.LL = interfaceC1555100qZQLIZIZ != null ? (C1341050l0B) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LL;
    }

    public final Comment L5() {
        T item = getItem();
        if (item != null) {
            return item.LIZ();
        }
        return null;
    }

    public final void T5() throws Throwable {
        String text;
        Comment commentL5 = L5();
        if (commentL5 == null || (text = commentL5.getText()) == null) {
            text = "";
        }
        if (C703302op.LIZ(text)) {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setText(text);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            C439870HMr.LIZJ(this.LLILZ, null);
        } else {
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        C431400Gvq c431400Gvq = C431400Gvq.LIZ;
        TuxTextView tuxTextView4 = this.LLILZ;
        if (tuxTextView4 != null) {
            tuxTextView4.setMovementMethod(c431400Gvq);
        }
    }

    public final Aweme getAweme() {
        C1341040l0A commonModel;
        C1341050l0B c1341050l0BI5 = I5();
        if (c1341050l0BI5 == null || (commonModel = c1341050l0BI5.getCommonModel()) == null) {
            return null;
        }
        return commonModel.getAweme();
    }

    public final String getEventType() {
        C1341040l0A commonModel;
        C1341050l0B c1341050l0BI5 = I5();
        if (c1341050l0BI5 == null || (commonModel = c1341050l0BI5.getCommonModel()) == null) {
            return null;
        }
        return commonModel.getEventType();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        C427660Gpo avatar;
        super.onItemViewCreated();
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.title);
        this.LLILLJJLI = tuxTextView;
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, tuxTextView, EnumC1341650l19.USERNAME, 0.0f, null, 12);
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            C786410Ut5.I7(new C1401850maF(this, 34), tuxTextView2);
        }
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.itemView.findViewById(R.id.bi1);
        this.LLILLL = avatarComponentView;
        if (avatarComponentView != null && (avatar = avatarComponentView.getAvatar()) != null) {
            avatar.setImportantForAccessibility(2);
        }
        AvatarComponentView avatarComponentView2 = this.LLILLL;
        if (avatarComponentView2 != null) {
            avatarComponentView2.LIZ(1, new ACListenerS155S0100000_21(this, 241));
        }
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.eu1);
        this.LLILZ = tuxTextView3;
        if (tuxTextView3 != null) {
            tuxTextView3.setBreakStrategy(0);
        }
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.ee7);
        TuxTextView tuxTextView4 = (TuxTextView) this.itemView.findViewById(R.id.ecz);
        this.LLILZLL = tuxTextView4;
        if (tuxTextView4 != null) {
            C786410Ut5.I7(new C1401850maF(this, 33), tuxTextView4);
        }
        TuxTextView tuxTextView5 = this.LLILZLL;
        if (tuxTextView5 != null) {
            q0.LJIJ(tuxTextView5, new C1402430mbB(4));
        }
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.zts);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) throws Throwable {
        int iIntValue;
        String strLIZIZ;
        C1340950l01 c1340950l01LIZIZ;
        C1340950l01 c1340950l01LIZIZ2;
        Integer numValueOf;
        int i;
        long createTime;
        Comment commentL5;
        Comment commentL52;
        super.onBindItemView(t);
        Comment commentL53 = L5();
        if (commentL53 != null && commentL53.isUserDigged() && (commentL5 = L5()) != null && commentL5.getDiggCount() == 0 && (commentL52 = L5()) != null) {
            commentL52.setDiggCount(1);
        }
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            Context context = this.itemView.getContext();
            Comment commentL54 = L5();
            if (commentL54 != null) {
                createTime = ((long) commentL54.getCreateTime()) * 1000;
            } else {
                createTime = 0;
            }
            tuxTextView.setText(C1356610lPH.LIZJ(createTime, context));
        }
        U5();
        T5();
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            if (C666010QAl.LIZIZ.showEngagementCount()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLIZ;
        if (tuxTextView3 != null) {
            Resources resources = this.itemView.getContext().getResources();
            T item = getItem();
            Integer numValueOf2 = null;
            if (item != null && (c1340950l01LIZIZ2 = item.LIZIZ()) != null && (numValueOf = Integer.valueOf(c1340950l01LIZIZ2.LIZIZ)) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            Object[] objArr = new Object[1];
            C1372580lp2 c1372580lp2 = C1372580lp2.LIZ;
            T item2 = getItem();
            if (item2 != null && (c1340950l01LIZIZ = item2.LIZIZ()) != null) {
                numValueOf2 = Integer.valueOf(c1340950l01LIZIZ.LIZIZ);
            }
            c1372580lp2.getClass();
            if (numValueOf2 != null && numValueOf2.intValue() > 0) {
                strLIZIZ = C1843500y4a.LIZIZ(numValueOf2.intValue());
            } else {
                strLIZIZ = CardStruct.IStatusCode.DEFAULT;
            }
            objArr[0] = strLIZIZ;
            tuxTextView3.setText(resources.getQuantityString(2131755771, iIntValue, objArr));
        }
        C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return S5(viewGroup);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: P5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t, List<? extends Object> list) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindItemView for change ");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C2344809Gs.LIZ) {
            C2344809Gs.LIZLLL(4, "BaseCommentCell", strLIZIZ);
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C1340980l04)) {
            return;
        }
        C1340980l04 c1340980l04 = (C1340980l04) objLJJJLZIJ;
        if (c1340980l04.LIZ) {
            T5();
        }
        if (c1340980l04.LIZIZ) {
            U5();
        }
    }

    public final void R5(EnumC1356100lOS enumC1356100lOS, String str, String str2) {
        Aweme aweme;
        EnumC1341630l17 enumC1341630l17;
        String cid;
        C1341040l0A commonModel;
        C1356140lOW c1356140lOW = C1356140lOW.LIZ;
        Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
        C1341050l0B c1341050l0BI5 = I5();
        if (c1341050l0BI5 != null && (commonModel = c1341050l0BI5.getCommonModel()) != null) {
            aweme = commonModel.getAweme();
        } else {
            aweme = null;
        }
        if (enumC1356100lOS == EnumC1356100lOS.COMMENT_REPLY_MODAL) {
            enumC1341630l17 = EnumC1341630l17.DETAIL;
        } else {
            enumC1341630l17 = EnumC1341630l17.PROFILE;
        }
        Pair[] pairArr = new Pair[3];
        String eventType = getEventType();
        String str3 = "";
        if (eventType == null) {
            eventType = "";
        }
        pairArr[0] = new Pair("enter_from", eventType);
        Comment commentL5 = L5();
        if (commentL5 != null && (cid = commentL5.getCid()) != null) {
            str3 = cid;
        }
        pairArr[1] = new Pair("comment_id", str3);
        pairArr[2] = new Pair("user_name", str2);
        C1356140lOW.LIZIZ(c1356140lOW, activityLIZ, aweme, str, enumC1341630l17, enumC1356100lOS, C2097608Jq.LJIIIIZZ(pairArr), 96);
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
