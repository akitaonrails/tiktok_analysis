package com.ss.android.ugc.aweme.ui.common;

import X.C0SBA;
import X.C0SM1;
import X.C1EE2;
import X.C721190SQr;
import X.C721790SSz;
import X.C738990Syn;
import X.EnumC721170SQp;
import X.InterfaceC0148002o;
import android.graphics.Bitmap;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoSharedViewModel extends AssemViewModel<InterfaceC0148002o> implements C0SM1 {
    public VideoItemParams LL;
    public Aweme LLILLJJLI;
    public Bitmap LLILLL;
    public SlidesImageLoadParams LLILZ;
    public PostModeDetailParams LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public PostModeEgressEtData LLIZLLLIL;
    public int LLJ;
    public float LLJI;
    public long LLJIJIL = -1;
    public EnumC721170SQp LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public C721790SSz LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public WeakReference<C0SBA> LLJJIJI;
    public C0SBA LLJJIJIIJIL;
    public Function0<Unit> LLJJIJIL;
    public Function0<Unit> LLJJJ;

    @Override // X.C0SM1
    public final void qO0() {
        this.LLILZ = null;
    }

    @Override // X.C0SM1
    public final void uQ1() {
        this.LLILLL = null;
    }

    @Override // X.C0SM1
    public final C0SBA Dk() {
        C0SBA c0sba;
        WeakReference<C0SBA> weakReference = this.LLJJIJI;
        return (weakReference == null || (c0sba = weakReference.get()) == null) ? this.LLJJIJIIJIL : c0sba;
    }

    @Override // X.C0SM1
    public final int NR() {
        return (C1EE2.LIZIZ.LIZLLL() && this.LLJJIII) ? 1 : 0;
    }

    @Override // X.C0SM1
    public final void ST() {
        Function0<Unit> function0 = this.LLJJJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C738990Syn(1);
    }

    public final void reset() {
        C721190SQr.LIZ.getClass();
        if (C1EE2.LIZIZ.LIZLLL()) {
            vQ2();
        }
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = null;
        this.LLJ = 0;
        this.LLJI = 0.0f;
        this.LLJILJIL = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJIJIL = -1L;
        this.LLJILJILJ = false;
    }

    public final void vQ2() {
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        if (c1ee2.LIZLLL()) {
            this.LLJJIII = false;
            c1ee2.LIZLLL();
            VideoItemParams videoItemParams = this.LL;
            if (videoItemParams != null) {
                videoItemParams.setIsEnterGraphicDetail(0);
            }
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        Bitmap bitmap;
        super.onCleared();
        reset();
        C721790SSz c721790SSz = this.LLJJ;
        if (c721790SSz != null && (bitmap = c721790SSz.LJ) != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        this.LLJJ = null;
    }

    @Override // X.C0SM1
    public final C721790SSz DK0() {
        return this.LLJJ;
    }

    @Override // X.C0SM1
    public final PostModeDetailParams H() {
        return this.LLILZIL;
    }

    @Override // X.C0SM1
    public final int Ve1() {
        return this.LLJ;
    }

    @Override // X.C0SM1
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.C0SM1
    public final Bitmap hC1() {
        return this.LLILLL;
    }

    @Override // X.C0SM1
    public final SlidesImageLoadParams j90() {
        return this.LLILZ;
    }

    @Override // X.C0SM1
    public final boolean jT0() {
        return this.LLJILLL;
    }

    @Override // X.C0SM1
    public final void D5(int i) {
        this.LLJ = i;
    }

    @Override // X.C0SM1
    public final void FT0(EnumC721170SQp enumC721170SQp) {
        this.LLJILJIL = enumC721170SQp;
    }

    @Override // X.C0SM1
    public final void cC1(boolean z) {
        this.LLJILJILJ = z;
    }

    @Override // X.C0SM1
    public final void da2(PostModeEgressEtData postModeEgressEtData) {
        this.LLIZLLLIL = postModeEgressEtData;
    }

    @Override // X.C0SM1
    public final void sG1(long j) {
        this.LLJIJIL = j;
    }

    @Override // X.C0SM1
    public final void st1(boolean z) {
        this.LLILZLL = z;
    }

    @Override // X.C0SM1
    public final void yx2(C721790SSz c721790SSz) {
        this.LLJJ = c721790SSz;
    }

    @Override // X.C0SM1
    public final void zz(boolean z) {
        this.LLIZ = z;
    }
}
