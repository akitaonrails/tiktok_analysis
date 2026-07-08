package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm;

import X.AbstractC503810JpL;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0JCN;
import X.C0UO0;
import X.C11RD;
import X.C11S5;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1701940uOG;
import X.C2097608Jq;
import X.C452501pT;
import X.C480460Ism;
import X.C500260Jjc;
import X.C503200JoM;
import X.C504760Jqs;
import X.C504880Jr4;
import X.C504890Jr5;
import X.C504910Jr7;
import X.C504940JrA;
import X.C505040JrK;
import X.C505060JrM;
import X.C505130JrT;
import X.C505430Jrx;
import X.C506340JtQ;
import X.C510380Jzw;
import X.EnumC504930Jr9;
import X.EnumC510330Jzr;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import android.text.Editable;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.CommentSendReq;
import webcast.api.sub.PostActionRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailVM extends AssemViewModel<C506340JtQ> implements C0JCN {
    public InterfaceC665370Q7z LL;
    public C504880Jr4 LLILLJJLI;
    public C504940JrA LLILLL;
    public C504760Jqs LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C505130JrT(this));
    public final ArrayList<PostActionRequest> LLILZLL = new ArrayList<>();

    @Override // X.C0JCN
    public final void LJJLI() {
        C500260Jjc.LJJLIIIJJI(100L, new C505060JrM(this));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C506340JtQ(0);
    }

    public final C504880Jr4 vQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C504880Jr4.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    public final C504890Jr5 wQ2() {
        return (C504890Jr5) this.LLILZIL.getValue();
    }

    public final boolean xQ2() {
        C503200JoM c503200JoM;
        ArrayList<AbstractC503810JpL> arrayList;
        C504760Jqs c504760Jqs = this.LLILZ;
        if (c504760Jqs == null || (c503200JoM = c504760Jqs.LLILLL) == null || (arrayList = c503200JoM.LL) == null) {
            return false;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC503810JpL next = it2.next();
            if (next instanceof C504910Jr7) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean DQ2() {
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        return c504880Jr4VQ2 != null && c504880Jr4VQ2.LLJJJ;
    }

    @Override // X.C0JCN
    public final Editable Mq() {
        Long l;
        HashMap<Long, Editable> map;
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 == null || (l = c504880Jr4VQ2.LLJILJILJ) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        C504880Jr4 c504880Jr4VQ22 = vQ2();
        if (c504880Jr4VQ22 == null || (map = c504880Jr4VQ22.LLJILLL) == null) {
            return null;
        }
        return map.get(Long.valueOf(jLongValue));
    }

    @Override // X.C0JCN
    public final String sp() {
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null) {
            return c504880Jr4VQ2.LLJIJIL;
        }
        return null;
    }

    public final boolean zQ2() {
        User user;
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        String secUid = null;
        String str = c504880Jr4VQ2 != null ? c504880Jr4VQ2.LLJIJIL : null;
        C504880Jr4 c504880Jr4VQ22 = vQ2();
        if (c504880Jr4VQ22 != null && (user = c504880Jr4VQ22.LLJ) != null) {
            secUid = user.getSecUid();
        }
        return Intrinsics.LJFF(str, secUid);
    }

    @Override // X.C0JCN
    public final void Rd(DialogFragment dialogFragment) {
        if (!zQ2()) {
            SubSpaceSecureManager.LIZ(dialogFragment);
        }
    }

    @Override // X.C0JCN
    public final void Ga(Editable editable, List<AtWithIndex> list) {
        Long l;
        HashMap<Long, Editable> map;
        HashMap<Long, List<AtWithIndex>> map2;
        HashMap<Long, List<AtWithIndex>> map3;
        HashMap<Long, Editable> map4;
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null && (l = c504880Jr4VQ2.LLJILJILJ) != null) {
            long jLongValue = l.longValue();
            if (editable != null) {
                C504880Jr4 c504880Jr4VQ22 = vQ2();
                if (c504880Jr4VQ22 != null && (map4 = c504880Jr4VQ22.LLJILLL) != null) {
                    map4.put(Long.valueOf(jLongValue), Editable.Factory.getInstance().newEditable(editable));
                }
            } else {
                C504880Jr4 c504880Jr4VQ23 = vQ2();
                if (c504880Jr4VQ23 != null && (map = c504880Jr4VQ23.LLJILLL) != null) {
                    map.remove(Long.valueOf(jLongValue));
                }
            }
            if (list != null && !list.isEmpty()) {
                C504880Jr4 c504880Jr4VQ24 = vQ2();
                if (c504880Jr4VQ24 != null && (map3 = c504880Jr4VQ24.LLJJ) != null) {
                    map3.put(Long.valueOf(jLongValue), list);
                }
            } else {
                C504880Jr4 c504880Jr4VQ25 = vQ2();
                if (c504880Jr4VQ25 != null && (map2 = c504880Jr4VQ25.LLJJ) != null) {
                    map2.remove(Long.valueOf(jLongValue));
                }
            }
        }
        setState(new C505040JrK(editable));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(long r8, final int r10, final X.C504910Jr7 r11) {
        /*
            r7 = this;
            X.0Jr4 r0 = r7.vQ2()
            if (r0 == 0) goto La4
            java.lang.String r0 = r0.LLJIJIL
            if (r0 == 0) goto La4
            webcast.api.sub.CommentActionRequest r2 = new webcast.api.sub.CommentActionRequest
            r2.<init>()
            r2.postId = r8
            r2.secAnchorId = r0
            r2.commentActionType = r10
            com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r3 = r11.LIZ
            long r0 = r3.commentId
            r2.commentId = r0
            com.bytedance.android.live.base.model.user.User r0 = r3.userInfo
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.getSecUid()
            if (r0 != 0) goto L27
        L25:
            java.lang.String r0 = ""
        L27:
            r2.secCommentUserId = r0
            com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r0 = r11.LIZ
            int r1 = r0.commentType
            X.0Jr9 r0 = X.EnumC504930Jr9.COMMENT
            int r0 = r0.getValue()
            if (r1 == r0) goto Laf
            X.0Jr9 r0 = X.EnumC504930Jr9.REPLY
            int r0 = r0.getValue()
            if (r1 != r0) goto La5
            r0 = 1
        L3e:
            r2.commentType = r0
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi> r0 = com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi.class
            r1.getClass()
            java.lang.Object r0 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi r0 = (com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi) r0
            X.11NZ r1 = r0.commentAction(r2)
            X.0Jzr r2 = X.EnumC510330Jzr.GENERAL
            java.lang.String r3 = "SubSpaceDetailVM"
            java.lang.String r4 = "sub/space/comment/action"
            java.util.Map r5 = X.C2097608Jq.LJ()
            r0 = 353(0x161, float:4.95E-43)
            kotlin.jvm.internal.AFwS237S0000000_7 r6 = kotlin.jvm.internal.AFwS237S0000000_7.get$arr$(r0)
            X.11NZ r1 = X.C510380Jzw.LJIILJJIL(r1, r2, r3, r4, r5, r6)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r1 = r1.LJIILIIL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.11L0 r0 = X.C11RD.LJ(r7)
            java.lang.Object r2 = r1.LIZJ(r0)
            X.0J1N r2 = (X.C0J1N) r2
            if (r2 == 0) goto L99
            X.0JpD r1 = new X.0JpD
            r1.<init>()
            X.0JpC r0 = new X.0JpC
            r0.<init>()
            r2.LIZ(r1, r0)
        L99:
            if (r10 != 0) goto La4
            X.0Jr5 r1 = r7.wQ2()
            java.lang.String r0 = "like"
            r1.LIZIZ(r0)
        La4:
            return
        La5:
            X.0Jr9 r0 = X.EnumC504930Jr9.REPLY_TO_REPLY
            int r0 = r0.getValue()
            if (r1 != r0) goto Laf
            r0 = 2
            goto L3e
        Laf:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM.AQ2(long, int, X.0Jr7):void");
    }

    public final void BQ2(long j, final int i, final AbstractC503810JpL abstractC503810JpL) {
        String str;
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null && (str = c504880Jr4VQ2.LLJIJIL) != null) {
            final PostActionRequest postActionRequest = new PostActionRequest();
            postActionRequest.postId = j;
            postActionRequest.secAnchorId = str;
            postActionRequest.postAction = i;
            Iterator<PostActionRequest> it2 = this.LLILZLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PostActionRequest next = it2.next();
                PostActionRequest postActionRequest2 = next;
                if (postActionRequest2.postId == postActionRequest.postId && postActionRequest2.postAction == postActionRequest.postAction && Intrinsics.LJFF(postActionRequest2.secAnchorId, postActionRequest.secAnchorId)) {
                    if (next != null) {
                        return;
                    }
                }
            }
            this.LLILZLL.add(postActionRequest);
            C480460Ism.LIZ().getClass();
            C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).postAction(postActionRequest), EnumC510330Jzr.GENERAL, "SubSpaceDetailVM", "sub/space/post/action", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this));
            if (c0j1n != null) {
                c0j1n.LIZ(new C09JN() { // from class: X.0JpU
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        boolean z;
                        C1C7U.LIZ("SubSpaceDetailVM@ca2c.postActionTopic$1");
                        this.LL.LLILZLL.remove(postActionRequest);
                        SpacePost spacePostLIZ = abstractC503810JpL.LIZ();
                        if (spacePostLIZ != null) {
                            if (i == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            spacePostLIZ.userLiked = z;
                            if (z) {
                                spacePostLIZ.likeCount++;
                            } else {
                                spacePostLIZ.likeCount--;
                            }
                            C504760Jqs c504760Jqs = this.LL.LLILZ;
                            if (c504760Jqs != null) {
                                c504760Jqs.LJ(spacePostLIZ);
                            }
                        }
                        C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.postActionTopic$1");
                    }
                }, new C09JN() { // from class: X.0JpT
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubSpaceDetailVM@ca2c.postActionTopic$2");
                        this.LL.LLILZLL.remove(postActionRequest);
                        C501540Jlg.LIZJ(C176600m4.LIZ(), (Throwable) obj);
                        C504760Jqs c504760Jqs = this.LL.LLILZ;
                        if (c504760Jqs != null) {
                            c504760Jqs.LJ(abstractC503810JpL.LIZ());
                        }
                        C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.postActionTopic$2");
                    }
                });
            }
            if (i == 0) {
                wQ2().LIZIZ("like");
            }
        }
    }

    @Override // X.C0JCN
    public final void CN1(SpaceCommentItem spaceCommentItem, String str, List list) {
        HashMap<Long, Editable> map;
        yQ2(spaceCommentItem, str, list);
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null && (map = c504880Jr4VQ2.LLJILLL) != null) {
            map.remove(Long.valueOf(spaceCommentItem.commentId));
        }
    }

    public final void CQ2(int i, final Function0<Unit> function0, final Function1<? super Throwable, Unit> function1) {
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null) {
            long j = c504880Jr4VQ2.LLILZ;
            C480460Ism.LIZ().getClass();
            C0J1N c0j1n = (C0J1N) C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).postPinAction(j, i), EnumC510330Jzr.GENERAL, "SubSpaceDetailVM", "sub/space/post/pin_action", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this));
            if (c0j1n != null) {
                c0j1n.LIZ(new C09JN() { // from class: X.0JrI
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubSpaceDetailVM@ca2c.postPinAction$1");
                        function0.invoke();
                        C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.postPinAction$1");
                    }
                }, new C09JN() { // from class: X.0JrB
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("SubSpaceDetailVM@ca2c.postPinAction$2");
                        function1.invoke(obj);
                        C1C7U.LIZIZ("SubSpaceDetailVM@ca2c.postPinAction$2");
                    }
                });
            }
        }
    }

    @Override // X.C0JCN
    public final void FF1(String str, List<AtWithIndex> list, SpacePost spacePost) {
        HashMap<Long, Editable> map;
        yQ2(null, str, list);
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null && (map = c504880Jr4VQ2.LLJILLL) != null) {
            map.remove(Long.valueOf(spacePost.postId));
        }
    }

    public final void yQ2(SpaceCommentItem spaceCommentItem, String str, List list) {
        String str2;
        long j;
        int value;
        CommentSendReq commentSendReq = new CommentSendReq();
        C504880Jr4 c504880Jr4VQ2 = vQ2();
        if (c504880Jr4VQ2 != null) {
            commentSendReq.postId = c504880Jr4VQ2.LLILZ;
        }
        C504880Jr4 c504880Jr4VQ22 = vQ2();
        if (c504880Jr4VQ22 == null || (str2 = c504880Jr4VQ22.LLJIJIL) == null) {
            str2 = "";
        }
        commentSendReq.secAnchorId = str2;
        commentSendReq.atList.addAll(list);
        if (spaceCommentItem == null) {
            value = EnumC504930Jr9.COMMENT.getValue();
        } else if (spaceCommentItem.commentType == EnumC504930Jr9.COMMENT.getValue()) {
            commentSendReq.replyToCommentId = spaceCommentItem.commentId;
            commentSendReq.replyToUserId = spaceCommentItem.userId;
            value = EnumC504930Jr9.REPLY.getValue();
        } else {
            if (spaceCommentItem.commentType != EnumC504930Jr9.REPLY.getValue() && spaceCommentItem.commentType != EnumC504930Jr9.REPLY_TO_REPLY.getValue()) {
                return;
            }
            SpaceCommentItem spaceCommentItem2 = spaceCommentItem.replyCommentInfo;
            if (spaceCommentItem2 != null) {
                j = spaceCommentItem2.commentId;
            } else {
                j = 0;
            }
            commentSendReq.replyToCommentId = j;
            commentSendReq.replyToReplyId = spaceCommentItem.commentId;
            commentSendReq.replyToUserId = spaceCommentItem.userId;
            value = EnumC504930Jr9.REPLY_TO_REPLY.getValue();
        }
        commentSendReq.commentType = value;
        commentSendReq.text = str;
        setState(new C505430Jrx());
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceDetailAbility subSpaceDetailAbility = (SubSpaceDetailAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceDetailAbility.class, null);
        if (subSpaceDetailAbility != null) {
            subSpaceDetailAbility.sendComment(commentSendReq);
        }
    }
}
