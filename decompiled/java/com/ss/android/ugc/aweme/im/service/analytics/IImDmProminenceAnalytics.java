package com.ss.android.ugc.aweme.im.service.analytics;

import X.C1673406gu;
import X.InterfaceC1490905sZ;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: loaded from: classes3.dex */
public interface IImDmProminenceAnalytics {
    public static final C1673406gu LIZ = C1673406gu.LIZ;

    String LIZ(String str);

    void LIZIZ(InterfaceC1490905sZ<?> interfaceC1490905sZ, String str, IMUser iMUser, String str2, InterfaceC1493105sv interfaceC1493105sv);

    void LIZJ(IMUser iMUser, InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3);

    void LIZLLL(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str);

    void LJ(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv);

    void LJFF(Integer num, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str, String str2, String str3, boolean z2, IMUser iMUser);

    void LJI(SessionInfo sessionInfo, String str, String str2, InterfaceC1493105sv interfaceC1493105sv);

    void LJII(InterfaceC1493105sv interfaceC1493105sv, boolean z, String str, String str2, String str3, boolean z2, IMUser iMUser);
}
