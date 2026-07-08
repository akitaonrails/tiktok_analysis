package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet;

import X.C07C3;
import X.C1308910kAL;
import X.C1331100kk8;
import X.C21565319aV;
import X.C301460Brk;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C434570H2h;
import X.C723830SaL;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceAwemeItemAssem extends BaseReferenceSheetItemAssem<C434570H2h> {
    public final int LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public SmartImageView LLJLLIL;
    public C427870Gq9 LLJLLL;
    public TuxTextView LLJZ;
    public TuxIconView LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public View LLLFF;
    public TuxIconView LLLFFI;
    public TuxTextView LLLFZ;
    public TuxIconView LLLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        int iLIZ = C07C3.LIZ();
        return iLIZ >= 1 ? iLIZ != 1 ? iLIZ != 2 ? iLIZ == 3 ? R.layout.ezl : R.layout.ezj : R.layout.ezk : R.layout.ezj : C301460Brk.LIZJ(Integer.valueOf(this.LLJLIL)) ? R.layout.ezc : R.layout.ezb;
    }

    public ReferenceAwemeItemAssem(int i) {
        this.LLJLIL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.BaseReferenceSheetItemAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        super.onViewCreated(view);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.tv_summary);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.ld7);
        int iIntValue = 0;
        C427870Gq9 c427870Gq9 = null;
        if (smartImageView != null) {
            if (C07C3.LIZ() >= 1) {
                C21565319aV.LIZIZ(smartImageView, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
            }
        } else {
            smartImageView = null;
        }
        this.LLJLLIL = smartImageView;
        int i = this.LLJLIL;
        if (i != 1 && i != 2) {
            if (i == 3 && (tuxTextView = this.LLJLL) != null) {
                tuxTextView.setMaxLines(3);
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setMaxLines(2);
            }
        }
        if (C07C3.LIZ() >= 1) {
            C427870Gq9 c427870Gq92 = (C427870Gq9) view.findViewById(R.id.l9f);
            if (c427870Gq92 != null) {
                C1331100kk8 c1331100kk8 = c427870Gq92.getHierarchy().LIZJ;
                if (c1331100kk8 != null) {
                    c1331100kk8.LJFF(C418440Gaw.LIZIZ(Float.valueOf(0.5f)));
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, view.getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    }
                    c1331100kk8.LJFF = iIntValue;
                }
                c427870Gq9 = c427870Gq92;
            }
            this.LLJLLL = c427870Gq9;
            this.LLJZ = (TuxTextView) view.findViewById(R.id.z_k);
            this.LLJZIJLIL = (TuxIconView) view.findViewById(R.id.lzb);
            this.LLL = (TuxTextView) view.findViewById(R.id.zj3);
            this.LLLF = (TuxTextView) view.findViewById(R.id.zh8);
            this.LLLFF = view.findViewById(R.id.mnd);
            this.LLLFFI = (TuxIconView) view.findViewById(R.id.ljp);
            this.LLLFZ = (TuxTextView) view.findViewById(R.id.zts);
            this.LLLI = (TuxIconView) view.findViewById(R.id.lyr);
            return;
        }
        C723830SaL.LIZ(this, null, new AwS585S0100000_6(this, 154));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.ReferenceAwemeItemAssem.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.BaseReferenceSheetItemAssem
    public final View sp(View view) {
        return view.findViewById(R.id.fz3);
    }
}
