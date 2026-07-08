package com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0OSB;
import X.C0P4M;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C698190Ra5;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC618410ONj;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinBoardEditViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinEditShowEntrypointCell extends PowerCell<BulletinBizResourceEntryToggle> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public C127K LLILLJJLI;
    public C127A LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinEditShowEntrypointCell.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinBoardEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinEditShowEntrypointCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinBoardEditViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2618);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(194);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2629), awS577S0100000_33, AFwS224S0000000_33.get$arr$(367), new AwS577S0100000_33((C03K6) this, 2604), new AwS577S0100000_33((C03K6) this, 2606), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2608), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2610), null, new AwS577S0100000_33((C03K6) this, 2611));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2605);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2607);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2609);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 100));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2612);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2613);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2614);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2615);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2616);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2617), awS577S0100000_33, AFwS224S0000000_33.get$arr$(365), new AwS577S0100000_33((C03K6) this, 2619), new AwS577S0100000_33((C03K6) this, 2620), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2621), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2622), null, new AwS577S0100000_33((C03K6) this, 2623));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2624), awS577S0100000_33, AFwS224S0000000_33.get$arr$(366), new AwS577S0100000_33((C03K6) this, 2625), new AwS577S0100000_33((C03K6) this, 2626), new AwS577S0100000_33((C03K6) this, 2627), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2628));
        }
        this.LL = assemVMLazy;
    }

    public final void I5() {
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            BulletinBizResourceEntryToggle item = getItem();
            c127a.LJIILJJIL(item != null && item.getStatus() == EnumC618410ONj.RESOURCE_ENTRY_STATUS_OPEN.getStatus());
        }
        C127A c127a2 = this.LLILLL;
        if (c127a2 != null) {
            c127a2.LJIIJJI(false);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C127M accessory;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a8h, viewGroup, false);
        C127K c127k = (C127K) viewTd.findViewById(R.id.txCell);
        this.LLILLJJLI = c127k;
        C127A c127a = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            c127a = (C127A) accessory;
        }
        this.LLILLL = c127a;
        return viewTd;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C698190Ra5 c698190Ra5LJII;
        C127K c127k;
        BulletinBizResourceEntryToggle bulletinBizResourceEntryToggle = (BulletinBizResourceEntryToggle) interfaceC1891350zJl;
        super.onBindItemView(bulletinBizResourceEntryToggle, list);
        if (list.isEmpty()) {
            C127K c127k2 = this.LLILLJJLI;
            if (c127k2 != null) {
                c127k2.setTitle(bulletinBizResourceEntryToggle.getName());
            }
            TuxImageModel iconUrlModel = bulletinBizResourceEntryToggle.getIconUrlModel();
            if (iconUrlModel != null && (c698190Ra5LJII = C0OSB.LJII(this.itemView.getContext(), iconUrlModel)) != null && (c127k = this.LLILLJJLI) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c698190Ra5LJII.LIZ;
                c419910GdJ.LIZLLL = c698190Ra5LJII.LIZIZ;
                c127k.setIcon(c419910GdJ);
            }
            I5();
        } else {
            I5();
        }
        C127A c127a = this.LLILLL;
        if (c127a != null) {
            c127a.LJIILLIIL(new C0P4M(this, 1));
        }
    }
}
