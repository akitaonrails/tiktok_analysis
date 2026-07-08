package com.ss.android.ugc.aweme.utils;

import X.AbstractC738140SxQ;
import X.C13IQ;
import X.C1619106Vp;
import X.C1619206Vq;
import X.InterfaceC1364105Vn;
import X.InterfaceC2257971DZj;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public interface IChatCustomizeHelper {
    public static final C1619106Vp LIZ = C1619106Vp.LIZ;

    void bindWheeUnlockPanelRefreshCallback(Function1<? super String, Unit> function1);

    boolean canShowNewLabel();

    void cancelJobOnLogout();

    ByteString createPersistentExtra(ByteString byteString, boolean z);

    C13IQ<? extends AbstractC738140SxQ> getInboxMessageBubbleUpdateAssem();

    View getNewLabelImageView(Context context);

    MessageBubbleStyle getUserCurrentBubbleStyle();

    boolean isCustomizationTabEnabled();

    boolean isShowCustomizationLegacyNewLabel();

    boolean isShowLabelOnLastMessage();

    boolean isSupportCustomization();

    boolean isSupportShowCustomization();

    void markLabelOnLastMessageShown();

    void onChatroomExit(String str);

    void onWheeDiversionUnlockRefreshed(C1619206Vq c1619206Vq);

    void openCustomizeFragment(String str, boolean z, InterfaceC2257971DZj interfaceC2257971DZj, boolean z2, String str2);

    void openCustomizeFragment(String str, boolean z, String str2, boolean z2, String str3);

    List<String> peekUnlockedBubbleIdsMemorySnapshotOrNull();

    Object prepareCache(Context context, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void refreshDataOnLogin(boolean z);

    void showTooltipGuide(View view);

    void syncUnlockedBubbleIdsFromBizInfo(List<String> list);

    void updateUserBubbleStyleAfterSaving(MessageBubbleStyle messageBubbleStyle);

    Object updateUserBubbleStyleAndCheckExpiry(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void updateUserBubbleStyleFromId(long j, long j2);
}
