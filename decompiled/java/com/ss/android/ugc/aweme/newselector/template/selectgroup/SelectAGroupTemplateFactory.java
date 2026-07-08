package com.ss.android.ugc.aweme.newselector.template.selectgroup;

import X.AbstractC1225770i0F;
import X.AbstractC1225780i0G;
import X.C1225480hzm;
import android.content.Context;
import com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectAGroupTemplateFactory implements IContactSelectorTemplateFactory {
    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final String pN() {
        return "SelectAGroupTemplate";
    }

    @Override // com.ss.android.ugc.aweme.feature.newselector.IContactSelectorTemplateFactory
    public final AbstractC1225770i0F gI0(AbstractC1225780i0G abstractC1225780i0G) {
        final C1225480hzm c1225480hzm;
        if (!(abstractC1225780i0G instanceof C1225480hzm) || (c1225480hzm = (C1225480hzm) abstractC1225780i0G) == null) {
            return null;
        }
        return new AbstractC1225770i0F(c1225480hzm) { // from class: X.0hzn
            public final C1225480hzm LLJIJIL;

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224330hxv LJJJJJL() {
                final C1224340hxw c1224340hxw = this.LLJIJIL.LLIZLLLIL;
                return new C1225800i0I(this, c1224340hxw) { // from class: X.0i3A
                    public boolean LLILZ;

                    @Override // X.C1225800i0I, X.InterfaceC1224330hxv
                    public final void LJI(C1224840hyk c1224840hyk) {
                        AbsContactSelectorFragment fragment;
                        IMContact iMContact;
                        Context context;
                        super.LJI(c1224840hyk);
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                        if (interfaceC1226510i1R != null) {
                            fragment = interfaceC1226510i1R.getFragment();
                        } else {
                            fragment = null;
                        }
                        Object obj = c1224840hyk.LLJI.get("contact");
                        if (obj instanceof IMConversation) {
                            iMContact = (IMContact) obj;
                        } else {
                            iMContact = null;
                        }
                        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                        if (fragment != null) {
                            context = fragment.getContext();
                        } else {
                            context = null;
                        }
                        EnterChatParams enterChatParams = new EnterChatParams(context, iMContact);
                        enterChatParams.setEnterMethodForMob("existed_group");
                        enterChatParams.setEnterFrom(15);
                        imChatService.LJIILLIIL(enterChatParams, null);
                        InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
                        if (interfaceC1226510i1R2 != null) {
                            interfaceC1226510i1R2.LJIILL(C343970De7.LIZ, null);
                        }
                    }

                    @Override // X.C1225800i0I, X.InterfaceC1224250hxn
                    public final void LJJJ(C1224790hyf c1224790hyf) {
                        AbsContactSelectorFragment fragment;
                        Map<String, List<C1224840hyk>> map;
                        Set<Map.Entry<String, List<C1224840hyk>>> setEntrySet;
                        Map.Entry entry;
                        List list;
                        Context context;
                        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
                        if (interfaceC1226510i1R == null || (fragment = interfaceC1226510i1R.getFragment()) == null || (map = c1224790hyf.LIZ) == null || (setEntrySet = map.entrySet()) == null || (entry = (Map.Entry) C13LP.LJJJLIIL(setEntrySet)) == null || (list = (List) entry.getValue()) == null || !list.isEmpty() || this.LLILZ || (context = fragment.getContext()) == null) {
                            return;
                        }
                        InterfaceC1519705xD.LIZ.getClass();
                        if (!C0XF1.LIZLLL(context) && C0XF1.LIZIZ(context)) {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                            c1389890mGx.LJIIIZ(2131829441);
                            c1389890mGx.LJIIJJI();
                            this.LLILZ = true;
                        }
                    }
                };
            }

            @Override // X.AbstractC1225770i0F
            public final InterfaceC1224410hy3 LJJJJL() {
                return new C1225720i0A(this, this.LLJIJIL.LLJILJIL);
            }

            @Override // X.AbstractC1225770i0F
            public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
                return this.LLJIJIL;
            }

            {
                super(c1225480hzm);
                this.LLJIJIL = c1225480hzm;
            }
        };
    }
}
