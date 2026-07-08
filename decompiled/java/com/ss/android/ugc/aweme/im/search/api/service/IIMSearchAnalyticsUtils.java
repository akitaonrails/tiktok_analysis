package com.ss.android.ugc.aweme.im.search.api.service;

import X.C0Y8T;
import X.EnumC1240610iOB;
import X.EnumC1240620iOC;
import X.EnumC1240630iOD;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface IIMSearchAnalyticsUtils {
    void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4);

    void LIZIZ(EnumC1240630iOD enumC1240630iOD, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv);

    Map<String, String> LIZJ(EnumC1240630iOD enumC1240630iOD, Map<String, String> map);

    Map<String, String> LIZLLL(EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, IMUser iMUser, C0Y8T c0y8t, int i, int i2, boolean z, Integer num);

    Map<String, String> LJ(EnumC1240610iOB enumC1240610iOB, EnumC1240620iOC enumC1240620iOC, C0Y8T c0y8t, int i, int i2, boolean z);

    void LJFF(String str, String str2, String str3, String str4, Boolean bool, String str5, int i, InterfaceC1493105sv interfaceC1493105sv);
}
