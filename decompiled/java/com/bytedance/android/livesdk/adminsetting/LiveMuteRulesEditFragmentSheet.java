package com.bytedance.android.livesdk.adminsetting;

import X.C01C7;
import X.C01C8;
import X.C01GW;
import X.C0TYA;
import X.C0TYC;
import X.C1119170fEJ;
import X.C1308910kAL;
import X.C16F5;
import X.C16FZ;
import X.C20736316Cj;
import X.C23250099c;
import X.C452501pT;
import X.C497740JfY;
import X.C521830KdJ;
import X.C745220TLc;
import X.C750910Tcv;
import X.C751090TdD;
import X.C751460Tdo;
import X.C758170Tod;
import X.C786410Ut5;
import X.EnumC751100TdE;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.livesetting.other.LiveCommentMuteRuleContentMaxLengthSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;
import webcast.api.room.MuteRule;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMuteRulesEditFragmentSheet extends LiveSheetFragment implements C0TYA {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoePTEpGzo/LTYJLSYnDjctLiI2JjEfISo2PA==";
    public LiveEditText LLJLLL;
    public C16FZ LLJZ;
    public LinearLayout LLJZIJLIL;
    public LiveIconView LLL;
    public ConstraintLayout LLLF;
    public C16F5 LLLFF;
    public LiveMuteRulesFragmentSheet LLLII;
    public boolean LLLIIL;
    public C16F5 LLLIILIL;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 131));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 130));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 132));
    public C745220TLc LLLIIII = new C745220TLc(C751460Tdo.LIZ().LIZ);
    public final int LLLIIIIL = LiveCommentMuteRuleContentMaxLengthSetting.INSTANCE.value();
    public final int LLLIIIL = 4003189;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return 2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131837794));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        C751090TdD c751090TdD = new C751090TdD();
        c751090TdD.LIZIZ = C497740JfY.LJIJI(2131837806);
        c751090TdD.LIZ = EnumC751100TdE.PRIMARY;
        c751090TdD.LIZLLL = new C01C8(new ACListenerS147S0100000_12(this, 117));
        c1119170fEJ.LIZLLL = c751090TdD;
        return c1119170fEJ;
    }

    public final LiveIconView yS() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e09) : null;
            this.LLL = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final LiveEditText zS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.grz) : null;
            this.LLJLLL = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
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

    @Override // X.C0TYA
    public final void Ju(MuteRule muteRule) {
        this.LLLIIII = new C745220TLc(muteRule.durationSecond);
        if (getView() != null) {
            View viewFindViewById = this.LLLFF;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.oxw);
                } else {
                    viewFindViewById = null;
                }
                this.LLLFF = (C16F5) viewFindViewById;
            }
            ((TextView) viewFindViewById).setText(C0TYC.LIZIZ(this.LLLIIII));
        }
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uS(X.InterfaceC1364105Vn<? super X.C470590Icr<webcast.api.room.MuteRuleAddResponse.ResponseData>> r20) {
        /*
            r19 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C468850Ia3
            r5 = r19
            if (r0 == 0) goto L25
            r6 = r3
            X.0Ia3 r6 = (X.C468850Ia3) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.LLILLL = r2
        L16:
            java.lang.Object r1 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            goto L8c
        L25:
            X.0Ia3 r6 = new X.0Ia3
            r6.<init>(r5, r3)
            goto L16
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L92
            java.lang.Class<com.bytedance.android.livesdk.function.MuteRuleApi> r0 = com.bytedance.android.livesdk.function.MuteRuleApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L92
            java.lang.Object r8 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L92
            com.bytedance.android.livesdk.function.MuteRuleApi r8 = (com.bytedance.android.livesdk.function.MuteRuleApi) r8     // Catch: java.lang.Exception -> L92
            X.01GW r0 = r5.LLLFZ     // Catch: java.lang.Exception -> L92
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L92
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L92
            long r9 = r0.longValue()     // Catch: java.lang.Exception -> L92
            X.01GW r0 = r5.LLLI     // Catch: java.lang.Exception -> L92
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L92
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L92
            long r11 = r0.longValue()     // Catch: java.lang.Exception -> L92
            com.bytedance.android.live.design.widget.LiveEditText r7 = r5.zS()     // Catch: java.lang.Exception -> L92
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6i5qfP8xlUTU2p2v5UQGOxs8ySUUrl+V/LCUjWqEEt30EcltNBv9fEEbhQ=="
            r1.<init>(r0, r2)     // Catch: java.lang.Exception -> L92
            android.text.Editable r0 = X.C2204961BRm.LLLFZ(r7, r1)     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L89
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)     // Catch: java.lang.Exception -> L92
        L72:
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L92
            r14 = 0
            X.0TLc r0 = r5.LLLIIII     // Catch: java.lang.Exception -> L92
            long r0 = r0.LIZ     // Catch: java.lang.Exception -> L92
            r6.LLILLL = r3     // Catch: java.lang.Exception -> L92
            r18 = r6
            r16 = r0
            java.lang.Object r1 = r8.addMuteRule(r9, r11, r13, r14, r16, r18)     // Catch: java.lang.Exception -> L92
            if (r1 != r4) goto L8f
            goto L8b
        L89:
            r0 = r2
            goto L72
        L8b:
            return r4
        L8c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L92
        L8f:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L92
            return r1
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r5.wS(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet.uS(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r3
      0x0027: PHI (r3v1 android.view.View) = (r3v0 android.view.View), (r3v3 android.view.View) binds: [B:7:0x0011, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wS(java.lang.Exception r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C477520Io2
            if (r0 == 0) goto L3a
            X.0Jle r5 = (X.C501520Jle) r5
            int r1 = r5.getErrorCode()
            int r0 = r4.LLLIIIL
            if (r1 != r0) goto L3d
            android.widget.LinearLayout r3 = r4.LLJZIJLIL
            r2 = 0
            if (r3 != 0) goto L27
            android.view.View r1 = r4.getView()
            if (r1 == 0) goto L3b
            r0 = 2131371174(0x7f0a24a6, float:1.8362375E38)
            android.view.View r3 = r1.findViewById(r0)
        L20:
            r0 = r3
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.LLJZIJLIL = r0
            if (r3 == 0) goto L37
        L27:
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L34
            r0 = 2130976148(0x7f041d94, float:1.7561167E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
        L34:
            r3.setBackground(r2)
        L37:
            r0 = 1
            r4.LLLIIL = r0
        L3a:
            return
        L3b:
            r3 = r2
            goto L20
        L3d:
            r0 = 2131837817(0x7f114379, float:1.930884E38)
            X.C766270U4b.LIZLLL(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet.wS(java.lang.Exception):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet = this.LLLII;
        if (liveMuteRulesFragmentSheet != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveMuteRulesFragmentSheet), null, null, new C750910Tcv(liveMuteRulesFragmentSheet, null), 3);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        this.LLLIIL = false;
        C786410Ut5.g8(yS(), new ACListenerS147S0100000_12(this, 118));
        View viewFindViewById = this.LLLF;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.oy0);
            } else {
                viewFindViewById = null;
            }
            this.LLLF = (ConstraintLayout) viewFindViewById;
        }
        C01C7.LIZIZ(new ACListenerS147S0100000_12(this, 119), viewFindViewById);
        LiveEditText liveEditTextZS = zS();
        if (bundle == null || (string = bundle.getString("content")) == null) {
            string = "";
        }
        liveEditTextZS.setText(string);
        zS().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.LLLIIIIL)});
        zS().addTextChangedListener(new C521830KdJ(this, liveEditTextZS, 0));
        View view3 = this.LLLFF;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.oxw);
            }
            this.LLLFF = (C16F5) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ((TextView) view3).setText(C0TYC.LIZIZ(this.LLLIIII));
        this.LLLIILIL = (C16F5) view.findViewById(R.id.tv_right_button);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c6e, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C16F5 c16f5 = this.LLLIILIL;
            if (c16f5 != null) {
                c16f5.setTextColor(iIntValue);
            }
        }
        C16F5 c16f52 = this.LLLIILIL;
        if (c16f52 != null) {
            c16f52.setClickable(false);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fxn, viewGroup, false);
    }
}
