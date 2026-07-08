package com.ss.android.ugc.aweme.dummyspi;

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
import com.ss.android.ugc.aweme.vision.IPhotoSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class DummyPhotoSearchService implements IPhotoSearchService {
    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LIZ(Context context, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final C13IQ<? extends AbstractC738140SxQ> LIZIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final String LIZJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final PowerViewPagerFragmentItem<?> LIZLLL(PhotoSearchEnterParams photoSearchEnterParams, Fragment fragment, C19EG c19eg, C1361400lX0 c1361400lX0) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final InterfaceC1594550rb3 LJ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final TuxIconView LJFF(View view) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LJI(Context context, C0QL2 c0ql2, InterfaceC676430Qg5 interfaceC676430Qg5, Function0 function0) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LJII(Context context, InterfaceC676430Qg5 interfaceC676430Qg5) {
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LJIIIIZZ(View view) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LJIIIZ(Context context, PhotoSearchEnterParams photoSearchEnterParams, Bitmap bitmap, SearchResultParam searchResultParam, Bitmap bitmap2) {
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LJIIJ(PhotoSearchEnterParams photoSearchEnterParams) {
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final C0QM4 LJIIJJI(SearchResultFragmentNew searchResultFragmentNew) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View LJIIL(View view) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final InterfaceC676400Qg2 LJIILIIL(Fragment fragment, C19EG c19eg) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final void LJIILJJIL(Context context, Uri uri) {
    }

    @Override // com.ss.android.ugc.aweme.vision.IPhotoSearchService
    public final View getSimilarPhotoSearchView(Context context) {
        return new View(context);
    }
}
