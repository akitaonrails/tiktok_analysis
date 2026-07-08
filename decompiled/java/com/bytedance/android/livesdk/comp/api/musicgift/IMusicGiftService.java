package com.bytedance.android.livesdk.comp.api.musicgift;

import X.C006A;
import X.C0J3H;
import X.C1142060fpE;
import X.C1142100fpI;
import X.C1143590frh;
import X.C1147020fxE;
import X.InterfaceC1147150fxR;
import X.InterfaceC1147550fy5;
import X.InterfaceC1364105Vn;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public interface IMusicGiftService extends C006A {
    void HB2(C1142060fpE c1142060fpE);

    boolean HJ0(C1147020fxE c1147020fxE, DataChannel dataChannel);

    void Hk0(C1143590frh c1143590frh);

    List<Gift> Jj1();

    void MN1(InterfaceC1147150fxR interfaceC1147150fxR);

    void QY(List<? extends Gift> list);

    boolean Sd2(long j, long j2, DataChannel dataChannel);

    void UU0();

    Object WO(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    void XL2(List<? extends Gift> list);

    InterfaceC1147550fy5 b20();

    void f91(List<? extends Gift> list, Map<Long, MusicGiftMood> map);

    void fJ1(C1142100fpI c1142100fpI);

    Gift findGiftById(long j);

    C1143590frh h01();

    C1142100fpI j62();

    C0J3H lT0();

    void py1(List<Long> list);

    void s50(InterfaceC1147150fxR interfaceC1147150fxR);

    Map<Long, MusicGiftMood> t40();

    List<Long> th0();
}
