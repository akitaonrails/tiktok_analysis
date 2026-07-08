package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.C1048590dOT;
import X.C987610bo7;
import X.InterfaceC987400bnm;
import android.content.Context;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommerceAdExperienceService {
    boolean R2(Aweme aweme);

    void S2(Context context, Aweme aweme, String str, String str2);

    void T2(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, Function0<Unit> function0, Function0<Unit> function02);

    void U2(Context context, Aweme aweme, String str, Function0<Unit> function0, Function0<Unit> function02);

    InterfaceC987400bnm V2(C987610bo7 c987610bo7);

    void W2(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, String str);

    String X2(AwemeRawAd awemeRawAd);

    BottomBarPriorityProtocol Y2();

    boolean Z2(Aweme aweme);

    void a3(Context context, Aweme aweme, String str, Map<String, ? extends Object> map, boolean z, List<ImageInfo> list);

    boolean b3(Aweme aweme);

    void c3(Context context, Comment comment);

    void d3(Aweme aweme, String str);

    C1048590dOT e3(Aweme aweme);

    List<String> f3(Aweme aweme);

    boolean g3(Aweme aweme);

    void h3(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, ? extends Object> map, String str8);

    C1048590dOT i3(Aweme aweme);
}
