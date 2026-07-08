package com.ss.android.ugc.tiktok.addyours.hub.assem;

import X.C01GW;
import X.C0O2K;
import X.C11JF;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.tiktok.addyours.hub.viewmodel.AddYoursHubListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS553S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursHubItemCellAssem extends ReusedUISlotAssem<AddYoursHubItemCellAssem> implements InterfaceC712990Rxx<C0O2K>, ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIII;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public LinearLayout LLJLIL;
    public C197039127h LLJLILLLLZIIL;
    public SmartImageView LLJLL;
    public TuxTextView LLJLLIL;
    public ConstraintLayout LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxIconView LLL;
    public C11JF LLLFF;
    public final InterfaceC1731706qJ LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public int LLLF = -1;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1634));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddYoursHubItemCellAssem.class, "hubListVM", "getHubListVM()Lcom/ss/android/ugc/tiktok/addyours/hub/viewmodel/AddYoursHubListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AddYoursHubItemCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddYoursHubListViewModel.class);
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS548S0100000_4(c19719912DlLIZ, 390), null, AFwS240S0000000_9.get$arr$(692));
        this.LLLI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 389));
        this.LLLII = C452501pT.LIZIZ(new AwS548S0100000_4(this, 391));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.m8;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final void Ap() {
        int i = this.LLLF;
        if (i <= 1) {
            C426750GoL.LJIIIZ(zp(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, false, 29);
        } else if (i <= 2) {
            C426750GoL.LJIIIZ(zp(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), null, null, false, 29);
        } else {
            C426750GoL.LJIIIZ(zp(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), null, null, false, 29);
        }
    }

    public final void sp() {
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v65) : null;
            this.LLJL = (TuxIconView) viewFindViewById;
        }
        TuxIconView tuxIconView = (TuxIconView) viewFindViewById;
        C339190DRl.LIZLLL(tuxIconView);
        tuxIconView.setImageDrawable((Drawable) this.LLLI.getValue());
        C786410Ut5.I7(new AbS691S0100000_9(this, 39, 42, 42), tuxIconView);
    }

    public final C197039127h tp() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kz0) : null;
            this.LLJLILLLLZIIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final LinearLayout up() {
        View viewFindViewById = this.LLJLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kze) : null;
            this.LLJLIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final TuxTextView yp() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.yeh) : null;
            this.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SmartImageView zp() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.video_cover) : null;
            this.LLJLL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C11JF c11jf;
        C786410Ut5.C3(yp().getViewTreeObserver(), this);
        C11JF c11jf2 = this.LLLFF;
        if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LLLFF) == null) {
            return;
        }
        c11jf.dispose();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (yp().getWidth() <= 0) {
            return;
        }
        this.LLLF = yp().getLineCount();
        Ap();
        C786410Ut5.C3(yp().getViewTreeObserver(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void op(com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem r14) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem.op(com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0206  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C0O2K r14) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0O2K c0o2k) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0O2K c0o2k) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
