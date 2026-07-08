package com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list;

import X.C09RD;
import X.C09RE;
import X.C1119920fFW;
import X.C1126540fQC;
import X.C1126570fQF;
import X.C1146080fvi;
import X.C11NJ;
import X.C1239300iM4;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1697810uHb;
import X.C16F5;
import X.C1819620xS4;
import X.C426160GnO;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS152S0100000_17;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorRecordGiftCell extends PowerCell<C1146080fvi> {
    public C1324720kZq LL;
    public C16F5 LLILLJJLI;
    public C16F5 LLILLL;
    public C1126540fQC LLILZ;
    public C16F5 LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public C426160GnO LLIZLLLIL;
    public C16F5 LLJ;
    public FrameLayout LLJI;
    public LinearLayout LLJIJIL;
    public LiveIconView LLJILJIL;
    public C1146080fvi LLJILLL;
    public final C11NJ LLJILJILJ = new C11NJ();
    public final ACListenerS152S0100000_17 LLJJ = new ACListenerS152S0100000_17(this, 37);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemViewCreated() {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordGiftCell.onItemViewCreated():void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TextView textView;
        C1146080fvi c1146080fvi = (C1146080fvi) interfaceC1891350zJl;
        super.onBindItemView(c1146080fvi);
        this.LLJILJILJ.LJ();
        this.LLJILLL = c1146080fvi;
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c1146080fvi.LLILLJJLI);
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el9;
        c1324610kZfLJIIIZ.LJJI(this.LL);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(c1146080fvi.LLILLL);
        }
        C16F5 c16f52 = this.LLILLJJLI;
        if (c16f52 != null) {
            c16f52.setText(c1146080fvi.LLILZ);
        }
        this.LLJILJILJ.LIZ(C1239300iM4.LJ(C1126570fQF.LIZIZ(this.LLILZ, c1146080fvi.LLILZIL, R.drawable.et9, C439101nJ.LIZ(48), C439101nJ.LIZ(48)), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, AFwS254S0000000_17.get$arr$(266)));
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 != null) {
            c16f53.setText(c1146080fvi.LLILZLL);
        }
        C16F5 c16f54 = this.LLIZ;
        if (c16f54 != null) {
            c16f54.setText(String.valueOf(c1146080fvi.LLIZ));
        }
        Long l = c1146080fvi.LLJILLL;
        if (l != null) {
            C16F5 c16f55 = this.LLJ;
            if (c16f55 != null) {
                c16f55.setText(l.toString());
            }
            LinearLayout linearLayout = this.LLJIJIL;
            if (linearLayout != null) {
                C500260Jjc.LLFFF(linearLayout);
            }
            FrameLayout frameLayout = this.LLJI;
            if (frameLayout != null) {
                C500260Jjc.LJJLJLI(C439101nJ.LIZ(8), frameLayout);
            }
        } else {
            LinearLayout linearLayout2 = this.LLJIJIL;
            if (linearLayout2 != null) {
                C500260Jjc.LJIILIIL(linearLayout2);
            }
            FrameLayout frameLayout2 = this.LLJI;
            if (frameLayout2 != null) {
                C500260Jjc.LJJLJLI(C439101nJ.LIZ(16), frameLayout2);
            }
        }
        C426160GnO c426160GnO = this.LLIZLLLIL;
        if (c426160GnO != null) {
            if (c1146080fvi.LLIZLLLIL.isEmpty()) {
                C500260Jjc.LJIILIIL(c426160GnO);
                return;
            }
            int size = c1146080fvi.LLIZLLLIL.size() - c426160GnO.getChildCount();
            int i = 0;
            if (1 <= size) {
                int i2 = 1;
                while (true) {
                    C16F5 c16f56 = new C16F5(this.itemView.getContext(), null);
                    c16f56.setBackgroundResource(R.drawable.dt8);
                    c16f56.setPadding(C439101nJ.LIZ(4), C439101nJ.LIZ(2), C439101nJ.LIZ(4), C439101nJ.LIZ(2));
                    c16f56.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, this.itemView.getContext()));
                    c16f56.setTypeface(C1119920fFW.LIZJ(C497740JfY.LIZIZ(12), 500, this.itemView.getContext()));
                    c16f56.setMaxLines(1);
                    c16f56.setEllipsize(TextUtils.TruncateAt.END);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.setMargins(0, C439101nJ.LIZ(4), C439101nJ.LIZ(4), 0);
                    c426160GnO.addView(c16f56, marginLayoutParams);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            Iterator<View> it2 = new C09RD(c426160GnO).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                } else {
                    C500260Jjc.LJIILIIL((View) c09re.next());
                }
            }
            for (String str : c1146080fvi.LLIZLLLIL) {
                int i3 = i + 1;
                if (i >= 0) {
                    String str2 = str;
                    View childAt = c426160GnO.getChildAt(i);
                    if ((childAt instanceof C16F5) && (textView = (TextView) childAt) != null) {
                        textView.setText(str2);
                        C500260Jjc.LLFFF(textView);
                    }
                    i = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C500260Jjc.LLFFF(c426160GnO);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpe, viewGroup, false);
    }
}
