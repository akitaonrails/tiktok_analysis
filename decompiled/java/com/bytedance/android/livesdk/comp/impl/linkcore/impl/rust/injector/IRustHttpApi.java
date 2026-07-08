package com.bytedance.android.livesdk.comp.impl.linkcore.impl.rust.injector;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C926820aE4;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public interface IRustHttpApi {
    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<TypedInput>> post(@InterfaceC2174708fZ String str, @InterfaceC1485405rg TypedByteArray typedByteArray);

    @C09SO(EnumC1846380y9E.ROOM)
    @InterfaceC1501170pAR
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C926820aE4<TypedInput>> post(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, String> map2, @InterfaceC1485405rg TypedByteArray typedByteArray);
}
