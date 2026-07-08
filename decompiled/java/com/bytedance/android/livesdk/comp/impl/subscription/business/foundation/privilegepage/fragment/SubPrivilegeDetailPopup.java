package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment;

import X.C1440005kM;
import X.C16F5;
import X.C16FS;
import X.C2211631BhB;
import X.C469840Ibe;
import X.C500980Jkm;
import X.C508400Jwk;
import X.C510180Jzc;
import X.C510260Jzk;
import X.InterfaceC495060JbE;
import X.InterfaceC508600Jx4;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.common.PrivilegeBottomSheetBehavior;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPrivilegeDetailPopup extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogHELIOSO2sqJjo9LCQ4ICA9ZjU+IDk6JCArLD8yLyBiLz0yLygpJzt9GzAuGT06PiwgLCg2DCA4KCY/GCo8PD8=";
    public View LL;
    public ConstraintLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public ConstraintLayout LLILZ;
    public LiveIconView LLILZIL;
    public C16F5 LLILZLL;
    public C16FS LLIZ;
    public Room LLJ;
    public PrivilegeBottomSheetBehavior<ConstraintLayout> LLJI;
    public SubscriptionPrivilegeDetailFragment LLJIJIL;
    public InterfaceC508600Jx4 LLJILJILJ;
    public Boolean LLJILLL;
    public String LLJJI;
    public long LLJJIJIL;
    public C508400Jwk LLJJJJ;
    public final String LLIZLLLIL = "";
    public final Map<String, String> LLJILJIL = new LinkedHashMap();
    public String LLJJ = "";
    public String LLJJIII = "";
    public String LLJJIJI = "";
    public Function1<? super InterfaceC495060JbE, Unit> LLJJIJIIJIL = new C510260Jzk();
    public String LLJJJ = "";
    public boolean LLJJJIL = true;

    static {
        new C510180Jzc();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gb9);
        c500980Jkm.LIZJ = R.style.ahk;
        C508400Jwk c508400Jwk = this.LLJJJJ;
        if (c508400Jwk != null && c508400Jwk.LJIIJ && !c508400Jwk.LJFF) {
            c500980Jkm.LJI = 0.0f;
        }
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 100;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() throws Exception {
        Dialog dialog = getDialog();
        if (dialog != null) {
            C2211631BhB.LIZIZ(dialog);
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Room room = this.LLJ;
        List list = (List) ((LinkedHashMap) C469840Ibe.LIZIZ).get(Long.valueOf(room != null ? room.getId() : 0L));
        if (list != null) {
            list.remove(this);
        }
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
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) throws Exception {
        Dialog dialog = getDialog();
        if (dialog != null) {
            C2211631BhB.LIZIZ(dialog);
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0Jzj
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        super.onCancel(dialogInterface);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            X.0Jwk r0 = r13.LLJJJJ
            if (r0 != 0) goto L18
            X.0Jwk r0 = new X.0Jwk
            r1 = 0
            r3 = 0
            r8 = 0
            java.lang.String r11 = r13.LLIZLLLIL
            r12 = 2047(0x7ff, float:2.868E-42)
            r2 = r1
            r5 = r3
            r7 = r1
            r9 = r1
            r10 = r1
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11, r12)
            r13.LLJJJJ = r0
        L18:
            X.0Jwk r3 = r13.LLJJJJ
            if (r3 == 0) goto L47
            java.lang.String r2 = r13.LLJJ
            if (r2 != 0) goto L22
            java.lang.String r2 = ""
        L22:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
            java.lang.Object r1 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
            boolean r0 = X.C500260Jjc.LJJIIZ(r2)
            if (r0 == 0) goto L4d
            if (r1 == 0) goto L4b
            com.bytedance.android.live.base.model.user.User r0 = r1.getOwner()
            if (r0 == 0) goto L4b
            java.lang.String r0 = r0.getSecUid()
        L3e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L4d
            r0 = 1
        L45:
            r3.LJIIJ = r0
        L47:
            super.onCreate(r14)
            return
        L4b:
            r0 = 0
            goto L3e
        L4d:
            r0 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailPopup.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[PHI: r1
      0x0051: PHI (r1v2 android.view.View) = (r1v1 android.view.View), (r1v19 android.view.View) binds: [B:12:0x003e, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailPopup.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
