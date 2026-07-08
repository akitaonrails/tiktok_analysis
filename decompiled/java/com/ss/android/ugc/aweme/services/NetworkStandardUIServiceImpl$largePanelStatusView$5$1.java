package com.ss.android.ugc.aweme.services;

import X.C09AY;
import X.C13LP;
import X.C1609910rzp;
import X.C197039127h;
import X.C341940Daq;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class NetworkStandardUIServiceImpl$largePanelStatusView$5$1 extends C09AY implements Function1<LinearLayout, Unit> {
    public final /* synthetic */ String $buttonDesc;
    public final /* synthetic */ String $diagnosisBtnDesc;
    public final /* synthetic */ Function0<Unit> $diagnosisFunc;
    public final /* synthetic */ Runnable $retryFunc;
    public final /* synthetic */ String $scene;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStandardUIServiceImpl$largePanelStatusView$5$1(String str, String str2, String str3, Runnable runnable, Function0<Unit> function0) {
        super(1);
        this.$buttonDesc = str;
        this.$scene = str2;
        this.$diagnosisBtnDesc = str3;
        this.$retryFunc = runnable;
        this.$diagnosisFunc = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = linearLayout;
        C197039127h c197039127h = new C197039127h(linearLayout2.getContext(), null, 6, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C341940Daq.LIZ(240.0d), C341940Daq.LIZ(48.0d));
        marginLayoutParams.bottomMargin = C341940Daq.LIZ(8.0d);
        C786410Ut5.J6(c197039127h, marginLayoutParams);
        c197039127h.setText(this.$buttonDesc);
        c197039127h.setButtonSize(3);
        c197039127h.LJJJJI(16.0f);
        if (C13LP.LJJJJ(this.$scene, C1609910rzp.LJ)) {
            c197039127h.setButtonVariant(1);
        }
        final Runnable runnable = this.$retryFunc;
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$largePanelStatusView$5$1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        C197039127h c197039127h2 = new C197039127h(linearLayout2.getContext(), null, 6, 0);
        C786410Ut5.J6(c197039127h2, new ViewGroup.LayoutParams(C341940Daq.LIZ(240.0d), C341940Daq.LIZ(48.0d)));
        c197039127h2.setText(this.$diagnosisBtnDesc);
        c197039127h2.setButtonVariant(1);
        c197039127h2.LJJJJI(16.0f);
        c197039127h2.setBackgroundColor(0);
        final Function0<Unit> function0 = this.$diagnosisFunc;
        C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$largePanelStatusView$5$1.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        linearLayout2.addView(c197039127h);
        linearLayout2.addView(c197039127h2);
        return Unit.LIZ;
    }
}
