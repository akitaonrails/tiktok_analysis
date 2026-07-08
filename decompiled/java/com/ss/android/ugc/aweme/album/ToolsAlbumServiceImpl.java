package com.ss.android.ugc.aweme.album;

import X.C0LAB;
import X.C1443560nfW;
import X.C1448620nng;
import X.C1449400now;
import X.C1449410nox;
import X.C566430MJl;
import X.C573790Mev;
import X.C575860MiG;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ToolsAlbumServiceImpl implements IToolsAlbumService {
    @Override // com.ss.android.ugc.aweme.album.IToolsAlbumService
    public final C566430MJl LIZ(C575860MiG c575860MiG) {
        return new C566430MJl(c575860MiG);
    }

    @Override // com.ss.android.ugc.aweme.album.IToolsAlbumService
    public final void LIZIZ(String str, String str2, String str3, String str4, String str5, Function1<? super C0LAB, Unit> function1) {
        String str6 = str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_entrance", str2);
        c0lab.LJ("enter_method", str4);
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        c0lab.LIZ(1, "is_upload_direct_enter");
        c0lab.LJ("content_source", "upload");
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        C1448620nng.LIZ(new C573790Mev(c0lab));
        if (Intrinsics.LJFF(str2, "fixed_shoot_cell")) {
            c0lab.LJ("friends_tab_version", "v3.0");
        }
        C1449400now c1449400now = C1449400now.LIZ;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        String str8 = C1443560nfW.LIZIZ;
        if (str8 != null) {
            str7 = str8;
        }
        c1449400now.LIZIZ(new C1449410nox(str6, str2, str3, str7, null, null, null, null, 240), c0lab, str5);
    }
}
