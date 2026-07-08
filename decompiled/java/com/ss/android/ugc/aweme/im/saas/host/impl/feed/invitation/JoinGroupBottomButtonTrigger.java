package com.ss.android.ugc.aweme.im.saas.host.impl.feed.invitation;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C03H5;
import X.C0I0B;
import X.C0PEM;
import X.C1229970i71;
import X.C1230610i83;
import X.C1230620i84;
import X.C1230850i8R;
import X.C13IQ;
import X.C13LE;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C337180DJs;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C724240Sb0;
import X.EnumC1153770g87;
import X.EnumC1229960i70;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.publicgroup.data.ToastDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class JoinGroupBottomButtonTrigger extends BaseCellTriggerComponent<JoinGroupBottomButtonTrigger> implements InterfaceC699970Rcx, PriorityProtocol {
    public static final /* synthetic */ int LLJLL = 0;
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1502));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1501));
    public String LLJLILLLLZIIL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_dm_join_group";
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(JoinGroupBottomButtonAssem.class);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJLIIIJLLLLLLLZ.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_dm_join_group";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return new C700450Rdj(new AwS633S0100000_19(this, 48), new AwS633S0100000_19(this, 49), null, 4);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    public final void LLLLLL(boolean z) {
        PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(this, z);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) this.LLJLIL.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.Ds2();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long jLongValue7;
        long jLongValue8;
        long jLongValue9;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC1153770g87 enumC1153770g87 = EnumC1153770g87.BEFORE_SUPER_BIND;
        linkedHashMap.put(enumC1153770g87, Long.valueOf(System.nanoTime()));
        tp(videoItemParams);
        EnumC1153770g87 enumC1153770g872 = EnumC1153770g87.AFTER_SUPER_BIND;
        linkedHashMap.put(enumC1153770g872, Long.valueOf(System.nanoTime()));
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        this.LLJLILLLLZIIL = aid;
        if (!lp(videoItemParams)) {
            C337180DJs.LIZ(LJJIJL());
            return;
        }
        EnumC1153770g87 enumC1153770g873 = EnumC1153770g87.BEFORE_CONTENTION;
        linkedHashMap.put(enumC1153770g873, Long.valueOf(System.nanoTime()));
        PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.Vx0(this, new AwS598S0100000_19(this, 169), AFwS257S0000000_19.get$arr$(174));
        }
        EnumC1153770g87 enumC1153770g874 = EnumC1153770g87.AFTER_CONTENTION;
        linkedHashMap.put(enumC1153770g874, Long.valueOf(System.nanoTime()));
        String str = this.LLJLILLLLZIIL;
        if (str == null) {
            return;
        }
        String strLIZ = C1230620i84.LIZ(str);
        if (strLIZ != null && C724240Sb0.LIZ(this) != null) {
            EnumC1153770g87 enumC1153770g875 = EnumC1153770g87.BEFORE_HANDLE_RESPONSE;
            linkedHashMap.put(enumC1153770g875, Long.valueOf(System.nanoTime()));
            GroupInvitePopupResponse groupInvitePopupResponseLJIILJJIL = null;
            if (C1230620i84.LIZIZ.contains(str)) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1230850i8R(strLIZ, this, str, null), 3);
            } else {
                IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
                if (iMGroupChatApiLIZ != null) {
                    groupInvitePopupResponseLJIILJJIL = iMGroupChatApiLIZ.LJIILJJIL(strLIZ);
                }
                yp(groupInvitePopupResponseLJIILJJIL, str);
            }
            EnumC1153770g87 enumC1153770g876 = EnumC1153770g87.AFTER_HANDLE_RESPONSE;
            linkedHashMap.put(enumC1153770g876, Long.valueOf(System.nanoTime()));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            long jLongValue10 = 0;
            if (linkedHashMap.containsKey(enumC1153770g872) && linkedHashMap.containsKey(enumC1153770g87)) {
                Long l = (Long) linkedHashMap.get(enumC1153770g872);
                if (l != null) {
                    jLongValue8 = l.longValue();
                } else {
                    jLongValue8 = 0;
                }
                Long l2 = (Long) linkedHashMap.get(enumC1153770g87);
                if (l2 != null) {
                    jLongValue9 = l2.longValue();
                } else {
                    jLongValue9 = 0;
                }
                linkedHashMap2.put("super_bind", String.valueOf(jLongValue8 - jLongValue9));
            }
            if (linkedHashMap.containsKey(enumC1153770g873) && linkedHashMap.containsKey(enumC1153770g872)) {
                Long l3 = (Long) linkedHashMap.get(enumC1153770g873);
                if (l3 != null) {
                    jLongValue6 = l3.longValue();
                } else {
                    jLongValue6 = 0;
                }
                Long l4 = (Long) linkedHashMap.get(enumC1153770g872);
                if (l4 != null) {
                    jLongValue7 = l4.longValue();
                } else {
                    jLongValue7 = 0;
                }
                linkedHashMap2.put("bind_to_contention", String.valueOf(jLongValue6 - jLongValue7));
            }
            if (linkedHashMap.containsKey(enumC1153770g874) && linkedHashMap.containsKey(enumC1153770g873)) {
                Long l5 = (Long) linkedHashMap.get(enumC1153770g874);
                if (l5 != null) {
                    jLongValue4 = l5.longValue();
                } else {
                    jLongValue4 = 0;
                }
                Long l6 = (Long) linkedHashMap.get(enumC1153770g873);
                if (l6 != null) {
                    jLongValue5 = l6.longValue();
                } else {
                    jLongValue5 = 0;
                }
                linkedHashMap2.put("contention", String.valueOf(jLongValue4 - jLongValue5));
            }
            if (linkedHashMap.containsKey(enumC1153770g875) && linkedHashMap.containsKey(enumC1153770g874)) {
                Long l7 = (Long) linkedHashMap.get(enumC1153770g875);
                if (l7 != null) {
                    jLongValue2 = l7.longValue();
                } else {
                    jLongValue2 = 0;
                }
                Long l8 = (Long) linkedHashMap.get(enumC1153770g874);
                if (l8 != null) {
                    jLongValue3 = l8.longValue();
                } else {
                    jLongValue3 = 0;
                }
                linkedHashMap2.put("contention_to_handle_response", String.valueOf(jLongValue2 - jLongValue3));
            }
            if (linkedHashMap.containsKey(enumC1153770g876) && linkedHashMap.containsKey(enumC1153770g875)) {
                Long l9 = (Long) linkedHashMap.get(enumC1153770g876);
                if (l9 != null) {
                    jLongValue = l9.longValue();
                } else {
                    jLongValue = 0;
                }
                Long l10 = (Long) linkedHashMap.get(enumC1153770g875);
                if (l10 != null) {
                    jLongValue10 = l10.longValue();
                }
                linkedHashMap2.put("handle_response", String.valueOf(jLongValue - jLongValue10));
            }
            if (AbstractC19994813Le.Default.nextInt(LSPassThroughRecordSizeConfig.DEFAULT) == 0) {
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("ttsocial_fcp_bind_time_cost_tech", linkedHashMap2);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind failed: awemeId is ");
        sbLIZ.append(str);
        sbLIZ.append(", inviteId is ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(", activity is ");
        sbLIZ.append(C724240Sb0.LIZ(this));
        C2188811AlT.LIZIZ(sbLIZ);
        LLLLLL(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Map<String, C1230610i83> map = C1230620i84.LIZ;
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        if (C1230620i84.LIZ(aid) != null) {
            return true;
        }
        return false;
    }

    public final void yp(GroupInvitePopupResponse groupInvitePopupResponse, String str) {
        Long lValueOf;
        ToastDisplayMeta toastDisplayMeta;
        if (groupInvitePopupResponse != null && groupInvitePopupResponse.toastMeta.statusCode == 0) {
            C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
            int i = groupInvitePopupResponse.popupMeta.userGroupStatus;
            c1229970i71.getClass();
            if (C1229970i71.LIZ(i) == EnumC1229960i70.CAN_JOIN) {
                C1230620i84.LIZIZ.add(str);
                LLLLLL(true);
                return;
            } else {
                C1230620i84.LIZIZ.remove(str);
                LLLLLL(false);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("awemeId is ");
        sbLIZ.append(str);
        sbLIZ.append(", handleResponse error: ");
        if (groupInvitePopupResponse != null && (toastDisplayMeta = groupInvitePopupResponse.toastMeta) != null) {
            lValueOf = Long.valueOf(toastDisplayMeta.statusCode);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        LLLLLL(false);
    }
}
