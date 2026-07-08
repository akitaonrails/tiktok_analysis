package com.ss.android.ugc.aweme.poi.detail.cells;

import X.C19M4;
import X.C426750GoL;
import X.C430000Gta;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiHotelCardCell extends PoiBaseCardCell {
    public SmartImageView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public C19M4 LLJJL;
    public C430000Gta LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public C19M4 LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public View LLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e1q;
    }

    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJ = (SmartImageView) view.findViewById(R.id.f58);
        this.LLJJJIL = (TuxTextView) view.findViewById(R.id.r4z);
        this.LLJJJJ = (TuxTextView) view.findViewById(R.id.raq);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.qw2);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.r1w);
        this.LLJJL = (C19M4) view.findViewById(R.id.re8);
        this.LLJJLIIIJLLLLLLLZ = (C430000Gta) view.findViewById(R.id.x2s);
        this.LLJL = (TuxTextView) view.findViewById(R.id.r83);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.r1t);
        this.LLJLILLLLZIIL = (C19M4) view.findViewById(R.id.r1s);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.zhm);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.zhn);
        this.LLJLLL = view.findViewById(R.id.fkf);
        if (C426750GoL.LIZLLL(view.getContext())) {
            TuxTextView tuxTextView = this.LLJJJIL;
            if (tuxTextView != null) {
                tuxTextView.setTextDirection(4);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJJIL;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setTextDirection(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01fe  */
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
    @Override // com.ss.android.ugc.aweme.slash.cell.arc.SlashCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zp(com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel r17) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.cells.PoiHotelCardCell.zp(com.ss.android.ugc.aweme.slash.cell.arc.SlashCellModel):void");
    }
}
