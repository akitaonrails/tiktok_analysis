package com.ss.android.ugc.aweme.im.saas.host.api.live;

import X.C0ZVS;
import X.C11NZ;
import X.C16E3;
import X.C830490Whz;
import X.C901730ZZb;
import Y.AObserverS178S0200000_14;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public interface IMLiveService {
    public static final C0ZVS LIZ = C0ZVS.LIZ;

    Boolean LIZ();

    boolean LIZIZ();

    void LIZJ(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle);

    String LJ();

    C11NZ LJFF(long j, String str);

    void LJI(Context context, TuxTextView tuxTextView, boolean z);

    String LJII(String str);

    boolean LJIIIIZZ();

    boolean LJIIIZ();

    boolean LJIIJ(String str, String str2);

    boolean LJIIJJI();

    void LJIIL();

    boolean LJIILIIL();

    void LJIILJJIL(long j, Context context, String str);

    void LJIILL(C830490Whz c830490Whz);

    C16E3 LJIILLIIL(C901730ZZb c901730ZZb);

    long LJIIZILJ();

    boolean LJIJ();

    void LJIJI(String str, SingleTitleBarCenterAssem singleTitleBarCenterAssem, AObserverS178S0200000_14 aObserverS178S0200000_14);

    boolean enableCreateLiveEventInGroupChat();

    void i3(long j, Function0 function0, Function1 function1);

    void isEnableLive();
}
