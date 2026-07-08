package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm;

import X.AbstractC511160K2w;
import X.C01GW;
import X.C0JCK;
import X.C0JCO;
import X.C0K37;
import X.C0K3G;
import X.C0K3H;
import X.C0K3I;
import X.C0K3J;
import X.C0K3S;
import X.C0K4E;
import X.C0K4J;
import X.C0K4L;
import X.C0K51;
import X.C0K7T;
import X.C0K7X;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1701940uOG;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C452501pT;
import X.C506360JtS;
import X.C511970K5z;
import X.C512160K6s;
import X.C786410Ut5;
import X.EnumC499440JiI;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import Y.ARunnableS107S0100000_7;
import Y.AfS103S0300000_7;
import Y.AfS176S0100000_7;
import Y.AfS27S0301000_7;
import android.os.Handler;
import android.text.Editable;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCPostActionRequest;
import webcast.api.pgc_sub.PGCPostActionResponse;
import webcast.api.pgc_sub.PGCPostPinActionResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailVM extends AssemViewModel<C506360JtS> implements C0JCO {
    public InterfaceC665370Q7z LL;
    public C0K3S LLILLJJLI;
    public C0K3G LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 486));
    public final ArrayList<PGCPostActionRequest> LLILZIL = new ArrayList<>();

    @Override // X.C0JCO
    public final void LJJLI() {
        C786410Ut5.LJLIIL(100L, (Handler) C0K51.LIZ.getValue(), new ARunnableS107S0100000_7((Function0) new AwS551S0100000_7(this, 485), 194));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C506360JtS(0);
    }

    public final C0K3S xQ2() {
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0K3S.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C0K3S) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    public final C0K3H yQ2() {
        return (C0K3H) this.LLILZ.getValue();
    }

    public final boolean zQ2() {
        C0K37 c0k37;
        ArrayList<AbstractC511160K2w> arrayList;
        C0K3G c0k3g = this.LLILLL;
        if (c0k3g == null || (c0k37 = c0k3g.LLILLL) == null || (arrayList = c0k37.LL) == null) {
            return false;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC511160K2w next = it2.next();
            if (next instanceof C0K3J) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean BQ2() {
        User user;
        C0K3S c0k3sXQ2 = xQ2();
        String secUid = null;
        String str = c0k3sXQ2 != null ? c0k3sXQ2.LLJIJIL : null;
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (user = c0k3sXQ22.LLJ) != null) {
            secUid = user.getSecUid();
        }
        return Intrinsics.LJFF(str, secUid);
    }

    @Override // X.C0K8Z
    public final void Mc() {
        SpaceCommentItem spaceCommentItem;
        C0K3S c0k3sXQ2 = xQ2();
        Long lValueOf = null;
        Long lValueOf2 = c0k3sXQ2 != null ? Long.valueOf(c0k3sXQ2.LLILZ) : null;
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (spaceCommentItem = c0k3sXQ22.LLJJI) != null) {
            lValueOf = Long.valueOf(spaceCommentItem.commentId);
        }
        C2252331DDr c2252331DDr = C512160K6s.LIZ;
        C512160K6s.LIZ(new C0K7T("text_changed", lValueOf2, lValueOf, 0, 8));
    }

    @Override // X.C0JCO
    public final Editable Mq() {
        Long l;
        String str;
        Editable editableNewEditable;
        HashMap<Long, Editable> map;
        HashMap<Long, Editable> map2;
        Editable editable;
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 == null || (l = c0k3sXQ2.LLJILJILJ) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (map2 = c0k3sXQ22.LLJILLL) != null && (editable = map2.get(Long.valueOf(jLongValue))) != null) {
            return editable;
        }
        C0K4L c0k4lLIZ = C0K4E.LIZ();
        C0K3S c0k3sXQ23 = xQ2();
        if (c0k3sXQ23 == null || (str = c0k3sXQ23.LLJIJIL) == null || !(!a0.LJJJIL(str))) {
            str = "pgc_sub_space_detail";
        }
        C0K7X c0k7xLIZIZ = c0k4lLIZ.LIZIZ(str, wQ2(jLongValue));
        if (c0k7xLIZIZ != null) {
            String str2 = c0k7xLIZIZ.LIZJ.LIZJ;
            if ((!a0.LJJJIL(str2)) && str2 != null && (editableNewEditable = Editable.Factory.getInstance().newEditable(str2)) != null) {
                C0K3S c0k3sXQ24 = xQ2();
                if (c0k3sXQ24 != null && (map = c0k3sXQ24.LLJILLL) != null) {
                    map.put(Long.valueOf(jLongValue), editableNewEditable);
                }
                return editableNewEditable;
            }
        }
        return null;
    }

    @Override // X.C0K8Z
    public final void Pt0() {
        String str;
        SpaceCommentItem spaceCommentItem;
        C0K3S c0k3sXQ2 = xQ2();
        Long lValueOf = null;
        Long lValueOf2 = c0k3sXQ2 != null ? Long.valueOf(c0k3sXQ2.LLILZ) : null;
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (spaceCommentItem = c0k3sXQ22.LLJJI) != null) {
            lValueOf = Long.valueOf(spaceCommentItem.commentId);
        }
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_space_send_emote");
        C511970K5z.LIZ(c511970K5z);
        C0K3S c0k3sXQ23 = xQ2();
        if (c0k3sXQ23 == null || (str = c0k3sXQ23.LLJIJIL) == null) {
            str = "";
        }
        c511970K5z.LIZIZ(str, "sec_anchor_id");
        c511970K5z.LIZIZ(lValueOf2, "post_id");
        c511970K5z.LIZIZ(lValueOf, "comment_id");
        c511970K5z.LIZLLL();
        C2252331DDr c2252331DDr = C512160K6s.LIZ;
        C512160K6s.LIZ(new C0K7T("send_emote", lValueOf2, lValueOf, 0, 8));
    }

    @Override // X.C0JCO
    public final String sp() {
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null) {
            return c0k3sXQ2.LLJIJIL;
        }
        return null;
    }

    public final boolean CQ2(long j) {
        SpaceCommentItem spaceCommentItem;
        C0K3S c0k3sXQ2;
        Long l;
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 == null || (spaceCommentItem = c0k3sXQ22.LLJJI) == null || (c0k3sXQ2 = xQ2()) == null || (l = c0k3sXQ2.LLJILJILJ) == null || l.longValue() != j || spaceCommentItem.commentId != j) {
            return false;
        }
        return true;
    }

    @Override // X.C0K8Z
    public final void Ll1(Object obj) {
        Long lValueOf;
        Long lValueOf2;
        String str;
        String str2;
        SpaceCommentItem spaceCommentItem;
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null) {
            lValueOf = Long.valueOf(c0k3sXQ2.LLILZ);
        } else {
            lValueOf = null;
        }
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (spaceCommentItem = c0k3sXQ22.LLJJI) != null) {
            lValueOf2 = Long.valueOf(spaceCommentItem.commentId);
        } else {
            lValueOf2 = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_space_close_editor");
        C511970K5z.LIZ(c511970K5z);
        C0K3S c0k3sXQ23 = xQ2();
        if (c0k3sXQ23 != null && (str2 = c0k3sXQ23.LLJIJIL) != null) {
            str3 = str2;
        }
        c511970K5z.LIZIZ(str3, "sec_anchor_id");
        c511970K5z.LIZIZ(lValueOf, "post_id");
        c511970K5z.LIZIZ(lValueOf2, "comment_id");
        c511970K5z.LIZIZ(Integer.valueOf(!a0.LJJJIL(str) ? 1 : 0), "has_content");
        c511970K5z.LIZIZ(Integer.valueOf(str.length()), "text_length");
        c511970K5z.LIZLLL();
        C2252331DDr c2252331DDr = C512160K6s.LIZ;
        C512160K6s.LIZ(new C0K7T("close_editor", lValueOf, lValueOf2, 0, 8));
    }

    @Override // X.C0JCO
    public final void Rd(DialogFragment dialogFragment) {
        if (!BQ2()) {
            SubSpaceSecureManager.LIZ(dialogFragment);
        }
    }

    public final void vQ2(long j) {
        C0K4E.LIZ().LIZJ(wQ2(j));
    }

    public final String wQ2(long j) {
        if (CQ2(j)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("detail_reply_");
            sbLIZ.append(j);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("detail_comment_");
        sbLIZ2.append(j);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x013e  */
    @Override // X.C0JCO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ga(android.text.Editable r28, java.util.List<com.bytedance.android.livesdk.chatroom.api.AtWithIndex> r29) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM.Ga(android.text.Editable, java.util.List):void");
    }

    @Override // X.C0K8Z
    public final void Y20(String str, List list) {
        SpaceCommentItem spaceCommentItem;
        SpacePost spacePost;
        Long lValueOf;
        Long lValueOf2;
        String str2;
        HashMap<Long, List<AtWithIndex>> map;
        HashMap<Long, Editable> map2;
        HashMap<Long, List<AtWithIndex>> map3;
        HashMap<Long, Editable> map4;
        String str3;
        C0K3S c0k3sXQ2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AtWithIndex) {
                arrayList.add(obj);
            }
        }
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null) {
            spaceCommentItem = c0k3sXQ22.LLJJI;
        } else {
            spaceCommentItem = null;
        }
        C0K3S c0k3sXQ23 = xQ2();
        if (c0k3sXQ23 != null && (spacePost = c0k3sXQ23.LLILLL) != null) {
            int i = 0;
            if (spaceCommentItem != null && (c0k3sXQ2 = xQ2()) != null) {
                Long l = c0k3sXQ2.LLJILJILJ;
                long j = spaceCommentItem.commentId;
                if (l != null && l.longValue() == j) {
                    i = 1;
                }
            }
            C0K3S c0k3sXQ24 = xQ2();
            if (c0k3sXQ24 != null) {
                lValueOf = Long.valueOf(c0k3sXQ24.LLILZ);
            } else {
                lValueOf = null;
            }
            if (i != 0 && spaceCommentItem != null) {
                lValueOf2 = Long.valueOf(spaceCommentItem.commentId);
            } else {
                lValueOf2 = null;
            }
            C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_space_send_comment");
            C511970K5z.LIZ(c511970K5z);
            C0K3S c0k3sXQ25 = xQ2();
            if (c0k3sXQ25 != null) {
                str2 = c0k3sXQ25.LLJIJIL;
            } else {
                str2 = null;
            }
            String str4 = "";
            if (str2 == null) {
                str2 = "";
            }
            c511970K5z.LIZIZ(str2, "sec_anchor_id");
            c511970K5z.LIZIZ(lValueOf, "post_id");
            c511970K5z.LIZIZ(lValueOf2, "reply_to_comment_id");
            c511970K5z.LIZIZ(Integer.valueOf(i), "is_reply");
            C0K3S c0k3sXQ26 = xQ2();
            if (c0k3sXQ26 != null && (str3 = c0k3sXQ26.LLILLJJLI) != null) {
                str4 = str3;
            }
            c511970K5z.LIZIZ(str4, "enter_from");
            c511970K5z.LIZIZ(Integer.valueOf(str.length()), "text_length");
            c511970K5z.LIZLLL();
            if (i != 0 && spaceCommentItem != null) {
                CN1(spaceCommentItem, str, arrayList);
                vQ2(spaceCommentItem.commentId);
                C0K3S c0k3sXQ27 = xQ2();
                if (c0k3sXQ27 != null && (map4 = c0k3sXQ27.LLJILLL) != null) {
                    map4.remove(Long.valueOf(spaceCommentItem.commentId));
                }
                C0K3S c0k3sXQ28 = xQ2();
                if (c0k3sXQ28 != null && (map3 = c0k3sXQ28.LLJJ) != null) {
                    map3.remove(Long.valueOf(spaceCommentItem.commentId));
                }
            } else {
                FF1(str, arrayList, spacePost);
                vQ2(spacePost.postId);
                C0K3S c0k3sXQ29 = xQ2();
                if (c0k3sXQ29 != null && (map2 = c0k3sXQ29.LLJILLL) != null) {
                    map2.remove(Long.valueOf(spacePost.postId));
                }
                C0K3S c0k3sXQ210 = xQ2();
                if (c0k3sXQ210 != null && (map = c0k3sXQ210.LLJJ) != null) {
                    map.remove(Long.valueOf(spacePost.postId));
                }
            }
            C0K3S c0k3sXQ211 = xQ2();
            if (c0k3sXQ211 != null) {
                c0k3sXQ211.LLJJI = null;
            }
        }
    }

    @Override // X.C0K8Z
    public final void q31(int i, boolean z) {
        Long lValueOf;
        String str;
        SpaceCommentItem spaceCommentItem;
        C0K3S c0k3sXQ2 = xQ2();
        Long lValueOf2 = null;
        if (c0k3sXQ2 != null) {
            lValueOf = Long.valueOf(c0k3sXQ2.LLILZ);
        } else {
            lValueOf = null;
        }
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (spaceCommentItem = c0k3sXQ22.LLJJI) != null) {
            lValueOf2 = Long.valueOf(spaceCommentItem.commentId);
        }
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_space_keyboard_status");
        C511970K5z.LIZ(c511970K5z);
        C0K3S c0k3sXQ23 = xQ2();
        if (c0k3sXQ23 == null || (str = c0k3sXQ23.LLJIJIL) == null) {
            str = "";
        }
        c511970K5z.LIZIZ(str, "sec_anchor_id");
        c511970K5z.LIZIZ(lValueOf, "post_id");
        c511970K5z.LIZIZ(lValueOf2, "comment_id");
        String str2 = "keyboard_show";
        c511970K5z.LIZIZ(Integer.valueOf(z ? 1 : 0), "keyboard_show");
        c511970K5z.LIZIZ(Integer.valueOf(i), "keyboard_height");
        c511970K5z.LIZLLL();
        C2252331DDr c2252331DDr = C512160K6s.LIZ;
        if (!z) {
            str2 = "keyboard_hide";
        }
        C512160K6s.LIZ(new C0K7T(str2, lValueOf, lValueOf2, i));
    }

    public final void AQ2(SpaceCommentItem spaceCommentItem, String str, List list) {
        String str2;
        long j;
        int value;
        PGCCommentSendReq pGCCommentSendReq = new PGCCommentSendReq();
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null) {
            pGCCommentSendReq.postId = c0k3sXQ2.LLILZ;
        }
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 == null || (str2 = c0k3sXQ22.LLJIJIL) == null) {
            str2 = "";
        }
        pGCCommentSendReq.secAnchorId = str2;
        pGCCommentSendReq.atList.addAll(list);
        if (spaceCommentItem == null) {
            value = C0K3I.COMMENT.getValue();
        } else if (spaceCommentItem.commentType == C0K3I.COMMENT.getValue()) {
            pGCCommentSendReq.replyToCommentId = spaceCommentItem.commentId;
            pGCCommentSendReq.replyToUserId = spaceCommentItem.userId;
            value = C0K3I.REPLY.getValue();
        } else {
            if (spaceCommentItem.commentType != C0K3I.REPLY.getValue() && spaceCommentItem.commentType != C0K3I.REPLY_TO_REPLY.getValue()) {
                return;
            }
            SpaceCommentItem spaceCommentItem2 = spaceCommentItem.replyCommentInfo;
            if (spaceCommentItem2 != null) {
                j = spaceCommentItem2.commentId;
            } else {
                j = 0;
            }
            pGCCommentSendReq.replyToCommentId = j;
            pGCCommentSendReq.replyToReplyId = spaceCommentItem.commentId;
            pGCCommentSendReq.replyToUserId = spaceCommentItem.userId;
            value = C0K3I.REPLY_TO_REPLY.getValue();
        }
        pGCCommentSendReq.commentType = value;
        pGCCommentSendReq.text = str;
        setState(AFwS237S0000000_7.get$arr$(269));
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceDetailAbility subSpaceDetailAbility = (SubSpaceDetailAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceDetailAbility.class, null);
        if (subSpaceDetailAbility != null) {
            subSpaceDetailAbility.n1(pGCCommentSendReq);
        }
    }

    public final void CN1(SpaceCommentItem spaceCommentItem, String str, List list) {
        HashMap<Long, List<AtWithIndex>> map;
        HashMap<Long, Editable> map2;
        AQ2(spaceCommentItem, str, list);
        vQ2(spaceCommentItem.commentId);
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null && (map2 = c0k3sXQ2.LLJILLL) != null) {
            map2.remove(Long.valueOf(spaceCommentItem.commentId));
        }
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (map = c0k3sXQ22.LLJJ) != null) {
            map.remove(Long.valueOf(spaceCommentItem.commentId));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(long r7, int r9, X.C0K3J r10) {
        /*
            r6 = this;
            X.0K3S r0 = r6.xQ2()
            if (r0 == 0) goto L97
            java.lang.String r0 = r0.LLJIJIL
            if (r0 == 0) goto L97
            webcast.api.pgc_sub.PGCCommentActionRequest r2 = new webcast.api.pgc_sub.PGCCommentActionRequest
            r2.<init>()
            r2.postId = r7
            r2.secAnchorId = r0
            r2.commentActionType = r9
            com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r3 = r10.LIZ
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
            com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem r0 = r10.LIZ
            int r1 = r0.commentType
            X.0K3I r0 = X.C0K3I.COMMENT
            int r0 = r0.getValue()
            if (r1 == r0) goto La2
            X.0K3I r0 = X.C0K3I.REPLY
            int r0 = r0.getValue()
            if (r1 != r0) goto L98
            r0 = 1
        L3e:
            r2.commentType = r0
            X.0K3p r0 = X.C0K4J.LIZ()
            X.11NZ r0 = r0.LIZIZ(r2)
            if (r0 == 0) goto L8c
            X.0JiI r1 = X.EnumC499440JiI.GENERAL
            java.lang.String r2 = "SubSpaceDetailVM"
            java.lang.String r3 = "sub/space/comment/action"
            r4 = 0
            r5 = 8
            X.11Iv r1 = X.C0JCK.LIZ(r0, r1, r2, r3, r4, r5)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.0UJ2 r0 = new X.0UJ2
            r0.<init>()
            X.11NZ r1 = r1.LJIILIIL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.0TCF r0 = new X.0TCF
            r0.<init>(r6)
            java.lang.Object r3 = r1.LIZJ(r0)
            X.11NZ r3 = (X.C11NZ) r3
            if (r3 == 0) goto L8c
            Y.AfS62S0201000_7 r2 = new Y.AfS62S0201000_7
            r0 = 0
            r2.<init>(r9, r6, r10, r0)
            Y.AfS62S0201000_7 r1 = new Y.AfS62S0201000_7
            r0 = 1
            r1.<init>(r9, r6, r10, r0)
            r3.LJJLL(r2, r1)
        L8c:
            if (r9 != 0) goto L97
            X.0K3H r1 = r6.yQ2()
            java.lang.String r0 = "like"
            r1.LIZIZ(r0)
        L97:
            return
        L98:
            X.0K3I r0 = X.C0K3I.REPLY_TO_REPLY
            int r0 = r0.getValue()
            if (r1 != r0) goto La2
            r0 = 2
            goto L3e
        La2:
            r0 = 0
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM.DQ2(long, int, X.0K3J):void");
    }

    public final void EQ2(long j, int i, AbstractC511160K2w abstractC511160K2w) {
        String str;
        C11NZ c11nz;
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null && (str = c0k3sXQ2.LLJIJIL) != null) {
            PGCPostActionRequest pGCPostActionRequest = new PGCPostActionRequest();
            pGCPostActionRequest.postId = j;
            pGCPostActionRequest.secAnchorId = str;
            pGCPostActionRequest.postAction = i;
            Iterator<PGCPostActionRequest> it2 = this.LLILZIL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PGCPostActionRequest next = it2.next();
                PGCPostActionRequest pGCPostActionRequest2 = next;
                if (pGCPostActionRequest2.postId == pGCPostActionRequest.postId && pGCPostActionRequest2.postAction == pGCPostActionRequest.postAction && Intrinsics.LJFF(pGCPostActionRequest2.secAnchorId, pGCPostActionRequest.secAnchorId)) {
                    if (next != null) {
                        return;
                    }
                }
            }
            this.LLILZIL.add(pGCPostActionRequest);
            C11NZ<DataResponse<PGCPostActionResponse>> c11nzLIZ = C0K4J.LIZ().LIZ(pGCPostActionRequest);
            if (c11nzLIZ != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzLIZ, EnumC499440JiI.GENERAL, "SubSpaceDetailVM", "sub/space/post/action", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this))) != null) {
                c11nz.LJJLL(new AfS27S0301000_7(i, this, abstractC511160K2w, pGCPostActionRequest, 1), new AfS103S0300000_7(abstractC511160K2w, this, pGCPostActionRequest, 4));
            }
            if (i == 0) {
                yQ2().LIZIZ("like");
            }
        }
    }

    public final void FF1(String str, List<AtWithIndex> list, SpacePost spacePost) {
        HashMap<Long, List<AtWithIndex>> map;
        HashMap<Long, Editable> map2;
        AQ2(null, str, list);
        vQ2(spacePost.postId);
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null && (map2 = c0k3sXQ2.LLJILLL) != null) {
            map2.remove(Long.valueOf(spacePost.postId));
        }
        C0K3S c0k3sXQ22 = xQ2();
        if (c0k3sXQ22 != null && (map = c0k3sXQ22.LLJJ) != null) {
            map.remove(Long.valueOf(spacePost.postId));
        }
    }

    public final void FQ2(int i, Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        C11NZ c11nz;
        C0K3S c0k3sXQ2 = xQ2();
        if (c0k3sXQ2 != null) {
            C11NZ<DataResponse<PGCPostPinActionResponse.ResponseData>> c11nzPostPinAction = C0K4J.LIZ().postPinAction(c0k3sXQ2.LLILZ, i);
            if (c11nzPostPinAction != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzPostPinAction, EnumC499440JiI.GENERAL, "SubSpaceDetailVM", "sub/space/post/pin_action", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this))) != null) {
                c11nz.LJJLL(new AfS176S0100000_7(function0, 122), new AfS176S0100000_7(function1, 123));
            }
        }
    }
}
