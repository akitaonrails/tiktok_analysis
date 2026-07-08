package com.ss.android.ugc.tools.chat.room.api;

import X.C0F1T;
import X.C18U5;
import X.C18WV;
import X.C443120HZe;
import X.InterfaceC21297418We;
import X.InterfaceC494301wD;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.als.LiveEvent;

/* JADX INFO: loaded from: classes33.dex */
public interface AiChatRoomFeatureApi extends C0F1T, InterfaceC494301wD, C18WV, C18U5, InterfaceC21297418We {
    @Override // X.InterfaceC21297418We
    /* synthetic */ boolean J7();

    LiveEvent<C443120HZe<Integer, Integer, Intent>> LLZIL();

    @Override // X.InterfaceC21297418We
    /* synthetic */ boolean M7(int i, Parcelable parcelable, boolean z);
}
