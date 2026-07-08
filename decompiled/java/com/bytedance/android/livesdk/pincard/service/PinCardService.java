package com.bytedance.android.livesdk.pincard.service;

import X.C0UTI;
import X.C1082000eGM;
import X.C1107460evQ;
import X.C1107850ew3;
import X.C1161920gLG;
import X.EnumC1107860ew4;
import X.EnumC1107900ew8;
import X.EnumC1108010ewJ;
import X.InterfaceC1107910ew9;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetMinLoadSettingV2;
import com.bytedance.android.livesdk.pincard.ui.LivePinCardHorizontalWidget;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class PinCardService implements IPinCardService {
    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final Class<? extends LiveRecyclableWidget> Zd0() {
        return LivePinCardHorizontalWidget.class;
    }

    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final boolean Qi(EnumC1107860ew4 enumC1107860ew4) {
        C1107850ew3 c1107850ew3 = C1107850ew3.LL;
        if (C1107850ew3.LLIZ == enumC1107860ew4) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final void fX(C1082000eGM c1082000eGM) {
        C1107850ew3.LLJILLL = c1082000eGM;
    }

    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final void xl(DataChannel dataChannel) {
        DataChannel dataChannel2;
        C1107850ew3 c1107850ew3 = C1107850ew3.LL;
        if (LiveWidgetMinLoadSettingV2.INSTANCE.enablePinCard()) {
            C1107460evQ c1107460evQ = C1107850ew3.LLILLL;
            if (c1107460evQ != null) {
                dataChannel2 = c1107460evQ.LIZJ;
            } else {
                dataChannel2 = null;
            }
            if (Intrinsics.LJFF(dataChannel2, dataChannel)) {
                c1107850ew3.LIZ();
                C1107850ew3.LLILLL = null;
                C1107850ew3.LLJILLL = null;
            }
        }
    }

    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final void Y70(EnumC1107860ew4 enumC1107860ew4, InterfaceC1107910ew9 interfaceC1107910ew9) {
        C1107850ew3 c1107850ew3 = C1107850ew3.LL;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && enumC1107860ew4.getType() == EnumC1107900ew8.NATIVE && !(interfaceC1107910ew9 instanceof C0UTI)) {
            throw new IllegalArgumentException("You must pass NativePinCardBehavior for native type pin card.");
        }
        if (interfaceC1107910ew9 instanceof C0UTI) {
            ((C0UTI) interfaceC1107910ew9).LL = c1107850ew3;
        }
        C1107850ew3.LLILZIL.put(enumC1107860ew4, interfaceC1107910ew9);
        C1107460evQ c1107460evQ = C1107850ew3.LLILLL;
        if (c1107460evQ == null) {
            C1107850ew3.LLILZLL.put(interfaceC1107910ew9, null);
        } else {
            interfaceC1107910ew9.LIZLLL(c1107460evQ, null);
        }
    }

    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final void D20(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        C1107850ew3 c1107850ew3 = C1107850ew3.LL;
        if (LiveWidgetMinLoadSettingV2.INSTANCE.enablePinCard()) {
            C1107850ew3.LLILLL = new C1107460evQ(context, lifecycleOwner, dataChannel);
        }
    }

    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    public final boolean Rg(EnumC1107860ew4 enumC1107860ew4, EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        C1107850ew3 c1107850ew3 = C1107850ew3.LL;
        return C1107850ew3.LIZLLL(enumC1107860ew4, enumC1108010ewJ, map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r7 = X.C1107850ew3.LL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r12 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r11 = (X.InterfaceC1107910ew9) ((java.util.LinkedHashMap) X.C1107850ew3.LLILZIL).get(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r6 = X.C1107850ew3.LIZIZ(r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        X.C1107850ew3.LLIZ = r27;
        X.C1107850ew3.LLJI = new X.C1107880ew6(r27, X.C1107850ew3.LIZJ(r29));
        r5 = X.C1107850ew3.LLILZ;
        r5.removeCallbacksAndMessages(null);
        r12 = X.C1102070emj.LIZ;
        r1 = r9.LIZJ;
        r0 = X.C1107850ew3.LLJI;
        r12.getClass();
        X.C1102070emj.LJJIII(r1, r7, r0);
        r12.LJJI(r9.LIZJ, r7, X.C1107850ew3.LLJI, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (X.C916790Zxt.LIZ(11) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r12.LJIIJ(r9.LIZJ, r7, X.C1107850ew3.LLJI, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        r0 = X.C1107850ew3.LLILLJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        r0.P(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r11.LLLZIIL(r6, r32);
        X.C1107850ew3.LJI(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r30 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        X.C786410Ut5.LJLIIL(r30, r5, new Y.ARunnableS117S0100000_17(r27, 311));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        r9.LIZJ.zW(com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel.class, new X.C1088240eQQ(r27, true));
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d4, code lost:
    
        r4 = X.C1107850ew3.LLIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        if (r27.getSource().ordinal() > r4.getSource().ordinal()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        r11 = (java.util.LinkedHashMap) X.C1107850ew3.LLILZIL;
        r6 = (X.InterfaceC1107910ew9) r11.get(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
    
        r5 = X.C1107850ew3.LIZIZ(r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        if (r5 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
    
        r4 = X.C1102070emj.LIZ;
        X.C1102070emj.LJIILJJIL(r4, r9.LIZJ, r7, X.C1107850ew3.LLJI, X.C0KAJ.AUTO_TERMINATE, null, null, 112);
        X.C1107850ew3.LLIZ = r27;
        X.C1107850ew3.LLJI = new X.C1107880ew6(r27, X.C1107850ew3.LIZJ(r29));
        r1 = (X.InterfaceC1107910ew9) r11.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
    
        if (r1 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0128, code lost:
    
        r1.LIZ(X.EnumC1108010ewJ.COVER, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        X.C1107850ew3.LJFF(r12, X.EnumC1108010ewJ.COVER);
        r11 = X.C1107850ew3.LLILZ;
        r11.removeCallbacksAndMessages(null);
        X.C1102070emj.LJJIII(r9.LIZJ, r7, X.C1107850ew3.LLJI);
        r4.LJJI(r9.LIZJ, r7, X.C1107850ew3.LLJI, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if (X.C916790Zxt.LIZ(11) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014d, code lost:
    
        r4.LJIIJ(r9.LIZJ, r7, X.C1107850ew3.LLJI, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0154, code lost:
    
        r0 = X.C1107850ew3.LLILLJJLI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0158, code lost:
    
        r0.LJJLL(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        r6.LLLZIIL(r5, r32);
        X.C1107850ew3.LJI(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0163, code lost:
    
        if (r30 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0165, code lost:
    
        X.C786410Ut5.LJLIIL(r30, r11, new Y.ARunnableS117S0100000_17(r27, 312));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016f, code lost:
    
        r9.LIZJ.zW(com.bytedance.android.live.pincard.event.LivePinCardVisibilityChannel.class, new X.C1088240eQQ(r27, true));
        r18 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0ew6] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0ew6] */
    @Override // com.bytedance.android.live.pincard.service.IPinCardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DP(X.EnumC1107860ew4 r27, X.InterfaceC1108000ewI r28, X.C1107970ewF r29, long r30, java.util.Map<java.lang.String, ? extends java.lang.Object> r32) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.pincard.service.PinCardService.DP(X.0ew4, X.0ewI, X.0ewF, long, java.util.Map):boolean");
    }
}
