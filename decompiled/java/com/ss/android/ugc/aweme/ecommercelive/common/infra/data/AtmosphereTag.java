package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import X.C184F;
import X.C184G;
import X.C184H;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class AtmosphereTag extends C184F {
    public long LIZIZ;
    public int LIZJ;
    public FlashSaleAtmosphereStock LIZLLL;
    public FlashSaleAtmosphere LJ;
    public Long LJFF;
    public int LJI;

    @C09CT("count")
    public long count;

    @C09CT("tag_type")
    public int tagType;

    @C09CT("tag_desc")
    public String tagDesc = "";
    public String LJII = "";

    @Override // X.C184F
    public final String LIZIZ() {
        return null;
    }

    @Override // X.C184F
    public final int LIZJ() {
        C184H c184h = C184G.LJII;
        int i = this.tagType;
        c184h.getClass();
        return C184H.LIZ(i);
    }

    public final int hashCode() {
        return (((((this.LJII.hashCode() * 31) + this.tagDesc.hashCode()) * 31) + this.tagType) * 31) + ((int) this.count);
    }

    @Override // X.C184F
    public final long LIZ() {
        return this.count;
    }

    @Override // X.C184F
    public final int LIZLLL() {
        return this.tagType;
    }

    public final void LJ(String str) {
        this.tagDesc = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AtmosphereTag)) {
            return false;
        }
        AtmosphereTag atmosphereTag = (AtmosphereTag) obj;
        if (this.tagType != atmosphereTag.tagType || !Intrinsics.LJFF(this.tagDesc, atmosphereTag.tagDesc) || this.count != atmosphereTag.count || !Intrinsics.LJFF(this.LJII, atmosphereTag.LJII)) {
            return false;
        }
        return true;
    }
}
