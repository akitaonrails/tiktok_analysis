package com.ss.android.ugc.aweme.im.service;

import X.C1672806go;
import X.C1680206i0;
import X.C869590Y9l;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;

/* JADX INFO: loaded from: classes3.dex */
public interface IMessageViewHelper {
    public static final C1672806go LIZ = C1672806go.LIZ;

    C1680206i0 LIZ(int i, IMUser iMUser, String str, SessionInfo sessionInfo, C869590Y9l c869590Y9l);

    boolean LIZIZ(int i);

    void LIZJ(C869590Y9l c869590Y9l, SystemContent systemContent, SessionInfo sessionInfo);

    void LIZLLL(SystemContent systemContent, String str);

    IMUser LJ(C869590Y9l c869590Y9l);

    void LJFF(SystemContent.Key key, SessionInfo sessionInfo, C869590Y9l c869590Y9l);

    String LJI(C869590Y9l c869590Y9l);
}
