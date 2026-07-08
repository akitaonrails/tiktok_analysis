package com.ss.android.ugc.aweme.vision;

import X.AbstractC738140SxQ;
import X.C0QL2;
import X.C0QM4;
import X.C1361400lX0;
import X.C13IQ;
import X.C19EG;
import X.InterfaceC1594550rb3;
import X.InterfaceC676400Qg2;
import X.InterfaceC676430Qg5;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentNew;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public interface IPhotoSearchService {
    void LIZ(Context context, Intent intent);

    C13IQ<? extends AbstractC738140SxQ> LIZIZ();

    String LIZJ();

    PowerViewPagerFragmentItem<?> LIZLLL(PhotoSearchEnterParams photoSearchEnterParams, Fragment fragment, C19EG c19eg, C1361400lX0 c1361400lX0);

    InterfaceC1594550rb3 LJ();

    TuxIconView LJFF(View view);

    View LJI(Context context, C0QL2 c0ql2, InterfaceC676430Qg5 interfaceC676430Qg5, Function0 function0);

    void LJII(Context context, InterfaceC676430Qg5 interfaceC676430Qg5);

    View LJIIIIZZ(View view);

    void LJIIIZ(Context context, PhotoSearchEnterParams photoSearchEnterParams, Bitmap bitmap, SearchResultParam searchResultParam, Bitmap bitmap2);

    void LJIIJ(PhotoSearchEnterParams photoSearchEnterParams);

    C0QM4 LJIIJJI(SearchResultFragmentNew searchResultFragmentNew);

    View LJIIL(View view);

    InterfaceC676400Qg2 LJIILIIL(Fragment fragment, C19EG c19eg);

    void LJIILJJIL(Context context, Uri uri);

    View getSimilarPhotoSearchView(Context context);
}
