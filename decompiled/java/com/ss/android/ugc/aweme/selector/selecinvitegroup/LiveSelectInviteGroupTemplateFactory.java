package com.ss.android.ugc.aweme.selector.selecinvitegroup;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1226610i1b;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveSelectInviteGroupTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "live_end_live_invite_group_chat";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1226610i1b c1226610i1b;
        if (!(abstractC1225780i0G instanceof C1226610i1b) || (c1226610i1b = (C1226610i1b) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1226610i1b) { // from class: X.0i1c
            public final C1226610i1b LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                final C1226630i1d c1226630i1d = this.LLJIJIL.LLJILJILJ;
                return new C1225700i08(this, c1226630i1d) { // from class: X.0i1e
                    public final C01GW LLILZ;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:100:0x01f8  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x01db  */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
                    /* JADX WARN: Type inference failed for: r11v0, types: [X.13BV] */
                    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
                    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
                    @Override // X.C1225700i08, X.InterfaceC1224490hyB
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJIJ(X.C1224590hyL r41) {
                        /*
                            Method dump skipped, instruction units count: 692
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1226640i1e.LJIJ(X.0hyL):void");
                    }

                    @Override // X.C1225700i08, X.InterfaceC1224250hxn
                    public final void LJJJ(C1224790hyf c1224790hyf) {
                        InterfaceC1226510i1R interfaceC1226510i1R;
                        String string;
                        AbsContactSelectorFragment fragment;
                        List<C1224840hyk> list = c1224790hyf.LIZIZ;
                        if (list != null && (interfaceC1226510i1R = this.LL.LIZ) != null) {
                            EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
                            boolean z = true;
                            if (list.size() != 1) {
                                z = false;
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                            if (interfaceC1226510i1R2 != null && (fragment = interfaceC1226510i1R2.getFragment()) != null) {
                                string = fragment.getString(2131850366);
                            } else {
                                string = null;
                            }
                            interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, boolValueOf, string, Boolean.TRUE, (Boolean) null), false);
                        }
                    }

                    {
                        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(c1226630i1d, 3352));
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJILLL);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1226610i1b);
                this.LLJIJIL = c1226610i1b;
            }
        };
    }
}
