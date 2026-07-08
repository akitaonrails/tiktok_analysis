package com.ss.android.ugc.aweme.ecommerce.service;

import X.C1038610d8N;
import X.C19512111Vn;
import X.C20739116Dl;
import X.InterfaceC1350220lEy;
import X.InterfaceC1752840viM;
import X.InterfaceC1757230vpR;
import X.InterfaceC19511711Vj;
import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public interface IECommerceVideoService {
    boolean LIZ(Aweme aweme);

    InterfaceC1350220lEy LIZIZ();

    void LIZJ(View view, InterfaceC1752840viM interfaceC1752840viM, String str);

    boolean LIZLLL(String str);

    boolean LJ();

    void LJFF(View view, ViewGroup viewGroup, String str);

    void LJI(Fragment fragment, LifecycleOwner lifecycleOwner, List list, C19512111Vn c19512111Vn);

    void LJII(Activity activity, Uri uri, String str, String str2, String str3, boolean z);

    boolean LJIIIIZZ();

    boolean LJIIIZ();

    InterfaceC19511711Vj LJIIJ();

    InterfaceC1757230vpR LJIIJJI(Fragment fragment, FrameLayout frameLayout, C20739116Dl c20739116Dl, boolean z, C1038610d8N c1038610d8N);
}
