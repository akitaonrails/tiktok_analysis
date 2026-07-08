package com.ss.android.ugc.tools.infosticker.repository.internal.stickerset;

import X.AbstractC19484711Kz;
import X.C01GW;
import X.C09JN;
import X.C11NZ;
import X.C11S5;
import X.C1431920nMk;
import X.C1465200oEQ;
import X.C1637890six;
import X.C1701940uOG;
import X.C452501pT;
import X.C543670LTx;
import X.EnumC1641470soj;
import X.InterfaceC1633960scc;
import X.InterfaceC300801Eo;
import Y.AfS194S0100000_25;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerPanelApi;
import com.ss.android.ugc.tools.infosticker.repository.internal.repository.StickerSetDetailResp;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerSetDetailListViewModel extends BaseInfoStickerListViewModel<Effect> {
    public final InterfaceC1633960scc LLILZIL;
    public final C01GW LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public final List<StickerSetDetailResp> LLJI;

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void se2() {
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void LLIZLLLIL() {
        this.LL.setValue(null);
        this.LLILLJJLI.setValue(EnumC1641470soj.NONE);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> wQ2() {
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0sdV
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<List<Effect>> interfaceC2329309At) {
            }
        });
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
    public final AbstractC19484711Kz<List<Effect>> xQ2() throws NoSuchMethodException {
        throw new NoSuchMethodException("IM sticker set detail list does not support load more action.");
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void X1() {
        C11NZ c11nzLJL;
        List<StickerSetDetailResp> list;
        if (isDestroyed()) {
            return;
        }
        EnumC1641470soj value = this.LLILLJJLI.getValue();
        final boolean z = true;
        if (value == null || !(value == EnumC1641470soj.EMPTY || value == EnumC1641470soj.LOADING)) {
            if (((List) this.LL.getValue()) == null || !(!r0.isEmpty())) {
                this.LLILLJJLI.setValue(EnumC1641470soj.LOADING);
                if (!this.LLJ || (list = this.LLJI) == null || !(!((ArrayList) list).isEmpty()) || this.LLJI == null) {
                    z = false;
                    c11nzLJL = ((InfoStickerPanelApi) ((C1431920nMk) this.LLILZLL.getValue()).LIZ.getValue()).getStickerSetDetail(this.LLIZLLLIL, 0, this.LLIZ).LJL(C11S5.LIZ());
                } else {
                    c11nzLJL = C11NZ.LJJJJIZL(this.LLJI);
                }
                vQ2().LIZ(c11nzLJL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0sdW
                    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[LOOP:0: B:12:0x0038->B:14:0x003e, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // X.C09JN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.String r6 = "InfoStickerSetDetailListViewModel@d64d.requestData$stickerData$1"
                            X.C1C7U.LIZ(r6)
                            com.ss.android.ugc.tools.infosticker.repository.internal.repository.StickerSetDetailResp r8 = (com.ss.android.ugc.tools.infosticker.repository.internal.repository.StickerSetDetailResp) r8
                            boolean r0 = r1
                            r3 = 1
                            if (r0 != 0) goto L23
                            int r0 = r8.statusCode
                            if (r0 != 0) goto L55
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r0 = r8.assetList
                            boolean r0 = r0.isEmpty()
                            if (r0 != 0) goto L55
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel r0 = r2
                            java.util.List<com.ss.android.ugc.tools.infosticker.repository.internal.repository.StickerSetDetailResp> r0 = r0.LLJI
                            if (r0 == 0) goto L23
                            java.util.ArrayList r0 = (java.util.ArrayList) r0
                            r0.add(r8)
                        L23:
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel r0 = r2
                            androidx.lifecycle.MutableLiveData<java.util.List<DATA>> r5 = r0.LL
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r1 = r8.assetList
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r0 = 10
                            int r0 = X.C15438062q.LJIJJ(r1, r0)
                            r4.<init>(r0)
                            java.util.Iterator r2 = r1.iterator()
                        L38:
                            boolean r0 = r2.hasNext()
                            if (r0 == 0) goto L8e
                            java.lang.Object r0 = r2.next()
                            com.ss.android.ugc.effectmanager.effect.model.Asset r0 = (com.ss.android.ugc.effectmanager.effect.model.Asset) r0
                            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = X.C1415070mvZ.LIZ(r0)
                            java.lang.String r0 = "set_sticker"
                            java.util.List r0 = java.util.Collections.singletonList(r0)
                            r1.setTags(r0)
                            r4.add(r1)
                            goto L38
                        L55:
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel r0 = r2
                            androidx.lifecycle.MutableLiveData<X.0soj> r1 = r0.LLILLJJLI
                            X.0soj r0 = X.EnumC1641470soj.ERROR
                            r1.setValue(r0)
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel r2 = r2
                            java.lang.String r1 = r8.message
                            int r0 = r8.statusCode
                            r2.getClass()
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel.yQ2(r3, r0, r1)
                            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                            java.lang.String r0 = "custom_sticker_upload : fail to get sticker set detail list, code = "
                            r1.append(r0)
                            int r0 = r8.statusCode
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                            r1.append(r0)
                            java.lang.String r0 = ", message = "
                            r1.append(r0)
                            java.lang.String r0 = r8.message
                            r1.append(r0)
                            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                            X.C201955140j.LJIIL(r0)
                            goto Lb5
                        L8e:
                            r5.setValue(r4)
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel r0 = r2
                            androidx.lifecycle.MutableLiveData<X.0soj> r1 = r0.LLILLJJLI
                            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Asset> r0 = r8.assetList
                            r2 = 0
                            if (r0 == 0) goto Lb9
                            boolean r0 = r0.isEmpty()
                            if (r0 != r3) goto Lb9
                            X.0soj r0 = X.EnumC1641470soj.EMPTY
                        La2:
                            r1.setValue(r0)
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel r0 = r2
                            r0.getClass()
                            r1 = -1
                            java.lang.String r0 = ""
                            com.ss.android.ugc.tools.infosticker.repository.internal.stickerset.InfoStickerSetDetailListViewModel.yQ2(r2, r1, r0)
                            java.lang.String r0 = "custom_sticker_upload : success to get sticker set detail list"
                            X.C201955140j.LJIIL(r0)
                        Lb5:
                            X.C1C7U.LIZIZ(r6)
                            return
                        Lb9:
                            X.0soj r0 = X.EnumC1641470soj.NONE
                            goto La2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1634520sdW.accept(java.lang.Object):void");
                    }
                }, new AfS194S0100000_25(this, 107)));
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, X.InterfaceC1640330smt
    public final void tw(StickerSetCategory stickerSetCategory) {
        this.LLJ = Intrinsics.LJFF(this.LLIZLLLIL, stickerSetCategory.id);
        this.LLIZLLLIL = stickerSetCategory.id;
        this.LLIZ = stickerSetCategory.sticker_set_count;
    }

    public InfoStickerSetDetailListViewModel(C1465200oEQ c1465200oEQ, InterfaceC1633960scc interfaceC1633960scc) {
        super(c1465200oEQ);
        this.LLILZIL = interfaceC1633960scc;
        this.LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(394));
        this.LLIZ = 10;
        this.LLIZLLLIL = "";
        this.LLJI = new ArrayList();
    }

    public static void yQ2(int i, int i2, String str) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        if (i == 1) {
            c543670LTx.LIZ.put("error_desc", str);
            c543670LTx.LIZIZ(Integer.valueOf(i2), "error_code");
        }
        C1637890six.LJ("video_edit_sticker_panel_set_details", i, c543670LTx.LJ());
    }
}
