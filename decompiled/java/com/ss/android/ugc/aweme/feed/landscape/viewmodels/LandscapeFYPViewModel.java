package com.ss.android.ugc.aweme.feed.landscape.viewmodels;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C054G;
import X.C0DMU;
import X.C0SXF;
import X.C1157130gDX;
import X.C1218140hnw;
import X.C1279404zY;
import X.C1697810uHb;
import X.C2189821An6;
import X.C452501pT;
import X.C5182020e;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC726620Seq;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class LandscapeFYPViewModel extends BaseDetailShareVM<C1218140hnw, C1279404zY, Long> implements InterfaceC726620Seq {
    public Aweme LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C5182020e(this, 122));
    public String LLIZ = "";
    public String LLIZLLLIL = "";
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(246));

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 26000;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1218140hnw(0);
    }

    @Override // X.InterfaceC726620Seq
    public final List<Aweme> p01() {
        withState(new AwS598S0100000_19(this, 157));
        Aweme aweme = this.LLILZIL;
        if (aweme == null) {
            return new ArrayList();
        }
        AwemeExtKt.appendMobParam(aweme, "landscape_screen_item_soure", "enter_group");
        return C1697810uHb.LJIILJJIL(aweme);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        Aweme aweme = this.LLILZIL;
        if (aweme != null) {
            listAddItem(new C1279404zY(aweme));
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1279404zY> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 158));
        setState(new AwS385S0200000_19((C627660Ojc) c627660Ojc, (C627660Ojc<C1279404zY>) this, (LandscapeFYPViewModel) 30));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        return onLoadMore(0L, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C1279404zY) it2.next()).LL.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C1279404zY) interfaceC1891350zJl).LL;
    }

    public final boolean BQ2(Aweme aweme, String str) throws JSONException {
        if (!C0SXF.LJJ(aweme)) {
            C054G c054g = C0DMU.LIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_id", str);
            jSONObject.put(Scene.SCENE_SERVICE, "landscape_inner_fyp");
            jSONObject.put("vid", aweme.getVideo().getVideoId());
            jSONObject.put("aweme_id", aweme.getAid());
            C0DMU.LIZIZ("landscape_feed_found_invalid_videos", jSONObject);
            return false;
        }
        if (((List) this.LLILZLL.getValue()).contains(aweme.getGroupId())) {
            C054G c054g2 = C0DMU.LIZ;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("request_id", str);
            jSONObject2.put(Scene.SCENE_SERVICE, "landscape_inner_fyp");
            jSONObject2.put("vid", aweme.getVideo().getVideoId());
            jSONObject2.put("aweme_id", aweme.getAid());
            C0DMU.LIZIZ("landscape_feed_found_duplicated_videos", jSONObject2);
            return false;
        }
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01a9: ARITH (r0 I:long) = (r0v3 ?? I:long) - (r4 I:long) (LINE:33554857), block:B:87:0x019b */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(long r16, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r18) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFYPViewModel.onLoadMore(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).longValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Long>>) interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return 0L;
    }
}
