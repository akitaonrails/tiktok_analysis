package com.ss.android.ugc.aweme.feed.mob;

import X.C017B;
import X.C651970Phj;
import X.C651980Phk;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SearchETParamsProvider implements ETParamsProvider<C017B> {
    public static C017B LIZ() {
        C651970Phj.LLILLL.getClass();
        Map mapLIZJ = C651980Phk.LIZJ();
        String str = (String) mapLIZJ.get("search_keyword");
        if (str == null) {
            str = "";
        }
        String str2 = (String) mapLIZJ.get("search_id");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) mapLIZJ.get("search_type");
        return new C017B(str, str2, str3 != null ? str3 : "");
    }

    @Override // com.ss.android.tracker.event.EventParamsProtocol
    public final InterfaceC1282004zy getParam() {
        if (!lt2(C017B.class)) {
            return null;
        }
        C651970Phj.LLILLL.getClass();
        if (C651980Phk.LIZJ().isEmpty()) {
            return null;
        }
        return LIZ();
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final /* bridge */ /* synthetic */ InterfaceC0241006d Mb0() {
        return LIZ();
    }

    @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
    public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
        return Intrinsics.LJFF(cls, C017B.class);
    }
}
