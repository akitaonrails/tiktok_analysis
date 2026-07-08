package com.ss.android.ugc.aweme.detail.prefab;

import X.C01GW;
import X.C11JF;
import X.C11NZ;
import X.C1701940uOG;
import X.C19420310yP;
import X.C452501pT;
import X.C786410Ut5;
import Y.AfS178S0100000_9;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ShootAssem extends DynamicAssem implements PageHeaderScrollAbility {
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 105));
    public C19420310yP LLJJIII;
    public TuxIconView LLJJIJI;
    public TextView LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public C11JF LLJJJ;
    public boolean LLJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bkb;
    }

    public final ViewGroup lp() {
        ViewGroup viewGroup = this.LLJJIJIL;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final TuxIconView mp() {
        TuxIconView tuxIconView = this.LLJJIJI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TextView op() {
        TextView textView = this.LLJJIJIIJIL;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C19420310yP c19420310yP = this.LLJJIII;
        if (c19420310yP != null) {
            c19420310yP.stop();
        }
        C11JF c11jf = this.LLJJJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public void sp() {
        C786410Ut5.I7(new AbS691S0100000_9(this, 1, 42, 42), lp());
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
    public final void bq(int i) {
        C11JF c11jf = this.LLJJJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJJ = (C11JF) C11NZ.LJJJJZ(Integer.valueOf(i)).LJJI(300L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS178S0100000_9(this, 16));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.detail.prefab.ShootAssem for r10v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.prefab.ShootAssem.onViewCreated(android.view.View):void");
    }
}
