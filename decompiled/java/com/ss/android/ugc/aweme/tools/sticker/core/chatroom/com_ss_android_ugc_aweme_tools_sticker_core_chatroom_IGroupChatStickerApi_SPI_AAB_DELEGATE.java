package com.ss.android.ugc.aweme.tools.sticker.core.chatroom;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate;
import com.ss.android.ugc.aweme.im.saas.host.impl.im.sticker.GroupChatStickerServiceImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class com_ss_android_ugc_aweme_tools_sticker_core_chatroom_IGroupChatStickerApi_SPI_AAB_DELEGATE implements IAabDelegate {
    public static final com_ss_android_ugc_aweme_tools_sticker_core_chatroom_IGroupChatStickerApi_SPI_AAB_DELEGATE INSTANCE = new com_ss_android_ugc_aweme_tools_sticker_core_chatroom_IGroupChatStickerApi_SPI_AAB_DELEGATE();
    public static final C01GW GroupChatStickerServiceImplinstance$delegate = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS187S0000000_2.get$arr$(703));
    public static final int $stable = 8;

    private final GroupChatStickerServiceImpl getGroupChatStickerServiceImplinstance() {
        return (GroupChatStickerServiceImpl) GroupChatStickerServiceImplinstance$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public ArrayList<IGroupChatStickerApi> getServices() {
        ArrayList<IGroupChatStickerApi> arrayList = new ArrayList<>();
        arrayList.add(getGroupChatStickerServiceImplinstance());
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.annotation.IAabDelegate
    public IGroupChatStickerApi getService() {
        return getGroupChatStickerServiceImplinstance();
    }
}
