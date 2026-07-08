package com.ss.android.ugc.aweme.im.service.impl;

import X.C1389910mGz;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C624430OeP;
import X.C913310ZsH;
import X.C913400ZsQ;
import X.InterfaceC624460OeS;
import X.InterfaceC913320ZsI;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.ChatRoomToastAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class IMChatRoomOpenServiceImpl implements IIMChatRoomOpenService {
    public static final IMChatRoomOpenServiceImpl LIZ = new IMChatRoomOpenServiceImpl();
    public static final CopyOnWriteArrayList<InterfaceC624460OeS> LIZIZ = new CopyOnWriteArrayList<>();

    public static final class Service implements IIMChatRoomOpenService {
        public final /* synthetic */ IMChatRoomOpenServiceImpl LIZ = IMChatRoomOpenServiceImpl.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
        public final C1389910mGz LIZ(Fragment fragment) {
            return this.LIZ.LIZ(fragment);
        }

        @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
        public final void LIZIZ(C624430OeP c624430OeP) {
            this.LIZ.LIZIZ(c624430OeP);
        }

        @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
        public final void LIZLLL(InterfaceC624460OeS interfaceC624460OeS) {
            this.LIZ.LIZLLL(interfaceC624460OeS);
        }

        @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
        public final void LJ(InterfaceC624460OeS interfaceC624460OeS) {
            this.LIZ.LJ(interfaceC624460OeS);
        }

        @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
        public final Fragment LJFF(C19EG c19eg) {
            return this.LIZ.LJFF(c19eg);
        }

        @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
        public final void LIZJ() {
            this.LIZ.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
    public final void LIZJ() {
        C913400ZsQ c913400ZsQ = new InterfaceC913320ZsI() { // from class: X.0ZsQ
            @Override // X.InterfaceC913320ZsI
            public final void LIZ(int i, int i2, Intent intent, Fragment fragment) {
                if (fragment == null) {
                    return;
                }
                C633020OsG.LIZIZ.LJII(fragment.getActivity(), fragment, i, i2, intent, null);
            }
        };
        CopyOnWriteArrayList<InterfaceC913320ZsI> copyOnWriteArrayList = C913310ZsH.LIZ;
        if (copyOnWriteArrayList.contains(c913400ZsQ)) {
            return;
        }
        copyOnWriteArrayList.add(c913400ZsQ);
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
    public final C1389910mGz LIZ(Fragment fragment) {
        ChatRoomToastAbility chatRoomToastAbility = (ChatRoomToastAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), ChatRoomToastAbility.class, null);
        if (chatRoomToastAbility == null) {
            return null;
        }
        return chatRoomToastAbility.XP1();
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
    public final void LIZIZ(C624430OeP c624430OeP) {
        Iterator<InterfaceC624460OeS> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onEvent(c624430OeP);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
    public final void LIZLLL(InterfaceC624460OeS interfaceC624460OeS) {
        LIZIZ.add(interfaceC624460OeS);
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
    public final void LJ(InterfaceC624460OeS interfaceC624460OeS) {
        LIZIZ.remove(interfaceC624460OeS);
    }

    @Override // com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService
    public final Fragment LJFF(C19EG c19eg) {
        Object objLJIILLIIL;
        Fragment fragmentLJJJJZI;
        FragmentManager childFragmentManager;
        FragmentManager supportFragmentManager;
        if (c19eg != null) {
            objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
        } else {
            objLJIILLIIL = null;
        }
        if (objLJIILLIIL instanceof ChatRootFragment) {
            return (Fragment) objLJIILLIIL;
        }
        if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
            fragmentLJJJJZI = supportFragmentManager.LJJJJZI("quick_chat_sheet");
        } else {
            fragmentLJJJJZI = null;
        }
        if (!(fragmentLJJJJZI instanceof TuxSheet) || fragmentLJJJJZI == null || (childFragmentManager = fragmentLJJJJZI.getChildFragmentManager()) == null) {
            return null;
        }
        return childFragmentManager.LJJJJZI("sheet_content_fragment");
    }
}
