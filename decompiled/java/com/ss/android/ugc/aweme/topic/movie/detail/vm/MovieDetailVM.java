package com.ss.android.ugc.aweme.topic.movie.detail.vm;

import X.C0O43;
import X.C0O44;
import X.C0O4K;
import X.C0O4L;
import X.C0O4M;
import X.C0PEM;
import X.C1DFB;
import X.C2296808zG;
import X.C23250099c;
import X.C613290O3r;
import X.C613340O3w;
import X.InterfaceC0148002o;
import X.InterfaceC346201Wa;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieDetailVM extends AssemViewModel<C0O43> implements FavoriteAbility {
    public String LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public C0O44 LLILZ;

    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void oD2() {
        String str;
        Boolean boolLIZIZ;
        InterfaceC346201Wa interfaceC346201WaLIZIZ;
        MovieDetail movieDetailLIZ = getState().LL.LIZ();
        if (movieDetailLIZ == null || (str = movieDetailLIZ.title) == null) {
            str = "";
        }
        C0O4K c0o4k = C0O4K.MOVIE;
        boolean zBooleanValue = (C0O4L.LIZIZ(c0o4k, vQ2()) == null || (boolLIZIZ = C0O4L.LIZIZ(c0o4k, vQ2())) == null) ? getState().LLILLJJLI : boolLIZIZ.booleanValue();
        if (zBooleanValue) {
            C613290O3r c613290O3r = MovieDetailApi.LIZ;
            String strVQ2 = vQ2();
            c613290O3r.getClass();
            interfaceC346201WaLIZIZ = C613290O3r.LIZIZ(strVQ2);
        } else {
            C613290O3r c613290O3r2 = MovieDetailApi.LIZ;
            String strVQ22 = vQ2();
            c613290O3r2.getClass();
            interfaceC346201WaLIZIZ = C613290O3r.LIZ(strVQ22);
        }
        C1DFB c1dfb = C0PEM.LIZJ;
        C23250099c.LIZLLL(C2296808zG.LIZ(c1dfb), c1dfb, null, new C613340O3w(interfaceC346201WaLIZIZ, this, zBooleanValue, str, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0O43(0);
    }

    public final String vQ2() {
        String str = this.LL;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0O4L.LIZJ(C0O4K.BOOK, this.LLILZ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0O44, X.0O4M] */
    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void H30(final Function1<? super Boolean, Unit> function1) {
        ?? r0 = new C0O4M() { // from class: X.0O44
            @Override // X.C0O4M
            public final void LIZ(String str, boolean z) {
                if (Intrinsics.LJFF(str, this.LIZ.vQ2())) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        };
        this.LLILZ = r0;
        C0O4K c0o4k = C0O4K.MOVIE;
        C0O4L.LIZ(c0o4k, r0);
        if (C0O4L.LIZIZ(c0o4k, vQ2()) == null) {
            function1.invoke(Boolean.valueOf(getState().LLILLJJLI));
            return;
        }
        Boolean boolLIZIZ = C0O4L.LIZIZ(c0o4k, vQ2());
        if (boolLIZIZ == null) {
            return;
        }
        function1.invoke(Boolean.valueOf(boolLIZIZ.booleanValue()));
    }
}
