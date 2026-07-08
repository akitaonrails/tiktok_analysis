package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk;

import X.AbstractC2004407tC;
import X.AbstractC316870CbV;
import X.C11JF;
import X.C1559260qg8;
import X.C1815530xLT;
import X.C1818760xQg;
import X.C2004307tB;
import X.C316640Cb8;
import X.C612620O1c;
import X.C612660O1g;
import X.C612670O1h;
import X.C612680O1i;
import X.C627660Ojc;
import X.EnumC2004207tA;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1815500xLQ;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes28.dex */
public final class SceneryPictureViewModel extends AssemListViewModel<C612620O1c, AbstractC2004407tC, Integer> implements InterfaceC1815500xLQ {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1815530xLT.class, (Class<Object>) "BoardSceneryHierarchyData", (String) 13), true);
    public C11JF LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612620O1c(0);
    }

    public final C1815530xLT wQ2() {
        return (C1815530xLT) this.LL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1815500xLQ
    public final Bitmap Hf2() {
        return ((C612620O1c) getState()).LLILLJJLI.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1815500xLQ
    public final Bitmap oJ0() {
        return ((C612620O1c) getState()).LLILLL.LIZ;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C11JF c11jf = this.LLILLJJLI;
        if (c11jf == null || !(!c11jf.isDisposed())) {
            return;
        }
        c11jf.dispose();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<AbstractC2004407tC> c627660Ojc) {
        setState(new C612670O1h(c627660Ojc));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
    }

    public final void xQ2(Bitmap bitmap) {
        SceneryContent sceneryContent;
        ImageContent imageContent;
        BoardItem boardItem = wQ2().LL;
        if (boardItem != null && boardItem.boardItemType == 6 && (sceneryContent = boardItem.sceneryContent) != null && (imageContent = sceneryContent.imageContent) != null) {
            imageContent.LIZ = bitmap;
        }
        withState(new C612660O1g(this, bitmap));
    }

    public final Object onLoadMore(int i, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        SceneryContent sceneryContent;
        ImageContent imageContent;
        ImageModel imageModel;
        List urls;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2004307tB(0));
        BoardItem boardItem = wQ2().LL;
        if (boardItem != null && boardItem.boardItemType == 6 && 1 != 0 && (sceneryContent = boardItem.sceneryContent) != null && (imageContent = sceneryContent.templateImageContent) != null && (imageModel = imageContent.image) != null && (urls = imageModel.getUrls()) != null && (!urls.isEmpty())) {
            arrayList.add(new C1818760xQg(EnumC2004207tA.AI_GENERATED, null, null));
            setState(new C612680O1i());
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(arrayList);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(num.intValue(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(android.content.Context r12, com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel r13, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C492820JUi
            if (r0 == 0) goto Lac
            r6 = r14
            X.0JUi r6 = (X.C492820JUi) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 2
            r4 = 0
            r8 = 1
            if (r0 == 0) goto L27
            if (r0 == r8) goto L91
            if (r0 != r5) goto Lb3
            X.C155000ia.LIZIZ(r2)
        L26:
            return r2
        L27:
            X.C155000ia.LIZIZ(r2)
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsBoardsImageOptSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsBoardsImageOptSetting.INSTANCE
            boolean r3 = r0.getValue()
            java.lang.String r2 = ""
            java.lang.String r1 = "show_entrance"
            r10 = 0
            r9 = 20480000(0x1388000, float:3.3887298E-38)
            r0 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L70
            com.bytedance.android.livesdkapi.host.IHostSubscription$Params r3 = new com.bytedance.android.livesdkapi.host.IHostSubscription$Params
            r3.<init>()
            r3.min_width = r0
            r3.min_height = r0
            r0 = 720(0x2d0, float:1.009E-42)
            r3.max_width = r0
            r0 = 1080(0x438, float:1.513E-42)
            r3.max_height = r0
            r3.max_size = r9
            r3.max_count = r8
            r3.emotesShowStyle = r10
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)
            r3.logInfo = r0
        L5e:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.13yx r0 = new X.13yx
            r0.<init>(r13, r12, r3, r4)
            r6.LL = r3
            r6.LLILZ = r8
            java.lang.Object r2 = X.C23250099c.LJI(r6, r1, r0)
            if (r2 != r7) goto L96
            return r7
        L70:
            com.bytedance.android.livesdkapi.host.IHostSubscription$Params r3 = new com.bytedance.android.livesdkapi.host.IHostSubscription$Params
            r3.<init>()
            r3.min_width = r0
            r3.min_height = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r3.max_width = r0
            r3.max_height = r0
            r3.max_size = r9
            r3.max_count = r8
            r3.emotesShowStyle = r10
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r0)
            r3.logInfo = r0
            goto L5e
        L91:
            com.bytedance.android.livesdkapi.host.IHostSubscription$Params r3 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L96:
            com.bytedance.android.livesdkapi.host.IHostSubscription$Result$PhotoFile r2 = (com.bytedance.android.livesdkapi.host.IHostSubscription.Result.PhotoFile) r2
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0JUg r0 = new X.0JUg
            r0.<init>(r2, r3, r4)
            r6.LL = r4
            r6.LLILZ = r5
            java.lang.Object r2 = X.C23250099c.LJI(r6, r1, r0)
            if (r2 != r7) goto L26
            return r7
        Lac:
            X.0JUi r6 = new X.0JUi
            r6.<init>(r11, r14)
            goto L12
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureViewModel.vQ2(android.content.Context, com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel, X.05Vn):java.lang.Object");
    }
}
