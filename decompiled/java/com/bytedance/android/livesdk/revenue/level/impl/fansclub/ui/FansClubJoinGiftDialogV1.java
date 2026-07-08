package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import X.C0JSS;
import X.C0TGE;
import X.C0TZM;
import X.C1094580eae;
import X.C1095480ec6;
import X.C1143680frq;
import X.C16F5;
import X.C16G6;
import X.C416770GVv;
import X.C497740JfY;
import X.C500980Jkm;
import X.C518180KTw;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1095170ebb;
import Y.ACListenerS152S0100000_17;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinGiftDialogV1 extends AbsFansClubJoinDialog implements InterfaceC1095170ebb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGHELIOSslJD8/ZiMtJzwwJDAuZzo6ZgMtJzwQJDAuAyA6JgIlLzsXISQgJigFeQ==";
    public final /* synthetic */ C1095480ec6 LLILZIL = new C1095480ec6();
    public C16F5 LLILZLL;
    public ImageView LLIZ;
    public long LLIZLLLIL;
    public LinearLayout LLJ;
    public LinearLayout LLJI;
    public LinearLayout LLJIJIL;
    public LinearLayout LLJILJIL;
    public C16F5 LLJILJILJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.style.aic : R.style.ain;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g69);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 17;
        c500980Jkm.LJ = false;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel = this.dataChannel;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        C518180KTw.LJJIJIL("fans_club_gift", dataChannel, jCurrentTimeMillis, joinDialogViewModel != null ? joinDialogViewModel.LLJI : false, this.LLILZ, 0L, "fan", false);
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        Window window2;
        super.onStart();
        if (this.dataChannel != null && (dialog = getDialog()) != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(Integer.MIN_VALUE);
            window2.setNavigationBarColor(-16777216);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = (int) C497740JfY.LIZIZ(310.0f);
            attributes.height = -2;
            window2.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLILZIL.LL = i;
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLILZIL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LLILZIL.LL = -1;
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        Room room;
        User owner;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = System.currentTimeMillis();
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.fy0), new ACListenerS152S0100000_17(this, 126));
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.a24);
        this.LLILZLL = c16f5;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 127));
        }
        this.LLIZ = (ImageView) view.findViewById(R.id.b1s);
        this.LLJ = (LinearLayout) view.findViewById(R.id.bpo);
        this.LLJI = (LinearLayout) view.findViewById(R.id.h72);
        this.LLJIJIL = (LinearLayout) view.findViewById(R.id.iwn);
        this.LLJILJIL = (LinearLayout) view.findViewById(R.id.mmb);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.ho2);
        LinearLayout linearLayout = this.LLJ;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS152S0100000_17(this, 128));
        }
        LinearLayout linearLayout2 = this.LLJI;
        if (linearLayout2 != null) {
            C786410Ut5.R7(linearLayout2, new ACListenerS152S0100000_17(this, 129));
        }
        LinearLayout linearLayout3 = this.LLJIJIL;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS152S0100000_17(this, 130));
        }
        LinearLayout linearLayout4 = this.LLJILJIL;
        if (linearLayout4 != null) {
            C786410Ut5.R7(linearLayout4, new ACListenerS152S0100000_17(this, 131));
        }
        View viewFindViewById = view.findViewById(R.id.bps);
        View viewFindViewById2 = view.findViewById(R.id.iy1);
        View viewFindViewById3 = view.findViewById(R.id.bsr);
        View viewFindViewById4 = view.findViewById(R.id.f754mmc);
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_badge.png");
        C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_gift.png");
        C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_entrance_effect.png");
        C1143680frq.LIZLLL(viewFindViewById4, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_level_up_effect.png");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            C0JSS.LJII(this.LLIZ, owner.getAvatarThumb());
            String strK4 = C786410Ut5.k4(Locale.US, C497740JfY.LJIJI(2131841654), Arrays.copyOf(new Object[]{e3.d, 1}, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK4);
            Drawable drawableMutate = getResources().getDrawable(R.drawable.etw).mutate();
            drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
            C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
            C786410Ut5.q2(spannableStringBuilder, new C416770GVv(drawableMutate), strK4.length() - 4, strK4.length() - 2, 34);
            C16F5 c16f52 = this.LLILZLL;
            if (c16f52 != null) {
                c16f52.setText(spannableStringBuilder);
            }
        }
        C1094580eae.LIZ.getClass();
        C823050WQl.LIZLLL().execute(C0TGE.LL);
        C518180KTw.LJIILL(Boolean.TRUE, Integer.valueOf(this.LLILZIL.LL), "show", this.LL);
        C16F5 c16f53 = this.LLJILJILJ;
        if (c16f53 != null) {
            if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                i = 2131852361;
            } else {
                i = 2131841667;
            }
            c16f53.setText(C497740JfY.LJIJI(i));
        }
    }
}
