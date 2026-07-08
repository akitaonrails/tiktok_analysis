package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui;

import X.C019F;
import X.C01D1;
import X.C0KBH;
import X.C0KCF;
import X.C0KD0;
import X.C0KD3;
import X.C0KD8;
import X.C0KDA;
import X.C0KDR;
import X.C1135104cH;
import X.C1361400lX0;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1826730xdX;
import X.C19719912Dl;
import X.C19EG;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C497740JfY;
import X.C513380KBk;
import X.C513500KBw;
import X.C513550KCb;
import X.C513670KCn;
import X.C513680KCo;
import X.C513700KCq;
import X.C513720KCs;
import X.C513740KCu;
import X.C513750KCv;
import X.C513760KCw;
import X.C513770KCx;
import X.C513970KDr;
import X.C517520KRi;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C960203pA;
import X.C987103tV;
import X.EnumC513410KBn;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackagePageSheet extends LiveSheetFragment {
    public static final C513720KCs LLLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExHELIOSPTYlJyogO2sqJjo9LCQ4ICA9ZjUtKiQyLyA8KCg2ZjAlZxwmKhUtKiQyLyAcKCg2Gy0pLDs=";
    public EnumC513410KBn LLJLLL;
    public long LLJZIJLIL;
    public boolean LLLF;
    public final AssemVMLazy LLLFF;
    public ViewGroup LLLFFI;
    public C513700KCq LLLFZ;
    public Map<String, String> LLJZ = new LinkedHashMap();
    public C0KCF LLL = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0, 0, false, -1, 15);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackagePageSheet.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLI = new C513720KCs();
    }

    public SubPackagePageSheet() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        C0KBH c0kbh = new C0KBH(c19719912DlLIZ);
        C0KDA c0kda = new C0KDA();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0kbh, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C513740KCu(this), c0kda, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0kbh, new C513750KCv(this), c0kda, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0kbh, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C513760KCw(this), c0kda, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLFF = assemVMLazy;
    }

    public final C513700KCq uS() {
        if (this.LLLFZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C513700KCq.class, null);
            this.LLLFZ = interfaceC1555100qZQLIZIZ != null ? (C513700KCq) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLLFZ;
    }

    public final SubPackagePageAssemVM wS() {
        AssemVMLazy assemVMLazy = this.LLLFF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (SubPackagePageAssemVM) assemVMLazy.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C513700KCq c513700KCqUS;
        C513550KCb c513550KCb;
        C513550KCb c513550KCb2;
        C513550KCb c513550KCb3;
        super.onDestroy();
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), ISubPackagePageAbility.class, null);
        }
        if (wS().LLILLJJLI) {
            C513700KCq c513700KCqUS2 = uS();
            if (c513700KCqUS2 != null && (c513550KCb3 = c513700KCqUS2.LLJ) != null) {
                c513550KCb3.LIZIZ = "iap_loading";
            }
        } else if (wS().LL && (c513700KCqUS = uS()) != null && (c513550KCb = c513700KCqUS.LLJ) != null) {
            c513550KCb.LIZIZ = "tpl_loading";
        }
        String str = this.LLL.LJII;
        Map<String, String> map = this.LLJZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJZIJLIL;
        C513700KCq c513700KCqUS3 = uS();
        C0KDR.LJIIIIZZ(jCurrentTimeMillis, str, map, (c513700KCqUS3 == null || (c513550KCb2 = c513700KCqUS3.LLJ) == null) ? null : c513550KCb2.LIZIZ);
        if (Intrinsics.LJFF(this.LLL.LJIIIZ, Boolean.TRUE)) {
            C513500KBw.LJ();
        } else {
            ((LinkedHashMap) C513500KBw.LIZIZ).clear();
            C513500KBw.LIZJ = null;
        }
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(hashCode()));
        }
        C513970KDr.LIZ = "1";
        C513970KDr.LIZIZ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        int i = 1;
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        if (!this.LLLF) {
            i = 2;
        }
        sheetOptions.dimBehindType = i;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0KCF c0kcf;
        C0KCF c0kcf2;
        C513700KCq c513700KCqUS;
        C513670KCn c513670KCnLIZ;
        C513670KCn c513670KCn;
        long j;
        C0KCF c0kcf3;
        boolean z;
        C513700KCq c513700KCqUS2;
        C513550KCb c513550KCb;
        long j2;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        super.onCreate(bundle);
        C513720KCs c513720KCs = LLLI;
        C513700KCq c513700KCqUS3 = uS();
        c513720KCs.getClass();
        C513720KCs.LIZ(this, c513700KCqUS3);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C513700KCq(), C513700KCq.class, "source_default_key");
        C513700KCq c513700KCqUS4 = uS();
        if (c513700KCqUS4 != null) {
            c513700KCqUS4.LL = this.LLL;
        }
        C513700KCq c513700KCqUS5 = uS();
        if (c513700KCqUS5 != null) {
            C0KCF c0kcf4 = this.LLL;
            Long lLJIILIIL = C2095008Iq.LJIILIIL(c0kcf4.LIZIZ);
            if (lLJIILIIL != null) {
                jLongValue3 = lLJIILIIL.longValue();
            } else {
                jLongValue3 = 0;
            }
            String str = c0kcf4.LIZ;
            String str2 = c0kcf4.LJJI;
            String str3 = c0kcf4.LJI;
            String str4 = c0kcf4.LJIL;
            String str5 = c0kcf4.LIZJ;
            String str6 = c0kcf4.LJII;
            String str7 = c0kcf4.LJIILJJIL;
            String str8 = c0kcf4.LJIIJJI;
            String str9 = c0kcf4.LJJ;
            String str10 = c0kcf4.LJIJJLI;
            String str11 = c0kcf4.LJIIIIZZ;
            if (str11 == null) {
                str11 = "";
            }
            c513700KCqUS5.LLILLJJLI = new C513680KCo(jLongValue3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, c0kcf4.LJIIJ, c0kcf4.LIZLLL, Intrinsics.LJFF(c0kcf4.LJIIIZ, Boolean.TRUE), c0kcf4.LJIJI, c0kcf4.LJIILIIL, c0kcf4.LJIIL, c0kcf4.LIZIZ, c0kcf4.LJFF, c0kcf4.LJJIIJZLJL, 2097152);
        }
        C513700KCq c513700KCqUS6 = uS();
        if (c513700KCqUS6 != null) {
            C0KCF c0kcf5 = this.LLL;
            String strJ3 = C786410Ut5.J3(new JSONObject(this.LLJZ));
            C513700KCq c513700KCqUS7 = uS();
            if (c513700KCqUS7 != null) {
                j2 = c513700KCqUS7.LLJILJIL;
            } else {
                j2 = 0;
            }
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(c0kcf5.LIZIZ);
            if (lLJIILIIL2 != null) {
                jLongValue = lLJIILIIL2.longValue();
            } else {
                jLongValue = 0;
            }
            String str12 = c0kcf5.LIZ;
            Long lLJIILIIL3 = C2095008Iq.LJIILIIL(c0kcf5.LJIILJJIL);
            if (lLJIILIIL3 != null) {
                jLongValue2 = lLJIILIIL3.longValue();
            } else {
                jLongValue2 = 0;
            }
            String str13 = c0kcf5.LJI;
            String str14 = c0kcf5.LJIL;
            String str15 = c0kcf5.LJII;
            String str16 = c0kcf5.LJJ;
            String str17 = c0kcf5.LIZJ;
            String str18 = c0kcf5.LJIIIIZZ;
            if (str18 == null) {
                str18 = "";
            }
            c513700KCqUS6.LLILLL = new C513670KCn(jLongValue, str12, jLongValue2, str13, str14, str15, str16, str17, str18, strJ3, c0kcf5.LJIJJLI, j2, "", c0kcf5.LJIIJ, c0kcf5.LJIIJJI, c0kcf5.LJIIL, c0kcf5.LJIILIIL, c0kcf5.LJIJI);
        }
        uS();
        uS();
        C513700KCq c513700KCqUS8 = uS();
        if (c513700KCqUS8 != null) {
            c513700KCqUS8.LLJI = C513380KBk.LIZ(this.LLL.LJJ);
        }
        C513700KCq c513700KCqUS9 = uS();
        if (c513700KCqUS9 != null && (c513550KCb = c513700KCqUS9.LLJ) != null) {
            EnumC513410KBn enumC513410KBnLIZ = this.LLJLLL;
            if (enumC513410KBnLIZ == null) {
                C0KCF c0kcf6 = this.LLL;
                enumC513410KBnLIZ = C513500KBw.LIZ(c0kcf6.LIZ, c0kcf6.LJI, true);
            }
            c513550KCb.LIZJ = enumC513410KBnLIZ;
        }
        C513700KCq c513700KCqUS10 = uS();
        if (c513700KCqUS10 != null) {
            c513700KCqUS10.LLILZ = this.LLJZIJLIL;
        }
        C513700KCq c513700KCqUS11 = uS();
        if (c513700KCqUS11 != null) {
            c513700KCqUS11.LL = this.LLL;
        }
        C513700KCq c513700KCqUS12 = uS();
        if (c513700KCqUS12 != null) {
            c513700KCqUS12.LLILZLL = Intrinsics.LJFF(this.LLL.LJIIJ, "h5");
        }
        C513700KCq c513700KCqUS13 = uS();
        if (c513700KCqUS13 != null) {
            c513700KCqUS13.LLIZ = Intrinsics.LJFF(this.LLL.LJIIJ, "homepage-entry");
        }
        C513700KCq c513700KCqUS14 = uS();
        boolean z2 = false;
        if (c513700KCqUS14 != null) {
            if (Intrinsics.LJFF(this.LLL.LJIIJ, "homepage") || ((c513700KCqUS2 = uS()) != null && c513700KCqUS2.LLIZ)) {
                z = true;
            } else {
                z = false;
            }
            c513700KCqUS14.LLIZLLLIL = z;
        }
        C513700KCq c513700KCqUS15 = uS();
        if (c513700KCqUS15 == null || (c0kcf3 = c513700KCqUS15.LL) == null || c0kcf3.LJIIIZ == null) {
            if (Intrinsics.LJFF(this.LLL.LJIILJJIL, "")) {
                C513700KCq c513700KCqUS16 = uS();
                if (c513700KCqUS16 != null && (c0kcf2 = c513700KCqUS16.LL) != null) {
                    C513700KCq c513700KCqUS17 = uS();
                    if ((c513700KCqUS17 == null || !c513700KCqUS17.LLILZLL) && ((c513700KCqUS = uS()) == null || !c513700KCqUS.LLIZLLLIL)) {
                        z2 = true;
                    }
                    c0kcf2.LJIIIZ = Boolean.valueOf(z2);
                }
            } else {
                C513700KCq c513700KCqUS18 = uS();
                if (c513700KCqUS18 != null && (c0kcf = c513700KCqUS18.LL) != null) {
                    c0kcf.LJIIIZ = Boolean.valueOf(!Intrinsics.LJFF(this.LLL.LJIILJJIL, CardStruct.IStatusCode.DEFAULT));
                }
            }
        }
        C513700KCq c513700KCqUS19 = uS();
        if (c513700KCqUS19 != null) {
            c513700KCqUS19.LLJILLL = new C0KD8(this);
        }
        if (uS() != null) {
            getChildFragmentManager();
        }
        C513700KCq c513700KCqUS20 = uS();
        if (c513700KCqUS20 != null) {
            c513700KCqUS20.LLJIJIL = this.LLL.LJIIIIZZ;
        }
        C513700KCq c513700KCqUS21 = uS();
        if (c513700KCqUS21 != null) {
            C513700KCq c513700KCqUS22 = uS();
            if (c513700KCqUS22 != null && (c513670KCn = c513700KCqUS22.LLILLL) != null) {
                C513700KCq c513700KCqUS23 = uS();
                if (c513700KCqUS23 != null) {
                    j = c513700KCqUS23.LLJILJIL;
                } else {
                    j = 0;
                }
                c513670KCnLIZ = C513670KCn.LIZ(c513670KCn, j);
            } else {
                C513700KCq c513700KCqUS24 = uS();
                if (c513700KCqUS24 != null) {
                    c513670KCnLIZ = c513700KCqUS24.LLILLL;
                } else {
                    c513670KCnLIZ = C513670KCn.LJIJ;
                }
            }
            c513700KCqUS21.LLILLL = c513670KCnLIZ;
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int i;
        if (C960203pA.LIZIZ(requireActivity())) {
            i = R.style.uy;
        } else {
            i = R.style.v0;
        }
        return super.onGetLayoutInflater(bundle).cloneInContext(new C1361400lX0(requireActivity(), i));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLFFI = (ViewGroup) view.findViewById(R.id.pyc);
        wS().LLILLL = C1558360qeg.LJFF(this, null);
        C19EG activity = getActivity();
        if (activity != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), wS(), ISubPackagePageAbility.class, null, null);
        }
        C723850SaN.LIZ(this, false, null, new C513770KCx(this), 3);
        C723850SaN.LIZ(this, false, null, new C1135104cH(this), 3);
        C723850SaN.LIZ(this, false, null, new C0KD0(this), 3);
        C723850SaN.LIZ(this, false, null, new C0KD3(this), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gbu, viewGroup, false);
    }
}
