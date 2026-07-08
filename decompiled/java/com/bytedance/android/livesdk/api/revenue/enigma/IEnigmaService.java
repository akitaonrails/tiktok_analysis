package com.bytedance.android.livesdk.api.revenue.enigma;

import X.C006A;
import X.C0KZU;
import X.C1150560g2w;
import X.C520860Kbk;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.impl.revenue.enigma.widget.EnigmaWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS582S0100000_3;
import tikcast.api.privilege.enigma.EnigmaPurchaseRequest;
import tikcast.api.privilege.enigma.EnigmaWhisperRequest;

/* JADX INFO: loaded from: classes8.dex */
public interface IEnigmaService extends C006A {
    void Bl2(String str);

    C520860Kbk HU(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TextView textView);

    void NN1(String str, AwS428S0200000_27 awS428S0200000_27, AwS582S0100000_3 awS582S0100000_3);

    void V00(Bundle bundle, FragmentManager fragmentManager);

    void XD0(Context context);

    void bs2(String str);

    void fG(EnigmaPurchaseRequest enigmaPurchaseRequest, C1150560g2w c1150560g2w);

    void ia2(Room room, long j, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, DataChannel dataChannel);

    EnigmaWidget nX1();

    void vY1(EnigmaWhisperRequest enigmaWhisperRequest, C0KZU c0kzu, int i);
}
