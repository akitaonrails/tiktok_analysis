package com.ss.android.ugc.tiktok.im.contact.selector;

import X.AbstractC1225770i0F;
import X.C1224280hxq;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C13LE;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1224270hxp;
import X.InterfaceC1224480hyA;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorConfirmWidgetAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorContainerAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSearchBarAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.assem.SelectorSelectedListAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.comm.ContactSelectorBridgeImp;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment.ContactSelectorFragment;
import com.zhiliaoapp.musically.R;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
public final class ContactSelectorImpl implements IContactSelectorAPI {
    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(SelectorSelectedListAssem.class);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final C19719912Dl LJFF() {
        return C13LE.LIZ(SelectorContainerAssem.class);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final C19719912Dl LJI() {
        return C13LE.LIZ(SelectorConfirmWidgetAssem.class);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final C19719912Dl LJII() {
        return C13LE.LIZ(SelectorSearchBarAssem.class);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final C1224280hxq LIZIZ(AbstractC1225770i0F abstractC1225770i0F) {
        return new C1224280hxq(abstractC1225770i0F);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final ContactSelectorFragment LIZJ(AbstractC1225770i0F abstractC1225770i0F) {
        String str = ContactSelectorFragment._pnsPageId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1224280hxq c1224280hxq = new C1224280hxq(abstractC1225770i0F);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("protocol_uuid", strLIZIZ, bundle);
        bundle.putBoolean("is_full_screen", abstractC1225770i0F.LJIILIIL().LJIIIZ());
        AbsContactSelectorFragment.LLJILJIL.put(strLIZIZ, c1224280hxq);
        ContactSelectorFragment contactSelectorFragment = new ContactSelectorFragment();
        contactSelectorFragment.setArguments(bundle);
        return contactSelectorFragment;
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final ContactSelectorBridgeImp LIZLLL(AbsContactSelectorFragment absContactSelectorFragment) {
        return new ContactSelectorBridgeImp(absContactSelectorFragment);
    }

    @Override // com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI
    public final void LJ(Context context, InterfaceC1224270hxp interfaceC1224270hxp) {
        FragmentManager supportFragmentManager;
        int iIntValue;
        TuxSheet tuxSheet;
        String str = ContactSelectorFragment._pnsPageId;
        InterfaceC1224480hyA interfaceC1224480hyALJII = interfaceC1224270hxp.LJII();
        if (interfaceC1224480hyALJII != null) {
            interfaceC1224480hyALJII.LIZLLL(interfaceC1224270hxp);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1224280hxq c1224280hxq = new C1224280hxq(interfaceC1224270hxp);
        AbsContactSelectorFragment.LLJILJIL.put(strLIZIZ, c1224280hxq);
        c1224280hxq.LJIIJJI.LIZJ();
        c1224280hxq.LJIIJJI.LIZIZ();
        if (interfaceC1224270hxp.LJIILIIL().LJIIIZ()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/contact_selector");
            smartRouteBuildRoute.withParam("protocol_uuid", strLIZIZ);
            smartRouteBuildRoute.withParam("is_full_screen", interfaceC1224270hxp.LJIILIIL().LJIIIZ());
            Integer numLJ = interfaceC1224270hxp.LJIILIIL().LJ();
            if (numLJ != null) {
                smartRouteBuildRoute.open(numLJ.intValue());
                return;
            } else {
                smartRouteBuildRoute.open();
                return;
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("protocol_uuid", strLIZIZ, bundle);
        bundle.putBoolean("is_full_screen", interfaceC1224270hxp.LJIILIIL().LJIIIZ());
        ContactSelectorFragment contactSelectorFragment = new ContactSelectorFragment();
        contactSelectorFragment.setArguments(bundle);
        Integer num = interfaceC1224270hxp.LJIILIIL().LJIIJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.attr.zm;
        }
        C1390920mIc c1390920mIcLJII = interfaceC1224270hxp.LJIILIIL().LJII();
        if (c1390920mIcLJII != null) {
            c1390920mIcLJII.LIZ.LLJJIJI = contactSelectorFragment;
            Integer numLIZJ = C1308910kAL.LIZJ(iIntValue, context);
            tuxSheet = c1390920mIcLJII.LIZ;
            tuxSheet.LLJI = numLIZJ;
        } else {
            tuxSheet = null;
        }
        C1391850mK7.LIZIZ(tuxSheet, "contact_selector_show");
        if (tuxSheet == null) {
            return;
        }
        tuxSheet.show(supportFragmentManager, "TAG_SelectContactFragment");
    }
}
