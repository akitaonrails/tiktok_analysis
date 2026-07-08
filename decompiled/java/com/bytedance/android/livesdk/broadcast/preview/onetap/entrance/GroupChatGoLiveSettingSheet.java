package com.bytedance.android.livesdk.broadcast.preview.onetap.entrance;

import X.C013C;
import X.C0IJR;
import X.C0UNN;
import X.C0UUI;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C11NZ;
import X.C16F5;
import X.C19MB;
import X.C20736316Cj;
import X.C21538419Qw;
import X.C417850GZz;
import X.C419910GdJ;
import X.C497740JfY;
import X.C748880TZe;
import X.C758220Toi;
import X.C758260Tom;
import X.C758340Tou;
import X.C768460UCm;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.GroupChatGoLiveAutoApproveSwitch;
import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGroupGoLiveOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS34S0310000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import wh6.AbS162S0110000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GroupChatGoLiveSettingSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9JyspPS4jZiAiPT0yJiYpZwghJzA8CicyPAIjBSYlLRYpPTs6JiIfISo2PA==";
    public DataChannel LLJLLL;
    public String LLJZ;
    public C758220Toi LLJZIJLIL;
    public ViewModelStoreOwner LLL;
    public InterfaceC1631620sYq<? super Integer, ? super Boolean, ? super C11NZ<?>, Unit> LLLF;
    public boolean LLLFF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        int i;
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.dp8);
        if (imageView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C497740JfY.LJJ()) {
                i = R.raw.icon_chevron_left_slim_thin_ltr;
            } else {
                i = R.raw.icon_chevron_right_slim_thin_ltr;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ezq);
            imageView.setImageDrawable(c419910GdJ.LIZ(view.getContext()));
        }
        ViewModelStoreOwner viewModelStoreOwner = this.LLL;
        if (viewModelStoreOwner != null) {
            this.LLJLLL = C0IJR.LIZ(new ViewModelProvider(viewModelStoreOwner), this);
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.j6n);
        if (imageView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.ezt);
            imageView2.setImageDrawable(c419910GdJ2.LIZ(view.getContext()));
            C786410Ut5.Q7(imageView2, new ACListenerS147S0100000_12(this, 140));
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.j6o);
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            if (LinkMicGroupGoLiveOptSetting.INSTANCE.needPreview()) {
                C758340Tou c758340Tou = new C758340Tou();
                c758340Tou.LIZLLL = 1;
                c758340Tou.LJ = true;
                c758340Tou.LIZ = null;
                c758340Tou.LIZIZ = null;
                c758340Tou.LIZJ = null;
                c758340Tou.LJFF = true;
                C0UUI c0uui = new C0UUI(view.getContext(), c758340Tou, C768460UCm.LIZIZ());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0uui);
                c0uui.setLayoutParams(layoutParams);
                ViewParent parent = frameLayout.getParent();
                if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    c19mb.LJIILL(frameLayout.getId(), 0);
                    c19mb.LJIIJJI(frameLayout.getId(), 0);
                    c19mb.LJIILJJIL(0.32f, frameLayout.getId());
                    c19mb.LJJ(frameLayout.getId(), "0.8");
                    c19mb.LIZIZ(constraintLayout);
                }
                frameLayout.addView(c0uui);
                c0uui.LJIIL();
                C417850GZz.LIZ((int) C497740JfY.LIZIZ(14.0f), frameLayout);
            } else {
                int iLIZIZ = (int) C497740JfY.LIZIZ(64.0f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                layoutParams2.gravity = 17;
                LiveIconView liveIconView = new LiveIconView(view.getContext(), null);
                C786410Ut5.w6(liveIconView, layoutParams2);
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_color_multi_live_fill;
                liveIconView.setImageDrawable(c419910GdJ3.LIZ(view.getContext()));
                frameLayout.addView(liveIconView);
            }
        }
        boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
        View viewFindViewById = view.findViewById(R.id.dp7);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AbS162S0110000_12(this, zIsPrivateAccount, 1), viewFindViewById);
        }
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.dp_);
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.dp6);
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, GroupChatGoLiveAutoApproveSwitch.class, new AwS591S0100000_12(c16f52, 240));
        }
        C013C c013c = new C013C();
        c013c.element = true;
        DataChannel dataChannel2 = this.LLJLLL;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, VisibleScopeSelectedChannel.class, new AwS34S0310000_12(c013c, this, zIsPrivateAccount, c16f5, 0));
        }
        DataChannel dataChannel3 = this.LLJLLL;
        if (dataChannel3 == null || dataChannel3.gg0(VisibleScopeSelectedChannel.class) == null) {
            DataChannel dataChannel4 = this.LLJLLL;
            if (dataChannel4 != null) {
                dataChannel4.SX0(C0UNN.class, "chat_live");
            }
            DataChannel dataChannel5 = this.LLJLLL;
            if (dataChannel5 != null) {
                dataChannel5.SX0(C758260Tom.class, Boolean.FALSE);
            }
            if (zIsPrivateAccount) {
                DataChannel dataChannel6 = this.LLJLLL;
                if (dataChannel6 != null) {
                    dataChannel6.zW(VisibleScopeSelectedChannel.class, new C758220Toi(3, (List) null, (List) null, (List) null, 30));
                }
            } else {
                DataChannel dataChannel7 = this.LLJLLL;
                if (dataChannel7 != null) {
                    dataChannel7.zW(VisibleScopeSelectedChannel.class, this.LLJZIJLIL);
                }
            }
        }
        DataChannel dataChannel8 = this.LLJLLL;
        if (dataChannel8 != null) {
            dataChannel8.SX0(C748880TZe.class, getParentFragmentManager());
        }
        ((C21538419Qw) view.findViewById(R.id.dp9)).setRadius((int) C497740JfY.LIZIZ(22.0f));
        C786410Ut5.I7(new AbS694S0100000_12(this, 11), view.findViewById(R.id.dp9));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gom, viewGroup, false);
    }
}
