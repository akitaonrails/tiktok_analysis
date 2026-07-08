package com.bytedance.android.livesdk.interaction;

import X.AbstractC518790KWf;
import X.C0JFL;
import X.C0JFQ;
import X.C1086800eO6;
import X.C1086960eOM;
import X.C16F5;
import X.C492400JSs;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C518750KWb;
import X.C748880TZe;
import X.InterfaceC1086820eO8;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessNewStartDialog;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class InteractionFeaturesDialog extends LiveDialogFragment implements InterfaceC1086820eO8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LDHELIOS0yKzElJiF9ASs4LD0yKzElJiEVLSQ4PD02OwElKCM8Lw==";
    public View LL;
    public C16F5 LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public final C518750KWb LLJ = new AbstractC518790KWf() { // from class: X.0KWb
        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LIZ(C01C1 c01c1) {
            C500260Jjc.LLFFF(this.LIZ.MR().findViewById(R.id.fba));
        }

        @Override // X.AbstractC518790KWf, X.InterfaceC1086970eON
        public final void LJ(C01C1 c01c1) {
            if (c01c1.LJI == EnumC1085350eLl.CANCEL) {
                C500260Jjc.LJIILIIL(this.LIZ.MR().findViewById(R.id.fba));
            }
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final View MR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fch) : null;
            this.LL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g_f) : null;
            this.LLILLL = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final View OR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rfn) : null;
            this.LLILZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g7t);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJIIL = new ColorDrawable(0);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LJIIJ = -2;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Room room;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            C1086960eOM c1086960eOM = C1086960eOM.LL;
            C1086960eOM.LJIJ(room.getId(), this.LLJ);
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC1086820eO8
    public final void LIZLLL() {
        C500260Jjc.LJIILIIL(OR().findViewById(R.id.fba));
        C1086800eO6.LIZIZ(this);
    }

    public final void PR() {
        LiveDialogFragment drawGuessStartDialog;
        FragmentManager fragmentManager;
        Function0<Unit> function0;
        dismiss();
        if (C0JFQ.LIZ(this.dataChannel)) {
            if (!C0JFL.LIZJ && (function0 = C0JFL.LIZIZ) != null) {
                C0JFL.LIZJ = true;
                function0.invoke();
            }
            drawGuessStartDialog = new DrawGuessNewStartDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("argument_is_from_round_summary", false);
            bundle.putBoolean("argument_is_custom_next_word", false);
            drawGuessStartDialog.setArguments(bundle);
        } else {
            drawGuessStartDialog = new DrawGuessStartDialog();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        C492400JSs.LIZ(drawGuessStartDialog, fragmentManager, "InteractionFeaturesDialog");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC1086820eO8
    public final void LJJI(long j) {
        C500260Jjc.LLFFF(OR().findViewById(R.id.fba));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C1086800eO6.LIZIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x050f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05cb A[PHI: r3
      0x05cb: PHI (r3v4 android.view.View) = (r3v3 android.view.View), (r3v11 android.view.View) binds: [B:267:0x05bb, B:272:0x05c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x065b A[PHI: r3
      0x065b: PHI (r3v6 android.view.View) = (r3v5 android.view.View), (r3v8 android.view.View) binds: [B:281:0x064b, B:286:0x0659] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a7  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 2049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.InteractionFeaturesDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
