package com.bytedance.android.livesdk.interaction.pollandgiftvote;

import X.AbstractC518790KWf;
import X.C0KWM;
import X.C1086800eO6;
import X.C1086830eO9;
import X.C1086960eOM;
import X.C1161920gLG;
import X.C16F5;
import X.C497740JfY;
import X.C500980Jkm;
import X.C518780KWe;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC748580TYa;
import X.InterfaceC1086820eO8;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdkapi.depend.model.live.PollConf;
import com.bytedance.android.livesdkapi.depend.model.live.PollCountLimit;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class PollAndGiftVoteDialog extends LiveDialogFragment implements InterfaceC1086820eO8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElJiHELIOSF9OCogJS49LCIlLzslJzEpZx88JCkNJysUISM4HyAnLQElKCM8Lw==";
    public View LL;
    public LinearLayout LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public LinearLayout LLIZ;
    public LinearLayout LLIZLLLIL;
    public LinearLayout LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public LinearLayout LLJILLL;
    public View LLJJ;
    public Room LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJI = -1;
    public String LLJJIII = "other";
    public final C518780KWe LLJJIJIL = new AbstractC518790KWf() { // from class: X.0KWe
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            Integer num;
            PollAndGiftVoteDialog pollAndGiftVoteDialog = this.LIZ;
            PollMessage pollMessage = c01c1.LJFF;
            if (pollMessage != null) {
                num = pollMessage.pollKind;
            } else {
                num = null;
            }
            pollAndGiftVoteDialog.gS(true, num);
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            Integer num;
            if (c01c1.LJI == EnumC1085350eLl.CANCEL) {
                PollAndGiftVoteDialog pollAndGiftVoteDialog = this.LIZ;
                PollMessage pollMessage = c01c1.LJFF;
                if (pollMessage != null) {
                    num = pollMessage.pollKind;
                } else {
                    num = null;
                }
                pollAndGiftVoteDialog.gS(false, num);
            }
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.dataChannel, AFwS237S0000000_7.get$arr$(35), new AwS586S0100000_7(this, 151), AFwS237S0000000_7.get$arr$(36), getString(2131843888), Boolean.TRUE);
    }

    public final void NR() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).disableFunctionAccordingLevel(this.dataChannel, AFwS237S0000000_7.get$arr$(37), new AwS586S0100000_7(this, 152), AFwS237S0000000_7.get$arr$(38), C497740JfY.LJIJI(2131841312), Boolean.TRUE);
    }

    public final View OR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fca) : null;
            this.LLJI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View PR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.h1d) : null;
            this.LLJJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C16F5 RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j14) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LinearLayout SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nd1) : null;
            this.LLIZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final View UR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sms) : null;
            this.LLJILJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View VR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.snc) : null;
            this.LL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View WR() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xmo) : null;
            this.LLJILJILJ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View ZR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.xpl) : null;
            this.LLJIJIL = viewFindViewById;
        }
        return viewFindViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[PHI: r0
      0x0022: PHI (r0v32 android.view.View) = (r0v31 android.view.View), (r0v39 android.view.View) binds: [B:5:0x000e, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[PHI: r0
      0x00e7: PHI (r0v3 android.view.View) = (r0v2 android.view.View), (r0v7 android.view.View) binds: [B:27:0x00d3, B:32:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog.bS():void");
    }

    public final void cS() {
        Room room;
        PollConf pollConf;
        PollCountLimit pollCountLimit;
        if (C0KWM.LIZ(this.LLJJIJI) || (room = this.LLJJIJI) == null || (pollConf = room.pollConf) == null || (pollCountLimit = pollConf.giftPollLimit) == null || pollCountLimit.currentPollCount < pollCountLimit.maxPollCount) {
            return;
        }
        View viewUR = UR();
        if (viewUR != null) {
            C786410Ut5.T4(viewUR, 0.34f);
        }
        if (C0KWM.LIZIZ(this.LLJJIJI)) {
            C766270U4b.LIZLLL(2131852593);
        } else {
            View viewUR2 = UR();
            if (viewUR2 != null) {
                C786410Ut5.I7(null, viewUR2);
            }
        }
        View viewWR = WR();
        if (viewWR != null) {
            C786410Ut5.T4(viewWR, 0.34f);
        }
        View viewWR2 = WR();
        if (viewWR2 != null) {
            C786410Ut5.I7(null, viewWR2);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_c);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // X.InterfaceC1086820eO8
    public final void LIZLLL() {
        aS(VR());
        this.LLJJI = -1;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        DataChannel dataChannel;
        EnumC748580TYa enumC748580TYa;
        super.dismiss();
        if (!Intrinsics.LJFF(this.LLJJIII, "share_moderator") || (dataChannel = this.dataChannel) == null) {
            return;
        }
        if (this.LLJJIJIIJIL) {
            enumC748580TYa = EnumC748580TYa.GUIDE;
            enumC748580TYa.pre();
        } else {
            enumC748580TYa = EnumC748580TYa.DISMISS;
        }
        dataChannel.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Room room;
        super.onDestroy();
        C1086800eO6.LIZIZ(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this.LLJJIJIL);
        }
        this.LLJJIJI = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    public static void aS(View view) {
        LinearLayout linearLayout;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.fba)) != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
    }

    public static void dS(View view) {
        LinearLayout linearLayout;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.fba)) != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
    }

    @Override // X.InterfaceC1086820eO8
    public final void LJJI(long j) {
        if (C1086830eO9.LIZLLL()) {
            dS(VR());
            this.LLJJI = 0;
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void gS(boolean z, Integer num) {
        boolean zLIZIZ = C0KWM.LIZIZ(this.LLJJIJI);
        if (z) {
            if (num != null) {
                if (num.intValue() == 4) {
                    dS(UR());
                    this.LLJJI = 4;
                    return;
                }
                if (num.intValue() == 2) {
                    if (zLIZIZ) {
                        dS(OR());
                    } else {
                        dS(ZR());
                    }
                    this.LLJJI = 2;
                    return;
                }
                if (num.intValue() == 5) {
                    dS(PR());
                    this.LLJJI = 5;
                    return;
                } else {
                    if (num.intValue() == 3) {
                        if (zLIZIZ) {
                            dS(OR());
                        } else {
                            dS(WR());
                        }
                        this.LLJJI = 3;
                        return;
                    }
                    if (num.intValue() == 0) {
                        dS(VR());
                        this.LLJJI = 0;
                        return;
                    }
                }
            }
            this.LLJJI = -1;
            return;
        }
        this.LLJJI = -1;
        if (num == null) {
            return;
        }
        if (num.intValue() == 4) {
            aS(UR());
            cS();
            return;
        }
        if (num.intValue() == 2) {
            if (zLIZIZ) {
                aS(OR());
                return;
            } else {
                aS(ZR());
                return;
            }
        }
        if (num.intValue() == 5) {
            aS(PR());
        } else {
            if (num.intValue() != 3) {
                return;
            }
            if (zLIZIZ) {
                aS(OR());
            } else {
                aS(WR());
            }
            cS();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02be A[PHI: r3
      0x02be: PHI (r3v14 android.view.View) = (r3v13 android.view.View), (r3v19 android.view.View) binds: [B:102:0x02a8, B:107:0x02bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d9 A[PHI: r10
      0x02d9: PHI (r10v4 android.view.View) = (r10v3 android.view.View), (r10v6 android.view.View) binds: [B:110:0x02c6, B:115:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300 A[PHI: r1
      0x0300: PHI (r1v48 android.view.View) = (r1v47 android.view.View), (r1v50 android.view.View) binds: [B:124:0x02ed, B:129:0x02fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031d A[PHI: r1
      0x031d: PHI (r1v36 android.view.View) = (r1v35 android.view.View), (r1v45 android.view.View) binds: [B:132:0x030a, B:137:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0488 A[PHI: r1
      0x0488: PHI (r1v28 android.view.View) = (r1v27 android.view.View), (r1v30 android.view.View) binds: [B:219:0x0475, B:224:0x0486] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04d7 A[PHI: r1
      0x04d7: PHI (r1v53 android.view.View) = (r1v52 android.view.View), (r1v56 android.view.View) binds: [B:236:0x04c1, B:241:0x04d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0576 A[PHI: r14
      0x0576: PHI (r14v3 int) = (r14v2 int), (r14v5 int) binds: [B:261:0x0572, B:45:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028b A[PHI: r11
      0x028b: PHI (r11v5 boolean) = (r11v2 boolean), (r11v2 boolean), (r11v6 boolean) binds: [B:248:0x050a, B:249:0x050c, B:94:0x024d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028e  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 1649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.pollandgiftvote.PollAndGiftVoteDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
