package com.bytedance.android.livesdk.share;

import X.C0IHL;
import X.C0UO0;
import X.C1106110etF;
import X.C1106210etP;
import X.C1161920gLG;
import X.C11NZ;
import X.C19EG;
import X.C465590INp;
import X.C480460Ism;
import X.C481220Iu0;
import X.C481250Iu3;
import X.C781050UkR;
import X.InterfaceC1372610lp5;
import X.InterfaceC481210Itz;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ShareService implements IShareService {
    public C481220Iu0 LL;

    @Override // com.bytedance.android.live.share.IShareService
    public final LiveShareWidget A30() {
        return new LiveShareWidget();
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final C481250Iu3 Xg0() {
        return new C481250Iu3();
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final InterfaceC481210Itz mh() {
        if (this.LL == null) {
            this.LL = new C481220Iu0((IHostShare) C1161920gLG.LIZJ(IHostShare.class));
        }
        return this.LL;
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final C781050UkR uJ2() {
        return new C781050UkR();
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final boolean I21(Room room) {
        if (room == null || room.getOwner() == null || room.getOwner().getSecret() == 1) {
            return false;
        }
        if (room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableShare()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final void hy1(FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            new ShareSettingsDialog().show(fragmentManager, "ShareSettingsDialog");
        }
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final boolean vH2(Room room) {
        if (room == null || room.getOwner() == null || room.getOwner().getSecret() == 1) {
            return false;
        }
        if (room.getRoomAuthStatus() != null && !room.getRoomAuthStatus().isEnableShare()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final LiveShareDialog t71(C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return LiveShareDialog.MR(c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final List fK2(LiveMode liveMode, Room room, DataChannel dataChannel) {
        return C465590INp.LIZ(liveMode, room, dataChannel, true);
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final void jR0(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        LiveShareDialog.NR(activity, c1106210etP, interfaceC1372610lp5);
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final C1106110etF K72(C19EG c19eg, Context context, LiveMode liveMode, LifecycleOwner lifecycleOwner) {
        return new C1106110etF(c19eg, context, liveMode, lifecycleOwner);
    }

    @Override // com.bytedance.android.live.share.IShareService
    public final C11NZ ky(String str, long j, String str2, String str3) {
        if (str2 == null) {
            str2 = "";
        }
        C0IHL c0ihl = new C0IHL();
        c0ihl.LIZ("target_id", String.valueOf(-1));
        c0ihl.LIZ("share_type", String.valueOf(1));
        c0ihl.LIZ("common_label_list", String.valueOf(str));
        c0ihl.LIZ("to_user_ids", str2.replaceAll(" ", ""));
        c0ihl.LIZ("enter_from", str3);
        HashMap<String, String> map = c0ihl.LIZ;
        C480460Ism.LIZ().getClass();
        return ((ShareApi) C480460Ism.LIZLLL(ShareApi.class)).sendShare(j, map).LJIILIIL(new C0UO0());
    }
}
