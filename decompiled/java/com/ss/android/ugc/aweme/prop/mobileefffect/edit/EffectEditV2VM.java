package com.ss.android.ugc.aweme.prop.mobileefffect.edit;

import X.C01GW;
import X.C08QA;
import X.C0A11;
import X.C0CHQ;
import X.C0VSJ;
import X.C11NJ;
import X.C1559260qg8;
import X.C1736660vIG;
import X.C1736840vIY;
import X.C1736890vId;
import X.C1737630vJp;
import X.C291001Au;
import X.C452501pT;
import X.C491101vh;
import X.C703302op;
import X.EnumC1736950vIj;
import X.EnumC1737230vJB;
import X.EnumC1737340vJM;
import X.InterfaceC0148002o;
import X.InterfaceC1737080vIw;
import android.app.Application;
import android.net.Uri;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.data.IconSelectData;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectEditV2VM extends AssemViewModel<C1736840vIY> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) MobileEffectData.class, (Class<Object>) "effect_init_data", (String) 13), true);
    public final C11NJ LLILLJJLI = new C11NJ();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1114));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(246));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(247));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String str;
        String str2;
        NewFaceStickerBean newFaceStickerBean = vQ2().effect;
        String str3 = "";
        if (newFaceStickerBean == null || (str = newFaceStickerBean.name) == null) {
            str = "";
        }
        NewFaceStickerBean newFaceStickerBean2 = vQ2().effect;
        if (newFaceStickerBean2 != null && (str2 = newFaceStickerBean2.ownerName) != null) {
            str3 = str2;
        }
        NewFaceStickerBean newFaceStickerBean3 = vQ2().effect;
        return new C1736840vIY(true, str, str3, newFaceStickerBean3 != null ? newFaceStickerBean3.iconUrl : null, null, null, null, null, null, null, null, null, false, "", "automatic", C491101vh.LIZ, -1L, 1.0f, null, null, new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f)), null, null, null, new C291001Au(Boolean.FALSE));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILLJJLI.LJ();
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        InterfaceC1737080vIw interfaceC1737080vIw;
        InterfaceC1737080vIw interfaceC1737080vIw2;
        InterfaceC1737080vIw interfaceC1737080vIw3 = (InterfaceC1737080vIw) this.LLILZIL.getValue();
        if ((interfaceC1737080vIw3 == null || interfaceC1737080vIw3.LJIIL(EnumC1737230vJB.MALE) == null) && (interfaceC1737080vIw = (InterfaceC1737080vIw) this.LLILZIL.getValue()) != null) {
            interfaceC1737080vIw.LJFF(EnumC1737230vJB.MALE);
        }
        InterfaceC1737080vIw interfaceC1737080vIw4 = (InterfaceC1737080vIw) this.LLILZIL.getValue();
        if ((interfaceC1737080vIw4 == null || interfaceC1737080vIw4.LJIIL(EnumC1737230vJB.FEMALE) == null) && (interfaceC1737080vIw2 = (InterfaceC1737080vIw) this.LLILZIL.getValue()) != null) {
            interfaceC1737080vIw2.LJFF(EnumC1737230vJB.FEMALE);
        }
    }

    public final MobileEffectData vQ2() {
        return (MobileEffectData) this.LL.getValue();
    }

    public final String wQ2(EditImage editImage) {
        String strLJIIIIZZ;
        String path;
        Uri uri = editImage.url;
        if (uri != null && (path = uri.getPath()) != null && C703302op.LIZ(path)) {
            return editImage.url.getPath();
        }
        String absolutePath = null;
        if (!C0A11.LIZ()) {
            CKEDraftInfo cKEDraftInfo = vQ2().draftInfo;
            if (cKEDraftInfo == null) {
                return null;
            }
            return C1736660vIG.LIZJ(cKEDraftInfo);
        }
        Application application = C0CHQ.LIZ;
        InterfaceC1737080vIw interfaceC1737080vIwLIZ = C1737630vJp.LIZ();
        if (interfaceC1737080vIwLIZ != null && (strLJIIIIZZ = interfaceC1737080vIwLIZ.LJIIIIZZ(application, false)) != null && strLJIIIIZZ.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(strLJIIIIZZ);
            CKEDraftInfo cKEDraftInfo2 = vQ2().draftInfo;
            if (cKEDraftInfo2 != null) {
                absolutePath = C08QA.LJIL(new C0VSJ(cKEDraftInfo2.getDraftPath()), cKEDraftInfo2.getIconPath()).getAbsolutePath();
            }
            if (C703302op.LIZ(absolutePath) && a0.LJJIIZI(absolutePath, C08QA.LJIJI(c0vsj), false)) {
                return "";
            }
            return absolutePath;
        }
        CKEDraftInfo cKEDraftInfo3 = vQ2().draftInfo;
        if (cKEDraftInfo3 == null) {
            return null;
        }
        return C1736660vIG.LIZJ(cKEDraftInfo3);
    }

    public final void xQ2(EnumC1736950vIj enumC1736950vIj, EffectImgCreator$Output effectImgCreator$Output) {
        EnumC1737340vJM enumC1737340vJM;
        if (effectImgCreator$Output != null) {
            Uri uri = effectImgCreator$Output.effectIconUri;
            String str = effectImgCreator$Output.effectIconId;
            IconSelectData iconSelectData = effectImgCreator$Output.originIconData;
            if (iconSelectData != null) {
                enumC1737340vJM = iconSelectData.selectType;
            } else {
                enumC1737340vJM = null;
            }
            yQ2(uri, new EditImageEffectImgCreatorData(str, true, enumC1737340vJM, enumC1736950vIj, 0, 48));
            return;
        }
        setState(new AwS605S0100000_26(enumC1736950vIj, 398));
    }

    public final void yQ2(Uri uri, EditImageEffectImgCreatorData editImageEffectImgCreatorData) {
        EnumC1736950vIj enumC1736950vIj;
        EditImage editImage = new EditImage(uri, System.currentTimeMillis(), editImageEffectImgCreatorData);
        if (editImageEffectImgCreatorData != null && (enumC1736950vIj = editImageEffectImgCreatorData.iconCategoryType) != null) {
            int i = C1736890vId.LIZ[enumC1736950vIj.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    setState(new AwS605S0100000_26(editImage, 393));
                    return;
                }
                return;
            }
            setState(new AwS605S0100000_26(editImage, 394));
        }
    }
}
