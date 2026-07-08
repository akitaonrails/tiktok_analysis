package com.ss.android.ugc.aweme.live.livehostimpl.livereply.clip;

import X.C1143680frq;
import X.C1143780fs0;
import X.C1308910kAL;
import X.C197039127h;
import X.C786410Ut5;
import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public class LiveClipBottomConfirmDialog extends LiveBaseSheetDialog {
    public final boolean LLJLILLLLZIIL;
    public final Function0<Unit> LLJLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View rootView;
        int iIntValue;
        super.onCreate(bundle);
        setContentView(R.layout.dbt);
        View viewFindViewById = findViewById(R.id.eu1);
        if (viewFindViewById != null && (rootView = viewFindViewById.getRootView()) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            rootView.setBackgroundColor(iIntValue);
        }
        if (this.LLJLILLLLZIIL) {
            TextView textView = (TextView) findViewById(R.id.n5d);
            TextView textView2 = (TextView) findViewById(R.id.n5b);
            TextView textView3 = (TextView) findViewById(R.id.n5_);
            if (textView != null) {
                textView.setText(2131843966);
            }
            if (textView2 != null) {
                textView2.setText(2131843965);
            }
            if (textView3 != null) {
                textView3.setText(2131843964);
            }
        }
        C197039127h c197039127h = (C197039127h) findViewById(R.id.n5_);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS161S0100000_27(this, 42));
        }
        View viewFindViewById2 = findViewById(R.id.mww);
        if (viewFindViewById2 != null) {
            C1143680frq.LJI(viewFindViewById2, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_1", "live_edit_guide_instruction.png"), null, true);
        }
    }

    public LiveClipBottomConfirmDialog(Context context, boolean z, AwS571S0100000_27 awS571S0100000_27, AwS571S0100000_27 awS571S0100000_272) {
        super(context);
        this.LLJLILLLLZIIL = z;
        this.LLJLL = awS571S0100000_272;
        awS571S0100000_27.invoke();
    }
}
