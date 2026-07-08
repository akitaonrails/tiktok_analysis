package com.ss.android.ugc.aweme.service;

import X.C11JN;
import X.C11L6;
import X.C11NZ;
import X.C1612250s3b;
import X.C1612290s3f;
import X.C1612300s3g;
import X.C1612380s3o;
import X.DialogInterfaceOnDismissListenerC738790SyT;
import X.InterfaceC1364105Vn;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PineDramaMidInsertRequest;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface IPaidContentService {
    boolean LIZ(String str);

    void LIZIZ(String str);

    Object LIZJ(long j, C1612300s3g c1612300s3g);

    Object LIZLLL(long j, C1612290s3f c1612290s3f);

    C11NZ LJ(int i, long j, Long l);

    void LJFF(String str);

    Map<Long, CollectionDetailModel> LJI();

    void LJII(long j, boolean z);

    void LJIIIIZZ(String str);

    Object LJIIIZ(boolean z, Long l, long j, InterfaceC1364105Vn<? super PaidContentVideoListResponse> interfaceC1364105Vn);

    void LJIIJ();

    void LJIIJJI(long j);

    C11NZ<BaseResponse> LJIIL(String str);

    C11JN LJIILIIL(long j);

    Object LJIILJJIL(C1612380s3o c1612380s3o, Boolean bool, String str, String str2, List list, List list2, String str3, PineDramaMidInsertRequest pineDramaMidInsertRequest, C1612250s3b c1612250s3b);

    void LJIILL(String str, String str2, Aweme aweme, String str3, FragmentManager fragmentManager, DialogInterfaceOnDismissListenerC738790SyT dialogInterfaceOnDismissListenerC738790SyT);

    C11L6 LJIILLIIL(long j, String str);

    C11NZ<BaseResponse> LJIIZILJ(long j, long j2, float f, float f2, int i, int i2, boolean z);
}
