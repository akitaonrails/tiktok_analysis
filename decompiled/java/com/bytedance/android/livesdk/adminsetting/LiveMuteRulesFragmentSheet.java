package com.bytedance.android.livesdk.adminsetting;

import X.AbstractC21674919sB;
import X.C01C7;
import X.C01GW;
import X.C0TYA;
import X.C1119170fEJ;
import X.C16FS;
import X.C16FZ;
import X.C19322110iZ;
import X.C20736316Cj;
import X.C23250099c;
import X.C452501pT;
import X.C475510Ikn;
import X.C497740JfY;
import X.C745200TLa;
import X.C750890Tct;
import X.C750900Tcu;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.api.room.MuteRule;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMuteRulesFragmentSheet extends LiveSheetFragment implements C0TYA {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICHELIOSEgLTE4ICE0ZgklPyoePTEpGzo/LTYKOy40JSAiPRw7LSA4";
    public C16FZ LLJLLL;
    public C16FS LLJZ;
    public C16FS LLJZIJLIL;
    public RecyclerView LLL;
    public LinearLayout LLLF;
    public LinearLayout LLLFF;
    public C745200TLa LLLFFI;
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 134));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 133));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 135));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131837810));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        c1119170fEJ.LJFF = Collections.singletonList(new C758170Tod(R.attr.ea_, new ACListenerS147S0100000_12(this, 120)));
        return c1119170fEJ;
    }

    public final RecyclerView yS() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.oye) : null;
            this.LLL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
    }

    public final void wS() {
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            C01C7.LIZ(dataChannelLJ, "livesdk_comment_mute_rule_add_click", null);
        }
        FragmentManager fragmentManager = getFragmentManager();
        LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet = new LiveMuteRulesEditFragmentSheet();
        liveMuteRulesEditFragmentSheet.LLLII = this;
        C19322110iZ.LJFF(fragmentManager, liveMuteRulesEditFragmentSheet, "live_mute_rules_edit_dialog", null, 0);
    }

    @Override // X.C0TYA
    public final void Ju(MuteRule muteRule) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C750900Tcu(this, muteRule, null), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.af0);
            } else {
                viewFindViewById = null;
            }
            this.LLJZ = (C16FS) viewFindViewById;
        }
        C01C7.LIZIZ(new ACListenerS147S0100000_12(this, 121), viewFindViewById);
        View viewFindViewById2 = this.LLJZIJLIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.h1s);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJZIJLIL = (C16FS) viewFindViewById2;
        }
        C01C7.LIZIZ(new ACListenerS147S0100000_12(this, 122), viewFindViewById2);
        this.LLLFFI = new C745200TLa(this, new AwS591S0100000_12(this, 154));
        yS().setAdapter(this.LLLFFI);
        yS().setItemAnimator(new AbstractC21674919sB() { // from class: X.0Tqi
            @Override // X.AbstractC21673719rz
            public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
            }

            @Override // X.AbstractC21673719rz
            public final void LJIIL() {
            }

            @Override // X.AbstractC21673719rz
            public final boolean LJIIZILJ() {
                return false;
            }

            @Override // X.AbstractC21673719rz
            public final void LJIJI() {
            }

            @Override // X.AbstractC21674919sB
            public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
                LJJIIJ(viewHolder);
                return false;
            }

            @Override // X.AbstractC21674919sB
            public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
                LJIIIZ(viewHolder);
                return false;
            }

            @Override // X.AbstractC21674919sB
            public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
                LJIIIZ(viewHolder);
                return false;
            }

            @Override // X.AbstractC21674919sB
            public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
                LJIIIZ(viewHolder);
                LJIIIZ(viewHolder2);
                return false;
            }
        });
        yS().setLayoutManager(new LinearLayoutManager(view.getContext()));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C750890Tct(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uS(webcast.api.room.MuteRule r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C750920Tcw
            if (r0 == 0) goto L25
            r14 = r3
            X.0Tcw r14 = (X.C750920Tcw) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r4 = r14.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r14.LLILLL
            r0 = 2
            r2 = 1
            if (r3 == 0) goto L3d
            if (r3 == r2) goto L37
            if (r3 != r0) goto L2f
            goto L2b
        L25:
            X.0Tcw r14 = new X.0Tcw
            r14.<init>(r15, r3)
            goto L14
        L2b:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L9c
            goto La6
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L9c
            r3 = 1
            r2 = 2
            goto L8b
        L3d:
            X.C155000ia.LIZIZ(r4)
            X.0Ism r3 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L9c
            java.lang.Class<com.bytedance.android.livesdk.function.MuteRuleApi> r0 = com.bytedance.android.livesdk.function.MuteRuleApi.class
            r3.getClass()     // Catch: java.lang.Exception -> L9c
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L9c
            com.bytedance.android.livesdk.function.MuteRuleApi r4 = (com.bytedance.android.livesdk.function.MuteRuleApi) r4     // Catch: java.lang.Exception -> L9c
            X.01GW r0 = r15.LLLI     // Catch: java.lang.Exception -> L9c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9c
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L9c
            long r5 = r0.longValue()     // Catch: java.lang.Exception -> L9c
            X.01GW r0 = r15.LLLII     // Catch: java.lang.Exception -> L9c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L9c
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L9c
            long r7 = r0.longValue()     // Catch: java.lang.Exception -> L9c
            r0 = r16
            if (r0 == 0) goto L6f
            java.lang.String r9 = r0.content     // Catch: java.lang.Exception -> L9c
            if (r9 != 0) goto L71
        L6f:
            java.lang.String r9 = ""
        L71:
            if (r0 == 0) goto L76
            long r10 = r0.id     // Catch: java.lang.Exception -> L9c
            goto L78
        L76:
            r10 = 0
        L78:
            if (r0 == 0) goto L7b
            goto L7e
        L7b:
            r12 = 0
            goto L80
        L7e:
            long r12 = r0.durationSecond     // Catch: java.lang.Exception -> L9c
        L80:
            r14.LLILLL = r2     // Catch: java.lang.Exception -> L9c
            r3 = 1
            r2 = 2
            java.lang.Object r4 = r4.addMuteRule(r5, r7, r9, r10, r12, r14)     // Catch: java.lang.Exception -> L9c
            if (r4 != r1) goto L8b
            return r1
        L8b:
            X.0Icr r4 = (X.C470590Icr) r4     // Catch: java.lang.Exception -> L9c
            r0 = 2131837828(0x7f114384, float:1.9308862E38)
            X.C766270U4b.LIZLLL(r0)     // Catch: java.lang.Exception -> L9c
            r14.LLILLL = r2     // Catch: java.lang.Exception -> L9c
            java.lang.Object r0 = r15.zS(r3, r14)     // Catch: java.lang.Exception -> L9c
            if (r0 != r1) goto La6
            return r1
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 2131837817(0x7f114379, float:1.930884E38)
            X.C766270U4b.LIZLLL(r0)
        La6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet.uS(webcast.api.room.MuteRule, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zS(boolean r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet.zS(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hf3, viewGroup, false);
    }
}
