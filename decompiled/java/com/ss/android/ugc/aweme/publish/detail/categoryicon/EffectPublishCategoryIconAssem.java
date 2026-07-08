package com.ss.android.ugc.aweme.publish.detail.categoryicon;

import X.AbstractC1737150vJ3;
import X.C019F;
import X.C01GW;
import X.C04JC;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1737250vJD;
import X.C1737450vJX;
import X.C1737500vJc;
import X.C1737900vKG;
import X.C19719912Dl;
import X.C21341918fZ;
import X.C21342318fd;
import X.C2217381BqS;
import X.C337180DJs;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.publish.EffectMobilePublishVM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class EffectPublishCategoryIconAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EffectPublishCategoryIconAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/publish/EffectMobilePublishVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EffectPublishCategoryIconAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectMobilePublishVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 853), AFwS268S0000000_26.get$arr$(464), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, MobileEffectData.class, "effect_init_data"), checkSupervisorPrepared());
        this.LLJJIJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(254));
        this.LLJJIJIIJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26(this, 1122));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1123));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ftt;
    }

    public final C1737500vJc ip() {
        return (C1737500vJc) this.LLJJIJIIJIL.getValue();
    }

    public final MobileEffectData kp() {
        return (MobileEffectData) this.LLJJIII.getValue();
    }

    public final EffectMobilePublishVM lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (EffectMobilePublishVM) assemVMLazy.getValue();
    }

    public final boolean mp() {
        if (!kp().isAIGCEffect) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ame_aigc_effect_one_icon", true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        String string;
        String string2;
        super.onViewCreated(view);
        this.LLJJIJIL = (TuxTextView) view.findViewById(R.id.zq8);
        this.LLJJJ = (TuxTextView) view.findViewById(R.id.zq5);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.llj);
        if (tuxIconView != null) {
            if (kp().isAIGCEffect) {
                C337180DJs.LIZ(tuxIconView);
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_info_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                tuxIconView.setTuxIcon(c419910GdJ);
                C786410Ut5.I7(new AkS78S0100000_6(this, 22), tuxIconView);
                C337180DJs.LIZJ(tuxIconView);
            }
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.tvm);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            recyclerView.setAdapter(ip());
            recyclerView.addItemDecoration(new C04JC(12));
        }
        TuxTextView tuxTextView2 = this.LLJJIJIL;
        String str = "";
        if (tuxTextView2 != null) {
            Context context = getContext();
            if (context == null || (string2 = context.getString(2131821009)) == null) {
                string2 = "";
            }
            tuxTextView2.setText(string2);
        }
        TuxTextView tuxTextView3 = this.LLJJJ;
        if (tuxTextView3 != null) {
            Context context2 = getContext();
            if (context2 != null && (string = context2.getString(2131821243)) != null) {
                str = string;
            }
            tuxTextView3.setText(str);
        }
        if (mp() && (tuxTextView = this.LLJJJ) != null) {
            C337180DJs.LIZ(tuxTextView);
        }
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0vHG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJIJIL;
            }
        }, C736820SvI.LJ(), new AwS640S0100000_26(this, 128), 4);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0vHI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJIJIIJIL;
            }
        }, C736820SvI.LJ(), new AwS640S0100000_26(this, 129), 4);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0vIh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJJIL;
            }
        }, null, new AwS640S0100000_26(this, 130), 6);
        C736680Sv4.LJIIIZ(this, lp(), new C2217381BqS() { // from class: X.0vHH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0vHJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736830vIX) obj).LLJJIJIIJIL;
            }
        }, C736820SvI.LJ(), new AwS675S0100000_26(this, 36), 8);
        List<C1737450vJX> listLIZIZ = ((AbstractC1737150vJ3) this.LLJJJIL.getValue()).LIZIZ();
        C1737500vJc c1737500vJcIp = ip();
        c1737500vJcIp.getClass();
        C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C1737250vJD(c1737500vJcIp, listLIZIZ), true);
        ((ArrayList) c1737500vJcIp.LL).clear();
        ((ArrayList) c1737500vJcIp.LL).addAll(listLIZIZ);
        c21341918fZLIZ.LIZJ(c1737500vJcIp);
        AbstractC1737150vJ3 abstractC1737150vJ3 = (AbstractC1737150vJ3) this.LLJJJIL.getValue();
        kp();
        abstractC1737150vJ3.LJFF();
    }

    public final void hp(EditImage editImage, EnumC1736950vIj enumC1736950vIj) {
        if (editImage == null) {
            ip().LLLFZ(new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.PLACEHOLDER, null, false, 12));
            return;
        }
        EditImageEffectImgCreatorData editImageEffectImgCreatorData = editImage.effectImgCreatorData;
        if (editImageEffectImgCreatorData == null) {
            ip().LLLFZ(new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.PLACEHOLDER, null, false, 12));
            return;
        }
        EnumC1736950vIj enumC1736950vIj2 = editImageEffectImgCreatorData.iconCategoryType;
        if (enumC1736950vIj2 == null) {
            ip().LLLFZ(new C1737450vJX(enumC1736950vIj, EnumC1737530vJf.PLACEHOLDER, null, false, 12));
            return;
        }
        String path = editImage.url.getPath();
        if (path != null && path.length() != 0) {
            ip().LLLFZ(new C1737450vJX(enumC1736950vIj2, EnumC1737530vJf.LOADED, C1737900vKG.LJIILLIIL(editImage.url), mp()));
        } else {
            ip().LLLFZ(new C1737450vJX(enumC1736950vIj2, EnumC1737530vJf.PLACEHOLDER, null, false, 12));
        }
    }
}
