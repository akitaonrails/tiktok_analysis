package com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel;

import X.C0PVB;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C19EG;
import X.C2786016a;
import X.InterfaceC2753014t;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect.QueryCorrectComponentInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.correct.core.viewmodel.QueryCorrectHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class QueryCorrectHelper {
    public static final Map<LifecycleOwner, QueryCorrectHelper> LJ = new LinkedHashMap();
    public QueryCorrectComponentInfo LIZ;
    public C0PVB LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    public static final class Companion {
        public static QueryCorrectHelper LIZ(LifecycleOwner lifecycleOwner) {
            Map<LifecycleOwner, QueryCorrectHelper> map = QueryCorrectHelper.LJ;
            QueryCorrectHelper queryCorrectHelper = (QueryCorrectHelper) ((LinkedHashMap) map).get(lifecycleOwner);
            if (queryCorrectHelper == null) {
                QueryCorrectHelper queryCorrectHelper2 = new QueryCorrectHelper();
                map.put(lifecycleOwner, queryCorrectHelper2);
                lifecycleOwner.getLifecycle().addObserver(new QueryCorrectHelper$Companion$get$1(lifecycleOwner));
                return queryCorrectHelper2;
            }
            return queryCorrectHelper;
        }
    }

    public final void LIZ(View view, C0PVB c0pvb, LifecycleOwner lifecycleOwner) {
        this.LIZJ = view;
        this.LIZIZ = c0pvb;
        if (lifecycleOwner instanceof C19EG) {
            C1554960qZC.LIZ(C1558360qeg.LJI((C19EG) lifecycleOwner, null), new InterfaceC2753014t(this) { // from class: X.016a
                public final QueryCorrectHelper LL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2786016a) && Intrinsics.LJFF(this.LL, ((C2786016a) obj).LL);
                }

                public final int hashCode() {
                    return this.LL.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("QueryCorrectHelperSource(queryCorrectHelper=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LL = this;
                    UUID.randomUUID().toString();
                }
            }, C2786016a.class, "source_default_key");
        } else {
            if (!(lifecycleOwner instanceof Fragment)) {
                return;
            }
            C1554960qZC.LIZ(C1558360qeg.LJFF((Fragment) lifecycleOwner, null), new InterfaceC2753014t(this) { // from class: X.016a
                public final QueryCorrectHelper LL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2786016a) && Intrinsics.LJFF(this.LL, ((C2786016a) obj).LL);
                }

                public final int hashCode() {
                    return this.LL.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("QueryCorrectHelperSource(queryCorrectHelper=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LL = this;
                    UUID.randomUUID().toString();
                }
            }, C2786016a.class, "source_default_key");
        }
    }
}
