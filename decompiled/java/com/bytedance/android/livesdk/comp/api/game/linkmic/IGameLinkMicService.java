package com.bytedance.android.livesdk.comp.api.game.linkmic;

import X.C006A;
import X.C942470adJ;
import X.InterfaceC924870aAv;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkControlWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
public interface IGameLinkMicService extends C006A {
    GameLinkControlWidget B70(InterfaceC924870aAv interfaceC924870aAv);

    int GT0(String str);

    boolean Hq0(Room room);

    void La0(Fragment fragment, Room room);

    int Lo0(User user, String str);

    void Mr0();

    boolean gZ(User user);

    boolean tR(Runnable runnable, String str);

    void uG(DataChannel dataChannel);

    C942470adJ xo();
}
