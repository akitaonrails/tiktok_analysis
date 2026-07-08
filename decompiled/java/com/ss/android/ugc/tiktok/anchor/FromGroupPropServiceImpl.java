package com.ss.android.ugc.tiktok.anchor;

import X.C08IN;
import X.C1D0O;
import X.C1D0P;
import android.util.LruCache;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: loaded from: classes35.dex */
public final class FromGroupPropServiceImpl implements FromGroupPropService {
    public final Function0<String> LIZ = AFwS218S0000000_29.get$arr$(347);
    public final LruCache<String, C1D0O> LIZIZ = C08IN.LIZ();

    @Override // com.ss.android.ugc.aweme.shortvideo.FromGroupPropService
    public final String LIZIZ() {
        C1D0P c1d0p;
        String str;
        C1D0O c1d0o = this.LIZIZ.get(this.LIZ.invoke());
        return (c1d0o == null || (c1d0p = c1d0o.LIZJ) == null || (str = c1d0p.LIZ) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.FromGroupPropService
    public final String LIZJ() {
        String str;
        C1D0O c1d0o = this.LIZIZ.get(this.LIZ.invoke());
        return (c1d0o == null || (str = c1d0o.LIZ) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.FromGroupPropService
    public final String LIZLLL() {
        String str;
        C1D0O c1d0o = this.LIZIZ.get(this.LIZ.invoke());
        return (c1d0o == null || (str = c1d0o.LIZIZ) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.FromGroupPropService
    public final String LJ() {
        C1D0P c1d0p;
        String str;
        C1D0O c1d0o = this.LIZIZ.get(this.LIZ.invoke());
        return (c1d0o == null || (c1d0p = c1d0o.LIZJ) == null || (str = c1d0p.LIZIZ) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.FromGroupPropService
    public final void LIZ(String str, String str2, String str3, String str4, String str5) {
        this.LIZIZ.put(str, new C1D0O(str2, str3, new C1D0P(str4, str5)));
    }
}
