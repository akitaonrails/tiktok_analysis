package com.bytedance.android.message;

import X.AbstractC1136060ffY;
import X.C006A;
import X.C0IGS;
import X.C1101180elI;
import X.C1115790f8r;
import X.EnumC19379710rr;
import X.InterfaceC1100800ekg;
import X.InterfaceC1115810f8t;
import X.InterfaceC1132950faX;
import android.content.Context;
import com.ss.ugc.live.sdk.message.MessageFeatureControl;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public interface IMessageService extends C006A {
    public static final C1115790f8r Companion = new Object() { // from class: X.0f8r
    };

    void addMessageInterceptor(IInterceptor iInterceptor);

    void addMessageInterceptorFunc(Function0<? extends InterfaceC1132950faX> function0);

    void addOnMessageParsedListener(InterfaceC1115810f8t interfaceC1115810f8t);

    <T> T create(Class<T> cls);

    MessageFeatureControl featureControl();

    IMessageManager get(long j);

    IMessageManager get(Context context, long j, long j2);

    Class<? extends AbstractC1136060ffY> getMessageClass(String str);

    C0IGS getMessageTimeTracker();

    C1101180elI getPerfMetricScoreResult();

    IMessageManager getReuse();

    void initZstdCompressResourceWhenLivePlay();

    void initZstdCompressResourceWhenSDKStart();

    void keepPerfMetricForReport(InterfaceC1100800ekg interfaceC1100800ekg);

    IMessageManager messageManagerProvider(long j, boolean z, Context context);

    IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2);

    IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2, boolean z3, EnumC19379710rr enumC19379710rr, boolean z4);

    IMessageManager messageManagerProvider(long j, boolean z, boolean z2, Context context);

    void notifyOnMessage(IMessage iMessage);

    /* bridge */ /* synthetic */ void onInit();

    void preloadClass();

    EventListener provideEventListener();

    void release(long j);

    void releaseAll();

    void removeMessageInterceptor(IInterceptor iInterceptor);

    void removeOnMessageParsedListener(InterfaceC1115810f8t interfaceC1115810f8t);

    void retryReleaseAll();

    void updateRoomInfo(long j, Context context);

    void updateRoomInfo(IMessageManager iMessageManager, long j, Context context);
}
