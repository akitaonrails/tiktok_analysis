package com.ss.android.ugc.aweme.im.prompts.api.chatnotice;

import X.C1632706aL;
import X.C1645106cL;
import X.C1690806ji;
import X.C1698906l1;
import X.C19EG;
import X.C913140Zs0;
import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.AwS368S0200000_2;

/* JADX INFO: loaded from: classes3.dex */
public interface IMChatNoticeHandlerFactory {
    public static final C1632706aL LIZ = C1632706aL.LIZ;

    C1698906l1 LIZ(C19EG c19eg, C913140Zs0 c913140Zs0, ViewGroup viewGroup);

    C1690806ji LIZIZ(Context context, boolean z, SessionInfo sessionInfo);

    C1645106cL LIZJ(ViewGroup viewGroup, SessionInfo sessionInfo, String str, AwS368S0200000_2 awS368S0200000_2, AwS368S0200000_2 awS368S0200000_22);
}
