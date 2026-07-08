package com.ss.android.ugc.aweme.im.service;

import X.C0Y8T;
import X.C0YA1;
import X.C0YA6;
import X.C869590Y9l;
import X.C876890Yad;
import X.InterfaceC876880Yac;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface IDmHelper {
    public static final C876890Yad LIZ = C876890Yad.LIZ;

    LastMessageProperty LIZ(C0Y8T c0y8t);

    void LIZIZ(List<C0Y8T> list);

    void LIZJ(String str);

    void LIZLLL(int i, C0YA6 c0ya6);

    void LJ(String str);

    String LJFF(C0Y8T c0y8t, LastMessageProperty lastMessageProperty);

    LastMessageProperty LJI(C0Y8T c0y8t);

    void LJII(IMUser iMUser);

    LastMessageProperty LJIIIIZZ(C0Y8T c0y8t);

    void LJIIIZ(String str, String str2, String str3, String str4);

    void LJIIJ(C869590Y9l c869590Y9l, Map<String, ? extends List<? extends C0YA1>> map, Map<String, ? extends List<? extends C0YA1>> map2);

    boolean LJIIJJI(C0Y8T c0y8t, LastMessageProperty lastMessageProperty);

    void LJIIL(String str, String str2, InterfaceC876880Yac interfaceC876880Yac);

    void LLILZ(C869590Y9l c869590Y9l);

    Gson getGson();
}
