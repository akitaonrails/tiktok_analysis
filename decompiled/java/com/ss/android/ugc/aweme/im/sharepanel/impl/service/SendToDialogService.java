package com.ss.android.ugc.aweme.im.sharepanel.impl.service;

import X.C1390920mIc;
import X.C19EG;
import X.C905710Zg1;
import X.DialogInterfaceOnCancelListenerC913890ZtD;
import android.content.DialogInterface;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.service.service.ISendToDialogService;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.sendto.SendToSheetFragment;
import kotlin.jvm.internal.AwS128S1100000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class SendToDialogService implements ISendToDialogService {
    @Override // com.ss.android.ugc.aweme.im.service.service.ISendToDialogService
    public final void LIZ(C19EG c19eg, C905710Zg1 c905710Zg1, AwS128S1100000_14 awS128S1100000_14) {
        SendToSheetFragment sendToSheetFragment = new SendToSheetFragment();
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = sendToSheetFragment;
        tuxSheet.LL = new DialogInterfaceOnCancelListenerC913890ZtD(awS128S1100000_14, 0);
        tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0Zg2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        sendToSheetFragment.LLJJ = c905710Zg1;
        sendToSheetFragment.LLJJI = new AwS558S0100000_14(tuxSheet, 1042);
        sendToSheetFragment.LLJJIII = new AwS593S0100000_14(awS128S1100000_14, 130);
        tuxSheet.show(c19eg.getSupportFragmentManager(), "SendToSheetFragment");
    }
}
