package com.ss.android.ugc.aweme.anchor;

import X.AbstractC738140SxQ;
import X.C0I7D;
import X.C1266020j3A;
import X.C13LE;
import X.C1559260qg8;
import X.C197039127h;
import X.C19719912Dl;
import X.C19M4;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnFocusChangeListenerC1265950j33;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AddAnchorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public TuxIconView LLJJI;
    public C19M4 LLJJIII;
    public C197039127h LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public C0I7D LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final C1559260qg8 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddAnchorAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/anchor/AddAnchorViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.lz;
    }

    public final C0I7D hp() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.mr_) : null;
            this.LLJJIJIL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final AddAnchorViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (AddAnchorViewModel) assemVMLazy.getValue();
    }

    public AddAnchorAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AddAnchorViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 370);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(68);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((AbstractC738140SxQ) this, 371), aFwS257S0000000_19, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJJ = assemVMLazy;
        this.LLJJJIL = new C1559260qg8(new C723590SZx(this, AddAnchorParam.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String string;
        super.onCreate();
        AddAnchorViewModel addAnchorViewModelIp = ip();
        Context context = getContext();
        if (context == null || (string = context.getString(2131826685)) == null) {
            string = "";
        }
        addAnchorViewModelIp.LLILZIL = string;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0hua
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1222290hud) obj).LLILLJJLI);
            }
        }, null, new AwS633S0100000_19(this, 220), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0hub
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1222290hud) obj).LL;
            }
        }, null, AFwS303S0000000_19.get$arr$(32), 6);
        View viewFindViewById = this.LLJJI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.dat);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (TuxIconView) viewFindViewById;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById, new ACListenerS154S0100000_19(this, 202));
        View viewFindViewById3 = this.LLJJIII;
        if (viewFindViewById3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.rom);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJJIII = (C19M4) viewFindViewById3;
        }
        C786410Ut5.c9((C19M4) viewFindViewById3, new ACListenerS154S0100000_19(this, 203));
        View viewFindViewById4 = this.LLJJIJI;
        if (viewFindViewById4 == null) {
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById4 = viewLJJIJL3.findViewById(R.id.eom);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJJIJI = (C197039127h) viewFindViewById4;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById4, new ACListenerS154S0100000_19(this, 204));
        View view2 = this.LLJJIJIIJIL;
        if (view2 == null) {
            View viewLJJIJL4 = LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById2 = viewLJJIJL4.findViewById(R.id.e06);
            }
            this.LLJJIJIIJIL = (TuxIconView) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) view2, new ACListenerS154S0100000_19(this, 205));
        hp().addTextChangedListener(new C1266020j3A(this, 16));
        hp().setOnFocusChangeListener(new ViewOnFocusChangeListenerC1265950j33(this, 4));
    }
}
