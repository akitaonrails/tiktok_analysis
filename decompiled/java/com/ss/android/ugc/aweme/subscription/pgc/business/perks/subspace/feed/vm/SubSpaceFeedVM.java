package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm;

import X.AbstractC511160K2w;
import X.C01GW;
import X.C0JCK;
import X.C0JCO;
import X.C0K2D;
import X.C0K2I;
import X.C0K2N;
import X.C0K2Z;
import X.C0K3I;
import X.C0K4E;
import X.C0K4J;
import X.C0K4L;
import X.C0K4Q;
import X.C0K4R;
import X.C0K51;
import X.C0K54;
import X.C0K7G;
import X.C0K7X;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1701940uOG;
import X.C19EH;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C506350JtR;
import X.C511110K2r;
import X.C511130K2t;
import X.C511150K2v;
import X.C511370K3r;
import X.C511400K3u;
import X.C786410Ut5;
import X.EnumC499440JiI;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import Y.ARunnableS107S0100000_7;
import Y.AfS103S0300000_7;
import Y.AfS27S0301000_7;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.AtWithIndex;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SubSpaceDetailDialogFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.secure.SubSpaceSecureManager;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCPostActionRequest;
import webcast.api.pgc_sub.PGCPostActionResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceFeedVM extends AssemViewModel<C506350JtR> implements C0JCO {
    public InterfaceC665370Q7z LL;
    public Context LLILLJJLI;
    public C511370K3r LLILLL;
    public FragmentManager LLILZ;
    public C511110K2r LLILZIL;
    public SpacePost LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 503));
    public final ArrayList<PGCPostActionRequest> LLIZLLLIL = new ArrayList<>();

    @Override // X.C0K8Z
    public final /* synthetic */ void Ll1(Object obj) {
    }

    @Override // X.C0K8Z
    public final /* synthetic */ void Mc() {
    }

    @Override // X.C0K8Z
    public final /* synthetic */ void Pt0() {
    }

    @Override // X.C0K8Z
    public final /* synthetic */ void q31(int i, boolean z) {
    }

    public final void DQ2() {
        C0K2Z c0k2z;
        ArrayList<AbstractC511160K2w> arrayList;
        ArrayList<AbstractC511160K2w> arrayList2;
        C511110K2r c511110K2r = this.LLILZIL;
        if (c511110K2r == null || (c0k2z = c511110K2r.LLILLL) == null || (arrayList = c0k2z.LL) == null) {
            return;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof C0K2N) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        C0K2Z c0k2z2 = c511110K2r.LLILLL;
        if (c0k2z2 != null && (arrayList2 = c0k2z2.LL) != null) {
            ListProtector.remove(arrayList2, numValueOf.intValue());
        }
        C0K2Z c0k2z3 = c511110K2r.LLILLL;
        if (c0k2z3 != null) {
            c0k2z3.notifyItemRemoved(numValueOf.intValue());
        }
    }

    @Override // X.C0JCO
    public final void LJJLI() {
        C786410Ut5.LJLIIL(100L, (Handler) C0K51.LIZ.getValue(), new ARunnableS107S0100000_7((Function0) new AwS551S0100000_7(this, 502), 194));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C506350JtR(0);
    }

    public final C511370K3r wQ2() {
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            if (interfaceC665370Q7z == null) {
                interfaceC665370Q7z = null;
            }
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C511370K3r.class, null);
            this.LLILLL = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLL;
    }

    public final C0K2D xQ2() {
        return (C0K2D) this.LLIZ.getValue();
    }

    public final boolean yQ2() {
        C0K2Z c0k2z;
        ArrayList<AbstractC511160K2w> arrayList;
        C511110K2r c511110K2r = this.LLILZIL;
        if (c511110K2r == null || (c0k2z = c511110K2r.LLILLL) == null || (arrayList = c0k2z.LL) == null) {
            return false;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC511160K2w next = it2.next();
            if ((next instanceof C511130K2t) || (next instanceof C511150K2v) || (next instanceof C0K2I)) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean zQ2() {
        C0K2Z c0k2z;
        ArrayList<AbstractC511160K2w> arrayList;
        C511110K2r c511110K2r = this.LLILZIL;
        if (c511110K2r == null || (c0k2z = c511110K2r.LLILLL) == null || (arrayList = c0k2z.LL) == null) {
            return false;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC511160K2w next = it2.next();
            AbstractC511160K2w abstractC511160K2w = next;
            if (((abstractC511160K2w instanceof C511130K2t) && ((C511130K2t) abstractC511160K2w).LIZ.postStatus == 1) || ((abstractC511160K2w instanceof C511150K2v) && ((C511150K2v) abstractC511160K2w).LIZ.postStatus == 1)) {
                return next != null;
            }
        }
        return false;
    }

    public final boolean AQ2() {
        C511370K3r c511370K3rWQ2 = wQ2();
        if (c511370K3rWQ2 != null) {
            return c511370K3rWQ2.LLJ;
        }
        return false;
    }

    @Override // X.C0JCO
    public final Editable Mq() {
        Long l;
        String str;
        Editable editableNewEditable;
        HashMap<Long, Editable> map;
        HashMap<Long, Editable> map2;
        Editable editable;
        C511370K3r c511370K3rWQ2 = wQ2();
        if (c511370K3rWQ2 == null || (l = c511370K3rWQ2.LLIZ) == null) {
            return null;
        }
        long jLongValue = l.longValue();
        C511370K3r c511370K3rWQ22 = wQ2();
        if (c511370K3rWQ22 != null && (map2 = c511370K3rWQ22.LLJILJILJ) != null && (editable = map2.get(Long.valueOf(jLongValue))) != null) {
            return editable;
        }
        C0K4L c0k4lLIZ = C0K4E.LIZ();
        C511370K3r c511370K3rWQ23 = wQ2();
        if (c511370K3rWQ23 == null || (str = c511370K3rWQ23.LLILZ) == null || !(!a0.LJJJIL(str))) {
            str = "pgc_sub_space_feed";
        }
        C0K7X c0k7xLIZIZ = c0k4lLIZ.LIZIZ(str, vQ2(jLongValue));
        if (c0k7xLIZIZ != null) {
            String str2 = c0k7xLIZIZ.LIZJ.LIZJ;
            if ((!a0.LJJJIL(str2)) && str2 != null && (editableNewEditable = Editable.Factory.getInstance().newEditable(str2)) != null) {
                C511370K3r c511370K3rWQ24 = wQ2();
                if (c511370K3rWQ24 != null && (map = c511370K3rWQ24.LLJILJILJ) != null) {
                    map.put(Long.valueOf(jLongValue), editableNewEditable);
                }
                return editableNewEditable;
            }
        }
        return null;
    }

    @Override // X.C0JCO
    public final String sp() {
        C511370K3r c511370K3rWQ2 = wQ2();
        if (c511370K3rWQ2 != null) {
            return c511370K3rWQ2.LLILZ;
        }
        return null;
    }

    public final void BQ2(SpacePost spacePost) {
        User user;
        C511370K3r c511370K3rWQ2 = wQ2();
        if (c511370K3rWQ2 == null || (user = c511370K3rWQ2.LLILLL) == null) {
            return;
        }
        FragmentManager fragmentManager = this.LLILZ;
        if (fragmentManager != null) {
            if (C0K7G.LIZIZ()) {
                String str = c511370K3rWQ2.LLILZ;
                if (str == null) {
                    str = "";
                }
                String str2 = c511370K3rWQ2.LLJIJIL;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = spacePost.postIdStr;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("hide_banner", "true"));
                C511400K3u.LIZ.getClass();
                String strLIZ = C511400K3u.LIZ("/pgc_sub_space_detail");
                LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("sec_anchor_id", str), new Pair("enter_from", str2), new Pair("is_fullscreen", "1"), new Pair("post_id", str3), new Pair("comment_id", ""), new Pair("comment_type", ""));
                linkedHashMapLJII.putAll(mapLIZJ);
                C0K54.LIZ().LIZLLL(this.LLILLJJLI, C511400K3u.LIZIZ(strLIZ, linkedHashMapLJII), C2097608Jq.LJ());
            } else if (C0K51.LJI(Boolean.valueOf(c511370K3rWQ2.LLJJIII))) {
                C0K4Q c0k4q = SubSpaceDetailDialogFragment.LLJLLIL;
                String str4 = c511370K3rWQ2.LLJIJIL;
                c0k4q.getClass();
                SubSpaceDetailDialogFragment subSpaceDetailDialogFragment = new SubSpaceDetailDialogFragment();
                subSpaceDetailDialogFragment.LLJLIL = user;
                subSpaceDetailDialogFragment.LLJLL = str4;
                subSpaceDetailDialogFragment.LLJLILLLLZIIL = spacePost;
                subSpaceDetailDialogFragment.show(fragmentManager, "SubSpaceDetailDialogFragment");
            } else {
                C0K4R c0k4r = SubSpaceDetailFragment.LLJIJIL;
                int i = c511370K3rWQ2.LLJI;
                String str5 = c511370K3rWQ2.LLJIJIL;
                c0k4r.getClass();
                SubSpaceDetailFragment subSpaceDetailFragment = new SubSpaceDetailFragment();
                subSpaceDetailFragment.LLJ = user;
                subSpaceDetailFragment.LLJI = spacePost;
                subSpaceDetailFragment.LLILLL = str5;
                subSpaceDetailFragment.LLILZIL = fragmentManager;
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJJ(R.anim.mg, R.anim.f487ms);
                c19ehLJIIJ.LIZJ(i, subSpaceDetailFragment, "SubOnlySpaceDetailFragment");
                c19ehLJIIJ.LJII("SubOnlySpaceDetailFragment");
                c19ehLJIIJ.LJIIJ();
            }
        }
        xQ2().LIZ(spacePost, "into_detail");
    }

    @Override // X.C0JCO
    public final void Rd(DialogFragment dialogFragment) {
        if (!AQ2()) {
            SubSpaceSecureManager.LIZ(dialogFragment);
        }
    }

    public final String vQ2(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed_comment_");
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    @Override // X.C0JCO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ga(android.text.Editable r27, java.util.List<com.bytedance.android.livesdk.chatroom.api.AtWithIndex> r28) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM.Ga(android.text.Editable, java.util.List):void");
    }

    @Override // X.C0K8Z
    public final void Y20(String str, List list) {
        String str2;
        HashMap<Long, Editable> map;
        if (a0.LJJJIL(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AtWithIndex) {
                arrayList.add(obj);
            }
        }
        SpacePost spacePost = this.LLILZLL;
        if (spacePost == null) {
            return;
        }
        PGCCommentSendReq pGCCommentSendReq = new PGCCommentSendReq();
        pGCCommentSendReq.postId = spacePost.postId;
        C511370K3r c511370K3rWQ2 = wQ2();
        if (c511370K3rWQ2 == null || (str2 = c511370K3rWQ2.LLILZ) == null) {
            str2 = "";
        }
        pGCCommentSendReq.secAnchorId = str2;
        pGCCommentSendReq.atList.addAll(arrayList);
        pGCCommentSendReq.commentType = C0K3I.COMMENT.getValue();
        pGCCommentSendReq.text = str;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
        if (interfaceC665370Q7z == null) {
            interfaceC665370Q7z = null;
        }
        SubSpaceFeedAbility subSpaceFeedAbility = (SubSpaceFeedAbility) C1558520qew.LIZ(interfaceC665370Q7z, SubSpaceFeedAbility.class, null);
        if (subSpaceFeedAbility != null) {
            subSpaceFeedAbility.hE1(pGCCommentSendReq, spacePost);
        }
        C0K4E.LIZ().LIZJ(vQ2(spacePost.postId));
        C511370K3r c511370K3rWQ22 = wQ2();
        if (c511370K3rWQ22 != null && (map = c511370K3rWQ22.LLJILJILJ) != null) {
            map.remove(Long.valueOf(spacePost.postId));
        }
    }

    public final void CQ2(long j, int i, SpacePost spacePost) {
        C11NZ c11nz;
        C511370K3r c511370K3rWQ2 = wQ2();
        String str = null;
        if (c511370K3rWQ2 != null) {
            str = c511370K3rWQ2.LLILZ;
        }
        PGCPostActionRequest pGCPostActionRequest = new PGCPostActionRequest();
        pGCPostActionRequest.postId = j;
        if (str == null) {
            str = "";
        }
        pGCPostActionRequest.secAnchorId = str;
        pGCPostActionRequest.postAction = i;
        Iterator<PGCPostActionRequest> it2 = this.LLIZLLLIL.iterator();
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
        this.LLIZLLLIL.add(pGCPostActionRequest);
        C11NZ<DataResponse<PGCPostActionResponse>> c11nzLIZ = C0K4J.LIZ().LIZ(pGCPostActionRequest);
        if (c11nzLIZ != null && (c11nz = (C11NZ) C0JCK.LIZ(c11nzLIZ.LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()), EnumC499440JiI.GENERAL, "SubSpaceFeedVM", "sub/space/post/action", null, 8).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this))) != null) {
            c11nz.LJJLL(new AfS27S0301000_7(i, this, spacePost, pGCPostActionRequest, 2), new AfS103S0300000_7(spacePost, this, pGCPostActionRequest, 5));
        }
        if (i == 0) {
            xQ2().LIZ(spacePost, "like");
        }
    }
}
