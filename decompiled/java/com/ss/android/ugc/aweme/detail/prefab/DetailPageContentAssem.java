package com.ss.android.ugc.aweme.detail.prefab;

import X.C20746816Gk;
import X.C2097608Jq;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageContentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class DetailPageContentAssem extends DynamicAssem implements DetailPageContentAbility {
    public View LLJJI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> kp() {
        return C2097608Jq.LJIIIIZZ(new Pair("header", Integer.valueOf(R.id.frd)), new Pair("content", Integer.valueOf(R.id.fre)));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        ViewGroup viewGroup;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C20746816Gk c20746816Gk = new C20746816Gk(context);
        c20746816Gk.setId(R.id.frc);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20746816Gk);
        c20746816Gk.setLayoutParams(layoutParams);
        Zo(c20746816Gk);
        View contentView = getContentView();
        if ((contentView instanceof ViewGroup) && (viewGroup = (ViewGroup) contentView) != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
            frameLayout.setId(R.id.frd);
            viewGroup.addView(frameLayout);
            FrameLayout frameLayout2 = new FrameLayout(context);
            C786410Ut5.a6(frameLayout2, new ViewGroup.LayoutParams(-1, -2));
            frameLayout2.setId(R.id.fre);
            this.LLJJI = frameLayout2;
            viewGroup.addView(frameLayout2);
        }
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageContentAbility
    public final View Ih2() {
        return this.LLJJI;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.detail.prefab.DetailPageContentAssem for r11v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.prefab.DetailPageContentAssem.onViewCreated(android.view.View):void");
    }
}
