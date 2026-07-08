package com.ss.android.ugc.profile.business.effect.adapter;

import X.C0I7W;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C317950CdF;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.InterfaceC1334290kpH;
import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class EffectProfileDraftViewHolder extends JediSimpleViewHolder<C317950CdF> {
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public EffectProfileDraftViewHolder(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ecg, viewGroup, false));
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.g53).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.M6((TuxIconView) this.itemView.findViewById(R.id.g53), layoutParams);
        }
        ((TuxTextView) this.itemView.findViewById(R.id.g54)).setTuxFont(72);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(C317950CdF c317950CdF) {
        String string;
        C317950CdF c317950CdF2 = c317950CdF;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind(), ");
        sbLIZ.append(c317950CdF2);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("EffectProfileDraftViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        TextView textView = (TextView) this.itemView.findViewById(R.id.g54);
        int i = c317950CdF2.LIZ;
        Context context = this.itemView.getContext();
        if (context != null) {
            string = context.getString(2131820921);
        } else {
            string = null;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(": ");
        sbLIZ2.append(i);
        textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c317950CdF2.LIZIZ);
        c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.g52));
        c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LJIIIZ.LJJIJIL(new C0I7W(0.4f, 20, this.itemView.getContext()));
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C786410Ut5.I7(new ACListenerS108S0200000_4(c317950CdF2, this, 15), this.itemView);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("is_ame_data", "1");
        c2344009Gk.LIZJ(c317950CdF2.LIZ, "effect_draft_cnt");
        C20684815ws.LJIILLIIL("show_prop_draft_entry", c2344009Gk.LIZ);
    }
}
