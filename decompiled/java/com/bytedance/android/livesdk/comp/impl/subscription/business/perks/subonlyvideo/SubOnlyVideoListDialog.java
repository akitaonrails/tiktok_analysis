package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo;

import X.C1161920gLG;
import X.C19EH;
import X.C2095008Iq;
import X.C490220JKi;
import X.C490230JKj;
import X.C490240JKk;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C512300K7g;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.BroadcastEndShowEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListDialog;
import com.bytedance.android.livesdk.dataChannel.LiveEndDismissDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubOnlyVideoListDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2HELIOSExPTYlJyogO2s8LD04O2s/PC08Jik1PyY3LSpiGjoxBysgMBk6LCAjBSYgPAElKCM8Lw==";
    public Room LLILLJJLI;
    public String LL = "";
    public String LLILLL = "";

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gb7);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 60;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        String string;
        long id;
        User owner;
        boolean zBooleanValue;
        User owner2;
        String string2;
        String string3;
        Boolean boolLIZ;
        String string4;
        String string5;
        Long lLJIILIIL;
        super.onCreate(bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILLJJLI = room;
        Bundle arguments = getArguments();
        String secUid = "";
        if (arguments == null || (string = arguments.getString("back_url")) == null) {
            string = "";
        }
        this.LLILLL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string4 = arguments2.getString("user_id")) != null && C500260Jjc.LJJIIZ(string4)) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (string5 = arguments3.getString("user_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string5)) != null) {
                id = lLJIILIIL.longValue();
            } else {
                id = 0;
            }
        } else {
            Room room2 = this.LLILLJJLI;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                id = owner.getId();
            } else {
                id = UserService.getInstance().user().getCurrentUser().getId();
            }
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (boolLIZ = C512300K7g.LIZ(arguments4, "is_anchor", null)) != null) {
            zBooleanValue = boolLIZ.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string2 = arguments5.getString("sec_user_id")) != null && C500260Jjc.LJJIIZ(string2)) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null && (string3 = arguments6.getString("sec_user_id")) != null) {
                secUid = string3;
            }
        } else {
            Room room3 = this.LLILLJJLI;
            if (room3 == null || (owner2 = room3.getOwner()) == null || (secUid = owner2.getSecUid()) == null) {
                secUid = UserService.getInstance().user().getCurrentUser().getSecUid();
            }
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LIZIZ(R.id.iiv, ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).wt1(zBooleanValue, this.LLILLJJLI, id, secUid, this.LL, "", null, new C490220JKi(), new SubOnlyVideoOpenParams(null, null, 7, 0), null));
        c19ehLJIIJ.LJIIIZ();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, LiveEndDismissDialogEvent.class, new C490230JKj(this));
            dataChannel2.BQ2(this, BroadcastEndShowEvent.class, new C490240JKk(this));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(getActivity());
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.bmy);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JKh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Context context = this.LL.getContext();
                    if (context != null) {
                        SubOnlyVideoListDialog subOnlyVideoListDialog = this.LL;
                        if (C500260Jjc.LJJIIZ(subOnlyVideoListDialog.LLILLL)) {
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, subOnlyVideoListDialog.LLILLL);
                            subOnlyVideoListDialog.dismiss();
                            return;
                        }
                        Room room = subOnlyVideoListDialog.LLILLJJLI;
                        if (room == null) {
                            return;
                        }
                        subOnlyVideoListDialog.dismiss();
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIJJI(context, room, subOnlyVideoListDialog.LL, null);
                    }
                }
            });
        }
    }
}
