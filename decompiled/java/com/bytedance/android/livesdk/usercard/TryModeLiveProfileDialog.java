package com.bytedance.android.livesdk.usercard;

import X.C09JN;
import X.C0KVU;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C16F5;
import X.C1766560w4U;
import X.C1819620xS4;
import X.C1850730yGF;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.InterfaceC495890JcZ;
import X.InterfaceC496990JeL;
import X.InterfaceC500940Jki;
import Y.ACListenerS142S0100000_7;
import Y.AfS103S0300000_7;
import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.text.u;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class TryModeLiveProfileDialog extends LiveDialogFragment implements InterfaceC496990JeL, InterfaceC495890JcZ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PTHELIOSYpOywyOiFiHT0qBSooLAM6PiAcOyA1ISkpDSYyJCor";
    public long LL;
    public User LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public C1324720kZq LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public C16F5 LLJIJIL;

    @Override // X.InterfaceC496990JeL
    public final void C5() {
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // X.InterfaceC496990JeL
    public final void o1() {
    }

    @Override // X.InterfaceC496990JeL
    public final boolean op() {
        return false;
    }

    public final void OR() {
        View view = this.LLILZ;
        if (view == null) {
            view = null;
        }
        if (C500260Jjc.LJJJJIZL(view)) {
            View view2 = this.LLILZ;
            if (view2 == null) {
                view2 = null;
            }
            C500260Jjc.LJIILIIL(view2);
        }
        View view3 = this.LLILZIL;
        C500260Jjc.LLFFF(view3 != null ? view3 : null);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g8a);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LIZJ = R.style.uj;
        c500980Jkm.LJIILIIL = 3;
        c500980Jkm.LJI = 0.0f;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(UserProfileShowingChannel.class, Boolean.TRUE);
        }
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        if (C500260Jjc.LJ(getContext()) != null) {
            TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
            tuxImmersionBarLIZJ.LIZJ(false, false);
            tuxImmersionBarLIZJ.LIZIZ.LJIIL();
            tuxImmersionBarLIZJ.LJFF(-16777216);
            tuxImmersionBarLIZJ.LIZIZ.LJII(false);
            tuxImmersionBarLIZJ.LIZLLL();
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final void MR(Function0<Unit> function0) {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        User user = this.LLILLJJLI;
        if (user != null && user.getId() == interfaceC500940JkiUser.LJIJJLI().getId()) {
            interfaceC500940JkiUser.LJIILLIIL().LJJIIZ(new AfS103S0300000_7(function0, this, interfaceC500940JkiUser, 2), new C09JN() { // from class: X.0Jda
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("TryModeLiveProfileDialog@d53f.queryLatestUser$2");
                    C1C7U.LIZIZ("TryModeLiveProfileDialog@d53f.queryLatestUser$2");
                }
            });
        } else {
            interfaceC500940JkiUser.LJIJJ(this.LL, "try mode fetch moderator's User").LJJIIZ(new AfS143S0200000_7((Object) this, (EmoteModel) function0, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 10), new AfS176S0100000_7(this, 98));
        }
    }

    public final void NR(FragmentManager fragmentManager) {
        super.show(fragmentManager, "TryModeLiveProfileDialog");
    }

    public final void PR(User user) {
        String strLJIJI;
        long followerCount;
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(user.getAvatarThumb());
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
        c1324610kZfLJIIIZ.LJJI(this.LLILZLL);
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            c16f5.setText(C0KVU.LIZLLL(user));
        }
        C16F5 c16f52 = this.LLIZLLLIL;
        if (c16f52 != null) {
            c16f52.setText(C0KVU.LJ(user));
        }
        C16F5 c16f53 = this.LLJ;
        long followingCount = 0;
        if (c16f53 != null) {
            FollowInfo followInfo = user.getFollowInfo();
            if (followInfo != null) {
                followerCount = followInfo.getFollowerCount();
            } else {
                followerCount = 0;
            }
            c16f53.setText(C1850730yGF.LJIIIIZZ(followerCount));
        }
        C16F5 c16f54 = this.LLJI;
        if (c16f54 != null) {
            FollowInfo followInfo2 = user.getFollowInfo();
            if (followInfo2 != null) {
                followingCount = followInfo2.getFollowingCount();
            }
            c16f54.setText(C1850730yGF.LJIIIIZZ(followingCount));
        }
        if (!TextUtils.isEmpty(user.getAutoGraph())) {
            strLJIJI = user.getAutoGraph();
        } else {
            strLJIJI = C497740JfY.LJIJI(2131851991);
        }
        C16F5 c16f55 = this.LLJIJIL;
        if (c16f55 != null) {
            c16f55.setText(u.LJJIFFI(strLJIJI, "\n", " ", false));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById = view.findViewById(R.id.yg_);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 108), viewFindViewById);
        }
        this.LLILLL = view.findViewById(R.id.nbh);
        View viewFindViewById2 = view.findViewById(R.id.i7b);
        this.LLILZ = viewFindViewById2;
        View view2 = null;
        if (this.LLILLJJLI != null) {
            if (viewFindViewById2 == null) {
                viewFindViewById2 = null;
            }
            C500260Jjc.LJIILIIL(viewFindViewById2);
        }
        this.LLILZIL = view.findViewById(R.id.nd6);
        View viewFindViewById3 = view.findViewById(R.id.mi2);
        if (viewFindViewById3 == null) {
            viewFindViewById3 = null;
        }
        C786410Ut5.I7(new AbS689S0100000_7(this, 7), viewFindViewById3);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.bh2);
        this.LLIZ = (C16F5) view.findViewById(R.id.p94);
        this.LLIZLLLIL = (C16F5) view.findViewById(R.id.user_name);
        this.LLJ = (C16F5) view.findViewById(R.id.ify);
        this.LLJI = (C16F5) view.findViewById(R.id.igj);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.pid);
        User user = this.LLILLJJLI;
        if (user != null) {
            PR(user);
            MR(null);
            return;
        }
        View view3 = this.LLILLL;
        if (view3 == null) {
            view3 = null;
        }
        C500260Jjc.LJIILIIL(view3);
        View view4 = this.LLILZ;
        if (view4 != null) {
            view2 = view4;
        }
        C500260Jjc.LLFFF(view2);
        MR(new AwS551S0100000_7(this, 657));
    }
}
