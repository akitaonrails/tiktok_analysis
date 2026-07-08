package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C457810HxL;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC457820HxM;
import X.InterfaceC1146704e9;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinInputLayoutAssem extends IMInputAssem implements InterfaceC1146704e9 {
    public final C1559260qg8 LLJLL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJLLIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void kp() {
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem
    public final void hp() {
        EnumC457820HxM enumC457820HxM = EnumC457820HxM.SLOT_LEFT_AREA;
        C457810HxL.LIZ(this, enumC457820HxM, AFwS279S0000000_33.get$arr$(183));
        if (((BulletinProfileViewModel) this.LLJLLIL.getValue()).QQ2()) {
            C457810HxL.LIZ(this, enumC457820HxM, AFwS279S0000000_33.get$arr$(184));
        }
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_RIGHT_AREA, AFwS279S0000000_33.get$arr$(185));
        C457810HxL.LIZ(this, EnumC457820HxM.SLOT_PANEL, AFwS236S0000000_6.get$arr$(192));
    }

    public BulletinInputLayoutAssem() {
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 2486);
        this.LLJLLIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS577S0100000_33, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS279S0000000_33.get$arr$(186), new AwS577S0100000_33((AbstractC738140SxQ) this, 2487), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.ss.android.ugc.aweme.im.assem.IMInputAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0OW1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILZLL;
            }
        }, null, new AwS647S0100000_33(this, 23), 6);
    }
}
