package com.bytedance.android.livesdk.usercard;

import X.AbstractC755190Tjp;
import X.C1161920gLG;
import X.C19EG;
import X.C497740JfY;
import X.C498340JgW;
import X.C498350JgX;
import X.C500980Jkm;
import X.C750510TcH;
import X.C750580TcO;
import X.C750600TcQ;
import X.C750670TcX;
import X.C750690TcZ;
import X.C752910Tg9;
import X.C755140Tjk;
import X.C755240Tju;
import X.C755290Tjz;
import X.C755300Tk0;
import X.C755310Tk1;
import X.C755360Tk6;
import X.EnumC755280Tjy;
import X.InterfaceC2262081DgM;
import X.InterfaceC752920TgA;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.commonactionpanel.ISheetPanelService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveProfileManageNewDialog extends LiveDialogFragment implements InterfaceC752920TgA {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PTYpHELIOSOywyOiFiBSYlLRU+Jik6JCABKCEyLyACLDgXISQgJig=";

    @Override // X.InterfaceC752920TgA
    public final LifecycleOwner LLILLIZIL() {
        return this;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_k);
        c500980Jkm.LIZIZ = 0;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIIZ = -1;
        c500980Jkm.LJIIJ = -2;
        c500980Jkm.LIZJ = R.style.f945aho;
        return c500980Jkm;
    }

    @Override // X.InterfaceC752920TgA
    public final FragmentManager oc() {
        return getChildFragmentManager();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        Window window2;
        WindowManager.LayoutParams attributes;
        Window window3;
        super.onStart();
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx() && (dialog = getDialog()) != null && (window2 = dialog.getWindow()) != null) {
            Dialog dialog2 = getDialog();
            if (dialog2 == null || (window3 = dialog2.getWindow()) == null || (attributes = window3.getAttributes()) == null) {
                attributes = null;
            } else {
                attributes.height = -2;
            }
            window2.setAttributes(attributes);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 == null || (window = dialog3.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C498340JgW c498340JgW;
        DataChannel dataChannel;
        Room room;
        User user;
        boolean zBooleanValue;
        User user2;
        boolean z;
        super.onViewCreated(view, bundle);
        ArrayList arrayList = new ArrayList();
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("report_arg");
        }
        if (!(serializable instanceof C498340JgW) || (c498340JgW = (C498340JgW) serializable) == null || (dataChannel = this.dataChannel) == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (user = (User) dataChannel.gg0(C750690TcZ.class)) == null) {
            return;
        }
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        boolean z2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C755240Tju c755240Tju = new C755240Tju();
        c755240Tju.LIZLLL = user.isAnchorMarked;
        arrayList.add(new Pair(c755240Tju, new C752910Tg9(room, user, dataChannel)));
        arrayList.add(new Pair(new C755310Tk1(), new C498350JgX(room, user, c498340JgW, dataChannel)));
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C750600TcQ c750600TcQ = new C750600TcQ(user, zBooleanValue, z2, room, activity, null, currentUser, getFragmentManager(), "user_profile");
            C755300Tk0 c755300Tk0 = new C755300Tk0();
            UserAttr userAttr = user.getUserAttr();
            if (userAttr != null) {
                z = userAttr.isMuted;
            } else {
                z = false;
            }
            c755300Tk0.LIZLLL = z;
            user2 = user;
            arrayList.add(new Pair(c755300Tk0, new C750510TcH(room, user2, c498340JgW, fragmentManager, dataChannel)));
            C755290Tjz c755290Tjz = new C755290Tjz();
            c755290Tjz.LIZLLL = user2.isBlock;
            arrayList.add(new Pair(c755290Tjz, new C750580TcO(c750600TcQ)));
        } else {
            user2 = user;
        }
        AbstractC755190Tjp abstractC755190Tjp = new AbstractC755190Tjp() { // from class: X.0Tjv
            {
                C497740JfY.LJIJI(2131842822);
                C755200Tjq c755200Tjq = C755360Tk6.LIZLLL;
                C1697810uHb.LJIILJJIL(EnumC755280Tjy.ANCHOR);
                EnumC755230Tjt enumC755230Tjt = EnumC755230Tjt.SECTION2;
            }
        };
        if (user2.getUserAttr().isAdmin) {
            abstractC755190Tjp.LIZIZ = C497740JfY.LJIJI(2131843150);
        } else {
            abstractC755190Tjp.LIZIZ = C497740JfY.LJIJI(2131842822);
            abstractC755190Tjp.LIZJ = C497740JfY.LJIJI(2131851141);
            abstractC755190Tjp.LJFF = C755360Tk6.LJI;
            if (user2.getFollowInfo().getFollowStatus() == 3 || user2.getFollowInfo().getFollowStatus() == 2) {
                z2 = true;
            }
            abstractC755190Tjp.LJ = z2;
        }
        arrayList.add(new Pair(abstractC755190Tjp, new C750670TcX(user2, c498340JgW, dataChannel)));
        C755140Tjk c755140TjkFd0 = ((ISheetPanelService) C1161920gLG.LIZJ(ISheetPanelService.class)).fd0(arrayList, this, EnumC755280Tjy.ANCHOR);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.trr);
        if (c755140TjkFd0 != null) {
            getLayoutInflater();
            View viewLIZJ = c755140TjkFd0.LIZJ(viewGroup);
            if (viewLIZJ != null) {
                viewGroup.addView(viewLIZJ);
            }
        }
    }
}
