package com.ss.android.ugc.aweme.newselector.template.streak;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.DialogInterfaceOnDismissListenerC1225420hzg;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectConversationTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "SelectConversationTemplate";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final DialogInterfaceOnDismissListenerC1225420hzg dialogInterfaceOnDismissListenerC1225420hzg;
        if (!(abstractC1225780i0G instanceof DialogInterfaceOnDismissListenerC1225420hzg) || (dialogInterfaceOnDismissListenerC1225420hzg = (DialogInterfaceOnDismissListenerC1225420hzg) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(dialogInterfaceOnDismissListenerC1225420hzg) { // from class: X.0hzc
            public final DialogInterfaceOnDismissListenerC1225420hzg LLJIJIL;
            public boolean LLJILJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224490hyB LJJJJIZL() {
                return new C1225700i08(this, this.LLJIJIL.LLJILJIL) { // from class: X.0hz4
                    @Override // X.C1225700i08, X.InterfaceC1224490hyB
                    public final void LJIJ(C1224590hyL c1224590hyL) {
                        DialogInterfaceOnDismissListenerC1225420hzg dialogInterfaceOnDismissListenerC1225420hzg2;
                        String str;
                        C1224780hye c1224780hyeLJIILLIIL;
                        List<C1224840hyk> list;
                        Function1<List<C1224840hyk>, Unit> function1;
                        super.LJIJ(c1224590hyL);
                        if (c1224590hyL.LIZ == EnumC1227730i3P.MAIN && !c1224590hyL.LJ && c1224590hyL.LIZIZ) {
                            AbstractC1225780i0G abstractC1225780i0GLJJJJLL = this.LLILLJJLI.LJJJJLL();
                            if (abstractC1225780i0GLJJJJLL instanceof DialogInterfaceOnDismissListenerC1225420hzg) {
                                dialogInterfaceOnDismissListenerC1225420hzg2 = (DialogInterfaceOnDismissListenerC1225420hzg) abstractC1225780i0GLJJJJLL;
                            } else {
                                dialogInterfaceOnDismissListenerC1225420hzg2 = null;
                            }
                            if (dialogInterfaceOnDismissListenerC1225420hzg2 != null) {
                                str = dialogInterfaceOnDismissListenerC1225420hzg2.LLILZ;
                            } else {
                                str = null;
                            }
                            C1526305yH.LIZ("ttsocial_im_contact_selector_panel_confirm_click", str);
                            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                            if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null && dialogInterfaceOnDismissListenerC1225420hzg2 != null && (function1 = dialogInterfaceOnDismissListenerC1225420hzg2.LLILZIL) != null) {
                                function1.invoke(list);
                            }
                            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                            if (interfaceC1226510i1R2 != null) {
                                interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                            }
                        }
                    }

                    @Override // X.C1225700i08, X.InterfaceC1224250hxn
                    public final void LJJJ(C1224790hyf c1224790hyf) {
                        List<C1224840hyk> list = c1224790hyf.LIZIZ;
                        if (list == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (C1224840hyk c1224840hyk : list) {
                            if (!c1224840hyk.LLJILLL) {
                                arrayList.add(c1224840hyk);
                            }
                        }
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                        if (interfaceC1226510i1R != null) {
                            interfaceC1226510i1R.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, Boolean.valueOf(!arrayList.isEmpty()), (String) null, (Boolean) null, 28), false);
                        }
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJILJILJ);
            }

            @Override // X.AbstractC1225770i0F
            public final C1224950hyv LJJJJLI() {
                return new C1225340hzY(this, (C1225430hzh) this.LLJIJIL.LLJI.LIZIZ);
            }

            @Override // X.AbstractC1225770i0F, X.InterfaceC1224300hxs
            public final void LJJIJL() {
                super.LJJIJL();
                if (this.LLJILJIL) {
                    return;
                }
                this.LLJILJIL = true;
                C1526305yH.LIZ("ttsocial_im_contact_selector_panel_show", this.LLJIJIL.LLILZ);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(dialogInterfaceOnDismissListenerC1225420hzg);
                this.LLJIJIL = dialogInterfaceOnDismissListenerC1225420hzg;
            }
        };
    }
}
