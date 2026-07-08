package com.ss.android.ugc.aweme.invitation.newdesign.vm;

import X.AbstractC1230100i7E;
import X.AbstractC1230540i7w;
import X.AbstractC879060Ye8;
import X.AnonymousClass0398;
import X.C01GW;
import X.C06KF;
import X.C0DN3;
import X.C0I0B;
import X.C0PEM;
import X.C1229810i6l;
import X.C1230060i7A;
import X.C1230090i7D;
import X.C1230280i7W;
import X.C1230370i7f;
import X.C1230420i7k;
import X.C1230460i7o;
import X.C1230480i7q;
import X.C1230520i7u;
import X.C1230570i7z;
import X.C123100dR;
import X.C13067059l;
import X.C13BV;
import X.C1485005rc;
import X.C14EU;
import X.C1559260qg8;
import X.C1DFH;
import X.C20684815ws;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C343950De5;
import X.C452501pT;
import X.C461720I8s;
import X.C723600SZy;
import X.C830490Whz;
import X.EnumC1229960i70;
import X.EnumC337980DMu;
import X.EnumC992570bw7;
import X.InterfaceC0148002o;
import X.InterfaceC1229620i6S;
import X.InterfaceC866850XzX;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.ss.android.ugc.aweme.publicgroup.data.GroupInvitation;
import com.ss.android.ugc.aweme.publicgroup.data.GroupJoinCheckItemResult;
import com.ss.android.ugc.aweme.publicgroup.data.JoinApplyInfo;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS6S1010000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationVM extends AssemViewModel<C1230460i7o> {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public boolean LLILLL;
    public boolean LLILZ;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, AbstractC1230540i7w.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1606));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1604));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1605));
    public final C1230480i7q LLIZ = new InterfaceC866850XzX() { // from class: X.0i7q
        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLIIIJ(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLJLI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLL(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJZZI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLI(String str, List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLILLLLZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLL(C1711306n1 c1711306n1) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LLIIII(int i, String str) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LLIILZL(int i, String str, List list) {
        }

        @Override // X.InterfaceC868050Y3n
        public final int LLLIIII() {
            return 0;
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJJJJL(C0Y8T c0y8t) {
            String conversationId;
            if (c0y8t != null) {
                conversationId = c0y8t.getConversationId();
            } else {
                conversationId = null;
            }
            if (!Intrinsics.LJFF(conversationId, String.valueOf(this.LL.getState().LL.LIZ))) {
                return;
            }
            InterfaceC1229620i6S interfaceC1229620i6SZQ2 = this.LL.zQ2();
            if (interfaceC1229620i6SZQ2 != null) {
                interfaceC1229620i6SZQ2.LIZJ(EnumC1229960i70.CAN_JOIN, null);
            }
            this.LL.setState(AFwS257S0000000_19.get$arr$(223));
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJZI(C0Y8T c0y8t) {
            InterfaceC1229620i6S interfaceC1229620i6SZQ2 = this.LL.zQ2();
            if (interfaceC1229620i6SZQ2 != null) {
                interfaceC1229620i6SZQ2.LIZJ(EnumC1229960i70.CAN_JOIN, null);
            }
            this.LL.setState(AFwS257S0000000_19.get$arr$(224));
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLJI(int i, C0Y8T c0y8t) {
            if (C0ZFW.LIZ.LJIIIZ(c0y8t)) {
                int i2 = this.LL.getState().LLILLJJLI;
                EnumC1229960i70 enumC1229960i70 = EnumC1229960i70.IN_GROUP;
                if (i2 != enumC1229960i70.getValue()) {
                    InterfaceC1229620i6S interfaceC1229620i6SZQ2 = this.LL.zQ2();
                    if (interfaceC1229620i6SZQ2 != null) {
                        interfaceC1229620i6SZQ2.LIZJ(enumC1229960i70, null);
                    }
                    this.LL.setState(AFwS257S0000000_19.get$arr$(225));
                }
            }
        }
    };

    public final AbstractC1230540i7w AQ2() {
        return (AbstractC1230540i7w) this.LL.getValue();
    }

    public final InterfaceC1229620i6S zQ2() {
        return (InterfaceC1229620i6S) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C1229810i6l c1229810i6l;
        List<GroupJoinCheckItemResult> list;
        C1230090i7D groupMetaData;
        C1230090i7D groupMetaData2;
        C1230090i7D groupMetaData3;
        C1230090i7D groupMetaData4;
        AbstractC1230540i7w abstractC1230540i7wAQ2 = AQ2();
        PopupDisplayMeta popupDisplayMeta = (abstractC1230540i7wAQ2 == null || (groupMetaData4 = abstractC1230540i7wAQ2.getGroupMetaData()) == null) ? null : groupMetaData4.LJFF;
        AbstractC1230540i7w abstractC1230540i7wAQ22 = AQ2();
        if (abstractC1230540i7wAQ22 == null || (groupMetaData3 = abstractC1230540i7wAQ22.getGroupMetaData()) == null || (c1229810i6l = groupMetaData3.LIZ) == null) {
            c1229810i6l = new C1229810i6l(0);
        }
        AbstractC1230540i7w abstractC1230540i7wAQ23 = AQ2();
        int value = (abstractC1230540i7wAQ23 == null || (groupMetaData2 = abstractC1230540i7wAQ23.getGroupMetaData()) == null) ? EnumC1229960i70.UNKNOWN.getValue() : groupMetaData2.LIZIZ;
        C13BV c13bv = C13BV.INSTANCE;
        AbstractC1230540i7w abstractC1230540i7wAQ24 = AQ2();
        if (abstractC1230540i7wAQ24 == null || (groupMetaData = abstractC1230540i7wAQ24.getGroupMetaData()) == null || (list = groupMetaData.LIZJ) == null) {
            list = c13bv;
        }
        return new C1230460i7o(c1229810i6l, value, new C1230280i7W(c13bv, list), new JoinApplyInfo(""), false, false, false, new C291001Au(null), new C291001Au(""), new C291001Au(Unit.LIZ), popupDisplayMeta != null ? popupDisplayMeta.previewEntry : null);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILZLL.getValue();
        if (abstractC879060Ye8 != null) {
            abstractC879060Ye8.LJIILLIIL(this.LLIZ);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EventBus.LIZLLL().LJIJJ(this);
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILZLL.getValue();
        if (abstractC879060Ye8 != null) {
            abstractC879060Ye8.LJIIJJI(this.LLIZ);
        }
    }

    public final boolean wQ2() {
        C1230090i7D groupMetaData;
        GroupInvitation groupInvitation;
        AbstractC1230540i7w abstractC1230540i7wAQ2 = AQ2();
        return (abstractC1230540i7wAQ2 == null || (groupMetaData = abstractC1230540i7wAQ2.getGroupMetaData()) == null || (groupInvitation = groupMetaData.LIZLLL) == null || !C123100dR.LIZ(groupInvitation.inviterName) || C461720I8s.LJFF(groupInvitation.inviterId) || groupInvitation.inviteChannel == EnumC992570bw7.GROUP_INVITE_CHANNEL_INVITE_PEOPLE.getValue()) ? false : true;
    }

    public static void yQ2(GroupInvitationVM groupInvitationVM) {
        groupInvitationVM.getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C13067059l(1500L, groupInvitationVM, null), 3);
    }

    public final void BQ2(AbstractC1230540i7w abstractC1230540i7w) {
        String awemeId;
        C1230570i7z c1230570i7z;
        String strValueOf = String.valueOf(abstractC1230540i7w.getGroupMetaData().LIZ.LIZ);
        Pair[] pairArr = new Pair[2];
        if ((abstractC1230540i7w instanceof C1230570i7z) && (c1230570i7z = (C1230570i7z) abstractC1230540i7w) != null) {
            awemeId = c1230570i7z.getAwemeId();
        } else {
            awemeId = null;
        }
        int i = 0;
        pairArr[0] = new Pair("group_id", awemeId);
        String str = abstractC1230540i7w.getGroupMetaData().LJ.get("comment_id");
        if (str == null) {
            str = "";
        }
        pairArr[1] = new Pair("comment_id", str);
        C830490Whz c830490WhzLIZ = C1230370i7f.LIZ(abstractC1230540i7w, strValueOf);
        do {
            Pair pair = pairArr[i];
            Object second = pair.getSecond();
            if (second != null) {
                c830490WhzLIZ.put(pair.getFirst(), second);
            }
            i++;
        } while (i < 2);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_share_pop", c830490WhzLIZ);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1485005rc(abstractC1230540i7w, this, null), 2);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReceiveVerifyCompleteEvent(C0DN3 c0dn3) {
        EnumC337980DMu enumC337980DMu = c0dn3.LIZ;
        if ((enumC337980DMu == EnumC337980DMu.CREATED || enumC337980DMu == EnumC337980DMu.UPDATED) && this.LLILZ) {
            this.LLILZ = false;
            DQ2(null, true);
            yQ2(this);
        }
    }

    public final void xQ2(C343950De5 c343950De5) {
        setState(new AwS598S0100000_19(c343950De5, 188));
    }

    public final void CQ2(final Context context, View view) {
        AbstractC1230540i7w abstractC1230540i7wAQ2 = AQ2();
        if (abstractC1230540i7wAQ2 == null) {
            return;
        }
        Set<String> set = C06KF.LIZ;
        C830490Whz c830490WhzLIZ = C1230370i7f.LIZ(abstractC1230540i7wAQ2, String.valueOf(abstractC1230540i7wAQ2.getGroupMetaData().LIZ.LIZ));
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.putAll(c830490WhzLIZ);
        C06KF.LIZIZ("ttsocial_group_join_btn_click", c830490Whz);
        C1230520i7u c1230520i7uLIZ = C1230420i7k.LIZ(abstractC1230540i7wAQ2, this, view);
        C1230060i7A c1230060i7A = new C1230060i7A(context, c1230520i7uLIZ.LIZIZ, null, c1230520i7uLIZ.LIZJ, c1230520i7uLIZ.LIZ);
        final InterfaceC1229620i6S interfaceC1229620i6SZQ2 = zQ2();
        c1230060i7A.LIZJ(new AbstractC1230100i7E(interfaceC1229620i6SZQ2) { // from class: X.0i7U
            @Override // X.AbstractC1230100i7E
            public final void LIZJ() {
                GroupInvitationVM groupInvitationVM = this.LIZIZ;
                groupInvitationVM.getClass();
                groupInvitationVM.setState(new AwS6S1010000_19(true, null, 0));
            }

            @Override // X.AbstractC1230100i7E
            public final void LIZ(String str, C0YMW c0ymw) {
                GroupInvitationVM groupInvitationVM = this.LIZIZ;
                groupInvitationVM.getClass();
                groupInvitationVM.setState(new AwS6S1010000_19(false, str, 0));
            }

            @Override // X.AbstractC1230100i7E
            public final void LIZIZ(EnumC1229960i70 enumC1229960i70, GroupJoinResponseV2 groupJoinResponseV2) {
                switch (C1230270i7V.LIZ[enumC1229960i70.ordinal()]) {
                    case 1:
                        GroupInvitationVM groupInvitationVM = this.LIZIZ;
                        groupInvitationVM.getClass();
                        groupInvitationVM.setState(new AwS6S1010000_19(false, null, 0));
                        String strValueOf = String.valueOf(groupJoinResponseV2.popupMeta.groupInfo.convShortId);
                        C913630Zsn.LJIIJJI.LJJIJL(context, C1229500i6G.LIZ((C1229500i6G) this.LIZIZ.LLILLJJLI.getValue()), strValueOf, new AwS133S1100000_19(this.LIZIZ, strValueOf, 8));
                        break;
                    case 2:
                        GroupInvitationVM groupInvitationVM2 = this.LIZIZ;
                        String string = context.getString(2131830202);
                        groupInvitationVM2.getClass();
                        groupInvitationVM2.setState(new AwS6S1010000_19(false, string, 0));
                        break;
                    case 3:
                        GroupInvitationVM groupInvitationVM3 = this.LIZIZ;
                        String string2 = context.getString(2131830197);
                        groupInvitationVM3.getClass();
                        groupInvitationVM3.setState(new AwS6S1010000_19(false, string2, 0));
                        break;
                    case 4:
                    case 5:
                    case 6:
                        GroupInvitationVM groupInvitationVM4 = this.LIZIZ;
                        groupInvitationVM4.getClass();
                        groupInvitationVM4.setState(new AwS6S1010000_19(false, null, 0));
                        break;
                    default:
                        throw new C1954807lC();
                }
                this.LIZIZ.setState(new AwS598S0100000_19(groupJoinResponseV2, 189));
            }
        });
    }

    public final void DQ2(String str, boolean z) {
        setState(new AwS6S1010000_19(z, str, 1));
    }

    public final void vQ2(Context context, SpannableString spannableString, String str, Function0 function0) {
        AnonymousClass0398.LIZ(spannableString, Collections.singletonList(str), null, context, Collections.singletonList(new AwS420S0200000_19(this, (GroupInvitationVM) function0, (Function0<Unit>) 146)));
    }
}
