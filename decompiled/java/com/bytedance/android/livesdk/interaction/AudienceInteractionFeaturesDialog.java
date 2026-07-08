package com.bytedance.android.livesdk.interaction;

import X.AbstractC518790KWf;
import X.C01C3;
import X.C01C5;
import X.C0IJT;
import X.C0KWU;
import X.C0KWX;
import X.C0KX8;
import X.C0UIM;
import X.C1086960eOM;
import X.C16F5;
import X.C16FV;
import X.C474500IjA;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C518760KWc;
import X.C518770KWd;
import X.C751340Tdc;
import X.C753250Tgh;
import X.C786410Ut5;
import X.EnumC1102640ene;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS31S0100100_7;
import Y.ACListenerS74S0300000_7;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.AdminPermissionUpdateChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.NormalPollIdDataChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class AudienceInteractionFeaturesDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzHELIOSElJiF9CTAoICo9KyAFJzs2OiQvPSY8JgMpKDsmOiA/DSYyJCor";
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public final C518760KWc LLILZ = new AbstractC518790KWf() { // from class: X.0KWc
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            C500260Jjc.LLFFF(this.LIZ.MR().findViewById(R.id.fba));
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            if (c01c1.LJI == EnumC1085350eLl.CANCEL) {
                C500260Jjc.LJIILIIL(this.LIZ.MR().findViewById(R.id.fba));
            }
        }
    };
    public final C518770KWd LLILZIL = new AbstractC518790KWf() { // from class: X.0KWd
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            C500260Jjc.LLFFF(this.LIZ.NR().findViewById(R.id.fba));
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            if (c01c1.LJI == EnumC1085350eLl.CANCEL) {
                C500260Jjc.LJIILIIL(this.LIZ.NR().findViewById(R.id.fba));
            }
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final View MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fch) : null;
            this.LL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View NR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rf9) : null;
            this.LLILLJJLI = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g4s);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this.LLILZ);
            C1086960eOM.LJIJ(room.getId(), this.LLILZIL);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0KX8 c0kx8;
        Boolean boolValueOf;
        Room room;
        String strLJJJJJL;
        Object objValueOf;
        User user;
        long jLongValue;
        DataChannel dataChannel;
        Long l;
        Long l2;
        super.onViewCreated(view, bundle);
        if (C0UIM.LIZJ()) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                EnumC1102740eno enumC1102740eno = EnumC1102740eno.VOTE;
                if (!enumC1102740eno.isShowing(dataChannel2) && enumC1102740eno.isShowingInInteractionDialog(dataChannel2) && C01C5.LIZ(this.dataChannel)) {
                    DataChannel dataChannel3 = this.dataChannel;
                    if (dataChannel3 != null && (l2 = (Long) dataChannel3.gg0(C751340Tdc.class)) != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    C1086960eOM c1086960eOM = C1086960eOM.LL;
                    if (c1086960eOM.LIZIZ(jLongValue)) {
                        DataChannel dataChannel4 = this.dataChannel;
                        if (dataChannel4 != null) {
                            dataChannel4.BQ2(this, AdminPermissionUpdateChannel.class, new AwS586S0100000_7(this, 528));
                            dataChannel4.BQ2(getViewLifecycleOwner(), NormalPollIdDataChannel.class, new AwS586S0100000_7(this, 529));
                        }
                        C0KWU.LIZ = false;
                        View viewNR = NR();
                        ((C16FV) viewNR.findViewById(R.id.jxe)).setImageResource(R.drawable.exi);
                        ((TextView) viewNR.findViewById(R.id.title)).setText(2131852592);
                        ((TextView) viewNR.findViewById(R.id.desc)).setText(2131841311);
                        C500260Jjc.LLFFF(viewNR);
                        C786410Ut5.I7(new ACListenerS31S0100100_7(jLongValue, this, 3), viewNR);
                        if (c1086960eOM.LIZLLL(jLongValue) == null && (dataChannel = this.dataChannel) != null && (l = (Long) dataChannel.gg0(NormalPollIdDataChannel.class)) != null && l.longValue() == 0) {
                            C500260Jjc.LJIILIIL(viewNR.findViewById(R.id.fba));
                        } else {
                            C500260Jjc.LLFFF(viewNR.findViewById(R.id.fba));
                        }
                        C1086960eOM.LJIILL(jLongValue, this.LLILZIL);
                        C0KWU.LIZLLL(this.dataChannel, "toolbar_interact");
                    }
                }
            }
        } else {
            EnumC1102750enp enumC1102750enp = EnumC1102750enp.CUSTOM_POLL;
            if (!enumC1102750enp.isShowing(this.dataChannel) && enumC1102750enp.isShowingInInteractionDialog(this.dataChannel)) {
                View viewMR = MR();
                ((C16FV) viewMR.findViewById(R.id.jxe)).setImageResource(R.drawable.exi);
                DataChannel dataChannel5 = this.dataChannel;
                if (dataChannel5 != null) {
                    c0kx8 = (C0KX8) dataChannel5.gg0(LiveBanCapabilityChannel.class);
                } else {
                    c0kx8 = null;
                }
                DataChannel dataChannel6 = this.dataChannel;
                if (dataChannel6 != null) {
                    boolValueOf = Boolean.valueOf(C01C5.LIZ(dataChannel6));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    ((TextView) viewMR.findViewById(R.id.title)).setText(2131841312);
                    ((TextView) viewMR.findViewById(R.id.desc)).setText(2131841311);
                    DataChannel dataChannel7 = this.dataChannel;
                    if (dataChannel7 != null) {
                        dataChannel7.BQ2(this, LiveBanCapabilityChannel.class, new AwS586S0100000_7(viewMR, 525));
                    }
                    if (c0kx8 != null && c0kx8.LIZLLL) {
                        C786410Ut5.l5((C16FV) viewMR.findViewById(R.id.jxe), 0.34f);
                        C786410Ut5.k5((C16F5) viewMR.findViewById(R.id.title), 0.34f);
                        C786410Ut5.k5((C16F5) viewMR.findViewById(R.id.desc), 0.34f);
                    } else {
                        C786410Ut5.l5((C16FV) viewMR.findViewById(R.id.jxe), 1.0f);
                        C786410Ut5.k5((C16F5) viewMR.findViewById(R.id.title), 1.0f);
                        C786410Ut5.k5((C16F5) viewMR.findViewById(R.id.desc), 1.0f);
                    }
                } else {
                    ((TextView) viewMR.findViewById(R.id.title)).setText(2131844495);
                    ((TextView) viewMR.findViewById(R.id.desc)).setText(2131841316);
                }
                C01C3.LJ(this.dataChannel, "interaction_panel", "video_live", false, false, false);
                C500260Jjc.LLFFF(viewMR);
                C786410Ut5.I7(new ACListenerS74S0300000_7(this, c0kx8, viewMR, 18), viewMR);
                DataChannel dataChannel8 = this.dataChannel;
                if (dataChannel8 != null && (room = (Room) dataChannel8.gg0(RoomChannel.class)) != null) {
                    if (C1086960eOM.LL.LJIIIZ(room.getId())) {
                        C500260Jjc.LLFFF(viewMR.findViewById(R.id.fba));
                    } else {
                        C500260Jjc.LJIILIIL(viewMR.findViewById(R.id.fba));
                    }
                    C1086960eOM.LJIILL(room.getId(), this.LLILZ);
                }
            }
        }
        EnumC1102750enp enumC1102750enp2 = EnumC1102750enp.MULTIGUEST;
        if (!enumC1102750enp2.isShowing(this.dataChannel) && enumC1102750enp2.isShowingInInteractionDialog(this.dataChannel)) {
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.mr8);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = viewFindViewById;
            }
            ((C16FV) viewFindViewById.findViewById(R.id.jxe)).setImageResource(R.drawable.ezl);
            ((TextView) viewFindViewById.findViewById(R.id.title)).setText(2131844553);
            ((TextView) viewFindViewById.findViewById(R.id.desc)).setText(2131844552);
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 297), viewFindViewById);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_icon_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("interaction_entrance", "request_page");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LIZ();
            } else {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJJIJL();
            }
            if (C0KWX.LIZ[EnumC1102640ene.MULTI_GUEST.ordinal()] == 1) {
                View viewFindViewById2 = this.LLILLL;
                if (viewFindViewById2 == null) {
                    View view3 = getView();
                    if (view3 != null) {
                        viewFindViewById2 = view3.findViewById(R.id.mr8);
                    } else {
                        viewFindViewById2 = null;
                    }
                    this.LLILLL = viewFindViewById2;
                }
                C500260Jjc.LLFFF(viewFindViewById2);
            }
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_interaction_panel_show");
        c474500IjALIZ2.LJIJJLI(this.dataChannel);
        c474500IjALIZ2.LJJII("toolbar", "entrance");
        if (C01C5.LIZ(this.dataChannel)) {
            DataChannel dataChannel9 = this.dataChannel;
            if (dataChannel9 != null && (user = (User) dataChannel9.gg0(RoomUserChannel.class)) != null) {
                objValueOf = Long.valueOf(user.getId());
            } else {
                objValueOf = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ2.LJJII(objValueOf, "moderator_id");
            c474500IjALIZ2.LJJII("moderator", "user_type");
        } else {
            c474500IjALIZ2.LJJII("audience", "user_type");
        }
        DataChannel dataChannel10 = this.dataChannel;
        if (dataChannel10 != null) {
            strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel10);
        } else {
            strLJJJJJL = null;
        }
        c474500IjALIZ2.LJJII(strLJJJJJL, "live_type");
        c474500IjALIZ2.LIZ();
        DataChannel dataChannel11 = this.dataChannel;
        if (dataChannel11 != null) {
            dataChannel11.SX0(C753250Tgh.class, "toolbar_interact");
        }
    }
}
