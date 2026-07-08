package com.bytedance.android.livesdk.comp.api.debug;

import X.C006A;
import X.EnumC498960JhW;
import X.InterfaceC1095340ebs;
import X.InterfaceC1100860ekm;
import X.InterfaceC1100870ekn;
import X.InterfaceC1125460fOS;
import X.InterfaceC499240Jhy;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pitaya.api.IPitayaCore;
import debugtool.DebugToolsHelper;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public interface IDebugService extends C006A {
    InterfaceC1095340ebs Az1();

    void Bj2(DataChannel dataChannel);

    InterfaceC499240Jhy Hi();

    void PP2(InterfaceC1125460fOS interfaceC1125460fOS, Context context, DataChannel dataChannel);

    InterfaceC1100860ekm Sg();

    void aq();

    DebugToolsHelper fW1(Context context, DataChannel dataChannel, EnumC498960JhW enumC498960JhW);

    Object hJ0(IPitayaCore iPitayaCore, Method method, Object[] objArr);

    Function0<Unit> ho();

    void onDestroy();

    void yX1(InterfaceC1100870ekn interfaceC1100870ekn);
}
