package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm;

import X.AbstractC503810JpL;
import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0JCN;
import X.C0UO0;
import X.C1161920gLG;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1701940uOG;
import X.C176600m4;
import X.C19322110iZ;
import X.C19EH;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C452501pT;
import X.C480460Ism;
import X.C495520Jby;
import X.C500260Jjc;
import X.C502910Jnt;
import X.C503010Jo3;
import X.C503230JoP;
import X.C503260JoS;
import X.C503760JpG;
import X.C504020Jpg;
import X.C504370JqF;
import X.C504380JqG;
import X.C504390JqH;
import X.C504450JqN;
import X.C504510JqT;
import X.C506330JtP;
import X.C508940Jxc;
import X.C510380Jzw;
import X.EnumC504930Jr9;
import X.EnumC510330Jzr;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.text.Editable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.NewSubSpaceDetailSheetDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.android.livesdk.livesetting.level.LiveSuperFanUseNewSpaceDialogSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.CommentSendReq;
import webcast.api.sub.PostActionRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedVM extends AssemViewModel<C506330JtP> implements C0JCN {
    public InterfaceC665370Q7z LL;
    public Context LLILLJJLI;
    public C504510JqT LLILLL;
    public FragmentManager LLILZ;
    public C503760JpG LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C504380JqG(this));
    public final ArrayList<PostActionRequest> LLIZ = new ArrayList<>();

    @Override // X.C0JCN
    public final void CN1(SpaceCommentItem spaceCommentItem, String str, List list) {
    }

    public final void CQ2() {
        C503260JoS c503260JoS;
        ArrayList<AbstractC503810JpL> arrayList;
        ArrayList<AbstractC503810JpL> arrayList2;
        C503760JpG c503760JpG = this.LLILZIL;
        if (c503760JpG == null || (c503260JoS = c503760JpG.LLILLL) == null || (arrayList = c503260JoS.LL) == null) {
            return;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof C503230JoP) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        C503260JoS c503260JoS2 = c503760JpG.LLILLL;
        if (c503260JoS2 != null && (arrayList2 = c503260JoS2.LL) != null) {
            ListProtector.remove(arrayList2, numValueOf.intValue());
        }
        C503260JoS c503260JoS3 = c503760JpG.LLILLL;
        if (c503260JoS3 != null) {
            c503260JoS3.notifyItemRemoved(numValueOf.intValue());
        }
    }

    @Override // X.C0JCN
    public final void LJJLI() {
        C500260Jjc.LJJLIIIJJI(100L, new C504370JqF(this));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C506330JtP(0);
    }

    public final C504510JqT vQ2() {
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C504510JqT.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    public final C504450JqN wQ2() {
        return (C504450JqN) this.LLILZLL.getValue();
    }

    public final boolean xQ2() {
        C503260JoS c503260JoS;
        ArrayList<AbstractC503810JpL> arrayList;
        C503760JpG c503760JpG = this.LLILZIL;
        if (c503760JpG == null || (c503260JoS = c503760JpG.LLILLL) == null || (arrayList = c503260JoS.LL) == null) {
            return false;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC503810JpL next = it2.next();
            if ((next instanceof C502910Jnt) || (next instanceof C503010Jo3) || (next instanceof C504020Jpg)) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean yQ2() {
        C503260JoS c503260JoS;
        ArrayList<AbstractC503810JpL> arrayList;
        C503760JpG c503760JpG = this.LLILZIL;
        if (c503760JpG == null || (c503260JoS = c503760JpG.LLILLL) == null || (arrayList = c503260JoS.LL) == null) {
            return false;
        }
        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC503810JpL next = it2.next();
            AbstractC503810JpL abstractC503810JpL = next;
            if (((abstractC503810JpL instanceof C502910Jnt) && ((C502910Jnt) abstractC503810JpL).LIZ.postStatus == 1) || ((abstractC503810JpL instanceof C503010Jo3) && ((C503010Jo3) abstractC503810JpL).LIZ.postStatus == 1)) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean DQ2() {
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 != null) {
            return c504510JqTVQ2.LLJLILLLLZIIL;
        }
        return false;
    }

    @Override // X.C0JCN
    public final Editable Mq() {
        Long l;
        HashMap<Long, Editable> map;
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 == null || (l = c504510JqTVQ2.LLIZ) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        C504510JqT c504510JqTVQ22 = vQ2();
        if (c504510JqTVQ22 == null || (map = c504510JqTVQ22.LLJILJILJ) == null) {
            return null;
        }
        return map.get(Long.valueOf(jLongValue));
    }

    @Override // X.C0JCN
    public final String sp() {
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 != null) {
            return c504510JqTVQ2.LLILZ;
        }
        return null;
    }

    public final boolean zQ2() {
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 != null) {
            return c504510JqTVQ2.LLJ;
        }
        return false;
    }

    public final void AQ2(SpacePost spacePost) {
        User user;
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 == null || (user = c504510JqTVQ2.LLILLL) == null) {
            return;
        }
        FragmentManager fragmentManager = this.LLILZ;
        if (fragmentManager != null) {
            if (LiveSubOnlySpacePreviewSetting.INSTANCE.displaySubOnlyPreviewTab()) {
                String str = c504510JqTVQ2.LLILZ;
                if (str == null) {
                    str = "";
                }
                String str2 = c504510JqTVQ2.LLJIJIL;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = spacePost.postIdStr;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("hide_banner", "true"));
                C495520Jby c495520Jby = new C495520Jby(C508940Jxc.LIZ("/sub_space_detail"));
                c495520Jby.LIZJ("sec_anchor_id", str);
                c495520Jby.LIZJ("enter_from", str2);
                c495520Jby.LIZJ("is_fullscreen", String.valueOf(C500260Jjc.LJJJI(Boolean.TRUE) ? 1 : 0));
                c495520Jby.LIZJ("post_id", str3);
                c495520Jby.LIZJ("comment_id", "");
                c495520Jby.LIZJ("comment_type", "");
                for (Map.Entry entry : mapLIZJ.entrySet()) {
                    c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LLILLJJLI, c495520Jby.LIZLLL());
            } else if (C176600m4.LIZIZ(Boolean.valueOf(c504510JqTVQ2.LLJJIII))) {
                String str4 = c504510JqTVQ2.LLJIJIL;
                boolean zDQ2 = DQ2();
                if (LiveSuperFanUseNewSpaceDialogSetting.INSTANCE.getValue()) {
                    NewSubSpaceDetailSheetDialogFragment.LLLFZ.getClass();
                    NewSubSpaceDetailSheetDialogFragment newSubSpaceDetailSheetDialogFragment = new NewSubSpaceDetailSheetDialogFragment();
                    newSubSpaceDetailSheetDialogFragment.LLJZIJLIL = user;
                    newSubSpaceDetailSheetDialogFragment.LLLFFI = str4;
                    newSubSpaceDetailSheetDialogFragment.LLL = spacePost;
                    newSubSpaceDetailSheetDialogFragment.LLLF = zDQ2;
                    C19322110iZ.LJFF(fragmentManager, newSubSpaceDetailSheetDialogFragment, "NewSubSpaceDetailSheetDialogFragment", null, 0);
                } else {
                    SubSpaceDetailDialogFragment.LLIZLLLIL.getClass();
                    SubSpaceDetailDialogFragment subSpaceDetailDialogFragment = new SubSpaceDetailDialogFragment();
                    subSpaceDetailDialogFragment.LLILLL = user;
                    subSpaceDetailDialogFragment.LLIZ = str4;
                    subSpaceDetailDialogFragment.LLILZ = spacePost;
                    subSpaceDetailDialogFragment.LLILZIL = zDQ2;
                    subSpaceDetailDialogFragment.show(fragmentManager, "SubSpaceDetailDialogFragment");
                }
            } else {
                C504390JqH c504390JqH = SubSpaceDetailFragment.LLJILJIL;
                int i = c504510JqTVQ2.LLJI;
                String str5 = c504510JqTVQ2.LLJIJIL;
                boolean zDQ22 = DQ2();
                c504390JqH.getClass();
                SubSpaceDetailFragment subSpaceDetailFragment = new SubSpaceDetailFragment();
                subSpaceDetailFragment.LLIZLLLIL = user;
                subSpaceDetailFragment.LLJ = spacePost;
                subSpaceDetailFragment.LLILLJJLI = str5;
                subSpaceDetailFragment.LLILZIL = fragmentManager;
                subSpaceDetailFragment.LLILZ = zDQ22;
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
                c19ehLJIIJ.LIZJ(i, subSpaceDetailFragment, "SubOnlySpaceDetailFragment");
                c19ehLJIIJ.LJII("SubOnlySpaceDetailFragment");
                c19ehLJIIJ.LJIIJ();
            }
        }
        wQ2().LIZ(spacePost, "into_detail");
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
        HashMap<Long, Editable> map2;
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 != null && (l = c504510JqTVQ2.LLIZ) != null) {
            long jLongValue = l.longValue();
            if (editable != null) {
                C504510JqT c504510JqTVQ22 = vQ2();
                if (c504510JqTVQ22 != null && (map2 = c504510JqTVQ22.LLJILJILJ) != null) {
                    map2.put(Long.valueOf(jLongValue), Editable.Factory.getInstance().newEditable(editable));
                    return;
                }
                return;
            }
            C504510JqT c504510JqTVQ23 = vQ2();
            if (c504510JqTVQ23 == null || (map = c504510JqTVQ23.LLJILJILJ) == null) {
                return;
            }
            map.remove(Long.valueOf(jLongValue));
        }
    }

    public final void BQ2(long j, final int i, final SpacePost spacePost) {
        C0J1N c0j1n;
        C504510JqT c504510JqTVQ2 = vQ2();
        String str = null;
        if (c504510JqTVQ2 != null) {
            str = c504510JqTVQ2.LLILZ;
        }
        final PostActionRequest postActionRequest = new PostActionRequest();
        postActionRequest.postId = j;
        if (str == null) {
            str = "";
        }
        postActionRequest.secAnchorId = str;
        postActionRequest.postAction = i;
        Iterator<PostActionRequest> it2 = this.LLIZ.iterator();
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
        this.LLIZ.add(postActionRequest);
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(((SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class)).postAction(postActionRequest).LJL(C11S5.LIZ()).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "SubSpaceFeedVM", "sub/space/post/action", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
        if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))) != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jpb
                @Override // X.C09JN
                public final void accept(Object obj) {
                    boolean z;
                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.postAction$1");
                    this.LL.LLIZ.remove(postActionRequest);
                    SpacePost spacePost2 = spacePost;
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    spacePost2.userLiked = z;
                    if (z) {
                        spacePost2.likeCount++;
                    } else {
                        spacePost2.likeCount--;
                    }
                    C503760JpG c503760JpG = this.LL.LLILZIL;
                    if (c503760JpG != null) {
                        c503760JpG.LIZLLL(spacePost2);
                    }
                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.postAction$1");
                }
            }, new C09JN() { // from class: X.0Jpa
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceFeedVM@e7dc.postAction$2");
                    this.LL.LLIZ.remove(postActionRequest);
                    C501540Jlg.LIZJ(C176600m4.LIZ(), (Throwable) obj);
                    C503760JpG c503760JpG = this.LL.LLILZIL;
                    if (c503760JpG != null) {
                        c503760JpG.LIZLLL(spacePost);
                    }
                    C1C7U.LIZIZ("SubSpaceFeedVM@e7dc.postAction$2");
                }
            });
        }
        if (i == 0) {
            wQ2().LIZ(spacePost, "like");
        }
    }

    @Override // X.C0JCN
    public final void FF1(String str, List<AtWithIndex> list, SpacePost spacePost) {
        String str2;
        HashMap<Long, Editable> map;
        CommentSendReq commentSendReq = new CommentSendReq();
        commentSendReq.postId = spacePost.postId;
        C504510JqT c504510JqTVQ2 = vQ2();
        if (c504510JqTVQ2 == null || (str2 = c504510JqTVQ2.LLILZ) == null) {
            str2 = "";
        }
        commentSendReq.secAnchorId = str2;
        commentSendReq.atList.addAll(list);
        commentSendReq.commentType = EnumC504930Jr9.COMMENT.getValue();
        commentSendReq.text = str;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
        if (subSpaceFeedAbility != null) {
            subSpaceFeedAbility.t50(commentSendReq, spacePost);
        }
        C504510JqT c504510JqTVQ22 = vQ2();
        if (c504510JqTVQ22 != null && (map = c504510JqTVQ22.LLJILJILJ) != null) {
            map.remove(Long.valueOf(spacePost.postId));
        }
    }
}
