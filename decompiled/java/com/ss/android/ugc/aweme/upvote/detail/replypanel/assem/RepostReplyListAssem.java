package com.ss.android.ugc.aweme.upvote.detail.replypanel.assem;

import X.C019F;
import X.C01GW;
import X.C1357950lRR;
import X.C1357970lRT;
import X.C1358170lRn;
import X.C1358220lRs;
import X.C1358490lSJ;
import X.C1358520lSM;
import X.C1358550lSP;
import X.C13LE;
import X.C13LP;
import X.C14EU;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C452501pT;
import X.C484220Iyq;
import X.C622680Oba;
import X.C724750Sbp;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostReplyListAssem extends UIListContentAssem<RepostInteractListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public int LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostReplyListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostReplyListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostInteractListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 942), AFwS259S0000000_21.get$arr$(254), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 941));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final RepostInteractListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void No() {
        LinearLayoutManager linearLayoutManager;
        Integer numValueOf;
        int i;
        String str;
        String aid;
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (numValueOf = Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition() - 1)) == null || numValueOf.intValue() < 0) {
            return;
        }
        List<InterfaceC1891350zJl> listLJII = Go().getState().LJII();
        int iIntValue = numValueOf.intValue();
        int i2 = 0;
        if (iIntValue >= 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                if (C13LP.LJJJLZIJ(i2, listLJII) instanceof C1357970lRT) {
                    i3++;
                }
                if (C13LP.LJJJLZIJ(i2, listLJII) instanceof C1357950lRR) {
                    i++;
                }
                if (i2 == iIntValue) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i3;
        } else {
            i = 0;
        }
        C1358520lSM c1358520lSM = ((C1358490lSJ) ip().getState()).LLILLJJLI;
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = ip().LLILLJJLI;
        String str2 = "";
        if (videoItemParams == null || (str = videoItemParams.mEventType) == null) {
            str = "";
        }
        String strAQ2 = ip().AQ2();
        String str3 = ip().LLJ;
        Aweme aweme = ip().LL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        int i4 = (int) c1358520lSM.LIZIZ;
        int i5 = c1358520lSM.LIZ;
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", strAQ2);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str3);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LIZJ(i4, "item_total_repost");
        c2344009Gk.LIZJ(i5, "item_viewable_repost");
        c2344009Gk.LIZJ(i2, "first_screen_repost_num");
        c2344009Gk.LIZJ(i, "first_screen_reply_num");
        C20684815ws.LJIILLIIL("ttsocial_repost_panel_repost_info_show", c2344009Gk.LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        List<InterfaceC1891350zJl> list;
        String uid;
        InterfaceC1891350zJl next;
        InterfaceC1891350zJl next2;
        C1357970lRT c1357970lRT;
        C1358220lRs c1358220lRs;
        if (TextUtils.equals("repost_with_text_report_submit", JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"))) {
            String strOptString = JSONObjectProtectorUtils.getJSONObject(c484220Iyq.LIZ, "data").optString("object_id");
            RepostInteractListViewModel repostInteractListViewModelIp = ip();
            if (strOptString.length() != 0 && (list = ((C1358490lSJ) repostInteractListViewModelIp.getState()).LL.LLILZ) != null) {
                Iterator<InterfaceC1891350zJl> it2 = list.iterator();
                while (true) {
                    uid = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        InterfaceC1891350zJl interfaceC1891350zJl = next;
                        if ((interfaceC1891350zJl instanceof C1357950lRR) && Intrinsics.LJFF(((C1358220lRs) interfaceC1891350zJl).LL, strOptString)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if ((next instanceof C1357950lRR) && (c1358220lRs = (C1358220lRs) next) != null) {
                    repostInteractListViewModelIp.wQ2(c1358220lRs.LL, false);
                    return;
                }
                Iterator<InterfaceC1891350zJl> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        InterfaceC1891350zJl interfaceC1891350zJl2 = next2;
                        if ((interfaceC1891350zJl2 instanceof C1357970lRT) && Intrinsics.LJFF(((C1357970lRT) interfaceC1891350zJl2).LLILZIL.textId, strOptString)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                if (!(next2 instanceof C1357970lRT) || (c1357970lRT = (C1357970lRT) next2) == null) {
                    return;
                }
                User user = c1357970lRT.LLILZIL.user;
                if (user != null) {
                    uid = user.getUid();
                }
                repostInteractListViewModelIp.xQ2(uid);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[LOOP:1: B:31:0x009e->B:32:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[LOOP:2: B:35:0x00ac->B:36:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[LOOP:3: B:38:0x00b8->B:39:0x00ba, LOOP_END] */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyListAssem.onViewCreated(android.view.View):void");
    }
}
