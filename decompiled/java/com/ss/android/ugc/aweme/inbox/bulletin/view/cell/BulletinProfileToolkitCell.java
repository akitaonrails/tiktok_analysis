package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0OSB;
import X.C1196320hEk;
import X.C1220000hqw;
import X.C13LE;
import X.C1546210qL5;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C384050F3z;
import X.C452070Ho5;
import X.C452080Ho6;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinToolkitModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS500S0200000_9;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinProfileToolkitCell extends PowerCell<BulletinToolkitModel> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(362));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2593));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2573));
    public final C736950SvV LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinProfileToolkitCell.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7y;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    public BulletinProfileToolkitCell() {
        AssemVMLazy assemVMLazy;
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this, 2579);
        this.LLILZ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS577S0100000_33, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS279S0000000_33.get$arr$(193), null, null, null);
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c19719912DlLIZ, 2596);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(192);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2578), awS577S0100000_332, AFwS224S0000000_33.get$arr$(361), new AwS577S0100000_33((C03K6) this, 2580), new AwS577S0100000_33((C03K6) this, 2582), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2584), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2586), null, new AwS577S0100000_33((C03K6) this, 2587));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((C03K6) this, 2581);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2583);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c19719912DlLIZ, 2585);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_333, 99));
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2588);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2589);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2590);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2592);
            AwS577S0100000_33 awS577S0100000_3310 = new AwS577S0100000_33(c01gwLIZIZ, 2594);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_335, awS577S0100000_332, new C452080Ho6(), awS577S0100000_336, awS577S0100000_337, awS577S0100000_334, aFwS279S0000000_33, awS577S0100000_338, awS577S0100000_339, awS577S0100000_3310);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2595), awS577S0100000_332, AFwS224S0000000_33.get$arr$(363), new AwS577S0100000_33((C03K6) this, 2597), new AwS577S0100000_33((C03K6) this, 2598), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2599), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2600), null, new AwS577S0100000_33((C03K6) this, 2601));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2602), awS577S0100000_332, AFwS224S0000000_33.get$arr$(364), new AwS577S0100000_33((C03K6) this, 2603), new AwS577S0100000_33((C03K6) this, 2572), new AwS577S0100000_33((C03K6) this, 2574), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2576));
        }
        this.LLILZIL = assemVMLazy;
        this.LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2577));
        this.LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2575));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2591));
    }

    public final BulletinProfileViewModel I5() {
        return (BulletinProfileViewModel) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = (View) this.LLILZLL.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        C1546210qL5.LIZ.getClass();
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(22));
        view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 196));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        BulletinToolkitModel bulletinToolkitModel = (BulletinToolkitModel) interfaceC1891350zJl;
        super.onBindItemView(bulletinToolkitModel);
        C0OSB.LJFF((TuxIconView) this.LLIZ.getValue(), bulletinToolkitModel.getIconUrlModel(), null);
        ((TextView) this.LLIZLLLIL.getValue()).setText(bulletinToolkitModel.getName());
        C786410Ut5.I7(new AbS500S0200000_9(this, bulletinToolkitModel, 0, 42), this.itemView);
    }
}
