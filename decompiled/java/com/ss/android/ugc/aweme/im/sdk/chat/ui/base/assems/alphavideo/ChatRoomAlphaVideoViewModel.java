package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.alphavideo;

import X.C01GW;
import X.C0ICM;
import X.C0PEM;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C0Z9Y;
import X.C1559260qg8;
import X.C1715206ne;
import X.C1716306np;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C866530Xz1;
import X.InterfaceC0148002o;
import X.InterfaceC1602806Pi;
import X.InterfaceC876950Yaj;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomAlphaVideoViewModel extends AssemViewModel<C1715206ne> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final InterfaceC1602806Pi LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 413));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 412));
    public final int LLILZIL = 20;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1715206ne(null, null, false);
    }

    public final long vQ2() {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) this.LLILLL.getValue());
        if (c0y8tLIZ == null) {
            return 0L;
        }
        Map<String, String> localExt = c0y8tLIZ.getLocalExt();
        if (localExt == null) {
            localExt = new LinkedHashMap<>();
        }
        String str = localExt.get("a:chat_room_ambient_checked_index");
        if (str != null) {
            return CastLongProtector.parseLong(str);
        }
        return 0L;
    }

    public final C0ICM wQ2() {
        C0Z9Y c0z9y = (C0Z9Y) PluggableExtentionKt.pluggableSpiForReal(ILightInteractionPlatformService.class);
        if (c0z9y != null) {
            return c0z9y.LJJJIL();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0ICM c0icmWQ2 = wQ2();
        if (c0icmWQ2 == null || !c0icmWQ2.LJIJJLI()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1716306np(this, null), 3);
    }

    public ChatRoomAlphaVideoViewModel(InterfaceC1602806Pi interfaceC1602806Pi) {
        this.LL = interfaceC1602806Pi;
    }

    public final void xQ2(long j) {
        long j2;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) this.LLILLL.getValue());
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ((String) this.LLILLL.getValue());
        if (c0y8tLIZ != null) {
            Map<String, String> localExt = c0y8tLIZ.getLocalExt();
            if (localExt == null) {
                localExt = new LinkedHashMap<>();
            }
            String str = localExt.get("a:chat_room_ambient_checked_index");
            if (str != null) {
                j2 = CastLongProtector.parseLong(str);
            } else {
                j2 = 0;
            }
            if (j > j2) {
                localExt.put("a:chat_room_ambient_checked_index", String.valueOf(j));
                c0y8tLIZ.setLocalExt(localExt);
                c866530Xz1LIZIZ.LJJ(localExt, null);
            }
        }
    }
}
