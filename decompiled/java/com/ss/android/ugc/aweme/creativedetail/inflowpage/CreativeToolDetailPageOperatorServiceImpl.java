package com.ss.android.ugc.aweme.creativedetail.inflowpage;

import X.C1697810uHb;
import X.C1954807lC;
import X.C627890Ojz;
import X.EnumC627880Ojy;
import X.InterfaceC1255404vg;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class CreativeToolDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        String str;
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        for (final EnumC627880Ojy enumC627880Ojy : C1697810uHb.LJIIJJI(EnumC627880Ojy.DUET, EnumC627880Ojy.AI_MAGIC)) {
            int i = C627890Ojz.LIZ[enumC627880Ojy.ordinal()];
            if (i == 1) {
                str = "from_creative_tool_duet_detail_activity";
            } else {
                if (i != 2) {
                    throw new C1954807lC();
                }
                str = "from_creative_tool_ai_magic_detail_activity";
            }
            map.put(str, new InterfaceC1255404vg() { // from class: X.0Ok6
                @Override // X.InterfaceC1255404vg
                public final InterfaceC1603360rpG LIZ(C2189821An6 c2189821An6, final AbstractC1255880imo<?, ?> abstractC1255880imo, JediViewModel<?> jediViewModel) {
                    final EnumC627880Ojy enumC627880Ojy2 = enumC627880Ojy;
                    return new AbstractC1216410hl9<C627900Ok0, C1255920ims<C627900Ok0>>(abstractC1255880imo, enumC627880Ojy2) { // from class: X.0Ok7
                        public final EnumC627880Ojy LL;

                        @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                        public final int getPageType(int i2) {
                            int i3;
                            int i4 = C627890Ojz.LIZ[this.LL.ordinal()];
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    i3 = 28000;
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                i3 = 27000;
                            }
                            return i3 + i2;
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
                        {
                            this.LL = enumC627880Ojy2;
                            this.mModel = (!(abstractC1255880imo instanceof C627900Ok0) || abstractC1255880imo == null) ? new C627900Ok0(enumC627880Ojy2) : abstractC1255880imo;
                            this.mPresenter = new C1255920ims();
                        }

                        @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                        public final void request(int i2, C2189821An6 c2189821An62, int i3, boolean z) {
                            this.mPresenter.LIZJ(Integer.valueOf(i2), c2189821An62.getCreativeToolAnchorType(), c2189821An62.getCreativeToolId(), c2189821An62.getCreativeToolClickTime());
                        }
                    };
                }
            });
        }
        return map;
    }
}
