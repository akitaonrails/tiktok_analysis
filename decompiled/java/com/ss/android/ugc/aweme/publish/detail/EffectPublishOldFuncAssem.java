package com.ss.android.ugc.aweme.publish.detail;

import X.C019F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1735710vGj;
import X.C1737900vKG;
import X.C1775760wJK;
import X.C1776210wK3;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1733870vDl;
import X.InterfaceC2217461Bqa;
import X.ViewOnLongClickListenerC1775840wJS;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.draft.DraftSavedExtraData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishOldFuncAssem;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.time.LocalDate;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS55S1000000_4;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPublishOldFuncAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public C197039127h LLJJI;
    public C197039127h LLJJIII;
    public TuxTextView LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectPublishOldFuncAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectPublishOldFuncAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 852), AFwS268S0000000_26.get$arr$(462), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.rl;
    }

    public final MobileEffectData hp() {
        return (MobileEffectData) this.LLJJIJIIJIL.getValue();
    }

    public final EffectMobilePublishVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (EffectMobilePublishVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJI = (C197039127h) view.findViewById(R.id.tza);
        this.LLJJIII = (C197039127h) view.findViewById(R.id.whe);
        this.LLJJIJI = (TuxTextView) view.findViewById(R.id.oij);
        Context context = getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilderLJIIZILJ = C1737900vKG.LJIIZILJ(context);
            TuxTextView tuxTextView = this.LLJJIJI;
            if (tuxTextView != null) {
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            TuxTextView tuxTextView2 = this.LLJJIJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(spannableStringBuilderLJIIZILJ);
            }
        }
        C197039127h c197039127h = this.LLJJI;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0vH5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String name;
                    String str;
                    String str2;
                    EditImageEffectImgCreatorData editImageEffectImgCreatorData;
                    String str3;
                    EffectPublishOldFuncAssem effectPublishOldFuncAssem = this.LL;
                    CKEDraftInfo cKEDraftInfo = effectPublishOldFuncAssem.hp().draftInfo;
                    if (cKEDraftInfo != null) {
                        EffectMobilePublishVM effectMobilePublishVMIp = effectPublishOldFuncAssem.ip();
                        String draftId = cKEDraftInfo.getDraftId();
                        if (!C123100dR.LIZ(effectMobilePublishVMIp.getState().LLILLJJLI)) {
                            LocalDate localDateNow = LocalDate.now();
                            String strValueOf = String.valueOf(localDateNow.getYear());
                            String strJ4 = C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDateNow.getMonthValue())}, 1));
                            String strJ42 = C786410Ut5.j4("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(localDateNow.getDayOfMonth())}, 1));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Untitled ");
                            sbLIZ.append(strValueOf);
                            sbLIZ.append(strJ4);
                            sbLIZ.append(strJ42);
                            effectMobilePublishVMIp.setState(new AwS55S1000000_4(C2188811AlT.LIZIZ(sbLIZ), 4));
                        }
                        CKEDraftInfo cKEDraftInfo2 = effectMobilePublishVMIp.yQ2().draftInfo;
                        String str4 = "";
                        if (cKEDraftInfo2 == null || (name = cKEDraftInfo2.getName()) == null) {
                            name = "";
                        }
                        EditImage editImage = effectMobilePublishVMIp.getState().LLILZLL;
                        if (editImage != null && (editImageEffectImgCreatorData = editImage.effectImgCreatorData) != null && (str3 = editImageEffectImgCreatorData.iconId) != null) {
                            str4 = str3;
                        }
                        EffectPackageDataWrapper effectPackageDataWrapper = effectMobilePublishVMIp.yQ2().publishData;
                        if (effectPackageDataWrapper != null) {
                            str = effectPackageDataWrapper.projectSource;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, "template")) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        effectMobilePublishVMIp.withState(new AwS109S1200000_26(effectMobilePublishVMIp, draftId, new DraftSavedExtraData(name, str4, str2), 14));
                    }
                }
            });
            int i = 0;
            if (hp().mode == EnumC1733870vDl.PUBLISH) {
                ip().BQ2();
            } else {
                i = 8;
            }
            C786410Ut5.LLLLLLJ(c197039127h, i);
        }
        C197039127h c197039127h2 = this.LLJJIII;
        if (c197039127h2 != null) {
            int i2 = C1735710vGj.LIZ[hp().mode.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    c197039127h2.setText(2131833757);
                } else {
                    throw new C1954807lC();
                }
            } else {
                c197039127h2.setText(2131833768);
            }
            C786410Ut5.I7(new C1775760wJK(this, 1), c197039127h2);
            c197039127h2.setOnLongClickListener(new ViewOnLongClickListenerC1775840wJS(this, 1));
        }
        EffectMobilePublishVM effectMobilePublishVMIp = ip();
        selectSubscribe(effectMobilePublishVMIp, new C2217381BqS() { // from class: X.0vH8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0vH7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0vH6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1736830vIX) obj).LLJJIII);
            }
        }, new C2217381BqS() { // from class: X.0vHE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0vHF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJIJIIJIL;
            }
        }, C736820SvI.LIZIZ(effectMobilePublishVMIp.usedInReusedScene), null, new C1776210wK3(this, 2));
    }
}
