package com.ss.android.ugc.tiktok.addyours.collection;

import X.C019F;
import X.C01GW;
import X.C0P4N;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C615070OAn;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursCollectionCellAssem extends ReusedUISlotAssem<AddYoursCollectionCellAssem> implements InterfaceC712990Rxx<C615070OAn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public View LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public final AssemVMLazy LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursCollectionCellAssem.class, "collectionVM", "getCollectionVM()Lcom/ss/android/ugc/tiktok/addyours/collection/AddYoursCollectionListVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddYoursCollectionCellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursCollectionListVM.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 387), AFwS240S0000000_9.get$arr$(679), null, true);
        this.LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1624));
        this.LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1625));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 388));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.m_;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.e7h);
        this.LLJL = (SmartImageView) view.findViewById(R.id.e7b);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.e7m);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.e7n);
        this.LLJLL = view.findViewById(R.id.e7j);
        view.setOnLongClickListener(new C0P4N(this, 3));
        View view2 = this.LLJJLIIIJLLLLLLLZ;
        if (view2 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 37, 42), view2);
        }
        View view3 = this.LLJLL;
        if (view3 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 38, 42), view3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C615070OAn r8) {
        /*
            r7 = this;
            X.0OAn r8 = (X.C615070OAn) r8
            com.bytedance.tux.input.TuxTextView r2 = r7.LLJLIL
            if (r2 == 0) goto L15
            X.0OAz r1 = r8.LLJ
            if (r1 == 0) goto L65
            boolean r0 = r8.LLIZLLLIL
            if (r0 == 0) goto L62
            java.lang.String r0 = r1.LIZLLL
        L10:
            if (r0 == 0) goto L65
        L12:
            r2.setText(r0)
        L15:
            com.bytedance.tux.input.TuxTextView r6 = r7.LLJLILLLLZIIL
            r4 = 1
            if (r6 == 0) goto L38
            android.view.View r0 = r7.getContentView()
            android.content.res.Resources r5 = r0.getResources()
            long r0 = r8.LLILZIL
            int r3 = (int) r0
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r1 = X.C1843500y4a.LIZIZ(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131755080(0x7f100048, float:1.914103E38)
            java.lang.String r0 = r5.getQuantityString(r0, r3, r2)
            r6.setText(r0)
        L38:
            com.bytedance.lighten.loader.SmartImageView r3 = r7.LLJL
            if (r3 == 0) goto L61
            X.01GW r0 = r7.LLJZIJLIL
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r3.setImageDrawable(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.LLILZ
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZ(r0)
            X.0kl3 r2 = X.C1331660kl2.LJIIIIZZ(r0)
            r2.LJJ(r3)
            r2.LIZLLL = r4
            X.0P4n r1 = new X.0P4n
            r0 = 0
            r1.<init>(r3, r7, r0)
            r2.LJIIL(r1)
        L61:
            return
        L62:
            java.lang.String r0 = r1.LIZJ
            goto L10
        L65:
            java.lang.String r0 = r8.LLILLL
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionCellAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C615070OAn c615070OAn) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C615070OAn c615070OAn) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
