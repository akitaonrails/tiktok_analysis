package com.ss.android.ugc.tiktok.im.contact.selector.api;

import X.C1224440hy6;
import X.C2188811AlT;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1224270hxp;
import X.InterfaceC1224420hy4;
import Y.ARunnableS88S0200000_19;
import android.os.Bundle;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.im.contact.selector.api.service.IContactSelectorAPI;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.comm.ContactSelectorBridgeImp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbsContactSelectorFragment extends BaseFragment {
    public static final Map<String, InterfaceC1224420hy4> LLJILJIL = new LinkedHashMap();
    public InterfaceC1224420hy4 LLIZ;
    public Boolean LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;

    public void SR() {
        if (this.LLIZ != null) {
            C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 500), 3);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        String str = this.LLJ;
        if (str == null || !this.LLJI) {
            return;
        }
        LLJILJIL.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            android.os.Bundle r1 = r7.getArguments()
            java.lang.String r0 = "protocol_uuid"
            r3 = 0
            if (r1 == 0) goto Lb4
            java.lang.String r6 = r1.getString(r0)
        L10:
            if (r8 == 0) goto Lb1
            java.lang.String r1 = r8.getString(r0)
        L16:
            if (r6 != 0) goto Lae
            r0 = r1
        L19:
            r7.LLJ = r0
            android.os.Bundle r2 = r7.getArguments()
            java.lang.String r0 = "is_full_screen"
            if (r2 == 0) goto La6
            boolean r0 = r2.getBoolean(r0)
        L27:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L2b:
            r7.LLIZLLLIL = r3
            java.lang.String r0 = r7.LLJ
            if (r0 == 0) goto L37
            X.0hy4 r0 = X.C1224450hy7.LIZIZ(r0)
            r7.LLIZ = r0
        L37:
            r3 = 1
            if (r8 == 0) goto La4
            java.lang.String r2 = r7.LLJ
            if (r2 == 0) goto La4
            java.util.Map<java.lang.String, X.0hy4> r0 = com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment.LLJILJIL
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto La4
            r5 = 1
        L47:
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "ContactSelectorAutoCloseSettings#isEnable(): "
            r4.append(r0)
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r2 = "im_contact_selector_auto_close_settings"
            int r0 = com.bytedance.ies.abmock.SettingsManager.LJ(r2, r3)
            if (r0 != r3) goto La2
            r0 = 1
        L60:
            r4.append(r0)
            java.lang.String r0 = ", isProtocolLost:"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = ", uuidFromArg:"
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = ", uuidFromSavedInstance:"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", protocolMap#containsKey:"
            r4.append(r0)
            java.util.Map<java.lang.String, X.0hy4> r1 = com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment.LLJILJIL
            java.lang.String r0 = r7.LLJ
            boolean r0 = r1.containsKey(r0)
            r4.append(r0)
            X.C2188811AlT.LIZIZ(r4)
            if (r5 == 0) goto L9f
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            int r0 = com.bytedance.ies.abmock.SettingsManager.LJ(r2, r3)
            if (r0 != r3) goto L9f
            r7.LLJIJIL = r3
        L9f:
            r7.LLJI = r3
            return
        La2:
            r0 = 0
            goto L60
        La4:
            r5 = 0
            goto L47
        La6:
            if (r8 == 0) goto L2b
            boolean r0 = r8.getBoolean(r0)
            goto L27
        Lae:
            r0 = r6
            goto L19
        Lb1:
            r1 = r3
            goto L16
        Lb4:
            r6 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC1224270hxp protocol;
        C1224440hy6 c1224440hy6LJIILIIL;
        super.onSaveInstanceState(bundle);
        String str = this.LLJ;
        if (str != null) {
            C786410Ut5.LJJJI("protocol_uuid", str, bundle);
        }
        InterfaceC1224420hy4 interfaceC1224420hy4 = this.LLIZ;
        if (interfaceC1224420hy4 != null && (protocol = interfaceC1224420hy4.getProtocol()) != null && (c1224440hy6LJIILIIL = protocol.LJIILIIL()) != null) {
            bundle.putBoolean("is_full_screen", c1224440hy6LJIILIIL.LJIIIZ());
        }
        this.LLJI = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ContactSelectorBridgeImp contactSelectorBridgeImpLIZLLL;
        InterfaceC1224270hxp protocol;
        super.onViewCreated(view, bundle);
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onViewCreated, pendingAutoClose is true, closeSelector, isFullScreen:");
            sbLIZ.append(this.LLIZLLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
            HandlerHook.viewPost(view, new ARunnableS88S0200000_19(view, this, 30));
            return;
        }
        IContactSelectorAPI iContactSelectorAPI = (IContactSelectorAPI) PluggableExtentionKt.pluggableSpiForReal(IContactSelectorAPI.class);
        if (iContactSelectorAPI != null && (contactSelectorBridgeImpLIZLLL = iContactSelectorAPI.LIZLLL(this)) != null) {
            InterfaceC1224420hy4 interfaceC1224420hy4 = this.LLIZ;
            if (interfaceC1224420hy4 != null && (protocol = interfaceC1224420hy4.getProtocol()) != null) {
                protocol.LJIILJJIL(contactSelectorBridgeImpLIZLLL);
            }
            InterfaceC1224420hy4 interfaceC1224420hy42 = this.LLIZ;
            if (interfaceC1224420hy42 != null) {
                interfaceC1224420hy42.LIZ(contactSelectorBridgeImpLIZLLL);
            }
        }
        SR();
    }
}
