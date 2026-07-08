package com.ss.android.ugc.aweme.im.sdk.chat.ui.slots;

import X.C019F;
import X.C069P;
import X.C06IM;
import X.C09R3;
import X.C0OBY;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZHX;
import X.C0ZHY;
import X.C0ZHZ;
import X.C0ZP4;
import X.C1233404s8;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1619106Vp;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697806kq;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C427760Gpy;
import X.C457780HxI;
import X.C460270I3d;
import X.C461720I8s;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C897040ZHa;
import X.C897050ZHb;
import X.C897060ZHc;
import X.C897140ZHk;
import X.C897160ZHm;
import X.C897260ZHw;
import X.EnumC428930Grr;
import X.EnumC897070ZHd;
import X.InterfaceC1233504s9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460300I3g;
import X.InterfaceC876950Yaj;
import Y.ACListenerS149S0100000_14;
import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.wheedmbadge.WheeDmBadgeMessageListViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.wheeexclusive.WheeExclusiveBubbleMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem.ReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.utils.ChatCustomizeMessageListViewModel;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public final class InlineLabelReusedSkeletonUIContent extends ReusedSkeletonUISlotAssem<InlineLabelReusedSkeletonUIContent, InterfaceC1233504s9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public ViewSwitcher LLJLLIL;
    public TuxTextView LLJLLL;
    public C427760Gpy LLJZ;
    public final AssemVMLazy LLJZIJLIL;
    public final AssemVMLazy LLL;
    public final AssemVMLazy LLLF;
    public final AssemVMLazy LLLFF;
    public final AssemVMLazy LLLFFI;
    public final C1559260qg8 LLLFZ;
    public C0ZP4 LLLI;
    public InterfaceC1233504s9 LLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InlineLabelReusedSkeletonUIContent.class, "readStatusViewModel", "getReadStatusViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/read/assem/ReadStatusViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(InlineLabelReusedSkeletonUIContent.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(InlineLabelReusedSkeletonUIContent.class, "chatCustomizeVM", "getChatCustomizeVM()Lcom/ss/android/ugc/aweme/utils/ChatCustomizeMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(InlineLabelReusedSkeletonUIContent.class, "wheeDmBadgeVM", "getWheeDmBadgeVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/wheedmbadge/WheeDmBadgeMessageListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(InlineLabelReusedSkeletonUIContent.class, "wheeExclusiveBubbleVM", "getWheeExclusiveBubbleVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/wheeexclusive/WheeExclusiveBubbleMessageListViewModel;", 0);
        c09r3.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cql;
    }

    public InlineLabelReusedSkeletonUIContent() {
        super(C897260ZHw.LIZ);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReadStatusViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 867), AFwS248S0000000_14.get$arr$(246), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GroupChatVM.class);
        this.LLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 868), AFwS248S0000000_14.get$arr$(247), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ChatCustomizeMessageListViewModel.class);
        this.LLLF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 869), AFwS248S0000000_14.get$arr$(248), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(WheeDmBadgeMessageListViewModel.class);
        this.LLLFF = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ4, 870), AFwS248S0000000_14.get$arr$(249), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(WheeExclusiveBubbleMessageListViewModel.class);
        this.LLLFFI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ5, 871), AFwS248S0000000_14.get$arr$(245), null, true);
        this.LLLFZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    }

    public final C457780HxI Ep() {
        return (C457780HxI) this.LLLFZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        C0ZP4 c0zp4 = this.LLLI;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLLI = null;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void Ap(View view) {
        ViewSwitcher viewSwitcher;
        TuxTextView tuxTextView = null;
        if (view instanceof ViewSwitcher) {
            viewSwitcher = (ViewSwitcher) view;
        } else {
            viewSwitcher = null;
        }
        this.LLJLLIL = viewSwitcher;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.k8d);
        if (tuxTextView2 != null) {
            C1697806kq.LIZ(tuxTextView2);
            tuxTextView = tuxTextView2;
        }
        this.LLJLLL = tuxTextView;
        this.LLJZ = (C427760Gpy) view.findViewById(R.id.k8b);
        C786410Ut5.I7(new ACListenerS149S0100000_14(this, 31), LJJIJL());
    }

    public final void Gp(CharSequence charSequence) {
        TuxTextView tuxTextView = this.LLJLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(charSequence);
        }
        if (charSequence.length() == 0) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        ViewSwitcher viewSwitcher = this.LLJLLIL;
        if (viewSwitcher != null && viewSwitcher.getDisplayedChild() != 0) {
            viewSwitcher.setDisplayedChild(0);
        }
    }

    public final void Bp(C869590Y9l c869590Y9l, C1233404s8 c1233404s8) {
        List<Long> memberIds;
        Object objLJJJLL;
        UrlModel avatarThumb;
        List<String> urlList;
        Set<Long> set = c1233404s8.LIZ;
        if (set.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(Ep().LL.getConversationId());
        if (c0y8tLIZ == null || (memberIds = c0y8tLIZ.getMemberIds()) == null) {
            memberIds = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : memberIds) {
            Long l2 = l;
            long jLIZJ = C461720I8s.LIZJ();
            if (l2 == null || l2.longValue() != jLIZJ) {
                arrayList.add(l);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        if (memberIds.isEmpty()) {
            Gp(C786410Ut5.j4(LJJIJL().getResources().getString(2131835255), Arrays.copyOf(new Object[]{String.valueOf(set.size())}, 1)));
        } else {
            Set setLJJL = C13LP.LJJL(setLLIIJI, set);
            if (setLJJL.containsAll(setLLIIJI)) {
                Gp(LJJIJL().getResources().getString(2131835252));
            } else {
                C427760Gpy c427760Gpy = this.LLJZ;
                if (c427760Gpy != null) {
                    c427760Gpy.setTotalCount(setLJJL.size());
                    c427760Gpy.setSize(EnumC428930Grr.X_SMALL);
                    int i = 0;
                    for (Object obj : C13LP.LL(setLJJL, 4)) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            long jLongValue = ((Number) obj).longValue();
                            IMContactApi.LIZ.getClass();
                            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(jLongValue), null, "im_local_db");
                            if (iMUserLJIIL == null || (avatarThumb = iMUserLJIIL.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (objLJJJLL = C13LP.LJJJLL(urlList)) == null) {
                                objLJJJLL = "";
                            }
                            C427760Gpy.LIZ(c427760Gpy, i, objLJJJLL, "", null, null, false, null, 2040);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    C786410Ut5.LJLLLLLL(0, LJJIJL());
                    ViewSwitcher viewSwitcher = this.LLJLLIL;
                    if (viewSwitcher != null && viewSwitcher.getDisplayedChild() != 1) {
                        viewSwitcher.setDisplayedChild(1);
                    }
                }
            }
        }
        AssemVMLazy assemVMLazy = this.LLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
        this.LLLI = C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZHU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1657506eL) obj2).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS450S0200000_14(c869590Y9l, c1233404s8, 12), 4);
    }

    public final void Fp(C869590Y9l c869590Y9l, EnumC897070ZHd enumC897070ZHd) {
        String strLIZIZ;
        String string;
        int i = C897060ZHc.LIZ[enumC897070ZHd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        AssemVMLazy assemVMLazy = this.LLLFFI;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIII;
                        if (!Intrinsics.LJFF(((WheeExclusiveBubbleMessageListViewModel) assemVMLazy.getValue()).LLILZ, c869590Y9l.getUuid())) {
                            ((WheeExclusiveBubbleMessageListViewModel) this.LLLFFI.getValue()).LLILZ = c869590Y9l.getUuid();
                            String str = ((WheeExclusiveBubbleMessageListViewModel) this.LLLFFI.getValue()).LLILLJJLI;
                            String strLJFF = C897140ZHk.LJFF();
                            if (strLJFF != null && str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
                                C06IM.LIZ.getClass();
                                IndependentAppBubbleItem independentAppBubbleItemLIZIZ = C06IM.LIZIZ(string);
                                if (independentAppBubbleItemLIZIZ != null && independentAppBubbleItemLIZIZ.bubbleTailFrequencyControl != null) {
                                    C897140ZHk.LIZ().storeInt(C897140ZHk.LJ(strLJFF, string), C897140ZHk.LIZ().getInt(C897140ZHk.LJ(strLJFF, string), 0) + 1);
                                    C897140ZHk.LIZ().storeLong(C897140ZHk.LIZLLL(strLJFF, string), System.currentTimeMillis());
                                }
                            }
                            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0ZHZ(this, null), 2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                AssemVMLazy assemVMLazy2 = this.LLLFF;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLLIIII;
                if (((WheeDmBadgeMessageListViewModel) assemVMLazy2.getValue()).LLILLJJLI) {
                    return;
                }
                ((WheeDmBadgeMessageListViewModel) this.LLLFF.getValue()).LLILLJJLI = true;
                String conversationId = c869590Y9l.getConversationId();
                if (!C897040ZHa.LIZLLL(conversationId)) {
                    C897040ZHa.LIZIZ().storeInt(C897040ZHa.LJ(conversationId), 0);
                    Keva kevaLIZIZ = C897040ZHa.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pair_");
                    sbLIZ.append(conversationId);
                    sbLIZ.append("_first_seen_ts");
                    kevaLIZIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
                }
                C897040ZHa.LIZIZ().storeInt(C897040ZHa.LJ(conversationId), C897040ZHa.LIZIZ().getInt(C897040ZHa.LJ(conversationId), 0) + 1);
                if (!C897040ZHa.LIZJ(conversationId)) {
                    String string2 = C897040ZHa.LIZIZ().getString("distinct_pairs", null);
                    if (string2 != null && string2.length() != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(string2);
                        sbLIZ2.append(',');
                        sbLIZ2.append(conversationId);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        strLIZIZ = conversationId;
                    }
                    C897040ZHa.LIZIZ().storeString("distinct_pairs", strLIZIZ);
                }
                C897040ZHa.LIZIZ().storeInt("global_count", C897040ZHa.LIZIZ().getInt("global_count", 0) + 1);
                Keva kevaLIZIZ2 = C897040ZHa.LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("pair_");
                sbLIZ3.append(conversationId);
                sbLIZ3.append("_ts");
                kevaLIZIZ2.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0ZHY(this, null), 2);
                return;
            }
            AssemVMLazy assemVMLazy3 = this.LLJZIJLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLLIIII;
            if (!((ReadStatusViewModel) assemVMLazy3.getValue()).LL.add(c869590Y9l.getUuid())) {
                return;
            }
            if (Ep().LL.isGroupChat()) {
                C0OBY.LIZIZ(Ep().LL.getEnterFromForMob(), c869590Y9l.getConversationId());
                C0OBY.LIZJ(Ep().LL.getEnterFromForMob(), Ep().LL);
                return;
            } else {
                C0OBY.LIZJ(Ep().LL.getEnterFromForMob(), Ep().LL);
                return;
            }
        }
        AssemVMLazy assemVMLazy4 = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LLLIIII;
        if (((ChatCustomizeMessageListViewModel) assemVMLazy4.getValue()).LLILLJJLI) {
            return;
        }
        ((ChatCustomizeMessageListViewModel) this.LLLF.getValue()).LLILLJJLI = true;
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null) {
            iChatCustomizeHelperLIZ.markLabelOnLastMessageShown();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0ZHX(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.assem.ReusedSkeletonUISlotAssem
    public final void tp(C869590Y9l c869590Y9l, InterfaceC1233504s9 interfaceC1233504s9) {
        InterfaceC1233504s9 interfaceC1233504s92 = interfaceC1233504s9;
        C0ZP4 c0zp4 = this.LLLI;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        this.LLLI = null;
        this.LLLII = interfaceC1233504s92;
        if (interfaceC1233504s92 instanceof C897050ZHb) {
            Context context = getContext();
            if (context != null) {
                C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
                InterfaceC460300I3g interfaceC460300I3g = ((C897050ZHb) interfaceC1233504s92).LIZIZ;
                c460270I3d.getClass();
                Gp(C460270I3d.LIZ(interfaceC460300I3g, context));
            }
            Fp(c869590Y9l, ((C897050ZHb) interfaceC1233504s92).LIZ);
            return;
        }
        if (interfaceC1233504s92 instanceof C1233404s8) {
            Bp(c869590Y9l, (C1233404s8) interfaceC1233504s92);
            Fp(c869590Y9l, EnumC897070ZHd.READ_STATUS);
        } else {
            if (Intrinsics.LJFF(interfaceC1233504s92, C897160ZHm.LIZ)) {
                C786410Ut5.LJLLLLLL(8, LJJIJL());
                return;
            }
            throw new C1954807lC();
        }
    }
}
