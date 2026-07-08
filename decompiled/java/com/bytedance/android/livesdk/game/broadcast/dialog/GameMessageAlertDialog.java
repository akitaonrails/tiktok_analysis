package com.bytedance.android.livesdk.game.broadcast.dialog;

import X.C0IJT;
import X.C0IPN;
import X.C0W78;
import X.C1126540fQC;
import X.C1143780fs0;
import X.C11JF;
import X.C19GN;
import X.C19GO;
import X.C19GP;
import X.C19U0;
import X.C19U1;
import X.C439101nJ;
import X.C474500IjA;
import X.C500260Jjc;
import X.C500750JkP;
import X.C500870Jkb;
import X.C500880Jkc;
import X.C500910Jkf;
import X.C500920Jkg;
import X.C500980Jkm;
import X.C784440Upu;
import X.C786410Ut5;
import X.C812003Fe;
import X.C930940aKi;
import X.DialogInterfaceOnClickListenerC521730Kd9;
import X.InterfaceC1584740rLE;
import X.InterfaceC772390URp;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameMessageAlertDialog;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class GameMessageAlertDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiHELIOSotLSwyOzFiLSYyJCorZwgyJSABLDwgKSIpCCM2OjEIIC4/JyI=";
    public C11JF LL;
    public C19GN LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public C19U1 LLILZIL;
    public boolean LLILZLL = true;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        if (this.LLILLJJLI == null) {
            C19GO c19go = new C19GO(getContext());
            String strLIZ = C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_game_demand_1");
            C19GP c19gp = new C19GP() { // from class: X.0Jkd
                @Override // X.C19GP
                public final void LIZ(View view, String str, String str2) {
                    C1143680frq.LIZLLL(view, str, str2);
                }
            };
            c19go.LJIIIZ = Integer.MAX_VALUE;
            c19go.LJIIJJI = strLIZ;
            c19go.LJIIL = "ttlive_ic_float_permission_pic.png";
            c19go.LJIILIIL = 1.6315789f;
            c19go.LJIILJJIL = c19gp;
            c19go.LJI(2131844020);
            c19go.LIZIZ(2131844019);
            c19go.LJ(2131844018, new DialogInterfaceOnClickListenerC521730Kd9(this, 0), false);
            c19go.LIZJ(2131844017, new DialogInterfaceOnClickListenerC521730Kd9(this, 1), false);
            C19GN c19gnLIZ = c19go.LIZ();
            c19gnLIZ.setCanceledOnTouchOutside(false);
            this.LLILLJJLI = c19gnLIZ;
        }
        C500260Jjc.LJJLIIIJLLLLLLLZ(this.LLILLJJLI);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8i);
        c500980Jkm.LIZIZ = 2;
        c500980Jkm.LIZJ = R.style.ai0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 73;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        super.onDestroyView();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        C19U1 c19u1;
        C19U0 tabAt;
        super.onStart();
        if (Intrinsics.LJFF(this.LLILLL, "guide_toast") && (c19u1 = this.LLILZIL) != null && (tabAt = c19u1.getTabAt(1)) != null) {
            tabAt.LIZIZ();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        long id;
        super.onDismiss(dialogInterface);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_overlay_setting_left");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLLZIIL.LIZIZ()) ? 1 : 0), "is_comments_notifications");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLLZIL.LIZIZ()) ? 1 : 0), "is_gift_notifications");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLZ.LIZIZ()) ? 1 : 0), "is_entry_messages");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLZIL.LIZIZ()) ? 1 : 0), "is_followed_messages");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLLZL.LIZIZ()) ? 1 : 0), "is_gift_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLLZLL.LIZIZ()) ? 1 : 0), "is_comments_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLLZLZ.LIZIZ()) ? 1 : 0), "is_start_comment_bubble");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLLZZ.LIZIZ()) ? 1 : 0), "is_start_comment_notifications");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.LLZILL.LIZIZ()) ? 1 : 0), "is_like_messages");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(InterfaceC772390URp.H.LIZIZ()) ? 1 : 0), "is_show_activities_tab");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        Room room;
        StarCommentConfig starCommentConfig;
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 61), view);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (starCommentConfig = room.starCommentConfig) != null && starCommentConfig.starCommentQualification) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C500920Jkg(2131842184, InterfaceC772390URp.H, "livesdk_live_show_activities_tab_click", 2131842183, true, null, 32));
        arrayList.add(new C500920Jkg(2131842187, InterfaceC772390URp.LLLZIL, "livesdk_anchor_message_alert_setting_hover_ban_gift_click", null, false, null, 56));
        arrayList.add(new C500920Jkg(2131842185, InterfaceC772390URp.LLLZIIL, "livesdk_anchor_message_alert_setting_hover_ban_comment_click", null, !z, null, 40));
        if (z) {
            arrayList.add(new C500920Jkg(2131842192, InterfaceC772390URp.LLLZZ, "livesdk_star_comment_overlay_settings_click", null, true, "full", 8));
        }
        arrayList.add(new C500920Jkg(2131842188, InterfaceC772390URp.LLZILL, "livesdk_anchor_message_alert_setting_hover_ban_like_click", null, false, null, 56));
        arrayList.add(new C500920Jkg(2131842189, InterfaceC772390URp.LLZIL, "livesdk_anchor_message_alert_setting_hover_ban_follow_click", null, false, null, 56));
        arrayList.add(new C500920Jkg(2131842190, InterfaceC772390URp.LLZ, "livesdk_anchor_message_alert_setting_hover_ban_entry_click", null, false, null, 56));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C500920Jkg(2131842187, InterfaceC772390URp.LLLZL, "livesdk_anchor_floating_gifts_switch_click", null, false, null, 56));
        arrayList2.add(new C500920Jkg(2131842185, InterfaceC772390URp.LLLZLL, "livesdk_anchor_floating_comments_switch_click", null, false, null, 56));
        if (z) {
            arrayList2.add(new C500920Jkg(2131842192, InterfaceC772390URp.LLLZLZ, "livesdk_star_comment_overlay_settings_click", null, false, "small", 24));
        }
        ArrayList arrayList3 = new ArrayList();
        C19U1 c19u1 = null;
        ViewPager viewPager = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.hrv, null);
        if (viewLJLLJ != null) {
            C1126540fQC c1126540fQC = (C1126540fQC) viewLJLLJ.findViewById(R.id.yr2);
            C500260Jjc.LJLL(C439101nJ.LIZ(193), C439101nJ.LIZ(128), c1126540fQC);
            c1126540fQC.LLJILJIL = C1143780fs0.LJIIJ("tiktok_live_game_demand_1", "ttlive_ic_game_setting_msg_new.png");
            c1126540fQC.LIZJ();
            RecyclerView recyclerView = (RecyclerView) viewLJLLJ.findViewById(R.id.yt0);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            recyclerView.setAdapter(new C500910Jkf(arrayList, C0W78.LJFF(getContext()), new C500870Jkb(this)));
            arrayList3.add(viewLJLLJ);
        }
        View viewLJLLJ2 = C786410Ut5.LJLLJ(getContext(), R.layout.hrv, null);
        if (viewLJLLJ2 != null) {
            C1126540fQC c1126540fQC2 = (C1126540fQC) viewLJLLJ2.findViewById(R.id.yr2);
            C500260Jjc.LJLL(C439101nJ.LIZ(160), C439101nJ.LIZ(64), c1126540fQC2);
            C500260Jjc.LJLJL(C439101nJ.LIZ(39), c1126540fQC2);
            C500260Jjc.LJJLJ(C439101nJ.LIZ(39), c1126540fQC2);
            c1126540fQC2.LLJILJIL = C1143780fs0.LJIIJ("tiktok_live_game_demand_1", "ttlive_ic_game_setting_right_tab.png");
            c1126540fQC2.LIZJ();
            RecyclerView recyclerView2 = (RecyclerView) viewLJLLJ2.findViewById(R.id.yt0);
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            recyclerView2.setAdapter(new C500910Jkf(arrayList2, C0W78.LJFF(getContext()), new C500880Jkc(this)));
            arrayList3.add(viewLJLLJ2);
        }
        C19U1 c19u12 = (C19U1) view.findViewById(R.id.yr3);
        if (c19u12 != null) {
            ViewPager viewPager2 = (ViewPager) view.findViewById(R.id.yr4);
            if (viewPager2 != null) {
                C812003Fe c812003Fe = new C812003Fe(arrayList3);
                c812003Fe.LLILLL = new String[]{getString(2131842193), getString(2131842194)};
                viewPager2.setAdapter(c812003Fe);
                viewPager = viewPager2;
            }
            c19u12.setupWithViewPager(viewPager, false);
            c19u12.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0Jka
                @Override // X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void ih(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    C19U0 tabAt;
                    String str;
                    long id;
                    int i;
                    GameMessageAlertDialog gameMessageAlertDialog = this.LL;
                    C19U1 c19u13 = gameMessageAlertDialog.LLILZIL;
                    boolean z2 = false;
                    if (c19u13 != null) {
                        tabAt = c19u13.getTabAt(0);
                    } else {
                        tabAt = null;
                    }
                    if (Intrinsics.LJFF(tabAt, c19u0)) {
                        str = "full";
                    } else {
                        str = "small";
                    }
                    gameMessageAlertDialog.LLILZ = str;
                    TextView textView = (TextView) view.findViewById(R.id.yr1);
                    if (textView != null) {
                        if (Intrinsics.LJFF(this.LL.LLILZ, "full")) {
                            i = 2131842186;
                        } else {
                            i = 2131842191;
                        }
                        textView.setText(i);
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_overlay_settings_show");
                    c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                    Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    if (room2 != null) {
                        id = room2.getId();
                    } else {
                        id = 0;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                    c474500IjALIZ.LJJII("screen_share", "live_type");
                    String str2 = this.LL.LLILLL;
                    if (str2 == null) {
                        str2 = "in_app";
                    }
                    c474500IjALIZ.LJJII(str2, "enter_from");
                    c474500IjALIZ.LJJII(this.LL.LLILZ, "tab_name");
                    c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0W78.LJFF(C497740JfY.LJII()))) ? 1 : 0), "overlay_permission");
                    c474500IjALIZ.LIZ();
                    GameMessageAlertDialog gameMessageAlertDialog2 = this.LL;
                    if (c19u0 != null && c19u0.LJ == 0) {
                        z2 = true;
                    }
                    gameMessageAlertDialog2.LLILZLL = z2;
                }
            });
            c19u1 = c19u12;
        }
        this.LLILZIL = c19u1;
        this.LL = (C11JF) C784440Upu.LIZ().LJ(C500750JkP.class).LJJLJLI(new AfS176S0100000_7(this, 271));
    }
}
