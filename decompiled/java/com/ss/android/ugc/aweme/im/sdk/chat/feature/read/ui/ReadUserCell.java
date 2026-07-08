package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.ui;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C05QS;
import X.C0NYY;
import X.C0O26;
import X.C0O27;
import X.C0O28;
import X.C0PEM;
import X.C0ZE7;
import X.C0ZE8;
import X.C13LE;
import X.C1462005nu;
import X.C1480105qp;
import X.C19719912Dl;
import X.C19727912Gn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C452080Ho6;
import X.C452501pT;
import X.C595660NXw;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C892130YzD;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897520ZIw;
import X.EnumC1910440zoY;
import X.InterfaceC1364105Vn;
import X.InterfaceC1480505qt;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC897380ZIi;
import Y.ACListenerS50S0400000_14;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.ui.ReadUserCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadUserListViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ReadUserCell extends PowerCell<C0O27> implements C0NYY {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public boolean LLILLJJLI;
    public C0O27 LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReadUserCell.class, "readUsersVM", "getReadUsersVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/read/viewmodel/ReadUserListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cmp;
    }

    public ReadUserCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReadUserListViewModel.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 713);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(139);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 695), awS575S0100000_31, AFwS221S0000000_31.get$arr$(194), new AwS575S0100000_31((C03K6) this, 698), new AwS575S0100000_31((C03K6) this, OppoPermissionPopupMaskDelayExp.DEFAULT), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 702), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 704), null, new AwS575S0100000_31((C03K6) this, 705));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS575S0100000_31 awS575S0100000_312 = new AwS575S0100000_31((C03K6) this, 699);
            AwS575S0100000_31 awS575S0100000_313 = new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 701);
            AwS575S0100000_31 awS575S0100000_314 = new AwS575S0100000_31(c19719912DlLIZ, 703);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS432S0200000_31((InterfaceC451590HnJ) obj, awS575S0100000_312, 51));
            AwS575S0100000_31 awS575S0100000_315 = new AwS575S0100000_31(c01gwLIZIZ, 706);
            AwS575S0100000_31 awS575S0100000_316 = new AwS575S0100000_31(c01gwLIZIZ, 708);
            AwS575S0100000_31 awS575S0100000_317 = new AwS575S0100000_31(c01gwLIZIZ, 709);
            AwS575S0100000_31 awS575S0100000_318 = new AwS575S0100000_31(c01gwLIZIZ, 710);
            AwS575S0100000_31 awS575S0100000_319 = new AwS575S0100000_31(c01gwLIZIZ, 711);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS575S0100000_314, awS575S0100000_31, new C452080Ho6(), awS575S0100000_315, awS575S0100000_316, awS575S0100000_313, aFwS276S0000000_31, awS575S0100000_317, awS575S0100000_318, awS575S0100000_319);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 712), awS575S0100000_31, AFwS221S0000000_31.get$arr$(195), new AwS575S0100000_31((C03K6) this, 714), new AwS575S0100000_31((C03K6) this, 715), new AwS575S0100000_31((HasDefaultViewModelProviderFactory) this, 716), aFwS276S0000000_31, new AwS575S0100000_31((C03K6) this, 717), null, new AwS575S0100000_31((C03K6) this, 718));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS575S0100000_31(c19719912DlLIZ, 719), awS575S0100000_31, AFwS221S0000000_31.get$arr$(196), new AwS575S0100000_31((C03K6) this, 720), new AwS575S0100000_31((C03K6) this, 721), new AwS575S0100000_31((C03K6) this, 722), aFwS276S0000000_31, null, null, new AwS575S0100000_31((C03K6) this, 723));
        }
        this.LL = assemVMLazy;
        this.LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 707));
        this.LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 697));
        this.LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 696));
    }

    public final void I5(boolean z) {
        String uid;
        C1462005nu c1462005nu;
        if (z) {
            C786410Ut5.d0((C19727912Gn) this.LLILZLL.getValue(), 0);
            ((C19727912Gn) this.LLILZLL.getValue()).setActive(true);
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
            c0ze7.LJII = Boolean.TRUE;
            c0ze7.LIZIZ(EnumC1910440zoY.DM_SEEN_TAB);
            C0O27 item = getItem();
            if (item != null && (c1462005nu = item.LL) != null) {
                uid = c1462005nu.getUid();
            } else {
                uid = null;
            }
            c0ze7.LIZJ = uid;
            C0ZE8.LJIIIZ(c0ze7);
            return;
        }
        C786410Ut5.d0((C19727912Gn) this.LLILZLL.getValue(), 8);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        final C0O27 c0o27 = (C0O27) interfaceC1891350zJl;
        super.onBindItemView(c0o27);
        this.LLILLL = c0o27;
        InterfaceC897380ZIi.LIZIZ.getClass();
        boolean zLIZJ = C896480ZEw.LIZJ(C897370ZIh.LIZ().LIZIZ(C0O26.LIZJ(AFwS257S0000000_19.get$arr$(805), c0o27.LL)));
        this.LLILLJJLI = zLIZJ;
        I5(zLIZJ);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(assemVMLazy.getValue()), C0PEM.LIZJ, null, new C1480105qp(c0o27.LL.getUid(), c0o27.LL.getSecUid(), new InterfaceC1480505qt() { // from class: X.0ZIm
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                String uid;
                C1462005nu c1462005nu;
                ReadUserCell readUserCell = this.LIZ;
                C0O27 c0o272 = c0o27;
                readUserCell.getClass();
                if (iMUser != null) {
                    String uid2 = c0o272.LL.getUid();
                    C0O27 item = readUserCell.getItem();
                    if (item != null && (c1462005nu = item.LL) != null) {
                        uid = c1462005nu.getUid();
                    } else {
                        uid = null;
                    }
                    if (Intrinsics.LJFF(uid2, uid)) {
                        C427660Gpo.LJIIJJI((C427660Gpo) readUserCell.LLILZIL.getValue(), C438710HIf.LIZ(iMUser.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1006);
                        ((TextView) readUserCell.LLILZ.getValue()).setText(C892130YzD.LIZ(iMUser, c0o272.LLILLJJLI));
                        IMUser.Companion.getClass();
                        C786410Ut5.I7(new ACListenerS50S0400000_14(c0o272, iMUser, readUserCell, C2201941BFw.LJII(iMUser), 3), readUserCell.itemView);
                    }
                }
            }
        }, null), 2);
        C897520ZIw c897520ZIwVQ2 = ((ReadUserListViewModel) this.LL.getValue()).vQ2();
        if (c897520ZIwVQ2 != null) {
            c897520ZIwVQ2.LIZIZ(true, this);
        }
    }

    @Override // X.C0NYY
    public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1462005nu c1462005nu;
        String uid;
        C0O27 c0o27 = this.LLILLL;
        if (c0o27 != null && (c1462005nu = c0o27.LL) != null && (uid = c1462005nu.getUid()) != null) {
            C595660NXw c595660NXw = map.get(uid);
            if (c595660NXw == null) {
                return Unit.LIZ;
            }
            I5(C896480ZEw.LIZJ(c595660NXw));
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        String strLIZ;
        C0O27 c0o27 = (C0O27) interfaceC1891350zJl;
        if (list.isEmpty()) {
            super.onBindItemView(c0o27, list);
            return;
        }
        for (Object obj : list) {
            if ((obj instanceof C0O28) && ((C0O28) obj).LIZ) {
                TextView textView = (TextView) this.LLILZ.getValue();
                IMUser iMUserLIZ = C05QS.LIZ(c0o27.LL);
                if (iMUserLIZ != null) {
                    strLIZ = C892130YzD.LIZ(iMUserLIZ, c0o27.LLILLJJLI);
                } else {
                    strLIZ = null;
                }
                textView.setText(strLIZ);
            }
        }
    }
}
