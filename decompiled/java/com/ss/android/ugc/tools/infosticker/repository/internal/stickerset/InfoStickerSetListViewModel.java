package com.ss.android.ugc.tools.infosticker.repository.internal.stickerset;

import X.AbstractC1634360sdG;
import X.AbstractC19484711Kz;
import X.C01GW;
import X.C11S5;
import X.C1431920nMk;
import X.C1465200oEQ;
import X.C1634340sdE;
import X.C1634630sdh;
import X.C1634670sdl;
import X.C1634690sdn;
import X.C1637890six;
import X.C1701940uOG;
import X.C201955140j;
import X.C2188811AlT;
import X.C452501pT;
import X.C543670LTx;
import X.EnumC1641470soj;
import X.InterfaceC1633960scc;
import X.InterfaceC300801Eo;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelApi;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerSetListViewModel extends BaseInfoStickerListViewModel<StickerSetCategory> {
    public final InterfaceC1633960scc LLILZIL;
    public final String LLILZLL;
    public final C01GW LLIZ;
    public int LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void se2() {
        if (this.LLJI) {
            EnumC1641470soj value = this.LLILLJJLI.getValue();
            if (value == null || value == EnumC1641470soj.NONE) {
                List list = (List) this.LL.getValue();
                if (list == null || !list.isEmpty()) {
                    EnumC1641470soj value2 = this.LLILLL.getValue();
                    if (value2 == null || !(value2 == EnumC1641470soj.EMPTY || value2 == EnumC1641470soj.LOADING)) {
                        this.LLILLL.setValue(EnumC1641470soj.LOADING);
                        C1431920nMk c1431920nMk = (C1431920nMk) this.LLIZ.getValue();
                        vQ2().LIZ(((InfoStickerPanelApi) c1431920nMk.LIZ.getValue()).getStickerSetCategoryList(this.LLIZLLLIL, this.LLJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 110), new AfS194S0100000_25(this, 111)));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<StickerSetCategory>> wQ2() {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sdi
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<List<StickerSetCategory>> interfaceC2329309At) {
            }
        });
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<StickerSetCategory>> xQ2() {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sdj
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<List<StickerSetCategory>> interfaceC2329309At) {
            }
        });
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void X1() {
        C1634670sdl c1634670sdl;
        C1634670sdl c1634670sdl2;
        List<StickerSetCategory> list;
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            if (((List) this.LL.getValue()) == null || !(!r0.isEmpty())) {
                C1634630sdh c1634630sdh = C1634630sdh.LIZ;
                String str = this.LLILZLL;
                c1634630sdh.getClass();
                if (!C1634690sdn.LIZ() || !Intrinsics.LJFF(str, C1634630sdh.LIZIZ) || (((c1634670sdl = C1634630sdh.LIZLLL) != null && ((list = c1634670sdl.LIZJ) == null || list.isEmpty())) || (c1634670sdl2 = C1634630sdh.LIZLLL) == null)) {
                    this.LLILLJJLI.setValue(EnumC1641470soj.LOADING);
                    vQ2().LIZ(((InfoStickerPanelApi) ((C1431920nMk) this.LLIZ.getValue()).LIZ.getValue()).getStickerSetCategoryList(this.LLIZLLLIL, this.LLJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS194S0100000_25(this, 108), new AfS194S0100000_25(this, 109)));
                    return;
                }
                this.LLIZLLLIL = c1634670sdl2.LIZ;
                this.LL.setValue((List<DATA>) c1634670sdl2.LIZJ);
                this.LLJI = c1634670sdl2.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("custom_sticker_upload : use sticker set category list cache, size = ");
                List<StickerSetCategory> list2 = c1634670sdl2.LIZJ;
                sbLIZ.append(list2 != null ? Integer.valueOf(list2.size()) : null);
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void Px2(AbstractC1634360sdG abstractC1634360sdG) {
        if (abstractC1634360sdG instanceof C1634340sdE) {
            X1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ2(com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerSetListResp r7, boolean r8) {
        /*
            r6 = this;
            r2 = 0
            if (r7 == 0) goto L63
            int r0 = r7.nextCursor
        L5:
            r6.LLIZLLLIL = r0
            if (r7 == 0) goto L61
            boolean r0 = r7.hasMore
        Lb:
            r6.LLJI = r0
            r1 = -1
            java.lang.String r0 = ""
            r6.yQ2(r2, r1, r0, r8)
            if (r7 == 0) goto L5b
            int r4 = r6.LLIZLLLIL
            boolean r3 = r6.LLJI
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory> r5 = r7.setList
            X.0sdh r0 = X.C1634630sdh.LIZ
            java.lang.String r2 = r6.LLILZLL
            r0.getClass()
            boolean r0 = X.C1634690sdn.LIZ()
            if (r0 == 0) goto L5b
            if (r2 == 0) goto L5b
            java.lang.String r0 = X.C1634630sdh.LIZIZ
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            r0 = 0
            if (r1 != 0) goto L3b
            X.C1634630sdh.LIZJ = r0
            X.C1634630sdh.LIZLLL = r0
            X.C1634630sdh.LJ = r0
            X.C1634630sdh.LIZIZ = r2
        L3b:
            X.0sdl r0 = X.C1634630sdh.LIZLLL
            if (r0 == 0) goto L4f
            r0.LIZ = r4
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory> r0 = r0.LIZJ
            if (r0 == 0) goto L4f
            boolean r0 = r0.addAll(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L5b
        L4f:
            X.0sdl r1 = new X.0sdl
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r1.<init>(r4, r3, r0)
            X.C1634630sdh.LIZLLL = r1
        L5b:
            java.lang.String r0 = "custom_sticker_upload : success to get sticker set category list"
            X.C201955140j.LJIIL(r0)
            return
        L61:
            r0 = 0
            goto Lb
        L63:
            r0 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetListViewModel.AQ2(com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerSetListResp, boolean):void");
    }

    public InfoStickerSetListViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc, String str) {
        super(c1465200oEQ);
        this.LLILZIL = interfaceC1633960scc;
        this.LLILZLL = str;
        this.LLIZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(396));
        this.LLJ = 30;
    }

    public final void zQ2(int i, String str, boolean z) {
        yQ2(1, i, str, z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("custom_sticker_upload : fail to get sticker set category list, code = ");
        sbLIZ.append(i);
        sbLIZ.append(", message = ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void yQ2(int i, int i2, String str, boolean z) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("load_more", Boolean.valueOf(z));
        c543670LTx.LIZ.put("has_more", Boolean.valueOf(this.LLJI));
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        if (i == 1) {
            c543670LTx.LIZ.put("error_desc", str);
            c543670LTx.LIZIZ(Integer.valueOf(i2), "error_code");
        }
        C1637890six.LJ("video_edit_sticker_panel_set_categories", i, c543670LTx.LJ());
    }
}
