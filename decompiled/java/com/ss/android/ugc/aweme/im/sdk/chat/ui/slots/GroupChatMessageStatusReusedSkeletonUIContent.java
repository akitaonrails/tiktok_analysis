package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C007O;
import X.C019F;
import X.C01GW;
import X.C069P;
import X.C09R3;
import X.C0OBY;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZP4;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19M4;
import X.C2217381BqS;
import X.C427760Gpy;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C897270ZHx;
import X.EnumC428930Grr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import Y.ACListenerS149S0100000_14;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem.ReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupChatMessageStatusReusedSkeletonUIContent extends ReusedSkeletonUISlotAssem<GroupChatMessageStatusReusedSkeletonUIContent, C007O> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C1559260qg8 LLJLLIL;
    public final AssemVMLazy LLJLLL;
    public final AssemVMLazy LLJZ;
    public C0ZP4 LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupChatMessageStatusReusedSkeletonUIContent.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupChatMessageStatusReusedSkeletonUIContent.class, "readStatusViewModel", "getReadStatusViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/read/assem/ReadStatusViewModel;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cqo;
    }

    public GroupChatMessageStatusReusedSkeletonUIContent() {
        super(C897270ZHx.LIZ);
        this.LLJLLIL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupChatVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 864), AFwS248S0000000_14.get$arr$(243), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ReadStatusViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 865), AFwS248S0000000_14.get$arr$(244), null, true);
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 866));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 863));
    }

    public final C457780HxI Ep() {
        return (C457780HxI) this.LLJLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        C0ZP4 c0zp4 = this.LLJZIJLIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 30), LJJIJL());
    }

    public final void Fp(String str) {
        C786410Ut5.LLLLLL((C427760Gpy) this.LLLF.getValue(), 8);
        ((TuxTextView) this.LLL.getValue()).setTextColorRes(R.attr.a1k);
        ((TextView) this.LLL.getValue()).setText(str);
        C786410Ut5.LLLLLZIL((C19M4) this.LLL.getValue(), 0);
    }

    public final void Bp(C869590Y9l c869590Y9l, C007O c007o) {
        List<Long> memberIds;
        int i;
        Object objLJJJLL;
        UrlModel avatarThumb;
        List<String> urlList;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(Ep().LL.getConversationId());
        if (c0y8tLIZ == null || (memberIds = c0y8tLIZ.getMemberIds()) == null) {
            memberIds = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it2 = memberIds.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Long next = it2.next();
            Long l = next;
            long jLIZJ = C461720I8s.LIZJ();
            if (l == null || l.longValue() != jLIZJ) {
                arrayList.add(next);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        Set<Long> set = c007o.LIZ;
        if (memberIds.isEmpty()) {
            Fp(C786410Ut5.j4(LJJIJL().getResources().getString(2131835255), Arrays.copyOf(new Object[]{String.valueOf(set.size())}, 1)));
        } else {
            Set setLJJL = C13LP.LJJL(setLLIIJI, set);
            if (setLJJL.containsAll(setLLIIJI)) {
                Fp(LJJIJL().getResources().getString(2131835252));
            } else {
                C786410Ut5.LLLLLZIL((C19M4) this.LLL.getValue(), 8);
                C786410Ut5.LLLLLL((C427760Gpy) this.LLLF.getValue(), 0);
                ((C427760Gpy) this.LLLF.getValue()).setTotalCount(setLJJL.size());
                ((C427760Gpy) this.LLLF.getValue()).setSize(EnumC428930Grr.X_SMALL);
                Iterator it3 = C13LP.LL(setLJJL, 4).iterator();
                while (true) {
                    int i2 = i;
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    i++;
                    if (i2 >= 0) {
                        long jLongValue = ((Number) next2).longValue();
                        IMContactApi.LIZ.getClass();
                        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLongValue), null, "im_local_db");
                        if (iMUserLJIIL == null || (avatarThumb = iMUserLJIIL.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList)) == null) {
                            objLJJJLL = "";
                        }
                        C427760Gpy.LIZ((C427760Gpy) this.LLLF.getValue(), i2, objLJJJLL, "", null, null, false, null, 2040);
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        AssemVMLazy assemVMLazy = this.LLJZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        if (((ReadStatusViewModel) assemVMLazy.getValue()).LL.add(c869590Y9l.getUuid())) {
            C0OBY.LIZIZ(Ep().LL.getEnterFromForMob(), c869590Y9l.getConversationId());
            C0OBY.LIZJ(Ep().LL.getEnterFromForMob(), Ep().LL);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void tp(C869590Y9l c869590Y9l, C007O c007o) {
        C007O c007o2 = c007o;
        C0ZP4 c0zp4 = this.LLJZIJLIL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        if (c007o2.LIZ.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        Bp(c869590Y9l, c007o2);
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        this.LLJZIJLIL = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZHT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS450S0200000_14(c869590Y9l, c007o2, 0), 4);
    }
}
