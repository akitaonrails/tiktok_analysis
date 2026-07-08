package com.bytedance.android.livesdk.chatroom.viewmodel;

import X.AbstractC753640ThK;
import X.C0U74;
import X.C1BNE;
import X.C2252321DDq;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.livesdk.model.RoomSticker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SinglePropsViewModel extends ViewModel {
    public final List<C0U74<RoomSticker>> LL = new ArrayList();
    public final C2252321DDq LLILLJJLI = C1BNE.LIZ(new AbstractC753640ThK() { // from class: X.0ThL
    });

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ArrayList) this.LL).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog r7, X.InterfaceC1364105Vn r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C753610ThH
            if (r0 == 0) goto L8f
            r5 = r8
            X.0ThH r5 = (X.C753610ThH) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L4f
            if (r0 == r2) goto L9e
            if (r0 != r3) goto L96
            androidx.lifecycle.LifecycleOwner r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            java.lang.Class<com.bytedance.android.live.effect.api.IEffectService> r0 = com.bytedance.android.live.effect.api.IEffectService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.effect.api.IEffectService r0 = (com.bytedance.android.live.effect.api.IEffectService) r0
            X.0U40 r0 = r0.getLiveEffectDataProvider()
            X.0ThG r3 = new X.0ThG
            r3.<init>()
            r0.getClass()
            java.lang.String r0 = X.C0UD4.LIZ
            X.0U5v r2 = new X.0U5v
            r2.<init>()
            X.0ThN r1 = new X.0ThN
            r1.<init>()
            java.lang.String r0 = "livesticker"
            X.C766720U5u.LJIIIIZZ(r0, r2, r1, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4f:
            X.C155000ia.LIZIZ(r1)
            java.util.List<X.0U74<com.bytedance.android.livesdk.model.RoomSticker>> r1 = r6.LL
            java.util.List<X.0U74<com.bytedance.android.livesdk.model.RoomSticker>> r0 = X.C342601Uq.LIZ
            if (r0 != 0) goto L5a
            X.13BV r0 = X.C13BV.INSTANCE
        L5a:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.addAll(r0)
            java.util.List<X.0U74<com.bytedance.android.livesdk.model.RoomSticker>> r0 = r6.LL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7c
            X.1DDq r1 = r6.LLILLJJLI
            X.0ThJ r0 = new X.0ThJ
            r0.<init>()
            r5.LLILZ = r2
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r4) goto La1
            return r4
        L7c:
            X.1DDq r1 = r6.LLILLJJLI
            X.0ThM r0 = new X.0ThM
            r0.<init>()
            r5.LL = r7
            r5.LLILZ = r3
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r4) goto L27
            return r4
        L8f:
            X.0ThH r5 = new X.0ThH
            r5.<init>(r6, r8)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            X.C155000ia.LIZIZ(r1)
        La1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel.vQ2(com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog, X.05Vn):java.lang.Object");
    }
}
