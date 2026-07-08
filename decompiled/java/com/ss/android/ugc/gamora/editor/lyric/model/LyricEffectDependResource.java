package com.ss.android.ugc.gamora.editor.lyric.model;

import X.C098200Yq;
import X.C09CT;
import X.C189200o6;
import X.C201955140j;
import X.C2188811AlT;
import X.C563650M8t;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LyricEffectDependResource {

    @C09CT("urs")
    public final String originResUrl;

    @C09CT("resource_id")
    public final String resourceId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LyricEffectDependResource)) {
            return false;
        }
        LyricEffectDependResource lyricEffectDependResource = (LyricEffectDependResource) obj;
        return Intrinsics.LJFF(this.originResUrl, lyricEffectDependResource.originResUrl) && Intrinsics.LJFF(this.resourceId, lyricEffectDependResource.resourceId);
    }

    public final int hashCode() {
        String str = this.originResUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resourceId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricEffectDependResource(originResUrl=");
        sbLIZ.append(this.originResUrl);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            String str = this.originResUrl;
            if (str == null) {
                str = "";
            }
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUri failed e:");
            sbLIZ.append(Unit.LIZ);
            C201955140j.LJIJI(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return null;
        }
        try {
            c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "panel");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        return (String) (C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2);
    }

    public LyricEffectDependResource(String str, String str2) {
        this.originResUrl = str;
        this.resourceId = str2;
    }
}
