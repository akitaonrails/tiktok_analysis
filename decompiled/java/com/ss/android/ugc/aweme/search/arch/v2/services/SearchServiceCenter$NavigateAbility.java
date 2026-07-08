package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.InterfaceC494301wD;
import X.InterfaceC645880PVa;
import X.InterfaceC665370Q7z;
import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchServiceCenter$NavigateAbility extends InterfaceC494301wD {
    void GV0(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, InterfaceC645880PVa interfaceC645880PVa, boolean z, Map<String, String> map, Product product);

    void Zx0(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme);

    void hk0(InterfaceC665370Q7z interfaceC665370Q7z, Aweme aweme, Function1<? super EnterRoomConfig, EnterRoomConfig> function1);

    void ie0(InterfaceC665370Q7z interfaceC665370Q7z, Context context, User user, String str);

    boolean zT1();
}
