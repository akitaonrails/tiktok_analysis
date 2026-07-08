package com.ss.android.ugc.aweme.im.service.impl.edit;

import X.C0I22;
import X.C0S2R;
import X.C0S2U;
import X.C0ZH1;
import X.C19EG;
import X.C456970Hvz;
import X.C457000Hw2;
import X.EnumC2172611A1b;
import X.EnumC456980Hw0;
import X.EnumC913000Zrm;
import X.EnumC913010Zrn;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.quickchat.QuickMessageService;
import com.ss.android.ugc.aweme.im.service.service.IEditShareSendToPanelUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class EditShareSendToPanelUtils implements IEditShareSendToPanelUtils {
    public static final EditShareSendToPanelUtils LIZ = new EditShareSendToPanelUtils();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IEditShareSendToPanelUtils {
        public final /* synthetic */ EditShareSendToPanelUtils LIZ = EditShareSendToPanelUtils.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IEditShareSendToPanelUtils
        public final void LIZ(C19EG c19eg, String str, IMContact iMContact, String str2, String str3, boolean z, String str4, Function1<? super Boolean, Unit> function1) {
            this.LIZ.LIZ(c19eg, str, iMContact, str2, str3, z, str4, function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IEditShareSendToPanelUtils
    public final void LIZ(C19EG c19eg, String str, IMContact iMContact, String str2, String str3, boolean z, String str4, Function1<? super Boolean, Unit> function1) {
        String str5;
        C0S2R c0s2r;
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        EnumC2172611A1b enumC2172611A1b = EnumC2172611A1b.VIDEO_EDIT_PAGE;
        if (!Intrinsics.LJFF(str4, enumC2172611A1b.getEtString())) {
            enumC2172611A1b = EnumC2172611A1b.VIDEO_RECORD_PAGE;
        }
        QuickMessageService quickMessageService = (QuickMessageService) PluggableExtentionKt.pluggableSpi$default(QuickMessageService.class, false, false, false, 14, null);
        if (quickMessageService != null) {
            String displayName = iMContact.getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            C457000Hw2 c457000Hw2 = new C457000Hw2(displayName);
            boolean z2 = iMContact instanceof IMConversation;
            if (z2) {
                str5 = "group";
            } else {
                str5 = "private";
            }
            EnumC456980Hw0 enumC456980Hw0 = EnumC456980Hw0.FORCE_HIDE;
            EnumC913000Zrm enumC913000Zrm = EnumC913000Zrm.SHARE_EDIT_CONTENT;
            C0ZH1 c0zh1 = C0ZH1.EDIT;
            C0S2U c0s2u = C0S2U.FIXED_ENTRANCE;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.MESSAGE_BTN;
            if (z2) {
                c0s2r = C0S2R.GROUP;
            } else {
                c0s2r = C0S2R.PRIVATE;
            }
            quickMessageService.LIZ(supportFragmentManager, new C456970Hvz(c457000Hw2, str, str5, null, enumC456980Hw0, false, null, enumC2172611A1b, enumC913000Zrm, c0zh1, c0s2u, enumC913010Zrn, c0s2r, str3, null, 98536), null, new C0I22(iMContact, c19eg, str, str4, str2, function1));
        }
    }
}
