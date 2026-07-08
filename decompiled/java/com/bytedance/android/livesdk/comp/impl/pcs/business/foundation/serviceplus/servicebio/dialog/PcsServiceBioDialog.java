package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog;

import X.AbstractC1822440xWc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0I0L;
import X.C0I0M;
import X.C0IJT;
import X.C0KUO;
import X.C0TVI;
import X.C1144004di;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C13LE;
import X.C1440005kM;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C16F5;
import X.C1822100xW4;
import X.C1822190xWD;
import X.C1822330xWR;
import X.C1822350xWT;
import X.C1822530xWl;
import X.C1822550xWn;
import X.C1822570xWp;
import X.C1822590xWr;
import X.C1822610xWt;
import X.C1822620xWu;
import X.C1822630xWv;
import X.C1822640xWw;
import X.C1822650xWx;
import X.C1822690xX1;
import X.C1824070xZF;
import X.C1826730xdX;
import X.C1911200zpm;
import X.C19322110iZ;
import X.C19719912Dl;
import X.C19EH;
import X.C20244914Jj;
import X.C20246014Ju;
import X.C20246414Jy;
import X.C20441214yg;
import X.C20484615Do;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C474500IjA;
import X.C490590JLt;
import X.C496660Jdo;
import X.C497740JfY;
import X.C500260Jjc;
import X.C517520KRi;
import X.C518980KWy;
import X.C521380Kca;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1840220xzI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC724760Sbq;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsServicePlusSingleSkuEnableSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsViewerIndustryBadgeSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioContentAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.dialog.PcsVerifiedIntroDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.item.PcsVerifiedIntroItem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.newui.PcsVerifiedIntroV2Dialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsServiceBioDialog extends LiveSheetFragment implements C0KUO, PcsServiceBioAbility {
    public static final C1822190xWD LLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiHELIOSLS4nISoiZzw2OjMlKiojJDA/Zzw2OjMlKioxISpiLSYyJCorZx8wOxYpOzk6KyAOICAXISQgJig=";
    public final AssemVMLazy LLJLLL;
    public C521380Kca LLJZ;
    public Map<String, String> LLJZIJLIL;
    public final C01GW LLL;
    public boolean LLLF;
    public final C01GW LLLFF;
    public View LLLFFI;
    public C16F5 LLLFZ;
    public int LLLI;
    public C20246014Ju LLLII;
    public C0I0L LLLIIII;
    public C1822330xWR LLLIIIIL;
    public final C01GW LLLIIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xWD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsServiceBioDialog.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/servicebio/viewmodel/PcsServiceBioVM;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIL = new Object() { // from class: X.0xWD
        };
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int ZR() {
        return R.id.u3k;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final void ZY0() {
        LiveSheetHostFragment liveSheetHostFragment;
        this.LLJLIL = null;
        C20484615Do c20484615Do = this.LLJJIJIL;
        if (c20484615Do != null && (liveSheetHostFragment = c20484615Do.LIZLLL) != null && liveSheetHostFragment.LLIZ != 16) {
            liveSheetHostFragment.LLIZ = 16;
            Dialog dialog = liveSheetHostFragment.getDialog();
            if (dialog != null && dialog.getWindow() != null) {
                dialog.getWindow().setSoftInputMode(16);
            }
        }
        SR();
    }

    @Override // X.C0KUO
    public final void xR() {
        this.LLLF = true;
        close(1);
    }

    public PcsServiceBioDialog() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsServiceBioVM.class);
        C1822550xWn c1822550xWn = new C1822550xWn(c19719912DlLIZ);
        C1822690xX1 c1822690xX1 = new C1822690xX1();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1822550xWn, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C1822630xWv(this), c1822690xX1, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1822550xWn, new C1822640xWw(this), c1822690xX1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c1822550xWn, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C1822650xWx(this), c1822690xX1, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
        this.LLJZIJLIL = new LinkedHashMap();
        this.LLL = C452501pT.LIZIZ(new C1822590xWr());
        this.LLLFF = C452501pT.LIZIZ(new C1822570xWp(this));
        this.LLLI = 1005;
        this.LLLIIII = C0I0M.LIZ;
        this.LLLIIIL = C452501pT.LIZIZ(new C1822620xWu());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final void qo0() {
        C723850SaN.LIZ(this, false, null, new C1822610xWt(this), 3);
    }

    public final C1822330xWR uS() {
        if (this.LLLIIIIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C1822330xWR.class, null);
            this.LLLIIIIL = interfaceC1555100qZQLIZIZ != null ? (C1822330xWR) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLLIIIIL;
    }

    public final PcsServiceBioVM wS() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        return (PcsServiceBioVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final View M12() {
        View view = getView();
        if (view != null) {
            return view.findViewById(R.id.ut8);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final Fragment Zk0() {
        return getChildFragmentManager().LJJJJZ(R.id.uxl);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final void b81() {
        Fragment fragmentZk0 = Zk0();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRemoveDmFragment ");
        sbLIZ.append(fragmentZk0);
        C20441214yg.LIZIZ("PcsServiceBioDialog", C2188811AlT.LIZIZ(sbLIZ));
        if (fragmentZk0 != null) {
            C20441214yg.LIZIZ("PcsServiceBioDialog", "onRemoveDmFragment removing");
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentZk0);
            c19ehLJIIJ.LJIIJ();
        }
        LinearLayout linearLayoutVd2 = vd2();
        if (linearLayoutVd2 != null) {
            C500260Jjc.LJIILIIL(linearLayoutVd2);
        }
    }

    @Override // X.C0KUO
    public final View getRootView() {
        return getView();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final AbstractC1822440xWc kS() {
        return wS().LLILZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final void kz0() {
        C1822330xWR c1822330xWRUS;
        SMBVerificationInfo sMBVerificationInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C1822350xWT c1822350xWTLIZJ;
        Context context = getContext();
        if (context == null || (c1822330xWRUS = uS()) == null || (sMBVerificationInfo = c1822330xWRUS.LLJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        String str6 = "";
        if (!(!wS().LLJI.isEmpty()) || (c1822350xWTLIZJ = C1822530xWl.LIZJ(wS().LLJI)) == null || (str = c1822350xWTLIZJ.LIZ) == null) {
            str = "";
        }
        if (!LivePcsViewerIndustryBadgeSetting.INSTANCE.getValue()) {
            PcsVerifiedIntroItem[] pcsVerifiedIntroItemArrLIZJ = C1822100xW4.LIZJ(sMBVerificationInfo, context);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Bundle bundle = new Bundle();
            C1822330xWR c1822330xWRUS2 = uS();
            C786410Ut5.LJJJI("avatar", c1822330xWRUS2 != null ? c1822330xWRUS2.LLJJIJIIJIL : null, bundle);
            C786410Ut5.LJJJI("nickname", str, bundle);
            C786410Ut5.LJJIJLIJ(bundle, "verified_info_list", pcsVerifiedIntroItemArrLIZJ);
            C1822330xWR c1822330xWRUS3 = uS();
            C786410Ut5.LJJJI("anchor_id", c1822330xWRUS3 != null ? c1822330xWRUS3.LLJ : null, bundle);
            C1822330xWR c1822330xWRUS4 = uS();
            C786410Ut5.LJJJI("show_entrance", c1822330xWRUS4 != null ? c1822330xWRUS4.LL : null, bundle);
            C1822330xWR c1822330xWRUS5 = uS();
            bundle.putBoolean("has_kyb_verified", c1822330xWRUS5 != null ? c1822330xWRUS5.LIZIZ() : false);
            C1822330xWR c1822330xWRUS6 = uS();
            bundle.putBoolean("has_kyc_verified", c1822330xWRUS6 != null ? c1822330xWRUS6.LIZJ() : false);
            C786410Ut5.LJJJI("previous_page", wS().getPreviousPage(), bundle);
            C19322110iZ.LIZLLL(childFragmentManager, PcsVerifiedIntroDialog.class, "live_smb_verified_intro_sheet", null, bundle);
            return;
        }
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo = sMBVerificationInfo.industryVerificationInfo;
        if (sMBIndustryVerificationInfo == null || sMBIndustryVerificationInfo.status != 3 || (str2 = sMBIndustryVerificationInfo.approvedIndustryBadgeName) == null) {
            str2 = "";
        }
        String str7 = PcsVerifiedIntroV2Dialog._pnsPageId;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        C1822330xWR c1822330xWRUS7 = uS();
        if (c1822330xWRUS7 == null || (str3 = c1822330xWRUS7.LLJJIJIIJIL) == null) {
            str3 = "";
        }
        C1822330xWR c1822330xWRUS8 = uS();
        if (c1822330xWRUS8 == null || (str4 = c1822330xWRUS8.LLJ) == null) {
            str4 = "";
        }
        C1822330xWR c1822330xWRUS9 = uS();
        if (c1822330xWRUS9 != null && (str5 = c1822330xWRUS9.LL) != null) {
            str6 = str5;
        }
        C496660Jdo.LIZ(childFragmentManager2, str3, str, sMBVerificationInfo, str2, str4, str6, wS().getPreviousPage());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLLF) {
            this.LLLF = false;
            C1440005kM.LIZ(new C518980KWy());
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), PcsServiceBioAbility.class, null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i = wS().LLIZ;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("is_single_sku", wS().CQ2() ? "1" : CardStruct.IStatusCode.DEFAULT);
            pairArr[1] = new Pair("sku_type", PcsServiceBioVM.yQ2(wS().LLJI));
            pairArr[2] = new Pair("prev_sku_type", wS().LLJJI);
            interfaceC517590KRpLIZJ.LJIIJJI(new C517520KRi(i, C2097608Jq.LJIIJ(pairArr)));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        Fragment fragmentZk0 = Zk0();
        if (fragmentZk0 == null || fragmentZk0.isRemoving() || fragmentZk0.isDetached() || fragmentZk0.getView() == null || fragmentZk0.getFragmentManager() == null || !((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).onBackPressByHomeBackPressListener(fragmentZk0).booleanValue()) {
            C1911200zpm.LIZIZ(this);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final LinearLayout vd2() {
        View view = getView();
        if (view != null) {
            return (LinearLayout) view.findViewById(R.id.utk);
        }
        return null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        C1822330xWR c1822330xWRUS = uS();
        boolean z = false;
        int i = 1;
        if (c1822330xWRUS != null && c1822330xWRUS.LLILZ) {
            z = true;
        }
        SheetOptions sheetOptions = new SheetOptions();
        boolean value = LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue();
        wS().LLJILLL = value ? 1 : 0;
        sheetOptions.LIZ(value ? 1 : 0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        if (!z) {
            i = 2;
        }
        sheetOptions.dimBehindType = i;
        return sheetOptions;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final void kY(int i) {
        if (i != wS().LLJILLL) {
            sS(i);
            wS().LLJILLL = i;
        }
        if (wS().LLJJ instanceof PcsServiceBioContentAssem) {
            rS(true);
        } else if (i == 1) {
            rS(false);
        } else {
            rS(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f9  */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.0xX0] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.dialog.PcsServiceBioDialog.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void onWindowFocusChanged(boolean z) {
        PcsServiceBioContentAbility pcsServiceBioContentAbility;
        super.onWindowFocusChanged(z);
        wS().LLILZLL = z;
        if (z && (pcsServiceBioContentAbility = (PcsServiceBioContentAbility) this.LLLFF.getValue()) != null) {
            pcsServiceBioContentAbility.lo0();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C16F5 c16f5;
        C1822330xWR c1822330xWRUS;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        if (C1824070xZF.LIZ(getContext()) && (c1822330xWRUS = uS()) != null && (c1822330xWRUS.LLILLL.length() == 0 || Intrinsics.LJFF(c1822330xWRUS.LLILLL, CardStruct.IStatusCode.DEFAULT))) {
            CardView cardView = (CardView) view.findViewById(R.id.ut_);
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ezn, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                if (cardView != null) {
                    cardView.setCardBackgroundColor(iIntValue);
                }
            }
        }
        C14K9.LJIJJ(view.findViewById(R.id.utk), new C0TVI() { // from class: X.0I0W
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20246014Ju c20246014JuYS = this.LL.yS(view2, c20246014Ju);
                this.LL.LLLII = c20246014JuYS;
                return c20246014JuYS;
            }
        });
        this.LLLFFI = view.findViewById(R.id.oe2);
        this.LLLFZ = (C16F5) view.findViewById(R.id.jkv);
        if (LivePcsServicePlusSingleSkuEnableSetting.INSTANCE.getValue() && (c16f5 = this.LLLFZ) != null) {
            c16f5.setMaxLines(1);
        }
        C16F5 c16f52 = this.LLLFZ;
        if (c16f52 != null) {
            ViewGroup.LayoutParams layoutParams = c16f52.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                marginLayoutParams.width = -1;
                C786410Ut5.W5(c16f52, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        C723850SaN.LIZ(this, false, null, new C1144004di(this), 3);
    }

    public final C20246014Ju yS(View view, C20246014Ju c20246014Ju) {
        int dimension;
        if (!Intrinsics.LJFF(this.LLLIIII, C0I0M.LIZ)) {
            dimension = (int) getResources().getDimension(R.dimen.atl);
        } else {
            dimension = 0;
        }
        int dimension2 = (int) getResources().getDimension(R.dimen.atk);
        C20246414Jy c20246414Jy = new C20246414Jy(c20246014Ju);
        c20246414Jy.LIZ.LIZJ(7, C20244914Jj.LIZIZ(0, dimension, 0, dimension2));
        return q0.LJIIL(view, c20246414Jy.LIZ());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.ability.PcsServiceBioAbility
    public final void Fj1(String str, String str2, boolean z) {
        if (Zk0() == null) {
            C16F5 c16f5 = this.LLLFZ;
            if (c16f5 != null) {
                c16f5.setText(str);
            }
            C490590JLt c490590JLt = C490590JLt.LIZ;
            Map<String, String> mapVQ2 = wS().vQ2(true, z);
            c490590JLt.getClass();
            String strLIZ = C490590JLt.LIZ(str2, "biz_event_tracking_extra", mapVQ2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onCreateDmFragment newSchema=");
            sbLIZ.append(strLIZ);
            C20441214yg.LIZIZ("PcsServiceBioDialog", C2188811AlT.LIZIZ(sbLIZ));
            Fragment fragmentCreateTabletChatRootFragment = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).createTabletChatRootFragment(strLIZ);
            if (fragmentCreateTabletChatRootFragment == null) {
                return;
            }
            LinearLayout linearLayoutVd2 = vd2();
            if (linearLayoutVd2 != null) {
                C500260Jjc.LLFFF(linearLayoutVd2);
            }
            wS().AQ2();
            C474500IjA c474500IjALIZJ = C0IJT.LIZJ("chat_panel_show");
            c474500IjALIZJ.LJJII(String.valueOf(1), "is_single_sku");
            c474500IjALIZJ.LIZ();
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.uxl, fragmentCreateTabletChatRootFragment, null);
            c19ehLJIIJ.LJIIJ();
            getChildFragmentManager().LJ(new InterfaceC1840220xzI() { // from class: X.0I0V
                @Override // X.InterfaceC1840220xzI
                public final void LIZ(Fragment fragment) {
                    if (Intrinsics.LJFF(fragment, this.LL.Zk0())) {
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C0I0Q(fragment, this.LL, null), 3);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g_9, viewGroup, false);
    }
}
