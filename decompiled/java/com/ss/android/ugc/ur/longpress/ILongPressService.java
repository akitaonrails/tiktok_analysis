package com.ss.android.ugc.ur.longpress;

import X.AbstractC737180Svs;
import X.C0HTT;
import X.C19742912Mh;
import X.C19EG;
import X.C735210Ssh;
import X.C737030Svd;
import X.InterfaceC1259330isN;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface ILongPressService {
    void LLLLLZL(MotionEvent motionEvent);

    InterfaceC1259330isN LLLLZ(View view, C19EG c19eg, Fragment fragment, Bundle bundle, AwemeRouteDetailPageParams awemeRouteDetailPageParams, C19742912Mh c19742912Mh);

    void LLLLZI(Context context, View view);

    List<AbstractC737180Svs> LLLLZIL(C735210Ssh c735210Ssh, C0HTT<C737030Svd> c0htt);
}
