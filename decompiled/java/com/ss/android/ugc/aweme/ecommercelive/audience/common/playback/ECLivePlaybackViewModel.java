package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback;

import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C0CF8;
import X.C0PEM;
import X.C1018703yb;
import X.C1323750kYH;
import X.C1569940qxM;
import X.C1743880vTu;
import X.C1743900vTw;
import X.C1743920vTy;
import X.C1743940vU0;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C736820SvI;
import X.InterfaceC0148002o;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class ECLivePlaybackViewModel extends AssemViewModel<C1569940qxM> {
    public C1743880vTu LL;
    public final C1743900vTw LLILLJJLI;
    public final C23119094b LLILLL;
    public final C054G LLILZ;
    public boolean LLILZIL;
    public final C1743920vTy LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1569940qxM(0);
    }

    public final void wQ2() {
        if (this.LLILZLL.LIZ) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1743920vTy c1743920vTy = this.LLILZLL;
        linkedHashMap.put("media_type", "video");
        linkedHashMap.put("page_render_result", Integer.valueOf(this.LLILZLL.LIZIZ));
        String str = c1743920vTy.LIZJ;
        if (str != null) {
            linkedHashMap.put("rd_previous_page", str);
        }
        C0CF8.LIZ.getClass();
        linkedHashMap.put("devices_score", Float.valueOf(C0CF8.LIZ()));
        String str2 = c1743920vTy.LIZLLL;
        if (str2 != null) {
            linkedHashMap.put("error_domain", str2);
        }
        Integer num = c1743920vTy.LJ;
        if (num != null) {
            linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
        }
        String str3 = c1743920vTy.LJFF;
        if (str3 != null) {
            linkedHashMap.put("error_msg", str3);
        }
        String str4 = c1743920vTy.LJI;
        if (str4 != null) {
            linkedHashMap.put("content_id", str4);
        }
        linkedHashMap.put("network_type", C1323750kYH.LIZ());
        Long l = c1743920vTy.LJII;
        if (l != null) {
            linkedHashMap.put("t_router_start", Long.valueOf(l.longValue()));
        }
        Long l2 = c1743920vTy.LJIIIIZZ;
        if (l2 != null) {
            linkedHashMap.put("t_view_did_load_start", Long.valueOf(l2.longValue()));
        }
        Long l3 = c1743920vTy.LJIIIZ;
        if (l3 != null) {
            linkedHashMap.put("t_view_did_load_end", Long.valueOf(l3.longValue()));
        }
        Long l4 = c1743920vTy.LJIIJ;
        if (l4 != null) {
            linkedHashMap.put("t_parse_schema_start", Long.valueOf(l4.longValue()));
        }
        Long l5 = c1743920vTy.LJIIJJI;
        if (l5 != null) {
            linkedHashMap.put("t_parse_schema_end", Long.valueOf(l5.longValue()));
        }
        Long l6 = c1743920vTy.LJIIL;
        if (l6 != null) {
            linkedHashMap.put("t_net_start", Long.valueOf(l6.longValue()));
        }
        Long l7 = c1743920vTy.LJIILIIL;
        if (l7 != null) {
            linkedHashMap.put("t_net_async_end", Long.valueOf(l7.longValue()));
        }
        Long l8 = c1743920vTy.LJIILJJIL;
        if (l8 != null) {
            linkedHashMap.put("t_net_end", Long.valueOf(l8.longValue()));
        }
        Long l9 = c1743920vTy.LJIILL;
        if (l9 != null) {
            linkedHashMap.put("t_page_render_start", Long.valueOf(l9.longValue()));
        }
        Long l10 = c1743920vTy.LJIILLIIL;
        if (l10 != null) {
            linkedHashMap.put("t_media_play_start", Long.valueOf(l10.longValue()));
        }
        Long l11 = c1743920vTy.LJIIZILJ;
        if (l11 != null) {
            linkedHashMap.put("t_media_first_frame", Long.valueOf(l11.longValue()));
        }
        Long l12 = c1743920vTy.LJIJ;
        if (l12 != null) {
            linkedHashMap.put("t_page_invisible", Long.valueOf(l12.longValue()));
        }
        C1018703yb.LJ("tiktokec_rd_playback_page_render", linkedHashMap);
        this.LLILZLL.LIZ = true;
    }

    public ECLivePlaybackViewModel() {
        Object c098200Yq;
        try {
            c098200Yq = new C1743900vTw();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LLILLJJLI = (C1743900vTw) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LLILLL = c23119094bLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LLILZLL = new C1743920vTy();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.LLILLL.isActive()) {
            this.LLILLL.LIZIZ(null);
        }
    }

    public final void vQ2(Context context) {
        boolean z;
        C1743880vTu c1743880vTu = this.LL;
        if (c1743880vTu == null) {
            return;
        }
        if (c1743880vTu.LJFF == null) {
            z = true;
        } else {
            z = false;
        }
        String str = c1743880vTu.LIZ;
        String str2 = c1743880vTu.LIZIZ;
        String str3 = c1743880vTu.LIZJ;
        String str4 = c1743880vTu.LIZLLL;
        String str5 = c1743880vTu.LJ;
        String str6 = c1743880vTu.LJII;
        String str7 = c1743880vTu.LJIIJ;
        this.LLILZLL.LJIIL = Long.valueOf(System.currentTimeMillis());
        C23250099c.LIZLLL(this.LLILZ, null, null, new C1743940vU0(context, this, str, str2, str3, str4, str5, z, str6, str7, null), 3);
    }

    public final void xQ2(C2217381BqS c2217381BqS, LifecycleOwner lifecycleOwner, Function1 function1) {
        AssemViewModel.selectSubscribe$default(this, c2217381BqS, C736820SvI.LIZLLL(), lifecycleOwner, null, function1, 8, null);
    }
}
