package com.ss.android.ugc.aweme.selector.invitepeople;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226960i2A;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveInviteTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "live_invite_template";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1226960i2A c1226960i2A;
        if (!(abstractC1225780i0G instanceof C1226960i2A) || (c1226960i2A = (C1226960i2A) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1226960i2A) { // from class: X.0i2H
            public final C1226960i2A LLJIJIL;
            public final InterfaceC1227250i2d LLJILJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                C1224580hyK c1224580hyK = this.LLJIJIL.LLJJJJJIL;
                return c1224580hyK instanceof C1227610i3D ? new C1227450i2x(this, (C1227610i3D) c1224580hyK) : c1224580hyK instanceof C1227600i3C ? new C1227490i31(this, (C1227600i3C) c1224580hyK) : new C1225700i08(this, c1224580hyK);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224480hyA LJJJJJ() {
                IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
                if (iMGroupChatApiLIZ != null) {
                    return iMGroupChatApiLIZ.LJJIFFI();
                }
                return null;
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224330hxv LJJJJJL() {
                return new C1226130i0p(this, this.LLJIJIL.LLJJJ);
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJJJJLIIL);
            }

            @Override // X.AbstractC1225770i0F
            public final C1224950hyv LJJJJLI() {
                return new C1224940hyu(this, (C1227080i2M) this.LLJIJIL.LLJJJJ.LIZIZ);
            }

            @Override // X.AbstractC1225770i0F, X.InterfaceC1224300hxs
            public final void LJJI() {
                super.LJJI();
                C1226780i1s.LIZ.getClass();
                ((LinkedHashMap) C1226780i1s.LIZIZ).clear();
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                InterfaceC1227250i2d interfaceC1227250i2dLJIJI;
                super(c1226960i2A);
                this.LLJIJIL = c1226960i2A;
                IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
                if (iMGroupChatApiLIZ != null) {
                    interfaceC1227250i2dLJIJI = iMGroupChatApiLIZ.LJIJI(this);
                } else {
                    interfaceC1227250i2dLJIJI = null;
                }
                this.LLJILJIL = interfaceC1227250i2dLJIJI;
            }

            @Override // X.AbstractC1225770i0F
            public final void LJJJJZ(AbstractC1225650i03 abstractC1225650i03) {
                Integer num;
                String str;
                super.LJJJJZ(abstractC1225650i03);
                if (abstractC1225650i03 instanceof C1225680i06) {
                    C1224840hyk c1224840hyk = ((C1225680i06) abstractC1225650i03).LIZ;
                    if (!c1224840hyk.LLJILJIL) {
                        Object obj = c1224840hyk.LLJI.get("rank_num");
                        String str2 = null;
                        if (obj instanceof Integer) {
                            num = (Integer) obj;
                        } else {
                            num = null;
                        }
                        Object obj2 = c1224840hyk.LLJI.get("member_label");
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        } else {
                            str = null;
                        }
                        Object obj3 = c1224840hyk.LLJI.get("member_type");
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                        InterfaceC1227250i2d interfaceC1227250i2d = this.LLJILJIL;
                        if (interfaceC1227250i2d != null) {
                            interfaceC1227250i2d.LIZ(num, c1224840hyk.LLILZ, str, str2);
                        }
                    }
                }
            }

            @Override // X.AbstractC1225770i0F
            public final void LJJJJZI(C1224840hyk c1224840hyk) {
                Integer num;
                String str;
                Object obj = c1224840hyk.LLJI.get("rank_num");
                String str2 = null;
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                Object obj2 = c1224840hyk.LLJI.get("member_label");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                Object obj3 = c1224840hyk.LLJI.get("member_type");
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
                InterfaceC1227250i2d interfaceC1227250i2d = this.LLJILJIL;
                if (interfaceC1227250i2d != null) {
                    interfaceC1227250i2d.LIZIZ(num, c1224840hyk.LLILZ, str, str2);
                }
            }
        };
    }
}
