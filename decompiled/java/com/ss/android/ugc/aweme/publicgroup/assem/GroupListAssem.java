package com.ss.android.ugc.aweme.publicgroup.assem;

import X.AbstractC1906720ziY;
import X.C019F;
import X.C01GW;
import X.C1228780i56;
import X.C1229670i6X;
import X.C1229680i6Y;
import X.C1229700i6a;
import X.C1229710i6b;
import X.C1229850i6p;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1617806Vc;
import X.C1637806bA;
import X.C19719912Dl;
import X.C21578619ce;
import X.C21688219uK;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C418440Gaw;
import X.C423520Gj8;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.publicgroup.view.GroupCell;
import com.ss.android.ugc.aweme.publicgroup.view.GroupEmptyCell;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupListAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1678));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1679));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1677));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1673));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1672));
    public final C1229710i6b LLJJJ = new AbstractC1906720ziY() { // from class: X.0i6b
        @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
        public final void onCreate() {
            LJIILIIL(GroupCell.class, GroupEmptyCell.class);
        }
    };
    public final C1229700i6a LLJJJIL = new AbstractC1906720ziY() { // from class: X.0i6a
        @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
        public final void onCreate() {
            LJIILIIL(GroupCell.class, GroupEmptyCell.class);
        }
    };
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1671));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1674));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1675));
    public final C1559260qg8 LLJJL = new C1559260qg8(new C723590SZx(this, C1228780i56.class, null), checkSupervisorPrepared());
    public boolean LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJL;
    public C21688219uK LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLJLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publicgroup/vm/GroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0i6b] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0i6a] */
    public GroupListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupListViewModel.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1676), AFwS257S0000000_19.get$arr$(251), null, true);
        this.LLJLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(293));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cj9;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv hp() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIJIL.getValue();
    }

    public final GroupListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (GroupListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    public final void kp(boolean z) {
        String string;
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) this.LLJJIJIIJIL.getValue();
            Context context = tuxTextView.getContext();
            if (context == null || (string = context.getString(2131831857)) == null) {
                string = "";
            }
            tuxTextView.setText(string);
            tuxTextView.setTextColorRes(R.attr.a1h);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            return;
        }
        C337180DJs.LIZ((View) this.LLJJIJIIJIL.getValue());
    }

    @C14EU
    public final void onPublicGroupCreateFinishEvent(C1617806Vc c1617806Vc) {
        if (c1617806Vc.LIZ) {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLJLL.getValue(), null, null, new C1229670i6X(this, null), 3);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C21688219uK c21688219uK = new C21688219uK(new C1229850i6p(ip(), (C21578619ce) this.LLJJJJLIIL.getValue()));
        c21688219uK.LJ(hp());
        this.LLJLIL = c21688219uK;
        hp().LIZJ(this.LLJJJ);
        hp().LIZJ(this.LLJJJIL);
        LJII((View) this.LLJJI.getValue());
        LJII((View) this.LLJJIJIIJIL.getValue());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvHp = hp();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvHp.getContext());
        linearLayoutManager.setOrientation(1);
        viewOnAttachStateChangeListenerC20604515jvHp.setLayoutManager(linearLayoutManager);
        viewOnAttachStateChangeListenerC20604515jvHp.setItemAnimator(new C423520Gj8());
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0i6c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1229630i6T) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 264), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0i6V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1229630i6T) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), new AwS632S0100000_18(this, 265), 4);
        C736680Sv4.LJIIIZ(this, ip(), new C2217381BqS() { // from class: X.0i6d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1229630i6T) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0i6e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1229630i6T) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS668S0100000_19(this, 6), 8);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0i6W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1229630i6T) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 263), 4);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLJLL.getValue(), null, null, new C1229680i6Y(this, null), 3);
    }
}
