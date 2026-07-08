package com.ss.android.ugc.aweme.publish.detail;

import X.AbstractC1736670vIH;
import X.C019F;
import X.C01GW;
import X.C0LAB;
import X.C0OM1;
import X.C0PEM;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1735690vGh;
import X.C1736340vHk;
import X.C1736830vIX;
import X.C1737280vJG;
import X.C1737320vJK;
import X.C1737910vKH;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20642515q3;
import X.C21578619ce;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C291001Au;
import X.C323930Cmt;
import X.C323950Cmv;
import X.C419910GdJ;
import X.C452501pT;
import X.C723590SZx;
import X.C723850SaN;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC1733870vDl;
import X.EnumC1736950vIj;
import X.EnumC1737230vJB;
import X.EnumC1737340vJM;
import X.InterfaceC1670800ta2;
import X.InterfaceC1733810vDf;
import X.InterfaceC1736320vHi;
import X.InterfaceC1737080vIw;
import X.InterfaceC2217461Bqa;
import X.ViewOnClickListenerC1736300vHg;
import Y.ARunnableS57S0300000_24;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconAsset;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftIconInfo;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneInitState;
import com.ss.android.ugc.aweme.prop.mobileefffect.ProgressBarDialog;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.EffectPublishedExtraData;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectMobilePublishDetailAssem extends UISlotAssem implements InterfaceC1733810vDf {
    public static final C1736340vHk LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0vHk] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectMobilePublishDetailAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0vHk
        };
        LLJJJIL = 8;
    }

    public EffectMobilePublishDetailAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 770), AFwS268S0000000_26.get$arr$(458), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1115));
    }

    private final void Bp() {
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLIZ;
            }
        }, null, new AwS640S0100000_26(this, 61), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLIZLLLIL;
            }
        }, null, new AwS640S0100000_26(this, 62), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJ;
            }
        }, null, new AwS640S0100000_26(this, 63), 6);
    }

    private final void op() {
        if (kp().mode == EnumC1733870vDl.EDIT) {
            return;
        }
        EffectMobilePublishVM effectMobilePublishVMMp = mp();
        effectMobilePublishVMMp.getClass();
        C323950Cmv c323950Cmv = C323950Cmv.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C323930Cmt(null), 3);
        effectMobilePublishVMMp.withState(new AwS583S0100000_4(effectMobilePublishVMMp, 219));
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJI;
            }
        }, null, new AwS638S0100000_24(this, 62), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.rp;
    }

    @Override // X.InterfaceC1733810vDf, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public final void Qp(AbstractC1736670vIH abstractC1736670vIH) {
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    private final void tp() {
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 284));
    }

    private final void yp() {
        C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 180));
    }

    private final void zp() {
        C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 145));
    }

    public final MobileEffectData kp() {
        return (MobileEffectData) this.LLJJI.getValue();
    }

    public final ProgressBarDialog lp() {
        return (ProgressBarDialog) this.LLJJIJI.getValue();
    }

    public final EffectMobilePublishVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (EffectMobilePublishVM) assemVMLazy.getValue();
    }

    private final void Fp() {
        if (kp().mode == EnumC1733870vDl.EDIT) {
            return;
        }
        EffectMobilePublishVM effectMobilePublishVMMp = mp();
        effectMobilePublishVMMp.DQ2(effectMobilePublishVMMp.getState().LLILZLL);
    }

    private final boolean hp() {
        EffectPackageDataWrapper effectPackageDataWrapper = kp().publishData;
        return (effectPackageDataWrapper == null || effectPackageDataWrapper.availableEffectHintList.isEmpty() || kp().mode == EnumC1733870vDl.EDIT) ? false : true;
    }

    private final void sp() {
        if (hp()) {
            C723850SaN.LIZLLL(this, new AwS603S0100000_24(this, 179));
        }
    }

    private final void up() {
        if (kp().mode == EnumC1733870vDl.PUBLISH) {
            C723850SaN.LIZLLL(this, new AwS585S0100000_6(this, 144));
        }
    }

    @Override // X.InterfaceC1733810vDf
    public void LJJLIIIJJIZ() {
        mp().HQ2();
    }

    public final void Tp() {
        C21578619ce c21578619ce = (C21578619ce) getContentView().findViewById(R.id.vla);
        HandlerHook.viewPost(c21578619ce, new ARunnableS57S0300000_24(c21578619ce, getContentView().findViewById(R.id.vlb), (LinearLayout) getContentView().findViewById(R.id.vl9), 4));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        InterfaceC1737080vIw interfaceC1737080vIw;
        super.onCreate();
        EffectMobilePublishVM effectMobilePublishVMMp = mp();
        InterfaceC1737080vIw interfaceC1737080vIw2 = (InterfaceC1737080vIw) effectMobilePublishVMMp.LLIZ.getValue();
        if ((interfaceC1737080vIw2 == null || interfaceC1737080vIw2.LJIIL(EnumC1737230vJB.ICON_EDIT) == null) && (interfaceC1737080vIw = (InterfaceC1737080vIw) effectMobilePublishVMMp.LLIZ.getValue()) != null) {
            interfaceC1737080vIw.LJFF(EnumC1737230vJB.ICON_EDIT);
        }
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        Pair pair;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData2;
        String str;
        String str2;
        String iconAssetSource;
        EnumC1737340vJM enumC1737340vJM;
        String iconAssetSource2;
        EnumC1737340vJM enumC1737340vJM2;
        CKEDraftIconInfo iconInfo;
        EditImage editImage;
        EditImage editImage2;
        super.onResume();
        EffectMobilePublishVM effectMobilePublishVMMp = mp();
        effectMobilePublishVMMp.getClass();
        C1736830vIX state = effectMobilePublishVMMp.getState();
        CKEDraftInfo cKEDraftInfo = effectMobilePublishVMMp.yQ2().draftInfo;
        C291001Au<EditImage> c291001Au = state.LLJJIJIIJIL;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData3 = (c291001Au == null || (editImage2 = c291001Au.LIZ) == null) ? null : editImage2.effectImgCreatorData;
        C291001Au<EditImage> c291001Au2 = state.LLJJIJIL;
        EditImageEffectImgCreatorData editImageEffectImgCreatorData4 = (c291001Au2 == null || (editImage = c291001Au2.LIZ) == null) ? null : editImage.effectImgCreatorData;
        if (editImageEffectImgCreatorData3 != null || editImageEffectImgCreatorData4 != null) {
            pair = new Pair(editImageEffectImgCreatorData3, editImageEffectImgCreatorData4);
        } else if (cKEDraftInfo == null || (iconInfo = cKEDraftInfo.getIconInfo()) == null) {
            pair = null;
        } else {
            CKEDraftIconAsset primaryIconData = iconInfo.getPrimaryIconData();
            CKEDraftIconAsset secondaryIconData = iconInfo.getSecondaryIconData();
            String iconAssetId = primaryIconData.getIconAssetId();
            Boolean boolIsIconEffectApplied = primaryIconData.isIconEffectApplied();
            boolean zBooleanValue = boolIsIconEffectApplied != null ? boolIsIconEffectApplied.booleanValue() : false;
            C1737320vJK c1737320vJK = EnumC1737340vJM.Companion;
            Integer iconSelectTypeValue = primaryIconData.getIconSelectTypeValue();
            c1737320vJK.getClass();
            EditImageEffectImgCreatorData editImageEffectImgCreatorData5 = new EditImageEffectImgCreatorData(iconAssetId, zBooleanValue, C1737320vJK.LIZ(iconSelectTypeValue), (EnumC1736950vIj) null, 0, 56);
            String iconAssetId2 = secondaryIconData.getIconAssetId();
            Boolean boolIsIconEffectApplied2 = secondaryIconData.isIconEffectApplied();
            pair = new Pair(editImageEffectImgCreatorData5, new EditImageEffectImgCreatorData(iconAssetId2, boolIsIconEffectApplied2 != null ? boolIsIconEffectApplied2.booleanValue() : false, C1737320vJK.LIZ(secondaryIconData.getIconSelectTypeValue()), (EnumC1736950vIj) null, 0, 56));
        }
        MobileEffectData mobileEffectDataYQ2 = effectMobilePublishVMMp.yQ2();
        if (mobileEffectDataYQ2 != null) {
            EffectPackageDataWrapper effectPackageDataWrapper = mobileEffectDataYQ2.publishData;
            C0LAB c0lab = new C0LAB();
            if (pair != null) {
                editImageEffectImgCreatorData = (EditImageEffectImgCreatorData) pair.getFirst();
                editImageEffectImgCreatorData2 = (EditImageEffectImgCreatorData) pair.getSecond();
            } else {
                editImageEffectImgCreatorData = null;
                editImageEffectImgCreatorData2 = null;
            }
            String str3 = "";
            if (editImageEffectImgCreatorData == null || (str = editImageEffectImgCreatorData.iconId) == null) {
                str = "";
            }
            c0lab.LJ("icon_asset_id_pos1", str);
            if (editImageEffectImgCreatorData2 == null || (str2 = editImageEffectImgCreatorData2.iconId) == null) {
                str2 = "";
            }
            c0lab.LJ("icon_asset_id_pos2", str2);
            if (editImageEffectImgCreatorData == null || (enumC1737340vJM2 = editImageEffectImgCreatorData.iconSelectType) == null || (iconAssetSource = enumC1737340vJM2.getIconAssetSource()) == null) {
                iconAssetSource = "";
            }
            c0lab.LJ("icon_asset_source_pos1", iconAssetSource);
            if (editImageEffectImgCreatorData2 != null && (enumC1737340vJM = editImageEffectImgCreatorData2.iconSelectType) != null && (iconAssetSource2 = enumC1737340vJM.getIconAssetSource()) != null) {
                str3 = iconAssetSource2;
            }
            c0lab.LJ("icon_asset_source_pos2", str3);
            c0lab.LJ("if_contains_greenscreen_asset", (effectPackageDataWrapper == null || !C1737280vJG.LIZ(effectPackageDataWrapper)) ? CardStruct.IStatusCode.DEFAULT : "1");
            c0lab.LIZ(Intrinsics.LJFF(effectPackageDataWrapper != null ? effectPackageDataWrapper.projectSource : null, "template") ? 1 : 0, "is_pro_template");
            C1737910vKH.LIZ("publish_effect_show", c0lab.LIZ);
        }
    }

    private final void Ap(View view) {
        Tp();
        View viewFindViewById = getContentView().findViewById(R.id.vl9);
        ViewOnClickListenerC1736300vHg viewOnClickListenerC1736300vHg = new View.OnClickListener() { // from class: X.0vHg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InputMethodManager inputMethodManager;
                Activity activityLIZ = C1388190mED.LIZ(view2.getContext());
                Object objF2 = null;
                if (activityLIZ != null) {
                    objF2 = C786410Ut5.F2(activityLIZ, "input_method");
                }
                if ((objF2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objF2) != null && inputMethodManager.isAcceptingText()) {
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 0);
                }
            }
        };
        Iterator it2 = C1697810uHb.LJIIJJI(view, viewFindViewById).iterator();
        while (it2.hasNext()) {
            C786410Ut5.I7(viewOnClickListenerC1736300vHg, (View) it2.next());
        }
    }

    private final void Ep(View view) {
        int iIntValue;
        int i;
        Integer numLIZJ;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.gpn);
        C0OM1 c0om1 = new C0OM1();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1116));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        int i2 = C1735690vGh.LIZ[kp().mode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 2131833759;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = 2131833783;
        }
        c1250250idj.LIZJ = C20642515q3.LJI(i);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        tuxNavBar.setNavActions(c0om1);
    }

    public final void Ip(EffectDoneInitState effectDoneInitState) {
        InterfaceC1736320vHi interfaceC1736320vHi;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736320vHi) && (interfaceC1736320vHi = (InterfaceC1736320vHi) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736320vHi.LIZLLL(effectDoneInitState);
        }
    }

    @Override // X.InterfaceC1733810vDf
    public void LLLLZIL(Uri uri) {
        mp().IQ2(uri, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Ep(view);
        zp();
        tp();
        sp();
        op();
        yp();
        Bp();
        Fp();
        Ap(view);
        up();
    }

    public final void Gp(String str, EffectPublishedExtraData effectPublishedExtraData) {
        InterfaceC1736320vHi interfaceC1736320vHi;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736320vHi) && (interfaceC1736320vHi = (InterfaceC1736320vHi) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736320vHi.LJLLILLLL(str, effectPublishedExtraData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jp(X.C1156280gCA r4, androidx.fragment.app.Fragment r5) {
        /*
            r3 = this;
            java.lang.Integer r2 = r4.LIZ
            if (r2 == 0) goto L3f
            int r1 = r2.intValue()
            r0 = 1408(0x580, float:1.973E-42)
            if (r1 != r0) goto L1b
            r1 = 2131833755(0x7f11339b, float:1.9300601E38)
        Lf:
            X.0mGx r0 = new X.0mGx
            r0.<init>(r5)
            r0.LJIIIZ(r1)
            r0.LJIIJJI()
            return
        L1b:
            int r1 = r2.intValue()
            r0 = 1411(0x583, float:1.977E-42)
            if (r1 != r0) goto L27
            r1 = 2131821236(0x7f1102b4, float:1.927521E38)
            goto Lf
        L27:
            int r1 = r2.intValue()
            r0 = 1412(0x584, float:1.979E-42)
            if (r1 != r0) goto L33
            r1 = 2131821235(0x7f1102b3, float:1.9275207E38)
            goto Lf
        L33:
            int r1 = r2.intValue()
            r0 = 1413(0x585, float:1.98E-42)
            if (r1 != r0) goto L3f
            r1 = 2131821234(0x7f1102b2, float:1.9275205E38)
            goto Lf
        L3f:
            r1 = 2131822173(0x7f11065d, float:1.927711E38)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.detail.EffectMobilePublishDetailAssem.Jp(X.0gCA, androidx.fragment.app.Fragment):void");
    }

    public final void ip(String str, DraftSavedExtraData draftSavedExtraData) {
        InterfaceC1736320vHi interfaceC1736320vHi;
        InterfaceC1670800ta2 interfaceC1670800ta2LIZ = C724240Sb0.LIZ(this);
        if ((interfaceC1670800ta2LIZ instanceof InterfaceC1736320vHi) && (interfaceC1736320vHi = (InterfaceC1736320vHi) interfaceC1670800ta2LIZ) != null) {
            interfaceC1736320vHi.LJLI(str, draftSavedExtraData);
        }
    }
}
