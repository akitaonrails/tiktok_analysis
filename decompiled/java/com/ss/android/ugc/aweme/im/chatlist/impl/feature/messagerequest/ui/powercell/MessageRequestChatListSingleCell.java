package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell;

import X.AbstractC1491605sg;
import X.AbstractC884010Ym7;
import X.AbstractC885530YoZ;
import X.C01GW;
import X.C0I0B;
import X.C0I31;
import X.C0Y8T;
import X.C0YNP;
import X.C0YVM;
import X.C0Z5J;
import X.C0ZE7;
import X.C0ZE8;
import X.C0ZK1;
import X.C0ZKF;
import X.C1322110kVd;
import X.C1336205Ku;
import X.C1490405sU;
import X.C1710306mr;
import X.C1718806oE;
import X.C19212010Ec;
import X.C19252910Tv;
import X.C300860Bqm;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C429270GsP;
import X.C429290GsR;
import X.C452501pT;
import X.C612090Nzb;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C878630YdR;
import X.C878960Ydy;
import X.C879390Yef;
import X.C879540Yeu;
import X.C880460YgO;
import X.C881260Yhg;
import X.C884160YmM;
import X.C885310YoD;
import X.C885520YoY;
import X.C885630Yoj;
import X.C886420Yq0;
import X.C892210YzL;
import X.C894470Z7d;
import X.C897370ZIh;
import X.EnumC880520YgU;
import X.InterfaceC894770Z8h;
import X.InterfaceC897380ZIi;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestChatListSingleCell extends BaseMessageRequestChatListCell<C885520YoY> {
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 395));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 396));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 394));

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell
    public final void P5() {
        C886420Yq0 c886420Yq0;
        IMUser iMUser;
        String str;
        C886420Yq0 c886420Yq02;
        C429270GsP activityStatusViewData;
        SAFTikTokFragment sAFTikTokFragment;
        EnumC880520YgU enumC880520YgU;
        String mobValue;
        Map<AbstractC1491605sg<?>, C1490405sU<?>> map;
        C1490405sU<?> c1490405sU;
        AbstractC885530YoZ abstractC885530YoZ = this.LLJJIJIIJIL;
        Boolean boolValueOf = null;
        if (!(abstractC885530YoZ instanceof C886420Yq0) || (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) == null) {
            return;
        }
        IChatListEngine.LIZ.getClass();
        C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(c886420Yq0.getKey(), I5());
        Object obj = (c879540YeuLJII == null || (map = c879540YeuLJII.LIZLLL) == null || (c1490405sU = map.get(C1718806oE.LIZ)) == null) ? null : c1490405sU.LIZIZ;
        if (!(obj instanceof IMUser) || (iMUser = (IMUser) obj) == null) {
            iMUser = new IMUser();
            iMUser.setUid(String.valueOf(C0YNP.LJII(c886420Yq0.getKey().getConversationId())));
            iMUser.setAvatarThumb(c886420Yq0.getAvatar());
            C881260Yhg name = c886420Yq0.getName();
            iMUser.setNickName(name != null ? name.nameText : null);
        }
        iMUser.setType(4);
        Object obj2 = c879540YeuLJII != null ? c879540YeuLJII.LIZJ : null;
        C0Y8T c0y8t = obj2 instanceof C0Y8T ? (C0Y8T) obj2 : null;
        if (C0YVM.LIZ[N5().a1().ordinal()] == 1) {
            str = "filtered_message_request";
        } else {
            C878960Ydy c878960YdyI5 = I5();
            str = (c878960YdyI5 != null ? c878960YdyI5.LLILLL : null) == EnumC880520YgU.MESSAGE_REQUEST_SPAM ? "message_request_spam" : "non_filtered_message_request";
        }
        EnterChatParams enterChatParams = new EnterChatParams(this.itemView.getContext(), iMUser);
        enterChatParams.setEnterFrom(2);
        enterChatParams.setEnterFromForMob(str);
        enterChatParams.setEnterMethodForMob("cell");
        enterChatParams.setSessionId(c886420Yq0.getKey().getConversationId());
        AbstractC884010Ym7 unreadState = c886420Yq0.getUnreadState();
        enterChatParams.setUnreadCount(unreadState != null ? unreadState.getNum() : 0);
        enterChatParams.setUnreadViewState(c886420Yq0.getUnreadState());
        enterChatParams.setStickyTop(c0y8t != null && c0y8t.isStickTop());
        enterChatParams.setTCM(c0y8t != null && C879390Yef.LIZJ(c0y8t));
        enterChatParams.setRisky(c0y8t != null && c0y8t.isRisky());
        enterChatParams.setChatType(1);
        enterChatParams.setHighRiskConversation(c0y8t != null && C879390Yef.LIZLLL(c0y8t));
        enterChatParams.setMediaMsgMasking(c0y8t != null && C0Z5J.LIZIZ(c0y8t));
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        enterChatParams.setTabletOptimizationEnabled(c19252910Tv.LIZLLL().LJIIL().LJI());
        if (C19212010Ec.LIZJ.LJLLLLLL()) {
            C878960Ydy c878960YdyI52 = I5();
            if (c878960YdyI52 != null && (enumC880520YgU = c878960YdyI52.LLILLL) != null && (mobValue = enumC880520YgU.getMobValue()) != null) {
                enterChatParams.getExtraMobParams().put("tab_name", mobValue);
            }
            C885310YoD c885310YoD = C885310YoD.LIZ;
            Boolean bool = Boolean.FALSE;
            List<C880460YgO> chatLabels = c886420Yq0.getChatLabels();
            MatchedFriendStruct relationLabel = c886420Yq0.getRelationLabel();
            c885310YoD.getClass();
            String strLJIILLIIL = C885310YoD.LJIILLIIL(bool, chatLabels, relationLabel);
            if (strLJIILLIIL.length() > 0) {
                enterChatParams.getExtraMobParams().put("chat_label", strLJIILLIIL);
            }
        }
        C885310YoD c885310YoD2 = C885310YoD.LIZ;
        C878960Ydy c878960YdyI53 = I5();
        c885310YoD2.getClass();
        String strLJIJ = C885310YoD.LJIJ(c878960YdyI53);
        if (strLJIJ != null) {
            enterChatParams.getExtraMobParams().put("chat_section", strLJIJ);
        }
        C892210YzL.LIZIZ(c0y8t != null ? c0y8t.getLastShowMessage() : null, enterChatParams.getExtraMobParams());
        if (c19252910Tv.LIZLLL().LJIIL().LJI()) {
            if (C300860Bqm.LIZ()) {
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (fragmentLJI instanceof SAFTikTokFragment) && (sAFTikTokFragment = (SAFTikTokFragment) fragmentLJI) != null) {
                    sAFTikTokFragment.finish();
                }
            } else {
                BaseMessageRequestListVM baseMessageRequestListVMN5 = N5();
                if ((baseMessageRequestListVMN5 instanceof MessageRequestListVM) && baseMessageRequestListVMN5 != null) {
                    baseMessageRequestListVMN5.setState(AFwS248S0000000_14.get$arr$(360));
                }
            }
        }
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
        C0ZE7 c0ze7LIZ = ((C0ZE7) this.LLJJJJ.getValue()).LIZ();
        c0ze7LIZ.LIZJ = iMUser.getUid();
        AbstractC885530YoZ abstractC885530YoZ2 = this.LLJJIJIIJIL;
        if ((abstractC885530YoZ2 instanceof C886420Yq0) && (c886420Yq02 = (C886420Yq0) abstractC885530YoZ2) != null && (activityStatusViewData = c886420Yq02.getActivityStatusViewData()) != null) {
            boolValueOf = Boolean.valueOf(C429290GsR.LIZ(activityStatusViewData));
        }
        c0ze7LIZ.LJII = boolValueOf;
        c0ze8LJIIJJI.LIZ(c0ze7LIZ, false, C0I0B.LJFF.LIZIZ());
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C886420Yq0 c886420Yq0;
        C878630YdR key;
        String conversationId;
        super.onViewAttachedToWindow();
        if ((getChunk() instanceof C894470Z7d) && C612090Nzb.LIZ()) {
            AbstractC885530YoZ abstractC885530YoZ = this.LLJJIJIIJIL;
            if (!(abstractC885530YoZ instanceof C886420Yq0) || (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) == null || (key = c886420Yq0.getKey()) == null || (conversationId = key.getConversationId()) == null) {
                return;
            }
            N5().HQ2(conversationId);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell
    public final void R5(AbstractC885530YoZ abstractC885530YoZ) {
        boolean zBooleanValue;
        C886420Yq0 c886420Yq0;
        C878630YdR key;
        C886420Yq0 c886420Yq02;
        C429270GsP activityStatusViewData;
        Boolean boolValueOf;
        boolean z = abstractC885530YoZ instanceof C886420Yq0;
        String conversationId = null;
        if (z && (c886420Yq02 = (C886420Yq0) abstractC885530YoZ) != null && (activityStatusViewData = c886420Yq02.getActivityStatusViewData()) != null && (boolValueOf = Boolean.valueOf(C429290GsR.LIZ(activityStatusViewData))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        InterfaceC894770Z8h interfaceC894770Z8h = (InterfaceC894770Z8h) this.LLJJJIL.getValue();
        if (interfaceC894770Z8h != null) {
            interfaceC894770Z8h.LIZIZ(zBooleanValue);
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE7 c0ze7LIZ = ((C0ZE7) this.LLJJJJ.getValue()).LIZ();
        if (z && (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) != null && (key = c886420Yq0.getKey()) != null) {
            conversationId = key.getConversationId();
        }
        c0ze7LIZ.LIZJ = String.valueOf(C0YNP.LJII(conversationId));
        c0ze7LIZ.LJII = Boolean.valueOf(zBooleanValue);
        C0ZE8.LJIIIZ(c0ze7LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell
    public final void S5(AbstractC885530YoZ abstractC885530YoZ) {
        C886420Yq0 c886420Yq0;
        Object obj;
        String strValueOf;
        Map<AbstractC1491605sg<?>, C1490405sU<?>> map;
        C1490405sU<?> c1490405sU;
        IMContact iMContact = null;
        if ((abstractC885530YoZ instanceof C886420Yq0) && (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) != null) {
            IChatListEngine.LIZ.getClass();
            C879540Yeu<?> c879540YeuLJII = C884160YmM.LIZ().LJII(c886420Yq0.getKey(), I5());
            if (c879540YeuLJII != null && (map = c879540YeuLJII.LIZLLL) != null && (c1490405sU = map.get(C1718806oE.LIZ)) != null) {
                obj = c1490405sU.LIZIZ;
            } else {
                obj = null;
            }
            if (!(obj instanceof IMUser) || (iMContact = (IMContact) obj) == null || (strValueOf = iMContact.getUid()) == null) {
                strValueOf = String.valueOf(C0YNP.LJII(c886420Yq0.getKey().getConversationId()));
            }
            IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJJIJI.getValue();
            if (iDMAvatarLoader != null) {
                iDMAvatarLoader.LIZIZ(strValueOf, c886420Yq0.getAvatar(), new C0ZKF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), 0, 0, 0, 0, (C0ZK1) null, 126));
            }
            if (iMContact != null) {
                IAccessibilityUtils.LIZ.getClass();
                IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
                if (iAccessibilityUtilsLIZ != null) {
                    iAccessibilityUtilsLIZ.LIZ((C1322110kVd) this.LLJJI.getValue(), iMContact);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.powercell.BaseMessageRequestChatListCell
    public final void T5(AbstractC885530YoZ abstractC885530YoZ) {
        List<C880460YgO> chatLabels;
        TuxTextView tuxTextView;
        C886420Yq0 c886420Yq0;
        String strLIZIZ = null;
        if ((abstractC885530YoZ instanceof C886420Yq0) && (c886420Yq0 = (C886420Yq0) abstractC885530YoZ) != null) {
            chatLabels = c886420Yq0.getChatLabels();
        } else {
            chatLabels = null;
        }
        int i = 0;
        if (chatLabels != null && !chatLabels.isEmpty()) {
            if (chatLabels.size() == 1) {
                strLIZIZ = ((C880460YgO) ListProtector.get(chatLabels, 0)).displayText;
            } else if (chatLabels.size() >= 2) {
                strLIZIZ = C1710306mr.LIZIZ(2131845298, ((C880460YgO) ListProtector.get(chatLabels, 0)).displayText, ((C880460YgO) ListProtector.get(chatLabels, 1)).displayText);
            }
        }
        View view = (View) this.LLJILJILJ.getValue();
        if (view != null) {
            if (abstractC885530YoZ.getRelationLabel() == null && strLIZIZ != null && strLIZIZ.length() > 0) {
                TextView textView = (TextView) this.LLJILJILJ.getValue();
                if (textView != null) {
                    textView.setText(strLIZIZ);
                }
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (C885630Yoj.LIZIZ() && (tuxTextView = (TuxTextView) this.LLJILJILJ.getValue()) != null) {
            tuxTextView.setTextColorRes(R.attr.t9);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)))), 16);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        }
    }
}
