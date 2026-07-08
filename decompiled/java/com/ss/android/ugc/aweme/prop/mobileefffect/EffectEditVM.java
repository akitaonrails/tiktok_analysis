package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C01GW;
import X.C08QA;
import X.C0A11;
import X.C0CHQ;
import X.C0VSJ;
import X.C11NJ;
import X.C1559260qg8;
import X.C1735730vGl;
import X.C1736660vIG;
import X.C1736810vIV;
import X.C1736830vIX;
import X.C1737630vJp;
import X.C1737810vK7;
import X.C1737900vKG;
import X.C1737910vKH;
import X.C1738160vKg;
import X.C1738190vKj;
import X.C1954807lC;
import X.C201955140j;
import X.C23250099c;
import X.C291001Au;
import X.C452501pT;
import X.C703302op;
import X.C830690WiJ;
import X.EnumC1733870vDl;
import X.EnumC1736080vHK;
import X.EnumC1737480vJa;
import X.EnumC429230GsL;
import X.InterfaceC0148002o;
import X.InterfaceC1737080vIw;
import X.InterfaceC1738210vKl;
import android.app.Application;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS112S0110000_26;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class EffectEditVM extends AssemViewModel<C1736830vIX> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) MobileEffectData.class, (Class<Object>) "effect_init_data", (String) 13), true);
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1111));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(243));
    public boolean LLILZIL;

    public final void BQ2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll((Map) this.LLILLL.getValue());
        C1737900vKG.LIZJ(linkedHashMap, getState().LLJI);
        C1737910vKH.LIZ("show_advanced_mobile_save_as_draft", linkedHashMap);
    }

    public void FQ2() {
        withState(new AwS583S0100000_4(this, 104));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILLJJLI.LJ();
        super.onCleared();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0vI3] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C1737810vK7 c1737810vK7 = (C1737810vK7) this.LLILZ.getValue();
        c1737810vK7.getClass();
        c1737810vK7.LIZ = System.currentTimeMillis();
        if (yQ2().mode == EnumC1733870vDl.PUBLISH) {
            ((C1737810vK7) this.LLILZ.getValue()).LIZLLL = new InterfaceC1738210vKl() { // from class: X.0vI3
                @Override // X.InterfaceC1738210vKl
                public final void LIZ(C1738160vKg c1738160vKg) {
                    this.LIZ.wQ2(c1738160vKg);
                }

                @Override // X.InterfaceC1738210vKl
                public final void LIZIZ(C1738160vKg c1738160vKg) {
                    this.LIZ.wQ2(c1738160vKg);
                }

                @Override // X.InterfaceC1738210vKl
                public final void LIZJ(C1738160vKg c1738160vKg) {
                    this.LIZ.wQ2(c1738160vKg);
                }
            };
        }
    }

    public final MobileEffectData yQ2() {
        return (MobileEffectData) this.LL.getValue();
    }

    public final void CQ2() {
        if (yQ2().mode != EnumC1733870vDl.PUBLISH) {
            return;
        }
        if (yQ2().iconViewType == EnumC429230GsL.EFFECT_IMG_CREATOR && getState().LLILZ == null) {
            return;
        }
        C1737910vKH.LIZ("publish_effect_page_edit_thumbnail", C1737900vKG.LJI(yQ2(), null, EnumC1737480vJa.PUBLISH.getTag()).LIZ);
    }

    public final void HQ2() {
        int i = C1735730vGl.LIZ[yQ2().mode.ordinal()];
        if (i == 1) {
            setState(new AwS605S0100000_26(this, 389));
        } else {
            if (i != 2) {
                throw new C1954807lC();
            }
            withState(new AwS605S0100000_26(this, 390));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String str;
        String str2;
        String name;
        String author;
        String str3;
        String str4;
        int i = C1735730vGl.LIZ[yQ2().mode.ordinal()];
        String str5 = "";
        if (i == 1) {
            NewFaceStickerBean newFaceStickerBean = yQ2().effect;
            if (newFaceStickerBean == null || (str = newFaceStickerBean.name) == null) {
                str = "";
            }
            NewFaceStickerBean newFaceStickerBean2 = yQ2().effect;
            if (newFaceStickerBean2 != null && (str2 = newFaceStickerBean2.ownerName) != null) {
                str5 = str2;
            }
            NewFaceStickerBean newFaceStickerBean3 = yQ2().effect;
            return new C1736830vIX(str, str5, newFaceStickerBean3 != null ? newFaceStickerBean3.iconUrl : null, null, null, null, null, 4194272);
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        CKEDraftInfo cKEDraftInfo = yQ2().draftInfo;
        if (cKEDraftInfo == null || (name = cKEDraftInfo.getName()) == null) {
            name = "";
        }
        CKEDraftInfo cKEDraftInfo2 = yQ2().draftInfo;
        if (cKEDraftInfo2 == null || (author = cKEDraftInfo2.getAuthor()) == null) {
            author = "";
        }
        CKEDraftInfo cKEDraftInfo3 = yQ2().draftInfo;
        String strLIZJ = cKEDraftInfo3 != null ? C1736660vIG.LIZJ(cKEDraftInfo3) : null;
        CKEDraftInfo cKEDraftInfo4 = yQ2().draftInfo;
        EffectHint effectHint = cKEDraftInfo4 != null ? cKEDraftInfo4.getEffectHint() : null;
        EffectPackageDataWrapper effectPackageDataWrapper = yQ2().publishData;
        if (effectPackageDataWrapper != null && (str4 = effectPackageDataWrapper.campaignId) != null) {
            str5 = str4;
        }
        EffectPackageDataWrapper effectPackageDataWrapper2 = yQ2().publishData;
        if (effectPackageDataWrapper2 == null || (str3 = effectPackageDataWrapper2.campaignBindMethod) == null) {
            str3 = "automatic";
        }
        return new C1736830vIX(name, author, null, strLIZJ, effectHint, str5, str3, 4169184);
    }

    public final List<EditImage> zQ2() {
        C1736830vIX state = getState();
        ArrayList arrayList = new ArrayList();
        C291001Au<EditImage> c291001Au = state.LLJJIJIL;
        EditImage editImage = c291001Au != null ? c291001Au.LIZ : null;
        C291001Au<EditImage> c291001Au2 = state.LLJJIJIIJIL;
        EditImage editImage2 = c291001Au2 != null ? c291001Au2.LIZ : null;
        if (editImage != null) {
            arrayList.add(EditImage.LIZ(editImage, Uri.fromFile(new C0VSJ(AQ2(editImage)))));
        }
        if (editImage2 != null) {
            arrayList.add(EditImage.LIZ(editImage2, Uri.fromFile(new C0VSJ(AQ2(editImage2)))));
        }
        return arrayList;
    }

    public final String AQ2(EditImage editImage) {
        String strLJIIIIZZ;
        String path;
        Uri uri = editImage.url;
        if (uri != null && (path = uri.getPath()) != null && C703302op.LIZ(path)) {
            return editImage.url.getPath();
        }
        String absolutePath = null;
        if (!C0A11.LIZ()) {
            CKEDraftInfo cKEDraftInfo = yQ2().draftInfo;
            if (cKEDraftInfo == null) {
                return null;
            }
            return C1736660vIG.LIZJ(cKEDraftInfo);
        }
        Application application = C0CHQ.LIZ;
        InterfaceC1737080vIw interfaceC1737080vIwLIZ = C1737630vJp.LIZ();
        if (interfaceC1737080vIwLIZ != null && (strLJIIIIZZ = interfaceC1737080vIwLIZ.LJIIIIZZ(application, false)) != null && strLJIIIIZZ.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(strLJIIIIZZ);
            CKEDraftInfo cKEDraftInfo2 = yQ2().draftInfo;
            if (cKEDraftInfo2 != null) {
                absolutePath = C08QA.LJIL(new C0VSJ(cKEDraftInfo2.getDraftPath()), cKEDraftInfo2.getIconPath()).getAbsolutePath();
            }
            if (C703302op.LIZ(absolutePath) && a0.LJJIIZI(absolutePath, C08QA.LJIJI(c0vsj), false)) {
                return "";
            }
            return absolutePath;
        }
        CKEDraftInfo cKEDraftInfo3 = yQ2().draftInfo;
        if (cKEDraftInfo3 == null) {
            return null;
        }
        return C1736660vIG.LIZJ(cKEDraftInfo3);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQ2(com.ss.android.ugc.aweme.prop.mobileefffect.EditImage r18) {
        /*
            r17 = this;
            r0 = r17
            X.002o r3 = r0.getState()
            X.0vIX r3 = (X.C1736830vIX) r3
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r1 = r0.yQ2()
            boolean r1 = r1.isAIGCEffect
            if (r1 == 0) goto L7c
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r1.getClass()
            java.lang.String r1 = "ame_aigc_effect_one_icon"
            r5 = 1
            boolean r1 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r5)
            if (r1 == 0) goto L7c
        L20:
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r1 = r0.yQ2()
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r1 = r1.draftInfo
            r2 = 0
            if (r1 == 0) goto L7a
            java.lang.String r6 = X.C1736660vIG.LIZIZ(r1)
        L2d:
            java.lang.String r8 = r3.LLILLJJLI
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r1 = r0.yQ2()
            com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper r12 = r1.publishData
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r1 = r0.yQ2()
            java.lang.String r9 = r1.enterFrom
            com.ss.android.ugc.aweme.effectcreator.models.EffectHint r1 = r3.LLJI
            if (r1 == 0) goto L78
            java.lang.String r10 = r1.getHintKey()
        L43:
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r1 = r0.yQ2()
            com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo r1 = r1.draftInfo
            if (r1 == 0) goto L51
            java.lang.String r11 = r1.getDraftId()
            if (r11 != 0) goto L53
        L51:
            java.lang.String r11 = ""
        L53:
            r1 = r18
            if (r1 == 0) goto L76
            com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData r13 = r1.effectImgCreatorData
        L59:
            java.lang.String r14 = r3.LLJILLL
            java.lang.String r15 = r3.LLJJ
            java.util.List r16 = r0.zQ2()
            X.0vKD r4 = new X.0vKD
            java.lang.String r7 = ""
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.01wk r3 = r0.getAssemVMScope()
            X.0CyN r1 = new X.0CyN
            r1.<init>(r0, r4, r2)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r2, r2, r1, r0)
            return
        L76:
            r13 = r2
            goto L59
        L78:
            r10 = r2
            goto L43
        L7a:
            r6 = r2
            goto L2d
        L7c:
            r5 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM.DQ2(com.ss.android.ugc.aweme.prop.mobileefffect.EditImage):void");
    }

    public final void GQ2(boolean z) {
        C201955140j.LJIILL(C830690WiJ.LIZIZ, "AmeEffectPublisher", "submitChange");
        withState(new AwS112S0110000_26(this, z, 8));
    }

    public final int vQ2(C1736830vIX c1736830vIX) {
        Uri uri;
        String path;
        CKEDraftInfo cKEDraftInfo = yQ2().draftInfo;
        Integer numValueOf = null;
        if (cKEDraftInfo != null) {
            numValueOf = Integer.valueOf(cKEDraftInfo.getIconEdit());
        }
        EnumC1736080vHK enumC1736080vHK = EnumC1736080vHK.EDIT_DEFAULT;
        int value = enumC1736080vHK.getValue();
        if (numValueOf == null || numValueOf.intValue() != value) {
            EnumC1736080vHK enumC1736080vHK2 = EnumC1736080vHK.EDIT_EFFECT_IMG_CREATOR;
            int value2 = enumC1736080vHK2.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2) {
                EditImage editImage = c1736830vIX.LLILZLL;
                if (editImage != null && (uri = editImage.url) != null && (path = uri.getPath()) != null && path.length() != 0) {
                    EditImage editImage2 = c1736830vIX.LLILZLL;
                    if (editImage2 != null && editImage2.effectImgCreatorData != null) {
                        return enumC1736080vHK2.getValue();
                    }
                    return enumC1736080vHK.getValue();
                }
                return EnumC1736080vHK.NO_EDIT.getValue();
            }
        }
        return numValueOf.intValue();
    }

    public final void wQ2(C1738160vKg c1738160vKg) {
        C1738190vKj<String> c1738190vKj = c1738160vKg.LIZ;
        if (c1738190vKj != null && c1738190vKj.LIZ) {
            withState(new AwS392S0200000_26((C1738190vKj) c1738190vKj, (C1738190vKj<String>) this, (EffectEditVM) 68));
        }
    }

    public void IQ2(Uri uri, EditImageEffectImgCreatorData editImageEffectImgCreatorData) {
        C23250099c.LIZLLL(getAssemVMScope(), null, null, new C1736810vIV(uri, this, editImageEffectImgCreatorData, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0096 -> B:16:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.C1736830vIX r14, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.prop.mobileefffect.EditImage>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM.xQ2(X.0vIX, X.05Vn):java.lang.Object");
    }
}
