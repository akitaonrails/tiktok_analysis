package com.ss.android.ugc.aweme.analytics;

import X.AbstractC2252651DEx;
import X.C06Q7;
import X.C0Y8T;
import X.C866530Xz1;
import X.InterfaceC1364105Vn;
import X.InterfaceC1493105sv;
import X.InterfaceC876950Yaj;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface IIMChatRoomAnalytics {
    public static final C06Q7 LIZ = C06Q7.LIZ;

    int LIZ(SessionInfo sessionInfo);

    void LIZIZ(long j, SessionInfo sessionInfo, int i, long j2, int i2, List<? extends RecyclerView.ViewHolder> list, String str, boolean z, boolean z2, InterfaceC1493105sv interfaceC1493105sv);

    String LIZJ(SessionInfo sessionInfo);

    void LIZLLL(String str, String str2);

    Object LJ(IMUser iMUser, String str, Map<String, String> map, C0Y8T c0y8t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJFF(EnterChatParams enterChatParams, String str, InterfaceC876950Yaj interfaceC876950Yaj, C866530Xz1 c866530Xz1, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str2, AbstractC2252651DEx abstractC2252651DEx, boolean z2, boolean z3, IMUser iMUser, Function1 function1);
}
