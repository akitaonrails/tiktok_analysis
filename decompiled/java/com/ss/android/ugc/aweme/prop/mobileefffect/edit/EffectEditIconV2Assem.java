package com.ss.android.ugc.aweme.prop.mobileefffect.edit;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01GW;
import X.C04JC;
import X.C0PEM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1736940vIi;
import X.C1736960vIk;
import X.C1737250vJD;
import X.C1737450vJX;
import X.C1737500vJc;
import X.C1737900vKG;
import X.C19719912Dl;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2217381BqS;
import X.C23250099c;
import X.C331030CyL;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1736950vIj;
import X.EnumC1737530vJf;
import X.EnumC452301pR;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectBeanData;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectEditIconV2Assem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C1559260qg8 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectEditIconV2Assem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/prop/mobileefffect/edit/EffectEditV2VM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectEditIconV2Assem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectEditV2VM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 849), AFwS268S0000000_26.get$arr$(449), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        this.LLJJIJI = new C1559260qg8(new C723590SZx(this, MobileEffectBeanData.class, "effect_sdk_extra"), checkSupervisorPrepared());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(244));
        this.LLJJIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26(this, 1112));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.rg;
    }

    public final MobileEffectData kp() {
        return (MobileEffectData) this.LLJJIII.getValue();
    }

    public final MobileEffectBeanData lp() {
        return (MobileEffectBeanData) this.LLJJIJI.getValue();
    }

    public final EffectEditV2VM mp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (EffectEditV2VM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    public static EnumC1736950vIj ip(String str) {
        EnumC1736950vIj.Companion.getClass();
        EnumC1736950vIj enumC1736950vIjLIZIZ = C1736960vIk.LIZIZ(str);
        EnumC1736950vIj enumC1736950vIj = EnumC1736950vIj.EFFECT_ICON_FEMALE;
        if (enumC1736950vIjLIZIZ == enumC1736950vIj) {
            return EnumC1736950vIj.EFFECT_ICON_MALE;
        }
        return enumC1736950vIj;
    }

    public final void hp(EditImage editImage) {
        EditImageEffectImgCreatorData editImageEffectImgCreatorData;
        String string;
        if (editImage != null && (editImageEffectImgCreatorData = editImage.effectImgCreatorData) != null && editImageEffectImgCreatorData.isAutoGenIcon) {
            EffectEditV2VM effectEditV2VMMp = mp();
            Context context = getContext();
            if (context == null || (string = context.getString(2131821244)) == null) {
                string = "";
            }
            effectEditV2VMMp.setState(new AwS76S1000000_26(string, 12));
            mp().setState(new AwS38S0010000_26(6));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        List listSingletonList;
        String str;
        NewFaceStickerBean newFaceStickerBean;
        NewFaceStickerBean newFaceStickerBean2;
        String string;
        String string2;
        super.onViewCreated(view);
        TextView textView = (TextView) view.findViewById(R.id.zq8);
        String str2 = "";
        if (textView != null) {
            Context context = getContext();
            if (context == null || (string2 = context.getString(2131821009)) == null) {
                string2 = "";
            }
            textView.setText(string2);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.zq5);
        if (tuxTextView != null) {
            if (C1737900vKG.LJIJJ(lp().sdkExtra) || ((newFaceStickerBean2 = kp().effect) != null && newFaceStickerBean2.effectSource == 101)) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                Context context2 = getContext();
                if (context2 == null || (string = context2.getString(2131821243)) == null) {
                    string = "";
                }
                tuxTextView.setText(string);
            }
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.llj);
        if (C1737900vKG.LJIJJ(lp().sdkExtra) || ((newFaceStickerBean = kp().effect) != null && newFaceStickerBean.effectSource == 101)) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        } else {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_info_circle;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.I7(new AkS78S0100000_6(this, 5), tuxIconView);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvm);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            recyclerView.setAdapter((AbstractC21673619ry) this.LLJJIJIL.getValue());
            recyclerView.addItemDecoration(new C04JC(1));
        }
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vIa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJJJ;
            }
        }, null, new C1736940vIi(this), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJIJIIJIL;
            }
        }, C736820SvI.LJ(), new AwS640S0100000_26(this, 58), 4);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vHy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJIJIL;
            }
        }, C736820SvI.LJ(), new AwS640S0100000_26(this, 59), 4);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.0vIg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736840vIY) obj).LLJJJIL;
            }
        }, null, new AwS640S0100000_26(this, 60), 6);
        C1737500vJc c1737500vJc = (C1737500vJc) this.LLJJIJIL.getValue();
        NewFaceStickerBean newFaceStickerBean3 = kp().effect;
        if (newFaceStickerBean3 == null) {
            EnumC1736950vIj enumC1736950vIj = EnumC1736950vIj.EFFECT_ICON_FEMALE;
            EnumC1737530vJf enumC1737530vJf = EnumC1737530vJf.LOADING;
            listSingletonList = C1697810uHb.LJIIJJI(new C1737450vJX(enumC1736950vIj, enumC1737530vJf, null, false, 12), new C1737450vJX(EnumC1736950vIj.EFFECT_ICON_MALE, enumC1737530vJf, null, false, 12));
        } else if (!C1737900vKG.LJIJJ(lp().sdkExtra) && newFaceStickerBean3.effectSource != 101) {
            EnumC1736950vIj enumC1736950vIj2 = EnumC1736950vIj.EFFECT_ICON_FEMALE;
            EnumC1737530vJf enumC1737530vJf2 = EnumC1737530vJf.LOADING;
            listSingletonList = C1697810uHb.LJIIJJI(new C1737450vJX(enumC1736950vIj2, enumC1737530vJf2, null, false, 12), new C1737450vJX(EnumC1736950vIj.EFFECT_ICON_MALE, enumC1737530vJf2, null, false, 12));
        } else {
            listSingletonList = Collections.singletonList(new C1737450vJX(EnumC1736950vIj.EFFECT_ICON_FEMALE, EnumC1737530vJf.LOADING, null, true, 4));
        }
        c1737500vJc.getClass();
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C1737250vJD(c1737500vJc, listSingletonList), true);
        ((ArrayList) c1737500vJc.LL).clear();
        ((ArrayList) c1737500vJc.LL).addAll(listSingletonList);
        c21341918fZLIZ.LIZJ(c1737500vJc);
        EffectEditV2VM effectEditV2VMMp = mp();
        NewFaceStickerBean newFaceStickerBean4 = kp().effect;
        if (newFaceStickerBean4 != null && (str = newFaceStickerBean4.effectId) != null) {
            str2 = str;
        }
        C23250099c.LIZLLL(effectEditV2VMMp.getAssemVMScope(), C0PEM.LIZJ, null, new C331030CyL(str2, effectEditV2VMMp, null), 2);
    }

    public final void op(EditImage editImage, EnumC1736950vIj enumC1736950vIj) {
        C1737450vJX c1737450vJX;
        String path;
        C1737500vJc c1737500vJc = (C1737500vJc) this.LLJJIJIL.getValue();
        if (editImage != null && (path = editImage.url.getPath()) != null && path.length() != 0) {
            c1737450vJX = new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.LOADED, C1737900vKG.LJIILLIIL(editImage.url), false, 8);
        } else {
            c1737450vJX = new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.PLACEHOLDER, null, false, 12);
        }
        c1737500vJc.LLLFZ(c1737450vJX);
    }
}
